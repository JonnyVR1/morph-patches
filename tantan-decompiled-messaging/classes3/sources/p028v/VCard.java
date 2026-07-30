package p028v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import l.b9c0;
import l.t0c0;
import l.t100;
import l.u2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VCard extends CardView {
    public VCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.v3, i, 0);
            int i2 = typedArrayObtainStyledAttributes.getInt(b9c0.w3, 0);
            typedArrayObtainStyledAttributes.recycle();
            if (i2 != 0) {
                setCardStyle(i2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setCardStyle(int i) {
        switch (i) {
            case 1:
                setCardElevation(0.0f);
                setRadius(t100.i);
                setCardBackgroundColor(getContext().getResources().getColor(t0c0.s));
                break;
            case 2:
                setCardElevation(0.0f);
                setRadius(t100.j);
                setBackgroundResource(u2c0.i);
                break;
            case 3:
                setCardElevation(0.0f);
                setRadius(t100.m);
                setCardBackgroundColor(getContext().getResources().getColor(t0c0.s));
                break;
            case 4:
                setCardElevation(0.0f);
                setRadius(t100.m);
                setBackgroundResource(u2c0.h);
                break;
            case 5:
                setCardElevation(0.0f);
                setRadius(t100.q);
                setCardBackgroundColor(getContext().getResources().getColor(t0c0.s));
                break;
            case 6:
                setCardElevation(0.0f);
                setRadius(t100.q);
                setBackgroundResource(u2c0.g);
                break;
        }
    }

    public VCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VCard(Context context) {
        this(context, null);
    }
}
