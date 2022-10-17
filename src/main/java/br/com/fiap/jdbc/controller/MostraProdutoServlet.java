package br.com.fiap.jdbc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.jdbc.dao.ProdutoDAO;
import br.com.fiap.jdbc.model.Produto;

@WebServlet("/mostraProduto")
public class MostraProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ProdutoDAO produtoDAO = new ProdutoDAO();

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		Produto produto = produtoDAO.buscaProdutoID(id);
		
		request.setAttribute("produto", produto);
		RequestDispatcher rd = request.getRequestDispatcher("/formAlteraProduto.jsp");
		rd.forward(request, response);

	}

}
