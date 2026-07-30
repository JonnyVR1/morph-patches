package p002l;

import android.R;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSON;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Coin;
import com.p1.mobile.putong.core.data.IntlCurrencyDiamond;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.b1c0;
import l.c4g0;
import l.cjy;
import l.cwf0;
import l.d30;
import l.e30;
import l.eqh0;
import l.f30;
import l.g30;
import l.gd5;
import l.hab0;
import l.i0e;
import l.iab0;
import l.jo0;
import l.l5j0;
import l.l7n;
import l.m6c0;
import l.mkd0;
import l.n6a;
import l.qib0;
import l.s4e;
import l.swh0;
import l.vwb;
import l.w2b0;
import l.w9j;
import l.xdl0;
import l.xma;
import l.y7c0;
import l.z4c0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fd5 {

    /* JADX INFO: renamed from: A */
    public Privilege f10237A;

    /* JADX INFO: renamed from: B */
    public int f10238B;

    /* JADX INFO: renamed from: F */
    public hab0 f10242F;

    /* JADX INFO: renamed from: H */
    public String f10244H;

    /* JADX INFO: renamed from: I */
    public JSONArray f10245I;

    /* JADX INFO: renamed from: a */
    public LinearLayout f10246a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f10247b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f10248c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f10249d;

    /* JADX INFO: renamed from: e */
    public l5j0 f10250e;

    /* JADX INFO: renamed from: f */
    public final Act f10251f;

    /* JADX INFO: renamed from: g */
    public final PurchaseType f10252g;

    /* JADX INFO: renamed from: h */
    public String f10253h;

    /* JADX INFO: renamed from: i */
    public cwf0 f10254i;

    /* JADX INFO: renamed from: j */
    public d30 f10255j;

    /* JADX INFO: renamed from: k */
    public d30 f10256k;

    /* JADX INFO: renamed from: m */
    public vol f10258m;

    /* JADX INFO: renamed from: n */
    public uol f10259n;

    /* JADX INFO: renamed from: o */
    public wol f10260o;

    /* JADX INFO: renamed from: p */
    public g30<PurchaseType, Act, String> f10261p;

    /* JADX INFO: renamed from: r */
    public c4g0 f10263r;

    /* JADX INFO: renamed from: s */
    public c4g0 f10264s;

    /* JADX INFO: renamed from: t */
    public c4g0 f10265t;

    /* JADX INFO: renamed from: u */
    public boolean f10266u;

    /* JADX INFO: renamed from: v */
    public User f10267v;

    /* JADX INFO: renamed from: w */
    public long f10268w;

    /* JADX INFO: renamed from: x */
    public long f10269x;

    /* JADX INFO: renamed from: y */
    public long f10270y;

    /* JADX INFO: renamed from: z */
    public int f10271z;

    /* JADX INFO: renamed from: l */
    public boolean f10257l = true;

    /* JADX INFO: renamed from: q */
    public int f10262q = 0;

    /* JADX INFO: renamed from: C */
    public final DialogInterface.OnDismissListener f10239C = new DialogInterfaceOnDismissListenerC0559a();

    /* JADX INFO: renamed from: D */
    public final DialogInterface.OnCancelListener f10240D = new DialogInterfaceOnCancelListenerC0560b();

    /* JADX INFO: renamed from: E */
    public final e30<Integer> f10241E = new e30() { // from class: l.ed5
        public final void call(Object obj) {
            this.f9677a.m13081F((Integer) obj);
        }
    };

    /* JADX INFO: renamed from: G */
    public final f30<C0190d, Boolean> f10243G = new f30() { // from class: l.tc5
        public final void call(Object obj, Object obj2) {
            this.f20179a.m13082G((C0190d) obj, (Boolean) obj2);
        }
    };

    /* JADX INFO: renamed from: l.fd5$a */
    public class DialogInterfaceOnDismissListenerC0559a implements DialogInterface.OnDismissListener {
        public DialogInterfaceOnDismissListenerC0559a() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            fd5 fd5Var = fd5.this;
            if (fd5Var.f10257l && NullChecker.a(fd5Var.f10256k)) {
                fd5.this.f10256k.call();
            }
            CoreModule.P().a().E9();
            i0e.e(fd5.this.f10254i);
            fd5.this.m13108g0();
        }
    }

    /* JADX INFO: renamed from: l.fd5$b */
    public class DialogInterfaceOnCancelListenerC0560b implements DialogInterface.OnCancelListener {
        public DialogInterfaceOnCancelListenerC0560b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (NullChecker.a(fd5.this.f10255j)) {
                fd5.this.f10255j.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.fd5$c */
    public class ViewTreeObserverOnGlobalLayoutListenerC0561c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f10274a;

        public ViewTreeObserverOnGlobalLayoutListenerC0561c(BottomSheetBehavior bottomSheetBehavior) {
            this.f10274a = bottomSheetBehavior;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f10274a.setPeekHeight(fd5.this.f10246a.getHeight());
            fd5.this.f10246a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: l.fd5$d */
    public static class DialogInterfaceOnCancelListenerC0562d implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final WeakReference<fd5> f10276a;

        public DialogInterfaceOnCancelListenerC0562d(fd5 fd5Var) {
            this.f10276a = new WeakReference<>(fd5Var);
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            fd5 fd5Var = this.f10276a.get();
            if (fd5Var == null || fd5Var.m13078C() == null) {
                return;
            }
            fd5Var.f10240D.onCancel(dialogInterface);
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            fd5 fd5Var = this.f10276a.get();
            if (fd5Var == null || fd5Var.m13078C() == null) {
                return;
            }
            fd5Var.f10239C.onDismiss(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: l.fd5$e */
    public static class C0563e {

        /* JADX INFO: renamed from: a */
        public final Act f10277a;

        /* JADX INFO: renamed from: b */
        public PurchaseType f10278b;

        /* JADX INFO: renamed from: c */
        public String f10279c;

        /* JADX INFO: renamed from: d */
        public g30<PurchaseType, Act, String> f10280d;

        /* JADX INFO: renamed from: e */
        public User f10281e;

        /* JADX INFO: renamed from: f */
        public long f10282f;

        /* JADX INFO: renamed from: g */
        public long f10283g;

        /* JADX INFO: renamed from: h */
        public int f10284h;

        /* JADX INFO: renamed from: i */
        public int f10285i;

        /* JADX INFO: renamed from: j */
        public int f10286j = 0;

        /* JADX INFO: renamed from: k */
        public Privilege f10287k;

        /* JADX INFO: renamed from: l */
        public d30 f10288l;

        /* JADX INFO: renamed from: m */
        public d30 f10289m;

        public C0563e(Act act) {
            this.f10277a = act;
        }

        /* JADX INFO: renamed from: a */
        public fd5 m13114a() {
            fd5 fd5Var = new fd5(this.f10277a, this.f10278b);
            fd5Var.m13095T(this.f10286j);
            fd5Var.m13096U(this.f10279c);
            fd5Var.m13098W(this.f10288l);
            fd5Var.m13100Y(this.f10280d);
            fd5Var.m13105d0(this.f10281e);
            fd5Var.m13097V(this.f10282f);
            fd5Var.m13099X(this.f10289m);
            fd5Var.m13101Z(this.f10284h);
            fd5Var.m13104c0(this.f10283g);
            fd5Var.m13102a0(this.f10287k);
            fd5Var.m13094S(this.f10285i);
            return fd5Var;
        }

        /* JADX INFO: renamed from: b */
        public C0563e m13115b(int i) {
            this.f10285i = i;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C0563e m13116c(int i) {
            this.f10286j = i;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C0563e m13117d(String str) {
            this.f10279c = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C0563e m13118e(long j) {
            this.f10282f = j;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C0563e m13119f(d30 d30Var) {
            this.f10289m = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C0563e m13120g(g30<PurchaseType, Act, String> g30Var) {
            this.f10280d = g30Var;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C0563e m13121h(int i) {
            this.f10284h = i;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C0563e m13122i(Privilege privilege) {
            this.f10287k = privilege;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C0563e m13123j(PurchaseType purchaseType) {
            this.f10278b = purchaseType;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C0563e m13124k(long j) {
            this.f10283g = j;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public fd5 m13125l() {
            fd5 fd5VarM13114a = m13114a();
            fd5VarM13114a.m13106e0();
            return fd5VarM13114a;
        }
    }

    public fd5(Act act, PurchaseType purchaseType) {
        this.f10251f = act;
        this.f10252g = purchaseType;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m13057c(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Boolean m13062h(int i, C0190d c0190d) {
        if (NullChecker.a(c0190d) && NullChecker.a(c0190d.m4088d())) {
            return Boolean.valueOf(c0190d.m4088d().m4171w() >= i);
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0083 A[Catch: JSONException -> 0x00a5, TryCatch #0 {JSONException -> 0x00a5, blocks: (B:2:0x0000, B:6:0x000f, B:8:0x0028, B:10:0x0039, B:20:0x004d, B:34:0x0092, B:38:0x009f, B:22:0x0052, B:23:0x0059, B:24:0x0060, B:25:0x0067, B:26:0x006e, B:27:0x0075, B:28:0x007c, B:29:0x0083), top: B:41:0x0000 }] */
    /* JADX INFO: renamed from: A */
    public final void m13076A() {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject(RemoteConfig.x().F(CoreModule.K().xf() ? "ttt_vas_diamond_popupab" : "ttt_vas_coin_popupab"));
            String string = jSONObject2.getString("mcclow");
            boolean zM = !TextUtils.isEmpty(string) ? vwb.m(JSON.parseArray(string, Integer.class), new w9j() { // from class: l.uc5
                public final Object call(Object obj) {
                    return Boolean.valueOf(qib0.f0 == ((Integer) obj).intValue());
                }
            }) : false;
            int i = this.f10262q;
            if (i == 1) {
                jSONObject = jSONObject2.getJSONObject("boost");
            } else if (i == 2) {
                jSONObject = jSONObject2.getJSONObject("superlike");
            } else if (i == 12) {
                jSONObject = jSONObject2.getJSONObject("readreceipts");
            } else if (i == 14) {
                jSONObject = jSONObject2.getJSONObject("boost");
            } else if (i != 22) {
                switch (i) {
                    case 27:
                        jSONObject = jSONObject2.getJSONObject("buzzMatch");
                        break;
                    case 28:
                        jSONObject = jSONObject2.getJSONObject("buzzVoiceMatch");
                        break;
                    case 29:
                        jSONObject = jSONObject2.getJSONObject("buzzVideoMatch");
                        break;
                    case 30:
                        jSONObject = jSONObject2.getJSONObject("buzzMemojiMatch");
                        break;
                    default:
                        jSONObject = null;
                        break;
                }
            } else {
                jSONObject = jSONObject2.getJSONObject("spotlight");
            }
            if (jSONObject != null) {
                this.f10244H = jSONObject.getString(zM ? "selectedidlow" : "selectedid");
                this.f10245I = jSONObject.getJSONArray(zM ? "skuidarraylow" : "skuidarray");
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: B */
    public final List<C0190d> m13077B(List<C0190d> list) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.a(this.f10245I)) {
            HashMap map = new HashMap();
            for (int i = 0; i < this.f10245I.length(); i++) {
                try {
                    map.put(this.f10245I.getString(i), String.valueOf(i));
                } catch (JSONException unused) {
                }
            }
            for (C0190d c0190d : list) {
                C0190d.a aVarM4086b = c0190d.m4097m() ? c0190d.m4086b() : c0190d.m4088d();
                if (map.containsKey(aVarM4086b.m4167s().defaultStockKeepUnit.id)) {
                    arrayList.add(c0190d);
                    c0190d.m4106v(TextUtils.equals(aVarM4086b.m4167s().defaultStockKeepUnit.id, this.f10244H));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: C */
    public l5j0 m13078C() {
        return this.f10250e;
    }

    /* JADX INFO: renamed from: D */
    public final c<Long> m13079D() {
        boolean zXf = CoreModule.K().xf();
        Act act = this.f10251f;
        return zXf ? act.duringCreated(CoreModule.c.I0.M3()).map(new w9j() { // from class: l.cd5
            public final Object call(Object obj) {
                return Long.valueOf(((IntlCurrencyDiamond) obj).available);
            }
        }) : act.duringCreated(CoreModule.c.H0.a5()).map(new w9j() { // from class: l.dd5
            public final Object call(Object obj) {
                return Long.valueOf(((Coin) obj).available);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public boolean m13080E() {
        return xdl0.w0() <= 1280;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m13081F(Integer num) {
        if (NullChecker.a(this.f10250e)) {
            if (num.intValue() == -1) {
                this.f10250e.hide();
                return;
            }
            if (num.intValue() == 0 || num.intValue() == 2) {
                if (num.intValue() == 2) {
                    m13103b0(false);
                }
                this.f10250e.dismiss();
            } else if (num.intValue() == 1) {
                this.f10250e.show();
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m13082G(C0190d c0190d, Boolean bool) {
        if (NullChecker.a(this.f10258m)) {
            this.f10258m.mo13946b(c0190d);
        }
        if (NullChecker.a(this.f10259n)) {
            this.f10259n.mo11957b(c0190d);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Boolean m13083H(int i, List list, C0190d c0190d) {
        boolean z;
        if (NullChecker.a(m13113z(c0190d)) && m13113z(c0190d).m4167s().defaultStockKeepUnit.prices.price >= i) {
            return Boolean.TRUE;
        }
        if (NullChecker.a(m13113z(c0190d))) {
            z = c0190d == list.get(list.size() - 1);
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m13084I(UserPrivilege userPrivilege) {
        if (xma.C3()) {
            this.f10241E.call(0);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ c m13085J(List list) {
        return CoreModule.l.a().g5(this.f10251f, list);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m13086K(ProductCategory productCategory, List list) {
        m13088M(productCategory, list);
        m13110w();
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m13087L(Long l2) {
        this.f10269x = l2.longValue();
        this.f10258m.mo13948d(this.f10251f, m13111x(CoreModule.P().a().dp(l2.longValue())));
        this.f10259n.mo11960e(l2.longValue());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041 A[PHI: r0
      0x0041: PHI (r0v8 int) = (r0v7 int), (r0v14 int) binds: [B:14:0x003f, B:9:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: M */
    public final void m13088M(ProductCategory productCategory, List<Merchandise> list) {
        int iG;
        final List<C0190d> listA = cjy.z(productCategory).a(this.f10251f, this.f10252g, productCategory, list);
        int i = this.f10262q == 25 ? 1 : 2;
        int i2 = this.f10238B;
        if (i2 > 0) {
            iG = m13112y(listA, i2);
            if (iG >= 0) {
                i = iG;
            }
        } else {
            long j = this.f10270y;
            if (j > 0) {
                final int iCeil = (int) Math.ceil((j - this.f10269x) / 10.0f);
                iG = vwb.G(listA, new w9j() { // from class: l.bd5
                    public final Object call(Object obj) {
                        return this.f8073a.m13083H(iCeil, listA, (C0190d) obj);
                    }
                });
                if (iG >= 0) {
                    i = iG;
                }
            }
        }
        if (rc5.m21904g(this.f10262q)) {
            m13076A();
            List<C0190d> listM13077B = m13077B(listA);
            m13107f0(listM13077B);
            this.f10260o.mo15241b(listM13077B, this.f10243G, this.f10241E);
            return;
        }
        for (int i3 = 0; i3 < listA.size(); i3++) {
            if (i3 == i) {
                listA.get(i3).m4106v(true);
            } else {
                listA.get(i3).m4106v(false);
            }
        }
        m13107f0(listA);
        if (NullChecker.b(listA)) {
            this.f10260o.mo15241b(listA, this.f10243G, this.f10241E);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m13089N() {
        m13091P();
        m13093R();
        m13090O();
    }

    /* JADX INFO: renamed from: O */
    public final void m13090O() {
        uol uolVarM21899b = rc5.m21899b(this.f10251f, this.f10262q, this.f10252g);
        this.f10259n = uolVarM21899b;
        View viewMo11956a = uolVarM21899b.mo11956a(this.f10249d, this.f10266u);
        if (NullChecker.a(viewMo11956a)) {
            this.f10259n.mo11959d(this.f10241E, this.f10255j);
            this.f10259n.mo11958c(this.f10253h);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            uol uolVar = this.f10259n;
            if (uolVar instanceof nc5) {
                ((nc5) uolVar).m18665F(this.f10261p);
                ((nc5) this.f10259n).m18666G(this.f10242F);
            } else if (uolVar instanceof dmo) {
                ((dmo) uolVar).m11966t(this.f10261p);
            } else if (uolVar instanceof sdj) {
                ((sdj) uolVar).m22370p(this.f10261p);
            } else if (uolVar instanceof sfn) {
                ((sfn) uolVar).m22428p(this.f10261p);
            }
            this.f10249d.addView(viewMo11956a, layoutParams);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m13091P() {
        vol volVarM21900c = rc5.m21900c(this.f10251f, this.f10262q);
        this.f10258m = volVarM21900c;
        View viewMo13945a = volVarM21900c.mo13945a(this.f10251f, this.f10247b);
        if (NullChecker.a(viewMo13945a)) {
            vol volVar = this.f10258m;
            if (volVar instanceof pc5) {
                ((pc5) volVar).m20185h(this.f10271z);
            }
            vol volVar2 = this.f10258m;
            if (volVar2 instanceof gmo) {
                ((gmo) volVar2).m13952i(this.f10241E);
                ((gmo) this.f10258m).f11544m = this.f10237A;
            }
            this.f10258m.mo13947c(this.f10251f, this.f10267v, m13080E());
            this.f10247b.addView(viewMo13945a, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m13092Q() {
        int i;
        if (CoreModule.o.d().Vd() && ((i = this.f10262q) == 2 || i == 1 || i == 14)) {
            this.f10265t = CoreModule.c.C0.u3(SummarizedPrivilegesId.get("ultraPremium")).distinctUntilChanged().subscribe(mkd0.H(new e30() { // from class: l.sc5
                public final void call(Object obj) {
                    this.f18920a.m13084I((UserPrivilege) obj);
                }
            }, new e30() { // from class: l.wc5
                public final void call(Object obj) {
                    fd5.m13057c((Throwable) obj);
                }
            }));
        }
        final ProductCategory productCategory = this.f10252g.productCategory();
        this.f10263r = CoreModule.c.j0.z5(productCategory, false).filter(new w9j() { // from class: l.xc5
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new w9j() { // from class: l.yc5
            public final Object call(Object obj) {
                return this.f22791a.m13085J((List) obj);
            }
        }).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.zc5
            public final void call(Object obj) {
                this.f23336a.m13086K(productCategory, (List) obj);
            }
        }));
        this.f10264s = m13079D().distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.ad5
            public final void call(Object obj) {
                this.f7508a.m13087L((Long) obj);
            }
        }));
        e1b0.INSTANCE.m12105a(this.f10252g);
    }

    /* JADX INFO: renamed from: R */
    public final void m13093R() {
        boolean zM21904g = rc5.m21904g(this.f10262q);
        Act act = this.f10251f;
        if (zM21904g) {
            this.f10260o = rc5.m21901d(act, this.f10252g);
        } else {
            this.f10260o = rc5.m21903f(act, this.f10262q);
        }
        View viewMo15240a = this.f10260o.mo15240a(this.f10248c, this.f10266u);
        if (NullChecker.a(viewMo15240a)) {
            this.f10248c.addView(viewMo15240a, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m13094S(int i) {
        this.f10238B = i;
    }

    /* JADX INFO: renamed from: T */
    public void m13095T(int i) {
        this.f10262q = i;
    }

    /* JADX INFO: renamed from: U */
    public final void m13096U(String str) {
        this.f10253h = str;
    }

    /* JADX INFO: renamed from: V */
    public void m13097V(long j) {
        this.f10268w = j;
    }

    /* JADX INFO: renamed from: W */
    public void m13098W(d30 d30Var) {
        this.f10255j = d30Var;
    }

    /* JADX INFO: renamed from: X */
    public void m13099X(d30 d30Var) {
        this.f10256k = d30Var;
    }

    /* JADX INFO: renamed from: Y */
    public void m13100Y(g30<PurchaseType, Act, String> g30Var) {
        this.f10261p = g30Var;
    }

    /* JADX INFO: renamed from: Z */
    public void m13101Z(int i) {
        this.f10271z = i;
    }

    /* JADX INFO: renamed from: a0 */
    public void m13102a0(Privilege privilege) {
        this.f10237A = privilege;
    }

    /* JADX INFO: renamed from: b0 */
    public void m13103b0(boolean z) {
        this.f10257l = z;
    }

    /* JADX INFO: renamed from: c0 */
    public void m13104c0(long j) {
        this.f10270y = j;
    }

    /* JADX INFO: renamed from: d0 */
    public void m13105d0(User user) {
        this.f10267v = user;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m13106e0() {
        l5j0 l5j0Var = new l5j0(this.f10251f, y7c0.f);
        this.f10250e = l5j0Var;
        l5j0Var.u(s4e.c);
        View viewInflate = LayoutInflater.from(this.f10251f).inflate(m6c0.e3, (ViewGroup) null);
        m13109v(viewInflate);
        this.f10250e.setContentView(viewInflate);
        DialogInterfaceOnCancelListenerC0562d dialogInterfaceOnCancelListenerC0562d = new DialogInterfaceOnCancelListenerC0562d(this);
        this.f10250e.setOnDismissListener(dialogInterfaceOnCancelListenerC0562d);
        this.f10250e.setOnCancelListener(dialogInterfaceOnCancelListenerC0562d);
        this.f10266u = m13080E();
        this.f10254i = i0e.c("p_purchase_page", getClass().getName());
        m13089N();
        this.f10250e.show();
        m13092Q();
        if (CoreModule.K().xf()) {
            CoreModule.c.I0.N3();
        } else {
            CoreModule.c.H0.k5();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m13107f0(List<C0190d> list) {
        String strU = vwb.U(iab0.j(list), ",");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", w2b0.b(this.f10253h));
            jSONObject.put("exchange_type", swh0.n0(this.f10262q));
            jSONObject.put("productType", this.f10252g.productCategory().name());
            jSONObject.put("skuGroup", strU);
            jSONObject.put("function_type", swh0.o0(this.f10262q));
            jSONObject.put("tooltips_trigger_mode", "active");
            jSONObject.put("tooltips_type_ui", "alert_self_definition_business_a");
            jSONObject.put("tooltips_trigger_module", "purchase_button");
            jSONObject.put("tooltips_trigger_page", "anywhere");
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_trigger_reason", "purchase");
            if (CoreModule.P().a().U()) {
                jSONObject.put("no_secret_payment", CoreModule.c.O0.E3());
                jSONObject.put("user_secret_staus", CoreModule.c.O0.D3());
            }
        } catch (JSONException unused) {
        }
        this.f10254i.o(jSONObject);
        i0e.f(this.f10254i);
    }

    /* JADX INFO: renamed from: g0 */
    public void m13108g0() {
        if (NullChecker.a(this.f10265t) && !this.f10265t.isUnsubscribed()) {
            this.f10265t.unsubscribe();
            this.f10265t = null;
        }
        if (NullChecker.a(this.f10263r) && !this.f10263r.isUnsubscribed()) {
            this.f10263r.unsubscribe();
            this.f10263r = null;
        }
        if (NullChecker.a(this.f10264s) && !this.f10264s.isUnsubscribed()) {
            this.f10264s.unsubscribe();
            this.f10264s = null;
        }
        if (NullChecker.a(this.f10260o)) {
            this.f10260o.release();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m13109v(View view) {
        gd5.a(this, view);
    }

    /* JADX INFO: renamed from: w */
    public final void m13110w() {
        Window window = this.f10250e.getWindow();
        if (NullChecker.a(window)) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) window.findViewById(R.id.content).findViewById(z4c0.y));
            bottomSheetBehaviorFrom.setState(3);
            this.f10246a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0561c(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: x */
    public final CharSequence m13111x(String str) {
        if (!(this.f10258m instanceof gmo)) {
            return n6a.b0(this.f10251f.getString(l7n.d(), str), vwb.f0(new String[]{str}), this.f10251f.color(b1c0.f), eqh0.c(3));
        }
        return str + " " + this.f10251f.getString(l7n.e());
    }

    /* JADX INFO: renamed from: y */
    public final int m13112y(List<C0190d> list, final int i) {
        return vwb.G(list, new w9j() { // from class: l.vc5
            public final Object call(Object obj) {
                return fd5.m13062h(i, (C0190d) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public C0190d.a m13113z(C0190d c0190d) {
        if (NullChecker.a(c0190d)) {
            return c0190d.m4097m() ? c0190d.m4086b() : c0190d.m4088d();
        }
        return null;
    }
}
