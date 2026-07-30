package p153l;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Captcha;
import com.p051p1.mobile.putong.data.CaptchaIdConfig;
import com.p051p1.mobile.putong.data.SliderData;
import com.p051p1.mobile.putong.data.SliderNetworkData;
import com.p051p1.mobile.putong.data.SliderVerifyData;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p070ui.webview.WebViewDialogAct;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONObject;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes10.dex */
public class esf0 {

    /* JADX INFO: renamed from: o */
    public static volatile esf0 f95593o;

    /* JADX INFO: renamed from: p */
    public static CaptchaIdConfig f95594p;

    /* JADX INFO: renamed from: a */
    public C22508b<String> f95595a = C22508b.m222767b();

    /* JADX INFO: renamed from: b */
    public C22508b<Captcha> f95596b = C22508b.m222767b();

    /* JADX INFO: renamed from: c */
    public String f95597c = "";

    /* JADX INFO: renamed from: d */
    public boolean f95598d = false;

    /* JADX INFO: renamed from: e */
    public boolean f95599e = false;

    /* JADX INFO: renamed from: f */
    public String f95600f = "";

    /* JADX INFO: renamed from: g */
    public wyd0 f95601g = new wyd0("user_account_get_back_data", "");

    /* JADX INFO: renamed from: h */
    public boolean f95602h = false;

    /* JADX INFO: renamed from: i */
    public C22508b<uxj0> f95603i = C22508b.m222767b();

    /* JADX INFO: renamed from: j */
    public C22508b<Boolean> f95604j = C22508b.m222767b();

    /* JADX INFO: renamed from: k */
    public C22508b<SliderVerifyData> f95605k = C22508b.m222767b();

    /* JADX INFO: renamed from: l */
    public String f95606l = "";

    /* JADX INFO: renamed from: m */
    public jxd0 f95607m = new jxd0("slider_from_h5_" + uqb0.f180397c0.userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: n */
    public vxd0 f95608n = new vxd0("slider_supplier_" + uqb0.f180397c0.userId(), 0);

    /* JADX INFO: renamed from: l.esf0$a */
    public class C16825a extends dyd0<SliderData> {
        public C16825a(String str, SliderData sliderData) {
            super(str, sliderData);
        }

        @Override // p153l.dyd0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean checkEquals(@NonNull SliderData sliderData, SliderData sliderData2) {
            return sliderData.equals(sliderData2);
        }

        @Override // p153l.dyd0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SliderData copyed(SliderData sliderData, @NonNull SliderData sliderData2) {
            return sliderData2.mo225055clone();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.hxd0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SliderData retrieveValue() {
            String string = pref().getString(this.f111993id, null);
            T t = this.defaultValue;
            return string == null ? (SliderData) t : SliderData.parse(string, (SliderData) t);
        }

        @Override // p153l.hxd0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(SliderData sliderData) {
            return pref().edit().putString(this.f111993id, sliderData.toJson());
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m122323a(SliderNetworkData sliderNetworkData) {
        m122324e().m122344v(sliderNetworkData.data);
        m122324e().m122348z().onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: e */
    public static esf0 m122324e() {
        if (f95593o == null) {
            synchronized (esf0.class) {
                try {
                    if (f95593o == null) {
                        f95593o = new esf0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f95593o;
    }

    /* JADX INFO: renamed from: h */
    public static CaptchaIdConfig m122325h(int i) {
        if (NullChecker.m82486a(f95594p) && m122324e().f95608n.get().intValue() == i) {
            return f95594p;
        }
        try {
            f95594p = CaptchaIdConfig.JSON_ADAPTER.parse(new JSONObject(RemoteConfig.m80481x().m80485F("captcha_verification_config")).get(String.valueOf(i == 0 ? 0 : 1)).toString());
            m122324e().f95608n.put(Integer.valueOf(i));
            return f95594p;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m122326l(int i) {
        if (i == 0) {
            return "wangyi";
        }
        return i == 1 ? "shumei" : "";
    }

    /* JADX INFO: renamed from: b */
    public void m122327b(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final SliderNetworkData sliderNetworkData = SliderNetworkData.JSON_ADAPTER.parse(str);
        if (NullChecker.m82486a(sliderNetworkData) && NullChecker.m82486a(sliderNetworkData.meta) && sliderNetworkData.meta.code == 400311) {
            l51.m152887G(new Runnable() { // from class: l.dsf0
                @Override // java.lang.Runnable
                public final void run() {
                    esf0.m122323a(sliderNetworkData);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m122328c() {
        return this.f95599e;
    }

    /* JADX INFO: renamed from: d */
    public String m122329d() {
        return this.f95606l;
    }

    /* JADX INFO: renamed from: f */
    public boolean m122330f() {
        return this.f95602h;
    }

    /* JADX INFO: renamed from: g */
    public boolean m122331g() {
        return this.f95598d;
    }

    /* JADX INFO: renamed from: i */
    public SliderData m122332i() {
        if (!uqb0.f180397c0.signedIn_()) {
            return null;
        }
        User userMe_ = uqb0.f180397c0.me_();
        if (!NullChecker.m82486a(userMe_)) {
            return null;
        }
        return m122338p("tantan_slider_data_" + userMe_.f56859id).get();
    }

    /* JADX INFO: renamed from: j */
    public String m122333j() {
        return this.f95600f;
    }

    /* JADX INFO: renamed from: k */
    public String m122334k() {
        SliderData sliderDataM122332i = m122332i();
        if (NullChecker.m82486a(sliderDataM122332i)) {
            return sliderDataM122332i.uuid;
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public String m122335m(String str, String str2, SliderData sliderData, String str3, boolean z) {
        if (!NullChecker.m82486a(sliderData)) {
            return "";
        }
        CaptchaIdConfig captchaIdConfigM122325h = m122325h(sliderData.supplier);
        if (!NullChecker.m82486a(captchaIdConfigM122325h) || TextUtils.isEmpty(captchaIdConfigM122325h.url)) {
            return "";
        }
        m122341s(str);
        StringBuilder sb = new StringBuilder();
        sb.append(captchaIdConfigM122325h.url);
        sb.append("?captchaId=");
        sb.append(captchaIdConfigM122325h.captchaId);
        sb.append("&publicUserId=");
        sb.append(str2);
        sb.append("&showClose=");
        sb.append(sliderData.allowClose != 0);
        sb.append("&showCloseBtnTime=");
        sb.append(sliderData.delayClose);
        sb.append("&autoCloseCount=");
        sb.append(sliderData.retryClose);
        sb.append("&lang=");
        sb.append(m122337o());
        sb.append("&supplier=");
        sb.append(sliderData.supplier);
        sb.append("&uuid=");
        sb.append(sliderData.uuid);
        String string = sb.toString();
        if (this.f95607m.get().booleanValue()) {
            string = string.concat("&captcha_page_type=H5");
            this.f95607m.put(Boolean.FALSE);
        }
        if (!TextUtils.isEmpty(str3)) {
            string = string + "&projectType=" + str3;
        }
        i4g0.m138495D("e_captcha_popup_popup", TextUtils.equals(str3, "chang_bind_new_phone") ? "p_bind_to_new_phone" : "p_captcha_popup", jyb.m147494Y("captcha_supplier", m122326l(sliderData.supplier)), jyb.m147494Y("captcha_popup_type", "slide"), jyb.m147494Y("captcha_result_code", "success"), jyb.m147494Y("captcha_popup_token", sliderData.uuid), jyb.m147494Y("captcha_page_type", z ? "H5" : "other"), jyb.m147494Y("captcha_popup_sence", str3));
        return string;
    }

    /* JADX INFO: renamed from: n */
    public boolean m122336n() {
        if (Act.globalLifeCycle_().isEmpty() || Act.globalLifeCycle_().values().isEmpty()) {
            return false;
        }
        ArrayList<Act.C4450r> next = Act.globalLifeCycle_().values().iterator().next();
        return !jyb.m147479J(next) && (next.get(next.size() - 1).f16062a.get() instanceof WebViewDialogAct);
    }

    /* JADX INFO: renamed from: o */
    public String m122337o() {
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.equals("zh", language)) {
            return cxv.m113071c() ? "zhCN" : "zh";
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
    public final dyd0<SliderData> m122338p(String str) {
        return new C16825a(str, null);
    }

    /* JADX INFO: renamed from: q */
    public void m122339q(boolean z) {
        this.f95599e = z;
    }

    /* JADX INFO: renamed from: r */
    public void m122340r(String str) {
        this.f95606l = str;
    }

    /* JADX INFO: renamed from: s */
    public void m122341s(String str) {
        this.f95597c = str;
    }

    /* JADX INFO: renamed from: t */
    public void m122342t(boolean z) {
        this.f95602h = z;
    }

    /* JADX INFO: renamed from: u */
    public void m122343u(boolean z) {
        this.f95598d = z;
    }

    /* JADX INFO: renamed from: v */
    public void m122344v(SliderData sliderData) {
        if (uqb0.f180397c0.signedIn_()) {
            User userMe_ = uqb0.f180397c0.me_();
            if (NullChecker.m82486a(userMe_)) {
                if (NullChecker.m82486a(sliderData)) {
                    m122338p("tantan_slider_data_" + userMe_.f56859id).put(sliderData);
                } else {
                    m122338p("tantan_slider_data_" + userMe_.f56859id).clear();
                }
            }
        }
        m122345w("");
    }

    /* JADX INFO: renamed from: w */
    public void m122345w(String str) {
        this.f95600f = str;
    }

    /* JADX INFO: renamed from: x */
    public C22508b<Boolean> m122346x() {
        return this.f95604j;
    }

    /* JADX INFO: renamed from: y */
    public boolean m122347y(String str) {
        return m122336n() && TextUtils.equals(str, this.f95597c);
    }

    /* JADX INFO: renamed from: z */
    public C22508b<uxj0> m122348z() {
        return this.f95603i;
    }
}
