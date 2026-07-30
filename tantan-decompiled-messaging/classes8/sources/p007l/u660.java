package p007l;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.p003p1.mobile.android.app.Act;
import com.p003p1.mobile.android.app.Frag;
import com.p003p1.mobile.android.statistic.AutoSpeedFrameLayout;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import l.f30;
import l.j760;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class u660 {

    /* JADX INFO: renamed from: a */
    public WeakHashMap<Fragment, C0725a> f4858a = new WeakHashMap<>();

    /* JADX INFO: renamed from: b */
    public WeakHashMap<Activity, Long> f4859b = new WeakHashMap<>();

    /* JADX INFO: renamed from: c */
    public WeakHashMap<AutoSpeedFrameLayout, C0725a> f4860c = new WeakHashMap<>();

    /* JADX INFO: renamed from: d */
    public boolean f4861d = true;

    /* JADX INFO: renamed from: e */
    public boolean f4862e = true;

    /* JADX INFO: renamed from: f */
    public int f4863f = 1000000;

    /* JADX INFO: renamed from: g */
    public List<f30<String, Long>> f4864g = new ArrayList();

    /* JADX INFO: renamed from: l.u660$a */
    public static class C0725a {

        /* JADX INFO: renamed from: a */
        public WeakReference<Fragment> f4865a;

        /* JADX INFO: renamed from: b */
        public long f4866b;

        /* JADX INFO: renamed from: c */
        public long f4867c = 0;

        public C0725a(WeakReference<Fragment> weakReference, long j) {
            this.f4865a = weakReference;
            this.f4866b = j;
        }
    }

    /* JADX INFO: renamed from: l.u660$b */
    public static class C0726b {

        /* JADX INFO: renamed from: a */
        public static final u660 f4868a = new u660();
    }

    /* JADX INFO: renamed from: e */
    public static u660 m11183e() {
        return C0726b.f4868a;
    }

    /* JADX INFO: renamed from: a */
    public View m11184a(Fragment fragment, View view) {
        if (!this.f4862e || !NullChecker.a(view)) {
            return view;
        }
        AutoSpeedFrameLayout autoSpeedFrameLayout = new AutoSpeedFrameLayout(view.getContext());
        if (view.getLayoutParams() != null) {
            autoSpeedFrameLayout.setLayoutParams(view.getLayoutParams());
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        autoSpeedFrameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        C0725a c0725a = this.f4858a.get(fragment);
        if (NullChecker.b(c0725a)) {
            this.f4860c.put(autoSpeedFrameLayout, c0725a);
        }
        return autoSpeedFrameLayout;
    }

    /* JADX INFO: renamed from: b */
    public void m11185b(Activity activity) {
        this.f4859b.put(activity, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    /* JADX INFO: renamed from: c */
    public void m11186c(Fragment fragment) {
        if (this.f4862e) {
            this.f4858a.put(fragment, new C0725a(new WeakReference(fragment), SystemClock.elapsedRealtime()));
        }
    }

    /* JADX INFO: renamed from: d */
    public void m11187d(Fragment fragment) {
        if (this.f4862e) {
            C0725a c0725a = this.f4858a.get(fragment);
            if (NullChecker.a(c0725a)) {
                c0725a.f4867c += SystemClock.elapsedRealtime() - c0725a.f4866b;
                c0725a.f4866b = SystemClock.elapsedRealtime();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m11188f(String str, long j) {
        if (j > this.f4863f) {
            Iterator<f30<String, Long>> it = this.f4864g.iterator();
            while (it.hasNext()) {
                it.next().call(str, Long.valueOf(j));
            }
        }
        if (this.f4861d) {
            zvf0.B("e_page_load_time", "", new j760[]{new j760("page", str), new j760("load_time", Long.valueOf(j))});
        }
    }

    /* JADX INFO: renamed from: g */
    public void m11189g(Fragment fragment) {
        if (this.f4862e) {
            C0725a c0725a = this.f4858a.get(fragment);
            if (NullChecker.a(c0725a)) {
                c0725a.f4866b = SystemClock.elapsedRealtime();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m11190h(AutoSpeedFrameLayout autoSpeedFrameLayout) {
        if (this.f4862e) {
            C0725a c0725a = this.f4860c.get(autoSpeedFrameLayout);
            if (NullChecker.a(c0725a)) {
                c0725a.f4866b = SystemClock.elapsedRealtime();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m11191i(boolean z) {
        this.f4862e = z;
    }

    /* JADX INFO: renamed from: j */
    public void m11192j(boolean z) {
        this.f4861d = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public void m11193k(Activity activity) {
        Long l2 = this.f4859b.get(activity);
        if (NullChecker.b(l2)) {
            m11188f(activity instanceof Act ? ((Act) activity).pageId() : activity.getClass().getSimpleName(), SystemClock.elapsedRealtime() - l2.longValue());
        }
    }

    /* JADX INFO: renamed from: l */
    public void m11194l(AutoSpeedFrameLayout autoSpeedFrameLayout) {
        if (this.f4862e) {
            C0725a c0725a = this.f4860c.get(autoSpeedFrameLayout);
            if (NullChecker.a(c0725a)) {
                long jElapsedRealtime = (SystemClock.elapsedRealtime() - c0725a.f4866b) + c0725a.f4867c;
                Fragment fragment = (Fragment) c0725a.f4865a.get();
                if (NullChecker.a(fragment)) {
                    m11188f(fragment instanceof Frag ? ((Frag) fragment).pageId() : fragment.getClass().getSimpleName(), jElapsedRealtime);
                }
            }
        }
    }
}
