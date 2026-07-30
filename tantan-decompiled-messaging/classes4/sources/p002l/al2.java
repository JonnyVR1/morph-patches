package p002l;

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
import androidx.appcompat.app.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p000p1.mobile.putong.live.livingroom.increment.recharge.CustomClickConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.recharge.LiveFastRechargeItem;
import com.p000p1.mobile.putong.live.livingroom.increment.recharge.LocalNewFirstRechargeSubGiftItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.live.base.data.BLiveMerchandise;
import com.p1.mobile.putong.live.base.data.BLiveStockKeepUnit;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.e30;
import l.f30;
import l.jii0;
import l.lsi0;
import l.s7m;
import l.u6n;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.ypv;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VDraweeView;
import v.VEditText;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class al2 implements s7m<pl2> {

    /* JADX INFO: renamed from: A */
    public C0200a f7674A;

    /* JADX INFO: renamed from: B */
    public ArrayList<LiveFastRechargeItem> f7675B;

    /* JADX INFO: renamed from: C */
    public C0200a f7676C;

    /* JADX INFO: renamed from: D */
    public String f7677D;

    /* JADX INFO: renamed from: E */
    public int f7678E;

    /* JADX INFO: renamed from: F */
    public double f7679F;

    /* JADX INFO: renamed from: G */
    public int f7680G;

    /* JADX INFO: renamed from: H */
    public int f7681H;

    /* JADX INFO: renamed from: I */
    public PayMethod f7682I;

    /* JADX INFO: renamed from: J */
    public BLiveMerchandise f7683J;

    /* JADX INFO: renamed from: K */
    public f30<BLiveMerchandise, LiveFastRechargeItem> f7684K = new f30() { // from class: l.vk2
        public final void call(Object obj, Object obj2) {
            this.f21192a.m9860R((BLiveMerchandise) obj, (LiveFastRechargeItem) obj2);
        }
    };

    /* JADX INFO: renamed from: a */
    public LinearLayout f7685a;

    /* JADX INFO: renamed from: b */
    public View f7686b;

    /* JADX INFO: renamed from: c */
    public VEditText f7687c;

    /* JADX INFO: renamed from: d */
    public VText f7688d;

    /* JADX INFO: renamed from: e */
    public View f7689e;

    /* JADX INFO: renamed from: f */
    public CustomClickConstraintLayout f7690f;

    /* JADX INFO: renamed from: g */
    public VFrame f7691g;

    /* JADX INFO: renamed from: h */
    public VText f7692h;

    /* JADX INFO: renamed from: i */
    public VText f7693i;

    /* JADX INFO: renamed from: j */
    public VImage f7694j;

    /* JADX INFO: renamed from: k */
    public VFrame f7695k;

    /* JADX INFO: renamed from: l */
    public VText f7696l;

    /* JADX INFO: renamed from: m */
    public VText f7697m;

    /* JADX INFO: renamed from: n */
    public LiveFastRechargeItem f7698n;

    /* JADX INFO: renamed from: o */
    public LiveFastRechargeItem f7699o;

    /* JADX INFO: renamed from: p */
    public LiveFastRechargeItem f7700p;

    /* JADX INFO: renamed from: q */
    public LiveFastRechargeItem f7701q;

    /* JADX INFO: renamed from: r */
    public LiveFastRechargeItem f7702r;

    /* JADX INFO: renamed from: s */
    public LiveFastRechargeItem f7703s;

    /* JADX INFO: renamed from: t */
    public VFrame f7704t;

    /* JADX INFO: renamed from: u */
    public VLinear f7705u;

    /* JADX INFO: renamed from: v */
    public LocalNewFirstRechargeSubGiftItemView f7706v;

    /* JADX INFO: renamed from: w */
    public LocalNewFirstRechargeSubGiftItemView f7707w;

    /* JADX INFO: renamed from: x */
    public LocalNewFirstRechargeSubGiftItemView f7708x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f7709y;

    /* JADX INFO: renamed from: z */
    public pl2 f7710z;

    /* JADX INFO: renamed from: l.al2$a */
    public class C0490a extends jii0 {
        public C0490a() {
        }

        public void afterTextChanged(Editable editable) {
            int length = editable.toString().length();
            al2 al2Var = al2.this;
            if (length > 0) {
                al2Var.f7688d.setEnabled(true);
            } else {
                al2Var.f7688d.setEnabled(false);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    private void m9832C() {
        if (act() != null && this.f7674A == null) {
            m9833E();
            m9847B();
        }
    }

    /* JADX INFO: renamed from: E */
    private void m9833E() {
        byr byrVar = new byr(this.f7710z, m9871q(act().inflater(), null));
        this.f7674A = byrVar;
        byrVar.m5146j0(LiveDialogEnum.FAST_RECHARGE);
        ArrayList<LiveFastRechargeItem> arrayList = new ArrayList<>();
        this.f7675B = arrayList;
        arrayList.add(this.f7698n);
        this.f7675B.add(this.f7699o);
        this.f7675B.add(this.f7700p);
        this.f7675B.add(this.f7701q);
        this.f7675B.add(this.f7702r);
        this.f7675B.add(this.f7703s);
        this.f7689e.setOnClickListener(new View.OnClickListener() { // from class: l.ok2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16674a.m9857O(view);
            }
        });
        mo8787F();
        xdl0.E0(mo8782A(), new View.OnClickListener() { // from class: l.rk2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18570a.m9858P(view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m9838e(int i, int i2, LiveFastRechargeItem liveFastRechargeItem) {
        liveFastRechargeItem.setTitleTextColor(i);
        liveFastRechargeItem.setSubTitleTextColor(i2);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m9843l(LiveFastRechargeItem liveFastRechargeItem, LiveFastRechargeItem liveFastRechargeItem2) {
        if (liveFastRechargeItem2 != liveFastRechargeItem) {
            liveFastRechargeItem2.m8744m0(false);
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Boolean m9845n(LiveFastRechargeItem liveFastRechargeItem) {
        BLiveMerchandise currentRechargeModule = liveFastRechargeItem.getCurrentRechargeModule();
        return Boolean.valueOf(currentRechargeModule != null && currentRechargeModule.isCustomRecharge);
    }

    /* JADX INFO: renamed from: w */
    private void m9846w() {
        Act act = act();
        if (act == null) {
            return;
        }
        act.hideInput(this.f7687c);
        C0200a c0200a = this.f7676C;
        if (c0200a != null) {
            c0200a.dismiss();
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract VText mo8782A();

    /* JADX INFO: renamed from: B */
    public final void m9847B() {
        this.f7676C = new byr(this.f7710z, d8c0.f9102g, m9870p(act().inflater(), null));
        this.f7686b.setOnClickListener(new View.OnClickListener() { // from class: l.sk2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19059a.m9854L(view);
            }
        });
        this.f7676C.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.tk2
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f20281a.m9855M(dialogInterface);
            }
        });
        this.f7688d.setOnClickListener(new View.OnClickListener() { // from class: l.uk2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20682a.m9856N(view);
            }
        });
        this.f7687c.addTextChangedListener(m9867b0());
    }

    /* JADX INFO: renamed from: C0 */
    public Context m9848C0() {
        return this.f7710z.act();
    }

    /* JADX INFO: renamed from: F */
    public abstract void mo8787F();

    /* JADX WARN: Type inference failed for: r4v5, types: [com.p1.mobile.putong.live.livingroom.increment.recharge.LiveFastRechargeItem] */
    /* JADX WARN: Type inference failed for: r4v6, types: [android.view.View, com.p1.mobile.putong.live.livingroom.increment.recharge.LiveFastRechargeItem] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX INFO: renamed from: G */
    public final void m9849G(final double d) {
        if (d == 0.0d) {
            this.f7698n.performClick();
            return;
        }
        ConstraintLayout constraintLayout = (LiveFastRechargeItem) vwb.r(this.f7675B, new w9j() { // from class: l.pk2
            public final Object call(Object obj) {
                return this.f17448a.m9859Q(d, (LiveFastRechargeItem) obj);
            }
        });
        if (constraintLayout != null) {
            constraintLayout.performClick();
            return;
        }
        LiveFastRechargeItem liveFastRechargeItem = this.f7675B.get(0);
        for (LiveFastRechargeItem liveFastRechargeItem2 : this.f7675B) {
            if (m9853K(liveFastRechargeItem2, liveFastRechargeItem.getTTPrice())) {
                liveFastRechargeItem = liveFastRechargeItem2;
            }
        }
        liveFastRechargeItem.performClick();
    }

    /* JADX INFO: renamed from: H */
    public final boolean m9850H(LiveFastRechargeItem liveFastRechargeItem) {
        BLiveMerchandise currentRechargeModule = liveFastRechargeItem.getCurrentRechargeModule();
        return currentRechargeModule != null && currentRechargeModule.isCustomRecharge;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m9851I(int i) {
        return i == 2;
    }

    /* JADX INFO: renamed from: J */
    public boolean m9852J() {
        return this.f7710z == null;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m9853K(LiveFastRechargeItem liveFastRechargeItem, double d) {
        return !m9850H(liveFastRechargeItem) && ((double) liveFastRechargeItem.getTTPrice()) >= d;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m9854L(View view) {
        m9846w();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m9855M(DialogInterface dialogInterface) {
        m9862T();
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m9856N(View view) {
        m9873u();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m9857O(View view) {
        mo8809v();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m9858P(View view) {
        m9868d0();
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ Boolean m9859Q(double d, LiveFastRechargeItem liveFastRechargeItem) {
        return Boolean.valueOf(m9853K(liveFastRechargeItem, d));
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m9860R(BLiveMerchandise bLiveMerchandise, LiveFastRechargeItem liveFastRechargeItem) {
        if (bLiveMerchandise.isCustomRecharge) {
            this.f7676C.show();
            return;
        }
        this.f7683J = bLiveMerchandise;
        BLiveStockKeepUnit bLiveStockKeepUnit = bLiveMerchandise.defaultStockKeepUnit;
        this.f7677D = bLiveStockKeepUnit.id;
        this.f7681H = bLiveMerchandise.isOneRMBRecharge ? bLiveMerchandise.quantity : 0;
        double d = bLiveStockKeepUnit.prices.price;
        this.f7678E = (int) d;
        this.f7679F = d;
        this.f7680G = bLiveMerchandise.quantity;
        mo8802c0(liveFastRechargeItem);
        mo8801a0();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m9861S(nig nigVar, int i, DialogInterface dialogInterface) {
        if (m9852J()) {
            return;
        }
        d30 d30Var = nigVar.f16054e;
        if (d30Var != null) {
            d30Var.call();
            return;
        }
        if (!m9851I(i) && !nigVar.m18774a() && this.f7710z.mo13757z4()) {
            this.f7710z.m20415y4();
        }
        m9864W();
    }

    /* JADX INFO: renamed from: T */
    public final void m9862T() {
        this.f7687c.setText("");
        this.f7687c.requestFocus();
        this.f7687c.setInputType(3);
    }

    /* JADX INFO: renamed from: V */
    public void m9863V(List<BLiveMerchandise> list) {
        for (int i = 0; i < this.f7675B.size(); i++) {
            LiveFastRechargeItem liveFastRechargeItem = this.f7675B.get(i);
            if (i < list.size()) {
                liveFastRechargeItem.m8746o0(list.get(i), this.f7684K);
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m9864W() {
        BLiveMerchandise currentRechargeModule;
        LiveFastRechargeItem liveFastRechargeItem = (LiveFastRechargeItem) vwb.r(this.f7675B, new w9j() { // from class: l.qk2
            public final Object call(Object obj) {
                return Boolean.valueOf(this.f18058a.m9850H((LiveFastRechargeItem) obj));
            }
        });
        if (liveFastRechargeItem == null || (currentRechargeModule = liveFastRechargeItem.getCurrentRechargeModule()) == null) {
            return;
        }
        currentRechargeModule.isCustomRechargeInput = false;
        liveFastRechargeItem.m8746o0(currentRechargeModule, this.f7684K);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: X */
    public void m9865X(Long l2) {
        this.f7697m.setText(ypv.e.getString(u6n.a() ? R$string.f3036U6 : R$string.f3015T6, zfv.m27300r0(l2.longValue())));
    }

    /* JADX INFO: renamed from: Y */
    public void m9866Y(@ColorInt final int i, @ColorInt final int i2) {
        vwb.z(this.f7675B, new e30() { // from class: l.yk2
            public final void call(Object obj) {
                al2.m9838e(i, i2, (LiveFastRechargeItem) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public void mo8800Z(double d, final nig nigVar) {
        String string;
        final int i = nigVar.f16050a;
        VText vText = this.f7696l;
        if (m9851I(i)) {
            string = ypv.e.getString(u6n.a() ? R$string.f2894Nb : R$string.f2621B0);
        } else {
            string = ypv.e.getString(u6n.a() ? R$string.f2864M2 : R$string.f2843L2);
        }
        vText.setText(string);
        this.f7674A.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.zk2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f23470a.m9861S(nigVar, i, dialogInterface);
            }
        });
        m9849G(d);
        this.f7674A.show();
    }

    /* JADX INFO: renamed from: a0 */
    public abstract void mo8801a0();

    public Act act() {
        return this.f7710z.act();
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final jii0 m9867b0() {
        return new C0490a();
    }

    /* JADX INFO: renamed from: c0 */
    public void mo8802c0(final LiveFastRechargeItem liveFastRechargeItem) {
        liveFastRechargeItem.m8744m0(true);
        vwb.z(this.f7675B, new e30() { // from class: l.wk2
            public final void call(Object obj) {
                al2.m9843l(liveFastRechargeItem, (LiveFastRechargeItem) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public final void m9868d0() {
        if (TextUtils.isEmpty(this.f7677D)) {
            return;
        }
        if (ypv.a.H() || this.f7678E != 0) {
            if (ypv.a.H() && this.f7679F == 0.0d) {
                return;
            }
            pl2.C0751b c0751b = new pl2.C0751b();
            c0751b.f17477a = this.f7677D;
            c0751b.f17478b = this.f7678E;
            c0751b.f17479c = this.f7681H;
            c0751b.f17480d = this.f7680G;
            c0751b.f17481e = this.f7683J;
            c0751b.f17482f = this.f7682I;
            this.f7710z.mo13753l4(c0751b);
        }
    }

    public void destroy() {
        m9874x();
        m9846w();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: p */
    public View m9870p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bl2.m10458b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public View m9871q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cl2.m11104b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void m9869i1(pl2 pl2Var) {
        this.f7710z = pl2Var;
        if (pl2Var != null) {
            m9832C();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m9873u() {
        int i;
        LiveFastRechargeItem liveFastRechargeItemM9875z = m9875z();
        if (liveFastRechargeItemM9875z == null) {
            lsi0.y(ypv.e.getString(R$string.f2915Ob));
            m9846w();
            return;
        }
        try {
            i = Integer.parseInt(this.f7687c.getText().toString());
        } catch (NumberFormatException unused) {
            i = 0;
        }
        if (i <= 0 || i >= 50001) {
            lsi0.y(ypv.e.getString(R$string.f2781I6));
            return;
        }
        m9846w();
        mo8802c0(liveFastRechargeItemM9875z);
        BLiveMerchandise currentRechargeModule = liveFastRechargeItemM9875z.getCurrentRechargeModule();
        BLiveStockKeepUnit bLiveStockKeepUnit = currentRechargeModule.defaultStockKeepUnit;
        this.f7677D = bLiveStockKeepUnit.id;
        int i2 = i * 10;
        this.f7681H = i2;
        this.f7678E = i;
        this.f7680G = i2;
        currentRechargeModule.quantity = i2;
        bLiveStockKeepUnit.prices.price = i;
        currentRechargeModule.isCustomRechargeInput = true;
        liveFastRechargeItemM9875z.m8746o0(currentRechargeModule, this.f7684K);
        mo8801a0();
    }

    /* JADX INFO: renamed from: v */
    public void mo8809v() {
        a aVar = this.f7674A;
        if (aVar == null || !aVar.isShowing()) {
            return;
        }
        this.f7674A.dismiss();
    }

    /* JADX INFO: renamed from: x */
    public void m9874x() {
        Act act = act();
        if (act != null) {
            act.hideInput(this.f7687c);
        }
        C0200a c0200a = this.f7676C;
        if (c0200a != null) {
            c0200a.dismiss();
        }
    }

    /* JADX INFO: renamed from: y */
    public abstract void mo8813y(boolean z);

    @Nullable
    /* JADX INFO: renamed from: z */
    public final LiveFastRechargeItem m9875z() {
        return (LiveFastRechargeItem) vwb.r(this.f7675B, new w9j() { // from class: l.xk2
            public final Object call(Object obj) {
                return al2.m9845n((LiveFastRechargeItem) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public void mo8799U() {
    }
}
