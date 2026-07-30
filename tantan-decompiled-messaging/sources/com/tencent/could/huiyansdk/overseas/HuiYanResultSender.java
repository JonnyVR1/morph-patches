package com.tencent.could.huiyansdk.overseas;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.gson.Gson;
import com.tencent.cloud.overseas.C13800R;
import com.tencent.could.component.common.p079ai.eventreport.entry.NetWorkParam;
import com.tencent.could.component.common.p079ai.net.HttpMethod;
import com.tencent.could.component.common.p079ai.net.IJsonDataListener;
import com.tencent.could.component.common.p079ai.utils.GZipUtils;
import com.tencent.could.component.common.p079ai.utils.TwoTuple;
import com.tencent.could.huiyansdk.api.C13875e;
import com.tencent.could.huiyansdk.api.C13880j;
import com.tencent.could.huiyansdk.api.HuiYanResultDataCallBack;
import com.tencent.could.huiyansdk.common.C13887a;
import com.tencent.could.huiyansdk.entity.CompareResult;
import com.tencent.could.huiyansdk.entity.HostEntity;
import com.tencent.could.huiyansdk.entity.HuiYanOsAuthLight;
import com.tencent.could.huiyansdk.entity.HuiYanOsAuthLiveness;
import com.tencent.could.huiyansdk.entity.HuiYanOsAuthResult;
import com.tencent.could.huiyansdk.entity.LightDataRequest;
import com.tencent.could.huiyansdk.entity.LivenessRequest;
import com.tencent.could.huiyansdk.entity.OverSeaResult;
import com.tencent.could.huiyansdk.entity.ResultData;
import com.tencent.could.huiyansdk.manager.C13905e;
import com.tencent.could.huiyansdk.operate.C13907a;
import com.tencent.could.huiyansdk.operate.HuiYanOperateBody;
import com.tencent.could.huiyansdk.utils.C13928c;
import com.tencent.could.huiyansdk.utils.C13929d;
import com.tencent.could.huiyansdk.utils.CommonUtils;

/* JADX INFO: loaded from: classes2.dex */
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
        C13880j.a.f57352a.m82239f();
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
            backUpIPs[i] = C13929d.m82401a("https://" + backUpIPs[i] + str);
        }
        return backUpIPs;
    }

    public static HuiYanResultSender getInstance() {
        return HuiYanResultSenderHolder.INSTANCE;
    }

    public static void getLiveTypeErrorEvent(String str) {
        C13907a c13907a = C13907a.b.f57473a;
        c13907a.m82369a("GetLiveTypeDateUseTime", 2, true, str);
        HuiYanOperateBody huiYanOperateBody = c13907a.f57469a;
        if (huiYanOperateBody != null) {
            huiYanOperateBody.updateInfo("GetLiveTypeData", 1, 0L, System.currentTimeMillis());
        }
    }

    public static String getVerifyHost() {
        HostEntity hostEntityM82393a = C13928c.m82393a();
        if (hostEntityM82393a != null) {
            return hostEntityM82393a.getMainHost();
        }
        getInstance().sendFailBackCall(288, C13929d.m82399a(C13800R.string.hy_overseas_illegal_token_error));
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendErrorResult(int i, String str) {
        CompareResult compareResult = new CompareResult();
        compareResult.setErrorCode(i);
        compareResult.setErrorMsg(str);
        C13875e.m82221a(compareResult);
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
                    C13907a c13907a = C13907a.b.f57473a;
                    long length = bArr.length / 1024;
                    HuiYanOperateBody huiYanOperateBody = c13907a.f57469a;
                    if (huiYanOperateBody != null) {
                        huiYanOperateBody.updateInfo("LivenessPackSize", 1, length, System.currentTimeMillis());
                    }
                }
                C13907a c13907a2 = C13907a.b.f57473a;
                c13907a2.m82369a("LocalCheckUseTime", 2, false, "");
                String strM82402b = C13929d.m82402b(str2);
                CommonUtils.deleteFileByPath(str2);
                if (TextUtils.isEmpty(strM82402b)) {
                    C13905e.a.f57445a.m82337a(2, HuiYanResultSender.TAG, "videoData is empty");
                    HuiYanOperateBody huiYanOperateBody2 = c13907a2.f57469a;
                    if (huiYanOperateBody2 != null) {
                        huiYanOperateBody2.updateInfo("LocalVideo", 1, 0L, System.currentTimeMillis());
                    }
                } else {
                    HuiYanOperateBody huiYanOperateBody3 = c13907a2.f57469a;
                    if (huiYanOperateBody3 != null) {
                        huiYanOperateBody3.updateInfo("LocalVideo", 1, 1L, System.currentTimeMillis());
                    }
                }
                if (strM82402b != null) {
                    long length2 = strM82402b.getBytes().length / 1024;
                    HuiYanOperateBody huiYanOperateBody4 = c13907a2.f57469a;
                    if (huiYanOperateBody4 != null) {
                        huiYanOperateBody4.updateInfo("LocalVideoSize", 1, length2, System.currentTimeMillis());
                    }
                }
                String strEncodeToString = Base64.encodeToString(bArr, 2);
                LivenessRequest livenessRequest = new LivenessRequest();
                if (HuiYanOsApiImp.getInstance().getOsConfig().isOpenBOTCheck()) {
                    String str3 = C13887a.a.f57364a.f57358a;
                    if (!TextUtils.isEmpty(str3)) {
                        livenessRequest.setBestFrameImageFromTerminal(str3);
                        C13905e.a.f57445a.m82337a(1, HuiYanResultSender.TAG, "get bot image: " + str3.length() + " bytes");
                    }
                }
                livenessRequest.setLiveData(strEncodeToString);
                livenessRequest.setVideo(strM82402b);
                livenessRequest.setNeedBestFrame(false);
                final Gson gson = new Gson();
                String json = gson.toJson(livenessRequest);
                TwoTuple<String, String> twoTupleM82392a = C13928c.m82392a(false);
                if (twoTupleM82392a == null) {
                    HuiYanResultSender.this.sendAuthOnFail(288, C13929d.m82399a(C13800R.string.hy_overseas_illegal_token_error));
                    HuiYanResultSender.this.cleanAllCallBack();
                    return;
                }
                if (json != null) {
                    long length3 = json.getBytes().length / 1024;
                    HuiYanOperateBody huiYanOperateBody5 = c13907a2.f57469a;
                    if (huiYanOperateBody5 != null) {
                        huiYanOperateBody5.updateInfo("SendPackSize", 1, length3, System.currentTimeMillis());
                    }
                }
                c13907a2.m82369a("GetCompareResultUseTime", 1, false, "");
                String strM82401a = C13929d.m82401a(twoTupleM82392a.first + "/api/v1/crypt/liveness");
                String strM82401a2 = C13929d.m82401a(twoTupleM82392a.second + "/api/v1/crypt/liveness");
                C13929d.m82401a(HuiYanResultSender.getBackIpUrl() + "/api/v1/crypt/liveness");
                String[] backIpUrls = HuiYanResultSender.getBackIpUrls("/api/v1/crypt/liveness");
                C13928c.m82395a(NetWorkParam.NetWorkParamBuilder.newBuilder().setRequestData(json).setUrl(strM82401a).setDeputyUrl(strM82401a2).setRetryTimes(backIpUrls != null ? 3 + backIpUrls.length : 3).setHttpMethod(HttpMethod.POST).setTimeOutTimes(HuiYanResultSender.TIMEOUT_MS).setConnectTimeOut(HuiYanResultSender.TIMEOUT_MS).setGzip(false).createNetWorkParam(), new IJsonDataListener() { // from class: com.tencent.could.huiyansdk.overseas.HuiYanResultSender.2.1
                    @Override // com.tencent.could.component.common.p079ai.net.IJsonDataListener
                    public void onFailed(String str4) {
                        C13907a c13907a3 = C13907a.b.f57473a;
                        c13907a3.m82369a("GetCompareResultUseTime", 2, true, str4);
                        c13907a3.m82368a("Compare", 1, -1L, str4);
                        C13905e.a.f57445a.m82337a(2, HuiYanResultSender.TAG, "DO_COMPARE network error: " + str4);
                        HuiYanResultSender.this.sendErrorResult(210, C13929d.m82399a(C13800R.string.hy_overseas_network_connect_error));
                        HuiYanResultSender.this.cleanAllCallBack();
                    }

                    @Override // com.tencent.could.component.common.p079ai.net.IJsonDataListener
                    public void onSuccess(String str4) {
                        C13905e c13905e = C13905e.a.f57445a;
                        c13905e.m82337a(1, HuiYanResultSender.TAG, "DO_COMPARE onSuccess");
                        C13907a c13907a3 = C13907a.b.f57473a;
                        c13907a3.m82369a("GetCompareResultUseTime", 2, false, "");
                        HuiYanOsAuthLiveness huiYanOsAuthLiveness = (HuiYanOsAuthLiveness) gson.fromJson(str4, HuiYanOsAuthLiveness.class);
                        if (huiYanOsAuthLiveness == null) {
                            c13905e.m82337a(2, HuiYanResultSender.TAG, "osAuthLiveness is null");
                            c13907a3.m82368a("Compare", 1, -1L, "osAuthLiveness is null: " + str4);
                            HuiYanResultSender.this.sendErrorResult(210, C13929d.m82399a(C13800R.string.hy_overseas_network_connect_error));
                            HuiYanResultSender.this.cleanAllCallBack();
                            return;
                        }
                        if (huiYanOsAuthLiveness.getCode() != 0) {
                            c13907a3.m82368a("Compare", 1, -1L, "osAuthLiveness is code: " + huiYanOsAuthLiveness.getCode());
                            HuiYanResultSender.this.sendErrorResult(huiYanOsAuthLiveness.getCode(), C13929d.m82399a(C13800R.string.hy_overseas_start_check_error_code_default));
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
                            HuiYanOperateBody huiYanOperateBody6 = c13907a3.f57469a;
                            if (huiYanOperateBody6 != null) {
                                huiYanOperateBody6.updateInfo("Compare", 1, 1L, System.currentTimeMillis());
                            }
                            c13907a3.m82367a(0, "Success");
                            c13907a3.m82371b();
                            CommonUtils.closeCurrentFragment();
                        } else {
                            if (!TextUtils.isEmpty(resultCode)) {
                                c13905e.m82337a(1, HuiYanResultSender.TAG, "DO_COMPARE network error resultCode:" + resultCode);
                                c13907a3.m82368a("Compare", 1, -1L, "resultCode:" + resultCode);
                            }
                            if ("1001".equals(resultCode) || "1004".equals(resultCode)) {
                                HuiYanResultSender.this.sendErrorResult(Integer.valueOf(resultCode).intValue(), C13929d.m82399a(C13800R.string.hy_overseas_start_check_error_code_1001_1004));
                            } else {
                                HuiYanResultSender.this.sendErrorResult(Integer.valueOf(resultCode).intValue(), C13929d.m82399a(C13800R.string.hy_overseas_start_check_error_code_default));
                            }
                        }
                        HuiYanResultSender.this.cleanAllCallBack();
                    }
                });
            }
        });
    }

    public void sendAuthGetLive(String str) {
        TwoTuple<String, String> twoTupleM82392a = C13928c.m82392a(false);
        if (twoTupleM82392a == null) {
            sendAuthOnFail(288, C13929d.m82399a(C13800R.string.hy_overseas_illegal_token_error));
            CommonUtils.closeCurrentFragment();
            return;
        }
        C13907a.b.f57473a.m82369a("GetLiveTypeDateUseTime", 1, false, "");
        String strM82401a = C13929d.m82401a(twoTupleM82392a.first + "/api/v1/crypt/light");
        String strM82401a2 = C13929d.m82401a(twoTupleM82392a.second + "/api/v1/crypt/light");
        C13929d.m82401a(getBackIpUrl() + "/api/v1/crypt/light");
        String[] backIpUrls = getBackIpUrls("/api/v1/crypt/light");
        int length = backIpUrls != null ? 3 + backIpUrls.length : 3;
        C13905e.a.f57445a.m82337a(1, TAG, "requestUrl: " + strM82401a);
        final Gson gson = new Gson();
        C13928c.m82395a(NetWorkParam.NetWorkParamBuilder.newBuilder().setRequestData(gson.toJson(new LightDataRequest(str))).setUrl(strM82401a).setDeputyUrl(strM82401a2).setRetryTimes(length).setHttpMethod(HttpMethod.POST).setTimeOutTimes(TIMEOUT_MS).setConnectTimeOut(TIMEOUT_MS).setGzip(false).createNetWorkParam(), new IJsonDataListener() { // from class: com.tencent.could.huiyansdk.overseas.HuiYanResultSender.1
            @Override // com.tencent.could.component.common.p079ai.net.IJsonDataListener
            public void onFailed(String str2) {
                C13905e.a.f57445a.m82337a(2, HuiYanResultSender.TAG, "GET_LIGHT_TYPE network error: " + str2);
                HuiYanResultSender.this.sendAuthOnFail(210, C13929d.m82399a(C13800R.string.hy_overseas_network_connect_error));
                HuiYanResultSender.getLiveTypeErrorEvent(str2);
                CommonUtils.closeCurrentFragment();
            }

            @Override // com.tencent.could.component.common.p079ai.net.IJsonDataListener
            public void onSuccess(String str2) {
                HuiYanOsAuthLight huiYanOsAuthLight = (HuiYanOsAuthLight) gson.fromJson(str2, HuiYanOsAuthLight.class);
                if (huiYanOsAuthLight == null) {
                    C13905e.a.f57445a.m82337a(2, HuiYanResultSender.TAG, "huiYanOsAuthLight is null");
                    HuiYanResultSender.this.sendAuthOnFail(210, C13929d.m82399a(C13800R.string.hy_overseas_network_connect_error));
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
                C13907a c13907a = C13907a.b.f57473a;
                c13907a.m82369a("GetLiveTypeDateUseTime", 2, false, "");
                HuiYanOperateBody huiYanOperateBody = c13907a.f57469a;
                if (huiYanOperateBody != null) {
                    huiYanOperateBody.updateInfo("GetLiveTypeData", 1, 1L, System.currentTimeMillis());
                }
                c13907a.m82369a("LocalCheckUseTime", 1, false, "");
                HuiYanResultSender.this.startHuiYanNextStep(huiYanOsAuthLight.getData().getLightData());
            }
        });
    }

    public void sendAuthOnFail(int i, String str) {
        C13905e.a.f57445a.m82337a(2, TAG, "send auth fail, code: " + i + " msg: " + str);
        HuiYanOsAuthCallBack huiYanOsAuthCallBack = this.authCallBack;
        if (huiYanOsAuthCallBack != null) {
            huiYanOsAuthCallBack.onFail(i, str, HuiYanOsApiImp.getInstance().getCurrentToken());
        } else {
            Log.e(TAG, "authCallBack is null!");
        }
        if (this.authCallBack != null) {
            this.authCallBack = null;
        }
        C13907a c13907a = C13907a.b.f57473a;
        c13907a.m82367a(i, str);
        c13907a.m82371b();
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
