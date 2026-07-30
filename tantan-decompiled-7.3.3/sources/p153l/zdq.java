package p153l;

import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.DynamicSchemaMsgData;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.HashMap;
import org.json.JSONObject;
import p151v.VCheckBox;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class zdq extends udq {

    /* JADX INFO: renamed from: n */
    public Act f203921n;

    /* JADX INFO: renamed from: o */
    public Merchandise f203922o;

    /* JADX INFO: renamed from: s */
    public String f203926s;

    /* JADX INFO: renamed from: u */
    public String f203928u;

    /* JADX INFO: renamed from: v */
    public RelativeLayout f203929v;

    /* JADX INFO: renamed from: w */
    public VImage f203930w;

    /* JADX INFO: renamed from: x */
    public VText f203931x;

    /* JADX INFO: renamed from: y */
    public VText f203932y;

    /* JADX INFO: renamed from: z */
    public VCheckBox f203933z;

    /* JADX INFO: renamed from: p */
    public boolean f203923p = false;

    /* JADX INFO: renamed from: q */
    public PurchaseType f203924q = PurchaseType.TYPE_GET_VIP;

    /* JADX INFO: renamed from: r */
    public PayMethod f203925r = PayMethod.get("alipay");

    /* JADX INFO: renamed from: t */
    public String f203927t = "";

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m219360I(Integer num) {
    }

    /* JADX INFO: renamed from: R */
    public static boolean m219364R(Message message) {
        if (TextUtils.isEmpty(message.msgData)) {
            return false;
        }
        return TEnum.equals(message.messageType(), MessageType.monetization_buy) || TEnum.equals(message.messageType(), MessageType.monetization_buy_v2);
    }

    @Override // p153l.udq
    /* JADX INFO: renamed from: D */
    public void mo195539D(DynamicSchemaMsgData dynamicSchemaMsgData) {
        bnl0.m105509E0(this.f178575e, new View.OnClickListener() { // from class: l.xdq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193619a.m219372U(view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public void m219365M(RelativeLayout relativeLayout, VImage vImage, VText vText, VText vText2, VCheckBox vCheckBox) {
        this.f203929v = relativeLayout;
        this.f203930w = vImage;
        this.f203931x = vText;
        this.f203932y = vText2;
        this.f203933z = vCheckBox;
        m219369Q();
    }

    /* JADX INFO: renamed from: N */
    public final boolean m219366N() {
        Merchandise merchandise = this.f203922o;
        if (merchandise == null) {
            return false;
        }
        if (merchandise.autoRenewable() && !this.f203933z.isChecked()) {
            return false;
        }
        if (CoreModule.m30933P().m143405a().mo34475bi(this.f203926s)) {
            if (this.f203922o.autoRenewable() && this.f203922o.monthType() && joa.m146361M3() && CoreModule.m30933P().m143405a().mo34463Zp()) {
                return false;
            }
        } else if (m219368P()) {
            return false;
        }
        return CoreModule.f18273l.m143410g().mo36049ae(this.f203922o, this.f203926s);
    }

    /* JADX INFO: renamed from: O */
    public final CharSequence m219367O(String str) {
        return (!CoreModule.f18264c.f20333O0.m31077n3() || this.f203924q == PurchaseType.TYPE_O_DIAMOND || this.f203923p) ? String.format("确认协议并支付%s元", str) : String.format("确认协议免密付%s元", str);
    }

    /* JADX INFO: renamed from: P */
    public final boolean m219368P() {
        if (joa.m146357G3()) {
            return true;
        }
        if (joa.m146361M3()) {
            return this.f203924q != PurchaseType.TYPE_O_DIAMOND;
        }
        return CoreModule.f18264c.f20381e0.m116593na().isVIP() && this.f203924q == PurchaseType.TYPE_GET_VIP;
    }

    /* JADX INFO: renamed from: Q */
    public final void m219369Q() {
        this.f203921n = (Act) bnl0.m105508E(this.f203929v);
        this.f203932y.setMovementMethod(LinkMovementMethod.getInstance());
        bnl0.m105509E0(this.f203929v, new View.OnClickListener() { // from class: l.vdq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183646a.m219371T(view);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m219370S(PayMethod payMethod) {
        this.f203925r = payMethod;
        this.f203923p = payMethod == PayMethod.get("wechat");
        m219376Y();
        if (TextUtils.isEmpty(this.f203927t)) {
            return;
        }
        this.f178575e.setText(m219367O(this.f203927t));
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m219371T(View view) {
        CoreModule.f18273l.m143410g().mo36005Cp(this.f203921n, this.f203924q, this.f203922o, this.f203925r, new y20() { // from class: l.wdq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188628a.m219370S((PayMethod) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m219372U(View view) {
        PurchaseType purchaseType;
        if (this.f203922o == null) {
            if ("odiamond".equalsIgnoreCase(this.f203928u)) {
                nae0.m162083m(this.f203921n, Uri.parse("tantan://vip/diamond"));
                return;
            }
            if ("platinum".equalsIgnoreCase(this.f203928u)) {
                nae0.m162083m(this.f203921n, Uri.parse("tantan://vip/platinum"));
                return;
            }
            if ("svip".equalsIgnoreCase(this.f203928u)) {
                nae0.m162083m(this.f203921n, Uri.parse("tantan://vip/svip"));
                return;
            }
            boolean zEqualsIgnoreCase = "vip".equalsIgnoreCase(this.f203928u);
            Act act = this.f203921n;
            if (zEqualsIgnoreCase) {
                nae0.m162083m(act, Uri.parse("tantan://vip/vip"));
                return;
            } else {
                nae0.m162083m(act, Uri.parse("tantan://vip/vip"));
                return;
            }
        }
        if (m219366N()) {
            CoreModule.f18273l.m143410g().mo36033Sb(this.f203922o, this.f203925r, !TextUtils.isEmpty(this.f203927t), (!CoreModule.f18273l.m143405a().mo34428U() || this.f203923p || !CoreModule.f18264c.f20333O0.m31077n3() || (purchaseType = this.f203924q) == PurchaseType.TYPE_O_DIAMOND || purchaseType == PurchaseType.TYPE_O_PLATINUM) ? false : true, "p_chat,assistant_buybutton", OMSDialogPositon.p_chat_view);
        }
        HashMap map = new HashMap();
        map.put("platform", this.f203925r);
        map.put("productType", this.f203922o.category);
        map.put("purchaseShowFrom", "p_chat,assistant_buybutton");
        if (!TextUtils.isEmpty(this.f203926s)) {
            map.put("couponID", this.f203926s);
        }
        if (m219366N()) {
            m219374W();
            map.put("if_to_buy", Boolean.TRUE);
        } else {
            CoreModule.m30933P().m143405a().mo34572qd(this.f203921n, "p_privilege,assistant_guide", this.f203922o.category.name());
            map.put("if_to_buy", Boolean.FALSE);
        }
        i4g0.m138521s("e_purchase_button", OMSDialogPositon.p_chat_view, map);
        m219377Z(false);
    }

    /* JADX INFO: renamed from: V */
    public final void m219373V(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                DynamicSchemaMsgData dynamicSchemaMsgData = DynamicSchemaMsgData.JSON_ADAPTER.parse(str);
                if (NullChecker.m82486a(dynamicSchemaMsgData) && !TextUtils.isEmpty(dynamicSchemaMsgData.extra) && !TextUtils.equals("null", dynamicSchemaMsgData.extra)) {
                    JSONObject jSONObject = new JSONObject(dynamicSchemaMsgData.extra);
                    ProductCategory productCategory = ProductCategory.get(jSONObject.optString("payProduct", "unknown_"));
                    this.f203926s = jSONObject.optString("payCouponID", "");
                    jSONObject.optInt("payDuration", 0);
                    this.f203922o = CoreModule.f18273l.m143410g().mo36064fk(productCategory, this.f203926s);
                    double dOptDouble = jSONObject.optDouble("payAmount", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                    if (dOptDouble > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        this.f203927t = new DecimalFormat("#.#").format(dOptDouble / 100.0d);
                    }
                    this.f203928u = jSONObject.optString("payProduct");
                    m219377Z(true);
                }
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        if (!NullChecker.m82486a(this.f203922o)) {
            this.f178575e.setText("立即查看");
            bnl0.m105524M(this.f203932y, false);
            bnl0.m105524M(this.f203933z, false);
            bnl0.m105524M(this.f203929v, false);
            return;
        }
        this.f203924q = wib0.m206558b(this.f203922o.category);
        this.f203932y.setTextColor(Color.parseColor("#de000000"));
        this.f203932y.setAlpha(0.25f);
        boolean zMo34475bi = CoreModule.m30933P().m143405a().mo34475bi(this.f203926s);
        VText vText = this.f203932y;
        if (zMo34475bi) {
            vText.setText(CoreModule.m30933P().m143405a().mo34583rl(this.f203922o, Color.parseColor("#de000000")));
        } else {
            vText.setText(CoreModule.f18273l.m143410g().mo36066je("", this.f203921n, this.f203922o, this.f203924q, false));
        }
        bnl0.m105524M(this.f203933z, this.f203922o.autoRenewable());
        m219375X(this.f203922o);
        bnl0.m105524M(this.f203932y, true);
        this.f178575e.setText(TextUtils.isEmpty(this.f203927t) ? "立即查看" : m219367O(this.f203927t));
    }

    /* JADX INFO: renamed from: W */
    public final void m219374W() {
        CoreModule.f18273l.m143410g().mo36035To(this.f203924q, this.f203921n, "", this.f203922o.autoRenewable(), this.f203923p, this.f203922o.defaultStockKeepUnit.f21249id, this.f203926s, new y20() { // from class: l.ydq
            @Override // p153l.y20
            public final void call(Object obj) {
                zdq.m219360I((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public void m219375X(@NonNull Merchandise merchandise) {
        this.f203922o = merchandise;
        if (merchandise.category == ProductCategory.get("oDiamond")) {
            this.f203924q = PurchaseType.TYPE_O_DIAMOND;
        } else if (merchandise.category == ProductCategory.get("svip")) {
            this.f203924q = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        } else {
            this.f203924q = PurchaseType.TYPE_GET_VIP;
        }
        bnl0.m105524M(this.f203929v, true);
        m219376Y();
    }

    /* JADX INFO: renamed from: Y */
    public void m219376Y() {
        boolean z = this.f203923p;
        VImage vImage = this.f203930w;
        if (z) {
            vImage.setImageResource(ibc0.f113893Q6);
            this.f203931x.setText("微信支付");
            return;
        }
        vImage.setImageResource(ibc0.f113884P6);
        if (!CoreModule.f18273l.m143405a().mo34428U()) {
            this.f203931x.setText("支付宝");
        } else if (!CoreModule.f18264c.f20333O0.m31077n3() || this.f203924q == PurchaseType.TYPE_O_DIAMOND) {
            this.f203931x.setText("支付宝");
        } else {
            this.f203931x.setText("支付宝免密支付");
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m219377Z(boolean z) {
        String str = TextUtils.equals(this.f203928u, "svip") ? "promotion_lowPriceCustomerSVIP" : "promotion_lowPriceCustomerVIP";
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            i4g0.m138492A("e_vas_guide_assistant", OMSDialogPositon.p_chat_view, jyb.m147494Y("vas_guide_type", str));
        } else {
            i4g0.m138523u("e_vas_guide_assistant", OMSDialogPositon.p_chat_view, jyb.m147494Y("vas_guide_type", str));
        }
    }

    @Override // p153l.udq
    /* JADX INFO: renamed from: r */
    public void mo195548r() {
        super.mo195548r();
        if (NullChecker.m82486a(this.f203922o)) {
            HashMap map = new HashMap();
            map.put("productType", this.f203922o.category);
            map.put(BLiveOperationTitleShowType.duration, Integer.valueOf(this.f203922o.quantity));
            if (!TextUtils.isEmpty(this.f203926s)) {
                map.put("couponid", this.f203926s);
            }
            i4g0.m138527y("e_chat_purchase_banner", OMSDialogPositon.p_chat_view, map);
        }
    }

    @Override // p153l.udq
    /* JADX INFO: renamed from: x */
    public void mo195554x(Message message) {
        super.mo195554x(message);
        m219373V(message.msgData);
    }
}
