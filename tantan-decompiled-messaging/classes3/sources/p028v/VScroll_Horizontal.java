package p028v;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VScroll_Horizontal extends HorizontalScrollView {
    public VScroll_Horizontal(Context context) {
        super(context);
        m11680a(context);
    }

    /* JADX INFO: renamed from: a */
    private void m11680a(Context context) {
        if (xdl0.b) {
            setOverScrollMode(2);
        }
    }

    public VScroll_Horizontal(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m11680a(context);
    }

    public VScroll_Horizontal(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m11680a(context);
    }
}
