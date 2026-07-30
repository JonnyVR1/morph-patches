package p153l;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class ykl0 {

    /* JADX INFO: renamed from: w */
    public static final Interpolator f200403w = new InterpolatorC21617a();

    /* JADX INFO: renamed from: a */
    public int f200404a;

    /* JADX INFO: renamed from: b */
    public int f200405b;

    /* JADX INFO: renamed from: d */
    public float[] f200407d;

    /* JADX INFO: renamed from: e */
    public float[] f200408e;

    /* JADX INFO: renamed from: f */
    public float[] f200409f;

    /* JADX INFO: renamed from: g */
    public float[] f200410g;

    /* JADX INFO: renamed from: h */
    public int[] f200411h;

    /* JADX INFO: renamed from: i */
    public int[] f200412i;

    /* JADX INFO: renamed from: j */
    public int[] f200413j;

    /* JADX INFO: renamed from: k */
    public int f200414k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f200415l;

    /* JADX INFO: renamed from: m */
    public float f200416m;

    /* JADX INFO: renamed from: n */
    public float f200417n;

    /* JADX INFO: renamed from: o */
    public int f200418o;

    /* JADX INFO: renamed from: p */
    public int f200419p;

    /* JADX INFO: renamed from: q */
    public OverScroller f200420q;

    /* JADX INFO: renamed from: r */
    public final AbstractC21619c f200421r;

    /* JADX INFO: renamed from: s */
    public View f200422s;

    /* JADX INFO: renamed from: t */
    public boolean f200423t;

    /* JADX INFO: renamed from: u */
    public final ViewGroup f200424u;

    /* JADX INFO: renamed from: c */
    public int f200406c = -1;

    /* JADX INFO: renamed from: v */
    public final Runnable f200425v = new RunnableC21618b();

    /* JADX INFO: renamed from: l.ykl0$a */
    public static class InterpolatorC21617a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: l.ykl0$b */
    public class RunnableC21618b implements Runnable {
        public RunnableC21618b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ykl0.this.m216496L(0);
        }
    }

    public ykl0(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull AbstractC21619c abstractC21619c) {
        if (viewGroup == null) {
            wg3.m206174a("Parent view may not be null");
            throw null;
        }
        if (abstractC21619c == null) {
            wg3.m206174a("Callback may not be null");
            throw null;
        }
        this.f200424u = viewGroup;
        this.f200421r = abstractC21619c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f200418o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f200405b = viewConfiguration.getScaledTouchSlop();
        this.f200416m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f200417n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f200420q = new OverScroller(context, f200403w);
    }

    /* JADX INFO: renamed from: o */
    public static ykl0 m216483o(@NonNull ViewGroup viewGroup, float f, @NonNull AbstractC21619c abstractC21619c) {
        ykl0 ykl0VarM216484p = m216484p(viewGroup, abstractC21619c);
        ykl0VarM216484p.f200405b = (int) (ykl0VarM216484p.f200405b * (1.0f / f));
        return ykl0VarM216484p;
    }

    /* JADX INFO: renamed from: p */
    public static ykl0 m216484p(@NonNull ViewGroup viewGroup, @NonNull AbstractC21619c abstractC21619c) {
        return new ykl0(viewGroup.getContext(), viewGroup, abstractC21619c);
    }

    /* JADX INFO: renamed from: A */
    public int m216485A() {
        return this.f200404a;
    }

    /* JADX INFO: renamed from: B */
    public boolean m216486B(int i, int i2) {
        return m216490F(this.f200422s, i, i2);
    }

    /* JADX INFO: renamed from: C */
    public boolean m216487C(int i, int i2) {
        return m216488D(i2) && (this.f200411h[i2] & i) != 0;
    }

    /* JADX INFO: renamed from: D */
    public boolean m216488D(int i) {
        return (this.f200414k & (1 << i)) != 0;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m216489E(int i) {
        if (m216488D(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX INFO: renamed from: F */
    public boolean m216490F(@Nullable View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* JADX INFO: renamed from: G */
    public void m216491G(@NonNull MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m216504b();
        }
        if (this.f200415l == null) {
            this.f200415l = VelocityTracker.obtain();
        }
        this.f200415l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM216521u = m216521u((int) x, (int) y);
            m216494J(x, y, pointerId);
            m216502R(viewM216521u, pointerId);
            int i3 = this.f200411h[pointerId];
            int i4 = this.f200419p;
            if ((i3 & i4) != 0) {
                this.f200421r.onEdgeTouched(i3 & i4, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f200404a == 1) {
                m216492H();
            }
            m216504b();
            return;
        }
        if (actionMasked == 2) {
            if (this.f200404a == 1) {
                if (m216489E(this.f200406c)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f200406c);
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f200409f;
                    int i5 = this.f200406c;
                    int i6 = (int) (x2 - fArr[i5]);
                    int i7 = (int) (y2 - this.f200410g[i5]);
                    m216519s(this.f200422s.getLeft() + i6, this.f200422s.getTop() + i7, i6, i7);
                    m216495K(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i2 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i2);
                if (m216489E(pointerId2)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.f200407d[pointerId2];
                    float f2 = y3 - this.f200408e[pointerId2];
                    m216493I(f, f2, pointerId2);
                    if (this.f200404a != 1) {
                        View viewM216521u2 = m216521u((int) x3, (int) y3);
                        if (m216509g(viewM216521u2, f, f2) && m216502R(viewM216521u2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            m216495K(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f200404a == 1) {
                m216517q(0.0f, 0.0f);
            }
            m216504b();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x4 = motionEvent.getX(actionIndex);
            float y4 = motionEvent.getY(actionIndex);
            m216494J(x4, y4, pointerId3);
            if (this.f200404a != 0) {
                if (m216486B((int) x4, (int) y4)) {
                    m216502R(this.f200422s, pointerId3);
                    return;
                }
                return;
            } else {
                m216502R(m216521u((int) x4, (int) y4), pointerId3);
                int i8 = this.f200411h[pointerId3];
                int i9 = this.f200419p;
                if ((i8 & i9) != 0) {
                    this.f200421r.onEdgeTouched(i8 & i9, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f200404a == 1 && pointerId4 == this.f200406c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i2 >= pointerCount2) {
                    i = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i2);
                if (pointerId5 != this.f200406c) {
                    View viewM216521u3 = m216521u((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                    View view = this.f200422s;
                    if (viewM216521u3 == view && m216502R(view, pointerId5)) {
                        i = this.f200406c;
                        break;
                    }
                }
                i2++;
            }
            if (i == -1) {
                m216492H();
            }
        }
        m216513k(pointerId4);
    }

    /* JADX INFO: renamed from: H */
    public final void m216492H() {
        this.f200415l.computeCurrentVelocity(1000, this.f200416m);
        m216517q(m216510h(this.f200415l.getXVelocity(this.f200406c), this.f200417n, this.f200416m), m216510h(this.f200415l.getYVelocity(this.f200406c), this.f200417n, this.f200416m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ykl0$c] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: I */
    public final void m216493I(float f, float f2, int i) {
        int i2;
        boolean zM216506d = m216506d(f, f2, i, 1);
        ?? r0 = zM216506d;
        if (m216506d(f2, f, i, 4)) {
            r0 = (zM216506d ? 1 : 0) | 4;
        }
        ?? r1 = r0;
        if (m216506d(f, f2, i, 2)) {
            r1 = (r0 == true ? 1 : 0) | 2;
        }
        ?? r2 = r1;
        if (m216506d(f2, f, i, 8)) {
            i2 = (r1 == true ? 1 : 0) | 8;
        }
        if (r2 == 0) {
            r2 = i2;
            return;
        }
        r2 = i2;
        int[] iArr = this.f200412i;
        iArr[i] = (iArr[i] | r2) == true ? 1 : 0;
        this.f200421r.onEdgeDragStarted(r2, i);
    }

    /* JADX INFO: renamed from: J */
    public final void m216494J(float f, float f2, int i) {
        m216520t(i);
        float[] fArr = this.f200407d;
        this.f200409f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f200408e;
        this.f200410g[i] = f2;
        fArr2[i] = f2;
        this.f200411h[i] = m216525y((int) f, (int) f2);
        this.f200414k |= 1 << i;
    }

    /* JADX INFO: renamed from: K */
    public final void m216495K(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m216489E(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f200409f[pointerId] = x;
                this.f200410g[pointerId] = y;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m216496L(int i) {
        this.f200424u.removeCallbacks(this.f200425v);
        if (this.f200404a != i) {
            this.f200404a = i;
            this.f200421r.onViewDragStateChanged(i);
            if (this.f200404a == 0) {
                this.f200422s = null;
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public void m216497M(int i) {
        this.f200419p = i;
    }

    /* JADX INFO: renamed from: N */
    public void m216498N(float f) {
        this.f200417n = f;
    }

    /* JADX INFO: renamed from: O */
    public boolean m216499O(int i, int i2) {
        if (this.f200423t) {
            return m216522v(i, i2, (int) this.f200415l.getXVelocity(this.f200406c), (int) this.f200415l.getYVelocity(this.f200406c));
        }
        wtq0.m207906a("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0101  */
    /* JADX INFO: renamed from: P */
    public boolean m216500P(@NonNull MotionEvent motionEvent) {
        View viewM216521u;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m216504b();
        }
        if (this.f200415l == null) {
            this.f200415l = VelocityTracker.obtain();
        }
        this.f200415l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            m216494J(x, y, pointerId);
            View viewM216521u2 = m216521u((int) x, (int) y);
            if (viewM216521u2 == this.f200422s && this.f200404a == 2) {
                m216502R(viewM216521u2, pointerId);
            }
            int i = this.f200411h[pointerId];
            int i2 = this.f200419p;
            if ((i & i2) != 0) {
                this.f200421r.onEdgeTouched(i & i2, pointerId);
            }
        } else if (actionMasked == 1) {
            m216504b();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                m216504b();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m216494J(x2, y2, pointerId2);
                int i3 = this.f200404a;
                if (i3 == 0) {
                    int i4 = this.f200411h[pointerId2];
                    int i5 = this.f200419p;
                    if ((i4 & i5) != 0) {
                        this.f200421r.onEdgeTouched(i4 & i5, pointerId2);
                    }
                } else if (i3 == 2 && (viewM216521u = m216521u((int) x2, (int) y2)) == this.f200422s) {
                    m216502R(viewM216521u, pointerId2);
                }
            } else if (actionMasked == 6) {
                m216513k(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f200407d != null && this.f200408e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i6 = 0; i6 < pointerCount; i6++) {
                int pointerId3 = motionEvent.getPointerId(i6);
                if (m216489E(pointerId3)) {
                    float x3 = motionEvent.getX(i6);
                    float y3 = motionEvent.getY(i6);
                    float f = x3 - this.f200407d[pointerId3];
                    float f2 = y3 - this.f200408e[pointerId3];
                    View viewM216521u3 = m216521u((int) x3, (int) y3);
                    boolean z = viewM216521u3 != null && m216509g(viewM216521u3, f, f2);
                    if (!z) {
                        m216493I(f, f2, pointerId3);
                        if (this.f200404a != 1) {
                            break;
                        }
                    } else {
                        int left = viewM216521u3.getLeft();
                        int i7 = (int) f;
                        int iClampViewPositionHorizontal = this.f200421r.clampViewPositionHorizontal(viewM216521u3, left + i7, i7);
                        int top = viewM216521u3.getTop();
                        int i8 = (int) f2;
                        int iClampViewPositionVertical = this.f200421r.clampViewPositionVertical(viewM216521u3, top + i8, i8);
                        int viewHorizontalDragRange = this.f200421r.getViewHorizontalDragRange(viewM216521u3);
                        int viewVerticalDragRange = this.f200421r.getViewVerticalDragRange(viewM216521u3);
                        if ((viewHorizontalDragRange == 0 || (viewHorizontalDragRange > 0 && iClampViewPositionHorizontal == left)) && (viewVerticalDragRange == 0 || (viewVerticalDragRange > 0 && iClampViewPositionVertical == top))) {
                            break;
                        }
                        m216493I(f, f2, pointerId3);
                        if (this.f200404a != 1 || (z && m216502R(viewM216521u3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            m216495K(motionEvent);
        }
        return this.f200404a == 1;
    }

    /* JADX INFO: renamed from: Q */
    public boolean m216501Q(@NonNull View view, int i, int i2) {
        this.f200422s = view;
        this.f200406c = -1;
        boolean zM216522v = m216522v(i, i2, 0, 0);
        if (!zM216522v && this.f200404a == 0 && this.f200422s != null) {
            this.f200422s = null;
        }
        return zM216522v;
    }

    /* JADX INFO: renamed from: R */
    public boolean m216502R(View view, int i) {
        if (view == this.f200422s && this.f200406c == i) {
            return true;
        }
        if (view == null || !this.f200421r.tryCaptureView(view, i)) {
            return false;
        }
        this.f200406c = i;
        m216505c(view, i);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m216503a() {
        m216504b();
        if (this.f200404a == 2) {
            int currX = this.f200420q.getCurrX();
            int currY = this.f200420q.getCurrY();
            this.f200420q.abortAnimation();
            int currX2 = this.f200420q.getCurrX();
            int currY2 = this.f200420q.getCurrY();
            this.f200421r.onViewPositionChanged(this.f200422s, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        m216496L(0);
    }

    /* JADX INFO: renamed from: b */
    public void m216504b() {
        this.f200406c = -1;
        m216512j();
        VelocityTracker velocityTracker = this.f200415l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f200415l = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m216505c(@NonNull View view, int i) {
        if (view.getParent() != this.f200424u) {
            pnl.m173070a("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (", this.f200424u, ")");
            return;
        }
        this.f200422s = view;
        this.f200406c = i;
        this.f200421r.onViewCaptured(view, i);
        m216496L(1);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m216506d(float f, float f2, int i, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.f200411h[i] & i2) == i2 && (this.f200419p & i2) != 0 && (this.f200413j[i] & i2) != i2 && (this.f200412i[i] & i2) != i2) {
            int i3 = this.f200405b;
            if (fAbs > i3 || fAbs2 > i3) {
                if (fAbs < fAbs2 * 0.5f && this.f200421r.onEdgeLock(i2)) {
                    int[] iArr = this.f200413j;
                    iArr[i] = iArr[i] | i2;
                    return false;
                }
                if ((this.f200412i[i] & i2) == 0 && fAbs > this.f200405b) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public boolean m216507e(int i) {
        int length = this.f200407d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (m216508f(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m216508f(int i, int i2) {
        if (!m216488D(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.f200409f[i2] - this.f200407d[i2];
        float f2 = this.f200410g[i2] - this.f200408e[i2];
        if (z && z2) {
            float f3 = (f * f) + (f2 * f2);
            int i3 = this.f200405b;
            return f3 > ((float) (i3 * i3));
        }
        if (z) {
            return Math.abs(f) > ((float) this.f200405b);
        }
        return z2 && Math.abs(f2) > ((float) this.f200405b);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m216509g(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f200421r.getViewHorizontalDragRange(view) > 0;
        boolean z2 = this.f200421r.getViewVerticalDragRange(view) > 0;
        if (z && z2) {
            float f3 = (f * f) + (f2 * f2);
            int i = this.f200405b;
            return f3 > ((float) (i * i));
        }
        if (z) {
            return Math.abs(f) > ((float) this.f200405b);
        }
        return z2 && Math.abs(f2) > ((float) this.f200405b);
    }

    /* JADX INFO: renamed from: h */
    public final float m216510h(float f, float f2, float f3) {
        float fAbs = Math.abs(f);
        if (fAbs < f2) {
            return 0.0f;
        }
        if (fAbs > f3) {
            return f > 0.0f ? f3 : -f3;
        }
        return f;
    }

    /* JADX INFO: renamed from: i */
    public final int m216511i(int i, int i2, int i3) {
        int iAbs = Math.abs(i);
        if (iAbs < i2) {
            return 0;
        }
        if (iAbs > i3) {
            return i > 0 ? i3 : -i3;
        }
        return i;
    }

    /* JADX INFO: renamed from: j */
    public final void m216512j() {
        float[] fArr = this.f200407d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f200408e, 0.0f);
        Arrays.fill(this.f200409f, 0.0f);
        Arrays.fill(this.f200410g, 0.0f);
        Arrays.fill(this.f200411h, 0);
        Arrays.fill(this.f200412i, 0);
        Arrays.fill(this.f200413j, 0);
        this.f200414k = 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m216513k(int i) {
        if (this.f200407d == null || !m216488D(i)) {
            return;
        }
        this.f200407d[i] = 0.0f;
        this.f200408e[i] = 0.0f;
        this.f200409f[i] = 0.0f;
        this.f200410g[i] = 0.0f;
        this.f200411h[i] = 0;
        this.f200412i[i] = 0;
        this.f200413j[i] = 0;
        this.f200414k = (~(1 << i)) & this.f200414k;
    }

    /* JADX INFO: renamed from: l */
    public final int m216514l(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f200424u.getWidth();
        float f = width / 2;
        float fM216518r = f + (m216518r(Math.min(1.0f, Math.abs(i) / width)) * f);
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fM216518r / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* JADX INFO: renamed from: m */
    public final int m216515m(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int iM216511i = m216511i(i3, (int) this.f200417n, (int) this.f200416m);
        int iM216511i2 = m216511i(i4, (int) this.f200417n, (int) this.f200416m);
        int iAbs = Math.abs(i);
        int iAbs2 = Math.abs(i2);
        int iAbs3 = Math.abs(iM216511i);
        int iAbs4 = Math.abs(iM216511i2);
        int i5 = iAbs3 + iAbs4;
        int i6 = iAbs + iAbs2;
        if (iM216511i != 0) {
            f = iAbs3;
            f2 = i5;
        } else {
            f = iAbs;
            f2 = i6;
        }
        float f5 = f / f2;
        if (iM216511i2 != 0) {
            f3 = iAbs4;
            f4 = i5;
        } else {
            f3 = iAbs2;
            f4 = i6;
        }
        return (int) ((m216514l(i, iM216511i, this.f200421r.getViewHorizontalDragRange(view)) * f5) + (m216514l(i2, iM216511i2, this.f200421r.getViewVerticalDragRange(view)) * (f3 / f4)));
    }

    /* JADX INFO: renamed from: n */
    public boolean m216516n(boolean z) {
        if (this.f200404a == 2) {
            boolean zComputeScrollOffset = this.f200420q.computeScrollOffset();
            int currX = this.f200420q.getCurrX();
            int currY = this.f200420q.getCurrY();
            int left = currX - this.f200422s.getLeft();
            int top = currY - this.f200422s.getTop();
            if (left != 0) {
                kkl0.m150139U(this.f200422s, left);
            }
            if (top != 0) {
                kkl0.m150140V(this.f200422s, top);
            }
            if (left != 0 || top != 0) {
                this.f200421r.onViewPositionChanged(this.f200422s, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f200420q.getFinalX() && currY == this.f200420q.getFinalY()) {
                this.f200420q.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z) {
                    this.f200424u.post(this.f200425v);
                } else {
                    m216496L(0);
                }
            }
        }
        return this.f200404a == 2;
    }

    /* JADX INFO: renamed from: q */
    public final void m216517q(float f, float f2) {
        this.f200423t = true;
        this.f200421r.onViewReleased(this.f200422s, f, f2);
        this.f200423t = false;
        if (this.f200404a == 1) {
            m216496L(0);
        }
    }

    /* JADX INFO: renamed from: r */
    public final float m216518r(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    /* JADX INFO: renamed from: s */
    public final void m216519s(int i, int i2, int i3, int i4) {
        int left = this.f200422s.getLeft();
        int top = this.f200422s.getTop();
        if (i3 != 0) {
            i = this.f200421r.clampViewPositionHorizontal(this.f200422s, i, i3);
            kkl0.m150139U(this.f200422s, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f200421r.clampViewPositionVertical(this.f200422s, i2, i4);
            kkl0.m150140V(this.f200422s, i2 - top);
        }
        int i6 = i2;
        if (i3 == 0 && i4 == 0) {
            return;
        }
        this.f200421r.onViewPositionChanged(this.f200422s, i5, i6, i5 - left, i6 - top);
    }

    /* JADX INFO: renamed from: t */
    public final void m216520t(int i) {
        float[] fArr = this.f200407d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f200408e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f200409f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f200410g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f200411h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f200412i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f200413j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f200407d = fArr2;
            this.f200408e = fArr3;
            this.f200409f = fArr4;
            this.f200410g = fArr5;
            this.f200411h = iArr;
            this.f200412i = iArr2;
            this.f200413j = iArr3;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public View m216521u(int i, int i2) {
        for (int childCount = this.f200424u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f200424u.getChildAt(this.f200421r.getOrderedChildIndex(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m216522v(int i, int i2, int i3, int i4) {
        int left = this.f200422s.getLeft();
        int top = this.f200422s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f200420q.abortAnimation();
            m216496L(0);
            return false;
        }
        this.f200420q.startScroll(left, top, i5, i6, m216515m(this.f200422s, i5, i6, i3, i4));
        m216496L(2);
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public View m216523w() {
        return this.f200422s;
    }

    @Px
    /* JADX INFO: renamed from: x */
    public int m216524x() {
        return this.f200418o;
    }

    /* JADX INFO: renamed from: y */
    public final int m216525y(int i, int i2) {
        int i3 = i < this.f200424u.getLeft() + this.f200418o ? 1 : 0;
        if (i2 < this.f200424u.getTop() + this.f200418o) {
            i3 |= 4;
        }
        if (i > this.f200424u.getRight() - this.f200418o) {
            i3 |= 2;
        }
        return i2 > this.f200424u.getBottom() - this.f200418o ? i3 | 8 : i3;
    }

    @Px
    /* JADX INFO: renamed from: z */
    public int m216526z() {
        return this.f200405b;
    }

    /* JADX INFO: renamed from: l.ykl0$c */
    public static abstract class AbstractC21619c {
        public int clampViewPositionHorizontal(@NonNull View view, int i, int i2) {
            return 0;
        }

        public int clampViewPositionVertical(@NonNull View view, int i, int i2) {
            return 0;
        }

        public int getViewHorizontalDragRange(@NonNull View view) {
            return 0;
        }

        public int getViewVerticalDragRange(@NonNull View view) {
            return 0;
        }

        public boolean onEdgeLock(int i) {
            return false;
        }

        public abstract boolean tryCaptureView(@NonNull View view, int i);

        public int getOrderedChildIndex(int i) {
            return i;
        }

        public void onViewDragStateChanged(int i) {
        }

        public void onEdgeDragStarted(int i, int i2) {
        }

        public void onEdgeTouched(int i, int i2) {
        }

        public void onViewCaptured(@NonNull View view, int i) {
        }

        public void onViewReleased(@NonNull View view, float f, float f2) {
        }

        public void onViewPositionChanged(@NonNull View view, int i, int i2, @Px int i3, @Px int i4) {
        }
    }
}
