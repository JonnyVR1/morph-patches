package p153l;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.web.WebViewX;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.PurchasePaymentParam;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.connect.common.Constants;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.Arrays;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes12.dex */
public class uwk {

    /* JADX INFO: renamed from: l.uwk$a */
    public static class C20687a implements bn50 {

        /* JADX INFO: renamed from: a */
        public WebViewX f181304a;

        /* JADX INFO: renamed from: b */
        public String f181305b;

        public C20687a(WebViewX webViewX, String str) {
            this.f181304a = webViewX;
            this.f181305b = str;
        }

        @Override // p153l.bn50
        /* JADX INFO: renamed from: a */
        public void mo31848a() {
            this.f181304a.loadUrl(String.format("javascript:paymentCallback(\"%s\",\"%s\")", this.f181305b, "failed"));
        }

        @Override // p153l.bn50
        /* JADX INFO: renamed from: c */
        public void mo31849c() {
            o1j0.m165649w(R$string.f18617Kl);
            this.f181304a.loadUrl(String.format("javascript:paymentCallback(\"%s\",\"%s\")", this.f181305b, StateEvent.ProcessResult.SUCCEED));
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m198382a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("desede").generateSecret(new DESedeKeySpec(bArr));
        Cipher cipher = Cipher.getInstance("desede/CBC/PKCS5Padding");
        cipher.init(1, secretKeyGenerateSecret, new IvParameterSpec(bArr2));
        return cipher.doFinal(bArr3);
    }

    /* JADX INFO: renamed from: b */
    public static String m198383b() {
        String strValueOf = String.valueOf(uqb0.f180376H.guessedCurrentServerTime());
        String strAccessToken = CoreModule.m30929H().accessToken();
        String string = UUID.randomUUID().toString();
        return "MAC " + JsonAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(jyb.m147507f0(Constants.VIA_REPORT_TYPE_SET_AVATAR, "inappWeb1.0.0", strValueOf, strAccessToken, string, m198384c(strAccessToken, strValueOf, string)));
    }

    /* JADX INFO: renamed from: c */
    public static String m198384c(String str, String str2, String str3) {
        String str4 = str + "." + str2 + "." + str3;
        try {
            byte[] bytes = "@Vlp#^xI3Gv0i4*bm*DVONIl".getBytes();
            return niw.m163313c(m198382a(bytes, Arrays.copyOfRange(bytes, 0, 8), str4.getBytes("UTF-8")));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m198385d(Act act, WebViewX webViewX, PayMethod payMethod, String str, String str2, String str3) {
        PurchasePaymentParam purchasePaymentParamM117176a = new do60(null).m117183h(str2).m117184i(true).m117189n(str3).m117176a();
        purchasePaymentParamM117176a.setPurchaseTrackId(niw.m163315e(CoreModule.m30929H().userId() + pzi0.m174454o()));
        xl60.m211513y(act, payMethod, null, new qeb0().m176235b(purchasePaymentParamM117176a).m176236c(new C20687a(webViewX, null)).m176234a());
    }

    /* JADX INFO: renamed from: e */
    public static void m198386e(Act act, WebViewX webViewX, String str, String str2, String str3, String str4) {
        i4g0.m138523u("e_purchase_button", "p_purchase_page", jyb.m147494Y("platform", str3), jyb.m147494Y("purchaseShowFrom", ""), jyb.m147494Y("productType", ""), jyb.m147494Y("skuID", str2), jyb.m147494Y(FirebaseAnalytics.Param.PRICE, ""));
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        if ("wechat".equals(str3)) {
            m198385d(act, webViewX, PayMethod.get("wechat"), str, str2, str4);
        } else if ("alipay".equals(str3)) {
            m198385d(act, webViewX, PayMethod.get("alipay"), str, str2, str4);
        }
    }
}
