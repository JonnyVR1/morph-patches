package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import androidx.annotation.DrawableRes;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.p058ui.dlg.MemberAnimView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes2.dex */
public class ugy {

    /* JADX INFO: renamed from: a */
    public final Dialog f178947a;

    /* JADX INFO: renamed from: b */
    public final MemberAnimView f178948b;

    /* JADX INFO: renamed from: c */
    public l4g0 f178949c;

    /* JADX INFO: renamed from: l.ugy$a */
    public static class C20573a {

        /* JADX INFO: renamed from: a */
        public final Act f178950a;

        /* JADX INFO: renamed from: b */
        public String f178951b;

        /* JADX INFO: renamed from: c */
        public CharSequence f178952c;

        /* JADX INFO: renamed from: d */
        public DialogInterface.OnDismissListener f178953d;

        /* JADX INFO: renamed from: e */
        public y20<ugy> f178954e;

        /* JADX INFO: renamed from: f */
        public y20<ugy> f178955f;

        /* JADX INFO: renamed from: g */
        public CharSequence f178956g;

        /* JADX INFO: renamed from: h */
        public CharSequence f178957h;

        /* JADX INFO: renamed from: i */
        @DrawableRes
        public int f178958i;

        /* JADX INFO: renamed from: j */
        public String f178959j;

        /* JADX INFO: renamed from: k */
        public int f178960k;

        /* JADX INFO: renamed from: l */
        public CompoundButton.OnCheckedChangeListener f178961l;

        /* JADX INFO: renamed from: m */
        public int f178962m;

        /* JADX INFO: renamed from: n */
        public CharSequence f178963n;

        /* JADX INFO: renamed from: o */
        public boolean f178964o;

        /* JADX INFO: renamed from: p */
        public DialogInterface.OnCancelListener f178965p;

        /* JADX INFO: renamed from: r */
        public int f178967r;

        /* JADX INFO: renamed from: s */
        public View f178968s;

        /* JADX INFO: renamed from: q */
        public boolean f178966q = true;

        /* JADX INFO: renamed from: t */
        public boolean f178969t = true;

        /* JADX INFO: renamed from: u */
        public boolean f178970u = true;

        public C20573a(Act act) {
            this.f178950a = act;
        }

        /* JADX INFO: renamed from: A */
        public C20573a m195992A(boolean z) {
            this.f178969t = z;
            return this;
        }

        /* JADX INFO: renamed from: B */
        public C20573a m195993B(DialogInterface.OnDismissListener onDismissListener) {
            this.f178953d = onDismissListener;
            return this;
        }

        /* JADX INFO: renamed from: C */
        public C20573a m195994C(CharSequence charSequence) {
            this.f178952c = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: D */
        public C20573a m195995D(String str) {
            this.f178951b = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C20573a m195996r(String str, int i) {
            this.f178959j = str;
            this.f178960k = i;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C20573a m195997s(@DrawableRes int i) {
            this.f178958i = i;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public ugy m195998t() {
            return new ugy(this);
        }

        /* JADX INFO: renamed from: u */
        public C20573a m195999u(CharSequence charSequence) {
            return m196000v(charSequence, null);
        }

        /* JADX INFO: renamed from: v */
        public C20573a m196000v(CharSequence charSequence, y20<ugy> y20Var) {
            this.f178954e = y20Var;
            this.f178956g = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C20573a m196001w(int i, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            this.f178961l = onCheckedChangeListener;
            this.f178962m = i;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C20573a m196002x(CharSequence charSequence, y20<ugy> y20Var) {
            this.f178957h = charSequence;
            this.f178955f = y20Var;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C20573a m196003y(boolean z) {
            this.f178966q = z;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public C20573a m196004z(boolean z) {
            this.f178964o = z;
            return this;
        }
    }

    public ugy(final C20573a c20573a) {
        Dialog dialogM195965f = m195965f(c20573a);
        this.f178947a = dialogM195965f;
        MemberAnimView memberAnimView = (MemberAnimView) dialogM195965f.m21457P();
        this.f178948b = memberAnimView;
        if (c20573a.f178969t) {
            memberAnimView.m46347P();
        }
        m195972l(c20573a.f178953d);
        m195971k(c20573a.f178965p);
        if (c20573a.f178967r != 0) {
            memberAnimView.m46360f0(c20573a.f178967r);
        }
        memberAnimView.m46365l0(c20573a.f178951b).m46359e0(c20573a.f178952c).m46344M(c20573a.f178963n);
        if (!TextUtils.isEmpty(c20573a.f178956g)) {
            memberAnimView.m46350T(c20573a.f178956g, new Runnable() { // from class: l.qgy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f157491a.m195968h(c20573a);
                }
            });
        }
        if (!TextUtils.isEmpty(c20573a.f178957h)) {
            memberAnimView.m46352W(c20573a.f178957h, new Runnable() { // from class: l.rgy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f163063a.m195969i(c20573a);
                }
            });
        }
        if (c20573a.f178958i > 0) {
            memberAnimView.m46337B(c20573a.f178958i);
        }
        if (NullChecker.m82486a(c20573a.f178959j)) {
            memberAnimView.m46368z(c20573a.f178959j, c20573a.f178960k);
        }
        if (NullChecker.m82486a(c20573a.f178961l)) {
            memberAnimView.m46343L(c20573a.f178964o);
            memberAnimView.m46351V(c20573a.f178962m, c20573a.f178961l);
        }
        if (NullChecker.m82486a(c20573a.f178968s)) {
            memberAnimView.m46345N(c20573a.f178968s);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m195963c(DialogInterface.OnCancelListener onCancelListener, DialogInterface dialogInterface) {
        if (NullChecker.m82486a(onCancelListener)) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: f */
    public static Dialog m195965f(C20573a c20573a) {
        return c20573a.f178950a.dialog().m21515L(bgc0.f76582c).m21516M(pec0.f151909H0).m21497C(qa00.m175859d(24.0f), 0, qa00.m175859d(24.0f), 0).m21495B(c20573a.f178966q).m21566z();
    }

    /* JADX INFO: renamed from: e */
    public void m195966e() {
        this.f178947a.dismiss();
    }

    /* JADX INFO: renamed from: g */
    public MemberAnimView m195967g() {
        return this.f178948b;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m195968h(C20573a c20573a) {
        if (NullChecker.m82486a(c20573a.f178954e)) {
            c20573a.f178954e.call(this);
        }
        m195966e();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m195969i(C20573a c20573a) {
        if (NullChecker.m82486a(c20573a.f178955f)) {
            c20573a.f178955f.call(this);
        }
        if (c20573a.f178970u) {
            m195966e();
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m195970j(DialogInterface.OnDismissListener onDismissListener, DialogInterface dialogInterface) {
        if (NullChecker.m82486a(onDismissListener)) {
            onDismissListener.onDismiss(dialogInterface);
        }
        w1e.m204401e(this.f178949c);
    }

    /* JADX INFO: renamed from: k */
    public void m195971k(final DialogInterface.OnCancelListener onCancelListener) {
        this.f178947a.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.tgy
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ugy.m195963c(onCancelListener, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public void m195972l(final DialogInterface.OnDismissListener onDismissListener) {
        this.f178947a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.sgy
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f168566a.m195970j(onDismissListener, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m195973m(l4g0 l4g0Var) {
        this.f178949c = l4g0Var;
    }

    /* JADX INFO: renamed from: n */
    public void m195974n() {
        this.f178947a.show();
        w1e.m204402f(this.f178949c);
    }
}
