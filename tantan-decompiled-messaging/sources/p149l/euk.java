package p149l;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.web.WebViewX;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.PurchasePaymentParam;
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

/* JADX INFO: loaded from: classes9.dex */
public class euk {

    /* JADX INFO: renamed from: l.euk$a */
    public static class C16682a implements ue50 {

        /* JADX INFO: renamed from: a */
        public WebViewX f93244a;

        /* JADX INFO: renamed from: b */
        public String f93245b;

        public C16682a(WebViewX webViewX, String str) {
            this.f93244a = webViewX;
            this.f93245b = str;
        }

        @Override // p149l.ue50
        /* JADX INFO: renamed from: a */
        public void mo30845a() {
            this.f93244a.loadUrl(String.format("javascript:paymentCallback(\"%s\",\"%s\")", this.f93245b, "failed"));
        }

        @Override // p149l.ue50
        /* JADX INFO: renamed from: c */
        public void mo30846c() {
            lsi0.m151593w(R$string.f18799ol);
            this.f93244a.loadUrl(String.format("javascript:paymentCallback(\"%s\",\"%s\")", this.f93245b, StateEvent.ProcessResult.SUCCEED));
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m118169a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("desede").generateSecret(new DESedeKeySpec(bArr));
        Cipher cipher = Cipher.getInstance("desede/CBC/PKCS5Padding");
        cipher.init(1, secretKeyGenerateSecret, new IvParameterSpec(bArr2));
        return cipher.doFinal(bArr3);
    }

    /* JADX INFO: renamed from: b */
    public static String m118170b() {
        String strValueOf = String.valueOf(qib0.f154693H.guessedCurrentServerTime());
        String strAccessToken = CoreModule.m29931H().accessToken();
        String string = UUID.randomUUID().toString();
        return "MAC " + JsonAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(vwb.m200324f0(Constants.VIA_REPORT_TYPE_SET_AVATAR, "inappWeb1.0.0", strValueOf, strAccessToken, string, m118171c(strAccessToken, strValueOf, string)));
    }

    /* JADX INFO: renamed from: c */
    public static String m118171c(String str, String str2, String str3) {
        String str4 = str + "." + str2 + "." + str3;
        try {
            byte[] bytes = "@Vlp#^xI3Gv0i4*bm*DVONIl".getBytes();
            return ogw.m164282c(m118169a(bytes, Arrays.copyOfRange(bytes, 0, 8), str4.getBytes("UTF-8")));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m118172d(Act act, WebViewX webViewX, PayMethod payMethod, String str, String str2, String str3) {
        PurchasePaymentParam purchasePaymentParamM214467a = new yf60(null).m214474h(str2).m214475i(true).m214480n(str3).m214467a();
        purchasePaymentParamM214467a.setPurchaseTrackId(ogw.m164284e(CoreModule.m29931H().userId() + mqi0.m155944o()));
        sd60.m183467y(act, payMethod, null, new m6b0().m153189b(purchasePaymentParamM214467a).m153190c(new C16682a(webViewX, null)).m153188a());
    }

    /* JADX INFO: renamed from: e */
    public static void m118173e(Act act, WebViewX webViewX, String str, String str2, String str3, String str4) {
        zvf0.m220399u("e_purchase_button", "p_purchase_page", vwb.m200311Y("platform", str3), vwb.m200311Y("purchaseShowFrom", ""), vwb.m200311Y("productType", ""), vwb.m200311Y("skuID", str2), vwb.m200311Y(FirebaseAnalytics.Param.PRICE, ""));
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        if ("wechat".equals(str3)) {
            m118172d(act, webViewX, PayMethod.get("wechat"), str, str2, str4);
        } else if ("alipay".equals(str3)) {
            m118172d(act, webViewX, PayMethod.get("alipay"), str, str2, str4);
        }
    }
}
