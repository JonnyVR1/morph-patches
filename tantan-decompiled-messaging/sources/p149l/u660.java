package p149l;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.PlaybackException;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.android.statistic.AutoSpeedFrameLayout;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes8.dex */
public class u660 {

    /* JADX INFO: renamed from: a */
    public WeakHashMap<Fragment, C20363a> f174798a = new WeakHashMap<>();

    /* JADX INFO: renamed from: b */
    public WeakHashMap<Activity, Long> f174799b = new WeakHashMap<>();

    /* JADX INFO: renamed from: c */
    public WeakHashMap<AutoSpeedFrameLayout, C20363a> f174800c = new WeakHashMap<>();

    /* JADX INFO: renamed from: d */
    public boolean f174801d = true;

    /* JADX INFO: renamed from: e */
    public boolean f174802e = true;

    /* JADX INFO: renamed from: f */
    public int f174803f = PlaybackException.CUSTOM_ERROR_CODE_BASE;

    /* JADX INFO: renamed from: g */
    public List<f30<String, Long>> f174804g = new ArrayList();

    /* JADX INFO: renamed from: l.u660$a */
    public static class C20363a {

        /* JADX INFO: renamed from: a */
        public WeakReference<Fragment> f174805a;

        /* JADX INFO: renamed from: b */
        public long f174806b;

        /* JADX INFO: renamed from: c */
        public long f174807c = 0;

        public C20363a(WeakReference<Fragment> weakReference, long j) {
            this.f174805a = weakReference;
            this.f174806b = j;
        }
    }

    /* JADX INFO: renamed from: l.u660$b */
    public static class C20364b {

        /* JADX INFO: renamed from: a */
        public static final u660 f174808a = new u660();
    }

    /* JADX INFO: renamed from: e */
    public static u660 m191956e() {
        return C20364b.f174808a;
    }

    /* JADX INFO: renamed from: a */
    public View m191957a(Fragment fragment, View view) {
        if (!this.f174802e || !NullChecker.m81303a(view)) {
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
        C20363a c20363a = this.f174798a.get(fragment);
        if (NullChecker.m81304b(c20363a)) {
            this.f174800c.put(autoSpeedFrameLayout, c20363a);
        }
        return autoSpeedFrameLayout;
    }

    /* JADX INFO: renamed from: b */
    public void m191958b(Activity activity) {
        this.f174799b.put(activity, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    /* JADX INFO: renamed from: c */
    public void m191959c(Fragment fragment) {
        if (this.f174802e) {
            this.f174798a.put(fragment, new C20363a(new WeakReference(fragment), SystemClock.elapsedRealtime()));
        }
    }

    /* JADX INFO: renamed from: d */
    public void m191960d(Fragment fragment) {
        if (this.f174802e) {
            C20363a c20363a = this.f174798a.get(fragment);
            if (NullChecker.m81303a(c20363a)) {
                c20363a.f174807c += SystemClock.elapsedRealtime() - c20363a.f174806b;
                c20363a.f174806b = SystemClock.elapsedRealtime();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m191961f(String str, long j) {
        if (j > this.f174803f) {
            Iterator<f30<String, Long>> it = this.f174804g.iterator();
            while (it.hasNext()) {
                it.next().call(str, Long.valueOf(j));
            }
        }
        if (this.f174801d) {
            zvf0.m220369B("e_page_load_time", "", new j760(OMSTemplateModeType.page, str), new j760("load_time", Long.valueOf(j)));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m191962g(Fragment fragment) {
        if (this.f174802e) {
            C20363a c20363a = this.f174798a.get(fragment);
            if (NullChecker.m81303a(c20363a)) {
                c20363a.f174806b = SystemClock.elapsedRealtime();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m191963h(AutoSpeedFrameLayout autoSpeedFrameLayout) {
        if (this.f174802e) {
            C20363a c20363a = this.f174800c.get(autoSpeedFrameLayout);
            if (NullChecker.m81303a(c20363a)) {
                c20363a.f174806b = SystemClock.elapsedRealtime();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m191964i(boolean z) {
        this.f174802e = z;
    }

    /* JADX INFO: renamed from: j */
    public void m191965j(boolean z) {
        this.f174801d = z;
    }

    /* JADX INFO: renamed from: k */
    public void m191966k(Activity activity) {
        Long l2 = this.f174799b.get(activity);
        if (NullChecker.m81304b(l2)) {
            m191961f(activity instanceof Act ? ((Act) activity).pageId() : activity.getClass().getSimpleName(), SystemClock.elapsedRealtime() - l2.longValue());
        }
    }

    /* JADX INFO: renamed from: l */
    public void m191967l(AutoSpeedFrameLayout autoSpeedFrameLayout) {
        if (this.f174802e) {
            C20363a c20363a = this.f174800c.get(autoSpeedFrameLayout);
            if (NullChecker.m81303a(c20363a)) {
                long jElapsedRealtime = (SystemClock.elapsedRealtime() - c20363a.f174806b) + c20363a.f174807c;
                Fragment fragment = (Fragment) c20363a.f174805a.get();
                if (NullChecker.m81303a(fragment)) {
                    m191961f(fragment instanceof Frag ? ((Frag) fragment).pageId() : fragment.getClass().getSimpleName(), jElapsedRealtime);
                }
            }
        }
    }
}
