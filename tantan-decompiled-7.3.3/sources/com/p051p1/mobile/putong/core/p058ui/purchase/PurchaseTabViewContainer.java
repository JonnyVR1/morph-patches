package com.p051p1.mobile.putong.core.p058ui.purchase;

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
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p153l.jyb;
import p153l.p9r;
import p153l.qa00;
import p153l.rec0;
import p153l.wib0;

/* JADX INFO: loaded from: classes4.dex */
public class PurchaseTabViewContainer extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final float f35220a;

    /* JADX INFO: renamed from: b */
    public final float f35221b;

    /* JADX INFO: renamed from: c */
    public final Paint f35222c;

    /* JADX INFO: renamed from: d */
    public final Paint f35223d;

    /* JADX INFO: renamed from: e */
    public final Paint f35224e;

    /* JADX INFO: renamed from: f */
    public int f35225f;

    /* JADX INFO: renamed from: g */
    public float f35226g;

    /* JADX INFO: renamed from: h */
    public int f35227h;

    /* JADX INFO: renamed from: i */
    public InterfaceC8919a f35228i;

    /* JADX INFO: renamed from: j */
    public List<PurchaseType> f35229j;

    /* JADX INFO: renamed from: k */
    public final int[] f35230k;

    /* JADX INFO: renamed from: l */
    public final int[] f35231l;

    /* JADX INFO: renamed from: m */
    public final float[] f35232m;

    /* JADX INFO: renamed from: n */
    public int[] f35233n;

    /* JADX INFO: renamed from: o */
    public int f35234o;

    /* JADX INFO: renamed from: p */
    public final int f35235p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.PurchaseTabViewContainer$a */
    public interface InterfaceC8919a {
        /* JADX INFO: renamed from: a */
        void mo54312a(int i);

        /* JADX INFO: renamed from: b */
        void mo54313b(int i);
    }

    public PurchaseTabViewContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35220a = qa00.f156327n;
        this.f35221b = qa00.f156325l;
        Paint paint = new Paint(1);
        this.f35222c = paint;
        Paint paint2 = new Paint(1);
        this.f35223d = paint2;
        Paint paint3 = new Paint(1);
        this.f35224e = paint3;
        this.f35225f = Color.parseColor("#19979797");
        int[] iArr = {-1, -1, -1, -1, -1};
        this.f35230k = iArr;
        this.f35231l = new int[]{Color.parseColor("#191510"), Color.parseColor("#4F4733"), Color.parseColor("#191510"), Color.parseColor("#4F4733"), Color.parseColor("#191510")};
        this.f35232m = new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f};
        this.f35233n = iArr;
        this.f35234o = -1;
        this.f35235p = qa00.f156314a;
        setOrientation(0);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setIntrinsicWidth(0);
        shapeDrawable.setAlpha(0);
        setDividerDrawable(shapeDrawable);
        setShowDividers(2);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(this.f35225f);
        paint2.setStyle(style);
        paint2.setColor(this.f35234o);
        paint3.setStyle(style);
        paint3.setColor(-1);
    }

    /* JADX INFO: renamed from: b */
    public void m54304b(InterfaceC8919a interfaceC8919a) {
        this.f35228i = interfaceC8919a;
    }

    /* JADX INFO: renamed from: c */
    public void m54305c(List<PurchaseType> list) {
        this.f35229j = list;
        for (final int i = 0; i < list.size(); i++) {
            PurchaseTabView purchaseTabView = (PurchaseTabView) p9r.m171370a(getContext()).inflate(rec0.f162499U1, (ViewGroup) this, false);
            purchaseTabView.m54300b(list.get(i));
            purchaseTabView.setOnClickListener(new View.OnClickListener() { // from class: l.jib0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f121059a.m54306d(i, view);
                }
            });
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 0.5f;
            addView(purchaseTabView, layoutParams);
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m54306d(int i, View view) {
        setSelectTabPosition(i);
    }

    /* JADX INFO: renamed from: e */
    public final void m54307e() {
        this.f35222c.setColor(this.f35225f);
        this.f35223d.setColor(this.f35234o);
        m54309g();
        invalidate();
    }

    /* JADX INFO: renamed from: f */
    public void m54308f(int i, float f) {
        if (i == 1) {
            f = 1.0f;
        }
        this.f35226g = Math.min(1.0f, Math.max(0.0f, f));
        invalidate();
    }

    /* JADX INFO: renamed from: g */
    public void m54309g() {
        this.f35224e.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f35233n, this.f35232m, Shader.TileMode.CLAMP));
    }

    public int getSelectedTabPosition() {
        return this.f35227h;
    }

    /* JADX INFO: renamed from: h */
    public void m54310h(boolean z) {
        if (z) {
            this.f35225f = Color.parseColor("#131212");
            this.f35233n = this.f35231l;
            this.f35234o = Color.parseColor("#1c1917");
        } else {
            this.f35225f = Color.parseColor("#19979797");
            this.f35233n = this.f35230k;
            this.f35234o = -1;
        }
        m54307e();
    }

    /* JADX INFO: renamed from: i */
    public void m54311i(boolean z) {
        if (z) {
            this.f35233n = this.f35231l;
            this.f35234o = Color.parseColor("#FFF2CD");
        } else {
            this.f35233n = this.f35230k;
            this.f35234o = -1;
        }
        m54307e();
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
        float f = this.f35220a;
        canvas.drawRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, f, f, this.f35222c);
        int childCount = ((measuredWidth - paddingLeft) - paddingRight) / getChildCount();
        int i = (int) (paddingLeft + (childCount * this.f35226g));
        int i2 = childCount + i;
        int i3 = measuredHeight - paddingBottom;
        float f2 = this.f35221b;
        canvas.drawRoundRect(i, paddingTop, i2, i3, f2, f2, this.f35224e);
        int i4 = this.f35235p;
        float f3 = i + i4;
        float f4 = paddingTop + i4;
        float f5 = i2 - i4;
        float f6 = i3 - i4;
        float f7 = this.f35221b;
        canvas.drawRoundRect(f3, f4, f5, f6, f7, f7, this.f35223d);
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
        this.f35227h = i;
        int i2 = 0;
        while (i2 < getChildCount()) {
            ((PurchaseTabView) getChildAt(i2)).m54302d(i2 == this.f35227h, (jyb.m147479J(this.f35229j) || !this.f35229j.contains(PurchaseType.TYPE_O_DIAMOND)) ? false : wib0.m206565i(this.f35229j.get(this.f35227h)));
            if (NullChecker.m82486a(this.f35228i)) {
                int i3 = this.f35227h;
                InterfaceC8919a interfaceC8919a = this.f35228i;
                if (i2 == i3) {
                    interfaceC8919a.mo54313b(i2);
                } else {
                    interfaceC8919a.mo54312a(i2);
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
