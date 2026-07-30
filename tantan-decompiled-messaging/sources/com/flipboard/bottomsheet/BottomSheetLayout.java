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
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p149l.g2c0;
import p149l.ig3;
import p149l.jdl0;
import p149l.jfd0;
import p149l.kf50;
import p149l.r0c0;
import p149l.yr2;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes6.dex */
public class BottomSheetLayout extends FrameLayout {

    /* JADX INFO: renamed from: I */
    private static final Property<BottomSheetLayout, Float> f6890I = new C1718a(Float.class, "sheetTranslation");

    /* JADX INFO: renamed from: A */
    private final boolean f6891A;

    /* JADX INFO: renamed from: B */
    private final int f6892B;

    /* JADX INFO: renamed from: C */
    private int f6893C;

    /* JADX INFO: renamed from: D */
    private int f6894D;

    /* JADX INFO: renamed from: E */
    private float f6895E;

    /* JADX INFO: renamed from: F */
    private float f6896F;

    /* JADX INFO: renamed from: G */
    private float f6897G;

    /* JADX INFO: renamed from: H */
    private State f6898H;

    /* JADX INFO: renamed from: a */
    private Runnable f6899a;

    /* JADX INFO: renamed from: b */
    private Rect f6900b;

    /* JADX INFO: renamed from: c */
    private State f6901c;

    /* JADX INFO: renamed from: d */
    private boolean f6902d;

    /* JADX INFO: renamed from: e */
    private TimeInterpolator f6903e;

    /* JADX INFO: renamed from: f */
    public boolean f6904f;

    /* JADX INFO: renamed from: g */
    private boolean f6905g;

    /* JADX INFO: renamed from: h */
    private float f6906h;

    /* JADX INFO: renamed from: i */
    private VelocityTracker f6907i;

    /* JADX INFO: renamed from: j */
    private float f6908j;

    /* JADX INFO: renamed from: k */
    private float f6909k;

    /* JADX INFO: renamed from: l */
    private jdl0 f6910l;

    /* JADX INFO: renamed from: m */
    private jdl0 f6911m;

    /* JADX INFO: renamed from: n */
    private boolean f6912n;

    /* JADX INFO: renamed from: o */
    private boolean f6913o;

    /* JADX INFO: renamed from: p */
    private Animator f6914p;

    /* JADX INFO: renamed from: q */
    private CopyOnWriteArraySet<kf50> f6915q;

    /* JADX INFO: renamed from: r */
    private CopyOnWriteArraySet<InterfaceC1727j> f6916r;

    /* JADX INFO: renamed from: s */
    private View.OnLayoutChangeListener f6917s;

    /* JADX INFO: renamed from: t */
    private View f6918t;

    /* JADX INFO: renamed from: u */
    private boolean f6919u;

    /* JADX INFO: renamed from: v */
    private int f6920v;

    /* JADX INFO: renamed from: w */
    private boolean f6921w;

    /* JADX INFO: renamed from: x */
    private float f6922x;

    /* JADX INFO: renamed from: y */
    private float f6923y;

    /* JADX INFO: renamed from: z */
    private int f6924z;

    public enum State {
        HIDDEN,
        PREPARING,
        PEEKED,
        EXPANDED
    }

    /* JADX INFO: renamed from: com.flipboard.bottomsheet.BottomSheetLayout$a */
    public static class C1718a extends Property<BottomSheetLayout, Float> {
        public C1718a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(BottomSheetLayout bottomSheetLayout) {
            return Float.valueOf(bottomSheetLayout.f6906h);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(BottomSheetLayout bottomSheetLayout, Float f) {
            bottomSheetLayout.setSheetTranslation(f.floatValue());
        }
    }

    /* JADX INFO: renamed from: com.flipboard.bottomsheet.BottomSheetLayout$b */
    public class C1719b extends C1725h {
        public C1719b() {
            super(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            if (this.f6935a) {
                return;
            }
            BottomSheetLayout.this.f6914p = null;
        }
    }

    /* JADX INFO: renamed from: com.flipboard.bottomsheet.BottomSheetLayout$c */
    public class C1720c extends C1725h {
        public C1720c() {
            super(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            if (this.f6935a) {
                return;
            }
            BottomSheetLayout.this.f6914p = null;
        }
    }

    /* JADX INFO: renamed from: com.flipboard.bottomsheet.BottomSheetLayout$d */
    public class RunnableC1721d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f6927a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ jdl0 f6928b;

        public RunnableC1721d(View view, jdl0 jdl0Var) {
            this.f6927a = view;
            this.f6928b = jdl0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetLayout.this.m9281D(this.f6927a, this.f6928b);
        }
    }

    /* JADX INFO: renamed from: com.flipboard.bottomsheet.BottomSheetLayout$e */
    public class ViewTreeObserverOnPreDrawListenerC1722e implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: com.flipboard.bottomsheet.BottomSheetLayout$e$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BottomSheetLayout.this.getSheetView() != null) {
                    BottomSheetLayout.this.m9279B();
                }
            }
        }

        public ViewTreeObserverOnPreDrawListenerC1722e() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            BottomSheetLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
            BottomSheetLayout.this.post(new a());
            return true;
        }
    }

    /* JADX INFO: renamed from: com.flipboard.bottomsheet.BottomSheetLayout$f */
    public class ViewOnLayoutChangeListenerC1723f implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC1723f() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int measuredHeight = view.getMeasuredHeight();
            if (BottomSheetLayout.this.f6901c != State.HIDDEN) {
                int i9 = BottomSheetLayout.this.f6920v;
                BottomSheetLayout bottomSheetLayout = BottomSheetLayout.this;
                if (measuredHeight < i9) {
                    if (bottomSheetLayout.f6901c == State.EXPANDED) {
                        BottomSheetLayout.this.setState(State.PEEKED);
                    }
                    BottomSheetLayout.this.setSheetTranslation(measuredHeight);
                } else if (bottomSheetLayout.f6920v > 0 && measuredHeight > BottomSheetLayout.this.f6920v && BottomSheetLayout.this.f6901c == State.PEEKED) {
                    float f = measuredHeight;
                    if (f == BottomSheetLayout.this.getMaxSheetTranslation()) {
                        BottomSheetLayout.this.setState(State.EXPANDED);
                    }
                    BottomSheetLayout.this.setSheetTranslation(f);
                }
            }
            BottomSheetLayout.this.f6920v = measuredHeight;
        }
    }

    /* JADX INFO: renamed from: com.flipboard.bottomsheet.BottomSheetLayout$g */
    public class C1724g extends C1725h {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f6933b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1724g(View view) {
            super(null);
            this.f6933b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f6935a) {
                return;
            }
            BottomSheetLayout.this.f6914p = null;
            BottomSheetLayout.this.setState(State.HIDDEN);
            BottomSheetLayout.this.setSheetLayerTypeIfEnabled(0);
            BottomSheetLayout.this.removeView(this.f6933b);
            Iterator it = BottomSheetLayout.this.f6915q.iterator();
            while (it.hasNext()) {
                ((kf50) it.next()).mo103724a(BottomSheetLayout.this);
            }
            BottomSheetLayout.this.f6911m = null;
            if (BottomSheetLayout.this.f6899a != null) {
                BottomSheetLayout.this.f6899a.run();
                BottomSheetLayout.this.f6899a = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.flipboard.bottomsheet.BottomSheetLayout$j */
    public interface InterfaceC1727j {
        /* JADX INFO: renamed from: a */
        void m9289a(State state);
    }

    public BottomSheetLayout(Context context) {
        super(context);
        this.f6900b = new Rect();
        this.f6901c = State.HIDDEN;
        this.f6902d = false;
        this.f6903e = new DecelerateInterpolator(1.6f);
        this.f6910l = new C1726i(null);
        this.f6912n = true;
        this.f6913o = true;
        this.f6915q = new CopyOnWriteArraySet<>();
        this.f6916r = new CopyOnWriteArraySet<>();
        this.f6919u = true;
        this.f6924z = 0;
        this.f6891A = getResources().getBoolean(r0c0.f157163a);
        this.f6892B = getResources().getDimensionPixelSize(g2c0.f100256a);
        this.f6893C = 0;
        this.f6894D = 0;
        m9276w();
    }

    /* JADX INFO: renamed from: A */
    private boolean m9255A(float f) {
        if (this.f6891A) {
            return f >= ((float) this.f6893C) && f <= ((float) this.f6894D);
        }
        return true;
    }

    /* JADX INFO: renamed from: E */
    private void m9256E(float f) {
        jdl0 jdl0Var = this.f6911m;
        if (jdl0Var != null) {
            jdl0Var.mo9288b(f, getMaxSheetTranslation(), getPeekSheetTranslation(), this, getContentView());
            return;
        }
        jdl0 jdl0Var2 = this.f6910l;
        if (jdl0Var2 != null) {
            jdl0Var2.mo9288b(f, getMaxSheetTranslation(), getPeekSheetTranslation(), this, getContentView());
        }
    }

    private float getDefaultPeekTranslation() {
        return m9275v() ? this.f6922x : getSheetView().getHeight();
    }

    /* JADX INFO: renamed from: n */
    private boolean m9269n(View view, float f, float f2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                int left = childAt.getLeft() - view.getScrollX();
                int top = childAt.getTop() - view.getScrollY();
                int right = childAt.getRight() - view.getScrollX();
                int bottom = childAt.getBottom() - view.getScrollY();
                float f3 = left;
                if (f > f3 && f < right && f2 > top && f2 < bottom && m9269n(childAt, f - f3, f2 - top)) {
                    return true;
                }
            }
        }
        return view.canScrollVertically(-1);
    }

    /* JADX INFO: renamed from: o */
    private void m9270o() {
        Animator animator = this.f6914p;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: p */
    private static <T> T m9271p(T t, String str) {
        if (t != null) {
            return t;
        }
        jfd0.m141176a(str);
        return null;
    }

    /* JADX INFO: renamed from: r */
    private void m9272r(Runnable runnable) {
        if (this.f6901c == State.HIDDEN) {
            this.f6899a = null;
            return;
        }
        this.f6899a = runnable;
        View sheetView = getSheetView();
        sheetView.removeOnLayoutChangeListener(this.f6917s);
        m9270o();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f6890I, 0.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(this.f6903e);
        objectAnimatorOfFloat.addListener(new C1724g(sheetView));
        objectAnimatorOfFloat.start();
        this.f6914p = objectAnimatorOfFloat;
        this.f6893C = 0;
        this.f6894D = this.f6924z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSheetLayerTypeIfEnabled(int i) {
        if (this.f6913o) {
            getSheetView().setLayerType(i, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSheetTranslation(float f) {
        this.f6906h = Math.min(f, getMaxSheetTranslation());
        this.f6900b.set(0, 0, getWidth(), (int) (((double) getHeight()) - Math.ceil(this.f6906h)));
        getSheetView().setTranslationY(getHeight() - this.f6906h);
        m9256E(this.f6906h);
        if (this.f6912n) {
            float fM9273t = m9273t(this.f6906h);
            this.f6918t.setAlpha(fM9273t);
            this.f6918t.setVisibility(fM9273t <= 0.0f ? 4 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(State state) {
        if (state != this.f6901c) {
            this.f6901c = state;
            Iterator<InterfaceC1727j> it = this.f6916r.iterator();
            while (it.hasNext()) {
                it.next().m9289a(state);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    private float m9273t(float f) {
        jdl0 jdl0Var = this.f6911m;
        if (jdl0Var != null) {
            return jdl0Var.mo141038a(f, getMaxSheetTranslation(), getPeekSheetTranslation(), this, getContentView());
        }
        jdl0 jdl0Var2 = this.f6910l;
        if (jdl0Var2 != null) {
            return jdl0Var2.mo141038a(f, getMaxSheetTranslation(), getPeekSheetTranslation(), this, getContentView());
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: u */
    private boolean m9274u() {
        return getSheetView() == null || getSheetView().getHeight() == getHeight();
    }

    /* JADX INFO: renamed from: v */
    private boolean m9275v() {
        return getSheetView() == null || ((float) getSheetView().getHeight()) > this.f6922x;
    }

    /* JADX INFO: renamed from: w */
    private void m9276w() {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f6908j = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f6909k = viewConfiguration.getScaledTouchSlop();
        View view = new View(getContext());
        this.f6918t = view;
        view.setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f6918t.setAlpha(0.0f);
        this.f6918t.setVisibility(4);
        setFocusableInTouchMode(true);
        Point point = new Point();
        ((WindowManager) getContext().getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay().getSize(point);
        int i = point.x;
        this.f6924z = i;
        this.f6894D = i;
        this.f6923y = 0.0f;
        this.f6922x = point.y - (i / 1.7777778f);
    }

    /* JADX INFO: renamed from: x */
    private void m9277x() {
        this.f6906h = 0.0f;
        this.f6900b.set(0, 0, getWidth(), getHeight());
        getSheetView().setTranslationY(getHeight());
        this.f6918t.setAlpha(0.0f);
        this.f6918t.setVisibility(4);
    }

    /* JADX INFO: renamed from: y */
    private boolean m9278y() {
        return this.f6914p != null;
    }

    /* JADX INFO: renamed from: B */
    public void m9279B() {
        m9270o();
        setSheetLayerTypeIfEnabled(2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f6890I, getPeekSheetTranslation());
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(this.f6903e);
        objectAnimatorOfFloat.addListener(new C1720c());
        objectAnimatorOfFloat.start();
        this.f6914p = objectAnimatorOfFloat;
        setState(State.PEEKED);
    }

    /* JADX INFO: renamed from: C */
    public void m9280C(View view) {
        m9281D(view, null);
    }

    /* JADX INFO: renamed from: D */
    public void m9281D(View view, jdl0 jdl0Var) {
        if (this.f6901c != State.HIDDEN) {
            m9272r(new RunnableC1721d(view, jdl0Var));
            return;
        }
        setState(State.PREPARING);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(this.f6891A ? -2 : -1, -2, 1);
        }
        if (this.f6891A && layoutParams.width == -2) {
            if (layoutParams.gravity == -1) {
                layoutParams.gravity = 1;
            }
            int i = this.f6892B;
            layoutParams.width = i;
            int i2 = this.f6924z;
            int i3 = (i2 - i) / 2;
            this.f6893C = i3;
            this.f6894D = i2 - i3;
        }
        super.addView(view, -1, layoutParams);
        m9277x();
        this.f6911m = jdl0Var;
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC1722e());
        this.f6920v = view.getMeasuredHeight();
        ViewOnLayoutChangeListenerC1723f viewOnLayoutChangeListenerC1723f = new ViewOnLayoutChangeListenerC1723f();
        this.f6917s = viewOnLayoutChangeListenerC1723f;
        view.addOnLayoutChangeListener(viewOnLayoutChangeListenerC1723f);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view) {
        if (getChildCount() <= 0) {
            setContentView(view);
        } else {
            ig3.m135964a("You may not declare more then one child of bottom sheet. The sheet view must be added dynamically with showWithSheetView()");
        }
    }

    public View getContentView() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    public boolean getInterceptContentTouch() {
        return this.f6919u;
    }

    public float getMaxSheetTranslation() {
        return m9274u() ? getHeight() - getPaddingTop() : getSheetView().getHeight();
    }

    public boolean getPeekOnDismiss() {
        return this.f6902d;
    }

    public float getPeekSheetTranslation() {
        float f = this.f6923y;
        return f == 0.0f ? getDefaultPeekTranslation() : f;
    }

    public View getSheetView() {
        if (getChildCount() > 2) {
            return getChildAt(2);
        }
        return null;
    }

    public State getState() {
        return this.f6901c;
    }

    /* JADX INFO: renamed from: m */
    public void m9282m(@NonNull kf50 kf50Var) {
        m9271p(kf50Var, "onSheetDismissedListener == null");
        this.f6915q.add(kf50Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6907i = VelocityTracker.obtain();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6907i.clear();
        m9270o();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NonNull MotionEvent motionEvent) {
        boolean z = motionEvent.getActionMasked() == 0;
        if (z) {
            this.f6921w = false;
        }
        if (this.f6919u || (motionEvent.getY() > getHeight() - this.f6906h && m9255A(motionEvent.getX()))) {
            this.f6921w = z && m9285z();
        } else {
            this.f6921w = false;
        }
        return this.f6921w;
    }

    @Override // android.view.View
    public boolean onKeyPreIme(int i, @NonNull KeyEvent keyEvent) {
        if (i == 4 && m9285z()) {
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
                if (m9285z() && keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    if (this.f6901c == State.EXPANDED && this.f6902d) {
                        m9279B();
                    } else {
                        m9283q();
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
        this.f6900b.set(0, 0, getWidth(), (int) (((double) getHeight()) - Math.ceil(this.f6906h)));
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (!m9285z() || m9278y()) {
            return false;
        }
        if (!this.f6921w) {
            return onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            this.f6904f = false;
            this.f6905g = false;
            this.f6895E = motionEvent.getY();
            this.f6896F = motionEvent.getX();
            this.f6897G = this.f6906h;
            this.f6898H = this.f6901c;
            this.f6907i.clear();
        }
        this.f6907i.addMovement(motionEvent);
        float maxSheetTranslation = getMaxSheetTranslation();
        float peekSheetTranslation = getPeekSheetTranslation();
        float y = this.f6895E - motionEvent.getY();
        float x = this.f6896F - motionEvent.getX();
        if (!this.f6904f && !this.f6905g) {
            this.f6904f = Math.abs(y) > this.f6909k;
            this.f6905g = Math.abs(x) > this.f6909k;
            if (this.f6904f) {
                if (this.f6901c == State.PEEKED) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(0.0f, this.f6906h - getHeight());
                    motionEventObtain.setAction(3);
                    getSheetView().dispatchTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                this.f6905g = false;
                this.f6895E = motionEvent.getY();
                this.f6896F = motionEvent.getX();
                y = 0.0f;
            }
        }
        float fMin = this.f6897G + y;
        if (this.f6904f) {
            boolean z = y < 0.0f;
            boolean zM9269n = m9269n(getSheetView(), motionEvent.getX(), motionEvent.getY() + (this.f6906h - getHeight()));
            State state = this.f6901c;
            State state2 = State.EXPANDED;
            if (state == state2 && z && !zM9269n) {
                this.f6895E = motionEvent.getY();
                this.f6897G = this.f6906h;
                this.f6907i.clear();
                setState(State.PEEKED);
                setSheetLayerTypeIfEnabled(2);
                fMin = this.f6906h;
                MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                motionEventObtain2.setAction(3);
                getSheetView().dispatchTouchEvent(motionEventObtain2);
                motionEventObtain2.recycle();
            }
            if (this.f6901c == State.PEEKED && fMin > maxSheetTranslation) {
                setSheetTranslation(maxSheetTranslation);
                fMin = Math.min(maxSheetTranslation, fMin);
                MotionEvent motionEventObtain3 = MotionEvent.obtain(motionEvent);
                motionEventObtain3.setAction(0);
                getSheetView().dispatchTouchEvent(motionEventObtain3);
                motionEventObtain3.recycle();
                setState(state2);
                setSheetLayerTypeIfEnabled(0);
            }
            if (this.f6901c == state2) {
                motionEvent.offsetLocation(0.0f, this.f6906h - getHeight());
                getSheetView().dispatchTouchEvent(motionEvent);
            } else {
                if (fMin < peekSheetTranslation) {
                    fMin = peekSheetTranslation - ((peekSheetTranslation - fMin) / 4.0f);
                }
                setSheetTranslation(fMin);
                if (motionEvent.getAction() == 3) {
                    if (this.f6898H == state2) {
                        m9284s();
                    } else {
                        m9279B();
                    }
                }
                if (motionEvent.getAction() == 1) {
                    if (fMin < peekSheetTranslation) {
                        m9283q();
                    } else {
                        this.f6907i.computeCurrentVelocity(1000);
                        float yVelocity = this.f6907i.getYVelocity();
                        if (Math.abs(yVelocity) < this.f6908j) {
                            if (this.f6906h > getHeight() / 2) {
                                m9284s();
                            } else {
                                m9279B();
                            }
                        } else if (yVelocity < 0.0f) {
                            m9284s();
                        } else {
                            m9279B();
                        }
                    }
                }
            }
        } else {
            boolean z2 = motionEvent.getY() < ((float) getHeight()) - this.f6906h || !m9255A(motionEvent.getX());
            if (motionEvent.getAction() == 1 && z2 && this.f6919u) {
                m9283q();
                return true;
            }
            motionEvent.offsetLocation(this.f6891A ? getX() - this.f6893C : 0.0f, this.f6906h - getHeight());
            getSheetView().dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public void m9283q() {
        m9272r(null);
    }

    /* JADX INFO: renamed from: s */
    public void m9284s() {
        m9270o();
        setSheetLayerTypeIfEnabled(0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f6890I, getMaxSheetTranslation());
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(this.f6903e);
        objectAnimatorOfFloat.addListener(new C1719b());
        objectAnimatorOfFloat.start();
        this.f6914p = objectAnimatorOfFloat;
        setState(State.EXPANDED);
    }

    public void setContentView(View view) {
        super.addView(view, -1, generateDefaultLayoutParams());
        super.addView(this.f6918t, -1, generateDefaultLayoutParams());
    }

    public void setDefaultViewTransformer(jdl0 jdl0Var) {
        this.f6910l = jdl0Var;
    }

    public void setInterceptContentTouch(boolean z) {
        this.f6919u = z;
    }

    public void setPeekOnDismiss(boolean z) {
        this.f6902d = z;
    }

    public void setPeekSheetTranslation(float f) {
        this.f6923y = f;
    }

    public void setShouldDimContentView(boolean z) {
        this.f6912n = z;
    }

    public void setUseHardwareLayerWhileAnimating(boolean z) {
        this.f6913o = z;
    }

    /* JADX INFO: renamed from: z */
    public boolean m9285z() {
        return this.f6901c != State.HIDDEN;
    }

    /* JADX INFO: renamed from: com.flipboard.bottomsheet.BottomSheetLayout$h */
    public static class C1725h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        protected boolean f6935a;

        private C1725h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6935a = true;
        }

        public /* synthetic */ C1725h(C1718a c1718a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.flipboard.bottomsheet.BottomSheetLayout$i */
    public static class C1726i extends yr2 {
        private C1726i() {
        }

        @Override // p149l.jdl0
        /* JADX INFO: renamed from: b */
        public void mo9288b(float f, float f2, float f3, BottomSheetLayout bottomSheetLayout, View view) {
        }

        public /* synthetic */ C1726i(C1718a c1718a) {
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
        this.f6900b = new Rect();
        this.f6901c = State.HIDDEN;
        this.f6902d = false;
        this.f6903e = new DecelerateInterpolator(1.6f);
        this.f6910l = new C1726i(null);
        this.f6912n = true;
        this.f6913o = true;
        this.f6915q = new CopyOnWriteArraySet<>();
        this.f6916r = new CopyOnWriteArraySet<>();
        this.f6919u = true;
        this.f6924z = 0;
        this.f6891A = getResources().getBoolean(r0c0.f157163a);
        this.f6892B = getResources().getDimensionPixelSize(g2c0.f100256a);
        this.f6893C = 0;
        this.f6894D = 0;
        m9276w();
    }

    @TargetApi(21)
    public BottomSheetLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f6900b = new Rect();
        this.f6901c = State.HIDDEN;
        this.f6902d = false;
        this.f6903e = new DecelerateInterpolator(1.6f);
        this.f6910l = new C1726i(null);
        this.f6912n = true;
        this.f6913o = true;
        this.f6915q = new CopyOnWriteArraySet<>();
        this.f6916r = new CopyOnWriteArraySet<>();
        this.f6919u = true;
        this.f6924z = 0;
        this.f6891A = getResources().getBoolean(r0c0.f157163a);
        this.f6892B = getResources().getDimensionPixelSize(g2c0.f100256a);
        this.f6893C = 0;
        this.f6894D = 0;
        m9276w();
    }
}
