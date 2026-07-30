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
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VCheckBox;
import p147v.VImage;
import p147v.VLine;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class wf60 {

    /* JADX INFO: renamed from: A */
    public String f186030A;

    /* JADX INFO: renamed from: B */
    public DialogInterface.OnDismissListener f186031B;

    /* JADX INFO: renamed from: C */
    public boolean f186032C;

    /* JADX INFO: renamed from: D */
    public boolean f186033D;

    /* JADX INFO: renamed from: E */
    public final Runnable f186034E;

    /* JADX INFO: renamed from: a */
    public LinearLayout f186035a;

    /* JADX INFO: renamed from: b */
    public VText f186036b;

    /* JADX INFO: renamed from: c */
    public VLine f186037c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f186038d;

    /* JADX INFO: renamed from: e */
    public VImage f186039e;

    /* JADX INFO: renamed from: f */
    public VText f186040f;

    /* JADX INFO: renamed from: g */
    public VText f186041g;

    /* JADX INFO: renamed from: h */
    public VCheckBox f186042h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f186043i;

    /* JADX INFO: renamed from: j */
    public VImage f186044j;

    /* JADX INFO: renamed from: k */
    public VText f186045k;

    /* JADX INFO: renamed from: l */
    public VText f186046l;

    /* JADX INFO: renamed from: m */
    public VCheckBox f186047m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f186048n;

    /* JADX INFO: renamed from: o */
    public VImage f186049o;

    /* JADX INFO: renamed from: p */
    public VText f186050p;

    /* JADX INFO: renamed from: q */
    public VText f186051q;

    /* JADX INFO: renamed from: r */
    public VCheckBox f186052r;

    /* JADX INFO: renamed from: s */
    public VLine f186053s;

    /* JADX INFO: renamed from: t */
    public VText f186054t;

    /* JADX INFO: renamed from: u */
    public final Act f186055u;

    /* JADX INFO: renamed from: v */
    public l5j0 f186056v;

    /* JADX INFO: renamed from: w */
    public PurchaseType f186057w;

    /* JADX INFO: renamed from: x */
    public PayMethod f186058x;

    /* JADX INFO: renamed from: y */
    public e30<PayMethod> f186059y;

    /* JADX INFO: renamed from: z */
    public final List<PayMethod> f186060z;

    /* JADX INFO: renamed from: l.wf60$a */
    public class RunnableC20866a implements Runnable {
        public RunnableC20866a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NullChecker.m81303a(wf60.this.f186056v)) {
                wf60.this.f186056v.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: l.wf60$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC20867b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f186062a;

        public ViewTreeObserverOnGlobalLayoutListenerC20867b(BottomSheetBehavior bottomSheetBehavior) {
            this.f186062a = bottomSheetBehavior;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f186062a.setPeekHeight(wf60.this.f186035a.getHeight());
            wf60.this.f186035a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public wf60(Act act, PurchaseType purchaseType) {
        this.f186060z = vwb.m200324f0(PayMethod.get("alipay"), PayMethod.get("wechat"), PayMethod.get(PayMethod.jingdong));
        this.f186032C = false;
        this.f186033D = false;
        this.f186034E = new RunnableC20866a();
        this.f186055u = act;
        this.f186057w = purchaseType;
    }

    /* JADX INFO: renamed from: f */
    public final void m202963f(View view) {
        xf60.m208595a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final void m202964g() {
        Window window = this.f186056v.getWindow();
        if (NullChecker.m81303a(window)) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) window.findViewById(R.id.content).findViewById(z4c0.f201574y));
            bottomSheetBehaviorFrom.setState(3);
            bottomSheetBehaviorFrom.setPeekHeight(0);
            this.f186035a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC20867b(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m202965h(View view) {
        if (this.f186047m.isChecked()) {
            this.f186047m.setChecked(false);
        }
        if (!this.f186042h.isChecked()) {
            this.f186042h.setChecked(true);
        }
        if (this.f186052r.isChecked()) {
            this.f186052r.setChecked(false);
        }
        if (NullChecker.m81303a(this.f186059y)) {
            this.f186059y.call(PayMethod.get("alipay"));
        }
        m202978u(PayMethod.get("alipay"));
        e51.m114742G(this.f186034E);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m202966i(View view) {
        if (!this.f186047m.isChecked()) {
            this.f186047m.setChecked(true);
        }
        if (this.f186042h.isChecked()) {
            this.f186042h.setChecked(false);
        }
        if (this.f186052r.isChecked()) {
            this.f186052r.setChecked(false);
        }
        if (NullChecker.m81303a(this.f186059y)) {
            this.f186059y.call(PayMethod.get("wechat"));
        }
        m202978u(PayMethod.get("wechat"));
        e51.m114742G(this.f186034E);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m202967j(View view) {
        if (this.f186047m.isChecked()) {
            this.f186047m.setChecked(false);
        }
        if (this.f186042h.isChecked()) {
            this.f186042h.setChecked(false);
        }
        if (!this.f186052r.isChecked()) {
            this.f186052r.setChecked(true);
        }
        if (NullChecker.m81303a(this.f186059y)) {
            this.f186059y.call(PayMethod.get(PayMethod.jingdong));
        }
        m202978u(PayMethod.get(PayMethod.jingdong));
        e51.m114742G(this.f186034E);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m202968k(View view) {
        this.f186056v.dismiss();
    }

    @Deprecated
    /* JADX INFO: renamed from: l */
    public wf60 m202969l(boolean z) {
        this.f186032C = z;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final void m202970m() {
        if (!CoreModule.f17554l.m94651a().mo33425U() || !CoreModule.f17545c.f19591O0.m30088w3() || CoreModule.f17545c.f19591O0.m30087v3() || sab0.m182897o(this.f186057w) || sab0.m182891i(this.f186057w) || sab0.m182892j(this.f186057w) || sab0.m182898p(this.f186057w) || this.f186033D) {
            this.f186040f.setText(R$string.f27287R9);
        } else {
            this.f186040f.setText(R$string.f27460h);
        }
        this.f186045k.setText(R$string.f27353X9);
        this.f186040f.setTypeface(eqh0.m117752c(3), 1);
        this.f186045k.setTypeface(eqh0.m117752c(3), 1);
        this.f186050p.setTypeface(eqh0.m117752c(3), 1);
        if (TextUtils.equals("coin", this.f186030A) && CoreModule.f17554l.m94651a().mo33386Oo()) {
            this.f186041g.setText(CoreModule.f17554l.m94651a().mo33555oc());
            xdl0.m208344M(this.f186041g, true);
            xdl0.m208344M(this.f186046l, false);
            xdl0.m208344M(this.f186051q, false);
        } else if (!TextUtils.equals("coin", this.f186030A) && CoreModule.f17554l.m94651a().mo33525jh()) {
            this.f186041g.setText(CoreModule.f17554l.m94651a().mo33302D6());
            xdl0.m208344M(this.f186041g, true);
            xdl0.m208344M(this.f186046l, false);
            xdl0.m208344M(this.f186051q, false);
        } else if (CoreModule.f17554l.m94651a().mo33369Mi()) {
            String strMo33322G8 = CoreModule.f17554l.m94651a().mo33322G8();
            if (!TextUtils.isEmpty(strMo33322G8)) {
                this.f186041g.setText(strMo33322G8);
                xdl0.m208344M(this.f186041g, true);
            }
            String strMo33626xb = CoreModule.f17554l.m94651a().mo33626xb();
            if (!TextUtils.isEmpty(strMo33626xb)) {
                this.f186046l.setText(strMo33626xb);
                xdl0.m208344M(this.f186046l, true);
            }
        }
        for (int i = 0; i < this.f186060z.size(); i++) {
            String string = this.f186060z.get(i).toString();
            string.getClass();
            switch (string) {
                case "alipay":
                    xdl0.m208344M(this.f186038d, true);
                    break;
                case "wechat":
                    xdl0.m208344M(this.f186043i, true);
                    break;
                case "jingdong":
                    xdl0.m208344M(this.f186048n, true);
                    break;
            }
        }
        if (TEnum.equals(this.f186058x, "alipay")) {
            this.f186042h.setChecked(true);
            this.f186047m.setChecked(false);
            this.f186052r.setChecked(false);
        } else if (TEnum.equals(this.f186058x, "wechat")) {
            this.f186042h.setChecked(false);
            this.f186047m.setChecked(true);
            this.f186052r.setChecked(false);
        } else if (TEnum.equals(this.f186058x, PayMethod.jingdong)) {
            this.f186042h.setChecked(false);
            this.f186047m.setChecked(false);
            this.f186052r.setChecked(true);
        }
        this.f186038d.setOnClickListener(new View.OnClickListener() { // from class: l.sf60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164264a.m202965h(view);
            }
        });
        this.f186043i.setOnClickListener(new View.OnClickListener() { // from class: l.tf60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f169947a.m202966i(view);
            }
        });
        this.f186048n.setOnClickListener(new View.OnClickListener() { // from class: l.uf60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176234a.m202967j(view);
            }
        });
        xdl0.m208344M(this.f186048n, false);
        xdl0.m208344M(this.f186051q, false);
        this.f186054t.setOnClickListener(new View.OnClickListener() { // from class: l.vf60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181250a.m202968k(view);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public wf60 m202971n(boolean z) {
        this.f186033D = z;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public wf60 m202972o(String str) {
        this.f186030A = str;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public wf60 m202973p(DialogInterface.OnDismissListener onDismissListener) {
        this.f186031B = onDismissListener;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public wf60 m202974q(e30<PayMethod> e30Var) {
        this.f186059y = e30Var;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public wf60 m202975r(PayMethod payMethod) {
        this.f186058x = payMethod;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public void m202976s() {
        this.f186056v = new l5j0(this.f186055u, y7c0.f196696f);
        View viewInflate = LayoutInflater.from(this.f186055u).inflate(m6c0.f131660w2, (ViewGroup) null);
        m202963f(viewInflate);
        this.f186054t.setTypeface(eqh0.m117752c(3), 1);
        this.f186056v.setContentView(viewInflate);
        this.f186056v.setOnDismissListener(this.f186031B);
        m202970m();
        this.f186056v.show();
        m202964g();
    }

    /* JADX INFO: renamed from: t */
    public wf60 m202977t(List<PayMethod> list) {
        this.f186060z.clear();
        this.f186060z.addAll(list);
        return this;
    }

    /* JADX INFO: renamed from: u */
    public final void m202978u(PayMethod payMethod) {
        String string = payMethod.toString();
        string.getClass();
        String str = PayMethod.jingdong;
        switch (string) {
            case "alipay":
                str = "alipay";
                break;
            case "wechat":
                str = "wechat";
                break;
            case "jingdong":
                break;
            default:
                str = null;
                break;
        }
        zvf0.m220399u("e_purchase_platform_exchange", "p_purchase_intermediate_page", vwb.m200311Y("platform", str));
    }

    public wf60(Act act) {
        this.f186060z = vwb.m200324f0(PayMethod.get("alipay"), PayMethod.get("wechat"), PayMethod.get(PayMethod.jingdong));
        this.f186032C = false;
        this.f186033D = false;
        this.f186034E = new RunnableC20866a();
        this.f186055u = act;
    }
}
