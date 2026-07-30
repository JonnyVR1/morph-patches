package com.google.android.gms.ads.internal.util;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import p153l.jas0;
import p153l.jj5;
import p153l.sgs0;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C2097a {

    /* JADX INFO: renamed from: d */
    public boolean f9749d;

    /* JADX INFO: renamed from: e */
    public Context f9750e;

    /* JADX INFO: renamed from: c */
    public boolean f9748c = false;

    /* JADX INFO: renamed from: b */
    public final Map f9747b = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public final BroadcastReceiver f9746a = new zzcl(this);

    @SuppressLint({"UnprotectedReceiver"})
    /* JADX INFO: renamed from: b */
    public final synchronized void m12340b(Context context) {
        try {
            if (this.f9748c) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f9750e = applicationContext;
            if (applicationContext == null) {
                this.f9750e = context;
            }
            sgs0.m185829a(this.f9750e);
            this.f9749d = ((Boolean) jas0.m144075c().m176505a(sgs0.f168015I3)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168520wa)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                jj5.m145018l(this.f9750e, this.f9746a, intentFilter);
            } else {
                this.f9750e.registerReceiver(this.f9746a, intentFilter, 4);
            }
            this.f9748c = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @SuppressLint({"UnprotectedReceiver"})
    /* JADX INFO: renamed from: c */
    public final synchronized void m12341c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f9749d) {
            this.f9747b.put(broadcastReceiver, intentFilter);
            return;
        }
        sgs0.m185829a(context);
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168520wa)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            jj5.m145018l(context, broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m12342d(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f9749d) {
            this.f9747b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m12343e(Context context, Intent intent) {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : this.f9747b.entrySet()) {
                if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                    arrayList.add((BroadcastReceiver) entry.getKey());
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((BroadcastReceiver) arrayList.get(i)).onReceive(context, intent);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
