package p003l;

import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import l.e51;
import l.mqi0;
import l.xh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class c30 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5836a(Act act) {
        if (NullChecker.a(act) && m5841f(act)) {
            act.finish();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m5837b(final Act act) {
        e51.M(new Runnable() { // from class: l.b30
            @Override // java.lang.Runnable
            public final void run() {
                c30.m5836a(act);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static String m5838c() {
        long jO = mqi0.o();
        Date date = new Date();
        date.setTime(jO);
        return mqi0.d.format(date);
    }

    /* JADX INFO: renamed from: d */
    public static Act m5839d() {
        Act.r rVarForeground_ = Act.foreground_();
        if (NullChecker.a(rVarForeground_) && NullChecker.a(rVarForeground_.a) && NullChecker.a(rVarForeground_.a.get()) && (rVarForeground_.a.get() instanceof Act)) {
            return (Act) rVarForeground_.a.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static String m5840e() {
        Act actM5839d = m5839d();
        return actM5839d != null ? actM5839d.pageId() : "";
    }

    /* JADX INFO: renamed from: f */
    public static boolean m5841f(Act act) {
        return (!NullChecker.a(act) || act.isDestroyed() || act.isFinishing()) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public static void m5842g() {
        String strM5838c = m5838c();
        if (TextUtils.equals((CharSequence) CoreModule.c.e0.E3.get(), strM5838c) || m5839d() == null) {
            return;
        }
        xh0.a aVar = new xh0.a(m5839d());
        aVar.h(false);
        aVar.j("当日配对已达上限").r("知道了").a().g();
        CoreModule.c.e0.E3.put(strM5838c);
    }
}
