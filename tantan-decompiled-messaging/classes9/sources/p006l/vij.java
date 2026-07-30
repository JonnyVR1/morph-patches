package p006l;

import com.p000p1.mobile.putong.api.api.Network;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ui.webview.WebViewDialogAct;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.text.d;
import l.juk;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ll/vij;", "", "<init>", "()V", "", "loginChannel", "Lcom/p1/mobile/android/app/Act;", "act", "", "d", "(Ljava/lang/String;Lcom/p1/mobile/android/app/Act;)V", "b", "()Ljava/lang/String;", "a", "(Lcom/p1/mobile/android/app/Act;)Ljava/lang/String;", "b_account_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class vij {

    @NotNull
    public static final vij INSTANCE = new vij();

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m25820e(vij vijVar, String str, Act act, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        vijVar.m25824d(str, act);
    }

    /* JADX INFO: renamed from: a */
    public final String m25821a(Act act) {
        return (act.getResources().getConfiguration().uiMode & 48) != 32 ? "" : "&darkMode=1";
    }

    /* JADX INFO: renamed from: b */
    public final String m25822b() {
        String str;
        String strLanguage = Network.language();
        strLanguage.getClass();
        if (d.J(strLanguage, Network.LANGUAGE_ZH_HANS, false, 2, (Object) null)) {
            str = "zho";
        } else if (d.J(strLanguage, Network.LANGUAGE_ZH_HANT, false, 2, (Object) null)) {
            str = "zho-tw";
        } else if (d.J(strLanguage, "ko", false, 2, (Object) null)) {
            str = "kor";
        } else if (d.J(strLanguage, "ja", false, 2, (Object) null)) {
            str = "jpn";
        } else if (d.J(strLanguage, "id", false, 2, (Object) null)) {
            str = "ind";
        } else {
            str = d.J(strLanguage, "ru", false, 2, (Object) null) ? "rus" : "eng";
        }
        return "&language=".concat(str);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: c */
    public final void m25823c(@Nullable Act act) {
        m25820e(this, null, act, 1, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: d */
    public final void m25824d(@NotNull String loginChannel, @Nullable Act act) {
        loginChannel.getClass();
        if (act == null) {
            return;
        }
        String str = "/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/new-pic-verify/index.html?hideNavigationBar=1&loginChannel=" + loginChannel + "&hideNotch=1" + m25822b() + m25821a(act) + "#/";
        act.startActivity(WebViewDialogAct.m2(act, "", juk.e() ? "http://m.staging2.p1staff.com".concat(str) : "https://m.tantanapp.com".concat(str), true, true));
    }
}
