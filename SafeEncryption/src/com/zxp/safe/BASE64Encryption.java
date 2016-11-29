package com.zxp.safe;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

/**
 * @author ：zhangxpc@jiedaibao.com
 * @Description ：   BASE64加密
 * @ClassName ：BASE64Encryption
 * @date ：2016/11/29 10:41
 */
public class BASE64Encryption {
    public static void main(String[] args) throws IOException {
        String plain = "620321199109130912";
        BASE64Encoder encoder = new BASE64Encoder() ;
        String sign = encoder.encode(plain.getBytes("utf-8"));
        System.out.println("加密后："+sign);

        BASE64Decoder decoder = new BASE64Decoder();
        byte[] bytes = decoder.decodeBuffer(sign);
        System.out.println("解密后："+new String(bytes));
    }
}
