package p149l;

import android.app.Activity;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.clevertap.android.sdk.Constants;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p046p1.mobile.android.app.Act;
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

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018¨\u0006\u001c"}, m87232d2 = {"Ll/dcp;", "Ll/woo;", "Ll/phn;", "intlGameDialog", "<init>", "(Ll/phn;)V", "", "message", "", "postMessage", "(Ljava/lang/String;)V", "Lorg/json/JSONObject;", "e", "(Ljava/lang/String;)Lorg/json/JSONObject;", "c", "gameKey", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Z", "a", "Ll/phn;", "getIntlGameDialog", "()Ll/phn;", "b", "Ljava/lang/String;", "chargeFunc", "closeFunc", "Companion", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class dcp implements woo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final phn intlGameDialog;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String chargeFunc;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String closeFunc;

    public dcp(@NotNull phn phnVar) {
        phnVar.getClass();
        this.intlGameDialog = phnVar;
        this.chargeFunc = "TO_CHARGE";
        this.closeFunc = "CLOSE_COCOS_VIEW";
    }

    /* JADX INFO: renamed from: a */
    public static void m110865a(String str, dcp dcpVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        gkh0.m126627j("intl_cotopus_game", "postMessage: " + str);
        JSONObject jSONObjectM110869e = dcpVar.m110869e(str);
        if (jSONObjectM110869e == null) {
            return;
        }
        String strOptString = jSONObjectM110869e.optString("cid");
        strOptString.getClass();
        if (Intrinsics.m87488d(dcpVar.chargeFunc, strOptString)) {
            if (dcpVar.intlGameDialog.m148647s() instanceof Act) {
                vpv vpvVar = ypv.f199493a;
                Activity activityM148647s = dcpVar.intlGameDialog.m148647s();
                activityM148647s.getClass();
                vpvVar.m199369r0((Act) activityM148647s, "intl_game_frame");
                return;
            }
            return;
        }
        if (!Intrinsics.m87488d("GAME_INIT_FINISH", strOptString)) {
            if (Intrinsics.m87488d(dcpVar.closeFunc, strOptString)) {
                uep0.m193327n(dcpVar.intlGameDialog);
                return;
            }
            return;
        }
        HashMap map = new HashMap();
        JSONObject jSONObjectOptJSONObject = jSONObjectM110869e.optJSONObject(CommandMessage.PARAMS);
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
            map.put("octopus_game_frist_load_inAppLife", String.valueOf(dcpVar.m110868d(strOptString2)));
            h5j0 h5j0Var = h5j0.INSTANCE;
            String strM165672d = ork.m165672d(map);
            strM165672d.getClass();
            h5j0Var.m129403b("octopus_game_loading", "load_game_end", strM165672d);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m110866b(@NotNull String str) {
        return INSTANCE.m110870a(str);
    }

    /* JADX INFO: renamed from: c */
    public final void m110867c(final String message) {
        e51.m114748M(new Runnable() { // from class: l.ccp
            @Override // java.lang.Runnable
            public final void run() {
                dcp.m110865a(message, this);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final boolean m110868d(String gameKey) {
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

    /* JADX INFO: renamed from: e */
    public final JSONObject m110869e(String message) {
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
        m110867c(message);
    }

    /* JADX INFO: renamed from: l.dcp$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Ll/dcp$a;", "", "<init>", "()V", "", "url", "", "a", "(Ljava/lang/String;)Z", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final boolean m110870a(@NotNull String url) {
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
