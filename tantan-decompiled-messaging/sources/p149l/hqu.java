package p149l;

import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.PurchasePaymentParam;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveCoin;
import com.p046p1.mobile.putong.live.base.data.BLiveMerchandise;
import com.p046p1.mobile.putong.live.base.data.BLiveStockKeepUnit;
import com.p046p1.mobile.putong.live.external.internal.vchat.C12505a;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatPayItemView;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatRechargeItemView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.increment.recharge.CustomClickConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p147v.VEditText;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class hqu {

    /* JADX INFO: renamed from: A */
    public List<BLiveMerchandise> f109104A;

    /* JADX INFO: renamed from: B */
    public BLiveMerchandise f109105B;

    /* JADX INFO: renamed from: C */
    public d30 f109106C;

    /* JADX INFO: renamed from: D */
    public d30 f109107D;

    /* JADX INFO: renamed from: E */
    public d30 f109108E;

    /* JADX INFO: renamed from: F */
    public String f109109F;

    /* JADX INFO: renamed from: G */
    public int f109110G;

    /* JADX INFO: renamed from: H */
    public double f109111H;

    /* JADX INFO: renamed from: I */
    public int f109112I;

    /* JADX INFO: renamed from: J */
    public int f109113J;

    /* JADX INFO: renamed from: K */
    public PayMethod f109114K;

    /* JADX INFO: renamed from: L */
    public BLiveMerchandise f109115L;

    /* JADX INFO: renamed from: M */
    public boolean f109116M;

    /* JADX INFO: renamed from: N */
    public int f109117N;

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f109119a;

    /* JADX INFO: renamed from: b */
    public View f109120b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f109121c;

    /* JADX INFO: renamed from: d */
    public VEditText f109122d;

    /* JADX INFO: renamed from: e */
    public VText f109123e;

    /* JADX INFO: renamed from: f */
    public View f109124f;

    /* JADX INFO: renamed from: g */
    public CustomClickConstraintLayout f109125g;

    /* JADX INFO: renamed from: h */
    public VText f109126h;

    /* JADX INFO: renamed from: i */
    public VText f109127i;

    /* JADX INFO: renamed from: j */
    public LiveVChatRechargeItemView f109128j;

    /* JADX INFO: renamed from: k */
    public LiveVChatRechargeItemView f109129k;

    /* JADX INFO: renamed from: l */
    public LiveVChatRechargeItemView f109130l;

    /* JADX INFO: renamed from: m */
    public LiveVChatRechargeItemView f109131m;

    /* JADX INFO: renamed from: n */
    public LiveVChatRechargeItemView f109132n;

    /* JADX INFO: renamed from: o */
    public LiveVChatRechargeItemView f109133o;

    /* JADX INFO: renamed from: p */
    public ConstraintLayout f109134p;

    /* JADX INFO: renamed from: q */
    public LiveVChatPayItemView f109135q;

    /* JADX INFO: renamed from: r */
    public LiveVChatPayItemView f109136r;

    /* JADX INFO: renamed from: s */
    public VText f109137s;

    /* JADX INFO: renamed from: t */
    public Group f109138t;

    /* JADX INFO: renamed from: u */
    public VText f109139u;

    /* JADX INFO: renamed from: v */
    public Act f109140v;

    /* JADX INFO: renamed from: w */
    public BottomSheetDialog f109141w;

    /* JADX INFO: renamed from: x */
    public ArrayList<LiveVChatRechargeItemView> f109142x;

    /* JADX INFO: renamed from: y */
    public BottomSheetDialog f109143y;

    /* JADX INFO: renamed from: z */
    public boolean f109144z = true;

    /* JADX INFO: renamed from: O */
    public final f30<BLiveMerchandise, LiveVChatRechargeItemView> f109118O = new f30() { // from class: l.mpu
        @Override // p149l.f30
        public final void call(Object obj, Object obj2) {
            this.f135087a.m132547N((BLiveMerchandise) obj, (LiveVChatRechargeItemView) obj2);
        }
    };

    /* JADX INFO: renamed from: l.hqu$a */
    public class C17375a implements w9j<List<BLiveMerchandise>, List<BLiveMerchandise>> {
        public C17375a() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<BLiveMerchandise> call(List<BLiveMerchandise> list) {
            if (hqu.this.f109117N <= 0 || list.size() != 6) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list);
            BLiveMerchandise bLiveMerchandiseMo223809clone = ((BLiveMerchandise) arrayList.get(5)).mo223809clone();
            bLiveMerchandiseMo223809clone.isCustomRecharge = false;
            bLiveMerchandiseMo223809clone.isCustomRechargeInput = false;
            bLiveMerchandiseMo223809clone.quantity = hqu.this.f109117N;
            bLiveMerchandiseMo223809clone.defaultStockKeepUnit.prices.price = ((double) hqu.this.f109117N) / 10.0d;
            bLiveMerchandiseMo223809clone.isIncomingPrice = true;
            arrayList.remove(4);
            arrayList.add(4, bLiveMerchandiseMo223809clone);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: l.hqu$b */
    public class C17376b extends jii0 {
        public C17376b() {
        }

        @Override // p149l.jii0, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            hqu.this.f109123e.setEnabled(editable.toString().length() > 0);
        }
    }

    /* JADX INFO: renamed from: l.hqu$c */
    public static class C17377c {

        /* JADX INFO: renamed from: a */
        public final Act f109147a;

        /* JADX INFO: renamed from: b */
        public d30 f109148b;

        /* JADX INFO: renamed from: c */
        public d30 f109149c;

        /* JADX INFO: renamed from: d */
        public d30 f109150d;

        /* JADX INFO: renamed from: e */
        public boolean f109151e;

        /* JADX INFO: renamed from: f */
        public int f109152f;

        public C17377c(Act act) {
            this.f109147a = act;
        }

        /* JADX INFO: renamed from: a */
        public hqu m132579a() {
            hqu hquVar = new hqu(this.f109147a);
            hquVar.m132564e0(this.f109148b);
            hquVar.m132566g0(this.f109149c);
            hquVar.m132565f0(this.f109150d);
            hquVar.m132563d0(this.f109151e);
            hquVar.m132562c0(this.f109152f);
            return hquVar;
        }

        /* JADX INFO: renamed from: b */
        public C17377c m132580b(boolean z) {
            this.f109151e = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C17377c m132581c(int i) {
            this.f109152f = i;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C17377c m132582d(d30 d30Var) {
            this.f109148b = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C17377c m132583e(d30 d30Var) {
            this.f109149c = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public hqu m132584f() {
            hqu hquVarM132579a = m132579a();
            hquVarM132579a.m132568i0(this.f109152f);
            return hquVarM132579a;
        }
    }

    /* JADX INFO: renamed from: l.hqu$d */
    public static class C17378d {

        /* JADX INFO: renamed from: a */
        public String f109153a;

        /* JADX INFO: renamed from: b */
        public int f109154b;

        /* JADX INFO: renamed from: c */
        public int f109155c;

        /* JADX INFO: renamed from: d */
        public int f109156d;

        /* JADX INFO: renamed from: e */
        public BLiveMerchandise f109157e;

        /* JADX INFO: renamed from: f */
        public PayMethod f109158f;
    }

    public hqu(Act act) {
        if (act == null) {
            return;
        }
        this.f109140v = act;
        if (this.f109141w == null) {
            m132536C();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m132528o(LiveVChatRechargeItemView liveVChatRechargeItemView, LiveVChatRechargeItemView liveVChatRechargeItemView2) {
        if (liveVChatRechargeItemView2 != liveVChatRechargeItemView) {
            liveVChatRechargeItemView2.m69786m0(false);
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ Boolean m132531r(LiveVChatRechargeItemView liveVChatRechargeItemView) {
        BLiveMerchandise currentRechargeModule = liveVChatRechargeItemView.getCurrentRechargeModule();
        return Boolean.valueOf(currentRechargeModule != null && currentRechargeModule.isCustomRecharge);
    }

    @Nullable
    /* JADX INFO: renamed from: A */
    public final LiveVChatRechargeItemView m132534A() {
        return (LiveVChatRechargeItemView) vwb.m200346r(this.f109142x, new w9j() { // from class: l.spu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return hqu.m132531r((LiveVChatRechargeItemView) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public PurchasePaymentParam m132535B(C17378d c17378d) {
        PurchasePaymentParam purchasePaymentParamNew_ = PurchasePaymentParam.new_();
        purchasePaymentParamNew_.itemId = c17378d.f109153a;
        int i = c17378d.f109155c;
        if (i > 0) {
            purchasePaymentParamNew_.quantity = i;
        }
        return purchasePaymentParamNew_;
    }

    /* JADX INFO: renamed from: C */
    public final void m132536C() {
        this.f109141w = new BottomSheetDialog(this.f109140v, c8c0.f79739d);
        View viewInflate = LayoutInflater.from(this.f109140v).inflate(s6c0.f162666F1, (ViewGroup) null);
        m132572u(viewInflate);
        gkh0.m126627j("videoChat", "show:fastRechargeDialog");
        this.f109141w.setContentView(viewInflate);
        ArrayList<LiveVChatRechargeItemView> arrayList = new ArrayList<>();
        this.f109142x = arrayList;
        arrayList.add(this.f109128j);
        this.f109142x.add(this.f109129k);
        this.f109142x.add(this.f109130l);
        this.f109142x.add(this.f109131m);
        this.f109142x.add(this.f109132n);
        this.f109142x.add(this.f109133o);
        this.f109124f.setOnClickListener(new View.OnClickListener() { // from class: l.equ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92853a.m132542I(view);
            }
        });
        m132537D();
        xdl0.m208329E0(this.f109139u, new View.OnClickListener() { // from class: l.fqu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98843a.m132543J(view);
            }
        });
        this.f109141w.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.gqu
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f103982a.m132544K(dialogInterface);
            }
        });
        this.f109141w.show();
    }

    /* JADX INFO: renamed from: D */
    public void m132537D() {
        this.f109139u.setEnabled(true);
        this.f109135q.m69771k0(ypv.f199493a.m199350i());
        this.f109135q.setOnClickListener(new View.OnClickListener() { // from class: l.vpu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182523a.m132557X(view);
            }
        });
        this.f109136r.m69771k0(ypv.f199493a.m199354k());
        this.f109136r.setOnClickListener(new View.OnClickListener() { // from class: l.vpu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182523a.m132557X(view);
            }
        });
        if (ypv.f199493a.m199357l0()) {
            m132577z(false);
            xdl0.m208329E0(this.f109137s, new View.OnClickListener() { // from class: l.wpu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f187578a.m132545L(view);
                }
            });
        } else {
            m132577z(true);
        }
        m132560a0();
    }

    /* JADX INFO: renamed from: E */
    public final void m132538E(final double d, boolean z) {
        if (z) {
            BLiveMerchandise currentRechargeModule = this.f109132n.getCurrentRechargeModule();
            this.f109115L = currentRechargeModule;
            BLiveStockKeepUnit bLiveStockKeepUnit = currentRechargeModule.defaultStockKeepUnit;
            this.f109109F = bLiveStockKeepUnit.f44443id;
            int i = currentRechargeModule.quantity;
            this.f109113J = i;
            double d2 = bLiveStockKeepUnit.prices.price;
            this.f109110G = (int) d2;
            this.f109111H = d2;
            this.f109112I = i;
            m132570k0(this.f109132n);
            return;
        }
        if (d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.f109128j.performClick();
            return;
        }
        LiveVChatRechargeItemView liveVChatRechargeItemView = (LiveVChatRechargeItemView) vwb.m200346r(this.f109142x, new w9j() { // from class: l.cqu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f82115a.m132546M(d, (LiveVChatRechargeItemView) obj);
            }
        });
        if (liveVChatRechargeItemView != null) {
            liveVChatRechargeItemView.performClick();
            return;
        }
        LiveVChatRechargeItemView liveVChatRechargeItemView2 = this.f109142x.get(0);
        for (LiveVChatRechargeItemView liveVChatRechargeItemView3 : this.f109142x) {
            if (m132541H(liveVChatRechargeItemView3, liveVChatRechargeItemView2.getTTPrice())) {
                liveVChatRechargeItemView2 = liveVChatRechargeItemView3;
            }
        }
        liveVChatRechargeItemView2.performClick();
    }

    /* JADX INFO: renamed from: F */
    public final boolean m132539F(LiveVChatRechargeItemView liveVChatRechargeItemView) {
        BLiveMerchandise currentRechargeModule = liveVChatRechargeItemView.getCurrentRechargeModule();
        return currentRechargeModule != null && currentRechargeModule.isCustomRecharge;
    }

    /* JADX INFO: renamed from: G */
    public boolean m132540G() {
        return this.f109140v == null;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m132541H(LiveVChatRechargeItemView liveVChatRechargeItemView, double d) {
        return !m132539F(liveVChatRechargeItemView) && ((double) liveVChatRechargeItemView.getTTPrice()) >= d;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m132542I(View view) {
        this.f109141w.dismiss();
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m132543J(View view) {
        m132571l0();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m132544K(DialogInterface dialogInterface) {
        if (m132540G()) {
            return;
        }
        d30 d30Var = this.f109106C;
        if (d30Var != null) {
            d30Var.call();
            gkh0.m126627j("videoChat", "action:onCancel");
        }
        m132559Z();
        m132576y();
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m132545L(View view) {
        m132577z(true);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ Boolean m132546M(double d, LiveVChatRechargeItemView liveVChatRechargeItemView) {
        return Boolean.valueOf(m132541H(liveVChatRechargeItemView, d));
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m132547N(BLiveMerchandise bLiveMerchandise, LiveVChatRechargeItemView liveVChatRechargeItemView) {
        if (m132540G()) {
            return;
        }
        if (bLiveMerchandise.isCustomRecharge) {
            m132567h0();
            return;
        }
        this.f109115L = bLiveMerchandise;
        BLiveStockKeepUnit bLiveStockKeepUnit = bLiveMerchandise.defaultStockKeepUnit;
        this.f109109F = bLiveStockKeepUnit.f44443id;
        if (bLiveMerchandise.isIncomingPrice || bLiveMerchandise.isOneRMBRecharge) {
            this.f109113J = bLiveMerchandise.quantity;
        } else {
            this.f109113J = 0;
        }
        double d = bLiveStockKeepUnit.prices.price;
        this.f109110G = (int) d;
        this.f109111H = d;
        this.f109112I = bLiveMerchandise.quantity;
        m132570k0(liveVChatRechargeItemView);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m132548O() {
        lsi0.m151593w(R$string.f47479qe);
        d30 d30Var = this.f109107D;
        if (d30Var != null) {
            d30Var.call();
        }
        BottomSheetDialog bottomSheetDialog = this.f109141w;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.dismiss();
        }
        gkh0.m126627j("videoChat", "action:onPaySuccess");
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m132549P() {
        d30 d30Var = this.f109108E;
        if (d30Var != null) {
            d30Var.call();
        }
        m132560a0();
        if (this.f109144z) {
            m132577z(true);
        }
        lsi0.m151578h(R$string.f47435oe);
        gkh0.m126627j("videoChat", "action:onPayFail");
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m132550Q() {
        this.f109122d.requestFocus();
        this.f109140v.showInput(this.f109122d, 0);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m132551R(DialogInterface dialogInterface) {
        if (m132540G()) {
            return;
        }
        this.f109122d.setText("");
        this.f109140v.postDelayed(new Runnable() { // from class: l.tpu
            @Override // java.lang.Runnable
            public final void run() {
                this.f171508a.m132550Q();
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m132552S(View view) {
        m132576y();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m132553T(View view) {
        m132575x();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m132554U(double d, List list) {
        this.f109141w.show();
        m132558Y(list);
        m132538E(d, list.size() == 6 && this.f109117N > 0);
        aru.m98563l(list, this.f109144z, User.ID_TEAM_ACCOUNT);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m132555V(BLiveCoin bLiveCoin) {
        this.f109127i.setText(ypv.f199497e.getString(R$string.f46973T6, zfv.m218597r0(bLiveCoin.available)));
    }

    /* JADX INFO: renamed from: W */
    public void m132556W(C17378d c17378d) {
        ypv.f199493a.m199333Z(this.f109140v, m132535B(c17378d), new d30() { // from class: l.qpu
            @Override // p149l.d30
            public final void call() {
                this.f155829a.m132548O();
            }
        }, new d30() { // from class: l.rpu
            @Override // p149l.d30
            public final void call() {
                this.f160562a.m132549P();
            }
        }, c17378d.f109158f);
    }

    /* JADX INFO: renamed from: X */
    public void m132557X(View view) {
        if (view == this.f109135q) {
            this.f109114K = ypv.f199493a.m199350i();
            m132561b0(this.f109135q);
        } else if (view == this.f109136r) {
            this.f109114K = ypv.f199493a.m199354k();
            m132561b0(this.f109136r);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m132558Y(List<BLiveMerchandise> list) {
        for (int i = 0; i < this.f109142x.size(); i++) {
            LiveVChatRechargeItemView liveVChatRechargeItemView = this.f109142x.get(i);
            if (i < list.size()) {
                liveVChatRechargeItemView.m69788o0(list.get(i), this.f109118O);
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m132559Z() {
        BLiveMerchandise currentRechargeModule;
        LiveVChatRechargeItemView liveVChatRechargeItemView = (LiveVChatRechargeItemView) vwb.m200346r(this.f109142x, new w9j() { // from class: l.upu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(this.f177671a.m132539F((LiveVChatRechargeItemView) obj));
            }
        });
        if (liveVChatRechargeItemView == null || (currentRechargeModule = liveVChatRechargeItemView.getCurrentRechargeModule()) == null) {
            return;
        }
        currentRechargeModule.isCustomRechargeInput = false;
        liveVChatRechargeItemView.m69788o0(currentRechargeModule, this.f109118O);
    }

    /* JADX INFO: renamed from: a0 */
    public void m132560a0() {
        if (ypv.f199493a.m199317J()) {
            return;
        }
        this.f109135q.performClick();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m132561b0(@androidx.annotation.Nullable final LiveVChatPayItemView liveVChatPayItemView) {
        vwb.m200354z(vwb.m200324f0(this.f109135q, this.f109136r), new e30() { // from class: l.ypu
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveVChatPayItemView liveVChatPayItemView2 = (LiveVChatPayItemView) obj;
                liveVChatPayItemView2.setSelected(liveVChatPayItemView2 == liveVChatPayItemView);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public void m132562c0(int i) {
        this.f109117N = i;
    }

    /* JADX INFO: renamed from: d0 */
    public void m132563d0(boolean z) {
        this.f109116M = z;
    }

    /* JADX INFO: renamed from: e0 */
    public void m132564e0(d30 d30Var) {
        this.f109106C = d30Var;
    }

    /* JADX INFO: renamed from: f0 */
    public void m132565f0(d30 d30Var) {
        this.f109108E = d30Var;
    }

    /* JADX INFO: renamed from: g0 */
    public void m132566g0(d30 d30Var) {
        this.f109107D = d30Var;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m132567h0() {
        if (this.f109143y == null) {
            this.f109143y = new BottomSheetDialog(this.f109140v, c8c0.f79739d);
            View viewInflate = LayoutInflater.from(this.f109140v).inflate(s6c0.f162669G1, (ViewGroup) null);
            m132573v(viewInflate);
            this.f109143y.getWindow().getDecorView().setMinimumWidth(xdl0.m208412y0());
            this.f109143y.getWindow().getDecorView().setMinimumHeight(xdl0.m208408w0());
            this.f109143y.setContentView(viewInflate);
            this.f109143y.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.npu
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f140003a.m132551R(dialogInterface);
                }
            });
            this.f109120b.setOnClickListener(new View.OnClickListener() { // from class: l.opu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f145049a.m132552S(view);
                }
            });
            this.f109122d.addTextChangedListener(m132569j0());
            this.f109123e.setOnClickListener(new View.OnClickListener() { // from class: l.ppu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f150720a.m132553T(view);
                }
            });
        }
        this.f109143y.show();
        gkh0.m126627j("videoChat", "show:inputDialog");
    }

    /* JADX INFO: renamed from: i0 */
    public void m132568i0(final double d) {
        if (m132540G()) {
            return;
        }
        this.f109126h.setText(w8u.m202217t(this.f109116M ? com.p046p1.mobile.putong.live.external.R$string.f44907j : com.p046p1.mobile.putong.live.external.R$string.f44919p));
        this.f109140v.duringCreated(C22306c.zip(C12505a.m69240j(), C12505a.m69241k(), new x9j() { // from class: l.xpu
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f193957a.m132574w((List) obj, (BLiveMerchandise) obj2);
            }
        }).observeOn(jo0.m142408a())).take(1).map(new C17375a()).subscribe(ffw.m121194e(new e30() { // from class: l.zpu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204309a.m132554U(d, (List) obj);
            }
        }, new e30() { // from class: l.aqu
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151595y(ypv.f199497e.getString(R$string.f46873Ob));
            }
        }));
        this.f109140v.duringCreated(C12505a.m69242l()).subscribe(ffw.m121193d(new e30() { // from class: l.bqu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76816a.m132555V((BLiveCoin) obj);
            }
        }));
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final jii0 m132569j0() {
        return new C17376b();
    }

    /* JADX INFO: renamed from: k0 */
    public void m132570k0(final LiveVChatRechargeItemView liveVChatRechargeItemView) {
        liveVChatRechargeItemView.m69786m0(true);
        vwb.m200354z(this.f109142x, new e30() { // from class: l.dqu
            @Override // p149l.e30
            public final void call(Object obj) {
                hqu.m132528o(liveVChatRechargeItemView, (LiveVChatRechargeItemView) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public final void m132571l0() {
        gkh0.m126627j("videoChat", "action:tryToStartPay,selectedItemPrice:" + this.f109110G + ",payMethod:" + this.f109114K);
        if (TextUtils.isEmpty(this.f109109F)) {
            return;
        }
        if (ypv.f199493a.m199315H() || this.f109110G != 0) {
            if (ypv.f199493a.m199315H() && this.f109111H == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return;
            }
            C17378d c17378d = new C17378d();
            c17378d.f109153a = this.f109109F;
            c17378d.f109154b = this.f109110G;
            c17378d.f109155c = this.f109113J;
            c17378d.f109156d = this.f109112I;
            c17378d.f109157e = this.f109115L;
            c17378d.f109158f = this.f109114K;
            m132556W(c17378d);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m132572u(View view) {
        iqu.m137792a(this, view);
    }

    /* JADX INFO: renamed from: v */
    public final void m132573v(View view) {
        jqu.m142852a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public List<BLiveMerchandise> m132574w(List<BLiveMerchandise> list, BLiveMerchandise bLiveMerchandise) {
        this.f109104A = list;
        this.f109105B = bLiveMerchandise;
        return C12505a.m69239i(new ArrayList(list), bLiveMerchandise);
    }

    /* JADX INFO: renamed from: x */
    public final void m132575x() {
        int i;
        LiveVChatRechargeItemView liveVChatRechargeItemViewM132534A = m132534A();
        if (liveVChatRechargeItemViewM132534A == null) {
            lsi0.m151595y(ypv.f199497e.getString(R$string.f46873Ob));
            m132576y();
            return;
        }
        try {
            i = Integer.parseInt(this.f109122d.getText().toString());
        } catch (NumberFormatException unused) {
            i = 0;
        }
        if (i <= 0 || i >= 50001) {
            lsi0.m151595y(ypv.f199497e.getString(R$string.f46739I6));
            return;
        }
        m132576y();
        m132570k0(liveVChatRechargeItemViewM132534A);
        BLiveMerchandise currentRechargeModule = liveVChatRechargeItemViewM132534A.getCurrentRechargeModule();
        BLiveStockKeepUnit bLiveStockKeepUnit = currentRechargeModule.defaultStockKeepUnit;
        this.f109109F = bLiveStockKeepUnit.f44443id;
        int i2 = i * 10;
        this.f109113J = i2;
        this.f109110G = i;
        this.f109112I = i2;
        currentRechargeModule.quantity = i2;
        bLiveStockKeepUnit.prices.price = i;
        currentRechargeModule.isCustomRechargeInput = true;
        liveVChatRechargeItemViewM132534A.m69788o0(currentRechargeModule, this.f109118O);
    }

    /* JADX INFO: renamed from: y */
    public void m132576y() {
        VEditText vEditText;
        Act act = this.f109140v;
        if (act != null && (vEditText = this.f109122d) != null) {
            act.hideInput(vEditText);
        }
        BottomSheetDialog bottomSheetDialog = this.f109143y;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m132577z(boolean z) {
        if (m132540G()) {
            return;
        }
        if (!z) {
            this.f109137s.setVisibility(0);
            this.f109138t.setVisibility(8);
        } else {
            this.f109144z = false;
            this.f109137s.setVisibility(8);
            this.f109138t.setVisibility(0);
        }
    }
}
