package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.PurchasePaymentParam;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveCoin;
import com.p051p1.mobile.putong.live.base.data.BLiveMerchandise;
import com.p051p1.mobile.putong.live.base.data.BLiveStockKeepUnit;
import com.p051p1.mobile.putong.live.external.internal.vchat.C12668a;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatPayItemView;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatRechargeItemView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.increment.recharge.CustomClickConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p151v.VEditText;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class isu {

    /* JADX INFO: renamed from: A */
    public List<BLiveMerchandise> f116703A;

    /* JADX INFO: renamed from: B */
    public BLiveMerchandise f116704B;

    /* JADX INFO: renamed from: C */
    public x20 f116705C;

    /* JADX INFO: renamed from: D */
    public x20 f116706D;

    /* JADX INFO: renamed from: E */
    public x20 f116707E;

    /* JADX INFO: renamed from: F */
    public String f116708F;

    /* JADX INFO: renamed from: G */
    public int f116709G;

    /* JADX INFO: renamed from: H */
    public double f116710H;

    /* JADX INFO: renamed from: I */
    public int f116711I;

    /* JADX INFO: renamed from: J */
    public int f116712J;

    /* JADX INFO: renamed from: K */
    public PayMethod f116713K;

    /* JADX INFO: renamed from: L */
    public BLiveMerchandise f116714L;

    /* JADX INFO: renamed from: M */
    public boolean f116715M;

    /* JADX INFO: renamed from: N */
    public int f116716N;

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f116718a;

    /* JADX INFO: renamed from: b */
    public View f116719b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f116720c;

    /* JADX INFO: renamed from: d */
    public VEditText f116721d;

    /* JADX INFO: renamed from: e */
    public VText f116722e;

    /* JADX INFO: renamed from: f */
    public View f116723f;

    /* JADX INFO: renamed from: g */
    public CustomClickConstraintLayout f116724g;

    /* JADX INFO: renamed from: h */
    public VText f116725h;

    /* JADX INFO: renamed from: i */
    public VText f116726i;

    /* JADX INFO: renamed from: j */
    public LiveVChatRechargeItemView f116727j;

    /* JADX INFO: renamed from: k */
    public LiveVChatRechargeItemView f116728k;

    /* JADX INFO: renamed from: l */
    public LiveVChatRechargeItemView f116729l;

    /* JADX INFO: renamed from: m */
    public LiveVChatRechargeItemView f116730m;

    /* JADX INFO: renamed from: n */
    public LiveVChatRechargeItemView f116731n;

    /* JADX INFO: renamed from: o */
    public LiveVChatRechargeItemView f116732o;

    /* JADX INFO: renamed from: p */
    public ConstraintLayout f116733p;

    /* JADX INFO: renamed from: q */
    public LiveVChatPayItemView f116734q;

    /* JADX INFO: renamed from: r */
    public LiveVChatPayItemView f116735r;

    /* JADX INFO: renamed from: s */
    public VText f116736s;

    /* JADX INFO: renamed from: t */
    public Group f116737t;

    /* JADX INFO: renamed from: u */
    public VText f116738u;

    /* JADX INFO: renamed from: v */
    public Act f116739v;

    /* JADX INFO: renamed from: w */
    public BottomSheetDialog f116740w;

    /* JADX INFO: renamed from: x */
    public ArrayList<LiveVChatRechargeItemView> f116741x;

    /* JADX INFO: renamed from: y */
    public BottomSheetDialog f116742y;

    /* JADX INFO: renamed from: z */
    public boolean f116743z = true;

    /* JADX INFO: renamed from: O */
    public final z20<BLiveMerchandise, LiveVChatRechargeItemView> f116717O = new z20() { // from class: l.nru
        @Override // p153l.z20
        public final void call(Object obj, Object obj2) {
            this.f143431a.m141932N((BLiveMerchandise) obj, (LiveVChatRechargeItemView) obj2);
        }
    };

    /* JADX INFO: renamed from: l.isu$a */
    public class C17794a implements qcj<List<BLiveMerchandise>, List<BLiveMerchandise>> {
        public C17794a() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<BLiveMerchandise> call(List<BLiveMerchandise> list) {
            if (isu.this.f116716N <= 0 || list.size() != 6) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list);
            BLiveMerchandise bLiveMerchandiseMo225055clone = ((BLiveMerchandise) arrayList.get(5)).mo225055clone();
            bLiveMerchandiseMo225055clone.isCustomRecharge = false;
            bLiveMerchandiseMo225055clone.isCustomRechargeInput = false;
            bLiveMerchandiseMo225055clone.quantity = isu.this.f116716N;
            bLiveMerchandiseMo225055clone.defaultStockKeepUnit.prices.price = ((double) isu.this.f116716N) / 10.0d;
            bLiveMerchandiseMo225055clone.isIncomingPrice = true;
            arrayList.remove(4);
            arrayList.add(4, bLiveMerchandiseMo225055clone);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: l.isu$b */
    public class C17795b extends jri0 {
        public C17795b() {
        }

        @Override // p153l.jri0, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            isu.this.f116722e.setEnabled(editable.toString().length() > 0);
        }
    }

    /* JADX INFO: renamed from: l.isu$c */
    public static class C17796c {

        /* JADX INFO: renamed from: a */
        public final Act f116746a;

        /* JADX INFO: renamed from: b */
        public x20 f116747b;

        /* JADX INFO: renamed from: c */
        public x20 f116748c;

        /* JADX INFO: renamed from: d */
        public x20 f116749d;

        /* JADX INFO: renamed from: e */
        public boolean f116750e;

        /* JADX INFO: renamed from: f */
        public int f116751f;

        public C17796c(Act act) {
            this.f116746a = act;
        }

        /* JADX INFO: renamed from: a */
        public isu m141964a() {
            isu isuVar = new isu(this.f116746a);
            isuVar.m141949e0(this.f116747b);
            isuVar.m141951g0(this.f116748c);
            isuVar.m141950f0(this.f116749d);
            isuVar.m141948d0(this.f116750e);
            isuVar.m141947c0(this.f116751f);
            return isuVar;
        }

        /* JADX INFO: renamed from: b */
        public C17796c m141965b(boolean z) {
            this.f116750e = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C17796c m141966c(int i) {
            this.f116751f = i;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C17796c m141967d(x20 x20Var) {
            this.f116747b = x20Var;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C17796c m141968e(x20 x20Var) {
            this.f116748c = x20Var;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public isu m141969f() {
            isu isuVarM141964a = m141964a();
            isuVarM141964a.m141953i0(this.f116751f);
            return isuVarM141964a;
        }
    }

    /* JADX INFO: renamed from: l.isu$d */
    public static class C17797d {

        /* JADX INFO: renamed from: a */
        public String f116752a;

        /* JADX INFO: renamed from: b */
        public int f116753b;

        /* JADX INFO: renamed from: c */
        public int f116754c;

        /* JADX INFO: renamed from: d */
        public int f116755d;

        /* JADX INFO: renamed from: e */
        public BLiveMerchandise f116756e;

        /* JADX INFO: renamed from: f */
        public PayMethod f116757f;
    }

    public isu(Act act) {
        if (act == null) {
            return;
        }
        this.f116739v = act;
        if (this.f116740w == null) {
            m141921C();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m141913o(LiveVChatRechargeItemView liveVChatRechargeItemView, LiveVChatRechargeItemView liveVChatRechargeItemView2) {
        if (liveVChatRechargeItemView2 != liveVChatRechargeItemView) {
            liveVChatRechargeItemView2.m70969m0(false);
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ Boolean m141916r(LiveVChatRechargeItemView liveVChatRechargeItemView) {
        BLiveMerchandise currentRechargeModule = liveVChatRechargeItemView.getCurrentRechargeModule();
        return Boolean.valueOf(currentRechargeModule != null && currentRechargeModule.isCustomRecharge);
    }

    @Nullable
    /* JADX INFO: renamed from: A */
    public final LiveVChatRechargeItemView m141919A() {
        return (LiveVChatRechargeItemView) jyb.m147529r(this.f116741x, new qcj() { // from class: l.tru
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return isu.m141916r((LiveVChatRechargeItemView) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public PurchasePaymentParam m141920B(C17797d c17797d) {
        PurchasePaymentParam purchasePaymentParamNew_ = PurchasePaymentParam.new_();
        purchasePaymentParamNew_.itemId = c17797d.f116752a;
        int i = c17797d.f116754c;
        if (i > 0) {
            purchasePaymentParamNew_.quantity = i;
        }
        return purchasePaymentParamNew_;
    }

    /* JADX INFO: renamed from: C */
    public final void m141921C() {
        this.f116740w = new BottomSheetDialog(this.f116739v, hgc0.f109387d);
        View viewInflate = LayoutInflater.from(this.f116739v).inflate(xec0.f193780F1, (ViewGroup) null);
        m141957u(viewInflate);
        nsh0.m164608j("videoChat", "show:fastRechargeDialog");
        this.f116740w.setContentView(viewInflate);
        ArrayList<LiveVChatRechargeItemView> arrayList = new ArrayList<>();
        this.f116741x = arrayList;
        arrayList.add(this.f116727j);
        this.f116741x.add(this.f116728k);
        this.f116741x.add(this.f116729l);
        this.f116741x.add(this.f116730m);
        this.f116741x.add(this.f116731n);
        this.f116741x.add(this.f116732o);
        this.f116723f.setOnClickListener(new View.OnClickListener() { // from class: l.fsu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100687a.m141927I(view);
            }
        });
        m141922D();
        bnl0.m105509E0(this.f116738u, new View.OnClickListener() { // from class: l.gsu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106328a.m141928J(view);
            }
        });
        this.f116740w.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.hsu
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f111476a.m141929K(dialogInterface);
            }
        });
        this.f116740w.show();
    }

    /* JADX INFO: renamed from: D */
    public void m141922D() {
        this.f116738u.setEnabled(true);
        this.f116734q.m70954k0(zrv.f205799a.m207672i());
        this.f116734q.setOnClickListener(new View.OnClickListener() { // from class: l.wru
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190561a.m141942X(view);
            }
        });
        this.f116735r.m70954k0(zrv.f205799a.m207676k());
        this.f116735r.setOnClickListener(new View.OnClickListener() { // from class: l.wru
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190561a.m141942X(view);
            }
        });
        if (zrv.f205799a.m207679l0()) {
            m141962z(false);
            bnl0.m105509E0(this.f116736s, new View.OnClickListener() { // from class: l.xru
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f195965a.m141930L(view);
                }
            });
        } else {
            m141962z(true);
        }
        m141945a0();
    }

    /* JADX INFO: renamed from: E */
    public final void m141923E(final double d, boolean z) {
        if (z) {
            BLiveMerchandise currentRechargeModule = this.f116731n.getCurrentRechargeModule();
            this.f116714L = currentRechargeModule;
            BLiveStockKeepUnit bLiveStockKeepUnit = currentRechargeModule.defaultStockKeepUnit;
            this.f116708F = bLiveStockKeepUnit.f45291id;
            int i = currentRechargeModule.quantity;
            this.f116712J = i;
            double d2 = bLiveStockKeepUnit.prices.price;
            this.f116709G = (int) d2;
            this.f116710H = d2;
            this.f116711I = i;
            m141955k0(this.f116731n);
            return;
        }
        if (d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.f116727j.performClick();
            return;
        }
        LiveVChatRechargeItemView liveVChatRechargeItemView = (LiveVChatRechargeItemView) jyb.m147529r(this.f116741x, new qcj() { // from class: l.dsu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f90519a.m141931M(d, (LiveVChatRechargeItemView) obj);
            }
        });
        if (liveVChatRechargeItemView != null) {
            liveVChatRechargeItemView.performClick();
            return;
        }
        LiveVChatRechargeItemView liveVChatRechargeItemView2 = this.f116741x.get(0);
        for (LiveVChatRechargeItemView liveVChatRechargeItemView3 : this.f116741x) {
            if (m141926H(liveVChatRechargeItemView3, liveVChatRechargeItemView2.getTTPrice())) {
                liveVChatRechargeItemView2 = liveVChatRechargeItemView3;
            }
        }
        liveVChatRechargeItemView2.performClick();
    }

    /* JADX INFO: renamed from: F */
    public final boolean m141924F(LiveVChatRechargeItemView liveVChatRechargeItemView) {
        BLiveMerchandise currentRechargeModule = liveVChatRechargeItemView.getCurrentRechargeModule();
        return currentRechargeModule != null && currentRechargeModule.isCustomRecharge;
    }

    /* JADX INFO: renamed from: G */
    public boolean m141925G() {
        return this.f116739v == null;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m141926H(LiveVChatRechargeItemView liveVChatRechargeItemView, double d) {
        return !m141924F(liveVChatRechargeItemView) && ((double) liveVChatRechargeItemView.getTTPrice()) >= d;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m141927I(View view) {
        this.f116740w.dismiss();
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m141928J(View view) {
        m141956l0();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m141929K(DialogInterface dialogInterface) {
        if (m141925G()) {
            return;
        }
        x20 x20Var = this.f116705C;
        if (x20Var != null) {
            x20Var.call();
            nsh0.m164608j("videoChat", "action:onCancel");
        }
        m141944Z();
        m141961y();
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m141930L(View view) {
        m141962z(true);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ Boolean m141931M(double d, LiveVChatRechargeItemView liveVChatRechargeItemView) {
        return Boolean.valueOf(m141926H(liveVChatRechargeItemView, d));
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m141932N(BLiveMerchandise bLiveMerchandise, LiveVChatRechargeItemView liveVChatRechargeItemView) {
        if (m141925G()) {
            return;
        }
        if (bLiveMerchandise.isCustomRecharge) {
            m141952h0();
            return;
        }
        this.f116714L = bLiveMerchandise;
        BLiveStockKeepUnit bLiveStockKeepUnit = bLiveMerchandise.defaultStockKeepUnit;
        this.f116708F = bLiveStockKeepUnit.f45291id;
        if (bLiveMerchandise.isIncomingPrice || bLiveMerchandise.isOneRMBRecharge) {
            this.f116712J = bLiveMerchandise.quantity;
        } else {
            this.f116712J = 0;
        }
        double d = bLiveStockKeepUnit.prices.price;
        this.f116709G = (int) d;
        this.f116710H = d;
        this.f116711I = bLiveMerchandise.quantity;
        m141955k0(liveVChatRechargeItemView);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m141933O() {
        o1j0.m165649w(R$string.f48327qe);
        x20 x20Var = this.f116706D;
        if (x20Var != null) {
            x20Var.call();
        }
        BottomSheetDialog bottomSheetDialog = this.f116740w;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.dismiss();
        }
        nsh0.m164608j("videoChat", "action:onPaySuccess");
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m141934P() {
        x20 x20Var = this.f116707E;
        if (x20Var != null) {
            x20Var.call();
        }
        m141945a0();
        if (this.f116743z) {
            m141962z(true);
        }
        o1j0.m165634h(R$string.f48283oe);
        nsh0.m164608j("videoChat", "action:onPayFail");
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m141935Q() {
        this.f116721d.requestFocus();
        this.f116739v.showInput(this.f116721d, 0);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m141936R(DialogInterface dialogInterface) {
        if (m141925G()) {
            return;
        }
        this.f116721d.setText("");
        this.f116739v.postDelayed(new Runnable() { // from class: l.uru
            @Override // java.lang.Runnable
            public final void run() {
                this.f180702a.m141935Q();
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m141937S(View view) {
        m141961y();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m141938T(View view) {
        m141960x();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m141939U(double d, List list) {
        this.f116740w.show();
        m141943Y(list);
        m141923E(d, list.size() == 6 && this.f116716N > 0);
        btu.m106396l(list, this.f116743z, User.ID_TEAM_ACCOUNT);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m141940V(BLiveCoin bLiveCoin) {
        this.f116726i.setText(zrv.f205803e.getString(R$string.f47821T6, aiv.m98131r0(bLiveCoin.available)));
    }

    /* JADX INFO: renamed from: W */
    public void m141941W(C17797d c17797d) {
        zrv.f205799a.m207655Z(this.f116739v, m141920B(c17797d), new x20() { // from class: l.rru
            @Override // p153l.x20
            public final void call() {
                this.f164617a.m141933O();
            }
        }, new x20() { // from class: l.sru
            @Override // p153l.x20
            public final void call() {
                this.f170371a.m141934P();
            }
        }, c17797d.f116757f);
    }

    /* JADX INFO: renamed from: X */
    public void m141942X(View view) {
        if (view == this.f116734q) {
            this.f116713K = zrv.f205799a.m207672i();
            m141946b0(this.f116734q);
        } else if (view == this.f116735r) {
            this.f116713K = zrv.f205799a.m207676k();
            m141946b0(this.f116735r);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m141943Y(List<BLiveMerchandise> list) {
        for (int i = 0; i < this.f116741x.size(); i++) {
            LiveVChatRechargeItemView liveVChatRechargeItemView = this.f116741x.get(i);
            if (i < list.size()) {
                liveVChatRechargeItemView.m70971o0(list.get(i), this.f116717O);
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m141944Z() {
        BLiveMerchandise currentRechargeModule;
        LiveVChatRechargeItemView liveVChatRechargeItemView = (LiveVChatRechargeItemView) jyb.m147529r(this.f116741x, new qcj() { // from class: l.vru
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(this.f185523a.m141924F((LiveVChatRechargeItemView) obj));
            }
        });
        if (liveVChatRechargeItemView == null || (currentRechargeModule = liveVChatRechargeItemView.getCurrentRechargeModule()) == null) {
            return;
        }
        currentRechargeModule.isCustomRechargeInput = false;
        liveVChatRechargeItemView.m70971o0(currentRechargeModule, this.f116717O);
    }

    /* JADX INFO: renamed from: a0 */
    public void m141945a0() {
        if (zrv.f205799a.m207639J()) {
            return;
        }
        this.f116734q.performClick();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m141946b0(@androidx.annotation.Nullable final LiveVChatPayItemView liveVChatPayItemView) {
        jyb.m147537z(jyb.m147507f0(this.f116734q, this.f116735r), new y20() { // from class: l.zru
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveVChatPayItemView liveVChatPayItemView2 = (LiveVChatPayItemView) obj;
                liveVChatPayItemView2.setSelected(liveVChatPayItemView2 == liveVChatPayItemView);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public void m141947c0(int i) {
        this.f116716N = i;
    }

    /* JADX INFO: renamed from: d0 */
    public void m141948d0(boolean z) {
        this.f116715M = z;
    }

    /* JADX INFO: renamed from: e0 */
    public void m141949e0(x20 x20Var) {
        this.f116705C = x20Var;
    }

    /* JADX INFO: renamed from: f0 */
    public void m141950f0(x20 x20Var) {
        this.f116707E = x20Var;
    }

    /* JADX INFO: renamed from: g0 */
    public void m141951g0(x20 x20Var) {
        this.f116706D = x20Var;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m141952h0() {
        if (this.f116742y == null) {
            this.f116742y = new BottomSheetDialog(this.f116739v, hgc0.f109387d);
            View viewInflate = LayoutInflater.from(this.f116739v).inflate(xec0.f193783G1, (ViewGroup) null);
            m141958v(viewInflate);
            this.f116742y.getWindow().getDecorView().setMinimumWidth(bnl0.m105592y0());
            this.f116742y.getWindow().getDecorView().setMinimumHeight(bnl0.m105588w0());
            this.f116742y.setContentView(viewInflate);
            this.f116742y.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.oru
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f148762a.m141936R(dialogInterface);
                }
            });
            this.f116719b.setOnClickListener(new View.OnClickListener() { // from class: l.pru
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f153847a.m141937S(view);
                }
            });
            this.f116721d.addTextChangedListener(m141954j0());
            this.f116722e.setOnClickListener(new View.OnClickListener() { // from class: l.qru
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f159205a.m141938T(view);
                }
            });
        }
        this.f116742y.show();
        nsh0.m164608j("videoChat", "show:inputDialog");
    }

    /* JADX INFO: renamed from: i0 */
    public void m141953i0(final double d) {
        if (m141925G()) {
            return;
        }
        this.f116725h.setText(xau.m209910t(this.f116715M ? com.p051p1.mobile.putong.live.external.R$string.f45755j : com.p051p1.mobile.putong.live.external.R$string.f45767p));
        this.f116739v.duringCreated(C22421c.zip(C12668a.m70423j(), C12668a.m70424k(), new rcj() { // from class: l.yru
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f201355a.m141959w((List) obj, (BLiveMerchandise) obj2);
            }
        }).observeOn(fo0.m126432a())).take(1).map(new C17794a()).subscribe(dhw.m115826e(new y20() { // from class: l.asu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73176a.m141939U(d, (List) obj);
            }
        }, new y20() { // from class: l.bsu
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165651y(zrv.f205803e.getString(R$string.f47721Ob));
            }
        }));
        this.f116739v.duringCreated(C12668a.m70425l()).subscribe(dhw.m115825d(new y20() { // from class: l.csu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83489a.m141940V((BLiveCoin) obj);
            }
        }));
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final jri0 m141954j0() {
        return new C17795b();
    }

    /* JADX INFO: renamed from: k0 */
    public void m141955k0(final LiveVChatRechargeItemView liveVChatRechargeItemView) {
        liveVChatRechargeItemView.m70969m0(true);
        jyb.m147537z(this.f116741x, new y20() { // from class: l.esu
            @Override // p153l.y20
            public final void call(Object obj) {
                isu.m141913o(liveVChatRechargeItemView, (LiveVChatRechargeItemView) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public final void m141956l0() {
        nsh0.m164608j("videoChat", "action:tryToStartPay,selectedItemPrice:" + this.f116709G + ",payMethod:" + this.f116713K);
        if (TextUtils.isEmpty(this.f116708F)) {
            return;
        }
        if (zrv.f205799a.m207637H() || this.f116709G != 0) {
            if (zrv.f205799a.m207637H() && this.f116710H == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return;
            }
            C17797d c17797d = new C17797d();
            c17797d.f116752a = this.f116708F;
            c17797d.f116753b = this.f116709G;
            c17797d.f116754c = this.f116712J;
            c17797d.f116755d = this.f116711I;
            c17797d.f116756e = this.f116714L;
            c17797d.f116757f = this.f116713K;
            m141941W(c17797d);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m141957u(View view) {
        jsu.m146874a(this, view);
    }

    /* JADX INFO: renamed from: v */
    public final void m141958v(View view) {
        ksu.m151283a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public List<BLiveMerchandise> m141959w(List<BLiveMerchandise> list, BLiveMerchandise bLiveMerchandise) {
        this.f116703A = list;
        this.f116704B = bLiveMerchandise;
        return C12668a.m70422i(new ArrayList(list), bLiveMerchandise);
    }

    /* JADX INFO: renamed from: x */
    public final void m141960x() {
        int i;
        LiveVChatRechargeItemView liveVChatRechargeItemViewM141919A = m141919A();
        if (liveVChatRechargeItemViewM141919A == null) {
            o1j0.m165651y(zrv.f205803e.getString(R$string.f47721Ob));
            m141961y();
            return;
        }
        try {
            i = Integer.parseInt(this.f116721d.getText().toString());
        } catch (NumberFormatException unused) {
            i = 0;
        }
        if (i <= 0 || i >= 50001) {
            o1j0.m165651y(zrv.f205803e.getString(R$string.f47587I6));
            return;
        }
        m141961y();
        m141955k0(liveVChatRechargeItemViewM141919A);
        BLiveMerchandise currentRechargeModule = liveVChatRechargeItemViewM141919A.getCurrentRechargeModule();
        BLiveStockKeepUnit bLiveStockKeepUnit = currentRechargeModule.defaultStockKeepUnit;
        this.f116708F = bLiveStockKeepUnit.f45291id;
        int i2 = i * 10;
        this.f116712J = i2;
        this.f116709G = i;
        this.f116711I = i2;
        currentRechargeModule.quantity = i2;
        bLiveStockKeepUnit.prices.price = i;
        currentRechargeModule.isCustomRechargeInput = true;
        liveVChatRechargeItemViewM141919A.m70971o0(currentRechargeModule, this.f116717O);
    }

    /* JADX INFO: renamed from: y */
    public void m141961y() {
        VEditText vEditText;
        Act act = this.f116739v;
        if (act != null && (vEditText = this.f116721d) != null) {
            act.hideInput(vEditText);
        }
        BottomSheetDialog bottomSheetDialog = this.f116742y;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m141962z(boolean z) {
        if (m141925G()) {
            return;
        }
        if (!z) {
            this.f116736s.setVisibility(0);
            this.f116737t.setVisibility(8);
        } else {
            this.f116743z = false;
            this.f116736s.setVisibility(8);
            this.f116737t.setVisibility(0);
        }
    }
}
