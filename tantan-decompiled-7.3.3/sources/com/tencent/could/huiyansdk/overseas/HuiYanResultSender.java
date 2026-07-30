package com.tencent.could.huiyansdk.overseas;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.gson.Gson;
import com.tencent.cloud.overseas.C13963R;
import com.tencent.could.component.common.p084ai.eventreport.entry.NetWorkParam;
import com.tencent.could.component.common.p084ai.net.HttpMethod;
import com.tencent.could.component.common.p084ai.net.IJsonDataListener;
import com.tencent.could.component.common.p084ai.utils.GZipUtils;
import com.tencent.could.component.common.p084ai.utils.TwoTuple;
import com.tencent.could.huiyansdk.api.C14038e;
import com.tencent.could.huiyansdk.api.C14043j;
import com.tencent.could.huiyansdk.api.HuiYanResultDataCallBack;
import com.tencent.could.huiyansdk.common.C14050a;
import com.tencent.could.huiyansdk.entity.CompareResult;
import com.tencent.could.huiyansdk.entity.HostEntity;
import com.tencent.could.huiyansdk.entity.HuiYanOsAuthLight;
import com.tencent.could.huiyansdk.entity.HuiYanOsAuthLiveness;
import com.tencent.could.huiyansdk.entity.HuiYanOsAuthResult;
import com.tencent.could.huiyansdk.entity.LightDataRequest;
import com.tencent.could.huiyansdk.entity.LivenessRequest;
import com.tencent.could.huiyansdk.entity.OverSeaResult;
import com.tencent.could.huiyansdk.entity.ResultData;
import com.tencent.could.huiyansdk.manager.C14068e;
import com.tencent.could.huiyansdk.operate.C14070a;
import com.tencent.could.huiyansdk.operate.HuiYanOperateBody;
import com.tencent.could.huiyansdk.utils.C14091c;
import com.tencent.could.huiyansdk.utils.C14092d;
import com.tencent.could.huiyansdk.utils.CommonUtils;

/* JADX INFO: loaded from: classes12.dex */
public class HuiYanResultSender {
    public static final String TAG = "HuiYanResultSender";
    public static final int TIMEOUT_MS = 60000;
    public HuiYanOsAuthCallBack authCallBack;
    public HuiYanConfigCallback configCallback;
    public HuiYanResultCallBack resultCallBack;
    public HuiYanResultDataCallBack resultDataCallBack;

    public static final class HuiYanResultSenderHolder {
        public static final HuiYanResultSender INSTANCE = new HuiYanResultSender();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cleanAllCallBack() {
        if (this.resultCallBack != null) {
            this.resultCallBack = null;
        }
        if (this.configCallback != null) {
            this.configCallback = null;
        }
        C14043j.a.f58200a.m83422f();
    }

    public static String getBackIpUrl() {
        return "https://101.89.42.66";
    }

    public static String[] getBackIpUrls(String str) {
        String[] backUpIPs = HuiYanOsApiImp.getInstance().getOsConfig().getBackUpIPs();
        if (backUpIPs == null) {
            return null;
        }
        for (int i = 0; i < backUpIPs.length; i++) {
            backUpIPs[i] = C14092d.m83584a("https://" + backUpIPs[i] + str);
        }
        return backUpIPs;
    }

    public static HuiYanResultSender getInstance() {
        return HuiYanResultSenderHolder.INSTANCE;
    }

    public static void getLiveTypeErrorEvent(String str) {
        C14070a c14070a = C14070a.b.f58321a;
        c14070a.m83552a("GetLiveTypeDateUseTime", 2, true, str);
        HuiYanOperateBody huiYanOperateBody = c14070a.f58317a;
        if (huiYanOperateBody != null) {
            huiYanOperateBody.updateInfo("GetLiveTypeData", 1, 0L, System.currentTimeMillis());
        }
    }

    public static String getVerifyHost() {
        HostEntity hostEntityM83576a = C14091c.m83576a();
        if (hostEntityM83576a != null) {
            return hostEntityM83576a.getMainHost();
        }
        getInstance().sendFailBackCall(288, C14092d.m83582a(C13963R.string.hy_overseas_illegal_token_error));
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendErrorResult(int i, String str) {
        CompareResult compareResult = new CompareResult();
        compareResult.setErrorCode(i);
        compareResult.setErrorMsg(str);
        C14038e.m83404a(compareResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startHuiYanNextStep(String str) {
        Log.e(TAG, "lightData: " + str);
        HuiYanOsApi.startAuthByLightData(str, new HuiYanResultCallBack() { // from class: com.tencent.could.huiyansdk.overseas.HuiYanResultSender.2
            @Override // com.tencent.could.huiyansdk.overseas.HuiYanResultCallBack
            public void onFail(int i, String str2) {
                Log.e(HuiYanResultSender.TAG, "net work error!");
                HuiYanResultSender.this.sendAuthOnFail(i, str2);
            }

            @Override // com.tencent.could.huiyansdk.overseas.HuiYanResultCallBack
            public void onSuccess(byte[] bArr, String str2) {
                if (bArr != null) {
                    C14070a c14070a = C14070a.b.f58321a;
                    long length = bArr.length / 1024;
                    HuiYanOperateBody huiYanOperateBody = c14070a.f58317a;
                    if (huiYanOperateBody != null) {
                        huiYanOperateBody.updateInfo("LivenessPackSize", 1, length, System.currentTimeMillis());
                    }
                }
                C14070a c14070a2 = C14070a.b.f58321a;
                c14070a2.m83552a("LocalCheckUseTime", 2, false, "");
                String strM83585b = C14092d.m83585b(str2);
                CommonUtils.deleteFileByPath(str2);
                if (TextUtils.isEmpty(strM83585b)) {
                    C14068e.a.f58293a.m83520a(2, HuiYanResultSender.TAG, "videoData is empty");
                    HuiYanOperateBody huiYanOperateBody2 = c14070a2.f58317a;
                    if (huiYanOperateBody2 != null) {
                        huiYanOperateBody2.updateInfo("LocalVideo", 1, 0L, System.currentTimeMillis());
                    }
                } else {
                    HuiYanOperateBody huiYanOperateBody3 = c14070a2.f58317a;
                    if (huiYanOperateBody3 != null) {
                        huiYanOperateBody3.updateInfo("LocalVideo", 1, 1L, System.currentTimeMillis());
                    }
                }
                if (strM83585b != null) {
                    long length2 = strM83585b.getBytes().length / 1024;
                    HuiYanOperateBody huiYanOperateBody4 = c14070a2.f58317a;
                    if (huiYanOperateBody4 != null) {
                        huiYanOperateBody4.updateInfo("LocalVideoSize", 1, length2, System.currentTimeMillis());
                    }
                }
                String strEncodeToString = Base64.encodeToString(bArr, 2);
                LivenessRequest livenessRequest = new LivenessRequest();
                if (HuiYanOsApiImp.getInstance().getOsConfig().isOpenBOTCheck()) {
                    String str3 = C14050a.a.f58212a.f58206a;
                    if (!TextUtils.isEmpty(str3)) {
                        livenessRequest.setBestFrameImageFromTerminal(str3);
                        C14068e.a.f58293a.m83520a(1, HuiYanResultSender.TAG, "get bot image: " + str3.length() + " bytes");
                    }
                }
                livenessRequest.setLiveData(strEncodeToString);
                livenessRequest.setVideo(strM83585b);
                livenessRequest.setNeedBestFrame(false);
                final Gson gson = new Gson();
                String json = gson.toJson(livenessRequest);
                TwoTuple<String, String> twoTupleM83575a = C14091c.m83575a(false);
                if (twoTupleM83575a == null) {
                    HuiYanResultSender.this.sendAuthOnFail(288, C14092d.m83582a(C13963R.string.hy_overseas_illegal_token_error));
                    HuiYanResultSender.this.cleanAllCallBack();
                    return;
                }
                if (json != null) {
                    long length3 = json.getBytes().length / 1024;
                    HuiYanOperateBody huiYanOperateBody5 = c14070a2.f58317a;
                    if (huiYanOperateBody5 != null) {
                        huiYanOperateBody5.updateInfo("SendPackSize", 1, length3, System.currentTimeMillis());
                    }
                }
                c14070a2.m83552a("GetCompareResultUseTime", 1, false, "");
                String strM83584a = C14092d.m83584a(twoTupleM83575a.first + "/api/v1/crypt/liveness");
                String strM83584a2 = C14092d.m83584a(twoTupleM83575a.second + "/api/v1/crypt/liveness");
                C14092d.m83584a(HuiYanResultSender.getBackIpUrl() + "/api/v1/crypt/liveness");
                String[] backIpUrls = HuiYanResultSender.getBackIpUrls("/api/v1/crypt/liveness");
                C14091c.m83578a(NetWorkParam.NetWorkParamBuilder.newBuilder().setRequestData(json).setUrl(strM83584a).setDeputyUrl(strM83584a2).setRetryTimes(backIpUrls != null ? 3 + backIpUrls.length : 3).setHttpMethod(HttpMethod.POST).setTimeOutTimes(HuiYanResultSender.TIMEOUT_MS).setConnectTimeOut(HuiYanResultSender.TIMEOUT_MS).setGzip(false).createNetWorkParam(), new IJsonDataListener() { // from class: com.tencent.could.huiyansdk.overseas.HuiYanResultSender.2.1
                    @Override // com.tencent.could.component.common.p084ai.net.IJsonDataListener
                    public void onFailed(String str4) {
                        C14070a c14070a3 = C14070a.b.f58321a;
                        c14070a3.m83552a("GetCompareResultUseTime", 2, true, str4);
                        c14070a3.m83551a("Compare", 1, -1L, str4);
                        C14068e.a.f58293a.m83520a(2, HuiYanResultSender.TAG, "DO_COMPARE network error: " + str4);
                        HuiYanResultSender.this.sendErrorResult(210, C14092d.m83582a(C13963R.string.hy_overseas_network_connect_error));
                        HuiYanResultSender.this.cleanAllCallBack();
                    }

                    @Override // com.tencent.could.component.common.p084ai.net.IJsonDataListener
                    public void onSuccess(String str4) {
                        C14068e c14068e = C14068e.a.f58293a;
                        c14068e.m83520a(1, HuiYanResultSender.TAG, "DO_COMPARE onSuccess");
                        C14070a c14070a3 = C14070a.b.f58321a;
                        c14070a3.m83552a("GetCompareResultUseTime", 2, false, "");
                        HuiYanOsAuthLiveness huiYanOsAuthLiveness = (HuiYanOsAuthLiveness) gson.fromJson(str4, HuiYanOsAuthLiveness.class);
                        if (huiYanOsAuthLiveness == null) {
                            c14068e.m83520a(2, HuiYanResultSender.TAG, "osAuthLiveness is null");
                            c14070a3.m83551a("Compare", 1, -1L, "osAuthLiveness is null: " + str4);
                            HuiYanResultSender.this.sendErrorResult(210, C14092d.m83582a(C13963R.string.hy_overseas_network_connect_error));
                            HuiYanResultSender.this.cleanAllCallBack();
                            return;
                        }
                        if (huiYanOsAuthLiveness.getCode() != 0) {
                            c14070a3.m83551a("Compare", 1, -1L, "osAuthLiveness is code: " + huiYanOsAuthLiveness.getCode());
                            HuiYanResultSender.this.sendErrorResult(huiYanOsAuthLiveness.getCode(), C14092d.m83582a(C13963R.string.hy_overseas_start_check_error_code_default));
                            return;
                        }
                        if (HuiYanResultSender.this.resultDataCallBack != null) {
                            ResultData resultData = new ResultData();
                            resultData.setResponse(str4);
                            HuiYanResultSender.this.resultDataCallBack.onSuccessResultData(resultData);
                        }
                        String resultCode = huiYanOsAuthLiveness.getData().getResultCode();
                        if ("0".equals(resultCode)) {
                            HuiYanOsAuthResult huiYanOsAuthResult = new HuiYanOsAuthResult();
                            huiYanOsAuthResult.setToken(HuiYanOsApiImp.getInstance().getCurrentToken());
                            if (HuiYanResultSender.this.authCallBack != null) {
                                HuiYanResultSender.this.authCallBack.onSuccess(huiYanOsAuthResult);
                                HuiYanResultSender.this.authCallBack = null;
                            }
                            HuiYanOperateBody huiYanOperateBody6 = c14070a3.f58317a;
                            if (huiYanOperateBody6 != null) {
                                huiYanOperateBody6.updateInfo("Compare", 1, 1L, System.currentTimeMillis());
                            }
                            c14070a3.m83550a(0, "Success");
                            c14070a3.m83554b();
                            CommonUtils.closeCurrentFragment();
                        } else {
                            if (!TextUtils.isEmpty(resultCode)) {
                                c14068e.m83520a(1, HuiYanResultSender.TAG, "DO_COMPARE network error resultCode:" + resultCode);
                                c14070a3.m83551a("Compare", 1, -1L, "resultCode:" + resultCode);
                            }
                            if ("1001".equals(resultCode) || "1004".equals(resultCode)) {
                                HuiYanResultSender.this.sendErrorResult(Integer.valueOf(resultCode).intValue(), C14092d.m83582a(C13963R.string.hy_overseas_start_check_error_code_1001_1004));
                            } else {
                                HuiYanResultSender.this.sendErrorResult(Integer.valueOf(resultCode).intValue(), C14092d.m83582a(C13963R.string.hy_overseas_start_check_error_code_default));
                            }
                        }
                        HuiYanResultSender.this.cleanAllCallBack();
                    }
                });
            }
        });
    }

    public void sendAuthGetLive(String str) {
        TwoTuple<String, String> twoTupleM83575a = C14091c.m83575a(false);
        if (twoTupleM83575a == null) {
            sendAuthOnFail(288, C14092d.m83582a(C13963R.string.hy_overseas_illegal_token_error));
            CommonUtils.closeCurrentFragment();
            return;
        }
        C14070a.b.f58321a.m83552a("GetLiveTypeDateUseTime", 1, false, "");
        String strM83584a = C14092d.m83584a(twoTupleM83575a.first + "/api/v1/crypt/light");
        String strM83584a2 = C14092d.m83584a(twoTupleM83575a.second + "/api/v1/crypt/light");
        C14092d.m83584a(getBackIpUrl() + "/api/v1/crypt/light");
        String[] backIpUrls = getBackIpUrls("/api/v1/crypt/light");
        int length = backIpUrls != null ? 3 + backIpUrls.length : 3;
        C14068e.a.f58293a.m83520a(1, TAG, "requestUrl: " + strM83584a);
        final Gson gson = new Gson();
        C14091c.m83578a(NetWorkParam.NetWorkParamBuilder.newBuilder().setRequestData(gson.toJson(new LightDataRequest(str))).setUrl(strM83584a).setDeputyUrl(strM83584a2).setRetryTimes(length).setHttpMethod(HttpMethod.POST).setTimeOutTimes(TIMEOUT_MS).setConnectTimeOut(TIMEOUT_MS).setGzip(false).createNetWorkParam(), new IJsonDataListener() { // from class: com.tencent.could.huiyansdk.overseas.HuiYanResultSender.1
            @Override // com.tencent.could.component.common.p084ai.net.IJsonDataListener
            public void onFailed(String str2) {
                C14068e.a.f58293a.m83520a(2, HuiYanResultSender.TAG, "GET_LIGHT_TYPE network error: " + str2);
                HuiYanResultSender.this.sendAuthOnFail(210, C14092d.m83582a(C13963R.string.hy_overseas_network_connect_error));
                HuiYanResultSender.getLiveTypeErrorEvent(str2);
                CommonUtils.closeCurrentFragment();
            }

            @Override // com.tencent.could.component.common.p084ai.net.IJsonDataListener
            public void onSuccess(String str2) {
                HuiYanOsAuthLight huiYanOsAuthLight = (HuiYanOsAuthLight) gson.fromJson(str2, HuiYanOsAuthLight.class);
                if (huiYanOsAuthLight == null) {
                    C14068e.a.f58293a.m83520a(2, HuiYanResultSender.TAG, "huiYanOsAuthLight is null");
                    HuiYanResultSender.this.sendAuthOnFail(210, C14092d.m83582a(C13963R.string.hy_overseas_network_connect_error));
                    HuiYanResultSender.getLiveTypeErrorEvent("huiYanOsAuthLight is null");
                    CommonUtils.closeCurrentFragment();
                    return;
                }
                if (huiYanOsAuthLight.getCode() != 0) {
                    HuiYanResultSender.getLiveTypeErrorEvent(huiYanOsAuthLight.getMessage());
                    HuiYanResultSender.this.sendAuthOnFail(huiYanOsAuthLight.getCode(), huiYanOsAuthLight.getMessage());
                    CommonUtils.closeCurrentFragment();
                    return;
                }
                C14070a c14070a = C14070a.b.f58321a;
                c14070a.m83552a("GetLiveTypeDateUseTime", 2, false, "");
                HuiYanOperateBody huiYanOperateBody = c14070a.f58317a;
                if (huiYanOperateBody != null) {
                    huiYanOperateBody.updateInfo("GetLiveTypeData", 1, 1L, System.currentTimeMillis());
                }
                c14070a.m83552a("LocalCheckUseTime", 1, false, "");
                HuiYanResultSender.this.startHuiYanNextStep(huiYanOsAuthLight.getData().getLightData());
            }
        });
    }

    public void sendAuthOnFail(int i, String str) {
        C14068e.a.f58293a.m83520a(2, TAG, "send auth fail, code: " + i + " msg: " + str);
        HuiYanOsAuthCallBack huiYanOsAuthCallBack = this.authCallBack;
        if (huiYanOsAuthCallBack != null) {
            huiYanOsAuthCallBack.onFail(i, str, HuiYanOsApiImp.getInstance().getCurrentToken());
        } else {
            Log.e(TAG, "authCallBack is null!");
        }
        if (this.authCallBack != null) {
            this.authCallBack = null;
        }
        C14070a c14070a = C14070a.b.f58321a;
        c14070a.m83550a(i, str);
        c14070a.m83554b();
    }

    public void sendConfigSuccess(String str) {
        if (this.configCallback != null) {
            this.configCallback.onSuccess(CommonUtils.base64EncodeToString(str));
        }
        if (this.configCallback != null) {
            this.configCallback = null;
        }
    }

    public void sendFailBackCall(int i, String str) {
        HuiYanConfigCallback huiYanConfigCallback = this.configCallback;
        if (huiYanConfigCallback != null) {
            huiYanConfigCallback.onFail(i, str);
        }
        HuiYanResultCallBack huiYanResultCallBack = this.resultCallBack;
        if (huiYanResultCallBack != null) {
            huiYanResultCallBack.onFail(i, str);
        }
        if (this.configCallback == null && this.resultCallBack == null) {
            sendAuthOnFail(i, str);
        }
        cleanAllCallBack();
    }

    public void sendResultSuccess(String str, String str2) throws Throwable {
        if (this.resultCallBack != null) {
            OverSeaResult overSeaResult = new OverSeaResult();
            overSeaResult.setValidateData(str);
            this.resultCallBack.onSuccess(GZipUtils.compress(new Gson().toJson(overSeaResult)), str2);
        }
        if (HuiYanOsApiImp.getInstance().isNeedCleanListener()) {
            cleanAllCallBack();
        }
    }

    public void setAuthCallBack(HuiYanOsAuthCallBack huiYanOsAuthCallBack) {
        this.authCallBack = huiYanOsAuthCallBack;
    }

    public void setConfigCallback(HuiYanConfigCallback huiYanConfigCallback) {
        this.configCallback = huiYanConfigCallback;
    }

    public void setResultCallBack(HuiYanResultCallBack huiYanResultCallBack) {
        this.resultCallBack = huiYanResultCallBack;
        if (this.configCallback != null) {
            this.configCallback = null;
        }
    }

    public void setResultDataCallBack(HuiYanResultDataCallBack huiYanResultDataCallBack) {
        this.resultDataCallBack = huiYanResultDataCallBack;
    }
}
