package p153l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.AnyRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class doj0 {
    /* JADX INFO: renamed from: a */
    public static boolean m117294a(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i, boolean z) {
        return !m117303j(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    @ColorInt
    /* JADX INFO: renamed from: b */
    public static int m117295b(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i, @ColorInt int i2) {
        return !m117303j(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static ColorStateList m117296c(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme, @NonNull String str, @StyleableRes int i) {
        if (!m117303j(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 != 2) {
            return (i2 < 28 || i2 > 31) ? ff5.m125354d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme) : m117297d(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static ColorStateList m117297d(@NonNull TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* JADX INFO: renamed from: e */
    public static xo5 m117298e(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme, @NonNull String str, @StyleableRes int i, @ColorInt int i2) {
        if (m117303j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return xo5.m212450b(typedValue.data);
            }
            xo5 xo5VarM212453g = xo5.m212453g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (xo5VarM212453g != null) {
                return xo5VarM212453g;
            }
        }
        return xo5.m212450b(i2);
    }

    /* JADX INFO: renamed from: f */
    public static float m117299f(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i, float f) {
        return !m117303j(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* JADX INFO: renamed from: g */
    public static int m117300g(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i, int i2) {
        return !m117303j(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    @AnyRes
    /* JADX INFO: renamed from: h */
    public static int m117301h(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i, @AnyRes int i2) {
        return !m117303j(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static String m117302i(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i) {
        if (m117303j(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m117303j(@NonNull XmlPullParser xmlPullParser, @NonNull String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public static TypedArray m117304k(@NonNull Resources resources, @Nullable Resources.Theme theme, @NonNull AttributeSet attributeSet, @NonNull int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
