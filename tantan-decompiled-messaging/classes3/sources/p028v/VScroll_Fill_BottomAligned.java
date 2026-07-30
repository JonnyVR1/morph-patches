package p028v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VScroll_Fill_BottomAligned extends VScroll_Fill {

    /* JADX INFO: renamed from: e */
    public int f12957e;

    public VScroll_Fill_BottomAligned(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m11679f(View view) {
        scrollTo(0, view.getBottom());
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getChildCount() == 1) {
            final View childAt = getChildAt(0);
            int height = childAt.getHeight();
            if (height > this.f12957e) {
                post(new Runnable() { // from class: l.eqk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f3365a.m11679f(childAt);
                    }
                });
            }
            this.f12957e = height;
        }
    }

    public VScroll_Fill_BottomAligned(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VScroll_Fill_BottomAligned(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
