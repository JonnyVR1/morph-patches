package p028v;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import l.u2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class RedPointView extends AppCompatTextView {
    public RedPointView(Context context) {
        this(context, null);
    }

    public void setDarkMode(boolean z) {
        if (z) {
            setBackgroundResource(u2c0.e);
        } else {
            setBackgroundResource(u2c0.d);
        }
    }

    public RedPointView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RedPointView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
