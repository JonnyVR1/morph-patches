package p149l;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationLoadingType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class m6k {
    /* JADX INFO: renamed from: a */
    public static C18402a m153240a(@Nullable C18402a c18402a, @ColorInt int i, @ColorInt int i2, boolean z, @ColorInt int i3) {
        if (c18402a != null) {
            return c18402a;
        }
        return z ? new C18402a(i, i3, i2) : new C18402a(i, i2);
    }

    /* JADX INFO: renamed from: b */
    public static Shader m153241b(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (!name.equals(BLiveOperationLoadingType.gradient)) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayM218353k = zej0.m218353k(resources, theme, attributeSet, u9c0.f175251z);
        float fM218348f = zej0.m218348f(typedArrayM218353k, xmlPullParser, "startX", u9c0.f175219I, 0.0f);
        float fM218348f2 = zej0.m218348f(typedArrayM218353k, xmlPullParser, "startY", u9c0.f175220J, 0.0f);
        float fM218348f3 = zej0.m218348f(typedArrayM218353k, xmlPullParser, "endX", u9c0.f175221K, 0.0f);
        float fM218348f4 = zej0.m218348f(typedArrayM218353k, xmlPullParser, "endY", u9c0.f175222L, 0.0f);
        float fM218348f5 = zej0.m218348f(typedArrayM218353k, xmlPullParser, "centerX", u9c0.f175214D, 0.0f);
        float fM218348f6 = zej0.m218348f(typedArrayM218353k, xmlPullParser, "centerY", u9c0.f175215E, 0.0f);
        int iM218349g = zej0.m218349g(typedArrayM218353k, xmlPullParser, "type", u9c0.f175213C, 0);
        int iM218344b = zej0.m218344b(typedArrayM218353k, xmlPullParser, "startColor", u9c0.f175211A, 0);
        boolean zM218352j = zej0.m218352j(xmlPullParser, "centerColor");
        int iM218344b2 = zej0.m218344b(typedArrayM218353k, xmlPullParser, "centerColor", u9c0.f175218H, 0);
        int iM218344b3 = zej0.m218344b(typedArrayM218353k, xmlPullParser, "endColor", u9c0.f175212B, 0);
        int iM218349g2 = zej0.m218349g(typedArrayM218353k, xmlPullParser, "tileMode", u9c0.f175217G, 0);
        float fM218348f7 = zej0.m218348f(typedArrayM218353k, xmlPullParser, "gradientRadius", u9c0.f175216F, 0.0f);
        typedArrayM218353k.recycle();
        C18402a c18402aM153240a = m153240a(m153242c(resources, xmlPullParser, attributeSet, theme), iM218344b, iM218344b3, zM218352j, iM218344b2);
        if (iM218349g != 1) {
            return iM218349g != 2 ? new LinearGradient(fM218348f, fM218348f2, fM218348f3, fM218348f4, c18402aM153240a.f131704a, c18402aM153240a.f131705b, m153243d(iM218349g2)) : new SweepGradient(fM218348f5, fM218348f6, c18402aM153240a.f131704a, c18402aM153240a.f131705b);
        }
        if (fM218348f7 > 0.0f) {
            return new RadialGradient(fM218348f5, fM218348f6, fM218348f7, c18402aM153240a.f131704a, c18402aM153240a.f131705b, m153243d(iM218349g2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX INFO: renamed from: c */
    public static C18402a m153242c(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals(Item.TYPE)) {
                TypedArray typedArrayM218353k = zej0.m218353k(resources, theme, attributeSet, u9c0.f175223M);
                boolean zHasValue = typedArrayM218353k.hasValue(u9c0.f175224N);
                boolean zHasValue2 = typedArrayM218353k.hasValue(u9c0.f175225O);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color = typedArrayM218353k.getColor(u9c0.f175224N, 0);
                float f = typedArrayM218353k.getFloat(u9c0.f175225O, 0.0f);
                typedArrayM218353k.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f));
            }
        }
        if (arrayList2.size() > 0) {
            return new C18402a(arrayList2, arrayList);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static Shader.TileMode m153243d(int i) {
        if (i != 1) {
            return i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    /* JADX INFO: renamed from: l.m6k$a */
    public static final class C18402a {

        /* JADX INFO: renamed from: a */
        public final int[] f131704a;

        /* JADX INFO: renamed from: b */
        public final float[] f131705b;

        public C18402a(@NonNull List<Integer> list, @NonNull List<Float> list2) {
            int size = list.size();
            this.f131704a = new int[size];
            this.f131705b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f131704a[i] = list.get(i).intValue();
                this.f131705b[i] = list2.get(i).floatValue();
            }
        }

        public C18402a(@ColorInt int i, @ColorInt int i2) {
            this.f131704a = new int[]{i, i2};
            this.f131705b = new float[]{0.0f, 1.0f};
        }

        public C18402a(@ColorInt int i, @ColorInt int i2, @ColorInt int i3) {
            this.f131704a = new int[]{i, i2, i3};
            this.f131705b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
