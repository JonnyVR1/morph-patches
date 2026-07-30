package p028v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import l.b9c0;
import l.t100;
import l.u2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VOnlineIndicator extends View {

    /* JADX INFO: renamed from: a */
    public boolean f12838a;

    /* JADX INFO: renamed from: b */
    public int f12839b;

    public VOnlineIndicator(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (attributeSet == null) {
            setIndicatorStyle(1);
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.Z3, i, 0);
        setIndicatorStyle(typedArrayObtainStyledAttributes.getInt(b9c0.a4, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = t100.j;
        setMeasuredDimension(i3, i3);
    }

    public void setDarkMode(boolean z) {
        this.f12838a = z;
        setIndicatorStyle(this.f12839b);
    }

    public void setIndicatorStyle(int i) {
        this.f12839b = i;
        if (this.f12838a) {
            if (i == 2) {
                setBackgroundResource(u2c0.r);
                return;
            } else {
                setBackgroundResource(u2c0.p);
                return;
            }
        }
        if (i == 2) {
            setBackgroundResource(u2c0.q);
        } else {
            setBackgroundResource(u2c0.o);
        }
    }

    public VOnlineIndicator(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VOnlineIndicator(Context context) {
        this(context, null);
    }
}
