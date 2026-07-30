package p153l;

import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class kqc0 {

    /* JADX INFO: renamed from: a */
    public static final float f128209a = qa00.m175859d(16.0f);

    /* JADX INFO: renamed from: b */
    public static final float f128210b = qa00.m175859d(8.0f);

    /* JADX INFO: renamed from: a */
    public static RectF m150857a(View view, View view2, boolean z) {
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
