package p003l;

import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.DynamicSchemaMsgData;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.HashMap;
import l.c3c0;
import l.j2e0;
import l.j760;
import l.sab0;
import l.vwb;
import l.xdl0;
import l.xma;
import l.zvf0;
import org.json.JSONObject;
import p028v.VCheckBox;
import p028v.VImage;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class zbq extends ubq {

    /* JADX INFO: renamed from: n */
    public Act f9288n;

    /* JADX INFO: renamed from: o */
    public Merchandise f9289o;

    /* JADX INFO: renamed from: s */
    public String f9293s;

    /* JADX INFO: renamed from: u */
    public String f9295u;

    /* JADX INFO: renamed from: v */
    public RelativeLayout f9296v;

    /* JADX INFO: renamed from: w */
    public VImage f9297w;

    /* JADX INFO: renamed from: x */
    public VText f9298x;

    /* JADX INFO: renamed from: y */
    public VText f9299y;

    /* JADX INFO: renamed from: z */
    public VCheckBox f9300z;

    /* JADX INFO: renamed from: p */
    public boolean f9290p = false;

    /* JADX INFO: renamed from: q */
    public PurchaseType f9291q = PurchaseType.TYPE_GET_VIP;

    /* JADX INFO: renamed from: r */
    public PayMethod f9292r = PayMethod.get("alipay");

    /* JADX INFO: renamed from: t */
    public String f9294t = "";

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m9387I(Integer num) {
    }

    /* JADX INFO: renamed from: R */
    public static boolean m9391R(Message message) {
        if (TextUtils.isEmpty(message.msgData)) {
            return false;
        }
        return TEnum.equals(message.messageType(), "monetization_buy") || TEnum.equals(message.messageType(), "monetization_buy_v2");
    }

    @Override // p003l.ubq
    /* JADX INFO: renamed from: D */
    public void mo8123D(DynamicSchemaMsgData dynamicSchemaMsgData) {
        xdl0.E0(this.f7953e, new View.OnClickListener() { // from class: l.xbq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8762a.m9399U(view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public void m9392M(RelativeLayout relativeLayout, VImage vImage, VText vText, VText vText2, VCheckBox vCheckBox) {
        this.f9296v = relativeLayout;
        this.f9297w = vImage;
        this.f9298x = vText;
        this.f9299y = vText2;
        this.f9300z = vCheckBox;
        m9396Q();
    }

    /* JADX INFO: renamed from: N */
    public final boolean m9393N() {
        Merchandise merchandise = this.f9289o;
        if (merchandise == null) {
            return false;
        }
        if (merchandise.autoRenewable() && !this.f9300z.isChecked()) {
            return false;
        }
        if (CoreModule.P().a().bi(this.f9293s)) {
            if (this.f9289o.autoRenewable() && this.f9289o.monthType() && xma.L3() && CoreModule.P().a().Zp()) {
                return false;
            }
        } else if (m9395P()) {
            return false;
        }
        return CoreModule.l.g().ae(this.f9289o, this.f9293s);
    }

    /* JADX INFO: renamed from: O */
    public final CharSequence m9394O(String str) {
        return (!CoreModule.c.O0.n3() || this.f9291q == PurchaseType.TYPE_O_DIAMOND || this.f9290p) ? String.format("确认协议并支付%s元", str) : String.format("确认协议免密付%s元", str);
    }

    /* JADX INFO: renamed from: P */
    public final boolean m9395P() {
        if (xma.F3()) {
            return true;
        }
        if (xma.L3()) {
            return this.f9291q != PurchaseType.TYPE_O_DIAMOND;
        }
        return CoreModule.c.e0.na().isVIP() && this.f9291q == PurchaseType.TYPE_GET_VIP;
    }

    /* JADX INFO: renamed from: Q */
    public final void m9396Q() {
        this.f9288n = xdl0.E(this.f9296v);
        this.f9299y.setMovementMethod(LinkMovementMethod.getInstance());
        xdl0.E0(this.f9296v, new View.OnClickListener() { // from class: l.vbq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8277a.m9398T(view);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m9397S(PayMethod payMethod) {
        this.f9292r = payMethod;
        this.f9290p = payMethod == PayMethod.get("wechat");
        m9403Y();
        if (TextUtils.isEmpty(this.f9294t)) {
            return;
        }
        this.f7953e.setText(m9394O(this.f9294t));
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m9398T(View view) {
        CoreModule.l.g().Cp(this.f9288n, this.f9291q, this.f9289o, this.f9292r, new e30() { // from class: l.wbq
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8531a.m9397S((PayMethod) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m9399U(View view) {
        PurchaseType purchaseType;
        if (this.f9289o == null) {
            if ("odiamond".equalsIgnoreCase(this.f9295u)) {
                j2e0.m(this.f9288n, Uri.parse("tantan://vip/diamond"));
                return;
            }
            if ("platinum".equalsIgnoreCase(this.f9295u)) {
                j2e0.m(this.f9288n, Uri.parse("tantan://vip/platinum"));
                return;
            }
            if ("svip".equalsIgnoreCase(this.f9295u)) {
                j2e0.m(this.f9288n, Uri.parse("tantan://vip/svip"));
                return;
            }
            boolean zEqualsIgnoreCase = "vip".equalsIgnoreCase(this.f9295u);
            Act act = this.f9288n;
            if (zEqualsIgnoreCase) {
                j2e0.m(act, Uri.parse("tantan://vip/vip"));
                return;
            } else {
                j2e0.m(act, Uri.parse("tantan://vip/vip"));
                return;
            }
        }
        if (m9393N()) {
            CoreModule.l.g().Sb(this.f9289o, this.f9292r, !TextUtils.isEmpty(this.f9294t), (!CoreModule.l.a().U() || this.f9290p || !CoreModule.c.O0.n3() || (purchaseType = this.f9291q) == PurchaseType.TYPE_O_DIAMOND || purchaseType == PurchaseType.TYPE_O_PLATINUM) ? false : true, "p_chat,assistant_buybutton", "p_chat_view");
        }
        HashMap map = new HashMap();
        map.put("platform", this.f9292r);
        map.put("productType", this.f9289o.category);
        map.put("purchaseShowFrom", "p_chat,assistant_buybutton");
        if (!TextUtils.isEmpty(this.f9293s)) {
            map.put("couponID", this.f9293s);
        }
        if (m9393N()) {
            m9401W();
            map.put("if_to_buy", Boolean.TRUE);
        } else {
            CoreModule.P().a().qd(this.f9288n, "p_privilege,assistant_guide", this.f9289o.category.name());
            map.put("if_to_buy", Boolean.FALSE);
        }
        zvf0.s("e_purchase_button", "p_chat_view", map);
        m9404Z(false);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: V */
    public final void m9400V(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                DynamicSchemaMsgData dynamicSchemaMsgData = (DynamicSchemaMsgData) DynamicSchemaMsgData.JSON_ADAPTER.parse(str);
                if (NullChecker.a(dynamicSchemaMsgData) && !TextUtils.isEmpty(dynamicSchemaMsgData.extra) && !TextUtils.equals("null", dynamicSchemaMsgData.extra)) {
                    JSONObject jSONObject = new JSONObject(dynamicSchemaMsgData.extra);
                    ProductCategory productCategory = ProductCategory.get(jSONObject.optString("payProduct", "unknown_"));
                    this.f9293s = jSONObject.optString("payCouponID", "");
                    jSONObject.optInt("payDuration", 0);
                    this.f9289o = CoreModule.l.g().fk(productCategory, this.f9293s);
                    double dOptDouble = jSONObject.optDouble("payAmount", 0.0d);
                    if (dOptDouble > 0.0d) {
                        this.f9294t = new DecimalFormat("#.#").format(dOptDouble / 100.0d);
                    }
                    this.f9295u = jSONObject.optString("payProduct");
                    m9404Z(true);
                }
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        if (!NullChecker.a(this.f9289o)) {
            this.f7953e.setText("立即查看");
            xdl0.M(this.f9299y, false);
            xdl0.M(this.f9300z, false);
            xdl0.M(this.f9296v, false);
            return;
        }
        this.f9291q = sab0.b(this.f9289o.category);
        this.f9299y.setTextColor(Color.parseColor("#de000000"));
        this.f9299y.setAlpha(0.25f);
        boolean zBi = CoreModule.P().a().bi(this.f9293s);
        AppCompatTextView appCompatTextView = this.f9299y;
        if (zBi) {
            appCompatTextView.setText(CoreModule.P().a().rl(this.f9289o, Color.parseColor("#de000000")));
        } else {
            appCompatTextView.setText(CoreModule.l.g().je("", this.f9288n, this.f9289o, this.f9291q, false));
        }
        xdl0.M(this.f9300z, this.f9289o.autoRenewable());
        m9402X(this.f9289o);
        xdl0.M(this.f9299y, true);
        this.f7953e.setText(TextUtils.isEmpty(this.f9294t) ? "立即查看" : m9394O(this.f9294t));
    }

    /* JADX INFO: renamed from: W */
    public final void m9401W() {
        CoreModule.l.g().To(this.f9291q, this.f9288n, "", this.f9289o.autoRenewable(), this.f9290p, this.f9289o.defaultStockKeepUnit.id, this.f9293s, new e30() { // from class: l.ybq
            @Override // p003l.e30
            public final void call(Object obj) {
                zbq.m9387I((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public void m9402X(@NonNull Merchandise merchandise) {
        this.f9289o = merchandise;
        if (merchandise.category == ProductCategory.get("oDiamond")) {
            this.f9291q = PurchaseType.TYPE_O_DIAMOND;
        } else if (merchandise.category == ProductCategory.get("svip")) {
            this.f9291q = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        } else {
            this.f9291q = PurchaseType.TYPE_GET_VIP;
        }
        xdl0.M(this.f9296v, true);
        m9403Y();
    }

    /* JADX INFO: renamed from: Y */
    public void m9403Y() {
        boolean z = this.f9290p;
        VImage vImage = this.f9297w;
        if (z) {
            vImage.setImageResource(c3c0.Q6);
            this.f9298x.setText("微信支付");
            return;
        }
        vImage.setImageResource(c3c0.P6);
        if (!CoreModule.l.a().U()) {
            this.f9298x.setText("支付宝");
        } else if (!CoreModule.c.O0.n3() || this.f9291q == PurchaseType.TYPE_O_DIAMOND) {
            this.f9298x.setText("支付宝");
        } else {
            this.f9298x.setText("支付宝免密支付");
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m9404Z(boolean z) {
        String str = TextUtils.equals(this.f9295u, "svip") ? "promotion_lowPriceCustomerSVIP" : "promotion_lowPriceCustomerVIP";
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            zvf0.A("e_vas_guide_assistant", "p_chat_view", new j760[]{vwb.Y("vas_guide_type", str)});
        } else {
            zvf0.u("e_vas_guide_assistant", "p_chat_view", new j760[]{vwb.Y("vas_guide_type", str)});
        }
    }

    @Override // p003l.ubq
    /* JADX INFO: renamed from: r */
    public void mo8132r() {
        super.mo8132r();
        if (NullChecker.a(this.f9289o)) {
            HashMap map = new HashMap();
            map.put("productType", this.f9289o.category);
            map.put("duration", Integer.valueOf(this.f9289o.quantity));
            if (!TextUtils.isEmpty(this.f9293s)) {
                map.put("couponid", this.f9293s);
            }
            zvf0.y("e_chat_purchase_banner", "p_chat_view", map);
        }
    }

    @Override // p003l.ubq
    /* JADX INFO: renamed from: x */
    public void mo8138x(Message message) {
        super.mo8138x(message);
        m9400V(message.msgData);
    }
}
