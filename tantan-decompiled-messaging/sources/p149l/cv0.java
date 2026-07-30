package p149l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class cv0 {

    /* JADX INFO: renamed from: k */
    public static final RectF f82616k = new RectF();

    /* JADX INFO: renamed from: l */
    public static ConcurrentHashMap<String, Method> f82617l = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: m */
    public static ConcurrentHashMap<String, Field> f82618m = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    public int f82619a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f82620b = false;

    /* JADX INFO: renamed from: c */
    public float f82621c = -1.0f;

    /* JADX INFO: renamed from: d */
    public float f82622d = -1.0f;

    /* JADX INFO: renamed from: e */
    public float f82623e = -1.0f;

    /* JADX INFO: renamed from: f */
    public int[] f82624f = new int[0];

    /* JADX INFO: renamed from: g */
    public boolean f82625g = false;

    /* JADX INFO: renamed from: h */
    public TextPaint f82626h;

    /* JADX INFO: renamed from: i */
    public final TextView f82627i;

    /* JADX INFO: renamed from: j */
    public final Context f82628j;

    public cv0(TextView textView) {
        this.f82627i = textView;
        this.f82628j = textView.getContext();
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public static Method m108819l(@NonNull String str) {
        try {
            Method declaredMethod = f82617l.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                f82617l.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static <T> T m108820n(@NonNull Object obj, @NonNull String str, @NonNull T t) {
        try {
            return (T) m108819l(str).invoke(obj, null);
        } catch (Exception unused) {
            return t;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m108821A(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f82619a = 1;
        this.f82622d = f;
        this.f82623e = f2;
        this.f82621c = f3;
        this.f82625g = false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: a */
    public void m108822a() {
        if (m108834o()) {
            if (this.f82620b) {
                if (this.f82627i.getMeasuredHeight() <= 0 || this.f82627i.getMeasuredWidth() <= 0) {
                    return;
                }
                int i = Build.VERSION.SDK_INT;
                TextView textView = this.f82627i;
                int measuredWidth = i >= 29 ? textView.isHorizontallyScrollable() : ((Boolean) m108820n(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue() ? 1048576 : (this.f82627i.getMeasuredWidth() - this.f82627i.getTotalPaddingLeft()) - this.f82627i.getTotalPaddingRight();
                int height = (this.f82627i.getHeight() - this.f82627i.getCompoundPaddingBottom()) - this.f82627i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f82616k;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fM108827f = m108827f(rectF);
                        if (fM108827f != this.f82627i.getTextSize()) {
                            m108840u(0, fM108827f);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f82620b = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int[] m108823b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: c */
    public final void m108824c() {
        this.f82619a = 0;
        this.f82622d = -1.0f;
        this.f82623e = -1.0f;
        this.f82621c = -1.0f;
        this.f82624f = new int[0];
        this.f82620b = false;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public StaticLayout m108825d(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        return m108826e(charSequence, alignment, i, i2);
    }

    @RequiresApi(23)
    /* JADX INFO: renamed from: e */
    public final StaticLayout m108826e(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f82626h, i);
        StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(this.f82627i.getLineSpacingExtra(), this.f82627i.getLineSpacingMultiplier()).setIncludePad(this.f82627i.getIncludeFontPadding()).setBreakStrategy(this.f82627i.getBreakStrategy()).setHyphenationFrequency(this.f82627i.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            int i3 = Build.VERSION.SDK_INT;
            TextView textView = this.f82627i;
            builderObtain.setTextDirection(i3 >= 29 ? textView.getTextDirectionHeuristic() : (TextDirectionHeuristic) m108820n(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        } catch (ClassCastException unused) {
        }
        return builderObtain.build();
    }

    /* JADX INFO: renamed from: f */
    public final int m108827f(RectF rectF) {
        int length = this.f82624f.length;
        if (length == 0) {
            qkq0.m175383a("No available text sizes to choose from.");
            return 0;
        }
        int i = 1;
        int i2 = length - 1;
        int i3 = 0;
        while (true) {
            int[] iArr = this.f82624f;
            if (i > i2) {
                return iArr[i3];
            }
            int i4 = (i + i2) / 2;
            if (m108844y(iArr[i4], rectF)) {
                int i5 = i4 + 1;
                i3 = i;
                i = i5;
            } else {
                i3 = i4 - 1;
                i2 = i3;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: g */
    public int m108828g() {
        return Math.round(this.f82623e);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: h */
    public int m108829h() {
        return Math.round(this.f82622d);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: i */
    public int m108830i() {
        return Math.round(this.f82621c);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: j */
    public int[] m108831j() {
        return this.f82624f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: k */
    public int m108832k() {
        return this.f82619a;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: m */
    public void m108833m(int i) {
        TextPaint textPaint = this.f82626h;
        if (textPaint == null) {
            this.f82626h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f82626h.set(this.f82627i.getPaint());
        this.f82626h.setTextSize(i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: o */
    public boolean m108834o() {
        return m108845z() && this.f82619a != 0;
    }

    /* JADX INFO: renamed from: p */
    public void m108835p(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f82628j.obtainStyledAttributes(attributeSet, aac0.f68449g0, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(aac0.f68474l0)) {
            this.f82619a = typedArrayObtainStyledAttributes.getInt(aac0.f68474l0, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(aac0.f68469k0) ? typedArrayObtainStyledAttributes.getDimension(aac0.f68469k0, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(aac0.f68459i0) ? typedArrayObtainStyledAttributes.getDimension(aac0.f68459i0, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(aac0.f68454h0) ? typedArrayObtainStyledAttributes.getDimension(aac0.f68454h0, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(aac0.f68464j0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(aac0.f68464j0, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m108842w(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!m108845z()) {
            this.f82619a = 0;
            return;
        }
        if (this.f82619a == 1) {
            if (!this.f82625g) {
                DisplayMetrics displayMetrics = this.f82628j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m108821A(dimension2, dimension3, dimension);
            }
            m108841v();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: q */
    public void m108836q(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (m108845z()) {
            DisplayMetrics displayMetrics = this.f82628j.getResources().getDisplayMetrics();
            m108821A(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (m108841v()) {
                m108822a();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: r */
    public void m108837r(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        if (m108845z()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f82628j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f82624f = m108823b(iArrCopyOf);
                if (!m108843x()) {
                    kg3.m145878a("None of the preset sizes is valid: ", Arrays.toString(iArr));
                    return;
                }
            } else {
                this.f82625g = false;
            }
            if (m108841v()) {
                m108822a();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: s */
    public void m108838s(int i) {
        if (m108845z()) {
            if (i == 0) {
                m108824c();
                return;
            }
            if (i != 1) {
                k250.m144273a("Unknown auto-size text type: ", i);
                return;
            }
            DisplayMetrics displayMetrics = this.f82628j.getResources().getDisplayMetrics();
            m108821A(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m108841v()) {
                m108822a();
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m108839t(float f) {
        if (f != this.f82627i.getPaint().getTextSize()) {
            this.f82627i.getPaint().setTextSize(f);
            boolean zIsInLayout = this.f82627i.isInLayout();
            if (this.f82627i.getLayout() != null) {
                this.f82620b = false;
                try {
                    Method methodM108819l = m108819l("nullLayouts");
                    if (methodM108819l != null) {
                        methodM108819l.invoke(this.f82627i, null);
                    }
                } catch (Exception unused) {
                }
                TextView textView = this.f82627i;
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                this.f82627i.invalidate();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: u */
    public void m108840u(int i, float f) {
        Context context = this.f82628j;
        m108839t(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    /* JADX INFO: renamed from: v */
    public final boolean m108841v() {
        if (m108845z() && this.f82619a == 1) {
            if (!this.f82625g || this.f82624f.length == 0) {
                int iFloor = ((int) Math.floor((this.f82623e - this.f82622d) / this.f82621c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round(this.f82622d + (i * this.f82621c));
                }
                this.f82624f = m108823b(iArr);
            }
            this.f82620b = true;
        } else {
            this.f82620b = false;
        }
        return this.f82620b;
    }

    /* JADX INFO: renamed from: w */
    public final void m108842w(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f82624f = m108823b(iArr);
            m108843x();
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m108843x() {
        int[] iArr = this.f82624f;
        int length = iArr.length;
        boolean z = length > 0;
        this.f82625g = z;
        if (z) {
            this.f82619a = 1;
            this.f82622d = iArr[0];
            this.f82623e = iArr[length - 1];
            this.f82621c = -1.0f;
        }
        return z;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m108844y(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f82627i.getText();
        TransformationMethod transformationMethod = this.f82627i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f82627i)) != null) {
            text = transformation;
        }
        int maxLines = this.f82627i.getMaxLines();
        m108833m(i);
        StaticLayout staticLayoutM108825d = m108825d(text, (Layout.Alignment) m108820n(this.f82627i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutM108825d.getLineCount() <= maxLines && staticLayoutM108825d.getLineEnd(staticLayoutM108825d.getLineCount() - 1) == text.length())) && ((float) staticLayoutM108825d.getHeight()) <= rectF.bottom;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m108845z() {
        return !(this.f82627i instanceof AppCompatEditText);
    }
}
