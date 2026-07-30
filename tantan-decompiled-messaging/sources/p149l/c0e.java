package p149l;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import com.p046p1.mobile.android.app.Dialog;
import java.util.Stack;

/* JADX INFO: loaded from: classes8.dex */
public class c0e {

    /* JADX INFO: renamed from: a */
    public w9j<c0e, Dialog>[] f78130a;

    /* JADX INFO: renamed from: b */
    public Object[] f78131b;

    /* JADX INFO: renamed from: c */
    public Dialog f78132c;

    /* JADX INFO: renamed from: d */
    public int f78133d;

    /* JADX INFO: renamed from: e */
    public d30 f78134e;

    /* JADX INFO: renamed from: f */
    public Stack<Integer> f78135f = new Stack<>();

    /* JADX INFO: renamed from: g */
    public long f78136g = 0;

    /* JADX INFO: renamed from: e */
    public final Dialog m104734e(int i) {
        return this.f78130a[i].call(this).m20451I(false);
    }

    /* JADX INFO: renamed from: f */
    public final void m104735f(int i, int i2, d30 d30Var, Object... objArr) {
        this.f78133d = i;
        this.f78131b = objArr;
        final Dialog dialog = this.f78132c;
        final float f = dialog.getWindow().getAttributes().dimAmount;
        dialog.getWindow().setWindowAnimations(i2);
        Dialog dialogM104734e = m104734e(i);
        this.f78132c = dialogM104734e;
        dialogM104734e.getWindow().setWindowAnimations(i2);
        this.f78132c.show();
        if (d30Var != null) {
            d30Var.call();
        }
        e51.m114743H(this.f78132c.getContext(), new Runnable() { // from class: l.a0e
            @Override // java.lang.Runnable
            public final void run() {
                this.f67038a.m104741l();
            }
        }, 200L);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.b0e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                dialog.getWindow().setDimAmount(f);
            }
        });
        duration.start();
        m104743n(dialog);
    }

    /* JADX INFO: renamed from: g */
    public void m104736g() {
        this.f78132c.getWindow().setWindowAnimations(0);
        m104743n(this.f78132c);
    }

    /* JADX INFO: renamed from: h */
    public final void m104737h(int i, Object... objArr) {
        while (!this.f78135f.empty()) {
            if (i == this.f78135f.pop().intValue()) {
                m104735f(i, n8c0.f137620d, this.f78134e, objArr);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m104738i(Object... objArr) {
        if (this.f78135f.size() == 0) {
            m104736g();
        } else {
            Stack<Integer> stack = this.f78135f;
            m104737h(stack.get(stack.size() - 1).intValue(), objArr);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m104739j(int i, d30 d30Var, Object... objArr) {
        int i2 = this.f78133d;
        if (i == i2) {
            return;
        }
        this.f78135f.add(Integer.valueOf(i2));
        m104735f(i, n8c0.f137619c, d30Var, objArr);
        this.f78132c.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.yzd
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
                return this.f200866a.m104742m(dialogInterface, i3, keyEvent);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m104740k(int i, Object... objArr) {
        m104739j(i, null, objArr);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m104741l() {
        this.f78132c.getWindow().setWindowAnimations(0);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean m104742m(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        if (this.f78136g != keyEvent.getDownTime()) {
            View viewM20463X = this.f78132c.m20463X();
            if (viewM20463X == null || viewM20463X.getTag() != "NEGATIVE") {
                this.f78132c.cancel();
            } else {
                this.f78132c.onClick(viewM20463X);
            }
        }
        this.f78136g = keyEvent.getDownTime();
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final void m104743n(final Dialog dialog) {
        e51.m114742G(new Runnable() { // from class: l.zzd
            @Override // java.lang.Runnable
            public final void run() {
                dialog.dismiss();
            }
        });
    }

    @SafeVarargs
    /* JADX INFO: renamed from: o */
    public final c0e m104744o(w9j<c0e, Dialog>... w9jVarArr) {
        this.f78130a = w9jVarArr;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public final c0e m104745p(d30 d30Var) {
        this.f78134e = d30Var;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public void m104746q() {
        Dialog dialogM104734e = m104734e(0);
        this.f78132c = dialogM104734e;
        this.f78133d = 0;
        dialogM104734e.show();
    }
}
