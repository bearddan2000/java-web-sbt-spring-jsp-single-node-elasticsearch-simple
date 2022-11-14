package example.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "idx_dog", createIndex=false)
public class Dog {

  @Id
  private String id;

  @Field(type = FieldType.Text)
  private String breed;

  @Field(type = FieldType.Text)
  private String color;
}
