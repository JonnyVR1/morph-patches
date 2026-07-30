package p006l;

import android.net.NetworkInfo;
import com.tantanapp.common.network.RunnerProxy;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import java.io.Closeable;
import java.util.concurrent.Callable;
import l.c4g0;
import l.e30;
import l.gl5;
import l.jo0;
import l.mkd0;
import l.roj0;
import l.stc0;
import l.t95;
import l.v9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class jsx extends RunnerProxy {
    public jsx() {
        runnerStop();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ roj0 m17789b(String str) {
        int i = 0;
        while (i < 3) {
            try {
                try {
                    t95.b(qib0.f19782G.m(new stc0.a().q(str).b()).execute());
                    break;
                } catch (Exception unused) {
                    continue;
                    i++;
                    t95.b((Closeable) null);
                }
            } catch (Exception e) {
                try {
                    CrashHelper.c(e);
                } catch (Throwable th) {
                    t95.b((Closeable) null);
                    throw th;
                }
            }
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: d */
    public void m17791d(final String str) {
        scheduled("media_preload" + str, 0, new v9j() { // from class: l.gsx
            public final Object call() {
                return c.fromCallable(new Callable() { // from class: l.isx
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return jsx.m17789b(str);
                    }
                }).compose(mkd0.Q());
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m17792e(NetworkInfo networkInfo) {
        if (ConnectivityReceiver.l() || ((Boolean) gl5.b.get()).booleanValue()) {
            runnerStart();
        } else {
            runnerStop();
        }
    }

    /* JADX INFO: renamed from: f */
    public c4g0 m17793f() {
        return ConnectivityReceiver.m().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.hsx
            public final void call(Object obj) {
                this.f14041a.m17792e((NetworkInfo) obj);
            }
        }));
    }
}
