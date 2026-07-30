package p149l;

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
public class zej0 {
    /* JADX INFO: renamed from: a */
    public static boolean m218343a(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i, boolean z) {
        return !m218352j(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    @ColorInt
    /* JADX INFO: renamed from: b */
    public static int m218344b(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i, @ColorInt int i2) {
        return !m218352j(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static ColorStateList m218345c(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme, @NonNull String str, @StyleableRes int i) {
        if (!m218352j(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 != 2) {
            return (i2 < 28 || i2 > 31) ? fe5.m121021d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme) : m218346d(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static ColorStateList m218346d(@NonNull TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* JADX INFO: renamed from: e */
    public static tn5 m218347e(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme, @NonNull String str, @StyleableRes int i, @ColorInt int i2) {
        if (m218352j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return tn5.m189758b(typedValue.data);
            }
            tn5 tn5VarM189761g = tn5.m189761g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (tn5VarM189761g != null) {
                return tn5VarM189761g;
            }
        }
        return tn5.m189758b(i2);
    }

    /* JADX INFO: renamed from: f */
    public static float m218348f(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i, float f) {
        return !m218352j(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* JADX INFO: renamed from: g */
    public static int m218349g(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i, int i2) {
        return !m218352j(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    @AnyRes
    /* JADX INFO: renamed from: h */
    public static int m218350h(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i, @AnyRes int i2) {
        return !m218352j(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static String m218351i(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i) {
        if (m218352j(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m218352j(@NonNull XmlPullParser xmlPullParser, @NonNull String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public static TypedArray m218353k(@NonNull Resources resources, @Nullable Resources.Theme theme, @NonNull AttributeSet attributeSet, @NonNull int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
