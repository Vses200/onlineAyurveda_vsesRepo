package com.g7.oam.repository;

import java.util.List;

import com.g7.oam.entities.Medicine;
import com.g7.oam.exception.MedicineNotFoundException;

public interface IMedicineRepository {

	public Medicine addMedicine(Medicine medicine);

	public Medicine viewMedicine(Medicine medicine) throws MedicineNotFoundException;

	public Medicine updateMedicine(Medicine medicine) throws MedicineNotFoundException;

	public Medicine deleteMedicine(int id) throws MedicineNotFoundException;

	public List<Medicine> showAllMedicine();

}
