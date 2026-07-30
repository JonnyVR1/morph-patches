package p151v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import p153l.abc0;
import p153l.hhc0;
import p153l.qa00;
import p153l.z8c0;

/* JADX INFO: loaded from: classes3.dex */
public class VCard extends CardView {
    public VCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109845v3, i, 0);
            int i2 = typedArrayObtainStyledAttributes.getInt(hhc0.f109852w3, 0);
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
                setRadius(qa00.f156322i);
                setCardBackgroundColor(getContext().getResources().getColor(z8c0.f203358s));
                break;
            case 2:
                setCardElevation(0.0f);
                setRadius(qa00.f156323j);
                setBackgroundResource(abc0.f69466i);
                break;
            case 3:
                setCardElevation(0.0f);
                setRadius(qa00.f156326m);
                setCardBackgroundColor(getContext().getResources().getColor(z8c0.f203358s));
                break;
            case 4:
                setCardElevation(0.0f);
                setRadius(qa00.f156326m);
                setBackgroundResource(abc0.f69458h);
                break;
            case 5:
                setCardElevation(0.0f);
                setRadius(qa00.f156330q);
                setCardBackgroundColor(getContext().getResources().getColor(z8c0.f203358s));
                break;
            case 6:
                setCardElevation(0.0f);
                setRadius(qa00.f156330q);
                setBackgroundResource(abc0.f69450g);
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
