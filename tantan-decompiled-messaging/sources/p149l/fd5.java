package p149l;

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
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.Coin;
import com.p046p1.mobile.putong.core.data.IntlCurrencyDiamond;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class fd5 {

    /* JADX INFO: renamed from: A */
    public Privilege f96956A;

    /* JADX INFO: renamed from: B */
    public int f96957B;

    /* JADX INFO: renamed from: F */
    public hab0 f96961F;

    /* JADX INFO: renamed from: H */
    public String f96963H;

    /* JADX INFO: renamed from: I */
    public JSONArray f96964I;

    /* JADX INFO: renamed from: a */
    public LinearLayout f96965a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f96966b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f96967c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f96968d;

    /* JADX INFO: renamed from: e */
    public l5j0 f96969e;

    /* JADX INFO: renamed from: f */
    public final Act f96970f;

    /* JADX INFO: renamed from: g */
    public final PurchaseType f96971g;

    /* JADX INFO: renamed from: h */
    public String f96972h;

    /* JADX INFO: renamed from: i */
    public cwf0 f96973i;

    /* JADX INFO: renamed from: j */
    public d30 f96974j;

    /* JADX INFO: renamed from: k */
    public d30 f96975k;

    /* JADX INFO: renamed from: m */
    public vol f96977m;

    /* JADX INFO: renamed from: n */
    public uol f96978n;

    /* JADX INFO: renamed from: o */
    public wol f96979o;

    /* JADX INFO: renamed from: p */
    public g30<PurchaseType, Act, String> f96980p;

    /* JADX INFO: renamed from: r */
    public c4g0 f96982r;

    /* JADX INFO: renamed from: s */
    public c4g0 f96983s;

    /* JADX INFO: renamed from: t */
    public c4g0 f96984t;

    /* JADX INFO: renamed from: u */
    public boolean f96985u;

    /* JADX INFO: renamed from: v */
    public User f96986v;

    /* JADX INFO: renamed from: w */
    public long f96987w;

    /* JADX INFO: renamed from: x */
    public long f96988x;

    /* JADX INFO: renamed from: y */
    public long f96989y;

    /* JADX INFO: renamed from: z */
    public int f96990z;

    /* JADX INFO: renamed from: l */
    public boolean f96976l = true;

    /* JADX INFO: renamed from: q */
    public int f96981q = 0;

    /* JADX INFO: renamed from: C */
    public final DialogInterface.OnDismissListener f96958C = new DialogInterfaceOnDismissListenerC16804a();

    /* JADX INFO: renamed from: D */
    public final DialogInterface.OnCancelListener f96959D = new DialogInterfaceOnCancelListenerC16805b();

    /* JADX INFO: renamed from: E */
    public final e30<Integer> f96960E = new e30() { // from class: l.ed5
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f90590a.m120916F((Integer) obj);
        }
    };

    /* JADX INFO: renamed from: G */
    public final f30<C8765d, Boolean> f96962G = new f30() { // from class: l.tc5
        @Override // p149l.f30
        public final void call(Object obj, Object obj2) {
            this.f169413a.m120917G((C8765d) obj, (Boolean) obj2);
        }
    };

    /* JADX INFO: renamed from: l.fd5$a */
    public class DialogInterfaceOnDismissListenerC16804a implements DialogInterface.OnDismissListener {
        public DialogInterfaceOnDismissListenerC16804a() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            fd5 fd5Var = fd5.this;
            if (fd5Var.f96976l && NullChecker.m81303a(fd5Var.f96975k)) {
                fd5.this.f96975k.call();
            }
            CoreModule.m29935P().m94651a().mo33308E9();
            i0e.m133796e(fd5.this.f96973i);
            fd5.this.m120943g0();
        }
    }

    /* JADX INFO: renamed from: l.fd5$b */
    public class DialogInterfaceOnCancelListenerC16805b implements DialogInterface.OnCancelListener {
        public DialogInterfaceOnCancelListenerC16805b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (NullChecker.m81303a(fd5.this.f96974j)) {
                fd5.this.f96974j.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.fd5$c */
    public class ViewTreeObserverOnGlobalLayoutListenerC16806c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f96993a;

        public ViewTreeObserverOnGlobalLayoutListenerC16806c(BottomSheetBehavior bottomSheetBehavior) {
            this.f96993a = bottomSheetBehavior;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f96993a.setPeekHeight(fd5.this.f96965a.getHeight());
            fd5.this.f96965a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: l.fd5$d */
    public static class DialogInterfaceOnCancelListenerC16807d implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final WeakReference<fd5> f96995a;

        public DialogInterfaceOnCancelListenerC16807d(fd5 fd5Var) {
            this.f96995a = new WeakReference<>(fd5Var);
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            fd5 fd5Var = this.f96995a.get();
            if (fd5Var == null || fd5Var.m120913C() == null) {
                return;
            }
            fd5Var.f96959D.onCancel(dialogInterface);
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            fd5 fd5Var = this.f96995a.get();
            if (fd5Var == null || fd5Var.m120913C() == null) {
                return;
            }
            fd5Var.f96958C.onDismiss(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: l.fd5$e */
    public static class C16808e {

        /* JADX INFO: renamed from: a */
        public final Act f96996a;

        /* JADX INFO: renamed from: b */
        public PurchaseType f96997b;

        /* JADX INFO: renamed from: c */
        public String f96998c;

        /* JADX INFO: renamed from: d */
        public g30<PurchaseType, Act, String> f96999d;

        /* JADX INFO: renamed from: e */
        public User f97000e;

        /* JADX INFO: renamed from: f */
        public long f97001f;

        /* JADX INFO: renamed from: g */
        public long f97002g;

        /* JADX INFO: renamed from: h */
        public int f97003h;

        /* JADX INFO: renamed from: i */
        public int f97004i;

        /* JADX INFO: renamed from: j */
        public int f97005j = 0;

        /* JADX INFO: renamed from: k */
        public Privilege f97006k;

        /* JADX INFO: renamed from: l */
        public d30 f97007l;

        /* JADX INFO: renamed from: m */
        public d30 f97008m;

        public C16808e(Act act) {
            this.f96996a = act;
        }

        /* JADX INFO: renamed from: a */
        public fd5 m120949a() {
            fd5 fd5Var = new fd5(this.f96996a, this.f96997b);
            fd5Var.m120930T(this.f97005j);
            fd5Var.m120931U(this.f96998c);
            fd5Var.m120933W(this.f97007l);
            fd5Var.m120935Y(this.f96999d);
            fd5Var.m120940d0(this.f97000e);
            fd5Var.m120932V(this.f97001f);
            fd5Var.m120934X(this.f97008m);
            fd5Var.m120936Z(this.f97003h);
            fd5Var.m120939c0(this.f97002g);
            fd5Var.m120937a0(this.f97006k);
            fd5Var.m120929S(this.f97004i);
            return fd5Var;
        }

        /* JADX INFO: renamed from: b */
        public C16808e m120950b(int i) {
            this.f97004i = i;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C16808e m120951c(int i) {
            this.f97005j = i;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C16808e m120952d(String str) {
            this.f96998c = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C16808e m120953e(long j) {
            this.f97001f = j;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C16808e m120954f(d30 d30Var) {
            this.f97008m = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C16808e m120955g(g30<PurchaseType, Act, String> g30Var) {
            this.f96999d = g30Var;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C16808e m120956h(int i) {
            this.f97003h = i;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C16808e m120957i(Privilege privilege) {
            this.f97006k = privilege;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C16808e m120958j(PurchaseType purchaseType) {
            this.f96997b = purchaseType;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C16808e m120959k(long j) {
            this.f97002g = j;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public fd5 m120960l() {
            fd5 fd5VarM120949a = m120949a();
            fd5VarM120949a.m120941e0();
            return fd5VarM120949a;
        }
    }

    public fd5(Act act, PurchaseType purchaseType) {
        this.f96970f = act;
        this.f96971g = purchaseType;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m120892c(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Boolean m120897h(int i, C8765d c8765d) {
        if (NullChecker.m81303a(c8765d) && NullChecker.m81303a(c8765d.m53522d())) {
            return Boolean.valueOf(c8765d.m53522d().m53605w() >= i);
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0083 A[Catch: JSONException -> 0x00a5, TryCatch #0 {JSONException -> 0x00a5, blocks: (B:2:0x0000, B:6:0x000f, B:8:0x0028, B:10:0x0039, B:20:0x004d, B:34:0x0092, B:38:0x009f, B:22:0x0052, B:23:0x0059, B:24:0x0060, B:25:0x0067, B:26:0x006e, B:27:0x0075, B:28:0x007c, B:29:0x0083), top: B:41:0x0000 }] */
    /* JADX INFO: renamed from: A */
    public final void m120911A() {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject(RemoteConfig.m79298x().m79302F(CoreModule.m29932K().mo30835xf() ? "ttt_vas_diamond_popupab" : "ttt_vas_coin_popupab"));
            String string = jSONObject2.getString("mcclow");
            boolean zM200337m = !TextUtils.isEmpty(string) ? vwb.m200337m(JSON.parseArray(string, Integer.class), new w9j() { // from class: l.uc5
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(qib0.f154717f0 == ((Integer) obj).intValue());
                }
            }) : false;
            int i = this.f96981q;
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
                        jSONObject = jSONObject2.getJSONObject(SummarizedPrivilegesId.buzzMatch);
                        break;
                    case 28:
                        jSONObject = jSONObject2.getJSONObject(SummarizedPrivilegesId.buzzVoiceMatch);
                        break;
                    case 29:
                        jSONObject = jSONObject2.getJSONObject(SummarizedPrivilegesId.buzzVideoMatch);
                        break;
                    case 30:
                        jSONObject = jSONObject2.getJSONObject(SummarizedPrivilegesId.buzzMemojiMatch);
                        break;
                    default:
                        jSONObject = null;
                        break;
                }
            } else {
                jSONObject = jSONObject2.getJSONObject("spotlight");
            }
            if (jSONObject != null) {
                this.f96963H = jSONObject.getString(zM200337m ? "selectedidlow" : "selectedid");
                this.f96964I = jSONObject.getJSONArray(zM200337m ? "skuidarraylow" : "skuidarray");
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: B */
    public final List<C8765d> m120912B(List<C8765d> list) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(this.f96964I)) {
            HashMap map = new HashMap();
            for (int i = 0; i < this.f96964I.length(); i++) {
                try {
                    map.put(this.f96964I.getString(i), String.valueOf(i));
                } catch (JSONException unused) {
                }
            }
            for (C8765d c8765d : list) {
                C8765d.a aVarM53520b = c8765d.m53531m() ? c8765d.m53520b() : c8765d.m53522d();
                if (map.containsKey(aVarM53520b.m53601s().defaultStockKeepUnit.f20507id)) {
                    arrayList.add(c8765d);
                    c8765d.m53540v(TextUtils.equals(aVarM53520b.m53601s().defaultStockKeepUnit.f20507id, this.f96963H));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: C */
    public l5j0 m120913C() {
        return this.f96969e;
    }

    /* JADX INFO: renamed from: D */
    public final C22306c<Long> m120914D() {
        boolean zMo30835xf = CoreModule.m29932K().mo30835xf();
        Act act = this.f96970f;
        return zMo30835xf ? act.duringCreated(CoreModule.f17545c.f19573I0.m140259M3()).map(new w9j() { // from class: l.cd5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Long.valueOf(((IntlCurrencyDiamond) obj).available);
            }
        }) : act.duringCreated(CoreModule.f17545c.f19570H0.m210349a5()).map(new w9j() { // from class: l.dd5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Long.valueOf(((Coin) obj).available);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public boolean m120915E() {
        return xdl0.m208408w0() <= 1280;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m120916F(Integer num) {
        if (NullChecker.m81303a(this.f96969e)) {
            if (num.intValue() == -1) {
                this.f96969e.hide();
                return;
            }
            if (num.intValue() == 0 || num.intValue() == 2) {
                if (num.intValue() == 2) {
                    m120938b0(false);
                }
                this.f96969e.dismiss();
            } else if (num.intValue() == 1) {
                this.f96969e.show();
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m120917G(C8765d c8765d, Boolean bool) {
        if (NullChecker.m81303a(this.f96977m)) {
            this.f96977m.mo127038b(c8765d);
        }
        if (NullChecker.m81303a(this.f96978n)) {
            this.f96978n.mo112509b(c8765d);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Boolean m120918H(int i, List list, C8765d c8765d) {
        boolean z;
        if (NullChecker.m81303a(m120948z(c8765d)) && m120948z(c8765d).m53601s().defaultStockKeepUnit.prices.price >= i) {
            return Boolean.TRUE;
        }
        if (NullChecker.m81303a(m120948z(c8765d))) {
            z = c8765d == list.get(list.size() - 1);
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m120919I(UserPrivilege userPrivilege) {
        if (xma.m210040C3()) {
            this.f96960E.call(0);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ C22306c m120920J(List list) {
        return CoreModule.f17554l.m94651a().mo33504g5(this.f96970f, list);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m120921K(ProductCategory productCategory, List list) {
        m120923M(productCategory, list);
        m120945w();
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m120922L(Long l2) {
        this.f96988x = l2.longValue();
        this.f96977m.mo127040d(this.f96970f, m120946x(CoreModule.m29935P().m94651a().mo33487dp(l2.longValue())));
        this.f96978n.mo112512e(l2.longValue());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041 A[PHI: r0
      0x0041: PHI (r0v8 int) = (r0v7 int), (r0v14 int) binds: [B:14:0x003f, B:9:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: M */
    public final void m120923M(ProductCategory productCategory, List<Merchandise> list) {
        int iM200293G;
        final List<C8765d> listMo107333a = cjy.m107330z(productCategory).mo107333a(this.f96970f, this.f96971g, productCategory, list);
        int i = this.f96981q == 25 ? 1 : 2;
        int i2 = this.f96957B;
        if (i2 > 0) {
            iM200293G = m120947y(listMo107333a, i2);
            if (iM200293G >= 0) {
                i = iM200293G;
            }
        } else {
            long j = this.f96989y;
            if (j > 0) {
                final int iCeil = (int) Math.ceil((j - this.f96988x) / 10.0f);
                iM200293G = vwb.m200293G(listMo107333a, new w9j() { // from class: l.bd5
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f75005a.m120918H(iCeil, listMo107333a, (C8765d) obj);
                    }
                });
                if (iM200293G >= 0) {
                    i = iM200293G;
                }
            }
        }
        if (rc5.m178792g(this.f96981q)) {
            m120911A();
            List<C8765d> listM120912B = m120912B(listMo107333a);
            m120942f0(listM120912B);
            this.f96979o.mo137082b(listM120912B, this.f96962G, this.f96960E);
            return;
        }
        for (int i3 = 0; i3 < listMo107333a.size(); i3++) {
            if (i3 == i) {
                listMo107333a.get(i3).m53540v(true);
            } else {
                listMo107333a.get(i3).m53540v(false);
            }
        }
        m120942f0(listMo107333a);
        if (NullChecker.m81304b(listMo107333a)) {
            this.f96979o.mo137082b(listMo107333a, this.f96962G, this.f96960E);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m120924N() {
        m120926P();
        m120928R();
        m120925O();
    }

    /* JADX INFO: renamed from: O */
    public final void m120925O() {
        uol uolVarM178787b = rc5.m178787b(this.f96970f, this.f96981q, this.f96971g);
        this.f96978n = uolVarM178787b;
        View viewMo112508a = uolVarM178787b.mo112508a(this.f96968d, this.f96985u);
        if (NullChecker.m81303a(viewMo112508a)) {
            this.f96978n.mo112511d(this.f96960E, this.f96974j);
            this.f96978n.mo112510c(this.f96972h);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            uol uolVar = this.f96978n;
            if (uolVar instanceof nc5) {
                ((nc5) uolVar).m158900F(this.f96980p);
                ((nc5) this.f96978n).m158901G(this.f96961F);
            } else if (uolVar instanceof dmo) {
                ((dmo) uolVar).m112518t(this.f96980p);
            } else if (uolVar instanceof sdj) {
                ((sdj) uolVar).m183504p(this.f96980p);
            } else if (uolVar instanceof sfn) {
                ((sfn) uolVar).m183948p(this.f96980p);
            }
            this.f96968d.addView(viewMo112508a, layoutParams);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m120926P() {
        vol volVarM178788c = rc5.m178788c(this.f96970f, this.f96981q);
        this.f96977m = volVarM178788c;
        View viewMo127037a = volVarM178788c.mo127037a(this.f96970f, this.f96966b);
        if (NullChecker.m81303a(viewMo127037a)) {
            vol volVar = this.f96977m;
            if (volVar instanceof pc5) {
                ((pc5) volVar).m168312h(this.f96990z);
            }
            vol volVar2 = this.f96977m;
            if (volVar2 instanceof gmo) {
                ((gmo) volVar2).m127044i(this.f96960E);
                ((gmo) this.f96977m).f103507m = this.f96956A;
            }
            this.f96977m.mo127039c(this.f96970f, this.f96986v, m120915E());
            this.f96966b.addView(viewMo127037a, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m120927Q() {
        int i;
        if (CoreModule.f17557o.m195057d().mo33766Vd() && ((i = this.f96981q) == 2 || i == 1 || i == 14)) {
            this.f96984t = CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.ultraPremium)).distinctUntilChanged().subscribe(mkd0.m154956H(new e30() { // from class: l.sc5
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f163709a.m120919I((UserPrivilege) obj);
                }
            }, new e30() { // from class: l.wc5
                @Override // p149l.e30
                public final void call(Object obj) {
                    fd5.m120892c((Throwable) obj);
                }
            }));
        }
        final ProductCategory productCategory = this.f96971g.productCategory();
        this.f96982r = CoreModule.f17545c.f19654j0.m30646z5(productCategory, false).filter(new w9j() { // from class: l.xc5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new w9j() { // from class: l.yc5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f197414a.m120920J((List) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.zc5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202514a.m120921K(productCategory, (List) obj);
            }
        }));
        this.f96983s = m120914D().distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.ad5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68910a.m120922L((Long) obj);
            }
        }));
        e1b0.INSTANCE.m114403a(this.f96971g);
    }

    /* JADX INFO: renamed from: R */
    public final void m120928R() {
        boolean zM178792g = rc5.m178792g(this.f96981q);
        Act act = this.f96970f;
        if (zM178792g) {
            this.f96979o = rc5.m178789d(act, this.f96971g);
        } else {
            this.f96979o = rc5.m178791f(act, this.f96981q);
        }
        View viewMo137081a = this.f96979o.mo137081a(this.f96967c, this.f96985u);
        if (NullChecker.m81303a(viewMo137081a)) {
            this.f96967c.addView(viewMo137081a, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m120929S(int i) {
        this.f96957B = i;
    }

    /* JADX INFO: renamed from: T */
    public void m120930T(int i) {
        this.f96981q = i;
    }

    /* JADX INFO: renamed from: U */
    public final void m120931U(String str) {
        this.f96972h = str;
    }

    /* JADX INFO: renamed from: V */
    public void m120932V(long j) {
        this.f96987w = j;
    }

    /* JADX INFO: renamed from: W */
    public void m120933W(d30 d30Var) {
        this.f96974j = d30Var;
    }

    /* JADX INFO: renamed from: X */
    public void m120934X(d30 d30Var) {
        this.f96975k = d30Var;
    }

    /* JADX INFO: renamed from: Y */
    public void m120935Y(g30<PurchaseType, Act, String> g30Var) {
        this.f96980p = g30Var;
    }

    /* JADX INFO: renamed from: Z */
    public void m120936Z(int i) {
        this.f96990z = i;
    }

    /* JADX INFO: renamed from: a0 */
    public void m120937a0(Privilege privilege) {
        this.f96956A = privilege;
    }

    /* JADX INFO: renamed from: b0 */
    public void m120938b0(boolean z) {
        this.f96976l = z;
    }

    /* JADX INFO: renamed from: c0 */
    public void m120939c0(long j) {
        this.f96989y = j;
    }

    /* JADX INFO: renamed from: d0 */
    public void m120940d0(User user) {
        this.f96986v = user;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m120941e0() {
        l5j0 l5j0Var = new l5j0(this.f96970f, y7c0.f196696f);
        this.f96969e = l5j0Var;
        l5j0Var.m148649u(s4e.f162377c);
        View viewInflate = LayoutInflater.from(this.f96970f).inflate(m6c0.f131585e3, (ViewGroup) null);
        m120944v(viewInflate);
        this.f96969e.setContentView(viewInflate);
        DialogInterfaceOnCancelListenerC16807d dialogInterfaceOnCancelListenerC16807d = new DialogInterfaceOnCancelListenerC16807d(this);
        this.f96969e.setOnDismissListener(dialogInterfaceOnCancelListenerC16807d);
        this.f96969e.setOnCancelListener(dialogInterfaceOnCancelListenerC16807d);
        this.f96985u = m120915E();
        this.f96973i = i0e.m133794c("p_purchase_page", getClass().getName());
        m120924N();
        this.f96969e.show();
        m120927Q();
        if (CoreModule.m29932K().mo30835xf()) {
            CoreModule.f17545c.f19573I0.m140260N3();
        } else {
            CoreModule.f17545c.f19570H0.m210361k5();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m120942f0(List<C8765d> list) {
        String strM200307U = vwb.m200307U(iab0.m135149j(list), Constants.SEPARATOR_COMMA);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", w2b0.m201088b(this.f96972h));
            jSONObject.put("exchange_type", swh0.m186249n0(this.f96981q));
            jSONObject.put("productType", this.f96971g.productCategory().name());
            jSONObject.put("skuGroup", strM200307U);
            jSONObject.put("function_type", swh0.m186252o0(this.f96981q));
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            jSONObject.put("tooltips_type_ui", "alert_self_definition_business_a");
            jSONObject.put("tooltips_trigger_module", "purchase_button");
            jSONObject.put("tooltips_trigger_page", "anywhere");
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_trigger_reason", FirebaseAnalytics.Event.PURCHASE);
            if (CoreModule.m29935P().m94651a().mo33425U()) {
                jSONObject.put("no_secret_payment", CoreModule.f17545c.f19591O0.m30077E3());
                jSONObject.put("user_secret_staus", CoreModule.f17545c.f19591O0.m30076D3());
            }
        } catch (JSONException unused) {
        }
        this.f96973i.m109039o(jSONObject);
        i0e.m133797f(this.f96973i);
    }

    /* JADX INFO: renamed from: g0 */
    public void m120943g0() {
        if (NullChecker.m81303a(this.f96984t) && !this.f96984t.isUnsubscribed()) {
            this.f96984t.unsubscribe();
            this.f96984t = null;
        }
        if (NullChecker.m81303a(this.f96982r) && !this.f96982r.isUnsubscribed()) {
            this.f96982r.unsubscribe();
            this.f96982r = null;
        }
        if (NullChecker.m81303a(this.f96983s) && !this.f96983s.isUnsubscribed()) {
            this.f96983s.unsubscribe();
            this.f96983s = null;
        }
        if (NullChecker.m81303a(this.f96979o)) {
            this.f96979o.release();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m120944v(View view) {
        gd5.m125538a(this, view);
    }

    /* JADX INFO: renamed from: w */
    public final void m120945w() {
        Window window = this.f96969e.getWindow();
        if (NullChecker.m81303a(window)) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) window.findViewById(R.id.content).findViewById(z4c0.f201574y));
            bottomSheetBehaviorFrom.setState(3);
            this.f96965a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC16806c(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: x */
    public final CharSequence m120946x(String str) {
        if (!(this.f96977m instanceof gmo)) {
            return n6a.m158023b0(this.f96970f.getString(l7n.m148816d(), str), vwb.m200324f0(str), this.f96970f.color(b1c0.f72547f), eqh0.m117752c(3));
        }
        return str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f96970f.getString(l7n.m148817e());
    }

    /* JADX INFO: renamed from: y */
    public final int m120947y(List<C8765d> list, final int i) {
        return vwb.m200293G(list, new w9j() { // from class: l.vc5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return fd5.m120897h(i, (C8765d) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public C8765d.a m120948z(C8765d c8765d) {
        if (NullChecker.m81303a(c8765d)) {
            return c8765d.m53531m() ? c8765d.m53520b() : c8765d.m53522d();
        }
        return null;
    }
}
