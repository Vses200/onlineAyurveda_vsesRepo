package com.g7.oam.repository;

import java.util.List;

import com.g7.oam.entities.Admin;
import com.g7.oam.exception.AdminNotFoundException;

public interface IAdminRepository {

	public Admin addAdmin(Admin Admin);

	public Admin updateAdmin(Admin Admin) throws AdminNotFoundException;

	public Admin viewAdmin(Admin Admin) throws AdminNotFoundException;

	public Admin deleteAdmin(int adminId) throws AdminNotFoundException;

	public List<Admin> showAllAdmins();

}
