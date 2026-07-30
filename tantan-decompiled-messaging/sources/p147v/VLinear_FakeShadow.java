package p147v;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import p149l.hih0;
import p149l.u2c0;

/* JADX INFO: loaded from: classes3.dex */
public class VLinear_FakeShadow extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public hih0 f209137a;

    /* JADX INFO: renamed from: b */
    public boolean f209138b;

    public VLinear_FakeShadow(Context context) {
        super(context);
        this.f209137a = new hih0();
        this.f209138b = true;
        m223065a(context, null, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m223065a(Context context, AttributeSet attributeSet, int i) {
        this.f209137a.m131258a(context.getResources().getDrawable(m223066b()));
    }

    /* JADX INFO: renamed from: b */
    public int m223066b() {
        return u2c0.f173377l6;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public void setDrawShadow(boolean z) {
        this.f209138b = z;
        invalidate();
    }

    public VLinear_FakeShadow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209137a = new hih0();
        this.f209138b = true;
        m223065a(context, attributeSet, 0);
    }

    public VLinear_FakeShadow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209137a = new hih0();
        this.f209138b = true;
        m223065a(context, attributeSet, i);
    }
}
