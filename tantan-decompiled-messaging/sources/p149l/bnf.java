package p149l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Pair;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;

/* JADX INFO: loaded from: classes11.dex */
public class bnf implements cj2 {

    /* JADX INFO: renamed from: e */
    public static int f76397e = t100.m186890d(150.0f);

    /* JADX INFO: renamed from: b */
    public Paint f76399b;

    /* JADX INFO: renamed from: c */
    public int f76400c = 0;

    /* JADX INFO: renamed from: d */
    public int f76401d = 255;

    /* JADX INFO: renamed from: a */
    public float f76398a = 0.9747162f;

    public bnf(Context context, final zw2 zw2Var) {
        Paint paint = new Paint();
        this.f76399b = paint;
        paint.setAntiAlias(true);
        this.f76399b.setColor(-1380876);
        ((Act) xdl0.m208326D(context)).duringCreated(ExpandedCardStyleHelper.m38090o().m38106v(CoreSuggested.UserInfo.VIRTUAL_CARD)).subscribe(mkd0.m154955G(new e30() { // from class: l.anf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70733a.m102796d(zw2Var, (Pair) obj);
            }
        }));
    }

    @Override // p149l.cj2
    /* JADX INFO: renamed from: a */
    public void mo102794a(int i) {
        this.f76400c = i;
    }

    @Override // p149l.cj2
    /* JADX INFO: renamed from: b */
    public void mo102795b(Canvas canvas, int i, int i2) {
        if (mah0.m153729s0().m153740A0()) {
            return;
        }
        this.f76399b.setColor(Color.argb(this.f76401d, 255, 255, 255));
        float f = i2;
        canvas.drawRect(0.0f, f76397e, i, f, this.f76399b);
        if (this.f76400c <= 1) {
            return;
        }
        this.f76399b.setColor(-1380876);
        float f2 = i / 2;
        float f3 = ((i - (t100.f167259h * 2)) * this.f76398a) / 2.0f;
        float fM186890d = f - (t100.m186890d(100.0f) - (t100.m186890d(12.0f) / this.f76398a));
        canvas.drawRoundRect(f2 - f3, fM186890d - 200.0f, f2 + f3, fM186890d, t100.m186890d(20.0f) * this.f76398a, t100.m186890d(20.0f) * this.f76398a, this.f76399b);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m102796d(zw2 zw2Var, Pair pair) {
        this.f76401d = (int) ((1.0f - ((Float) pair.first).floatValue()) * 255.0f);
        if (zw2Var.m220507B() != null) {
            zw2Var.m220507B().invalidate();
        }
    }
}
