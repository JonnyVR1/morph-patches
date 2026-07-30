package p153l;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.heytap.mcssdk.mode.CommandMessage;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, m88121d2 = {"Ll/aro;", "Ll/wqo;", "<init>", "()V", "", "message", "Lorg/json/JSONObject;", "c", "(Ljava/lang/String;)Lorg/json/JSONObject;", "gameKey", "", "b", "(Ljava/lang/String;)Z", "", "postMessage", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "chargeFunc", "closeFunc", "Companion", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class aro implements wqo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String chargeFunc = "TO_CHARGE";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String closeFunc = "CLOSE_COCOS_VIEW";

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m99761a(@NotNull String str) {
        return INSTANCE.m99764a(str);
    }

    /* JADX INFO: renamed from: b */
    private final boolean m99762b(String gameKey) {
        htd0<civ> htd0Var = htd0.f111524f;
        boolean zP = StringsKt.m94303P(((civ) zrv.m221194l(htd0Var)).f81993A.toString(), gameKey, false, 2, null);
        boolean z = !zP;
        if (!zP) {
            StringBuilder sb = ((civ) zrv.m221194l(htd0Var)).f81993A;
            sb.append(";;");
            sb.append(gameKey);
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    private final JSONObject m99763c(String message) {
        try {
            return new JSONObject(message);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // p153l.wqo
    @JavascriptInterface
    public void postMessage(@NotNull String message) {
        message.getClass();
        if (TextUtils.isEmpty(message)) {
            return;
        }
        nsh0.m164608j("intl_cotopus_game", "postMessage: " + message);
        JSONObject jSONObjectM99763c = m99763c(message);
        if (jSONObjectM99763c == null) {
            return;
        }
        String strOptString = jSONObjectM99763c.optString("cid");
        strOptString.getClass();
        if (Intrinsics.m88377d(this.chargeFunc, strOptString)) {
            iiv.m140145b().mo176778O1();
            return;
        }
        if (!Intrinsics.m88377d("GAME_INIT_FINISH", strOptString)) {
            if (Intrinsics.m88377d(this.closeFunc, strOptString)) {
                iiv.m140145b().mo176787W();
                return;
            }
            return;
        }
        HashMap map = new HashMap();
        JSONObject jSONObjectOptJSONObject = jSONObjectM99763c.optJSONObject(CommandMessage.PARAMS);
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        String strOptString2 = jSONObjectOptJSONObject.optString("game_key");
        htd0<civ> htd0Var = htd0.f111524f;
        boolean zM109973q = ((civ) zrv.m221194l(htd0Var)).m109973q(strOptString2);
        if (zM109973q) {
            ((civ) zrv.m221194l(htd0Var)).m109955G(strOptString2);
        }
        if (strOptString2 != null) {
            map.put("octopus_game_key", strOptString2);
            map.put("octopus_game_frist_load", String.valueOf(zM109973q));
            map.put("octopus_game_frist_load_inAppLife", String.valueOf(m99762b(strOptString2)));
            lej0 lej0Var = lej0.INSTANCE;
            String strM122578d = euk.m122578d(map);
            strM122578d.getClass();
            lej0Var.m153908b("octopus_game_loading", "load_game_end", strM122578d);
        }
    }

    /* JADX INFO: renamed from: l.aro$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/aro$a;", "", "<init>", "()V", "", "url", "", "a", "(Ljava/lang/String;)Z", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final boolean m99764a(@NotNull String url) {
            url.getClass();
            if (!TextUtils.isEmpty(url)) {
                String strM203767x4 = zrv.m221193k().m203767x4();
                strM203767x4.getClass();
                if (C15493d.m94374J(url, strM203767x4, false, 2, null) || C15493d.m94374J(url, "https://testti.biubiubiuu.com", false, 2, null) || C15493d.m94374J(url, "https://ti.biubiubiuu.com", false, 2, null)) {
                    return true;
                }
            }
            return false;
        }

        public Companion() {
        }
    }
}
