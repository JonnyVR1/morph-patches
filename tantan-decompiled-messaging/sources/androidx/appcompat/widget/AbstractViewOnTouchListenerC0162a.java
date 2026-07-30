package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;
import p149l.tze0;

/* JADX INFO: renamed from: androidx.appcompat.widget.a */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class AbstractViewOnTouchListenerC0162a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final float f749a;

    /* JADX INFO: renamed from: b */
    public final int f750b;

    /* JADX INFO: renamed from: c */
    public final int f751c;

    /* JADX INFO: renamed from: d */
    public final View f752d;

    /* JADX INFO: renamed from: e */
    public Runnable f753e;

    /* JADX INFO: renamed from: f */
    public Runnable f754f;

    /* JADX INFO: renamed from: g */
    public boolean f755g;

    /* JADX INFO: renamed from: h */
    public int f756h;

    /* JADX INFO: renamed from: i */
    public final int[] f757i = new int[2];

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractViewOnTouchListenerC0162a.this.f752d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC0162a.this.m612e();
        }
    }

    public AbstractViewOnTouchListenerC0162a(View view) {
        this.f752d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f749a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f750b = tapTimeout;
        this.f751c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m610h(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* JADX INFO: renamed from: a */
    public final void m611a() {
        Runnable runnable = this.f754f;
        if (runnable != null) {
            this.f752d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f753e;
        if (runnable2 != null) {
            this.f752d.removeCallbacks(runnable2);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract tze0 mo372b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo373c();

    /* JADX INFO: renamed from: d */
    public boolean mo510d() {
        tze0 tze0VarMo372b = mo372b();
        if (tze0VarMo372b == null || !tze0VarMo372b.isShowing()) {
            return true;
        }
        tze0VarMo372b.dismiss();
        return true;
    }

    /* JADX INFO: renamed from: e */
    public void m612e() {
        m611a();
        View view = this.f752d;
        if (view.isEnabled() && !view.isLongClickable() && mo373c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f755g = true;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m613f(MotionEvent motionEvent) {
        DropDownListView dropDownListView;
        View view = this.f752d;
        tze0 tze0VarMo372b = mo372b();
        if (tze0VarMo372b != null && tze0VarMo372b.isShowing() && (dropDownListView = (DropDownListView) tze0VarMo372b.mo404g()) != null && dropDownListView.isShown()) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            m615i(view, motionEventObtainNoHistory);
            m616j(dropDownListView, motionEventObtainNoHistory);
            boolean zMo567e = dropDownListView.mo567e(motionEventObtainNoHistory, this.f756h);
            motionEventObtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (zMo567e && z) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX INFO: renamed from: g */
    public final boolean m614g(MotionEvent motionEvent) {
        View view = this.f752d;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f756h = motionEvent.getPointerId(0);
            if (this.f753e == null) {
                this.f753e = new a();
            }
            view.postDelayed(this.f753e, this.f750b);
            if (this.f754f == null) {
                this.f754f = new b();
            }
            view.postDelayed(this.f754f, this.f751c);
        } else if (actionMasked == 1) {
            m611a();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f756h);
            if (iFindPointerIndex >= 0 && !m610h(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.f749a)) {
                m611a();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
            m611a();
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m615i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f757i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m616j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f757i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f755g;
        if (z2) {
            z = m613f(motionEvent) || !mo510d();
        } else {
            z = m614g(motionEvent) && mo373c();
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f752d.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f755g = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f755g = false;
        this.f756h = -1;
        Runnable runnable = this.f753e;
        if (runnable != null) {
            this.f752d.removeCallbacks(runnable);
        }
    }
}
