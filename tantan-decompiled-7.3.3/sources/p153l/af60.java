package p153l;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.PlaybackException;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.android.statistic.AutoSpeedFrameLayout;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes8.dex */
public class af60 {

    /* JADX INFO: renamed from: a */
    public WeakHashMap<Fragment, C15696a> f70867a = new WeakHashMap<>();

    /* JADX INFO: renamed from: b */
    public WeakHashMap<Activity, Long> f70868b = new WeakHashMap<>();

    /* JADX INFO: renamed from: c */
    public WeakHashMap<AutoSpeedFrameLayout, C15696a> f70869c = new WeakHashMap<>();

    /* JADX INFO: renamed from: d */
    public boolean f70870d = true;

    /* JADX INFO: renamed from: e */
    public boolean f70871e = true;

    /* JADX INFO: renamed from: f */
    public int f70872f = PlaybackException.CUSTOM_ERROR_CODE_BASE;

    /* JADX INFO: renamed from: g */
    public List<z20<String, Long>> f70873g = new ArrayList();

    /* JADX INFO: renamed from: l.af60$a */
    public static class C15696a {

        /* JADX INFO: renamed from: a */
        public WeakReference<Fragment> f70874a;

        /* JADX INFO: renamed from: b */
        public long f70875b;

        /* JADX INFO: renamed from: c */
        public long f70876c = 0;

        public C15696a(WeakReference<Fragment> weakReference, long j) {
            this.f70874a = weakReference;
            this.f70875b = j;
        }
    }

    /* JADX INFO: renamed from: l.af60$b */
    public static class C15697b {

        /* JADX INFO: renamed from: a */
        public static final af60 f70877a = new af60();
    }

    /* JADX INFO: renamed from: e */
    public static af60 m97310e() {
        return C15697b.f70877a;
    }

    /* JADX INFO: renamed from: a */
    public View m97311a(Fragment fragment, View view) {
        if (!this.f70871e || !NullChecker.m82486a(view)) {
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
        C15696a c15696a = this.f70867a.get(fragment);
        if (NullChecker.m82487b(c15696a)) {
            this.f70869c.put(autoSpeedFrameLayout, c15696a);
        }
        return autoSpeedFrameLayout;
    }

    /* JADX INFO: renamed from: b */
    public void m97312b(Activity activity) {
        this.f70868b.put(activity, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    /* JADX INFO: renamed from: c */
    public void m97313c(Fragment fragment) {
        if (this.f70871e) {
            this.f70867a.put(fragment, new C15696a(new WeakReference(fragment), SystemClock.elapsedRealtime()));
        }
    }

    /* JADX INFO: renamed from: d */
    public void m97314d(Fragment fragment) {
        if (this.f70871e) {
            C15696a c15696a = this.f70867a.get(fragment);
            if (NullChecker.m82486a(c15696a)) {
                c15696a.f70876c += SystemClock.elapsedRealtime() - c15696a.f70875b;
                c15696a.f70875b = SystemClock.elapsedRealtime();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m97315f(String str, long j) {
        if (j > this.f70872f) {
            Iterator<z20<String, Long>> it = this.f70873g.iterator();
            while (it.hasNext()) {
                it.next().call(str, Long.valueOf(j));
            }
        }
        if (this.f70870d) {
            i4g0.m138493B("e_page_load_time", "", new pf60(OMSTemplateModeType.page, str), new pf60("load_time", Long.valueOf(j)));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m97316g(Fragment fragment) {
        if (this.f70871e) {
            C15696a c15696a = this.f70867a.get(fragment);
            if (NullChecker.m82486a(c15696a)) {
                c15696a.f70875b = SystemClock.elapsedRealtime();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m97317h(AutoSpeedFrameLayout autoSpeedFrameLayout) {
        if (this.f70871e) {
            C15696a c15696a = this.f70869c.get(autoSpeedFrameLayout);
            if (NullChecker.m82486a(c15696a)) {
                c15696a.f70875b = SystemClock.elapsedRealtime();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m97318i(boolean z) {
        this.f70871e = z;
    }

    /* JADX INFO: renamed from: j */
    public void m97319j(boolean z) {
        this.f70870d = z;
    }

    /* JADX INFO: renamed from: k */
    public void m97320k(Activity activity) {
        Long l2 = this.f70868b.get(activity);
        if (NullChecker.m82487b(l2)) {
            m97315f(activity instanceof Act ? ((Act) activity).pageId() : activity.getClass().getSimpleName(), SystemClock.elapsedRealtime() - l2.longValue());
        }
    }

    /* JADX INFO: renamed from: l */
    public void m97321l(AutoSpeedFrameLayout autoSpeedFrameLayout) {
        if (this.f70871e) {
            C15696a c15696a = this.f70869c.get(autoSpeedFrameLayout);
            if (NullChecker.m82486a(c15696a)) {
                long jElapsedRealtime = (SystemClock.elapsedRealtime() - c15696a.f70875b) + c15696a.f70876c;
                Fragment fragment = (Fragment) c15696a.f70874a.get();
                if (NullChecker.m82486a(fragment)) {
                    m97315f(fragment instanceof Frag ? ((Frag) fragment).pageId() : fragment.getClass().getSimpleName(), jElapsedRealtime);
                }
            }
        }
    }
}
