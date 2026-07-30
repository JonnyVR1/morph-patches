package p153l;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p051p1.mobile.putong.core.newui.home.opt.SwipeState;

/* JADX INFO: loaded from: classes11.dex */
public class udj0<C> {

    /* JADX INFO: renamed from: a */
    public ox2 f178541a;

    /* JADX INFO: renamed from: b */
    public float f178542b;

    /* JADX INFO: renamed from: c */
    public float f178543c;

    /* JADX INFO: renamed from: d */
    public float f178544d;

    /* JADX INFO: renamed from: f */
    public VelocityTracker f178546f;

    /* JADX INFO: renamed from: e */
    public int f178545e = 0;

    /* JADX INFO: renamed from: g */
    public int f178547g = 0;

    /* JADX INFO: renamed from: h */
    public boolean f178548h = true;

    public udj0(ox2 ox2Var) {
        this.f178544d = 20.0f;
        this.f178541a = ox2Var;
        this.f178544d = ViewConfiguration.get(ox2Var.m169667r()).getScaledTouchSlop();
        m195494d();
    }

    /* JADX INFO: renamed from: a */
    public float m195491a() {
        return this.f178544d;
    }

    /* JADX INFO: renamed from: b */
    public qn4 m195492b() {
        KeyEvent.Callback callback;
        txl0 txl0VarM169622G = this.f178541a.m169622G();
        if (txl0VarM169622G == null || (callback = txl0VarM169622G.f176568a) == null) {
            return null;
        }
        if (callback instanceof qn4) {
            return (qn4) callback;
        }
        if (callback instanceof ViewGroup) {
            return m195493c((ViewGroup) callback);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public qn4 m195493c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        if (childCount <= 0) {
            return null;
        }
        for (int i = 0; i < childCount; i++) {
            if (viewGroup.getChildAt(i) instanceof qn4) {
                return (qn4) viewGroup.getChildAt(i);
            }
            if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                return m195493c((ViewGroup) viewGroup.getChildAt(i));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m195494d() {
        if (this.f178546f == null) {
            this.f178546f = VelocityTracker.obtain();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m195495e() {
        this.f178548h = false;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc  */
    /* JADX INFO: renamed from: g */
    public boolean mo146591g(ViewGroup viewGroup, MotionEvent motionEvent) {
        if (!this.f178541a.m169634V()) {
            return false;
        }
        qn4 qn4VarM195492b = m195492b();
        if (qn4VarM195492b != null && qn4VarM195492b.mo30967b()) {
            mo146592h(motionEvent);
            return false;
        }
        m195494d();
        this.f178546f.addMovement(motionEvent);
        float x = (int) (motionEvent.getX() + 0.5f);
        float y = (int) (motionEvent.getY() + 0.5f);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f178548h = true;
            this.f178545e = 0;
            this.f178542b = (int) (motionEvent.getX() + 0.5f);
            this.f178543c = (int) (motionEvent.getY() + 0.5f);
            this.f178547g = 1;
            this.f178541a.m169662o0(SwipeState.START_TOUCH, false);
            return false;
        }
        if (actionMasked == 1) {
            if (!this.f178548h) {
                return false;
            }
            this.f178542b = -1.0f;
            this.f178545e = 0;
            this.f178548h = false;
        } else {
            if (actionMasked == 2) {
                if (!this.f178548h) {
                    return false;
                }
                this.f178547g++;
                int i = this.f178545e;
                if (i >= 1) {
                    if (i == 1) {
                        this.f178541a.m169662o0(SwipeState.START_MOVING, false);
                    }
                    this.f178545e = 2;
                    this.f178541a.m169628P(x, y, this.f178542b, this.f178543c);
                    return true;
                }
                if (qn4VarM195492b != null && qn4VarM195492b.mo30966a(this.f178542b, this.f178543c, motionEvent.getX(), motionEvent.getY())) {
                    return false;
                }
                String str = BifrostLayout.f24062c;
                if (Math.abs(this.f178542b - x) >= this.f178544d || Math.abs(this.f178543c - y) >= this.f178544d) {
                    if (BifrostLayout.f24063d) {
                        Math.abs(this.f178542b - x);
                        Math.abs(this.f178543c - y);
                    }
                    txl0 txl0VarM169622G = this.f178541a.m169622G();
                    this.f178542b = x;
                    this.f178543c = y;
                    this.f178545e = 1;
                    if (txl0VarM169622G != null) {
                        txl0VarM169622G.m193508a();
                        this.f178542b -= txl0VarM169622G.f176579l;
                        this.f178543c -= txl0VarM169622G.f176580m;
                    }
                }
                return false;
            }
            if (actionMasked == 3) {
                if (!this.f178548h) {
                    return false;
                }
                this.f178542b = -1.0f;
                this.f178545e = 0;
                this.f178548h = false;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX INFO: renamed from: h */
    public boolean mo146592h(MotionEvent motionEvent) {
        if (!this.f178541a.m169634V()) {
            return false;
        }
        m195494d();
        this.f178546f.addMovement(motionEvent);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f178542b = motionEvent.getX();
            this.f178543c = motionEvent.getY();
            this.f178545e = 0;
            this.f178548h = true;
        } else if (actionMasked == 1) {
            if (!this.f178548h) {
                return false;
            }
            if (this.f178545e == 2) {
                this.f178541a.m169628P(x, y, this.f178542b, this.f178543c);
                VelocityTracker velocityTracker = this.f178546f;
                velocityTracker.computeCurrentVelocity(1000, vo0.f184976w);
                this.f178541a.m169629Q(x, y, this.f178542b, this.f178543c, velocityTracker.getXVelocity(), velocityTracker.getYVelocity());
            }
            this.f178546f.recycle();
            this.f178546f = null;
            this.f178542b = -1.0f;
            this.f178545e = 0;
            this.f178548h = false;
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (!this.f178548h) {
                    return false;
                }
                if (this.f178545e == 2) {
                    this.f178541a.m169628P(x, y, this.f178542b, this.f178543c);
                    VelocityTracker velocityTracker2 = this.f178546f;
                    velocityTracker2.computeCurrentVelocity(1000, vo0.f184976w);
                    this.f178541a.m169629Q(x, y, this.f178542b, this.f178543c, velocityTracker2.getXVelocity(), velocityTracker2.getYVelocity());
                }
                this.f178546f.recycle();
                this.f178546f = null;
                this.f178542b = -1.0f;
                this.f178545e = 0;
                this.f178548h = false;
            }
        } else {
            if (!this.f178548h) {
                return false;
            }
            int i = this.f178545e;
            if (i >= 1) {
                if (i == 1) {
                    this.f178541a.m169662o0(SwipeState.START_MOVING, false);
                }
                this.f178545e = 2;
                this.f178541a.m169628P(x, y, this.f178542b, this.f178543c);
            } else if (Math.abs(this.f178542b - x) >= this.f178544d || Math.abs(this.f178543c - y) >= this.f178544d) {
                this.f178542b = x;
                this.f178543c = y;
                this.f178545e = 1;
                txl0 txl0VarM169622G = this.f178541a.m169622G();
                if (txl0VarM169622G != null) {
                    txl0VarM169622G.m193508a();
                    this.f178542b -= txl0VarM169622G.f176579l;
                    this.f178543c -= txl0VarM169622G.f176580m;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void m195496f(ViewGroup viewGroup, MotionEvent motionEvent) {
    }
}
