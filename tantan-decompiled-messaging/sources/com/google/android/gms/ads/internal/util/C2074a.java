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
import p149l.d1s0;
import p149l.ii5;
import p149l.m7s0;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C2074a {

    /* JADX INFO: renamed from: d */
    public boolean f9712d;

    /* JADX INFO: renamed from: e */
    public Context f9713e;

    /* JADX INFO: renamed from: c */
    public boolean f9711c = false;

    /* JADX INFO: renamed from: b */
    public final Map f9710b = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public final BroadcastReceiver f9709a = new zzcl(this);

    @SuppressLint({"UnprotectedReceiver"})
    /* JADX INFO: renamed from: b */
    public final synchronized void m12286b(Context context) {
        try {
            if (this.f9711c) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f9713e = applicationContext;
            if (applicationContext == null) {
                this.f9713e = context;
            }
            m7s0.m153417a(this.f9713e);
            this.f9712d = ((Boolean) d1s0.m109677c().m144697a(m7s0.f131944I3)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132449wa)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                ii5.m136342l(this.f9713e, this.f9709a, intentFilter);
            } else {
                this.f9713e.registerReceiver(this.f9709a, intentFilter, 4);
            }
            this.f9711c = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @SuppressLint({"UnprotectedReceiver"})
    /* JADX INFO: renamed from: c */
    public final synchronized void m12287c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f9712d) {
            this.f9710b.put(broadcastReceiver, intentFilter);
            return;
        }
        m7s0.m153417a(context);
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132449wa)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            ii5.m136342l(context, broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m12288d(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f9712d) {
            this.f9710b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m12289e(Context context, Intent intent) {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : this.f9710b.entrySet()) {
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
