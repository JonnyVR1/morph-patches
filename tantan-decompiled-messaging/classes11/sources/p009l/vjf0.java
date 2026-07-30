package p009l;

import android.app.Activity;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.p004ui.webview.WebViewDialogAct;
import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Captcha;
import com.p1.mobile.putong.data.CaptchaIdConfig;
import com.p1.mobile.putong.data.SliderData;
import com.p1.mobile.putong.data.SliderNetworkData;
import com.p1.mobile.putong.data.SliderVerifyData;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import l.bqd0;
import l.e51;
import l.fpd0;
import l.hpd0;
import l.j760;
import l.qib0;
import l.roj0;
import l.tpd0;
import l.uqd0;
import l.vwb;
import l.zvf0;
import org.json.JSONObject;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class vjf0 {

    /* JADX INFO: renamed from: o */
    public static volatile vjf0 f21605o;

    /* JADX INFO: renamed from: p */
    public static CaptchaIdConfig f21606p;

    /* JADX INFO: renamed from: a */
    public b<String> f21607a = b.b();

    /* JADX INFO: renamed from: b */
    public b<Captcha> f21608b = b.b();

    /* JADX INFO: renamed from: c */
    public String f21609c = "";

    /* JADX INFO: renamed from: d */
    public boolean f21610d = false;

    /* JADX INFO: renamed from: e */
    public boolean f21611e = false;

    /* JADX INFO: renamed from: f */
    public String f21612f = "";

    /* JADX INFO: renamed from: g */
    public uqd0 f21613g = new uqd0("user_account_get_back_data", "");

    /* JADX INFO: renamed from: h */
    public boolean f21614h = false;

    /* JADX INFO: renamed from: i */
    public b<roj0> f21615i = b.b();

    /* JADX INFO: renamed from: j */
    public b<Boolean> f21616j = b.b();

    /* JADX INFO: renamed from: k */
    public b<SliderVerifyData> f21617k = b.b();

    /* JADX INFO: renamed from: l */
    public String f21618l = "";

    /* JADX INFO: renamed from: m */
    public hpd0 f21619m = new hpd0("slider_from_h5_" + qib0.c0.userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: n */
    public tpd0 f21620n = new tpd0("slider_supplier_" + qib0.c0.userId(), 0);

    /* JADX INFO: renamed from: l.vjf0$a */
    public class C1232a extends bqd0<SliderData> {
        public C1232a(String str, SliderData sliderData) {
            super(str, sliderData);
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean checkEquals(@NonNull SliderData sliderData, SliderData sliderData2) {
            return sliderData.equals(sliderData2);
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SliderData copyed(SliderData sliderData, @NonNull SliderData sliderData2) {
            return sliderData2.clone();
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SliderData retrieveValue() {
            String string = pref().getString(((fpd0) this).id, null);
            Object obj = ((fpd0) this).defaultValue;
            return string == null ? (SliderData) obj : SliderData.parse(string, (SliderData) obj);
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(SliderData sliderData) {
            return pref().edit().putString(((fpd0) this).id, sliderData.toJson());
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m23405a(SliderNetworkData sliderNetworkData) {
        m23406e().m23426v(sliderNetworkData.data);
        m23406e().m23430z().onNext(roj0.a);
    }

    /* JADX INFO: renamed from: e */
    public static vjf0 m23406e() {
        if (f21605o == null) {
            synchronized (vjf0.class) {
                try {
                    if (f21605o == null) {
                        f21605o = new vjf0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f21605o;
    }

    /* JADX INFO: renamed from: h */
    public static CaptchaIdConfig m23407h(int i) {
        if (NullChecker.a(f21606p) && ((Integer) m23406e().f21620n.get()).intValue() == i) {
            return f21606p;
        }
        try {
            f21606p = (CaptchaIdConfig) CaptchaIdConfig.JSON_ADAPTER.parse(new JSONObject(RemoteConfig.m9619x().m9623F("captcha_verification_config")).get(String.valueOf(i == 0 ? 0 : 1)).toString());
            m23406e().f21620n.put(Integer.valueOf(i));
            return f21606p;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m23408l(int i) {
        if (i == 0) {
            return "wangyi";
        }
        return i == 1 ? "shumei" : "";
    }

    /* JADX INFO: renamed from: b */
    public void m23409b(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final SliderNetworkData sliderNetworkData = (SliderNetworkData) SliderNetworkData.JSON_ADAPTER.parse(str);
        if (NullChecker.a(sliderNetworkData) && NullChecker.a(sliderNetworkData.meta) && sliderNetworkData.meta.code == 400311) {
            e51.G(new Runnable() { // from class: l.ujf0
                @Override // java.lang.Runnable
                public final void run() {
                    vjf0.m23405a(sliderNetworkData);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m23410c() {
        return this.f21611e;
    }

    /* JADX INFO: renamed from: d */
    public String m23411d() {
        return this.f21618l;
    }

    /* JADX INFO: renamed from: f */
    public boolean m23412f() {
        return this.f21614h;
    }

    /* JADX INFO: renamed from: g */
    public boolean m23413g() {
        return this.f21610d;
    }

    /* JADX INFO: renamed from: i */
    public SliderData m23414i() {
        if (!qib0.c0.signedIn_()) {
            return null;
        }
        User userMe_ = qib0.c0.me_();
        if (!NullChecker.a(userMe_)) {
            return null;
        }
        return (SliderData) m23420p("tantan_slider_data_" + ((DbObject) userMe_).id).get();
    }

    /* JADX INFO: renamed from: j */
    public String m23415j() {
        return this.f21612f;
    }

    /* JADX INFO: renamed from: k */
    public String m23416k() {
        SliderData sliderDataM23414i = m23414i();
        if (NullChecker.a(sliderDataM23414i)) {
            return sliderDataM23414i.uuid;
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public String m23417m(String str, String str2, SliderData sliderData, String str3, boolean z) {
        if (!NullChecker.a(sliderData)) {
            return "";
        }
        CaptchaIdConfig captchaIdConfigM23407h = m23407h(sliderData.supplier);
        if (!NullChecker.a(captchaIdConfigM23407h) || TextUtils.isEmpty(captchaIdConfigM23407h.url)) {
            return "";
        }
        m23423s(str);
        StringBuilder sb = new StringBuilder();
        sb.append(captchaIdConfigM23407h.url);
        sb.append("?captchaId=");
        sb.append(captchaIdConfigM23407h.captchaId);
        sb.append("&publicUserId=");
        sb.append(str2);
        sb.append("&showClose=");
        sb.append(sliderData.allowClose != 0);
        sb.append("&showCloseBtnTime=");
        sb.append(sliderData.delayClose);
        sb.append("&autoCloseCount=");
        sb.append(sliderData.retryClose);
        sb.append("&lang=");
        sb.append(m23419o());
        sb.append("&supplier=");
        sb.append(sliderData.supplier);
        sb.append("&uuid=");
        sb.append(sliderData.uuid);
        String string = sb.toString();
        if (((Boolean) this.f21619m.get()).booleanValue()) {
            string = string.concat("&captcha_page_type=H5");
            this.f21619m.put(Boolean.FALSE);
        }
        if (!TextUtils.isEmpty(str3)) {
            string = string + "&projectType=" + str3;
        }
        zvf0.D("e_captcha_popup_popup", TextUtils.equals(str3, "chang_bind_new_phone") ? "p_bind_to_new_phone" : "p_captcha_popup", new j760[]{vwb.Y("captcha_supplier", m23408l(sliderData.supplier)), vwb.Y("captcha_popup_type", "slide"), vwb.Y("captcha_result_code", "success"), vwb.Y("captcha_popup_token", sliderData.uuid), vwb.Y("captcha_page_type", z ? "H5" : "other"), vwb.Y("captcha_popup_sence", str3)});
        return string;
    }

    /* JADX INFO: renamed from: n */
    public boolean m23418n() {
        if (Act.globalLifeCycle_().isEmpty() || Act.globalLifeCycle_().values().isEmpty()) {
            return false;
        }
        List list = (List) Act.globalLifeCycle_().values().iterator().next();
        return !vwb.J(list) && (((Activity) ((Act.r) list.get(list.size() - 1)).a.get()) instanceof WebViewDialogAct);
    }

    /* JADX INFO: renamed from: o */
    public String m23419o() {
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.equals("zh", language)) {
            return bvv.m12300c() ? "zhCN" : "zh";
        }
        if (TextUtils.equals("ja", language)) {
            return "ja";
        }
        if (TextUtils.equals("in", language)) {
            return "in";
        }
        if (TextUtils.equals("ko", language)) {
            return "ko";
        }
        return TextUtils.equals("th", language) ? "th" : "en";
    }

    /* JADX INFO: renamed from: p */
    public final bqd0<SliderData> m23420p(String str) {
        return new C1232a(str, null);
    }

    /* JADX INFO: renamed from: q */
    public void m23421q(boolean z) {
        this.f21611e = z;
    }

    /* JADX INFO: renamed from: r */
    public void m23422r(String str) {
        this.f21618l = str;
    }

    /* JADX INFO: renamed from: s */
    public void m23423s(String str) {
        this.f21609c = str;
    }

    /* JADX INFO: renamed from: t */
    public void m23424t(boolean z) {
        this.f21614h = z;
    }

    /* JADX INFO: renamed from: u */
    public void m23425u(boolean z) {
        this.f21610d = z;
    }

    /* JADX INFO: renamed from: v */
    public void m23426v(SliderData sliderData) {
        if (qib0.c0.signedIn_()) {
            User userMe_ = qib0.c0.me_();
            if (NullChecker.a(userMe_)) {
                if (NullChecker.a(sliderData)) {
                    m23420p("tantan_slider_data_" + ((DbObject) userMe_).id).put(sliderData);
                } else {
                    m23420p("tantan_slider_data_" + ((DbObject) userMe_).id).clear();
                }
            }
        }
        m23427w("");
    }

    /* JADX INFO: renamed from: w */
    public void m23427w(String str) {
        this.f21612f = str;
    }

    /* JADX INFO: renamed from: x */
    public b<Boolean> m23428x() {
        return this.f21616j;
    }

    /* JADX INFO: renamed from: y */
    public boolean m23429y(String str) {
        return m23418n() && TextUtils.equals(str, this.f21609c);
    }

    /* JADX INFO: renamed from: z */
    public b<roj0> m23430z() {
        return this.f21615i;
    }
}
