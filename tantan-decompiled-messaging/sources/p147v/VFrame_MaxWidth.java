package p147v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.PlaybackException;

/* JADX INFO: loaded from: classes3.dex */
public class VFrame_MaxWidth extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public int f209115a;

    public VFrame_MaxWidth(Context context) {
        super(context);
        this.f209115a = PlaybackException.CUSTOM_ERROR_CODE_BASE;
    }

    public int getMaxWidth() {
        return this.f209115a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.f209115a), View.MeasureSpec.getMode(i)), i2);
    }

    public void setMaxWidth(int i) {
        this.f209115a = i;
    }

    public VFrame_MaxWidth(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209115a = PlaybackException.CUSTOM_ERROR_CODE_BASE;
    }

    public VFrame_MaxWidth(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209115a = PlaybackException.CUSTOM_ERROR_CODE_BASE;
    }
}
