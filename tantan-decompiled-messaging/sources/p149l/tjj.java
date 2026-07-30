package p149l;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public final class tjj {

    /* JADX INFO: renamed from: a */
    public final InterfaceC20191a f170732a;

    /* JADX INFO: renamed from: l.tjj$a */
    public interface InterfaceC20191a {
        /* JADX INFO: renamed from: a */
        void mo189337a(boolean z);

        /* JADX INFO: renamed from: b */
        boolean mo189338b(MotionEvent motionEvent);

        /* JADX INFO: renamed from: c */
        void mo189339c(GestureDetector.OnDoubleTapListener onDoubleTapListener);
    }

    public tjj(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f170732a = new C20192b(context, onGestureListener, handler);
    }

    /* JADX INFO: renamed from: a */
    public boolean m189334a(MotionEvent motionEvent) {
        return this.f170732a.mo189338b(motionEvent);
    }

    /* JADX INFO: renamed from: b */
    public void m189335b(boolean z) {
        this.f170732a.mo189337a(z);
    }

    /* JADX INFO: renamed from: c */
    public void m189336c(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f170732a.mo189339c(onDoubleTapListener);
    }

    /* JADX INFO: renamed from: l.tjj$b */
    public static class C20192b implements InterfaceC20191a {

        /* JADX INFO: renamed from: v */
        public static final int f170733v = Math.max(ViewConfiguration.getLongPressTimeout(), 500);

        /* JADX INFO: renamed from: w */
        public static final int f170734w = (int) (Math.max(ViewConfiguration.getTapTimeout(), 100) * 2.2f);

        /* JADX INFO: renamed from: x */
        public static final int f170735x = Math.max(ViewConfiguration.getDoubleTapTimeout(), 300);

        /* JADX INFO: renamed from: a */
        public int f170736a;

        /* JADX INFO: renamed from: b */
        public int f170737b;

        /* JADX INFO: renamed from: c */
        public int f170738c;

        /* JADX INFO: renamed from: d */
        public int f170739d;

        /* JADX INFO: renamed from: e */
        public final Handler f170740e;

        /* JADX INFO: renamed from: f */
        public final GestureDetector.OnGestureListener f170741f;

        /* JADX INFO: renamed from: g */
        public GestureDetector.OnDoubleTapListener f170742g;

        /* JADX INFO: renamed from: h */
        public boolean f170743h;

        /* JADX INFO: renamed from: i */
        public boolean f170744i;

        /* JADX INFO: renamed from: j */
        public boolean f170745j;

        /* JADX INFO: renamed from: k */
        public boolean f170746k;

        /* JADX INFO: renamed from: l */
        public boolean f170747l;

        /* JADX INFO: renamed from: m */
        public MotionEvent f170748m;

        /* JADX INFO: renamed from: n */
        public MotionEvent f170749n;

        /* JADX INFO: renamed from: o */
        public boolean f170750o;

        /* JADX INFO: renamed from: p */
        public float f170751p;

        /* JADX INFO: renamed from: q */
        public float f170752q;

        /* JADX INFO: renamed from: r */
        public float f170753r;

        /* JADX INFO: renamed from: s */
        public float f170754s;

        /* JADX INFO: renamed from: t */
        public boolean f170755t;

        /* JADX INFO: renamed from: u */
        public VelocityTracker f170756u;

        public C20192b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f170740e = new a(handler);
            } else {
                this.f170740e = new a();
            }
            this.f170741f = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                mo189339c((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            m189343g(context);
        }

        @Override // p149l.tjj.InterfaceC20191a
        /* JADX INFO: renamed from: a */
        public void mo189337a(boolean z) {
            this.f170755t = z;
        }

        @Override // p149l.tjj.InterfaceC20191a
        /* JADX INFO: renamed from: b */
        public boolean mo189338b(MotionEvent motionEvent) {
            boolean zOnDoubleTap;
            MotionEvent motionEvent2;
            boolean zOnFling;
            GestureDetector.OnDoubleTapListener onDoubleTapListener;
            boolean zOnScroll;
            int action = motionEvent.getAction();
            if (this.f170756u == null) {
                this.f170756u = VelocityTracker.obtain();
            }
            this.f170756u.addMovement(motionEvent);
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
                if (this.f170742g == null) {
                    zOnDoubleTap = false;
                } else {
                    boolean zHasMessages = this.f170740e.hasMessages(3);
                    if (zHasMessages) {
                        this.f170740e.removeMessages(3);
                    }
                    MotionEvent motionEvent3 = this.f170748m;
                    if (motionEvent3 == null || (motionEvent2 = this.f170749n) == null || !zHasMessages || !m189344h(motionEvent3, motionEvent2, motionEvent)) {
                        this.f170740e.sendEmptyMessageDelayed(3, f170735x);
                        zOnDoubleTap = false;
                    } else {
                        this.f170750o = true;
                        zOnDoubleTap = this.f170742g.onDoubleTap(this.f170748m) | this.f170742g.onDoubleTapEvent(motionEvent);
                    }
                }
                this.f170751p = f2;
                this.f170753r = f2;
                this.f170752q = f3;
                this.f170754s = f3;
                MotionEvent motionEvent4 = this.f170748m;
                if (motionEvent4 != null) {
                    motionEvent4.recycle();
                }
                this.f170748m = MotionEvent.obtain(motionEvent);
                this.f170746k = true;
                this.f170747l = true;
                this.f170743h = true;
                this.f170745j = false;
                this.f170744i = false;
                if (this.f170755t) {
                    this.f170740e.removeMessages(2);
                    this.f170740e.sendEmptyMessageDelayed(2, f170734w + f170733v);
                }
                this.f170740e.sendEmptyMessageDelayed(1, f170734w);
                return this.f170741f.onDown(motionEvent) | zOnDoubleTap;
            }
            if (i == 1) {
                this.f170743h = false;
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                if (this.f170750o) {
                    zOnFling = this.f170742g.onDoubleTapEvent(motionEvent);
                } else {
                    if (this.f170745j) {
                        this.f170740e.removeMessages(3);
                        this.f170745j = false;
                    } else if (this.f170746k) {
                        boolean zOnSingleTapUp = this.f170741f.onSingleTapUp(motionEvent);
                        if (this.f170744i && (onDoubleTapListener = this.f170742g) != null) {
                            onDoubleTapListener.onSingleTapConfirmed(motionEvent);
                        }
                        zOnFling = zOnSingleTapUp;
                    } else {
                        VelocityTracker velocityTracker = this.f170756u;
                        int pointerId = motionEvent.getPointerId(0);
                        velocityTracker.computeCurrentVelocity(1000, this.f170739d);
                        float yVelocity = velocityTracker.getYVelocity(pointerId);
                        float xVelocity = velocityTracker.getXVelocity(pointerId);
                        if (Math.abs(yVelocity) > this.f170738c || Math.abs(xVelocity) > this.f170738c) {
                            zOnFling = this.f170741f.onFling(this.f170748m, motionEvent, xVelocity, yVelocity);
                        }
                    }
                    zOnFling = false;
                }
                MotionEvent motionEvent5 = this.f170749n;
                if (motionEvent5 != null) {
                    motionEvent5.recycle();
                }
                this.f170749n = motionEventObtain;
                VelocityTracker velocityTracker2 = this.f170756u;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f170756u = null;
                }
                this.f170750o = false;
                this.f170744i = false;
                this.f170740e.removeMessages(1);
                this.f170740e.removeMessages(2);
                return zOnFling;
            }
            if (i != 2) {
                if (i == 3) {
                    m189340d();
                    return false;
                }
                if (i == 5) {
                    this.f170751p = f2;
                    this.f170753r = f2;
                    this.f170752q = f3;
                    this.f170754s = f3;
                    m189341e();
                    return false;
                }
                if (i == 6) {
                    this.f170751p = f2;
                    this.f170753r = f2;
                    this.f170752q = f3;
                    this.f170754s = f3;
                    this.f170756u.computeCurrentVelocity(1000, this.f170739d);
                    int actionIndex2 = motionEvent.getActionIndex();
                    int pointerId2 = motionEvent.getPointerId(actionIndex2);
                    float xVelocity2 = this.f170756u.getXVelocity(pointerId2);
                    float yVelocity2 = this.f170756u.getYVelocity(pointerId2);
                    for (int i3 = 0; i3 < pointerCount; i3++) {
                        if (i3 != actionIndex2) {
                            int pointerId3 = motionEvent.getPointerId(i3);
                            if ((this.f170756u.getXVelocity(pointerId3) * xVelocity2) + (this.f170756u.getYVelocity(pointerId3) * yVelocity2) < 0.0f) {
                                this.f170756u.clear();
                                return false;
                            }
                        }
                    }
                }
            } else if (!this.f170745j) {
                float f4 = this.f170751p - f2;
                float f5 = this.f170752q - f3;
                if (this.f170750o) {
                    return this.f170742g.onDoubleTapEvent(motionEvent);
                }
                if (this.f170746k) {
                    int i4 = (int) (f2 - this.f170753r);
                    int i5 = (int) (f3 - this.f170754s);
                    int i6 = (i4 * i4) + (i5 * i5);
                    if (i6 > this.f170736a) {
                        zOnScroll = this.f170741f.onScroll(this.f170748m, motionEvent, f4, f5);
                        this.f170751p = f2;
                        this.f170752q = f3;
                        this.f170746k = false;
                        this.f170740e.removeMessages(3);
                        this.f170740e.removeMessages(1);
                        this.f170740e.removeMessages(2);
                    } else {
                        zOnScroll = false;
                    }
                    if (i6 > this.f170736a) {
                        this.f170747l = false;
                    }
                    return zOnScroll;
                }
                if (Math.abs(f4) >= 1.0f || Math.abs(f5) >= 1.0f) {
                    boolean zOnScroll2 = this.f170741f.onScroll(this.f170748m, motionEvent, f4, f5);
                    this.f170751p = f2;
                    this.f170752q = f3;
                    return zOnScroll2;
                }
            }
            return false;
        }

        @Override // p149l.tjj.InterfaceC20191a
        /* JADX INFO: renamed from: c */
        public void mo189339c(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f170742g = onDoubleTapListener;
        }

        /* JADX INFO: renamed from: d */
        public final void m189340d() {
            this.f170740e.removeMessages(1);
            this.f170740e.removeMessages(2);
            this.f170740e.removeMessages(3);
            this.f170756u.recycle();
            this.f170756u = null;
            this.f170750o = false;
            this.f170743h = false;
            this.f170746k = false;
            this.f170747l = false;
            this.f170744i = false;
            if (this.f170745j) {
                this.f170745j = false;
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m189341e() {
            this.f170740e.removeMessages(1);
            this.f170740e.removeMessages(2);
            this.f170740e.removeMessages(3);
            this.f170750o = false;
            this.f170746k = false;
            this.f170747l = false;
            this.f170744i = false;
            if (this.f170745j) {
                this.f170745j = false;
            }
        }

        /* JADX INFO: renamed from: f */
        public void m189342f() {
            this.f170740e.removeMessages(3);
            this.f170744i = false;
            this.f170745j = true;
            this.f170741f.onLongPress(this.f170748m);
        }

        /* JADX INFO: renamed from: g */
        public final void m189343g(Context context) {
            if (context == null) {
                ig3.m135964a("Context must not be null");
                return;
            }
            if (this.f170741f == null) {
                ig3.m135964a("OnGestureListener must not be null");
                return;
            }
            this.f170755t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f170738c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f170739d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f170736a = scaledTouchSlop * scaledTouchSlop;
            this.f170737b = scaledDoubleTapSlop * scaledDoubleTapSlop;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m189344h(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (!this.f170747l || motionEvent3.getEventTime() - motionEvent2.getEventTime() > f170735x) {
                return false;
            }
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            return (x * x) + (y * y) < this.f170737b;
        }

        /* JADX INFO: renamed from: l.tjj$b$a */
        public class a extends Handler {
            public a(Handler handler) {
                super(handler.getLooper());
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    C20192b c20192b = C20192b.this;
                    c20192b.f170741f.onShowPress(c20192b.f170748m);
                    return;
                }
                if (i == 2) {
                    C20192b.this.m189342f();
                    return;
                }
                if (i != 3) {
                    ibe.m135253a("Unknown message ", message);
                    return;
                }
                C20192b c20192b2 = C20192b.this;
                GestureDetector.OnDoubleTapListener onDoubleTapListener = c20192b2.f170742g;
                if (onDoubleTapListener != null) {
                    if (c20192b2.f170743h) {
                        c20192b2.f170744i = true;
                    } else {
                        onDoubleTapListener.onSingleTapConfirmed(c20192b2.f170748m);
                    }
                }
            }

            public a() {
            }
        }
    }

    public tjj(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }
}
