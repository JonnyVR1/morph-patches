package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class nxm {

    /* JADX INFO: renamed from: a */
    public LinearLayout f144159a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f144160b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f144161c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f144162d;

    /* JADX INFO: renamed from: e */
    public pej0 f144163e;

    /* JADX INFO: renamed from: f */
    public final Act f144164f;

    /* JADX INFO: renamed from: g */
    public String f144165g;

    /* JADX INFO: renamed from: h */
    public l4g0 f144166h;

    /* JADX INFO: renamed from: i */
    public x20 f144167i;

    /* JADX INFO: renamed from: j */
    public x20 f144168j;

    /* JADX INFO: renamed from: l */
    public qxm f144170l;

    /* JADX INFO: renamed from: m */
    public exm f144171m;

    /* JADX INFO: renamed from: n */
    public uxm f144172n;

    /* JADX INFO: renamed from: o */
    public a30<PurchaseType, Act, String> f144173o;

    /* JADX INFO: renamed from: p */
    public kcg0 f144174p;

    /* JADX INFO: renamed from: q */
    public kcg0 f144175q;

    /* JADX INFO: renamed from: r */
    public boolean f144176r;

    /* JADX INFO: renamed from: s */
    public User f144177s;

    /* JADX INFO: renamed from: t */
    public Privilege f144178t;

    /* JADX INFO: renamed from: z */
    public static final int[] f144158z = {1, 5, 10};

    /* JADX INFO: renamed from: A */
    public static final int[] f144157A = {1, 10, 20, 50};

    /* JADX INFO: renamed from: k */
    public boolean f144169k = true;

    /* JADX INFO: renamed from: u */
    public PurchaseType f144179u = PurchaseType.TYPE_INSTANT_CHAT;

    /* JADX INFO: renamed from: v */
    public final DialogInterface.OnDismissListener f144180v = new DialogInterfaceOnDismissListenerC18980a();

    /* JADX INFO: renamed from: w */
    public final DialogInterface.OnCancelListener f144181w = new DialogInterfaceOnCancelListenerC18981b();

    /* JADX INFO: renamed from: x */
    public final y20<Integer> f144182x = new y20() { // from class: l.lxm
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f133968a.m165196t((Integer) obj);
        }
    };

    /* JADX INFO: renamed from: y */
    public final z20<C8928d, Boolean> f144183y = new z20() { // from class: l.mxm
        @Override // p153l.z20
        public final void call(Object obj, Object obj2) {
            this.f139255a.m165197u((C8928d) obj, (Boolean) obj2);
        }
    };

    /* JADX INFO: renamed from: l.nxm$a */
    public class DialogInterfaceOnDismissListenerC18980a implements DialogInterface.OnDismissListener {
        public DialogInterfaceOnDismissListenerC18980a() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            nxm nxmVar = nxm.this;
            if (nxmVar.f144169k && NullChecker.m82486a(nxmVar.f144168j)) {
                nxm.this.f144168j.call();
            }
            CoreModule.m30933P().m143405a().mo34311E9();
            w1e.m204401e(nxm.this.f144166h);
            nxm.this.m165190L();
        }
    }

    /* JADX INFO: renamed from: l.nxm$b */
    public class DialogInterfaceOnCancelListenerC18981b implements DialogInterface.OnCancelListener {
        public DialogInterfaceOnCancelListenerC18981b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (NullChecker.m82486a(nxm.this.f144167i)) {
                nxm.this.f144167i.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.nxm$c */
    public class ViewTreeObserverOnGlobalLayoutListenerC18982c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f144186a;

        public ViewTreeObserverOnGlobalLayoutListenerC18982c(BottomSheetBehavior bottomSheetBehavior) {
            this.f144186a = bottomSheetBehavior;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f144186a.setPeekHeight(nxm.this.f144159a.getHeight());
            nxm.this.f144159a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: l.nxm$d */
    public static class DialogInterfaceOnCancelListenerC18983d implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final WeakReference<nxm> f144188a;

        public DialogInterfaceOnCancelListenerC18983d(nxm nxmVar) {
            this.f144188a = new WeakReference<>(nxmVar);
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            nxm nxmVar = this.f144188a.get();
            if (nxmVar == null || nxmVar.m165194r() == null) {
                return;
            }
            nxmVar.f144181w.onCancel(dialogInterface);
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            nxm nxmVar = this.f144188a.get();
            if (nxmVar == null || nxmVar.m165194r() == null) {
                return;
            }
            nxmVar.f144180v.onDismiss(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: l.nxm$e */
    public static class C18984e {

        /* JADX INFO: renamed from: a */
        public final Act f144189a;

        /* JADX INFO: renamed from: b */
        public String f144190b;

        /* JADX INFO: renamed from: c */
        public a30<PurchaseType, Act, String> f144191c;

        /* JADX INFO: renamed from: d */
        public User f144192d;

        /* JADX INFO: renamed from: e */
        public x20 f144193e;

        /* JADX INFO: renamed from: f */
        public x20 f144194f;

        public C18984e(Act act) {
            this.f144189a = act;
        }

        /* JADX INFO: renamed from: a */
        public nxm m165203a() {
            nxm nxmVar = new nxm(this.f144189a);
            nxmVar.m165182D(this.f144190b);
            nxmVar.m165183E(this.f144193e);
            nxmVar.m165185G(this.f144191c);
            nxmVar.m165187I(this.f144192d);
            nxmVar.m165184F(this.f144194f);
            return nxmVar;
        }

        /* JADX INFO: renamed from: b */
        public C18984e m165204b(String str) {
            this.f144190b = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C18984e m165205c(a30<PurchaseType, Act, String> a30Var) {
            this.f144191c = a30Var;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public nxm m165206d() {
            nxm nxmVarM165203a = m165203a();
            nxmVarM165203a.m165188J();
            return nxmVarM165203a;
        }
    }

    public nxm(Act act) {
        this.f144164f = act;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Boolean m165170f(int[] iArr, C8928d c8928d) {
        C8928d.a aVarM54705d = c8928d.m54705d();
        if (aVarM54705d == null) {
            return Boolean.FALSE;
        }
        int iM54788w = aVarM54705d.m54788w();
        for (int i : iArr) {
            if (i == iM54788w) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: A */
    public final void m165179A() {
        qxm qxmVar = new qxm(this.f144164f);
        this.f144170l = qxmVar;
        View viewM178609c = qxmVar.m178609c(this.f144164f, this.f144160b);
        if (NullChecker.m82486a(viewM178609c)) {
            this.f144170l.m178613g(this.f144182x);
            qxm qxmVar2 = this.f144170l;
            qxmVar2.f160062i = this.f144178t;
            qxmVar2.m178611e(this.f144164f, this.f144177s, m165195s());
            this.f144160b.addView(viewM178609c, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m165180B() {
        final ProductCategory productCategory = ProductCategory.get(ProductCategory.tttInstantChat);
        this.f144174p = psd0.m173625r(CoreModule.f18264c.f20396j0.m31649z5(productCategory, false).filter(new qcj() { // from class: l.gxm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new qcj() { // from class: l.hxm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f112025a.m165198v((List) obj);
            }
        }), CoreModule.f18264c.f20337P1.m119515h3(), new rcj() { // from class: l.ixm
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return jyb.m147494Y((List) obj, (Envelope) obj2);
            }
        }).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.jxm
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123047a.m165199w(productCategory, (pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public final void m165181C() {
        uxm uxmVar = new uxm(this.f144164f, this.f144179u);
        this.f144172n = uxmVar;
        View viewM198504b = uxmVar.m198504b(this.f144161c, this.f144176r);
        if (NullChecker.m82486a(viewM198504b)) {
            this.f144161c.addView(viewM198504b, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m165182D(String str) {
        this.f144165g = str;
    }

    /* JADX INFO: renamed from: E */
    public void m165183E(x20 x20Var) {
        this.f144167i = x20Var;
    }

    /* JADX INFO: renamed from: F */
    public void m165184F(x20 x20Var) {
        this.f144168j = x20Var;
    }

    /* JADX INFO: renamed from: G */
    public void m165185G(a30<PurchaseType, Act, String> a30Var) {
        this.f144173o = a30Var;
    }

    /* JADX INFO: renamed from: H */
    public void m165186H(boolean z) {
        this.f144169k = z;
    }

    /* JADX INFO: renamed from: I */
    public void m165187I(User user) {
        this.f144177s = user;
    }

    /* JADX INFO: renamed from: J */
    public final void m165188J() {
        pej0 pej0Var = new pej0(this.f144164f, dgc0.f88282g);
        this.f144163e = pej0Var;
        pej0Var.m172032u(g6e.f102429c);
        View viewInflate = LayoutInflater.from(this.f144164f).inflate(rec0.f162555g3, (ViewGroup) null);
        m165191o(viewInflate);
        this.f144163e.setContentView(viewInflate);
        DialogInterfaceOnCancelListenerC18983d dialogInterfaceOnCancelListenerC18983d = new DialogInterfaceOnCancelListenerC18983d(this);
        this.f144163e.setOnDismissListener(dialogInterfaceOnCancelListenerC18983d);
        this.f144163e.setOnCancelListener(dialogInterfaceOnCancelListenerC18983d);
        this.f144176r = m165195s();
        this.f144166h = w1e.m204399c("p_intl_instantmatch_iap_view", getClass().getName());
        m165201y();
        this.f144163e.show();
        m165180B();
        CoreModule.f18264c.f20297C0.m146425v4();
        x95.INSTANCE.m209793m("Purchase Page(Instant Match)", null);
    }

    /* JADX INFO: renamed from: K */
    public final void m165189K(List<C8928d> list) {
        w1e.m204402f(this.f144166h);
    }

    /* JADX INFO: renamed from: L */
    public void m165190L() {
        if (NullChecker.m82486a(this.f144174p) && !this.f144174p.isUnsubscribed()) {
            this.f144174p.unsubscribe();
            this.f144174p = null;
        }
        if (NullChecker.m82486a(this.f144175q) && !this.f144175q.isUnsubscribed()) {
            this.f144175q.unsubscribe();
            this.f144175q = null;
        }
        if (NullChecker.m82486a(this.f144172n)) {
            this.f144172n.m198505c();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m165191o(View view) {
        oxm.m169723a(this, view);
    }

    /* JADX INFO: renamed from: p */
    public final void m165192p() {
        Window window = this.f144163e.getWindow();
        if (NullChecker.m82486a(window)) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) window.findViewById(R.id.content).findViewById(fdc0.f98450y));
            bottomSheetBehaviorFrom.setState(3);
            this.f144159a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC18982c(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: q */
    public final List<C8928d> m165193q(List<C8928d> list) {
        final int[] iArr = joa.m146354D3() ? f144157A : f144158z;
        return jyb.m147522n(list, new qcj() { // from class: l.kxm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return nxm.m165170f(iArr, (C8928d) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public pej0 m165194r() {
        return this.f144163e;
    }

    /* JADX INFO: renamed from: s */
    public boolean m165195s() {
        return bnl0.m105588w0() <= 1280;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m165196t(Integer num) {
        if (NullChecker.m82486a(this.f144163e)) {
            if (num.intValue() == -1) {
                this.f144163e.hide();
                return;
            }
            if (num.intValue() == 0 || num.intValue() == 2) {
                if (num.intValue() == 2) {
                    m165186H(false);
                }
                this.f144163e.dismiss();
            } else if (num.intValue() == 1) {
                this.f144163e.show();
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m165197u(C8928d c8928d, Boolean bool) {
        if (NullChecker.m82486a(this.f144171m)) {
            this.f144171m.m123082m(c8928d);
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C22421c m165198v(List list) {
        return CoreModule.f18273l.m143405a().mo34507g5(this.f144164f, list);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m165199w(ProductCategory productCategory, pf60 pf60Var) {
        m165200x(productCategory, (List) pf60Var.f152156a);
        m165192p();
    }

    /* JADX INFO: renamed from: x */
    public final void m165200x(ProductCategory productCategory, List<Merchandise> list) {
        List<C8928d> listMo147671a = zry.m221275z(productCategory).mo147671a(this.f144164f, this.f144179u, productCategory, list);
        if (jyb.m147479J(listMo147671a)) {
            return;
        }
        List<C8928d> listM165193q = m165193q(listMo147671a);
        if (jyb.m147479J(listM165193q)) {
            return;
        }
        m165189K(listM165193q);
        int iMin = Math.min(1, listM165193q.size() - 1);
        int i = 0;
        while (i < listM165193q.size()) {
            listM165193q.get(i).m54723v(i == iMin);
            i++;
        }
        this.f144171m.m123077g();
        if (NullChecker.m82487b(listM165193q)) {
            this.f144172n.m198506d(listM165193q, this.f144183y, this.f144182x);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m165201y() {
        m165179A();
        m165181C();
        m165202z();
    }

    /* JADX INFO: renamed from: z */
    public final void m165202z() {
        exm exmVar = new exm(this.f144164f, this.f144179u);
        this.f144171m = exmVar;
        View viewM123075e = exmVar.m123075e(this.f144162d, this.f144176r);
        if (NullChecker.m82486a(viewM123075e)) {
            this.f144171m.m123083n(this.f144182x, this.f144167i);
            this.f144171m.m123085p(this.f144165g);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            this.f144171m.m123086q(this.f144173o);
            this.f144162d.addView(viewM123075e, layoutParams);
        }
    }
}
