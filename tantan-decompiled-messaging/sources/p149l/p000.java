package p149l;

import android.animation.ValueAnimator;
import android.util.LongSparseArray;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.p053ui.messages.recycler.wrap.MessageRecyclerView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p000 extends luy<Message> implements Choreographer.FrameCallback, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: i */
    public static long f146522i = 350000000;

    /* JADX INFO: renamed from: j */
    public static boolean f146523j = true;

    /* JADX INFO: renamed from: c */
    public MessageRecyclerView f146524c;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f146525d;

    /* JADX INFO: renamed from: e */
    public boolean f146526e = true;

    /* JADX INFO: renamed from: f */
    public LongSparseArray<ijc0> f146527f = new LongSparseArray<>();

    /* JADX INFO: renamed from: g */
    public LongSparseArray<po0> f146528g = new LongSparseArray<>();

    /* JADX INFO: renamed from: h */
    public Runnable f146529h = new RunnableC19090b();

    /* JADX INFO: renamed from: l.p000$a */
    public class C19089a extends RecyclerView.AbstractC0571i {

        /* JADX INFO: renamed from: l.p000$a$a */
        public class a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a */
            public boolean f146531a = false;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ViewTreeObserver f146532b;

            public a(ViewTreeObserver viewTreeObserver) {
                this.f146532b = viewTreeObserver;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (!this.f146531a) {
                    this.f146531a = true;
                    try {
                        if (this.f146532b.isAlive()) {
                            this.f146532b.removeOnPreDrawListener(this);
                        }
                    } catch (Exception unused) {
                    }
                    p000.this.m166909X();
                }
                return true;
            }
        }

        public C19089a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onChanged() {
            super.onChanged();
            p000.this.m166904Q();
            ViewTreeObserver viewTreeObserver = p000.this.f146524c.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new a(viewTreeObserver));
        }
    }

    /* JADX INFO: renamed from: l.p000$b */
    public class RunnableC19090b implements Runnable {
        public RunnableC19090b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NullChecker.m81303a(p000.this.f146525d)) {
                p000.this.f146525d.cancel();
                p000.this.f146525d = null;
            }
            int childCount = p000.this.f146524c.getChildCount();
            while (true) {
                childCount--;
                p000 p000Var = p000.this;
                if (childCount < 0) {
                    p000Var.f146526e = false;
                    return;
                } else {
                    View childAt = p000Var.f146524c.getChildAt(childCount);
                    if (NullChecker.m81303a(childAt)) {
                        p000.this.m166901N(childAt);
                    }
                }
            }
        }
    }

    public p000(MessageRecyclerView messageRecyclerView) {
        this.f146524c = messageRecyclerView;
        setHasStableIds(true);
        m166899W();
    }

    /* JADX INFO: renamed from: W */
    private void m166899W() {
        registerAdapterDataObserver(new C19089a());
    }

    /* JADX INFO: renamed from: M */
    public final float m166900M(float f, int i, View view) {
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
    public final void m166901N(View view) {
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
    public final void m166902O() {
        Message messageMo147972V;
        ijc0 ijc0Var;
        int childCount = this.f146524c.getChildCount();
        int iM166908U = m166908U();
        if (this.f146528g.size() > 0) {
            LongSparseArray<po0> longSparseArray = new LongSparseArray<>();
            boolean z = false;
            for (int i = 0; i < this.f146528g.size(); i++) {
                po0 po0VarValueAt = this.f146528g.valueAt(i);
                if (po0VarValueAt.m170477a()) {
                    longSparseArray.put(this.f146528g.keyAt(i), po0VarValueAt);
                } else {
                    po0VarValueAt.m170478c();
                    z = true;
                }
            }
            if (z) {
                this.f146528g.clear();
                this.f146528g = longSparseArray;
            }
        }
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            View childAt = this.f146524c.getChildAt(i2);
            if (childAt != null && (messageMo147972V = mo147972V(m166907T(childAt))) != null && (ijc0Var = this.f146527f.get(messageMo147972V._id)) != null) {
                int top = childAt.getTop();
                po0 po0Var = this.f146528g.get(messageMo147972V._id);
                if (po0Var != null) {
                    int i3 = ijc0Var.f113541b - top;
                    po0Var.f150440e = messageMo147972V._id;
                    po0Var.f150438c += i3;
                    po0Var.f150437b = System.nanoTime() + f146522i;
                    po0Var.f150439d = (po0Var.f150439d + ijc0Var.f113543d) - iM166908U;
                } else {
                    po0 po0VarM170476b = po0.m170476b();
                    po0VarM170476b.f150440e = messageMo147972V._id;
                    po0VarM170476b.f150438c = ijc0Var.f113541b - top;
                    po0VarM170476b.f150437b = System.nanoTime() + f146522i;
                    po0VarM170476b.f150439d = ijc0Var.f113543d - iM166908U;
                    this.f146528g.put(messageMo147972V._id, po0VarM170476b);
                }
            }
        }
        m166905R();
    }

    /* JADX INFO: renamed from: P */
    public float m166903P(float f, int i) {
        po0 po0Var;
        Message messageMo147972V = mo147972V(i);
        if (messageMo147972V != null && (po0Var = this.f146528g.get(messageMo147972V._id)) != null && System.nanoTime() < po0Var.f150437b) {
            int i2 = po0Var.f150438c;
            int i3 = po0Var.f150439d;
            if (f > i2 + i3) {
                return i2 + i3;
            }
        }
        return f;
    }

    /* JADX INFO: renamed from: Q */
    public final void m166904Q() {
        int iM166907T;
        Message messageMo147972V;
        int firstVisiblePosition = this.f146524c.getFirstVisiblePosition();
        int lastVisiblePosition = this.f146524c.getLastVisiblePosition();
        int childCount = this.f146524c.getChildCount();
        int iM166908U = m166908U();
        m166905R();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = this.f146524c.getChildAt(i);
            if (childAt != null && (iM166907T = m166907T(childAt)) >= firstVisiblePosition && iM166907T <= lastVisiblePosition && iM166907T < getItemCount() && iM166907T >= 0 && (messageMo147972V = mo147972V(iM166907T)) != null) {
                ijc0 ijc0VarM136587c = ijc0.m136587c();
                ijc0VarM136587c.m136588a(childAt.getTop()).m136590d(messageMo147972V._id).m136592f(iM166908U);
                this.f146527f.put(ijc0VarM136587c.m136589b(), ijc0VarM136587c);
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m166905R() {
        if (this.f146527f.size() <= 0) {
            return;
        }
        int size = this.f146527f.size();
        int i = 0;
        while (true) {
            LongSparseArray<ijc0> longSparseArray = this.f146527f;
            if (i >= size) {
                longSparseArray.clear();
                return;
            } else {
                longSparseArray.valueAt(i).m136591e();
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009a  */
    /* JADX INFO: renamed from: S */
    public final void m166906S() {
        long jNanoTime = System.nanoTime();
        int firstVisiblePosition = this.f146524c.getFirstVisiblePosition();
        int lastVisiblePosition = this.f146524c.getLastVisiblePosition();
        int itemCount = getItemCount() - 1;
        float f = 0.0f;
        int i = 0;
        float fM166900M = 0.0f;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            View childAt = null;
            if (itemCount < Math.max(getItemCount() - 20, i)) {
                break;
            }
            Message messageMo147972V = mo147972V(itemCount);
            if (itemCount >= firstVisiblePosition && itemCount <= lastVisiblePosition) {
                childAt = this.f146524c.getChildAt(((this.f146524c.getChildCount() - lastVisiblePosition) + itemCount) - 1);
            }
            if (childAt != null) {
                m166901N(childAt);
                childAt.setTranslationY(Math.round(Math.max(f, m166903P(fM166900M, itemCount))));
            }
            if (messageMo147972V == null || z2) {
                z2 = true;
            } else {
                long j = messageMo147972V.localCreatedTime;
                if (j <= 0 || jNanoTime < j) {
                    z2 = true;
                } else {
                    long j2 = f146522i;
                    if (j + j2 >= jNanoTime) {
                        fM166900M += messageMo147972V.viewHeight - m166900M(((jNanoTime - j) * 1.0f) / j2, messageMo147972V.viewHeight, childAt);
                        if (!this.f146526e) {
                            this.f146526e = true;
                            e51.m114743H(this.f146524c.getContext(), this.f146529h, f146522i / 1000000);
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
        if (!f146523j) {
            if (z) {
                Choreographer.getInstance().postFrameCallback(this);
                return;
            } else {
                Choreographer.getInstance().removeFrameCallback(this);
                return;
            }
        }
        if (z || !NullChecker.m81303a(this.f146525d)) {
            return;
        }
        this.f146525d.cancel();
        this.f146525d = null;
        if (this.f146526e) {
            e51.m114745J(this.f146529h);
            this.f146526e = false;
        }
    }

    /* JADX INFO: renamed from: T */
    public final int m166907T(View view) {
        if (view != null && (view.getLayoutParams() instanceof RecyclerView.C0578p)) {
            return ((RecyclerView.C0578p) view.getLayoutParams()).m3409c();
        }
        return -1;
    }

    /* JADX INFO: renamed from: U */
    public final int m166908U() {
        int[] iArr = new int[2];
        this.f146524c.getLocationOnScreen(iArr);
        return iArr[1];
    }

    /* JADX INFO: renamed from: V */
    public abstract Message mo147972V(int i);

    /* JADX INFO: renamed from: X */
    public final void m166909X() {
        if (this.f146524c.getChildCount() == 0) {
            return;
        }
        boolean z = false;
        for (int childCount = this.f146524c.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f146524c.getChildAt(childCount);
            if (NullChecker.m81303a(childAt)) {
                m166901N(childAt);
            }
            int iM166907T = m166907T(childAt);
            if (iM166907T >= 0) {
                Message messageMo147972V = mo147972V(iM166907T);
                if (NullChecker.m81303a(messageMo147972V)) {
                    messageMo147972V.viewHeight = childAt.getHeight();
                    if (messageMo147972V.localCreatedTime > 0 && System.nanoTime() - messageMo147972V.localCreatedTime < f146522i) {
                        z = true;
                    }
                }
            }
        }
        m166902O();
        if (!f146523j) {
            if (!z) {
                Choreographer.getInstance().removeFrameCallback(this);
                return;
            } else {
                m166906S();
                Choreographer.getInstance().postFrameCallback(this);
                return;
            }
        }
        if (z) {
            m166906S();
            if (this.f146525d == null) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f146525d = valueAnimatorOfFloat;
                valueAnimatorOfFloat.setDuration(10000000L);
                this.f146525d.addUpdateListener(this);
                this.f146525d.start();
            }
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        m166906S();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        m166906S();
    }
}
