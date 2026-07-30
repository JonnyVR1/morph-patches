package p003l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import androidx.annotation.DrawableRes;
import com.p000p1.mobile.putong.core.p001ui.dlg.views.BusinessAnimView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.e30;
import l.f6c0;
import l.i0e;
import l.t100;
import l.v7c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dj3 {

    /* JADX INFO: renamed from: a */
    public final Dialog f4149a;

    /* JADX INFO: renamed from: b */
    public final BusinessAnimView f4150b;

    /* JADX INFO: renamed from: c */
    public cwf0 f4151c;

    /* JADX INFO: renamed from: l.dj3$a */
    public static class C3322a {

        /* JADX INFO: renamed from: a */
        public final Act f4152a;

        /* JADX INFO: renamed from: b */
        public String f4153b;

        /* JADX INFO: renamed from: c */
        public CharSequence f4154c;

        /* JADX INFO: renamed from: d */
        public DialogInterface.OnDismissListener f4155d;

        /* JADX INFO: renamed from: e */
        public e30<dj3> f4156e;

        /* JADX INFO: renamed from: f */
        public e30<dj3> f4157f;

        /* JADX INFO: renamed from: g */
        public CharSequence f4158g;

        /* JADX INFO: renamed from: h */
        public CharSequence f4159h;

        /* JADX INFO: renamed from: i */
        @DrawableRes
        public int f4160i;

        /* JADX INFO: renamed from: j */
        public String f4161j;

        /* JADX INFO: renamed from: k */
        public int f4162k;

        /* JADX INFO: renamed from: l */
        public CompoundButton.OnCheckedChangeListener f4163l;

        /* JADX INFO: renamed from: m */
        public int f4164m;

        /* JADX INFO: renamed from: n */
        public CharSequence f4165n;

        /* JADX INFO: renamed from: o */
        public boolean f4166o;

        /* JADX INFO: renamed from: p */
        public DialogInterface.OnCancelListener f4167p;

        /* JADX INFO: renamed from: r */
        public int f4169r;

        /* JADX INFO: renamed from: s */
        public View f4170s;

        /* JADX INFO: renamed from: q */
        public boolean f4168q = true;

        /* JADX INFO: renamed from: t */
        public boolean f4171t = true;

        /* JADX INFO: renamed from: u */
        public boolean f4172u = true;

        public C3322a(Act act) {
            this.f4152a = act;
        }

        /* JADX INFO: renamed from: A */
        public C3322a m6153A(CharSequence charSequence) {
            this.f4154c = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: B */
        public C3322a m6154B(String str) {
            this.f4153b = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C3322a m6155r(boolean z) {
            this.f4172u = z;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public dj3 m6156s() {
            return new dj3(this);
        }

        /* JADX INFO: renamed from: t */
        public C3322a m6157t(boolean z) {
            this.f4168q = z;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public C3322a m6158u(CharSequence charSequence) {
            this.f4165n = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C3322a m6159v(CharSequence charSequence, e30<dj3> e30Var) {
            this.f4156e = e30Var;
            this.f4158g = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C3322a m6160w(int i, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            this.f4163l = onCheckedChangeListener;
            this.f4164m = i;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C3322a m6161x(CharSequence charSequence, e30<dj3> e30Var) {
            this.f4159h = charSequence;
            this.f4157f = e30Var;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C3322a m6162y(boolean z) {
            this.f4166o = z;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public C3322a m6163z(DialogInterface.OnDismissListener onDismissListener) {
            this.f4155d = onDismissListener;
            return this;
        }
    }

    public dj3(final C3322a c3322a) {
        Dialog dialogM6125f = m6125f(c3322a);
        this.f4149a = dialogM6125f;
        BusinessAnimView businessAnimView = (BusinessAnimView) dialogM6125f.P();
        this.f4150b = businessAnimView;
        if (c3322a.f4171t) {
            businessAnimView.m2515F();
        }
        m6133m(c3322a.f4155d);
        m6132l(c3322a.f4167p);
        if (c3322a.f4169r != 0) {
            businessAnimView.m2523S(c3322a.f4169r);
        }
        businessAnimView.m2524T(c3322a.f4153b).m2522R(c3322a.f4154c).m2512B(c3322a.f4165n);
        if (!TextUtils.isEmpty(c3322a.f4158g)) {
            businessAnimView.m2517L(c3322a.f4158g, new Runnable() { // from class: l.zi3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9257a.m6129i(c3322a);
                }
            });
        }
        if (!TextUtils.isEmpty(c3322a.f4159h)) {
            businessAnimView.m2519N(c3322a.f4159h, new Runnable() { // from class: l.aj3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2790a.m6130j(c3322a);
                }
            });
        }
        if (c3322a.f4160i > 0) {
            businessAnimView.m2527w(c3322a.f4160i);
        }
        if (NullChecker.a(c3322a.f4161j)) {
            businessAnimView.m2526v(c3322a.f4161j, c3322a.f4162k);
        }
        if (NullChecker.a(c3322a.f4163l)) {
            businessAnimView.m2528z(c3322a.f4166o);
            businessAnimView.m2518M(c3322a.f4164m, c3322a.f4163l);
        }
        if (NullChecker.a(c3322a.f4170s)) {
            businessAnimView.m2513C(c3322a.f4170s);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m6121a(DialogInterface.OnCancelListener onCancelListener, DialogInterface dialogInterface) {
        if (NullChecker.a(onCancelListener)) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: f */
    public static Dialog m6125f(C3322a c3322a) {
        return c3322a.f4152a.dialog().L(v7c0.o).M(f6c0.d0).C(t100.d(24.0f), 0, t100.d(24.0f), 0).B(c3322a.f4168q).z();
    }

    /* JADX INFO: renamed from: e */
    public void m6126e() {
        this.f4149a.dismiss();
    }

    /* JADX INFO: renamed from: g */
    public Dialog m6127g() {
        return this.f4149a;
    }

    /* JADX INFO: renamed from: h */
    public BusinessAnimView m6128h() {
        return this.f4150b;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m6129i(C3322a c3322a) {
        if (NullChecker.a(c3322a.f4156e)) {
            c3322a.f4156e.call(this);
        }
        m6126e();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m6130j(C3322a c3322a) {
        if (NullChecker.a(c3322a.f4157f)) {
            c3322a.f4157f.call(this);
        }
        if (c3322a.f4172u) {
            m6126e();
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m6131k(DialogInterface.OnDismissListener onDismissListener, DialogInterface dialogInterface) {
        if (NullChecker.a(onDismissListener)) {
            onDismissListener.onDismiss(dialogInterface);
        }
        i0e.e(this.f4151c);
    }

    /* JADX INFO: renamed from: l */
    public void m6132l(final DialogInterface.OnCancelListener onCancelListener) {
        this.f4149a.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.cj3
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                dj3.m6121a(onCancelListener, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m6133m(final DialogInterface.OnDismissListener onDismissListener) {
        this.f4149a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.bj3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f3384a.m6131k(onDismissListener, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m6134n(cwf0 cwf0Var) {
        this.f4151c = cwf0Var;
    }

    /* JADX INFO: renamed from: o */
    public void m6135o() {
        this.f4149a.show();
        i0e.f(this.f4151c);
    }
}
