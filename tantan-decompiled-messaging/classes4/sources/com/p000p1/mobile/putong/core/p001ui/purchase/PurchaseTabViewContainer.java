package com.p000p1.mobile.putong.core.p001ui.purchase;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.m6c0;
import l.o7r;
import l.sab0;
import l.t100;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class PurchaseTabViewContainer extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final float f2194a;

    /* JADX INFO: renamed from: b */
    public final float f2195b;

    /* JADX INFO: renamed from: c */
    public final Paint f2196c;

    /* JADX INFO: renamed from: d */
    public final Paint f2197d;

    /* JADX INFO: renamed from: e */
    public final Paint f2198e;

    /* JADX INFO: renamed from: f */
    public int f2199f;

    /* JADX INFO: renamed from: g */
    public float f2200g;

    /* JADX INFO: renamed from: h */
    public int f2201h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0181a f2202i;

    /* JADX INFO: renamed from: j */
    public List<PurchaseType> f2203j;

    /* JADX INFO: renamed from: k */
    public final int[] f2204k;

    /* JADX INFO: renamed from: l */
    public final int[] f2205l;

    /* JADX INFO: renamed from: m */
    public final float[] f2206m;

    /* JADX INFO: renamed from: n */
    public int[] f2207n;

    /* JADX INFO: renamed from: o */
    public int f2208o;

    /* JADX INFO: renamed from: p */
    public final int f2209p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.PurchaseTabViewContainer$a */
    public interface InterfaceC0181a {
        /* JADX INFO: renamed from: a */
        void mo3695a(int i);

        /* JADX INFO: renamed from: b */
        void mo3696b(int i);
    }

    public PurchaseTabViewContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2194a = t100.n;
        this.f2195b = t100.l;
        Paint paint = new Paint(1);
        this.f2196c = paint;
        Paint paint2 = new Paint(1);
        this.f2197d = paint2;
        Paint paint3 = new Paint(1);
        this.f2198e = paint3;
        this.f2199f = Color.parseColor("#19979797");
        int[] iArr = {-1, -1, -1, -1, -1};
        this.f2204k = iArr;
        this.f2205l = new int[]{Color.parseColor("#191510"), Color.parseColor("#4F4733"), Color.parseColor("#191510"), Color.parseColor("#4F4733"), Color.parseColor("#191510")};
        this.f2206m = new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f};
        this.f2207n = iArr;
        this.f2208o = -1;
        this.f2209p = t100.a;
        setOrientation(0);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setIntrinsicWidth(0);
        shapeDrawable.setAlpha(0);
        setDividerDrawable(shapeDrawable);
        setShowDividers(2);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(this.f2199f);
        paint2.setStyle(style);
        paint2.setColor(this.f2208o);
        paint3.setStyle(style);
        paint3.setColor(-1);
    }

    /* JADX INFO: renamed from: b */
    public void m3687b(InterfaceC0181a interfaceC0181a) {
        this.f2202i = interfaceC0181a;
    }

    /* JADX INFO: renamed from: c */
    public void m3688c(List<PurchaseType> list) {
        this.f2203j = list;
        for (final int i = 0; i < list.size(); i++) {
            PurchaseTabView purchaseTabView = (PurchaseTabView) o7r.a(getContext()).inflate(m6c0.U1, (ViewGroup) this, false);
            purchaseTabView.m3683b(list.get(i));
            purchaseTabView.setOnClickListener(new View.OnClickListener() { // from class: l.fab0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f10201a.m3689d(i, view);
                }
            });
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 0.5f;
            addView(purchaseTabView, layoutParams);
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m3689d(int i, View view) {
        setSelectTabPosition(i);
    }

    /* JADX INFO: renamed from: e */
    public final void m3690e() {
        this.f2196c.setColor(this.f2199f);
        this.f2197d.setColor(this.f2208o);
        m3692g();
        invalidate();
    }

    /* JADX INFO: renamed from: f */
    public void m3691f(int i, float f) {
        if (i == 1) {
            f = 1.0f;
        }
        this.f2200g = Math.min(1.0f, Math.max(0.0f, f));
        invalidate();
    }

    /* JADX INFO: renamed from: g */
    public void m3692g() {
        this.f2198e.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f2207n, this.f2206m, Shader.TileMode.CLAMP));
    }

    public int getSelectedTabPosition() {
        return this.f2201h;
    }

    /* JADX INFO: renamed from: h */
    public void m3693h(boolean z) {
        if (z) {
            this.f2199f = Color.parseColor("#131212");
            this.f2207n = this.f2205l;
            this.f2208o = Color.parseColor("#1c1917");
        } else {
            this.f2199f = Color.parseColor("#19979797");
            this.f2207n = this.f2204k;
            this.f2208o = -1;
        }
        m3690e();
    }

    /* JADX INFO: renamed from: i */
    public void m3694i(boolean z) {
        if (z) {
            this.f2207n = this.f2205l;
            this.f2208o = Color.parseColor("#FFF2CD");
        } else {
            this.f2207n = this.f2204k;
            this.f2208o = -1;
        }
        m3690e();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        float f = this.f2194a;
        canvas.drawRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, f, f, this.f2196c);
        int childCount = ((measuredWidth - paddingLeft) - paddingRight) / getChildCount();
        int i = (int) (paddingLeft + (childCount * this.f2200g));
        int i2 = childCount + i;
        int i3 = measuredHeight - paddingBottom;
        float f2 = this.f2195b;
        canvas.drawRoundRect(i, paddingTop, i2, i3, f2, f2, this.f2198e);
        int i4 = this.f2209p;
        float f3 = i + i4;
        float f4 = paddingTop + i4;
        float f5 = i2 - i4;
        float f6 = i3 - i4;
        float f7 = this.f2195b;
        canvas.drawRoundRect(f3, f4, f5, f6, f7, f7, this.f2197d);
        canvas.restore();
        super.onDraw(canvas);
    }

    public void setSelectTabPosition(int i) {
        if (i > getChildCount()) {
            i = getChildCount();
        }
        if (i < 0) {
            i = 0;
        }
        this.f2201h = i;
        int i2 = 0;
        while (i2 < getChildCount()) {
            ((PurchaseTabView) getChildAt(i2)).m3685d(i2 == this.f2201h, (vwb.J(this.f2203j) || !this.f2203j.contains(PurchaseType.TYPE_O_DIAMOND)) ? false : sab0.i(this.f2203j.get(this.f2201h)));
            if (NullChecker.a(this.f2202i)) {
                int i3 = this.f2201h;
                InterfaceC0181a interfaceC0181a = this.f2202i;
                if (i2 == i3) {
                    interfaceC0181a.mo3696b(i2);
                } else {
                    interfaceC0181a.mo3695a(i2);
                }
            }
            i2++;
        }
    }

    public PurchaseTabViewContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PurchaseTabViewContainer(@NonNull Context context) {
        this(context, null);
    }
}
