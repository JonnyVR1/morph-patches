package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import p153l.ksq0;
import p153l.mtq0;
import p153l.n5r0;
import p153l.ouq0;
import p153l.tsq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.ay */
/* JADX INFO: loaded from: classes2.dex */
public final class C15002ay implements InterfaceC14978aa {

    /* JADX INFO: renamed from: a */
    private static volatile C15002ay f63844a;

    /* JADX INFO: renamed from: a */
    private long f63845a;

    /* JADX INFO: renamed from: a */
    Context f63846a;

    /* JADX INFO: renamed from: a */
    private SharedPreferences f63847a;

    /* JADX INFO: renamed from: a */
    private volatile boolean f63849a = false;

    /* JADX INFO: renamed from: a */
    private ConcurrentHashMap<String, a> f63848a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.xiaomi.push.service.ay$a */
    public static abstract class a implements Runnable {

        /* JADX INFO: renamed from: a */
        long f63851a;

        /* JADX INFO: renamed from: a */
        String f63852a;

        public a(String str, long j) {
            this.f63852a = str;
            this.f63851a = j;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo87768a(C15002ay c15002ay);

        @Override // java.lang.Runnable
        public void run() {
            if (C15002ay.f63844a != null) {
                Context context = C15002ay.f63844a.f63846a;
                if (mtq0.m160047w(context)) {
                    if (System.currentTimeMillis() - C15002ay.f63844a.f63847a.getLong(":ts-" + this.f63852a, 0L) > this.f63851a || ksq0.m151280b(context)) {
                        n5r0.m161732a(C15002ay.f63844a.f63847a.edit().putLong(":ts-" + this.f63852a, System.currentTimeMillis()));
                        mo87768a(C15002ay.f63844a);
                    }
                }
            }
        }
    }

    private C15002ay(Context context) {
        this.f63846a = context.getApplicationContext();
        this.f63847a = context.getSharedPreferences("sync", 0);
    }

    @Override // com.xiaomi.push.service.InterfaceC14978aa
    /* JADX INFO: renamed from: a */
    public void mo87547a() {
        if (this.f63849a) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f63845a < 3600000) {
            return;
        }
        this.f63845a = jCurrentTimeMillis;
        this.f63849a = true;
        tsq0.m192627f(this.f63846a).m192629h(new Runnable() { // from class: com.xiaomi.push.service.ay.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Iterator it = C15002ay.this.f63848a.values().iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).run();
                    }
                } catch (Exception e) {
                    ouq0.m169393m("Sync job exception :" + e.getMessage());
                }
                C15002ay.this.f63849a = false;
            }
        }, (int) (Math.random() * 10.0d));
    }

    /* JADX INFO: renamed from: a */
    public static C15002ay m87762a(Context context) {
        if (f63844a == null) {
            synchronized (C15002ay.class) {
                try {
                    if (f63844a == null) {
                        f63844a = new C15002ay(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f63844a;
    }

    /* JADX INFO: renamed from: a */
    public String m87765a(String str, String str2) {
        return this.f63847a.getString(str + ":" + str2, "");
    }

    /* JADX INFO: renamed from: a */
    public void m87767a(String str, String str2, String str3) {
        n5r0.m161732a(f63844a.f63847a.edit().putString(str + ":" + str2, str3));
    }

    /* JADX INFO: renamed from: a */
    public void m87766a(a aVar) {
        if (this.f63848a.putIfAbsent(aVar.f63852a, aVar) == null) {
            tsq0.m192627f(this.f63846a).m192629h(aVar, ((int) (Math.random() * 30.0d)) + 10);
        }
    }
}
