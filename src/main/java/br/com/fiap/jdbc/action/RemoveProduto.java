package br.com.fiap.jdbc.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.jdbc.dao.ProdutoDAO;

public class RemoveProduto implements Acao {

	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ProdutoDAO produtoDAO = new ProdutoDAO();

		int id = Integer.parseInt(request.getParameter("id"));

		produtoDAO.excluir(id);

		response.sendRedirect("ListaProduto");

	}

}
