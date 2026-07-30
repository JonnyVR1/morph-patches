package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import androidx.annotation.DrawableRes;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.p053ui.dlg.MemberAnimView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class x7y {

    /* JADX INFO: renamed from: a */
    public final Dialog f191394a;

    /* JADX INFO: renamed from: b */
    public final MemberAnimView f191395b;

    /* JADX INFO: renamed from: c */
    public cwf0 f191396c;

    /* JADX INFO: renamed from: l.x7y$a */
    public static class C21039a {

        /* JADX INFO: renamed from: a */
        public final Act f191397a;

        /* JADX INFO: renamed from: b */
        public String f191398b;

        /* JADX INFO: renamed from: c */
        public CharSequence f191399c;

        /* JADX INFO: renamed from: d */
        public DialogInterface.OnDismissListener f191400d;

        /* JADX INFO: renamed from: e */
        public e30<x7y> f191401e;

        /* JADX INFO: renamed from: f */
        public e30<x7y> f191402f;

        /* JADX INFO: renamed from: g */
        public CharSequence f191403g;

        /* JADX INFO: renamed from: h */
        public CharSequence f191404h;

        /* JADX INFO: renamed from: i */
        @DrawableRes
        public int f191405i;

        /* JADX INFO: renamed from: j */
        public String f191406j;

        /* JADX INFO: renamed from: k */
        public int f191407k;

        /* JADX INFO: renamed from: l */
        public CompoundButton.OnCheckedChangeListener f191408l;

        /* JADX INFO: renamed from: m */
        public int f191409m;

        /* JADX INFO: renamed from: n */
        public CharSequence f191410n;

        /* JADX INFO: renamed from: o */
        public boolean f191411o;

        /* JADX INFO: renamed from: p */
        public DialogInterface.OnCancelListener f191412p;

        /* JADX INFO: renamed from: r */
        public int f191414r;

        /* JADX INFO: renamed from: s */
        public View f191415s;

        /* JADX INFO: renamed from: q */
        public boolean f191413q = true;

        /* JADX INFO: renamed from: t */
        public boolean f191416t = true;

        /* JADX INFO: renamed from: u */
        public boolean f191417u = true;

        public C21039a(Act act) {
            this.f191397a = act;
        }

        /* JADX INFO: renamed from: A */
        public C21039a m207342A(boolean z) {
            this.f191416t = z;
            return this;
        }

        /* JADX INFO: renamed from: B */
        public C21039a m207343B(DialogInterface.OnDismissListener onDismissListener) {
            this.f191400d = onDismissListener;
            return this;
        }

        /* JADX INFO: renamed from: C */
        public C21039a m207344C(CharSequence charSequence) {
            this.f191399c = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: D */
        public C21039a m207345D(String str) {
            this.f191398b = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C21039a m207346r(String str, int i) {
            this.f191406j = str;
            this.f191407k = i;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C21039a m207347s(@DrawableRes int i) {
            this.f191405i = i;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public x7y m207348t() {
            return new x7y(this);
        }

        /* JADX INFO: renamed from: u */
        public C21039a m207349u(CharSequence charSequence) {
            return m207350v(charSequence, null);
        }

        /* JADX INFO: renamed from: v */
        public C21039a m207350v(CharSequence charSequence, e30<x7y> e30Var) {
            this.f191401e = e30Var;
            this.f191403g = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C21039a m207351w(int i, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            this.f191408l = onCheckedChangeListener;
            this.f191409m = i;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C21039a m207352x(CharSequence charSequence, e30<x7y> e30Var) {
            this.f191404h = charSequence;
            this.f191402f = e30Var;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C21039a m207353y(boolean z) {
            this.f191413q = z;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public C21039a m207354z(boolean z) {
            this.f191411o = z;
            return this;
        }
    }

    public x7y(final C21039a c21039a) {
        Dialog dialogM207315f = m207315f(c21039a);
        this.f191394a = dialogM207315f;
        MemberAnimView memberAnimView = (MemberAnimView) dialogM207315f.m20458P();
        this.f191395b = memberAnimView;
        if (c21039a.f191416t) {
            memberAnimView.m45164P();
        }
        m207322l(c21039a.f191400d);
        m207321k(c21039a.f191412p);
        if (c21039a.f191414r != 0) {
            memberAnimView.m45177f0(c21039a.f191414r);
        }
        memberAnimView.m45182l0(c21039a.f191398b).m45176e0(c21039a.f191399c).m45161M(c21039a.f191410n);
        if (!TextUtils.isEmpty(c21039a.f191403g)) {
            memberAnimView.m45167T(c21039a.f191403g, new Runnable() { // from class: l.t7y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f168791a.m207318h(c21039a);
                }
            });
        }
        if (!TextUtils.isEmpty(c21039a.f191404h)) {
            memberAnimView.m45169W(c21039a.f191404h, new Runnable() { // from class: l.u7y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f175084a.m207319i(c21039a);
                }
            });
        }
        if (c21039a.f191405i > 0) {
            memberAnimView.m45154B(c21039a.f191405i);
        }
        if (NullChecker.m81303a(c21039a.f191406j)) {
            memberAnimView.m45185z(c21039a.f191406j, c21039a.f191407k);
        }
        if (NullChecker.m81303a(c21039a.f191408l)) {
            memberAnimView.m45160L(c21039a.f191411o);
            memberAnimView.m45168V(c21039a.f191409m, c21039a.f191408l);
        }
        if (NullChecker.m81303a(c21039a.f191415s)) {
            memberAnimView.m45162N(c21039a.f191415s);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m207313c(DialogInterface.OnCancelListener onCancelListener, DialogInterface dialogInterface) {
        if (NullChecker.m81303a(onCancelListener)) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: f */
    public static Dialog m207315f(C21039a c21039a) {
        return c21039a.f191397a.dialog().m20516L(w7c0.f185040c).m20517M(k6c0.f121301H0).m20498C(t100.m186890d(24.0f), 0, t100.m186890d(24.0f), 0).m20496B(c21039a.f191413q).m20567z();
    }

    /* JADX INFO: renamed from: e */
    public void m207316e() {
        this.f191394a.dismiss();
    }

    /* JADX INFO: renamed from: g */
    public MemberAnimView m207317g() {
        return this.f191395b;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m207318h(C21039a c21039a) {
        if (NullChecker.m81303a(c21039a.f191401e)) {
            c21039a.f191401e.call(this);
        }
        m207316e();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m207319i(C21039a c21039a) {
        if (NullChecker.m81303a(c21039a.f191402f)) {
            c21039a.f191402f.call(this);
        }
        if (c21039a.f191417u) {
            m207316e();
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m207320j(DialogInterface.OnDismissListener onDismissListener, DialogInterface dialogInterface) {
        if (NullChecker.m81303a(onDismissListener)) {
            onDismissListener.onDismiss(dialogInterface);
        }
        i0e.m133796e(this.f191396c);
    }

    /* JADX INFO: renamed from: k */
    public void m207321k(final DialogInterface.OnCancelListener onCancelListener) {
        this.f191394a.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.w7y
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                x7y.m207313c(onCancelListener, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public void m207322l(final DialogInterface.OnDismissListener onDismissListener) {
        this.f191394a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.v7y
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f180431a.m207320j(onDismissListener, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m207323m(cwf0 cwf0Var) {
        this.f191396c = cwf0Var;
    }

    /* JADX INFO: renamed from: n */
    public void m207324n() {
        this.f191394a.show();
        i0e.m133797f(this.f191396c);
    }
}
