package p153l;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class nxv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f144258a;

    /* JADX INFO: renamed from: b */
    public final Context f144259b;

    /* JADX INFO: renamed from: c */
    public final ubs0 f144260c;

    public nxv0(ubs0 ubs0Var, xvw0 xvw0Var, Context context) {
        this.f144260c = ubs0Var;
        this.f144258a = xvw0Var;
        this.f144259b = context;
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 45;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return this.f144258a.mo155969R(new Callable() { // from class: l.mxv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new oxv0(new JSONObject());
            }
        });
    }
}
