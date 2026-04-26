package springweb.course.service;

import org.springframework.stereotype.Service;
import springweb.course.entities.Category;
import springweb.course.repositories.CategoryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.orElseThrow(()-> new RuntimeException("Categoria não encontrada"));
    }


}
