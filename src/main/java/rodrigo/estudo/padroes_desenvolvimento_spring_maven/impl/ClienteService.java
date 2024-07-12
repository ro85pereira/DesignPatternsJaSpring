package rodrigo.estudo.padroes_desenvolvimento_spring_maven.impl;

import rodrigo.estudo.padroes_desenvolvimento_spring_maven.model.Cliente;

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}