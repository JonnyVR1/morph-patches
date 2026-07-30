package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p153l.s8c0;
import p153l.su0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatRatingBar extends RatingBar {

    /* JADX INFO: renamed from: a */
    public final su0 f623a;

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        su0 su0Var = new su0(this);
        this.f623a = su0Var;
        su0Var.mo187979c(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmapM187978b = this.f623a.m187978b();
        if (bitmapM187978b != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapM187978b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, s8c0.f166773J);
    }

    public AppCompatRatingBar(Context context) {
        this(context, null);
    }
}
