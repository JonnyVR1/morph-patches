package p153l;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C8021d;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;

/* JADX INFO: loaded from: classes11.dex */
public class qk4 {

    /* JADX INFO: renamed from: a */
    public CardBottomFrame f158092a;

    /* JADX INFO: renamed from: b */
    public View f158093b;

    /* JADX INFO: renamed from: c */
    public em2 f158094c;

    /* JADX INFO: renamed from: d */
    public String f158095d;

    public qk4(CardBottomFrame cardBottomFrame, View view, em2 em2Var) {
        this.f158092a = cardBottomFrame;
        this.f158093b = view;
        this.f158094c = em2Var;
    }

    /* JADX INFO: renamed from: a */
    public CardBottomFrame m176919a() {
        return this.f158092a;
    }

    /* JADX INFO: renamed from: b */
    public em2 m176920b() {
        return this.f158094c;
    }

    /* JADX INFO: renamed from: c */
    public View m176921c() {
        return this.f158093b;
    }

    /* JADX INFO: renamed from: d */
    public String m176922d() {
        return this.f158095d;
    }

    /* JADX INFO: renamed from: e */
    public void m176923e(C8021d c8021d, Context context, FrameLayout frameLayout, int i) {
        this.f158094c.mo96365c(c8021d, this.f158093b, frameLayout, i, context);
        m176924f(c8021d.m38477b());
    }

    /* JADX INFO: renamed from: f */
    public void m176924f(String str) {
        this.f158095d = str;
    }
}
