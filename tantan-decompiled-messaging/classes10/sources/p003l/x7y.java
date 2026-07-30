package p003l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import androidx.annotation.DrawableRes;
import com.p000p1.mobile.putong.core.p001ui.dlg.MemberAnimView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.e30;
import l.i0e;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class x7y {

    /* JADX INFO: renamed from: a */
    public final Dialog f8391a;

    /* JADX INFO: renamed from: b */
    public final MemberAnimView f8392b;

    /* JADX INFO: renamed from: c */
    public cwf0 f8393c;

    /* JADX INFO: renamed from: l.x7y$a */
    public static class C3477a {

        /* JADX INFO: renamed from: a */
        public final Act f8394a;

        /* JADX INFO: renamed from: b */
        public String f8395b;

        /* JADX INFO: renamed from: c */
        public CharSequence f8396c;

        /* JADX INFO: renamed from: d */
        public DialogInterface.OnDismissListener f8397d;

        /* JADX INFO: renamed from: e */
        public e30<x7y> f8398e;

        /* JADX INFO: renamed from: f */
        public e30<x7y> f8399f;

        /* JADX INFO: renamed from: g */
        public CharSequence f8400g;

        /* JADX INFO: renamed from: h */
        public CharSequence f8401h;

        /* JADX INFO: renamed from: i */
        @DrawableRes
        public int f8402i;

        /* JADX INFO: renamed from: j */
        public String f8403j;

        /* JADX INFO: renamed from: k */
        public int f8404k;

        /* JADX INFO: renamed from: l */
        public CompoundButton.OnCheckedChangeListener f8405l;

        /* JADX INFO: renamed from: m */
        public int f8406m;

        /* JADX INFO: renamed from: n */
        public CharSequence f8407n;

        /* JADX INFO: renamed from: o */
        public boolean f8408o;

        /* JADX INFO: renamed from: p */
        public DialogInterface.OnCancelListener f8409p;

        /* JADX INFO: renamed from: r */
        public int f8411r;

        /* JADX INFO: renamed from: s */
        public View f8412s;

        /* JADX INFO: renamed from: q */
        public boolean f8410q = true;

        /* JADX INFO: renamed from: t */
        public boolean f8413t = true;

        /* JADX INFO: renamed from: u */
        public boolean f8414u = true;

        public C3477a(Act act) {
            this.f8394a = act;
        }

        /* JADX INFO: renamed from: A */
        public C3477a m10684A(boolean z) {
            this.f8413t = z;
            return this;
        }

        /* JADX INFO: renamed from: B */
        public C3477a m10685B(DialogInterface.OnDismissListener onDismissListener) {
            this.f8397d = onDismissListener;
            return this;
        }

        /* JADX INFO: renamed from: C */
        public C3477a m10686C(CharSequence charSequence) {
            this.f8396c = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: D */
        public C3477a m10687D(String str) {
            this.f8395b = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C3477a m10688r(String str, int i) {
            this.f8403j = str;
            this.f8404k = i;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C3477a m10689s(@DrawableRes int i) {
            this.f8402i = i;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public x7y m10690t() {
            return new x7y(this);
        }

        /* JADX INFO: renamed from: u */
        public C3477a m10691u(CharSequence charSequence) {
            return m10692v(charSequence, null);
        }

        /* JADX INFO: renamed from: v */
        public C3477a m10692v(CharSequence charSequence, e30<x7y> e30Var) {
            this.f8398e = e30Var;
            this.f8400g = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C3477a m10693w(int i, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            this.f8405l = onCheckedChangeListener;
            this.f8406m = i;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C3477a m10694x(CharSequence charSequence, e30<x7y> e30Var) {
            this.f8401h = charSequence;
            this.f8399f = e30Var;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C3477a m10695y(boolean z) {
            this.f8410q = z;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public C3477a m10696z(boolean z) {
            this.f8408o = z;
            return this;
        }
    }

    public x7y(final C3477a c3477a) {
        Dialog dialogM10657f = m10657f(c3477a);
        this.f8391a = dialogM10657f;
        MemberAnimView memberAnimView = (MemberAnimView) dialogM10657f.P();
        this.f8392b = memberAnimView;
        if (c3477a.f8413t) {
            memberAnimView.m2481P();
        }
        m10664l(c3477a.f8397d);
        m10663k(c3477a.f8409p);
        if (c3477a.f8411r != 0) {
            memberAnimView.m2494f0(c3477a.f8411r);
        }
        memberAnimView.m2499l0(c3477a.f8395b).m2493e0(c3477a.f8396c).m2478M(c3477a.f8407n);
        if (!TextUtils.isEmpty(c3477a.f8400g)) {
            memberAnimView.m2484T(c3477a.f8400g, new Runnable() { // from class: l.t7y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7518a.m10660h(c3477a);
                }
            });
        }
        if (!TextUtils.isEmpty(c3477a.f8401h)) {
            memberAnimView.m2486W(c3477a.f8401h, new Runnable() { // from class: l.u7y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7699a.m10661i(c3477a);
                }
            });
        }
        if (c3477a.f8402i > 0) {
            memberAnimView.m2471B(c3477a.f8402i);
        }
        if (NullChecker.a(c3477a.f8403j)) {
            memberAnimView.m2502z(c3477a.f8403j, c3477a.f8404k);
        }
        if (NullChecker.a(c3477a.f8405l)) {
            memberAnimView.m2477L(c3477a.f8408o);
            memberAnimView.m2485V(c3477a.f8406m, c3477a.f8405l);
        }
        if (NullChecker.a(c3477a.f8412s)) {
            memberAnimView.m2479N(c3477a.f8412s);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m10655c(DialogInterface.OnCancelListener onCancelListener, DialogInterface dialogInterface) {
        if (NullChecker.a(onCancelListener)) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: f */
    public static Dialog m10657f(C3477a c3477a) {
        return c3477a.f8394a.dialog().L(w7c0.f8129c).M(k6c0.f5464H0).C(t100.d(24.0f), 0, t100.d(24.0f), 0).B(c3477a.f8410q).z();
    }

    /* JADX INFO: renamed from: e */
    public void m10658e() {
        this.f8391a.dismiss();
    }

    /* JADX INFO: renamed from: g */
    public MemberAnimView m10659g() {
        return this.f8392b;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m10660h(C3477a c3477a) {
        if (NullChecker.a(c3477a.f8398e)) {
            c3477a.f8398e.call(this);
        }
        m10658e();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m10661i(C3477a c3477a) {
        if (NullChecker.a(c3477a.f8399f)) {
            c3477a.f8399f.call(this);
        }
        if (c3477a.f8414u) {
            m10658e();
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m10662j(DialogInterface.OnDismissListener onDismissListener, DialogInterface dialogInterface) {
        if (NullChecker.a(onDismissListener)) {
            onDismissListener.onDismiss(dialogInterface);
        }
        i0e.e(this.f8393c);
    }

    /* JADX INFO: renamed from: k */
    public void m10663k(final DialogInterface.OnCancelListener onCancelListener) {
        this.f8391a.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.w7y
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                x7y.m10655c(onCancelListener, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public void m10664l(final DialogInterface.OnDismissListener onDismissListener) {
        this.f8391a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.v7y
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f7933a.m10662j(onDismissListener, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m10665m(cwf0 cwf0Var) {
        this.f8393c = cwf0Var;
    }

    /* JADX INFO: renamed from: n */
    public void m10666n() {
        this.f8391a.show();
        i0e.f(this.f8393c);
    }
}
