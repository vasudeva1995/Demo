package DefaultPackage.Lot.LotRepositories;

import DefaultPackage.Lot.LotModels.LotModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LotRepository extends JpaRepository<LotModel,Long> {

    @Query("select a from LotModel a where a.companyId = ?1")
    Page<LotModel> findPaginatedLots(Integer companyId,Pageable pageSpecification);

    @Query("select case when count(l)>0 then true else false end from LotModel l where l.lotNo = ?1")
    Boolean checkUniqueLotNumber(Integer lotNumber);
}
