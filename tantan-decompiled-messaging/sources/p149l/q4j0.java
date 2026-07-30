package p149l;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p046p1.mobile.putong.core.newui.home.opt.SwipeState;

/* JADX INFO: loaded from: classes11.dex */
public class q4j0<C> {

    /* JADX INFO: renamed from: a */
    public zw2 f152633a;

    /* JADX INFO: renamed from: b */
    public float f152634b;

    /* JADX INFO: renamed from: c */
    public float f152635c;

    /* JADX INFO: renamed from: d */
    public float f152636d;

    /* JADX INFO: renamed from: f */
    public VelocityTracker f152638f;

    /* JADX INFO: renamed from: e */
    public int f152637e = 0;

    /* JADX INFO: renamed from: g */
    public int f152639g = 0;

    /* JADX INFO: renamed from: h */
    public boolean f152640h = true;

    public q4j0(zw2 zw2Var) {
        this.f152636d = 20.0f;
        this.f152633a = zw2Var;
        this.f152636d = ViewConfiguration.get(zw2Var.m220553r()).getScaledTouchSlop();
        m172939d();
    }

    /* JADX INFO: renamed from: a */
    public float m172936a() {
        return this.f152636d;
    }

    /* JADX INFO: renamed from: b */
    public rm4 m172937b() {
        KeyEvent.Callback callback;
        pol0 pol0VarM220509G = this.f152633a.m220509G();
        if (pol0VarM220509G == null || (callback = pol0VarM220509G.f150530a) == null) {
            return null;
        }
        if (callback instanceof rm4) {
            return (rm4) callback;
        }
        if (callback instanceof ViewGroup) {
            return m172938c((ViewGroup) callback);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public rm4 m172938c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        if (childCount <= 0) {
            return null;
        }
        for (int i = 0; i < childCount; i++) {
            if (viewGroup.getChildAt(i) instanceof rm4) {
                return (rm4) viewGroup.getChildAt(i);
            }
            if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                return m172938c((ViewGroup) viewGroup.getChildAt(i));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m172939d() {
        if (this.f152638f == null) {
            this.f152638f = VelocityTracker.obtain();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m172940e() {
        this.f152640h = false;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc  */
    /* JADX INFO: renamed from: g */
    public boolean mo126184g(ViewGroup viewGroup, MotionEvent motionEvent) {
        if (!this.f152633a.m220521V()) {
            return false;
        }
        rm4 rm4VarM172937b = m172937b();
        if (rm4VarM172937b != null && rm4VarM172937b.mo29969b()) {
            mo126185h(motionEvent);
            return false;
        }
        m172939d();
        this.f152638f.addMovement(motionEvent);
        float x = (int) (motionEvent.getX() + 0.5f);
        float y = (int) (motionEvent.getY() + 0.5f);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f152640h = true;
            this.f152637e = 0;
            this.f152634b = (int) (motionEvent.getX() + 0.5f);
            this.f152635c = (int) (motionEvent.getY() + 0.5f);
            this.f152639g = 1;
            this.f152633a.m220548o0(SwipeState.START_TOUCH, false);
            return false;
        }
        if (actionMasked == 1) {
            if (!this.f152640h) {
                return false;
            }
            this.f152634b = -1.0f;
            this.f152637e = 0;
            this.f152640h = false;
        } else {
            if (actionMasked == 2) {
                if (!this.f152640h) {
                    return false;
                }
                this.f152639g++;
                int i = this.f152637e;
                if (i >= 1) {
                    if (i == 1) {
                        this.f152633a.m220548o0(SwipeState.START_MOVING, false);
                    }
                    this.f152637e = 2;
                    this.f152633a.m220515P(x, y, this.f152634b, this.f152635c);
                    return true;
                }
                if (rm4VarM172937b != null && rm4VarM172937b.mo29968a(this.f152634b, this.f152635c, motionEvent.getX(), motionEvent.getY())) {
                    return false;
                }
                String str = BifrostLayout.f23320c;
                if (Math.abs(this.f152634b - x) >= this.f152636d || Math.abs(this.f152635c - y) >= this.f152636d) {
                    if (BifrostLayout.f23321d) {
                        Math.abs(this.f152634b - x);
                        Math.abs(this.f152635c - y);
                    }
                    pol0 pol0VarM220509G = this.f152633a.m220509G();
                    this.f152634b = x;
                    this.f152635c = y;
                    this.f152637e = 1;
                    if (pol0VarM220509G != null) {
                        pol0VarM220509G.m170600a();
                        this.f152634b -= pol0VarM220509G.f150541l;
                        this.f152635c -= pol0VarM220509G.f150542m;
                    }
                }
                return false;
            }
            if (actionMasked == 3) {
                if (!this.f152640h) {
                    return false;
                }
                this.f152634b = -1.0f;
                this.f152637e = 0;
                this.f152640h = false;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX INFO: renamed from: h */
    public boolean mo126185h(MotionEvent motionEvent) {
        if (!this.f152633a.m220521V()) {
            return false;
        }
        m172939d();
        this.f152638f.addMovement(motionEvent);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f152634b = motionEvent.getX();
            this.f152635c = motionEvent.getY();
            this.f152637e = 0;
            this.f152640h = true;
        } else if (actionMasked == 1) {
            if (!this.f152640h) {
                return false;
            }
            if (this.f152637e == 2) {
                this.f152633a.m220515P(x, y, this.f152634b, this.f152635c);
                VelocityTracker velocityTracker = this.f152638f;
                velocityTracker.computeCurrentVelocity(1000, zo0.f204070w);
                this.f152633a.m220516Q(x, y, this.f152634b, this.f152635c, velocityTracker.getXVelocity(), velocityTracker.getYVelocity());
            }
            this.f152638f.recycle();
            this.f152638f = null;
            this.f152634b = -1.0f;
            this.f152637e = 0;
            this.f152640h = false;
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (!this.f152640h) {
                    return false;
                }
                if (this.f152637e == 2) {
                    this.f152633a.m220515P(x, y, this.f152634b, this.f152635c);
                    VelocityTracker velocityTracker2 = this.f152638f;
                    velocityTracker2.computeCurrentVelocity(1000, zo0.f204070w);
                    this.f152633a.m220516Q(x, y, this.f152634b, this.f152635c, velocityTracker2.getXVelocity(), velocityTracker2.getYVelocity());
                }
                this.f152638f.recycle();
                this.f152638f = null;
                this.f152634b = -1.0f;
                this.f152637e = 0;
                this.f152640h = false;
            }
        } else {
            if (!this.f152640h) {
                return false;
            }
            int i = this.f152637e;
            if (i >= 1) {
                if (i == 1) {
                    this.f152633a.m220548o0(SwipeState.START_MOVING, false);
                }
                this.f152637e = 2;
                this.f152633a.m220515P(x, y, this.f152634b, this.f152635c);
            } else if (Math.abs(this.f152634b - x) >= this.f152636d || Math.abs(this.f152635c - y) >= this.f152636d) {
                this.f152634b = x;
                this.f152635c = y;
                this.f152637e = 1;
                pol0 pol0VarM220509G = this.f152633a.m220509G();
                if (pol0VarM220509G != null) {
                    pol0VarM220509G.m170600a();
                    this.f152634b -= pol0VarM220509G.f150541l;
                    this.f152635c -= pol0VarM220509G.f150542m;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void m172941f(ViewGroup viewGroup, MotionEvent motionEvent) {
    }
}
