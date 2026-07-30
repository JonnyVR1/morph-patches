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
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VCheckBox;
import p151v.VImage;
import p151v.VLine;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class bo60 {

    /* JADX INFO: renamed from: A */
    public String f77620A;

    /* JADX INFO: renamed from: B */
    public DialogInterface.OnDismissListener f77621B;

    /* JADX INFO: renamed from: C */
    public boolean f77622C;

    /* JADX INFO: renamed from: D */
    public boolean f77623D;

    /* JADX INFO: renamed from: E */
    public final Runnable f77624E;

    /* JADX INFO: renamed from: a */
    public LinearLayout f77625a;

    /* JADX INFO: renamed from: b */
    public VText f77626b;

    /* JADX INFO: renamed from: c */
    public VLine f77627c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f77628d;

    /* JADX INFO: renamed from: e */
    public VImage f77629e;

    /* JADX INFO: renamed from: f */
    public VText f77630f;

    /* JADX INFO: renamed from: g */
    public VText f77631g;

    /* JADX INFO: renamed from: h */
    public VCheckBox f77632h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f77633i;

    /* JADX INFO: renamed from: j */
    public VImage f77634j;

    /* JADX INFO: renamed from: k */
    public VText f77635k;

    /* JADX INFO: renamed from: l */
    public VText f77636l;

    /* JADX INFO: renamed from: m */
    public VCheckBox f77637m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f77638n;

    /* JADX INFO: renamed from: o */
    public VImage f77639o;

    /* JADX INFO: renamed from: p */
    public VText f77640p;

    /* JADX INFO: renamed from: q */
    public VText f77641q;

    /* JADX INFO: renamed from: r */
    public VCheckBox f77642r;

    /* JADX INFO: renamed from: s */
    public VLine f77643s;

    /* JADX INFO: renamed from: t */
    public VText f77644t;

    /* JADX INFO: renamed from: u */
    public final Act f77645u;

    /* JADX INFO: renamed from: v */
    public pej0 f77646v;

    /* JADX INFO: renamed from: w */
    public PurchaseType f77647w;

    /* JADX INFO: renamed from: x */
    public PayMethod f77648x;

    /* JADX INFO: renamed from: y */
    public y20<PayMethod> f77649y;

    /* JADX INFO: renamed from: z */
    public final List<PayMethod> f77650z;

    /* JADX INFO: renamed from: l.bo60$a */
    public class RunnableC16071a implements Runnable {
        public RunnableC16071a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NullChecker.m82486a(bo60.this.f77646v)) {
                bo60.this.f77646v.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: l.bo60$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC16072b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f77652a;

        public ViewTreeObserverOnGlobalLayoutListenerC16072b(BottomSheetBehavior bottomSheetBehavior) {
            this.f77652a = bottomSheetBehavior;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f77652a.setPeekHeight(bo60.this.f77625a.getHeight());
            bo60.this.f77625a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public bo60(Act act, PurchaseType purchaseType) {
        this.f77650z = jyb.m147507f0(PayMethod.get("alipay"), PayMethod.get("wechat"), PayMethod.get(PayMethod.jingdong));
        this.f77622C = false;
        this.f77623D = false;
        this.f77624E = new RunnableC16071a();
        this.f77645u = act;
        this.f77647w = purchaseType;
    }

    /* JADX INFO: renamed from: f */
    public final void m105656f(View view) {
        co60.m111572a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final void m105657g() {
        Window window = this.f77646v.getWindow();
        if (NullChecker.m82486a(window)) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) window.findViewById(R.id.content).findViewById(fdc0.f98450y));
            bottomSheetBehaviorFrom.setState(3);
            bottomSheetBehaviorFrom.setPeekHeight(0);
            this.f77625a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC16072b(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m105658h(View view) {
        if (this.f77637m.isChecked()) {
            this.f77637m.setChecked(false);
        }
        if (!this.f77632h.isChecked()) {
            this.f77632h.setChecked(true);
        }
        if (this.f77642r.isChecked()) {
            this.f77642r.setChecked(false);
        }
        if (NullChecker.m82486a(this.f77649y)) {
            this.f77649y.call(PayMethod.get("alipay"));
        }
        m105671u(PayMethod.get("alipay"));
        l51.m152887G(this.f77624E);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m105659i(View view) {
        if (!this.f77637m.isChecked()) {
            this.f77637m.setChecked(true);
        }
        if (this.f77632h.isChecked()) {
            this.f77632h.setChecked(false);
        }
        if (this.f77642r.isChecked()) {
            this.f77642r.setChecked(false);
        }
        if (NullChecker.m82486a(this.f77649y)) {
            this.f77649y.call(PayMethod.get("wechat"));
        }
        m105671u(PayMethod.get("wechat"));
        l51.m152887G(this.f77624E);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m105660j(View view) {
        if (this.f77637m.isChecked()) {
            this.f77637m.setChecked(false);
        }
        if (this.f77632h.isChecked()) {
            this.f77632h.setChecked(false);
        }
        if (!this.f77642r.isChecked()) {
            this.f77642r.setChecked(true);
        }
        if (NullChecker.m82486a(this.f77649y)) {
            this.f77649y.call(PayMethod.get(PayMethod.jingdong));
        }
        m105671u(PayMethod.get(PayMethod.jingdong));
        l51.m152887G(this.f77624E);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m105661k(View view) {
        this.f77646v.dismiss();
    }

    @Deprecated
    /* JADX INFO: renamed from: l */
    public bo60 m105662l(boolean z) {
        this.f77622C = z;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final void m105663m() {
        if (!CoreModule.f18273l.m143405a().mo34428U() || !CoreModule.f18264c.f20333O0.m31086w3() || CoreModule.f18264c.f20333O0.m31085v3() || wib0.m206571o(this.f77647w) || wib0.m206565i(this.f77647w) || wib0.m206566j(this.f77647w) || wib0.m206572p(this.f77647w) || this.f77623D) {
            this.f77630f.setText(R$string.f28135R9);
        } else {
            this.f77630f.setText(R$string.f28308h);
        }
        this.f77635k.setText(R$string.f28201X9);
        this.f77630f.setTypeface(lyh0.m156283c(3), 1);
        this.f77635k.setTypeface(lyh0.m156283c(3), 1);
        this.f77640p.setTypeface(lyh0.m156283c(3), 1);
        if (TextUtils.equals("coin", this.f77620A) && CoreModule.f18273l.m143405a().mo34389Oo()) {
            this.f77631g.setText(CoreModule.f18273l.m143405a().mo34558oc());
            bnl0.m105524M(this.f77631g, true);
            bnl0.m105524M(this.f77636l, false);
            bnl0.m105524M(this.f77641q, false);
        } else if (!TextUtils.equals("coin", this.f77620A) && CoreModule.f18273l.m143405a().mo34528jh()) {
            this.f77631g.setText(CoreModule.f18273l.m143405a().mo34305D6());
            bnl0.m105524M(this.f77631g, true);
            bnl0.m105524M(this.f77636l, false);
            bnl0.m105524M(this.f77641q, false);
        } else if (CoreModule.f18273l.m143405a().mo34372Mi()) {
            String strMo34325G8 = CoreModule.f18273l.m143405a().mo34325G8();
            if (!TextUtils.isEmpty(strMo34325G8)) {
                this.f77631g.setText(strMo34325G8);
                bnl0.m105524M(this.f77631g, true);
            }
            String strMo34629xb = CoreModule.f18273l.m143405a().mo34629xb();
            if (!TextUtils.isEmpty(strMo34629xb)) {
                this.f77636l.setText(strMo34629xb);
                bnl0.m105524M(this.f77636l, true);
            }
        }
        for (int i = 0; i < this.f77650z.size(); i++) {
            String string = this.f77650z.get(i).toString();
            string.getClass();
            switch (string) {
                case "alipay":
                    bnl0.m105524M(this.f77628d, true);
                    break;
                case "wechat":
                    bnl0.m105524M(this.f77633i, true);
                    break;
                case "jingdong":
                    bnl0.m105524M(this.f77638n, true);
                    break;
            }
        }
        if (TEnum.equals(this.f77648x, "alipay")) {
            this.f77632h.setChecked(true);
            this.f77637m.setChecked(false);
            this.f77642r.setChecked(false);
        } else if (TEnum.equals(this.f77648x, "wechat")) {
            this.f77632h.setChecked(false);
            this.f77637m.setChecked(true);
            this.f77642r.setChecked(false);
        } else if (TEnum.equals(this.f77648x, PayMethod.jingdong)) {
            this.f77632h.setChecked(false);
            this.f77637m.setChecked(false);
            this.f77642r.setChecked(true);
        }
        this.f77628d.setOnClickListener(new View.OnClickListener() { // from class: l.xn60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195364a.m105658h(view);
            }
        });
        this.f77633i.setOnClickListener(new View.OnClickListener() { // from class: l.yn60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200796a.m105659i(view);
            }
        });
        this.f77638n.setOnClickListener(new View.OnClickListener() { // from class: l.zn60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f205181a.m105660j(view);
            }
        });
        bnl0.m105524M(this.f77638n, false);
        bnl0.m105524M(this.f77641q, false);
        this.f77644t.setOnClickListener(new View.OnClickListener() { // from class: l.ao60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72426a.m105661k(view);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public bo60 m105664n(boolean z) {
        this.f77623D = z;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public bo60 m105665o(String str) {
        this.f77620A = str;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public bo60 m105666p(DialogInterface.OnDismissListener onDismissListener) {
        this.f77621B = onDismissListener;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public bo60 m105667q(y20<PayMethod> y20Var) {
        this.f77649y = y20Var;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public bo60 m105668r(PayMethod payMethod) {
        this.f77648x = payMethod;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public void m105669s() {
        this.f77646v = new pej0(this.f77645u, dgc0.f88282g);
        View viewInflate = LayoutInflater.from(this.f77645u).inflate(rec0.f162620w2, (ViewGroup) null);
        m105656f(viewInflate);
        this.f77644t.setTypeface(lyh0.m156283c(3), 1);
        this.f77646v.setContentView(viewInflate);
        this.f77646v.setOnDismissListener(this.f77621B);
        m105663m();
        this.f77646v.show();
        m105657g();
    }

    /* JADX INFO: renamed from: t */
    public bo60 m105670t(List<PayMethod> list) {
        this.f77650z.clear();
        this.f77650z.addAll(list);
        return this;
    }

    /* JADX INFO: renamed from: u */
    public final void m105671u(PayMethod payMethod) {
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
        i4g0.m138523u("e_purchase_platform_exchange", "p_purchase_intermediate_page", jyb.m147494Y("platform", str));
    }

    public bo60(Act act) {
        this.f77650z = jyb.m147507f0(PayMethod.get("alipay"), PayMethod.get("wechat"), PayMethod.get(PayMethod.jingdong));
        this.f77622C = false;
        this.f77623D = false;
        this.f77624E = new RunnableC16071a();
        this.f77645u = act;
    }
}
