package p009l;

import android.app.Application;
import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sina.weibo.sdk.constant.WBConstants;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import l.f16;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u0011J\u000f\u0010\u001b\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u0011J\u000f\u0010\u001d\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001d\u0010\u0019J\u000f\u0010\u001e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010\u001f\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001f\u0010\u0019R.\u0010\"\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00060 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!¨\u0006#"}, d2 = {"Ll/r11;", "", "<init>", "()V", "", "assetName", "", "p", "(Ljava/lang/String;)Ljava/util/Map;", "Landroid/content/Context;", "context", "o", "(Landroid/content/Context;Ljava/lang/String;)Ljava/util/Map;", "key", "c", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "a", "()Ljava/lang/String;", "d", "e", "b", "n", "f", "", "g", "()I", "h", "i", "j", "k", "l", "m", "", "Ljava/util/Map;", "configAssetCache", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class r11 {

    @NotNull
    public static final r11 INSTANCE = new r11();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, Map<String, String>> configAssetCache = new LinkedHashMap();

    /* JADX INFO: renamed from: l.r11$a */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"l/r11$a", "Lcom/google/gson/reflect/TypeToken;", "", "", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1162a extends TypeToken<Map<String, ? extends String>> {
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m21352a() {
        return INSTANCE.m21365c("config", "commit");
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m21353b() {
        return INSTANCE.m21365c("config", "flavor");
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m21354d() {
        return INSTANCE.m21365c("config", "mappingFolder");
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m21355e() {
        return INSTANCE.m21365c("config", "mappingName");
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m21356f() {
        return INSTANCE.m21365c("plugin_config_account", "commit");
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final int m21357g() {
        Integer intOrNull = StringsKt.toIntOrNull(INSTANCE.m21365c("plugin_config_account", WBConstants.AUTH_PARAMS_VERSION));
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m21358h() {
        return INSTANCE.m21365c("plugin_config_core", "commit");
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final int m21359i() {
        Integer intOrNull = StringsKt.toIntOrNull(INSTANCE.m21365c("plugin_config_core", WBConstants.AUTH_PARAMS_VERSION));
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: j */
    public static final String m21360j() {
        return INSTANCE.m21365c("plugin_config_feed", "commit");
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final int m21361k() {
        Integer intOrNull = StringsKt.toIntOrNull(INSTANCE.m21365c("plugin_config_feed", WBConstants.AUTH_PARAMS_VERSION));
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: l */
    public static final String m21362l() {
        return INSTANCE.m21365c("plugin_config_live", "commit");
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final int m21363m() {
        Integer intOrNull = StringsKt.toIntOrNull(INSTANCE.m21365c("plugin_config_live", WBConstants.AUTH_PARAMS_VERSION));
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final String m21364n() {
        return INSTANCE.m21365c("config", "pullId");
    }

    /* JADX INFO: renamed from: c */
    public final String m21365c(String assetName, String key) {
        String str = m21367p(assetName).get(key);
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: o */
    public final Map<String, String> m21366o(Context context, String assetName) {
        Object obj;
        Map<String, Map<String, String>> map = configAssetCache;
        Map<String, String> map2 = map.get(assetName);
        if (map2 == null) {
            try {
                Result.Companion companion = Result.Companion;
                InputStream inputStreamOpen = context.getAssets().open("config/" + assetName + ".json");
                inputStreamOpen.getClass();
                obj = Result.constructor-impl((Map) new Gson().fromJson(TextStreamsKt.g(new InputStreamReader(inputStreamOpen, Charsets.UTF_8)), new C1162a().getType()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.a(th));
            }
            Map mapEmptyMap = MapsKt.emptyMap();
            if (Result.isFailure-impl(obj)) {
                obj = mapEmptyMap;
            }
            map2 = (Map) obj;
            map.put(assetName, map2);
        }
        return map2;
    }

    /* JADX INFO: renamed from: p */
    public final Map<String, String> m21367p(String assetName) {
        Application applicationA = f16.a();
        applicationA.getClass();
        return m21366o(applicationA, assetName);
    }
}
