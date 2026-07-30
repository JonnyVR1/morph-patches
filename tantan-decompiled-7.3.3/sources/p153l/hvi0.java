package p153l;

import android.content.Context;
import android.content.res.TypedArray;

/* JADX INFO: loaded from: classes7.dex */
public class hvi0 {

    /* JADX INFO: renamed from: a */
    private static final int[] f111762a = {s8c0.f166805y};

    /* JADX INFO: renamed from: a */
    public static void m137324a(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f111762a);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(0);
        typedArrayObtainStyledAttributes.recycle();
        if (zHasValue) {
            return;
        }
        wg3.m206174a("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
    }
}
