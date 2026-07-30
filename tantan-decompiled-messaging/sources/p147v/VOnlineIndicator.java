package p147v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p149l.b9c0;
import p149l.t100;
import p149l.u2c0;

/* JADX INFO: loaded from: classes3.dex */
public class VOnlineIndicator extends View {

    /* JADX INFO: renamed from: a */
    public boolean f209213a;

    /* JADX INFO: renamed from: b */
    public int f209214b;

    public VOnlineIndicator(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (attributeSet == null) {
            setIndicatorStyle(1);
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74383Z3, i, 0);
        setIndicatorStyle(typedArrayObtainStyledAttributes.getInt(b9c0.f74390a4, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = t100.f167261j;
        setMeasuredDimension(i3, i3);
    }

    public void setDarkMode(boolean z) {
        this.f209213a = z;
        setIndicatorStyle(this.f209214b);
    }

    public void setIndicatorStyle(int i) {
        this.f209214b = i;
        if (this.f209213a) {
            if (i == 2) {
                setBackgroundResource(u2c0.f173418r);
                return;
            } else {
                setBackgroundResource(u2c0.f173402p);
                return;
            }
        }
        if (i == 2) {
            setBackgroundResource(u2c0.f173410q);
        } else {
            setBackgroundResource(u2c0.f173394o);
        }
    }

    public VOnlineIndicator(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VOnlineIndicator(Context context) {
        this(context, null);
    }
}
