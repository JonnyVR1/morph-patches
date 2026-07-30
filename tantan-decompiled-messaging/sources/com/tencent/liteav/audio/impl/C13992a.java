package com.tencent.liteav.audio.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.tencent.liteav.basic.log.TXCLog;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.tencent.liteav.audio.impl.a */
/* JADX INFO: loaded from: classes2.dex */
public class C13992a {

    /* JADX INFO: renamed from: a */
    private static final C13992a f58010a = new C13992a();

    /* JADX INFO: renamed from: b */
    private ConcurrentHashMap<Integer, WeakReference<InterfaceC13993b>> f58011b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    private PhoneStateListener f58012c = null;

    /* JADX INFO: renamed from: d */
    private Context f58013d;

    private C13992a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized void m82694a(int i) {
        try {
            Iterator<Map.Entry<Integer, WeakReference<InterfaceC13993b>>> it = this.f58011b.entrySet().iterator();
            while (it.hasNext()) {
                InterfaceC13993b interfaceC13993b = it.next().getValue().get();
                if (interfaceC13993b != null) {
                    interfaceC13993b.onCallStateChanged(i);
                } else {
                    it.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.f58012c == null || this.f58013d == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.liteav.audio.impl.a.2
            @Override // java.lang.Runnable
            public void run() {
                if (C13992a.this.f58012c != null && C13992a.this.f58013d != null) {
                    try {
                        ((TelephonyManager) C13992a.this.f58013d.getApplicationContext().getSystemService("phone")).listen(C13992a.this.f58012c, 0);
                    } catch (Exception e) {
                        TXCLog.m82967e("AudioCenter:TXCTelephonyMgr", "TelephonyManager listen error ", e);
                    }
                }
                C13992a.this.f58012c = null;
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static C13992a m82693a() {
        return f58010a;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m82698a(InterfaceC13993b interfaceC13993b) {
        if (interfaceC13993b == null) {
            return;
        }
        this.f58011b.put(Integer.valueOf(interfaceC13993b.hashCode()), new WeakReference<>(interfaceC13993b));
    }

    /* JADX INFO: renamed from: a */
    public void m82697a(Context context) {
        if (this.f58012c != null) {
            return;
        }
        this.f58013d = context.getApplicationContext();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.liteav.audio.impl.a.1
            @Override // java.lang.Runnable
            public void run() {
                if (C13992a.this.f58012c != null) {
                    return;
                }
                C13992a.this.f58012c = new PhoneStateListener() { // from class: com.tencent.liteav.audio.impl.a.1.1
                    @Override // android.telephony.PhoneStateListener
                    public void onCallStateChanged(int i, String str) {
                        super.onCallStateChanged(i, str);
                        TXCLog.m82969i("AudioCenter:TXCTelephonyMgr", "onCallStateChanged:" + i);
                        C13992a.this.m82694a(i);
                    }
                };
                try {
                    ((TelephonyManager) C13992a.this.f58013d.getSystemService("phone")).listen(C13992a.this.f58012c, 32);
                } catch (Exception e) {
                    TXCLog.m82967e("AudioCenter:TXCTelephonyMgr", "TelephonyManager listen error ", e);
                }
            }
        });
    }
}
