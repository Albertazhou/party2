package com.party.dao;

import com.party.entity.Users;

public interface UsersDao {
	public boolean addUsers(Users s);
	public boolean updateUsers(Users s);
	public boolean deleteUsers(String id);

}
