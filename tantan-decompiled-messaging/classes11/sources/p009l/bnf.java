package p009l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Pair;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import l.e30;
import l.mah0;
import l.mkd0;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class bnf implements cj2 {

    /* JADX INFO: renamed from: e */
    public static int f10202e = t100.d(150.0f);

    /* JADX INFO: renamed from: b */
    public Paint f10204b;

    /* JADX INFO: renamed from: c */
    public int f10205c = 0;

    /* JADX INFO: renamed from: d */
    public int f10206d = 255;

    /* JADX INFO: renamed from: a */
    public float f10203a = 0.9747162f;

    public bnf(Context context, final zw2 zw2Var) {
        Paint paint = new Paint();
        this.f10204b = paint;
        paint.setAntiAlias(true);
        this.f10204b.setColor(-1380876);
        xdl0.D(context).duringCreated(ExpandedCardStyleHelper.m2064o().m2080v("VirtualCard")).subscribe(mkd0.G(new e30() { // from class: l.anf
            public final void call(Object obj) {
                this.f9585a.m12157d(zw2Var, (Pair) obj);
            }
        }));
    }

    @Override // p009l.cj2
    /* JADX INFO: renamed from: a */
    public void mo12155a(int i) {
        this.f10205c = i;
    }

    @Override // p009l.cj2
    /* JADX INFO: renamed from: b */
    public void mo12156b(Canvas canvas, int i, int i2) {
        if (mah0.s0().A0()) {
            return;
        }
        this.f10204b.setColor(Color.argb(this.f10206d, 255, 255, 255));
        float f = i2;
        canvas.drawRect(0.0f, f10202e, i, f, this.f10204b);
        if (this.f10205c <= 1) {
            return;
        }
        this.f10204b.setColor(-1380876);
        float f2 = i / 2;
        float f3 = ((i - (t100.h * 2)) * this.f10203a) / 2.0f;
        float fD = f - (t100.d(100.0f) - (t100.d(12.0f) / this.f10203a));
        canvas.drawRoundRect(f2 - f3, fD - 200.0f, f2 + f3, fD, t100.d(20.0f) * this.f10203a, t100.d(20.0f) * this.f10203a, this.f10204b);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m12157d(zw2 zw2Var, Pair pair) {
        this.f10206d = (int) ((1.0f - ((Float) pair.first).floatValue()) * 255.0f);
        if (zw2Var.m25989B() != null) {
            zw2Var.m25989B().invalidate();
        }
    }
}
