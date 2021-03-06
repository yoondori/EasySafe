package info.easysafe.service;

import java.util.List;

import info.easysafe.domain.Criteria;
import info.easysafe.domain.MsgVO;
import info.easysafe.domain.SearchCriteria;
import info.easysafe.domain.UserVO;
import info.easysafe.dto.LoginDTO;

public interface UserService {

	public List<UserVO> listAll () throws Exception;
	public List<UserVO> listCriteria(Criteria cri) throws Exception;
	public int listCountCriteria(Criteria cri) throws Exception;

	public List<UserVO> listSearchCriteria(SearchCriteria cri) throws Exception;
	public int listSearchCount(SearchCriteria cri) throws Exception;
	
 	public void regist(UserVO vo) throws Exception;
	public UserVO view(String uid) throws Exception;
	public void deleteAccount(int uno) throws Exception;
	public UserVO viewEmail(UserVO vo) throws Exception;
	
	public void updateAccount(UserVO vo) throws Exception;
	public void updatePW(UserVO vo) throws Exception;
	
	public UserVO login(LoginDTO dto) throws Exception;
	
	public void updateLevel(UserVO vo) throws Exception;
	
	public List<String> listRequUser() throws Exception;
	public void updateAskLvUp(UserVO uvo);
	public void goPro(UserVO uvo);
	public UserVO chkAccount(UserVO uvo);
	public void resetPass(UserVO uvo);
}
