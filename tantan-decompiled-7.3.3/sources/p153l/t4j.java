package p153l;

import android.text.TextUtils;
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public class t4j {

    /* JADX INFO: renamed from: e */
    public static t4j f172082e;

    /* JADX INFO: renamed from: b */
    public boolean f172084b;

    /* JADX INFO: renamed from: a */
    public final Map<TabName, Runnable> f172083a = new HashMap();

    /* JADX INFO: renamed from: c */
    public final wyd0 f172085c = new wyd0("frag_initial_step", Lifecycle.State.STARTED.toString());

    /* JADX INFO: renamed from: d */
    public final Runnable f172086d = new s4j(this);

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m189278a(Act act, TabName tabName, Function1 function1) {
        FragmentManager fragmentManager = act.fragmentManager();
        if (fragmentManager.m2558i0(tabName.toString()) == null) {
            Fragment fragment = (Fragment) function1.invoke(tabName);
            if (NullChecker.m82486a(fragment)) {
                AbstractC0428k abstractC0428kM2568m = fragmentManager.m2568m();
                abstractC0428kM2568m.m2805c(adc0.f69809A4, fragment, tabName.toString());
                String str = m189279d().f172085c.get();
                if (TextUtils.isEmpty(str)) {
                    abstractC0428kM2568m.mo2717w(fragment, Lifecycle.State.STARTED);
                } else {
                    abstractC0428kM2568m.mo2717w(fragment, Lifecycle.State.valueOf(str));
                }
                abstractC0428kM2568m.mo2714p(fragment);
                abstractC0428kM2568m.mo2709j();
                fragmentManager.m2546e0();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static t4j m189279d() {
        if (f172082e == null) {
            synchronized (t4j.class) {
                try {
                    if (f172082e == null) {
                        f172082e = new t4j();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f172082e;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m189280f() {
        return d79.m114658Q();
    }

    /* JADX INFO: renamed from: g */
    public static void m189281g(String str) {
        tu2.m192703a("[core][boot_up]", str);
    }

    /* JADX INFO: renamed from: h */
    public static void m189282h(String str) {
        tu2.m192703a(BifrostLayout.f24062c, str);
    }

    /* JADX INFO: renamed from: j */
    public static void m189283j() {
        if (NullChecker.m82486a(f172082e)) {
            if (!f172082e.f172083a.isEmpty()) {
                Iterator<Runnable> it = f172082e.f172083a.values().iterator();
                while (it.hasNext()) {
                    l51.m152890J(it.next());
                }
            }
            l51.m152890J(f172082e.f172086d);
            f172082e.f172083a.clear();
            f172082e = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m189284b(final Act act, final TabName tabName, final Function1<TabName, Fragment> function1) {
        this.f172083a.put(tabName, new Runnable() { // from class: l.r4j
            @Override // java.lang.Runnable
            public final void run() {
                t4j.m189278a(act, tabName, function1);
            }
        });
        if (tabName == TabName.Card) {
            l51.m152887G(new s4j(this));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m189285c(Act act) {
        l51.m152888H(act, this.f172086d, 4000L);
    }

    /* JADX INFO: renamed from: e */
    public boolean m189286e() {
        return this.f172084b;
    }

    /* JADX INFO: renamed from: i */
    public void m189287i() {
        if (this.f172084b) {
            return;
        }
        if (!this.f172083a.isEmpty()) {
            Iterator<Runnable> it = this.f172083a.values().iterator();
            while (it.hasNext()) {
                l51.m152887G(it.next());
            }
            this.f172084b = true;
        }
        l51.m152890J(this.f172086d);
    }

    /* JADX INFO: renamed from: k */
    public boolean m189288k(TabName tabName) {
        Runnable runnable = this.f172083a.get(tabName);
        if (NullChecker.m82486a(runnable)) {
            l51.m152890J(runnable);
            if (this.f172083a.remove(tabName) != null) {
                return true;
            }
        }
        return false;
    }
}
