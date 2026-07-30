package p002l;

import android.animation.ValueAnimator;
import android.util.LongSparseArray;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.messages.recycler.wrap.MessageRecyclerView;
import com.p1.mobile.putong.core.data.Message;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.e51;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class p000 extends luy<Message> implements Choreographer.FrameCallback, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: i */
    public static long f16931i = 350000000;

    /* JADX INFO: renamed from: j */
    public static boolean f16932j = true;

    /* JADX INFO: renamed from: c */
    public MessageRecyclerView f16933c;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f16934d;

    /* JADX INFO: renamed from: e */
    public boolean f16935e = true;

    /* JADX INFO: renamed from: f */
    public LongSparseArray<ijc0> f16936f = new LongSparseArray<>();

    /* JADX INFO: renamed from: g */
    public LongSparseArray<po0> f16937g = new LongSparseArray<>();

    /* JADX INFO: renamed from: h */
    public Runnable f16938h = new RunnableC0738b();

    /* JADX INFO: renamed from: l.p000$a */
    public class C0737a extends RecyclerView.i {

        /* JADX INFO: renamed from: l.p000$a$a */
        public class a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a */
            public boolean f16940a = false;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ViewTreeObserver f16941b;

            public a(ViewTreeObserver viewTreeObserver) {
                this.f16941b = viewTreeObserver;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (!this.f16940a) {
                    this.f16940a = true;
                    try {
                        if (this.f16941b.isAlive()) {
                            this.f16941b.removeOnPreDrawListener(this);
                        }
                    } catch (Exception unused) {
                    }
                    p000.this.m19925X();
                }
                return true;
            }
        }

        public C0737a() {
        }

        public void onChanged() {
            super.onChanged();
            p000.this.m19920Q();
            ViewTreeObserver viewTreeObserver = p000.this.f16933c.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new a(viewTreeObserver));
        }
    }

    /* JADX INFO: renamed from: l.p000$b */
    public class RunnableC0738b implements Runnable {
        public RunnableC0738b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public void run() {
            if (NullChecker.a(p000.this.f16934d)) {
                p000.this.f16934d.cancel();
                p000.this.f16934d = null;
            }
            int childCount = p000.this.f16933c.getChildCount();
            while (true) {
                childCount--;
                p000 p000Var = p000.this;
                if (childCount < 0) {
                    p000Var.f16935e = false;
                    return;
                } else {
                    View childAt = p000Var.f16933c.getChildAt(childCount);
                    if (NullChecker.a(childAt)) {
                        p000.this.m19917N(childAt);
                    }
                }
            }
        }
    }

    public p000(MessageRecyclerView messageRecyclerView) {
        this.f16933c = messageRecyclerView;
        setHasStableIds(true);
        m19915W();
    }

    /* JADX INFO: renamed from: W */
    private void m19915W() {
        registerAdapterDataObserver(new C0737a());
    }

    /* JADX INFO: renamed from: M */
    public final float m19916M(float f, int i, View view) {
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
    public final void m19917N(View view) {
        if (view != null) {
            view.setScaleY(1.0f);
            view.setScaleX(1.0f);
            view.setAlpha(1.0f);
            view.setRotation(0.0f);
            view.setRotationY(0.0f);
            view.setTranslationY(0.0f);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: O */
    public final void m19918O() {
        Message messageMo16906V;
        ijc0 ijc0Var;
        int childCount = this.f16933c.getChildCount();
        int iM19924U = m19924U();
        if (this.f16937g.size() > 0) {
            LongSparseArray<po0> longSparseArray = new LongSparseArray<>();
            boolean z = false;
            for (int i = 0; i < this.f16937g.size(); i++) {
                po0 po0VarValueAt = this.f16937g.valueAt(i);
                if (po0VarValueAt.m20516a()) {
                    longSparseArray.put(this.f16937g.keyAt(i), po0VarValueAt);
                } else {
                    po0VarValueAt.m20517c();
                    z = true;
                }
            }
            if (z) {
                this.f16937g.clear();
                this.f16937g = longSparseArray;
            }
        }
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            View childAt = this.f16933c.getChildAt(i2);
            if (childAt != null && (messageMo16906V = mo16906V(m19923T(childAt))) != null && (ijc0Var = this.f16936f.get(((DbObject) messageMo16906V)._id)) != null) {
                int top = childAt.getTop();
                po0 po0Var = this.f16937g.get(((DbObject) messageMo16906V)._id);
                if (po0Var != null) {
                    int i3 = ijc0Var.f13275b - top;
                    po0Var.f17553e = ((DbObject) messageMo16906V)._id;
                    po0Var.f17551c += i3;
                    po0Var.f17550b = System.nanoTime() + f16931i;
                    po0Var.f17552d = (po0Var.f17552d + ijc0Var.f13277d) - iM19924U;
                } else {
                    po0 po0VarM20515b = po0.m20515b();
                    po0VarM20515b.f17553e = ((DbObject) messageMo16906V)._id;
                    po0VarM20515b.f17551c = ijc0Var.f13275b - top;
                    po0VarM20515b.f17550b = System.nanoTime() + f16931i;
                    po0VarM20515b.f17552d = ijc0Var.f13277d - iM19924U;
                    this.f16937g.put(((DbObject) messageMo16906V)._id, po0VarM20515b);
                }
            }
        }
        m19921R();
    }

    /* JADX INFO: renamed from: P */
    public float m19919P(float f, int i) {
        po0 po0Var;
        Message messageMo16906V = mo16906V(i);
        if (messageMo16906V != null && (po0Var = this.f16937g.get(((DbObject) messageMo16906V)._id)) != null && System.nanoTime() < po0Var.f17550b) {
            int i2 = po0Var.f17551c;
            int i3 = po0Var.f17552d;
            if (f > i2 + i3) {
                return i2 + i3;
            }
        }
        return f;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: Q */
    public final void m19920Q() {
        int iM19923T;
        Message messageMo16906V;
        int firstVisiblePosition = this.f16933c.getFirstVisiblePosition();
        int lastVisiblePosition = this.f16933c.getLastVisiblePosition();
        int childCount = this.f16933c.getChildCount();
        int iM19924U = m19924U();
        m19921R();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = this.f16933c.getChildAt(i);
            if (childAt != null && (iM19923T = m19923T(childAt)) >= firstVisiblePosition && iM19923T <= lastVisiblePosition && iM19923T < getItemCount() && iM19923T >= 0 && (messageMo16906V = mo16906V(iM19923T)) != null) {
                ijc0 ijc0VarM15206c = ijc0.m15206c();
                ijc0VarM15206c.m15207a(childAt.getTop()).m15209d(((DbObject) messageMo16906V)._id).m15211f(iM19924U);
                this.f16936f.put(ijc0VarM15206c.m15208b(), ijc0VarM15206c);
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m19921R() {
        if (this.f16936f.size() <= 0) {
            return;
        }
        int size = this.f16936f.size();
        int i = 0;
        while (true) {
            LongSparseArray<ijc0> longSparseArray = this.f16936f;
            if (i >= size) {
                longSparseArray.clear();
                return;
            } else {
                longSparseArray.valueAt(i).m15210e();
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: S */
    public final void m19922S() {
        long jNanoTime = System.nanoTime();
        int firstVisiblePosition = this.f16933c.getFirstVisiblePosition();
        int lastVisiblePosition = this.f16933c.getLastVisiblePosition();
        int itemCount = getItemCount() - 1;
        float f = 0.0f;
        int i = 0;
        float fM19916M = 0.0f;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            View childAt = null;
            if (itemCount < Math.max(getItemCount() - 20, i)) {
                break;
            }
            Message messageMo16906V = mo16906V(itemCount);
            if (itemCount >= firstVisiblePosition && itemCount <= lastVisiblePosition) {
                childAt = this.f16933c.getChildAt(((this.f16933c.getChildCount() - lastVisiblePosition) + itemCount) - 1);
            }
            if (childAt != null) {
                m19917N(childAt);
                childAt.setTranslationY(Math.round(Math.max(f, m19919P(fM19916M, itemCount))));
            }
            if (messageMo16906V == null || z2) {
                z2 = true;
            } else {
                long j = messageMo16906V.localCreatedTime;
                if (j <= 0 || jNanoTime < j) {
                    z2 = true;
                } else {
                    long j2 = f16931i;
                    if (j + j2 >= jNanoTime) {
                        fM19916M += messageMo16906V.viewHeight - m19916M(((jNanoTime - j) * 1.0f) / j2, messageMo16906V.viewHeight, childAt);
                        if (!this.f16935e) {
                            this.f16935e = true;
                            e51.H(this.f16933c.getContext(), this.f16938h, f16931i / 1000000);
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
        if (!f16932j) {
            if (z) {
                Choreographer.getInstance().postFrameCallback(this);
                return;
            } else {
                Choreographer.getInstance().removeFrameCallback(this);
                return;
            }
        }
        if (z || !NullChecker.a(this.f16934d)) {
            return;
        }
        this.f16934d.cancel();
        this.f16934d = null;
        if (this.f16935e) {
            e51.J(this.f16938h);
            this.f16935e = false;
        }
    }

    /* JADX INFO: renamed from: T */
    public final int m19923T(View view) {
        if (view != null && (view.getLayoutParams() instanceof RecyclerView.p)) {
            return view.getLayoutParams().c();
        }
        return -1;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: U */
    public final int m19924U() {
        int[] iArr = new int[2];
        this.f16933c.getLocationOnScreen(iArr);
        return iArr[1];
    }

    /* JADX INFO: renamed from: V */
    public abstract Message mo16906V(int i);

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: X */
    public final void m19925X() {
        if (this.f16933c.getChildCount() == 0) {
            return;
        }
        boolean z = false;
        for (int childCount = this.f16933c.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f16933c.getChildAt(childCount);
            if (NullChecker.a(childAt)) {
                m19917N(childAt);
            }
            int iM19923T = m19923T(childAt);
            if (iM19923T >= 0) {
                Message messageMo16906V = mo16906V(iM19923T);
                if (NullChecker.a(messageMo16906V)) {
                    messageMo16906V.viewHeight = childAt.getHeight();
                    if (messageMo16906V.localCreatedTime > 0 && System.nanoTime() - messageMo16906V.localCreatedTime < f16931i) {
                        z = true;
                    }
                }
            }
        }
        m19918O();
        if (!f16932j) {
            if (!z) {
                Choreographer.getInstance().removeFrameCallback(this);
                return;
            } else {
                m19922S();
                Choreographer.getInstance().postFrameCallback(this);
                return;
            }
        }
        if (z) {
            m19922S();
            if (this.f16934d == null) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f16934d = valueAnimatorOfFloat;
                valueAnimatorOfFloat.setDuration(10000000L);
                this.f16934d.addUpdateListener(this);
                this.f16934d.start();
            }
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        m19922S();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        m19922S();
    }
}
