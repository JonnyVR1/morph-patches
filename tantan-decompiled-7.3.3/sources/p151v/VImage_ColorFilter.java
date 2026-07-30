package p151v;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import p153l.mqh0;

/* JADX INFO: loaded from: classes3.dex */
public class VImage_ColorFilter extends AppCompatImageView {

    /* JADX INFO: renamed from: c */
    public mqh0 f210050c;

    public VImage_ColorFilter(Context context) {
        super(context);
        m224307d(context, null, 0);
    }

    /* JADX INFO: renamed from: d */
    public final void m224307d(Context context, AttributeSet attributeSet, int i) {
        mqh0 mqh0Var = new mqh0(this);
        this.f210050c = mqh0Var;
        mqh0Var.m159510g(context, attributeSet, i);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f210050c.m164310c();
    }

    public VImage_ColorFilter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m224307d(context, attributeSet, 0);
    }

    public VImage_ColorFilter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m224307d(context, attributeSet, i);
    }
}
