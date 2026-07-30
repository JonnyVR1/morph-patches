package com.p000p1.mobile.putong.feed.newui.kankan.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.xdl0;
import p007l.m9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedCircleProgressBar extends View {

    /* JADX INFO: renamed from: K0 */
    public static final int f1597K0 = (int) Math.sqrt(30.0d);

    /* JADX INFO: renamed from: A */
    public RectF f1598A;

    /* JADX INFO: renamed from: B */
    public RectF f1599B;

    /* JADX INFO: renamed from: C */
    public float f1600C;

    /* JADX INFO: renamed from: D */
    public float f1601D;

    /* JADX INFO: renamed from: E */
    public float f1602E;

    /* JADX INFO: renamed from: E0 */
    public boolean f1603E0;

    /* JADX INFO: renamed from: F */
    public long f1604F;

    /* JADX INFO: renamed from: F0 */
    public boolean f1605F0;

    /* JADX INFO: renamed from: G */
    public long f1606G;

    /* JADX INFO: renamed from: G0 */
    public boolean f1607G0;

    /* JADX INFO: renamed from: H */
    public Paint f1608H;

    /* JADX INFO: renamed from: H0 */
    public InterfaceC2048b f1609H0;

    /* JADX INFO: renamed from: I */
    public float f1610I;

    /* JADX INFO: renamed from: I0 */
    public int f1611I0;

    /* JADX INFO: renamed from: J */
    public float f1612J;

    /* JADX INFO: renamed from: J0 */
    public Handler f1613J0;

    /* JADX INFO: renamed from: K */
    public float f1614K;

    /* JADX INFO: renamed from: L */
    public float f1615L;

    /* JADX INFO: renamed from: M */
    public List<Long> f1616M;

    /* JADX INFO: renamed from: N */
    public List<Float> f1617N;

    /* JADX INFO: renamed from: O */
    public int f1618O;

    /* JADX INFO: renamed from: P */
    public int f1619P;

    /* JADX INFO: renamed from: Q */
    public int f1620Q;

    /* JADX INFO: renamed from: R */
    public int f1621R;

    /* JADX INFO: renamed from: S */
    public ColorStateList f1622S;

    /* JADX INFO: renamed from: T */
    public ColorStateList f1623T;

    /* JADX INFO: renamed from: U */
    public ColorStateList f1624U;

    /* JADX INFO: renamed from: V */
    public ColorStateList f1625V;

    /* JADX INFO: renamed from: W */
    public int f1626W;

    /* JADX INFO: renamed from: a */
    public Paint f1627a;

    /* JADX INFO: renamed from: b */
    public Paint f1628b;

    /* JADX INFO: renamed from: c */
    public int f1629c;

    /* JADX INFO: renamed from: d */
    public int f1630d;

    /* JADX INFO: renamed from: e */
    public int f1631e;

    /* JADX INFO: renamed from: f */
    public Paint f1632f;

    /* JADX INFO: renamed from: g */
    public float f1633g;

    /* JADX INFO: renamed from: h */
    public float f1634h;

    /* JADX INFO: renamed from: i */
    public float f1635i;

    /* JADX INFO: renamed from: j */
    public float f1636j;

    /* JADX INFO: renamed from: k */
    public float f1637k;

    /* JADX INFO: renamed from: k0 */
    public int f1638k0;

    /* JADX INFO: renamed from: l */
    public float f1639l;

    /* JADX INFO: renamed from: m */
    public float f1640m;

    /* JADX INFO: renamed from: n */
    public float f1641n;

    /* JADX INFO: renamed from: o */
    public float f1642o;

    /* JADX INFO: renamed from: p */
    public float f1643p;

    /* JADX INFO: renamed from: p0 */
    public long f1644p0;

    /* JADX INFO: renamed from: q */
    public float f1645q;

    /* JADX INFO: renamed from: r */
    public float f1646r;

    /* JADX INFO: renamed from: s */
    public float f1647s;

    /* JADX INFO: renamed from: t */
    public float f1648t;

    /* JADX INFO: renamed from: u */
    public float f1649u;

    /* JADX INFO: renamed from: v */
    public float f1650v;

    /* JADX INFO: renamed from: w */
    public float f1651w;

    /* JADX INFO: renamed from: x */
    public Paint f1652x;

    /* JADX INFO: renamed from: y */
    public float f1653y;

    /* JADX INFO: renamed from: z */
    public RectF f1654z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.FeedCircleProgressBar$a */
    public class HandlerC2047a extends Handler {
        public HandlerC2047a() {
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            switch (message.what) {
                case 999:
                    FeedCircleProgressBar.this.m3095z();
                    FeedCircleProgressBar.this.m3092w();
                    FeedCircleProgressBar.this.m3093x();
                    FeedCircleProgressBar.this.m3094y();
                    FeedCircleProgressBar.this.m3080T();
                    break;
                case MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO /* 1000 */:
                    FeedCircleProgressBar.this.m3095z();
                    FeedCircleProgressBar.this.m3087r();
                    FeedCircleProgressBar.this.m3089t();
                    FeedCircleProgressBar.this.m3091v();
                    FeedCircleProgressBar.this.m3082V();
                    break;
                case 1001:
                    FeedCircleProgressBar.this.m3086q();
                    FeedCircleProgressBar.this.m3088s();
                    FeedCircleProgressBar.this.m3090u();
                    FeedCircleProgressBar.this.m3079S();
                    break;
                case 1002:
                    FeedCircleProgressBar.this.m3086q();
                    FeedCircleProgressBar.this.m3088s();
                    FeedCircleProgressBar.this.m3090u();
                    FeedCircleProgressBar.this.m3075O();
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.FeedCircleProgressBar$b */
    public interface InterfaceC2048b {
        /* JADX INFO: renamed from: a */
        void mo3096a(int i);

        void onEvent(int i, int i2);
    }

    public FeedCircleProgressBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1631e = xdl0.w(4.0f);
        this.f1654z = new RectF();
        this.f1598A = new RectF();
        this.f1599B = new RectF();
        this.f1618O = 0;
        this.f1619P = 0;
        this.f1620Q = 0;
        this.f1621R = 0;
        this.f1626W = 100;
        this.f1638k0 = 15000;
        this.f1613J0 = new HandlerC2047a();
        m3065E(context, attributeSet);
        m3066F();
    }

    /* JADX INFO: renamed from: A */
    public final void m3061A() {
        switch (this.f1626W) {
            case 101:
                if (!PermissionHelper.b(new String[]{"android.permission.RECORD_AUDIO"})) {
                    PermissionHelper.c().r(new String[]{"android.permission.RECORD_AUDIO"}).w(false).u(true).i(getContext());
                    return;
                }
                m3070J();
                break;
            case 102:
                m3068H();
                break;
            case 103:
                break;
            default:
                m3069I();
                break;
        }
        InterfaceC2048b interfaceC2048b = this.f1609H0;
        if (interfaceC2048b != null) {
            interfaceC2048b.mo3096a(this.f1626W);
        }
    }

    /* JADX INFO: renamed from: B */
    public long m3062B() {
        return this.f1606G;
    }

    /* JADX INFO: renamed from: C */
    public final void m3063C(Canvas canvas) {
        Paint paintM3064D = m3064D();
        Iterator<Float> it = this.f1617N.iterator();
        while (it.hasNext()) {
            canvas.drawArc(this.f1599B, it.next().floatValue() - 92.0f, 4.0f, false, paintM3064D);
        }
    }

    /* JADX INFO: renamed from: D */
    public final Paint m3064D() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(this.f1622S.getDefaultColor());
        paint.setStrokeWidth(this.f1653y);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    /* JADX INFO: renamed from: E */
    public final void m3065E(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9c0.f10337o);
        this.f1629c = typedArrayObtainStyledAttributes.getDimensionPixelSize(m9c0.f10345s, this.f1629c);
        this.f1622S = typedArrayObtainStyledAttributes.getColorStateList(m9c0.f10343r);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(m9c0.f10347t, this.f1631e);
        this.f1631e = dimensionPixelSize;
        this.f1630d = this.f1629c - dimensionPixelSize;
        this.f1623T = typedArrayObtainStyledAttributes.getColorStateList(m9c0.f10349u);
        this.f1624U = typedArrayObtainStyledAttributes.getColorStateList(m9c0.f10341q);
        this.f1625V = typedArrayObtainStyledAttributes.getColorStateList(m9c0.f10339p);
        if (this.f1623T == null) {
            this.f1623T = ColorStateList.valueOf(Color.parseColor("#FE7E1D"));
        }
        if (this.f1624U == null) {
            this.f1624U = ColorStateList.valueOf(Color.parseColor("#FE7E1D"));
        }
        if (this.f1625V == null) {
            this.f1625V = ColorStateList.valueOf(Color.parseColor("#33FFFFFF"));
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m3066F() {
        Paint paint = new Paint();
        this.f1627a = paint;
        paint.setAntiAlias(true);
        this.f1627a.setColor(this.f1622S.getDefaultColor());
        Paint paint2 = this.f1627a;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f1628b = paint3;
        paint3.setAntiAlias(true);
        this.f1628b.setColor(this.f1622S.getDefaultColor());
        Paint paint4 = this.f1628b;
        Paint.Style style2 = Paint.Style.FILL;
        paint4.setStyle(style2);
        Paint paint5 = new Paint();
        this.f1632f = paint5;
        paint5.setAntiAlias(true);
        this.f1632f.setColor(this.f1624U.getDefaultColor());
        this.f1632f.setStyle(style2);
        Paint paint6 = new Paint();
        this.f1652x = paint6;
        paint6.setAntiAlias(true);
        this.f1652x.setColor(this.f1623T.getDefaultColor());
        this.f1652x.setStyle(style);
        Paint paint7 = new Paint();
        this.f1608H = paint7;
        paint7.setAntiAlias(true);
        this.f1608H.setColor(this.f1625V.getDefaultColor());
        this.f1608H.setStyle(style2);
        this.f1616M = new ArrayList();
        this.f1617N = new ArrayList();
    }

    /* JADX INFO: renamed from: G */
    public final void m3067G() {
        this.f1613J0.sendEmptyMessageDelayed(1002, 16L);
    }

    /* JADX INFO: renamed from: H */
    public void m3068H() {
        this.f1613J0.removeMessages(999);
        this.f1613J0.removeMessages(MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        this.f1605F0 = true;
        Long l2 = new Long(this.f1606G);
        if (l2.longValue() > 0) {
            this.f1616M.add(l2);
        }
        this.f1606G = 0L;
        this.f1613J0.sendEmptyMessageDelayed(1001, 16L);
    }

    /* JADX INFO: renamed from: I */
    public void m3069I() {
        this.f1620Q = this.f1618O / 2;
        this.f1621R = this.f1619P / 2;
        invalidate();
    }

    /* JADX INFO: renamed from: J */
    public void m3070J() {
        this.f1644p0 = System.currentTimeMillis();
        if (!this.f1603E0) {
            this.f1603E0 = true;
            this.f1613J0.sendEmptyMessageDelayed(999, 16L);
            return;
        }
        this.f1605F0 = false;
        this.f1607G0 = false;
        this.f1617N.add(new Float(this.f1602E));
        this.f1613J0.sendEmptyMessageDelayed(MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO, 16L);
    }

    /* JADX INFO: renamed from: K */
    public void m3071K() {
        if (this.f1616M.size() > 0) {
            List<Long> list = this.f1616M;
            list.remove(list.size() - 1);
            if (this.f1617N.size() > 0) {
                List<Float> list2 = this.f1617N;
                list2.remove(list2.size() - 1);
            }
            m3077Q();
            if (this.f1616M.size() == 0) {
                m3072L();
            } else {
                float fM3074N = (this.f1606G + m3074N()) / this.f1638k0;
                this.f1601D = fM3074N;
                this.f1602E = fM3074N * 360.0f;
                int iM3074N = (int) ((this.f1606G + m3074N()) / 1000.0f);
                this.f1611I0 = iM3074N;
                m3081U(iM3074N);
            }
            invalidate();
        }
    }

    /* JADX INFO: renamed from: L */
    public void m3072L() {
        this.f1626W = 100;
        this.f1603E0 = false;
        this.f1605F0 = false;
        this.f1607G0 = false;
        this.f1611I0 = 0;
        this.f1606G = 0L;
        this.f1601D = 0.0f;
        this.f1602E = 0.0f;
        this.f1615L = this.f1612J;
        this.f1645q = this.f1633g;
        this.f1646r = this.f1634h;
        this.f1647s = this.f1635i;
        this.f1648t = this.f1636j;
        this.f1649u = this.f1637k;
        RectF rectF = this.f1599B;
        RectF rectF2 = this.f1654z;
        rectF.left = rectF2.left;
        rectF.top = rectF2.top;
        rectF.right = rectF2.right;
        rectF.bottom = rectF2.bottom;
        this.f1617N.clear();
        this.f1616M.clear();
        invalidate();
        m3078R();
    }

    /* JADX INFO: renamed from: M */
    public int m3073M() {
        return this.f1626W;
    }

    /* JADX INFO: renamed from: N */
    public long m3074N() {
        Iterator<Long> it = this.f1616M.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += it.next().longValue();
        }
        return jLongValue;
    }

    /* JADX INFO: renamed from: O */
    public final void m3075O() {
        if (!this.f1607G0) {
            this.f1613J0.sendEmptyMessageDelayed(1002, 16L);
            return;
        }
        InterfaceC2048b interfaceC2048b = this.f1609H0;
        if (interfaceC2048b != null) {
            interfaceC2048b.onEvent(107, 0);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m3076P(boolean z) {
        if (z) {
            long j = this.f1606G;
            if (j > 0) {
                this.f1616M.add(new Long(j));
                this.f1606G = 0L;
            }
            this.f1626W = 102;
            m3067G();
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m3077Q() {
        InterfaceC2048b interfaceC2048b = this.f1609H0;
        if (interfaceC2048b != null) {
            interfaceC2048b.onEvent(104, 0);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m3078R() {
        InterfaceC2048b interfaceC2048b = this.f1609H0;
        if (interfaceC2048b != null) {
            interfaceC2048b.onEvent(106, 0);
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m3079S() {
        if (this.f1607G0) {
            return;
        }
        this.f1613J0.sendEmptyMessageDelayed(1001, 16L);
    }

    /* JADX INFO: renamed from: T */
    public final void m3080T() {
        if (m3074N() + this.f1606G < this.f1638k0 && this.f1626W == 101) {
            this.f1613J0.sendEmptyMessageDelayed(999, 16L);
        } else {
            m3076P(m3074N() + this.f1606G >= ((long) this.f1638k0));
            m3061A();
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m3081U(int i) {
        InterfaceC2048b interfaceC2048b = this.f1609H0;
        if (interfaceC2048b != null) {
            interfaceC2048b.onEvent(105, i);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m3082V() {
        if (m3074N() + this.f1606G < this.f1638k0 && this.f1626W == 101) {
            this.f1613J0.sendEmptyMessageDelayed(MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO, 16L);
        } else {
            m3076P(m3074N() + this.f1606G >= ((long) this.f1638k0));
            m3061A();
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m3083W() {
        int i = this.f1626W;
        if (i == 100 || i == 102) {
            this.f1626W = 101;
        } else if (i == 101) {
            this.f1626W = 102;
        }
    }

    public int getCount() {
        return this.f1616M.size();
    }

    public long getLastDuration() {
        if (this.f1616M.size() <= 0) {
            return 0L;
        }
        List<Long> list = this.f1616M;
        return list.get(list.size() - 1).longValue();
    }

    /* JADX INFO: renamed from: o */
    public void m3084o() {
        m3083W();
        m3061A();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f1626W;
        int i2 = this.f1620Q;
        switch (i) {
            case 101:
            case 102:
            case 103:
                canvas.drawCircle(i2, this.f1621R, this.f1615L, this.f1608H);
                canvas.drawArc(this.f1599B, -90.0f, this.f1602E, false, this.f1652x);
                float f = this.f1645q;
                float f2 = this.f1646r;
                float f3 = this.f1647s;
                float f4 = this.f1648t;
                float f5 = this.f1649u;
                canvas.drawRoundRect(f, f2, f3, f4, f5, f5, this.f1632f);
                m3063C(canvas);
                break;
            default:
                canvas.drawCircle(i2, this.f1621R, this.f1629c, this.f1627a);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f1618O = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f1619P = measuredHeight;
        this.f1620Q = this.f1618O / 2;
        this.f1621R = measuredHeight / 2;
        this.f1627a.setStrokeWidth(this.f1631e);
        this.f1612J = this.f1618O / 2;
        float fW = xdl0.w(46.0f);
        this.f1610I = fW;
        this.f1614K = Math.abs(this.f1612J - fW) / 6.0f;
        this.f1615L = this.f1612J;
        float fW2 = xdl0.w(6.0f);
        this.f1653y = fW2;
        float f = fW2 / 2.0f;
        float f2 = this.f1610I - f;
        float f3 = this.f1612J - f;
        this.f1652x.setStrokeWidth(fW2);
        RectF rectF = this.f1654z;
        rectF.left = f;
        rectF.top = f;
        int i3 = this.f1618O;
        rectF.right = i3 - f;
        rectF.bottom = i3 - f;
        RectF rectF2 = this.f1598A;
        float f4 = (f3 - f2) + f;
        rectF2.left = f4;
        rectF2.top = f4;
        float f5 = f2 * 2.0f;
        rectF2.right = f4 + f5;
        rectF2.bottom = f5 + f4;
        this.f1600C = Math.abs(f4 - rectF.left) / 6.0f;
        RectF rectF3 = this.f1599B;
        RectF rectF4 = this.f1654z;
        rectF3.left = rectF4.left;
        rectF3.top = rectF4.top;
        rectF3.right = rectF4.right;
        rectF3.bottom = rectF4.bottom;
        float fW3 = xdl0.w(24.0f);
        float f6 = (this.f1618O / 2) - (fW3 / 2.0f);
        this.f1633g = f6;
        this.f1634h = f6;
        this.f1635i = f6 + fW3;
        this.f1636j = f6 + fW3;
        this.f1637k = xdl0.w(7.0f);
        float fW4 = xdl0.w(44.0f);
        float f7 = fW4 / 2.0f;
        float f8 = (this.f1618O / 2) - f7;
        this.f1639l = f8;
        this.f1640m = f8;
        this.f1641n = f8 + fW4;
        this.f1642o = fW4 + f8;
        this.f1643p = f7;
        this.f1650v = Math.abs(f8 - this.f1633g) / 6.0f;
        this.f1651w = Math.abs(this.f1643p - this.f1637k) / 6.0f;
        this.f1645q = this.f1633g;
        this.f1646r = this.f1634h;
        this.f1647s = this.f1635i;
        this.f1648t = this.f1636j;
        this.f1649u = this.f1637k;
        this.f1638k0 = 15000;
    }

    /* JADX INFO: renamed from: p */
    public void m3085p(int i) {
        this.f1626W = i;
        m3061A();
    }

    /* JADX INFO: renamed from: q */
    public final void m3086q() {
        float f = this.f1615L;
        float f2 = this.f1610I;
        if (f <= f2) {
            this.f1615L = f2;
            invalidate();
        } else {
            this.f1615L = f - this.f1614K;
            invalidate();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m3087r() {
        float f = this.f1615L;
        float f2 = this.f1612J;
        if (f >= f2) {
            this.f1615L = f2;
            invalidate();
        } else {
            this.f1615L = f + this.f1614K;
            invalidate();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m3088s() {
        float f = this.f1645q;
        float f2 = this.f1639l;
        if (f >= f2) {
            float f3 = this.f1649u;
            float f4 = this.f1643p;
            if (f3 >= f4) {
                this.f1645q = f2;
                this.f1646r = this.f1640m;
                this.f1647s = this.f1641n;
                this.f1648t = this.f1642o;
                this.f1649u = f4;
                invalidate();
                return;
            }
        }
        float f5 = this.f1650v;
        this.f1645q = f - f5;
        this.f1646r -= f5;
        this.f1647s += f5;
        this.f1648t += f5;
        this.f1649u += this.f1651w;
        invalidate();
    }

    public void setStateListener(InterfaceC2048b interfaceC2048b) {
        this.f1609H0 = interfaceC2048b;
    }

    /* JADX INFO: renamed from: t */
    public final void m3089t() {
        float f = this.f1645q;
        float f2 = this.f1633g;
        if (f >= f2) {
            float f3 = this.f1649u;
            float f4 = this.f1637k;
            if (f3 <= f4) {
                this.f1645q = f2;
                this.f1646r = this.f1634h;
                this.f1647s = this.f1635i;
                this.f1648t = this.f1636j;
                this.f1649u = f4;
                invalidate();
                return;
            }
        }
        float f5 = this.f1650v;
        this.f1645q = f + f5;
        this.f1646r += f5;
        this.f1647s -= f5;
        this.f1648t -= f5;
        this.f1649u -= this.f1651w;
        invalidate();
    }

    /* JADX INFO: renamed from: u */
    public final void m3090u() {
        RectF rectF = this.f1599B;
        float f = rectF.left;
        RectF rectF2 = this.f1598A;
        float f2 = rectF2.left;
        if (f >= f2) {
            rectF.left = f2;
            rectF.top = rectF2.top;
            rectF.right = rectF2.right;
            rectF.bottom = rectF2.bottom;
            this.f1607G0 = true;
            invalidate();
            return;
        }
        float f3 = this.f1600C;
        rectF.left = f + f3;
        rectF.top += f3;
        rectF.right -= f3;
        rectF.bottom -= f3;
        invalidate();
    }

    /* JADX INFO: renamed from: v */
    public final void m3091v() {
        RectF rectF = this.f1599B;
        float f = rectF.left;
        RectF rectF2 = this.f1654z;
        float f2 = rectF2.left;
        if (f <= f2) {
            rectF.left = f2;
            rectF.top = rectF2.top;
            rectF.right = rectF2.right;
            rectF.bottom = rectF2.bottom;
            invalidate();
            return;
        }
        float f3 = this.f1600C;
        rectF.left = f - f3;
        rectF.top -= f3;
        rectF.right += f3;
        rectF.bottom += f3;
        invalidate();
    }

    /* JADX INFO: renamed from: w */
    public final void m3092w() {
        this.f1615L = this.f1612J;
        invalidate();
    }

    /* JADX INFO: renamed from: x */
    public final void m3093x() {
        this.f1645q = this.f1633g;
        this.f1646r = this.f1634h;
        this.f1647s = this.f1635i;
        this.f1648t = this.f1636j;
        this.f1649u = this.f1637k;
        invalidate();
    }

    /* JADX INFO: renamed from: y */
    public final void m3094y() {
        RectF rectF = this.f1599B;
        RectF rectF2 = this.f1654z;
        rectF.left = rectF2.left;
        rectF.top = rectF2.top;
        rectF.right = rectF2.right;
        rectF.bottom = rectF2.bottom;
        invalidate();
    }

    /* JADX INFO: renamed from: z */
    public final void m3095z() {
        if (this.f1605F0 || m3074N() + this.f1606G > this.f1638k0) {
            Long l2 = new Long(this.f1606G);
            if (l2.longValue() > 0) {
                this.f1616M.add(l2);
            }
            this.f1606G = 0L;
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f1604F = jCurrentTimeMillis;
        long j = jCurrentTimeMillis - this.f1644p0;
        this.f1606G = j;
        int iM3074N = (int) ((j + m3074N()) / 1000.0f);
        int i = this.f1611I0;
        if (iM3074N < i) {
            iM3074N = i;
        }
        this.f1611I0 = iM3074N;
        m3081U(iM3074N);
        float fM3074N = (this.f1606G + m3074N()) / this.f1638k0;
        this.f1601D = fM3074N;
        this.f1602E = fM3074N * 360.0f;
        invalidate();
    }

    public FeedCircleProgressBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedCircleProgressBar(Context context) {
        this(context, null);
    }
}
