package com.tencent.iliveroom.p080a;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.iliveroom.a.c */
/* JADX INFO: loaded from: classes2.dex */
public class C13956c {

    /* JADX INFO: renamed from: a */
    private WeakReference<C13945a> f57828a;

    /* JADX INFO: renamed from: c */
    private String f57830c;

    /* JADX INFO: renamed from: d */
    private long f57831d;

    /* JADX INFO: renamed from: b */
    private Handler f57829b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e */
    private AtomicInteger f57832e = new AtomicInteger(0);

    public C13956c(C13945a c13945a) {
        this.f57828a = new WeakReference<>(c13945a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m82625b(String str, long j) {
        C13945a c13945a = this.f57828a.get();
        if (c13945a == null || str == null) {
            return;
        }
        TXCLog.m82969i("TRTCAdapter-ConnOther", "connectOtherRoomInternal: roomName = " + str + " userId = " + j);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("strRoomId", str);
            jSONObject.put("userId", j + "");
            jSONObject.put("sign", "");
        } catch (JSONException e) {
            TXCLog.m82967e("TRTCAdapter-ConnOther", "build json object failed.", e);
        }
        c13945a.ConnectOtherRoom(jSONObject.toString());
    }

    /* JADX INFO: renamed from: a */
    public boolean m82630a(int i, String str) {
        TXCLog.m82969i("TRTCAdapter-ConnOther", "retryConnect -> code:" + i + " msg:" + str);
        if (!m82623a(i) || this.f57832e.get() > 30) {
            TXCLog.m82969i("TRTCAdapter-ConnOther", "retryConnect -> no need to retry, errorCode = " + i + " count = " + this.f57832e.get());
            return false;
        }
        TXCLog.m82966e("TRTCAdapter-ConnOther", "retryConnect -> do conn, target room id:" + this.f57830c + " user id:" + this.f57831d + " count:" + this.f57832e.get());
        m82622a(new Runnable() { // from class: com.tencent.iliveroom.a.c.3
            @Override // java.lang.Runnable
            public void run() {
                if (!TextUtils.isEmpty(C13956c.this.f57830c) && C13956c.this.f57831d != 0) {
                    C13956c.this.f57832e.incrementAndGet();
                    C13956c c13956c = C13956c.this;
                    c13956c.m82625b(c13956c.f57830c, C13956c.this.f57831d);
                } else {
                    TXCLog.m82966e("TRTCAdapter-ConnOther", "retryConnect -> fail, target room id:" + C13956c.this.f57830c + " user id:" + C13956c.this.f57831d);
                }
            }
        }, 1000);
        return true;
    }

    /* JADX INFO: renamed from: a */
    private void m82621a(Runnable runnable) {
        if (this.f57829b.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.f57829b.post(runnable);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m82622a(Runnable runnable, int i) {
        this.f57829b.postDelayed(runnable, i);
    }

    /* JADX INFO: renamed from: a */
    public void m82629a(final String str, final long j) {
        m82621a(new Runnable() { // from class: com.tencent.iliveroom.a.c.1
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str)) {
                    TXCLog.m82966e("TRTCAdapter-ConnOther", "start -> roomId is invalid = " + str);
                } else {
                    C13956c.this.f57832e.set(0);
                    C13956c.this.f57830c = str;
                    C13956c.this.f57831d = j;
                    C13956c.this.m82625b(str, j);
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m82628a() {
        m82621a(new Runnable() { // from class: com.tencent.iliveroom.a.c.2
            @Override // java.lang.Runnable
            public void run() {
                C13956c.this.f57831d = 0L;
                C13956c.this.f57830c = "";
                C13956c.this.f57832e.set(31);
                C13945a c13945a = (C13945a) C13956c.this.f57828a.get();
                if (c13945a != null) {
                    c13945a.DisconnectOtherRoom();
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private boolean m82623a(int i) {
        return i == -102046 || i == -102044 || i == -102033 || i == -102034 || i == -102048;
    }
}
