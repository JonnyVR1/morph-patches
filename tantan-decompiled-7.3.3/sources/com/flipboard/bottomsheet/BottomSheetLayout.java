package com.flipboard.bottomsheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p153l.mnd0;
import p153l.nac0;
import p153l.nml0;
import p153l.os2;
import p153l.qn50;
import p153l.w8c0;
import p153l.wg3;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes6.dex */
public class BottomSheetLayout extends FrameLayout {

    /* JADX INFO: renamed from: I */
    private static final Property<BottomSheetLayout, Float> f6927I = new C1741a(Float.class, "sheetTranslation");

    /* JADX INFO: renamed from: A */
    private final boolean f6928A;

    /* JADX INFO: renamed from: B */
    private final int f6929B;

    /* JADX INFO: renamed from: C */
    private int f6930C;

    /* JADX INFO: renamed from: D */
    private int f6931D;

    /* JADX INFO: renamed from: E */
    private float f6932E;

    /* JADX INFO: renamed from: F */
    private float f6933F;

    /* JADX INFO: renamed from: G */
    private float f6934G;

    /* JADX INFO: renamed from: H */
    private State f6935H;

    /* JADX INFO: renamed from: a */
    private Runnable f6936a;

    /* JADX INFO: renamed from: b */
    private Rect f6937b;

    /* JADX INFO: renamed from: c */
    private State f6938c;

    /* JADX INFO: renamed from: d */
    private boolean f6939d;

    /* JADX INFO: renamed from: e */
    private TimeInterpolator f6940e;

    /* JADX INFO: renamed from: f */
    public boolean f6941f;

    /* JADX INFO: renamed from: g */
    private boolean f6942g;

    /* JADX INFO: renamed from: h */
    private float f6943h;

    /* JADX INFO: renamed from: i */
    private VelocityTracker f6944i;

    /* JADX INFO: renamed from: j */
    private float f6945j;

    /* JADX INFO: renamed from: k */
    private float f6946k;

    /* JADX INFO: renamed from: l */
    private nml0 f6947l;

    /* JADX INFO: renamed from: m */
    private nml0 f6948m;

    /* JADX INFO: renamed from: n */
    private boolean f6949n;

    /* JADX INFO: renamed from: o */
    private boolean f6950o;

    /* JADX INFO: renamed from: p */
    private Animator f6951p;

    /* JADX INFO: renamed from: q */
    private CopyOnWriteArraySet<qn50> f6952q;

    /* JADX INFO: renamed from: r */
    private CopyOnWriteArraySet<InterfaceC1750j> f6953r;

    /* JADX INFO: renamed from: s */
    private View.OnLayoutChangeListener f6954s;

    /* JADX INFO: renamed from: t */
    private View f6955t;

    /* JADX INFO: renamed from: u */
    private boolean f6956u;

    /* JADX INFO: renamed from: v */
    private int f6957v;

    /* JADX INFO: renamed from: w */
    private boolean f6958w;

    /* JADX INFO: renamed from: x */
    private float f6959x;

    /* JADX INFO: renamed from: y */
    private float f6960y;

    /* JADX INFO: renamed from: z */
    private int f6961z;

    public enum State {
        HIDDEN,
        PREPARING,
        PEEKED,
        EXPANDED
    }

    /* JADX INFO: renamed from: com.flipboard.bottomsheet.BottomSheetLayout$a */
    public static class C1741a extends Property<BottomSheetLayout, Float> {
        public C1741a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(BottomSheetLayout bottomSheetLayout) {
            return Float.valueOf(bottomSheetLayout.f6943h);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(BottomSheetLayout bottomSheetLayout, Float f) {
            bottomSheetLayout.setSheetTranslation(f.floatValue());
        }
    }

    /* JADX INFO: renamed from: com.flipboard.bottomsheet.BottomSheetLayout$b */
    public class C1742b extends C1748h {
        public C1742b() {
            super(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            if (this.f6972a) {
                return;
            }
            BottomSheetLayout.this.f6951p = null;
        }
    }

    /* JADX INFO: renamed from: com.flipboard.bottomsheet.BottomSheetLayout$c */
    public class C1743c extends C1748h {
        public C1743c() {
            super(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            if (this.f6972a) {
                return;
            }
            BottomSheetLayout.this.f6951p = null;
        }
    }

    /* JADX INFO: renamed from: com.flipboard.bottomsheet.BottomSheetLayout$d */
    public class RunnableC1744d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f6964a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ nml0 f6965b;

        public RunnableC1744d(View view, nml0 nml0Var) {
            this.f6964a = view;
            this.f6965b = nml0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetLayout.this.m9335D(this.f6964a, this.f6965b);
        }
    }

    /* JADX INFO: renamed from: com.flipboard.bottomsheet.BottomSheetLayout$e */
    public class ViewTreeObserverOnPreDrawListenerC1745e implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: com.flipboard.bottomsheet.BottomSheetLayout$e$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BottomSheetLayout.this.getSheetView() != null) {
                    BottomSheetLayout.this.m9333B();
                }
            }
        }

        public ViewTreeObserverOnPreDrawListenerC1745e() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            BottomSheetLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
            BottomSheetLayout.this.post(new a());
            return true;
        }
    }

    /* JADX INFO: renamed from: com.flipboard.bottomsheet.BottomSheetLayout$f */
    public class ViewOnLayoutChangeListenerC1746f implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC1746f() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int measuredHeight = view.getMeasuredHeight();
            if (BottomSheetLayout.this.f6938c != State.HIDDEN) {
                int i9 = BottomSheetLayout.this.f6957v;
                BottomSheetLayout bottomSheetLayout = BottomSheetLayout.this;
                if (measuredHeight < i9) {
                    if (bottomSheetLayout.f6938c == State.EXPANDED) {
                        BottomSheetLayout.this.setState(State.PEEKED);
                    }
                    BottomSheetLayout.this.setSheetTranslation(measuredHeight);
                } else if (bottomSheetLayout.f6957v > 0 && measuredHeight > BottomSheetLayout.this.f6957v && BottomSheetLayout.this.f6938c == State.PEEKED) {
                    float f = measuredHeight;
                    if (f == BottomSheetLayout.this.getMaxSheetTranslation()) {
                        BottomSheetLayout.this.setState(State.EXPANDED);
                    }
                    BottomSheetLayout.this.setSheetTranslation(f);
                }
            }
            BottomSheetLayout.this.f6957v = measuredHeight;
        }
    }

    /* JADX INFO: renamed from: com.flipboard.bottomsheet.BottomSheetLayout$g */
    public class C1747g extends C1748h {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f6970b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1747g(View view) {
            super(null);
            this.f6970b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f6972a) {
                return;
            }
            BottomSheetLayout.this.f6951p = null;
            BottomSheetLayout.this.setState(State.HIDDEN);
            BottomSheetLayout.this.setSheetLayerTypeIfEnabled(0);
            BottomSheetLayout.this.removeView(this.f6970b);
            Iterator it = BottomSheetLayout.this.f6952q.iterator();
            while (it.hasNext()) {
                ((qn50) it.next()).mo112565a(BottomSheetLayout.this);
            }
            BottomSheetLayout.this.f6948m = null;
            if (BottomSheetLayout.this.f6936a != null) {
                BottomSheetLayout.this.f6936a.run();
                BottomSheetLayout.this.f6936a = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.flipboard.bottomsheet.BottomSheetLayout$j */
    public interface InterfaceC1750j {
        /* JADX INFO: renamed from: a */
        void m9343a(State state);
    }

    public BottomSheetLayout(Context context) {
        super(context);
        this.f6937b = new Rect();
        this.f6938c = State.HIDDEN;
        this.f6939d = false;
        this.f6940e = new DecelerateInterpolator(1.6f);
        this.f6947l = new C1749i(null);
        this.f6949n = true;
        this.f6950o = true;
        this.f6952q = new CopyOnWriteArraySet<>();
        this.f6953r = new CopyOnWriteArraySet<>();
        this.f6956u = true;
        this.f6961z = 0;
        this.f6928A = getResources().getBoolean(w8c0.f187846a);
        this.f6929B = getResources().getDimensionPixelSize(nac0.f141001a);
        this.f6930C = 0;
        this.f6931D = 0;
        m9330w();
    }

    /* JADX INFO: renamed from: A */
    private boolean m9309A(float f) {
        if (this.f6928A) {
            return f >= ((float) this.f6930C) && f <= ((float) this.f6931D);
        }
        return true;
    }

    /* JADX INFO: renamed from: E */
    private void m9310E(float f) {
        nml0 nml0Var = this.f6948m;
        if (nml0Var != null) {
            nml0Var.mo9342b(f, getMaxSheetTranslation(), getPeekSheetTranslation(), this, getContentView());
            return;
        }
        nml0 nml0Var2 = this.f6947l;
        if (nml0Var2 != null) {
            nml0Var2.mo9342b(f, getMaxSheetTranslation(), getPeekSheetTranslation(), this, getContentView());
        }
    }

    private float getDefaultPeekTranslation() {
        return m9329v() ? this.f6959x : getSheetView().getHeight();
    }

    /* JADX INFO: renamed from: n */
    private boolean m9323n(View view, float f, float f2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                int left = childAt.getLeft() - view.getScrollX();
                int top = childAt.getTop() - view.getScrollY();
                int right = childAt.getRight() - view.getScrollX();
                int bottom = childAt.getBottom() - view.getScrollY();
                float f3 = left;
                if (f > f3 && f < right && f2 > top && f2 < bottom && m9323n(childAt, f - f3, f2 - top)) {
                    return true;
                }
            }
        }
        return view.canScrollVertically(-1);
    }

    /* JADX INFO: renamed from: o */
    private void m9324o() {
        Animator animator = this.f6951p;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: p */
    private static <T> T m9325p(T t, String str) {
        if (t != null) {
            return t;
        }
        mnd0.m159157a(str);
        return null;
    }

    /* JADX INFO: renamed from: r */
    private void m9326r(Runnable runnable) {
        if (this.f6938c == State.HIDDEN) {
            this.f6936a = null;
            return;
        }
        this.f6936a = runnable;
        View sheetView = getSheetView();
        sheetView.removeOnLayoutChangeListener(this.f6954s);
        m9324o();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f6927I, 0.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(this.f6940e);
        objectAnimatorOfFloat.addListener(new C1747g(sheetView));
        objectAnimatorOfFloat.start();
        this.f6951p = objectAnimatorOfFloat;
        this.f6930C = 0;
        this.f6931D = this.f6961z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSheetLayerTypeIfEnabled(int i) {
        if (this.f6950o) {
            getSheetView().setLayerType(i, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSheetTranslation(float f) {
        this.f6943h = Math.min(f, getMaxSheetTranslation());
        this.f6937b.set(0, 0, getWidth(), (int) (((double) getHeight()) - Math.ceil(this.f6943h)));
        getSheetView().setTranslationY(getHeight() - this.f6943h);
        m9310E(this.f6943h);
        if (this.f6949n) {
            float fM9327t = m9327t(this.f6943h);
            this.f6955t.setAlpha(fM9327t);
            this.f6955t.setVisibility(fM9327t <= 0.0f ? 4 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(State state) {
        if (state != this.f6938c) {
            this.f6938c = state;
            Iterator<InterfaceC1750j> it = this.f6953r.iterator();
            while (it.hasNext()) {
                it.next().m9343a(state);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    private float m9327t(float f) {
        nml0 nml0Var = this.f6948m;
        if (nml0Var != null) {
            return nml0Var.mo163831a(f, getMaxSheetTranslation(), getPeekSheetTranslation(), this, getContentView());
        }
        nml0 nml0Var2 = this.f6947l;
        if (nml0Var2 != null) {
            return nml0Var2.mo163831a(f, getMaxSheetTranslation(), getPeekSheetTranslation(), this, getContentView());
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: u */
    private boolean m9328u() {
        return getSheetView() == null || getSheetView().getHeight() == getHeight();
    }

    /* JADX INFO: renamed from: v */
    private boolean m9329v() {
        return getSheetView() == null || ((float) getSheetView().getHeight()) > this.f6959x;
    }

    /* JADX INFO: renamed from: w */
    private void m9330w() {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f6945j = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f6946k = viewConfiguration.getScaledTouchSlop();
        View view = new View(getContext());
        this.f6955t = view;
        view.setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f6955t.setAlpha(0.0f);
        this.f6955t.setVisibility(4);
        setFocusableInTouchMode(true);
        Point point = new Point();
        ((WindowManager) getContext().getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay().getSize(point);
        int i = point.x;
        this.f6961z = i;
        this.f6931D = i;
        this.f6960y = 0.0f;
        this.f6959x = point.y - (i / 1.7777778f);
    }

    /* JADX INFO: renamed from: x */
    private void m9331x() {
        this.f6943h = 0.0f;
        this.f6937b.set(0, 0, getWidth(), getHeight());
        getSheetView().setTranslationY(getHeight());
        this.f6955t.setAlpha(0.0f);
        this.f6955t.setVisibility(4);
    }

    /* JADX INFO: renamed from: y */
    private boolean m9332y() {
        return this.f6951p != null;
    }

    /* JADX INFO: renamed from: B */
    public void m9333B() {
        m9324o();
        setSheetLayerTypeIfEnabled(2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f6927I, getPeekSheetTranslation());
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(this.f6940e);
        objectAnimatorOfFloat.addListener(new C1743c());
        objectAnimatorOfFloat.start();
        this.f6951p = objectAnimatorOfFloat;
        setState(State.PEEKED);
    }

    /* JADX INFO: renamed from: C */
    public void m9334C(View view) {
        m9335D(view, null);
    }

    /* JADX INFO: renamed from: D */
    public void m9335D(View view, nml0 nml0Var) {
        if (this.f6938c != State.HIDDEN) {
            m9326r(new RunnableC1744d(view, nml0Var));
            return;
        }
        setState(State.PREPARING);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(this.f6928A ? -2 : -1, -2, 1);
        }
        if (this.f6928A && layoutParams.width == -2) {
            if (layoutParams.gravity == -1) {
                layoutParams.gravity = 1;
            }
            int i = this.f6929B;
            layoutParams.width = i;
            int i2 = this.f6961z;
            int i3 = (i2 - i) / 2;
            this.f6930C = i3;
            this.f6931D = i2 - i3;
        }
        super.addView(view, -1, layoutParams);
        m9331x();
        this.f6948m = nml0Var;
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC1745e());
        this.f6957v = view.getMeasuredHeight();
        ViewOnLayoutChangeListenerC1746f viewOnLayoutChangeListenerC1746f = new ViewOnLayoutChangeListenerC1746f();
        this.f6954s = viewOnLayoutChangeListenerC1746f;
        view.addOnLayoutChangeListener(viewOnLayoutChangeListenerC1746f);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view) {
        if (getChildCount() <= 0) {
            setContentView(view);
        } else {
            wg3.m206174a("You may not declare more then one child of bottom sheet. The sheet view must be added dynamically with showWithSheetView()");
        }
    }

    public View getContentView() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    public boolean getInterceptContentTouch() {
        return this.f6956u;
    }

    public float getMaxSheetTranslation() {
        return m9328u() ? getHeight() - getPaddingTop() : getSheetView().getHeight();
    }

    public boolean getPeekOnDismiss() {
        return this.f6939d;
    }

    public float getPeekSheetTranslation() {
        float f = this.f6960y;
        return f == 0.0f ? getDefaultPeekTranslation() : f;
    }

    public View getSheetView() {
        if (getChildCount() > 2) {
            return getChildAt(2);
        }
        return null;
    }

    public State getState() {
        return this.f6938c;
    }

    /* JADX INFO: renamed from: m */
    public void m9336m(@NonNull qn50 qn50Var) {
        m9325p(qn50Var, "onSheetDismissedListener == null");
        this.f6952q.add(qn50Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6944i = VelocityTracker.obtain();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6944i.clear();
        m9324o();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NonNull MotionEvent motionEvent) {
        boolean z = motionEvent.getActionMasked() == 0;
        if (z) {
            this.f6958w = false;
        }
        if (this.f6956u || (motionEvent.getY() > getHeight() - this.f6943h && m9309A(motionEvent.getX()))) {
            this.f6958w = z && m9339z();
        } else {
            this.f6958w = false;
        }
        return this.f6958w;
    }

    @Override // android.view.View
    public boolean onKeyPreIme(int i, @NonNull KeyEvent keyEvent) {
        if (i == 4 && m9339z()) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (m9339z() && keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    if (this.f6938c == State.EXPANDED && this.f6939d) {
                        m9333B();
                    } else {
                        m9337q();
                    }
                    return true;
                }
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f6937b.set(0, 0, getWidth(), (int) (((double) getHeight()) - Math.ceil(this.f6943h)));
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (!m9339z() || m9332y()) {
            return false;
        }
        if (!this.f6958w) {
            return onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            this.f6941f = false;
            this.f6942g = false;
            this.f6932E = motionEvent.getY();
            this.f6933F = motionEvent.getX();
            this.f6934G = this.f6943h;
            this.f6935H = this.f6938c;
            this.f6944i.clear();
        }
        this.f6944i.addMovement(motionEvent);
        float maxSheetTranslation = getMaxSheetTranslation();
        float peekSheetTranslation = getPeekSheetTranslation();
        float y = this.f6932E - motionEvent.getY();
        float x = this.f6933F - motionEvent.getX();
        if (!this.f6941f && !this.f6942g) {
            this.f6941f = Math.abs(y) > this.f6946k;
            this.f6942g = Math.abs(x) > this.f6946k;
            if (this.f6941f) {
                if (this.f6938c == State.PEEKED) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(0.0f, this.f6943h - getHeight());
                    motionEventObtain.setAction(3);
                    getSheetView().dispatchTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                this.f6942g = false;
                this.f6932E = motionEvent.getY();
                this.f6933F = motionEvent.getX();
                y = 0.0f;
            }
        }
        float fMin = this.f6934G + y;
        if (this.f6941f) {
            boolean z = y < 0.0f;
            boolean zM9323n = m9323n(getSheetView(), motionEvent.getX(), motionEvent.getY() + (this.f6943h - getHeight()));
            State state = this.f6938c;
            State state2 = State.EXPANDED;
            if (state == state2 && z && !zM9323n) {
                this.f6932E = motionEvent.getY();
                this.f6934G = this.f6943h;
                this.f6944i.clear();
                setState(State.PEEKED);
                setSheetLayerTypeIfEnabled(2);
                fMin = this.f6943h;
                MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                motionEventObtain2.setAction(3);
                getSheetView().dispatchTouchEvent(motionEventObtain2);
                motionEventObtain2.recycle();
            }
            if (this.f6938c == State.PEEKED && fMin > maxSheetTranslation) {
                setSheetTranslation(maxSheetTranslation);
                fMin = Math.min(maxSheetTranslation, fMin);
                MotionEvent motionEventObtain3 = MotionEvent.obtain(motionEvent);
                motionEventObtain3.setAction(0);
                getSheetView().dispatchTouchEvent(motionEventObtain3);
                motionEventObtain3.recycle();
                setState(state2);
                setSheetLayerTypeIfEnabled(0);
            }
            if (this.f6938c == state2) {
                motionEvent.offsetLocation(0.0f, this.f6943h - getHeight());
                getSheetView().dispatchTouchEvent(motionEvent);
            } else {
                if (fMin < peekSheetTranslation) {
                    fMin = peekSheetTranslation - ((peekSheetTranslation - fMin) / 4.0f);
                }
                setSheetTranslation(fMin);
                if (motionEvent.getAction() == 3) {
                    if (this.f6935H == state2) {
                        m9338s();
                    } else {
                        m9333B();
                    }
                }
                if (motionEvent.getAction() == 1) {
                    if (fMin < peekSheetTranslation) {
                        m9337q();
                    } else {
                        this.f6944i.computeCurrentVelocity(1000);
                        float yVelocity = this.f6944i.getYVelocity();
                        if (Math.abs(yVelocity) < this.f6945j) {
                            if (this.f6943h > getHeight() / 2) {
                                m9338s();
                            } else {
                                m9333B();
                            }
                        } else if (yVelocity < 0.0f) {
                            m9338s();
                        } else {
                            m9333B();
                        }
                    }
                }
            }
        } else {
            boolean z2 = motionEvent.getY() < ((float) getHeight()) - this.f6943h || !m9309A(motionEvent.getX());
            if (motionEvent.getAction() == 1 && z2 && this.f6956u) {
                m9337q();
                return true;
            }
            motionEvent.offsetLocation(this.f6928A ? getX() - this.f6930C : 0.0f, this.f6943h - getHeight());
            getSheetView().dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public void m9337q() {
        m9326r(null);
    }

    /* JADX INFO: renamed from: s */
    public void m9338s() {
        m9324o();
        setSheetLayerTypeIfEnabled(0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f6927I, getMaxSheetTranslation());
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(this.f6940e);
        objectAnimatorOfFloat.addListener(new C1742b());
        objectAnimatorOfFloat.start();
        this.f6951p = objectAnimatorOfFloat;
        setState(State.EXPANDED);
    }

    public void setContentView(View view) {
        super.addView(view, -1, generateDefaultLayoutParams());
        super.addView(this.f6955t, -1, generateDefaultLayoutParams());
    }

    public void setDefaultViewTransformer(nml0 nml0Var) {
        this.f6947l = nml0Var;
    }

    public void setInterceptContentTouch(boolean z) {
        this.f6956u = z;
    }

    public void setPeekOnDismiss(boolean z) {
        this.f6939d = z;
    }

    public void setPeekSheetTranslation(float f) {
        this.f6960y = f;
    }

    public void setShouldDimContentView(boolean z) {
        this.f6949n = z;
    }

    public void setUseHardwareLayerWhileAnimating(boolean z) {
        this.f6950o = z;
    }

    /* JADX INFO: renamed from: z */
    public boolean m9339z() {
        return this.f6938c != State.HIDDEN;
    }

    /* JADX INFO: renamed from: com.flipboard.bottomsheet.BottomSheetLayout$h */
    public static class C1748h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        protected boolean f6972a;

        private C1748h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6972a = true;
        }

        public /* synthetic */ C1748h(C1741a c1741a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.flipboard.bottomsheet.BottomSheetLayout$i */
    public static class C1749i extends os2 {
        private C1749i() {
        }

        @Override // p153l.nml0
        /* JADX INFO: renamed from: b */
        public void mo9342b(float f, float f2, float f3, BottomSheetLayout bottomSheetLayout, View view) {
        }

        public /* synthetic */ C1749i(C1741a c1741a) {
            this();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i) {
        addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i, @NonNull ViewGroup.LayoutParams layoutParams) {
        addView(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(@NonNull View view, @NonNull ViewGroup.LayoutParams layoutParams) {
        addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i, int i2) {
        addView(view);
    }

    public BottomSheetLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BottomSheetLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6937b = new Rect();
        this.f6938c = State.HIDDEN;
        this.f6939d = false;
        this.f6940e = new DecelerateInterpolator(1.6f);
        this.f6947l = new C1749i(null);
        this.f6949n = true;
        this.f6950o = true;
        this.f6952q = new CopyOnWriteArraySet<>();
        this.f6953r = new CopyOnWriteArraySet<>();
        this.f6956u = true;
        this.f6961z = 0;
        this.f6928A = getResources().getBoolean(w8c0.f187846a);
        this.f6929B = getResources().getDimensionPixelSize(nac0.f141001a);
        this.f6930C = 0;
        this.f6931D = 0;
        m9330w();
    }

    @TargetApi(21)
    public BottomSheetLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f6937b = new Rect();
        this.f6938c = State.HIDDEN;
        this.f6939d = false;
        this.f6940e = new DecelerateInterpolator(1.6f);
        this.f6947l = new C1749i(null);
        this.f6949n = true;
        this.f6950o = true;
        this.f6952q = new CopyOnWriteArraySet<>();
        this.f6953r = new CopyOnWriteArraySet<>();
        this.f6956u = true;
        this.f6961z = 0;
        this.f6928A = getResources().getBoolean(w8c0.f187846a);
        this.f6929B = getResources().getDimensionPixelSize(nac0.f141001a);
        this.f6930C = 0;
        this.f6931D = 0;
        m9330w();
    }
}
