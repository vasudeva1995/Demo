package DefaultPackage.Lot.LotServices;

import DefaultPackage.Lot.LotModels.LotModel;
import DefaultPackage.Lot.LotRepositories.LotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LotService {

    @Autowired
    private LotRepository lotRepository;

    public Page<LotModel> getLots(Integer pageNo) {
        Pageable pageSpecification = PageRequest.of((pageNo - 1) ,10,Sort.Direction.DESC,"id");
        Page<LotModel> lotModels = lotRepository.findPaginatedLots(1,pageSpecification);
        return lotModels;
    }

    public Boolean checkIsUniqueLotNumber(Integer lotNumber) {
       return lotRepository.checkUniqueLotNumber(lotNumber);
    }
}
