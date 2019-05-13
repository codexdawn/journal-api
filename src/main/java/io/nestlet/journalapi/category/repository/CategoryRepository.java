package io.nestlet.journalapi.category.repository;

import io.nestlet.journalapi.category.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
