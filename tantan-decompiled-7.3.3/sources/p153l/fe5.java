package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.Coin;
import com.p051p1.mobile.putong.core.data.IntlCurrencyDiamond;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class fe5 {

    /* JADX INFO: renamed from: A */
    public Privilege f98569A;

    /* JADX INFO: renamed from: B */
    public int f98570B;

    /* JADX INFO: renamed from: F */
    public lib0 f98574F;

    /* JADX INFO: renamed from: H */
    public String f98576H;

    /* JADX INFO: renamed from: I */
    public JSONArray f98577I;

    /* JADX INFO: renamed from: a */
    public LinearLayout f98578a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f98579b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f98580c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f98581d;

    /* JADX INFO: renamed from: e */
    public pej0 f98582e;

    /* JADX INFO: renamed from: f */
    public final Act f98583f;

    /* JADX INFO: renamed from: g */
    public final PurchaseType f98584g;

    /* JADX INFO: renamed from: h */
    public String f98585h;

    /* JADX INFO: renamed from: i */
    public l4g0 f98586i;

    /* JADX INFO: renamed from: j */
    public x20 f98587j;

    /* JADX INFO: renamed from: k */
    public x20 f98588k;

    /* JADX INFO: renamed from: m */
    public grl f98590m;

    /* JADX INFO: renamed from: n */
    public frl f98591n;

    /* JADX INFO: renamed from: o */
    public hrl f98592o;

    /* JADX INFO: renamed from: p */
    public a30<PurchaseType, Act, String> f98593p;

    /* JADX INFO: renamed from: r */
    public kcg0 f98595r;

    /* JADX INFO: renamed from: s */
    public kcg0 f98596s;

    /* JADX INFO: renamed from: t */
    public kcg0 f98597t;

    /* JADX INFO: renamed from: u */
    public boolean f98598u;

    /* JADX INFO: renamed from: v */
    public User f98599v;

    /* JADX INFO: renamed from: w */
    public long f98600w;

    /* JADX INFO: renamed from: x */
    public long f98601x;

    /* JADX INFO: renamed from: y */
    public long f98602y;

    /* JADX INFO: renamed from: z */
    public int f98603z;

    /* JADX INFO: renamed from: l */
    public boolean f98589l = true;

    /* JADX INFO: renamed from: q */
    public int f98594q = 0;

    /* JADX INFO: renamed from: C */
    public final DialogInterface.OnDismissListener f98571C = new DialogInterfaceOnDismissListenerC16958a();

    /* JADX INFO: renamed from: D */
    public final DialogInterface.OnCancelListener f98572D = new DialogInterfaceOnCancelListenerC16959b();

    /* JADX INFO: renamed from: E */
    public final y20<Integer> f98573E = new y20() { // from class: l.ee5
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f93619a.m125239F((Integer) obj);
        }
    };

    /* JADX INFO: renamed from: G */
    public final z20<C8928d, Boolean> f98575G = new z20() { // from class: l.td5
        @Override // p153l.z20
        public final void call(Object obj, Object obj2) {
            this.f173308a.m125240G((C8928d) obj, (Boolean) obj2);
        }
    };

    /* JADX INFO: renamed from: l.fe5$a */
    public class DialogInterfaceOnDismissListenerC16958a implements DialogInterface.OnDismissListener {
        public DialogInterfaceOnDismissListenerC16958a() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            fe5 fe5Var = fe5.this;
            if (fe5Var.f98589l && NullChecker.m82486a(fe5Var.f98588k)) {
                fe5.this.f98588k.call();
            }
            CoreModule.m30933P().m143405a().mo34311E9();
            w1e.m204401e(fe5.this.f98586i);
            fe5.this.m125266g0();
        }
    }

    /* JADX INFO: renamed from: l.fe5$b */
    public class DialogInterfaceOnCancelListenerC16959b implements DialogInterface.OnCancelListener {
        public DialogInterfaceOnCancelListenerC16959b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (NullChecker.m82486a(fe5.this.f98587j)) {
                fe5.this.f98587j.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.fe5$c */
    public class ViewTreeObserverOnGlobalLayoutListenerC16960c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f98606a;

        public ViewTreeObserverOnGlobalLayoutListenerC16960c(BottomSheetBehavior bottomSheetBehavior) {
            this.f98606a = bottomSheetBehavior;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f98606a.setPeekHeight(fe5.this.f98578a.getHeight());
            fe5.this.f98578a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: l.fe5$d */
    public static class DialogInterfaceOnCancelListenerC16961d implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final WeakReference<fe5> f98608a;

        public DialogInterfaceOnCancelListenerC16961d(fe5 fe5Var) {
            this.f98608a = new WeakReference<>(fe5Var);
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            fe5 fe5Var = this.f98608a.get();
            if (fe5Var == null || fe5Var.m125236C() == null) {
                return;
            }
            fe5Var.f98572D.onCancel(dialogInterface);
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            fe5 fe5Var = this.f98608a.get();
            if (fe5Var == null || fe5Var.m125236C() == null) {
                return;
            }
            fe5Var.f98571C.onDismiss(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: l.fe5$e */
    public static class C16962e {

        /* JADX INFO: renamed from: a */
        public final Act f98609a;

        /* JADX INFO: renamed from: b */
        public PurchaseType f98610b;

        /* JADX INFO: renamed from: c */
        public String f98611c;

        /* JADX INFO: renamed from: d */
        public a30<PurchaseType, Act, String> f98612d;

        /* JADX INFO: renamed from: e */
        public User f98613e;

        /* JADX INFO: renamed from: f */
        public long f98614f;

        /* JADX INFO: renamed from: g */
        public long f98615g;

        /* JADX INFO: renamed from: h */
        public int f98616h;

        /* JADX INFO: renamed from: i */
        public int f98617i;

        /* JADX INFO: renamed from: j */
        public int f98618j = 0;

        /* JADX INFO: renamed from: k */
        public Privilege f98619k;

        /* JADX INFO: renamed from: l */
        public x20 f98620l;

        /* JADX INFO: renamed from: m */
        public x20 f98621m;

        public C16962e(Act act) {
            this.f98609a = act;
        }

        /* JADX INFO: renamed from: a */
        public fe5 m125272a() {
            fe5 fe5Var = new fe5(this.f98609a, this.f98610b);
            fe5Var.m125253T(this.f98618j);
            fe5Var.m125254U(this.f98611c);
            fe5Var.m125256W(this.f98620l);
            fe5Var.m125258Y(this.f98612d);
            fe5Var.m125263d0(this.f98613e);
            fe5Var.m125255V(this.f98614f);
            fe5Var.m125257X(this.f98621m);
            fe5Var.m125259Z(this.f98616h);
            fe5Var.m125262c0(this.f98615g);
            fe5Var.m125260a0(this.f98619k);
            fe5Var.m125252S(this.f98617i);
            return fe5Var;
        }

        /* JADX INFO: renamed from: b */
        public C16962e m125273b(int i) {
            this.f98617i = i;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C16962e m125274c(int i) {
            this.f98618j = i;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C16962e m125275d(String str) {
            this.f98611c = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C16962e m125276e(long j) {
            this.f98614f = j;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C16962e m125277f(x20 x20Var) {
            this.f98621m = x20Var;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C16962e m125278g(a30<PurchaseType, Act, String> a30Var) {
            this.f98612d = a30Var;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C16962e m125279h(int i) {
            this.f98616h = i;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C16962e m125280i(Privilege privilege) {
            this.f98619k = privilege;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C16962e m125281j(PurchaseType purchaseType) {
            this.f98610b = purchaseType;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C16962e m125282k(long j) {
            this.f98615g = j;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public fe5 m125283l() {
            fe5 fe5VarM125272a = m125272a();
            fe5VarM125272a.m125264e0();
            return fe5VarM125272a;
        }
    }

    public fe5(Act act, PurchaseType purchaseType) {
        this.f98583f = act;
        this.f98584g = purchaseType;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m125215c(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Boolean m125220h(int i, C8928d c8928d) {
        if (NullChecker.m82486a(c8928d) && NullChecker.m82486a(c8928d.m54705d())) {
            return Boolean.valueOf(c8928d.m54705d().m54788w() >= i);
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0083 A[Catch: JSONException -> 0x00a5, TryCatch #0 {JSONException -> 0x00a5, blocks: (B:2:0x0000, B:6:0x000f, B:8:0x0028, B:10:0x0039, B:20:0x004d, B:34:0x0092, B:38:0x009f, B:22:0x0052, B:23:0x0059, B:24:0x0060, B:25:0x0067, B:26:0x006e, B:27:0x0075, B:28:0x007c, B:29:0x0083), top: B:41:0x0000 }] */
    /* JADX INFO: renamed from: A */
    public final void m125234A() {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject(RemoteConfig.m80481x().m80485F(CoreModule.m30930K().mo31838xf() ? "ttt_vas_diamond_popupab" : "ttt_vas_coin_popupab"));
            String string = jSONObject2.getString("mcclow");
            boolean zM147520m = !TextUtils.isEmpty(string) ? jyb.m147520m(JSON.parseArray(string, Integer.class), new qcj() { // from class: l.ud5
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(uqb0.f180400f0 == ((Integer) obj).intValue());
                }
            }) : false;
            int i = this.f98594q;
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
                this.f98576H = jSONObject.getString(zM147520m ? "selectedidlow" : "selectedid");
                this.f98577I = jSONObject.getJSONArray(zM147520m ? "skuidarraylow" : "skuidarray");
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: B */
    public final List<C8928d> m125235B(List<C8928d> list) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m82486a(this.f98577I)) {
            HashMap map = new HashMap();
            for (int i = 0; i < this.f98577I.length(); i++) {
                try {
                    map.put(this.f98577I.getString(i), String.valueOf(i));
                } catch (JSONException unused) {
                }
            }
            for (C8928d c8928d : list) {
                C8928d.a aVarM54703b = c8928d.m54714m() ? c8928d.m54703b() : c8928d.m54705d();
                if (map.containsKey(aVarM54703b.m54784s().defaultStockKeepUnit.f21249id)) {
                    arrayList.add(c8928d);
                    c8928d.m54723v(TextUtils.equals(aVarM54703b.m54784s().defaultStockKeepUnit.f21249id, this.f98576H));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: C */
    public pej0 m125236C() {
        return this.f98582e;
    }

    /* JADX INFO: renamed from: D */
    public final C22421c<Long> m125237D() {
        boolean zMo31838xf = CoreModule.m30930K().mo31838xf();
        Act act = this.f98583f;
        return zMo31838xf ? act.duringCreated(CoreModule.f18264c.f20315I0.m144056M3()).map(new qcj() { // from class: l.ce5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Long.valueOf(((IntlCurrencyDiamond) obj).available);
            }
        }) : act.duringCreated(CoreModule.f18264c.f20312H0.m155437a5()).map(new qcj() { // from class: l.de5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Long.valueOf(((Coin) obj).available);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public boolean m125238E() {
        return bnl0.m105588w0() <= 1280;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m125239F(Integer num) {
        if (NullChecker.m82486a(this.f98582e)) {
            if (num.intValue() == -1) {
                this.f98582e.hide();
                return;
            }
            if (num.intValue() == 0 || num.intValue() == 2) {
                if (num.intValue() == 2) {
                    m125261b0(false);
                }
                this.f98582e.dismiss();
            } else if (num.intValue() == 1) {
                this.f98582e.show();
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m125240G(C8928d c8928d, Boolean bool) {
        if (NullChecker.m82486a(this.f98590m)) {
            this.f98590m.mo131122b(c8928d);
        }
        if (NullChecker.m82486a(this.f98591n)) {
            this.f98591n.mo117349b(c8928d);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Boolean m125241H(int i, List list, C8928d c8928d) {
        boolean z;
        if (NullChecker.m82486a(m125271z(c8928d)) && m125271z(c8928d).m54784s().defaultStockKeepUnit.prices.price >= i) {
            return Boolean.TRUE;
        }
        if (NullChecker.m82486a(m125271z(c8928d))) {
            z = c8928d == list.get(list.size() - 1);
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m125242I(UserPrivilege userPrivilege) {
        if (joa.m146354D3()) {
            this.f98573E.call(0);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ C22421c m125243J(List list) {
        return CoreModule.f18273l.m143405a().mo34507g5(this.f98583f, list);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m125244K(ProductCategory productCategory, List list) {
        m125246M(productCategory, list);
        m125268w();
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m125245L(Long l2) {
        this.f98601x = l2.longValue();
        this.f98590m.mo131124d(this.f98583f, m125269x(CoreModule.m30933P().m143405a().mo34490dp(l2.longValue())));
        this.f98591n.mo117352e(l2.longValue());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041 A[PHI: r0
      0x0041: PHI (r0v8 int) = (r0v7 int), (r0v14 int) binds: [B:14:0x003f, B:9:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: M */
    public final void m125246M(ProductCategory productCategory, List<Merchandise> list) {
        int iM147476G;
        final List<C8928d> listMo147671a = zry.m221275z(productCategory).mo147671a(this.f98583f, this.f98584g, productCategory, list);
        int i = this.f98594q == 25 ? 1 : 2;
        int i2 = this.f98570B;
        if (i2 > 0) {
            iM147476G = m125270y(listMo147671a, i2);
            if (iM147476G >= 0) {
                i = iM147476G;
            }
        } else {
            long j = this.f98602y;
            if (j > 0) {
                final int iCeil = (int) Math.ceil((j - this.f98601x) / 10.0f);
                iM147476G = jyb.m147476G(listMo147671a, new qcj() { // from class: l.be5
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f76340a.m125241H(iCeil, listMo147671a, (C8928d) obj);
                    }
                });
                if (iM147476G >= 0) {
                    i = iM147476G;
                }
            }
        }
        if (rd5.m180844g(this.f98594q)) {
            m125234A();
            List<C8928d> listM125235B = m125235B(listMo147671a);
            m125265f0(listM125235B);
            this.f98592o.mo136896b(listM125235B, this.f98575G, this.f98573E);
            return;
        }
        for (int i3 = 0; i3 < listMo147671a.size(); i3++) {
            if (i3 == i) {
                listMo147671a.get(i3).m54723v(true);
            } else {
                listMo147671a.get(i3).m54723v(false);
            }
        }
        m125265f0(listMo147671a);
        if (NullChecker.m82487b(listMo147671a)) {
            this.f98592o.mo136896b(listMo147671a, this.f98575G, this.f98573E);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m125247N() {
        m125249P();
        m125251R();
        m125248O();
    }

    /* JADX INFO: renamed from: O */
    public final void m125248O() {
        frl frlVarM180839b = rd5.m180839b(this.f98583f, this.f98594q, this.f98584g);
        this.f98591n = frlVarM180839b;
        View viewMo117348a = frlVarM180839b.mo117348a(this.f98581d, this.f98598u);
        if (NullChecker.m82486a(viewMo117348a)) {
            this.f98591n.mo117351d(this.f98573E, this.f98587j);
            this.f98591n.mo117350c(this.f98585h);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            frl frlVar = this.f98591n;
            if (frlVar instanceof nd5) {
                ((nd5) frlVar).m162628F(this.f98593p);
                ((nd5) this.f98591n).m162629G(this.f98574F);
            } else if (frlVar instanceof doo) {
                ((doo) frlVar).m117358t(this.f98593p);
            } else if (frlVar instanceof mgj) {
                ((mgj) frlVar).m158345p(this.f98593p);
            } else if (frlVar instanceof shn) {
                ((shn) frlVar).m185935p(this.f98593p);
            }
            this.f98581d.addView(viewMo117348a, layoutParams);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m125249P() {
        grl grlVarM180840c = rd5.m180840c(this.f98583f, this.f98594q);
        this.f98590m = grlVarM180840c;
        View viewMo131121a = grlVarM180840c.mo131121a(this.f98583f, this.f98579b);
        if (NullChecker.m82486a(viewMo131121a)) {
            grl grlVar = this.f98590m;
            if (grlVar instanceof pd5) {
                ((pd5) grlVar).m171786h(this.f98603z);
            }
            grl grlVar2 = this.f98590m;
            if (grlVar2 instanceof goo) {
                ((goo) grlVar2).m131128i(this.f98573E);
                ((goo) this.f98590m).f105330m = this.f98569A;
            }
            this.f98590m.mo131123c(this.f98583f, this.f98599v, m125238E());
            this.f98579b.addView(viewMo131121a, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m125250Q() {
        int i;
        if (CoreModule.f18276o.m132214d().mo34769Vd() && ((i = this.f98594q) == 2 || i == 1 || i == 14)) {
            this.f98597t = CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.ultraPremium)).distinctUntilChanged().subscribe(psd0.m173597H(new y20() { // from class: l.sd5
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f167377a.m125242I((UserPrivilege) obj);
                }
            }, new y20() { // from class: l.wd5
                @Override // p153l.y20
                public final void call(Object obj) {
                    fe5.m125215c((Throwable) obj);
                }
            }));
        }
        final ProductCategory productCategory = this.f98584g.productCategory();
        this.f98595r = CoreModule.f18264c.f20396j0.m31649z5(productCategory, false).filter(new qcj() { // from class: l.xd5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new qcj() { // from class: l.yd5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f198572a.m125243J((List) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.zd5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203857a.m125244K(productCategory, (List) obj);
            }
        }));
        this.f98596s = m125237D().distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.ae5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f70765a.m125245L((Long) obj);
            }
        }));
        i9b0.INSTANCE.m139092a(this.f98584g);
    }

    /* JADX INFO: renamed from: R */
    public final void m125251R() {
        boolean zM180844g = rd5.m180844g(this.f98594q);
        Act act = this.f98583f;
        if (zM180844g) {
            this.f98592o = rd5.m180841d(act, this.f98584g);
        } else {
            this.f98592o = rd5.m180843f(act, this.f98594q);
        }
        View viewMo136895a = this.f98592o.mo136895a(this.f98580c, this.f98598u);
        if (NullChecker.m82486a(viewMo136895a)) {
            this.f98580c.addView(viewMo136895a, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m125252S(int i) {
        this.f98570B = i;
    }

    /* JADX INFO: renamed from: T */
    public void m125253T(int i) {
        this.f98594q = i;
    }

    /* JADX INFO: renamed from: U */
    public final void m125254U(String str) {
        this.f98585h = str;
    }

    /* JADX INFO: renamed from: V */
    public void m125255V(long j) {
        this.f98600w = j;
    }

    /* JADX INFO: renamed from: W */
    public void m125256W(x20 x20Var) {
        this.f98587j = x20Var;
    }

    /* JADX INFO: renamed from: X */
    public void m125257X(x20 x20Var) {
        this.f98588k = x20Var;
    }

    /* JADX INFO: renamed from: Y */
    public void m125258Y(a30<PurchaseType, Act, String> a30Var) {
        this.f98593p = a30Var;
    }

    /* JADX INFO: renamed from: Z */
    public void m125259Z(int i) {
        this.f98603z = i;
    }

    /* JADX INFO: renamed from: a0 */
    public void m125260a0(Privilege privilege) {
        this.f98569A = privilege;
    }

    /* JADX INFO: renamed from: b0 */
    public void m125261b0(boolean z) {
        this.f98589l = z;
    }

    /* JADX INFO: renamed from: c0 */
    public void m125262c0(long j) {
        this.f98602y = j;
    }

    /* JADX INFO: renamed from: d0 */
    public void m125263d0(User user) {
        this.f98599v = user;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m125264e0() {
        pej0 pej0Var = new pej0(this.f98583f, dgc0.f88282g);
        this.f98582e = pej0Var;
        pej0Var.m172032u(g6e.f102429c);
        View viewInflate = LayoutInflater.from(this.f98583f).inflate(rec0.f162545e3, (ViewGroup) null);
        m125267v(viewInflate);
        this.f98582e.setContentView(viewInflate);
        DialogInterfaceOnCancelListenerC16961d dialogInterfaceOnCancelListenerC16961d = new DialogInterfaceOnCancelListenerC16961d(this);
        this.f98582e.setOnDismissListener(dialogInterfaceOnCancelListenerC16961d);
        this.f98582e.setOnCancelListener(dialogInterfaceOnCancelListenerC16961d);
        this.f98598u = m125238E();
        this.f98586i = w1e.m204399c("p_purchase_page", getClass().getName());
        m125247N();
        this.f98582e.show();
        m125250Q();
        if (CoreModule.m30930K().mo31838xf()) {
            CoreModule.f18264c.f20315I0.m144057N3();
        } else {
            CoreModule.f18264c.f20312H0.m155449k5();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m125265f0(List<C8928d> list) {
        String strM147490U = jyb.m147490U(mib0.m158481j(list), Constants.SEPARATOR_COMMA);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", abb0.m96735b(this.f98585h));
            jSONObject.put("exchange_type", a5i0.m96154n0(this.f98594q));
            jSONObject.put("productType", this.f98584g.productCategory().name());
            jSONObject.put("skuGroup", strM147490U);
            jSONObject.put("function_type", a5i0.m96157o0(this.f98594q));
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            jSONObject.put("tooltips_type_ui", "alert_self_definition_business_a");
            jSONObject.put("tooltips_trigger_module", "purchase_button");
            jSONObject.put("tooltips_trigger_page", "anywhere");
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_trigger_reason", FirebaseAnalytics.Event.PURCHASE);
            if (CoreModule.m30933P().m143405a().mo34428U()) {
                jSONObject.put("no_secret_payment", CoreModule.f18264c.f20333O0.m31075E3());
                jSONObject.put("user_secret_staus", CoreModule.f18264c.f20333O0.m31074D3());
            }
        } catch (JSONException unused) {
        }
        this.f98586i.m152780o(jSONObject);
        w1e.m204402f(this.f98586i);
    }

    /* JADX INFO: renamed from: g0 */
    public void m125266g0() {
        if (NullChecker.m82486a(this.f98597t) && !this.f98597t.isUnsubscribed()) {
            this.f98597t.unsubscribe();
            this.f98597t = null;
        }
        if (NullChecker.m82486a(this.f98595r) && !this.f98595r.isUnsubscribed()) {
            this.f98595r.unsubscribe();
            this.f98595r = null;
        }
        if (NullChecker.m82486a(this.f98596s) && !this.f98596s.isUnsubscribed()) {
            this.f98596s.unsubscribe();
            this.f98596s = null;
        }
        if (NullChecker.m82486a(this.f98592o)) {
            this.f98592o.release();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m125267v(View view) {
        ge5.m129966a(this, view);
    }

    /* JADX INFO: renamed from: w */
    public final void m125268w() {
        Window window = this.f98582e.getWindow();
        if (NullChecker.m82486a(window)) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) window.findViewById(R.id.content).findViewById(fdc0.f98450y));
            bottomSheetBehaviorFrom.setState(3);
            this.f98578a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC16960c(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: x */
    public final CharSequence m125269x(String str) {
        if (!(this.f98590m instanceof goo)) {
            return z7a.m218868b0(this.f98583f.getString(l9n.m153439d(), str), jyb.m147507f0(str), this.f98583f.color(h9c0.f108367f), lyh0.m156283c(3));
        }
        return str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f98583f.getString(l9n.m153440e());
    }

    /* JADX INFO: renamed from: y */
    public final int m125270y(List<C8928d> list, final int i) {
        return jyb.m147476G(list, new qcj() { // from class: l.vd5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return fe5.m125220h(i, (C8928d) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public C8928d.a m125271z(C8928d c8928d) {
        if (NullChecker.m82486a(c8928d)) {
            return c8928d.m54714m() ? c8928d.m54703b() : c8928d.m54705d();
        }
        return null;
    }
}
