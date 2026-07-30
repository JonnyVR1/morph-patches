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
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class mvm {

    /* JADX INFO: renamed from: a */
    public LinearLayout f135917a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f135918b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f135919c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f135920d;

    /* JADX INFO: renamed from: e */
    public l5j0 f135921e;

    /* JADX INFO: renamed from: f */
    public final Act f135922f;

    /* JADX INFO: renamed from: g */
    public String f135923g;

    /* JADX INFO: renamed from: h */
    public cwf0 f135924h;

    /* JADX INFO: renamed from: i */
    public d30 f135925i;

    /* JADX INFO: renamed from: j */
    public d30 f135926j;

    /* JADX INFO: renamed from: l */
    public pvm f135928l;

    /* JADX INFO: renamed from: m */
    public dvm f135929m;

    /* JADX INFO: renamed from: n */
    public tvm f135930n;

    /* JADX INFO: renamed from: o */
    public g30<PurchaseType, Act, String> f135931o;

    /* JADX INFO: renamed from: p */
    public c4g0 f135932p;

    /* JADX INFO: renamed from: q */
    public c4g0 f135933q;

    /* JADX INFO: renamed from: r */
    public boolean f135934r;

    /* JADX INFO: renamed from: s */
    public User f135935s;

    /* JADX INFO: renamed from: t */
    public Privilege f135936t;

    /* JADX INFO: renamed from: z */
    public static final int[] f135916z = {1, 5, 10};

    /* JADX INFO: renamed from: A */
    public static final int[] f135915A = {1, 10, 20, 50};

    /* JADX INFO: renamed from: k */
    public boolean f135927k = true;

    /* JADX INFO: renamed from: u */
    public PurchaseType f135937u = PurchaseType.TYPE_INSTANT_CHAT;

    /* JADX INFO: renamed from: v */
    public final DialogInterface.OnDismissListener f135938v = new DialogInterfaceOnDismissListenerC18565a();

    /* JADX INFO: renamed from: w */
    public final DialogInterface.OnCancelListener f135939w = new DialogInterfaceOnCancelListenerC18566b();

    /* JADX INFO: renamed from: x */
    public final e30<Integer> f135940x = new e30() { // from class: l.kvm
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f124781a.m156561t((Integer) obj);
        }
    };

    /* JADX INFO: renamed from: y */
    public final f30<C8765d, Boolean> f135941y = new f30() { // from class: l.lvm
        @Override // p149l.f30
        public final void call(Object obj, Object obj2) {
            this.f130173a.m156562u((C8765d) obj, (Boolean) obj2);
        }
    };

    /* JADX INFO: renamed from: l.mvm$a */
    public class DialogInterfaceOnDismissListenerC18565a implements DialogInterface.OnDismissListener {
        public DialogInterfaceOnDismissListenerC18565a() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            mvm mvmVar = mvm.this;
            if (mvmVar.f135927k && NullChecker.m81303a(mvmVar.f135926j)) {
                mvm.this.f135926j.call();
            }
            CoreModule.m29935P().m94651a().mo33308E9();
            i0e.m133796e(mvm.this.f135924h);
            mvm.this.m156555L();
        }
    }

    /* JADX INFO: renamed from: l.mvm$b */
    public class DialogInterfaceOnCancelListenerC18566b implements DialogInterface.OnCancelListener {
        public DialogInterfaceOnCancelListenerC18566b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (NullChecker.m81303a(mvm.this.f135925i)) {
                mvm.this.f135925i.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.mvm$c */
    public class ViewTreeObserverOnGlobalLayoutListenerC18567c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f135944a;

        public ViewTreeObserverOnGlobalLayoutListenerC18567c(BottomSheetBehavior bottomSheetBehavior) {
            this.f135944a = bottomSheetBehavior;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f135944a.setPeekHeight(mvm.this.f135917a.getHeight());
            mvm.this.f135917a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: l.mvm$d */
    public static class DialogInterfaceOnCancelListenerC18568d implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final WeakReference<mvm> f135946a;

        public DialogInterfaceOnCancelListenerC18568d(mvm mvmVar) {
            this.f135946a = new WeakReference<>(mvmVar);
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            mvm mvmVar = this.f135946a.get();
            if (mvmVar == null || mvmVar.m156559r() == null) {
                return;
            }
            mvmVar.f135939w.onCancel(dialogInterface);
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            mvm mvmVar = this.f135946a.get();
            if (mvmVar == null || mvmVar.m156559r() == null) {
                return;
            }
            mvmVar.f135938v.onDismiss(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: l.mvm$e */
    public static class C18569e {

        /* JADX INFO: renamed from: a */
        public final Act f135947a;

        /* JADX INFO: renamed from: b */
        public String f135948b;

        /* JADX INFO: renamed from: c */
        public g30<PurchaseType, Act, String> f135949c;

        /* JADX INFO: renamed from: d */
        public User f135950d;

        /* JADX INFO: renamed from: e */
        public d30 f135951e;

        /* JADX INFO: renamed from: f */
        public d30 f135952f;

        public C18569e(Act act) {
            this.f135947a = act;
        }

        /* JADX INFO: renamed from: a */
        public mvm m156568a() {
            mvm mvmVar = new mvm(this.f135947a);
            mvmVar.m156547D(this.f135948b);
            mvmVar.m156548E(this.f135951e);
            mvmVar.m156550G(this.f135949c);
            mvmVar.m156552I(this.f135950d);
            mvmVar.m156549F(this.f135952f);
            return mvmVar;
        }

        /* JADX INFO: renamed from: b */
        public C18569e m156569b(String str) {
            this.f135948b = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C18569e m156570c(g30<PurchaseType, Act, String> g30Var) {
            this.f135949c = g30Var;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public mvm m156571d() {
            mvm mvmVarM156568a = m156568a();
            mvmVarM156568a.m156553J();
            return mvmVarM156568a;
        }
    }

    public mvm(Act act) {
        this.f135922f = act;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Boolean m156535f(int[] iArr, C8765d c8765d) {
        C8765d.a aVarM53522d = c8765d.m53522d();
        if (aVarM53522d == null) {
            return Boolean.FALSE;
        }
        int iM53605w = aVarM53522d.m53605w();
        for (int i : iArr) {
            if (i == iM53605w) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: A */
    public final void m156544A() {
        pvm pvmVar = new pvm(this.f135922f);
        this.f135928l = pvmVar;
        View viewM171683c = pvmVar.m171683c(this.f135922f, this.f135918b);
        if (NullChecker.m81303a(viewM171683c)) {
            this.f135928l.m171687g(this.f135940x);
            pvm pvmVar2 = this.f135928l;
            pvmVar2.f151492i = this.f135936t;
            pvmVar2.m171685e(this.f135922f, this.f135935s, m156560s());
            this.f135918b.addView(viewM171683c, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m156545B() {
        final ProductCategory productCategory = ProductCategory.get(ProductCategory.tttInstantChat);
        this.f135932p = mkd0.m154984r(CoreModule.f17545c.f19654j0.m30646z5(productCategory, false).filter(new w9j() { // from class: l.fvm
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new w9j() { // from class: l.gvm
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f104579a.m156563v((List) obj);
            }
        }), CoreModule.f17545c.f19595P1.m196841h3(), new x9j() { // from class: l.hvm
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return vwb.m200311Y((List) obj, (Envelope) obj2);
            }
        }).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.ivm
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115181a.m156564w(productCategory, (j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public final void m156546C() {
        tvm tvmVar = new tvm(this.f135922f, this.f135937u);
        this.f135930n = tvmVar;
        View viewM190756b = tvmVar.m190756b(this.f135919c, this.f135934r);
        if (NullChecker.m81303a(viewM190756b)) {
            this.f135919c.addView(viewM190756b, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m156547D(String str) {
        this.f135923g = str;
    }

    /* JADX INFO: renamed from: E */
    public void m156548E(d30 d30Var) {
        this.f135925i = d30Var;
    }

    /* JADX INFO: renamed from: F */
    public void m156549F(d30 d30Var) {
        this.f135926j = d30Var;
    }

    /* JADX INFO: renamed from: G */
    public void m156550G(g30<PurchaseType, Act, String> g30Var) {
        this.f135931o = g30Var;
    }

    /* JADX INFO: renamed from: H */
    public void m156551H(boolean z) {
        this.f135927k = z;
    }

    /* JADX INFO: renamed from: I */
    public void m156552I(User user) {
        this.f135935s = user;
    }

    /* JADX INFO: renamed from: J */
    public final void m156553J() {
        l5j0 l5j0Var = new l5j0(this.f135922f, y7c0.f196696f);
        this.f135921e = l5j0Var;
        l5j0Var.m148649u(s4e.f162377c);
        View viewInflate = LayoutInflater.from(this.f135922f).inflate(m6c0.f131595g3, (ViewGroup) null);
        m156556o(viewInflate);
        this.f135921e.setContentView(viewInflate);
        DialogInterfaceOnCancelListenerC18568d dialogInterfaceOnCancelListenerC18568d = new DialogInterfaceOnCancelListenerC18568d(this);
        this.f135921e.setOnDismissListener(dialogInterfaceOnCancelListenerC18568d);
        this.f135921e.setOnCancelListener(dialogInterfaceOnCancelListenerC18568d);
        this.f135934r = m156560s();
        this.f135924h = i0e.m133794c("p_intl_instantmatch_iap_view", getClass().getName());
        m156566y();
        this.f135921e.show();
        m156545B();
        CoreModule.f17545c.f19555C0.m210112u4();
        w85.INSTANCE.m202145m("Purchase Page(Instant Match)", null);
    }

    /* JADX INFO: renamed from: K */
    public final void m156554K(List<C8765d> list) {
        i0e.m133797f(this.f135924h);
    }

    /* JADX INFO: renamed from: L */
    public void m156555L() {
        if (NullChecker.m81303a(this.f135932p) && !this.f135932p.isUnsubscribed()) {
            this.f135932p.unsubscribe();
            this.f135932p = null;
        }
        if (NullChecker.m81303a(this.f135933q) && !this.f135933q.isUnsubscribed()) {
            this.f135933q.unsubscribe();
            this.f135933q = null;
        }
        if (NullChecker.m81303a(this.f135930n)) {
            this.f135930n.m190757c();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m156556o(View view) {
        nvm.m161700a(this, view);
    }

    /* JADX INFO: renamed from: p */
    public final void m156557p() {
        Window window = this.f135921e.getWindow();
        if (NullChecker.m81303a(window)) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) window.findViewById(R.id.content).findViewById(z4c0.f201574y));
            bottomSheetBehaviorFrom.setState(3);
            this.f135917a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC18567c(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: q */
    public final List<C8765d> m156558q(List<C8765d> list) {
        final int[] iArr = xma.m210040C3() ? f135915A : f135916z;
        return vwb.m200339n(list, new w9j() { // from class: l.jvm
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return mvm.m156535f(iArr, (C8765d) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public l5j0 m156559r() {
        return this.f135921e;
    }

    /* JADX INFO: renamed from: s */
    public boolean m156560s() {
        return xdl0.m208408w0() <= 1280;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m156561t(Integer num) {
        if (NullChecker.m81303a(this.f135921e)) {
            if (num.intValue() == -1) {
                this.f135921e.hide();
                return;
            }
            if (num.intValue() == 0 || num.intValue() == 2) {
                if (num.intValue() == 2) {
                    m156551H(false);
                }
                this.f135921e.dismiss();
            } else if (num.intValue() == 1) {
                this.f135921e.show();
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m156562u(C8765d c8765d, Boolean bool) {
        if (NullChecker.m81303a(this.f135929m)) {
            this.f135929m.m113803m(c8765d);
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C22306c m156563v(List list) {
        return CoreModule.f17554l.m94651a().mo33504g5(this.f135922f, list);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m156564w(ProductCategory productCategory, j760 j760Var) {
        m156565x(productCategory, (List) j760Var.f116564a);
        m156557p();
    }

    /* JADX INFO: renamed from: x */
    public final void m156565x(ProductCategory productCategory, List<Merchandise> list) {
        List<C8765d> listMo107333a = cjy.m107330z(productCategory).mo107333a(this.f135922f, this.f135937u, productCategory, list);
        if (vwb.m200296J(listMo107333a)) {
            return;
        }
        List<C8765d> listM156558q = m156558q(listMo107333a);
        if (vwb.m200296J(listM156558q)) {
            return;
        }
        m156554K(listM156558q);
        int iMin = Math.min(1, listM156558q.size() - 1);
        int i = 0;
        while (i < listM156558q.size()) {
            listM156558q.get(i).m53540v(i == iMin);
            i++;
        }
        this.f135929m.m113798g();
        if (NullChecker.m81304b(listM156558q)) {
            this.f135930n.m190758d(listM156558q, this.f135941y, this.f135940x);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m156566y() {
        m156544A();
        m156546C();
        m156567z();
    }

    /* JADX INFO: renamed from: z */
    public final void m156567z() {
        dvm dvmVar = new dvm(this.f135922f, this.f135937u);
        this.f135929m = dvmVar;
        View viewM113796e = dvmVar.m113796e(this.f135920d, this.f135934r);
        if (NullChecker.m81303a(viewM113796e)) {
            this.f135929m.m113804n(this.f135940x, this.f135925i);
            this.f135929m.m113806p(this.f135923g);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            this.f135929m.m113807q(this.f135931o);
            this.f135920d.addView(viewM113796e, layoutParams);
        }
    }
}
