package p028v;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import l.u2c0;
import p003l.hih0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VLinear_FakeShadow extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public hih0 f12762a;

    /* JADX INFO: renamed from: b */
    public boolean f12763b;

    public VLinear_FakeShadow(Context context) {
        super(context);
        this.f12762a = new hih0();
        this.f12763b = true;
        m11545a(context, null, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m11545a(Context context, AttributeSet attributeSet, int i) {
        this.f12762a.m4967a(context.getResources().getDrawable(m11546b()));
    }

    /* JADX INFO: renamed from: b */
    public int m11546b() {
        return u2c0.l6;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public void setDrawShadow(boolean z) {
        this.f12763b = z;
        invalidate();
    }

    public VLinear_FakeShadow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12762a = new hih0();
        this.f12763b = true;
        m11545a(context, attributeSet, 0);
    }

    public VLinear_FakeShadow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12762a = new hih0();
        this.f12763b = true;
        m11545a(context, attributeSet, i);
    }
}
