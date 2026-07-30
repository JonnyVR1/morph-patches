package p149l;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class snv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final Context f165514a;

    /* JADX INFO: renamed from: b */
    public final String f165515b;

    /* JADX INFO: renamed from: c */
    public final rmw0 f165516c;

    public snv0(@Nullable lvs0 lvs0Var, Context context, String str, rmw0 rmw0Var) {
        this.f165514a = context;
        this.f165515b = str;
        this.f165516c = rmw0Var;
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 42;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return this.f165516c.mo122102R(new Callable() { // from class: l.rnv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new tnv0(new JSONObject());
            }
        });
    }
}
