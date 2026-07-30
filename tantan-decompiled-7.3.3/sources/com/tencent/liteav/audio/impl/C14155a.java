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
public class C14155a {

    /* JADX INFO: renamed from: a */
    private static final C14155a f58858a = new C14155a();

    /* JADX INFO: renamed from: b */
    private ConcurrentHashMap<Integer, WeakReference<InterfaceC14156b>> f58859b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    private PhoneStateListener f58860c = null;

    /* JADX INFO: renamed from: d */
    private Context f58861d;

    private C14155a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized void m83877a(int i) {
        try {
            Iterator<Map.Entry<Integer, WeakReference<InterfaceC14156b>>> it = this.f58859b.entrySet().iterator();
            while (it.hasNext()) {
                InterfaceC14156b interfaceC14156b = it.next().getValue().get();
                if (interfaceC14156b != null) {
                    interfaceC14156b.onCallStateChanged(i);
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
        if (this.f58860c == null || this.f58861d == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.liteav.audio.impl.a.2
            @Override // java.lang.Runnable
            public void run() {
                if (C14155a.this.f58860c != null && C14155a.this.f58861d != null) {
                    try {
                        ((TelephonyManager) C14155a.this.f58861d.getApplicationContext().getSystemService("phone")).listen(C14155a.this.f58860c, 0);
                    } catch (Exception e) {
                        TXCLog.m84150e("AudioCenter:TXCTelephonyMgr", "TelephonyManager listen error ", e);
                    }
                }
                C14155a.this.f58860c = null;
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static C14155a m83876a() {
        return f58858a;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m83881a(InterfaceC14156b interfaceC14156b) {
        if (interfaceC14156b == null) {
            return;
        }
        this.f58859b.put(Integer.valueOf(interfaceC14156b.hashCode()), new WeakReference<>(interfaceC14156b));
    }

    /* JADX INFO: renamed from: a */
    public void m83880a(Context context) {
        if (this.f58860c != null) {
            return;
        }
        this.f58861d = context.getApplicationContext();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.liteav.audio.impl.a.1
            @Override // java.lang.Runnable
            public void run() {
                if (C14155a.this.f58860c != null) {
                    return;
                }
                C14155a.this.f58860c = new PhoneStateListener() { // from class: com.tencent.liteav.audio.impl.a.1.1
                    @Override // android.telephony.PhoneStateListener
                    public void onCallStateChanged(int i, String str) {
                        super.onCallStateChanged(i, str);
                        TXCLog.m84152i("AudioCenter:TXCTelephonyMgr", "onCallStateChanged:" + i);
                        C14155a.this.m83877a(i);
                    }
                };
                try {
                    ((TelephonyManager) C14155a.this.f58861d.getSystemService("phone")).listen(C14155a.this.f58860c, 32);
                } catch (Exception e) {
                    TXCLog.m84150e("AudioCenter:TXCTelephonyMgr", "TelephonyManager listen error ", e);
                }
            }
        });
    }
}
