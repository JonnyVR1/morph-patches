package p147v;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import p149l.ikh0;

/* JADX INFO: loaded from: classes3.dex */
public class VImage_Squared extends AppCompatImageView {
    public VImage_Squared(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int iM136799a = ikh0.m136799a(i, i2);
        super.onMeasure(iM136799a, iM136799a);
    }

    public VImage_Squared(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VImage_Squared(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
