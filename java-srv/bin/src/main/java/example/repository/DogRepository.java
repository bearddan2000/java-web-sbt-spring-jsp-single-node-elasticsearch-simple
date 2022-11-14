package example.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import example.model.Dog;

@Repository
public interface DogRepository extends ElasticsearchRepository<Dog, String> {}
