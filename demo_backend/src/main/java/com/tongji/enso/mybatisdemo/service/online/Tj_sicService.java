package com.tongji.enso.mybatisdemo.service.online;

import com.tongji.enso.mybatisdemo.entity.online.Tj_sic;
import com.tongji.enso.mybatisdemo.mapper.online.Tj_sicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Tj_sicService {

    @Autowired
    private Tj_sicMapper tj_sicmapper;

    public List<Tj_sic> findAllSIC(){ return tj_sicmapper.findAll(); }

    public List<Tj_sic> findPredictionByDate(String year, String month){
        return tj_sicmapper.findByDate(year, month);
    }

    public List<Tj_sic> findCheckoutByMonth(String year, String month){
        return tj_sicmapper.findCheckoutByMonth(year, month);
    }

}
