package p147v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import p149l.b9c0;
import p149l.t100;

/* JADX INFO: loaded from: classes3.dex */
public class VIcon extends VBaseIcon {

    /* JADX INFO: renamed from: d */
    public int f209126d;

    public VIcon(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209126d = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74299L3, i, 0);
            int i2 = typedArrayObtainStyledAttributes.getInt(b9c0.f74305M3, 0);
            typedArrayObtainStyledAttributes.recycle();
            setIconStyle(i2);
        }
        setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.f209126d;
        if (i3 == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i3 = 0;
                } else {
                    i3 = size;
                }
            }
        } else if (size < i3) {
            i3 = size;
        }
        setMeasuredDimension(i3, i3);
    }

    public void setIconStyle(int i) {
        switch (i) {
            case 1:
                this.f209126d = t100.f167261j;
                break;
            case 2:
                this.f209126d = t100.f167264m;
                break;
            case 3:
                this.f209126d = t100.f167268q;
                break;
            case 4:
                this.f209126d = t100.f167273v;
                break;
            case 5:
                this.f209126d = t100.f167276y;
                break;
            case 6:
                this.f209126d = t100.f167226A;
                break;
            case 7:
                this.f209126d = t100.f167230E;
                break;
            case 8:
                this.f209126d = t100.f167232G;
                break;
            case 9:
                this.f209126d = t100.f167235J;
                break;
            case 10:
                this.f209126d = t100.m186890d(44.0f);
                break;
            case 11:
                this.f209126d = t100.m186890d(36.0f);
                break;
            default:
                this.f209126d = 0;
                break;
        }
    }

    public VIcon(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VIcon(Context context) {
        this(context, null);
    }
}
