package p153l;

import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.util.concurrent.Callable;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes9.dex */
public class zj20 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ i5d0 m219961a(ry3 ry3Var, w84 w84Var) {
        try {
            return ry3Var.execute();
        } catch (IOException e) {
            w84Var.onFailure(ry3Var, e);
            return null;
        } catch (Exception e2) {
            CrashHelper.m82479c(e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m219962b(w84 w84Var, ry3 ry3Var, i5d0 i5d0Var) {
        if (i5d0Var == null) {
            return;
        }
        try {
            w84Var.onResponse(ry3Var, i5d0Var);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m219963c(final ry3 ry3Var, final w84 w84Var) {
        C22421c.fromCallable(new Callable() { // from class: l.xj20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zj20.m219961a(ry3Var, w84Var);
            }
        }).compose(trd0.m192475e(Schedulers.m222739io())).observeOn(Schedulers.m222739io()).subscribe(new y20() { // from class: l.yj20
            @Override // p153l.y20
            public final void call(Object obj) {
                zj20.m219962b(w84Var, ry3Var, (i5d0) obj);
            }
        });
    }
}
