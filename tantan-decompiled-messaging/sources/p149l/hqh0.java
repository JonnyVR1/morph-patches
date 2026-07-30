package p149l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public class hqh0 {
    /* JADX INFO: renamed from: a */
    public static void m132453a(Drawable drawable, TextView textView, TypedArray typedArray, Context context, boolean z, int i) {
        Drawable drawable2 = typedArray.getDrawable(i);
        if (drawable2 != null) {
            if (z) {
                xdl0.m208383k(textView, drawable2);
            } else {
                xdl0.m208385l(textView, drawable2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m132454b(TextView textView, Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74447i5, i, 0);
        m132453a(null, textView, typedArrayObtainStyledAttributes, context, true, b9c0.f74503q5);
        m132453a(null, textView, typedArrayObtainStyledAttributes, context, false, b9c0.f74510r5);
        typedArrayObtainStyledAttributes.recycle();
    }
}
