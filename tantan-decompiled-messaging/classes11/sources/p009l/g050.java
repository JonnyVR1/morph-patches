package p009l;

import android.text.TextUtils;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Objects;
import l.hpd0;
import l.vfp0;
import l.z3g0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class g050 {

    /* JADX INFO: renamed from: a */
    public static hpd0 f13251a;

    /* JADX INFO: renamed from: b */
    public static hpd0 f13252b;

    static {
        Boolean bool = Boolean.FALSE;
        f13251a = new hpd0("test_obb_download_switch", bool);
        f13252b = new hpd0("mock_obb", bool);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14712a(z3g0 z3g0Var) {
        try {
            String strB = vfp0.b(App.e, "parsingError");
            Objects.toString(Thread.currentThread());
            z3g0Var.onNext(Boolean.valueOf(TextUtils.equals(strB, "googleplay")));
        } catch (Exception e) {
            CrashHelper.c(e);
            e.getMessage();
            z3g0Var.onNext(Boolean.FALSE);
        } finally {
            z3g0Var.onCompleted();
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m14713b() {
        return ((Boolean) f13252b.get()).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public static c<Boolean> m14714c() {
        return c.create(new c.a() { // from class: l.f050
            public final void call(Object obj) {
                g050.m14712a((z3g0) obj);
            }
        });
    }
}
