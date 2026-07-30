package p153l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.p051p1.mobile.putong.live.base.span.LiveAnimatedWebpSpanDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class rnd0 extends sce<String> {
    public rnd0(Context context, String str, int i) {
        super(context, str, i);
    }

    /* JADX INFO: renamed from: h */
    public static void m182212h(Drawable drawable) {
        if (drawable instanceof LiveAnimatedWebpSpanDrawable) {
            ((LiveAnimatedWebpSpanDrawable) drawable).m69785f();
        }
    }

    @Override // p153l.sce
    /* JADX INFO: renamed from: f */
    public void mo182213f(ruf0 ruf0Var) {
        m182212h(m185370c());
        super.mo182213f(ruf0Var);
        int iM175859d = this.f167247e;
        if (qa00.m175858c().densityDpi < 480) {
            iM175859d = qa00.m175859d(3.0f) + this.f167247e;
        }
        ruf0Var.setBounds(0, 0, (int) (ruf0Var.getRatio() * iM175859d), iM175859d);
    }
}
