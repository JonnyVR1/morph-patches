package p151v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import p153l.mqh0;

/* JADX INFO: loaded from: classes3.dex */
public class VRelative_ColorFilter extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public mqh0 f210248a;

    public VRelative_ColorFilter(Context context) {
        super(context);
        m224436a(context, null, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m224436a(Context context, AttributeSet attributeSet, int i) {
        mqh0 mqh0Var = new mqh0(this);
        this.f210248a = mqh0Var;
        mqh0Var.m159510g(context, attributeSet, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void childDrawableStateChanged(View view) {
        super.childDrawableStateChanged(view);
        this.f210248a.m164309b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f210248a.m164310c();
    }

    public VRelative_ColorFilter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m224436a(context, attributeSet, 0);
    }
}
