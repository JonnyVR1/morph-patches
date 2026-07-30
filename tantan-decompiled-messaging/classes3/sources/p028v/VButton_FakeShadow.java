package p028v;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import l.u2c0;
import p003l.hih0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VButton_FakeShadow extends VButton {

    /* JADX INFO: renamed from: c */
    public hih0 f12672c;

    /* JADX INFO: renamed from: d */
    public boolean f12673d;

    public VButton_FakeShadow(Context context) {
        super(context);
        this.f12672c = new hih0();
        this.f12673d = true;
        m11470e(context, null, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m11470e(Context context, AttributeSet attributeSet, int i) {
        this.f12672c.m4967a(context.getResources().getDrawable(mo11471f()));
    }

    /* JADX INFO: renamed from: f */
    public int mo11471f() {
        return u2c0.l6;
    }

    public void setDrawShadow(boolean z) {
        this.f12673d = z;
        invalidate();
    }

    public VButton_FakeShadow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12672c = new hih0();
        this.f12673d = true;
        m11470e(context, attributeSet, 0);
    }

    public VButton_FakeShadow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12672c = new hih0();
        this.f12673d = true;
        m11470e(context, attributeSet, i);
    }
}
