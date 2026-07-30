package p151v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class VScroll_Fill_BottomAligned extends VScroll_Fill {

    /* JADX INFO: renamed from: e */
    public int f210254e;

    public VScroll_Fill_BottomAligned(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m224441f(View view) {
        scrollTo(0, view.getBottom());
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getChildCount() == 1) {
            final View childAt = getChildAt(0);
            int height = childAt.getHeight();
            if (height > this.f210254e) {
                post(new Runnable() { // from class: l.kzk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f129434a.m224441f(childAt);
                    }
                });
            }
            this.f210254e = height;
        }
    }

    public VScroll_Fill_BottomAligned(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VScroll_Fill_BottomAligned(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
