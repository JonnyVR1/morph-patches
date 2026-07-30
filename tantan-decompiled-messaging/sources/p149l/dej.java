package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.home.GPHomeMissMatchView;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class dej {

    /* JADX INFO: renamed from: a */
    public GPHomeMissMatchView f85802a;

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m111266i() {
        if (NullChecker.m81303a(this.f85802a) && NullChecker.m81303a(this.f85802a.getParent())) {
            bt0.m103733f(bt0.m103741n(this.f85802a, View.TRANSLATION_Y, 0.0f, -100.0f), new Runnable() { // from class: l.cej
                @Override // java.lang.Runnable
                public final void run() {
                    this.f80464a.m111263f();
                }
            }).start();
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m111263f() {
        if (NullChecker.m81303a(this.f85802a) && NullChecker.m81303a(this.f85802a.getParent())) {
            ((ViewGroup) this.f85802a.getParent()).removeView(this.f85802a);
            this.f85802a = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m111265h(Act act, View view) {
        o6j0.m162859c("e_miss_a_match_toast", "p_suggest_users_home_view", new o6j0.C18854a[0]);
        CoreModule.m29935P().m94651a().mo33534l1(act, "p_suggest_users_home_view,e_miss_a_match_toast,click");
        m111266i();
    }

    /* JADX INFO: renamed from: j */
    public void m111267j(final Act act, User user) {
        GPHomeMissMatchView gPHomeMissMatchView = this.f85802a;
        if (gPHomeMissMatchView == null) {
            this.f85802a = (GPHomeMissMatchView) act.inflater().inflate(f6c0.f95680Zd, (ViewGroup) null, false);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, xdl0.m208331F0(), 0, 0);
            this.f85802a.setLayoutParams(layoutParams);
        } else if (NullChecker.m81303a(gPHomeMissMatchView.getParent())) {
            ((ViewGroup) this.f85802a.getParent()).removeView(this.f85802a);
        }
        this.f85802a.m36645s(act, user, new Runnable() { // from class: l.zdj
            @Override // java.lang.Runnable
            public final void run() {
                this.f202669a.m111264g();
            }
        });
        xdl0.m208329E0(this.f85802a, new View.OnClickListener() { // from class: l.aej
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f69045a.m111265h(act, view);
            }
        });
        o6j0.m162864h("e_miss_a_match_toast", "p_suggest_users_home_view", new o6j0.C18854a[0]);
        ((ViewGroup) act.getWindow().getDecorView()).addView(this.f85802a);
        bt0.m103741n(this.f85802a, View.TRANSLATION_Y, -100.0f, 0.0f).start();
        e51.m114743H(act, new Runnable() { // from class: l.bej
            @Override // java.lang.Runnable
            public final void run() {
                this.f75163a.m111266i();
            }
        }, 3000L);
    }
}
