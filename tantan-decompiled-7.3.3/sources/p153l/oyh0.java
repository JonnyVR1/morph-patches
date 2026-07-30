package p153l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public class oyh0 {
    /* JADX INFO: renamed from: a */
    public static void m169866a(Drawable drawable, TextView textView, TypedArray typedArray, Context context, boolean z, int i) {
        Drawable drawable2 = typedArray.getDrawable(i);
        if (drawable2 != null) {
            if (z) {
                bnl0.m105563k(textView, drawable2);
            } else {
                bnl0.m105565l(textView, drawable2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m169867b(TextView textView, Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109756i5, i, 0);
        m169866a(null, textView, typedArrayObtainStyledAttributes, context, true, hhc0.f109812q5);
        m169866a(null, textView, typedArrayObtainStyledAttributes, context, false, hhc0.f109819r5);
        typedArrayObtainStyledAttributes.recycle();
    }
}
