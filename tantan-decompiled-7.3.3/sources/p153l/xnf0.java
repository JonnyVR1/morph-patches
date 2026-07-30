package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LikeMindedEnvelope;
import com.p051p1.mobile.putong.core.data.LikeMindedRequestParams;
import com.p051p1.mobile.putong.core.data.Option;
import com.p051p1.mobile.putong.core.data.SimilarInterestsBaseData;
import com.p051p1.mobile.putong.core.data.SimilarInterestsConfigData;
import com.p051p1.mobile.putong.core.data.SimilarInterestsItemData;
import com.p051p1.mobile.putong.core.data.SimilarInterestsItemLanguagesData;
import com.p051p1.mobile.putong.core.data.SimilarInterestsItemSwipeData;
import com.p051p1.mobile.putong.core.data.SimilarInterestsMccConfigData;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\tJ\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u0003J\u0015\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010$J\u0011\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0007H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J)\u00102\u001a\u0014\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f002\u0006\u0010/\u001a\u00020\u0007H\u0002¢\u0006\u0004\b2\u00103R\u0014\u00106\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001d\u0010:\u001a\u0004\u0018\u00010%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010'R\u001b\u0010=\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010$¨\u0006>"}, m88121d2 = {"Ll/xnf0;", "", "<init>", "()V", "Ll/jxd0;", "m", "()Ll/jxd0;", "", "f", "()Ljava/lang/String;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "source", "", "n", "(Lcom/p1/mobile/android/app/Act;I)V", "type", "Lcom/p1/mobile/putong/core/data/SimilarInterestsItemSwipeData;", "k", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/data/SimilarInterestsItemSwipeData;", "Lcom/p1/mobile/putong/core/data/SimilarInterestsBaseData;", "e", "()Lcom/p1/mobile/putong/core/data/SimilarInterestsBaseData;", "g", "", "q", "()Z", BLiveStormDanmakuGiftResourceType.f45294s, "from", Constants.INAPP_DATA_TAG, "(I)V", Option.TYPE, Constants.KEY_T, "(Ljava/lang/String;)V", RXScreenCaptureService.KEY_INDEX, "()I", "Lcom/p1/mobile/putong/core/data/SimilarInterestsConfigData;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lcom/p1/mobile/putong/core/data/SimilarInterestsConfigData;", "data", "o", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/data/SimilarInterestsConfigData;", "Ll/wyd0;", "savedString", "r", "(Ll/wyd0;)V", "str", "Ll/bkj0;", "", "p", "(Ljava/lang/String;)Ll/bkj0;", "a", "Ll/wyd0;", "similarInterestsReminderNum", "b", "Lkotlin/Lazy;", "h", "similarInterestsConfigData", "c", "j", "swipeCount", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class xnf0 {

    @NotNull
    public static final xnf0 INSTANCE = new xnf0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final wyd0 similarInterestsReminderNum = new wyd0("similar_interests_reminder_num_" + CoreModule.m30929H().userId(), "0_0_0");

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy similarInterestsConfigData = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.unf0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return xnf0.m212184b();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Lazy swipeCount = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.vnf0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(xnf0.m212183a());
        }
    });

    /* JADX INFO: renamed from: a */
    public static int m212183a() {
        return INSTANCE.m212191i();
    }

    /* JADX INFO: renamed from: b */
    public static SimilarInterestsConfigData m212184b() {
        return INSTANCE.m212194l();
    }

    /* JADX INFO: renamed from: c */
    public static Unit m212185c(int i, Act act, LikeMindedEnvelope likeMindedEnvelope) {
        likeMindedEnvelope.getClass();
        if (2 == i) {
            new rnf0(act).m182234u(INSTANCE.m212190h(), likeMindedEnvelope.data, i);
        } else if (TextUtils.isEmpty(likeMindedEnvelope.data.type)) {
            xnf0 xnf0Var = INSTANCE;
            if (xnf0Var.m212199q()) {
                new rnf0(act).m182234u(xnf0Var.m212190h(), likeMindedEnvelope.data, i);
                xnf0Var.m212200r(similarInterestsReminderNum);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final void m212186d(int from) {
        i4g0.m138492A("e_petsactivities_show", "p_activities_pets_page", jyb.m147494Y("show_source", String.valueOf(from)), jyb.m147494Y("activities_type", "loves"));
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final SimilarInterestsBaseData m212187e() {
        SimilarInterestsConfigData similarInterestsConfigDataM212190h = m212190h();
        if (similarInterestsConfigDataM212190h != null) {
            return similarInterestsConfigDataM212190h.baseData;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m212188f() {
        return "core_intl_similar_entrance_anim.svga";
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final String m212189g() {
        String language = Locale.getDefault().getLanguage();
        language.getClass();
        if (C15493d.m94374J(language, "zh", false, 2, null)) {
            return Intrinsics.m88377d(Locale.getDefault().getCountry(), "TW") ? "zh-TW" : "zh-CN";
        }
        if (C15493d.m94374J(language, "en", false, 2, null)) {
            return "en-US";
        }
        if (C15493d.m94374J(language, "ko", false, 2, null)) {
            return "ko-KR";
        }
        if (C15493d.m94374J(language, "ja", false, 2, null)) {
            return "ja-JP";
        }
        if (C15493d.m94374J(language, "in", false, 2, null)) {
            return "id-ID";
        }
        if (C15493d.m94374J(language, "th", false, 2, null)) {
            return "th-TH";
        }
        return C15493d.m94374J(language, "vi", false, 2, null) ? "vi-VN" : "en-US";
    }

    /* JADX INFO: renamed from: h */
    public final SimilarInterestsConfigData m212190h() {
        return (SimilarInterestsConfigData) similarInterestsConfigData.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final int m212191i() {
        SimilarInterestsMccConfigData similarInterestsMccConfigData;
        SimilarInterestsConfigData similarInterestsConfigDataM212190h = m212190h();
        if (similarInterestsConfigDataM212190h != null && similarInterestsConfigDataM212190h.enable) {
            try {
                SimilarInterestsConfigData similarInterestsConfigDataM212190h2 = m212190h();
                if (similarInterestsConfigDataM212190h2 != null) {
                    String strValueOf = String.valueOf(uqb0.f180400f0);
                    if (similarInterestsConfigDataM212190h2.mcc.containsKey(strValueOf) && (similarInterestsMccConfigData = similarInterestsConfigDataM212190h2.mcc.get(strValueOf)) != null) {
                        return similarInterestsMccConfigData.swipeCount;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final int m212192j() {
        return ((Number) swipeCount.getValue()).intValue();
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final SimilarInterestsItemSwipeData m212193k(@NotNull String type) {
        Map<String, SimilarInterestsItemLanguagesData> map;
        SimilarInterestsItemLanguagesData similarInterestsItemLanguagesData;
        Map<String, SimilarInterestsItemLanguagesData> map2;
        SimilarInterestsItemLanguagesData similarInterestsItemLanguagesData2;
        type.getClass();
        SimilarInterestsConfigData similarInterestsConfigDataM212190h = m212190h();
        if (similarInterestsConfigDataM212190h != null) {
            if (similarInterestsConfigDataM212190h.mcc.containsKey(String.valueOf(uqb0.f180400f0)) && similarInterestsConfigDataM212190h.mcc.get(String.valueOf(uqb0.f180400f0)) != null) {
                SimilarInterestsItemData similarInterestsItemData = similarInterestsConfigDataM212190h.listData.get(type);
                SimilarInterestsItemSwipeData similarInterestsItemSwipeData = (similarInterestsItemData == null || (map2 = similarInterestsItemData.multiLanguage) == null || (similarInterestsItemLanguagesData2 = map2.get(INSTANCE.m212189g())) == null) ? null : similarInterestsItemLanguagesData2.swipe;
                if (similarInterestsItemSwipeData != null) {
                    return similarInterestsItemSwipeData;
                }
                SimilarInterestsItemData similarInterestsItemData2 = similarInterestsConfigDataM212190h.listData.get(type);
                if (similarInterestsItemData2 == null || (map = similarInterestsItemData2.multiLanguage) == null || (similarInterestsItemLanguagesData = map.get("en-US")) == null) {
                    return null;
                }
                return similarInterestsItemLanguagesData.swipe;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final SimilarInterestsConfigData m212194l() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("intl_520_config");
            strM80485F.getClass();
            return m212197o(strM80485F);
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final jxd0 m212195m() {
        return new jxd0("similar_is_upload_" + CoreModule.m30929H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: n */
    public final void m212196n(@NotNull final Act act, final int source) {
        act.getClass();
        LikeMindedRequestParams likeMindedRequestParams = new LikeMindedRequestParams();
        likeMindedRequestParams.f21173me = CoreModule.m30929H().userId();
        likeMindedRequestParams.mcc = String.valueOf(uqb0.f180400f0);
        if (1 == source) {
            Long l2 = CoreModule.f18264c.f20381e0.f89095P0.get();
            long jM212192j = m212192j();
            if (l2 == null || l2.longValue() != jM212192j) {
                return;
            }
        }
        CoreModule.f18264c.f20295B1.m132946e3(act, likeMindedRequestParams, new Function1() { // from class: l.wnf0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xnf0.m212185c(source, act, (LikeMindedEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final SimilarInterestsConfigData m212197o(String data) throws IOException {
        SimilarInterestsConfigData similarInterestsConfigData2 = SimilarInterestsConfigData.JSON_ADAPTER.parse(data);
        similarInterestsConfigData2.getClass();
        return similarInterestsConfigData2;
    }

    /* JADX INFO: renamed from: p */
    public final bkj0<Long, Integer, Integer> m212198p(String str) {
        String[] strArr = (String[]) StringsKt.split$default(str, new String[]{"_"}, false, 0, 6, null).toArray(new String[0]);
        bkj0<Long, Integer, Integer> bkj0VarM104818a = bkj0.m104818a(Long.valueOf(strArr[0]), Integer.valueOf(strArr[1]), Integer.valueOf(strArr[2]));
        bkj0VarM104818a.getClass();
        return bkj0VarM104818a;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m212199q() {
        String str = similarInterestsReminderNum.get();
        str.getClass();
        bkj0<Long, Integer, Integer> bkj0VarM212198p = m212198p(str);
        Integer num = bkj0VarM212198p.f77082b;
        num.getClass();
        int iM116965d = dmk0.m116965d(num.intValue(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
        long jM174454o = pzi0.m174454o();
        Long l2 = bkj0VarM212198p.f77081a;
        l2.getClass();
        if (tzi0.m193670h(jM174454o, l2.longValue(), iM116965d)) {
            return true;
        }
        Long l3 = bkj0VarM212198p.f77081a;
        l3.getClass();
        return pzi0.m174439D(l3.longValue()) && bkj0VarM212198p.f77083c.intValue() < 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [B, java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [C, java.lang.Integer, java.lang.Object] */
    /* JADX INFO: renamed from: r */
    public final void m212200r(wyd0 savedString) {
        String str;
        String str2 = savedString.get();
        str2.getClass();
        bkj0<Long, Integer, Integer> bkj0VarM212198p = m212198p(str2);
        Long l2 = bkj0VarM212198p.f77081a;
        l2.getClass();
        if (pzi0.m174439D(l2.longValue())) {
            Long l3 = bkj0VarM212198p.f77081a;
            Integer num = bkj0VarM212198p.f77082b;
            ?? ValueOf = Integer.valueOf(bkj0VarM212198p.f77083c.intValue() + 1);
            bkj0VarM212198p.f77083c = ValueOf;
            str = l3 + "_" + num + "_" + ((Object) ValueOf);
        } else {
            long jM174454o = pzi0.m174454o();
            ?? ValueOf2 = Integer.valueOf(bkj0VarM212198p.f77082b.intValue() + 1);
            bkj0VarM212198p.f77082b = ValueOf2;
            str = jM174454o + "_" + ((Object) ValueOf2) + "_1";
        }
        savedString.put(str);
    }

    /* JADX INFO: renamed from: s */
    public final void m212201s() {
        i4g0.m138523u("e_petactivities_click", "p_activities_pets_page", jyb.m147494Y("activities_type", "loves"));
    }

    /* JADX INFO: renamed from: t */
    public final void m212202t(@NotNull String option) {
        option.getClass();
        try {
            i4g0.m138492A("e_petactivities_success", "p_activities_pets_page", jyb.m147494Y("activities_type", "loves"), jyb.m147494Y("activities_options", Integer.valueOf(Integer.parseInt(option))));
        } catch (Exception unused) {
        }
    }
}
