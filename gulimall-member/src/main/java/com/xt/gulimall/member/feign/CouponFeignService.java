package com.xt.gulimall.member.feign;

import com.xt.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: xietao
 * @Date: 2023-12-13 13:28
 **/
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("")
    public R memberCoupons();

}
