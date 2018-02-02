package com.feign.hystrix.constant;

/**
 * Created by mengsen on 2018/1/8.
 *
 * @Description: [一句话描述该类的功能]
 * @UpdateUser: mengsen on 2018/1/8.
 */
public class BaseErrorCode {
    public static final String SUCCESS_CODE = "000000";
    public static final String FAUIL_CODE = "000001";

    /**
     * 系统错误、异常
     */
    public static final String ERROR_CODE_SYS_EXCEPTION = "0101";
    /**
     * 系统错误、异常
     */
    public static final String ERROR_CODE_NO_RESULT = "0102";

    /**
     * 参数错误
     */
    public static final String ERROR_CODE_PARAMETER_ERROR = "0105";
    /**
     * 商户账户余额不足
     */
    public static final String ERROR_CODE_MER_NOT_ADEQUTE = "0012";

    public static final String ERROR_CODE_REPEAT_ACTION = "0013";

    public static final String ERROR_CODE_PKG_QUERY_STEP_NOT_AUTH = "0112";

    public static final String ERROR_CODE_ORG_SERVICE_CALL_ERROR = "0113";

    public static final String ERROR_CODE_ORG_STATUS_ERROR = "0114";

    public static final String ERROR_CODE_ACCOUNT_SERVICE_CALL_ERROR = "0115";

    public static final String ERROR_CODE_ACCOUNT_DEBLOCK_ERROR = "0116";

    public static final String ERROR_CODE_ACCOUNT_PAY_ERROR = "0117";

    public static final String ERROR_CODE_ORG_PRODU_CONF_CHECK_FAIL = "0118";

    public static final String ERROR_CODE_PRODU_NULL = "0119";

    public static final String ERROR_CODE_PRODUCT_CALL_FAIL = "0120";

    public static final String ERROR_CODE_PRODUCT_STATUS_ERROR = "0121";
    /**
     * 会员状态不可用
     */
    public static final String ERROR_CODE_MER_STATUS_FROZE = "0131";
    /**
     * 账户余额不足
     */
    public static final String ERROR_CODE_MER_ACCOUNT_INSU = "0132";

    public static final String ERROR_CODE_WX_SIGNATURE_ERROR = "0135";

    public static final String ERROR_CODE_WX_FACE_NUM_ERROR = "0136";

    public static final String ERROR_CODE_CREDIT_SCORE_CALC_ERROR = "0137";

    public static final String ERROR_CODE_REQUEST_TIME_OUT = "0139";


    /**
     * 系统错误、异常
     */
    public static final String ERROR_CODE_SCORE_CALC_FAILURE = "0303";

    public static final String SUCCESS_STATUS_OK = "OK";

}
