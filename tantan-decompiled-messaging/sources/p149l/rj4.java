package p149l;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C7870d;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;

/* JADX INFO: loaded from: classes11.dex */
public class rj4 {

    /* JADX INFO: renamed from: a */
    public CardBottomFrame f159626a;

    /* JADX INFO: renamed from: b */
    public View f159627b;

    /* JADX INFO: renamed from: c */
    public wl2 f159628c;

    /* JADX INFO: renamed from: d */
    public String f159629d;

    public rj4(CardBottomFrame cardBottomFrame, View view, wl2 wl2Var) {
        this.f159626a = cardBottomFrame;
        this.f159627b = view;
        this.f159628c = wl2Var;
    }

    /* JADX INFO: renamed from: a */
    public CardBottomFrame m179546a() {
        return this.f159626a;
    }

    /* JADX INFO: renamed from: b */
    public wl2 m179547b() {
        return this.f159628c;
    }

    /* JADX INFO: renamed from: c */
    public View m179548c() {
        return this.f159627b;
    }

    /* JADX INFO: renamed from: d */
    public String m179549d() {
        return this.f159629d;
    }

    /* JADX INFO: renamed from: e */
    public void m179550e(C7870d c7870d, Context context, FrameLayout frameLayout, int i) {
        this.f159628c.mo100261c(c7870d, this.f159627b, frameLayout, i, context);
        m179551f(c7870d.m37474b());
    }

    /* JADX INFO: renamed from: f */
    public void m179551f(String str) {
        this.f159629d = str;
    }
}
