package p153l;

import android.animation.ValueAnimator;
import android.util.LongSparseArray;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.p058ui.messages.recycler.wrap.MessageRecyclerView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m900 extends i3z<Message> implements Choreographer.FrameCallback, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: i */
    public static long f135313i = 350000000;

    /* JADX INFO: renamed from: j */
    public static boolean f135314j = true;

    /* JADX INFO: renamed from: c */
    public MessageRecyclerView f135315c;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f135316d;

    /* JADX INFO: renamed from: e */
    public boolean f135317e = true;

    /* JADX INFO: renamed from: f */
    public LongSparseArray<prc0> f135318f = new LongSparseArray<>();

    /* JADX INFO: renamed from: g */
    public LongSparseArray<lo0> f135319g = new LongSparseArray<>();

    /* JADX INFO: renamed from: h */
    public Runnable f135320h = new RunnableC18570b();

    /* JADX INFO: renamed from: l.m900$a */
    public class C18569a extends RecyclerView.AbstractC0573i {

        /* JADX INFO: renamed from: l.m900$a$a */
        public class a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a */
            public boolean f135322a = false;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ViewTreeObserver f135323b;

            public a(ViewTreeObserver viewTreeObserver) {
                this.f135323b = viewTreeObserver;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (!this.f135322a) {
                    this.f135322a = true;
                    try {
                        if (this.f135323b.isAlive()) {
                            this.f135323b.removeOnPreDrawListener(this);
                        }
                    } catch (Exception unused) {
                    }
                    m900.this.m157540X();
                }
                return true;
            }
        }

        public C18569a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onChanged() {
            super.onChanged();
            m900.this.m157535Q();
            ViewTreeObserver viewTreeObserver = m900.this.f135315c.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new a(viewTreeObserver));
        }
    }

    /* JADX INFO: renamed from: l.m900$b */
    public class RunnableC18570b implements Runnable {
        public RunnableC18570b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NullChecker.m82486a(m900.this.f135316d)) {
                m900.this.f135316d.cancel();
                m900.this.f135316d = null;
            }
            int childCount = m900.this.f135315c.getChildCount();
            while (true) {
                childCount--;
                m900 m900Var = m900.this;
                if (childCount < 0) {
                    m900Var.f135317e = false;
                    return;
                } else {
                    View childAt = m900Var.f135315c.getChildAt(childCount);
                    if (NullChecker.m82486a(childAt)) {
                        m900.this.m157532N(childAt);
                    }
                }
            }
        }
    }

    public m900(MessageRecyclerView messageRecyclerView) {
        this.f135315c = messageRecyclerView;
        setHasStableIds(true);
        m157530W();
    }

    /* JADX INFO: renamed from: W */
    private void m157530W() {
        registerAdapterDataObserver(new C18569a());
    }

    /* JADX INFO: renamed from: M */
    public final float m157531M(float f, int i, View view) {
        if (view != null) {
            view.setPivotY(view.getHeight());
            view.setAlpha(f);
            view.setScaleY(f);
            view.setScaleX(f);
        }
        float f2 = i * f;
        if (f2 < 0.0f) {
            return 0.0f;
        }
        return f2;
    }

    /* JADX INFO: renamed from: N */
    public final void m157532N(View view) {
        if (view != null) {
            view.setScaleY(1.0f);
            view.setScaleX(1.0f);
            view.setAlpha(1.0f);
            view.setRotation(0.0f);
            view.setRotationY(0.0f);
            view.setTranslationY(0.0f);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m157533O() {
        Message messageMo139045V;
        prc0 prc0Var;
        int childCount = this.f135315c.getChildCount();
        int iM157539U = m157539U();
        if (this.f135319g.size() > 0) {
            LongSparseArray<lo0> longSparseArray = new LongSparseArray<>();
            boolean z = false;
            for (int i = 0; i < this.f135319g.size(); i++) {
                lo0 lo0VarValueAt = this.f135319g.valueAt(i);
                if (lo0VarValueAt.m155035a()) {
                    longSparseArray.put(this.f135319g.keyAt(i), lo0VarValueAt);
                } else {
                    lo0VarValueAt.m155036c();
                    z = true;
                }
            }
            if (z) {
                this.f135319g.clear();
                this.f135319g = longSparseArray;
            }
        }
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            View childAt = this.f135315c.getChildAt(i2);
            if (childAt != null && (messageMo139045V = mo139045V(m157538T(childAt))) != null && (prc0Var = this.f135318f.get(messageMo139045V._id)) != null) {
                int top = childAt.getTop();
                lo0 lo0Var = this.f135319g.get(messageMo139045V._id);
                if (lo0Var != null) {
                    int i3 = prc0Var.f153749b - top;
                    lo0Var.f132867e = messageMo139045V._id;
                    lo0Var.f132865c += i3;
                    lo0Var.f132864b = System.nanoTime() + f135313i;
                    lo0Var.f132866d = (lo0Var.f132866d + prc0Var.f153751d) - iM157539U;
                } else {
                    lo0 lo0VarM155034b = lo0.m155034b();
                    lo0VarM155034b.f132867e = messageMo139045V._id;
                    lo0VarM155034b.f132865c = prc0Var.f153749b - top;
                    lo0VarM155034b.f132864b = System.nanoTime() + f135313i;
                    lo0VarM155034b.f132866d = prc0Var.f153751d - iM157539U;
                    this.f135319g.put(messageMo139045V._id, lo0VarM155034b);
                }
            }
        }
        m157536R();
    }

    /* JADX INFO: renamed from: P */
    public float m157534P(float f, int i) {
        lo0 lo0Var;
        Message messageMo139045V = mo139045V(i);
        if (messageMo139045V != null && (lo0Var = this.f135319g.get(messageMo139045V._id)) != null && System.nanoTime() < lo0Var.f132864b) {
            int i2 = lo0Var.f132865c;
            int i3 = lo0Var.f132866d;
            if (f > i2 + i3) {
                return i2 + i3;
            }
        }
        return f;
    }

    /* JADX INFO: renamed from: Q */
    public final void m157535Q() {
        int iM157538T;
        Message messageMo139045V;
        int firstVisiblePosition = this.f135315c.getFirstVisiblePosition();
        int lastVisiblePosition = this.f135315c.getLastVisiblePosition();
        int childCount = this.f135315c.getChildCount();
        int iM157539U = m157539U();
        m157536R();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = this.f135315c.getChildAt(i);
            if (childAt != null && (iM157538T = m157538T(childAt)) >= firstVisiblePosition && iM157538T <= lastVisiblePosition && iM157538T < getItemCount() && iM157538T >= 0 && (messageMo139045V = mo139045V(iM157538T)) != null) {
                prc0 prc0VarM173430c = prc0.m173430c();
                prc0VarM173430c.m173431a(childAt.getTop()).m173433d(messageMo139045V._id).m173435f(iM157539U);
                this.f135318f.put(prc0VarM173430c.m173432b(), prc0VarM173430c);
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m157536R() {
        if (this.f135318f.size() <= 0) {
            return;
        }
        int size = this.f135318f.size();
        int i = 0;
        while (true) {
            LongSparseArray<prc0> longSparseArray = this.f135318f;
            if (i >= size) {
                longSparseArray.clear();
                return;
            } else {
                longSparseArray.valueAt(i).m173434e();
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009a  */
    /* JADX INFO: renamed from: S */
    public final void m157537S() {
        long jNanoTime = System.nanoTime();
        int firstVisiblePosition = this.f135315c.getFirstVisiblePosition();
        int lastVisiblePosition = this.f135315c.getLastVisiblePosition();
        int itemCount = getItemCount() - 1;
        float f = 0.0f;
        int i = 0;
        float fM157531M = 0.0f;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            View childAt = null;
            if (itemCount < Math.max(getItemCount() - 20, i)) {
                break;
            }
            Message messageMo139045V = mo139045V(itemCount);
            if (itemCount >= firstVisiblePosition && itemCount <= lastVisiblePosition) {
                childAt = this.f135315c.getChildAt(((this.f135315c.getChildCount() - lastVisiblePosition) + itemCount) - 1);
            }
            if (childAt != null) {
                m157532N(childAt);
                childAt.setTranslationY(Math.round(Math.max(f, m157534P(fM157531M, itemCount))));
            }
            if (messageMo139045V == null || z2) {
                z2 = true;
            } else {
                long j = messageMo139045V.localCreatedTime;
                if (j <= 0 || jNanoTime < j) {
                    z2 = true;
                } else {
                    long j2 = f135313i;
                    if (j + j2 >= jNanoTime) {
                        fM157531M += messageMo139045V.viewHeight - m157531M(((jNanoTime - j) * 1.0f) / j2, messageMo139045V.viewHeight, childAt);
                        if (!this.f135317e) {
                            this.f135317e = true;
                            l51.m152888H(this.f135315c.getContext(), this.f135320h, f135313i / 1000000);
                        }
                        z = true;
                    } else {
                        z2 = true;
                    }
                }
            }
            itemCount--;
            f = 0.0f;
            i = 0;
        }
        if (!f135314j) {
            if (z) {
                Choreographer.getInstance().postFrameCallback(this);
                return;
            } else {
                Choreographer.getInstance().removeFrameCallback(this);
                return;
            }
        }
        if (z || !NullChecker.m82486a(this.f135316d)) {
            return;
        }
        this.f135316d.cancel();
        this.f135316d = null;
        if (this.f135317e) {
            l51.m152890J(this.f135320h);
            this.f135317e = false;
        }
    }

    /* JADX INFO: renamed from: T */
    public final int m157538T(View view) {
        if (view != null && (view.getLayoutParams() instanceof RecyclerView.C0580p)) {
            return ((RecyclerView.C0580p) view.getLayoutParams()).m3418c();
        }
        return -1;
    }

    /* JADX INFO: renamed from: U */
    public final int m157539U() {
        int[] iArr = new int[2];
        this.f135315c.getLocationOnScreen(iArr);
        return iArr[1];
    }

    /* JADX INFO: renamed from: V */
    public abstract Message mo139045V(int i);

    /* JADX INFO: renamed from: X */
    public final void m157540X() {
        if (this.f135315c.getChildCount() == 0) {
            return;
        }
        boolean z = false;
        for (int childCount = this.f135315c.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f135315c.getChildAt(childCount);
            if (NullChecker.m82486a(childAt)) {
                m157532N(childAt);
            }
            int iM157538T = m157538T(childAt);
            if (iM157538T >= 0) {
                Message messageMo139045V = mo139045V(iM157538T);
                if (NullChecker.m82486a(messageMo139045V)) {
                    messageMo139045V.viewHeight = childAt.getHeight();
                    if (messageMo139045V.localCreatedTime > 0 && System.nanoTime() - messageMo139045V.localCreatedTime < f135313i) {
                        z = true;
                    }
                }
            }
        }
        m157533O();
        if (!f135314j) {
            if (!z) {
                Choreographer.getInstance().removeFrameCallback(this);
                return;
            } else {
                m157537S();
                Choreographer.getInstance().postFrameCallback(this);
                return;
            }
        }
        if (z) {
            m157537S();
            if (this.f135316d == null) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f135316d = valueAnimatorOfFloat;
                valueAnimatorOfFloat.setDuration(10000000L);
                this.f135316d.addUpdateListener(this);
                this.f135316d.start();
            }
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        m157537S();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        m157537S();
    }
}
