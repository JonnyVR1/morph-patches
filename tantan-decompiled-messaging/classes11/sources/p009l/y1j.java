package p009l;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import androidx.lifecycle.Lifecycle;
import com.p000p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import l.du2;
import l.e51;
import l.u4c0;
import l.u59;
import l.uqd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class y1j {

    /* JADX INFO: renamed from: e */
    public static y1j f22855e;

    /* JADX INFO: renamed from: b */
    public boolean f22857b;

    /* JADX INFO: renamed from: a */
    public final Map<TabName, Runnable> f22856a = new HashMap();

    /* JADX INFO: renamed from: c */
    public final uqd0 f22858c = new uqd0("frag_initial_step", Lifecycle.State.STARTED.toString());

    /* JADX INFO: renamed from: d */
    public final Runnable f22859d = new x1j(this);

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m25167a(Act act, TabName tabName, Function1 function1) {
        FragmentManager fragmentManager = act.fragmentManager();
        if (fragmentManager.i0(tabName.toString()) == null) {
            Fragment fragment = (Fragment) function1.invoke(tabName);
            if (NullChecker.a(fragment)) {
                k kVarM = fragmentManager.m();
                kVarM.c(u4c0.y4, fragment, tabName.toString());
                String str = (String) m25168d().f22858c.get();
                if (TextUtils.isEmpty(str)) {
                    kVarM.w(fragment, Lifecycle.State.STARTED);
                } else {
                    kVarM.w(fragment, Lifecycle.State.valueOf(str));
                }
                kVarM.p(fragment);
                kVarM.j();
                fragmentManager.e0();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static y1j m25168d() {
        if (f22855e == null) {
            synchronized (y1j.class) {
                try {
                    if (f22855e == null) {
                        f22855e = new y1j();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f22855e;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m25169f() {
        return u59.P();
    }

    /* JADX INFO: renamed from: g */
    public static void m25170g(String str) {
        du2.a("[core][boot_up]", str);
    }

    /* JADX INFO: renamed from: h */
    public static void m25171h(String str) {
        du2.a(BifrostLayout.f2098c, str);
    }

    /* JADX INFO: renamed from: j */
    public static void m25172j() {
        if (NullChecker.a(f22855e)) {
            if (!f22855e.f22856a.isEmpty()) {
                Iterator<Runnable> it = f22855e.f22856a.values().iterator();
                while (it.hasNext()) {
                    e51.J(it.next());
                }
            }
            e51.J(f22855e.f22859d);
            f22855e.f22856a.clear();
            f22855e = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m25173b(final Act act, final TabName tabName, final Function1<TabName, Fragment> function1) {
        this.f22856a.put(tabName, new Runnable() { // from class: l.w1j
            @Override // java.lang.Runnable
            public final void run() {
                y1j.m25167a(act, tabName, function1);
            }
        });
        if (tabName == TabName.Card) {
            e51.G(new x1j(this));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m25174c(Act act) {
        e51.H(act, this.f22859d, 4000L);
    }

    /* JADX INFO: renamed from: e */
    public boolean m25175e() {
        return this.f22857b;
    }

    /* JADX INFO: renamed from: i */
    public void m25176i() {
        if (this.f22857b) {
            return;
        }
        if (!this.f22856a.isEmpty()) {
            Iterator<Runnable> it = this.f22856a.values().iterator();
            while (it.hasNext()) {
                e51.G(it.next());
            }
            this.f22857b = true;
        }
        e51.J(this.f22859d);
    }

    /* JADX INFO: renamed from: k */
    public boolean m25177k(TabName tabName) {
        Runnable runnable = this.f22856a.get(tabName);
        if (NullChecker.a(runnable)) {
            e51.J(runnable);
            if (this.f22856a.remove(tabName) != null) {
                return true;
            }
        }
        return false;
    }
}
