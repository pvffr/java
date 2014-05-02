package br.com.ita.bdic3.dao.transacao;

import org.springframework.stereotype.Repository;

import br.com.ita.bdic3.dao.GenericDao;
import br.com.ita.bdic3.entity.transacao.Transacao;

/**
 * @author Paulo Vitor Faria Fortes Rezende
 * 
 */

@Repository("transacaoDao")
public class TransacaoDao extends GenericDao<Long, Transacao> {

	public TransacaoDao() {
		super(Transacao.class);
	}

}
