package p028v;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import org.slf4j.Marker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VBadge extends AppCompatTextView {

    /* JADX INFO: renamed from: a */
    public int f12615a;

    /* JADX INFO: renamed from: b */
    public int f12616b;

    public VBadge(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12615a = 0;
        this.f12616b = 99;
    }

    public int getCount() {
        return this.f12615a;
    }

    public int getMaxCount() {
        return this.f12616b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public final void m11401h() {
        int i = this.f12615a;
        if (i <= 0) {
            setText("0");
            return;
        }
        if (i <= this.f12616b) {
            setText("" + this.f12615a);
        } else {
            setText(this.f12616b + Marker.ANY_NON_NULL_MARKER);
        }
    }

    public void setCount(int i) {
        this.f12615a = i;
        m11401h();
    }

    public void setMaxCount(int i) {
        this.f12616b = i;
        m11401h();
    }

    public VBadge(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VBadge(Context context) {
        this(context, null);
    }
}
