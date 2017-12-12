package com.sb.service.Impl;

import com.sb.bean.info;
import com.sb.dao.infoMapper;
import com.sb.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by john on 2017/12/11.
 */
@Service
public class InfoServiceImpl implements InfoService {
    @Autowired
    infoMapper infoMapper;

    @Override
    public info checkUser(info info) {
         return infoMapper.selectByUsernameAndPassword(info);
    }
}
