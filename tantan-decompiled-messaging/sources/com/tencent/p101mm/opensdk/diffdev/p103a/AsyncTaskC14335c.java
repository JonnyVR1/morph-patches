package com.tencent.p101mm.opensdk.diffdev.p103a;

import android.os.AsyncTask;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import com.tencent.p101mm.opensdk.channel.p102a.C14332a;
import com.tencent.p101mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.p101mm.opensdk.diffdev.OAuthListener;
import com.tencent.p101mm.opensdk.utils.Log;
import org.eclipse.jetty.http.HttpStatus;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.c */
/* JADX INFO: loaded from: classes2.dex */
class AsyncTaskC14335c extends AsyncTask<Void, Void, a> {

    /* JADX INFO: renamed from: a */
    private String f60105a;

    /* JADX INFO: renamed from: b */
    private String f60106b;

    /* JADX INFO: renamed from: c */
    private OAuthListener f60107c;

    /* JADX INFO: renamed from: d */
    private int f60108d;

    /* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public OAuthErrCode f60109a;

        /* JADX INFO: renamed from: b */
        public String f60110b;

        /* JADX INFO: renamed from: c */
        public int f60111c;
    }

    public AsyncTaskC14335c(String str, OAuthListener oAuthListener) {
        this.f60105a = str;
        this.f60107c = oAuthListener;
        this.f60106b = String.format("https://long.open.weixin.qq.com/connect/l/qrconnect?f=json&uuid=%s", str);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c9 A[Catch: Exception -> 0x00be, TryCatch #0 {Exception -> 0x00be, blocks: (B:20:0x0085, B:22:0x0094, B:26:0x00ad, B:28:0x00b1, B:31:0x00c0, B:35:0x00cb, B:32:0x00c3, B:33:0x00c6, B:34:0x00c9), top: B:64:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0120  */
    /* JADX WARN: Code duplicated, block: B:69:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x012c A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    public a doInBackground(Void[] voidArr) throws Throwable {
        a aVar;
        OAuthErrCode oAuthErrCode;
        String str;
        OAuthErrCode oAuthErrCode2;
        OAuthErrCode oAuthErrCode3;
        int i;
        String str2;
        String str3;
        OAuthErrCode oAuthErrCode4;
        Thread.currentThread().setName("OpenSdkNoopingTask");
        String str4 = this.f60105a;
        if (str4 == null || str4.length() == 0) {
            Log.m84175e("MicroMsg.SDK.NoopingTask", "run fail, uuid is null");
            a aVar2 = new a();
            aVar2.f60109a = OAuthErrCode.WechatAuth_Err_NormalErr;
            return aVar2;
        }
        Log.m84176i("MicroMsg.SDK.NoopingTask", "doInBackground start " + isCancelled());
        while (!isCancelled()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f60106b);
            if (this.f60108d == 0) {
                str = "";
            } else {
                str = "&last=" + this.f60108d;
            }
            sb.append(str);
            String string = sb.toString();
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArrM84161a = C14332a.m84161a(string, HuiYanResultSender.TIMEOUT_MS);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            aVar = new a();
            Log.m84174d("MicroMsg.SDK.NoopingResult", "star parse NoopingResult");
            if (bArrM84161a != null && bArrM84161a.length != 0) {
                try {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(bArrM84161a, "utf-8"));
                        int i2 = jSONObject.getInt("wx_errcode");
                        aVar.f60111c = i2;
                        Log.m84174d("MicroMsg.SDK.NoopingResult", String.format("nooping uuidStatusCode = %d", Integer.valueOf(i2)));
                        int i3 = aVar.f60111c;
                        if (i3 == 408) {
                            oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_OK;
                            aVar.f60109a = oAuthErrCode4;
                        } else if (i3 != 500) {
                            switch (i3) {
                                case 402:
                                    oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_Timeout;
                                    aVar.f60109a = oAuthErrCode4;
                                    break;
                                case 403:
                                    oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_Cancel;
                                    aVar.f60109a = oAuthErrCode4;
                                    break;
                                case 404:
                                    oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_OK;
                                    aVar.f60109a = oAuthErrCode4;
                                    break;
                                case HttpStatus.METHOD_NOT_ALLOWED_405 /* 405 */:
                                    aVar.f60109a = OAuthErrCode.WechatAuth_Err_OK;
                                    aVar.f60110b = jSONObject.getString("wx_code");
                                    break;
                                default:
                                    oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_NormalErr;
                                    aVar.f60109a = oAuthErrCode4;
                                    break;
                            }
                        } else {
                            oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_NormalErr;
                            aVar.f60109a = oAuthErrCode4;
                        }
                    } catch (Exception e) {
                        str3 = String.format("parse json fail, ex = %s", e.getMessage());
                        Log.m84175e("MicroMsg.SDK.NoopingResult", str3);
                        oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_NormalErr;
                        aVar.f60109a = oAuthErrCode2;
                    }
                } catch (Exception e2) {
                    str3 = String.format("parse fail, build String fail, ex = %s", e2.getMessage());
                }
                Log.m84174d("MicroMsg.SDK.NoopingTask", String.format("nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d(ms)", string, aVar.f60109a.toString(), Integer.valueOf(aVar.f60111c), Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis)));
                oAuthErrCode3 = aVar.f60109a;
                if (oAuthErrCode3 == OAuthErrCode.WechatAuth_Err_OK) {
                    i = aVar.f60111c;
                    this.f60108d = i;
                    if (i == EnumC14336d.UUID_SCANED.m84168a()) {
                        this.f60107c.onQrcodeScanned();
                    } else if (aVar.f60111c == EnumC14336d.UUID_KEEP_CONNECT.m84168a() && aVar.f60111c == EnumC14336d.UUID_CONFIRM.m84168a()) {
                        str2 = aVar.f60110b;
                        if (str2 != null || str2.length() == 0) {
                            Log.m84175e("MicroMsg.SDK.NoopingTask", "nooping fail, confirm with an empty code!!!");
                            oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                            aVar.f60109a = oAuthErrCode;
                        }
                    }
                } else {
                    Log.m84175e("MicroMsg.SDK.NoopingTask", String.format("nooping fail, errCode = %s, uuidStatusCode = %d", oAuthErrCode3.toString(), Integer.valueOf(aVar.f60111c)));
                }
                return aVar;
            }
            Log.m84175e("MicroMsg.SDK.NoopingResult", "parse fail, buf is null");
            oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_NetworkErr;
            aVar.f60109a = oAuthErrCode2;
            Log.m84174d("MicroMsg.SDK.NoopingTask", String.format("nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d(ms)", string, aVar.f60109a.toString(), Integer.valueOf(aVar.f60111c), Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis)));
            oAuthErrCode3 = aVar.f60109a;
            if (oAuthErrCode3 == OAuthErrCode.WechatAuth_Err_OK) {
                i = aVar.f60111c;
                this.f60108d = i;
                if (i == EnumC14336d.UUID_SCANED.m84168a()) {
                    this.f60107c.onQrcodeScanned();
                } else if (aVar.f60111c == EnumC14336d.UUID_KEEP_CONNECT.m84168a()) {
                    continue;
                } else {
                    str2 = aVar.f60110b;
                    if (str2 != null) {
                    }
                    Log.m84175e("MicroMsg.SDK.NoopingTask", "nooping fail, confirm with an empty code!!!");
                    oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                    aVar.f60109a = oAuthErrCode;
                }
            } else {
                Log.m84175e("MicroMsg.SDK.NoopingTask", String.format("nooping fail, errCode = %s, uuidStatusCode = %d", oAuthErrCode3.toString(), Integer.valueOf(aVar.f60111c)));
            }
            return aVar;
        }
        Log.m84176i("MicroMsg.SDK.NoopingTask", "IDiffDevOAuth.stopAuth / detach invoked");
        aVar = new a();
        oAuthErrCode = OAuthErrCode.WechatAuth_Err_Auth_Stopped;
        aVar.f60109a = oAuthErrCode;
        return aVar;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(a aVar) {
        a aVar2 = aVar;
        this.f60107c.onAuthFinish(aVar2.f60109a, aVar2.f60110b);
    }
}
