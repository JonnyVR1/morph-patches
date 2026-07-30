package p147v;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import p149l.hih0;
import p149l.u2c0;

/* JADX INFO: loaded from: classes3.dex */
public class VButton_FakeShadow extends VButton {

    /* JADX INFO: renamed from: c */
    public hih0 f209047c;

    /* JADX INFO: renamed from: d */
    public boolean f209048d;

    public VButton_FakeShadow(Context context) {
        super(context);
        this.f209047c = new hih0();
        this.f209048d = true;
        m222997e(context, null, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m222997e(Context context, AttributeSet attributeSet, int i) {
        this.f209047c.m131258a(context.getResources().getDrawable(mo222998f()));
    }

    /* JADX INFO: renamed from: f */
    public int mo222998f() {
        return u2c0.f173377l6;
    }

    public void setDrawShadow(boolean z) {
        this.f209048d = z;
        invalidate();
    }

    public VButton_FakeShadow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209047c = new hih0();
        this.f209048d = true;
        m222997e(context, attributeSet, 0);
    }

    public VButton_FakeShadow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209047c = new hih0();
        this.f209048d = true;
        m222997e(context, attributeSet, i);
    }
}
