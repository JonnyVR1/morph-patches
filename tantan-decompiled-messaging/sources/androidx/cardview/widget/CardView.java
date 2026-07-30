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
import p149l.a9c0;
import p149l.f0c0;
import p149l.h8c0;
import p149l.l1c0;
import p149l.pm4;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {R.attr.colorBackground};
    private static final CardViewImpl IMPL;
    private final pm4 mCardViewDelegate;
    private boolean mCompatPadding;
    final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    /* JADX INFO: renamed from: androidx.cardview.widget.CardView$a */
    public class C0190a implements pm4 {

        /* JADX INFO: renamed from: a */
        public Drawable f955a;

        public C0190a() {
        }

        @Override // p149l.pm4
        /* JADX INFO: renamed from: a */
        public boolean mo838a() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // p149l.pm4
        /* JADX INFO: renamed from: b */
        public void mo839b(Drawable drawable) {
            this.f955a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // p149l.pm4
        /* JADX INFO: renamed from: c */
        public Drawable mo840c() {
            return this.f955a;
        }

        @Override // p149l.pm4
        /* JADX INFO: renamed from: d */
        public boolean mo841d() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // p149l.pm4
        public View getCardView() {
            return CardView.this;
        }

        @Override // p149l.pm4
        public void setShadowPadding(int i, int i2, int i3, int i4) {
            CardView.this.mShadowBounds.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.mContentPadding;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }
    }

    static {
        C0191a c0191a = new C0191a();
        IMPL = c0191a;
        c0191a.initStatic();
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.mContentPadding = rect;
        this.mShadowBounds = new Rect();
        C0190a c0190a = new C0190a();
        this.mCardViewDelegate = c0190a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a9c0.f68128a, i, h8c0.f106402a);
        if (typedArrayObtainStyledAttributes.hasValue(a9c0.f68131d)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(a9c0.f68131d);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(l1c0.f125635b) : getResources().getColor(l1c0.f125634a));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(a9c0.f68132e, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(a9c0.f68133f, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(a9c0.f68134g, 0.0f);
        this.mCompatPadding = typedArrayObtainStyledAttributes.getBoolean(a9c0.f68136i, false);
        this.mPreventCornerOverlap = typedArrayObtainStyledAttributes.getBoolean(a9c0.f68135h, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(a9c0.f68137j, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(a9c0.f68139l, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(a9c0.f68141n, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(a9c0.f68140m, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(a9c0.f68138k, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(a9c0.f68129b, 0);
        this.mUserSetMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(a9c0.f68130c, 0);
        typedArrayObtainStyledAttributes.recycle();
        IMPL.mo846e(c0190a, context, colorStateList, dimension, dimension2, f);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return IMPL.mo842a(this.mCardViewDelegate);
    }

    public float getCardElevation() {
        return IMPL.mo851j(this.mCardViewDelegate);
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
        return IMPL.mo848g(this.mCardViewDelegate);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public float getRadius() {
        return IMPL.mo850i(this.mCardViewDelegate);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        CardViewImpl cardViewImpl = IMPL;
        if (cardViewImpl instanceof C0191a) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(cardViewImpl.mo847f(this.mCardViewDelegate)), View.MeasureSpec.getSize(i)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(cardViewImpl.mo853l(this.mCardViewDelegate)), View.MeasureSpec.getSize(i2)), mode2);
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(@ColorInt int i) {
        IMPL.mo855n(this.mCardViewDelegate, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        IMPL.mo849h(this.mCardViewDelegate, f);
    }

    public void setContentPadding(@Px int i, @Px int i2, @Px int i3, @Px int i4) {
        this.mContentPadding.set(i, i2, i3, i4);
        IMPL.mo845d(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f) {
        IMPL.mo843b(this.mCardViewDelegate, f);
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
            IMPL.mo844c(this.mCardViewDelegate);
        }
    }

    public void setRadius(float f) {
        IMPL.mo852k(this.mCardViewDelegate, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.mCompatPadding != z) {
            this.mCompatPadding = z;
            IMPL.mo854m(this.mCardViewDelegate);
        }
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        IMPL.mo855n(this.mCardViewDelegate, colorStateList);
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, f0c0.f93970a);
    }

    public CardView(@NonNull Context context) {
        this(context, null);
    }
}
