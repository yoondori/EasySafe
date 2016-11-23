package info.easysafe.persistence;

import java.util.List;

import info.easysafe.domain.UserVO;
import info.easysafe.dto.LoginDTO;

public interface UserDAO {

	public List<UserVO> listAll () throws Exception;
	public void create(UserVO vo) throws Exception;
	public UserVO view(UserVO vo) throws Exception;
	public void deleteAccount(int userNo) throws Exception;
	public UserVO viewEmail(UserVO vo) throws Exception;
	
	public void updateAccount(UserVO vo) throws Exception;
	public void updatePW(UserVO vo) throws Exception;
	public UserVO login(UserVO vo) throws Exception;
	
	public UserVO login(LoginDTO dto) throws Exception;
	
	public void updateLevel(UserVO vo) throws Exception;
}
