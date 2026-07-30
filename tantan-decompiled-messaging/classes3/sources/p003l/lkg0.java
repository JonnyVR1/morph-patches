package p003l;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l.k850;
import l.mlg0;
import l.stc0;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class lkg0 {

    /* JADX INFO: renamed from: a */
    public static final rmg0 f5322a;

    /* JADX INFO: renamed from: b */
    public static final k850 f5323b;

    /* JADX INFO: renamed from: c */
    public static final ThreadPoolExecutor f5324c;

    /* JADX INFO: renamed from: d */
    public static final ExecutorService f5325d;

    static {
        rmg0 rmg0Var = new rmg0();
        f5322a = rmg0Var;
        k850.b bVar = new k850.b();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f5323b = bVar.f(15L, timeUnit).t(30L, timeUnit).a(rmg0Var).x(30L, timeUnit).l(new odg0()).j(new zrg0()).c();
        f5324c = new ThreadPoolExecutor(1, 64, 30L, timeUnit, new SynchronousQueue(), new ldg0());
        f5325d = Executors.newSingleThreadExecutor();
    }

    /* JADX INFO: renamed from: a */
    public static void m6040a(stc0.a aVar) {
        aVar.a(HttpHeaders.AUTHORIZATION, "Bearer " + mlg0.b.f5734i);
    }
}
