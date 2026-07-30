package p147v;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import p149l.b9c0;
import p149l.t0c0;

/* JADX INFO: loaded from: classes3.dex */
public class VProgress extends ProgressBar {
    public VProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (attributeSet == null) {
            setProgressColor(context.getResources().getColor(t0c0.f167168t));
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74495p4, i, 0);
        int color = typedArrayObtainStyledAttributes.getColor(b9c0.f74502q4, context.getResources().getColor(t0c0.f167168t));
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
