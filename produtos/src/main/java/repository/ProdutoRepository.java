package repository;

import database.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {}

