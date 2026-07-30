package p003l;

import android.graphics.RectF;
import android.view.View;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class dic0 {

    /* JADX INFO: renamed from: a */
    public static final float f3006a = t100.d(16.0f);

    /* JADX INFO: renamed from: b */
    public static final float f3007b = t100.d(8.0f);

    /* JADX INFO: renamed from: a */
    public static RectF m3586a(View view, View view2, boolean z) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        view2.getLocationOnScreen(iArr2);
        int width = view2.getWidth();
        int height = view2.getHeight();
        int height2 = view.getHeight();
        RectF rectF = new RectF();
        int i = iArr2[0] - iArr[0];
        int i2 = iArr2[1] - iArr[1];
        int i3 = height + i2;
        float f = i;
        float f2 = width + i;
        rectF.set(f, i2, f2, i3);
        if (z) {
            rectF.set(f, height2 - i2, f2, height2 - i3);
        }
        return rectF;
    }
}
