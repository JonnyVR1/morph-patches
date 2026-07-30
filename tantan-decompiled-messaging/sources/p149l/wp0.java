package p149l;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.IntlAnimalFacial;
import com.p046p1.mobile.putong.core.data.IntlMatchAnimalFacial;
import com.p046p1.mobile.putong.core.data.LikeMindedItemStatusData;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.ProfileExtensionBasic;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.dbcenter.parse.JsonParseHelper;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u0003J\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u0003J\r\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\tJ!\u0010%\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(R$\u0010/\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00100R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00100R\u001e\u00105\u001a\n\u0012\u0004\u0012\u00020#\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00104¨\u00066"}, m87232d2 = {"Ll/wp0;", "", "<init>", "()V", "", "h", "()Ljava/lang/String;", "", RXScreenCaptureService.KEY_INDEX, "()I", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "k", "(Lcom/p1/mobile/android/app/Act;)V", "Lcom/p1/mobile/putong/data/Extensions;", Extensions.TYPE, "", "j", "(Lcom/p1/mobile/putong/data/Extensions;)Z", "Lcom/p1/mobile/putong/core/data/LikeMindedItemStatusData;", BLiveStormDanmakuGiftResourceType.f44444l, "(Lcom/p1/mobile/putong/data/Extensions;)Lcom/p1/mobile/putong/core/data/LikeMindedItemStatusData;", "m", "()Z", "", "todaySwipe", "n", "(Lcom/p1/mobile/android/app/Act;J)V", Constants.INAPP_DATA_TAG, "c", "b", "g", "Lcom/p1/mobile/putong/data/User;", "me", "Lcom/p1/mobile/putong/core/data/IntlAnimalFacial;", "facial", "f", "(Lcom/p1/mobile/putong/data/User;Lcom/p1/mobile/putong/core/data/IntlAnimalFacial;)Ljava/lang/String;", "e", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/data/IntlAnimalFacial;", "a", "Ljava/lang/Integer;", "getSwipeCount", "()Ljava/lang/Integer;", "setSwipeCount", "(Ljava/lang/Integer;)V", "swipeCount", "Ljava/lang/String;", "svgaUrl", "webUrl", "", "Ljava/util/List;", "animalFacials", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class wp0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static Integer swipeCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static List<IntlAnimalFacial> animalFacials;

    @NotNull
    public static final wp0 INSTANCE = new wp0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static String svgaUrl = "";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static String webUrl = "";

    /* JADX INFO: renamed from: a */
    public static Boolean m204879a(int i) {
        return Boolean.valueOf(qib0.f154717f0 == i);
    }

    /* JADX INFO: renamed from: b */
    public final void m204880b() {
        swipeCount = null;
        svgaUrl = "";
        webUrl = "";
        animalFacials = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m204881c() {
        zvf0.m220396r("e_intl_mkt_animal_entrance", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: d */
    public final void m204882d() {
        zvf0.m220402x("e_intl_mkt_animal_entrance", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: e */
    public final IntlAnimalFacial m204883e(String facial) {
        List<IntlAnimalFacial> list = animalFacials;
        if (list == null) {
            return null;
        }
        for (IntlAnimalFacial intlAnimalFacial : list) {
            if (TextUtils.equals(intlAnimalFacial.type, facial)) {
                return intlAnimalFacial;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final String m204884f(User me2, IntlAnimalFacial facial) {
        Extensions extensions;
        ProfileExtensionBasic profileExtensionBasic;
        if (me2 == null || (extensions = me2.profile.extensions) == null || (profileExtensionBasic = extensions.basic) == null) {
            return "??%";
        }
        List<String> list = profileExtensionBasic.facialFeature;
        list.getClass();
        if (list.isEmpty()) {
            return "??%";
        }
        String str = list.get(0);
        if (TextUtils.isEmpty(str)) {
            return "??%";
        }
        List<IntlMatchAnimalFacial> list2 = facial.match;
        list2.getClass();
        for (IntlMatchAnimalFacial intlMatchAnimalFacial : list2) {
            if (Intrinsics.m87488d(intlMatchAnimalFacial.type, str)) {
                String str2 = intlMatchAnimalFacial.value;
                str2.getClass();
                return str2;
            }
        }
        return "??%";
    }

    /* JADX INFO: renamed from: g */
    public final int m204885g() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("intl_anim_facial_feature");
            strM79302F.getClass();
            JSONObject jSONObject = new JSONObject(strM79302F);
            if (!jSONObject.optBoolean("enable") || !vwb.m200337m(JSON.parseArray(jSONObject.optString("mcc"), Integer.TYPE), new w9j() { // from class: l.vp0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return wp0.m204879a(((Integer) obj).intValue());
                }
            })) {
                return -1;
            }
            String strOptString = jSONObject.optString("svgaUrl");
            strOptString.getClass();
            svgaUrl = strOptString;
            String strOptString2 = jSONObject.optString("webUrl");
            strOptString2.getClass();
            webUrl = strOptString2;
            animalFacials = JsonParseHelper.parseList(jSONObject.optString("data"), IntlAnimalFacial.JSON_ADAPTER);
            return jSONObject.optInt("swipe_count");
        } catch (Exception unused) {
            return -1;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final String m204886h() {
        return svgaUrl;
    }

    /* JADX INFO: renamed from: i */
    public final int m204887i() {
        if (swipeCount == null) {
            swipeCount = Integer.valueOf(m204885g());
        }
        Integer num = swipeCount;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m204888j(@Nullable Extensions extensions) {
        ProfileExtensionBasic profileExtensionBasic;
        List<String> list;
        return (extensions == null || (profileExtensionBasic = extensions.basic) == null || (list = profileExtensionBasic.facialFeature) == null || list.isEmpty() || TextUtils.isEmpty(list.get(0))) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public final void m204889k(@NotNull Act act) {
        act.getClass();
        j2e0.m139446m(act, Uri.parse("tantan://webview?url=" + webUrl).buildUpon().build());
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final LikeMindedItemStatusData m204890l(@Nullable Extensions extensions) {
        ProfileExtensionBasic profileExtensionBasic;
        List<String> list;
        if (extensions == null || (profileExtensionBasic = extensions.basic) == null || (list = profileExtensionBasic.facialFeature) == null || list.isEmpty()) {
            return null;
        }
        wp0 wp0Var = INSTANCE;
        String str = list.get(0);
        str.getClass();
        IntlAnimalFacial intlAnimalFacialM204883e = wp0Var.m204883e(str);
        if (intlAnimalFacialM204883e == null) {
            return null;
        }
        LikeMindedItemStatusData likeMindedItemStatusData = new LikeMindedItemStatusData();
        likeMindedItemStatusData.icon = intlAnimalFacialM204883e.icon;
        likeMindedItemStatusData.title = intlAnimalFacialM204883e.facial;
        likeMindedItemStatusData.subTitle = wp0Var.m204884f(CoreModule.f17545c.f19639e0.m169527p9(), intlAnimalFacialM204883e);
        return likeMindedItemStatusData;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m204891m() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        return userM169527p9 != null && INSTANCE.m204888j(userM169527p9.profile.extensions);
    }

    /* JADX INFO: renamed from: n */
    public final void m204892n(@Nullable Act act, long todaySwipe) {
        if (act == null || m204887i() <= 0 || ((int) todaySwipe) != m204887i() || m204891m()) {
            return;
        }
        m204889k(act);
    }
}
