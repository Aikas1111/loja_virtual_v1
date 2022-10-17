package br.com.fiap.jdbc.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.jdbc.dao.CategoriaDAO;
import br.com.fiap.jdbc.model.Categoria;

public class ListaProdutoCategoria implements Acao {

	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		CategoriaDAO categoriaDAO = new CategoriaDAO();

		List<Categoria> categorias = new ArrayList<Categoria>();
		categorias = categoriaDAO.listarComProduto();

		request.setAttribute("categorias", categorias);
		RequestDispatcher rd = request.getRequestDispatcher("/listaProdutosCategorias.jsp");
		rd.forward(request, response);
	}

}
