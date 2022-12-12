package id.co.indivara.project.invoice.repository;

import id.co.indivara.project.invoice.entity.Topup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopupRepository extends JpaRepository <Topup,Integer> {

}
