package p153l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Pair;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;

/* JADX INFO: loaded from: classes11.dex */
public class hof implements kj2 {

    /* JADX INFO: renamed from: e */
    public static int f110899e = qa00.m175859d(150.0f);

    /* JADX INFO: renamed from: b */
    public Paint f110901b;

    /* JADX INFO: renamed from: c */
    public int f110902c = 0;

    /* JADX INFO: renamed from: d */
    public int f110903d = 255;

    /* JADX INFO: renamed from: a */
    public float f110900a = 0.9747162f;

    public hof(Context context, final ox2 ox2Var) {
        Paint paint = new Paint();
        this.f110901b = paint;
        paint.setAntiAlias(true);
        this.f110901b.setColor(-1380876);
        ((Act) bnl0.m105506D(context)).duringCreated(ExpandedCardStyleHelper.m39093o().m39109v(CoreSuggested.UserInfo.VIRTUAL_CARD)).subscribe(psd0.m173596G(new y20() { // from class: l.gof
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f105286a.m136418d(ox2Var, (Pair) obj);
            }
        }));
    }

    @Override // p153l.kj2
    /* JADX INFO: renamed from: a */
    public void mo136416a(int i) {
        this.f110902c = i;
    }

    @Override // p153l.kj2
    /* JADX INFO: renamed from: b */
    public void mo136417b(Canvas canvas, int i, int i2) {
        if (uih0.m196223s0().m196234A0()) {
            return;
        }
        this.f110901b.setColor(Color.argb(this.f110903d, 255, 255, 255));
        float f = i2;
        canvas.drawRect(0.0f, f110899e, i, f, this.f110901b);
        if (this.f110902c <= 1) {
            return;
        }
        this.f110901b.setColor(-1380876);
        float f2 = i / 2;
        float f3 = ((i - (qa00.f156321h * 2)) * this.f110900a) / 2.0f;
        float fM175859d = f - (qa00.m175859d(100.0f) - (qa00.m175859d(12.0f) / this.f110900a));
        canvas.drawRoundRect(f2 - f3, fM175859d - 200.0f, f2 + f3, fM175859d, qa00.m175859d(20.0f) * this.f110900a, qa00.m175859d(20.0f) * this.f110900a, this.f110901b);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m136418d(ox2 ox2Var, Pair pair) {
        this.f110903d = (int) ((1.0f - ((Float) pair.first).floatValue()) * 255.0f);
        if (ox2Var.m169620B() != null) {
            ox2Var.m169620B().invalidate();
        }
    }
}
