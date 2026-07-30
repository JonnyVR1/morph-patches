package p153l;

import Sudif.Sudtry;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class jwg0 {

    /* JADX INFO: renamed from: i */
    public static volatile jwg0 f122918i;

    /* JADX INFO: renamed from: a */
    public final ieg0 f122919a;

    /* JADX INFO: renamed from: b */
    public final d0h0 f122920b;

    /* JADX INFO: renamed from: c */
    public final agg0 f122921c;

    /* JADX INFO: renamed from: d */
    public final pog0 f122922d;

    /* JADX INFO: renamed from: e */
    public final zqg0 f122923e;

    /* JADX INFO: renamed from: f */
    public final qhg0 f122924f;

    /* JADX INFO: renamed from: g */
    public final nmg0 f122925g;

    /* JADX INFO: renamed from: h */
    public final Context f122926h;

    /* JADX WARN: Multi-variable type inference failed */
    public jwg0(Context context, ieg0 ieg0Var, d0h0 d0h0Var, agg0 agg0Var, pog0 pog0Var, zqg0 zqg0Var, qhg0 qhg0Var, nmg0 nmg0Var) {
        this.f122926h = context;
        this.f122919a = ieg0Var;
        this.f122920b = d0h0Var;
        this.f122921c = agg0Var;
        this.f122922d = pog0Var;
        this.f122923e = zqg0Var;
        this.f122924f = qhg0Var;
        this.f122925g = nmg0Var;
        try {
            agg0Var = (ehg0) agg0.class.getMethod("createRemitSelf", null).invoke(agg0Var, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        Objects.toString(agg0Var);
        ieg0Var.f114586i = agg0Var;
    }

    /* JADX INFO: renamed from: a */
    public static jwg0 m147162a() {
        if (f122918i == null) {
            synchronized (jwg0.class) {
                try {
                    if (f122918i == null) {
                        Context context = Sudtry.f211030Suddo;
                        if (context == null) {
                            throw new IllegalStateException("context == null");
                        }
                        Context applicationContext = context.getApplicationContext();
                        ieg0 ieg0Var = new ieg0();
                        d0h0 d0h0Var = new d0h0();
                        agg0 agg0Var = new agg0(applicationContext);
                        pog0 pog0Var = new pog0();
                        jwg0 jwg0Var = new jwg0(applicationContext, ieg0Var, d0h0Var, agg0Var, pog0Var, new zqg0(), new qhg0(), new nmg0());
                        Objects.toString(agg0Var);
                        Objects.toString(pog0Var);
                        f122918i = jwg0Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f122918i;
    }
}
