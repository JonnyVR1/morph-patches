package p149l;

import android.content.Context;
import com.facebook.drawee.view.SimpleDraweeView;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class l6j {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f126645a = l6j.class;

    /* JADX INFO: renamed from: b */
    public static gi70 f126646b = null;

    /* JADX INFO: renamed from: c */
    public static volatile boolean f126647c = false;

    /* JADX INFO: renamed from: a */
    public static ohm m148744a() {
        return m148745b().m184255k();
    }

    /* JADX INFO: renamed from: b */
    public static shm m148745b() {
        return shm.m184242m();
    }

    /* JADX INFO: renamed from: c */
    public static void m148746c(Context context, phm phmVar) {
        m148747d(context, phmVar, null);
    }

    /* JADX INFO: renamed from: d */
    public static void m148747d(Context context, phm phmVar, gce gceVar) {
        m148748e(context, phmVar, gceVar, true);
    }

    /* JADX INFO: renamed from: e */
    public static void m148748e(Context context, phm phmVar, gce gceVar, boolean z) {
        if (o6j.m162852d()) {
            o6j.m162850a("Fresco#initialize");
        }
        if (f126647c) {
            tsf.m190555u(f126645a, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        } else {
            f126647c = true;
        }
        a620.m95108b(z);
        if (!j620.m139878c()) {
            if (o6j.m162852d()) {
                o6j.m162850a("Fresco.initialize->SoLoader.init");
            }
            try {
                Class.forName("com.facebook.imagepipeline.nativecode.NativeCodeInitializer").getMethod("init", Context.class).invoke(null, context);
            } catch (IllegalAccessException unused) {
                j620.m139877b(new xgh0());
            } catch (InvocationTargetException unused2) {
                j620.m139877b(new xgh0());
            } catch (ClassNotFoundException unused3) {
                j620.m139877b(new xgh0());
            } catch (NoSuchMethodException unused4) {
                j620.m139877b(new xgh0());
            } finally {
                if (o6j.m162852d()) {
                    o6j.m162851b();
                }
            }
        }
        Context applicationContext = context.getApplicationContext();
        if (phmVar == null) {
            shm.m184243r(applicationContext);
        } else {
            shm.m184244s(phmVar);
        }
        m148749f(applicationContext, gceVar);
        if (o6j.m162852d()) {
            o6j.m162851b();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m148749f(Context context, gce gceVar) {
        if (o6j.m162852d()) {
            o6j.m162850a("Fresco.initializeDrawee");
        }
        gi70 gi70Var = new gi70(context, gceVar);
        f126646b = gi70Var;
        SimpleDraweeView.m8288j(gi70Var);
        if (o6j.m162852d()) {
            o6j.m162851b();
        }
    }

    /* JADX INFO: renamed from: g */
    public static fi70 m148750g() {
        return f126646b.get();
    }
}
