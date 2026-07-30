package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.home.GPHomeMissMatchView;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class xgj {

    /* JADX INFO: renamed from: a */
    public GPHomeMissMatchView f194199a;

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m210897i() {
        if (NullChecker.m82486a(this.f194199a) && NullChecker.m82486a(this.f194199a.getParent())) {
            gt0.m132160f(gt0.m132168n(this.f194199a, View.TRANSLATION_Y, 0.0f, -100.0f), new Runnable() { // from class: l.wgj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f188980a.m210894f();
                }
            }).start();
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m210894f() {
        if (NullChecker.m82486a(this.f194199a) && NullChecker.m82486a(this.f194199a.getParent())) {
            ((ViewGroup) this.f194199a.getParent()).removeView(this.f194199a);
            this.f194199a = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m210896h(Act act, View view) {
        sfj0.m185596c("e_miss_a_match_toast", "p_suggest_users_home_view", new sfj0.C20032a[0]);
        CoreModule.m30933P().m143405a().mo34537l1(act, "p_suggest_users_home_view,e_miss_a_match_toast,click");
        m210897i();
    }

    /* JADX INFO: renamed from: j */
    public void m210898j(final Act act, User user) {
        GPHomeMissMatchView gPHomeMissMatchView = this.f194199a;
        if (gPHomeMissMatchView == null) {
            this.f194199a = (GPHomeMissMatchView) act.inflater().inflate(kec0.f125853ge, (ViewGroup) null, false);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, bnl0.m105511F0(), 0, 0);
            this.f194199a.setLayoutParams(layoutParams);
        } else if (NullChecker.m82486a(gPHomeMissMatchView.getParent())) {
            ((ViewGroup) this.f194199a.getParent()).removeView(this.f194199a);
        }
        this.f194199a.m37648s(act, user, new Runnable() { // from class: l.tgj
            @Override // java.lang.Runnable
            public final void run() {
                this.f174095a.m210895g();
            }
        });
        bnl0.m105509E0(this.f194199a, new View.OnClickListener() { // from class: l.ugj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178901a.m210896h(act, view);
            }
        });
        sfj0.m185601h("e_miss_a_match_toast", "p_suggest_users_home_view", new sfj0.C20032a[0]);
        ((ViewGroup) act.getWindow().getDecorView()).addView(this.f194199a);
        gt0.m132168n(this.f194199a, View.TRANSLATION_Y, -100.0f, 0.0f).start();
        l51.m152888H(act, new Runnable() { // from class: l.vgj
            @Override // java.lang.Runnable
            public final void run() {
                this.f184039a.m210897i();
            }
        }, 3000L);
    }
}
