package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Objects;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class g050 {

    /* JADX INFO: renamed from: a */
    public static hpd0 f100022a;

    /* JADX INFO: renamed from: b */
    public static hpd0 f100023b;

    static {
        Boolean bool = Boolean.FALSE;
        f100022a = new hpd0("test_obb_download_switch", bool);
        f100023b = new hpd0("mock_obb", bool);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m123950a(z3g0 z3g0Var) {
        try {
            String strM198285b = vfp0.m198285b(App.f15369e, "parsingError");
            Objects.toString(Thread.currentThread());
            z3g0Var.onNext(Boolean.valueOf(TextUtils.equals(strM198285b, "googleplay")));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            e.getMessage();
            z3g0Var.onNext(Boolean.FALSE);
        } finally {
            z3g0Var.onCompleted();
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m123951b() {
        return f100023b.get().booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public static C22306c<Boolean> m123952c() {
        return C22306c.create(new C22306c.a() { // from class: l.f050
            @Override // p149l.e30
            public final void call(Object obj) {
                g050.m123950a((z3g0) obj);
            }
        });
    }
}
