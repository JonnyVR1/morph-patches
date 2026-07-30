package com.tencent.p106mm.opensdk.diffdev.p108a;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.tencent.p106mm.opensdk.diffdev.IDiffDevOAuth;
import com.tencent.p106mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.p106mm.opensdk.diffdev.OAuthListener;
import com.tencent.p106mm.opensdk.utils.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14496a implements IDiffDevOAuth {

    /* JADX INFO: renamed from: c */
    private AsyncTaskC14497b f60937c;

    /* JADX INFO: renamed from: a */
    private Handler f60935a = null;

    /* JADX INFO: renamed from: b */
    private List<OAuthListener> f60936b = new ArrayList();

    /* JADX INFO: renamed from: d */
    private OAuthListener f60938d = new a();

    /* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.a$a */
    public class a implements OAuthListener {

        /* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.a$a$a, reason: collision with other inner class name */
        public class RunnableC22827a implements Runnable {
            public RunnableC22827a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(C14496a.this.f60936b);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((OAuthListener) it.next()).onQrcodeScanned();
                }
            }
        }

        public a() {
        }

        @Override // com.tencent.p106mm.opensdk.diffdev.OAuthListener
        public void onAuthFinish(OAuthErrCode oAuthErrCode, String str) {
            Log.m85357d("MicroMsg.SDK.ListenerWrapper", String.format("onAuthFinish, errCode = %s, authCode = %s", oAuthErrCode.toString(), str));
            C14496a.this.f60937c = null;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(C14496a.this.f60936b);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((OAuthListener) it.next()).onAuthFinish(oAuthErrCode, str);
            }
        }

        @Override // com.tencent.p106mm.opensdk.diffdev.OAuthListener
        public void onAuthGotQrcode(String str, byte[] bArr) {
            Log.m85357d("MicroMsg.SDK.ListenerWrapper", "onAuthGotQrcode, qrcodeImgPath = " + str);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(C14496a.this.f60936b);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((OAuthListener) it.next()).onAuthGotQrcode(str, bArr);
            }
        }

        @Override // com.tencent.p106mm.opensdk.diffdev.OAuthListener
        public void onQrcodeScanned() {
            Log.m85357d("MicroMsg.SDK.ListenerWrapper", "onQrcodeScanned");
            if (C14496a.this.f60935a != null) {
                C14496a.this.f60935a.post(new RunnableC22827a());
            }
        }
    }

    @Override // com.tencent.p106mm.opensdk.diffdev.IDiffDevOAuth
    public void addListener(OAuthListener oAuthListener) {
        if (this.f60936b.contains(oAuthListener)) {
            return;
        }
        this.f60936b.add(oAuthListener);
    }

    @Override // com.tencent.p106mm.opensdk.diffdev.IDiffDevOAuth
    public boolean auth(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener) {
        Log.m85359i("MicroMsg.SDK.DiffDevOAuth", "start auth, appId = " + str);
        if (str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            Log.m85357d("MicroMsg.SDK.DiffDevOAuth", String.format("auth fail, invalid argument, appId = %s, scope = %s", str, str2));
            return false;
        }
        if (this.f60935a == null) {
            this.f60935a = new Handler(Looper.getMainLooper());
        }
        if (!this.f60936b.contains(oAuthListener)) {
            this.f60936b.add(oAuthListener);
        }
        if (this.f60937c != null) {
            Log.m85357d("MicroMsg.SDK.DiffDevOAuth", "auth, already running, no need to start auth again");
            return true;
        }
        AsyncTaskC14497b asyncTaskC14497b = new AsyncTaskC14497b(str, str2, str3, str4, str5, this.f60938d);
        this.f60937c = asyncTaskC14497b;
        asyncTaskC14497b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return true;
    }

    @Override // com.tencent.p106mm.opensdk.diffdev.IDiffDevOAuth
    public void detach() {
        Log.m85359i("MicroMsg.SDK.DiffDevOAuth", "detach");
        this.f60936b.clear();
        stopAuth();
    }

    @Override // com.tencent.p106mm.opensdk.diffdev.IDiffDevOAuth
    public void removeAllListeners() {
        this.f60936b.clear();
    }

    @Override // com.tencent.p106mm.opensdk.diffdev.IDiffDevOAuth
    public void removeListener(OAuthListener oAuthListener) {
        this.f60936b.remove(oAuthListener);
    }

    @Override // com.tencent.p106mm.opensdk.diffdev.IDiffDevOAuth
    public boolean stopAuth() {
        boolean zM85349a;
        Log.m85359i("MicroMsg.SDK.DiffDevOAuth", "stopAuth");
        try {
            AsyncTaskC14497b asyncTaskC14497b = this.f60937c;
            zM85349a = asyncTaskC14497b == null ? true : asyncTaskC14497b.m85349a();
        } catch (Exception e) {
            Log.m85361w("MicroMsg.SDK.DiffDevOAuth", "stopAuth fail, ex = " + e.getMessage());
            zM85349a = false;
        }
        this.f60937c = null;
        return zM85349a;
    }
}
