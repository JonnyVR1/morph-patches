package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import p153l.d6z0;
import p153l.jj5;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.o1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2233o1 {

    /* JADX INFO: renamed from: e */
    @Nullable
    public static C2233o1 f10043e;

    /* JADX INFO: renamed from: a */
    public final Handler f10044a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f10045b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    public final Object f10046c = new Object();

    /* JADX INFO: renamed from: d */
    @GuardedBy("networkTypeLock")
    public int f10047d = 0;

    public C2233o1(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        jj5.m145018l(context, new zzfm(this, null), intentFilter);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C2233o1 m13124b(Context context) {
        try {
            if (f10043e == null) {
                f10043e = new C2233o1(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f10043e;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m13125c(C2233o1 c2233o1, int i) throws Throwable {
        synchronized (c2233o1.f10046c) {
            try {
                if (c2233o1.f10047d == i) {
                    return;
                }
                c2233o1.f10047d = i;
                for (WeakReference weakReference : c2233o1.f10045b) {
                    d6z0 d6z0Var = (d6z0) weakReference.get();
                    if (d6z0Var != null) {
                        d6z0Var.f85434a.m180065g(i);
                    } else {
                        c2233o1.f10045b.remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m13126a() {
        int i;
        synchronized (this.f10046c) {
            i = this.f10047d;
        }
        return i;
    }

    /* JADX INFO: renamed from: d */
    public final void m13127d(final d6z0 d6z0Var) {
        for (WeakReference weakReference : this.f10045b) {
            if (weakReference.get() == null) {
                this.f10045b.remove(weakReference);
            }
        }
        this.f10045b.add(new WeakReference(d6z0Var));
        this.f10044a.post(new Runnable() { // from class: l.l9w0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                d6z0Var.f85434a.m180065g(this.f130638a.m13126a());
            }
        });
    }
}
