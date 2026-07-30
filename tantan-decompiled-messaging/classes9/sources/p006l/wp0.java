package p006l;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.IntlAnimalFacial;
import com.p1.mobile.putong.core.data.IntlMatchAnimalFacial;
import com.p1.mobile.putong.core.data.LikeMindedItemStatusData;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.ProfileExtensionBasic;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.dbcenter.parse.JsonParseHelper;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.vwb;
import l.w9j;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u0003J\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u0003J\r\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\tJ!\u0010%\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(R$\u0010/\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00100R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00100R\u001e\u00105\u001a\n\u0012\u0004\u0012\u00020#\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00104¨\u00066"}, d2 = {"Ll/wp0;", "", "<init>", "()V", "", "h", "()Ljava/lang/String;", "", "i", "()I", "Lcom/p1/mobile/android/app/Act;", "act", "", "k", "(Lcom/p1/mobile/android/app/Act;)V", "Lcom/p1/mobile/putong/data/Extensions;", "extensions", "", "j", "(Lcom/p1/mobile/putong/data/Extensions;)Z", "Lcom/p1/mobile/putong/core/data/LikeMindedItemStatusData;", "l", "(Lcom/p1/mobile/putong/data/Extensions;)Lcom/p1/mobile/putong/core/data/LikeMindedItemStatusData;", "m", "()Z", "", "todaySwipe", "n", "(Lcom/p1/mobile/android/app/Act;J)V", "d", "c", "b", "g", "Lcom/p1/mobile/putong/data/User;", "me", "Lcom/p1/mobile/putong/core/data/IntlAnimalFacial;", "facial", "f", "(Lcom/p1/mobile/putong/data/User;Lcom/p1/mobile/putong/core/data/IntlAnimalFacial;)Ljava/lang/String;", "e", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/data/IntlAnimalFacial;", "a", "Ljava/lang/Integer;", "getSwipeCount", "()Ljava/lang/Integer;", "setSwipeCount", "(Ljava/lang/Integer;)V", "swipeCount", "Ljava/lang/String;", "svgaUrl", "webUrl", "", "Ljava/util/List;", "animalFacials", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public static Boolean m26561a(int i) {
        return Boolean.valueOf(qib0.f19808f0 == i);
    }

    /* JADX INFO: renamed from: b */
    public final void m26562b() {
        swipeCount = null;
        svgaUrl = "";
        webUrl = "";
        animalFacials = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m26563c() {
        zvf0.r("e_intl_mkt_animal_entrance", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: d */
    public final void m26564d() {
        zvf0.x("e_intl_mkt_animal_entrance", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: e */
    public final IntlAnimalFacial m26565e(String facial) {
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
    public final String m26566f(User me, IntlAnimalFacial facial) {
        Extensions extensions;
        ProfileExtensionBasic profileExtensionBasic;
        if (me == null || (extensions = me.profile.extensions) == null || (profileExtensionBasic = extensions.basic) == null) {
            return "??%";
        }
        List list = profileExtensionBasic.facialFeature;
        list.getClass();
        if (list.isEmpty()) {
            return "??%";
        }
        String str = (String) list.get(0);
        if (TextUtils.isEmpty(str)) {
            return "??%";
        }
        List<IntlMatchAnimalFacial> list2 = facial.match;
        list2.getClass();
        for (IntlMatchAnimalFacial intlMatchAnimalFacial : list2) {
            if (Intrinsics.d(intlMatchAnimalFacial.type, str)) {
                String str2 = intlMatchAnimalFacial.value;
                str2.getClass();
                return str2;
            }
        }
        return "??%";
    }

    /* JADX INFO: renamed from: g */
    public final int m26567g() {
        try {
            String strF = RemoteConfig.x().F("intl_anim_facial_feature");
            strF.getClass();
            JSONObject jSONObject = new JSONObject(strF);
            if (!jSONObject.optBoolean("enable") || !vwb.m(JSON.parseArray(jSONObject.optString("mcc"), Integer.TYPE), new w9j() { // from class: l.vp0
                public final Object call(Object obj) {
                    return wp0.m26561a(((Integer) obj).intValue());
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
    public final String m26568h() {
        return svgaUrl;
    }

    /* JADX INFO: renamed from: i */
    public final int m26569i() {
        if (swipeCount == null) {
            swipeCount = Integer.valueOf(m26567g());
        }
        Integer num = swipeCount;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m26570j(@Nullable Extensions extensions) {
        ProfileExtensionBasic profileExtensionBasic;
        List list;
        return (extensions == null || (profileExtensionBasic = extensions.basic) == null || (list = profileExtensionBasic.facialFeature) == null || list.isEmpty() || TextUtils.isEmpty((CharSequence) list.get(0))) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public final void m26571k(@NotNull Act act) {
        act.getClass();
        j2e0.m17248m(act, Uri.parse("tantan://webview?url=" + webUrl).buildUpon().build());
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final LikeMindedItemStatusData m26572l(@Nullable Extensions extensions) {
        ProfileExtensionBasic profileExtensionBasic;
        List list;
        if (extensions == null || (profileExtensionBasic = extensions.basic) == null || (list = profileExtensionBasic.facialFeature) == null || list.isEmpty()) {
            return null;
        }
        wp0 wp0Var = INSTANCE;
        Object obj = list.get(0);
        obj.getClass();
        IntlAnimalFacial intlAnimalFacialM26565e = wp0Var.m26565e((String) obj);
        if (intlAnimalFacialM26565e == null) {
            return null;
        }
        LikeMindedItemStatusData likeMindedItemStatusData = new LikeMindedItemStatusData();
        likeMindedItemStatusData.icon = intlAnimalFacialM26565e.icon;
        likeMindedItemStatusData.title = intlAnimalFacialM26565e.facial;
        likeMindedItemStatusData.subTitle = wp0Var.m26566f(CoreModule.f1534c.f3628e0.m21490p9(), intlAnimalFacialM26565e);
        return likeMindedItemStatusData;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m26573m() {
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        return userM21490p9 != null && INSTANCE.m26570j(userM21490p9.profile.extensions);
    }

    /* JADX INFO: renamed from: n */
    public final void m26574n(@Nullable Act act, long todaySwipe) {
        if (act == null || m26569i() <= 0 || ((int) todaySwipe) != m26569i() || m26573m()) {
            return;
        }
        m26571k(act);
    }
}
