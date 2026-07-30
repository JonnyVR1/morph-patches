package p149l;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public class rjj {

    /* JADX INFO: renamed from: u */
    public static final int f159697u = ViewConfiguration.getLongPressTimeout();

    /* JADX INFO: renamed from: v */
    public static final int f159698v = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: w */
    public static final int f159699w = ViewConfiguration.getDoubleTapTimeout();

    /* JADX INFO: renamed from: a */
    public int f159700a;

    /* JADX INFO: renamed from: b */
    public int f159701b;

    /* JADX INFO: renamed from: c */
    public int f159702c;

    /* JADX INFO: renamed from: d */
    public int f159703d;

    /* JADX INFO: renamed from: e */
    public int f159704e;

    /* JADX INFO: renamed from: f */
    public final Handler f159705f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC19716c f159706g;

    /* JADX INFO: renamed from: h */
    public InterfaceC19715b f159707h;

    /* JADX INFO: renamed from: i */
    public boolean f159708i;

    /* JADX INFO: renamed from: j */
    public boolean f159709j;

    /* JADX INFO: renamed from: k */
    public boolean f159710k;

    /* JADX INFO: renamed from: l */
    public boolean f159711l;

    /* JADX INFO: renamed from: m */
    public boolean f159712m;

    /* JADX INFO: renamed from: n */
    public MotionEvent f159713n;

    /* JADX INFO: renamed from: o */
    public MotionEvent f159714o;

    /* JADX INFO: renamed from: p */
    public boolean f159715p;

    /* JADX INFO: renamed from: q */
    public float f159716q;

    /* JADX INFO: renamed from: r */
    public float f159717r;

    /* JADX INFO: renamed from: s */
    public boolean f159718s;

    /* JADX INFO: renamed from: t */
    public VelocityTracker f159719t;

    /* JADX INFO: renamed from: l.rjj$b */
    public interface InterfaceC19715b {
        boolean onDoubleTap(MotionEvent motionEvent);

        boolean onDoubleTapEvent(MotionEvent motionEvent);

        boolean onSingleTapConfirmed(MotionEvent motionEvent);
    }

    /* JADX INFO: renamed from: l.rjj$c */
    public interface InterfaceC19716c {
        /* JADX INFO: renamed from: a */
        boolean mo35178a(MotionEvent motionEvent, MotionEvent motionEvent2);

        boolean onDown(MotionEvent motionEvent);

        boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

        void onLongPress(MotionEvent motionEvent);

        void onShowPress(MotionEvent motionEvent);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    public rjj(Context context, InterfaceC19716c interfaceC19716c, Handler handler) {
        if (handler != null) {
            this.f159705f = new HandlerC19714a(handler);
        } else {
            this.f159705f = new HandlerC19714a();
        }
        this.f159706g = interfaceC19716c;
        if (interfaceC19716c instanceof InterfaceC19715b) {
            m179605n((InterfaceC19715b) interfaceC19716c);
        }
        m179601j(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m179598g() {
        this.f159705f.removeMessages(1);
        this.f159705f.removeMessages(2);
        this.f159705f.removeMessages(3);
        this.f159719t.recycle();
        this.f159719t = null;
        this.f159715p = false;
        this.f159708i = false;
        this.f159711l = false;
        this.f159712m = false;
        this.f159709j = false;
        if (this.f159710k) {
            this.f159710k = false;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m179599h() {
        this.f159705f.removeMessages(1);
        this.f159705f.removeMessages(2);
        this.f159705f.removeMessages(3);
        this.f159715p = false;
        this.f159711l = false;
        this.f159712m = false;
        this.f159709j = false;
        if (this.f159710k) {
            this.f159710k = false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m179600i() {
        this.f159705f.removeMessages(3);
        this.f159709j = false;
        this.f159710k = true;
        this.f159706g.onLongPress(this.f159713n);
    }

    /* JADX INFO: renamed from: j */
    public final void m179601j(Context context) {
        int scaledTouchSlop;
        int touchSlop;
        int touchSlop2;
        if (this.f159706g == null) {
            jfd0.m141176a("OnGestureListener must not be null");
            return;
        }
        this.f159718s = true;
        if (context == null) {
            touchSlop = ViewConfiguration.getTouchSlop();
            touchSlop2 = ViewConfiguration.getTouchSlop();
            this.f159703d = ViewConfiguration.getMinimumFlingVelocity();
            this.f159704e = ViewConfiguration.getMaximumFlingVelocity();
            scaledTouchSlop = touchSlop;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f159703d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f159704e = viewConfiguration.getScaledMaximumFlingVelocity();
            touchSlop = scaledTouchSlop2;
            touchSlop2 = scaledDoubleTapSlop;
        }
        this.f159700a = (int) (((double) (touchSlop * touchSlop)) * 0.07d);
        this.f159701b = scaledTouchSlop * scaledTouchSlop;
        this.f159702c = touchSlop2 * touchSlop2;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m179602k(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
        if (!this.f159712m) {
            return false;
        }
        long eventTime = motionEvent3.getEventTime() - motionEvent2.getEventTime();
        if (eventTime <= f159699w && eventTime >= 40) {
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            if ((x * x) + (y * y) < this.f159702c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public boolean m179603l(MotionEvent motionEvent) {
        boolean zOnDoubleTap;
        MotionEvent motionEvent2;
        boolean zOnFling;
        InterfaceC19715b interfaceC19715b;
        boolean zMo35178a;
        int action = motionEvent.getAction();
        if (this.f159719t == null) {
            this.f159719t = VelocityTracker.obtain();
        }
        this.f159719t.addMovement(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getActionMasked(), motionEvent.getRawX(), motionEvent.getRawY(), 0));
        int i = action & 255;
        boolean z = i == 6;
        int actionIndex = z ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float x = 0.0f;
        float y = 0.0f;
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (actionIndex != i2) {
                x += motionEvent.getX(i2);
                y += motionEvent.getY(i2);
            }
        }
        float f = z ? pointerCount - 1 : pointerCount;
        float f2 = x / f;
        float f3 = y / f;
        if (i == 0) {
            if (this.f159707h == null) {
                zOnDoubleTap = false;
            } else {
                boolean zHasMessages = this.f159705f.hasMessages(3);
                if (zHasMessages) {
                    this.f159705f.removeMessages(3);
                }
                MotionEvent motionEvent3 = this.f159713n;
                if (motionEvent3 == null || (motionEvent2 = this.f159714o) == null || !zHasMessages || !m179602k(motionEvent3, motionEvent2, motionEvent)) {
                    this.f159705f.sendEmptyMessageDelayed(3, f159699w);
                    zOnDoubleTap = false;
                } else {
                    this.f159715p = true;
                    zOnDoubleTap = this.f159707h.onDoubleTap(this.f159713n) | this.f159707h.onDoubleTapEvent(motionEvent);
                }
            }
            this.f159716q = f2;
            this.f159717r = f3;
            MotionEvent motionEvent4 = this.f159713n;
            if (motionEvent4 != null) {
                motionEvent4.recycle();
            }
            this.f159713n = MotionEvent.obtain(motionEvent);
            this.f159711l = true;
            this.f159712m = true;
            this.f159708i = true;
            this.f159710k = false;
            this.f159709j = false;
            if (this.f159718s) {
                this.f159705f.removeMessages(2);
                this.f159705f.sendEmptyMessageAtTime(2, this.f159713n.getDownTime() + ((long) f159698v) + ((long) f159697u));
            }
            this.f159705f.sendEmptyMessageAtTime(1, this.f159713n.getDownTime() + ((long) f159698v));
            return this.f159706g.onDown(motionEvent) | zOnDoubleTap;
        }
        if (i == 1) {
            this.f159708i = false;
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            if (this.f159715p) {
                zOnFling = this.f159707h.onDoubleTapEvent(motionEvent);
            } else {
                if (this.f159710k) {
                    this.f159705f.removeMessages(3);
                    this.f159710k = false;
                } else if (this.f159711l) {
                    boolean zOnSingleTapUp = this.f159706g.onSingleTapUp(motionEvent);
                    if (this.f159709j && (interfaceC19715b = this.f159707h) != null) {
                        interfaceC19715b.onSingleTapConfirmed(motionEvent);
                    }
                    zOnFling = zOnSingleTapUp;
                } else {
                    VelocityTracker velocityTracker = this.f159719t;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(1000, this.f159704e);
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    float xVelocity = velocityTracker.getXVelocity(pointerId);
                    if (Math.abs(yVelocity) > this.f159703d || Math.abs(xVelocity) > this.f159703d) {
                        zOnFling = this.f159706g.onFling(this.f159713n, motionEvent, xVelocity, yVelocity);
                    }
                }
                zOnFling = false;
            }
            MotionEvent motionEvent5 = this.f159714o;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            this.f159714o = motionEventObtain;
            VelocityTracker velocityTracker2 = this.f159719t;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f159719t = null;
            }
            this.f159715p = false;
            this.f159709j = false;
            this.f159705f.removeMessages(1);
            this.f159705f.removeMessages(2);
            return zOnFling;
        }
        if (i != 2) {
            if (i == 3) {
                m179598g();
                return false;
            }
            if (i == 5) {
                this.f159716q = f2;
                this.f159717r = f3;
                m179599h();
                return false;
            }
            if (i == 6) {
                this.f159716q = f2;
                this.f159717r = f3;
                this.f159719t.computeCurrentVelocity(1000, this.f159704e);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = this.f159719t.getXVelocity(pointerId2);
                float yVelocity2 = this.f159719t.getYVelocity(pointerId2);
                for (int i3 = 0; i3 < pointerCount; i3++) {
                    if (i3 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i3);
                        if ((this.f159719t.getXVelocity(pointerId3) * xVelocity2) + (this.f159719t.getYVelocity(pointerId3) * yVelocity2) < 0.0f) {
                            this.f159719t.clear();
                            return false;
                        }
                    }
                }
            }
        } else if (!this.f159710k) {
            if (this.f159713n == null) {
                m179606o(f2, f3, motionEvent);
            }
            if (this.f159715p) {
                return this.f159707h.onDoubleTapEvent(motionEvent);
            }
            if (!this.f159711l) {
                return this.f159706g.mo35178a(this.f159713n, motionEvent);
            }
            int i4 = (int) (f2 - this.f159716q);
            int i5 = (int) (f3 - this.f159717r);
            int i6 = (i4 * i4) + (i5 * i5);
            if (i6 > this.f159700a) {
                zMo35178a = this.f159706g.mo35178a(this.f159713n, motionEvent);
                this.f159711l = false;
                this.f159705f.removeMessages(3);
                this.f159705f.removeMessages(1);
                this.f159705f.removeMessages(2);
            } else {
                zMo35178a = false;
            }
            if (i6 > this.f159701b) {
                this.f159712m = false;
            }
            return zMo35178a;
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public void m179604m(boolean z) {
        this.f159718s = z;
    }

    /* JADX INFO: renamed from: n */
    public void m179605n(InterfaceC19715b interfaceC19715b) {
        this.f159707h = interfaceC19715b;
    }

    /* JADX INFO: renamed from: o */
    public void m179606o(float f, float f2, MotionEvent motionEvent) {
        this.f159716q = f;
        this.f159717r = f2;
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        this.f159713n = motionEventObtain;
        motionEventObtain.setAction(0);
    }

    /* JADX INFO: renamed from: l.rjj$a */
    public class HandlerC19714a extends Handler {
        public HandlerC19714a(Handler handler) {
            super(handler.getLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                rjj.this.f159706g.onShowPress(rjj.this.f159713n);
                return;
            }
            if (i == 2) {
                rjj.this.m179600i();
                return;
            }
            if (i != 3) {
                ibe.m135253a("Unknown message ", message);
                return;
            }
            if (rjj.this.f159707h != null) {
                boolean z = rjj.this.f159708i;
                rjj rjjVar = rjj.this;
                if (z) {
                    rjjVar.f159709j = true;
                } else {
                    rjjVar.f159707h.onSingleTapConfirmed(rjj.this.f159713n);
                }
            }
        }

        public HandlerC19714a() {
        }
    }

    /* JADX INFO: renamed from: l.rjj$d */
    public static class C19717d implements InterfaceC19716c, InterfaceC19715b {
        @Override // p149l.rjj.InterfaceC19716c
        /* JADX INFO: renamed from: a */
        public boolean mo35178a(MotionEvent motionEvent, MotionEvent motionEvent2) {
            return false;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            return false;
        }

        @Override // p149l.rjj.InterfaceC19715b
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // p149l.rjj.InterfaceC19716c
        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        @Override // p149l.rjj.InterfaceC19716c
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override // p149l.rjj.InterfaceC19715b
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return false;
        }

        @Override // p149l.rjj.InterfaceC19716c
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }

        @Override // p149l.rjj.InterfaceC19716c
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // p149l.rjj.InterfaceC19716c
        public void onShowPress(MotionEvent motionEvent) {
        }
    }

    public rjj(Context context, InterfaceC19716c interfaceC19716c) {
        this(context, interfaceC19716c, null);
    }
}
