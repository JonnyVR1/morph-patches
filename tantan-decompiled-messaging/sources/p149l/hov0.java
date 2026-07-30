package p149l;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class hov0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f108863a;

    /* JADX INFO: renamed from: b */
    public final Context f108864b;

    /* JADX INFO: renamed from: c */
    public final o2s0 f108865c;

    public hov0(o2s0 o2s0Var, rmw0 rmw0Var, Context context) {
        this.f108865c = o2s0Var;
        this.f108863a = rmw0Var;
        this.f108864b = context;
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 45;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return this.f108863a.mo122102R(new Callable() { // from class: l.gov0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new iov0(new JSONObject());
            }
        });
    }
}
