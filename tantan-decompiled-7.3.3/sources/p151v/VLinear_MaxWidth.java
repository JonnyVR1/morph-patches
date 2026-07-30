package p151v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.PlaybackException;

/* JADX INFO: loaded from: classes3.dex */
public class VLinear_MaxWidth extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public int f210064a;

    public VLinear_MaxWidth(Context context) {
        super(context);
        this.f210064a = PlaybackException.CUSTOM_ERROR_CODE_BASE;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.f210064a), View.MeasureSpec.getMode(i)), i2);
    }

    public void setMaxWidth(int i) {
        this.f210064a = i;
    }

    public VLinear_MaxWidth(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210064a = PlaybackException.CUSTOM_ERROR_CODE_BASE;
    }

    public VLinear_MaxWidth(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f210064a = PlaybackException.CUSTOM_ERROR_CODE_BASE;
    }
}
