package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;
import org.zerock.persistence.BoardDAO;
import org.zerock.persistence.ReplyDAO;

@Service
public class ReplyServiceImpl implements ReplyService {

	@Inject
	private ReplyDAO dao;
	
	@Inject
	private BoardDAO boardDAO;
	
	@Override
	public List<ReplyVO> listReply(Integer bno) throws Exception {
		
		return dao.list(bno);
	}

	@Transactional
	@Override
	public void addReply(ReplyVO vo) throws Exception {

		dao.create(vo);
		boardDAO.updateReplyCnt(vo.getBno(), 1);
	}

	@Override
	public void modifyReply(ReplyVO vo) throws Exception {

		dao.update(vo);
	}

	@Transactional
	@Override
	public void deleteReply(Integer rno) throws Exception {
		int bno = dao.getBno(rno);
		
		dao.delete(rno);
		boardDAO.updateReplyCnt(bno, -1);
		
	}
	
	@Override
	public List<ReplyVO> listReplyPage(Integer bno, Criteria cri) throws Exception {
		
		return dao.listPage(bno, cri);
	}
	
	@Override
	public int count(Integer bno) throws Exception {

		return dao.count(bno);
	}
	
	

}
