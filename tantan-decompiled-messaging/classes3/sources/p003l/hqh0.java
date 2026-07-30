package p003l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import l.b9c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class hqh0 {
    /* JADX INFO: renamed from: a */
    public static void m4993a(Drawable drawable, TextView textView, TypedArray typedArray, Context context, boolean z, int i) {
        Drawable drawable2 = typedArray.getDrawable(i);
        if (drawable2 != null) {
            if (z) {
                xdl0.k(textView, drawable2);
            } else {
                xdl0.l(textView, drawable2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m4994b(TextView textView, Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.i5, i, 0);
        m4993a(null, textView, typedArrayObtainStyledAttributes, context, true, b9c0.q5);
        m4993a(null, textView, typedArrayObtainStyledAttributes, context, false, b9c0.r5);
        typedArrayObtainStyledAttributes.recycle();
    }
}
