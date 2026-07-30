package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;

/* JADX INFO: loaded from: classes10.dex */
public class c30 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m104959a(Act act) {
        if (NullChecker.m81303a(act) && m104964f(act)) {
            act.m50458m2();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m104960b(final Act act) {
        e51.m114748M(new Runnable() { // from class: l.b30
            @Override // java.lang.Runnable
            public final void run() {
                c30.m104959a(act);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static String m104961c() {
        long jM155944o = mqi0.m155944o();
        Date date = new Date();
        date.setTime(jM155944o);
        return mqi0.f135252d.format(date);
    }

    /* JADX INFO: renamed from: d */
    public static Act m104962d() {
        Act.C4299r c4299rForeground_ = Act.foreground_();
        if (NullChecker.m81303a(c4299rForeground_) && NullChecker.m81303a(c4299rForeground_.f15343a) && NullChecker.m81303a(c4299rForeground_.f15343a.get()) && (c4299rForeground_.f15343a.get() instanceof Act)) {
            return (Act) c4299rForeground_.f15343a.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static String m104963e() {
        Act actM104962d = m104962d();
        return actM104962d != null ? actM104962d.pageId() : "";
    }

    /* JADX INFO: renamed from: f */
    public static boolean m104964f(Act act) {
        return (!NullChecker.m81303a(act) || act.isDestroyed() || act.isFinishing()) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public static void m104965g() {
        String strM104961c = m104961c();
        if (TextUtils.equals(CoreModule.f17545c.f19639e0.f149165E3.get(), strM104961c) || m104962d() == null) {
            return;
        }
        xh0.C21150a c21150a = new xh0.C21150a(m104962d());
        c21150a.m208729h(false);
        c21150a.m208731j("当日配对已达上限").m208739r("知道了").m208722a().m208721g();
        CoreModule.f17545c.f19639e0.f149165E3.put(strM104961c);
    }
}
