package p149l;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lkg0 {

    /* JADX INFO: renamed from: a */
    public static final rmg0 f128530a;

    /* JADX INFO: renamed from: b */
    public static final k850 f128531b;

    /* JADX INFO: renamed from: c */
    public static final ThreadPoolExecutor f128532c;

    /* JADX INFO: renamed from: d */
    public static final ExecutorService f128533d;

    static {
        rmg0 rmg0Var = new rmg0();
        f128530a = rmg0Var;
        k850.C17954b c17954b = new k850.C17954b();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f128531b = c17954b.m144885f(15L, timeUnit).m144899t(30L, timeUnit).m144880a(rmg0Var).m144903x(30L, timeUnit).m144891l(new odg0()).m144889j(new zrg0()).m144882c();
        f128532c = new ThreadPoolExecutor(1, 64, 30L, timeUnit, new SynchronousQueue(), new ldg0());
        f128533d = Executors.newSingleThreadExecutor();
    }

    /* JADX INFO: renamed from: a */
    public static void m150267a(stc0.C20027a c20027a) {
        c20027a.m185882a("Authorization", "Bearer " + mlg0.f134427b.f135232i);
    }
}
