package p007l;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import com.p003p1.mobile.android.app.Dialog;
import java.util.Stack;
import l.d30;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class c0e {

    /* JADX INFO: renamed from: a */
    public w9j<c0e, Dialog>[] f2349a;

    /* JADX INFO: renamed from: b */
    public Object[] f2350b;

    /* JADX INFO: renamed from: c */
    public Dialog f2351c;

    /* JADX INFO: renamed from: d */
    public int f2352d;

    /* JADX INFO: renamed from: e */
    public d30 f2353e;

    /* JADX INFO: renamed from: f */
    public Stack<Integer> f2354f = new Stack<>();

    /* JADX INFO: renamed from: g */
    public long f2355g = 0;

    /* JADX INFO: renamed from: e */
    public final Dialog m8695e(int i) {
        return ((Dialog) this.f2349a[i].call(this)).m722I(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Dialog, com.p1.mobile.android.app.Dialog] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.app.Dialog, com.p1.mobile.android.app.Dialog] */
    /* JADX INFO: renamed from: f */
    public final void m8696f(int i, int i2, d30 d30Var, Object... objArr) {
        this.f2352d = i;
        this.f2350b = objArr;
        final ?? r7 = this.f2351c;
        final float f = r7.getWindow().getAttributes().dimAmount;
        r7.getWindow().setWindowAnimations(i2);
        ?? M8695e = m8695e(i);
        this.f2351c = M8695e;
        M8695e.getWindow().setWindowAnimations(i2);
        this.f2351c.show();
        if (d30Var != null) {
            d30Var.call();
        }
        e51.m9025H(this.f2351c.getContext(), new Runnable() { // from class: l.a0e
            @Override // java.lang.Runnable
            public final void run() {
                this.f1831a.m8702l();
            }
        }, 200L);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.b0e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                r7.getWindow().setDimAmount(f);
            }
        });
        duration.start();
        m8704n(r7);
    }

    /* JADX INFO: renamed from: g */
    public void m8697g() {
        this.f2351c.getWindow().setWindowAnimations(0);
        m8704n(this.f2351c);
    }

    /* JADX INFO: renamed from: h */
    public final void m8698h(int i, Object... objArr) {
        while (!this.f2354f.empty()) {
            if (i == this.f2354f.pop().intValue()) {
                m8696f(i, n8c0.f3365d, this.f2353e, objArr);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m8699i(Object... objArr) {
        if (this.f2354f.size() == 0) {
            m8697g();
        } else {
            Stack<Integer> stack = this.f2354f;
            m8698h(stack.get(stack.size() - 1).intValue(), objArr);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m8700j(int i, d30 d30Var, Object... objArr) {
        int i2 = this.f2352d;
        if (i == i2) {
            return;
        }
        this.f2354f.add(Integer.valueOf(i2));
        m8696f(i, n8c0.f3364c, d30Var, objArr);
        this.f2351c.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.yzd
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
                return this.f5469a.m8703m(dialogInterface, i3, keyEvent);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m8701k(int i, Object... objArr) {
        m8700j(i, null, objArr);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m8702l() {
        this.f2351c.getWindow().setWindowAnimations(0);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean m8703m(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        if (this.f2355g != keyEvent.getDownTime()) {
            View viewM734X = this.f2351c.m734X();
            if (viewM734X == null || viewM734X.getTag() != "NEGATIVE") {
                this.f2351c.cancel();
            } else {
                this.f2351c.onClick(viewM734X);
            }
        }
        this.f2355g = keyEvent.getDownTime();
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final void m8704n(final Dialog dialog) {
        e51.m9024G(new Runnable() { // from class: l.zzd
            @Override // java.lang.Runnable
            public final void run() {
                dialog.dismiss();
            }
        });
    }

    @SafeVarargs
    /* JADX INFO: renamed from: o */
    public final c0e m8705o(w9j<c0e, Dialog>... w9jVarArr) {
        this.f2349a = w9jVarArr;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public final c0e m8706p(d30 d30Var) {
        this.f2353e = d30Var;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public void m8707q() {
        Dialog dialogM8695e = m8695e(0);
        this.f2351c = dialogM8695e;
        this.f2352d = 0;
        dialogM8695e.show();
    }
}
