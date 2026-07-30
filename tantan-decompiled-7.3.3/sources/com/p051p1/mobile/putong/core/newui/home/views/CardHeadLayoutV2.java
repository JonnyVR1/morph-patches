package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p151v.VLinear;
import p153l.adc0;
import p153l.pf60;
import p153l.qa00;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class CardHeadLayoutV2 extends VLinear {

    /* JADX INFO: renamed from: w */
    public static float f24337w;

    /* JADX INFO: renamed from: c */
    public int f24338c;

    /* JADX INFO: renamed from: d */
    public int f24339d;

    /* JADX INFO: renamed from: e */
    public float f24340e;

    /* JADX INFO: renamed from: f */
    public boolean f24341f;

    /* JADX INFO: renamed from: g */
    public View f24342g;

    /* JADX INFO: renamed from: h */
    public int f24343h;

    /* JADX INFO: renamed from: i */
    public int f24344i;

    /* JADX INFO: renamed from: j */
    public int f24345j;

    /* JADX INFO: renamed from: k */
    public String f24346k;

    /* JADX INFO: renamed from: l */
    public y20<Integer> f24347l;

    /* JADX INFO: renamed from: m */
    public int f24348m;

    /* JADX INFO: renamed from: n */
    public CardInfoRenderFrom f24349n;

    /* JADX INFO: renamed from: o */
    public boolean f24350o;

    /* JADX INFO: renamed from: p */
    public boolean f24351p;

    /* JADX INFO: renamed from: q */
    public int f24352q;

    /* JADX INFO: renamed from: r */
    public int f24353r;

    /* JADX INFO: renamed from: s */
    public HashMap<String, BitmapDrawable> f24354s;

    /* JADX INFO: renamed from: t */
    public pf60<Integer, Integer> f24355t;

    /* JADX INFO: renamed from: u */
    public int f24356u;

    /* JADX INFO: renamed from: v */
    public int f24357v;

    public CardHeadLayoutV2(Context context) {
        super(context);
        this.f24338c = qa00.m175859d(54.0f);
        this.f24339d = -qa00.m175859d(120.0f);
        this.f24340e = 0.0f;
        this.f24341f = true;
        this.f24346k = "default_style";
        this.f24348m = qa00.m175859d(1850.0f);
        this.f24349n = CardInfoRenderFrom.UNKNOWN;
        this.f24350o = true;
        this.f24351p = false;
        this.f24354s = new HashMap<>();
        this.f24355t = new pf60<>(0, 0);
        this.f24356u = 0;
        this.f24357v = 0;
    }

    /* JADX INFO: renamed from: P */
    public void m39960P() {
        f24337w = 0.0f;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public int getImageContainerWith() {
        return this.f24344i;
    }

    @Nullable
    public View getShadowBottomAuxiliary() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f24354s.isEmpty()) {
            return;
        }
        this.f24354s.clear();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f24342g = findViewById(adc0.f70232Z5);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i2);
        this.f24353r = size;
        boolean z = this.f24357v != size;
        this.f24357v = size;
        CardInfoRenderFrom cardInfoRenderFrom = this.f24349n;
        CardInfoRenderFrom cardInfoRenderFrom2 = CardInfoRenderFrom.CARD;
        if (cardInfoRenderFrom != cardInfoRenderFrom2 && size > (i5 = this.f24348m)) {
            this.f24353r = i5;
        }
        int size2 = View.MeasureSpec.getSize(i);
        this.f24344i = size2;
        int i6 = this.f24353r - this.f24338c;
        this.f24352q = i6;
        int i7 = (int) (size2 / (this.f24349n == CardInfoRenderFrom.PROFILE ? 0.7f : 0.6f));
        if (i6 >= i7) {
            this.f24339d = Math.min(-Math.abs((i6 - i7) - this.f24356u), this.f24339d);
        }
        if (this.f24349n == cardInfoRenderFrom2 && ((f24337w <= 0.0f || z) && (i3 = this.f24352q + this.f24339d) > 0 && (i4 = this.f24344i) > 0)) {
            f24337w = (i4 * 1.0f) / i3;
        }
        int i8 = this.f24352q + ((int) (this.f24340e * this.f24339d));
        this.f24352q = i8;
        int i9 = i8 - this.f24356u;
        this.f24343h = i9;
        this.f24345j = i7;
        if (!this.f24351p) {
            measureChild(this.f24342g, i, View.MeasureSpec.makeMeasureSpec(i9, View.MeasureSpec.getMode(1073741824)));
            setMeasuredDimension(this.f24344i, this.f24352q);
            if (NullChecker.m82486a(this.f24347l)) {
                this.f24347l.call(Integer.valueOf(this.f24352q));
                return;
            }
            return;
        }
        this.f24350o = false;
        this.f24341f = true;
        int iMin = Math.min(i9, i7);
        this.f24343h = iMin;
        measureChild(this.f24342g, i, View.MeasureSpec.makeMeasureSpec(iMin, View.MeasureSpec.getMode(1073741824)));
        setMeasuredDimension(this.f24344i, this.f24343h + this.f24356u);
        if (NullChecker.m82486a(this.f24347l)) {
            this.f24347l.call(Integer.valueOf(this.f24343h + this.f24356u));
        }
    }

    public void setBackgroundShadows(boolean z) {
        this.f24350o = z;
    }

    public void setCardStyle(String str) {
        this.f24346k = str;
    }

    public void setCardStyleChangeProgress(float f) {
        this.f24340e = f;
        requestLayout();
    }

    public void setMeasureDoneCallback(y20<Integer> y20Var) {
        this.f24347l = y20Var;
    }

    public void setNextInfoExposureSize(int i) {
        this.f24338c = qa00.m175859d(i);
    }

    public void setNextInfoExposureSizePx(int i) {
        this.f24338c = i;
    }

    public void setRenderFrom(CardInfoRenderFrom cardInfoRenderFrom) {
        this.f24349n = cardInfoRenderFrom;
    }

    public void setShortCardStyle(boolean z) {
        this.f24351p = z;
    }

    public CardHeadLayoutV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24338c = qa00.m175859d(54.0f);
        this.f24339d = -qa00.m175859d(120.0f);
        this.f24340e = 0.0f;
        this.f24341f = true;
        this.f24346k = "default_style";
        this.f24348m = qa00.m175859d(1850.0f);
        this.f24349n = CardInfoRenderFrom.UNKNOWN;
        this.f24350o = true;
        this.f24351p = false;
        this.f24354s = new HashMap<>();
        this.f24355t = new pf60<>(0, 0);
        this.f24356u = 0;
        this.f24357v = 0;
    }

    public CardHeadLayoutV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24338c = qa00.m175859d(54.0f);
        this.f24339d = -qa00.m175859d(120.0f);
        this.f24340e = 0.0f;
        this.f24341f = true;
        this.f24346k = "default_style";
        this.f24348m = qa00.m175859d(1850.0f);
        this.f24349n = CardInfoRenderFrom.UNKNOWN;
        this.f24350o = true;
        this.f24351p = false;
        this.f24354s = new HashMap<>();
        this.f24355t = new pf60<>(0, 0);
        this.f24356u = 0;
        this.f24357v = 0;
    }
}
