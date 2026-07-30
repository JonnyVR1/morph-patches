package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.ref.WeakReference;
import java.util.Locale;
import p149l.mji0;
import p149l.qkq0;
import p149l.w660;

/* JADX INFO: loaded from: classes.dex */
@ViewPager.InterfaceC0711e
public class PagerTitleStrip extends ViewGroup {

    /* JADX INFO: renamed from: o */
    public static final int[] f3211o = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* JADX INFO: renamed from: p */
    public static final int[] f3212p = {R.attr.textAllCaps};

    /* JADX INFO: renamed from: a */
    public ViewPager f3213a;

    /* JADX INFO: renamed from: b */
    public TextView f3214b;

    /* JADX INFO: renamed from: c */
    public TextView f3215c;

    /* JADX INFO: renamed from: d */
    public TextView f3216d;

    /* JADX INFO: renamed from: e */
    public int f3217e;

    /* JADX INFO: renamed from: f */
    public float f3218f;

    /* JADX INFO: renamed from: g */
    public int f3219g;

    /* JADX INFO: renamed from: h */
    public int f3220h;

    /* JADX INFO: renamed from: i */
    public boolean f3221i;

    /* JADX INFO: renamed from: j */
    public boolean f3222j;

    /* JADX INFO: renamed from: k */
    public final C0704a f3223k;

    /* JADX INFO: renamed from: l */
    public WeakReference<w660> f3224l;

    /* JADX INFO: renamed from: m */
    public int f3225m;

    /* JADX INFO: renamed from: n */
    public int f3226n;

    /* JADX INFO: renamed from: androidx.viewpager.widget.PagerTitleStrip$a */
    public class C0704a extends DataSetObserver implements ViewPager.InterfaceC0716j, ViewPager.InterfaceC0715i {

        /* JADX INFO: renamed from: a */
        public int f3227a;

        public C0704a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0715i
        public void onAdapterChanged(ViewPager viewPager, w660 w660Var, w660 w660Var2) {
            PagerTitleStrip.this.m4144b(w660Var, w660Var2);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.m4145c(pagerTitleStrip.f3213a.getCurrentItem(), PagerTitleStrip.this.f3213a.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f = pagerTitleStrip2.f3218f;
            if (f < 0.0f) {
                f = 0.0f;
            }
            pagerTitleStrip2.mo4142d(pagerTitleStrip2.f3213a.getCurrentItem(), f, true);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
            this.f3227a = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            PagerTitleStrip.this.mo4142d(i, f, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            if (this.f3227a == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.m4145c(pagerTitleStrip.f3213a.getCurrentItem(), PagerTitleStrip.this.f3213a.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f = pagerTitleStrip2.f3218f;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                pagerTitleStrip2.mo4142d(pagerTitleStrip2.f3213a.getCurrentItem(), f, true);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.PagerTitleStrip$b */
    public static class C0705b extends SingleLineTransformationMethod {

        /* JADX INFO: renamed from: a */
        public Locale f3229a;

        public C0705b(Context context) {
            this.f3229a = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f3229a);
            }
            return null;
        }
    }

    public PagerTitleStrip(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3217e = -1;
        this.f3218f = -1.0f;
        this.f3223k = new C0704a();
        TextView textView = new TextView(context);
        this.f3214b = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f3215c = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f3216d = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3211o);
        boolean z = false;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            mji0.m154821o(this.f3214b, resourceId);
            mji0.m154821o(this.f3215c, resourceId);
            mji0.m154821o(this.f3216d, resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            m4143a(0, dimensionPixelSize);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            this.f3214b.setTextColor(color);
            this.f3215c.setTextColor(color);
            this.f3216d.setTextColor(color);
        }
        this.f3220h = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        this.f3226n = this.f3215c.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        TextView textView4 = this.f3214b;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        this.f3215c.setEllipsize(truncateAt);
        this.f3216d.setEllipsize(truncateAt);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f3212p);
            z = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
        }
        TextView textView5 = this.f3214b;
        if (z) {
            setSingleLineAllCaps(textView5);
            setSingleLineAllCaps(this.f3215c);
            setSingleLineAllCaps(this.f3216d);
        } else {
            textView5.setSingleLine();
            this.f3215c.setSingleLine();
            this.f3216d.setSingleLine();
        }
        this.f3219g = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new C0705b(textView.getContext()));
    }

    /* JADX INFO: renamed from: a */
    public void m4143a(int i, float f) {
        this.f3214b.setTextSize(i, f);
        this.f3215c.setTextSize(i, f);
        this.f3216d.setTextSize(i, f);
    }

    /* JADX INFO: renamed from: b */
    public void m4144b(w660 w660Var, w660 w660Var2) {
        if (w660Var != null) {
            w660Var.unregisterDataSetObserver(this.f3223k);
            this.f3224l = null;
        }
        if (w660Var2 != null) {
            w660Var2.registerDataSetObserver(this.f3223k);
            this.f3224l = new WeakReference<>(w660Var2);
        }
        ViewPager viewPager = this.f3213a;
        if (viewPager != null) {
            this.f3217e = -1;
            this.f3218f = -1.0f;
            m4145c(viewPager.getCurrentItem(), w660Var2);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m4145c(int i, w660 w660Var) {
        int count = w660Var != null ? w660Var.getCount() : 0;
        this.f3221i = true;
        CharSequence pageTitle = null;
        this.f3214b.setText((i < 1 || w660Var == null) ? null : w660Var.getPageTitle(i - 1));
        this.f3215c.setText((w660Var == null || i >= count) ? null : w660Var.getPageTitle(i));
        int i2 = i + 1;
        if (i2 < count && w660Var != null) {
            pageTitle = w660Var.getPageTitle(i2);
        }
        this.f3216d.setText(pageTitle);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f3214b.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f3215c.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f3216d.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f3217e = i;
        if (!this.f3222j) {
            mo4142d(i, this.f3218f, false);
        }
        this.f3221i = false;
    }

    /* JADX INFO: renamed from: d */
    public void mo4142d(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i != this.f3217e) {
            m4145c(i, this.f3213a.getAdapter());
        } else if (!z && f == this.f3218f) {
            return;
        }
        this.f3222j = true;
        int measuredWidth = this.f3214b.getMeasuredWidth();
        int measuredWidth2 = this.f3215c.getMeasuredWidth();
        int measuredWidth3 = this.f3216d.getMeasuredWidth();
        int i6 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = paddingRight + i6;
        int i8 = (width - (paddingLeft + i6)) - i7;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i9 = ((width - i7) - ((int) (i8 * f2))) - i6;
        int i10 = measuredWidth2 + i9;
        int baseline = this.f3214b.getBaseline();
        int baseline2 = this.f3215c.getBaseline();
        int baseline3 = this.f3216d.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i11 = iMax - baseline;
        int i12 = iMax - baseline2;
        int i13 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(this.f3214b.getMeasuredHeight() + i11, this.f3215c.getMeasuredHeight() + i12), this.f3216d.getMeasuredHeight() + i13);
        int i14 = this.f3220h & 112;
        if (i14 != 16) {
            if (i14 != 80) {
                i3 = i11 + paddingTop;
                i4 = i12 + paddingTop;
                i5 = paddingTop + i13;
            } else {
                i2 = (height - paddingBottom) - iMax2;
            }
            TextView textView = this.f3215c;
            textView.layout(i9, i4, i10, textView.getMeasuredHeight() + i4);
            int iMin = Math.min(paddingLeft, (i9 - this.f3219g) - measuredWidth);
            TextView textView2 = this.f3214b;
            textView2.layout(iMin, i3, iMin + measuredWidth, textView2.getMeasuredHeight() + i3);
            int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f3219g);
            TextView textView3 = this.f3216d;
            textView3.layout(iMax3, i5, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i5);
            this.f3218f = f;
            this.f3222j = false;
        }
        i2 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
        i3 = i11 + i2;
        i4 = i12 + i2;
        i5 = i2 + i13;
        TextView textView4 = this.f3215c;
        textView4.layout(i9, i4, i10, textView4.getMeasuredHeight() + i4);
        int iMin2 = Math.min(paddingLeft, (i9 - this.f3219g) - measuredWidth);
        TextView textView5 = this.f3214b;
        textView5.layout(iMin2, i3, iMin2 + measuredWidth, textView5.getMeasuredHeight() + i3);
        int iMax4 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f3219g);
        TextView textView6 = this.f3216d;
        textView6.layout(iMax4, i5, iMax4 + measuredWidth3, textView6.getMeasuredHeight() + i5);
        this.f3218f = f;
        this.f3222j = false;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f3219g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            qkq0.m175383a("PagerTitleStrip must be a direct child of a ViewPager.");
            return;
        }
        ViewPager viewPager = (ViewPager) parent;
        w660 adapter = viewPager.getAdapter();
        viewPager.m4179W(this.f3223k);
        viewPager.m4184c(this.f3223k);
        this.f3213a = viewPager;
        WeakReference<w660> weakReference = this.f3224l;
        m4144b(weakReference != null ? weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f3213a;
        if (viewPager != null) {
            m4144b(viewPager.getAdapter(), null);
            this.f3213a.m4179W(null);
            this.f3213a.m4174O(this.f3223k);
            this.f3213a = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f3213a != null) {
            float f = this.f3218f;
            if (f < 0.0f) {
                f = 0.0f;
            }
            mo4142d(this.f3217e, f, true);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iMax;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            qkq0.m175383a("Must measure with an exact width");
            return;
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int size = View.MeasureSpec.getSize(i);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (size * 0.2f), -2);
        this.f3214b.measure(childMeasureSpec2, childMeasureSpec);
        this.f3215c.measure(childMeasureSpec2, childMeasureSpec);
        this.f3216d.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i2);
        } else {
            iMax = Math.max(getMinHeight(), this.f3215c.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(iMax, i2, this.f3215c.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f3221i) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i) {
        this.f3220h = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d) float f) {
        int i = ((int) (f * 255.0f)) & 255;
        this.f3225m = i;
        int i2 = (i << 24) | (this.f3226n & 16777215);
        this.f3214b.setTextColor(i2);
        this.f3216d.setTextColor(i2);
    }

    public void setTextColor(@ColorInt int i) {
        this.f3226n = i;
        this.f3215c.setTextColor(i);
        int i2 = (this.f3225m << 24) | (this.f3226n & 16777215);
        this.f3214b.setTextColor(i2);
        this.f3216d.setTextColor(i2);
    }

    public void setTextSpacing(int i) {
        this.f3219g = i;
        requestLayout();
    }

    public PagerTitleStrip(@NonNull Context context) {
        this(context, null);
    }
}
