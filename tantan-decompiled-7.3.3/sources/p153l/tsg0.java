package p153l;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tsg0 {

    /* JADX INFO: renamed from: a */
    public static final zug0 f175995a;

    /* JADX INFO: renamed from: b */
    public static final rg50 f175996b;

    /* JADX INFO: renamed from: c */
    public static final ThreadPoolExecutor f175997c;

    /* JADX INFO: renamed from: d */
    public static final ExecutorService f175998d;

    static {
        zug0 zug0Var = new zug0();
        f175995a = zug0Var;
        rg50.C19837b c19837b = new rg50.C19837b();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f175996b = c19837b.m181368f(15L, timeUnit).m181383u(30L, timeUnit).m181363a(zug0Var).m181387y(30L, timeUnit).m181374l(new wlg0()).m181372j(new h0h0()).m181365c();
        f175997c = new ThreadPoolExecutor(1, 64, 30L, timeUnit, new SynchronousQueue(), new tlg0());
        f175998d = Executors.newSingleThreadExecutor();
    }

    /* JADX INFO: renamed from: a */
    public static void m192607a(x1d0.C21228a c21228a) {
        c21228a.m209027a("Authorization", "Bearer " + utg0.f180947b.f181609i);
    }
}
