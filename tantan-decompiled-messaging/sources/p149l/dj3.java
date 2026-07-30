package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import androidx.annotation.DrawableRes;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.p053ui.dlg.views.BusinessAnimView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class dj3 {

    /* JADX INFO: renamed from: a */
    public final Dialog f86478a;

    /* JADX INFO: renamed from: b */
    public final BusinessAnimView f86479b;

    /* JADX INFO: renamed from: c */
    public cwf0 f86480c;

    /* JADX INFO: renamed from: l.dj3$a */
    public static class C16391a {

        /* JADX INFO: renamed from: a */
        public final Act f86481a;

        /* JADX INFO: renamed from: b */
        public String f86482b;

        /* JADX INFO: renamed from: c */
        public CharSequence f86483c;

        /* JADX INFO: renamed from: d */
        public DialogInterface.OnDismissListener f86484d;

        /* JADX INFO: renamed from: e */
        public e30<dj3> f86485e;

        /* JADX INFO: renamed from: f */
        public e30<dj3> f86486f;

        /* JADX INFO: renamed from: g */
        public CharSequence f86487g;

        /* JADX INFO: renamed from: h */
        public CharSequence f86488h;

        /* JADX INFO: renamed from: i */
        @DrawableRes
        public int f86489i;

        /* JADX INFO: renamed from: j */
        public String f86490j;

        /* JADX INFO: renamed from: k */
        public int f86491k;

        /* JADX INFO: renamed from: l */
        public CompoundButton.OnCheckedChangeListener f86492l;

        /* JADX INFO: renamed from: m */
        public int f86493m;

        /* JADX INFO: renamed from: n */
        public CharSequence f86494n;

        /* JADX INFO: renamed from: o */
        public boolean f86495o;

        /* JADX INFO: renamed from: p */
        public DialogInterface.OnCancelListener f86496p;

        /* JADX INFO: renamed from: r */
        public int f86498r;

        /* JADX INFO: renamed from: s */
        public View f86499s;

        /* JADX INFO: renamed from: q */
        public boolean f86497q = true;

        /* JADX INFO: renamed from: t */
        public boolean f86500t = true;

        /* JADX INFO: renamed from: u */
        public boolean f86501u = true;

        public C16391a(Act act) {
            this.f86481a = act;
        }

        /* JADX INFO: renamed from: A */
        public C16391a m112009A(CharSequence charSequence) {
            this.f86483c = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: B */
        public C16391a m112010B(String str) {
            this.f86482b = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C16391a m112011r(boolean z) {
            this.f86501u = z;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public dj3 m112012s() {
            return new dj3(this);
        }

        /* JADX INFO: renamed from: t */
        public C16391a m112013t(boolean z) {
            this.f86497q = z;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public C16391a m112014u(CharSequence charSequence) {
            this.f86494n = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C16391a m112015v(CharSequence charSequence, e30<dj3> e30Var) {
            this.f86485e = e30Var;
            this.f86487g = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C16391a m112016w(int i, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            this.f86492l = onCheckedChangeListener;
            this.f86493m = i;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C16391a m112017x(CharSequence charSequence, e30<dj3> e30Var) {
            this.f86488h = charSequence;
            this.f86486f = e30Var;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C16391a m112018y(boolean z) {
            this.f86495o = z;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public C16391a m112019z(DialogInterface.OnDismissListener onDismissListener) {
            this.f86484d = onDismissListener;
            return this;
        }
    }

    public dj3(final C16391a c16391a) {
        Dialog dialogM111981f = m111981f(c16391a);
        this.f86478a = dialogM111981f;
        BusinessAnimView businessAnimView = (BusinessAnimView) dialogM111981f.m20458P();
        this.f86479b = businessAnimView;
        if (c16391a.f86500t) {
            businessAnimView.m45198F();
        }
        m111989m(c16391a.f86484d);
        m111988l(c16391a.f86496p);
        if (c16391a.f86498r != 0) {
            businessAnimView.m45206S(c16391a.f86498r);
        }
        businessAnimView.m45207T(c16391a.f86482b).m45205R(c16391a.f86483c).m45195B(c16391a.f86494n);
        if (!TextUtils.isEmpty(c16391a.f86487g)) {
            businessAnimView.m45200L(c16391a.f86487g, new Runnable() { // from class: l.zi3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f203280a.m111985i(c16391a);
                }
            });
        }
        if (!TextUtils.isEmpty(c16391a.f86488h)) {
            businessAnimView.m45202N(c16391a.f86488h, new Runnable() { // from class: l.aj3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f70083a.m111986j(c16391a);
                }
            });
        }
        if (c16391a.f86489i > 0) {
            businessAnimView.m45210w(c16391a.f86489i);
        }
        if (NullChecker.m81303a(c16391a.f86490j)) {
            businessAnimView.m45209v(c16391a.f86490j, c16391a.f86491k);
        }
        if (NullChecker.m81303a(c16391a.f86492l)) {
            businessAnimView.m45211z(c16391a.f86495o);
            businessAnimView.m45201M(c16391a.f86493m, c16391a.f86492l);
        }
        if (NullChecker.m81303a(c16391a.f86499s)) {
            businessAnimView.m45196C(c16391a.f86499s);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m111977a(DialogInterface.OnCancelListener onCancelListener, DialogInterface dialogInterface) {
        if (NullChecker.m81303a(onCancelListener)) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: f */
    public static Dialog m111981f(C16391a c16391a) {
        return c16391a.f86481a.dialog().m20516L(v7c0.f180368o).m20517M(f6c0.f95734d0).m20498C(t100.m186890d(24.0f), 0, t100.m186890d(24.0f), 0).m20496B(c16391a.f86497q).m20567z();
    }

    /* JADX INFO: renamed from: e */
    public void m111982e() {
        this.f86478a.dismiss();
    }

    /* JADX INFO: renamed from: g */
    public Dialog m111983g() {
        return this.f86478a;
    }

    /* JADX INFO: renamed from: h */
    public BusinessAnimView m111984h() {
        return this.f86479b;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m111985i(C16391a c16391a) {
        if (NullChecker.m81303a(c16391a.f86485e)) {
            c16391a.f86485e.call(this);
        }
        m111982e();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m111986j(C16391a c16391a) {
        if (NullChecker.m81303a(c16391a.f86486f)) {
            c16391a.f86486f.call(this);
        }
        if (c16391a.f86501u) {
            m111982e();
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m111987k(DialogInterface.OnDismissListener onDismissListener, DialogInterface dialogInterface) {
        if (NullChecker.m81303a(onDismissListener)) {
            onDismissListener.onDismiss(dialogInterface);
        }
        i0e.m133796e(this.f86480c);
    }

    /* JADX INFO: renamed from: l */
    public void m111988l(final DialogInterface.OnCancelListener onCancelListener) {
        this.f86478a.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.cj3
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                dj3.m111977a(onCancelListener, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m111989m(final DialogInterface.OnDismissListener onDismissListener) {
        this.f86478a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.bj3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f75862a.m111987k(onDismissListener, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m111990n(cwf0 cwf0Var) {
        this.f86480c = cwf0Var;
    }

    /* JADX INFO: renamed from: o */
    public void m111991o() {
        this.f86478a.show();
        i0e.m133797f(this.f86480c);
    }
}
