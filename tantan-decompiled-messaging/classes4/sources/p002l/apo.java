package p002l;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import l.bgv;
import l.fld0;
import l.gkh0;
import l.h5j0;
import l.hgv;
import l.ork;
import l.woo;
import l.ypv;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, d2 = {"Ll/apo;", "Ll/woo;", "<init>", "()V", "", "message", "Lorg/json/JSONObject;", "c", "(Ljava/lang/String;)Lorg/json/JSONObject;", "gameKey", "", "b", "(Ljava/lang/String;)Z", "", "postMessage", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "chargeFunc", "closeFunc", "Companion", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public static final boolean m9994a(@NotNull String str) {
        return INSTANCE.m9997a(str);
    }

    /* JADX INFO: renamed from: b */
    private final boolean m9995b(String gameKey) {
        fld0 fld0Var = fld0.f;
        boolean zP = StringsKt.P(((bgv) ypv.l(fld0Var)).A.toString(), gameKey, false, 2, (Object) null);
        boolean z = !zP;
        if (!zP) {
            StringBuilder sb = ((bgv) ypv.l(fld0Var)).A;
            sb.append(";;");
            sb.append(gameKey);
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    private final JSONObject m9996c(String message) {
        try {
            return new JSONObject(message);
        } catch (JSONException unused) {
            return null;
        }
    }

    @JavascriptInterface
    public void postMessage(@NotNull String message) {
        message.getClass();
        if (TextUtils.isEmpty(message)) {
            return;
        }
        gkh0.j("intl_cotopus_game", "postMessage: " + message);
        JSONObject jSONObjectM9996c = m9996c(message);
        if (jSONObjectM9996c == null) {
            return;
        }
        String strOptString = jSONObjectM9996c.optString("cid");
        strOptString.getClass();
        if (Intrinsics.d(this.chargeFunc, strOptString)) {
            hgv.b().O1();
            return;
        }
        if (!Intrinsics.d("GAME_INIT_FINISH", strOptString)) {
            if (Intrinsics.d(this.closeFunc, strOptString)) {
                hgv.b().W();
                return;
            }
            return;
        }
        HashMap map = new HashMap();
        JSONObject jSONObjectOptJSONObject = jSONObjectM9996c.optJSONObject("params");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        String strOptString2 = jSONObjectOptJSONObject.optString("game_key");
        fld0 fld0Var = fld0.f;
        boolean zQ = ((bgv) ypv.l(fld0Var)).q(strOptString2);
        if (zQ) {
            ((bgv) ypv.l(fld0Var)).G(strOptString2);
        }
        if (strOptString2 != null) {
            map.put("octopus_game_key", strOptString2);
            map.put("octopus_game_frist_load", String.valueOf(zQ));
            map.put("octopus_game_frist_load_inAppLife", String.valueOf(m9995b(strOptString2)));
            h5j0 h5j0Var = h5j0.INSTANCE;
            String strD = ork.d(map);
            strD.getClass();
            h5j0Var.b("octopus_game_loading", "load_game_end", strD);
        }
    }

    /* JADX INFO: renamed from: l.apo$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll/apo$a;", "", "<init>", "()V", "", "url", "", "a", "(Ljava/lang/String;)Z", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final boolean m9997a(@NotNull String url) {
            url.getClass();
            if (!TextUtils.isEmpty(url)) {
                String strX4 = ypv.k().x4();
                strX4.getClass();
                if (d.J(url, strX4, false, 2, (Object) null) || d.J(url, "https://testti.biubiubiuu.com", false, 2, (Object) null) || d.J(url, "https://ti.biubiubiuu.com", false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        }

        public Companion() {
        }
    }
}
