package net.revature.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import net.revature.models.Categories;

@Repository("categoriesRepository")
public class CategoriesRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Categories> getAll(){
		return entityManager.createQuery("FROM Categories", Categories.class).getResultList();
	}
}
