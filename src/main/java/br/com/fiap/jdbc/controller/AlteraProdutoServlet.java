package br.com.fiap.jdbc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.jdbc.dao.ProdutoDAO;

@WebServlet("/alteraProduto")
public class AlteraProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ProdutoDAO produtoDAO = new ProdutoDAO();

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		String nomeProduto = request.getParameter("nome");
		String descricaoProduto = request.getParameter("descricao");
		int idCategoria = Integer.parseInt(request.getParameter("categoria"));

		produtoDAO.alterar(nomeProduto, descricaoProduto, idCategoria, id);

		//response encaminha para o navegador fazer a chamada.
		response.sendRedirect("listaProdutos");

	}

}
