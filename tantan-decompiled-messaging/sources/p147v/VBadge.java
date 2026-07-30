package p147v;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes3.dex */
public class VBadge extends AppCompatTextView {

    /* JADX INFO: renamed from: a */
    public int f208990a;

    /* JADX INFO: renamed from: b */
    public int f208991b;

    public VBadge(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f208990a = 0;
        this.f208991b = 99;
    }

    public int getCount() {
        return this.f208990a;
    }

    public int getMaxCount() {
        return this.f208991b;
    }

    /* JADX INFO: renamed from: h */
    public final void m222928h() {
        int i = this.f208990a;
        if (i <= 0) {
            setText("0");
            return;
        }
        if (i <= this.f208991b) {
            setText("" + this.f208990a);
        } else {
            setText(this.f208991b + Marker.ANY_NON_NULL_MARKER);
        }
    }

    public void setCount(int i) {
        this.f208990a = i;
        m222928h();
    }

    public void setMaxCount(int i) {
        this.f208991b = i;
        m222928h();
    }

    public VBadge(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VBadge(Context context) {
        this(context, null);
    }
}
