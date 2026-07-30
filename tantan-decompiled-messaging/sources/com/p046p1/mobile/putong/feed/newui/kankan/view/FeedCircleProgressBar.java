package com.p046p1.mobile.putong.feed.newui.kankan.view;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tencent.could.component.common.p079ai.eventreport.entry.NetWorkParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p149l.m9c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedCircleProgressBar extends View {

    /* JADX INFO: renamed from: K0 */
    public static final int f40136K0 = (int) Math.sqrt(30.0d);

    /* JADX INFO: renamed from: A */
    public RectF f40137A;

    /* JADX INFO: renamed from: B */
    public RectF f40138B;

    /* JADX INFO: renamed from: C */
    public float f40139C;

    /* JADX INFO: renamed from: D */
    public float f40140D;

    /* JADX INFO: renamed from: E */
    public float f40141E;

    /* JADX INFO: renamed from: E0 */
    public boolean f40142E0;

    /* JADX INFO: renamed from: F */
    public long f40143F;

    /* JADX INFO: renamed from: F0 */
    public boolean f40144F0;

    /* JADX INFO: renamed from: G */
    public long f40145G;

    /* JADX INFO: renamed from: G0 */
    public boolean f40146G0;

    /* JADX INFO: renamed from: H */
    public Paint f40147H;

    /* JADX INFO: renamed from: H0 */
    public InterfaceC11204b f40148H0;

    /* JADX INFO: renamed from: I */
    public float f40149I;

    /* JADX INFO: renamed from: I0 */
    public int f40150I0;

    /* JADX INFO: renamed from: J */
    public float f40151J;

    /* JADX INFO: renamed from: J0 */
    public Handler f40152J0;

    /* JADX INFO: renamed from: K */
    public float f40153K;

    /* JADX INFO: renamed from: L */
    public float f40154L;

    /* JADX INFO: renamed from: M */
    public List<Long> f40155M;

    /* JADX INFO: renamed from: N */
    public List<Float> f40156N;

    /* JADX INFO: renamed from: O */
    public int f40157O;

    /* JADX INFO: renamed from: P */
    public int f40158P;

    /* JADX INFO: renamed from: Q */
    public int f40159Q;

    /* JADX INFO: renamed from: R */
    public int f40160R;

    /* JADX INFO: renamed from: S */
    public ColorStateList f40161S;

    /* JADX INFO: renamed from: T */
    public ColorStateList f40162T;

    /* JADX INFO: renamed from: U */
    public ColorStateList f40163U;

    /* JADX INFO: renamed from: V */
    public ColorStateList f40164V;

    /* JADX INFO: renamed from: W */
    public int f40165W;

    /* JADX INFO: renamed from: a */
    public Paint f40166a;

    /* JADX INFO: renamed from: b */
    public Paint f40167b;

    /* JADX INFO: renamed from: c */
    public int f40168c;

    /* JADX INFO: renamed from: d */
    public int f40169d;

    /* JADX INFO: renamed from: e */
    public int f40170e;

    /* JADX INFO: renamed from: f */
    public Paint f40171f;

    /* JADX INFO: renamed from: g */
    public float f40172g;

    /* JADX INFO: renamed from: h */
    public float f40173h;

    /* JADX INFO: renamed from: i */
    public float f40174i;

    /* JADX INFO: renamed from: j */
    public float f40175j;

    /* JADX INFO: renamed from: k */
    public float f40176k;

    /* JADX INFO: renamed from: k0 */
    public int f40177k0;

    /* JADX INFO: renamed from: l */
    public float f40178l;

    /* JADX INFO: renamed from: m */
    public float f40179m;

    /* JADX INFO: renamed from: n */
    public float f40180n;

    /* JADX INFO: renamed from: o */
    public float f40181o;

    /* JADX INFO: renamed from: p */
    public float f40182p;

    /* JADX INFO: renamed from: p0 */
    public long f40183p0;

    /* JADX INFO: renamed from: q */
    public float f40184q;

    /* JADX INFO: renamed from: r */
    public float f40185r;

    /* JADX INFO: renamed from: s */
    public float f40186s;

    /* JADX INFO: renamed from: t */
    public float f40187t;

    /* JADX INFO: renamed from: u */
    public float f40188u;

    /* JADX INFO: renamed from: v */
    public float f40189v;

    /* JADX INFO: renamed from: w */
    public float f40190w;

    /* JADX INFO: renamed from: x */
    public Paint f40191x;

    /* JADX INFO: renamed from: y */
    public float f40192y;

    /* JADX INFO: renamed from: z */
    public RectF f40193z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.FeedCircleProgressBar$a */
    public class HandlerC11203a extends Handler {
        public HandlerC11203a() {
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            switch (message.what) {
                case RoomDatabase.MAX_BIND_PARAMETER_CNT /* 999 */:
                    FeedCircleProgressBar.this.m62113z();
                    FeedCircleProgressBar.this.m62110w();
                    FeedCircleProgressBar.this.m62111x();
                    FeedCircleProgressBar.this.m62112y();
                    FeedCircleProgressBar.this.m62098T();
                    break;
                case 1000:
                    FeedCircleProgressBar.this.m62113z();
                    FeedCircleProgressBar.this.m62105r();
                    FeedCircleProgressBar.this.m62107t();
                    FeedCircleProgressBar.this.m62109v();
                    FeedCircleProgressBar.this.m62100V();
                    break;
                case 1001:
                    FeedCircleProgressBar.this.m62104q();
                    FeedCircleProgressBar.this.m62106s();
                    FeedCircleProgressBar.this.m62108u();
                    FeedCircleProgressBar.this.m62097S();
                    break;
                case 1002:
                    FeedCircleProgressBar.this.m62104q();
                    FeedCircleProgressBar.this.m62106s();
                    FeedCircleProgressBar.this.m62108u();
                    FeedCircleProgressBar.this.m62093O();
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.FeedCircleProgressBar$b */
    public interface InterfaceC11204b {
        /* JADX INFO: renamed from: a */
        void mo62114a(int i);

        void onEvent(int i, int i2);
    }

    public FeedCircleProgressBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40170e = xdl0.m208407w(4.0f);
        this.f40193z = new RectF();
        this.f40137A = new RectF();
        this.f40138B = new RectF();
        this.f40157O = 0;
        this.f40158P = 0;
        this.f40159Q = 0;
        this.f40160R = 0;
        this.f40165W = 100;
        this.f40177k0 = NetWorkParam.DEFAULT_CONNECT_TIME_OUT;
        this.f40152J0 = new HandlerC11203a();
        m62083E(context, attributeSet);
        m62084F();
    }

    /* JADX INFO: renamed from: A */
    public final void m62079A() {
        switch (this.f40165W) {
            case 101:
                if (!PermissionHelper.m79881b("android.permission.RECORD_AUDIO")) {
                    PermissionHelper.m79882c().m79900r("android.permission.RECORD_AUDIO").m79905w(false).m79903u(true).m79891i((Act) getContext());
                    return;
                }
                m62088J();
                break;
            case 102:
                m62086H();
                break;
            case 103:
                break;
            default:
                m62087I();
                break;
        }
        InterfaceC11204b interfaceC11204b = this.f40148H0;
        if (interfaceC11204b != null) {
            interfaceC11204b.mo62114a(this.f40165W);
        }
    }

    /* JADX INFO: renamed from: B */
    public long m62080B() {
        return this.f40145G;
    }

    /* JADX INFO: renamed from: C */
    public final void m62081C(Canvas canvas) {
        Paint paintM62082D = m62082D();
        Iterator<Float> it = this.f40156N.iterator();
        while (it.hasNext()) {
            canvas.drawArc(this.f40138B, it.next().floatValue() - 92.0f, 4.0f, false, paintM62082D);
        }
    }

    /* JADX INFO: renamed from: D */
    public final Paint m62082D() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(this.f40161S.getDefaultColor());
        paint.setStrokeWidth(this.f40192y);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    /* JADX INFO: renamed from: E */
    public final void m62083E(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9c0.f132746o);
        this.f40168c = typedArrayObtainStyledAttributes.getDimensionPixelSize(m9c0.f132754s, this.f40168c);
        this.f40161S = typedArrayObtainStyledAttributes.getColorStateList(m9c0.f132752r);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(m9c0.f132756t, this.f40170e);
        this.f40170e = dimensionPixelSize;
        this.f40169d = this.f40168c - dimensionPixelSize;
        this.f40162T = typedArrayObtainStyledAttributes.getColorStateList(m9c0.f132758u);
        this.f40163U = typedArrayObtainStyledAttributes.getColorStateList(m9c0.f132750q);
        this.f40164V = typedArrayObtainStyledAttributes.getColorStateList(m9c0.f132748p);
        if (this.f40162T == null) {
            this.f40162T = ColorStateList.valueOf(Color.parseColor("#FE7E1D"));
        }
        if (this.f40163U == null) {
            this.f40163U = ColorStateList.valueOf(Color.parseColor("#FE7E1D"));
        }
        if (this.f40164V == null) {
            this.f40164V = ColorStateList.valueOf(Color.parseColor("#33FFFFFF"));
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m62084F() {
        Paint paint = new Paint();
        this.f40166a = paint;
        paint.setAntiAlias(true);
        this.f40166a.setColor(this.f40161S.getDefaultColor());
        Paint paint2 = this.f40166a;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f40167b = paint3;
        paint3.setAntiAlias(true);
        this.f40167b.setColor(this.f40161S.getDefaultColor());
        Paint paint4 = this.f40167b;
        Paint.Style style2 = Paint.Style.FILL;
        paint4.setStyle(style2);
        Paint paint5 = new Paint();
        this.f40171f = paint5;
        paint5.setAntiAlias(true);
        this.f40171f.setColor(this.f40163U.getDefaultColor());
        this.f40171f.setStyle(style2);
        Paint paint6 = new Paint();
        this.f40191x = paint6;
        paint6.setAntiAlias(true);
        this.f40191x.setColor(this.f40162T.getDefaultColor());
        this.f40191x.setStyle(style);
        Paint paint7 = new Paint();
        this.f40147H = paint7;
        paint7.setAntiAlias(true);
        this.f40147H.setColor(this.f40164V.getDefaultColor());
        this.f40147H.setStyle(style2);
        this.f40155M = new ArrayList();
        this.f40156N = new ArrayList();
    }

    /* JADX INFO: renamed from: G */
    public final void m62085G() {
        this.f40152J0.sendEmptyMessageDelayed(1002, 16L);
    }

    /* JADX INFO: renamed from: H */
    public void m62086H() {
        this.f40152J0.removeMessages(RoomDatabase.MAX_BIND_PARAMETER_CNT);
        this.f40152J0.removeMessages(1000);
        this.f40144F0 = true;
        Long l2 = new Long(this.f40145G);
        if (l2.longValue() > 0) {
            this.f40155M.add(l2);
        }
        this.f40145G = 0L;
        this.f40152J0.sendEmptyMessageDelayed(1001, 16L);
    }

    /* JADX INFO: renamed from: I */
    public void m62087I() {
        this.f40159Q = this.f40157O / 2;
        this.f40160R = this.f40158P / 2;
        invalidate();
    }

    /* JADX INFO: renamed from: J */
    public void m62088J() {
        this.f40183p0 = System.currentTimeMillis();
        if (!this.f40142E0) {
            this.f40142E0 = true;
            this.f40152J0.sendEmptyMessageDelayed(RoomDatabase.MAX_BIND_PARAMETER_CNT, 16L);
            return;
        }
        this.f40144F0 = false;
        this.f40146G0 = false;
        this.f40156N.add(new Float(this.f40141E));
        this.f40152J0.sendEmptyMessageDelayed(1000, 16L);
    }

    /* JADX INFO: renamed from: K */
    public void m62089K() {
        if (this.f40155M.size() > 0) {
            List<Long> list = this.f40155M;
            list.remove(list.size() - 1);
            if (this.f40156N.size() > 0) {
                List<Float> list2 = this.f40156N;
                list2.remove(list2.size() - 1);
            }
            m62095Q();
            if (this.f40155M.size() == 0) {
                m62090L();
            } else {
                float fM62092N = (this.f40145G + m62092N()) / this.f40177k0;
                this.f40140D = fM62092N;
                this.f40141E = fM62092N * 360.0f;
                int iM62092N = (int) ((this.f40145G + m62092N()) / 1000.0f);
                this.f40150I0 = iM62092N;
                m62099U(iM62092N);
            }
            invalidate();
        }
    }

    /* JADX INFO: renamed from: L */
    public void m62090L() {
        this.f40165W = 100;
        this.f40142E0 = false;
        this.f40144F0 = false;
        this.f40146G0 = false;
        this.f40150I0 = 0;
        this.f40145G = 0L;
        this.f40140D = 0.0f;
        this.f40141E = 0.0f;
        this.f40154L = this.f40151J;
        this.f40184q = this.f40172g;
        this.f40185r = this.f40173h;
        this.f40186s = this.f40174i;
        this.f40187t = this.f40175j;
        this.f40188u = this.f40176k;
        RectF rectF = this.f40138B;
        RectF rectF2 = this.f40193z;
        rectF.left = rectF2.left;
        rectF.top = rectF2.top;
        rectF.right = rectF2.right;
        rectF.bottom = rectF2.bottom;
        this.f40156N.clear();
        this.f40155M.clear();
        invalidate();
        m62096R();
    }

    /* JADX INFO: renamed from: M */
    public int m62091M() {
        return this.f40165W;
    }

    /* JADX INFO: renamed from: N */
    public long m62092N() {
        Iterator<Long> it = this.f40155M.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += it.next().longValue();
        }
        return jLongValue;
    }

    /* JADX INFO: renamed from: O */
    public final void m62093O() {
        if (!this.f40146G0) {
            this.f40152J0.sendEmptyMessageDelayed(1002, 16L);
            return;
        }
        InterfaceC11204b interfaceC11204b = this.f40148H0;
        if (interfaceC11204b != null) {
            interfaceC11204b.onEvent(107, 0);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m62094P(boolean z) {
        if (z) {
            long j = this.f40145G;
            if (j > 0) {
                this.f40155M.add(new Long(j));
                this.f40145G = 0L;
            }
            this.f40165W = 102;
            m62085G();
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m62095Q() {
        InterfaceC11204b interfaceC11204b = this.f40148H0;
        if (interfaceC11204b != null) {
            interfaceC11204b.onEvent(104, 0);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m62096R() {
        InterfaceC11204b interfaceC11204b = this.f40148H0;
        if (interfaceC11204b != null) {
            interfaceC11204b.onEvent(106, 0);
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m62097S() {
        if (this.f40146G0) {
            return;
        }
        this.f40152J0.sendEmptyMessageDelayed(1001, 16L);
    }

    /* JADX INFO: renamed from: T */
    public final void m62098T() {
        if (m62092N() + this.f40145G < this.f40177k0 && this.f40165W == 101) {
            this.f40152J0.sendEmptyMessageDelayed(RoomDatabase.MAX_BIND_PARAMETER_CNT, 16L);
        } else {
            m62094P(m62092N() + this.f40145G >= ((long) this.f40177k0));
            m62079A();
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m62099U(int i) {
        InterfaceC11204b interfaceC11204b = this.f40148H0;
        if (interfaceC11204b != null) {
            interfaceC11204b.onEvent(105, i);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m62100V() {
        if (m62092N() + this.f40145G < this.f40177k0 && this.f40165W == 101) {
            this.f40152J0.sendEmptyMessageDelayed(1000, 16L);
        } else {
            m62094P(m62092N() + this.f40145G >= ((long) this.f40177k0));
            m62079A();
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m62101W() {
        int i = this.f40165W;
        if (i == 100 || i == 102) {
            this.f40165W = 101;
        } else if (i == 101) {
            this.f40165W = 102;
        }
    }

    public int getCount() {
        return this.f40155M.size();
    }

    public long getLastDuration() {
        if (this.f40155M.size() <= 0) {
            return 0L;
        }
        List<Long> list = this.f40155M;
        return list.get(list.size() - 1).longValue();
    }

    /* JADX INFO: renamed from: o */
    public void m62102o() {
        m62101W();
        m62079A();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f40165W;
        int i2 = this.f40159Q;
        switch (i) {
            case 101:
            case 102:
            case 103:
                canvas.drawCircle(i2, this.f40160R, this.f40154L, this.f40147H);
                canvas.drawArc(this.f40138B, -90.0f, this.f40141E, false, this.f40191x);
                float f = this.f40184q;
                float f2 = this.f40185r;
                float f3 = this.f40186s;
                float f4 = this.f40187t;
                float f5 = this.f40188u;
                canvas.drawRoundRect(f, f2, f3, f4, f5, f5, this.f40171f);
                m62081C(canvas);
                break;
            default:
                canvas.drawCircle(i2, this.f40160R, this.f40168c, this.f40166a);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f40157O = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f40158P = measuredHeight;
        this.f40159Q = this.f40157O / 2;
        this.f40160R = measuredHeight / 2;
        this.f40166a.setStrokeWidth(this.f40170e);
        this.f40151J = this.f40157O / 2;
        float fM208407w = xdl0.m208407w(46.0f);
        this.f40149I = fM208407w;
        this.f40153K = Math.abs(this.f40151J - fM208407w) / 6.0f;
        this.f40154L = this.f40151J;
        float fM208407w2 = xdl0.m208407w(6.0f);
        this.f40192y = fM208407w2;
        float f = fM208407w2 / 2.0f;
        float f2 = this.f40149I - f;
        float f3 = this.f40151J - f;
        this.f40191x.setStrokeWidth(fM208407w2);
        RectF rectF = this.f40193z;
        rectF.left = f;
        rectF.top = f;
        int i3 = this.f40157O;
        rectF.right = i3 - f;
        rectF.bottom = i3 - f;
        RectF rectF2 = this.f40137A;
        float f4 = (f3 - f2) + f;
        rectF2.left = f4;
        rectF2.top = f4;
        float f5 = f2 * 2.0f;
        rectF2.right = f4 + f5;
        rectF2.bottom = f5 + f4;
        this.f40139C = Math.abs(f4 - rectF.left) / 6.0f;
        RectF rectF3 = this.f40138B;
        RectF rectF4 = this.f40193z;
        rectF3.left = rectF4.left;
        rectF3.top = rectF4.top;
        rectF3.right = rectF4.right;
        rectF3.bottom = rectF4.bottom;
        float fM208407w3 = xdl0.m208407w(24.0f);
        float f6 = (this.f40157O / 2) - (fM208407w3 / 2.0f);
        this.f40172g = f6;
        this.f40173h = f6;
        this.f40174i = f6 + fM208407w3;
        this.f40175j = f6 + fM208407w3;
        this.f40176k = xdl0.m208407w(7.0f);
        float fM208407w4 = xdl0.m208407w(44.0f);
        float f7 = fM208407w4 / 2.0f;
        float f8 = (this.f40157O / 2) - f7;
        this.f40178l = f8;
        this.f40179m = f8;
        this.f40180n = f8 + fM208407w4;
        this.f40181o = fM208407w4 + f8;
        this.f40182p = f7;
        this.f40189v = Math.abs(f8 - this.f40172g) / 6.0f;
        this.f40190w = Math.abs(this.f40182p - this.f40176k) / 6.0f;
        this.f40184q = this.f40172g;
        this.f40185r = this.f40173h;
        this.f40186s = this.f40174i;
        this.f40187t = this.f40175j;
        this.f40188u = this.f40176k;
        this.f40177k0 = NetWorkParam.DEFAULT_CONNECT_TIME_OUT;
    }

    /* JADX INFO: renamed from: p */
    public void m62103p(int i) {
        this.f40165W = i;
        m62079A();
    }

    /* JADX INFO: renamed from: q */
    public final void m62104q() {
        float f = this.f40154L;
        float f2 = this.f40149I;
        if (f <= f2) {
            this.f40154L = f2;
            invalidate();
        } else {
            this.f40154L = f - this.f40153K;
            invalidate();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m62105r() {
        float f = this.f40154L;
        float f2 = this.f40151J;
        if (f >= f2) {
            this.f40154L = f2;
            invalidate();
        } else {
            this.f40154L = f + this.f40153K;
            invalidate();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m62106s() {
        float f = this.f40184q;
        float f2 = this.f40178l;
        if (f >= f2) {
            float f3 = this.f40188u;
            float f4 = this.f40182p;
            if (f3 >= f4) {
                this.f40184q = f2;
                this.f40185r = this.f40179m;
                this.f40186s = this.f40180n;
                this.f40187t = this.f40181o;
                this.f40188u = f4;
                invalidate();
                return;
            }
        }
        float f5 = this.f40189v;
        this.f40184q = f - f5;
        this.f40185r -= f5;
        this.f40186s += f5;
        this.f40187t += f5;
        this.f40188u += this.f40190w;
        invalidate();
    }

    public void setStateListener(InterfaceC11204b interfaceC11204b) {
        this.f40148H0 = interfaceC11204b;
    }

    /* JADX INFO: renamed from: t */
    public final void m62107t() {
        float f = this.f40184q;
        float f2 = this.f40172g;
        if (f >= f2) {
            float f3 = this.f40188u;
            float f4 = this.f40176k;
            if (f3 <= f4) {
                this.f40184q = f2;
                this.f40185r = this.f40173h;
                this.f40186s = this.f40174i;
                this.f40187t = this.f40175j;
                this.f40188u = f4;
                invalidate();
                return;
            }
        }
        float f5 = this.f40189v;
        this.f40184q = f + f5;
        this.f40185r += f5;
        this.f40186s -= f5;
        this.f40187t -= f5;
        this.f40188u -= this.f40190w;
        invalidate();
    }

    /* JADX INFO: renamed from: u */
    public final void m62108u() {
        RectF rectF = this.f40138B;
        float f = rectF.left;
        RectF rectF2 = this.f40137A;
        float f2 = rectF2.left;
        if (f >= f2) {
            rectF.left = f2;
            rectF.top = rectF2.top;
            rectF.right = rectF2.right;
            rectF.bottom = rectF2.bottom;
            this.f40146G0 = true;
            invalidate();
            return;
        }
        float f3 = this.f40139C;
        rectF.left = f + f3;
        rectF.top += f3;
        rectF.right -= f3;
        rectF.bottom -= f3;
        invalidate();
    }

    /* JADX INFO: renamed from: v */
    public final void m62109v() {
        RectF rectF = this.f40138B;
        float f = rectF.left;
        RectF rectF2 = this.f40193z;
        float f2 = rectF2.left;
        if (f <= f2) {
            rectF.left = f2;
            rectF.top = rectF2.top;
            rectF.right = rectF2.right;
            rectF.bottom = rectF2.bottom;
            invalidate();
            return;
        }
        float f3 = this.f40139C;
        rectF.left = f - f3;
        rectF.top -= f3;
        rectF.right += f3;
        rectF.bottom += f3;
        invalidate();
    }

    /* JADX INFO: renamed from: w */
    public final void m62110w() {
        this.f40154L = this.f40151J;
        invalidate();
    }

    /* JADX INFO: renamed from: x */
    public final void m62111x() {
        this.f40184q = this.f40172g;
        this.f40185r = this.f40173h;
        this.f40186s = this.f40174i;
        this.f40187t = this.f40175j;
        this.f40188u = this.f40176k;
        invalidate();
    }

    /* JADX INFO: renamed from: y */
    public final void m62112y() {
        RectF rectF = this.f40138B;
        RectF rectF2 = this.f40193z;
        rectF.left = rectF2.left;
        rectF.top = rectF2.top;
        rectF.right = rectF2.right;
        rectF.bottom = rectF2.bottom;
        invalidate();
    }

    /* JADX INFO: renamed from: z */
    public final void m62113z() {
        if (this.f40144F0 || m62092N() + this.f40145G > this.f40177k0) {
            Long l2 = new Long(this.f40145G);
            if (l2.longValue() > 0) {
                this.f40155M.add(l2);
            }
            this.f40145G = 0L;
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f40143F = jCurrentTimeMillis;
        long j = jCurrentTimeMillis - this.f40183p0;
        this.f40145G = j;
        int iM62092N = (int) ((j + m62092N()) / 1000.0f);
        int i = this.f40150I0;
        if (iM62092N < i) {
            iM62092N = i;
        }
        this.f40150I0 = iM62092N;
        m62099U(iM62092N);
        float fM62092N = (this.f40145G + m62092N()) / this.f40177k0;
        this.f40140D = fM62092N;
        this.f40141E = fM62092N * 360.0f;
        invalidate();
    }

    public FeedCircleProgressBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedCircleProgressBar(Context context) {
        this(context, null);
    }
}
