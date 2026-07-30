package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import androidx.annotation.DrawableRes;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.p058ui.dlg.views.BusinessAnimView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class tj3 {

    /* JADX INFO: renamed from: a */
    public final Dialog f174537a;

    /* JADX INFO: renamed from: b */
    public final BusinessAnimView f174538b;

    /* JADX INFO: renamed from: c */
    public l4g0 f174539c;

    /* JADX INFO: renamed from: l.tj3$a */
    public static class C20332a {

        /* JADX INFO: renamed from: a */
        public final Act f174540a;

        /* JADX INFO: renamed from: b */
        public String f174541b;

        /* JADX INFO: renamed from: c */
        public CharSequence f174542c;

        /* JADX INFO: renamed from: d */
        public DialogInterface.OnDismissListener f174543d;

        /* JADX INFO: renamed from: e */
        public y20<tj3> f174544e;

        /* JADX INFO: renamed from: f */
        public y20<tj3> f174545f;

        /* JADX INFO: renamed from: g */
        public CharSequence f174546g;

        /* JADX INFO: renamed from: h */
        public CharSequence f174547h;

        /* JADX INFO: renamed from: i */
        @DrawableRes
        public int f174548i;

        /* JADX INFO: renamed from: j */
        public String f174549j;

        /* JADX INFO: renamed from: k */
        public int f174550k;

        /* JADX INFO: renamed from: l */
        public CompoundButton.OnCheckedChangeListener f174551l;

        /* JADX INFO: renamed from: m */
        public int f174552m;

        /* JADX INFO: renamed from: n */
        public CharSequence f174553n;

        /* JADX INFO: renamed from: o */
        public boolean f174554o;

        /* JADX INFO: renamed from: p */
        public DialogInterface.OnCancelListener f174555p;

        /* JADX INFO: renamed from: r */
        public int f174557r;

        /* JADX INFO: renamed from: s */
        public View f174558s;

        /* JADX INFO: renamed from: q */
        public boolean f174556q = true;

        /* JADX INFO: renamed from: t */
        public boolean f174559t = true;

        /* JADX INFO: renamed from: u */
        public boolean f174560u = true;

        public C20332a(Act act) {
            this.f174540a = act;
        }

        /* JADX INFO: renamed from: A */
        public C20332a m191394A(CharSequence charSequence) {
            this.f174542c = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: B */
        public C20332a m191395B(String str) {
            this.f174541b = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C20332a m191396r(boolean z) {
            this.f174560u = z;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public tj3 m191397s() {
            return new tj3(this);
        }

        /* JADX INFO: renamed from: t */
        public C20332a m191398t(boolean z) {
            this.f174556q = z;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public C20332a m191399u(CharSequence charSequence) {
            this.f174553n = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C20332a m191400v(CharSequence charSequence, y20<tj3> y20Var) {
            this.f174544e = y20Var;
            this.f174546g = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C20332a m191401w(int i, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            this.f174551l = onCheckedChangeListener;
            this.f174552m = i;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C20332a m191402x(CharSequence charSequence, y20<tj3> y20Var) {
            this.f174547h = charSequence;
            this.f174545f = y20Var;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C20332a m191403y(boolean z) {
            this.f174554o = z;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public C20332a m191404z(DialogInterface.OnDismissListener onDismissListener) {
            this.f174543d = onDismissListener;
            return this;
        }
    }

    public tj3(final C20332a c20332a) {
        Dialog dialogM191366f = m191366f(c20332a);
        this.f174537a = dialogM191366f;
        BusinessAnimView businessAnimView = (BusinessAnimView) dialogM191366f.m21457P();
        this.f174538b = businessAnimView;
        if (c20332a.f174559t) {
            businessAnimView.m46381F();
        }
        m191374m(c20332a.f174543d);
        m191373l(c20332a.f174555p);
        if (c20332a.f174557r != 0) {
            businessAnimView.m46389S(c20332a.f174557r);
        }
        businessAnimView.m46390T(c20332a.f174541b).m46388R(c20332a.f174542c).m46378B(c20332a.f174553n);
        if (!TextUtils.isEmpty(c20332a.f174546g)) {
            businessAnimView.m46383L(c20332a.f174546g, new Runnable() { // from class: l.pj3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f152649a.m191370i(c20332a);
                }
            });
        }
        if (!TextUtils.isEmpty(c20332a.f174547h)) {
            businessAnimView.m46385N(c20332a.f174547h, new Runnable() { // from class: l.qj3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f157935a.m191371j(c20332a);
                }
            });
        }
        if (c20332a.f174548i > 0) {
            businessAnimView.m46393w(c20332a.f174548i);
        }
        if (NullChecker.m82486a(c20332a.f174549j)) {
            businessAnimView.m46392v(c20332a.f174549j, c20332a.f174550k);
        }
        if (NullChecker.m82486a(c20332a.f174551l)) {
            businessAnimView.m46394z(c20332a.f174554o);
            businessAnimView.m46384M(c20332a.f174552m, c20332a.f174551l);
        }
        if (NullChecker.m82486a(c20332a.f174558s)) {
            businessAnimView.m46379C(c20332a.f174558s);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m191362a(DialogInterface.OnCancelListener onCancelListener, DialogInterface dialogInterface) {
        if (NullChecker.m82486a(onCancelListener)) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: f */
    public static Dialog m191366f(C20332a c20332a) {
        return c20332a.f174540a.dialog().m21515L(agc0.f71129o).m21516M(kec0.f125788d0).m21497C(qa00.m175859d(24.0f), 0, qa00.m175859d(24.0f), 0).m21495B(c20332a.f174556q).m21566z();
    }

    /* JADX INFO: renamed from: e */
    public void m191367e() {
        this.f174537a.dismiss();
    }

    /* JADX INFO: renamed from: g */
    public Dialog m191368g() {
        return this.f174537a;
    }

    /* JADX INFO: renamed from: h */
    public BusinessAnimView m191369h() {
        return this.f174538b;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m191370i(C20332a c20332a) {
        if (NullChecker.m82486a(c20332a.f174544e)) {
            c20332a.f174544e.call(this);
        }
        m191367e();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m191371j(C20332a c20332a) {
        if (NullChecker.m82486a(c20332a.f174545f)) {
            c20332a.f174545f.call(this);
        }
        if (c20332a.f174560u) {
            m191367e();
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m191372k(DialogInterface.OnDismissListener onDismissListener, DialogInterface dialogInterface) {
        if (NullChecker.m82486a(onDismissListener)) {
            onDismissListener.onDismiss(dialogInterface);
        }
        w1e.m204401e(this.f174539c);
    }

    /* JADX INFO: renamed from: l */
    public void m191373l(final DialogInterface.OnCancelListener onCancelListener) {
        this.f174537a.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.sj3
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                tj3.m191362a(onCancelListener, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m191374m(final DialogInterface.OnDismissListener onDismissListener) {
        this.f174537a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.rj3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f163412a.m191372k(onDismissListener, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m191375n(l4g0 l4g0Var) {
        this.f174539c = l4g0Var;
    }

    /* JADX INFO: renamed from: o */
    public void m191376o() {
        this.f174537a.show();
        w1e.m204402f(this.f174539c);
    }
}
