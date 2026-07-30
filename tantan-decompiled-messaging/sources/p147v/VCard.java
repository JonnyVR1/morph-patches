package p147v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import p149l.b9c0;
import p149l.t0c0;
import p149l.t100;
import p149l.u2c0;

/* JADX INFO: loaded from: classes3.dex */
public class VCard extends CardView {
    public VCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74536v3, i, 0);
            int i2 = typedArrayObtainStyledAttributes.getInt(b9c0.f74543w3, 0);
            typedArrayObtainStyledAttributes.recycle();
            if (i2 != 0) {
                setCardStyle(i2);
            }
        }
    }

    private void setCardStyle(int i) {
        switch (i) {
            case 1:
                setCardElevation(0.0f);
                setRadius(t100.f167260i);
                setCardBackgroundColor(getContext().getResources().getColor(t0c0.f167167s));
                break;
            case 2:
                setCardElevation(0.0f);
                setRadius(t100.f167261j);
                setBackgroundResource(u2c0.f173346i);
                break;
            case 3:
                setCardElevation(0.0f);
                setRadius(t100.f167264m);
                setCardBackgroundColor(getContext().getResources().getColor(t0c0.f167167s));
                break;
            case 4:
                setCardElevation(0.0f);
                setRadius(t100.f167264m);
                setBackgroundResource(u2c0.f173338h);
                break;
            case 5:
                setCardElevation(0.0f);
                setRadius(t100.f167268q);
                setCardBackgroundColor(getContext().getResources().getColor(t0c0.f167167s));
                break;
            case 6:
                setCardElevation(0.0f);
                setRadius(t100.f167268q);
                setBackgroundResource(u2c0.f173330g);
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
