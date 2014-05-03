package br.com.ita.bdic3.controllers.transacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.ita.bdic3.dao.transacao.TransacaoDao;
import br.com.ita.bdic3.entity.transacao.Transacao;

@Controller
@RequestMapping("/api/transacao")
public class TransacaoController {

	@Autowired
	private TransacaoDao transacaoDao;
	
	/** http://localhost:8080/bdic3/transacao/transacao/32 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody String efetuarTransacao(@PathVariable Long id) {
		
		Transacao transacao = new Transacao();
		transacao.setId(id);
		
		transacaoDao.save(transacao);
		
		return transacao.toString();
	}

}