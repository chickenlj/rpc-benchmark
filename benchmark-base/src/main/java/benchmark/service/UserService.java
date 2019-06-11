package benchmark.service;

import benchmark.bean.Page;
import benchmark.bean.User;

public interface UserService {
	public boolean existUser(String email);

	public boolean createUser(User user);

	public User getUser(Integer id);

	public Page<User> listUser(Integer pageNo);

	default byte[] pingpong(byte[] object){
		return object;
	}
}
