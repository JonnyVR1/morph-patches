package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import p149l.ii5;
import p149l.xwy0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.o1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2210o1 {

    /* JADX INFO: renamed from: e */
    @Nullable
    public static C2210o1 f10006e;

    /* JADX INFO: renamed from: a */
    public final Handler f10007a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f10008b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    public final Object f10009c = new Object();

    /* JADX INFO: renamed from: d */
    @GuardedBy("networkTypeLock")
    public int f10010d = 0;

    public C2210o1(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        ii5.m136342l(context, new zzfm(this, null), intentFilter);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C2210o1 m13070b(Context context) {
        try {
            if (f10006e == null) {
                f10006e = new C2210o1(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f10006e;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m13071c(C2210o1 c2210o1, int i) throws Throwable {
        synchronized (c2210o1.f10009c) {
            try {
                if (c2210o1.f10010d == i) {
                    return;
                }
                c2210o1.f10010d = i;
                for (WeakReference weakReference : c2210o1.f10008b) {
                    xwy0 xwy0Var = (xwy0) weakReference.get();
                    if (xwy0Var != null) {
                        xwy0Var.f194801a.m152115g(i);
                    } else {
                        c2210o1.f10008b.remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m13072a() {
        int i;
        synchronized (this.f10009c) {
            i = this.f10010d;
        }
        return i;
    }

    /* JADX INFO: renamed from: d */
    public final void m13073d(final xwy0 xwy0Var) {
        for (WeakReference weakReference : this.f10008b) {
            if (weakReference.get() == null) {
                this.f10008b.remove(weakReference);
            }
        }
        this.f10008b.add(new WeakReference(xwy0Var));
        this.f10007a.post(new Runnable() { // from class: l.f0w0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                xwy0Var.f194801a.m152115g(this.f94017a.m13072a());
            }
        });
    }
}
