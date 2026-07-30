package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.app.web.WebViewX;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.PurchasePaymentParam;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Arrays;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;
import l.j760;
import l.lsi0;
import l.m6b0;
import l.mqi0;
import l.ogw;
import l.sd60;
import l.ue50;
import l.vwb;
import l.yf60;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class euk {

    /* JADX INFO: renamed from: l.euk$a */
    public static class C0691a implements ue50 {

        /* JADX INFO: renamed from: a */
        public WebViewX f11454a;

        /* JADX INFO: renamed from: b */
        public String f11455b;

        public C0691a(WebViewX webViewX, String str) {
            this.f11454a = webViewX;
            this.f11455b = str;
        }

        /* JADX INFO: renamed from: a */
        public void m14892a() {
            this.f11454a.loadUrl(String.format("javascript:paymentCallback(\"%s\",\"%s\")", this.f11455b, "failed"));
        }

        /* JADX INFO: renamed from: c */
        public void m14893c() {
            lsi0.w(R$string.f2788ol);
            this.f11454a.loadUrl(String.format("javascript:paymentCallback(\"%s\",\"%s\")", this.f11455b, "succeed"));
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m14887a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("desede").generateSecret(new DESedeKeySpec(bArr));
        Cipher cipher = Cipher.getInstance("desede/CBC/PKCS5Padding");
        cipher.init(1, secretKeyGenerateSecret, new IvParameterSpec(bArr2));
        return cipher.doFinal(bArr3);
    }

    /* JADX INFO: renamed from: b */
    public static String m14888b() {
        String strValueOf = String.valueOf(qib0.f19784H.guessedCurrentServerTime());
        String strAccessToken = CoreModule.m1850H().accessToken();
        String string = UUID.randomUUID().toString();
        return "MAC " + JsonAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(vwb.f0(new String[]{"12", "inappWeb1.0.0", strValueOf, strAccessToken, string, m14889c(strAccessToken, strValueOf, string)}));
    }

    /* JADX INFO: renamed from: c */
    public static String m14889c(String str, String str2, String str3) {
        String str4 = str + "." + str2 + "." + str3;
        try {
            byte[] bytes = "@Vlp#^xI3Gv0i4*bm*DVONIl".getBytes();
            return ogw.c(m14887a(bytes, Arrays.copyOfRange(bytes, 0, 8), str4.getBytes("UTF-8")));
        } catch (Exception e) {
            CrashHelper.c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m14890d(Act act, WebViewX webViewX, PayMethod payMethod, String str, String str2, String str3) {
        PurchasePaymentParam purchasePaymentParamA = new yf60((PurchaseType) null).h(str2).i(true).n(str3).a();
        purchasePaymentParamA.setPurchaseTrackId(ogw.e(CoreModule.m1850H().userId() + mqi0.o()));
        sd60.y(act, payMethod, (PurchaseType) null, new m6b0().b(purchasePaymentParamA).c(new C0691a(webViewX, null)).a());
    }

    /* JADX INFO: renamed from: e */
    public static void m14891e(Act act, WebViewX webViewX, String str, String str2, String str3, String str4) {
        zvf0.u("e_purchase_button", "p_purchase_page", new j760[]{vwb.Y("platform", str3), vwb.Y("purchaseShowFrom", ""), vwb.Y("productType", ""), vwb.Y("skuID", str2), vwb.Y("price", "")});
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        if ("wechat".equals(str3)) {
            m14890d(act, webViewX, PayMethod.get("wechat"), str, str2, str4);
        } else if ("alipay".equals(str3)) {
            m14890d(act, webViewX, PayMethod.get("alipay"), str, str2, str4);
        }
    }
}
