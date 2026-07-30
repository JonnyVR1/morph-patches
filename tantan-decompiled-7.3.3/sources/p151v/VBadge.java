package p151v;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes3.dex */
public class VBadge extends AppCompatTextView {

    /* JADX INFO: renamed from: a */
    public int f209912a;

    /* JADX INFO: renamed from: b */
    public int f209913b;

    public VBadge(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209912a = 0;
        this.f209913b = 99;
    }

    public int getCount() {
        return this.f209912a;
    }

    public int getMaxCount() {
        return this.f209913b;
    }

    /* JADX INFO: renamed from: h */
    public final void m224174h() {
        int i = this.f209912a;
        if (i <= 0) {
            setText("0");
            return;
        }
        if (i <= this.f209913b) {
            setText("" + this.f209912a);
        } else {
            setText(this.f209913b + Marker.ANY_NON_NULL_MARKER);
        }
    }

    public void setCount(int i) {
        this.f209912a = i;
        m224174h();
    }

    public void setMaxCount(int i) {
        this.f209913b = i;
        m224174h();
    }

    public VBadge(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VBadge(Context context) {
        this(context, null);
    }
}
