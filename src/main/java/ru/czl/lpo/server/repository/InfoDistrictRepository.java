package ru.czl.lpo.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.czl.lpo.server.entity.InfoDistrict;

public interface InfoDistrictRepository extends JpaRepository<InfoDistrict, Integer> {
//   Optional<InfoDistrict> findById(Integer id);
}
