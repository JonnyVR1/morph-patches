package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;

/* JADX INFO: loaded from: classes12.dex */
public class w20 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m204486a(Act act) {
        if (NullChecker.m82486a(act) && m204491f(act)) {
            act.m48999H2();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m204487b(final Act act) {
        l51.m152893M(new Runnable() { // from class: l.v20
            @Override // java.lang.Runnable
            public final void run() {
                w20.m204486a(act);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static String m204488c() {
        long jM174454o = pzi0.m174454o();
        Date date = new Date();
        date.setTime(jM174454o);
        return pzi0.f154857d.format(date);
    }

    /* JADX INFO: renamed from: d */
    public static Act m204489d() {
        Act.C4450r c4450rForeground_ = Act.foreground_();
        if (NullChecker.m82486a(c4450rForeground_) && NullChecker.m82486a(c4450rForeground_.f16062a) && NullChecker.m82486a(c4450rForeground_.f16062a.get()) && (c4450rForeground_.f16062a.get() instanceof Act)) {
            return (Act) c4450rForeground_.f16062a.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static String m204490e() {
        Act actM204489d = m204489d();
        return actM204489d != null ? actM204489d.pageId() : "";
    }

    /* JADX INFO: renamed from: f */
    public static boolean m204491f(Act act) {
        return (!NullChecker.m82486a(act) || act.isDestroyed() || act.isFinishing()) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public static void m204492g() {
        String strM204488c = m204488c();
        if (TextUtils.equals(CoreModule.f18264c.f20381e0.f89022E3.get(), strM204488c) || m204489d() == null) {
            return;
        }
        th0.C20312a c20312a = new th0.C20312a(m204489d());
        c20312a.m191149h(false);
        c20312a.m191151j("当日配对已达上限").m191159r("知道了").m191142a().m191141g();
        CoreModule.f18264c.f20381e0.f89022E3.put(strM204488c);
    }
}
