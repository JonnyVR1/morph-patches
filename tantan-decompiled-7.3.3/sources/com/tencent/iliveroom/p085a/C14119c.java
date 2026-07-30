package com.tencent.iliveroom.p085a;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.iliveroom.a.c */
/* JADX INFO: loaded from: classes12.dex */
public class C14119c {

    /* JADX INFO: renamed from: a */
    private WeakReference<C14108a> f58676a;

    /* JADX INFO: renamed from: c */
    private String f58678c;

    /* JADX INFO: renamed from: d */
    private long f58679d;

    /* JADX INFO: renamed from: b */
    private Handler f58677b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e */
    private AtomicInteger f58680e = new AtomicInteger(0);

    public C14119c(C14108a c14108a) {
        this.f58676a = new WeakReference<>(c14108a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m83808b(String str, long j) {
        C14108a c14108a = this.f58676a.get();
        if (c14108a == null || str == null) {
            return;
        }
        TXCLog.m84152i("TRTCAdapter-ConnOther", "connectOtherRoomInternal: roomName = " + str + " userId = " + j);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("strRoomId", str);
            jSONObject.put("userId", j + "");
            jSONObject.put("sign", "");
        } catch (JSONException e) {
            TXCLog.m84150e("TRTCAdapter-ConnOther", "build json object failed.", e);
        }
        c14108a.ConnectOtherRoom(jSONObject.toString());
    }

    /* JADX INFO: renamed from: a */
    public boolean m83813a(int i, String str) {
        TXCLog.m84152i("TRTCAdapter-ConnOther", "retryConnect -> code:" + i + " msg:" + str);
        if (!m83806a(i) || this.f58680e.get() > 30) {
            TXCLog.m84152i("TRTCAdapter-ConnOther", "retryConnect -> no need to retry, errorCode = " + i + " count = " + this.f58680e.get());
            return false;
        }
        TXCLog.m84149e("TRTCAdapter-ConnOther", "retryConnect -> do conn, target room id:" + this.f58678c + " user id:" + this.f58679d + " count:" + this.f58680e.get());
        m83805a(new Runnable() { // from class: com.tencent.iliveroom.a.c.3
            @Override // java.lang.Runnable
            public void run() {
                if (!TextUtils.isEmpty(C14119c.this.f58678c) && C14119c.this.f58679d != 0) {
                    C14119c.this.f58680e.incrementAndGet();
                    C14119c c14119c = C14119c.this;
                    c14119c.m83808b(c14119c.f58678c, C14119c.this.f58679d);
                } else {
                    TXCLog.m84149e("TRTCAdapter-ConnOther", "retryConnect -> fail, target room id:" + C14119c.this.f58678c + " user id:" + C14119c.this.f58679d);
                }
            }
        }, 1000);
        return true;
    }

    /* JADX INFO: renamed from: a */
    private void m83804a(Runnable runnable) {
        if (this.f58677b.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.f58677b.post(runnable);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m83805a(Runnable runnable, int i) {
        this.f58677b.postDelayed(runnable, i);
    }

    /* JADX INFO: renamed from: a */
    public void m83812a(final String str, final long j) {
        m83804a(new Runnable() { // from class: com.tencent.iliveroom.a.c.1
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str)) {
                    TXCLog.m84149e("TRTCAdapter-ConnOther", "start -> roomId is invalid = " + str);
                } else {
                    C14119c.this.f58680e.set(0);
                    C14119c.this.f58678c = str;
                    C14119c.this.f58679d = j;
                    C14119c.this.m83808b(str, j);
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m83811a() {
        m83804a(new Runnable() { // from class: com.tencent.iliveroom.a.c.2
            @Override // java.lang.Runnable
            public void run() {
                C14119c.this.f58679d = 0L;
                C14119c.this.f58678c = "";
                C14119c.this.f58680e.set(31);
                C14108a c14108a = (C14108a) C14119c.this.f58676a.get();
                if (c14108a != null) {
                    c14108a.DisconnectOtherRoom();
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private boolean m83806a(int i) {
        return i == -102046 || i == -102044 || i == -102033 || i == -102034 || i == -102048;
    }
}
