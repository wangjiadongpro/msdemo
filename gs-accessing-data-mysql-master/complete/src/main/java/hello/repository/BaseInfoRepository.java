package hello.repository;

import hello.model.BaseInfo;
import org.springframework.data.repository.CrudRepository;

public interface BaseInfoRepository extends CrudRepository<BaseInfo,Integer> {

}
