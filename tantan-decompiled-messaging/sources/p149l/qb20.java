package p149l;

import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.util.concurrent.Callable;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes8.dex */
public class qb20 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ exc0 m173810a(sx3 sx3Var, x74 x74Var) {
        try {
            return sx3Var.execute();
        } catch (IOException e) {
            x74Var.onFailure(sx3Var, e);
            return null;
        } catch (Exception e2) {
            CrashHelper.m81296c(e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m173811b(x74 x74Var, sx3 sx3Var, exc0 exc0Var) {
        if (exc0Var == null) {
            return;
        }
        try {
            x74Var.onResponse(sx3Var, exc0Var);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m173812c(final sx3 sx3Var, final x74 x74Var) {
        C22306c.fromCallable(new Callable() { // from class: l.ob20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return qb20.m173810a(sx3Var, x74Var);
            }
        }).compose(qjd0.m174993e(Schedulers.m221493io())).observeOn(Schedulers.m221493io()).subscribe(new e30() { // from class: l.pb20
            @Override // p149l.e30
            public final void call(Object obj) {
                qb20.m173811b(x74Var, sx3Var, (exc0) obj);
            }
        });
    }
}
