package p153l;

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
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationLoadingType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class e9k {
    /* JADX INFO: renamed from: a */
    public static C16736a m119929a(@Nullable C16736a c16736a, @ColorInt int i, @ColorInt int i2, boolean z, @ColorInt int i3) {
        if (c16736a != null) {
            return c16736a;
        }
        return z ? new C16736a(i, i3, i2) : new C16736a(i, i2);
    }

    /* JADX INFO: renamed from: b */
    public static Shader m119930b(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (!name.equals(BLiveOperationLoadingType.gradient)) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayM117304k = doj0.m117304k(resources, theme, attributeSet, aic0.f71520z);
        float fM117299f = doj0.m117299f(typedArrayM117304k, xmlPullParser, "startX", aic0.f71488I, 0.0f);
        float fM117299f2 = doj0.m117299f(typedArrayM117304k, xmlPullParser, "startY", aic0.f71489J, 0.0f);
        float fM117299f3 = doj0.m117299f(typedArrayM117304k, xmlPullParser, "endX", aic0.f71490K, 0.0f);
        float fM117299f4 = doj0.m117299f(typedArrayM117304k, xmlPullParser, "endY", aic0.f71491L, 0.0f);
        float fM117299f5 = doj0.m117299f(typedArrayM117304k, xmlPullParser, "centerX", aic0.f71483D, 0.0f);
        float fM117299f6 = doj0.m117299f(typedArrayM117304k, xmlPullParser, "centerY", aic0.f71484E, 0.0f);
        int iM117300g = doj0.m117300g(typedArrayM117304k, xmlPullParser, "type", aic0.f71482C, 0);
        int iM117295b = doj0.m117295b(typedArrayM117304k, xmlPullParser, "startColor", aic0.f71480A, 0);
        boolean zM117303j = doj0.m117303j(xmlPullParser, "centerColor");
        int iM117295b2 = doj0.m117295b(typedArrayM117304k, xmlPullParser, "centerColor", aic0.f71487H, 0);
        int iM117295b3 = doj0.m117295b(typedArrayM117304k, xmlPullParser, "endColor", aic0.f71481B, 0);
        int iM117300g2 = doj0.m117300g(typedArrayM117304k, xmlPullParser, "tileMode", aic0.f71486G, 0);
        float fM117299f7 = doj0.m117299f(typedArrayM117304k, xmlPullParser, "gradientRadius", aic0.f71485F, 0.0f);
        typedArrayM117304k.recycle();
        C16736a c16736aM119929a = m119929a(m119931c(resources, xmlPullParser, attributeSet, theme), iM117295b, iM117295b3, zM117303j, iM117295b2);
        if (iM117300g != 1) {
            return iM117300g != 2 ? new LinearGradient(fM117299f, fM117299f2, fM117299f3, fM117299f4, c16736aM119929a.f92648a, c16736aM119929a.f92649b, m119932d(iM117300g2)) : new SweepGradient(fM117299f5, fM117299f6, c16736aM119929a.f92648a, c16736aM119929a.f92649b);
        }
        if (fM117299f7 > 0.0f) {
            return new RadialGradient(fM117299f5, fM117299f6, fM117299f7, c16736aM119929a.f92648a, c16736aM119929a.f92649b, m119932d(iM117300g2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX INFO: renamed from: c */
    public static C16736a m119931c(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
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
                TypedArray typedArrayM117304k = doj0.m117304k(resources, theme, attributeSet, aic0.f71492M);
                boolean zHasValue = typedArrayM117304k.hasValue(aic0.f71493N);
                boolean zHasValue2 = typedArrayM117304k.hasValue(aic0.f71494O);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color = typedArrayM117304k.getColor(aic0.f71493N, 0);
                float f = typedArrayM117304k.getFloat(aic0.f71494O, 0.0f);
                typedArrayM117304k.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f));
            }
        }
        if (arrayList2.size() > 0) {
            return new C16736a(arrayList2, arrayList);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static Shader.TileMode m119932d(int i) {
        if (i != 1) {
            return i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    /* JADX INFO: renamed from: l.e9k$a */
    public static final class C16736a {

        /* JADX INFO: renamed from: a */
        public final int[] f92648a;

        /* JADX INFO: renamed from: b */
        public final float[] f92649b;

        public C16736a(@NonNull List<Integer> list, @NonNull List<Float> list2) {
            int size = list.size();
            this.f92648a = new int[size];
            this.f92649b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f92648a[i] = list.get(i).intValue();
                this.f92649b[i] = list2.get(i).floatValue();
            }
        }

        public C16736a(@ColorInt int i, @ColorInt int i2) {
            this.f92648a = new int[]{i, i2};
            this.f92649b = new float[]{0.0f, 1.0f};
        }

        public C16736a(@ColorInt int i, @ColorInt int i2, @ColorInt int i3) {
            this.f92648a = new int[]{i, i2, i3};
            this.f92649b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
