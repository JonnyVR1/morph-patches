package p003l;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import l.ibe;
import l.ig3;
import org.eclipse.jetty.http.HttpStatus;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class tjj {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0551a f7502a;

    /* JADX INFO: renamed from: l.tjj$a */
    public interface InterfaceC0551a {
        /* JADX INFO: renamed from: a */
        void mo7757a(boolean z);

        /* JADX INFO: renamed from: b */
        boolean mo7758b(MotionEvent motionEvent);

        /* JADX INFO: renamed from: c */
        void mo7759c(GestureDetector.OnDoubleTapListener onDoubleTapListener);
    }

    public tjj(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f7502a = new C0552b(context, onGestureListener, handler);
    }

    /* JADX INFO: renamed from: a */
    public boolean m7754a(MotionEvent motionEvent) {
        return this.f7502a.mo7758b(motionEvent);
    }

    /* JADX INFO: renamed from: b */
    public void m7755b(boolean z) {
        this.f7502a.mo7757a(z);
    }

    /* JADX INFO: renamed from: c */
    public void m7756c(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f7502a.mo7759c(onDoubleTapListener);
    }

    /* JADX INFO: renamed from: l.tjj$b */
    public static class C0552b implements InterfaceC0551a {

        /* JADX INFO: renamed from: v */
        public static final int f7503v = Math.max(ViewConfiguration.getLongPressTimeout(), HttpStatus.INTERNAL_SERVER_ERROR_500);

        /* JADX INFO: renamed from: w */
        public static final int f7504w = (int) (Math.max(ViewConfiguration.getTapTimeout(), 100) * 2.2f);

        /* JADX INFO: renamed from: x */
        public static final int f7505x = Math.max(ViewConfiguration.getDoubleTapTimeout(), HttpStatus.MULTIPLE_CHOICES_300);

        /* JADX INFO: renamed from: a */
        public int f7506a;

        /* JADX INFO: renamed from: b */
        public int f7507b;

        /* JADX INFO: renamed from: c */
        public int f7508c;

        /* JADX INFO: renamed from: d */
        public int f7509d;

        /* JADX INFO: renamed from: e */
        public final Handler f7510e;

        /* JADX INFO: renamed from: f */
        public final GestureDetector.OnGestureListener f7511f;

        /* JADX INFO: renamed from: g */
        public GestureDetector.OnDoubleTapListener f7512g;

        /* JADX INFO: renamed from: h */
        public boolean f7513h;

        /* JADX INFO: renamed from: i */
        public boolean f7514i;

        /* JADX INFO: renamed from: j */
        public boolean f7515j;

        /* JADX INFO: renamed from: k */
        public boolean f7516k;

        /* JADX INFO: renamed from: l */
        public boolean f7517l;

        /* JADX INFO: renamed from: m */
        public MotionEvent f7518m;

        /* JADX INFO: renamed from: n */
        public MotionEvent f7519n;

        /* JADX INFO: renamed from: o */
        public boolean f7520o;

        /* JADX INFO: renamed from: p */
        public float f7521p;

        /* JADX INFO: renamed from: q */
        public float f7522q;

        /* JADX INFO: renamed from: r */
        public float f7523r;

        /* JADX INFO: renamed from: s */
        public float f7524s;

        /* JADX INFO: renamed from: t */
        public boolean f7525t;

        /* JADX INFO: renamed from: u */
        public VelocityTracker f7526u;

        public C0552b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f7510e = new a(handler);
            } else {
                this.f7510e = new a();
            }
            this.f7511f = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                mo7759c((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            m7763g(context);
        }

        @Override // p003l.tjj.InterfaceC0551a
        /* JADX INFO: renamed from: a */
        public void mo7757a(boolean z) {
            this.f7525t = z;
        }

        @Override // p003l.tjj.InterfaceC0551a
        /* JADX INFO: renamed from: b */
        public boolean mo7758b(MotionEvent motionEvent) {
            boolean zOnDoubleTap;
            MotionEvent motionEvent2;
            boolean zOnFling;
            GestureDetector.OnDoubleTapListener onDoubleTapListener;
            boolean zOnScroll;
            int action = motionEvent.getAction();
            if (this.f7526u == null) {
                this.f7526u = VelocityTracker.obtain();
            }
            this.f7526u.addMovement(motionEvent);
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
                if (this.f7512g == null) {
                    zOnDoubleTap = false;
                } else {
                    boolean zHasMessages = this.f7510e.hasMessages(3);
                    if (zHasMessages) {
                        this.f7510e.removeMessages(3);
                    }
                    MotionEvent motionEvent3 = this.f7518m;
                    if (motionEvent3 == null || (motionEvent2 = this.f7519n) == null || !zHasMessages || !m7764h(motionEvent3, motionEvent2, motionEvent)) {
                        this.f7510e.sendEmptyMessageDelayed(3, f7505x);
                        zOnDoubleTap = false;
                    } else {
                        this.f7520o = true;
                        zOnDoubleTap = this.f7512g.onDoubleTap(this.f7518m) | this.f7512g.onDoubleTapEvent(motionEvent);
                    }
                }
                this.f7521p = f2;
                this.f7523r = f2;
                this.f7522q = f3;
                this.f7524s = f3;
                MotionEvent motionEvent4 = this.f7518m;
                if (motionEvent4 != null) {
                    motionEvent4.recycle();
                }
                this.f7518m = MotionEvent.obtain(motionEvent);
                this.f7516k = true;
                this.f7517l = true;
                this.f7513h = true;
                this.f7515j = false;
                this.f7514i = false;
                if (this.f7525t) {
                    this.f7510e.removeMessages(2);
                    this.f7510e.sendEmptyMessageDelayed(2, f7504w + f7503v);
                }
                this.f7510e.sendEmptyMessageDelayed(1, f7504w);
                return this.f7511f.onDown(motionEvent) | zOnDoubleTap;
            }
            if (i == 1) {
                this.f7513h = false;
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                if (this.f7520o) {
                    zOnFling = this.f7512g.onDoubleTapEvent(motionEvent);
                } else {
                    if (this.f7515j) {
                        this.f7510e.removeMessages(3);
                        this.f7515j = false;
                    } else if (this.f7516k) {
                        boolean zOnSingleTapUp = this.f7511f.onSingleTapUp(motionEvent);
                        if (this.f7514i && (onDoubleTapListener = this.f7512g) != null) {
                            onDoubleTapListener.onSingleTapConfirmed(motionEvent);
                        }
                        zOnFling = zOnSingleTapUp;
                    } else {
                        VelocityTracker velocityTracker = this.f7526u;
                        int pointerId = motionEvent.getPointerId(0);
                        velocityTracker.computeCurrentVelocity(1000, this.f7509d);
                        float yVelocity = velocityTracker.getYVelocity(pointerId);
                        float xVelocity = velocityTracker.getXVelocity(pointerId);
                        if (Math.abs(yVelocity) > this.f7508c || Math.abs(xVelocity) > this.f7508c) {
                            zOnFling = this.f7511f.onFling(this.f7518m, motionEvent, xVelocity, yVelocity);
                        }
                    }
                    zOnFling = false;
                }
                MotionEvent motionEvent5 = this.f7519n;
                if (motionEvent5 != null) {
                    motionEvent5.recycle();
                }
                this.f7519n = motionEventObtain;
                VelocityTracker velocityTracker2 = this.f7526u;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f7526u = null;
                }
                this.f7520o = false;
                this.f7514i = false;
                this.f7510e.removeMessages(1);
                this.f7510e.removeMessages(2);
                return zOnFling;
            }
            if (i != 2) {
                if (i == 3) {
                    m7760d();
                    return false;
                }
                if (i == 5) {
                    this.f7521p = f2;
                    this.f7523r = f2;
                    this.f7522q = f3;
                    this.f7524s = f3;
                    m7761e();
                    return false;
                }
                if (i == 6) {
                    this.f7521p = f2;
                    this.f7523r = f2;
                    this.f7522q = f3;
                    this.f7524s = f3;
                    this.f7526u.computeCurrentVelocity(1000, this.f7509d);
                    int actionIndex2 = motionEvent.getActionIndex();
                    int pointerId2 = motionEvent.getPointerId(actionIndex2);
                    float xVelocity2 = this.f7526u.getXVelocity(pointerId2);
                    float yVelocity2 = this.f7526u.getYVelocity(pointerId2);
                    for (int i3 = 0; i3 < pointerCount; i3++) {
                        if (i3 != actionIndex2) {
                            int pointerId3 = motionEvent.getPointerId(i3);
                            if ((this.f7526u.getXVelocity(pointerId3) * xVelocity2) + (this.f7526u.getYVelocity(pointerId3) * yVelocity2) < 0.0f) {
                                this.f7526u.clear();
                                return false;
                            }
                        }
                    }
                }
            } else if (!this.f7515j) {
                float f4 = this.f7521p - f2;
                float f5 = this.f7522q - f3;
                if (this.f7520o) {
                    return this.f7512g.onDoubleTapEvent(motionEvent);
                }
                if (this.f7516k) {
                    int i4 = (int) (f2 - this.f7523r);
                    int i5 = (int) (f3 - this.f7524s);
                    int i6 = (i4 * i4) + (i5 * i5);
                    if (i6 > this.f7506a) {
                        zOnScroll = this.f7511f.onScroll(this.f7518m, motionEvent, f4, f5);
                        this.f7521p = f2;
                        this.f7522q = f3;
                        this.f7516k = false;
                        this.f7510e.removeMessages(3);
                        this.f7510e.removeMessages(1);
                        this.f7510e.removeMessages(2);
                    } else {
                        zOnScroll = false;
                    }
                    if (i6 > this.f7506a) {
                        this.f7517l = false;
                    }
                    return zOnScroll;
                }
                if (Math.abs(f4) >= 1.0f || Math.abs(f5) >= 1.0f) {
                    boolean zOnScroll2 = this.f7511f.onScroll(this.f7518m, motionEvent, f4, f5);
                    this.f7521p = f2;
                    this.f7522q = f3;
                    return zOnScroll2;
                }
            }
            return false;
        }

        @Override // p003l.tjj.InterfaceC0551a
        /* JADX INFO: renamed from: c */
        public void mo7759c(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f7512g = onDoubleTapListener;
        }

        /* JADX INFO: renamed from: d */
        public final void m7760d() {
            this.f7510e.removeMessages(1);
            this.f7510e.removeMessages(2);
            this.f7510e.removeMessages(3);
            this.f7526u.recycle();
            this.f7526u = null;
            this.f7520o = false;
            this.f7513h = false;
            this.f7516k = false;
            this.f7517l = false;
            this.f7514i = false;
            if (this.f7515j) {
                this.f7515j = false;
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m7761e() {
            this.f7510e.removeMessages(1);
            this.f7510e.removeMessages(2);
            this.f7510e.removeMessages(3);
            this.f7520o = false;
            this.f7516k = false;
            this.f7517l = false;
            this.f7514i = false;
            if (this.f7515j) {
                this.f7515j = false;
            }
        }

        /* JADX INFO: renamed from: f */
        public void m7762f() {
            this.f7510e.removeMessages(3);
            this.f7514i = false;
            this.f7515j = true;
            this.f7511f.onLongPress(this.f7518m);
        }

        /* JADX INFO: renamed from: g */
        public final void m7763g(Context context) {
            if (context == null) {
                ig3.a("Context must not be null");
                return;
            }
            if (this.f7511f == null) {
                ig3.a("OnGestureListener must not be null");
                return;
            }
            this.f7525t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f7508c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f7509d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f7506a = scaledTouchSlop * scaledTouchSlop;
            this.f7507b = scaledDoubleTapSlop * scaledDoubleTapSlop;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m7764h(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (!this.f7517l || motionEvent3.getEventTime() - motionEvent2.getEventTime() > f7505x) {
                return false;
            }
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            return (x * x) + (y * y) < this.f7507b;
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
                    C0552b c0552b = C0552b.this;
                    c0552b.f7511f.onShowPress(c0552b.f7518m);
                    return;
                }
                if (i == 2) {
                    C0552b.this.m7762f();
                    return;
                }
                if (i != 3) {
                    ibe.a("Unknown message ", message);
                    return;
                }
                C0552b c0552b2 = C0552b.this;
                GestureDetector.OnDoubleTapListener onDoubleTapListener = c0552b2.f7512g;
                if (onDoubleTapListener != null) {
                    if (c0552b2.f7513h) {
                        c0552b2.f7514i = true;
                    } else {
                        onDoubleTapListener.onSingleTapConfirmed(c0552b2.f7518m);
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
