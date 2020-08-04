package com.offcn.service;

import java.util.Map;
//服务器端第二次修改
//客户端第二次修改
/**
 * @author 刘晓轩
 * @description 支付服务接口
 * @date 2020/8/3 23:59
 */
public interface PayService {
    public String createNative(String out_trade_no,String price);

    public Map queryStatus(String out_trade_no);
}
