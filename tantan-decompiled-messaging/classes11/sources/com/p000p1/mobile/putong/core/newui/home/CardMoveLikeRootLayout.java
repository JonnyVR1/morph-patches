package com.p000p1.mobile.putong.core.newui.home;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.p1.mobile.putong.core.ui.GradientBgButton;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e51;
import l.t100;
import l.tpd0;
import l.xdl0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardMoveLikeRootLayout extends VFrame {

    /* JADX INFO: renamed from: a */
    public GradientBgButton f385a;

    /* JADX INFO: renamed from: b */
    public View f386b;

    /* JADX INFO: renamed from: c */
    public RightTipsView f387c;

    /* JADX INFO: renamed from: d */
    public boolean f388d;

    /* JADX INFO: renamed from: e */
    public boolean f389e;

    /* JADX INFO: renamed from: f */
    public int f390f;

    /* JADX INFO: renamed from: g */
    public int f391g;

    /* JADX INFO: renamed from: h */
    public int f392h;

    /* JADX INFO: renamed from: i */
    public int f393i;

    /* JADX INFO: renamed from: j */
    public int f394j;

    /* JADX INFO: renamed from: k */
    public int f395k;

    /* JADX INFO: renamed from: l */
    public int f396l;

    /* JADX INFO: renamed from: m */
    public int f397m;

    /* JADX INFO: renamed from: n */
    public d30 f398n;

    /* JADX INFO: renamed from: o */
    public tpd0 f399o;

    /* JADX INFO: renamed from: p */
    public tpd0 f400p;

    /* JADX INFO: renamed from: q */
    public tpd0 f401q;

    /* JADX INFO: renamed from: r */
    public boolean f402r;

    /* JADX INFO: renamed from: s */
    public ObjectAnimator f403s;

    /* JADX INFO: renamed from: t */
    public boolean f404t;

    /* JADX INFO: renamed from: u */
    public boolean f405u;

    /* JADX INFO: renamed from: v */
    public Runnable f406v;

    /* JADX INFO: renamed from: w */
    public int f407w;

    public CardMoveLikeRootLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f388d = false;
        this.f389e = false;
        this.f390f = t100.d(10.0f);
        this.f391g = t100.d(76.0f);
        this.f399o = new tpd0("full_card_5_btn_tran_x", -500);
        this.f400p = new tpd0("full_card_5_btn_tran_y", 0);
        this.f401q = new tpd0("full_card_btn_5_tran_count", 0);
        this.f402r = false;
        this.f404t = false;
        this.f405u = false;
        this.f407w = 0;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m584B(int i, int i2) {
        int x = (int) this.f385a.getX();
        int y = (int) this.f385a.getY();
        return i >= x && i <= x + this.f385a.getWidth() && i2 >= y && i2 <= y + this.f385a.getHeight();
    }

    /* JADX INFO: renamed from: C */
    public final void m585C() {
        if (this.f398n != null) {
            this.f385a.a();
            this.f398n.call();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public final boolean m586E(int i) {
        int width = getWidth();
        int i2 = this.f391g;
        if (i < (width - i2) + (i2 / 5)) {
            return false;
        }
        m588s();
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f404t || this.f385a == null) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            this.f388d = false;
            this.f389e = false;
            m592z();
            if (m584B(x, y)) {
                this.f389e = true;
                m587p();
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
    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        View view;
        int iM590v;
        int iM591w;
        if (!this.f404t || this.f385a == null) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f392h = x;
            this.f393i = y;
            return this.f389e;
        }
        if (action == 1) {
            if (this.f389e) {
                if (this.f388d) {
                    iM590v = m590v(x);
                    iM591w = m591w(y);
                    if (!m586E(iM590v)) {
                        this.f385a.setTranslationX(iM590v);
                        this.f385a.setTranslationY(iM591w);
                        this.f399o.put(Integer.valueOf(iM590v));
                        this.f400p.put(Integer.valueOf(iM591w));
                    }
                    this.f401q.put(3);
                } else if (motionEvent.getAction() == 1) {
                    m585C();
                }
                view = this.f386b;
                if (view != null) {
                    view.animate().alpha(0.0f).setDuration(100L).start();
                }
            }
            this.f388d = false;
            this.f389e = false;
        } else if (action != 2) {
            if (action == 3) {
                if (this.f389e) {
                    if (this.f388d) {
                        iM590v = m590v(x);
                        iM591w = m591w(y);
                        if (!m586E(iM590v)) {
                            this.f385a.setTranslationX(iM590v);
                            this.f385a.setTranslationY(iM591w);
                            this.f399o.put(Integer.valueOf(iM590v));
                            this.f400p.put(Integer.valueOf(iM591w));
                        }
                        this.f401q.put(3);
                    } else if (motionEvent.getAction() == 1) {
                        m585C();
                    }
                    view = this.f386b;
                    if (view != null) {
                        view.animate().alpha(0.0f).setDuration(100L).start();
                    }
                }
                this.f388d = false;
                this.f389e = false;
            }
        } else if (this.f389e) {
            if (!this.f388d && m589u(x, y)) {
                this.f388d = true;
                this.f394j = x;
                this.f395k = y;
                this.f396l = (int) this.f385a.getTranslationX();
                this.f397m = (int) this.f385a.getTranslationY();
            }
            if (this.f388d) {
                int iM590v2 = m590v(x);
                int iM591w2 = m591w(y);
                this.f385a.setTranslationX(iM590v2);
                this.f385a.setTranslationY(iM591w2);
                View view2 = this.f386b;
                if (view2 != null && view2.getAlpha() <= 0.0f) {
                    this.f386b.setAlpha(0.01f);
                    this.f386b.animate().alpha(1.0f).setDuration(100L).start();
                }
            }
            return true;
        }
        return super/*android.view.View*/.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: p */
    public final void m587p() {
        ObjectAnimator objectAnimator = this.f403s;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.f403s.cancel();
            this.f403s = null;
        }
        e51.J(this.f406v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public final void m588s() {
        this.f399o.put(-500);
        this.f385a.animate().translationX(getWidth() - t100.d(38.0f)).setDuration(200L).start();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m589u(int i, int i2) {
        int i3 = this.f392h;
        int i4 = (i - i3) * (i - i3);
        int i5 = this.f393i;
        int i6 = i4 + ((i2 - i5) * (i2 - i5));
        int i7 = this.f390f;
        return i6 >= i7 * i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public final int m590v(int i) {
        int i2 = this.f396l + (i - this.f394j);
        int i3 = this.f391g;
        if (i2 < (-i3) / 2) {
            return (-i3) / 2;
        }
        return i3 + i2 > getWidth() + (this.f391g / 2) ? getWidth() - (this.f391g / 2) : i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public final int m591w(int i) {
        int i2 = this.f397m + (i - this.f395k);
        if (i2 > getHeight() / 2) {
            return getHeight() / 2;
        }
        return i2 < (this.f391g / 2) - (getHeight() / 2) ? (this.f391g / 2) - (getHeight() / 2) : i2;
    }

    /* JADX INFO: renamed from: z */
    public final void m592z() {
        if (NullChecker.a(this.f387c)) {
            xdl0.M(this.f387c, false);
        }
    }

    public CardMoveLikeRootLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardMoveLikeRootLayout(Context context) {
        this(context, null);
    }
}
