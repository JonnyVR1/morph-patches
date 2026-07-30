package p151v;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import p153l.abc0;

/* JADX INFO: loaded from: classes3.dex */
public class RedPointView extends AppCompatTextView {
    public RedPointView(Context context) {
        this(context, null);
    }

    public void setDarkMode(boolean z) {
        if (z) {
            setBackgroundResource(abc0.f69434e);
        } else {
            setBackgroundResource(abc0.f69426d);
        }
    }

    public RedPointView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RedPointView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
