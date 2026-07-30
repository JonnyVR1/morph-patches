package com.p051p1.mobile.putong.core.newui.home;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.p051p1.mobile.putong.core.p058ui.GradientBgButton;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;
import p153l.bnl0;
import p153l.l51;
import p153l.qa00;
import p153l.vxd0;
import p153l.x20;

/* JADX INFO: loaded from: classes11.dex */
public class CardMoveLikeRootLayout extends VFrame {

    /* JADX INFO: renamed from: a */
    public GradientBgButton f22349a;

    /* JADX INFO: renamed from: b */
    public View f22350b;

    /* JADX INFO: renamed from: c */
    public RightTipsView f22351c;

    /* JADX INFO: renamed from: d */
    public boolean f22352d;

    /* JADX INFO: renamed from: e */
    public boolean f22353e;

    /* JADX INFO: renamed from: f */
    public int f22354f;

    /* JADX INFO: renamed from: g */
    public int f22355g;

    /* JADX INFO: renamed from: h */
    public int f22356h;

    /* JADX INFO: renamed from: i */
    public int f22357i;

    /* JADX INFO: renamed from: j */
    public int f22358j;

    /* JADX INFO: renamed from: k */
    public int f22359k;

    /* JADX INFO: renamed from: l */
    public int f22360l;

    /* JADX INFO: renamed from: m */
    public int f22361m;

    /* JADX INFO: renamed from: n */
    public x20 f22362n;

    /* JADX INFO: renamed from: o */
    public vxd0 f22363o;

    /* JADX INFO: renamed from: p */
    public vxd0 f22364p;

    /* JADX INFO: renamed from: q */
    public vxd0 f22365q;

    /* JADX INFO: renamed from: r */
    public boolean f22366r;

    /* JADX INFO: renamed from: s */
    public ObjectAnimator f22367s;

    /* JADX INFO: renamed from: t */
    public boolean f22368t;

    /* JADX INFO: renamed from: u */
    public boolean f22369u;

    /* JADX INFO: renamed from: v */
    public Runnable f22370v;

    /* JADX INFO: renamed from: w */
    public int f22371w;

    public CardMoveLikeRootLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22352d = false;
        this.f22353e = false;
        this.f22354f = qa00.m175859d(10.0f);
        this.f22355g = qa00.m175859d(76.0f);
        this.f22363o = new vxd0("full_card_5_btn_tran_x", -500);
        this.f22364p = new vxd0("full_card_5_btn_tran_y", 0);
        this.f22365q = new vxd0("full_card_btn_5_tran_count", 0);
        this.f22366r = false;
        this.f22368t = false;
        this.f22369u = false;
        this.f22371w = 0;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m37638B(int i, int i2) {
        int x = (int) this.f22349a.getX();
        int y = (int) this.f22349a.getY();
        return i >= x && i <= x + this.f22349a.getWidth() && i2 >= y && i2 <= y + this.f22349a.getHeight();
    }

    /* JADX INFO: renamed from: C */
    public final void m37639C() {
        if (this.f22362n != null) {
            this.f22349a.m45246a();
            this.f22362n.call();
        }
    }

    /* JADX INFO: renamed from: E */
    public final boolean m37640E(int i) {
        int width = getWidth();
        int i2 = this.f22355g;
        if (i < (width - i2) + (i2 / 5)) {
            return false;
        }
        m37642s();
        return true;
    }

    @Override // p151v.VFrame, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f22368t || this.f22349a == null) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            this.f22352d = false;
            this.f22353e = false;
            m37646z();
            if (m37638B(x, y)) {
                this.f22353e = true;
                m37641p();
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
        int iM37644v;
        int iM37645w;
        if (!this.f22368t || this.f22349a == null) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f22356h = x;
            this.f22357i = y;
            return this.f22353e;
        }
        if (action == 1) {
            if (this.f22353e) {
                if (this.f22352d) {
                    iM37644v = m37644v(x);
                    iM37645w = m37645w(y);
                    if (!m37640E(iM37644v)) {
                        this.f22349a.setTranslationX(iM37644v);
                        this.f22349a.setTranslationY(iM37645w);
                        this.f22363o.put(Integer.valueOf(iM37644v));
                        this.f22364p.put(Integer.valueOf(iM37645w));
                    }
                    this.f22365q.put(3);
                } else if (motionEvent.getAction() == 1) {
                    m37639C();
                }
                view = this.f22350b;
                if (view != null) {
                    view.animate().alpha(0.0f).setDuration(100L).start();
                }
            }
            this.f22352d = false;
            this.f22353e = false;
        } else if (action != 2) {
            if (action == 3) {
                if (this.f22353e) {
                    if (this.f22352d) {
                        iM37644v = m37644v(x);
                        iM37645w = m37645w(y);
                        if (!m37640E(iM37644v)) {
                            this.f22349a.setTranslationX(iM37644v);
                            this.f22349a.setTranslationY(iM37645w);
                            this.f22363o.put(Integer.valueOf(iM37644v));
                            this.f22364p.put(Integer.valueOf(iM37645w));
                        }
                        this.f22365q.put(3);
                    } else if (motionEvent.getAction() == 1) {
                        m37639C();
                    }
                    view = this.f22350b;
                    if (view != null) {
                        view.animate().alpha(0.0f).setDuration(100L).start();
                    }
                }
                this.f22352d = false;
                this.f22353e = false;
            }
        } else if (this.f22353e) {
            if (!this.f22352d && m37643u(x, y)) {
                this.f22352d = true;
                this.f22358j = x;
                this.f22359k = y;
                this.f22360l = (int) this.f22349a.getTranslationX();
                this.f22361m = (int) this.f22349a.getTranslationY();
            }
            if (this.f22352d) {
                int iM37644v2 = m37644v(x);
                int iM37645w2 = m37645w(y);
                this.f22349a.setTranslationX(iM37644v2);
                this.f22349a.setTranslationY(iM37645w2);
                View view2 = this.f22350b;
                if (view2 != null && view2.getAlpha() <= 0.0f) {
                    this.f22350b.setAlpha(0.01f);
                    this.f22350b.animate().alpha(1.0f).setDuration(100L).start();
                }
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: p */
    public final void m37641p() {
        ObjectAnimator objectAnimator = this.f22367s;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.f22367s.cancel();
            this.f22367s = null;
        }
        l51.m152890J(this.f22370v);
    }

    /* JADX INFO: renamed from: s */
    public final void m37642s() {
        this.f22363o.put(-500);
        this.f22349a.animate().translationX(getWidth() - qa00.m175859d(38.0f)).setDuration(200L).start();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m37643u(int i, int i2) {
        int i3 = this.f22356h;
        int i4 = (i - i3) * (i - i3);
        int i5 = this.f22357i;
        int i6 = i4 + ((i2 - i5) * (i2 - i5));
        int i7 = this.f22354f;
        return i6 >= i7 * i7;
    }

    /* JADX INFO: renamed from: v */
    public final int m37644v(int i) {
        int i2 = this.f22360l + (i - this.f22358j);
        int i3 = this.f22355g;
        if (i2 < (-i3) / 2) {
            return (-i3) / 2;
        }
        return i3 + i2 > getWidth() + (this.f22355g / 2) ? getWidth() - (this.f22355g / 2) : i2;
    }

    /* JADX INFO: renamed from: w */
    public final int m37645w(int i) {
        int i2 = this.f22361m + (i - this.f22359k);
        if (i2 > getHeight() / 2) {
            return getHeight() / 2;
        }
        return i2 < (this.f22355g / 2) - (getHeight() / 2) ? (this.f22355g / 2) - (getHeight() / 2) : i2;
    }

    /* JADX INFO: renamed from: z */
    public final void m37646z() {
        if (NullChecker.m82486a(this.f22351c)) {
            bnl0.m105524M(this.f22351c, false);
        }
    }

    public CardMoveLikeRootLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardMoveLikeRootLayout(Context context) {
        this(context, null);
    }
}
