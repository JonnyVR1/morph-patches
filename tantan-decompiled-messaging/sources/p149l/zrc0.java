package p149l;

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
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import p147v.VButton;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class zrc0 extends AlertDialog {

    /* JADX INFO: renamed from: a */
    public VImage f204469a;

    /* JADX INFO: renamed from: b */
    public VImage f204470b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f204471c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f204472d;

    /* JADX INFO: renamed from: e */
    public VText f204473e;

    /* JADX INFO: renamed from: f */
    public VText f204474f;

    /* JADX INFO: renamed from: g */
    public VText f204475g;

    /* JADX INFO: renamed from: h */
    public View f204476h;

    /* JADX INFO: renamed from: i */
    public TextView f204477i;

    /* JADX INFO: renamed from: j */
    public VText f204478j;

    /* JADX INFO: renamed from: k */
    public VText f204479k;

    /* JADX INFO: renamed from: l */
    public RelativeLayout f204480l;

    /* JADX INFO: renamed from: m */
    public TextView f204481m;

    /* JADX INFO: renamed from: n */
    public VText f204482n;

    /* JADX INFO: renamed from: o */
    public ImageView f204483o;

    /* JADX INFO: renamed from: p */
    public VButton f204484p;

    /* JADX INFO: renamed from: q */
    public final Act f204485q;

    /* JADX INFO: renamed from: r */
    public final d30 f204486r;

    /* JADX INFO: renamed from: s */
    public final String f204487s;

    /* JADX INFO: renamed from: t */
    public Merchandise f204488t;

    /* JADX INFO: renamed from: u */
    public cwf0 f204489u;

    /* JADX INFO: renamed from: v */
    public boolean f204490v;

    /* JADX INFO: renamed from: w */
    public NumberFormat f204491w;

    /* JADX INFO: renamed from: x */
    public final String f204492x;

    /* JADX INFO: renamed from: y */
    public boolean f204493y;

    /* JADX INFO: renamed from: z */
    public String f204494z;

    public zrc0(Act act, d30 d30Var, Merchandise merchandise, String str) {
        super(act, y7c0.f196692b);
        this.f204490v = false;
        this.f204492x = "p_reauto";
        this.f204485q = act;
        this.f204488t = merchandise;
        this.f204487s = str;
        this.f204486r = d30Var;
    }

    /* JADX INFO: renamed from: f */
    public View m219934f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return asc0.m98590b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m219935g() {
        if (TEnum.equals(this.f204488t.category, "svip") && this.f204488t.quarterly()) {
            Merchandise merchandise = (Merchandise) vwb.m200346r(CoreModule.f17545c.f19654j0.m30579D5(ProductCategory.get("svip")), new w9j() { // from class: l.trc0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Merchandise) obj).semiAnnual());
                }
            });
            this.f204488t = merchandise;
            if (merchandise == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final String m219936h() {
        return String.format("「最高%s倍加速曝光」待领取", Integer.valueOf(this.f204490v ? 9 : 3));
    }

    /* JADX INFO: renamed from: i */
    public final String m219937i() {
        return src0.m185657t();
    }

    /* JADX INFO: renamed from: j */
    public final void m219938j() {
        if (CoreModule.m29935P().m94651a().mo33425U()) {
            boolean zM30079n3 = CoreModule.f17545c.f19591O0.m30079n3();
            TextView textView = this.f204481m;
            if (zM30079n3) {
                textView.setText("支付宝免密支付");
            } else {
                textView.setText("支付宝");
            }
        }
        if (CoreModule.m29935P().m94651a().mo33525jh()) {
            this.f204482n.setText(CoreModule.m29935P().m94651a().mo33302D6());
            xdl0.m208344M(this.f204482n, true);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m219939k() {
        String str;
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        this.f204491w = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        double d = this.f204488t.defaultStockKeepUnit.prices.price;
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.urc0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f177825a.m219940l(dialogInterface);
            }
        });
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.vrc0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f182715a.m219941m(dialogInterface);
            }
        });
        Merchandise merchandise = this.f204488t;
        int i = merchandise.quantity;
        if (i == 1) {
            str = "月";
        } else if (i != 3) {
            str = i != 6 ? "年" : "半年";
        } else {
            str = "季";
        }
        if (TEnum.equals(merchandise.category, "svip") && this.f204488t.semiAnnual()) {
            this.f204473e.setText("SVIP6个月连包");
        } else {
            this.f204473e.setText(String.format("%s连续包%s", this.f204490v ? "SVIP" : "VIP", str));
        }
        VText vText = this.f204473e;
        vText.setTypeface(vText.getTypeface(), 1);
        if (this.f204493y) {
            this.f204479k.setText("「加速曝光」待领取");
            this.f204475g.setText(m219936h());
            this.f204478j.setText(String.format("* %s福利为连续包%s会员专享福利 \n   %s天后将以¥%s/%s自动续费", m219937i(), str, Long.valueOf(src0.m185656r().m185684w()), this.f204491w.format(d), str));
            this.f204477i.setText("当前无需扣款\n开通免密支付即可获得福利");
            if (TEnum.equals(this.f204488t.category, "svip") && this.f204488t.quarterly()) {
                this.f204473e.setText("SVIP3个月连包");
            } else if (TEnum.equals(this.f204488t.category, "svip") && this.f204488t.semiAnnual()) {
                this.f204473e.setText("SVIP6个月连包");
            } else {
                this.f204473e.setText(String.format("%s连续包%s", this.f204490v ? "SVIP" : "VIP", str));
            }
            this.f204484p.setText("立即开通享受福利");
        } else {
            m219945q(d, str);
            m219946r(src0.m185656r().m185678o() + "天");
            this.f204475g.setText(String.format("「%s」已失效", m219937i()));
        }
        xdl0.m208329E0(this.f204470b, new View.OnClickListener() { // from class: l.wrc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187787a.m219942n(view);
            }
        });
        VText vText2 = this.f204475g;
        vText2.setTypeface(vText2.getTypeface(), 1);
        xdl0.m208329E0(this.f204484p, new View.OnClickListener() { // from class: l.xrc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194107a.m219943o(view);
            }
        });
        zvf0.m220368A("e_reauto", "p_reauto", vwb.m200311Y("reauto_duration", Integer.valueOf(this.f204488t.quantity)), vwb.m200311Y("reauto_product", this.f204490v ? "svip" : "vip"), vwb.m200311Y("reauto_showfrom", this.f204487s), vwb.m200311Y("if_auto_order", Boolean.valueOf(!this.f204493y)));
        boolean zM30079n3 = CoreModule.f17545c.f19591O0.m30079n3();
        TextView textView = this.f204481m;
        if (zM30079n3) {
            textView.setText("支付宝免密支付");
        } else {
            textView.setText("支付宝");
        }
        if (CoreModule.m29935P().m94651a().mo33525jh()) {
            this.f204482n.setText(CoreModule.m29935P().m94651a().mo33302D6());
            xdl0.m208344M(this.f204482n, true);
        }
        qib0.f154691G.m102314D(this.f204469a, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkdHRExES0hVWUFDMkIzNDVRRUZYTk1UMzVGQlAyWjE0IiwidyI6MTA4MCwiaCI6OTYzLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MjE2MjgzM30.webp");
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m219940l(DialogInterface dialogInterface) {
        rxa0.m181505z(false);
        i0e.m133796e(this.f204489u);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m219941m(DialogInterface dialogInterface) {
        if (NullChecker.m81303a(this.f204486r)) {
            this.f204486r.call();
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m219942n(View view) {
        cancel();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m219943o(View view) {
        zvf0.m220399u("e_reauto", "p_reauto", vwb.m200311Y("reauto_duration", Integer.valueOf(this.f204488t.quantity)), vwb.m200311Y("reauto_product", this.f204490v ? "svip" : "vip"), vwb.m200311Y("reauto_showfrom", this.f204487s), vwb.m200311Y("if_auto_order", Boolean.valueOf(!this.f204493y)));
        this.f204494z = ogw.m164284e(CoreModule.m29931H().userId() + mqi0.m155944o());
        if (TEnum.equals(this.f204488t.category, "svip") && ((this.f204488t.quarterly() || this.f204488t.semiAnnual()) && !sd60.m183460k())) {
            hab0.INSTANCE.m130127a(this.f204494z, this.f204488t.defaultStockKeepUnit.f20507id, "alipay not install");
        } else {
            m219948t();
            dismiss();
        }
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewM219934f = m219934f(this.f204485q.getLayoutInflater(), null);
        this.f204493y = src0.m185656r().m185676l();
        setContentView(viewM219934f);
        m219947s();
        if (this.f204488t == null || m219935g()) {
            dismiss();
            return;
        }
        this.f204490v = TEnum.equals(this.f204488t.category, "svip");
        m219938j();
        m219939k();
        CoreModule.f17545c.f19591O0.m30075C3();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m219944p(Integer num) {
        dismiss();
    }

    /* JADX INFO: renamed from: q */
    public final void m219945q(double d, String str) {
        this.f204478j.setText(String.format("* %s福利为连续包%s会员专享福利 \n   %s天后将以¥%s/%s自动续费", m219937i(), str, Long.valueOf(src0.m185656r().m185684w()), this.f204491w.format(d), str));
    }

    /* JADX INFO: renamed from: r */
    public final void m219946r(String str) {
        this.f204479k.setText(i0g0.m133861b0(String.format("「%s」已失效 %s", m219937i(), str), vwb.m200324f0(str), Color.parseColor("#ff5435"), eqh0.m117752c(2)));
    }

    /* JADX INFO: renamed from: s */
    public final void m219947s() {
        this.f204471c.setPadding(0, xdl0.m208331F0(), 0, 0);
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
        setCancelable(true);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        cwf0 cwf0VarM133794c = i0e.m133794c("p_reauto", Dialog.class.getName());
        this.f204489u = cwf0VarM133794c;
        cwf0VarM133794c.m109040p(vwb.m200311Y("reauto_duration", Integer.valueOf(this.f204488t.quantity)), vwb.m200311Y("reauto_product", this.f204490v ? "svip" : "vip"), vwb.m200311Y("reauto_showfrom", this.f204487s));
        this.f204489u.m109042r();
        src0.m185656r().m185674T();
        rxa0.m181505z(true);
    }

    /* JADX INFO: renamed from: t */
    public final void m219948t() {
        rf60 rf60Var = new rf60(this.f204490v ? PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE : PurchaseType.TYPE_GET_VIP, this.f204485q, "", "");
        rf60Var.m179078C(this.f204494z);
        rf60Var.m179103t(true);
        rf60Var.m179084I(false, this.f204488t.defaultStockKeepUnit.f20507id, new e30() { // from class: l.yrc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199662a.m219944p((Integer) obj);
            }
        });
    }
}
