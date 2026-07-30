package p149l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.p046p1.mobile.putong.live.base.span.LiveAnimatedWebpSpanDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class ofd0 extends obe<String> {
    public ofd0(Context context, String str, int i) {
        super(context, str, i);
    }

    /* JADX INFO: renamed from: h */
    public static void m164064h(Drawable drawable) {
        if (drawable instanceof LiveAnimatedWebpSpanDrawable) {
            ((LiveAnimatedWebpSpanDrawable) drawable).m68602f();
        }
    }

    @Override // p149l.obe
    /* JADX INFO: renamed from: f */
    public void mo163417f(imf0 imf0Var) {
        m164064h(m163414c());
        super.mo163417f(imf0Var);
        int iM186890d = this.f142904e;
        if (t100.m186889c().densityDpi < 480) {
            iM186890d = t100.m186890d(3.0f) + this.f142904e;
        }
        imf0Var.setBounds(0, 0, (int) (imf0Var.getRatio() * iM186890d), iM186890d);
    }
}
