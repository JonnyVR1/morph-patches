package p009l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.home.GPHomeMissMatchView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.e51;
import l.f6c0;
import l.o6j0;
import l.xdl0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class dej {

    /* JADX INFO: renamed from: a */
    public GPHomeMissMatchView f11787a;

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m13186i() {
        if (NullChecker.a(this.f11787a) && NullChecker.a(this.f11787a.getParent())) {
            bt0.f(bt0.n(this.f11787a, View.TRANSLATION_Y, new float[]{0.0f, -100.0f}), new Runnable() { // from class: l.cej
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10566a.m13183f();
                }
            }).start();
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m13183f() {
        if (NullChecker.a(this.f11787a) && NullChecker.a(this.f11787a.getParent())) {
            ((ViewGroup) this.f11787a.getParent()).removeView(this.f11787a);
            this.f11787a = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m13185h(Act act, View view) {
        o6j0.c("e_miss_a_match_toast", "p_suggest_users_home_view", new o6j0.a[0]);
        CoreModule.P().a().l1(act, "p_suggest_users_home_view,e_miss_a_match_toast,click");
        m13186i();
    }

    /* JADX INFO: renamed from: j */
    public void m13187j(final Act act, User user) {
        VFrame vFrame = this.f11787a;
        if (vFrame == null) {
            this.f11787a = (GPHomeMissMatchView) act.inflater().inflate(f6c0.Zd, (ViewGroup) null, false);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, xdl0.F0(), 0, 0);
            this.f11787a.setLayoutParams(layoutParams);
        } else if (NullChecker.a(vFrame.getParent())) {
            ((ViewGroup) this.f11787a.getParent()).removeView(this.f11787a);
        }
        this.f11787a.m594s(act, user, new Runnable() { // from class: l.zdj
            @Override // java.lang.Runnable
            public final void run() {
                this.f23587a.m13184g();
            }
        });
        xdl0.E0(this.f11787a, new View.OnClickListener() { // from class: l.aej
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9434a.m13185h(act, view);
            }
        });
        o6j0.h("e_miss_a_match_toast", "p_suggest_users_home_view", new o6j0.a[0]);
        ((ViewGroup) act.getWindow().getDecorView()).addView(this.f11787a);
        bt0.n(this.f11787a, View.TRANSLATION_Y, new float[]{-100.0f, 0.0f}).start();
        e51.H(act, new Runnable() { // from class: l.bej
            @Override // java.lang.Runnable
            public final void run() {
                this.f10031a.m13186i();
            }
        }, 3000L);
    }
}
