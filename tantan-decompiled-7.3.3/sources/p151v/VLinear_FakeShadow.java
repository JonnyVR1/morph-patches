package p151v;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import p153l.abc0;
import p153l.oqh0;

/* JADX INFO: loaded from: classes3.dex */
public class VLinear_FakeShadow extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public oqh0 f210059a;

    /* JADX INFO: renamed from: b */
    public boolean f210060b;

    public VLinear_FakeShadow(Context context) {
        super(context);
        this.f210059a = new oqh0();
        this.f210060b = true;
        m224311a(context, null, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m224311a(Context context, AttributeSet attributeSet, int i) {
        this.f210059a.m168814a(context.getResources().getDrawable(m224312b()));
    }

    /* JADX INFO: renamed from: b */
    public int m224312b() {
        return abc0.f69497l6;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public void setDrawShadow(boolean z) {
        this.f210060b = z;
        invalidate();
    }

    public VLinear_FakeShadow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210059a = new oqh0();
        this.f210060b = true;
        m224311a(context, attributeSet, 0);
    }

    public VLinear_FakeShadow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f210059a = new oqh0();
        this.f210060b = true;
        m224311a(context, attributeSet, i);
    }
}
