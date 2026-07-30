package p151v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p153l.mqh0;

/* JADX INFO: loaded from: classes3.dex */
public class VFrame_ColorFilter extends VFrame {

    /* JADX INFO: renamed from: a */
    public mqh0 f210015a;

    public VFrame_ColorFilter(Context context) {
        super(context);
        m224274p(context, null, 0);
    }

    /* JADX INFO: renamed from: p */
    private void m224274p(Context context, AttributeSet attributeSet, int i) {
        mqh0 mqh0Var = new mqh0(this);
        this.f210015a = mqh0Var;
        mqh0Var.m159510g(context, attributeSet, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void childDrawableStateChanged(View view) {
        super.childDrawableStateChanged(view);
        this.f210015a.m164309b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f210015a.m164310c();
    }

    public VFrame_ColorFilter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m224274p(context, attributeSet, 0);
    }
}
