package p151v;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import p153l.bnl0;

/* JADX INFO: loaded from: classes3.dex */
public class VScroll_Horizontal extends HorizontalScrollView {
    public VScroll_Horizontal(Context context) {
        super(context);
        m224442a(context);
    }

    /* JADX INFO: renamed from: a */
    private void m224442a(Context context) {
        if (bnl0.f77541b) {
            setOverScrollMode(2);
        }
    }

    public VScroll_Horizontal(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m224442a(context);
    }

    public VScroll_Horizontal(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m224442a(context);
    }
}
