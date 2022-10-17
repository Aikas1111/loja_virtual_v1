package br.com.fiap.jdbc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.jdbc.dao.ProdutoDAO;
import br.com.fiap.jdbc.model.Produto;

@WebServlet("/listaProdutos")
public class ListaProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListaProdutoServlet() {
		System.out.println("Criando Servlet");
	}
	
	private ProdutoDAO produtoDAO = new ProdutoDAO();

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Produto> produtos = new ArrayList<Produto>();
		produtos = produtoDAO.listarTodos();

		request.setAttribute("produtos", produtos);
		RequestDispatcher rd = request.getRequestDispatcher("/listaProdutos.jsp");
		rd.forward(request, response);
		
		System.out.println("Chamando servlet");
		
	}
}