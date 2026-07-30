package p149l;

import android.net.NetworkInfo;
import com.tantanapp.common.network.RunnerProxy;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import java.util.concurrent.Callable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class jsx extends RunnerProxy {
    public jsx() {
        runnerStop();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ roj0 m143064b(String str) {
        int i = 0;
        while (i < 3) {
            try {
                try {
                    t95.m187604b(qib0.f154691G.m184723m(new stc0.C20027a().m185898q(str).m185883b()).execute());
                    break;
                } catch (Exception unused) {
                    continue;
                    i++;
                    t95.m187604b(null);
                }
            } catch (Exception e) {
                try {
                    CrashHelper.m81296c(e);
                } catch (Throwable th) {
                    t95.m187604b(null);
                    throw th;
                }
            }
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: d */
    public void m143066d(final String str) {
        scheduled("media_preload" + str, 0, new v9j() { // from class: l.gsx
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C22306c.fromCallable(new Callable() { // from class: l.isx
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return jsx.m143064b(str);
                    }
                }).compose(mkd0.m154965Q());
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m143067e(NetworkInfo networkInfo) {
        if (ConnectivityReceiver.m81289l() || gl5.f103294b.get().booleanValue()) {
            runnerStart();
        } else {
            runnerStop();
        }
    }

    /* JADX INFO: renamed from: f */
    public c4g0 m143068f() {
        return ConnectivityReceiver.m81290m().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.hsx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109353a.m143067e((NetworkInfo) obj);
            }
        }));
    }
}
