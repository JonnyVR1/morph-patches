package p002l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.p1.mobile.putong.live.base.span.LiveAnimatedWebpSpanDrawable;
import l.imf0;
import l.obe;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ofd0 extends obe<String> {
    public ofd0(Context context, String str, int i) {
        super(context, str, i);
    }

    /* JADX INFO: renamed from: h */
    public static void m19443h(Drawable drawable) {
        if (drawable instanceof LiveAnimatedWebpSpanDrawable) {
            ((LiveAnimatedWebpSpanDrawable) drawable).f();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m19444f(imf0 imf0Var) {
        m19443h(c());
        super.f(imf0Var);
        int iD = ((obe) this).e;
        if (t100.c().densityDpi < 480) {
            iD = t100.d(3.0f) + ((obe) this).e;
        }
        imf0Var.setBounds(0, 0, (int) (imf0Var.getRatio() * iD), iD);
    }
}
