package p153l;

import android.R;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public class cng {

    /* JADX INFO: renamed from: g */
    public static volatile cng f82715g;

    /* JADX INFO: renamed from: a */
    public String f82716a;

    /* JADX INFO: renamed from: b */
    public WeakReference<View> f82717b;

    /* JADX INFO: renamed from: c */
    public String f82718c;

    /* JADX INFO: renamed from: d */
    public WeakReference<View> f82719d;

    /* JADX INFO: renamed from: e */
    public TopicMoment f82720e;

    /* JADX INFO: renamed from: f */
    public boolean f82721f;

    /* JADX INFO: renamed from: g */
    public static cng m111504g() {
        if (f82715g == null) {
            synchronized (cng.class) {
                try {
                    if (f82715g == null) {
                        f82715g = new cng();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f82715g;
    }

    /* JADX INFO: renamed from: b */
    public void m111505b(View view) {
        this.f82717b = new WeakReference<>(view);
    }

    /* JADX INFO: renamed from: c */
    public void m111506c(Act act, View view, TopicMoment topicMoment) {
        WeakReference<View> weakReference = new WeakReference<>(view);
        this.f82719d = weakReference;
        this.f82720e = topicMoment;
        if (this.f82721f) {
            this.f82721f = false;
            m111513k(act, topicMoment.details.tips, weakReference.get());
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m111507d(Act act, String str) {
        WeakReference<View> weakReference;
        if (act == null || TextUtils.isEmpty(str) || (weakReference = this.f82717b) == null || weakReference.get() == null || !m111510h()) {
            return false;
        }
        m111513k(act, str, this.f82717b.get());
        return true;
    }

    /* JADX INFO: renamed from: e */
    public boolean m111508e(Act act) {
        if (act == null || !m111510h() || TextUtils.isEmpty(this.f82718c)) {
            return false;
        }
        WeakReference<View> weakReference = this.f82719d;
        if (weakReference == null || this.f82720e == null) {
            this.f82721f = true;
            return false;
        }
        if (weakReference.get() == null) {
            return false;
        }
        m111513k(act, this.f82720e.details.tips, this.f82719d.get());
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void m111509f() {
        this.f82718c = null;
        this.f82717b = null;
        this.f82720e = null;
        this.f82719d = null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m111510h() {
        return FeedModule.f39703d.f121321Q.get().intValue() < 3 && !m111511i();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m111511i() {
        return pzi0.m174439D(FeedModule.f39703d.f121319P.get().longValue());
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m111512j(String str) {
        this.f82716a = null;
    }

    /* JADX INFO: renamed from: k */
    public final void m111513k(Act act, String str, View view) {
        if (view == null) {
            return;
        }
        this.f82716a = C4499d.m21895l().m21907t(new C4496a(act).m21848D(str).m21845A(act.getWindow().getDecorView().findViewById(R.id.content)).m21870l(qa00.m175859d(7.0f)).m21854J(13.0f).m21849E(true).m21869k(act.getResources().getColor(k9c0.f124521n)).m21860b(3000L).m21882y(true).m21863e(true).m21868j(new C4496a.c() { // from class: l.bng
            @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.c
            /* JADX INFO: renamed from: a */
            public final void mo21885a(String str2) {
                this.f77476a.m111512j(str2);
            }
        }).m21874q(C4496a.f16402Q).m21881x(-qa00.f156326m), view);
        m111514l();
        i4g0.m138526x("e_active_pop", "p_moment_post");
    }

    /* JADX INFO: renamed from: l */
    public void m111514l() {
        FeedModule.f39703d.f121319P.put(Long.valueOf(pzi0.m174454o()));
        FeedModule.f39703d.f121321Q.put(Integer.valueOf(FeedModule.f39703d.f121321Q.get().intValue() + 1));
    }
}
