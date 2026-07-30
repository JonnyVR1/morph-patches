package com.google.mlkit.common.sdkinternal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.aspectj.lang.JoinPoint;
import p153l.q9r0;
import p153l.sni0;

/* JADX INFO: renamed from: com.google.mlkit.common.sdkinternal.a */
/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public class C3386a {

    /* JADX INFO: renamed from: b */
    public static final Object f11535b = new Object();

    /* JADX INFO: renamed from: c */
    @Nullable
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public static C3386a f11536c;

    /* JADX INFO: renamed from: a */
    public final Handler f11537a;

    public C3386a(Looper looper) {
        this.f11537a = new q9r0(looper);
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public static C3386a m16929a() {
        C3386a c3386a;
        synchronized (f11535b) {
            try {
                if (f11536c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f11536c = new C3386a(handlerThread.getLooper());
                }
                c3386a = f11536c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3386a;
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: d */
    public static Executor m16930d() {
        return zzh.zza;
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: b */
    public <ResultT> Task<ResultT> m16932b(@NonNull final Callable<ResultT> callable) {
        final sni0 sni0Var = new sni0();
        m16933c(new Runnable() { // from class: l.kyv0
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                sni0 sni0Var2 = sni0Var;
                try {
                    sni0Var2.m186941c(callable2.call());
                } catch (MlKitException e) {
                    sni0Var2.m186940b(e);
                } catch (Exception e2) {
                    sni0Var2.m186940b(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e2));
                }
            }
        });
        return sni0Var.m186939a();
    }

    @KeepForSdk
    /* JADX INFO: renamed from: c */
    public void m16933c(@NonNull Runnable runnable) {
        m16930d().execute(runnable);
    }
}
