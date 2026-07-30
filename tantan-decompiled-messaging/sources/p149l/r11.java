package p149l;

import android.app.Application;
import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.sina.weibo.sdk.constant.WBConstants;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p118io.TextStreamsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u0011J\u000f\u0010\u001b\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u0011J\u000f\u0010\u001d\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001d\u0010\u0019J\u000f\u0010\u001e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010\u001f\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001f\u0010\u0019R.\u0010\"\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00060 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!¨\u0006#"}, m87232d2 = {"Ll/r11;", "", "<init>", "()V", "", "assetName", "", "p", "(Ljava/lang/String;)Ljava/util/Map;", "Landroid/content/Context;", "context", "o", "(Landroid/content/Context;Ljava/lang/String;)Ljava/util/Map;", Constants.KEY_KEY, "c", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "a", "()Ljava/lang/String;", Constants.INAPP_DATA_TAG, "e", "b", "n", "f", "", "g", "()I", "h", RXScreenCaptureService.KEY_INDEX, "j", "k", BLiveStormDanmakuGiftResourceType.f44444l, "m", "", "Ljava/util/Map;", "configAssetCache", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class r11 {

    @NotNull
    public static final r11 INSTANCE = new r11();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, Map<String, String>> configAssetCache = new LinkedHashMap();

    /* JADX INFO: renamed from: l.r11$a */
    @Metadata(m87231d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001¨\u0006\u0004"}, m87232d2 = {"l/r11$a", "Lcom/google/gson/reflect/TypeToken;", "", "", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C19619a extends TypeToken<Map<String, ? extends String>> {
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m177417a() {
        return INSTANCE.m177430c(Constants.KEY_CONFIG, "commit");
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m177418b() {
        return INSTANCE.m177430c(Constants.KEY_CONFIG, "flavor");
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m177419d() {
        return INSTANCE.m177430c(Constants.KEY_CONFIG, "mappingFolder");
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m177420e() {
        return INSTANCE.m177430c(Constants.KEY_CONFIG, "mappingName");
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m177421f() {
        return INSTANCE.m177430c("plugin_config_account", "commit");
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final int m177422g() {
        Integer intOrNull = StringsKt.toIntOrNull(INSTANCE.m177430c("plugin_config_account", WBConstants.AUTH_PARAMS_VERSION));
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m177423h() {
        return INSTANCE.m177430c("plugin_config_core", "commit");
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final int m177424i() {
        Integer intOrNull = StringsKt.toIntOrNull(INSTANCE.m177430c("plugin_config_core", WBConstants.AUTH_PARAMS_VERSION));
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: j */
    public static final String m177425j() {
        return INSTANCE.m177430c("plugin_config_feed", "commit");
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final int m177426k() {
        Integer intOrNull = StringsKt.toIntOrNull(INSTANCE.m177430c("plugin_config_feed", WBConstants.AUTH_PARAMS_VERSION));
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: l */
    public static final String m177427l() {
        return INSTANCE.m177430c("plugin_config_live", "commit");
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final int m177428m() {
        Integer intOrNull = StringsKt.toIntOrNull(INSTANCE.m177430c("plugin_config_live", WBConstants.AUTH_PARAMS_VERSION));
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final String m177429n() {
        return INSTANCE.m177430c(Constants.KEY_CONFIG, "pullId");
    }

    /* JADX INFO: renamed from: c */
    public final String m177430c(String assetName, String key) {
        String str = m177432p(assetName).get(key);
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: o */
    public final Map<String, String> m177431o(Context context, String assetName) {
        Object objM223820constructorimpl;
        Map<String, Map<String, String>> map = configAssetCache;
        Map<String, String> map2 = map.get(assetName);
        if (map2 == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                InputStream inputStreamOpen = context.getAssets().open("config/" + assetName + ".json");
                inputStreamOpen.getClass();
                objM223820constructorimpl = Result.m223820constructorimpl((Map) new Gson().fromJson(TextStreamsKt.m87425g(new InputStreamReader(inputStreamOpen, Charsets.UTF_8)), new C19619a().getType()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM223820constructorimpl = Result.m223820constructorimpl(ResultKt.m87238a(th));
            }
            Map mapEmptyMap = MapsKt.emptyMap();
            if (Result.m223826isFailureimpl(objM223820constructorimpl)) {
                objM223820constructorimpl = mapEmptyMap;
            }
            map2 = (Map) objM223820constructorimpl;
            map.put(assetName, map2);
        }
        return map2;
    }

    /* JADX INFO: renamed from: p */
    public final Map<String, String> m177432p(String assetName) {
        Application applicationM119092a = f16.m119092a();
        applicationM119092a.getClass();
        return m177431o(applicationM119092a, assetName);
    }
}
