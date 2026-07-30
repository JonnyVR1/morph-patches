package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import p153l.fhc0;
import p153l.k8c0;
import p153l.mgc0;
import p153l.on4;
import p153l.r9c0;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {R.attr.colorBackground};
    private static final CardViewImpl IMPL;
    private final on4 mCardViewDelegate;
    private boolean mCompatPadding;
    final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    /* JADX INFO: renamed from: androidx.cardview.widget.CardView$a */
    public class C0191a implements on4 {

        /* JADX INFO: renamed from: a */
        public Drawable f955a;

        public C0191a() {
        }

        @Override // p153l.on4
        /* JADX INFO: renamed from: a */
        public boolean mo839a() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // p153l.on4
        /* JADX INFO: renamed from: b */
        public void mo840b(Drawable drawable) {
            this.f955a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // p153l.on4
        /* JADX INFO: renamed from: c */
        public Drawable mo841c() {
            return this.f955a;
        }

        @Override // p153l.on4
        /* JADX INFO: renamed from: d */
        public boolean mo842d() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // p153l.on4
        public View getCardView() {
            return CardView.this;
        }

        @Override // p153l.on4
        public void setShadowPadding(int i, int i2, int i3, int i4) {
            CardView.this.mShadowBounds.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.mContentPadding;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }
    }

    static {
        C0192a c0192a = new C0192a();
        IMPL = c0192a;
        c0192a.initStatic();
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.mContentPadding = rect;
        this.mShadowBounds = new Rect();
        C0191a c0191a = new C0191a();
        this.mCardViewDelegate = c0191a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fhc0.f99027a, i, mgc0.f136703a);
        if (typedArrayObtainStyledAttributes.hasValue(fhc0.f99030d)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(fhc0.f99030d);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(r9c0.f161803b) : getResources().getColor(r9c0.f161802a));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(fhc0.f99031e, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(fhc0.f99032f, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(fhc0.f99033g, 0.0f);
        this.mCompatPadding = typedArrayObtainStyledAttributes.getBoolean(fhc0.f99035i, false);
        this.mPreventCornerOverlap = typedArrayObtainStyledAttributes.getBoolean(fhc0.f99034h, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(fhc0.f99036j, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(fhc0.f99038l, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(fhc0.f99040n, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(fhc0.f99039m, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(fhc0.f99037k, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(fhc0.f99028b, 0);
        this.mUserSetMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(fhc0.f99029c, 0);
        typedArrayObtainStyledAttributes.recycle();
        IMPL.mo847e(c0191a, context, colorStateList, dimension, dimension2, f);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return IMPL.mo843a(this.mCardViewDelegate);
    }

    public float getCardElevation() {
        return IMPL.mo852j(this.mCardViewDelegate);
    }

    @Px
    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    @Px
    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    @Px
    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    @Px
    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public float getMaxCardElevation() {
        return IMPL.mo849g(this.mCardViewDelegate);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public float getRadius() {
        return IMPL.mo851i(this.mCardViewDelegate);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        CardViewImpl cardViewImpl = IMPL;
        if (cardViewImpl instanceof C0192a) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(cardViewImpl.mo848f(this.mCardViewDelegate)), View.MeasureSpec.getSize(i)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(cardViewImpl.mo854l(this.mCardViewDelegate)), View.MeasureSpec.getSize(i2)), mode2);
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(@ColorInt int i) {
        IMPL.mo856n(this.mCardViewDelegate, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        IMPL.mo850h(this.mCardViewDelegate, f);
    }

    public void setContentPadding(@Px int i, @Px int i2, @Px int i3, @Px int i4) {
        this.mContentPadding.set(i, i2, i3, i4);
        IMPL.mo846d(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f) {
        IMPL.mo844b(this.mCardViewDelegate, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.mUserSetMinHeight = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.mUserSetMinWidth = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z;
            IMPL.mo845c(this.mCardViewDelegate);
        }
    }

    public void setRadius(float f) {
        IMPL.mo853k(this.mCardViewDelegate, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.mCompatPadding != z) {
            this.mCompatPadding = z;
            IMPL.mo855m(this.mCardViewDelegate);
        }
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        IMPL.mo856n(this.mCardViewDelegate, colorStateList);
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, k8c0.f124372a);
    }

    public CardView(@NonNull Context context) {
        this(context, null);
    }
}
