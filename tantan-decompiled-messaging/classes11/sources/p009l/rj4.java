package p009l;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C0034d;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class rj4 {

    /* JADX INFO: renamed from: a */
    public CardBottomFrame f19858a;

    /* JADX INFO: renamed from: b */
    public View f19859b;

    /* JADX INFO: renamed from: c */
    public wl2 f19860c;

    /* JADX INFO: renamed from: d */
    public String f19861d;

    public rj4(CardBottomFrame cardBottomFrame, View view, wl2 wl2Var) {
        this.f19858a = cardBottomFrame;
        this.f19859b = view;
        this.f19860c = wl2Var;
    }

    /* JADX INFO: renamed from: a */
    public CardBottomFrame m21678a() {
        return this.f19858a;
    }

    /* JADX INFO: renamed from: b */
    public wl2 m21679b() {
        return this.f19860c;
    }

    /* JADX INFO: renamed from: c */
    public View m21680c() {
        return this.f19859b;
    }

    /* JADX INFO: renamed from: d */
    public String m21681d() {
        return this.f19861d;
    }

    /* JADX INFO: renamed from: e */
    public void m21682e(C0034d c0034d, Context context, FrameLayout frameLayout, int i) {
        this.f19860c.mo11838c(c0034d, this.f19859b, frameLayout, i, context);
        m21683f(c0034d.m1445b());
    }

    /* JADX INFO: renamed from: f */
    public void m21683f(String str) {
        this.f19861d = str;
    }
}
