package p151v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p153l.abc0;
import p153l.hhc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes3.dex */
public class VOnlineIndicator extends View {

    /* JADX INFO: renamed from: a */
    public boolean f210135a;

    /* JADX INFO: renamed from: b */
    public int f210136b;

    public VOnlineIndicator(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (attributeSet == null) {
            setIndicatorStyle(1);
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109692Z3, i, 0);
        setIndicatorStyle(typedArrayObtainStyledAttributes.getInt(hhc0.f109699a4, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = qa00.f156323j;
        setMeasuredDimension(i3, i3);
    }

    public void setDarkMode(boolean z) {
        this.f210135a = z;
        setIndicatorStyle(this.f210136b);
    }

    public void setIndicatorStyle(int i) {
        this.f210136b = i;
        if (this.f210135a) {
            if (i == 2) {
                setBackgroundResource(abc0.f69538r);
                return;
            } else {
                setBackgroundResource(abc0.f69522p);
                return;
            }
        }
        if (i == 2) {
            setBackgroundResource(abc0.f69530q);
        } else {
            setBackgroundResource(abc0.f69514o);
        }
    }

    public VOnlineIndicator(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VOnlineIndicator(Context context) {
        this(context, null);
    }
}
