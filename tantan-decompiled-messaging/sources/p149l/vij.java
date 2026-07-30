package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.p065ui.webview.WebViewDialogAct;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/vij;", "", "<init>", "()V", "", "loginChannel", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Lcom/p1/mobile/android/app/Act;)V", "b", "()Ljava/lang/String;", "a", "(Lcom/p1/mobile/android/app/Act;)Ljava/lang/String;", "b_account_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class vij {

    @NotNull
    public static final vij INSTANCE = new vij();

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m198580e(vij vijVar, String str, Act act, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        vijVar.m198584d(str, act);
    }

    /* JADX INFO: renamed from: a */
    public final String m198581a(Act act) {
        return (act.getResources().getConfiguration().uiMode & 48) != 32 ? "" : "&darkMode=1";
    }

    /* JADX INFO: renamed from: b */
    public final String m198582b() {
        String str;
        String strLanguage = Network.language();
        strLanguage.getClass();
        if (C15386d.m93483J(strLanguage, Network.LANGUAGE_ZH_HANS, false, 2, null)) {
            str = "zho";
        } else if (C15386d.m93483J(strLanguage, Network.LANGUAGE_ZH_HANT, false, 2, null)) {
            str = "zho-tw";
        } else if (C15386d.m93483J(strLanguage, "ko", false, 2, null)) {
            str = "kor";
        } else if (C15386d.m93483J(strLanguage, "ja", false, 2, null)) {
            str = "jpn";
        } else if (C15386d.m93483J(strLanguage, "id", false, 2, null)) {
            str = "ind";
        } else {
            str = C15386d.m93483J(strLanguage, "ru", false, 2, null) ? "rus" : "eng";
        }
        return "&language=".concat(str);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: c */
    public final void m198583c(@Nullable Act act) {
        m198580e(this, null, act, 1, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: d */
    public final void m198584d(@NotNull String loginChannel, @Nullable Act act) {
        loginChannel.getClass();
        if (act == null) {
            return;
        }
        String str = "/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/new-pic-verify/index.html?hideNavigationBar=1&loginChannel=" + loginChannel + "&hideNotch=1" + m198582b() + m198581a(act) + "#/";
        act.startActivity(WebViewDialogAct.m80173m2(act, "", juk.m143323e() ? "http://m.staging2.p1staff.com".concat(str) : "https://m.tantanapp.com".concat(str), true, true));
    }
}
