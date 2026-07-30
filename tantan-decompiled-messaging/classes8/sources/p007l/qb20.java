package p007l;

import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.util.concurrent.Callable;
import l.e30;
import l.exc0;
import l.qjd0;
import l.sx3;
import l.x74;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class qb20 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ exc0 m10333a(sx3 sx3Var, x74 x74Var) {
        try {
            return sx3Var.execute();
        } catch (IOException e) {
            x74Var.onFailure(sx3Var, e);
            return null;
        } catch (Exception e2) {
            CrashHelper.c(e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m10334b(x74 x74Var, sx3 sx3Var, exc0 exc0Var) {
        if (exc0Var == null) {
            return;
        }
        try {
            x74Var.onResponse(sx3Var, exc0Var);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m10335c(final sx3 sx3Var, final x74 x74Var) {
        c.fromCallable(new Callable() { // from class: l.ob20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return qb20.m10333a(sx3Var, x74Var);
            }
        }).compose(qjd0.e(Schedulers.io())).observeOn(Schedulers.io()).subscribe(new e30() { // from class: l.pb20
            public final void call(Object obj) {
                qb20.m10334b(x74Var, sx3Var, (exc0) obj);
            }
        });
    }
}
