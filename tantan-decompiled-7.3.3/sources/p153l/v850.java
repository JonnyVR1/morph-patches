package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Objects;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public class v850 {

    /* JADX INFO: renamed from: a */
    public static jxd0 f182850a;

    /* JADX INFO: renamed from: b */
    public static jxd0 f182851b;

    static {
        Boolean bool = Boolean.FALSE;
        f182850a = new jxd0("test_obb_download_switch", bool);
        f182851b = new jxd0("mock_obb", bool);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m200288a(gcg0 gcg0Var) {
        try {
            String strM220780b = zop0.m220780b(App.f16088e, "parsingError");
            Objects.toString(Thread.currentThread());
            gcg0Var.onNext(Boolean.valueOf(TextUtils.equals(strM220780b, "googleplay")));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            e.getMessage();
            gcg0Var.onNext(Boolean.FALSE);
        } finally {
            gcg0Var.onCompleted();
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m200289b() {
        return f182851b.get().booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public static C22421c<Boolean> m200290c() {
        return C22421c.create(new C22421c.a() { // from class: l.u850
            @Override // p153l.y20
            public final void call(Object obj) {
                v850.m200288a((gcg0) obj);
            }
        });
    }
}
