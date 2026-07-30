package p028v;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import p003l.ikh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VImage_Squared extends AppCompatImageView {
    public VImage_Squared(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        int iM5155a = ikh0.m5155a(i, i2);
        super/*android.view.View*/.onMeasure(iM5155a, iM5155a);
    }

    public VImage_Squared(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VImage_Squared(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
