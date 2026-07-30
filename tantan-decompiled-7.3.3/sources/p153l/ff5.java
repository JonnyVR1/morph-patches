package p153l;

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
import com.p051p1.mobile.putong.core.data.Item;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ff5 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<TypedValue> f98743a = new ThreadLocal<>();

    @NonNull
    /* JADX INFO: renamed from: a */
    public static ColorStateList m125351a(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m125352b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static ColorStateList m125352b(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m125355e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static TypedValue m125353c() {
        ThreadLocal<TypedValue> threadLocal = f98743a;
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
    public static ColorStateList m125354d(@NonNull Resources resources, @XmlRes int i, @Nullable Resources.Theme theme) {
        try {
            return m125351a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static ColorStateList m125355e(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        int i = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrM173356a = new int[20];
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals(Item.TYPE)) {
                TypedArray typedArrayM125358h = m125358h(resources, theme, attributeSet, aic0.f71495a);
                int resourceId = typedArrayM125358h.getResourceId(aic0.f71496b, -1);
                if (resourceId == -1 || m125356f(resources, resourceId)) {
                    color = typedArrayM125358h.getColor(aic0.f71496b, -65281);
                } else {
                    try {
                        color = m125351a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = typedArrayM125358h.getColor(aic0.f71496b, -65281);
                    }
                }
                float f = 1.0f;
                if (typedArrayM125358h.hasValue(aic0.f71497c)) {
                    f = typedArrayM125358h.getFloat(aic0.f71497c, 1.0f);
                } else if (typedArrayM125358h.hasValue(aic0.f71499e)) {
                    f = typedArrayM125358h.getFloat(aic0.f71499e, 1.0f);
                }
                float f2 = (Build.VERSION.SDK_INT < 31 || !typedArrayM125358h.hasValue(aic0.f71498d)) ? typedArrayM125358h.getFloat(aic0.f71500f, -1.0f) : typedArrayM125358h.getFloat(aic0.f71498d, -1.0f);
                typedArrayM125358h.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i3 = 0;
                for (int i4 = 0; i4 < attributeCount; i4++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != m8c0.f135170a && attributeNameResource != m8c0.f135171b) {
                        int i5 = i3 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i3] = attributeNameResource;
                        i3 = i5;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i3);
                iArrM173356a = pqk.m173356a(iArrM173356a, i2, m125357g(color, f, f2));
                iArr = (int[][]) pqk.m173357b(iArr, i2, iArrTrimStateSet);
                i2++;
            }
            i = 1;
        }
        int[] iArr3 = new int[i2];
        int[][] iArr4 = new int[i2][];
        System.arraycopy(iArrM173356a, 0, iArr3, 0, i2);
        System.arraycopy(iArr, 0, iArr4, 0, i2);
        return new ColorStateList(iArr4, iArr3);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m125356f(@NonNull Resources resources, @ColorRes int i) {
        TypedValue typedValueM125353c = m125353c();
        resources.getValue(i, typedValueM125353c, true);
        int i2 = typedValueM125353c.type;
        return i2 >= 28 && i2 <= 31;
    }

    @ColorInt
    /* JADX INFO: renamed from: g */
    public static int m125357g(@ColorInt int i, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d) float f, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 100.0d) float f2) {
        boolean z = f2 >= 0.0f && f2 <= 100.0f;
        if (f == 1.0f && !z) {
            return i;
        }
        int iM144942b = jhx.m144942b((int) ((Color.alpha(i) * f) + 0.5f), 0, 255);
        if (z) {
            h94 h94VarM134022c = h94.m134022c(i);
            i = h94.m134026m(h94VarM134022c.m134032j(), h94VarM134022c.m134031i(), f2);
        }
        return (i & 16777215) | (iM144942b << 24);
    }

    /* JADX INFO: renamed from: h */
    public static TypedArray m125358h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
