package com.feign.hystrix.constant;

/**
 * Created by mengsen on 2018/1/8.
 *
 * @Description: [一句话描述该类的功能]
 * @UpdateUser: mengsen on 2018/1/8.
 */
public class BaseConstant {

    public static final String CHARSET_UTF_8 ="UTF-8";

    public static final String CHARSET = "utf-8";

    public static final String OTHERS_RETURN_SUCCESS= "success";

    public static final String OTHERS_RETURN_MESSAGE= "message";

    public static final String JIE_XI_CODE_FAIL = "000";

    public static final String JIE_XI_CODE_SUCCESS = "111";

    public static final String REDIS_LOCK_STATE_UNLOCK = "0";

    public static final String REDIS_LOCK_STATE_LOCK = "1";

    public static final String REDIS_LOCK_PRIFIX = "LOCK_";

    public static final String STR_EMPTY = "";

    /**
     * 成功标识码 000000
     */
    public static final String SUCCESS_CODE = "000000";

    /**
     * 下划线分割
     */
    public static final String SPLIT_UNDER_LINE = "_";
    /**
     * 中划线分割
     */
    public static final String SPLIT_THROUGH_LINE = "-";

    /**
     * 空格分割
     */
    public static final String SPLIT_BALNK = " ";
    /**
     * 等号分割
     */
    public static final String SPLIT_SIGN = "=";
    /**
     * 逗号分割
     */
    public static final String SPLIT_COMMA = ",";
    /**
     * 点号分割
     */
    public static final String SPLIT_DOT = ".";
    /**
     * 与号
     */
    public static final String SPLIT_AND = "&";
    /**
     * 问号
     */
    public static final String SPLIT_QUESTION = "?";
    /**
     * 反斜杠
     */
    public static final String SPLIT_BACK_SLANT = "/";

    /**
     * 斜杠
     */
    public static final String SPLIT_SLANT = "/";

    /**
     *  状态：0
     */
    public static final String STATUS_FREE = "0";
    /**
     *  状态：1 正常
     */
    public static final String STATUS_NORMAL = "1";
    /**
     *  状态：2 冻结
     */
    public static final String STATUS_FROZEN = "2";
    /**
     *  状态：3 通过
     */
    public static final String STATUS_UNBLOCKED  = "3";

    /**
     * 账户服务ID
     */
    public static final String SERVICE_ID_ACCOUNT = "account-all";

    /**
     * 账户服务ID
     */
    public static final String SERVICE_ID_ORG = "organ-all";

    /**
     * 账户服务ID
     */
    public static final String SERVICE_ID_ORDER = "order-currency";

    /**
     * 机构状态确认地址
     */
    public static final String REQUEST_URL_ORG_GET = "/organ/get";

    /**
     * 订单创建
     */
    public static final String REQUEST_URL_ORDER_CREATE = "/order/createOrder";

    /**
     * 订单状态更新
     */
    public static final String REQUEST_URL_ORDER_STATUS_UPDATE = "/order/updateOrderStatus";

    /**
     * 订单分页查询
     */
    public static final String REQUEST_URL_ORDER_LIST_GET = "/order/orderProductsPage";

    /**
     * 资金冻结
     */
    public static final String REQUEST_URL_ACCOUNT_BLOCK = "/capital-flow/block";
    /**
     * 资金冻结
     */
    public static final String REQUEST_URL_ACCOUNT_DEBLOCK = "/capital-flow/deblock";

    /**
     * 冻结转支付
     */
    public static final String REQUEST_URL_ACCOUNT_BLOCK_2_PAY = "/capital-flow/deblock2pay";

    public static final String REQUEST_URL_WJT_WEB_CONF_STATUS_CHECK = "/config/get";

    public static final String SERVICE_ID_WJT_WEB = "wjt-web-admin";

    public static final String SERVICE_ID_PRODUCT = "product-aggregation";

    public static final String SERVICE_ID_ROUTE = "route";

    public static final String REQUEST_URL_PRODUCT_GET = "/product/aggregator/getWjtProductByParams";

    public static final String REQUEST_URL_PRODUCT_LIST_GET = "/product/aggregator/getWjtProductPageList";

    public static final String ORDER_PREFIX_BLOCK = "BLOCK-";
}
