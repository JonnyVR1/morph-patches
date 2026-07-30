package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p147v.VLinear;
import p149l.e30;
import p149l.j760;
import p149l.t100;
import p149l.u4c0;

/* JADX INFO: loaded from: classes11.dex */
public class CardHeadLayoutV2 extends VLinear {

    /* JADX INFO: renamed from: w */
    public static float f23595w;

    /* JADX INFO: renamed from: c */
    public int f23596c;

    /* JADX INFO: renamed from: d */
    public int f23597d;

    /* JADX INFO: renamed from: e */
    public float f23598e;

    /* JADX INFO: renamed from: f */
    public boolean f23599f;

    /* JADX INFO: renamed from: g */
    public View f23600g;

    /* JADX INFO: renamed from: h */
    public int f23601h;

    /* JADX INFO: renamed from: i */
    public int f23602i;

    /* JADX INFO: renamed from: j */
    public int f23603j;

    /* JADX INFO: renamed from: k */
    public String f23604k;

    /* JADX INFO: renamed from: l */
    public e30<Integer> f23605l;

    /* JADX INFO: renamed from: m */
    public int f23606m;

    /* JADX INFO: renamed from: n */
    public CardInfoRenderFrom f23607n;

    /* JADX INFO: renamed from: o */
    public boolean f23608o;

    /* JADX INFO: renamed from: p */
    public boolean f23609p;

    /* JADX INFO: renamed from: q */
    public int f23610q;

    /* JADX INFO: renamed from: r */
    public int f23611r;

    /* JADX INFO: renamed from: s */
    public HashMap<String, BitmapDrawable> f23612s;

    /* JADX INFO: renamed from: t */
    public j760<Integer, Integer> f23613t;

    /* JADX INFO: renamed from: u */
    public int f23614u;

    /* JADX INFO: renamed from: v */
    public int f23615v;

    public CardHeadLayoutV2(Context context) {
        super(context);
        this.f23596c = t100.m186890d(54.0f);
        this.f23597d = -t100.m186890d(120.0f);
        this.f23598e = 0.0f;
        this.f23599f = true;
        this.f23604k = "default_style";
        this.f23606m = t100.m186890d(1850.0f);
        this.f23607n = CardInfoRenderFrom.UNKNOWN;
        this.f23608o = true;
        this.f23609p = false;
        this.f23612s = new HashMap<>();
        this.f23613t = new j760<>(0, 0);
        this.f23614u = 0;
        this.f23615v = 0;
    }

    /* JADX INFO: renamed from: P */
    public void m38957P() {
        f23595w = 0.0f;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public int getImageContainerWith() {
        return this.f23602i;
    }

    @Nullable
    public View getShadowBottomAuxiliary() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f23612s.isEmpty()) {
            return;
        }
        this.f23612s.clear();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f23600g = findViewById(u4c0.f174109X5);
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
        this.f23611r = size;
        boolean z = this.f23615v != size;
        this.f23615v = size;
        CardInfoRenderFrom cardInfoRenderFrom = this.f23607n;
        CardInfoRenderFrom cardInfoRenderFrom2 = CardInfoRenderFrom.CARD;
        if (cardInfoRenderFrom != cardInfoRenderFrom2 && size > (i5 = this.f23606m)) {
            this.f23611r = i5;
        }
        int size2 = View.MeasureSpec.getSize(i);
        this.f23602i = size2;
        int i6 = this.f23611r - this.f23596c;
        this.f23610q = i6;
        int i7 = (int) (size2 / (this.f23607n == CardInfoRenderFrom.PROFILE ? 0.7f : 0.6f));
        if (i6 >= i7) {
            this.f23597d = Math.min(-Math.abs((i6 - i7) - this.f23614u), this.f23597d);
        }
        if (this.f23607n == cardInfoRenderFrom2 && ((f23595w <= 0.0f || z) && (i3 = this.f23610q + this.f23597d) > 0 && (i4 = this.f23602i) > 0)) {
            f23595w = (i4 * 1.0f) / i3;
        }
        int i8 = this.f23610q + ((int) (this.f23598e * this.f23597d));
        this.f23610q = i8;
        int i9 = i8 - this.f23614u;
        this.f23601h = i9;
        this.f23603j = i7;
        if (!this.f23609p) {
            measureChild(this.f23600g, i, View.MeasureSpec.makeMeasureSpec(i9, View.MeasureSpec.getMode(1073741824)));
            setMeasuredDimension(this.f23602i, this.f23610q);
            if (NullChecker.m81303a(this.f23605l)) {
                this.f23605l.call(Integer.valueOf(this.f23610q));
                return;
            }
            return;
        }
        this.f23608o = false;
        this.f23599f = true;
        int iMin = Math.min(i9, i7);
        this.f23601h = iMin;
        measureChild(this.f23600g, i, View.MeasureSpec.makeMeasureSpec(iMin, View.MeasureSpec.getMode(1073741824)));
        setMeasuredDimension(this.f23602i, this.f23601h + this.f23614u);
        if (NullChecker.m81303a(this.f23605l)) {
            this.f23605l.call(Integer.valueOf(this.f23601h + this.f23614u));
        }
    }

    public void setBackgroundShadows(boolean z) {
        this.f23608o = z;
    }

    public void setCardStyle(String str) {
        this.f23604k = str;
    }

    public void setCardStyleChangeProgress(float f) {
        this.f23598e = f;
        requestLayout();
    }

    public void setMeasureDoneCallback(e30<Integer> e30Var) {
        this.f23605l = e30Var;
    }

    public void setNextInfoExposureSize(int i) {
        this.f23596c = t100.m186890d(i);
    }

    public void setNextInfoExposureSizePx(int i) {
        this.f23596c = i;
    }

    public void setRenderFrom(CardInfoRenderFrom cardInfoRenderFrom) {
        this.f23607n = cardInfoRenderFrom;
    }

    public void setShortCardStyle(boolean z) {
        this.f23609p = z;
    }

    public CardHeadLayoutV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23596c = t100.m186890d(54.0f);
        this.f23597d = -t100.m186890d(120.0f);
        this.f23598e = 0.0f;
        this.f23599f = true;
        this.f23604k = "default_style";
        this.f23606m = t100.m186890d(1850.0f);
        this.f23607n = CardInfoRenderFrom.UNKNOWN;
        this.f23608o = true;
        this.f23609p = false;
        this.f23612s = new HashMap<>();
        this.f23613t = new j760<>(0, 0);
        this.f23614u = 0;
        this.f23615v = 0;
    }

    public CardHeadLayoutV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23596c = t100.m186890d(54.0f);
        this.f23597d = -t100.m186890d(120.0f);
        this.f23598e = 0.0f;
        this.f23599f = true;
        this.f23604k = "default_style";
        this.f23606m = t100.m186890d(1850.0f);
        this.f23607n = CardInfoRenderFrom.UNKNOWN;
        this.f23608o = true;
        this.f23609p = false;
        this.f23612s = new HashMap<>();
        this.f23613t = new j760<>(0, 0);
        this.f23614u = 0;
        this.f23615v = 0;
    }
}
