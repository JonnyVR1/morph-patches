package p149l;

import com.clevertap.android.sdk.Constants;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012$\b\u0002\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJr\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022$\b\u0002\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0013R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b \u0010!R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b(\u0010\u0013R3\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b\"\u0010*¨\u0006+"}, m87232d2 = {"Ll/ru5;", "", "", "app", WBConstants.AUTH_PARAMS_VERSION, "Lkotlin/Function0;", Oauth2AccessToken.KEY_UID, "Ll/oml;", "submitAlternative", "host", "Lkotlin/Function1;", "Ll/sx3;", "", "customParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ll/oml;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ll/oml;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll/ru5;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "h", "Lkotlin/jvm/functions/Function0;", "g", "()Lkotlin/jvm/functions/Function0;", Constants.INAPP_DATA_TAG, "Ll/oml;", "f", "()Ll/oml;", "setSubmitAlternative", "(Ll/oml;)V", "e", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final /* data */ class ru5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String app;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String version;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function0<String> uid;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private oml submitAlternative;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final String host;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private final Function1<sx3, Map<String, String>> customParams;

    /* JADX WARN: Multi-variable type inference failed */
    public ru5(@NotNull String str, @NotNull String str2, @NotNull Function0<String> function0, @Nullable oml omlVar, @Nullable String str3, @Nullable Function1<? super sx3, ? extends Map<String, String>> function1) {
        str.getClass();
        str2.getClass();
        function0.getClass();
        this.app = str;
        this.version = str2;
        this.uid = function0;
        this.submitAlternative = omlVar;
        this.host = str3;
        this.customParams = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ru5 m180850b(ru5 ru5Var, String str, String str2, Function0 function0, oml omlVar, String str3, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ru5Var.app;
        }
        if ((i & 2) != 0) {
            str2 = ru5Var.version;
        }
        if ((i & 4) != 0) {
            function0 = ru5Var.uid;
        }
        if ((i & 8) != 0) {
            omlVar = ru5Var.submitAlternative;
        }
        if ((i & 16) != 0) {
            str3 = ru5Var.host;
        }
        if ((i & 32) != 0) {
            function1 = ru5Var.customParams;
        }
        String str4 = str3;
        Function1 function2 = function1;
        return ru5Var.m180851a(str, str2, function0, omlVar, str4, function2);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ru5 m180851a(@NotNull String app, @NotNull String version, @NotNull Function0<String> uid, @Nullable oml submitAlternative, @Nullable String host, @Nullable Function1<? super sx3, ? extends Map<String, String>> customParams) {
        app.getClass();
        version.getClass();
        uid.getClass();
        return new ru5(app, version, uid, submitAlternative, host, customParams);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getApp() {
        return this.app;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Function1<sx3, Map<String, String>> m180853d() {
        return this.customParams;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ru5)) {
            return false;
        }
        ru5 ru5Var = (ru5) other;
        return Intrinsics.m87488d(this.app, ru5Var.app) && Intrinsics.m87488d(this.version, ru5Var.version) && Intrinsics.m87488d(this.uid, ru5Var.uid) && Intrinsics.m87488d(this.submitAlternative, ru5Var.submitAlternative) && Intrinsics.m87488d(this.host, ru5Var.host) && Intrinsics.m87488d(this.customParams, ru5Var.customParams);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final oml getSubmitAlternative() {
        return this.submitAlternative;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Function0<String> m180856g() {
        return this.uid;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.app;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.version;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Function0<String> function0 = this.uid;
        int iHashCode3 = (iHashCode2 + (function0 != null ? function0.hashCode() : 0)) * 31;
        oml omlVar = this.submitAlternative;
        int iHashCode4 = (iHashCode3 + (omlVar != null ? omlVar.hashCode() : 0)) * 31;
        String str3 = this.host;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Function1<sx3, Map<String, String>> function1 = this.customParams;
        return iHashCode5 + (function1 != null ? function1.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Config(app=" + this.app + ", version=" + this.version + ", uid=" + this.uid + ", submitAlternative=" + this.submitAlternative + ", host=" + this.host + ", customParams=" + this.customParams + ")";
    }
}
