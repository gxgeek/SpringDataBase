package com.gx.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by gx on 2016/12/15.
 */

public interface AccountMapper {
    int updaTetransfermoneyBySourceId(@Param(value = "count")double count,@Param(value = "id")long id);

    int updaTetransfermoneyByTargetId(@Param(value = "count")double count,@Param(value = "id")long id);

}
