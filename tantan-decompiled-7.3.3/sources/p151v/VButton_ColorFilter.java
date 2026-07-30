package p151v;

import android.content.Context;
import android.util.AttributeSet;
import p153l.mqh0;

/* JADX INFO: loaded from: classes3.dex */
public class VButton_ColorFilter extends VButton {

    /* JADX INFO: renamed from: c */
    public mqh0 f209968c;

    public VButton_ColorFilter(Context context) {
        super(context);
        m224242c(context, null, 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m224242c(Context context, AttributeSet attributeSet, int i) {
        mqh0 mqh0Var = new mqh0(this);
        this.f209968c = mqh0Var;
        mqh0Var.m159510g(context, attributeSet, i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f209968c.m164310c();
    }

    public VButton_ColorFilter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m224242c(context, attributeSet, 0);
    }

    public VButton_ColorFilter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m224242c(context, attributeSet, i);
    }
}
