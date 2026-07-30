package p149l;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Captcha;
import com.p046p1.mobile.putong.data.CaptchaIdConfig;
import com.p046p1.mobile.putong.data.SliderData;
import com.p046p1.mobile.putong.data.SliderNetworkData;
import com.p046p1.mobile.putong.data.SliderVerifyData;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p065ui.webview.WebViewDialogAct;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONObject;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes11.dex */
public class vjf0 {

    /* JADX INFO: renamed from: o */
    public static volatile vjf0 f181684o;

    /* JADX INFO: renamed from: p */
    public static CaptchaIdConfig f181685p;

    /* JADX INFO: renamed from: a */
    public C22393b<String> f181686a = C22393b.m221521b();

    /* JADX INFO: renamed from: b */
    public C22393b<Captcha> f181687b = C22393b.m221521b();

    /* JADX INFO: renamed from: c */
    public String f181688c = "";

    /* JADX INFO: renamed from: d */
    public boolean f181689d = false;

    /* JADX INFO: renamed from: e */
    public boolean f181690e = false;

    /* JADX INFO: renamed from: f */
    public String f181691f = "";

    /* JADX INFO: renamed from: g */
    public uqd0 f181692g = new uqd0("user_account_get_back_data", "");

    /* JADX INFO: renamed from: h */
    public boolean f181693h = false;

    /* JADX INFO: renamed from: i */
    public C22393b<roj0> f181694i = C22393b.m221521b();

    /* JADX INFO: renamed from: j */
    public C22393b<Boolean> f181695j = C22393b.m221521b();

    /* JADX INFO: renamed from: k */
    public C22393b<SliderVerifyData> f181696k = C22393b.m221521b();

    /* JADX INFO: renamed from: l */
    public String f181697l = "";

    /* JADX INFO: renamed from: m */
    public hpd0 f181698m = new hpd0("slider_from_h5_" + qib0.f154714c0.userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: n */
    public tpd0 f181699n = new tpd0("slider_supplier_" + qib0.f154714c0.userId(), 0);

    /* JADX INFO: renamed from: l.vjf0$a */
    public class C20650a extends bqd0<SliderData> {
        public C20650a(String str, SliderData sliderData) {
            super(str, sliderData);
        }

        @Override // p149l.bqd0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean checkEquals(@NonNull SliderData sliderData, SliderData sliderData2) {
            return sliderData.equals(sliderData2);
        }

        @Override // p149l.bqd0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SliderData copyed(SliderData sliderData, @NonNull SliderData sliderData2) {
            return sliderData2.mo223809clone();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.fpd0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SliderData retrieveValue() {
            String string = pref().getString(this.f98687id, null);
            T t = this.defaultValue;
            return string == null ? (SliderData) t : SliderData.parse(string, (SliderData) t);
        }

        @Override // p149l.fpd0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(SliderData sliderData) {
            return pref().edit().putString(this.f98687id, sliderData.toJson());
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m198622a(SliderNetworkData sliderNetworkData) {
        m198623e().m198643v(sliderNetworkData.data);
        m198623e().m198647z().onNext(roj0.f160388a);
    }

    /* JADX INFO: renamed from: e */
    public static vjf0 m198623e() {
        if (f181684o == null) {
            synchronized (vjf0.class) {
                try {
                    if (f181684o == null) {
                        f181684o = new vjf0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f181684o;
    }

    /* JADX INFO: renamed from: h */
    public static CaptchaIdConfig m198624h(int i) {
        if (NullChecker.m81303a(f181685p) && m198623e().f181699n.get().intValue() == i) {
            return f181685p;
        }
        try {
            f181685p = CaptchaIdConfig.JSON_ADAPTER.parse(new JSONObject(RemoteConfig.m79298x().m79302F("captcha_verification_config")).get(String.valueOf(i == 0 ? 0 : 1)).toString());
            m198623e().f181699n.put(Integer.valueOf(i));
            return f181685p;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m198625l(int i) {
        if (i == 0) {
            return "wangyi";
        }
        return i == 1 ? "shumei" : "";
    }

    /* JADX INFO: renamed from: b */
    public void m198626b(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final SliderNetworkData sliderNetworkData = SliderNetworkData.JSON_ADAPTER.parse(str);
        if (NullChecker.m81303a(sliderNetworkData) && NullChecker.m81303a(sliderNetworkData.meta) && sliderNetworkData.meta.code == 400311) {
            e51.m114742G(new Runnable() { // from class: l.ujf0
                @Override // java.lang.Runnable
                public final void run() {
                    vjf0.m198622a(sliderNetworkData);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m198627c() {
        return this.f181690e;
    }

    /* JADX INFO: renamed from: d */
    public String m198628d() {
        return this.f181697l;
    }

    /* JADX INFO: renamed from: f */
    public boolean m198629f() {
        return this.f181693h;
    }

    /* JADX INFO: renamed from: g */
    public boolean m198630g() {
        return this.f181689d;
    }

    /* JADX INFO: renamed from: i */
    public SliderData m198631i() {
        if (!qib0.f154714c0.signedIn_()) {
            return null;
        }
        User userMe_ = qib0.f154714c0.me_();
        if (!NullChecker.m81303a(userMe_)) {
            return null;
        }
        return m198637p("tantan_slider_data_" + userMe_.f56011id).get();
    }

    /* JADX INFO: renamed from: j */
    public String m198632j() {
        return this.f181691f;
    }

    /* JADX INFO: renamed from: k */
    public String m198633k() {
        SliderData sliderDataM198631i = m198631i();
        if (NullChecker.m81303a(sliderDataM198631i)) {
            return sliderDataM198631i.uuid;
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public String m198634m(String str, String str2, SliderData sliderData, String str3, boolean z) {
        if (!NullChecker.m81303a(sliderData)) {
            return "";
        }
        CaptchaIdConfig captchaIdConfigM198624h = m198624h(sliderData.supplier);
        if (!NullChecker.m81303a(captchaIdConfigM198624h) || TextUtils.isEmpty(captchaIdConfigM198624h.url)) {
            return "";
        }
        m198640s(str);
        StringBuilder sb = new StringBuilder();
        sb.append(captchaIdConfigM198624h.url);
        sb.append("?captchaId=");
        sb.append(captchaIdConfigM198624h.captchaId);
        sb.append("&publicUserId=");
        sb.append(str2);
        sb.append("&showClose=");
        sb.append(sliderData.allowClose != 0);
        sb.append("&showCloseBtnTime=");
        sb.append(sliderData.delayClose);
        sb.append("&autoCloseCount=");
        sb.append(sliderData.retryClose);
        sb.append("&lang=");
        sb.append(m198636o());
        sb.append("&supplier=");
        sb.append(sliderData.supplier);
        sb.append("&uuid=");
        sb.append(sliderData.uuid);
        String string = sb.toString();
        if (this.f181698m.get().booleanValue()) {
            string = string.concat("&captcha_page_type=H5");
            this.f181698m.put(Boolean.FALSE);
        }
        if (!TextUtils.isEmpty(str3)) {
            string = string + "&projectType=" + str3;
        }
        zvf0.m220371D("e_captcha_popup_popup", TextUtils.equals(str3, "chang_bind_new_phone") ? "p_bind_to_new_phone" : "p_captcha_popup", vwb.m200311Y("captcha_supplier", m198625l(sliderData.supplier)), vwb.m200311Y("captcha_popup_type", "slide"), vwb.m200311Y("captcha_result_code", "success"), vwb.m200311Y("captcha_popup_token", sliderData.uuid), vwb.m200311Y("captcha_page_type", z ? "H5" : "other"), vwb.m200311Y("captcha_popup_sence", str3));
        return string;
    }

    /* JADX INFO: renamed from: n */
    public boolean m198635n() {
        if (Act.globalLifeCycle_().isEmpty() || Act.globalLifeCycle_().values().isEmpty()) {
            return false;
        }
        ArrayList<Act.C4299r> next = Act.globalLifeCycle_().values().iterator().next();
        return !vwb.m200296J(next) && (next.get(next.size() - 1).f15343a.get() instanceof WebViewDialogAct);
    }

    /* JADX INFO: renamed from: o */
    public String m198636o() {
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.equals("zh", language)) {
            return bvv.m104080c() ? "zhCN" : "zh";
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
    public final bqd0<SliderData> m198637p(String str) {
        return new C20650a(str, null);
    }

    /* JADX INFO: renamed from: q */
    public void m198638q(boolean z) {
        this.f181690e = z;
    }

    /* JADX INFO: renamed from: r */
    public void m198639r(String str) {
        this.f181697l = str;
    }

    /* JADX INFO: renamed from: s */
    public void m198640s(String str) {
        this.f181688c = str;
    }

    /* JADX INFO: renamed from: t */
    public void m198641t(boolean z) {
        this.f181693h = z;
    }

    /* JADX INFO: renamed from: u */
    public void m198642u(boolean z) {
        this.f181689d = z;
    }

    /* JADX INFO: renamed from: v */
    public void m198643v(SliderData sliderData) {
        if (qib0.f154714c0.signedIn_()) {
            User userMe_ = qib0.f154714c0.me_();
            if (NullChecker.m81303a(userMe_)) {
                if (NullChecker.m81303a(sliderData)) {
                    m198637p("tantan_slider_data_" + userMe_.f56011id).put(sliderData);
                } else {
                    m198637p("tantan_slider_data_" + userMe_.f56011id).clear();
                }
            }
        }
        m198644w("");
    }

    /* JADX INFO: renamed from: w */
    public void m198644w(String str) {
        this.f181691f = str;
    }

    /* JADX INFO: renamed from: x */
    public C22393b<Boolean> m198645x() {
        return this.f181695j;
    }

    /* JADX INFO: renamed from: y */
    public boolean m198646y(String str) {
        return m198635n() && TextUtils.equals(str, this.f181688c);
    }

    /* JADX INFO: renamed from: z */
    public C22393b<roj0> m198647z() {
        return this.f181694i;
    }
}
