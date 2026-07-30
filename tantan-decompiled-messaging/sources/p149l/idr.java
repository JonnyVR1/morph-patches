package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LikeMindedConfigData;
import com.p046p1.mobile.putong.core.data.LikeMindedItemData;
import com.p046p1.mobile.putong.core.data.LikeMindedItemLanguagesData;
import com.p046p1.mobile.putong.core.data.LikeMindedItemStatusData;
import com.p046p1.mobile.putong.core.data.LikeMindedMccConfigData;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010R\u001d\u0010\"\u001a\u0004\u0018\u00010\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\u000eR\u001b\u0010$\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b#\u0010\u0013¨\u0006%"}, m87232d2 = {"Ll/idr;", "", "<init>", "()V", "", "j", "()Z", "", "type", "Lcom/p1/mobile/putong/core/data/LikeMindedItemStatusData;", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/data/LikeMindedItemStatusData;", "Lcom/p1/mobile/putong/core/data/LikeMindedConfigData;", "c", "()Lcom/p1/mobile/putong/core/data/LikeMindedConfigData;", "e", "()Ljava/lang/String;", "", "g", "()I", RXScreenCaptureService.KEY_INDEX, "data", "k", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/data/LikeMindedConfigData;", "Ll/hpd0;", "a", "Ll/hpd0;", "isDebug", "b", "Ljava/lang/String;", "getTest", "test", "Lkotlin/Lazy;", "f", "likeMindedConfigData", "h", "swipeCount", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class idr {

    @NotNull
    public static final idr INSTANCE = new idr();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final hpd0 isDebug = new hpd0("like_minded_debug_" + CoreModule.m29931H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final String test = "{\"enable\":true,\"mcc\":{\"310\":{\"swipeCount\":2,\"items\":[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]},\"420\":{\"swipeCount\":4,\"items\":[\"1\",\"2\"]}},\"same\":{\"1\":{\"type\":\"\",\"multiLanguage\":{\"en-US\":{\"swipe\":{\"icon\":\"https://gitlab.p1staff.com/liuwenbo/image/raw/master/52.png\",\"title\":\"Taco Tuesday1\"},\"status\":{\"description\":\"I like you a latte\",\"subTitle\":\"Let's eat and Taco Bout It (like \\\"talk about it\\\")\",\"title\":\"Taco Tuesday1\",\"icon\":\"https://auto.tancdn.com/v1/raw/9b05f161-d8be-4675-ba09-de11f5baa3a510.png\"}}}},\"2\":{\"type\":\"\",\"multiLanguage\":{\"en-US\":{\"swipe\":{\"icon\":\"https://gitlab.p1staff.com/liuwenbo/image/raw/master/52.png\",\"title\":\"Taco Tuesday2\"},\"status\":{\"description\":\"I like you a latte\",\"subTitle\":\"Let's eat and Taco Bout It (like \\\"talk about it\\\")\",\"title\":\"Taco Tuesday2\",\"icon\":\"https://auto.tancdn.com/v1/raw/4b54ff2d-e684-4543-8816-49e495fbce0311.png\"}}}},\"3\":{\"type\":\"\",\"multiLanguage\":{\"en-US\":{\"swipe\":{\"icon\":\"https://gitlab.p1staff.com/liuwenbo/image/raw/master/52.png\",\"title\":\"Taco Tuesday3\"},\"status\":{\"description\":\"I like you a latte\",\"subTitle\":\"Let's eat and Taco Bout It (like \\\"talk about it\\\")\",\"title\":\"Taco Tuesday3\",\"icon\":\"https://auto.tancdn.com/v1/raw/9b05f161-d8be-4675-ba09-de11f5baa3a510.png\"}}}},\"4\":{\"type\":\"\",\"multiLanguage\":{\"en-US\":{\"swipe\":{\"icon\":\"https://gitlab.p1staff.com/liuwenbo/image/raw/master/52.png\",\"title\":\"Taco Tuesday4\"},\"status\":{\"description\":\"I like you a latte\",\"subTitle\":\"Let's eat and Taco Bout It (like \\\"talk about it\\\")\",\"title\":\"Taco Tuesday4\",\"icon\":\"https://auto.tancdn.com/v1/raw/701e86b8-0347-445a-9f29-387205c3b4c111.png\"}}}},\"5\":{\"type\":\"\",\"multiLanguage\":{\"en-US\":{\"swipe\":{\"icon\":\"https://gitlab.p1staff.com/liuwenbo/image/raw/master/52.png\",\"title\":\"Taco Tuesday5\"},\"status\":{\"description\":\"I like you a latte\",\"subTitle\":\"Let's eat and Taco Bout It (like \\\"talk about it\\\")\",\"title\":\"Taco Tuesday5\",\"icon\":\"https://auto.tancdn.com/v1/raw/124ee0b0-78a4-49e5-957e-8d08dfb0d7c010.png\"}}}},\"6\":{\"type\":\"\",\"multiLanguage\":{\"en-US\":{\"swipe\":{\"icon\":\"https://gitlab.p1staff.com/liuwenbo/image/raw/master/52.png\",\"title\":\"Taco Tuesday6\"},\"status\":{\"description\":\"I like you a latte\",\"subTitle\":\"Let's eat and Taco Bout It (like \\\"talk about it\\\")\",\"title\":\"Taco Tuesday6\",\"icon\":\"https://auto.tancdn.com/v1/raw/789e4fee-1fe8-4fdb-b558-995d33bec0ff11.png\"}}}},\"7\":{\"type\":\"\",\"multiLanguage\":{\"en-US\":{\"swipe\":{\"icon\":\"https://gitlab.p1staff.com/liuwenbo/image/raw/master/52.png\",\"title\":\"Taco Tuesday7\"},\"status\":{\"description\":\"I like you a latte\",\"subTitle\":\"Let's eat and Taco Bout It (like \\\"talk about it\\\")\",\"title\":\"Taco Tuesday7\",\"icon\":\"https://auto.tancdn.com/v1/raw/cefb2117-a1b2-49f8-8c3f-2315e4e4466510.png\"}}}},\"8\":{\"type\":\"\",\"multiLanguage\":{\"en-US\":{\"swipe\":{\"icon\":\"https://gitlab.p1staff.com/liuwenbo/image/raw/master/52.png\",\"title\":\"Taco Tuesday8\"},\"status\":{\"description\":\"I like you a latte\",\"subTitle\":\"Let's eat and Taco Bout It (like \\\"talk about it\\\")\",\"title\":\"Taco Tuesday8\",\"icon\":\"https://auto.tancdn.com/v1/raw/a49659b3-31c4-4225-9839-d96fa272d37311.png\"}}}}}}";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Lazy likeMindedConfigData = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.gdr
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return idr.m135617b();
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Lazy swipeCount = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.hdr
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(idr.m135616a());
        }
    });

    /* JADX INFO: renamed from: a */
    public static int m135616a() {
        return INSTANCE.m135622g();
    }

    /* JADX INFO: renamed from: b */
    public static LikeMindedConfigData m135617b() {
        return INSTANCE.m135624i();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final LikeMindedConfigData m135618c() {
        return m135626k(test);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final LikeMindedItemStatusData m135619d(@NotNull String type) {
        Map<String, LikeMindedItemLanguagesData> map;
        LikeMindedItemLanguagesData likeMindedItemLanguagesData;
        Map<String, LikeMindedItemLanguagesData> map2;
        LikeMindedItemLanguagesData likeMindedItemLanguagesData2;
        type.getClass();
        LikeMindedConfigData likeMindedConfigDataM135618c = m135625j() ? m135618c() : m135621f();
        if (likeMindedConfigDataM135618c != null) {
            if (likeMindedConfigDataM135618c.mcc.containsKey(String.valueOf(qib0.f154717f0)) && likeMindedConfigDataM135618c.mcc.get(String.valueOf(qib0.f154717f0)) != null) {
                LikeMindedItemData likeMindedItemData = likeMindedConfigDataM135618c.same.get(type);
                LikeMindedItemStatusData likeMindedItemStatusData = (likeMindedItemData == null || (map2 = likeMindedItemData.multiLanguage) == null || (likeMindedItemLanguagesData2 = map2.get(INSTANCE.m135620e())) == null) ? null : likeMindedItemLanguagesData2.status;
                if (likeMindedItemStatusData != null) {
                    return likeMindedItemStatusData;
                }
                LikeMindedItemData likeMindedItemData2 = likeMindedConfigDataM135618c.same.get(type);
                if (likeMindedItemData2 == null || (map = likeMindedItemData2.multiLanguage) == null || (likeMindedItemLanguagesData = map.get("en-US")) == null) {
                    return null;
                }
                return likeMindedItemLanguagesData.status;
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m135620e() {
        String language = Locale.getDefault().getLanguage();
        language.getClass();
        if (C15386d.m93483J(language, "zh", false, 2, null)) {
            return Intrinsics.m87488d(Locale.getDefault().getCountry(), "TW") ? "zh-TW" : "zh-CN";
        }
        if (C15386d.m93483J(language, "en", false, 2, null)) {
            return "en-US";
        }
        if (C15386d.m93483J(language, "ko", false, 2, null)) {
            return "ko-KR";
        }
        if (C15386d.m93483J(language, "ja", false, 2, null)) {
            return "ja-JP";
        }
        if (C15386d.m93483J(language, "in", false, 2, null)) {
            return "id-ID";
        }
        if (C15386d.m93483J(language, "th", false, 2, null)) {
            return "th-TH";
        }
        return C15386d.m93483J(language, "vi", false, 2, null) ? "vi-VN" : "en-US";
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final LikeMindedConfigData m135621f() {
        return (LikeMindedConfigData) likeMindedConfigData.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final int m135622g() {
        LikeMindedMccConfigData likeMindedMccConfigData;
        try {
            LikeMindedConfigData likeMindedConfigDataM135621f = m135621f();
            if (likeMindedConfigDataM135621f == null) {
                return -1;
            }
            String strValueOf = String.valueOf(qib0.f154717f0);
            if (!likeMindedConfigDataM135621f.mcc.containsKey(strValueOf) || (likeMindedMccConfigData = likeMindedConfigDataM135621f.mcc.get(strValueOf)) == null) {
                return -1;
            }
            return likeMindedMccConfigData.swipeCount;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m135623h() {
        return ((Number) swipeCount.getValue()).intValue();
    }

    /* JADX INFO: renamed from: i */
    public final LikeMindedConfigData m135624i() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("intl_same_config");
            strM79302F.getClass();
            return m135626k(strM79302F);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m135625j() {
        Boolean bool = isDebug.get();
        bool.getClass();
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public final LikeMindedConfigData m135626k(String data) throws IOException {
        LikeMindedConfigData likeMindedConfigData2 = LikeMindedConfigData.JSON_ADAPTER.parse(data);
        likeMindedConfigData2.getClass();
        return likeMindedConfigData2;
    }
}
