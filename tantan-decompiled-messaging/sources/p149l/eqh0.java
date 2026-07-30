package p149l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public class eqh0 {

    /* JADX INFO: renamed from: a */
    public static final String[] f92802a;

    /* JADX INFO: renamed from: b */
    public static final Typeface[] f92803b;

    static {
        String[] strArr = {"fonts/Roboto-Thin.ttf", "fonts/Roboto-Light.ttf", "fonts/Roboto-Regular.ttf", "fonts/Roboto-Medium.ttf", "fonts/Roboto-Bold.ttf", "fonts/Roboto-Black.ttf", "fonts/RobotoCondensed-Light.ttf", "fonts/RobotoCondensed-Regular.ttf", "fonts/RobotoCondensed-Bold.ttf", "fonts/Roboto-Italic.ttf", "fonts/Semibold-Italic.ttf", "fonts/hyqiheidigit.ttf"};
        f92802a = strArr;
        f92803b = new Typeface[strArr.length];
    }

    /* JADX INFO: renamed from: a */
    public static void m117750a(TextView textView, Context context, AttributeSet attributeSet, int i) {
        if (textView.isInEditMode()) {
            return;
        }
        Resources.Theme theme = context.getTheme();
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, b9c0.f74447i5, 0, i);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(b9c0.f74454j5, -1);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = resourceId != -1 ? theme.obtainStyledAttributes(resourceId, b9c0.f74447i5) : null;
        int i2 = 2;
        if (typedArrayObtainStyledAttributes2 != null) {
            int indexCount = typedArrayObtainStyledAttributes2.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes2.getIndex(i3);
                int i4 = b9c0.f74496p5;
                if (index == i4) {
                    i2 = typedArrayObtainStyledAttributes2.getInt(i4, i2);
                }
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, b9c0.f74447i5, i, 0);
            i2 = typedArrayObtainStyledAttributes3.getInt(b9c0.f74496p5, i2);
            typedArrayObtainStyledAttributes3.recycle();
        }
        if (i2 == 4) {
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        } else {
            textView.setTypeface(m117752c(i2));
        }
        textView.setPaintFlags(textView.getPaintFlags() | 128);
    }

    /* JADX INFO: renamed from: b */
    public static void m117751b(TextView textView, Context context, int i) {
        textView.setTypeface(textView.getTypeface());
    }

    /* JADX INFO: renamed from: c */
    public static Typeface m117752c(int i) {
        String[] strArr = f92802a;
        if (i >= strArr.length) {
            i = 2;
        }
        return fqh0.m122725b(strArr[i]);
    }
}
