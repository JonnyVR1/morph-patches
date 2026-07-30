package com.p046p1.mobile.putong.core.p053ui.purchase;

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
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p149l.m6c0;
import p149l.o7r;
import p149l.sab0;
import p149l.t100;
import p149l.vwb;

/* JADX INFO: loaded from: classes4.dex */
public class PurchaseTabViewContainer extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final float f34372a;

    /* JADX INFO: renamed from: b */
    public final float f34373b;

    /* JADX INFO: renamed from: c */
    public final Paint f34374c;

    /* JADX INFO: renamed from: d */
    public final Paint f34375d;

    /* JADX INFO: renamed from: e */
    public final Paint f34376e;

    /* JADX INFO: renamed from: f */
    public int f34377f;

    /* JADX INFO: renamed from: g */
    public float f34378g;

    /* JADX INFO: renamed from: h */
    public int f34379h;

    /* JADX INFO: renamed from: i */
    public InterfaceC8756a f34380i;

    /* JADX INFO: renamed from: j */
    public List<PurchaseType> f34381j;

    /* JADX INFO: renamed from: k */
    public final int[] f34382k;

    /* JADX INFO: renamed from: l */
    public final int[] f34383l;

    /* JADX INFO: renamed from: m */
    public final float[] f34384m;

    /* JADX INFO: renamed from: n */
    public int[] f34385n;

    /* JADX INFO: renamed from: o */
    public int f34386o;

    /* JADX INFO: renamed from: p */
    public final int f34387p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.PurchaseTabViewContainer$a */
    public interface InterfaceC8756a {
        /* JADX INFO: renamed from: a */
        void mo53129a(int i);

        /* JADX INFO: renamed from: b */
        void mo53130b(int i);
    }

    public PurchaseTabViewContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34372a = t100.f167265n;
        this.f34373b = t100.f167263l;
        Paint paint = new Paint(1);
        this.f34374c = paint;
        Paint paint2 = new Paint(1);
        this.f34375d = paint2;
        Paint paint3 = new Paint(1);
        this.f34376e = paint3;
        this.f34377f = Color.parseColor("#19979797");
        int[] iArr = {-1, -1, -1, -1, -1};
        this.f34382k = iArr;
        this.f34383l = new int[]{Color.parseColor("#191510"), Color.parseColor("#4F4733"), Color.parseColor("#191510"), Color.parseColor("#4F4733"), Color.parseColor("#191510")};
        this.f34384m = new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f};
        this.f34385n = iArr;
        this.f34386o = -1;
        this.f34387p = t100.f167252a;
        setOrientation(0);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setIntrinsicWidth(0);
        shapeDrawable.setAlpha(0);
        setDividerDrawable(shapeDrawable);
        setShowDividers(2);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(this.f34377f);
        paint2.setStyle(style);
        paint2.setColor(this.f34386o);
        paint3.setStyle(style);
        paint3.setColor(-1);
    }

    /* JADX INFO: renamed from: b */
    public void m53121b(InterfaceC8756a interfaceC8756a) {
        this.f34380i = interfaceC8756a;
    }

    /* JADX INFO: renamed from: c */
    public void m53122c(List<PurchaseType> list) {
        this.f34381j = list;
        for (final int i = 0; i < list.size(); i++) {
            PurchaseTabView purchaseTabView = (PurchaseTabView) o7r.m163037a(getContext()).inflate(m6c0.f131539U1, (ViewGroup) this, false);
            purchaseTabView.m53117b(list.get(i));
            purchaseTabView.setOnClickListener(new View.OnClickListener() { // from class: l.fab0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f96589a.m53123d(i, view);
                }
            });
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 0.5f;
            addView(purchaseTabView, layoutParams);
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m53123d(int i, View view) {
        setSelectTabPosition(i);
    }

    /* JADX INFO: renamed from: e */
    public final void m53124e() {
        this.f34374c.setColor(this.f34377f);
        this.f34375d.setColor(this.f34386o);
        m53126g();
        invalidate();
    }

    /* JADX INFO: renamed from: f */
    public void m53125f(int i, float f) {
        if (i == 1) {
            f = 1.0f;
        }
        this.f34378g = Math.min(1.0f, Math.max(0.0f, f));
        invalidate();
    }

    /* JADX INFO: renamed from: g */
    public void m53126g() {
        this.f34376e.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f34385n, this.f34384m, Shader.TileMode.CLAMP));
    }

    public int getSelectedTabPosition() {
        return this.f34379h;
    }

    /* JADX INFO: renamed from: h */
    public void m53127h(boolean z) {
        if (z) {
            this.f34377f = Color.parseColor("#131212");
            this.f34385n = this.f34383l;
            this.f34386o = Color.parseColor("#1c1917");
        } else {
            this.f34377f = Color.parseColor("#19979797");
            this.f34385n = this.f34382k;
            this.f34386o = -1;
        }
        m53124e();
    }

    /* JADX INFO: renamed from: i */
    public void m53128i(boolean z) {
        if (z) {
            this.f34385n = this.f34383l;
            this.f34386o = Color.parseColor("#FFF2CD");
        } else {
            this.f34385n = this.f34382k;
            this.f34386o = -1;
        }
        m53124e();
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
        float f = this.f34372a;
        canvas.drawRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, f, f, this.f34374c);
        int childCount = ((measuredWidth - paddingLeft) - paddingRight) / getChildCount();
        int i = (int) (paddingLeft + (childCount * this.f34378g));
        int i2 = childCount + i;
        int i3 = measuredHeight - paddingBottom;
        float f2 = this.f34373b;
        canvas.drawRoundRect(i, paddingTop, i2, i3, f2, f2, this.f34376e);
        int i4 = this.f34387p;
        float f3 = i + i4;
        float f4 = paddingTop + i4;
        float f5 = i2 - i4;
        float f6 = i3 - i4;
        float f7 = this.f34373b;
        canvas.drawRoundRect(f3, f4, f5, f6, f7, f7, this.f34375d);
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
        this.f34379h = i;
        int i2 = 0;
        while (i2 < getChildCount()) {
            ((PurchaseTabView) getChildAt(i2)).m53119d(i2 == this.f34379h, (vwb.m200296J(this.f34381j) || !this.f34381j.contains(PurchaseType.TYPE_O_DIAMOND)) ? false : sab0.m182891i(this.f34381j.get(this.f34379h)));
            if (NullChecker.m81303a(this.f34380i)) {
                int i3 = this.f34379h;
                InterfaceC8756a interfaceC8756a = this.f34380i;
                if (i2 == i3) {
                    interfaceC8756a.mo53130b(i2);
                } else {
                    interfaceC8756a.mo53129a(i2);
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
