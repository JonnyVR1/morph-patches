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
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.e51;
import l.eqh0;
import l.j760;
import l.l5j0;
import l.m6c0;
import l.sab0;
import l.vwb;
import l.xdl0;
import l.xf60;
import l.y7c0;
import l.z4c0;
import l.zvf0;
import v.VCheckBox;
import v.VImage;
import v.VLine;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wf60 {

    /* JADX INFO: renamed from: A */
    public String f21681A;

    /* JADX INFO: renamed from: B */
    public DialogInterface.OnDismissListener f21682B;

    /* JADX INFO: renamed from: C */
    public boolean f21683C;

    /* JADX INFO: renamed from: D */
    public boolean f21684D;

    /* JADX INFO: renamed from: E */
    public final Runnable f21685E;

    /* JADX INFO: renamed from: a */
    public LinearLayout f21686a;

    /* JADX INFO: renamed from: b */
    public VText f21687b;

    /* JADX INFO: renamed from: c */
    public VLine f21688c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f21689d;

    /* JADX INFO: renamed from: e */
    public VImage f21690e;

    /* JADX INFO: renamed from: f */
    public VText f21691f;

    /* JADX INFO: renamed from: g */
    public VText f21692g;

    /* JADX INFO: renamed from: h */
    public VCheckBox f21693h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f21694i;

    /* JADX INFO: renamed from: j */
    public VImage f21695j;

    /* JADX INFO: renamed from: k */
    public VText f21696k;

    /* JADX INFO: renamed from: l */
    public VText f21697l;

    /* JADX INFO: renamed from: m */
    public VCheckBox f21698m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f21699n;

    /* JADX INFO: renamed from: o */
    public VImage f21700o;

    /* JADX INFO: renamed from: p */
    public VText f21701p;

    /* JADX INFO: renamed from: q */
    public VText f21702q;

    /* JADX INFO: renamed from: r */
    public VCheckBox f21703r;

    /* JADX INFO: renamed from: s */
    public VLine f21704s;

    /* JADX INFO: renamed from: t */
    public VText f21705t;

    /* JADX INFO: renamed from: u */
    public final Act f21706u;

    /* JADX INFO: renamed from: v */
    public l5j0 f21707v;

    /* JADX INFO: renamed from: w */
    public PurchaseType f21708w;

    /* JADX INFO: renamed from: x */
    public PayMethod f21709x;

    /* JADX INFO: renamed from: y */
    public e30<PayMethod> f21710y;

    /* JADX INFO: renamed from: z */
    public final List<PayMethod> f21711z;

    /* JADX INFO: renamed from: l.wf60$a */
    public class RunnableC0880a implements Runnable {
        public RunnableC0880a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NullChecker.a(wf60.this.f21707v)) {
                wf60.this.f21707v.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: l.wf60$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC0881b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f21713a;

        public ViewTreeObserverOnGlobalLayoutListenerC0881b(BottomSheetBehavior bottomSheetBehavior) {
            this.f21713a = bottomSheetBehavior;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f21713a.setPeekHeight(wf60.this.f21686a.getHeight());
            wf60.this.f21686a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public wf60(Act act, PurchaseType purchaseType) {
        this.f21711z = vwb.f0(new PayMethod[]{PayMethod.get("alipay"), PayMethod.get("wechat"), PayMethod.get("jingdong")});
        this.f21683C = false;
        this.f21684D = false;
        this.f21685E = new RunnableC0880a();
        this.f21706u = act;
        this.f21708w = purchaseType;
    }

    /* JADX INFO: renamed from: f */
    public final void m24544f(View view) {
        xf60.a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final void m24545g() {
        Window window = this.f21707v.getWindow();
        if (NullChecker.a(window)) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) window.findViewById(R.id.content).findViewById(z4c0.y));
            bottomSheetBehaviorFrom.setState(3);
            bottomSheetBehaviorFrom.setPeekHeight(0);
            this.f21686a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0881b(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m24546h(View view) {
        if (this.f21698m.isChecked()) {
            this.f21698m.setChecked(false);
        }
        if (!this.f21693h.isChecked()) {
            this.f21693h.setChecked(true);
        }
        if (this.f21703r.isChecked()) {
            this.f21703r.setChecked(false);
        }
        if (NullChecker.a(this.f21710y)) {
            this.f21710y.call(PayMethod.get("alipay"));
        }
        m24559u(PayMethod.get("alipay"));
        e51.G(this.f21685E);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m24547i(View view) {
        if (!this.f21698m.isChecked()) {
            this.f21698m.setChecked(true);
        }
        if (this.f21693h.isChecked()) {
            this.f21693h.setChecked(false);
        }
        if (this.f21703r.isChecked()) {
            this.f21703r.setChecked(false);
        }
        if (NullChecker.a(this.f21710y)) {
            this.f21710y.call(PayMethod.get("wechat"));
        }
        m24559u(PayMethod.get("wechat"));
        e51.G(this.f21685E);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m24548j(View view) {
        if (this.f21698m.isChecked()) {
            this.f21698m.setChecked(false);
        }
        if (this.f21693h.isChecked()) {
            this.f21693h.setChecked(false);
        }
        if (!this.f21703r.isChecked()) {
            this.f21703r.setChecked(true);
        }
        if (NullChecker.a(this.f21710y)) {
            this.f21710y.call(PayMethod.get("jingdong"));
        }
        m24559u(PayMethod.get("jingdong"));
        e51.G(this.f21685E);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m24549k(View view) {
        this.f21707v.dismiss();
    }

    @Deprecated
    /* JADX INFO: renamed from: l */
    public wf60 m24550l(boolean z) {
        this.f21683C = z;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final void m24551m() {
        if (!CoreModule.l.a().U() || !CoreModule.c.O0.w3() || CoreModule.c.O0.v3() || sab0.o(this.f21708w) || sab0.i(this.f21708w) || sab0.j(this.f21708w) || sab0.p(this.f21708w) || this.f21684D) {
            this.f21691f.setText(com.p1.mobile.putong.core.pay.R.string.R9);
        } else {
            this.f21691f.setText(com.p1.mobile.putong.core.pay.R.string.h);
        }
        this.f21696k.setText(com.p1.mobile.putong.core.pay.R.string.X9);
        this.f21691f.setTypeface(eqh0.c(3), 1);
        this.f21696k.setTypeface(eqh0.c(3), 1);
        this.f21701p.setTypeface(eqh0.c(3), 1);
        if (TextUtils.equals("coin", this.f21681A) && CoreModule.l.a().Oo()) {
            this.f21692g.setText(CoreModule.l.a().oc());
            xdl0.M(this.f21692g, true);
            xdl0.M(this.f21697l, false);
            xdl0.M(this.f21702q, false);
        } else if (!TextUtils.equals("coin", this.f21681A) && CoreModule.l.a().jh()) {
            this.f21692g.setText(CoreModule.l.a().D6());
            xdl0.M(this.f21692g, true);
            xdl0.M(this.f21697l, false);
            xdl0.M(this.f21702q, false);
        } else if (CoreModule.l.a().Mi()) {
            String strG8 = CoreModule.l.a().G8();
            if (!TextUtils.isEmpty(strG8)) {
                this.f21692g.setText(strG8);
                xdl0.M(this.f21692g, true);
            }
            String strXb = CoreModule.l.a().xb();
            if (!TextUtils.isEmpty(strXb)) {
                this.f21697l.setText(strXb);
                xdl0.M(this.f21697l, true);
            }
        }
        for (int i = 0; i < this.f21711z.size(); i++) {
            String string = this.f21711z.get(i).toString();
            string.getClass();
            switch (string) {
                case "alipay":
                    xdl0.M(this.f21689d, true);
                    break;
                case "wechat":
                    xdl0.M(this.f21694i, true);
                    break;
                case "jingdong":
                    xdl0.M(this.f21699n, true);
                    break;
            }
        }
        if (TEnum.equals(this.f21709x, "alipay")) {
            this.f21693h.setChecked(true);
            this.f21698m.setChecked(false);
            this.f21703r.setChecked(false);
        } else if (TEnum.equals(this.f21709x, "wechat")) {
            this.f21693h.setChecked(false);
            this.f21698m.setChecked(true);
            this.f21703r.setChecked(false);
        } else if (TEnum.equals(this.f21709x, "jingdong")) {
            this.f21693h.setChecked(false);
            this.f21698m.setChecked(false);
            this.f21703r.setChecked(true);
        }
        this.f21689d.setOnClickListener(new View.OnClickListener() { // from class: l.sf60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18984a.m24546h(view);
            }
        });
        this.f21694i.setOnClickListener(new View.OnClickListener() { // from class: l.tf60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20206a.m24547i(view);
            }
        });
        this.f21699n.setOnClickListener(new View.OnClickListener() { // from class: l.uf60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20606a.m24548j(view);
            }
        });
        xdl0.M(this.f21699n, false);
        xdl0.M(this.f21702q, false);
        this.f21705t.setOnClickListener(new View.OnClickListener() { // from class: l.vf60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21101a.m24549k(view);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public wf60 m24552n(boolean z) {
        this.f21684D = z;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public wf60 m24553o(String str) {
        this.f21681A = str;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public wf60 m24554p(DialogInterface.OnDismissListener onDismissListener) {
        this.f21682B = onDismissListener;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public wf60 m24555q(e30<PayMethod> e30Var) {
        this.f21710y = e30Var;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public wf60 m24556r(PayMethod payMethod) {
        this.f21709x = payMethod;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public void m24557s() {
        this.f21707v = new l5j0(this.f21706u, y7c0.f);
        View viewInflate = LayoutInflater.from(this.f21706u).inflate(m6c0.w2, (ViewGroup) null);
        m24544f(viewInflate);
        this.f21705t.setTypeface(eqh0.c(3), 1);
        this.f21707v.setContentView(viewInflate);
        this.f21707v.setOnDismissListener(this.f21682B);
        m24551m();
        this.f21707v.show();
        m24545g();
    }

    /* JADX INFO: renamed from: t */
    public wf60 m24558t(List<PayMethod> list) {
        this.f21711z.clear();
        this.f21711z.addAll(list);
        return this;
    }

    /* JADX INFO: renamed from: u */
    public final void m24559u(PayMethod payMethod) {
        String string = payMethod.toString();
        string.getClass();
        String str = "jingdong";
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
        zvf0.u("e_purchase_platform_exchange", "p_purchase_intermediate_page", new j760[]{vwb.Y("platform", str)});
    }

    public wf60(Act act) {
        this.f21711z = vwb.f0(new PayMethod[]{PayMethod.get("alipay"), PayMethod.get("wechat"), PayMethod.get("jingdong")});
        this.f21683C = false;
        this.f21684D = false;
        this.f21685E = new RunnableC0880a();
        this.f21706u = act;
    }
}
