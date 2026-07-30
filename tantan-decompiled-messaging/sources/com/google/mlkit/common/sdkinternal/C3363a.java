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
import p149l.k0r0;
import p149l.sei0;

/* JADX INFO: renamed from: com.google.mlkit.common.sdkinternal.a */
/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public class C3363a {

    /* JADX INFO: renamed from: b */
    public static final Object f11498b = new Object();

    /* JADX INFO: renamed from: c */
    @Nullable
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public static C3363a f11499c;

    /* JADX INFO: renamed from: a */
    public final Handler f11500a;

    public C3363a(Looper looper) {
        this.f11500a = new k0r0(looper);
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public static C3363a m16874a() {
        C3363a c3363a;
        synchronized (f11498b) {
            try {
                if (f11499c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f11499c = new C3363a(handlerThread.getLooper());
                }
                c3363a = f11499c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3363a;
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: d */
    public static Executor m16875d() {
        return zzh.zza;
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: b */
    public <ResultT> Task<ResultT> m16877b(@NonNull final Callable<ResultT> callable) {
        final sei0 sei0Var = new sei0();
        m16878c(new Runnable() { // from class: l.epv0
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                sei0 sei0Var2 = sei0Var;
                try {
                    sei0Var2.m183659c(callable2.call());
                } catch (MlKitException e) {
                    sei0Var2.m183658b(e);
                } catch (Exception e2) {
                    sei0Var2.m183658b(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e2));
                }
            }
        });
        return sei0Var.m183657a();
    }

    @KeepForSdk
    /* JADX INFO: renamed from: c */
    public void m16878c(@NonNull Runnable runnable) {
        m16875d().execute(runnable);
    }
}
