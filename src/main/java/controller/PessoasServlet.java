package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pessoa;

/**
 * Servlet implementation class PessoasServlet
 */
@WebServlet("/pessoa")
public class PessoasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PessoasServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("Entrou no Servlet PessoaServlet ");
		String idParam = request.getParameter("id");
		String nomeParam = request.getParameter("nome");
		
		Pessoa pessoa = new Pessoa();
		pessoa.setId(Integer.parseInt(idParam));
		pessoa.setNome(nomeParam);
		
		System.out.println(pessoa);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setId(11);
		pessoa1.setNome("Maria");
		pessoas.add(pessoa1);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setId(12);
		pessoa2.setNome("Joao");
		pessoas.add(pessoa2);
		
	//	for (Pessoa p : pessoas) {
	//		System.out.println(p);
	//	}
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		request.setAttribute("pessoa", pessoa);
		request.setAttribute("pessoas", pessoas);
		rd.forward(request, response);
		
	}

}
