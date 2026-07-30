package p028v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import l.b9c0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VIcon extends VBaseIcon {

    /* JADX INFO: renamed from: d */
    public int f12751d;

    /* JADX WARN: Multi-variable type inference failed */
    public VIcon(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12751d = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.L3, i, 0);
            int i2 = typedArrayObtainStyledAttributes.getInt(b9c0.M3, 0);
            typedArrayObtainStyledAttributes.recycle();
            setIconStyle(i2);
        }
        setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        int i3 = this.f12751d;
        if (i3 == 0) {
            super/*android.view.View*/.onMeasure(i, i2);
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
                this.f12751d = t100.j;
                break;
            case 2:
                this.f12751d = t100.m;
                break;
            case 3:
                this.f12751d = t100.q;
                break;
            case 4:
                this.f12751d = t100.v;
                break;
            case 5:
                this.f12751d = t100.y;
                break;
            case 6:
                this.f12751d = t100.A;
                break;
            case 7:
                this.f12751d = t100.E;
                break;
            case 8:
                this.f12751d = t100.G;
                break;
            case 9:
                this.f12751d = t100.J;
                break;
            case 10:
                this.f12751d = t100.d(44.0f);
                break;
            case 11:
                this.f12751d = t100.d(36.0f);
                break;
            default:
                this.f12751d = 0;
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
