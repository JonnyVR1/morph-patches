package p149l;

import Sudif.Sudtry;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class bog0 {

    /* JADX INFO: renamed from: i */
    public static volatile bog0 f76514i;

    /* JADX INFO: renamed from: a */
    public final a6g0 f76515a;

    /* JADX INFO: renamed from: b */
    public final vrg0 f76516b;

    /* JADX INFO: renamed from: c */
    public final s7g0 f76517c;

    /* JADX INFO: renamed from: d */
    public final hgg0 f76518d;

    /* JADX INFO: renamed from: e */
    public final rig0 f76519e;

    /* JADX INFO: renamed from: f */
    public final i9g0 f76520f;

    /* JADX INFO: renamed from: g */
    public final feg0 f76521g;

    /* JADX INFO: renamed from: h */
    public final Context f76522h;

    /* JADX WARN: Multi-variable type inference failed */
    public bog0(Context context, a6g0 a6g0Var, vrg0 vrg0Var, s7g0 s7g0Var, hgg0 hgg0Var, rig0 rig0Var, i9g0 i9g0Var, feg0 feg0Var) {
        this.f76522h = context;
        this.f76515a = a6g0Var;
        this.f76516b = vrg0Var;
        this.f76517c = s7g0Var;
        this.f76518d = hgg0Var;
        this.f76519e = rig0Var;
        this.f76520f = i9g0Var;
        this.f76521g = feg0Var;
        try {
            s7g0Var = (w8g0) s7g0.class.getMethod("createRemitSelf", null).invoke(s7g0Var, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        Objects.toString(s7g0Var);
        a6g0Var.f67767i = s7g0Var;
    }

    /* JADX INFO: renamed from: a */
    public static bog0 m102944a() {
        if (f76514i == null) {
            synchronized (bog0.class) {
                try {
                    if (f76514i == null) {
                        Context context = Sudtry.f210108Suddo;
                        if (context == null) {
                            throw new IllegalStateException("context == null");
                        }
                        Context applicationContext = context.getApplicationContext();
                        a6g0 a6g0Var = new a6g0();
                        vrg0 vrg0Var = new vrg0();
                        s7g0 s7g0Var = new s7g0(applicationContext);
                        hgg0 hgg0Var = new hgg0();
                        bog0 bog0Var = new bog0(applicationContext, a6g0Var, vrg0Var, s7g0Var, hgg0Var, new rig0(), new i9g0(), new feg0());
                        Objects.toString(s7g0Var);
                        Objects.toString(hgg0Var);
                        f76514i = bog0Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f76514i;
    }
}
