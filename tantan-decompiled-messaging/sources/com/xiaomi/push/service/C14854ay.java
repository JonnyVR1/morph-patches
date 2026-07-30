package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import p149l.fjq0;
import p149l.gkq0;
import p149l.hwq0;
import p149l.ilq0;
import p149l.njq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.ay */
/* JADX INFO: loaded from: classes2.dex */
public final class C14854ay implements InterfaceC14830aa {

    /* JADX INFO: renamed from: a */
    private static volatile C14854ay f62997a;

    /* JADX INFO: renamed from: a */
    private long f62998a;

    /* JADX INFO: renamed from: a */
    Context f62999a;

    /* JADX INFO: renamed from: a */
    private SharedPreferences f63000a;

    /* JADX INFO: renamed from: a */
    private volatile boolean f63002a = false;

    /* JADX INFO: renamed from: a */
    private ConcurrentHashMap<String, a> f63001a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.xiaomi.push.service.ay$a */
    public static abstract class a implements Runnable {

        /* JADX INFO: renamed from: a */
        long f63004a;

        /* JADX INFO: renamed from: a */
        String f63005a;

        public a(String str, long j) {
            this.f63005a = str;
            this.f63004a = j;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo86597a(C14854ay c14854ay);

        @Override // java.lang.Runnable
        public void run() {
            if (C14854ay.f62997a != null) {
                Context context = C14854ay.f62997a.f62999a;
                if (gkq0.m126694w(context)) {
                    if (System.currentTimeMillis() - C14854ay.f62997a.f63000a.getLong(":ts-" + this.f63005a, 0L) > this.f63004a || fjq0.m121624b(context)) {
                        hwq0.m133262a(C14854ay.f62997a.f63000a.edit().putLong(":ts-" + this.f63005a, System.currentTimeMillis()));
                        mo86597a(C14854ay.f62997a);
                    }
                }
            }
        }
    }

    private C14854ay(Context context) {
        this.f62999a = context.getApplicationContext();
        this.f63000a = context.getSharedPreferences("sync", 0);
    }

    @Override // com.xiaomi.push.service.InterfaceC14830aa
    /* JADX INFO: renamed from: a */
    public void mo86376a() {
        if (this.f63002a) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f62998a < 3600000) {
            return;
        }
        this.f62998a = jCurrentTimeMillis;
        this.f63002a = true;
        njq0.m159772f(this.f62999a).m159774h(new Runnable() { // from class: com.xiaomi.push.service.ay.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Iterator it = C14854ay.this.f63001a.values().iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).run();
                    }
                } catch (Exception e) {
                    ilq0.m137040m("Sync job exception :" + e.getMessage());
                }
                C14854ay.this.f63002a = false;
            }
        }, (int) (Math.random() * 10.0d));
    }

    /* JADX INFO: renamed from: a */
    public static C14854ay m86591a(Context context) {
        if (f62997a == null) {
            synchronized (C14854ay.class) {
                try {
                    if (f62997a == null) {
                        f62997a = new C14854ay(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f62997a;
    }

    /* JADX INFO: renamed from: a */
    public String m86594a(String str, String str2) {
        return this.f63000a.getString(str + ":" + str2, "");
    }

    /* JADX INFO: renamed from: a */
    public void m86596a(String str, String str2, String str3) {
        hwq0.m133262a(f62997a.f63000a.edit().putString(str + ":" + str2, str3));
    }

    /* JADX INFO: renamed from: a */
    public void m86595a(a aVar) {
        if (this.f63001a.putIfAbsent(aVar.f63005a, aVar) == null) {
            njq0.m159772f(this.f62999a).m159774h(aVar, ((int) (Math.random() * 30.0d)) + 10);
        }
    }
}
