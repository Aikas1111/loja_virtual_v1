package br.com.fiap.jdbc.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.jdbc.dao.ProdutoDAO;
import br.com.fiap.jdbc.model.Produto;

public class MostraProduto implements Acao {

	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ProdutoDAO produtoDAO = new ProdutoDAO();

		int id = Integer.parseInt(request.getParameter("id"));
		Produto produto = produtoDAO.buscaProdutoID(id);

		request.setAttribute("produto", produto);
		RequestDispatcher rd = request.getRequestDispatcher("/formAlteraProduto.jsp");
		rd.forward(request, response);

	}

}
