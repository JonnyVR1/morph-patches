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
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import l.c4g0;
import l.cjy;
import l.cwf0;
import l.d30;
import l.e30;
import l.f30;
import l.g30;
import l.i0e;
import l.j760;
import l.jo0;
import l.l5j0;
import l.m6c0;
import l.mkd0;
import l.nvm;
import l.s4e;
import l.vwb;
import l.w85;
import l.w9j;
import l.x9j;
import l.xdl0;
import l.xma;
import l.y7c0;
import l.z4c0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mvm {

    /* JADX INFO: renamed from: a */
    public LinearLayout f15678a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f15679b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f15680c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f15681d;

    /* JADX INFO: renamed from: e */
    public l5j0 f15682e;

    /* JADX INFO: renamed from: f */
    public final Act f15683f;

    /* JADX INFO: renamed from: g */
    public String f15684g;

    /* JADX INFO: renamed from: h */
    public cwf0 f15685h;

    /* JADX INFO: renamed from: i */
    public d30 f15686i;

    /* JADX INFO: renamed from: j */
    public d30 f15687j;

    /* JADX INFO: renamed from: l */
    public pvm f15689l;

    /* JADX INFO: renamed from: m */
    public dvm f15690m;

    /* JADX INFO: renamed from: n */
    public tvm f15691n;

    /* JADX INFO: renamed from: o */
    public g30<PurchaseType, Act, String> f15692o;

    /* JADX INFO: renamed from: p */
    public c4g0 f15693p;

    /* JADX INFO: renamed from: q */
    public c4g0 f15694q;

    /* JADX INFO: renamed from: r */
    public boolean f15695r;

    /* JADX INFO: renamed from: s */
    public User f15696s;

    /* JADX INFO: renamed from: t */
    public Privilege f15697t;

    /* JADX INFO: renamed from: z */
    public static final int[] f15677z = {1, 5, 10};

    /* JADX INFO: renamed from: A */
    public static final int[] f15676A = {1, 10, 20, 50};

    /* JADX INFO: renamed from: k */
    public boolean f15688k = true;

    /* JADX INFO: renamed from: u */
    public PurchaseType f15698u = PurchaseType.TYPE_INSTANT_CHAT;

    /* JADX INFO: renamed from: v */
    public final DialogInterface.OnDismissListener f15699v = new DialogInterfaceOnDismissListenerC0687a();

    /* JADX INFO: renamed from: w */
    public final DialogInterface.OnCancelListener f15700w = new DialogInterfaceOnCancelListenerC0688b();

    /* JADX INFO: renamed from: x */
    public final e30<Integer> f15701x = new e30() { // from class: l.kvm
        public final void call(Object obj) {
            this.f14556a.m18282t((Integer) obj);
        }
    };

    /* JADX INFO: renamed from: y */
    public final f30<C0190d, Boolean> f15702y = new f30() { // from class: l.lvm
        public final void call(Object obj, Object obj2) {
            this.f15090a.m18283u((C0190d) obj, (Boolean) obj2);
        }
    };

    /* JADX INFO: renamed from: l.mvm$a */
    public class DialogInterfaceOnDismissListenerC0687a implements DialogInterface.OnDismissListener {
        public DialogInterfaceOnDismissListenerC0687a() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            mvm mvmVar = mvm.this;
            if (mvmVar.f15688k && NullChecker.a(mvmVar.f15687j)) {
                mvm.this.f15687j.call();
            }
            CoreModule.P().a().E9();
            i0e.e(mvm.this.f15685h);
            mvm.this.m18276L();
        }
    }

    /* JADX INFO: renamed from: l.mvm$b */
    public class DialogInterfaceOnCancelListenerC0688b implements DialogInterface.OnCancelListener {
        public DialogInterfaceOnCancelListenerC0688b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (NullChecker.a(mvm.this.f15686i)) {
                mvm.this.f15686i.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.mvm$c */
    public class ViewTreeObserverOnGlobalLayoutListenerC0689c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f15705a;

        public ViewTreeObserverOnGlobalLayoutListenerC0689c(BottomSheetBehavior bottomSheetBehavior) {
            this.f15705a = bottomSheetBehavior;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f15705a.setPeekHeight(mvm.this.f15678a.getHeight());
            mvm.this.f15678a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: l.mvm$d */
    public static class DialogInterfaceOnCancelListenerC0690d implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final WeakReference<mvm> f15707a;

        public DialogInterfaceOnCancelListenerC0690d(mvm mvmVar) {
            this.f15707a = new WeakReference<>(mvmVar);
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            mvm mvmVar = this.f15707a.get();
            if (mvmVar == null || mvmVar.m18280r() == null) {
                return;
            }
            mvmVar.f15700w.onCancel(dialogInterface);
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            mvm mvmVar = this.f15707a.get();
            if (mvmVar == null || mvmVar.m18280r() == null) {
                return;
            }
            mvmVar.f15699v.onDismiss(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: l.mvm$e */
    public static class C0691e {

        /* JADX INFO: renamed from: a */
        public final Act f15708a;

        /* JADX INFO: renamed from: b */
        public String f15709b;

        /* JADX INFO: renamed from: c */
        public g30<PurchaseType, Act, String> f15710c;

        /* JADX INFO: renamed from: d */
        public User f15711d;

        /* JADX INFO: renamed from: e */
        public d30 f15712e;

        /* JADX INFO: renamed from: f */
        public d30 f15713f;

        public C0691e(Act act) {
            this.f15708a = act;
        }

        /* JADX INFO: renamed from: a */
        public mvm m18289a() {
            mvm mvmVar = new mvm(this.f15708a);
            mvmVar.m18268D(this.f15709b);
            mvmVar.m18269E(this.f15712e);
            mvmVar.m18271G(this.f15710c);
            mvmVar.m18273I(this.f15711d);
            mvmVar.m18270F(this.f15713f);
            return mvmVar;
        }

        /* JADX INFO: renamed from: b */
        public C0691e m18290b(String str) {
            this.f15709b = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C0691e m18291c(g30<PurchaseType, Act, String> g30Var) {
            this.f15710c = g30Var;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public mvm m18292d() {
            mvm mvmVarM18289a = m18289a();
            mvmVarM18289a.m18274J();
            return mvmVarM18289a;
        }
    }

    public mvm(Act act) {
        this.f15683f = act;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Boolean m18256f(int[] iArr, C0190d c0190d) {
        C0190d.a aVarM4088d = c0190d.m4088d();
        if (aVarM4088d == null) {
            return Boolean.FALSE;
        }
        int iM4171w = aVarM4088d.m4171w();
        for (int i : iArr) {
            if (i == iM4171w) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: A */
    public final void m18265A() {
        pvm pvmVar = new pvm(this.f15683f);
        this.f15689l = pvmVar;
        View viewM20725c = pvmVar.m20725c(this.f15683f, this.f15679b);
        if (NullChecker.a(viewM20725c)) {
            this.f15689l.m20729g(this.f15701x);
            pvm pvmVar2 = this.f15689l;
            pvmVar2.f17698i = this.f15697t;
            pvmVar2.m20727e(this.f15683f, this.f15696s, m18281s());
            this.f15679b.addView(viewM20725c, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m18266B() {
        final ProductCategory productCategory = ProductCategory.get("tttInstantChat");
        this.f15693p = mkd0.r(CoreModule.c.j0.z5(productCategory, false).filter(new w9j() { // from class: l.fvm
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new w9j() { // from class: l.gvm
            public final Object call(Object obj) {
                return this.f11641a.m18284v((List) obj);
            }
        }), CoreModule.c.P1.h3(), new x9j() { // from class: l.hvm
            public final Object call(Object obj, Object obj2) {
                return vwb.Y((List) obj, (Envelope) obj2);
            }
        }).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.ivm
            public final void call(Object obj) {
                this.f13437a.m18285w(productCategory, (j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public final void m18267C() {
        tvm tvmVar = new tvm(this.f15683f, this.f15698u);
        this.f15691n = tvmVar;
        View viewM23187b = tvmVar.m23187b(this.f15680c, this.f15695r);
        if (NullChecker.a(viewM23187b)) {
            this.f15680c.addView(viewM23187b, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m18268D(String str) {
        this.f15684g = str;
    }

    /* JADX INFO: renamed from: E */
    public void m18269E(d30 d30Var) {
        this.f15686i = d30Var;
    }

    /* JADX INFO: renamed from: F */
    public void m18270F(d30 d30Var) {
        this.f15687j = d30Var;
    }

    /* JADX INFO: renamed from: G */
    public void m18271G(g30<PurchaseType, Act, String> g30Var) {
        this.f15692o = g30Var;
    }

    /* JADX INFO: renamed from: H */
    public void m18272H(boolean z) {
        this.f15688k = z;
    }

    /* JADX INFO: renamed from: I */
    public void m18273I(User user) {
        this.f15696s = user;
    }

    /* JADX INFO: renamed from: J */
    public final void m18274J() {
        l5j0 l5j0Var = new l5j0(this.f15683f, y7c0.f);
        this.f15682e = l5j0Var;
        l5j0Var.u(s4e.c);
        View viewInflate = LayoutInflater.from(this.f15683f).inflate(m6c0.g3, (ViewGroup) null);
        m18277o(viewInflate);
        this.f15682e.setContentView(viewInflate);
        DialogInterfaceOnCancelListenerC0690d dialogInterfaceOnCancelListenerC0690d = new DialogInterfaceOnCancelListenerC0690d(this);
        this.f15682e.setOnDismissListener(dialogInterfaceOnCancelListenerC0690d);
        this.f15682e.setOnCancelListener(dialogInterfaceOnCancelListenerC0690d);
        this.f15695r = m18281s();
        this.f15685h = i0e.c("p_intl_instantmatch_iap_view", getClass().getName());
        m18287y();
        this.f15682e.show();
        m18266B();
        CoreModule.c.C0.u4();
        w85.INSTANCE.m("Purchase Page(Instant Match)", (Map) null);
    }

    /* JADX INFO: renamed from: K */
    public final void m18275K(List<C0190d> list) {
        i0e.f(this.f15685h);
    }

    /* JADX INFO: renamed from: L */
    public void m18276L() {
        if (NullChecker.a(this.f15693p) && !this.f15693p.isUnsubscribed()) {
            this.f15693p.unsubscribe();
            this.f15693p = null;
        }
        if (NullChecker.a(this.f15694q) && !this.f15694q.isUnsubscribed()) {
            this.f15694q.unsubscribe();
            this.f15694q = null;
        }
        if (NullChecker.a(this.f15691n)) {
            this.f15691n.m23188c();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m18277o(View view) {
        nvm.a(this, view);
    }

    /* JADX INFO: renamed from: p */
    public final void m18278p() {
        Window window = this.f15682e.getWindow();
        if (NullChecker.a(window)) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) window.findViewById(R.id.content).findViewById(z4c0.y));
            bottomSheetBehaviorFrom.setState(3);
            this.f15678a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0689c(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: q */
    public final List<C0190d> m18279q(List<C0190d> list) {
        final int[] iArr = xma.C3() ? f15676A : f15677z;
        return vwb.n(list, new w9j() { // from class: l.jvm
            public final Object call(Object obj) {
                return mvm.m18256f(iArr, (C0190d) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public l5j0 m18280r() {
        return this.f15682e;
    }

    /* JADX INFO: renamed from: s */
    public boolean m18281s() {
        return xdl0.w0() <= 1280;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m18282t(Integer num) {
        if (NullChecker.a(this.f15682e)) {
            if (num.intValue() == -1) {
                this.f15682e.hide();
                return;
            }
            if (num.intValue() == 0 || num.intValue() == 2) {
                if (num.intValue() == 2) {
                    m18272H(false);
                }
                this.f15682e.dismiss();
            } else if (num.intValue() == 1) {
                this.f15682e.show();
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m18283u(C0190d c0190d, Boolean bool) {
        if (NullChecker.a(this.f15690m)) {
            this.f15690m.m12074m(c0190d);
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ c m18284v(List list) {
        return CoreModule.l.a().g5(this.f15683f, list);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m18285w(ProductCategory productCategory, j760 j760Var) {
        m18286x(productCategory, (List) j760Var.a);
        m18278p();
    }

    /* JADX INFO: renamed from: x */
    public final void m18286x(ProductCategory productCategory, List<Merchandise> list) {
        List<C0190d> listA = cjy.z(productCategory).a(this.f15683f, this.f15698u, productCategory, list);
        if (vwb.J(listA)) {
            return;
        }
        List<C0190d> listM18279q = m18279q(listA);
        if (vwb.J(listM18279q)) {
            return;
        }
        m18275K(listM18279q);
        int iMin = Math.min(1, listM18279q.size() - 1);
        int i = 0;
        while (i < listM18279q.size()) {
            listM18279q.get(i).m4106v(i == iMin);
            i++;
        }
        this.f15690m.m12069g();
        if (NullChecker.b(listM18279q)) {
            this.f15691n.m23189d(listM18279q, this.f15702y, this.f15701x);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m18287y() {
        m18265A();
        m18267C();
        m18288z();
    }

    /* JADX INFO: renamed from: z */
    public final void m18288z() {
        dvm dvmVar = new dvm(this.f15683f, this.f15698u);
        this.f15690m = dvmVar;
        View viewM12067e = dvmVar.m12067e(this.f15681d, this.f15695r);
        if (NullChecker.a(viewM12067e)) {
            this.f15690m.m12075n(this.f15701x, this.f15686i);
            this.f15690m.m12077p(this.f15684g);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            this.f15690m.m12078q(this.f15692o);
            this.f15681d.addView(viewM12067e, layoutParams);
        }
    }
}
