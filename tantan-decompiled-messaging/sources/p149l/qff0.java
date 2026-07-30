package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LikeMindedEnvelope;
import com.p046p1.mobile.putong.core.data.LikeMindedRequestParams;
import com.p046p1.mobile.putong.core.data.Option;
import com.p046p1.mobile.putong.core.data.SimilarInterestsBaseData;
import com.p046p1.mobile.putong.core.data.SimilarInterestsConfigData;
import com.p046p1.mobile.putong.core.data.SimilarInterestsItemData;
import com.p046p1.mobile.putong.core.data.SimilarInterestsItemLanguagesData;
import com.p046p1.mobile.putong.core.data.SimilarInterestsItemSwipeData;
import com.p046p1.mobile.putong.core.data.SimilarInterestsMccConfigData;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\tJ\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u0003J\u0015\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010$J\u0011\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0007H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J)\u00102\u001a\u0014\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f002\u0006\u0010/\u001a\u00020\u0007H\u0002¢\u0006\u0004\b2\u00103R\u0014\u00106\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001d\u0010:\u001a\u0004\u0018\u00010%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010'R\u001b\u0010=\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010$¨\u0006>"}, m87232d2 = {"Ll/qff0;", "", "<init>", "()V", "Ll/hpd0;", "m", "()Ll/hpd0;", "", "f", "()Ljava/lang/String;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "source", "", "n", "(Lcom/p1/mobile/android/app/Act;I)V", "type", "Lcom/p1/mobile/putong/core/data/SimilarInterestsItemSwipeData;", "k", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/data/SimilarInterestsItemSwipeData;", "Lcom/p1/mobile/putong/core/data/SimilarInterestsBaseData;", "e", "()Lcom/p1/mobile/putong/core/data/SimilarInterestsBaseData;", "g", "", "q", "()Z", BLiveStormDanmakuGiftResourceType.f44446s, "from", Constants.INAPP_DATA_TAG, "(I)V", Option.TYPE, Constants.KEY_T, "(Ljava/lang/String;)V", RXScreenCaptureService.KEY_INDEX, "()I", "Lcom/p1/mobile/putong/core/data/SimilarInterestsConfigData;", BLiveStormDanmakuGiftResourceType.f44444l, "()Lcom/p1/mobile/putong/core/data/SimilarInterestsConfigData;", "data", "o", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/data/SimilarInterestsConfigData;", "Ll/uqd0;", "savedString", "r", "(Ll/uqd0;)V", "str", "Ll/xaj0;", "", "p", "(Ljava/lang/String;)Ll/xaj0;", "a", "Ll/uqd0;", "similarInterestsReminderNum", "b", "Lkotlin/Lazy;", "h", "similarInterestsConfigData", "c", "j", "swipeCount", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class qff0 {

    @NotNull
    public static final qff0 INSTANCE = new qff0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final uqd0 similarInterestsReminderNum = new uqd0("similar_interests_reminder_num_" + CoreModule.m29931H().userId(), "0_0_0");

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy similarInterestsConfigData = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.nff0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return qff0.m174290b();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Lazy swipeCount = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.off0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(qff0.m174289a());
        }
    });

    /* JADX INFO: renamed from: a */
    public static int m174289a() {
        return INSTANCE.m174297i();
    }

    /* JADX INFO: renamed from: b */
    public static SimilarInterestsConfigData m174290b() {
        return INSTANCE.m174300l();
    }

    /* JADX INFO: renamed from: c */
    public static Unit m174291c(int i, Act act, LikeMindedEnvelope likeMindedEnvelope) {
        likeMindedEnvelope.getClass();
        if (2 == i) {
            new kff0(act).m145855u(INSTANCE.m174296h(), likeMindedEnvelope.data, i);
        } else if (TextUtils.isEmpty(likeMindedEnvelope.data.type)) {
            qff0 qff0Var = INSTANCE;
            if (qff0Var.m174305q()) {
                new kff0(act).m145855u(qff0Var.m174296h(), likeMindedEnvelope.data, i);
                qff0Var.m174306r(similarInterestsReminderNum);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final void m174292d(int from) {
        zvf0.m220368A("e_petsactivities_show", "p_activities_pets_page", vwb.m200311Y("show_source", String.valueOf(from)), vwb.m200311Y("activities_type", "loves"));
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final SimilarInterestsBaseData m174293e() {
        SimilarInterestsConfigData similarInterestsConfigDataM174296h = m174296h();
        if (similarInterestsConfigDataM174296h != null) {
            return similarInterestsConfigDataM174296h.baseData;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m174294f() {
        return "core_intl_similar_entrance_anim.svga";
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final String m174295g() {
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

    /* JADX INFO: renamed from: h */
    public final SimilarInterestsConfigData m174296h() {
        return (SimilarInterestsConfigData) similarInterestsConfigData.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final int m174297i() {
        SimilarInterestsMccConfigData similarInterestsMccConfigData;
        SimilarInterestsConfigData similarInterestsConfigDataM174296h = m174296h();
        if (similarInterestsConfigDataM174296h != null && similarInterestsConfigDataM174296h.enable) {
            try {
                SimilarInterestsConfigData similarInterestsConfigDataM174296h2 = m174296h();
                if (similarInterestsConfigDataM174296h2 != null) {
                    String strValueOf = String.valueOf(qib0.f154717f0);
                    if (similarInterestsConfigDataM174296h2.mcc.containsKey(strValueOf) && (similarInterestsMccConfigData = similarInterestsConfigDataM174296h2.mcc.get(strValueOf)) != null) {
                        return similarInterestsMccConfigData.swipeCount;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final int m174298j() {
        return ((Number) swipeCount.getValue()).intValue();
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final SimilarInterestsItemSwipeData m174299k(@NotNull String type) {
        Map<String, SimilarInterestsItemLanguagesData> map;
        SimilarInterestsItemLanguagesData similarInterestsItemLanguagesData;
        Map<String, SimilarInterestsItemLanguagesData> map2;
        SimilarInterestsItemLanguagesData similarInterestsItemLanguagesData2;
        type.getClass();
        SimilarInterestsConfigData similarInterestsConfigDataM174296h = m174296h();
        if (similarInterestsConfigDataM174296h != null) {
            if (similarInterestsConfigDataM174296h.mcc.containsKey(String.valueOf(qib0.f154717f0)) && similarInterestsConfigDataM174296h.mcc.get(String.valueOf(qib0.f154717f0)) != null) {
                SimilarInterestsItemData similarInterestsItemData = similarInterestsConfigDataM174296h.listData.get(type);
                SimilarInterestsItemSwipeData similarInterestsItemSwipeData = (similarInterestsItemData == null || (map2 = similarInterestsItemData.multiLanguage) == null || (similarInterestsItemLanguagesData2 = map2.get(INSTANCE.m174295g())) == null) ? null : similarInterestsItemLanguagesData2.swipe;
                if (similarInterestsItemSwipeData != null) {
                    return similarInterestsItemSwipeData;
                }
                SimilarInterestsItemData similarInterestsItemData2 = similarInterestsConfigDataM174296h.listData.get(type);
                if (similarInterestsItemData2 == null || (map = similarInterestsItemData2.multiLanguage) == null || (similarInterestsItemLanguagesData = map.get("en-US")) == null) {
                    return null;
                }
                return similarInterestsItemLanguagesData.swipe;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final SimilarInterestsConfigData m174300l() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("intl_520_config");
            strM79302F.getClass();
            return m174303o(strM79302F);
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final hpd0 m174301m() {
        return new hpd0("similar_is_upload_" + CoreModule.m29931H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: n */
    public final void m174302n(@NotNull final Act act, final int source) {
        act.getClass();
        LikeMindedRequestParams likeMindedRequestParams = new LikeMindedRequestParams();
        likeMindedRequestParams.f20431me = CoreModule.m29931H().userId();
        likeMindedRequestParams.mcc = String.valueOf(qib0.f154717f0);
        if (1 == source) {
            Long l2 = CoreModule.f17545c.f19639e0.f149238P0.get();
            long jM174298j = m174298j();
            if (l2 == null || l2.longValue() != jM174298j) {
                return;
            }
        }
        CoreModule.f17545c.f19553B1.m196122e3(act, likeMindedRequestParams, new Function1() { // from class: l.pff0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qff0.m174291c(source, act, (LikeMindedEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final SimilarInterestsConfigData m174303o(String data) throws IOException {
        SimilarInterestsConfigData similarInterestsConfigData2 = SimilarInterestsConfigData.JSON_ADAPTER.parse(data);
        similarInterestsConfigData2.getClass();
        return similarInterestsConfigData2;
    }

    /* JADX INFO: renamed from: p */
    public final xaj0<Long, Integer, Integer> m174304p(String str) {
        String[] strArr = (String[]) StringsKt.split$default(str, new String[]{"_"}, false, 0, 6, null).toArray(new String[0]);
        xaj0<Long, Integer, Integer> xaj0VarM207578a = xaj0.m207578a(Long.valueOf(strArr[0]), Integer.valueOf(strArr[1]), Integer.valueOf(strArr[2]));
        xaj0VarM207578a.getClass();
        return xaj0VarM207578a;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m174305q() {
        String str = similarInterestsReminderNum.get();
        str.getClass();
        xaj0<Long, Integer, Integer> xaj0VarM174304p = m174304p(str);
        Integer num = xaj0VarM174304p.f191752b;
        num.getClass();
        int iM208123d = xck0.m208123d(num.intValue(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
        long jM155944o = mqi0.m155944o();
        Long l2 = xaj0VarM174304p.f191751a;
        l2.getClass();
        if (qqi0.m175940h(jM155944o, l2.longValue(), iM208123d)) {
            return true;
        }
        Long l3 = xaj0VarM174304p.f191751a;
        l3.getClass();
        return mqi0.m155929D(l3.longValue()) && xaj0VarM174304p.f191753c.intValue() < 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [B, java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [C, java.lang.Integer, java.lang.Object] */
    /* JADX INFO: renamed from: r */
    public final void m174306r(uqd0 savedString) {
        String str;
        String str2 = savedString.get();
        str2.getClass();
        xaj0<Long, Integer, Integer> xaj0VarM174304p = m174304p(str2);
        Long l2 = xaj0VarM174304p.f191751a;
        l2.getClass();
        if (mqi0.m155929D(l2.longValue())) {
            Long l3 = xaj0VarM174304p.f191751a;
            Integer num = xaj0VarM174304p.f191752b;
            ?? ValueOf = Integer.valueOf(xaj0VarM174304p.f191753c.intValue() + 1);
            xaj0VarM174304p.f191753c = ValueOf;
            str = l3 + "_" + num + "_" + ((Object) ValueOf);
        } else {
            long jM155944o = mqi0.m155944o();
            ?? ValueOf2 = Integer.valueOf(xaj0VarM174304p.f191752b.intValue() + 1);
            xaj0VarM174304p.f191752b = ValueOf2;
            str = jM155944o + "_" + ((Object) ValueOf2) + "_1";
        }
        savedString.put(str);
    }

    /* JADX INFO: renamed from: s */
    public final void m174307s() {
        zvf0.m220399u("e_petactivities_click", "p_activities_pets_page", vwb.m200311Y("activities_type", "loves"));
    }

    /* JADX INFO: renamed from: t */
    public final void m174308t(@NotNull String option) {
        option.getClass();
        try {
            zvf0.m220368A("e_petactivities_success", "p_activities_pets_page", vwb.m200311Y("activities_type", "loves"), vwb.m200311Y("activities_options", Integer.valueOf(Integer.parseInt(option))));
        } catch (Exception unused) {
        }
    }
}
