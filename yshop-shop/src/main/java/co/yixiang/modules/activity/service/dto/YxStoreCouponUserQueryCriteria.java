/**
 * Copyright (C) 2018-2020
 * All rights reserved, Designed By www.yixiang.co

 */
package co.yixiang.modules.activity.service.dto;

import lombok.Data;
import java.util.List;
import co.yixiang.annotation.Query;

/**
* @author hupeng
* @date 2020-05-13
*/
@Data
public class YxStoreCouponUserQueryCriteria{

    // 模糊
    @Query(type = Query.Type.INNER_LIKE)
    private String couponTitle;
}
