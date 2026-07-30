package p149l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.XmlRes;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.data.Item;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class fe5 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<TypedValue> f97098a = new ThreadLocal<>();

    @NonNull
    /* JADX INFO: renamed from: a */
    public static ColorStateList m121018a(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m121019b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static ColorStateList m121019b(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m121022e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static TypedValue m121020c() {
        ThreadLocal<TypedValue> threadLocal = f97098a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static ColorStateList m121021d(@NonNull Resources resources, @XmlRes int i, @Nullable Resources.Theme theme) {
        try {
            return m121018a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static ColorStateList m121022e(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        int i = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrM219457a = new int[20];
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals(Item.TYPE)) {
                TypedArray typedArrayM121025h = m121025h(resources, theme, attributeSet, u9c0.f175226a);
                int resourceId = typedArrayM121025h.getResourceId(u9c0.f175227b, -1);
                if (resourceId == -1 || m121023f(resources, resourceId)) {
                    color = typedArrayM121025h.getColor(u9c0.f175227b, -65281);
                } else {
                    try {
                        color = m121018a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = typedArrayM121025h.getColor(u9c0.f175227b, -65281);
                    }
                }
                float f = 1.0f;
                if (typedArrayM121025h.hasValue(u9c0.f175228c)) {
                    f = typedArrayM121025h.getFloat(u9c0.f175228c, 1.0f);
                } else if (typedArrayM121025h.hasValue(u9c0.f175230e)) {
                    f = typedArrayM121025h.getFloat(u9c0.f175230e, 1.0f);
                }
                float f2 = (Build.VERSION.SDK_INT < 31 || !typedArrayM121025h.hasValue(u9c0.f175229d)) ? typedArrayM121025h.getFloat(u9c0.f175231f, -1.0f) : typedArrayM121025h.getFloat(u9c0.f175229d, -1.0f);
                typedArrayM121025h.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i3 = 0;
                for (int i4 = 0; i4 < attributeCount; i4++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != h0c0.f105208a && attributeNameResource != h0c0.f105209b) {
                        int i5 = i3 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i3] = attributeNameResource;
                        i3 = i5;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i3);
                iArrM219457a = znk.m219457a(iArrM219457a, i2, m121024g(color, f, f2));
                iArr = (int[][]) znk.m219458b(iArr, i2, iArrTrimStateSet);
                i2++;
            }
            i = 1;
        }
        int[] iArr3 = new int[i2];
        int[][] iArr4 = new int[i2][];
        System.arraycopy(iArrM219457a, 0, iArr3, 0, i2);
        System.arraycopy(iArr, 0, iArr4, 0, i2);
        return new ColorStateList(iArr4, iArr3);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m121023f(@NonNull Resources resources, @ColorRes int i) {
        TypedValue typedValueM121020c = m121020c();
        resources.getValue(i, typedValueM121020c, true);
        int i2 = typedValueM121020c.type;
        return i2 >= 28 && i2 <= 31;
    }

    @ColorInt
    /* JADX INFO: renamed from: g */
    public static int m121024g(@ColorInt int i, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d) float f, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 100.0d) float f2) {
        boolean z = f2 >= 0.0f && f2 <= 100.0f;
        if (f == 1.0f && !z) {
            return i;
        }
        int iM145807b = kex.m145807b((int) ((Color.alpha(i) * f) + 0.5f), 0, 255);
        if (z) {
            i84 i84VarM134939c = i84.m134939c(i);
            i = i84.m134943m(i84VarM134939c.m134949j(), i84VarM134939c.m134948i(), f2);
        }
        return (i & 16777215) | (iM145807b << 24);
    }

    /* JADX INFO: renamed from: h */
    public static TypedArray m121025h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
