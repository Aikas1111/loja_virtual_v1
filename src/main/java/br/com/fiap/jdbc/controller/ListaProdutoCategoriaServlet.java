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

import br.com.fiap.jdbc.dao.CategoriaDAO;
import br.com.fiap.jdbc.model.Categoria;

@WebServlet("/ListaProdutosCategorias")
public class ListaProdutoCategoriaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private CategoriaDAO categoriaDAO = new CategoriaDAO();

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Categoria> categorias = new ArrayList<Categoria>();
		categorias = categoriaDAO.listarComProduto();

		request.setAttribute("categorias", categorias);
		RequestDispatcher rd = request.getRequestDispatcher("/listaProdutosCategorias.jsp");
		rd.forward(request, response);
	}
}
