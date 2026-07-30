package com.tencent.p101mm.opensdk.diffdev.p103a;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.tencent.p101mm.opensdk.diffdev.IDiffDevOAuth;
import com.tencent.p101mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.p101mm.opensdk.diffdev.OAuthListener;
import com.tencent.p101mm.opensdk.utils.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14333a implements IDiffDevOAuth {

    /* JADX INFO: renamed from: c */
    private AsyncTaskC14334b f60089c;

    /* JADX INFO: renamed from: a */
    private Handler f60087a = null;

    /* JADX INFO: renamed from: b */
    private List<OAuthListener> f60088b = new ArrayList();

    /* JADX INFO: renamed from: d */
    private OAuthListener f60090d = new a();

    /* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.a$a */
    public class a implements OAuthListener {

        /* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.a$a$a, reason: collision with other inner class name */
        public class RunnableC22711a implements Runnable {
            public RunnableC22711a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(C14333a.this.f60088b);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((OAuthListener) it.next()).onQrcodeScanned();
                }
            }
        }

        public a() {
        }

        @Override // com.tencent.p101mm.opensdk.diffdev.OAuthListener
        public void onAuthFinish(OAuthErrCode oAuthErrCode, String str) {
            Log.m84174d("MicroMsg.SDK.ListenerWrapper", String.format("onAuthFinish, errCode = %s, authCode = %s", oAuthErrCode.toString(), str));
            C14333a.this.f60089c = null;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(C14333a.this.f60088b);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((OAuthListener) it.next()).onAuthFinish(oAuthErrCode, str);
            }
        }

        @Override // com.tencent.p101mm.opensdk.diffdev.OAuthListener
        public void onAuthGotQrcode(String str, byte[] bArr) {
            Log.m84174d("MicroMsg.SDK.ListenerWrapper", "onAuthGotQrcode, qrcodeImgPath = " + str);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(C14333a.this.f60088b);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((OAuthListener) it.next()).onAuthGotQrcode(str, bArr);
            }
        }

        @Override // com.tencent.p101mm.opensdk.diffdev.OAuthListener
        public void onQrcodeScanned() {
            Log.m84174d("MicroMsg.SDK.ListenerWrapper", "onQrcodeScanned");
            if (C14333a.this.f60087a != null) {
                C14333a.this.f60087a.post(new RunnableC22711a());
            }
        }
    }

    @Override // com.tencent.p101mm.opensdk.diffdev.IDiffDevOAuth
    public void addListener(OAuthListener oAuthListener) {
        if (this.f60088b.contains(oAuthListener)) {
            return;
        }
        this.f60088b.add(oAuthListener);
    }

    @Override // com.tencent.p101mm.opensdk.diffdev.IDiffDevOAuth
    public boolean auth(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener) {
        Log.m84176i("MicroMsg.SDK.DiffDevOAuth", "start auth, appId = " + str);
        if (str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            Log.m84174d("MicroMsg.SDK.DiffDevOAuth", String.format("auth fail, invalid argument, appId = %s, scope = %s", str, str2));
            return false;
        }
        if (this.f60087a == null) {
            this.f60087a = new Handler(Looper.getMainLooper());
        }
        if (!this.f60088b.contains(oAuthListener)) {
            this.f60088b.add(oAuthListener);
        }
        if (this.f60089c != null) {
            Log.m84174d("MicroMsg.SDK.DiffDevOAuth", "auth, already running, no need to start auth again");
            return true;
        }
        AsyncTaskC14334b asyncTaskC14334b = new AsyncTaskC14334b(str, str2, str3, str4, str5, this.f60090d);
        this.f60089c = asyncTaskC14334b;
        asyncTaskC14334b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return true;
    }

    @Override // com.tencent.p101mm.opensdk.diffdev.IDiffDevOAuth
    public void detach() {
        Log.m84176i("MicroMsg.SDK.DiffDevOAuth", "detach");
        this.f60088b.clear();
        stopAuth();
    }

    @Override // com.tencent.p101mm.opensdk.diffdev.IDiffDevOAuth
    public void removeAllListeners() {
        this.f60088b.clear();
    }

    @Override // com.tencent.p101mm.opensdk.diffdev.IDiffDevOAuth
    public void removeListener(OAuthListener oAuthListener) {
        this.f60088b.remove(oAuthListener);
    }

    @Override // com.tencent.p101mm.opensdk.diffdev.IDiffDevOAuth
    public boolean stopAuth() {
        boolean zM84166a;
        Log.m84176i("MicroMsg.SDK.DiffDevOAuth", "stopAuth");
        try {
            AsyncTaskC14334b asyncTaskC14334b = this.f60089c;
            zM84166a = asyncTaskC14334b == null ? true : asyncTaskC14334b.m84166a();
        } catch (Exception e) {
            Log.m84178w("MicroMsg.SDK.DiffDevOAuth", "stopAuth fail, ex = " + e.getMessage());
            zM84166a = false;
        }
        this.f60089c = null;
        return zM84166a;
    }
}
