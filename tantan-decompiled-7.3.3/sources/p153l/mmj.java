package p153l;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public final class mmj {

    /* JADX INFO: renamed from: a */
    public final InterfaceC18655a f137573a;

    /* JADX INFO: renamed from: l.mmj$a */
    public interface InterfaceC18655a {
        /* JADX INFO: renamed from: a */
        void mo159064a(boolean z);

        /* JADX INFO: renamed from: b */
        boolean mo159065b(MotionEvent motionEvent);

        /* JADX INFO: renamed from: c */
        void mo159066c(GestureDetector.OnDoubleTapListener onDoubleTapListener);
    }

    public mmj(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f137573a = new C18656b(context, onGestureListener, handler);
    }

    /* JADX INFO: renamed from: a */
    public boolean m159061a(MotionEvent motionEvent) {
        return this.f137573a.mo159065b(motionEvent);
    }

    /* JADX INFO: renamed from: b */
    public void m159062b(boolean z) {
        this.f137573a.mo159064a(z);
    }

    /* JADX INFO: renamed from: c */
    public void m159063c(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f137573a.mo159066c(onDoubleTapListener);
    }

    /* JADX INFO: renamed from: l.mmj$b */
    public static class C18656b implements InterfaceC18655a {

        /* JADX INFO: renamed from: v */
        public static final int f137574v = Math.max(ViewConfiguration.getLongPressTimeout(), 500);

        /* JADX INFO: renamed from: w */
        public static final int f137575w = (int) (Math.max(ViewConfiguration.getTapTimeout(), 100) * 2.2f);

        /* JADX INFO: renamed from: x */
        public static final int f137576x = Math.max(ViewConfiguration.getDoubleTapTimeout(), 300);

        /* JADX INFO: renamed from: a */
        public int f137577a;

        /* JADX INFO: renamed from: b */
        public int f137578b;

        /* JADX INFO: renamed from: c */
        public int f137579c;

        /* JADX INFO: renamed from: d */
        public int f137580d;

        /* JADX INFO: renamed from: e */
        public final Handler f137581e;

        /* JADX INFO: renamed from: f */
        public final GestureDetector.OnGestureListener f137582f;

        /* JADX INFO: renamed from: g */
        public GestureDetector.OnDoubleTapListener f137583g;

        /* JADX INFO: renamed from: h */
        public boolean f137584h;

        /* JADX INFO: renamed from: i */
        public boolean f137585i;

        /* JADX INFO: renamed from: j */
        public boolean f137586j;

        /* JADX INFO: renamed from: k */
        public boolean f137587k;

        /* JADX INFO: renamed from: l */
        public boolean f137588l;

        /* JADX INFO: renamed from: m */
        public MotionEvent f137589m;

        /* JADX INFO: renamed from: n */
        public MotionEvent f137590n;

        /* JADX INFO: renamed from: o */
        public boolean f137591o;

        /* JADX INFO: renamed from: p */
        public float f137592p;

        /* JADX INFO: renamed from: q */
        public float f137593q;

        /* JADX INFO: renamed from: r */
        public float f137594r;

        /* JADX INFO: renamed from: s */
        public float f137595s;

        /* JADX INFO: renamed from: t */
        public boolean f137596t;

        /* JADX INFO: renamed from: u */
        public VelocityTracker f137597u;

        public C18656b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f137581e = new a(handler);
            } else {
                this.f137581e = new a();
            }
            this.f137582f = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                mo159066c((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            m159070g(context);
        }

        @Override // p153l.mmj.InterfaceC18655a
        /* JADX INFO: renamed from: a */
        public void mo159064a(boolean z) {
            this.f137596t = z;
        }

        @Override // p153l.mmj.InterfaceC18655a
        /* JADX INFO: renamed from: b */
        public boolean mo159065b(MotionEvent motionEvent) {
            boolean zOnDoubleTap;
            MotionEvent motionEvent2;
            boolean zOnFling;
            GestureDetector.OnDoubleTapListener onDoubleTapListener;
            boolean zOnScroll;
            int action = motionEvent.getAction();
            if (this.f137597u == null) {
                this.f137597u = VelocityTracker.obtain();
            }
            this.f137597u.addMovement(motionEvent);
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
                if (this.f137583g == null) {
                    zOnDoubleTap = false;
                } else {
                    boolean zHasMessages = this.f137581e.hasMessages(3);
                    if (zHasMessages) {
                        this.f137581e.removeMessages(3);
                    }
                    MotionEvent motionEvent3 = this.f137589m;
                    if (motionEvent3 == null || (motionEvent2 = this.f137590n) == null || !zHasMessages || !m159071h(motionEvent3, motionEvent2, motionEvent)) {
                        this.f137581e.sendEmptyMessageDelayed(3, f137576x);
                        zOnDoubleTap = false;
                    } else {
                        this.f137591o = true;
                        zOnDoubleTap = this.f137583g.onDoubleTap(this.f137589m) | this.f137583g.onDoubleTapEvent(motionEvent);
                    }
                }
                this.f137592p = f2;
                this.f137594r = f2;
                this.f137593q = f3;
                this.f137595s = f3;
                MotionEvent motionEvent4 = this.f137589m;
                if (motionEvent4 != null) {
                    motionEvent4.recycle();
                }
                this.f137589m = MotionEvent.obtain(motionEvent);
                this.f137587k = true;
                this.f137588l = true;
                this.f137584h = true;
                this.f137586j = false;
                this.f137585i = false;
                if (this.f137596t) {
                    this.f137581e.removeMessages(2);
                    this.f137581e.sendEmptyMessageDelayed(2, f137575w + f137574v);
                }
                this.f137581e.sendEmptyMessageDelayed(1, f137575w);
                return this.f137582f.onDown(motionEvent) | zOnDoubleTap;
            }
            if (i == 1) {
                this.f137584h = false;
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                if (this.f137591o) {
                    zOnFling = this.f137583g.onDoubleTapEvent(motionEvent);
                } else {
                    if (this.f137586j) {
                        this.f137581e.removeMessages(3);
                        this.f137586j = false;
                    } else if (this.f137587k) {
                        boolean zOnSingleTapUp = this.f137582f.onSingleTapUp(motionEvent);
                        if (this.f137585i && (onDoubleTapListener = this.f137583g) != null) {
                            onDoubleTapListener.onSingleTapConfirmed(motionEvent);
                        }
                        zOnFling = zOnSingleTapUp;
                    } else {
                        VelocityTracker velocityTracker = this.f137597u;
                        int pointerId = motionEvent.getPointerId(0);
                        velocityTracker.computeCurrentVelocity(1000, this.f137580d);
                        float yVelocity = velocityTracker.getYVelocity(pointerId);
                        float xVelocity = velocityTracker.getXVelocity(pointerId);
                        if (Math.abs(yVelocity) > this.f137579c || Math.abs(xVelocity) > this.f137579c) {
                            zOnFling = this.f137582f.onFling(this.f137589m, motionEvent, xVelocity, yVelocity);
                        }
                    }
                    zOnFling = false;
                }
                MotionEvent motionEvent5 = this.f137590n;
                if (motionEvent5 != null) {
                    motionEvent5.recycle();
                }
                this.f137590n = motionEventObtain;
                VelocityTracker velocityTracker2 = this.f137597u;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f137597u = null;
                }
                this.f137591o = false;
                this.f137585i = false;
                this.f137581e.removeMessages(1);
                this.f137581e.removeMessages(2);
                return zOnFling;
            }
            if (i != 2) {
                if (i == 3) {
                    m159067d();
                    return false;
                }
                if (i == 5) {
                    this.f137592p = f2;
                    this.f137594r = f2;
                    this.f137593q = f3;
                    this.f137595s = f3;
                    m159068e();
                    return false;
                }
                if (i == 6) {
                    this.f137592p = f2;
                    this.f137594r = f2;
                    this.f137593q = f3;
                    this.f137595s = f3;
                    this.f137597u.computeCurrentVelocity(1000, this.f137580d);
                    int actionIndex2 = motionEvent.getActionIndex();
                    int pointerId2 = motionEvent.getPointerId(actionIndex2);
                    float xVelocity2 = this.f137597u.getXVelocity(pointerId2);
                    float yVelocity2 = this.f137597u.getYVelocity(pointerId2);
                    for (int i3 = 0; i3 < pointerCount; i3++) {
                        if (i3 != actionIndex2) {
                            int pointerId3 = motionEvent.getPointerId(i3);
                            if ((this.f137597u.getXVelocity(pointerId3) * xVelocity2) + (this.f137597u.getYVelocity(pointerId3) * yVelocity2) < 0.0f) {
                                this.f137597u.clear();
                                return false;
                            }
                        }
                    }
                }
            } else if (!this.f137586j) {
                float f4 = this.f137592p - f2;
                float f5 = this.f137593q - f3;
                if (this.f137591o) {
                    return this.f137583g.onDoubleTapEvent(motionEvent);
                }
                if (this.f137587k) {
                    int i4 = (int) (f2 - this.f137594r);
                    int i5 = (int) (f3 - this.f137595s);
                    int i6 = (i4 * i4) + (i5 * i5);
                    if (i6 > this.f137577a) {
                        zOnScroll = this.f137582f.onScroll(this.f137589m, motionEvent, f4, f5);
                        this.f137592p = f2;
                        this.f137593q = f3;
                        this.f137587k = false;
                        this.f137581e.removeMessages(3);
                        this.f137581e.removeMessages(1);
                        this.f137581e.removeMessages(2);
                    } else {
                        zOnScroll = false;
                    }
                    if (i6 > this.f137577a) {
                        this.f137588l = false;
                    }
                    return zOnScroll;
                }
                if (Math.abs(f4) >= 1.0f || Math.abs(f5) >= 1.0f) {
                    boolean zOnScroll2 = this.f137582f.onScroll(this.f137589m, motionEvent, f4, f5);
                    this.f137592p = f2;
                    this.f137593q = f3;
                    return zOnScroll2;
                }
            }
            return false;
        }

        @Override // p153l.mmj.InterfaceC18655a
        /* JADX INFO: renamed from: c */
        public void mo159066c(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f137583g = onDoubleTapListener;
        }

        /* JADX INFO: renamed from: d */
        public final void m159067d() {
            this.f137581e.removeMessages(1);
            this.f137581e.removeMessages(2);
            this.f137581e.removeMessages(3);
            this.f137597u.recycle();
            this.f137597u = null;
            this.f137591o = false;
            this.f137584h = false;
            this.f137587k = false;
            this.f137588l = false;
            this.f137585i = false;
            if (this.f137586j) {
                this.f137586j = false;
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m159068e() {
            this.f137581e.removeMessages(1);
            this.f137581e.removeMessages(2);
            this.f137581e.removeMessages(3);
            this.f137591o = false;
            this.f137587k = false;
            this.f137588l = false;
            this.f137585i = false;
            if (this.f137586j) {
                this.f137586j = false;
            }
        }

        /* JADX INFO: renamed from: f */
        public void m159069f() {
            this.f137581e.removeMessages(3);
            this.f137585i = false;
            this.f137586j = true;
            this.f137582f.onLongPress(this.f137589m);
        }

        /* JADX INFO: renamed from: g */
        public final void m159070g(Context context) {
            if (context == null) {
                wg3.m206174a("Context must not be null");
                return;
            }
            if (this.f137582f == null) {
                wg3.m206174a("OnGestureListener must not be null");
                return;
            }
            this.f137596t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f137579c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f137580d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f137577a = scaledTouchSlop * scaledTouchSlop;
            this.f137578b = scaledDoubleTapSlop * scaledDoubleTapSlop;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m159071h(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (!this.f137588l || motionEvent3.getEventTime() - motionEvent2.getEventTime() > f137576x) {
                return false;
            }
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            return (x * x) + (y * y) < this.f137578b;
        }

        /* JADX INFO: renamed from: l.mmj$b$a */
        public class a extends Handler {
            public a(Handler handler) {
                super(handler.getLooper());
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    C18656b c18656b = C18656b.this;
                    c18656b.f137582f.onShowPress(c18656b.f137589m);
                    return;
                }
                if (i == 2) {
                    C18656b.this.m159069f();
                    return;
                }
                if (i != 3) {
                    mce.m157919a("Unknown message ", message);
                    return;
                }
                C18656b c18656b2 = C18656b.this;
                GestureDetector.OnDoubleTapListener onDoubleTapListener = c18656b2.f137583g;
                if (onDoubleTapListener != null) {
                    if (c18656b2.f137584h) {
                        c18656b2.f137585i = true;
                    } else {
                        onDoubleTapListener.onSingleTapConfirmed(c18656b2.f137589m);
                    }
                }
            }

            public a() {
            }
        }
    }

    public mmj(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }
}
