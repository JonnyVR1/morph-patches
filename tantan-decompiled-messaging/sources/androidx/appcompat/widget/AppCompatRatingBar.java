package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p149l.mu0;
import p149l.n0c0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatRatingBar extends RatingBar {

    /* JADX INFO: renamed from: a */
    public final mu0 f623a;

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mu0 mu0Var = new mu0(this);
        this.f623a = mu0Var;
        mu0Var.mo156369c(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmapM156368b = this.f623a.m156368b();
        if (bitmapM156368b != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapM156368b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, n0c0.f136501J);
    }

    public AppCompatRatingBar(Context context) {
        this(context, null);
    }
}
