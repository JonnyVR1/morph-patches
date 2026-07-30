package p147v;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class VScroll_Horizontal extends HorizontalScrollView {
    public VScroll_Horizontal(Context context) {
        super(context);
        m223196a(context);
    }

    /* JADX INFO: renamed from: a */
    private void m223196a(Context context) {
        if (xdl0.f192400b) {
            setOverScrollMode(2);
        }
    }

    public VScroll_Horizontal(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m223196a(context);
    }

    public VScroll_Horizontal(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m223196a(context);
    }
}
