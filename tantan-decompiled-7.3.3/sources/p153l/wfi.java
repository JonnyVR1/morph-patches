package p153l;

import com.clevertap.android.sdk.Constants;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u0012\u0012\b\u0002\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001b\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R!\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R!\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010$¨\u0006+"}, m88121d2 = {"Ll/wfi;", "", "", "clientVersion", "channel", "Lkotlin/Function0;", "userIDProvider", "areaProvider", "", "longitudeProvider", "latitudeProvider", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Pair;", "", "e", "()Lkotlin/Pair;", "", "map", "", "a", "(Ljava/util/Map;)V", "Z", Constants.INAPP_DATA_TAG, "()Z", "setUseOldApiParam", "(Z)V", "useOldApiParam", "b", "Ljava/lang/String;", "getClient", "()Ljava/lang/String;", "client", "c", "Lkotlin/jvm/functions/Function0;", "getUserIDProvider", "()Lkotlin/jvm/functions/Function0;", "f", "getAreaProvider", "g", "getLongitudeProvider", "h", "getLatitudeProvider", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class wfi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean useOldApiParam;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String client;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String clientVersion;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String channel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Function0<String> userIDProvider;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Function0<String> areaProvider;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private final Function0<Double> longitudeProvider;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private final Function0<Double> latitudeProvider;

    public wfi(@NotNull String str, @NotNull String str2, @NotNull Function0<String> function0, @NotNull Function0<String> function1, @Nullable Function0<Double> function2, @Nullable Function0<Double> function3) {
        str.getClass();
        str2.getClass();
        function0.getClass();
        function1.getClass();
        this.clientVersion = str;
        this.channel = str2;
        this.userIDProvider = function0;
        this.areaProvider = function1;
        this.longitudeProvider = function2;
        this.latitudeProvider = function3;
        this.client = "android";
    }

    /* JADX INFO: renamed from: a */
    public final void m206126a(@NotNull Map<String, String> map) {
        String strValueOf;
        Double dInvoke;
        String strValueOf2;
        Double dInvoke2;
        map.getClass();
        map.put("extChannel", this.channel);
        String strInvoke = this.areaProvider.invoke();
        String str = "";
        if (strInvoke == null) {
            strInvoke = "";
        }
        map.put("area", strInvoke);
        map.put("client", this.client);
        String strInvoke2 = this.userIDProvider.invoke();
        if (strInvoke2 == null) {
            strInvoke2 = "";
        }
        map.put(Oauth2AccessToken.KEY_UID, strInvoke2);
        map.put("clientVersion", this.clientVersion);
        Function0<Double> function0 = this.longitudeProvider;
        if (function0 == null || (dInvoke2 = function0.invoke()) == null || (strValueOf = String.valueOf(dInvoke2.doubleValue())) == null) {
            strValueOf = "";
        }
        map.put("lng", strValueOf);
        Function0<Double> function1 = this.latitudeProvider;
        if (function1 != null && (dInvoke = function1.invoke()) != null && (strValueOf2 = String.valueOf(dInvoke.doubleValue())) != null) {
            str = strValueOf2;
        }
        map.put("lat", str);
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getClientVersion() {
        return this.clientVersion;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getUseOldApiParam() {
        return this.useOldApiParam;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Pair<Boolean, String> m206130e() {
        String str;
        if (StringsKt.m94329e0(this.clientVersion)) {
            str = "clientVersion must input";
        } else {
            String str2 = this.clientVersion;
            for (int i = 0; i < str2.length(); i++) {
                if (!Character.isDigit(str2.charAt(i))) {
                    str = "clientVersion must pure digit";
                }
            }
            str = StringsKt.m94329e0(this.channel) ? "channel must input" : "";
        }
        return new Pair<>(Boolean.valueOf(!StringsKt.m94329e0(str)), str);
    }
}
