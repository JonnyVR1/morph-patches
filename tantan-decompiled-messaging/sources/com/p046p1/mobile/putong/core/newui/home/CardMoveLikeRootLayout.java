package com.p046p1.mobile.putong.core.newui.home;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.p046p1.mobile.putong.core.p053ui.GradientBgButton;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;
import p149l.d30;
import p149l.e51;
import p149l.t100;
import p149l.tpd0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class CardMoveLikeRootLayout extends VFrame {

    /* JADX INFO: renamed from: a */
    public GradientBgButton f21607a;

    /* JADX INFO: renamed from: b */
    public View f21608b;

    /* JADX INFO: renamed from: c */
    public RightTipsView f21609c;

    /* JADX INFO: renamed from: d */
    public boolean f21610d;

    /* JADX INFO: renamed from: e */
    public boolean f21611e;

    /* JADX INFO: renamed from: f */
    public int f21612f;

    /* JADX INFO: renamed from: g */
    public int f21613g;

    /* JADX INFO: renamed from: h */
    public int f21614h;

    /* JADX INFO: renamed from: i */
    public int f21615i;

    /* JADX INFO: renamed from: j */
    public int f21616j;

    /* JADX INFO: renamed from: k */
    public int f21617k;

    /* JADX INFO: renamed from: l */
    public int f21618l;

    /* JADX INFO: renamed from: m */
    public int f21619m;

    /* JADX INFO: renamed from: n */
    public d30 f21620n;

    /* JADX INFO: renamed from: o */
    public tpd0 f21621o;

    /* JADX INFO: renamed from: p */
    public tpd0 f21622p;

    /* JADX INFO: renamed from: q */
    public tpd0 f21623q;

    /* JADX INFO: renamed from: r */
    public boolean f21624r;

    /* JADX INFO: renamed from: s */
    public ObjectAnimator f21625s;

    /* JADX INFO: renamed from: t */
    public boolean f21626t;

    /* JADX INFO: renamed from: u */
    public boolean f21627u;

    /* JADX INFO: renamed from: v */
    public Runnable f21628v;

    /* JADX INFO: renamed from: w */
    public int f21629w;

    public CardMoveLikeRootLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21610d = false;
        this.f21611e = false;
        this.f21612f = t100.m186890d(10.0f);
        this.f21613g = t100.m186890d(76.0f);
        this.f21621o = new tpd0("full_card_5_btn_tran_x", -500);
        this.f21622p = new tpd0("full_card_5_btn_tran_y", 0);
        this.f21623q = new tpd0("full_card_btn_5_tran_count", 0);
        this.f21624r = false;
        this.f21626t = false;
        this.f21627u = false;
        this.f21629w = 0;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m36635B(int i, int i2) {
        int x = (int) this.f21607a.getX();
        int y = (int) this.f21607a.getY();
        return i >= x && i <= x + this.f21607a.getWidth() && i2 >= y && i2 <= y + this.f21607a.getHeight();
    }

    /* JADX INFO: renamed from: C */
    public final void m36636C() {
        if (this.f21620n != null) {
            this.f21607a.m44063a();
            this.f21620n.call();
        }
    }

    /* JADX INFO: renamed from: E */
    public final boolean m36637E(int i) {
        int width = getWidth();
        int i2 = this.f21613g;
        if (i < (width - i2) + (i2 / 5)) {
            return false;
        }
        m36639s();
        return true;
    }

    @Override // p147v.VFrame, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f21626t || this.f21607a == null) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            this.f21610d = false;
            this.f21611e = false;
            m36643z();
            if (m36635B(x, y)) {
                this.f21611e = true;
                m36638p();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00da  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        View view;
        int iM36641v;
        int iM36642w;
        if (!this.f21626t || this.f21607a == null) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f21614h = x;
            this.f21615i = y;
            return this.f21611e;
        }
        if (action == 1) {
            if (this.f21611e) {
                if (this.f21610d) {
                    iM36641v = m36641v(x);
                    iM36642w = m36642w(y);
                    if (!m36637E(iM36641v)) {
                        this.f21607a.setTranslationX(iM36641v);
                        this.f21607a.setTranslationY(iM36642w);
                        this.f21621o.put(Integer.valueOf(iM36641v));
                        this.f21622p.put(Integer.valueOf(iM36642w));
                    }
                    this.f21623q.put(3);
                } else if (motionEvent.getAction() == 1) {
                    m36636C();
                }
                view = this.f21608b;
                if (view != null) {
                    view.animate().alpha(0.0f).setDuration(100L).start();
                }
            }
            this.f21610d = false;
            this.f21611e = false;
        } else if (action != 2) {
            if (action == 3) {
                if (this.f21611e) {
                    if (this.f21610d) {
                        iM36641v = m36641v(x);
                        iM36642w = m36642w(y);
                        if (!m36637E(iM36641v)) {
                            this.f21607a.setTranslationX(iM36641v);
                            this.f21607a.setTranslationY(iM36642w);
                            this.f21621o.put(Integer.valueOf(iM36641v));
                            this.f21622p.put(Integer.valueOf(iM36642w));
                        }
                        this.f21623q.put(3);
                    } else if (motionEvent.getAction() == 1) {
                        m36636C();
                    }
                    view = this.f21608b;
                    if (view != null) {
                        view.animate().alpha(0.0f).setDuration(100L).start();
                    }
                }
                this.f21610d = false;
                this.f21611e = false;
            }
        } else if (this.f21611e) {
            if (!this.f21610d && m36640u(x, y)) {
                this.f21610d = true;
                this.f21616j = x;
                this.f21617k = y;
                this.f21618l = (int) this.f21607a.getTranslationX();
                this.f21619m = (int) this.f21607a.getTranslationY();
            }
            if (this.f21610d) {
                int iM36641v2 = m36641v(x);
                int iM36642w2 = m36642w(y);
                this.f21607a.setTranslationX(iM36641v2);
                this.f21607a.setTranslationY(iM36642w2);
                View view2 = this.f21608b;
                if (view2 != null && view2.getAlpha() <= 0.0f) {
                    this.f21608b.setAlpha(0.01f);
                    this.f21608b.animate().alpha(1.0f).setDuration(100L).start();
                }
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: p */
    public final void m36638p() {
        ObjectAnimator objectAnimator = this.f21625s;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.f21625s.cancel();
            this.f21625s = null;
        }
        e51.m114745J(this.f21628v);
    }

    /* JADX INFO: renamed from: s */
    public final void m36639s() {
        this.f21621o.put(-500);
        this.f21607a.animate().translationX(getWidth() - t100.m186890d(38.0f)).setDuration(200L).start();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m36640u(int i, int i2) {
        int i3 = this.f21614h;
        int i4 = (i - i3) * (i - i3);
        int i5 = this.f21615i;
        int i6 = i4 + ((i2 - i5) * (i2 - i5));
        int i7 = this.f21612f;
        return i6 >= i7 * i7;
    }

    /* JADX INFO: renamed from: v */
    public final int m36641v(int i) {
        int i2 = this.f21618l + (i - this.f21616j);
        int i3 = this.f21613g;
        if (i2 < (-i3) / 2) {
            return (-i3) / 2;
        }
        return i3 + i2 > getWidth() + (this.f21613g / 2) ? getWidth() - (this.f21613g / 2) : i2;
    }

    /* JADX INFO: renamed from: w */
    public final int m36642w(int i) {
        int i2 = this.f21619m + (i - this.f21617k);
        if (i2 > getHeight() / 2) {
            return getHeight() / 2;
        }
        return i2 < (this.f21613g / 2) - (getHeight() / 2) ? (this.f21613g / 2) - (getHeight() / 2) : i2;
    }

    /* JADX INFO: renamed from: z */
    public final void m36643z() {
        if (NullChecker.m81303a(this.f21609c)) {
            xdl0.m208344M(this.f21609c, false);
        }
    }

    public CardMoveLikeRootLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardMoveLikeRootLayout(Context context) {
        this(context, null);
    }
}
