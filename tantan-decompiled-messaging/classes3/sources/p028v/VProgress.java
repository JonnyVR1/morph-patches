package p028v;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import l.b9c0;
import l.t0c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VProgress extends ProgressBar {
    public VProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (attributeSet == null) {
            setProgressColor(context.getResources().getColor(t0c0.t));
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.p4, i, 0);
        int color = typedArrayObtainStyledAttributes.getColor(b9c0.q4, context.getResources().getColor(t0c0.t));
        typedArrayObtainStyledAttributes.recycle();
        setProgressColor(color);
    }

    public void setProgressColor(int i) {
        Drawable drawableFindDrawableByLayerId;
        Drawable drawableMutate = getProgressDrawable().mutate();
        if (!(drawableMutate instanceof LayerDrawable) || (drawableFindDrawableByLayerId = ((LayerDrawable) drawableMutate).findDrawableByLayerId(R.id.progress)) == null) {
            return;
        }
        drawableFindDrawableByLayerId.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        setProgressDrawable(drawableMutate);
    }

    public VProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VProgress(Context context) {
        this(context, null);
    }
}
