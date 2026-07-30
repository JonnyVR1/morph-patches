package p153l;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import com.p051p1.mobile.android.app.Dialog;
import java.util.Stack;

/* JADX INFO: loaded from: classes8.dex */
public class q1e {

    /* JADX INFO: renamed from: a */
    public qcj<q1e, Dialog>[] f155176a;

    /* JADX INFO: renamed from: b */
    public Object[] f155177b;

    /* JADX INFO: renamed from: c */
    public Dialog f155178c;

    /* JADX INFO: renamed from: d */
    public int f155179d;

    /* JADX INFO: renamed from: e */
    public x20 f155180e;

    /* JADX INFO: renamed from: f */
    public Stack<Integer> f155181f = new Stack<>();

    /* JADX INFO: renamed from: g */
    public long f155182g = 0;

    /* JADX INFO: renamed from: e */
    public final Dialog m174873e(int i) {
        return this.f155176a[i].call(this).m21450I(false);
    }

    /* JADX INFO: renamed from: f */
    public final void m174874f(int i, int i2, x20 x20Var, Object... objArr) {
        this.f155179d = i;
        this.f155177b = objArr;
        final Dialog dialog = this.f155178c;
        final float f = dialog.getWindow().getAttributes().dimAmount;
        dialog.getWindow().setWindowAnimations(i2);
        Dialog dialogM174873e = m174873e(i);
        this.f155178c = dialogM174873e;
        dialogM174873e.getWindow().setWindowAnimations(i2);
        this.f155178c.show();
        if (x20Var != null) {
            x20Var.call();
        }
        l51.m152888H(this.f155178c.getContext(), new Runnable() { // from class: l.o1e
            @Override // java.lang.Runnable
            public final void run() {
                this.f144638a.m174880l();
            }
        }, 200L);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.p1e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                dialog.getWindow().setDimAmount(f);
            }
        });
        duration.start();
        m174882n(dialog);
    }

    /* JADX INFO: renamed from: g */
    public void m174875g() {
        this.f155178c.getWindow().setWindowAnimations(0);
        m174882n(this.f155178c);
    }

    /* JADX INFO: renamed from: h */
    public final void m174876h(int i, Object... objArr) {
        while (!this.f155181f.empty()) {
            if (i == this.f155181f.pop().intValue()) {
                m174874f(i, tgc0.f174058d, this.f155180e, objArr);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m174877i(Object... objArr) {
        if (this.f155181f.size() == 0) {
            m174875g();
        } else {
            Stack<Integer> stack = this.f155181f;
            m174876h(stack.get(stack.size() - 1).intValue(), objArr);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m174878j(int i, x20 x20Var, Object... objArr) {
        int i2 = this.f155179d;
        if (i == i2) {
            return;
        }
        this.f155181f.add(Integer.valueOf(i2));
        m174874f(i, tgc0.f174057c, x20Var, objArr);
        this.f155178c.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.m1e
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
                return this.f134413a.m174881m(dialogInterface, i3, keyEvent);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m174879k(int i, Object... objArr) {
        m174878j(i, null, objArr);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m174880l() {
        this.f155178c.getWindow().setWindowAnimations(0);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean m174881m(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        if (this.f155182g != keyEvent.getDownTime()) {
            View viewM21462X = this.f155178c.m21462X();
            if (viewM21462X == null || viewM21462X.getTag() != "NEGATIVE") {
                this.f155178c.cancel();
            } else {
                this.f155178c.onClick(viewM21462X);
            }
        }
        this.f155182g = keyEvent.getDownTime();
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final void m174882n(final Dialog dialog) {
        l51.m152887G(new Runnable() { // from class: l.n1e
            @Override // java.lang.Runnable
            public final void run() {
                dialog.dismiss();
            }
        });
    }

    @SafeVarargs
    /* JADX INFO: renamed from: o */
    public final q1e m174883o(qcj<q1e, Dialog>... qcjVarArr) {
        this.f155176a = qcjVarArr;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public final q1e m174884p(x20 x20Var) {
        this.f155180e = x20Var;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public void m174885q() {
        Dialog dialogM174873e = m174873e(0);
        this.f155178c = dialogM174873e;
        this.f155179d = 0;
        dialogM174873e.show();
    }
}
