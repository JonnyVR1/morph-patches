package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.live.base.data.BLiveMerchandise;
import com.p051p1.mobile.putong.live.base.data.BLiveStockKeepUnit;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.increment.recharge.CustomClickConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.increment.recharge.LiveFastRechargeItem;
import com.p051p1.mobile.putong.live.livingroom.increment.recharge.LocalNewFirstRechargeSubGiftItemView;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public abstract class il2 implements iam<xl2> {

    /* JADX INFO: renamed from: A */
    public DialogC12774a f115480A;

    /* JADX INFO: renamed from: B */
    public ArrayList<LiveFastRechargeItem> f115481B;

    /* JADX INFO: renamed from: C */
    public DialogC12774a f115482C;

    /* JADX INFO: renamed from: D */
    public String f115483D;

    /* JADX INFO: renamed from: E */
    public int f115484E;

    /* JADX INFO: renamed from: F */
    public double f115485F;

    /* JADX INFO: renamed from: G */
    public int f115486G;

    /* JADX INFO: renamed from: H */
    public int f115487H;

    /* JADX INFO: renamed from: I */
    public PayMethod f115488I;

    /* JADX INFO: renamed from: J */
    public BLiveMerchandise f115489J;

    /* JADX INFO: renamed from: K */
    public z20<BLiveMerchandise, LiveFastRechargeItem> f115490K = new z20() { // from class: l.dl2
        @Override // p153l.z20
        public final void call(Object obj, Object obj2) {
            this.f89487a.m140560R((BLiveMerchandise) obj, (LiveFastRechargeItem) obj2);
        }
    };

    /* JADX INFO: renamed from: a */
    public LinearLayout f115491a;

    /* JADX INFO: renamed from: b */
    public View f115492b;

    /* JADX INFO: renamed from: c */
    public VEditText f115493c;

    /* JADX INFO: renamed from: d */
    public VText f115494d;

    /* JADX INFO: renamed from: e */
    public View f115495e;

    /* JADX INFO: renamed from: f */
    public CustomClickConstraintLayout f115496f;

    /* JADX INFO: renamed from: g */
    public VFrame f115497g;

    /* JADX INFO: renamed from: h */
    public VText f115498h;

    /* JADX INFO: renamed from: i */
    public VText f115499i;

    /* JADX INFO: renamed from: j */
    public VImage f115500j;

    /* JADX INFO: renamed from: k */
    public VFrame f115501k;

    /* JADX INFO: renamed from: l */
    public VText f115502l;

    /* JADX INFO: renamed from: m */
    public VText f115503m;

    /* JADX INFO: renamed from: n */
    public LiveFastRechargeItem f115504n;

    /* JADX INFO: renamed from: o */
    public LiveFastRechargeItem f115505o;

    /* JADX INFO: renamed from: p */
    public LiveFastRechargeItem f115506p;

    /* JADX INFO: renamed from: q */
    public LiveFastRechargeItem f115507q;

    /* JADX INFO: renamed from: r */
    public LiveFastRechargeItem f115508r;

    /* JADX INFO: renamed from: s */
    public LiveFastRechargeItem f115509s;

    /* JADX INFO: renamed from: t */
    public VFrame f115510t;

    /* JADX INFO: renamed from: u */
    public VLinear f115511u;

    /* JADX INFO: renamed from: v */
    public LocalNewFirstRechargeSubGiftItemView f115512v;

    /* JADX INFO: renamed from: w */
    public LocalNewFirstRechargeSubGiftItemView f115513w;

    /* JADX INFO: renamed from: x */
    public LocalNewFirstRechargeSubGiftItemView f115514x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f115515y;

    /* JADX INFO: renamed from: z */
    public xl2 f115516z;

    /* JADX INFO: renamed from: l.il2$a */
    public class C17735a extends jri0 {
        public C17735a() {
        }

        @Override // p153l.jri0, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int length = editable.toString().length();
            il2 il2Var = il2.this;
            if (length > 0) {
                il2Var.f115494d.setEnabled(true);
            } else {
                il2Var.f115494d.setEnabled(false);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    private void m140533C() {
        if (act() != null && this.f115480A == null) {
            m140534E();
            m140548B();
        }
    }

    /* JADX INFO: renamed from: E */
    private void m140534E() {
        c0s c0sVar = new c0s(this.f115516z, m140570q(act().inflater(), null));
        this.f115480A = c0sVar;
        c0sVar.m72961j0(LiveDialogEnum.FAST_RECHARGE);
        ArrayList<LiveFastRechargeItem> arrayList = new ArrayList<>();
        this.f115481B = arrayList;
        arrayList.add(this.f115504n);
        this.f115481B.add(this.f115505o);
        this.f115481B.add(this.f115506p);
        this.f115481B.add(this.f115507q);
        this.f115481B.add(this.f115508r);
        this.f115481B.add(this.f115509s);
        this.f115495e.setOnClickListener(new View.OnClickListener() { // from class: l.wk2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f189523a.m140557O(view);
            }
        });
        mo76354F();
        bnl0.m105509E0(mo76349A(), new View.OnClickListener() { // from class: l.zk2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204726a.m140558P(view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m140539e(int i, int i2, LiveFastRechargeItem liveFastRechargeItem) {
        liveFastRechargeItem.setTitleTextColor(i);
        liveFastRechargeItem.setSubTitleTextColor(i2);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m140544l(LiveFastRechargeItem liveFastRechargeItem, LiveFastRechargeItem liveFastRechargeItem2) {
        if (liveFastRechargeItem2 != liveFastRechargeItem) {
            liveFastRechargeItem2.m76311m0(false);
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Boolean m140546n(LiveFastRechargeItem liveFastRechargeItem) {
        BLiveMerchandise currentRechargeModule = liveFastRechargeItem.getCurrentRechargeModule();
        return Boolean.valueOf(currentRechargeModule != null && currentRechargeModule.isCustomRecharge);
    }

    /* JADX INFO: renamed from: w */
    private void m140547w() {
        Act act = act();
        if (act == null) {
            return;
        }
        act.hideInput(this.f115493c);
        DialogC12774a dialogC12774a = this.f115482C;
        if (dialogC12774a != null) {
            dialogC12774a.dismiss();
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract VText mo76349A();

    /* JADX INFO: renamed from: B */
    public final void m140548B() {
        this.f115482C = new c0s(this.f115516z, jgc0.f120700g, m140569p(act().inflater(), null));
        this.f115492b.setOnClickListener(new View.OnClickListener() { // from class: l.al2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72065a.m140554L(view);
            }
        });
        this.f115482C.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.bl2
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f77140a.m140555M(dialogInterface);
            }
        });
        this.f115494d.setOnClickListener(new View.OnClickListener() { // from class: l.cl2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82337a.m140556N(view);
            }
        });
        this.f115493c.addTextChangedListener(m140567b0());
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f115516z.act();
    }

    /* JADX INFO: renamed from: F */
    public abstract void mo76354F();

    /* JADX INFO: renamed from: G */
    public final void m140549G(final double d) {
        if (d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.f115504n.performClick();
            return;
        }
        LiveFastRechargeItem liveFastRechargeItem = (LiveFastRechargeItem) jyb.m147529r(this.f115481B, new qcj() { // from class: l.xk2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f194705a.m140559Q(d, (LiveFastRechargeItem) obj);
            }
        });
        if (liveFastRechargeItem != null) {
            liveFastRechargeItem.performClick();
            return;
        }
        LiveFastRechargeItem liveFastRechargeItem2 = this.f115481B.get(0);
        for (LiveFastRechargeItem liveFastRechargeItem3 : this.f115481B) {
            if (m140553K(liveFastRechargeItem3, liveFastRechargeItem2.getTTPrice())) {
                liveFastRechargeItem2 = liveFastRechargeItem3;
            }
        }
        liveFastRechargeItem2.performClick();
    }

    /* JADX INFO: renamed from: H */
    public final boolean m140550H(LiveFastRechargeItem liveFastRechargeItem) {
        BLiveMerchandise currentRechargeModule = liveFastRechargeItem.getCurrentRechargeModule();
        return currentRechargeModule != null && currentRechargeModule.isCustomRecharge;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m140551I(int i) {
        return i == 2;
    }

    /* JADX INFO: renamed from: J */
    public boolean m140552J() {
        return this.f115516z == null;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m140553K(LiveFastRechargeItem liveFastRechargeItem, double d) {
        return !m140550H(liveFastRechargeItem) && ((double) liveFastRechargeItem.getTTPrice()) >= d;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m140554L(View view) {
        m140547w();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m140555M(DialogInterface dialogInterface) {
        m140562T();
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m140556N(View view) {
        m140572u();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m140557O(View view) {
        mo76376v();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m140558P(View view) {
        m140568d0();
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ Boolean m140559Q(double d, LiveFastRechargeItem liveFastRechargeItem) {
        return Boolean.valueOf(m140553K(liveFastRechargeItem, d));
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m140560R(BLiveMerchandise bLiveMerchandise, LiveFastRechargeItem liveFastRechargeItem) {
        if (bLiveMerchandise.isCustomRecharge) {
            this.f115482C.show();
            return;
        }
        this.f115489J = bLiveMerchandise;
        BLiveStockKeepUnit bLiveStockKeepUnit = bLiveMerchandise.defaultStockKeepUnit;
        this.f115483D = bLiveStockKeepUnit.f45291id;
        this.f115487H = bLiveMerchandise.isOneRMBRecharge ? bLiveMerchandise.quantity : 0;
        double d = bLiveStockKeepUnit.prices.price;
        this.f115484E = (int) d;
        this.f115485F = d;
        this.f115486G = bLiveMerchandise.quantity;
        mo76369c0(liveFastRechargeItem);
        mo76368a0();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m140561S(bkg bkgVar, int i, DialogInterface dialogInterface) {
        if (m140552J()) {
            return;
        }
        x20 x20Var = bkgVar.f77071e;
        if (x20Var != null) {
            x20Var.call();
            return;
        }
        if (!m140551I(i) && !bkgVar.m104798a() && this.f115516z.mo130117z4()) {
            this.f115516z.m211491y4();
        }
        m140564W();
    }

    /* JADX INFO: renamed from: T */
    public final void m140562T() {
        this.f115493c.setText("");
        this.f115493c.requestFocus();
        this.f115493c.setInputType(3);
    }

    /* JADX INFO: renamed from: V */
    public void m140563V(List<BLiveMerchandise> list) {
        for (int i = 0; i < this.f115481B.size(); i++) {
            LiveFastRechargeItem liveFastRechargeItem = this.f115481B.get(i);
            if (i < list.size()) {
                liveFastRechargeItem.m76313o0(list.get(i), this.f115490K);
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m140564W() {
        BLiveMerchandise currentRechargeModule;
        LiveFastRechargeItem liveFastRechargeItem = (LiveFastRechargeItem) jyb.m147529r(this.f115481B, new qcj() { // from class: l.yk2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(this.f200368a.m140550H((LiveFastRechargeItem) obj));
            }
        });
        if (liveFastRechargeItem == null || (currentRechargeModule = liveFastRechargeItem.getCurrentRechargeModule()) == null) {
            return;
        }
        currentRechargeModule.isCustomRechargeInput = false;
        liveFastRechargeItem.m76313o0(currentRechargeModule, this.f115490K);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: X */
    public void m140565X(Long l2) {
        this.f115503m.setText(zrv.f205803e.getString(u8n.m195065a() ? R$string.f47842U6 : R$string.f47821T6, aiv.m98131r0(l2.longValue())));
    }

    /* JADX INFO: renamed from: Y */
    public void m140566Y(@ColorInt final int i, @ColorInt final int i2) {
        jyb.m147537z(this.f115481B, new y20() { // from class: l.gl2
            @Override // p153l.y20
            public final void call(Object obj) {
                il2.m140539e(i, i2, (LiveFastRechargeItem) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public void mo76367Z(double d, final bkg bkgVar) {
        String string;
        final int i = bkgVar.f77067a;
        VText vText = this.f115502l;
        if (m140551I(i)) {
            string = zrv.f205803e.getString(u8n.m195065a() ? R$string.f47700Nb : R$string.f47427B0);
        } else {
            string = zrv.f205803e.getString(u8n.m195065a() ? R$string.f47670M2 : R$string.f47649L2);
        }
        vText.setText(string);
        this.f115480A.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.hl2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f110473a.m140561S(bkgVar, i, dialogInterface);
            }
        });
        m140549G(d);
        this.f115480A.show();
    }

    /* JADX INFO: renamed from: a0 */
    public abstract void mo76368a0();

    @Override // p153l.iam
    public Act act() {
        return this.f115516z.act();
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final jri0 m140567b0() {
        return new C17735a();
    }

    /* JADX INFO: renamed from: c0 */
    public void mo76369c0(final LiveFastRechargeItem liveFastRechargeItem) {
        liveFastRechargeItem.m76311m0(true);
        jyb.m147537z(this.f115481B, new y20() { // from class: l.el2
            @Override // p153l.y20
            public final void call(Object obj) {
                il2.m140544l(liveFastRechargeItem, (LiveFastRechargeItem) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public final void m140568d0() {
        if (TextUtils.isEmpty(this.f115483D)) {
            return;
        }
        if (zrv.f205799a.m207637H() || this.f115484E != 0) {
            if (zrv.f205799a.m207637H() && this.f115485F == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return;
            }
            xl2.C21365b c21365b = new xl2.C21365b();
            c21365b.f194849a = this.f115483D;
            c21365b.f194850b = this.f115484E;
            c21365b.f194851c = this.f115487H;
            c21365b.f194852d = this.f115486G;
            c21365b.f194853e = this.f115489J;
            c21365b.f194854f = this.f115488I;
            this.f115516z.mo130113l4(c21365b);
        }
    }

    @Override // p153l.iam
    public void destroy() {
        m140573x();
        m140547w();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: p */
    public View m140569p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jl2.m145937b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public View m140570q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kl2.m150341b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(xl2 xl2Var) {
        this.f115516z = xl2Var;
        if (xl2Var != null) {
            m140533C();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m140572u() {
        int i;
        LiveFastRechargeItem liveFastRechargeItemM140574z = m140574z();
        if (liveFastRechargeItemM140574z == null) {
            o1j0.m165651y(zrv.f205803e.getString(R$string.f47721Ob));
            m140547w();
            return;
        }
        try {
            i = Integer.parseInt(this.f115493c.getText().toString());
        } catch (NumberFormatException unused) {
            i = 0;
        }
        if (i <= 0 || i >= 50001) {
            o1j0.m165651y(zrv.f205803e.getString(R$string.f47587I6));
            return;
        }
        m140547w();
        mo76369c0(liveFastRechargeItemM140574z);
        BLiveMerchandise currentRechargeModule = liveFastRechargeItemM140574z.getCurrentRechargeModule();
        BLiveStockKeepUnit bLiveStockKeepUnit = currentRechargeModule.defaultStockKeepUnit;
        this.f115483D = bLiveStockKeepUnit.f45291id;
        int i2 = i * 10;
        this.f115487H = i2;
        this.f115484E = i;
        this.f115486G = i2;
        currentRechargeModule.quantity = i2;
        bLiveStockKeepUnit.prices.price = i;
        currentRechargeModule.isCustomRechargeInput = true;
        liveFastRechargeItemM140574z.m76313o0(currentRechargeModule, this.f115490K);
        mo76368a0();
    }

    /* JADX INFO: renamed from: v */
    public void mo76376v() {
        DialogC12774a dialogC12774a = this.f115480A;
        if (dialogC12774a == null || !dialogC12774a.isShowing()) {
            return;
        }
        this.f115480A.dismiss();
    }

    /* JADX INFO: renamed from: x */
    public void m140573x() {
        Act act = act();
        if (act != null) {
            act.hideInput(this.f115493c);
        }
        DialogC12774a dialogC12774a = this.f115482C;
        if (dialogC12774a != null) {
            dialogC12774a.dismiss();
        }
    }

    /* JADX INFO: renamed from: y */
    public abstract void mo76380y(boolean z);

    @Nullable
    /* JADX INFO: renamed from: z */
    public final LiveFastRechargeItem m140574z() {
        return (LiveFastRechargeItem) jyb.m147529r(this.f115481B, new qcj() { // from class: l.fl2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return il2.m140546n((LiveFastRechargeItem) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public void mo76366U() {
    }
}
