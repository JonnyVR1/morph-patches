package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.p070ui.webview.WebViewDialogAct;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/olj;", "", "<init>", "()V", "", "loginChannel", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Lcom/p1/mobile/android/app/Act;)V", "b", "()Ljava/lang/String;", "a", "(Lcom/p1/mobile/android/app/Act;)Ljava/lang/String;", "b_account_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class olj {

    @NotNull
    public static final olj INSTANCE = new olj();

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m168127e(olj oljVar, String str, Act act, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        oljVar.m168131d(str, act);
    }

    /* JADX INFO: renamed from: a */
    public final String m168128a(Act act) {
        return (act.getResources().getConfiguration().uiMode & 48) != 32 ? "" : "&darkMode=1";
    }

    /* JADX INFO: renamed from: b */
    public final String m168129b() {
        String str;
        String strLanguage = Network.language();
        strLanguage.getClass();
        if (C15493d.m94374J(strLanguage, Network.LANGUAGE_ZH_HANS, false, 2, null)) {
            str = "zho";
        } else if (C15493d.m94374J(strLanguage, Network.LANGUAGE_ZH_HANT, false, 2, null)) {
            str = "zho-tw";
        } else if (C15493d.m94374J(strLanguage, "ko", false, 2, null)) {
            str = "kor";
        } else if (C15493d.m94374J(strLanguage, "ja", false, 2, null)) {
            str = "jpn";
        } else if (C15493d.m94374J(strLanguage, "id", false, 2, null)) {
            str = "ind";
        } else {
            str = C15493d.m94374J(strLanguage, "ru", false, 2, null) ? "rus" : "eng";
        }
        return "&language=".concat(str);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: c */
    public final void m168130c(@Nullable Act act) {
        m168127e(this, null, act, 1, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: d */
    public final void m168131d(@NotNull String loginChannel, @Nullable Act act) {
        loginChannel.getClass();
        if (act == null) {
            return;
        }
        String str = "/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/new-pic-verify/index.html?hideNavigationBar=1&loginChannel=" + loginChannel + "&hideNotch=1" + m168129b() + m168128a(act) + "#/";
        act.startActivity(WebViewDialogAct.m81356n2(act, "", zwk.m221905e() ? "http://m.staging2.p1staff.com".concat(str) : "https://m.tantanapp.com".concat(str), true, true));
    }
}
