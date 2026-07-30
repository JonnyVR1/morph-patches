package p007l;

import android.R;
import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import java.lang.ref.WeakReference;
import l.mqi0;
import l.t100;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class nlg {

    /* JADX INFO: renamed from: g */
    public static volatile nlg f10825g;

    /* JADX INFO: renamed from: a */
    public String f10826a;

    /* JADX INFO: renamed from: b */
    public WeakReference<View> f10827b;

    /* JADX INFO: renamed from: c */
    public String f10828c;

    /* JADX INFO: renamed from: d */
    public WeakReference<View> f10829d;

    /* JADX INFO: renamed from: e */
    public TopicMoment f10830e;

    /* JADX INFO: renamed from: f */
    public boolean f10831f;

    /* JADX INFO: renamed from: g */
    public static nlg m12287g() {
        if (f10825g == null) {
            synchronized (nlg.class) {
                try {
                    if (f10825g == null) {
                        f10825g = new nlg();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f10825g;
    }

    /* JADX INFO: renamed from: b */
    public void m12288b(View view) {
        this.f10827b = new WeakReference<>(view);
    }

    /* JADX INFO: renamed from: c */
    public void m12289c(Act act, View view, TopicMoment topicMoment) {
        WeakReference<View> weakReference = new WeakReference<>(view);
        this.f10829d = weakReference;
        this.f10830e = topicMoment;
        if (this.f10831f) {
            this.f10831f = false;
            m12296k(act, topicMoment.details.tips, weakReference.get());
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m12290d(Act act, String str) {
        WeakReference<View> weakReference;
        if (act == null || TextUtils.isEmpty(str) || (weakReference = this.f10827b) == null || weakReference.get() == null || !m12293h()) {
            return false;
        }
        m12296k(act, str, this.f10827b.get());
        return true;
    }

    /* JADX INFO: renamed from: e */
    public boolean m12291e(Act act) {
        if (act == null || !m12293h() || TextUtils.isEmpty(this.f10828c)) {
            return false;
        }
        WeakReference<View> weakReference = this.f10829d;
        if (weakReference == null || this.f10830e == null) {
            this.f10831f = true;
            return false;
        }
        if (weakReference.get() == null) {
            return false;
        }
        m12296k(act, this.f10830e.details.tips, this.f10829d.get());
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void m12292f() {
        this.f10828c = null;
        this.f10827b = null;
        this.f10830e = null;
        this.f10829d = null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m12293h() {
        return ((Integer) FeedModule.f316d.f14946Q.get()).intValue() < 3 && !m12294i();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m12294i() {
        return mqi0.D(((Long) FeedModule.f316d.f14944P.get()).longValue());
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m12295j(String str) {
        this.f10826a = null;
    }

    /* JADX INFO: renamed from: k */
    public final void m12296k(Act act, String str, View view) {
        if (view == null) {
            return;
        }
        this.f10826a = d.l().t(new a(act).D(str).A(act.getWindow().getDecorView().findViewById(R.id.content)).l(t100.d(7.0f)).J(13.0f).E(true).k(new int[]{act.getResources().getColor(e1c0.f7154n)}).b(3000L).y(true).e(true).j(new a.c() { // from class: l.mlg
            /* JADX INFO: renamed from: a */
            public final void m11974a(String str2) {
                this.f10511a.m12295j(str2);
            }
        }).q(a.Q).x(-t100.m), view);
        m12297l();
        zvf0.x("e_active_pop", "p_moment_post");
    }

    /* JADX INFO: renamed from: l */
    public void m12297l() {
        FeedModule.f316d.f14944P.put(Long.valueOf(mqi0.o()));
        FeedModule.f316d.f14946Q.put(Integer.valueOf(((Integer) FeedModule.f316d.f14946Q.get()).intValue() + 1));
    }
}
