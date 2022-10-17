package br.com.fiap.jdbc.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.jdbc.dao.ProdutoDAO;
import br.com.fiap.jdbc.model.Produto;

@WebServlet("/novoProduto")
public class NovoProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProdutoDAO produtoDAO = new ProdutoDAO();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("formNovoProduto.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nomeProduto = request.getParameter("nome");
		String descricaoProduto = request.getParameter("descricao");
		int idCategoria = Integer.parseInt(request.getParameter("categoria"));

		Produto produto = new Produto(nomeProduto, descricaoProduto, idCategoria);
		this.produtoDAO.salvarComCategoria(produto);

		response.sendRedirect("listaProdutos");

	}

}
