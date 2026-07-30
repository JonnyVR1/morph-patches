package p149l;

import android.text.TextUtils;
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public class y1j {

    /* JADX INFO: renamed from: e */
    public static y1j f195415e;

    /* JADX INFO: renamed from: b */
    public boolean f195417b;

    /* JADX INFO: renamed from: a */
    public final Map<TabName, Runnable> f195416a = new HashMap();

    /* JADX INFO: renamed from: c */
    public final uqd0 f195418c = new uqd0("frag_initial_step", Lifecycle.State.STARTED.toString());

    /* JADX INFO: renamed from: d */
    public final Runnable f195419d = new x1j(this);

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m212195a(Act act, TabName tabName, Function1 function1) {
        FragmentManager fragmentManager = act.fragmentManager();
        if (fragmentManager.m2557i0(tabName.toString()) == null) {
            Fragment fragment = (Fragment) function1.invoke(tabName);
            if (NullChecker.m81303a(fragment)) {
                AbstractC0427k abstractC0427kM2567m = fragmentManager.m2567m();
                abstractC0427kM2567m.m2804c(u4c0.f174563y4, fragment, tabName.toString());
                String str = m212196d().f195418c.get();
                if (TextUtils.isEmpty(str)) {
                    abstractC0427kM2567m.mo2716w(fragment, Lifecycle.State.STARTED);
                } else {
                    abstractC0427kM2567m.mo2716w(fragment, Lifecycle.State.valueOf(str));
                }
                abstractC0427kM2567m.mo2713p(fragment);
                abstractC0427kM2567m.mo2708j();
                fragmentManager.m2545e0();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static y1j m212196d() {
        if (f195415e == null) {
            synchronized (y1j.class) {
                try {
                    if (f195415e == null) {
                        f195415e = new y1j();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f195415e;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m212197f() {
        return u59.m191807P();
    }

    /* JADX INFO: renamed from: g */
    public static void m212198g(String str) {
        du2.m113670a("[core][boot_up]", str);
    }

    /* JADX INFO: renamed from: h */
    public static void m212199h(String str) {
        du2.m113670a(BifrostLayout.f23320c, str);
    }

    /* JADX INFO: renamed from: j */
    public static void m212200j() {
        if (NullChecker.m81303a(f195415e)) {
            if (!f195415e.f195416a.isEmpty()) {
                Iterator<Runnable> it = f195415e.f195416a.values().iterator();
                while (it.hasNext()) {
                    e51.m114745J(it.next());
                }
            }
            e51.m114745J(f195415e.f195419d);
            f195415e.f195416a.clear();
            f195415e = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m212201b(final Act act, final TabName tabName, final Function1<TabName, Fragment> function1) {
        this.f195416a.put(tabName, new Runnable() { // from class: l.w1j
            @Override // java.lang.Runnable
            public final void run() {
                y1j.m212195a(act, tabName, function1);
            }
        });
        if (tabName == TabName.Card) {
            e51.m114742G(new x1j(this));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m212202c(Act act) {
        e51.m114743H(act, this.f195419d, 4000L);
    }

    /* JADX INFO: renamed from: e */
    public boolean m212203e() {
        return this.f195417b;
    }

    /* JADX INFO: renamed from: i */
    public void m212204i() {
        if (this.f195417b) {
            return;
        }
        if (!this.f195416a.isEmpty()) {
            Iterator<Runnable> it = this.f195416a.values().iterator();
            while (it.hasNext()) {
                e51.m114742G(it.next());
            }
            this.f195417b = true;
        }
        e51.m114745J(this.f195419d);
    }

    /* JADX INFO: renamed from: k */
    public boolean m212205k(TabName tabName) {
        Runnable runnable = this.f195416a.get(tabName);
        if (NullChecker.m81303a(runnable)) {
            e51.m114745J(runnable);
            if (this.f195416a.remove(tabName) != null) {
                return true;
            }
        }
        return false;
    }
}
