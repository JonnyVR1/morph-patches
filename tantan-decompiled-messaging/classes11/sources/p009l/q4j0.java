package p009l;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p000p1.mobile.putong.core.newui.home.opt.SwipeState;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class q4j0<C> {

    /* JADX INFO: renamed from: a */
    public zw2 f19017a;

    /* JADX INFO: renamed from: b */
    public float f19018b;

    /* JADX INFO: renamed from: c */
    public float f19019c;

    /* JADX INFO: renamed from: d */
    public float f19020d;

    /* JADX INFO: renamed from: f */
    public VelocityTracker f19022f;

    /* JADX INFO: renamed from: e */
    public int f19021e = 0;

    /* JADX INFO: renamed from: g */
    public int f19023g = 0;

    /* JADX INFO: renamed from: h */
    public boolean f19024h = true;

    public q4j0(zw2 zw2Var) {
        this.f19020d = 20.0f;
        this.f19017a = zw2Var;
        this.f19020d = ViewConfiguration.get(zw2Var.m26035r()).getScaledTouchSlop();
        m20805d();
    }

    /* JADX INFO: renamed from: a */
    public float m20802a() {
        return this.f19020d;
    }

    /* JADX INFO: renamed from: b */
    public rm4 m20803b() {
        KeyEvent.Callback callback;
        pol0 pol0VarM25991G = this.f19017a.m25991G();
        if (pol0VarM25991G == null || (callback = pol0VarM25991G.f18800a) == null) {
            return null;
        }
        if (callback instanceof rm4) {
            return (rm4) callback;
        }
        if (callback instanceof ViewGroup) {
            return m20804c((ViewGroup) callback);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public rm4 m20804c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        if (childCount <= 0) {
            return null;
        }
        for (int i = 0; i < childCount; i++) {
            if (viewGroup.getChildAt(i) instanceof rm4) {
                return (rm4) viewGroup.getChildAt(i);
            }
            if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                return m20804c((ViewGroup) viewGroup.getChildAt(i));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m20805d() {
        if (this.f19022f == null) {
            this.f19022f = VelocityTracker.obtain();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m20806e() {
        this.f19024h = false;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc  */
    /* JADX INFO: renamed from: g */
    public boolean mo15047g(ViewGroup viewGroup, MotionEvent motionEvent) {
        if (!this.f19017a.m26003V()) {
            return false;
        }
        rm4 rm4VarM20803b = m20803b();
        if (rm4VarM20803b != null && rm4VarM20803b.m21699b()) {
            mo15048h(motionEvent);
            return false;
        }
        m20805d();
        this.f19022f.addMovement(motionEvent);
        float x = (int) (motionEvent.getX() + 0.5f);
        float y = (int) (motionEvent.getY() + 0.5f);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f19024h = true;
            this.f19021e = 0;
            this.f19018b = (int) (motionEvent.getX() + 0.5f);
            this.f19019c = (int) (motionEvent.getY() + 0.5f);
            this.f19023g = 1;
            this.f19017a.m26030o0(SwipeState.START_TOUCH, false);
            return false;
        }
        if (actionMasked == 1) {
            if (!this.f19024h) {
                return false;
            }
            this.f19018b = -1.0f;
            this.f19021e = 0;
            this.f19024h = false;
        } else {
            if (actionMasked == 2) {
                if (!this.f19024h) {
                    return false;
                }
                this.f19023g++;
                int i = this.f19021e;
                if (i >= 1) {
                    if (i == 1) {
                        this.f19017a.m26030o0(SwipeState.START_MOVING, false);
                    }
                    this.f19021e = 2;
                    this.f19017a.m25997P(x, y, this.f19018b, this.f19019c);
                    return true;
                }
                if (rm4VarM20803b != null && rm4VarM20803b.mo7403a(this.f19018b, this.f19019c, motionEvent.getX(), motionEvent.getY())) {
                    return false;
                }
                String str = BifrostLayout.f2098c;
                if (Math.abs(this.f19018b - x) >= this.f19020d || Math.abs(this.f19019c - y) >= this.f19020d) {
                    if (BifrostLayout.f2099d) {
                        Math.abs(this.f19018b - x);
                        Math.abs(this.f19019c - y);
                    }
                    pol0 pol0VarM25991G = this.f19017a.m25991G();
                    this.f19018b = x;
                    this.f19019c = y;
                    this.f19021e = 1;
                    if (pol0VarM25991G != null) {
                        pol0VarM25991G.m20519a();
                        this.f19018b -= pol0VarM25991G.f18811l;
                        this.f19019c -= pol0VarM25991G.f18812m;
                    }
                }
                return false;
            }
            if (actionMasked == 3) {
                if (!this.f19024h) {
                    return false;
                }
                this.f19018b = -1.0f;
                this.f19021e = 0;
                this.f19024h = false;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX INFO: renamed from: h */
    public boolean mo15048h(MotionEvent motionEvent) {
        if (!this.f19017a.m26003V()) {
            return false;
        }
        m20805d();
        this.f19022f.addMovement(motionEvent);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f19018b = motionEvent.getX();
            this.f19019c = motionEvent.getY();
            this.f19021e = 0;
            this.f19024h = true;
        } else if (actionMasked == 1) {
            if (!this.f19024h) {
                return false;
            }
            if (this.f19021e == 2) {
                this.f19017a.m25997P(x, y, this.f19018b, this.f19019c);
                VelocityTracker velocityTracker = this.f19022f;
                velocityTracker.computeCurrentVelocity(1000, zo0.f23794w);
                this.f19017a.m25998Q(x, y, this.f19018b, this.f19019c, velocityTracker.getXVelocity(), velocityTracker.getYVelocity());
            }
            this.f19022f.recycle();
            this.f19022f = null;
            this.f19018b = -1.0f;
            this.f19021e = 0;
            this.f19024h = false;
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (!this.f19024h) {
                    return false;
                }
                if (this.f19021e == 2) {
                    this.f19017a.m25997P(x, y, this.f19018b, this.f19019c);
                    VelocityTracker velocityTracker2 = this.f19022f;
                    velocityTracker2.computeCurrentVelocity(1000, zo0.f23794w);
                    this.f19017a.m25998Q(x, y, this.f19018b, this.f19019c, velocityTracker2.getXVelocity(), velocityTracker2.getYVelocity());
                }
                this.f19022f.recycle();
                this.f19022f = null;
                this.f19018b = -1.0f;
                this.f19021e = 0;
                this.f19024h = false;
            }
        } else {
            if (!this.f19024h) {
                return false;
            }
            int i = this.f19021e;
            if (i >= 1) {
                if (i == 1) {
                    this.f19017a.m26030o0(SwipeState.START_MOVING, false);
                }
                this.f19021e = 2;
                this.f19017a.m25997P(x, y, this.f19018b, this.f19019c);
            } else if (Math.abs(this.f19018b - x) >= this.f19020d || Math.abs(this.f19019c - y) >= this.f19020d) {
                this.f19018b = x;
                this.f19019c = y;
                this.f19021e = 1;
                pol0 pol0VarM25991G = this.f19017a.m25991G();
                if (pol0VarM25991G != null) {
                    pol0VarM25991G.m20519a();
                    this.f19018b -= pol0VarM25991G.f18811l;
                    this.f19019c -= pol0VarM25991G.f18812m;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void m20807f(ViewGroup viewGroup, MotionEvent motionEvent) {
    }
}
