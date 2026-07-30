package p151v;

import android.content.Context;
import android.util.AttributeSet;
import p153l.mqh0;

/* JADX INFO: loaded from: classes3.dex */
public class VText_ColorFilter extends VText {

    /* JADX INFO: renamed from: i */
    public mqh0 f210364i;

    public VText_ColorFilter(Context context) {
        super(context);
        m224515h(context, null, 0);
    }

    /* JADX INFO: renamed from: h */
    private void m224515h(Context context, AttributeSet attributeSet, int i) {
        mqh0 mqh0Var = new mqh0(this);
        this.f210364i = mqh0Var;
        mqh0Var.m159510g(context, attributeSet, i);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        mqh0 mqh0Var = this.f210364i;
        if (mqh0Var != null) {
            mqh0Var.m164310c();
        }
    }

    public VText_ColorFilter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m224515h(context, attributeSet, 0);
    }

    public VText_ColorFilter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m224515h(context, attributeSet, i);
    }
}
