package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.live.base.data.BLiveMerchandise;
import com.p046p1.mobile.putong.live.base.data.BLiveStockKeepUnit;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.increment.recharge.CustomClickConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.increment.recharge.LiveFastRechargeItem;
import com.p046p1.mobile.putong.live.livingroom.increment.recharge.LocalNewFirstRechargeSubGiftItemView;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public abstract class al2 implements s7m<pl2> {

    /* JADX INFO: renamed from: A */
    public DialogC12611a f70362A;

    /* JADX INFO: renamed from: B */
    public ArrayList<LiveFastRechargeItem> f70363B;

    /* JADX INFO: renamed from: C */
    public DialogC12611a f70364C;

    /* JADX INFO: renamed from: D */
    public String f70365D;

    /* JADX INFO: renamed from: E */
    public int f70366E;

    /* JADX INFO: renamed from: F */
    public double f70367F;

    /* JADX INFO: renamed from: G */
    public int f70368G;

    /* JADX INFO: renamed from: H */
    public int f70369H;

    /* JADX INFO: renamed from: I */
    public PayMethod f70370I;

    /* JADX INFO: renamed from: J */
    public BLiveMerchandise f70371J;

    /* JADX INFO: renamed from: K */
    public f30<BLiveMerchandise, LiveFastRechargeItem> f70372K = new f30() { // from class: l.vk2
        @Override // p149l.f30
        public final void call(Object obj, Object obj2) {
            this.f181761a.m97249R((BLiveMerchandise) obj, (LiveFastRechargeItem) obj2);
        }
    };

    /* JADX INFO: renamed from: a */
    public LinearLayout f70373a;

    /* JADX INFO: renamed from: b */
    public View f70374b;

    /* JADX INFO: renamed from: c */
    public VEditText f70375c;

    /* JADX INFO: renamed from: d */
    public VText f70376d;

    /* JADX INFO: renamed from: e */
    public View f70377e;

    /* JADX INFO: renamed from: f */
    public CustomClickConstraintLayout f70378f;

    /* JADX INFO: renamed from: g */
    public VFrame f70379g;

    /* JADX INFO: renamed from: h */
    public VText f70380h;

    /* JADX INFO: renamed from: i */
    public VText f70381i;

    /* JADX INFO: renamed from: j */
    public VImage f70382j;

    /* JADX INFO: renamed from: k */
    public VFrame f70383k;

    /* JADX INFO: renamed from: l */
    public VText f70384l;

    /* JADX INFO: renamed from: m */
    public VText f70385m;

    /* JADX INFO: renamed from: n */
    public LiveFastRechargeItem f70386n;

    /* JADX INFO: renamed from: o */
    public LiveFastRechargeItem f70387o;

    /* JADX INFO: renamed from: p */
    public LiveFastRechargeItem f70388p;

    /* JADX INFO: renamed from: q */
    public LiveFastRechargeItem f70389q;

    /* JADX INFO: renamed from: r */
    public LiveFastRechargeItem f70390r;

    /* JADX INFO: renamed from: s */
    public LiveFastRechargeItem f70391s;

    /* JADX INFO: renamed from: t */
    public VFrame f70392t;

    /* JADX INFO: renamed from: u */
    public VLinear f70393u;

    /* JADX INFO: renamed from: v */
    public LocalNewFirstRechargeSubGiftItemView f70394v;

    /* JADX INFO: renamed from: w */
    public LocalNewFirstRechargeSubGiftItemView f70395w;

    /* JADX INFO: renamed from: x */
    public LocalNewFirstRechargeSubGiftItemView f70396x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f70397y;

    /* JADX INFO: renamed from: z */
    public pl2 f70398z;

    /* JADX INFO: renamed from: l.al2$a */
    public class C15649a extends jii0 {
        public C15649a() {
        }

        @Override // p149l.jii0, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int length = editable.toString().length();
            al2 al2Var = al2.this;
            if (length > 0) {
                al2Var.f70376d.setEnabled(true);
            } else {
                al2Var.f70376d.setEnabled(false);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    private void m97222C() {
        if (act() != null && this.f70362A == null) {
            m97223E();
            m97237B();
        }
    }

    /* JADX INFO: renamed from: E */
    private void m97223E() {
        byr byrVar = new byr(this.f70398z, m97259q(act().inflater(), null));
        this.f70362A = byrVar;
        byrVar.m71778j0(LiveDialogEnum.FAST_RECHARGE);
        ArrayList<LiveFastRechargeItem> arrayList = new ArrayList<>();
        this.f70363B = arrayList;
        arrayList.add(this.f70386n);
        this.f70363B.add(this.f70387o);
        this.f70363B.add(this.f70388p);
        this.f70363B.add(this.f70389q);
        this.f70363B.add(this.f70390r);
        this.f70363B.add(this.f70391s);
        this.f70377e.setOnClickListener(new View.OnClickListener() { // from class: l.ok2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f144392a.m97246O(view);
            }
        });
        mo75171F();
        xdl0.m208329E0(mo75166A(), new View.OnClickListener() { // from class: l.rk2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159771a.m97247P(view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m97228e(int i, int i2, LiveFastRechargeItem liveFastRechargeItem) {
        liveFastRechargeItem.setTitleTextColor(i);
        liveFastRechargeItem.setSubTitleTextColor(i2);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m97233l(LiveFastRechargeItem liveFastRechargeItem, LiveFastRechargeItem liveFastRechargeItem2) {
        if (liveFastRechargeItem2 != liveFastRechargeItem) {
            liveFastRechargeItem2.m75128m0(false);
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Boolean m97235n(LiveFastRechargeItem liveFastRechargeItem) {
        BLiveMerchandise currentRechargeModule = liveFastRechargeItem.getCurrentRechargeModule();
        return Boolean.valueOf(currentRechargeModule != null && currentRechargeModule.isCustomRecharge);
    }

    /* JADX INFO: renamed from: w */
    private void m97236w() {
        Act act = act();
        if (act == null) {
            return;
        }
        act.hideInput(this.f70375c);
        DialogC12611a dialogC12611a = this.f70364C;
        if (dialogC12611a != null) {
            dialogC12611a.dismiss();
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract VText mo75166A();

    /* JADX INFO: renamed from: B */
    public final void m97237B() {
        this.f70364C = new byr(this.f70398z, d8c0.f84852g, m97258p(act().inflater(), null));
        this.f70374b.setOnClickListener(new View.OnClickListener() { // from class: l.sk2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164931a.m97243L(view);
            }
        });
        this.f70364C.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.tk2
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f170814a.m97244M(dialogInterface);
            }
        });
        this.f70376d.setOnClickListener(new View.OnClickListener() { // from class: l.uk2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176901a.m97245N(view);
            }
        });
        this.f70375c.addTextChangedListener(m97256b0());
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f70398z.act();
    }

    /* JADX INFO: renamed from: F */
    public abstract void mo75171F();

    /* JADX INFO: renamed from: G */
    public final void m97238G(final double d) {
        if (d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.f70386n.performClick();
            return;
        }
        LiveFastRechargeItem liveFastRechargeItem = (LiveFastRechargeItem) vwb.m200346r(this.f70363B, new w9j() { // from class: l.pk2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f149928a.m97248Q(d, (LiveFastRechargeItem) obj);
            }
        });
        if (liveFastRechargeItem != null) {
            liveFastRechargeItem.performClick();
            return;
        }
        LiveFastRechargeItem liveFastRechargeItem2 = this.f70363B.get(0);
        for (LiveFastRechargeItem liveFastRechargeItem3 : this.f70363B) {
            if (m97242K(liveFastRechargeItem3, liveFastRechargeItem2.getTTPrice())) {
                liveFastRechargeItem2 = liveFastRechargeItem3;
            }
        }
        liveFastRechargeItem2.performClick();
    }

    /* JADX INFO: renamed from: H */
    public final boolean m97239H(LiveFastRechargeItem liveFastRechargeItem) {
        BLiveMerchandise currentRechargeModule = liveFastRechargeItem.getCurrentRechargeModule();
        return currentRechargeModule != null && currentRechargeModule.isCustomRecharge;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m97240I(int i) {
        return i == 2;
    }

    /* JADX INFO: renamed from: J */
    public boolean m97241J() {
        return this.f70398z == null;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m97242K(LiveFastRechargeItem liveFastRechargeItem, double d) {
        return !m97239H(liveFastRechargeItem) && ((double) liveFastRechargeItem.getTTPrice()) >= d;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m97243L(View view) {
        m97236w();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m97244M(DialogInterface dialogInterface) {
        m97251T();
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m97245N(View view) {
        m97261u();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m97246O(View view) {
        mo75193v();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m97247P(View view) {
        m97257d0();
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ Boolean m97248Q(double d, LiveFastRechargeItem liveFastRechargeItem) {
        return Boolean.valueOf(m97242K(liveFastRechargeItem, d));
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m97249R(BLiveMerchandise bLiveMerchandise, LiveFastRechargeItem liveFastRechargeItem) {
        if (bLiveMerchandise.isCustomRecharge) {
            this.f70364C.show();
            return;
        }
        this.f70371J = bLiveMerchandise;
        BLiveStockKeepUnit bLiveStockKeepUnit = bLiveMerchandise.defaultStockKeepUnit;
        this.f70365D = bLiveStockKeepUnit.f44443id;
        this.f70369H = bLiveMerchandise.isOneRMBRecharge ? bLiveMerchandise.quantity : 0;
        double d = bLiveStockKeepUnit.prices.price;
        this.f70366E = (int) d;
        this.f70367F = d;
        this.f70368G = bLiveMerchandise.quantity;
        mo75186c0(liveFastRechargeItem);
        mo75185a0();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m97250S(nig nigVar, int i, DialogInterface dialogInterface) {
        if (m97241J()) {
            return;
        }
        d30 d30Var = nigVar.f139092e;
        if (d30Var != null) {
            d30Var.call();
            return;
        }
        if (!m97240I(i) && !nigVar.m159500a() && this.f70398z.mo125582z4()) {
            this.f70398z.m170111y4();
        }
        m97253W();
    }

    /* JADX INFO: renamed from: T */
    public final void m97251T() {
        this.f70375c.setText("");
        this.f70375c.requestFocus();
        this.f70375c.setInputType(3);
    }

    /* JADX INFO: renamed from: V */
    public void m97252V(List<BLiveMerchandise> list) {
        for (int i = 0; i < this.f70363B.size(); i++) {
            LiveFastRechargeItem liveFastRechargeItem = this.f70363B.get(i);
            if (i < list.size()) {
                liveFastRechargeItem.m75130o0(list.get(i), this.f70372K);
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m97253W() {
        BLiveMerchandise currentRechargeModule;
        LiveFastRechargeItem liveFastRechargeItem = (LiveFastRechargeItem) vwb.m200346r(this.f70363B, new w9j() { // from class: l.qk2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(this.f155064a.m97239H((LiveFastRechargeItem) obj));
            }
        });
        if (liveFastRechargeItem == null || (currentRechargeModule = liveFastRechargeItem.getCurrentRechargeModule()) == null) {
            return;
        }
        currentRechargeModule.isCustomRechargeInput = false;
        liveFastRechargeItem.m75130o0(currentRechargeModule, this.f70372K);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: X */
    public void m97254X(Long l2) {
        this.f70385m.setText(ypv.f199497e.getString(u6n.m192015a() ? R$string.f46994U6 : R$string.f46973T6, zfv.m218597r0(l2.longValue())));
    }

    /* JADX INFO: renamed from: Y */
    public void m97255Y(@ColorInt final int i, @ColorInt final int i2) {
        vwb.m200354z(this.f70363B, new e30() { // from class: l.yk2
            @Override // p149l.e30
            public final void call(Object obj) {
                al2.m97228e(i, i2, (LiveFastRechargeItem) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public void mo75184Z(double d, final nig nigVar) {
        String string;
        final int i = nigVar.f139088a;
        VText vText = this.f70384l;
        if (m97240I(i)) {
            string = ypv.f199497e.getString(u6n.m192015a() ? R$string.f46852Nb : R$string.f46579B0);
        } else {
            string = ypv.f199497e.getString(u6n.m192015a() ? R$string.f46822M2 : R$string.f46801L2);
        }
        vText.setText(string);
        this.f70362A.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.zk2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f203500a.m97250S(nigVar, i, dialogInterface);
            }
        });
        m97238G(d);
        this.f70362A.show();
    }

    /* JADX INFO: renamed from: a0 */
    public abstract void mo75185a0();

    @Override // p149l.s7m
    public Act act() {
        return this.f70398z.act();
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final jii0 m97256b0() {
        return new C15649a();
    }

    /* JADX INFO: renamed from: c0 */
    public void mo75186c0(final LiveFastRechargeItem liveFastRechargeItem) {
        liveFastRechargeItem.m75128m0(true);
        vwb.m200354z(this.f70363B, new e30() { // from class: l.wk2
            @Override // p149l.e30
            public final void call(Object obj) {
                al2.m97233l(liveFastRechargeItem, (LiveFastRechargeItem) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public final void m97257d0() {
        if (TextUtils.isEmpty(this.f70365D)) {
            return;
        }
        if (ypv.f199493a.m199315H() || this.f70366E != 0) {
            if (ypv.f199493a.m199315H() && this.f70367F == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return;
            }
            pl2.C19263b c19263b = new pl2.C19263b();
            c19263b.f150065a = this.f70365D;
            c19263b.f150066b = this.f70366E;
            c19263b.f150067c = this.f70369H;
            c19263b.f150068d = this.f70368G;
            c19263b.f150069e = this.f70371J;
            c19263b.f150070f = this.f70370I;
            this.f70398z.mo125578l4(c19263b);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
        m97262x();
        m97236w();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: p */
    public View m97258p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bl2.m102508b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public View m97259q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cl2.m107441b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(pl2 pl2Var) {
        this.f70398z = pl2Var;
        if (pl2Var != null) {
            m97222C();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m97261u() {
        int i;
        LiveFastRechargeItem liveFastRechargeItemM97263z = m97263z();
        if (liveFastRechargeItemM97263z == null) {
            lsi0.m151595y(ypv.f199497e.getString(R$string.f46873Ob));
            m97236w();
            return;
        }
        try {
            i = Integer.parseInt(this.f70375c.getText().toString());
        } catch (NumberFormatException unused) {
            i = 0;
        }
        if (i <= 0 || i >= 50001) {
            lsi0.m151595y(ypv.f199497e.getString(R$string.f46739I6));
            return;
        }
        m97236w();
        mo75186c0(liveFastRechargeItemM97263z);
        BLiveMerchandise currentRechargeModule = liveFastRechargeItemM97263z.getCurrentRechargeModule();
        BLiveStockKeepUnit bLiveStockKeepUnit = currentRechargeModule.defaultStockKeepUnit;
        this.f70365D = bLiveStockKeepUnit.f44443id;
        int i2 = i * 10;
        this.f70369H = i2;
        this.f70366E = i;
        this.f70368G = i2;
        currentRechargeModule.quantity = i2;
        bLiveStockKeepUnit.prices.price = i;
        currentRechargeModule.isCustomRechargeInput = true;
        liveFastRechargeItemM97263z.m75130o0(currentRechargeModule, this.f70372K);
        mo75185a0();
    }

    /* JADX INFO: renamed from: v */
    public void mo75193v() {
        DialogC12611a dialogC12611a = this.f70362A;
        if (dialogC12611a == null || !dialogC12611a.isShowing()) {
            return;
        }
        this.f70362A.dismiss();
    }

    /* JADX INFO: renamed from: x */
    public void m97262x() {
        Act act = act();
        if (act != null) {
            act.hideInput(this.f70375c);
        }
        DialogC12611a dialogC12611a = this.f70364C;
        if (dialogC12611a != null) {
            dialogC12611a.dismiss();
        }
    }

    /* JADX INFO: renamed from: y */
    public abstract void mo75197y(boolean z);

    @Nullable
    /* JADX INFO: renamed from: z */
    public final LiveFastRechargeItem m97263z() {
        return (LiveFastRechargeItem) vwb.m200346r(this.f70363B, new w9j() { // from class: l.xk2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return al2.m97235n((LiveFastRechargeItem) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public void mo75183U() {
    }
}
