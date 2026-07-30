package p153l;

import android.net.NetworkInfo;
import com.tantanapp.common.network.RunnerProxy;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import java.util.concurrent.Callable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class g1y extends RunnerProxy {
    public g1y() {
        runnerStop();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ uxj0 m128575b(String str) {
        int i = 0;
        while (i < 3) {
            try {
                try {
                    ua5.m195158b(uqb0.f180374G.m98796m(new x1d0.C21228a().m209043q(str).m209028b()).execute());
                    break;
                } catch (Exception unused) {
                    continue;
                    i++;
                    ua5.m195158b(null);
                }
            } catch (Exception e) {
                try {
                    CrashHelper.m82479c(e);
                } catch (Throwable th) {
                    ua5.m195158b(null);
                    throw th;
                }
            }
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: d */
    public void m128577d(final String str) {
        scheduled("media_preload" + str, 0, new pcj() { // from class: l.d1y
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C22421c.fromCallable(new Callable() { // from class: l.f1y
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return g1y.m128575b(str);
                    }
                }).compose(psd0.m173606Q());
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m128578e(NetworkInfo networkInfo) {
        if (ConnectivityReceiver.m82472l() || jm5.f121639b.get().booleanValue()) {
            runnerStart();
        } else {
            runnerStop();
        }
    }

    /* JADX INFO: renamed from: f */
    public kcg0 m128579f() {
        return ConnectivityReceiver.m82473m().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.e1y
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91686a.m128578e((NetworkInfo) obj);
            }
        }));
    }
}
