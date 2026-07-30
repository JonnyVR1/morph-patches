package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import p151v.VButton;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class e0d0 extends AlertDialog {

    /* JADX INFO: renamed from: a */
    public VImage f91432a;

    /* JADX INFO: renamed from: b */
    public VImage f91433b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f91434c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f91435d;

    /* JADX INFO: renamed from: e */
    public VText f91436e;

    /* JADX INFO: renamed from: f */
    public VText f91437f;

    /* JADX INFO: renamed from: g */
    public VText f91438g;

    /* JADX INFO: renamed from: h */
    public View f91439h;

    /* JADX INFO: renamed from: i */
    public TextView f91440i;

    /* JADX INFO: renamed from: j */
    public VText f91441j;

    /* JADX INFO: renamed from: k */
    public VText f91442k;

    /* JADX INFO: renamed from: l */
    public RelativeLayout f91443l;

    /* JADX INFO: renamed from: m */
    public TextView f91444m;

    /* JADX INFO: renamed from: n */
    public VText f91445n;

    /* JADX INFO: renamed from: o */
    public ImageView f91446o;

    /* JADX INFO: renamed from: p */
    public VButton f91447p;

    /* JADX INFO: renamed from: q */
    public final Act f91448q;

    /* JADX INFO: renamed from: r */
    public final x20 f91449r;

    /* JADX INFO: renamed from: s */
    public final String f91450s;

    /* JADX INFO: renamed from: t */
    public Merchandise f91451t;

    /* JADX INFO: renamed from: u */
    public l4g0 f91452u;

    /* JADX INFO: renamed from: v */
    public boolean f91453v;

    /* JADX INFO: renamed from: w */
    public NumberFormat f91454w;

    /* JADX INFO: renamed from: x */
    public final String f91455x;

    /* JADX INFO: renamed from: y */
    public boolean f91456y;

    /* JADX INFO: renamed from: z */
    public String f91457z;

    public e0d0(Act act, x20 x20Var, Merchandise merchandise, String str) {
        super(act, dgc0.f88277b);
        this.f91453v = false;
        this.f91455x = "p_reauto";
        this.f91448q = act;
        this.f91451t = merchandise;
        this.f91450s = str;
        this.f91449r = x20Var;
    }

    /* JADX INFO: renamed from: f */
    public View m118840f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f0d0.m123480b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m118841g() {
        if (TEnum.equals(this.f91451t.category, "svip") && this.f91451t.quarterly()) {
            Merchandise merchandise = (Merchandise) jyb.m147529r(CoreModule.f18264c.f20396j0.m31582D5(ProductCategory.get("svip")), new qcj() { // from class: l.yzc0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Merchandise) obj).semiAnnual());
                }
            });
            this.f91451t = merchandise;
            if (merchandise == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final String m118842h() {
        return String.format("「最高%s倍加速曝光」待领取", Integer.valueOf(this.f91453v ? 9 : 3));
    }

    /* JADX INFO: renamed from: i */
    public final String m118843i() {
        return xzc0.m213721t();
    }

    /* JADX INFO: renamed from: j */
    public final void m118844j() {
        if (CoreModule.m30933P().m143405a().mo34428U()) {
            boolean zM31077n3 = CoreModule.f18264c.f20333O0.m31077n3();
            TextView textView = this.f91444m;
            if (zM31077n3) {
                textView.setText("支付宝免密支付");
            } else {
                textView.setText("支付宝");
            }
        }
        if (CoreModule.m30933P().m143405a().mo34528jh()) {
            this.f91445n.setText(CoreModule.m30933P().m143405a().mo34305D6());
            bnl0.m105524M(this.f91445n, true);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m118845k() {
        String str;
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        this.f91454w = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        double d = this.f91451t.defaultStockKeepUnit.prices.price;
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.zzc0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f206694a.m118846l(dialogInterface);
            }
        });
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.a0d0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f67703a.m118847m(dialogInterface);
            }
        });
        Merchandise merchandise = this.f91451t;
        int i = merchandise.quantity;
        if (i == 1) {
            str = "月";
        } else if (i != 3) {
            str = i != 6 ? "年" : "半年";
        } else {
            str = "季";
        }
        if (TEnum.equals(merchandise.category, "svip") && this.f91451t.semiAnnual()) {
            this.f91436e.setText("SVIP6个月连包");
        } else {
            this.f91436e.setText(String.format("%s连续包%s", this.f91453v ? "SVIP" : "VIP", str));
        }
        VText vText = this.f91436e;
        vText.setTypeface(vText.getTypeface(), 1);
        if (this.f91456y) {
            this.f91442k.setText("「加速曝光」待领取");
            this.f91438g.setText(m118842h());
            this.f91441j.setText(String.format("* %s福利为连续包%s会员专享福利 \n   %s天后将以¥%s/%s自动续费", m118843i(), str, Long.valueOf(xzc0.m213720r().m213748w()), this.f91454w.format(d), str));
            this.f91440i.setText("当前无需扣款\n开通免密支付即可获得福利");
            if (TEnum.equals(this.f91451t.category, "svip") && this.f91451t.quarterly()) {
                this.f91436e.setText("SVIP3个月连包");
            } else if (TEnum.equals(this.f91451t.category, "svip") && this.f91451t.semiAnnual()) {
                this.f91436e.setText("SVIP6个月连包");
            } else {
                this.f91436e.setText(String.format("%s连续包%s", this.f91453v ? "SVIP" : "VIP", str));
            }
            this.f91447p.setText("立即开通享受福利");
        } else {
            m118851q(d, str);
            m118852r(xzc0.m213720r().m213742o() + "天");
            this.f91438g.setText(String.format("「%s」已失效", m118843i()));
        }
        bnl0.m105509E0(this.f91433b, new View.OnClickListener() { // from class: l.b0d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74266a.m118848n(view);
            }
        });
        VText vText2 = this.f91438g;
        vText2.setTypeface(vText2.getTypeface(), 1);
        bnl0.m105509E0(this.f91447p, new View.OnClickListener() { // from class: l.c0d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79264a.m118849o(view);
            }
        });
        i4g0.m138492A("e_reauto", "p_reauto", jyb.m147494Y("reauto_duration", Integer.valueOf(this.f91451t.quantity)), jyb.m147494Y("reauto_product", this.f91453v ? "svip" : "vip"), jyb.m147494Y("reauto_showfrom", this.f91450s), jyb.m147494Y("if_auto_order", Boolean.valueOf(!this.f91456y)));
        boolean zM31077n3 = CoreModule.f18264c.f20333O0.m31077n3();
        TextView textView = this.f91444m;
        if (zM31077n3) {
            textView.setText("支付宝免密支付");
        } else {
            textView.setText("支付宝");
        }
        if (CoreModule.m30933P().m143405a().mo34528jh()) {
            this.f91445n.setText(CoreModule.m30933P().m143405a().mo34305D6());
            bnl0.m105524M(this.f91445n, true);
        }
        uqb0.f180374G.m127098D(this.f91432a, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkdHRExES0hVWUFDMkIzNDVRRUZYTk1UMzVGQlAyWjE0IiwidyI6MTA4MCwiaCI6OTYzLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MjE2MjgzM30.webp");
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m118846l(DialogInterface dialogInterface) {
        v5b0.m199800z(false);
        w1e.m204401e(this.f91452u);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m118847m(DialogInterface dialogInterface) {
        if (NullChecker.m82486a(this.f91449r)) {
            this.f91449r.call();
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m118848n(View view) {
        cancel();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m118849o(View view) {
        i4g0.m138523u("e_reauto", "p_reauto", jyb.m147494Y("reauto_duration", Integer.valueOf(this.f91451t.quantity)), jyb.m147494Y("reauto_product", this.f91453v ? "svip" : "vip"), jyb.m147494Y("reauto_showfrom", this.f91450s), jyb.m147494Y("if_auto_order", Boolean.valueOf(!this.f91456y)));
        this.f91457z = niw.m163315e(CoreModule.m30929H().userId() + pzi0.m174454o());
        if (TEnum.equals(this.f91451t.category, "svip") && ((this.f91451t.quarterly() || this.f91451t.semiAnnual()) && !xl60.m211506k())) {
            lib0.INSTANCE.m154349a(this.f91457z, this.f91451t.defaultStockKeepUnit.f21249id, "alipay not install");
        } else {
            m118854t();
            dismiss();
        }
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewM118840f = m118840f(this.f91448q.getLayoutInflater(), null);
        this.f91456y = xzc0.m213720r().m213740l();
        setContentView(viewM118840f);
        m118853s();
        if (this.f91451t == null || m118841g()) {
            dismiss();
            return;
        }
        this.f91453v = TEnum.equals(this.f91451t.category, "svip");
        m118844j();
        m118845k();
        CoreModule.f18264c.f20333O0.m31073C3();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m118850p(Integer num) {
        dismiss();
    }

    /* JADX INFO: renamed from: q */
    public final void m118851q(double d, String str) {
        this.f91441j.setText(String.format("* %s福利为连续包%s会员专享福利 \n   %s天后将以¥%s/%s自动续费", m118843i(), str, Long.valueOf(xzc0.m213720r().m213748w()), this.f91454w.format(d), str));
    }

    /* JADX INFO: renamed from: r */
    public final void m118852r(String str) {
        this.f91442k.setText(q8g0.m175796b0(String.format("「%s」已失效 %s", m118843i(), str), jyb.m147507f0(str), Color.parseColor("#ff5435"), lyh0.m156283c(2)));
    }

    /* JADX INFO: renamed from: s */
    public final void m118853s() {
        this.f91434c.setPadding(0, bnl0.m105511F0(), 0, 0);
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
        setCancelable(true);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        l4g0 l4g0VarM204399c = w1e.m204399c("p_reauto", Dialog.class.getName());
        this.f91452u = l4g0VarM204399c;
        l4g0VarM204399c.m152781p(jyb.m147494Y("reauto_duration", Integer.valueOf(this.f91451t.quantity)), jyb.m147494Y("reauto_product", this.f91453v ? "svip" : "vip"), jyb.m147494Y("reauto_showfrom", this.f91450s));
        this.f91452u.m152783r();
        xzc0.m213720r().m213738T();
        v5b0.m199800z(true);
    }

    /* JADX INFO: renamed from: t */
    public final void m118854t() {
        wn60 wn60Var = new wn60(this.f91453v ? PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE : PurchaseType.TYPE_GET_VIP, this.f91448q, "", "");
        wn60Var.m207144C(this.f91457z);
        wn60Var.m207169t(true);
        wn60Var.m207150I(false, this.f91451t.defaultStockKeepUnit.f21249id, new y20() { // from class: l.d0d0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84556a.m118850p((Integer) obj);
            }
        });
    }
}
