package com.github.zhuyiyi1990.service.impl;

import com.github.zhuyiyi1990.dao.DataGeneratorDao;
import com.github.zhuyiyi1990.service.DataGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataGeneratorServiceImpl implements DataGeneratorService {
    @Autowired
    private DataGeneratorDao dataGeneratorDao;

    @Override
    public void generateData(String arg) {
        dataGeneratorDao.generateData(arg);
    }
}
