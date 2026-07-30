package com.tencent.p101mm.opensdk.diffdev.p103a;

import android.os.AsyncTask;
import android.util.Base64;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import com.tencent.p101mm.opensdk.channel.p102a.C14332a;
import com.tencent.p101mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.p101mm.opensdk.diffdev.OAuthListener;
import com.tencent.p101mm.opensdk.utils.Log;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.b */
/* JADX INFO: loaded from: classes2.dex */
public class AsyncTaskC14334b extends AsyncTask<Void, Void, a> {

    /* JADX INFO: renamed from: a */
    private String f60093a;

    /* JADX INFO: renamed from: b */
    private String f60094b;

    /* JADX INFO: renamed from: c */
    private String f60095c;

    /* JADX INFO: renamed from: d */
    private String f60096d;

    /* JADX INFO: renamed from: e */
    private String f60097e;

    /* JADX INFO: renamed from: f */
    private OAuthListener f60098f;

    /* JADX INFO: renamed from: g */
    private AsyncTaskC14335c f60099g;

    /* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public OAuthErrCode f60100a;

        /* JADX INFO: renamed from: b */
        public String f60101b;

        /* JADX INFO: renamed from: c */
        public String f60102c;

        /* JADX INFO: renamed from: d */
        public String f60103d;

        /* JADX INFO: renamed from: e */
        public byte[] f60104e;

        private a() {
        }

        /* JADX INFO: renamed from: a */
        public static a m84167a(byte[] bArr) {
            OAuthErrCode oAuthErrCode;
            String str;
            a aVar = new a();
            if (bArr == null || bArr.length == 0) {
                Log.m84175e("MicroMsg.SDK.GetQRCodeResult", "parse fail, buf is null");
                oAuthErrCode = OAuthErrCode.WechatAuth_Err_NetworkErr;
            } else {
                try {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(bArr, "utf-8"));
                        int i = jSONObject.getInt("errcode");
                        if (i != 0) {
                            Log.m84175e("MicroMsg.SDK.GetQRCodeResult", String.format("resp errcode = %d", Integer.valueOf(i)));
                            aVar.f60100a = OAuthErrCode.WechatAuth_Err_NormalErr;
                            jSONObject.optString("errmsg");
                            return aVar;
                        }
                        String string = jSONObject.getJSONObject("qrcode").getString("qrcodebase64");
                        if (string == null || string.length() == 0) {
                            Log.m84175e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBase64 is null");
                        } else {
                            byte[] bArrDecode = Base64.decode(string, 0);
                            if (bArrDecode != null && bArrDecode.length != 0) {
                                aVar.f60100a = OAuthErrCode.WechatAuth_Err_OK;
                                aVar.f60104e = bArrDecode;
                                aVar.f60101b = jSONObject.getString("uuid");
                                String string2 = jSONObject.getString("appname");
                                aVar.f60102c = string2;
                                Log.m84174d("MicroMsg.SDK.GetQRCodeResult", String.format("parse succ, save in memory, uuid = %s, appname = %s, imgBufLength = %d", aVar.f60101b, string2, Integer.valueOf(aVar.f60104e.length)));
                                return aVar;
                            }
                            Log.m84175e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBuf is null");
                        }
                        aVar.f60100a = OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                        return aVar;
                    } catch (Exception e) {
                        str = String.format("parse json fail, ex = %s", e.getMessage());
                        Log.m84175e("MicroMsg.SDK.GetQRCodeResult", str);
                        oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                        aVar.f60100a = oAuthErrCode;
                        return aVar;
                    }
                } catch (Exception e2) {
                    str = String.format("parse fail, build String fail, ex = %s", e2.getMessage());
                }
            }
            aVar.f60100a = oAuthErrCode;
            return aVar;
        }
    }

    public AsyncTaskC14334b(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener) {
        this.f60093a = str;
        this.f60094b = str2;
        this.f60095c = str3;
        this.f60096d = str4;
        this.f60097e = str5;
        this.f60098f = oAuthListener;
    }

    /* JADX INFO: renamed from: a */
    public boolean m84166a() {
        Log.m84176i("MicroMsg.SDK.GetQRCodeTask", "cancelTask");
        AsyncTaskC14335c asyncTaskC14335c = this.f60099g;
        return asyncTaskC14335c == null ? cancel(true) : asyncTaskC14335c.cancel(true);
    }

    @Override // android.os.AsyncTask
    public a doInBackground(Void[] voidArr) throws Throwable {
        Thread.currentThread().setName("OpenSdkGetQRCodeTask");
        Log.m84176i("MicroMsg.SDK.GetQRCodeTask", "doInBackground");
        String str = String.format("https://open.weixin.qq.com/connect/sdk/qrconnect?appid=%s&noncestr=%s&timestamp=%s&scope=%s&signature=%s", this.f60093a, this.f60095c, this.f60096d, this.f60094b, this.f60097e);
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArrM84161a = C14332a.m84161a(str, HuiYanResultSender.TIMEOUT_MS);
        Log.m84174d("MicroMsg.SDK.GetQRCodeTask", String.format("doInBackground, url = %s, time consumed = %d(ms)", str, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
        return a.m84167a(bArrM84161a);
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(a aVar) {
        a aVar2 = aVar;
        OAuthErrCode oAuthErrCode = aVar2.f60100a;
        if (oAuthErrCode != OAuthErrCode.WechatAuth_Err_OK) {
            Log.m84175e("MicroMsg.SDK.GetQRCodeTask", String.format("onPostExecute, get qrcode fail, OAuthErrCode = %s", oAuthErrCode));
            this.f60098f.onAuthFinish(aVar2.f60100a, null);
            return;
        }
        Log.m84174d("MicroMsg.SDK.GetQRCodeTask", "onPostExecute, get qrcode success imgBufSize = " + aVar2.f60104e.length);
        this.f60098f.onAuthGotQrcode(aVar2.f60103d, aVar2.f60104e);
        AsyncTaskC14335c asyncTaskC14335c = new AsyncTaskC14335c(aVar2.f60101b, this.f60098f);
        this.f60099g = asyncTaskC14335c;
        asyncTaskC14335c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
