package p006l;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import l.asc0;
import l.cwf0;
import l.d30;
import l.e30;
import l.eqh0;
import l.i0e;
import l.i0g0;
import l.j760;
import l.mqi0;
import l.ogw;
import l.rf60;
import l.rxa0;
import l.sd60;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.y7c0;
import l.zvf0;
import v.VButton;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class zrc0 extends AlertDialog {

    /* JADX INFO: renamed from: a */
    public VImage f28922a;

    /* JADX INFO: renamed from: b */
    public VImage f28923b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f28924c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f28925d;

    /* JADX INFO: renamed from: e */
    public VText f28926e;

    /* JADX INFO: renamed from: f */
    public VText f28927f;

    /* JADX INFO: renamed from: g */
    public VText f28928g;

    /* JADX INFO: renamed from: h */
    public View f28929h;

    /* JADX INFO: renamed from: i */
    public TextView f28930i;

    /* JADX INFO: renamed from: j */
    public VText f28931j;

    /* JADX INFO: renamed from: k */
    public VText f28932k;

    /* JADX INFO: renamed from: l */
    public RelativeLayout f28933l;

    /* JADX INFO: renamed from: m */
    public TextView f28934m;

    /* JADX INFO: renamed from: n */
    public VText f28935n;

    /* JADX INFO: renamed from: o */
    public ImageView f28936o;

    /* JADX INFO: renamed from: p */
    public VButton f28937p;

    /* JADX INFO: renamed from: q */
    public final Act f28938q;

    /* JADX INFO: renamed from: r */
    public final d30 f28939r;

    /* JADX INFO: renamed from: s */
    public final String f28940s;

    /* JADX INFO: renamed from: t */
    public Merchandise f28941t;

    /* JADX INFO: renamed from: u */
    public cwf0 f28942u;

    /* JADX INFO: renamed from: v */
    public boolean f28943v;

    /* JADX INFO: renamed from: w */
    public NumberFormat f28944w;

    /* JADX INFO: renamed from: x */
    public final String f28945x;

    /* JADX INFO: renamed from: y */
    public boolean f28946y;

    /* JADX INFO: renamed from: z */
    public String f28947z;

    public zrc0(Act act, d30 d30Var, Merchandise merchandise, String str) {
        super(act, y7c0.b);
        this.f28943v = false;
        this.f28945x = "p_reauto";
        this.f28938q = act;
        this.f28941t = merchandise;
        this.f28940s = str;
        this.f28939r = d30Var;
    }

    /* JADX INFO: renamed from: f */
    public View m28798f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return asc0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m28799g() {
        if (TEnum.equals(this.f28941t.category, "svip") && this.f28941t.quarterly()) {
            Merchandise merchandise = (Merchandise) vwb.r(CoreModule.f1534c.f3643j0.m2507D5(ProductCategory.get("svip")), new w9j() { // from class: l.trc0
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Merchandise) obj).semiAnnual());
                }
            });
            this.f28941t = merchandise;
            if (merchandise == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final String m28800h() {
        return String.format("「最高%s倍加速曝光」待领取", Integer.valueOf(this.f28943v ? 9 : 3));
    }

    /* JADX INFO: renamed from: i */
    public final String m28801i() {
        return src0.m24160t();
    }

    /* JADX INFO: renamed from: j */
    public final void m28802j() {
        if (CoreModule.m1854P().m11706a().m5362U()) {
            boolean zM2007n3 = CoreModule.f1534c.f3580O0.m2007n3();
            TextView textView = this.f28934m;
            if (zM2007n3) {
                textView.setText("支付宝免密支付");
            } else {
                textView.setText("支付宝");
            }
        }
        if (CoreModule.m1854P().m11706a().m5462jh()) {
            this.f28935n.setText(CoreModule.m1854P().m11706a().m5239D6());
            xdl0.M(this.f28935n, true);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m28803k() {
        String str;
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        this.f28944w = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        double d = this.f28941t.defaultStockKeepUnit.prices.price;
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.urc0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f23721a.m28804l(dialogInterface);
            }
        });
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.vrc0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f24433a.m28805m(dialogInterface);
            }
        });
        Merchandise merchandise = this.f28941t;
        int i = merchandise.quantity;
        if (i == 1) {
            str = "月";
        } else if (i != 3) {
            str = i != 6 ? "年" : "半年";
        } else {
            str = "季";
        }
        if (TEnum.equals(merchandise.category, "svip") && this.f28941t.semiAnnual()) {
            this.f28926e.setText("SVIP6个月连包");
        } else {
            this.f28926e.setText(String.format("%s连续包%s", this.f28943v ? "SVIP" : "VIP", str));
        }
        VText vText = this.f28926e;
        vText.setTypeface(vText.getTypeface(), 1);
        if (this.f28946y) {
            this.f28932k.setText("「加速曝光」待领取");
            this.f28928g.setText(m28800h());
            this.f28931j.setText(String.format("* %s福利为连续包%s会员专享福利 \n   %s天后将以¥%s/%s自动续费", m28801i(), str, Long.valueOf(src0.m24159r().m24187w()), this.f28944w.format(d), str));
            this.f28930i.setText("当前无需扣款\n开通免密支付即可获得福利");
            if (TEnum.equals(this.f28941t.category, "svip") && this.f28941t.quarterly()) {
                this.f28926e.setText("SVIP3个月连包");
            } else if (TEnum.equals(this.f28941t.category, "svip") && this.f28941t.semiAnnual()) {
                this.f28926e.setText("SVIP6个月连包");
            } else {
                this.f28926e.setText(String.format("%s连续包%s", this.f28943v ? "SVIP" : "VIP", str));
            }
            this.f28937p.setText("立即开通享受福利");
        } else {
            m28809q(d, str);
            m28810r(src0.m24159r().m24181o() + "天");
            this.f28928g.setText(String.format("「%s」已失效", m28801i()));
        }
        xdl0.E0(this.f28923b, new View.OnClickListener() { // from class: l.wrc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f25333a.m28806n(view);
            }
        });
        VText vText2 = this.f28928g;
        vText2.setTypeface(vText2.getTypeface(), 1);
        xdl0.E0(this.f28937p, new View.OnClickListener() { // from class: l.xrc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27693a.m28807o(view);
            }
        });
        zvf0.A("e_reauto", "p_reauto", new j760[]{vwb.Y("reauto_duration", Integer.valueOf(this.f28941t.quantity)), vwb.Y("reauto_product", this.f28943v ? "svip" : "vip"), vwb.Y("reauto_showfrom", this.f28940s), vwb.Y("if_auto_order", Boolean.valueOf(!this.f28946y))});
        boolean zM2007n3 = CoreModule.f1534c.f3580O0.m2007n3();
        TextView textView = this.f28934m;
        if (zM2007n3) {
            textView.setText("支付宝免密支付");
        } else {
            textView.setText("支付宝");
        }
        if (CoreModule.m1854P().m11706a().m5462jh()) {
            this.f28935n.setText(CoreModule.m1854P().m11706a().m5239D6());
            xdl0.M(this.f28935n, true);
        }
        qib0.f19782G.m12727D(this.f28922a, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkdHRExES0hVWUFDMkIzNDVRRUZYTk1UMzVGQlAyWjE0IiwidyI6MTA4MCwiaCI6OTYzLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MjE2MjgzM30.webp");
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m28804l(DialogInterface dialogInterface) {
        rxa0.z(false);
        i0e.e(this.f28942u);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m28805m(DialogInterface dialogInterface) {
        if (NullChecker.a(this.f28939r)) {
            this.f28939r.call();
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m28806n(View view) {
        cancel();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m28807o(View view) {
        zvf0.u("e_reauto", "p_reauto", new j760[]{vwb.Y("reauto_duration", Integer.valueOf(this.f28941t.quantity)), vwb.Y("reauto_product", this.f28943v ? "svip" : "vip"), vwb.Y("reauto_showfrom", this.f28940s), vwb.Y("if_auto_order", Boolean.valueOf(!this.f28946y))});
        this.f28947z = ogw.e(CoreModule.m1850H().userId() + mqi0.o());
        if (TEnum.equals(this.f28941t.category, "svip") && ((this.f28941t.quarterly() || this.f28941t.semiAnnual()) && !sd60.k())) {
            hab0.INSTANCE.m16134a(this.f28947z, this.f28941t.defaultStockKeepUnit.id, "alipay not install");
        } else {
            m28812t();
            dismiss();
        }
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewM28798f = m28798f(this.f28938q.getLayoutInflater(), null);
        this.f28946y = src0.m24159r().m24179l();
        setContentView(viewM28798f);
        m28811s();
        if (this.f28941t == null || m28799g()) {
            dismiss();
            return;
        }
        this.f28943v = TEnum.equals(this.f28941t.category, "svip");
        m28802j();
        m28803k();
        CoreModule.f1534c.f3580O0.m2003C3();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m28808p(Integer num) {
        dismiss();
    }

    /* JADX INFO: renamed from: q */
    public final void m28809q(double d, String str) {
        this.f28931j.setText(String.format("* %s福利为连续包%s会员专享福利 \n   %s天后将以¥%s/%s自动续费", m28801i(), str, Long.valueOf(src0.m24159r().m24187w()), this.f28944w.format(d), str));
    }

    /* JADX INFO: renamed from: r */
    public final void m28810r(String str) {
        this.f28932k.setText(i0g0.b0(String.format("「%s」已失效 %s", m28801i(), str), vwb.f0(new String[]{str}), Color.parseColor("#ff5435"), eqh0.c(2)));
    }

    /* JADX INFO: renamed from: s */
    public final void m28811s() {
        this.f28924c.setPadding(0, xdl0.F0(), 0, 0);
        getWindow().clearFlags(67108864);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        setCancelable(true);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        cwf0 cwf0VarC = i0e.c("p_reauto", Dialog.class.getName());
        this.f28942u = cwf0VarC;
        cwf0VarC.p(new j760[]{vwb.Y("reauto_duration", Integer.valueOf(this.f28941t.quantity)), vwb.Y("reauto_product", this.f28943v ? "svip" : "vip"), vwb.Y("reauto_showfrom", this.f28940s)});
        this.f28942u.r();
        src0.m24159r().m24177T();
        rxa0.z(true);
    }

    /* JADX INFO: renamed from: t */
    public final void m28812t() {
        rf60 rf60Var = new rf60(this.f28943v ? PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE : PurchaseType.TYPE_GET_VIP, this.f28938q, "", "");
        rf60Var.C(this.f28947z);
        rf60Var.t(true);
        rf60Var.I(false, this.f28941t.defaultStockKeepUnit.id, new e30() { // from class: l.yrc0
            public final void call(Object obj) {
                this.f28357a.m28808p((Integer) obj);
            }
        });
    }
}
