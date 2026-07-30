package p149l;

import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.DynamicSchemaMsgData;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.HashMap;
import org.json.JSONObject;
import p147v.VCheckBox;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class zbq extends ubq {

    /* JADX INFO: renamed from: n */
    public Act f202471n;

    /* JADX INFO: renamed from: o */
    public Merchandise f202472o;

    /* JADX INFO: renamed from: s */
    public String f202476s;

    /* JADX INFO: renamed from: u */
    public String f202478u;

    /* JADX INFO: renamed from: v */
    public RelativeLayout f202479v;

    /* JADX INFO: renamed from: w */
    public VImage f202480w;

    /* JADX INFO: renamed from: x */
    public VText f202481x;

    /* JADX INFO: renamed from: y */
    public VText f202482y;

    /* JADX INFO: renamed from: z */
    public VCheckBox f202483z;

    /* JADX INFO: renamed from: p */
    public boolean f202473p = false;

    /* JADX INFO: renamed from: q */
    public PurchaseType f202474q = PurchaseType.TYPE_GET_VIP;

    /* JADX INFO: renamed from: r */
    public PayMethod f202475r = PayMethod.get("alipay");

    /* JADX INFO: renamed from: t */
    public String f202477t = "";

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m217985I(Integer num) {
    }

    /* JADX INFO: renamed from: R */
    public static boolean m217989R(Message message) {
        if (TextUtils.isEmpty(message.msgData)) {
            return false;
        }
        return TEnum.equals(message.messageType(), MessageType.monetization_buy) || TEnum.equals(message.messageType(), MessageType.monetization_buy_v2);
    }

    @Override // p149l.ubq
    /* JADX INFO: renamed from: D */
    public void mo192915D(DynamicSchemaMsgData dynamicSchemaMsgData) {
        xdl0.m208329E0(this.f175737e, new View.OnClickListener() { // from class: l.xbq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f191959a.m217997U(view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public void m217990M(RelativeLayout relativeLayout, VImage vImage, VText vText, VText vText2, VCheckBox vCheckBox) {
        this.f202479v = relativeLayout;
        this.f202480w = vImage;
        this.f202481x = vText;
        this.f202482y = vText2;
        this.f202483z = vCheckBox;
        m217994Q();
    }

    /* JADX INFO: renamed from: N */
    public final boolean m217991N() {
        Merchandise merchandise = this.f202472o;
        if (merchandise == null) {
            return false;
        }
        if (merchandise.autoRenewable() && !this.f202483z.isChecked()) {
            return false;
        }
        if (CoreModule.m29935P().m94651a().mo33472bi(this.f202476s)) {
            if (this.f202472o.autoRenewable() && this.f202472o.monthType() && xma.m210047L3() && CoreModule.m29935P().m94651a().mo33460Zp()) {
                return false;
            }
        } else if (m217993P()) {
            return false;
        }
        return CoreModule.f17554l.m94656g().mo35046ae(this.f202472o, this.f202476s);
    }

    /* JADX INFO: renamed from: O */
    public final CharSequence m217992O(String str) {
        return (!CoreModule.f17545c.f19591O0.m30079n3() || this.f202474q == PurchaseType.TYPE_O_DIAMOND || this.f202473p) ? String.format("确认协议并支付%s元", str) : String.format("确认协议免密付%s元", str);
    }

    /* JADX INFO: renamed from: P */
    public final boolean m217993P() {
        if (xma.m210043F3()) {
            return true;
        }
        if (xma.m210047L3()) {
            return this.f202474q != PurchaseType.TYPE_O_DIAMOND;
        }
        return CoreModule.f17545c.f19639e0.m169520na().isVIP() && this.f202474q == PurchaseType.TYPE_GET_VIP;
    }

    /* JADX INFO: renamed from: Q */
    public final void m217994Q() {
        this.f202471n = (Act) xdl0.m208328E(this.f202479v);
        this.f202482y.setMovementMethod(LinkMovementMethod.getInstance());
        xdl0.m208329E0(this.f202479v, new View.OnClickListener() { // from class: l.vbq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180864a.m217996T(view);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m217995S(PayMethod payMethod) {
        this.f202475r = payMethod;
        this.f202473p = payMethod == PayMethod.get("wechat");
        m218001Y();
        if (TextUtils.isEmpty(this.f202477t)) {
            return;
        }
        this.f175737e.setText(m217992O(this.f202477t));
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m217996T(View view) {
        CoreModule.f17554l.m94656g().mo35002Cp(this.f202471n, this.f202474q, this.f202472o, this.f202475r, new e30() { // from class: l.wbq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185607a.m217995S((PayMethod) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m217997U(View view) {
        PurchaseType purchaseType;
        if (this.f202472o == null) {
            if ("odiamond".equalsIgnoreCase(this.f202478u)) {
                j2e0.m139446m(this.f202471n, Uri.parse("tantan://vip/diamond"));
                return;
            }
            if ("platinum".equalsIgnoreCase(this.f202478u)) {
                j2e0.m139446m(this.f202471n, Uri.parse("tantan://vip/platinum"));
                return;
            }
            if ("svip".equalsIgnoreCase(this.f202478u)) {
                j2e0.m139446m(this.f202471n, Uri.parse("tantan://vip/svip"));
                return;
            }
            boolean zEqualsIgnoreCase = "vip".equalsIgnoreCase(this.f202478u);
            Act act = this.f202471n;
            if (zEqualsIgnoreCase) {
                j2e0.m139446m(act, Uri.parse("tantan://vip/vip"));
                return;
            } else {
                j2e0.m139446m(act, Uri.parse("tantan://vip/vip"));
                return;
            }
        }
        if (m217991N()) {
            CoreModule.f17554l.m94656g().mo35030Sb(this.f202472o, this.f202475r, !TextUtils.isEmpty(this.f202477t), (!CoreModule.f17554l.m94651a().mo33425U() || this.f202473p || !CoreModule.f17545c.f19591O0.m30079n3() || (purchaseType = this.f202474q) == PurchaseType.TYPE_O_DIAMOND || purchaseType == PurchaseType.TYPE_O_PLATINUM) ? false : true, "p_chat,assistant_buybutton", OMSDialogPositon.p_chat_view);
        }
        HashMap map = new HashMap();
        map.put("platform", this.f202475r);
        map.put("productType", this.f202472o.category);
        map.put("purchaseShowFrom", "p_chat,assistant_buybutton");
        if (!TextUtils.isEmpty(this.f202476s)) {
            map.put("couponID", this.f202476s);
        }
        if (m217991N()) {
            m217999W();
            map.put("if_to_buy", Boolean.TRUE);
        } else {
            CoreModule.m29935P().m94651a().mo33569qd(this.f202471n, "p_privilege,assistant_guide", this.f202472o.category.name());
            map.put("if_to_buy", Boolean.FALSE);
        }
        zvf0.m220397s("e_purchase_button", OMSDialogPositon.p_chat_view, map);
        m218002Z(false);
    }

    /* JADX INFO: renamed from: V */
    public final void m217998V(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                DynamicSchemaMsgData dynamicSchemaMsgData = DynamicSchemaMsgData.JSON_ADAPTER.parse(str);
                if (NullChecker.m81303a(dynamicSchemaMsgData) && !TextUtils.isEmpty(dynamicSchemaMsgData.extra) && !TextUtils.equals("null", dynamicSchemaMsgData.extra)) {
                    JSONObject jSONObject = new JSONObject(dynamicSchemaMsgData.extra);
                    ProductCategory productCategory = ProductCategory.get(jSONObject.optString("payProduct", "unknown_"));
                    this.f202476s = jSONObject.optString("payCouponID", "");
                    jSONObject.optInt("payDuration", 0);
                    this.f202472o = CoreModule.f17554l.m94656g().mo35061fk(productCategory, this.f202476s);
                    double dOptDouble = jSONObject.optDouble("payAmount", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                    if (dOptDouble > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        this.f202477t = new DecimalFormat("#.#").format(dOptDouble / 100.0d);
                    }
                    this.f202478u = jSONObject.optString("payProduct");
                    m218002Z(true);
                }
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        if (!NullChecker.m81303a(this.f202472o)) {
            this.f175737e.setText("立即查看");
            xdl0.m208344M(this.f202482y, false);
            xdl0.m208344M(this.f202483z, false);
            xdl0.m208344M(this.f202479v, false);
            return;
        }
        this.f202474q = sab0.m182884b(this.f202472o.category);
        this.f202482y.setTextColor(Color.parseColor("#de000000"));
        this.f202482y.setAlpha(0.25f);
        boolean zMo33472bi = CoreModule.m29935P().m94651a().mo33472bi(this.f202476s);
        VText vText = this.f202482y;
        if (zMo33472bi) {
            vText.setText(CoreModule.m29935P().m94651a().mo33580rl(this.f202472o, Color.parseColor("#de000000")));
        } else {
            vText.setText(CoreModule.f17554l.m94656g().mo35063je("", this.f202471n, this.f202472o, this.f202474q, false));
        }
        xdl0.m208344M(this.f202483z, this.f202472o.autoRenewable());
        m218000X(this.f202472o);
        xdl0.m208344M(this.f202482y, true);
        this.f175737e.setText(TextUtils.isEmpty(this.f202477t) ? "立即查看" : m217992O(this.f202477t));
    }

    /* JADX INFO: renamed from: W */
    public final void m217999W() {
        CoreModule.f17554l.m94656g().mo35032To(this.f202474q, this.f202471n, "", this.f202472o.autoRenewable(), this.f202473p, this.f202472o.defaultStockKeepUnit.f20507id, this.f202476s, new e30() { // from class: l.ybq
            @Override // p149l.e30
            public final void call(Object obj) {
                zbq.m217985I((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public void m218000X(@NonNull Merchandise merchandise) {
        this.f202472o = merchandise;
        if (merchandise.category == ProductCategory.get("oDiamond")) {
            this.f202474q = PurchaseType.TYPE_O_DIAMOND;
        } else if (merchandise.category == ProductCategory.get("svip")) {
            this.f202474q = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        } else {
            this.f202474q = PurchaseType.TYPE_GET_VIP;
        }
        xdl0.m208344M(this.f202479v, true);
        m218001Y();
    }

    /* JADX INFO: renamed from: Y */
    public void m218001Y() {
        boolean z = this.f202473p;
        VImage vImage = this.f202480w;
        if (z) {
            vImage.setImageResource(c3c0.f78618Q6);
            this.f202481x.setText("微信支付");
            return;
        }
        vImage.setImageResource(c3c0.f78609P6);
        if (!CoreModule.f17554l.m94651a().mo33425U()) {
            this.f202481x.setText("支付宝");
        } else if (!CoreModule.f17545c.f19591O0.m30079n3() || this.f202474q == PurchaseType.TYPE_O_DIAMOND) {
            this.f202481x.setText("支付宝");
        } else {
            this.f202481x.setText("支付宝免密支付");
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m218002Z(boolean z) {
        String str = TextUtils.equals(this.f202478u, "svip") ? "promotion_lowPriceCustomerSVIP" : "promotion_lowPriceCustomerVIP";
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            zvf0.m220368A("e_vas_guide_assistant", OMSDialogPositon.p_chat_view, vwb.m200311Y("vas_guide_type", str));
        } else {
            zvf0.m220399u("e_vas_guide_assistant", OMSDialogPositon.p_chat_view, vwb.m200311Y("vas_guide_type", str));
        }
    }

    @Override // p149l.ubq
    /* JADX INFO: renamed from: r */
    public void mo192924r() {
        super.mo192924r();
        if (NullChecker.m81303a(this.f202472o)) {
            HashMap map = new HashMap();
            map.put("productType", this.f202472o.category);
            map.put(BLiveOperationTitleShowType.duration, Integer.valueOf(this.f202472o.quantity));
            if (!TextUtils.isEmpty(this.f202476s)) {
                map.put("couponid", this.f202476s);
            }
            zvf0.m220403y("e_chat_purchase_banner", OMSDialogPositon.p_chat_view, map);
        }
    }

    @Override // p149l.ubq
    /* JADX INFO: renamed from: x */
    public void mo192930x(Message message) {
        super.mo192930x(message);
        m217998V(message.msgData);
    }
}
