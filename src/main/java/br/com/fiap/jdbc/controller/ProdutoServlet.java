package br.com.fiap.jdbc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.jdbc.action.Acao;

@WebServlet("/produto")
public class ProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String parametro = request.getParameter("param");
		String endClasse = "br.com.fiap.jdbc.action." + parametro;

		try {
			Class classe = Class.forName(endClasse);
			@SuppressWarnings("deprecation")
			Acao acao = (Acao) classe.newInstance();
			acao.executar(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}

		// http://localhost:8080/loja-virtual/produto?param=ListaProduto

	}

}
