package p003l;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import l.ibe;
import l.jfd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class rjj {

    /* JADX INFO: renamed from: u */
    public static final int f6945u = ViewConfiguration.getLongPressTimeout();

    /* JADX INFO: renamed from: v */
    public static final int f6946v = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: w */
    public static final int f6947w = ViewConfiguration.getDoubleTapTimeout();

    /* JADX INFO: renamed from: a */
    public int f6948a;

    /* JADX INFO: renamed from: b */
    public int f6949b;

    /* JADX INFO: renamed from: c */
    public int f6950c;

    /* JADX INFO: renamed from: d */
    public int f6951d;

    /* JADX INFO: renamed from: e */
    public int f6952e;

    /* JADX INFO: renamed from: f */
    public final Handler f6953f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC0509c f6954g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0508b f6955h;

    /* JADX INFO: renamed from: i */
    public boolean f6956i;

    /* JADX INFO: renamed from: j */
    public boolean f6957j;

    /* JADX INFO: renamed from: k */
    public boolean f6958k;

    /* JADX INFO: renamed from: l */
    public boolean f6959l;

    /* JADX INFO: renamed from: m */
    public boolean f6960m;

    /* JADX INFO: renamed from: n */
    public MotionEvent f6961n;

    /* JADX INFO: renamed from: o */
    public MotionEvent f6962o;

    /* JADX INFO: renamed from: p */
    public boolean f6963p;

    /* JADX INFO: renamed from: q */
    public float f6964q;

    /* JADX INFO: renamed from: r */
    public float f6965r;

    /* JADX INFO: renamed from: s */
    public boolean f6966s;

    /* JADX INFO: renamed from: t */
    public VelocityTracker f6967t;

    /* JADX INFO: renamed from: l.rjj$b */
    public interface InterfaceC0508b {
        boolean onDoubleTap(MotionEvent motionEvent);

        boolean onDoubleTapEvent(MotionEvent motionEvent);

        boolean onSingleTapConfirmed(MotionEvent motionEvent);
    }

    /* JADX INFO: renamed from: l.rjj$c */
    public interface InterfaceC0509c {
        /* JADX INFO: renamed from: a */
        boolean mo7290a(MotionEvent motionEvent, MotionEvent motionEvent2);

        boolean onDown(MotionEvent motionEvent);

        boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

        void onLongPress(MotionEvent motionEvent);

        void onShowPress(MotionEvent motionEvent);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    public rjj(Context context, InterfaceC0509c interfaceC0509c, Handler handler) {
        if (handler != null) {
            this.f6953f = new HandlerC0507a(handler);
        } else {
            this.f6953f = new HandlerC0507a();
        }
        this.f6954g = interfaceC0509c;
        if (interfaceC0509c instanceof InterfaceC0508b) {
            m7288n((InterfaceC0508b) interfaceC0509c);
        }
        m7284j(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m7281g() {
        this.f6953f.removeMessages(1);
        this.f6953f.removeMessages(2);
        this.f6953f.removeMessages(3);
        this.f6967t.recycle();
        this.f6967t = null;
        this.f6963p = false;
        this.f6956i = false;
        this.f6959l = false;
        this.f6960m = false;
        this.f6957j = false;
        if (this.f6958k) {
            this.f6958k = false;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m7282h() {
        this.f6953f.removeMessages(1);
        this.f6953f.removeMessages(2);
        this.f6953f.removeMessages(3);
        this.f6963p = false;
        this.f6959l = false;
        this.f6960m = false;
        this.f6957j = false;
        if (this.f6958k) {
            this.f6958k = false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m7283i() {
        this.f6953f.removeMessages(3);
        this.f6957j = false;
        this.f6958k = true;
        this.f6954g.onLongPress(this.f6961n);
    }

    /* JADX INFO: renamed from: j */
    public final void m7284j(Context context) {
        int scaledTouchSlop;
        int touchSlop;
        int touchSlop2;
        if (this.f6954g == null) {
            jfd0.a("OnGestureListener must not be null");
            return;
        }
        this.f6966s = true;
        if (context == null) {
            touchSlop = ViewConfiguration.getTouchSlop();
            touchSlop2 = ViewConfiguration.getTouchSlop();
            this.f6951d = ViewConfiguration.getMinimumFlingVelocity();
            this.f6952e = ViewConfiguration.getMaximumFlingVelocity();
            scaledTouchSlop = touchSlop;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f6951d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f6952e = viewConfiguration.getScaledMaximumFlingVelocity();
            touchSlop = scaledTouchSlop2;
            touchSlop2 = scaledDoubleTapSlop;
        }
        this.f6948a = (int) (((double) (touchSlop * touchSlop)) * 0.07d);
        this.f6949b = scaledTouchSlop * scaledTouchSlop;
        this.f6950c = touchSlop2 * touchSlop2;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m7285k(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
        if (!this.f6960m) {
            return false;
        }
        long eventTime = motionEvent3.getEventTime() - motionEvent2.getEventTime();
        if (eventTime <= f6947w && eventTime >= 40) {
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            if ((x * x) + (y * y) < this.f6950c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public boolean m7286l(MotionEvent motionEvent) {
        boolean zOnDoubleTap;
        MotionEvent motionEvent2;
        boolean zOnFling;
        InterfaceC0508b interfaceC0508b;
        boolean zMo7290a;
        int action = motionEvent.getAction();
        if (this.f6967t == null) {
            this.f6967t = VelocityTracker.obtain();
        }
        this.f6967t.addMovement(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getActionMasked(), motionEvent.getRawX(), motionEvent.getRawY(), 0));
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
            if (this.f6955h == null) {
                zOnDoubleTap = false;
            } else {
                boolean zHasMessages = this.f6953f.hasMessages(3);
                if (zHasMessages) {
                    this.f6953f.removeMessages(3);
                }
                MotionEvent motionEvent3 = this.f6961n;
                if (motionEvent3 == null || (motionEvent2 = this.f6962o) == null || !zHasMessages || !m7285k(motionEvent3, motionEvent2, motionEvent)) {
                    this.f6953f.sendEmptyMessageDelayed(3, f6947w);
                    zOnDoubleTap = false;
                } else {
                    this.f6963p = true;
                    zOnDoubleTap = this.f6955h.onDoubleTap(this.f6961n) | this.f6955h.onDoubleTapEvent(motionEvent);
                }
            }
            this.f6964q = f2;
            this.f6965r = f3;
            MotionEvent motionEvent4 = this.f6961n;
            if (motionEvent4 != null) {
                motionEvent4.recycle();
            }
            this.f6961n = MotionEvent.obtain(motionEvent);
            this.f6959l = true;
            this.f6960m = true;
            this.f6956i = true;
            this.f6958k = false;
            this.f6957j = false;
            if (this.f6966s) {
                this.f6953f.removeMessages(2);
                this.f6953f.sendEmptyMessageAtTime(2, this.f6961n.getDownTime() + ((long) f6946v) + ((long) f6945u));
            }
            this.f6953f.sendEmptyMessageAtTime(1, this.f6961n.getDownTime() + ((long) f6946v));
            return this.f6954g.onDown(motionEvent) | zOnDoubleTap;
        }
        if (i == 1) {
            this.f6956i = false;
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            if (this.f6963p) {
                zOnFling = this.f6955h.onDoubleTapEvent(motionEvent);
            } else {
                if (this.f6958k) {
                    this.f6953f.removeMessages(3);
                    this.f6958k = false;
                } else if (this.f6959l) {
                    boolean zOnSingleTapUp = this.f6954g.onSingleTapUp(motionEvent);
                    if (this.f6957j && (interfaceC0508b = this.f6955h) != null) {
                        interfaceC0508b.onSingleTapConfirmed(motionEvent);
                    }
                    zOnFling = zOnSingleTapUp;
                } else {
                    VelocityTracker velocityTracker = this.f6967t;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(1000, this.f6952e);
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    float xVelocity = velocityTracker.getXVelocity(pointerId);
                    if (Math.abs(yVelocity) > this.f6951d || Math.abs(xVelocity) > this.f6951d) {
                        zOnFling = this.f6954g.onFling(this.f6961n, motionEvent, xVelocity, yVelocity);
                    }
                }
                zOnFling = false;
            }
            MotionEvent motionEvent5 = this.f6962o;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            this.f6962o = motionEventObtain;
            VelocityTracker velocityTracker2 = this.f6967t;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f6967t = null;
            }
            this.f6963p = false;
            this.f6957j = false;
            this.f6953f.removeMessages(1);
            this.f6953f.removeMessages(2);
            return zOnFling;
        }
        if (i != 2) {
            if (i == 3) {
                m7281g();
                return false;
            }
            if (i == 5) {
                this.f6964q = f2;
                this.f6965r = f3;
                m7282h();
                return false;
            }
            if (i == 6) {
                this.f6964q = f2;
                this.f6965r = f3;
                this.f6967t.computeCurrentVelocity(1000, this.f6952e);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = this.f6967t.getXVelocity(pointerId2);
                float yVelocity2 = this.f6967t.getYVelocity(pointerId2);
                for (int i3 = 0; i3 < pointerCount; i3++) {
                    if (i3 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i3);
                        if ((this.f6967t.getXVelocity(pointerId3) * xVelocity2) + (this.f6967t.getYVelocity(pointerId3) * yVelocity2) < 0.0f) {
                            this.f6967t.clear();
                            return false;
                        }
                    }
                }
            }
        } else if (!this.f6958k) {
            if (this.f6961n == null) {
                m7289o(f2, f3, motionEvent);
            }
            if (this.f6963p) {
                return this.f6955h.onDoubleTapEvent(motionEvent);
            }
            if (!this.f6959l) {
                return this.f6954g.mo7290a(this.f6961n, motionEvent);
            }
            int i4 = (int) (f2 - this.f6964q);
            int i5 = (int) (f3 - this.f6965r);
            int i6 = (i4 * i4) + (i5 * i5);
            if (i6 > this.f6948a) {
                zMo7290a = this.f6954g.mo7290a(this.f6961n, motionEvent);
                this.f6959l = false;
                this.f6953f.removeMessages(3);
                this.f6953f.removeMessages(1);
                this.f6953f.removeMessages(2);
            } else {
                zMo7290a = false;
            }
            if (i6 > this.f6949b) {
                this.f6960m = false;
            }
            return zMo7290a;
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public void m7287m(boolean z) {
        this.f6966s = z;
    }

    /* JADX INFO: renamed from: n */
    public void m7288n(InterfaceC0508b interfaceC0508b) {
        this.f6955h = interfaceC0508b;
    }

    /* JADX INFO: renamed from: o */
    public void m7289o(float f, float f2, MotionEvent motionEvent) {
        this.f6964q = f;
        this.f6965r = f2;
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        this.f6961n = motionEventObtain;
        motionEventObtain.setAction(0);
    }

    /* JADX INFO: renamed from: l.rjj$a */
    public class HandlerC0507a extends Handler {
        public HandlerC0507a(Handler handler) {
            super(handler.getLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                rjj.this.f6954g.onShowPress(rjj.this.f6961n);
                return;
            }
            if (i == 2) {
                rjj.this.m7283i();
                return;
            }
            if (i != 3) {
                ibe.a("Unknown message ", message);
                return;
            }
            if (rjj.this.f6955h != null) {
                boolean z = rjj.this.f6956i;
                rjj rjjVar = rjj.this;
                if (z) {
                    rjjVar.f6957j = true;
                } else {
                    rjjVar.f6955h.onSingleTapConfirmed(rjj.this.f6961n);
                }
            }
        }

        public HandlerC0507a() {
        }
    }

    /* JADX INFO: renamed from: l.rjj$d */
    public static class C0510d implements InterfaceC0509c, InterfaceC0508b {
        @Override // p003l.rjj.InterfaceC0509c
        /* JADX INFO: renamed from: a */
        public boolean mo7290a(MotionEvent motionEvent, MotionEvent motionEvent2) {
            return false;
        }

        @Override // p003l.rjj.InterfaceC0508b
        public boolean onDoubleTap(MotionEvent motionEvent) {
            return false;
        }

        @Override // p003l.rjj.InterfaceC0508b
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // p003l.rjj.InterfaceC0509c
        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        @Override // p003l.rjj.InterfaceC0509c
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override // p003l.rjj.InterfaceC0508b
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return false;
        }

        @Override // p003l.rjj.InterfaceC0509c
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }

        @Override // p003l.rjj.InterfaceC0509c
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // p003l.rjj.InterfaceC0509c
        public void onShowPress(MotionEvent motionEvent) {
        }
    }

    public rjj(Context context, InterfaceC0509c interfaceC0509c) {
        this(context, interfaceC0509c, null);
    }
}
