package p153l;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ywv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final Context f201872a;

    /* JADX INFO: renamed from: b */
    public final String f201873b;

    /* JADX INFO: renamed from: c */
    public final xvw0 f201874c;

    public ywv0(@Nullable r4t0 r4t0Var, Context context, String str, xvw0 xvw0Var) {
        this.f201872a = context;
        this.f201873b = str;
        this.f201874c = xvw0Var;
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 42;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return this.f201874c.mo155969R(new Callable() { // from class: l.xwv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zwv0(new JSONObject());
            }
        });
    }
}
