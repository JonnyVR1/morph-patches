package p153l;

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
public class iv0 {

    /* JADX INFO: renamed from: k */
    public static final RectF f116995k = new RectF();

    /* JADX INFO: renamed from: l */
    public static ConcurrentHashMap<String, Method> f116996l = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: m */
    public static ConcurrentHashMap<String, Field> f116997m = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    public int f116998a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f116999b = false;

    /* JADX INFO: renamed from: c */
    public float f117000c = -1.0f;

    /* JADX INFO: renamed from: d */
    public float f117001d = -1.0f;

    /* JADX INFO: renamed from: e */
    public float f117002e = -1.0f;

    /* JADX INFO: renamed from: f */
    public int[] f117003f = new int[0];

    /* JADX INFO: renamed from: g */
    public boolean f117004g = false;

    /* JADX INFO: renamed from: h */
    public TextPaint f117005h;

    /* JADX INFO: renamed from: i */
    public final TextView f117006i;

    /* JADX INFO: renamed from: j */
    public final Context f117007j;

    public iv0(TextView textView) {
        this.f117006i = textView;
        this.f117007j = textView.getContext();
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public static Method m142249l(@NonNull String str) {
        try {
            Method declaredMethod = f116996l.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                f116996l.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static <T> T m142250n(@NonNull Object obj, @NonNull String str, @NonNull T t) {
        try {
            return (T) m142249l(str).invoke(obj, null);
        } catch (Exception unused) {
            return t;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m142251A(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f116998a = 1;
        this.f117001d = f;
        this.f117002e = f2;
        this.f117000c = f3;
        this.f117004g = false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: a */
    public void m142252a() {
        if (m142264o()) {
            if (this.f116999b) {
                if (this.f117006i.getMeasuredHeight() <= 0 || this.f117006i.getMeasuredWidth() <= 0) {
                    return;
                }
                int i = Build.VERSION.SDK_INT;
                TextView textView = this.f117006i;
                int measuredWidth = i >= 29 ? textView.isHorizontallyScrollable() : ((Boolean) m142250n(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue() ? 1048576 : (this.f117006i.getMeasuredWidth() - this.f117006i.getTotalPaddingLeft()) - this.f117006i.getTotalPaddingRight();
                int height = (this.f117006i.getHeight() - this.f117006i.getCompoundPaddingBottom()) - this.f117006i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f116995k;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fM142257f = m142257f(rectF);
                        if (fM142257f != this.f117006i.getTextSize()) {
                            m142270u(0, fM142257f);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f116999b = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int[] m142253b(int[] iArr) {
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
    public final void m142254c() {
        this.f116998a = 0;
        this.f117001d = -1.0f;
        this.f117002e = -1.0f;
        this.f117000c = -1.0f;
        this.f117003f = new int[0];
        this.f116999b = false;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public StaticLayout m142255d(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        return m142256e(charSequence, alignment, i, i2);
    }

    @RequiresApi(23)
    /* JADX INFO: renamed from: e */
    public final StaticLayout m142256e(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f117005h, i);
        StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(this.f117006i.getLineSpacingExtra(), this.f117006i.getLineSpacingMultiplier()).setIncludePad(this.f117006i.getIncludeFontPadding()).setBreakStrategy(this.f117006i.getBreakStrategy()).setHyphenationFrequency(this.f117006i.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            int i3 = Build.VERSION.SDK_INT;
            TextView textView = this.f117006i;
            builderObtain.setTextDirection(i3 >= 29 ? textView.getTextDirectionHeuristic() : (TextDirectionHeuristic) m142250n(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        } catch (ClassCastException unused) {
        }
        return builderObtain.build();
    }

    /* JADX INFO: renamed from: f */
    public final int m142257f(RectF rectF) {
        int length = this.f117003f.length;
        if (length == 0) {
            wtq0.m207906a("No available text sizes to choose from.");
            return 0;
        }
        int i = 1;
        int i2 = length - 1;
        int i3 = 0;
        while (true) {
            int[] iArr = this.f117003f;
            if (i > i2) {
                return iArr[i3];
            }
            int i4 = (i + i2) / 2;
            if (m142274y(iArr[i4], rectF)) {
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
    public int m142258g() {
        return Math.round(this.f117002e);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: h */
    public int m142259h() {
        return Math.round(this.f117001d);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: i */
    public int m142260i() {
        return Math.round(this.f117000c);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: j */
    public int[] m142261j() {
        return this.f117003f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: k */
    public int m142262k() {
        return this.f116998a;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: m */
    public void m142263m(int i) {
        TextPaint textPaint = this.f117005h;
        if (textPaint == null) {
            this.f117005h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f117005h.set(this.f117006i.getPaint());
        this.f117005h.setTextSize(i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: o */
    public boolean m142264o() {
        return m142275z() && this.f116998a != 0;
    }

    /* JADX INFO: renamed from: p */
    public void m142265p(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f117007j.obtainStyledAttributes(attributeSet, gic0.f104375g0, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(gic0.f104400l0)) {
            this.f116998a = typedArrayObtainStyledAttributes.getInt(gic0.f104400l0, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(gic0.f104395k0) ? typedArrayObtainStyledAttributes.getDimension(gic0.f104395k0, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(gic0.f104385i0) ? typedArrayObtainStyledAttributes.getDimension(gic0.f104385i0, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(gic0.f104380h0) ? typedArrayObtainStyledAttributes.getDimension(gic0.f104380h0, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(gic0.f104390j0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(gic0.f104390j0, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m142272w(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!m142275z()) {
            this.f116998a = 0;
            return;
        }
        if (this.f116998a == 1) {
            if (!this.f117004g) {
                DisplayMetrics displayMetrics = this.f117007j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m142251A(dimension2, dimension3, dimension);
            }
            m142271v();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: q */
    public void m142266q(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (m142275z()) {
            DisplayMetrics displayMetrics = this.f117007j.getResources().getDisplayMetrics();
            m142251A(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (m142271v()) {
                m142252a();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: r */
    public void m142267r(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        if (m142275z()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f117007j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f117003f = m142253b(iArrCopyOf);
                if (!m142273x()) {
                    yg3.m215829a("None of the preset sizes is valid: ", Arrays.toString(iArr));
                    return;
                }
            } else {
                this.f117004g = false;
            }
            if (m142271v()) {
                m142252a();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: s */
    public void m142268s(int i) {
        if (m142275z()) {
            if (i == 0) {
                m142254c();
                return;
            }
            if (i != 1) {
                za50.m219101a("Unknown auto-size text type: ", i);
                return;
            }
            DisplayMetrics displayMetrics = this.f117007j.getResources().getDisplayMetrics();
            m142251A(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m142271v()) {
                m142252a();
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m142269t(float f) {
        if (f != this.f117006i.getPaint().getTextSize()) {
            this.f117006i.getPaint().setTextSize(f);
            boolean zIsInLayout = this.f117006i.isInLayout();
            if (this.f117006i.getLayout() != null) {
                this.f116999b = false;
                try {
                    Method methodM142249l = m142249l("nullLayouts");
                    if (methodM142249l != null) {
                        methodM142249l.invoke(this.f117006i, null);
                    }
                } catch (Exception unused) {
                }
                TextView textView = this.f117006i;
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                this.f117006i.invalidate();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: u */
    public void m142270u(int i, float f) {
        Context context = this.f117007j;
        m142269t(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    /* JADX INFO: renamed from: v */
    public final boolean m142271v() {
        if (m142275z() && this.f116998a == 1) {
            if (!this.f117004g || this.f117003f.length == 0) {
                int iFloor = ((int) Math.floor((this.f117002e - this.f117001d) / this.f117000c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round(this.f117001d + (i * this.f117000c));
                }
                this.f117003f = m142253b(iArr);
            }
            this.f116999b = true;
        } else {
            this.f116999b = false;
        }
        return this.f116999b;
    }

    /* JADX INFO: renamed from: w */
    public final void m142272w(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f117003f = m142253b(iArr);
            m142273x();
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m142273x() {
        int[] iArr = this.f117003f;
        int length = iArr.length;
        boolean z = length > 0;
        this.f117004g = z;
        if (z) {
            this.f116998a = 1;
            this.f117001d = iArr[0];
            this.f117002e = iArr[length - 1];
            this.f117000c = -1.0f;
        }
        return z;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m142274y(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f117006i.getText();
        TransformationMethod transformationMethod = this.f117006i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f117006i)) != null) {
            text = transformation;
        }
        int maxLines = this.f117006i.getMaxLines();
        m142263m(i);
        StaticLayout staticLayoutM142255d = m142255d(text, (Layout.Alignment) m142250n(this.f117006i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutM142255d.getLineCount() <= maxLines && staticLayoutM142255d.getLineEnd(staticLayoutM142255d.getLineCount() - 1) == text.length())) && ((float) staticLayoutM142255d.getHeight()) <= rectF.bottom;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m142275z() {
        return !(this.f117006i instanceof AppCompatEditText);
    }
}
