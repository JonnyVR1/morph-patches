package p002l;

import android.R;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.List;
import l.ckp;
import l.cwf0;
import l.d30;
import l.d3c0;
import l.e30;
import l.f30;
import l.i0e;
import l.l5j0;
import l.m6c0;
import l.sab0;
import l.ura;
import l.vwb;
import l.xdl0;
import l.y7c0;
import l.z4c0;
import v.AutoVDraweeView;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bkp {

    /* JADX INFO: renamed from: a */
    public VFrame f8210a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f8211b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f8212c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f8213d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f8214e;

    /* JADX INFO: renamed from: f */
    public l5j0 f8215f;

    /* JADX INFO: renamed from: g */
    public final Act f8216g;

    /* JADX INFO: renamed from: h */
    public String f8217h;

    /* JADX INFO: renamed from: i */
    public boolean f8218i;

    /* JADX INFO: renamed from: j */
    public List<C0190d> f8219j;

    /* JADX INFO: renamed from: k */
    public f30<C0190d, Boolean> f8220k;

    /* JADX INFO: renamed from: l */
    public cwf0 f8221l;

    /* JADX INFO: renamed from: m */
    public d30 f8222m;

    /* JADX INFO: renamed from: n */
    public d30 f8223n;

    /* JADX INFO: renamed from: p */
    public yjp f8225p;

    /* JADX INFO: renamed from: q */
    public fkp f8226q;

    /* JADX INFO: renamed from: r */
    public boolean f8227r;

    /* JADX INFO: renamed from: o */
    public boolean f8224o = true;

    /* JADX INFO: renamed from: s */
    public PurchaseType f8228s = PurchaseType.TYPE_ULTRA_PREMIUM;

    /* JADX INFO: renamed from: t */
    public final DialogInterface.OnDismissListener f8229t = new DialogInterfaceOnDismissListenerC0499a();

    /* JADX INFO: renamed from: u */
    public final DialogInterface.OnCancelListener f8230u = new DialogInterfaceOnCancelListenerC0500b();

    /* JADX INFO: renamed from: v */
    public final e30<Integer> f8231v = new e30() { // from class: l.akp
        public final void call(Object obj) {
            this.f7673a.m10437n((Integer) obj);
        }
    };

    /* JADX INFO: renamed from: l.bkp$a */
    public class DialogInterfaceOnDismissListenerC0499a implements DialogInterface.OnDismissListener {
        public DialogInterfaceOnDismissListenerC0499a() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            bkp bkpVar = bkp.this;
            if (bkpVar.f8224o && NullChecker.a(bkpVar.f8223n)) {
                bkp.this.f8223n.call();
            }
            CoreModule.P().a().E9();
            i0e.e(bkp.this.f8221l);
            bkp.this.m10431C();
        }
    }

    /* JADX INFO: renamed from: l.bkp$b */
    public class DialogInterfaceOnCancelListenerC0500b implements DialogInterface.OnCancelListener {
        public DialogInterfaceOnCancelListenerC0500b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (NullChecker.a(bkp.this.f8222m)) {
                bkp.this.f8222m.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.bkp$c */
    public class ViewTreeObserverOnGlobalLayoutListenerC0501c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f8234a;

        public ViewTreeObserverOnGlobalLayoutListenerC0501c(BottomSheetBehavior bottomSheetBehavior) {
            this.f8234a = bottomSheetBehavior;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f8234a.setPeekHeight(bkp.this.f8210a.getHeight());
            bkp.this.f8210a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: l.bkp$d */
    public static /* synthetic */ class C0502d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f8236a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f8236a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8236a[PurchaseType.TYPE_ULTRA_PREMIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: l.bkp$e */
    public static class DialogInterfaceOnCancelListenerC0503e implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final WeakReference<bkp> f8237a;

        public DialogInterfaceOnCancelListenerC0503e(bkp bkpVar) {
            this.f8237a = new WeakReference<>(bkpVar);
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            bkp bkpVar = this.f8237a.get();
            if (bkpVar == null || bkpVar.m10435l() == null) {
                return;
            }
            bkpVar.f8230u.onCancel(dialogInterface);
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            bkp bkpVar = this.f8237a.get();
            if (bkpVar == null || bkpVar.m10435l() == null) {
                return;
            }
            bkpVar.f8229t.onDismiss(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: l.bkp$f */
    public static class C0504f {

        /* JADX INFO: renamed from: a */
        public final Act f8238a;

        /* JADX INFO: renamed from: b */
        public PurchaseType f8239b;

        /* JADX INFO: renamed from: c */
        public String f8240c;

        /* JADX INFO: renamed from: d */
        public boolean f8241d;

        /* JADX INFO: renamed from: e */
        public f30<C0190d, Boolean> f8242e;

        /* JADX INFO: renamed from: f */
        public List<C0190d> f8243f;

        /* JADX INFO: renamed from: g */
        public d30 f8244g;

        /* JADX INFO: renamed from: h */
        public d30 f8245h;

        public C0504f(Act act) {
            this.f8238a = act;
        }

        /* JADX INFO: renamed from: a */
        public bkp m10450a() {
            bkp bkpVar = new bkp(this.f8238a);
            bkpVar.m10443t(this.f8240c);
            bkpVar.m10445v(this.f8244g);
            bkpVar.m10449z(this.f8239b);
            if (!sab0.q(this.f8239b) || ura.e().d().qq()) {
                bkpVar.m10444u(this.f8241d);
            } else {
                bkpVar.m10444u(false);
            }
            bkpVar.m10447x(this.f8243f);
            bkpVar.m10442s(this.f8242e);
            bkpVar.m10446w(this.f8245h);
            return bkpVar;
        }

        /* JADX INFO: renamed from: b */
        public C0504f m10451b(f30<C0190d, Boolean> f30Var) {
            this.f8242e = f30Var;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C0504f m10452c(String str) {
            this.f8240c = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C0504f m10453d(boolean z) {
            this.f8241d = z;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C0504f m10454e(List<C0190d> list) {
            this.f8243f = list;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C0504f m10455f(PurchaseType purchaseType) {
            this.f8239b = purchaseType;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public bkp m10456g() {
            bkp bkpVarM10450a = m10450a();
            bkpVarM10450a.m10429A();
            return bkpVarM10450a;
        }
    }

    public bkp(Act act) {
        this.f8216g = act;
    }

    /* JADX INFO: renamed from: A */
    public final void m10429A() {
        if (vwb.J(this.f8219j)) {
            return;
        }
        this.f8215f = new l5j0(this.f8216g, y7c0.f);
        View viewInflate = LayoutInflater.from(this.f8216g).inflate(m6c0.d3, (ViewGroup) null);
        m10432i(viewInflate);
        this.f8215f.setContentView(viewInflate);
        DialogInterfaceOnCancelListenerC0503e dialogInterfaceOnCancelListenerC0503e = new DialogInterfaceOnCancelListenerC0503e(this);
        this.f8215f.setOnDismissListener(dialogInterfaceOnCancelListenerC0503e);
        this.f8215f.setOnCancelListener(dialogInterfaceOnCancelListenerC0503e);
        this.f8227r = m10436m();
        this.f8221l = i0e.c("p_select_upgrade_duration_pop", getClass().getName());
        m10438o();
        this.f8215f.show();
        m10440q();
    }

    /* JADX INFO: renamed from: B */
    public final void m10430B(List<C0190d> list) {
        i0e.f(this.f8221l);
    }

    /* JADX INFO: renamed from: C */
    public void m10431C() {
        if (NullChecker.a(this.f8226q)) {
            this.f8226q.m13270c();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m10432i(View view) {
        ckp.a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public void m10433j() {
        l5j0 l5j0Var = this.f8215f;
        if (l5j0Var == null || !l5j0Var.isShowing()) {
            return;
        }
        this.f8215f.dismiss();
    }

    /* JADX INFO: renamed from: k */
    public final void m10434k() {
        Window window = this.f8215f.getWindow();
        if (NullChecker.a(window)) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) window.findViewById(R.id.content).findViewById(z4c0.y));
            bottomSheetBehaviorFrom.setHideable(false);
            bottomSheetBehaviorFrom.setState(3);
            this.f8210a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0501c(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: l */
    public l5j0 m10435l() {
        return this.f8215f;
    }

    /* JADX INFO: renamed from: m */
    public boolean m10436m() {
        return xdl0.w0() <= 1280;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m10437n(Integer num) {
        if (NullChecker.a(this.f8215f)) {
            if (num.intValue() == -1) {
                this.f8215f.hide();
                return;
            }
            if (num.intValue() == 0 || num.intValue() == 2) {
                if (num.intValue() == 2) {
                    m10448y(false);
                }
                this.f8215f.dismiss();
            } else if (num.intValue() == 1) {
                this.f8215f.show();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m10438o() {
        String str;
        String str2;
        xdl0.M(this.f8211b, true);
        xdl0.M(this.f8212c, true);
        int i = C0502d.f8236a[this.f8228s.ordinal()];
        String str3 = "";
        if (i != 1) {
            if (i != 2) {
                str = "";
            } else if (this.f8218i) {
                str2 = "https://auto.tancdn.com/v1/images/eyJpZCI6IjM1NkU0NUNEMDU2MzRGODdBQzgxQUNFMDQ5MjRFNjM5IiwidyI6NzUwLCJoIjoxMjY0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MCwicHQiOjIwMjUwODE4MTd9.png";
                str3 = str2;
                str = "";
            } else {
                this.f8211b.setBackgroundResource(d3c0.C2);
                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkI5RTc1OUUwMDhDNTQ1QTE5RjM5MDJDQjQyODc4NDI5IiwidyI6NzUwLCJoIjo4MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjM3MDE3NzkwLCJwdCI6MjAyNTA4MTgxN30.png";
            }
        } else if (this.f8218i) {
            str2 = "https://auto.tancdn.com/v1/images/eyJpZCI6IjNCQTY4MzM3OUY3QzQxNTA5ODg2MTIwNzQ2MDhEMkUwIiwidyI6NzUwLCJoIjoxMjY0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NDI5NDk2NzM2MCwicHQiOjIwMjUwODE4MTd9.png";
            str3 = str2;
            str = "";
        } else {
            this.f8211b.setBackgroundResource(d3c0.C2);
            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkQ2MUE2MTkzNzIwRDQ5RERBMEM3MEMwQ0FEMDRCMTIyIiwidyI6NzUwLCJoIjo4MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3ODMsInB0IjoyMDI1MDgxODE3fQ.png";
        }
        this.f8211b.setImageUrl(str3);
        this.f8212c.setImageUrl(str);
        m10439p();
        m10441r();
    }

    /* JADX INFO: renamed from: p */
    public final void m10439p() {
        yjp yjpVar = new yjp(this.f8216g);
        this.f8225p = yjpVar;
        View viewM26776c = yjpVar.m26776c(this.f8216g, this.f8213d);
        if (NullChecker.a(viewM26776c)) {
            this.f8225p.m26779f(this.f8231v);
            this.f8225p.m26777d(this.f8216g, this.f8228s, this.f8218i);
            this.f8213d.addView(viewM26776c, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m10440q() {
        if (vwb.J(this.f8219j)) {
            return;
        }
        m10430B(this.f8219j);
        if (NullChecker.b(this.f8219j)) {
            this.f8226q.m13271d(this.f8219j, this.f8220k, this.f8231v);
        }
        m10434k();
    }

    /* JADX INFO: renamed from: r */
    public final void m10441r() {
        fkp fkpVar = new fkp(this.f8216g, this.f8228s, this.f8218i);
        this.f8226q = fkpVar;
        View viewM13269b = fkpVar.m13269b(this.f8214e, this.f8227r);
        if (NullChecker.a(viewM13269b)) {
            this.f8214e.addView(viewM13269b, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    /* JADX INFO: renamed from: s */
    public void m10442s(f30<C0190d, Boolean> f30Var) {
        this.f8220k = f30Var;
    }

    /* JADX INFO: renamed from: t */
    public final void m10443t(String str) {
        this.f8217h = str;
    }

    /* JADX INFO: renamed from: u */
    public void m10444u(boolean z) {
        this.f8218i = z;
    }

    /* JADX INFO: renamed from: v */
    public void m10445v(d30 d30Var) {
        this.f8222m = d30Var;
    }

    /* JADX INFO: renamed from: w */
    public void m10446w(d30 d30Var) {
        this.f8223n = d30Var;
    }

    /* JADX INFO: renamed from: x */
    public void m10447x(List<C0190d> list) {
        this.f8219j = list;
    }

    /* JADX INFO: renamed from: y */
    public void m10448y(boolean z) {
        this.f8224o = z;
    }

    /* JADX INFO: renamed from: z */
    public void m10449z(PurchaseType purchaseType) {
        this.f8228s = purchaseType;
    }
}
