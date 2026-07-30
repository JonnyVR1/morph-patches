package p151v;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import p153l.abc0;
import p153l.oqh0;

/* JADX INFO: loaded from: classes3.dex */
public class VButton_FakeShadow extends VButton {

    /* JADX INFO: renamed from: c */
    public oqh0 f209969c;

    /* JADX INFO: renamed from: d */
    public boolean f209970d;

    public VButton_FakeShadow(Context context) {
        super(context);
        this.f209969c = new oqh0();
        this.f209970d = true;
        m224243e(context, null, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m224243e(Context context, AttributeSet attributeSet, int i) {
        this.f209969c.m168814a(context.getResources().getDrawable(mo224244f()));
    }

    /* JADX INFO: renamed from: f */
    public int mo224244f() {
        return abc0.f69497l6;
    }

    public void setDrawShadow(boolean z) {
        this.f209970d = z;
        invalidate();
    }

    public VButton_FakeShadow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209969c = new oqh0();
        this.f209970d = true;
        m224243e(context, attributeSet, 0);
    }

    public VButton_FakeShadow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209969c = new oqh0();
        this.f209970d = true;
        m224243e(context, attributeSet, i);
    }
}
