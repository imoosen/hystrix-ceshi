package com.feign.hystrix.constant;

/**
 * Created by mengsen on 2018/1/3.
 *
 * @Description: [一句话描述该类的功能]
 * @UpdateUser: mengsen on 2018/1/3.
 */
public class Constant extends BaseConstant{
    /**
     * 1银行卡二要素
     */
    public static final String FUNUID_BANK_TWO_KEYS="credit-bankcard-validate-2keys";
    /**
     * 2银行卡三要素
     */
    public static final String FUNUID_BANK_THREE_KEYS="credit-bankcard-validate-3keys";
    /**
     *3 银行卡四要素
     */
    public static final String FUNUID_BANK_FOUR_KEYS="credit-bankcard-validate-4keys";
    /**
     * 4账户类二要素
     */
    public static final String FUNUID_ACCOUNT_TWO_KEYS="credit-accountype-validate-2keys";
    /**
     * 5账户类五要素
     */
    public static final String FUNUID_ACCOUNT_FIVE_KEYS="credit-accountype-validate-5keys";

    /**
     * 6人像对比
     */
    public static final String FUNUID_FACE_THREE_KEYS="credit-portrait-validate";

    /**
     * 7个人涉诉
     */
    public static final String FUNUID_ONE_LAW_KEYS="credit-personalawsuit-query";
    /**
     * 8多参数比对
     */
    public static final String FUNUID_MORE_KEYS="credit-morekeys-validate";


    public static final String FUNUID_MORE_KEYS_TO_FILTER="credit-morekeys-validate";
    public static final String FUNUID_FACE_THREE_KEYS_TO_FILTER="credit-portrait-validate";


    /**
     * 9简项识别
     */
    public static final String FUNUID_IDANDNAME_KEYS="credit-idcard-validate";
    /**
     * 10腾讯分比对
     */
    public static final String FUNUID_SCORE_TENCENT_KEYS="credit-score-tencent";
    /**
     * 11熊猫分比对
     */
    public static final String FUNUID_SCORE_PANDA_KEYS="credit-score-panda";
    /**
     * 12运营商验证
     */
    public static final String FUNUID_CARRIER_VALIDATE_KEYS="credit-carrieroperator-validate";
    /**
     * 13前海信用分
     */
    public static final String FUNUID_QIANHAI_SCORE_KEYS="credit-score";


    /**
     * wjt-web-admin
     */
    public static final String FUNUID_WJT_WEB_ADMIN_KEYS = "wjt-web-admin";

    /**
     *  ACCOUNT-ALL
     */
    public static final String FUNUID_ACCOUNT_ALL_KEYS = "account-all";

    /**
     *  ACCOUNT-ALL
     */
    public static final String FUNUID_ORDER_CURRENT_KEYS = "order-currency";

    /**
     * 产品管理
     * */
    public static final String SERVICE_ID_PRODUCT = "product-aggregation";
    public static final String REQUEST_URL_PRODUCT_GET = "/product/aggregator/getWjtProductByParams";

    /**
     * 请求超时
     */
    public static final int TIME_OUT = 30*2;


    /*
    * 代码错误
    * */
    public static final String ERROR_IN_CODE = "500";



    /**
     * 会员机构id，redis存word
     */
    public static final String MEMBER_ORG_ID="orgId";

    /**
     * 会员信息，redis过期时间
     */
    public static final int MEMBER_REDIS_TIME=30*60;

    public static final String MEMBER_REDIS_FLAG="flag";

    public static final String MEMBER_REDIS_FLAG_VALUE="120";

    public static final String REQUEST_HEADER_TOKEN_KEY = "tokenMemberId";
    public static final String FUNC_REQUET_PARAM = "params";

    public static final String WJT_WEB_ADMIN_PRODUCTCODE = "productCode";
    public static final String WJT_WEB_ADMIN_PRODUCTNAME = "productName";
    public static final String WJT_WEB_ADMIN_STATUSCODE = "status";
    public static final String WJT_WEB_ADMIN_DESCRIPTION = "description";
    public static final String WJT_WEB_ADMIN_PRODUCTTYPENAME = "productTypeName";

}
