package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.e30;
import l.j760;
import l.t100;
import l.u4c0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardHeadLayoutV2 extends VLinear {

    /* JADX INFO: renamed from: w */
    public static float f2373w;

    /* JADX INFO: renamed from: c */
    public int f2374c;

    /* JADX INFO: renamed from: d */
    public int f2375d;

    /* JADX INFO: renamed from: e */
    public float f2376e;

    /* JADX INFO: renamed from: f */
    public boolean f2377f;

    /* JADX INFO: renamed from: g */
    public View f2378g;

    /* JADX INFO: renamed from: h */
    public int f2379h;

    /* JADX INFO: renamed from: i */
    public int f2380i;

    /* JADX INFO: renamed from: j */
    public int f2381j;

    /* JADX INFO: renamed from: k */
    public String f2382k;

    /* JADX INFO: renamed from: l */
    public e30<Integer> f2383l;

    /* JADX INFO: renamed from: m */
    public int f2384m;

    /* JADX INFO: renamed from: n */
    public CardInfoRenderFrom f2385n;

    /* JADX INFO: renamed from: o */
    public boolean f2386o;

    /* JADX INFO: renamed from: p */
    public boolean f2387p;

    /* JADX INFO: renamed from: q */
    public int f2388q;

    /* JADX INFO: renamed from: r */
    public int f2389r;

    /* JADX INFO: renamed from: s */
    public HashMap<String, BitmapDrawable> f2390s;

    /* JADX INFO: renamed from: t */
    public j760<Integer, Integer> f2391t;

    /* JADX INFO: renamed from: u */
    public int f2392u;

    /* JADX INFO: renamed from: v */
    public int f2393v;

    public CardHeadLayoutV2(Context context) {
        super(context);
        this.f2374c = t100.d(54.0f);
        this.f2375d = -t100.d(120.0f);
        this.f2376e = 0.0f;
        this.f2377f = true;
        this.f2382k = "default_style";
        this.f2384m = t100.d(1850.0f);
        this.f2385n = CardInfoRenderFrom.UNKNOWN;
        this.f2386o = true;
        this.f2387p = false;
        this.f2390s = new HashMap<>();
        this.f2391t = new j760<>(0, 0);
        this.f2392u = 0;
        this.f2393v = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public void m2964P() {
        f2373w = 0.0f;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dispatchDraw(@NonNull Canvas canvas) {
        super/*android.view.View*/.dispatchDraw(canvas);
    }

    public int getImageContainerWith() {
        return this.f2380i;
    }

    @Nullable
    public View getShadowBottomAuxiliary() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        if (this.f2390s.isEmpty()) {
            return;
        }
        this.f2390s.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        this.f2378g = findViewById(u4c0.X5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onLayout(z, i, i2, i3, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i2);
        this.f2389r = size;
        boolean z = this.f2393v != size;
        this.f2393v = size;
        CardInfoRenderFrom cardInfoRenderFrom = this.f2385n;
        CardInfoRenderFrom cardInfoRenderFrom2 = CardInfoRenderFrom.CARD;
        if (cardInfoRenderFrom != cardInfoRenderFrom2 && size > (i5 = this.f2384m)) {
            this.f2389r = i5;
        }
        int size2 = View.MeasureSpec.getSize(i);
        this.f2380i = size2;
        int i6 = this.f2389r - this.f2374c;
        this.f2388q = i6;
        int i7 = (int) (size2 / (this.f2385n == CardInfoRenderFrom.PROFILE ? 0.7f : 0.6f));
        if (i6 >= i7) {
            this.f2375d = Math.min(-Math.abs((i6 - i7) - this.f2392u), this.f2375d);
        }
        if (this.f2385n == cardInfoRenderFrom2 && ((f2373w <= 0.0f || z) && (i3 = this.f2388q + this.f2375d) > 0 && (i4 = this.f2380i) > 0)) {
            f2373w = (i4 * 1.0f) / i3;
        }
        int i8 = this.f2388q + ((int) (this.f2376e * this.f2375d));
        this.f2388q = i8;
        int i9 = i8 - this.f2392u;
        this.f2379h = i9;
        this.f2381j = i7;
        if (!this.f2387p) {
            measureChild(this.f2378g, i, View.MeasureSpec.makeMeasureSpec(i9, View.MeasureSpec.getMode(1073741824)));
            setMeasuredDimension(this.f2380i, this.f2388q);
            if (NullChecker.a(this.f2383l)) {
                this.f2383l.call(Integer.valueOf(this.f2388q));
                return;
            }
            return;
        }
        this.f2386o = false;
        this.f2377f = true;
        int iMin = Math.min(i9, i7);
        this.f2379h = iMin;
        measureChild(this.f2378g, i, View.MeasureSpec.makeMeasureSpec(iMin, View.MeasureSpec.getMode(1073741824)));
        setMeasuredDimension(this.f2380i, this.f2379h + this.f2392u);
        if (NullChecker.a(this.f2383l)) {
            this.f2383l.call(Integer.valueOf(this.f2379h + this.f2392u));
        }
    }

    public void setBackgroundShadows(boolean z) {
        this.f2386o = z;
    }

    public void setCardStyle(String str) {
        this.f2382k = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCardStyleChangeProgress(float f) {
        this.f2376e = f;
        requestLayout();
    }

    public void setMeasureDoneCallback(e30<Integer> e30Var) {
        this.f2383l = e30Var;
    }

    public void setNextInfoExposureSize(int i) {
        this.f2374c = t100.d(i);
    }

    public void setNextInfoExposureSizePx(int i) {
        this.f2374c = i;
    }

    public void setRenderFrom(CardInfoRenderFrom cardInfoRenderFrom) {
        this.f2385n = cardInfoRenderFrom;
    }

    public void setShortCardStyle(boolean z) {
        this.f2387p = z;
    }

    public CardHeadLayoutV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2374c = t100.d(54.0f);
        this.f2375d = -t100.d(120.0f);
        this.f2376e = 0.0f;
        this.f2377f = true;
        this.f2382k = "default_style";
        this.f2384m = t100.d(1850.0f);
        this.f2385n = CardInfoRenderFrom.UNKNOWN;
        this.f2386o = true;
        this.f2387p = false;
        this.f2390s = new HashMap<>();
        this.f2391t = new j760<>(0, 0);
        this.f2392u = 0;
        this.f2393v = 0;
    }

    public CardHeadLayoutV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2374c = t100.d(54.0f);
        this.f2375d = -t100.d(120.0f);
        this.f2376e = 0.0f;
        this.f2377f = true;
        this.f2382k = "default_style";
        this.f2384m = t100.d(1850.0f);
        this.f2385n = CardInfoRenderFrom.UNKNOWN;
        this.f2386o = true;
        this.f2387p = false;
        this.f2390s = new HashMap<>();
        this.f2391t = new j760<>(0, 0);
        this.f2392u = 0;
        this.f2393v = 0;
    }
}
