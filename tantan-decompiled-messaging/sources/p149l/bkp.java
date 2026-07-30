package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.List;
import p147v.AutoVDraweeView;
import p147v.VFrame;

/* JADX INFO: loaded from: classes4.dex */
public class bkp {

    /* JADX INFO: renamed from: a */
    public VFrame f76066a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f76067b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f76068c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f76069d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f76070e;

    /* JADX INFO: renamed from: f */
    public l5j0 f76071f;

    /* JADX INFO: renamed from: g */
    public final Act f76072g;

    /* JADX INFO: renamed from: h */
    public String f76073h;

    /* JADX INFO: renamed from: i */
    public boolean f76074i;

    /* JADX INFO: renamed from: j */
    public List<C8765d> f76075j;

    /* JADX INFO: renamed from: k */
    public f30<C8765d, Boolean> f76076k;

    /* JADX INFO: renamed from: l */
    public cwf0 f76077l;

    /* JADX INFO: renamed from: m */
    public d30 f76078m;

    /* JADX INFO: renamed from: n */
    public d30 f76079n;

    /* JADX INFO: renamed from: p */
    public yjp f76081p;

    /* JADX INFO: renamed from: q */
    public fkp f76082q;

    /* JADX INFO: renamed from: r */
    public boolean f76083r;

    /* JADX INFO: renamed from: o */
    public boolean f76080o = true;

    /* JADX INFO: renamed from: s */
    public PurchaseType f76084s = PurchaseType.TYPE_ULTRA_PREMIUM;

    /* JADX INFO: renamed from: t */
    public final DialogInterface.OnDismissListener f76085t = new DialogInterfaceOnDismissListenerC15895a();

    /* JADX INFO: renamed from: u */
    public final DialogInterface.OnCancelListener f76086u = new DialogInterfaceOnCancelListenerC15896b();

    /* JADX INFO: renamed from: v */
    public final e30<Integer> f76087v = new e30() { // from class: l.akp
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f70291a.m102477n((Integer) obj);
        }
    };

    /* JADX INFO: renamed from: l.bkp$a */
    public class DialogInterfaceOnDismissListenerC15895a implements DialogInterface.OnDismissListener {
        public DialogInterfaceOnDismissListenerC15895a() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            bkp bkpVar = bkp.this;
            if (bkpVar.f76080o && NullChecker.m81303a(bkpVar.f76079n)) {
                bkp.this.f76079n.call();
            }
            CoreModule.m29935P().m94651a().mo33308E9();
            i0e.m133796e(bkp.this.f76077l);
            bkp.this.m102471C();
        }
    }

    /* JADX INFO: renamed from: l.bkp$b */
    public class DialogInterfaceOnCancelListenerC15896b implements DialogInterface.OnCancelListener {
        public DialogInterfaceOnCancelListenerC15896b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (NullChecker.m81303a(bkp.this.f76078m)) {
                bkp.this.f76078m.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.bkp$c */
    public class ViewTreeObserverOnGlobalLayoutListenerC15897c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f76090a;

        public ViewTreeObserverOnGlobalLayoutListenerC15897c(BottomSheetBehavior bottomSheetBehavior) {
            this.f76090a = bottomSheetBehavior;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f76090a.setPeekHeight(bkp.this.f76066a.getHeight());
            bkp.this.f76066a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: l.bkp$d */
    public static /* synthetic */ class C15898d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f76092a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f76092a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f76092a[PurchaseType.TYPE_ULTRA_PREMIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: l.bkp$e */
    public static class DialogInterfaceOnCancelListenerC15899e implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final WeakReference<bkp> f76093a;

        public DialogInterfaceOnCancelListenerC15899e(bkp bkpVar) {
            this.f76093a = new WeakReference<>(bkpVar);
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            bkp bkpVar = this.f76093a.get();
            if (bkpVar == null || bkpVar.m102475l() == null) {
                return;
            }
            bkpVar.f76086u.onCancel(dialogInterface);
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            bkp bkpVar = this.f76093a.get();
            if (bkpVar == null || bkpVar.m102475l() == null) {
                return;
            }
            bkpVar.f76085t.onDismiss(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: l.bkp$f */
    public static class C15900f {

        /* JADX INFO: renamed from: a */
        public final Act f76094a;

        /* JADX INFO: renamed from: b */
        public PurchaseType f76095b;

        /* JADX INFO: renamed from: c */
        public String f76096c;

        /* JADX INFO: renamed from: d */
        public boolean f76097d;

        /* JADX INFO: renamed from: e */
        public f30<C8765d, Boolean> f76098e;

        /* JADX INFO: renamed from: f */
        public List<C8765d> f76099f;

        /* JADX INFO: renamed from: g */
        public d30 f76100g;

        /* JADX INFO: renamed from: h */
        public d30 f76101h;

        public C15900f(Act act) {
            this.f76094a = act;
        }

        /* JADX INFO: renamed from: a */
        public bkp m102490a() {
            bkp bkpVar = new bkp(this.f76094a);
            bkpVar.m102483t(this.f76096c);
            bkpVar.m102485v(this.f76100g);
            bkpVar.m102489z(this.f76095b);
            if (!sab0.m182899q(this.f76095b) || ura.m195053e().m195057d().mo33910qq()) {
                bkpVar.m102484u(this.f76097d);
            } else {
                bkpVar.m102484u(false);
            }
            bkpVar.m102487x(this.f76099f);
            bkpVar.m102482s(this.f76098e);
            bkpVar.m102486w(this.f76101h);
            return bkpVar;
        }

        /* JADX INFO: renamed from: b */
        public C15900f m102491b(f30<C8765d, Boolean> f30Var) {
            this.f76098e = f30Var;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C15900f m102492c(String str) {
            this.f76096c = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C15900f m102493d(boolean z) {
            this.f76097d = z;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C15900f m102494e(List<C8765d> list) {
            this.f76099f = list;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C15900f m102495f(PurchaseType purchaseType) {
            this.f76095b = purchaseType;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public bkp m102496g() {
            bkp bkpVarM102490a = m102490a();
            bkpVarM102490a.m102469A();
            return bkpVarM102490a;
        }
    }

    public bkp(Act act) {
        this.f76072g = act;
    }

    /* JADX INFO: renamed from: A */
    public final void m102469A() {
        if (vwb.m200296J(this.f76075j)) {
            return;
        }
        this.f76071f = new l5j0(this.f76072g, y7c0.f196696f);
        View viewInflate = LayoutInflater.from(this.f76072g).inflate(m6c0.f131580d3, (ViewGroup) null);
        m102472i(viewInflate);
        this.f76071f.setContentView(viewInflate);
        DialogInterfaceOnCancelListenerC15899e dialogInterfaceOnCancelListenerC15899e = new DialogInterfaceOnCancelListenerC15899e(this);
        this.f76071f.setOnDismissListener(dialogInterfaceOnCancelListenerC15899e);
        this.f76071f.setOnCancelListener(dialogInterfaceOnCancelListenerC15899e);
        this.f76083r = m102476m();
        this.f76077l = i0e.m133794c("p_select_upgrade_duration_pop", getClass().getName());
        m102478o();
        this.f76071f.show();
        m102480q();
    }

    /* JADX INFO: renamed from: B */
    public final void m102470B(List<C8765d> list) {
        i0e.m133797f(this.f76077l);
    }

    /* JADX INFO: renamed from: C */
    public void m102471C() {
        if (NullChecker.m81303a(this.f76082q)) {
            this.f76082q.m121878c();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m102472i(View view) {
        ckp.m107424a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public void m102473j() {
        l5j0 l5j0Var = this.f76071f;
        if (l5j0Var == null || !l5j0Var.isShowing()) {
            return;
        }
        this.f76071f.dismiss();
    }

    /* JADX INFO: renamed from: k */
    public final void m102474k() {
        Window window = this.f76071f.getWindow();
        if (NullChecker.m81303a(window)) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) window.findViewById(R.id.content).findViewById(z4c0.f201574y));
            bottomSheetBehaviorFrom.setHideable(false);
            bottomSheetBehaviorFrom.setState(3);
            this.f76066a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC15897c(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: l */
    public l5j0 m102475l() {
        return this.f76071f;
    }

    /* JADX INFO: renamed from: m */
    public boolean m102476m() {
        return xdl0.m208408w0() <= 1280;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m102477n(Integer num) {
        if (NullChecker.m81303a(this.f76071f)) {
            if (num.intValue() == -1) {
                this.f76071f.hide();
                return;
            }
            if (num.intValue() == 0 || num.intValue() == 2) {
                if (num.intValue() == 2) {
                    m102488y(false);
                }
                this.f76071f.dismiss();
            } else if (num.intValue() == 1) {
                this.f76071f.show();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m102478o() {
        String str;
        String str2;
        xdl0.m208344M(this.f76067b, true);
        xdl0.m208344M(this.f76068c, true);
        int i = C15898d.f76092a[this.f76084s.ordinal()];
        String str3 = "";
        if (i != 1) {
            if (i != 2) {
                str = "";
            } else if (this.f76074i) {
                str2 = "https://auto.tancdn.com/v1/images/eyJpZCI6IjM1NkU0NUNEMDU2MzRGODdBQzgxQUNFMDQ5MjRFNjM5IiwidyI6NzUwLCJoIjoxMjY0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MCwicHQiOjIwMjUwODE4MTd9.png";
                str3 = str2;
                str = "";
            } else {
                this.f76067b.setBackgroundResource(d3c0.f83518C2);
                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkI5RTc1OUUwMDhDNTQ1QTE5RjM5MDJDQjQyODc4NDI5IiwidyI6NzUwLCJoIjo4MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjM3MDE3NzkwLCJwdCI6MjAyNTA4MTgxN30.png";
            }
        } else if (this.f76074i) {
            str2 = "https://auto.tancdn.com/v1/images/eyJpZCI6IjNCQTY4MzM3OUY3QzQxNTA5ODg2MTIwNzQ2MDhEMkUwIiwidyI6NzUwLCJoIjoxMjY0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NDI5NDk2NzM2MCwicHQiOjIwMjUwODE4MTd9.png";
            str3 = str2;
            str = "";
        } else {
            this.f76067b.setBackgroundResource(d3c0.f83518C2);
            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkQ2MUE2MTkzNzIwRDQ5RERBMEM3MEMwQ0FEMDRCMTIyIiwidyI6NzUwLCJoIjo4MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3ODMsInB0IjoyMDI1MDgxODE3fQ.png";
        }
        this.f76067b.setImageUrl(str3);
        this.f76068c.setImageUrl(str);
        m102479p();
        m102481r();
    }

    /* JADX INFO: renamed from: p */
    public final void m102479p() {
        yjp yjpVar = new yjp(this.f76072g);
        this.f76081p = yjpVar;
        View viewM215073c = yjpVar.m215073c(this.f76072g, this.f76069d);
        if (NullChecker.m81303a(viewM215073c)) {
            this.f76081p.m215076f(this.f76087v);
            this.f76081p.m215074d(this.f76072g, this.f76084s, this.f76074i);
            this.f76069d.addView(viewM215073c, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m102480q() {
        if (vwb.m200296J(this.f76075j)) {
            return;
        }
        m102470B(this.f76075j);
        if (NullChecker.m81304b(this.f76075j)) {
            this.f76082q.m121879d(this.f76075j, this.f76076k, this.f76087v);
        }
        m102474k();
    }

    /* JADX INFO: renamed from: r */
    public final void m102481r() {
        fkp fkpVar = new fkp(this.f76072g, this.f76084s, this.f76074i);
        this.f76082q = fkpVar;
        View viewM121877b = fkpVar.m121877b(this.f76070e, this.f76083r);
        if (NullChecker.m81303a(viewM121877b)) {
            this.f76070e.addView(viewM121877b, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    /* JADX INFO: renamed from: s */
    public void m102482s(f30<C8765d, Boolean> f30Var) {
        this.f76076k = f30Var;
    }

    /* JADX INFO: renamed from: t */
    public final void m102483t(String str) {
        this.f76073h = str;
    }

    /* JADX INFO: renamed from: u */
    public void m102484u(boolean z) {
        this.f76074i = z;
    }

    /* JADX INFO: renamed from: v */
    public void m102485v(d30 d30Var) {
        this.f76078m = d30Var;
    }

    /* JADX INFO: renamed from: w */
    public void m102486w(d30 d30Var) {
        this.f76079n = d30Var;
    }

    /* JADX INFO: renamed from: x */
    public void m102487x(List<C8765d> list) {
        this.f76075j = list;
    }

    /* JADX INFO: renamed from: y */
    public void m102488y(boolean z) {
        this.f76080o = z;
    }

    /* JADX INFO: renamed from: z */
    public void m102489z(PurchaseType purchaseType) {
        this.f76084s = purchaseType;
    }
}
