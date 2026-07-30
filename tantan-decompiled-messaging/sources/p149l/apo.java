package p149l;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.heytap.mcssdk.mode.CommandMessage;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, m87232d2 = {"Ll/apo;", "Ll/woo;", "<init>", "()V", "", "message", "Lorg/json/JSONObject;", "c", "(Ljava/lang/String;)Lorg/json/JSONObject;", "gameKey", "", "b", "(Ljava/lang/String;)Z", "", "postMessage", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "chargeFunc", "closeFunc", "Companion", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class apo implements woo {

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
    public static final boolean m98164a(@NotNull String str) {
        return INSTANCE.m98167a(str);
    }

    /* JADX INFO: renamed from: b */
    private final boolean m98165b(String gameKey) {
        fld0<bgv> fld0Var = fld0.f98151f;
        boolean zP = StringsKt.m93412P(((bgv) ypv.m215673l(fld0Var)).f75500A.toString(), gameKey, false, 2, null);
        boolean z = !zP;
        if (!zP) {
            StringBuilder sb = ((bgv) ypv.m215673l(fld0Var)).f75500A;
            sb.append(";;");
            sb.append(gameKey);
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    private final JSONObject m98166c(String message) {
        try {
            return new JSONObject(message);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // p149l.woo
    @JavascriptInterface
    public void postMessage(@NotNull String message) {
        message.getClass();
        if (TextUtils.isEmpty(message)) {
            return;
        }
        gkh0.m126627j("intl_cotopus_game", "postMessage: " + message);
        JSONObject jSONObjectM98166c = m98166c(message);
        if (jSONObjectM98166c == null) {
            return;
        }
        String strOptString = jSONObjectM98166c.optString("cid");
        strOptString.getClass();
        if (Intrinsics.m87488d(this.chargeFunc, strOptString)) {
            hgv.m130924b().mo123194O1();
            return;
        }
        if (!Intrinsics.m87488d("GAME_INIT_FINISH", strOptString)) {
            if (Intrinsics.m87488d(this.closeFunc, strOptString)) {
                hgv.m130924b().mo123198W();
                return;
            }
            return;
        }
        HashMap map = new HashMap();
        JSONObject jSONObjectOptJSONObject = jSONObjectM98166c.optJSONObject(CommandMessage.PARAMS);
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        String strOptString2 = jSONObjectOptJSONObject.optString("game_key");
        fld0<bgv> fld0Var = fld0.f98151f;
        boolean zM101737q = ((bgv) ypv.m215673l(fld0Var)).m101737q(strOptString2);
        if (zM101737q) {
            ((bgv) ypv.m215673l(fld0Var)).m101719G(strOptString2);
        }
        if (strOptString2 != null) {
            map.put("octopus_game_key", strOptString2);
            map.put("octopus_game_frist_load", String.valueOf(zM101737q));
            map.put("octopus_game_frist_load_inAppLife", String.valueOf(m98165b(strOptString2)));
            h5j0 h5j0Var = h5j0.INSTANCE;
            String strM165672d = ork.m165672d(map);
            strM165672d.getClass();
            h5j0Var.m129403b("octopus_game_loading", "load_game_end", strM165672d);
        }
    }

    /* JADX INFO: renamed from: l.apo$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Ll/apo$a;", "", "<init>", "()V", "", "url", "", "a", "(Ljava/lang/String;)Z", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final boolean m98167a(@NotNull String url) {
            url.getClass();
            if (!TextUtils.isEmpty(url)) {
                String strM195980x4 = ypv.m215672k().m195980x4();
                strM195980x4.getClass();
                if (C15386d.m93483J(url, strM195980x4, false, 2, null) || C15386d.m93483J(url, "https://testti.biubiubiuu.com", false, 2, null) || C15386d.m93483J(url, "https://ti.biubiubiuu.com", false, 2, null)) {
                    return true;
                }
            }
            return false;
        }

        public Companion() {
        }
    }
}
