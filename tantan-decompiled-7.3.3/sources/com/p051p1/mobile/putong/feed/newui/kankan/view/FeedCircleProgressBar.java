package com.p051p1.mobile.putong.feed.newui.kankan.view;

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
import androidx.room.RoomDatabase;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tencent.could.component.common.p084ai.eventreport.entry.NetWorkParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p153l.bnl0;
import p153l.shc0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedCircleProgressBar extends View {

    /* JADX INFO: renamed from: K0 */
    public static final int f40984K0 = (int) Math.sqrt(30.0d);

    /* JADX INFO: renamed from: A */
    public RectF f40985A;

    /* JADX INFO: renamed from: B */
    public RectF f40986B;

    /* JADX INFO: renamed from: C */
    public float f40987C;

    /* JADX INFO: renamed from: D */
    public float f40988D;

    /* JADX INFO: renamed from: E */
    public float f40989E;

    /* JADX INFO: renamed from: E0 */
    public boolean f40990E0;

    /* JADX INFO: renamed from: F */
    public long f40991F;

    /* JADX INFO: renamed from: F0 */
    public boolean f40992F0;

    /* JADX INFO: renamed from: G */
    public long f40993G;

    /* JADX INFO: renamed from: G0 */
    public boolean f40994G0;

    /* JADX INFO: renamed from: H */
    public Paint f40995H;

    /* JADX INFO: renamed from: H0 */
    public InterfaceC11367b f40996H0;

    /* JADX INFO: renamed from: I */
    public float f40997I;

    /* JADX INFO: renamed from: I0 */
    public int f40998I0;

    /* JADX INFO: renamed from: J */
    public float f40999J;

    /* JADX INFO: renamed from: J0 */
    public Handler f41000J0;

    /* JADX INFO: renamed from: K */
    public float f41001K;

    /* JADX INFO: renamed from: L */
    public float f41002L;

    /* JADX INFO: renamed from: M */
    public List<Long> f41003M;

    /* JADX INFO: renamed from: N */
    public List<Float> f41004N;

    /* JADX INFO: renamed from: O */
    public int f41005O;

    /* JADX INFO: renamed from: P */
    public int f41006P;

    /* JADX INFO: renamed from: Q */
    public int f41007Q;

    /* JADX INFO: renamed from: R */
    public int f41008R;

    /* JADX INFO: renamed from: S */
    public ColorStateList f41009S;

    /* JADX INFO: renamed from: T */
    public ColorStateList f41010T;

    /* JADX INFO: renamed from: U */
    public ColorStateList f41011U;

    /* JADX INFO: renamed from: V */
    public ColorStateList f41012V;

    /* JADX INFO: renamed from: W */
    public int f41013W;

    /* JADX INFO: renamed from: a */
    public Paint f41014a;

    /* JADX INFO: renamed from: b */
    public Paint f41015b;

    /* JADX INFO: renamed from: c */
    public int f41016c;

    /* JADX INFO: renamed from: d */
    public int f41017d;

    /* JADX INFO: renamed from: e */
    public int f41018e;

    /* JADX INFO: renamed from: f */
    public Paint f41019f;

    /* JADX INFO: renamed from: g */
    public float f41020g;

    /* JADX INFO: renamed from: h */
    public float f41021h;

    /* JADX INFO: renamed from: i */
    public float f41022i;

    /* JADX INFO: renamed from: j */
    public float f41023j;

    /* JADX INFO: renamed from: k */
    public float f41024k;

    /* JADX INFO: renamed from: k0 */
    public int f41025k0;

    /* JADX INFO: renamed from: l */
    public float f41026l;

    /* JADX INFO: renamed from: m */
    public float f41027m;

    /* JADX INFO: renamed from: n */
    public float f41028n;

    /* JADX INFO: renamed from: o */
    public float f41029o;

    /* JADX INFO: renamed from: p */
    public float f41030p;

    /* JADX INFO: renamed from: p0 */
    public long f41031p0;

    /* JADX INFO: renamed from: q */
    public float f41032q;

    /* JADX INFO: renamed from: r */
    public float f41033r;

    /* JADX INFO: renamed from: s */
    public float f41034s;

    /* JADX INFO: renamed from: t */
    public float f41035t;

    /* JADX INFO: renamed from: u */
    public float f41036u;

    /* JADX INFO: renamed from: v */
    public float f41037v;

    /* JADX INFO: renamed from: w */
    public float f41038w;

    /* JADX INFO: renamed from: x */
    public Paint f41039x;

    /* JADX INFO: renamed from: y */
    public float f41040y;

    /* JADX INFO: renamed from: z */
    public RectF f41041z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.FeedCircleProgressBar$a */
    public class HandlerC11366a extends Handler {
        public HandlerC11366a() {
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            switch (message.what) {
                case RoomDatabase.MAX_BIND_PARAMETER_CNT /* 999 */:
                    FeedCircleProgressBar.this.m63296z();
                    FeedCircleProgressBar.this.m63293w();
                    FeedCircleProgressBar.this.m63294x();
                    FeedCircleProgressBar.this.m63295y();
                    FeedCircleProgressBar.this.m63281T();
                    break;
                case 1000:
                    FeedCircleProgressBar.this.m63296z();
                    FeedCircleProgressBar.this.m63288r();
                    FeedCircleProgressBar.this.m63290t();
                    FeedCircleProgressBar.this.m63292v();
                    FeedCircleProgressBar.this.m63283V();
                    break;
                case 1001:
                    FeedCircleProgressBar.this.m63287q();
                    FeedCircleProgressBar.this.m63289s();
                    FeedCircleProgressBar.this.m63291u();
                    FeedCircleProgressBar.this.m63280S();
                    break;
                case 1002:
                    FeedCircleProgressBar.this.m63287q();
                    FeedCircleProgressBar.this.m63289s();
                    FeedCircleProgressBar.this.m63291u();
                    FeedCircleProgressBar.this.m63276O();
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.FeedCircleProgressBar$b */
    public interface InterfaceC11367b {
        /* JADX INFO: renamed from: a */
        void mo63297a(int i);

        void onEvent(int i, int i2);
    }

    public FeedCircleProgressBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41018e = bnl0.m105587w(4.0f);
        this.f41041z = new RectF();
        this.f40985A = new RectF();
        this.f40986B = new RectF();
        this.f41005O = 0;
        this.f41006P = 0;
        this.f41007Q = 0;
        this.f41008R = 0;
        this.f41013W = 100;
        this.f41025k0 = NetWorkParam.DEFAULT_CONNECT_TIME_OUT;
        this.f41000J0 = new HandlerC11366a();
        m63266E(context, attributeSet);
        m63267F();
    }

    /* JADX INFO: renamed from: A */
    public final void m63262A() {
        switch (this.f41013W) {
            case 101:
                if (!PermissionHelper.m81064b("android.permission.RECORD_AUDIO")) {
                    PermissionHelper.m81065c().m81083r("android.permission.RECORD_AUDIO").m81088w(false).m81086u(true).m81074i((Act) getContext());
                    return;
                }
                m63271J();
                break;
            case 102:
                m63269H();
                break;
            case 103:
                break;
            default:
                m63270I();
                break;
        }
        InterfaceC11367b interfaceC11367b = this.f40996H0;
        if (interfaceC11367b != null) {
            interfaceC11367b.mo63297a(this.f41013W);
        }
    }

    /* JADX INFO: renamed from: B */
    public long m63263B() {
        return this.f40993G;
    }

    /* JADX INFO: renamed from: C */
    public final void m63264C(Canvas canvas) {
        Paint paintM63265D = m63265D();
        Iterator<Float> it = this.f41004N.iterator();
        while (it.hasNext()) {
            canvas.drawArc(this.f40986B, it.next().floatValue() - 92.0f, 4.0f, false, paintM63265D);
        }
    }

    /* JADX INFO: renamed from: D */
    public final Paint m63265D() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(this.f41009S.getDefaultColor());
        paint.setStrokeWidth(this.f41040y);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    /* JADX INFO: renamed from: E */
    public final void m63266E(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, shc0.f168668o);
        this.f41016c = typedArrayObtainStyledAttributes.getDimensionPixelSize(shc0.f168676s, this.f41016c);
        this.f41009S = typedArrayObtainStyledAttributes.getColorStateList(shc0.f168674r);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(shc0.f168678t, this.f41018e);
        this.f41018e = dimensionPixelSize;
        this.f41017d = this.f41016c - dimensionPixelSize;
        this.f41010T = typedArrayObtainStyledAttributes.getColorStateList(shc0.f168680u);
        this.f41011U = typedArrayObtainStyledAttributes.getColorStateList(shc0.f168672q);
        this.f41012V = typedArrayObtainStyledAttributes.getColorStateList(shc0.f168670p);
        if (this.f41010T == null) {
            this.f41010T = ColorStateList.valueOf(Color.parseColor("#FE7E1D"));
        }
        if (this.f41011U == null) {
            this.f41011U = ColorStateList.valueOf(Color.parseColor("#FE7E1D"));
        }
        if (this.f41012V == null) {
            this.f41012V = ColorStateList.valueOf(Color.parseColor("#33FFFFFF"));
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m63267F() {
        Paint paint = new Paint();
        this.f41014a = paint;
        paint.setAntiAlias(true);
        this.f41014a.setColor(this.f41009S.getDefaultColor());
        Paint paint2 = this.f41014a;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f41015b = paint3;
        paint3.setAntiAlias(true);
        this.f41015b.setColor(this.f41009S.getDefaultColor());
        Paint paint4 = this.f41015b;
        Paint.Style style2 = Paint.Style.FILL;
        paint4.setStyle(style2);
        Paint paint5 = new Paint();
        this.f41019f = paint5;
        paint5.setAntiAlias(true);
        this.f41019f.setColor(this.f41011U.getDefaultColor());
        this.f41019f.setStyle(style2);
        Paint paint6 = new Paint();
        this.f41039x = paint6;
        paint6.setAntiAlias(true);
        this.f41039x.setColor(this.f41010T.getDefaultColor());
        this.f41039x.setStyle(style);
        Paint paint7 = new Paint();
        this.f40995H = paint7;
        paint7.setAntiAlias(true);
        this.f40995H.setColor(this.f41012V.getDefaultColor());
        this.f40995H.setStyle(style2);
        this.f41003M = new ArrayList();
        this.f41004N = new ArrayList();
    }

    /* JADX INFO: renamed from: G */
    public final void m63268G() {
        this.f41000J0.sendEmptyMessageDelayed(1002, 16L);
    }

    /* JADX INFO: renamed from: H */
    public void m63269H() {
        this.f41000J0.removeMessages(RoomDatabase.MAX_BIND_PARAMETER_CNT);
        this.f41000J0.removeMessages(1000);
        this.f40992F0 = true;
        Long l2 = new Long(this.f40993G);
        if (l2.longValue() > 0) {
            this.f41003M.add(l2);
        }
        this.f40993G = 0L;
        this.f41000J0.sendEmptyMessageDelayed(1001, 16L);
    }

    /* JADX INFO: renamed from: I */
    public void m63270I() {
        this.f41007Q = this.f41005O / 2;
        this.f41008R = this.f41006P / 2;
        invalidate();
    }

    /* JADX INFO: renamed from: J */
    public void m63271J() {
        this.f41031p0 = System.currentTimeMillis();
        if (!this.f40990E0) {
            this.f40990E0 = true;
            this.f41000J0.sendEmptyMessageDelayed(RoomDatabase.MAX_BIND_PARAMETER_CNT, 16L);
            return;
        }
        this.f40992F0 = false;
        this.f40994G0 = false;
        this.f41004N.add(new Float(this.f40989E));
        this.f41000J0.sendEmptyMessageDelayed(1000, 16L);
    }

    /* JADX INFO: renamed from: K */
    public void m63272K() {
        if (this.f41003M.size() > 0) {
            List<Long> list = this.f41003M;
            list.remove(list.size() - 1);
            if (this.f41004N.size() > 0) {
                List<Float> list2 = this.f41004N;
                list2.remove(list2.size() - 1);
            }
            m63278Q();
            if (this.f41003M.size() == 0) {
                m63273L();
            } else {
                float fM63275N = (this.f40993G + m63275N()) / this.f41025k0;
                this.f40988D = fM63275N;
                this.f40989E = fM63275N * 360.0f;
                int iM63275N = (int) ((this.f40993G + m63275N()) / 1000.0f);
                this.f40998I0 = iM63275N;
                m63282U(iM63275N);
            }
            invalidate();
        }
    }

    /* JADX INFO: renamed from: L */
    public void m63273L() {
        this.f41013W = 100;
        this.f40990E0 = false;
        this.f40992F0 = false;
        this.f40994G0 = false;
        this.f40998I0 = 0;
        this.f40993G = 0L;
        this.f40988D = 0.0f;
        this.f40989E = 0.0f;
        this.f41002L = this.f40999J;
        this.f41032q = this.f41020g;
        this.f41033r = this.f41021h;
        this.f41034s = this.f41022i;
        this.f41035t = this.f41023j;
        this.f41036u = this.f41024k;
        RectF rectF = this.f40986B;
        RectF rectF2 = this.f41041z;
        rectF.left = rectF2.left;
        rectF.top = rectF2.top;
        rectF.right = rectF2.right;
        rectF.bottom = rectF2.bottom;
        this.f41004N.clear();
        this.f41003M.clear();
        invalidate();
        m63279R();
    }

    /* JADX INFO: renamed from: M */
    public int m63274M() {
        return this.f41013W;
    }

    /* JADX INFO: renamed from: N */
    public long m63275N() {
        Iterator<Long> it = this.f41003M.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += it.next().longValue();
        }
        return jLongValue;
    }

    /* JADX INFO: renamed from: O */
    public final void m63276O() {
        if (!this.f40994G0) {
            this.f41000J0.sendEmptyMessageDelayed(1002, 16L);
            return;
        }
        InterfaceC11367b interfaceC11367b = this.f40996H0;
        if (interfaceC11367b != null) {
            interfaceC11367b.onEvent(107, 0);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m63277P(boolean z) {
        if (z) {
            long j = this.f40993G;
            if (j > 0) {
                this.f41003M.add(new Long(j));
                this.f40993G = 0L;
            }
            this.f41013W = 102;
            m63268G();
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m63278Q() {
        InterfaceC11367b interfaceC11367b = this.f40996H0;
        if (interfaceC11367b != null) {
            interfaceC11367b.onEvent(104, 0);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m63279R() {
        InterfaceC11367b interfaceC11367b = this.f40996H0;
        if (interfaceC11367b != null) {
            interfaceC11367b.onEvent(106, 0);
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m63280S() {
        if (this.f40994G0) {
            return;
        }
        this.f41000J0.sendEmptyMessageDelayed(1001, 16L);
    }

    /* JADX INFO: renamed from: T */
    public final void m63281T() {
        if (m63275N() + this.f40993G < this.f41025k0 && this.f41013W == 101) {
            this.f41000J0.sendEmptyMessageDelayed(RoomDatabase.MAX_BIND_PARAMETER_CNT, 16L);
        } else {
            m63277P(m63275N() + this.f40993G >= ((long) this.f41025k0));
            m63262A();
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m63282U(int i) {
        InterfaceC11367b interfaceC11367b = this.f40996H0;
        if (interfaceC11367b != null) {
            interfaceC11367b.onEvent(105, i);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m63283V() {
        if (m63275N() + this.f40993G < this.f41025k0 && this.f41013W == 101) {
            this.f41000J0.sendEmptyMessageDelayed(1000, 16L);
        } else {
            m63277P(m63275N() + this.f40993G >= ((long) this.f41025k0));
            m63262A();
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m63284W() {
        int i = this.f41013W;
        if (i == 100 || i == 102) {
            this.f41013W = 101;
        } else if (i == 101) {
            this.f41013W = 102;
        }
    }

    public int getCount() {
        return this.f41003M.size();
    }

    public long getLastDuration() {
        if (this.f41003M.size() <= 0) {
            return 0L;
        }
        List<Long> list = this.f41003M;
        return list.get(list.size() - 1).longValue();
    }

    /* JADX INFO: renamed from: o */
    public void m63285o() {
        m63284W();
        m63262A();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f41013W;
        int i2 = this.f41007Q;
        switch (i) {
            case 101:
            case 102:
            case 103:
                canvas.drawCircle(i2, this.f41008R, this.f41002L, this.f40995H);
                canvas.drawArc(this.f40986B, -90.0f, this.f40989E, false, this.f41039x);
                float f = this.f41032q;
                float f2 = this.f41033r;
                float f3 = this.f41034s;
                float f4 = this.f41035t;
                float f5 = this.f41036u;
                canvas.drawRoundRect(f, f2, f3, f4, f5, f5, this.f41019f);
                m63264C(canvas);
                break;
            default:
                canvas.drawCircle(i2, this.f41008R, this.f41016c, this.f41014a);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f41005O = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f41006P = measuredHeight;
        this.f41007Q = this.f41005O / 2;
        this.f41008R = measuredHeight / 2;
        this.f41014a.setStrokeWidth(this.f41018e);
        this.f40999J = this.f41005O / 2;
        float fM105587w = bnl0.m105587w(46.0f);
        this.f40997I = fM105587w;
        this.f41001K = Math.abs(this.f40999J - fM105587w) / 6.0f;
        this.f41002L = this.f40999J;
        float fM105587w2 = bnl0.m105587w(6.0f);
        this.f41040y = fM105587w2;
        float f = fM105587w2 / 2.0f;
        float f2 = this.f40997I - f;
        float f3 = this.f40999J - f;
        this.f41039x.setStrokeWidth(fM105587w2);
        RectF rectF = this.f41041z;
        rectF.left = f;
        rectF.top = f;
        int i3 = this.f41005O;
        rectF.right = i3 - f;
        rectF.bottom = i3 - f;
        RectF rectF2 = this.f40985A;
        float f4 = (f3 - f2) + f;
        rectF2.left = f4;
        rectF2.top = f4;
        float f5 = f2 * 2.0f;
        rectF2.right = f4 + f5;
        rectF2.bottom = f5 + f4;
        this.f40987C = Math.abs(f4 - rectF.left) / 6.0f;
        RectF rectF3 = this.f40986B;
        RectF rectF4 = this.f41041z;
        rectF3.left = rectF4.left;
        rectF3.top = rectF4.top;
        rectF3.right = rectF4.right;
        rectF3.bottom = rectF4.bottom;
        float fM105587w3 = bnl0.m105587w(24.0f);
        float f6 = (this.f41005O / 2) - (fM105587w3 / 2.0f);
        this.f41020g = f6;
        this.f41021h = f6;
        this.f41022i = f6 + fM105587w3;
        this.f41023j = f6 + fM105587w3;
        this.f41024k = bnl0.m105587w(7.0f);
        float fM105587w4 = bnl0.m105587w(44.0f);
        float f7 = fM105587w4 / 2.0f;
        float f8 = (this.f41005O / 2) - f7;
        this.f41026l = f8;
        this.f41027m = f8;
        this.f41028n = f8 + fM105587w4;
        this.f41029o = fM105587w4 + f8;
        this.f41030p = f7;
        this.f41037v = Math.abs(f8 - this.f41020g) / 6.0f;
        this.f41038w = Math.abs(this.f41030p - this.f41024k) / 6.0f;
        this.f41032q = this.f41020g;
        this.f41033r = this.f41021h;
        this.f41034s = this.f41022i;
        this.f41035t = this.f41023j;
        this.f41036u = this.f41024k;
        this.f41025k0 = NetWorkParam.DEFAULT_CONNECT_TIME_OUT;
    }

    /* JADX INFO: renamed from: p */
    public void m63286p(int i) {
        this.f41013W = i;
        m63262A();
    }

    /* JADX INFO: renamed from: q */
    public final void m63287q() {
        float f = this.f41002L;
        float f2 = this.f40997I;
        if (f <= f2) {
            this.f41002L = f2;
            invalidate();
        } else {
            this.f41002L = f - this.f41001K;
            invalidate();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m63288r() {
        float f = this.f41002L;
        float f2 = this.f40999J;
        if (f >= f2) {
            this.f41002L = f2;
            invalidate();
        } else {
            this.f41002L = f + this.f41001K;
            invalidate();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m63289s() {
        float f = this.f41032q;
        float f2 = this.f41026l;
        if (f >= f2) {
            float f3 = this.f41036u;
            float f4 = this.f41030p;
            if (f3 >= f4) {
                this.f41032q = f2;
                this.f41033r = this.f41027m;
                this.f41034s = this.f41028n;
                this.f41035t = this.f41029o;
                this.f41036u = f4;
                invalidate();
                return;
            }
        }
        float f5 = this.f41037v;
        this.f41032q = f - f5;
        this.f41033r -= f5;
        this.f41034s += f5;
        this.f41035t += f5;
        this.f41036u += this.f41038w;
        invalidate();
    }

    public void setStateListener(InterfaceC11367b interfaceC11367b) {
        this.f40996H0 = interfaceC11367b;
    }

    /* JADX INFO: renamed from: t */
    public final void m63290t() {
        float f = this.f41032q;
        float f2 = this.f41020g;
        if (f >= f2) {
            float f3 = this.f41036u;
            float f4 = this.f41024k;
            if (f3 <= f4) {
                this.f41032q = f2;
                this.f41033r = this.f41021h;
                this.f41034s = this.f41022i;
                this.f41035t = this.f41023j;
                this.f41036u = f4;
                invalidate();
                return;
            }
        }
        float f5 = this.f41037v;
        this.f41032q = f + f5;
        this.f41033r += f5;
        this.f41034s -= f5;
        this.f41035t -= f5;
        this.f41036u -= this.f41038w;
        invalidate();
    }

    /* JADX INFO: renamed from: u */
    public final void m63291u() {
        RectF rectF = this.f40986B;
        float f = rectF.left;
        RectF rectF2 = this.f40985A;
        float f2 = rectF2.left;
        if (f >= f2) {
            rectF.left = f2;
            rectF.top = rectF2.top;
            rectF.right = rectF2.right;
            rectF.bottom = rectF2.bottom;
            this.f40994G0 = true;
            invalidate();
            return;
        }
        float f3 = this.f40987C;
        rectF.left = f + f3;
        rectF.top += f3;
        rectF.right -= f3;
        rectF.bottom -= f3;
        invalidate();
    }

    /* JADX INFO: renamed from: v */
    public final void m63292v() {
        RectF rectF = this.f40986B;
        float f = rectF.left;
        RectF rectF2 = this.f41041z;
        float f2 = rectF2.left;
        if (f <= f2) {
            rectF.left = f2;
            rectF.top = rectF2.top;
            rectF.right = rectF2.right;
            rectF.bottom = rectF2.bottom;
            invalidate();
            return;
        }
        float f3 = this.f40987C;
        rectF.left = f - f3;
        rectF.top -= f3;
        rectF.right += f3;
        rectF.bottom += f3;
        invalidate();
    }

    /* JADX INFO: renamed from: w */
    public final void m63293w() {
        this.f41002L = this.f40999J;
        invalidate();
    }

    /* JADX INFO: renamed from: x */
    public final void m63294x() {
        this.f41032q = this.f41020g;
        this.f41033r = this.f41021h;
        this.f41034s = this.f41022i;
        this.f41035t = this.f41023j;
        this.f41036u = this.f41024k;
        invalidate();
    }

    /* JADX INFO: renamed from: y */
    public final void m63295y() {
        RectF rectF = this.f40986B;
        RectF rectF2 = this.f41041z;
        rectF.left = rectF2.left;
        rectF.top = rectF2.top;
        rectF.right = rectF2.right;
        rectF.bottom = rectF2.bottom;
        invalidate();
    }

    /* JADX INFO: renamed from: z */
    public final void m63296z() {
        if (this.f40992F0 || m63275N() + this.f40993G > this.f41025k0) {
            Long l2 = new Long(this.f40993G);
            if (l2.longValue() > 0) {
                this.f41003M.add(l2);
            }
            this.f40993G = 0L;
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f40991F = jCurrentTimeMillis;
        long j = jCurrentTimeMillis - this.f41031p0;
        this.f40993G = j;
        int iM63275N = (int) ((j + m63275N()) / 1000.0f);
        int i = this.f40998I0;
        if (iM63275N < i) {
            iM63275N = i;
        }
        this.f40998I0 = iM63275N;
        m63282U(iM63275N);
        float fM63275N = (this.f40993G + m63275N()) / this.f41025k0;
        this.f40988D = fM63275N;
        this.f40989E = fM63275N * 360.0f;
        invalidate();
    }

    public FeedCircleProgressBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedCircleProgressBar(Context context) {
        this(context, null);
    }
}
