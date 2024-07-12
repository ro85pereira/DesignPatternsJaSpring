package rodrigo.estudo.padroes_desenvolvimento_spring_maven.model;

import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente,Long> {
}
