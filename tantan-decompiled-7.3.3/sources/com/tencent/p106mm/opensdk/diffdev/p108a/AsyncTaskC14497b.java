package com.tencent.p106mm.opensdk.diffdev.p108a;

import android.os.AsyncTask;
import android.util.Base64;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import com.tencent.p106mm.opensdk.channel.p107a.C14495a;
import com.tencent.p106mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.p106mm.opensdk.diffdev.OAuthListener;
import com.tencent.p106mm.opensdk.utils.Log;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.b */
/* JADX INFO: loaded from: classes2.dex */
public class AsyncTaskC14497b extends AsyncTask<Void, Void, a> {

    /* JADX INFO: renamed from: a */
    private String f60941a;

    /* JADX INFO: renamed from: b */
    private String f60942b;

    /* JADX INFO: renamed from: c */
    private String f60943c;

    /* JADX INFO: renamed from: d */
    private String f60944d;

    /* JADX INFO: renamed from: e */
    private String f60945e;

    /* JADX INFO: renamed from: f */
    private OAuthListener f60946f;

    /* JADX INFO: renamed from: g */
    private AsyncTaskC14498c f60947g;

    /* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public OAuthErrCode f60948a;

        /* JADX INFO: renamed from: b */
        public String f60949b;

        /* JADX INFO: renamed from: c */
        public String f60950c;

        /* JADX INFO: renamed from: d */
        public String f60951d;

        /* JADX INFO: renamed from: e */
        public byte[] f60952e;

        private a() {
        }

        /* JADX INFO: renamed from: a */
        public static a m85350a(byte[] bArr) {
            OAuthErrCode oAuthErrCode;
            String str;
            a aVar = new a();
            if (bArr == null || bArr.length == 0) {
                Log.m85358e("MicroMsg.SDK.GetQRCodeResult", "parse fail, buf is null");
                oAuthErrCode = OAuthErrCode.WechatAuth_Err_NetworkErr;
            } else {
                try {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(bArr, "utf-8"));
                        int i = jSONObject.getInt("errcode");
                        if (i != 0) {
                            Log.m85358e("MicroMsg.SDK.GetQRCodeResult", String.format("resp errcode = %d", Integer.valueOf(i)));
                            aVar.f60948a = OAuthErrCode.WechatAuth_Err_NormalErr;
                            jSONObject.optString("errmsg");
                            return aVar;
                        }
                        String string = jSONObject.getJSONObject("qrcode").getString("qrcodebase64");
                        if (string == null || string.length() == 0) {
                            Log.m85358e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBase64 is null");
                        } else {
                            byte[] bArrDecode = Base64.decode(string, 0);
                            if (bArrDecode != null && bArrDecode.length != 0) {
                                aVar.f60948a = OAuthErrCode.WechatAuth_Err_OK;
                                aVar.f60952e = bArrDecode;
                                aVar.f60949b = jSONObject.getString("uuid");
                                String string2 = jSONObject.getString("appname");
                                aVar.f60950c = string2;
                                Log.m85357d("MicroMsg.SDK.GetQRCodeResult", String.format("parse succ, save in memory, uuid = %s, appname = %s, imgBufLength = %d", aVar.f60949b, string2, Integer.valueOf(aVar.f60952e.length)));
                                return aVar;
                            }
                            Log.m85358e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBuf is null");
                        }
                        aVar.f60948a = OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                        return aVar;
                    } catch (Exception e) {
                        str = String.format("parse json fail, ex = %s", e.getMessage());
                        Log.m85358e("MicroMsg.SDK.GetQRCodeResult", str);
                        oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                        aVar.f60948a = oAuthErrCode;
                        return aVar;
                    }
                } catch (Exception e2) {
                    str = String.format("parse fail, build String fail, ex = %s", e2.getMessage());
                }
            }
            aVar.f60948a = oAuthErrCode;
            return aVar;
        }
    }

    public AsyncTaskC14497b(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener) {
        this.f60941a = str;
        this.f60942b = str2;
        this.f60943c = str3;
        this.f60944d = str4;
        this.f60945e = str5;
        this.f60946f = oAuthListener;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85349a() {
        Log.m85359i("MicroMsg.SDK.GetQRCodeTask", "cancelTask");
        AsyncTaskC14498c asyncTaskC14498c = this.f60947g;
        return asyncTaskC14498c == null ? cancel(true) : asyncTaskC14498c.cancel(true);
    }

    @Override // android.os.AsyncTask
    public a doInBackground(Void[] voidArr) throws Throwable {
        Thread.currentThread().setName("OpenSdkGetQRCodeTask");
        Log.m85359i("MicroMsg.SDK.GetQRCodeTask", "doInBackground");
        String str = String.format("https://open.weixin.qq.com/connect/sdk/qrconnect?appid=%s&noncestr=%s&timestamp=%s&scope=%s&signature=%s", this.f60941a, this.f60943c, this.f60944d, this.f60942b, this.f60945e);
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArrM85344a = C14495a.m85344a(str, HuiYanResultSender.TIMEOUT_MS);
        Log.m85357d("MicroMsg.SDK.GetQRCodeTask", String.format("doInBackground, url = %s, time consumed = %d(ms)", str, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
        return a.m85350a(bArrM85344a);
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(a aVar) {
        a aVar2 = aVar;
        OAuthErrCode oAuthErrCode = aVar2.f60948a;
        if (oAuthErrCode != OAuthErrCode.WechatAuth_Err_OK) {
            Log.m85358e("MicroMsg.SDK.GetQRCodeTask", String.format("onPostExecute, get qrcode fail, OAuthErrCode = %s", oAuthErrCode));
            this.f60946f.onAuthFinish(aVar2.f60948a, null);
            return;
        }
        Log.m85357d("MicroMsg.SDK.GetQRCodeTask", "onPostExecute, get qrcode success imgBufSize = " + aVar2.f60952e.length);
        this.f60946f.onAuthGotQrcode(aVar2.f60951d, aVar2.f60952e);
        AsyncTaskC14498c asyncTaskC14498c = new AsyncTaskC14498c(aVar2.f60949b, this.f60946f);
        this.f60947g = asyncTaskC14498c;
        asyncTaskC14498c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
