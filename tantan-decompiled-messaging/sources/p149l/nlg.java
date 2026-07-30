package p149l;

import android.R;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class nlg {

    /* JADX INFO: renamed from: g */
    public static volatile nlg f139545g;

    /* JADX INFO: renamed from: a */
    public String f139546a;

    /* JADX INFO: renamed from: b */
    public WeakReference<View> f139547b;

    /* JADX INFO: renamed from: c */
    public String f139548c;

    /* JADX INFO: renamed from: d */
    public WeakReference<View> f139549d;

    /* JADX INFO: renamed from: e */
    public TopicMoment f139550e;

    /* JADX INFO: renamed from: f */
    public boolean f139551f;

    /* JADX INFO: renamed from: g */
    public static nlg m160044g() {
        if (f139545g == null) {
            synchronized (nlg.class) {
                try {
                    if (f139545g == null) {
                        f139545g = new nlg();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f139545g;
    }

    /* JADX INFO: renamed from: b */
    public void m160045b(View view) {
        this.f139547b = new WeakReference<>(view);
    }

    /* JADX INFO: renamed from: c */
    public void m160046c(Act act, View view, TopicMoment topicMoment) {
        WeakReference<View> weakReference = new WeakReference<>(view);
        this.f139549d = weakReference;
        this.f139550e = topicMoment;
        if (this.f139551f) {
            this.f139551f = false;
            m160053k(act, topicMoment.details.tips, weakReference.get());
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m160047d(Act act, String str) {
        WeakReference<View> weakReference;
        if (act == null || TextUtils.isEmpty(str) || (weakReference = this.f139547b) == null || weakReference.get() == null || !m160050h()) {
            return false;
        }
        m160053k(act, str, this.f139547b.get());
        return true;
    }

    /* JADX INFO: renamed from: e */
    public boolean m160048e(Act act) {
        if (act == null || !m160050h() || TextUtils.isEmpty(this.f139548c)) {
            return false;
        }
        WeakReference<View> weakReference = this.f139549d;
        if (weakReference == null || this.f139550e == null) {
            this.f139551f = true;
            return false;
        }
        if (weakReference.get() == null) {
            return false;
        }
        m160053k(act, this.f139550e.details.tips, this.f139549d.get());
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void m160049f() {
        this.f139548c = null;
        this.f139547b = null;
        this.f139550e = null;
        this.f139549d = null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m160050h() {
        return FeedModule.f38855d.f193011Q.get().intValue() < 3 && !m160051i();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m160051i() {
        return mqi0.m155929D(FeedModule.f38855d.f193009P.get().longValue());
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m160052j(String str) {
        this.f139546a = null;
    }

    /* JADX INFO: renamed from: k */
    public final void m160053k(Act act, String str, View view) {
        if (view == null) {
            return;
        }
        this.f139546a = C4348d.m20896l().m20908t(new C4345a(act).m20849D(str).m20846A(act.getWindow().getDecorView().findViewById(R.id.content)).m20871l(t100.m186890d(7.0f)).m20855J(13.0f).m20850E(true).m20870k(act.getResources().getColor(e1c0.f88798n)).m20861b(3000L).m20883y(true).m20864e(true).m20869j(new C4345a.c() { // from class: l.mlg
            @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.c
            /* JADX INFO: renamed from: a */
            public final void mo20886a(String str2) {
                this.f134425a.m160052j(str2);
            }
        }).m20875q(C4345a.f15683Q).m20882x(-t100.f167264m), view);
        m160054l();
        zvf0.m220402x("e_active_pop", "p_moment_post");
    }

    /* JADX INFO: renamed from: l */
    public void m160054l() {
        FeedModule.f38855d.f193009P.put(Long.valueOf(mqi0.m155944o()));
        FeedModule.f38855d.f193011Q.put(Integer.valueOf(FeedModule.f38855d.f193011Q.get().intValue() + 1));
    }
}
