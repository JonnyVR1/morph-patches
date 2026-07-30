package p153l;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public class kmj {

    /* JADX INFO: renamed from: u */
    public static final int f127483u = ViewConfiguration.getLongPressTimeout();

    /* JADX INFO: renamed from: v */
    public static final int f127484v = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: w */
    public static final int f127485w = ViewConfiguration.getDoubleTapTimeout();

    /* JADX INFO: renamed from: a */
    public int f127486a;

    /* JADX INFO: renamed from: b */
    public int f127487b;

    /* JADX INFO: renamed from: c */
    public int f127488c;

    /* JADX INFO: renamed from: d */
    public int f127489d;

    /* JADX INFO: renamed from: e */
    public int f127490e;

    /* JADX INFO: renamed from: f */
    public final Handler f127491f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC18209c f127492g;

    /* JADX INFO: renamed from: h */
    public InterfaceC18208b f127493h;

    /* JADX INFO: renamed from: i */
    public boolean f127494i;

    /* JADX INFO: renamed from: j */
    public boolean f127495j;

    /* JADX INFO: renamed from: k */
    public boolean f127496k;

    /* JADX INFO: renamed from: l */
    public boolean f127497l;

    /* JADX INFO: renamed from: m */
    public boolean f127498m;

    /* JADX INFO: renamed from: n */
    public MotionEvent f127499n;

    /* JADX INFO: renamed from: o */
    public MotionEvent f127500o;

    /* JADX INFO: renamed from: p */
    public boolean f127501p;

    /* JADX INFO: renamed from: q */
    public float f127502q;

    /* JADX INFO: renamed from: r */
    public float f127503r;

    /* JADX INFO: renamed from: s */
    public boolean f127504s;

    /* JADX INFO: renamed from: t */
    public VelocityTracker f127505t;

    /* JADX INFO: renamed from: l.kmj$b */
    public interface InterfaceC18208b {
        boolean onDoubleTap(MotionEvent motionEvent);

        boolean onDoubleTapEvent(MotionEvent motionEvent);

        boolean onSingleTapConfirmed(MotionEvent motionEvent);
    }

    /* JADX INFO: renamed from: l.kmj$c */
    public interface InterfaceC18209c {
        /* JADX INFO: renamed from: a */
        boolean mo36181a(MotionEvent motionEvent, MotionEvent motionEvent2);

        boolean onDown(MotionEvent motionEvent);

        boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

        void onLongPress(MotionEvent motionEvent);

        void onShowPress(MotionEvent motionEvent);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    public kmj(Context context, InterfaceC18209c interfaceC18209c, Handler handler) {
        if (handler != null) {
            this.f127491f = new HandlerC18207a(handler);
        } else {
            this.f127491f = new HandlerC18207a();
        }
        this.f127492g = interfaceC18209c;
        if (interfaceC18209c instanceof InterfaceC18208b) {
            m150483n((InterfaceC18208b) interfaceC18209c);
        }
        m150479j(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m150476g() {
        this.f127491f.removeMessages(1);
        this.f127491f.removeMessages(2);
        this.f127491f.removeMessages(3);
        this.f127505t.recycle();
        this.f127505t = null;
        this.f127501p = false;
        this.f127494i = false;
        this.f127497l = false;
        this.f127498m = false;
        this.f127495j = false;
        if (this.f127496k) {
            this.f127496k = false;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m150477h() {
        this.f127491f.removeMessages(1);
        this.f127491f.removeMessages(2);
        this.f127491f.removeMessages(3);
        this.f127501p = false;
        this.f127497l = false;
        this.f127498m = false;
        this.f127495j = false;
        if (this.f127496k) {
            this.f127496k = false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m150478i() {
        this.f127491f.removeMessages(3);
        this.f127495j = false;
        this.f127496k = true;
        this.f127492g.onLongPress(this.f127499n);
    }

    /* JADX INFO: renamed from: j */
    public final void m150479j(Context context) {
        int scaledTouchSlop;
        int touchSlop;
        int touchSlop2;
        if (this.f127492g == null) {
            mnd0.m159157a("OnGestureListener must not be null");
            return;
        }
        this.f127504s = true;
        if (context == null) {
            touchSlop = ViewConfiguration.getTouchSlop();
            touchSlop2 = ViewConfiguration.getTouchSlop();
            this.f127489d = ViewConfiguration.getMinimumFlingVelocity();
            this.f127490e = ViewConfiguration.getMaximumFlingVelocity();
            scaledTouchSlop = touchSlop;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f127489d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f127490e = viewConfiguration.getScaledMaximumFlingVelocity();
            touchSlop = scaledTouchSlop2;
            touchSlop2 = scaledDoubleTapSlop;
        }
        this.f127486a = (int) (((double) (touchSlop * touchSlop)) * 0.07d);
        this.f127487b = scaledTouchSlop * scaledTouchSlop;
        this.f127488c = touchSlop2 * touchSlop2;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m150480k(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
        if (!this.f127498m) {
            return false;
        }
        long eventTime = motionEvent3.getEventTime() - motionEvent2.getEventTime();
        if (eventTime <= f127485w && eventTime >= 40) {
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            if ((x * x) + (y * y) < this.f127488c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public boolean m150481l(MotionEvent motionEvent) {
        boolean zOnDoubleTap;
        MotionEvent motionEvent2;
        boolean zOnFling;
        InterfaceC18208b interfaceC18208b;
        boolean zMo36181a;
        int action = motionEvent.getAction();
        if (this.f127505t == null) {
            this.f127505t = VelocityTracker.obtain();
        }
        this.f127505t.addMovement(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getActionMasked(), motionEvent.getRawX(), motionEvent.getRawY(), 0));
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
            if (this.f127493h == null) {
                zOnDoubleTap = false;
            } else {
                boolean zHasMessages = this.f127491f.hasMessages(3);
                if (zHasMessages) {
                    this.f127491f.removeMessages(3);
                }
                MotionEvent motionEvent3 = this.f127499n;
                if (motionEvent3 == null || (motionEvent2 = this.f127500o) == null || !zHasMessages || !m150480k(motionEvent3, motionEvent2, motionEvent)) {
                    this.f127491f.sendEmptyMessageDelayed(3, f127485w);
                    zOnDoubleTap = false;
                } else {
                    this.f127501p = true;
                    zOnDoubleTap = this.f127493h.onDoubleTap(this.f127499n) | this.f127493h.onDoubleTapEvent(motionEvent);
                }
            }
            this.f127502q = f2;
            this.f127503r = f3;
            MotionEvent motionEvent4 = this.f127499n;
            if (motionEvent4 != null) {
                motionEvent4.recycle();
            }
            this.f127499n = MotionEvent.obtain(motionEvent);
            this.f127497l = true;
            this.f127498m = true;
            this.f127494i = true;
            this.f127496k = false;
            this.f127495j = false;
            if (this.f127504s) {
                this.f127491f.removeMessages(2);
                this.f127491f.sendEmptyMessageAtTime(2, this.f127499n.getDownTime() + ((long) f127484v) + ((long) f127483u));
            }
            this.f127491f.sendEmptyMessageAtTime(1, this.f127499n.getDownTime() + ((long) f127484v));
            return this.f127492g.onDown(motionEvent) | zOnDoubleTap;
        }
        if (i == 1) {
            this.f127494i = false;
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            if (this.f127501p) {
                zOnFling = this.f127493h.onDoubleTapEvent(motionEvent);
            } else {
                if (this.f127496k) {
                    this.f127491f.removeMessages(3);
                    this.f127496k = false;
                } else if (this.f127497l) {
                    boolean zOnSingleTapUp = this.f127492g.onSingleTapUp(motionEvent);
                    if (this.f127495j && (interfaceC18208b = this.f127493h) != null) {
                        interfaceC18208b.onSingleTapConfirmed(motionEvent);
                    }
                    zOnFling = zOnSingleTapUp;
                } else {
                    VelocityTracker velocityTracker = this.f127505t;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(1000, this.f127490e);
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    float xVelocity = velocityTracker.getXVelocity(pointerId);
                    if (Math.abs(yVelocity) > this.f127489d || Math.abs(xVelocity) > this.f127489d) {
                        zOnFling = this.f127492g.onFling(this.f127499n, motionEvent, xVelocity, yVelocity);
                    }
                }
                zOnFling = false;
            }
            MotionEvent motionEvent5 = this.f127500o;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            this.f127500o = motionEventObtain;
            VelocityTracker velocityTracker2 = this.f127505t;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f127505t = null;
            }
            this.f127501p = false;
            this.f127495j = false;
            this.f127491f.removeMessages(1);
            this.f127491f.removeMessages(2);
            return zOnFling;
        }
        if (i != 2) {
            if (i == 3) {
                m150476g();
                return false;
            }
            if (i == 5) {
                this.f127502q = f2;
                this.f127503r = f3;
                m150477h();
                return false;
            }
            if (i == 6) {
                this.f127502q = f2;
                this.f127503r = f3;
                this.f127505t.computeCurrentVelocity(1000, this.f127490e);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = this.f127505t.getXVelocity(pointerId2);
                float yVelocity2 = this.f127505t.getYVelocity(pointerId2);
                for (int i3 = 0; i3 < pointerCount; i3++) {
                    if (i3 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i3);
                        if ((this.f127505t.getXVelocity(pointerId3) * xVelocity2) + (this.f127505t.getYVelocity(pointerId3) * yVelocity2) < 0.0f) {
                            this.f127505t.clear();
                            return false;
                        }
                    }
                }
            }
        } else if (!this.f127496k) {
            if (this.f127499n == null) {
                m150484o(f2, f3, motionEvent);
            }
            if (this.f127501p) {
                return this.f127493h.onDoubleTapEvent(motionEvent);
            }
            if (!this.f127497l) {
                return this.f127492g.mo36181a(this.f127499n, motionEvent);
            }
            int i4 = (int) (f2 - this.f127502q);
            int i5 = (int) (f3 - this.f127503r);
            int i6 = (i4 * i4) + (i5 * i5);
            if (i6 > this.f127486a) {
                zMo36181a = this.f127492g.mo36181a(this.f127499n, motionEvent);
                this.f127497l = false;
                this.f127491f.removeMessages(3);
                this.f127491f.removeMessages(1);
                this.f127491f.removeMessages(2);
            } else {
                zMo36181a = false;
            }
            if (i6 > this.f127487b) {
                this.f127498m = false;
            }
            return zMo36181a;
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public void m150482m(boolean z) {
        this.f127504s = z;
    }

    /* JADX INFO: renamed from: n */
    public void m150483n(InterfaceC18208b interfaceC18208b) {
        this.f127493h = interfaceC18208b;
    }

    /* JADX INFO: renamed from: o */
    public void m150484o(float f, float f2, MotionEvent motionEvent) {
        this.f127502q = f;
        this.f127503r = f2;
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        this.f127499n = motionEventObtain;
        motionEventObtain.setAction(0);
    }

    /* JADX INFO: renamed from: l.kmj$a */
    public class HandlerC18207a extends Handler {
        public HandlerC18207a(Handler handler) {
            super(handler.getLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                kmj.this.f127492g.onShowPress(kmj.this.f127499n);
                return;
            }
            if (i == 2) {
                kmj.this.m150478i();
                return;
            }
            if (i != 3) {
                mce.m157919a("Unknown message ", message);
                return;
            }
            if (kmj.this.f127493h != null) {
                boolean z = kmj.this.f127494i;
                kmj kmjVar = kmj.this;
                if (z) {
                    kmjVar.f127495j = true;
                } else {
                    kmjVar.f127493h.onSingleTapConfirmed(kmj.this.f127499n);
                }
            }
        }

        public HandlerC18207a() {
        }
    }

    /* JADX INFO: renamed from: l.kmj$d */
    public static class C18210d implements InterfaceC18209c, InterfaceC18208b {
        @Override // p153l.kmj.InterfaceC18209c
        /* JADX INFO: renamed from: a */
        public boolean mo36181a(MotionEvent motionEvent, MotionEvent motionEvent2) {
            return false;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            return false;
        }

        @Override // p153l.kmj.InterfaceC18208b
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // p153l.kmj.InterfaceC18209c
        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        @Override // p153l.kmj.InterfaceC18209c
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override // p153l.kmj.InterfaceC18208b
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return false;
        }

        @Override // p153l.kmj.InterfaceC18209c
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }

        @Override // p153l.kmj.InterfaceC18209c
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // p153l.kmj.InterfaceC18209c
        public void onShowPress(MotionEvent motionEvent) {
        }
    }

    public kmj(Context context, InterfaceC18209c interfaceC18209c) {
        this(context, interfaceC18209c, null);
    }
}
