package p149l;

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
public class ubl0 {

    /* JADX INFO: renamed from: w */
    public static final Interpolator f175706w = new InterpolatorC20401a();

    /* JADX INFO: renamed from: a */
    public int f175707a;

    /* JADX INFO: renamed from: b */
    public int f175708b;

    /* JADX INFO: renamed from: d */
    public float[] f175710d;

    /* JADX INFO: renamed from: e */
    public float[] f175711e;

    /* JADX INFO: renamed from: f */
    public float[] f175712f;

    /* JADX INFO: renamed from: g */
    public float[] f175713g;

    /* JADX INFO: renamed from: h */
    public int[] f175714h;

    /* JADX INFO: renamed from: i */
    public int[] f175715i;

    /* JADX INFO: renamed from: j */
    public int[] f175716j;

    /* JADX INFO: renamed from: k */
    public int f175717k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f175718l;

    /* JADX INFO: renamed from: m */
    public float f175719m;

    /* JADX INFO: renamed from: n */
    public float f175720n;

    /* JADX INFO: renamed from: o */
    public int f175721o;

    /* JADX INFO: renamed from: p */
    public int f175722p;

    /* JADX INFO: renamed from: q */
    public OverScroller f175723q;

    /* JADX INFO: renamed from: r */
    public final AbstractC20403c f175724r;

    /* JADX INFO: renamed from: s */
    public View f175725s;

    /* JADX INFO: renamed from: t */
    public boolean f175726t;

    /* JADX INFO: renamed from: u */
    public final ViewGroup f175727u;

    /* JADX INFO: renamed from: c */
    public int f175709c = -1;

    /* JADX INFO: renamed from: v */
    public final Runnable f175728v = new RunnableC20402b();

    /* JADX INFO: renamed from: l.ubl0$a */
    public static class InterpolatorC20401a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: l.ubl0$b */
    public class RunnableC20402b implements Runnable {
        public RunnableC20402b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ubl0.this.m192848L(0);
        }
    }

    public ubl0(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull AbstractC20403c abstractC20403c) {
        if (viewGroup == null) {
            ig3.m135964a("Parent view may not be null");
            throw null;
        }
        if (abstractC20403c == null) {
            ig3.m135964a("Callback may not be null");
            throw null;
        }
        this.f175727u = viewGroup;
        this.f175724r = abstractC20403c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f175721o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f175708b = viewConfiguration.getScaledTouchSlop();
        this.f175719m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f175720n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f175723q = new OverScroller(context, f175706w);
    }

    /* JADX INFO: renamed from: o */
    public static ubl0 m192835o(@NonNull ViewGroup viewGroup, float f, @NonNull AbstractC20403c abstractC20403c) {
        ubl0 ubl0VarM192836p = m192836p(viewGroup, abstractC20403c);
        ubl0VarM192836p.f175708b = (int) (ubl0VarM192836p.f175708b * (1.0f / f));
        return ubl0VarM192836p;
    }

    /* JADX INFO: renamed from: p */
    public static ubl0 m192836p(@NonNull ViewGroup viewGroup, @NonNull AbstractC20403c abstractC20403c) {
        return new ubl0(viewGroup.getContext(), viewGroup, abstractC20403c);
    }

    /* JADX INFO: renamed from: A */
    public int m192837A() {
        return this.f175707a;
    }

    /* JADX INFO: renamed from: B */
    public boolean m192838B(int i, int i2) {
        return m192842F(this.f175725s, i, i2);
    }

    /* JADX INFO: renamed from: C */
    public boolean m192839C(int i, int i2) {
        return m192840D(i2) && (this.f175714h[i2] & i) != 0;
    }

    /* JADX INFO: renamed from: D */
    public boolean m192840D(int i) {
        return (this.f175717k & (1 << i)) != 0;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m192841E(int i) {
        if (m192840D(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX INFO: renamed from: F */
    public boolean m192842F(@Nullable View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* JADX INFO: renamed from: G */
    public void m192843G(@NonNull MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m192856b();
        }
        if (this.f175718l == null) {
            this.f175718l = VelocityTracker.obtain();
        }
        this.f175718l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM192873u = m192873u((int) x, (int) y);
            m192846J(x, y, pointerId);
            m192854R(viewM192873u, pointerId);
            int i3 = this.f175714h[pointerId];
            int i4 = this.f175722p;
            if ((i3 & i4) != 0) {
                this.f175724r.onEdgeTouched(i3 & i4, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f175707a == 1) {
                m192844H();
            }
            m192856b();
            return;
        }
        if (actionMasked == 2) {
            if (this.f175707a == 1) {
                if (m192841E(this.f175709c)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f175709c);
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f175712f;
                    int i5 = this.f175709c;
                    int i6 = (int) (x2 - fArr[i5]);
                    int i7 = (int) (y2 - this.f175713g[i5]);
                    m192871s(this.f175725s.getLeft() + i6, this.f175725s.getTop() + i7, i6, i7);
                    m192847K(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i2 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i2);
                if (m192841E(pointerId2)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.f175710d[pointerId2];
                    float f2 = y3 - this.f175711e[pointerId2];
                    m192845I(f, f2, pointerId2);
                    if (this.f175707a != 1) {
                        View viewM192873u2 = m192873u((int) x3, (int) y3);
                        if (m192861g(viewM192873u2, f, f2) && m192854R(viewM192873u2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            m192847K(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f175707a == 1) {
                m192869q(0.0f, 0.0f);
            }
            m192856b();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x4 = motionEvent.getX(actionIndex);
            float y4 = motionEvent.getY(actionIndex);
            m192846J(x4, y4, pointerId3);
            if (this.f175707a != 0) {
                if (m192838B((int) x4, (int) y4)) {
                    m192854R(this.f175725s, pointerId3);
                    return;
                }
                return;
            } else {
                m192854R(m192873u((int) x4, (int) y4), pointerId3);
                int i8 = this.f175714h[pointerId3];
                int i9 = this.f175722p;
                if ((i8 & i9) != 0) {
                    this.f175724r.onEdgeTouched(i8 & i9, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f175707a == 1 && pointerId4 == this.f175709c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i2 >= pointerCount2) {
                    i = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i2);
                if (pointerId5 != this.f175709c) {
                    View viewM192873u3 = m192873u((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                    View view = this.f175725s;
                    if (viewM192873u3 == view && m192854R(view, pointerId5)) {
                        i = this.f175709c;
                        break;
                    }
                }
                i2++;
            }
            if (i == -1) {
                m192844H();
            }
        }
        m192865k(pointerId4);
    }

    /* JADX INFO: renamed from: H */
    public final void m192844H() {
        this.f175718l.computeCurrentVelocity(1000, this.f175719m);
        m192869q(m192862h(this.f175718l.getXVelocity(this.f175709c), this.f175720n, this.f175719m), m192862h(this.f175718l.getYVelocity(this.f175709c), this.f175720n, this.f175719m));
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
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ubl0$c] */
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
    public final void m192845I(float f, float f2, int i) {
        int i2;
        boolean zM192858d = m192858d(f, f2, i, 1);
        ?? r0 = zM192858d;
        if (m192858d(f2, f, i, 4)) {
            r0 = (zM192858d ? 1 : 0) | 4;
        }
        ?? r1 = r0;
        if (m192858d(f, f2, i, 2)) {
            r1 = (r0 == true ? 1 : 0) | 2;
        }
        ?? r2 = r1;
        if (m192858d(f2, f, i, 8)) {
            i2 = (r1 == true ? 1 : 0) | 8;
        }
        if (r2 == 0) {
            r2 = i2;
            return;
        }
        r2 = i2;
        int[] iArr = this.f175715i;
        iArr[i] = (iArr[i] | r2) == true ? 1 : 0;
        this.f175724r.onEdgeDragStarted(r2, i);
    }

    /* JADX INFO: renamed from: J */
    public final void m192846J(float f, float f2, int i) {
        m192872t(i);
        float[] fArr = this.f175710d;
        this.f175712f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f175711e;
        this.f175713g[i] = f2;
        fArr2[i] = f2;
        this.f175714h[i] = m192877y((int) f, (int) f2);
        this.f175717k |= 1 << i;
    }

    /* JADX INFO: renamed from: K */
    public final void m192847K(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m192841E(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f175712f[pointerId] = x;
                this.f175713g[pointerId] = y;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m192848L(int i) {
        this.f175727u.removeCallbacks(this.f175728v);
        if (this.f175707a != i) {
            this.f175707a = i;
            this.f175724r.onViewDragStateChanged(i);
            if (this.f175707a == 0) {
                this.f175725s = null;
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public void m192849M(int i) {
        this.f175722p = i;
    }

    /* JADX INFO: renamed from: N */
    public void m192850N(float f) {
        this.f175720n = f;
    }

    /* JADX INFO: renamed from: O */
    public boolean m192851O(int i, int i2) {
        if (this.f175726t) {
            return m192874v(i, i2, (int) this.f175718l.getXVelocity(this.f175709c), (int) this.f175718l.getYVelocity(this.f175709c));
        }
        qkq0.m175383a("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0101  */
    /* JADX INFO: renamed from: P */
    public boolean m192852P(@NonNull MotionEvent motionEvent) {
        View viewM192873u;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m192856b();
        }
        if (this.f175718l == null) {
            this.f175718l = VelocityTracker.obtain();
        }
        this.f175718l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            m192846J(x, y, pointerId);
            View viewM192873u2 = m192873u((int) x, (int) y);
            if (viewM192873u2 == this.f175725s && this.f175707a == 2) {
                m192854R(viewM192873u2, pointerId);
            }
            int i = this.f175714h[pointerId];
            int i2 = this.f175722p;
            if ((i & i2) != 0) {
                this.f175724r.onEdgeTouched(i & i2, pointerId);
            }
        } else if (actionMasked == 1) {
            m192856b();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                m192856b();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m192846J(x2, y2, pointerId2);
                int i3 = this.f175707a;
                if (i3 == 0) {
                    int i4 = this.f175714h[pointerId2];
                    int i5 = this.f175722p;
                    if ((i4 & i5) != 0) {
                        this.f175724r.onEdgeTouched(i4 & i5, pointerId2);
                    }
                } else if (i3 == 2 && (viewM192873u = m192873u((int) x2, (int) y2)) == this.f175725s) {
                    m192854R(viewM192873u, pointerId2);
                }
            } else if (actionMasked == 6) {
                m192865k(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f175710d != null && this.f175711e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i6 = 0; i6 < pointerCount; i6++) {
                int pointerId3 = motionEvent.getPointerId(i6);
                if (m192841E(pointerId3)) {
                    float x3 = motionEvent.getX(i6);
                    float y3 = motionEvent.getY(i6);
                    float f = x3 - this.f175710d[pointerId3];
                    float f2 = y3 - this.f175711e[pointerId3];
                    View viewM192873u3 = m192873u((int) x3, (int) y3);
                    boolean z = viewM192873u3 != null && m192861g(viewM192873u3, f, f2);
                    if (!z) {
                        m192845I(f, f2, pointerId3);
                        if (this.f175707a != 1) {
                            break;
                        }
                    } else {
                        int left = viewM192873u3.getLeft();
                        int i7 = (int) f;
                        int iClampViewPositionHorizontal = this.f175724r.clampViewPositionHorizontal(viewM192873u3, left + i7, i7);
                        int top = viewM192873u3.getTop();
                        int i8 = (int) f2;
                        int iClampViewPositionVertical = this.f175724r.clampViewPositionVertical(viewM192873u3, top + i8, i8);
                        int viewHorizontalDragRange = this.f175724r.getViewHorizontalDragRange(viewM192873u3);
                        int viewVerticalDragRange = this.f175724r.getViewVerticalDragRange(viewM192873u3);
                        if ((viewHorizontalDragRange == 0 || (viewHorizontalDragRange > 0 && iClampViewPositionHorizontal == left)) && (viewVerticalDragRange == 0 || (viewVerticalDragRange > 0 && iClampViewPositionVertical == top))) {
                            break;
                        }
                        m192845I(f, f2, pointerId3);
                        if (this.f175707a != 1 || (z && m192854R(viewM192873u3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            m192847K(motionEvent);
        }
        return this.f175707a == 1;
    }

    /* JADX INFO: renamed from: Q */
    public boolean m192853Q(@NonNull View view, int i, int i2) {
        this.f175725s = view;
        this.f175709c = -1;
        boolean zM192874v = m192874v(i, i2, 0, 0);
        if (!zM192874v && this.f175707a == 0 && this.f175725s != null) {
            this.f175725s = null;
        }
        return zM192874v;
    }

    /* JADX INFO: renamed from: R */
    public boolean m192854R(View view, int i) {
        if (view == this.f175725s && this.f175709c == i) {
            return true;
        }
        if (view == null || !this.f175724r.tryCaptureView(view, i)) {
            return false;
        }
        this.f175709c = i;
        m192857c(view, i);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m192855a() {
        m192856b();
        if (this.f175707a == 2) {
            int currX = this.f175723q.getCurrX();
            int currY = this.f175723q.getCurrY();
            this.f175723q.abortAnimation();
            int currX2 = this.f175723q.getCurrX();
            int currY2 = this.f175723q.getCurrY();
            this.f175724r.onViewPositionChanged(this.f175725s, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        m192848L(0);
    }

    /* JADX INFO: renamed from: b */
    public void m192856b() {
        this.f175709c = -1;
        m192864j();
        VelocityTracker velocityTracker = this.f175718l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f175718l = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m192857c(@NonNull View view, int i) {
        if (view.getParent() != this.f175727u) {
            all.m97315a("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (", this.f175727u, ")");
            return;
        }
        this.f175725s = view;
        this.f175709c = i;
        this.f175724r.onViewCaptured(view, i);
        m192848L(1);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m192858d(float f, float f2, int i, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.f175714h[i] & i2) == i2 && (this.f175722p & i2) != 0 && (this.f175716j[i] & i2) != i2 && (this.f175715i[i] & i2) != i2) {
            int i3 = this.f175708b;
            if (fAbs > i3 || fAbs2 > i3) {
                if (fAbs < fAbs2 * 0.5f && this.f175724r.onEdgeLock(i2)) {
                    int[] iArr = this.f175716j;
                    iArr[i] = iArr[i] | i2;
                    return false;
                }
                if ((this.f175715i[i] & i2) == 0 && fAbs > this.f175708b) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public boolean m192859e(int i) {
        int length = this.f175710d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (m192860f(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m192860f(int i, int i2) {
        if (!m192840D(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.f175712f[i2] - this.f175710d[i2];
        float f2 = this.f175713g[i2] - this.f175711e[i2];
        if (z && z2) {
            float f3 = (f * f) + (f2 * f2);
            int i3 = this.f175708b;
            return f3 > ((float) (i3 * i3));
        }
        if (z) {
            return Math.abs(f) > ((float) this.f175708b);
        }
        return z2 && Math.abs(f2) > ((float) this.f175708b);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m192861g(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f175724r.getViewHorizontalDragRange(view) > 0;
        boolean z2 = this.f175724r.getViewVerticalDragRange(view) > 0;
        if (z && z2) {
            float f3 = (f * f) + (f2 * f2);
            int i = this.f175708b;
            return f3 > ((float) (i * i));
        }
        if (z) {
            return Math.abs(f) > ((float) this.f175708b);
        }
        return z2 && Math.abs(f2) > ((float) this.f175708b);
    }

    /* JADX INFO: renamed from: h */
    public final float m192862h(float f, float f2, float f3) {
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
    public final int m192863i(int i, int i2, int i3) {
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
    public final void m192864j() {
        float[] fArr = this.f175710d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f175711e, 0.0f);
        Arrays.fill(this.f175712f, 0.0f);
        Arrays.fill(this.f175713g, 0.0f);
        Arrays.fill(this.f175714h, 0);
        Arrays.fill(this.f175715i, 0);
        Arrays.fill(this.f175716j, 0);
        this.f175717k = 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m192865k(int i) {
        if (this.f175710d == null || !m192840D(i)) {
            return;
        }
        this.f175710d[i] = 0.0f;
        this.f175711e[i] = 0.0f;
        this.f175712f[i] = 0.0f;
        this.f175713g[i] = 0.0f;
        this.f175714h[i] = 0;
        this.f175715i[i] = 0;
        this.f175716j[i] = 0;
        this.f175717k = (~(1 << i)) & this.f175717k;
    }

    /* JADX INFO: renamed from: l */
    public final int m192866l(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f175727u.getWidth();
        float f = width / 2;
        float fM192870r = f + (m192870r(Math.min(1.0f, Math.abs(i) / width)) * f);
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fM192870r / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* JADX INFO: renamed from: m */
    public final int m192867m(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int iM192863i = m192863i(i3, (int) this.f175720n, (int) this.f175719m);
        int iM192863i2 = m192863i(i4, (int) this.f175720n, (int) this.f175719m);
        int iAbs = Math.abs(i);
        int iAbs2 = Math.abs(i2);
        int iAbs3 = Math.abs(iM192863i);
        int iAbs4 = Math.abs(iM192863i2);
        int i5 = iAbs3 + iAbs4;
        int i6 = iAbs + iAbs2;
        if (iM192863i != 0) {
            f = iAbs3;
            f2 = i5;
        } else {
            f = iAbs;
            f2 = i6;
        }
        float f5 = f / f2;
        if (iM192863i2 != 0) {
            f3 = iAbs4;
            f4 = i5;
        } else {
            f3 = iAbs2;
            f4 = i6;
        }
        return (int) ((m192866l(i, iM192863i, this.f175724r.getViewHorizontalDragRange(view)) * f5) + (m192866l(i2, iM192863i2, this.f175724r.getViewVerticalDragRange(view)) * (f3 / f4)));
    }

    /* JADX INFO: renamed from: n */
    public boolean m192868n(boolean z) {
        if (this.f175707a == 2) {
            boolean zComputeScrollOffset = this.f175723q.computeScrollOffset();
            int currX = this.f175723q.getCurrX();
            int currY = this.f175723q.getCurrY();
            int left = currX - this.f175725s.getLeft();
            int top = currY - this.f175725s.getTop();
            if (left != 0) {
                gbl0.m125176U(this.f175725s, left);
            }
            if (top != 0) {
                gbl0.m125177V(this.f175725s, top);
            }
            if (left != 0 || top != 0) {
                this.f175724r.onViewPositionChanged(this.f175725s, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f175723q.getFinalX() && currY == this.f175723q.getFinalY()) {
                this.f175723q.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z) {
                    this.f175727u.post(this.f175728v);
                } else {
                    m192848L(0);
                }
            }
        }
        return this.f175707a == 2;
    }

    /* JADX INFO: renamed from: q */
    public final void m192869q(float f, float f2) {
        this.f175726t = true;
        this.f175724r.onViewReleased(this.f175725s, f, f2);
        this.f175726t = false;
        if (this.f175707a == 1) {
            m192848L(0);
        }
    }

    /* JADX INFO: renamed from: r */
    public final float m192870r(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    /* JADX INFO: renamed from: s */
    public final void m192871s(int i, int i2, int i3, int i4) {
        int left = this.f175725s.getLeft();
        int top = this.f175725s.getTop();
        if (i3 != 0) {
            i = this.f175724r.clampViewPositionHorizontal(this.f175725s, i, i3);
            gbl0.m125176U(this.f175725s, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f175724r.clampViewPositionVertical(this.f175725s, i2, i4);
            gbl0.m125177V(this.f175725s, i2 - top);
        }
        int i6 = i2;
        if (i3 == 0 && i4 == 0) {
            return;
        }
        this.f175724r.onViewPositionChanged(this.f175725s, i5, i6, i5 - left, i6 - top);
    }

    /* JADX INFO: renamed from: t */
    public final void m192872t(int i) {
        float[] fArr = this.f175710d;
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
                float[] fArr6 = this.f175711e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f175712f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f175713g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f175714h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f175715i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f175716j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f175710d = fArr2;
            this.f175711e = fArr3;
            this.f175712f = fArr4;
            this.f175713g = fArr5;
            this.f175714h = iArr;
            this.f175715i = iArr2;
            this.f175716j = iArr3;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public View m192873u(int i, int i2) {
        for (int childCount = this.f175727u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f175727u.getChildAt(this.f175724r.getOrderedChildIndex(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m192874v(int i, int i2, int i3, int i4) {
        int left = this.f175725s.getLeft();
        int top = this.f175725s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f175723q.abortAnimation();
            m192848L(0);
            return false;
        }
        this.f175723q.startScroll(left, top, i5, i6, m192867m(this.f175725s, i5, i6, i3, i4));
        m192848L(2);
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public View m192875w() {
        return this.f175725s;
    }

    @Px
    /* JADX INFO: renamed from: x */
    public int m192876x() {
        return this.f175721o;
    }

    /* JADX INFO: renamed from: y */
    public final int m192877y(int i, int i2) {
        int i3 = i < this.f175727u.getLeft() + this.f175721o ? 1 : 0;
        if (i2 < this.f175727u.getTop() + this.f175721o) {
            i3 |= 4;
        }
        if (i > this.f175727u.getRight() - this.f175721o) {
            i3 |= 2;
        }
        return i2 > this.f175727u.getBottom() - this.f175721o ? i3 | 8 : i3;
    }

    @Px
    /* JADX INFO: renamed from: z */
    public int m192878z() {
        return this.f175708b;
    }

    /* JADX INFO: renamed from: l.ubl0$c */
    public static abstract class AbstractC20403c {
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
