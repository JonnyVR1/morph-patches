package p153l;

import android.content.Context;
import com.facebook.drawee.view.SimpleDraweeView;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class f9j {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f97886a = f9j.class;

    /* JADX INFO: renamed from: b */
    public static mq70 f97887b = null;

    /* JADX INFO: renamed from: c */
    public static volatile boolean f97888c = false;

    /* JADX INFO: renamed from: a */
    public static rjm m124659a() {
        return m124660b().m201540k();
    }

    /* JADX INFO: renamed from: b */
    public static vjm m124660b() {
        return vjm.m201527m();
    }

    /* JADX INFO: renamed from: c */
    public static void m124661c(Context context, sjm sjmVar) {
        m124662d(context, sjmVar, null);
    }

    /* JADX INFO: renamed from: d */
    public static void m124662d(Context context, sjm sjmVar, kde kdeVar) {
        m124663e(context, sjmVar, kdeVar, true);
    }

    /* JADX INFO: renamed from: e */
    public static void m124663e(Context context, sjm sjmVar, kde kdeVar, boolean z) {
        if (i9j.m139099d()) {
            i9j.m139097a("Fresco#initialize");
        }
        if (f97888c) {
            huf.m137193u(f97886a, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        } else {
            f97888c = true;
        }
        ie20.m139589b(z);
        if (!re20.m180962c()) {
            if (i9j.m139099d()) {
                i9j.m139097a("Fresco.initialize->SoLoader.init");
            }
            try {
                Class.forName("com.facebook.imagepipeline.nativecode.NativeCodeInitializer").getMethod("init", Context.class).invoke(null, context);
            } catch (IllegalAccessException unused) {
                re20.m180961b(new eph0());
            } catch (InvocationTargetException unused2) {
                re20.m180961b(new eph0());
            } catch (ClassNotFoundException unused3) {
                re20.m180961b(new eph0());
            } catch (NoSuchMethodException unused4) {
                re20.m180961b(new eph0());
            } finally {
                if (i9j.m139099d()) {
                    i9j.m139098b();
                }
            }
        }
        Context applicationContext = context.getApplicationContext();
        if (sjmVar == null) {
            vjm.m201528r(applicationContext);
        } else {
            vjm.m201529s(sjmVar);
        }
        m124664f(applicationContext, kdeVar);
        if (i9j.m139099d()) {
            i9j.m139098b();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m124664f(Context context, kde kdeVar) {
        if (i9j.m139099d()) {
            i9j.m139097a("Fresco.initializeDrawee");
        }
        mq70 mq70Var = new mq70(context, kdeVar);
        f97887b = mq70Var;
        SimpleDraweeView.m8342j(mq70Var);
        if (i9j.m139099d()) {
            i9j.m139098b();
        }
    }

    /* JADX INFO: renamed from: g */
    public static lq70 m124665g() {
        return f97887b.get();
    }
}
