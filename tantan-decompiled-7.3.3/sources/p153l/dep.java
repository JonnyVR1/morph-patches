package p153l;

import android.app.Activity;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.clevertap.android.sdk.Constants;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.android.app.Act;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018¨\u0006\u001c"}, m88121d2 = {"Ll/dep;", "Ll/wqo;", "Ll/pjn;", "intlGameDialog", "<init>", "(Ll/pjn;)V", "", "message", "", "postMessage", "(Ljava/lang/String;)V", "Lorg/json/JSONObject;", "e", "(Ljava/lang/String;)Lorg/json/JSONObject;", "c", "gameKey", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Z", "a", "Ll/pjn;", "getIntlGameDialog", "()Ll/pjn;", "b", "Ljava/lang/String;", "chargeFunc", "closeFunc", "Companion", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class dep implements wqo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final pjn intlGameDialog;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String chargeFunc;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String closeFunc;

    public dep(@NotNull pjn pjnVar) {
        pjnVar.getClass();
        this.intlGameDialog = pjnVar;
        this.chargeFunc = "TO_CHARGE";
        this.closeFunc = "CLOSE_COCOS_VIEW";
    }

    /* JADX INFO: renamed from: a */
    public static void m115448a(String str, dep depVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        nsh0.m164608j("intl_cotopus_game", "postMessage: " + str);
        JSONObject jSONObjectM115452e = depVar.m115452e(str);
        if (jSONObjectM115452e == null) {
            return;
        }
        String strOptString = jSONObjectM115452e.optString("cid");
        strOptString.getClass();
        if (Intrinsics.m88377d(depVar.chargeFunc, strOptString)) {
            if (depVar.intlGameDialog.m172030s() instanceof Act) {
                wrv wrvVar = zrv.f205799a;
                Activity activityM172030s = depVar.intlGameDialog.m172030s();
                activityM172030s.getClass();
                wrvVar.m207691r0((Act) activityM172030s, "intl_game_frame");
                return;
            }
            return;
        }
        if (!Intrinsics.m88377d("GAME_INIT_FINISH", strOptString)) {
            if (Intrinsics.m88377d(depVar.closeFunc, strOptString)) {
                ynp0.m216937n(depVar.intlGameDialog);
                return;
            }
            return;
        }
        HashMap map = new HashMap();
        JSONObject jSONObjectOptJSONObject = jSONObjectM115452e.optJSONObject(CommandMessage.PARAMS);
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
            map.put("octopus_game_frist_load_inAppLife", String.valueOf(depVar.m115451d(strOptString2)));
            lej0 lej0Var = lej0.INSTANCE;
            String strM122578d = euk.m122578d(map);
            strM122578d.getClass();
            lej0Var.m153908b("octopus_game_loading", "load_game_end", strM122578d);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m115449b(@NotNull String str) {
        return INSTANCE.m115453a(str);
    }

    /* JADX INFO: renamed from: c */
    public final void m115450c(final String message) {
        l51.m152893M(new Runnable() { // from class: l.cep
            @Override // java.lang.Runnable
            public final void run() {
                dep.m115448a(message, this);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final boolean m115451d(String gameKey) {
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

    /* JADX INFO: renamed from: e */
    public final JSONObject m115452e(String message) {
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
        m115450c(message);
    }

    /* JADX INFO: renamed from: l.dep$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/dep$a;", "", "<init>", "()V", "", "url", "", "a", "(Ljava/lang/String;)Z", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final boolean m115453a(@NotNull String url) {
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
