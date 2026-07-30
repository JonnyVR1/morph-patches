package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.miniwidget.MiniWidgetProvider;
import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.LikeMindedEnvelope;
import com.p1.mobile.putong.core.data.LikeMindedRequestParams;
import com.p1.mobile.putong.core.data.SimilarInterestsBaseData;
import com.p1.mobile.putong.core.data.SimilarInterestsConfigData;
import com.p1.mobile.putong.core.data.SimilarInterestsItemData;
import com.p1.mobile.putong.core.data.SimilarInterestsItemLanguagesData;
import com.p1.mobile.putong.core.data.SimilarInterestsItemSwipeData;
import com.p1.mobile.putong.core.data.SimilarInterestsMccConfigData;
import com.sina.weibo.sdk.web.WebPicUploadResult;
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
import kotlin.text.StringsKt;
import kotlin.text.d;
import l.hpd0;
import l.j760;
import l.qib0;
import l.qqi0;
import l.uqd0;
import l.vwb;
import l.xaj0;
import l.xck0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\tJ\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u0003J\u0015\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010$J\u0011\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0007H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J)\u00102\u001a\u0014\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f002\u0006\u0010/\u001a\u00020\u0007H\u0002¢\u0006\u0004\b2\u00103R\u0014\u00106\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001d\u0010:\u001a\u0004\u0018\u00010%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010'R\u001b\u0010=\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010$¨\u0006>"}, d2 = {"Ll/qff0;", "", "<init>", "()V", "Ll/hpd0;", "m", "()Ll/hpd0;", "", "f", "()Ljava/lang/String;", "Lcom/p1/mobile/android/app/Act;", "act", "", "source", "", "n", "(Lcom/p1/mobile/android/app/Act;I)V", MiniWidgetProvider.KEY_TYPE, "Lcom/p1/mobile/putong/core/data/SimilarInterestsItemSwipeData;", "k", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/data/SimilarInterestsItemSwipeData;", "Lcom/p1/mobile/putong/core/data/SimilarInterestsBaseData;", "e", "()Lcom/p1/mobile/putong/core/data/SimilarInterestsBaseData;", "g", "", "q", "()Z", "s", "from", "d", "(I)V", "option", "t", "(Ljava/lang/String;)V", "i", "()I", "Lcom/p1/mobile/putong/core/data/SimilarInterestsConfigData;", "l", "()Lcom/p1/mobile/putong/core/data/SimilarInterestsConfigData;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "o", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/data/SimilarInterestsConfigData;", "Ll/uqd0;", "savedString", "r", "(Ll/uqd0;)V", "str", "Ll/xaj0;", "", "p", "(Ljava/lang/String;)Ll/xaj0;", "a", "Ll/uqd0;", "similarInterestsReminderNum", "b", "Lkotlin/Lazy;", "h", "similarInterestsConfigData", "c", "j", "swipeCount", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class qff0 {

    @NotNull
    public static final qff0 INSTANCE = new qff0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final uqd0 similarInterestsReminderNum = new uqd0("similar_interests_reminder_num_" + CoreModule.H().userId(), "0_0_0");

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy similarInterestsConfigData = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.nff0
        public final Object invoke() {
            return qff0.m20937b();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Lazy swipeCount = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.off0
        public final Object invoke() {
            return Integer.valueOf(qff0.m20936a());
        }
    });

    /* JADX INFO: renamed from: a */
    public static int m20936a() {
        return INSTANCE.m20944i();
    }

    /* JADX INFO: renamed from: b */
    public static SimilarInterestsConfigData m20937b() {
        return INSTANCE.m20947l();
    }

    /* JADX INFO: renamed from: c */
    public static Unit m20938c(int i, Act act, LikeMindedEnvelope likeMindedEnvelope) {
        likeMindedEnvelope.getClass();
        if (2 == i) {
            new kff0(act).m17480u(INSTANCE.m20943h(), likeMindedEnvelope.data, i);
        } else if (TextUtils.isEmpty(likeMindedEnvelope.data.type)) {
            qff0 qff0Var = INSTANCE;
            if (qff0Var.m20952q()) {
                new kff0(act).m17480u(qff0Var.m20943h(), likeMindedEnvelope.data, i);
                qff0Var.m20953r(similarInterestsReminderNum);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final void m20939d(int from) {
        zvf0.A("e_petsactivities_show", "p_activities_pets_page", new j760[]{vwb.Y("show_source", String.valueOf(from)), vwb.Y("activities_type", "loves")});
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final SimilarInterestsBaseData m20940e() {
        SimilarInterestsConfigData similarInterestsConfigDataM20943h = m20943h();
        if (similarInterestsConfigDataM20943h != null) {
            return similarInterestsConfigDataM20943h.baseData;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m20941f() {
        return "core_intl_similar_entrance_anim.svga";
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final String m20942g() {
        String language = Locale.getDefault().getLanguage();
        language.getClass();
        if (d.J(language, "zh", false, 2, (Object) null)) {
            return Intrinsics.d(Locale.getDefault().getCountry(), "TW") ? "zh-TW" : "zh-CN";
        }
        if (d.J(language, "en", false, 2, (Object) null)) {
            return "en-US";
        }
        if (d.J(language, "ko", false, 2, (Object) null)) {
            return "ko-KR";
        }
        if (d.J(language, "ja", false, 2, (Object) null)) {
            return "ja-JP";
        }
        if (d.J(language, "in", false, 2, (Object) null)) {
            return "id-ID";
        }
        if (d.J(language, "th", false, 2, (Object) null)) {
            return "th-TH";
        }
        return d.J(language, "vi", false, 2, (Object) null) ? "vi-VN" : "en-US";
    }

    /* JADX INFO: renamed from: h */
    public final SimilarInterestsConfigData m20943h() {
        return (SimilarInterestsConfigData) similarInterestsConfigData.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final int m20944i() {
        SimilarInterestsMccConfigData similarInterestsMccConfigData;
        SimilarInterestsConfigData similarInterestsConfigDataM20943h = m20943h();
        if (similarInterestsConfigDataM20943h != null && similarInterestsConfigDataM20943h.enable) {
            try {
                SimilarInterestsConfigData similarInterestsConfigDataM20943h2 = m20943h();
                if (similarInterestsConfigDataM20943h2 != null) {
                    String strValueOf = String.valueOf(qib0.f0);
                    if (similarInterestsConfigDataM20943h2.mcc.containsKey(strValueOf) && (similarInterestsMccConfigData = (SimilarInterestsMccConfigData) similarInterestsConfigDataM20943h2.mcc.get(strValueOf)) != null) {
                        return similarInterestsMccConfigData.swipeCount;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final int m20945j() {
        return ((Number) swipeCount.getValue()).intValue();
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final SimilarInterestsItemSwipeData m20946k(@NotNull String type) {
        Map map;
        SimilarInterestsItemLanguagesData similarInterestsItemLanguagesData;
        Map map2;
        SimilarInterestsItemLanguagesData similarInterestsItemLanguagesData2;
        type.getClass();
        SimilarInterestsConfigData similarInterestsConfigDataM20943h = m20943h();
        if (similarInterestsConfigDataM20943h != null) {
            if (similarInterestsConfigDataM20943h.mcc.containsKey(String.valueOf(qib0.f0)) && ((SimilarInterestsMccConfigData) similarInterestsConfigDataM20943h.mcc.get(String.valueOf(qib0.f0))) != null) {
                SimilarInterestsItemData similarInterestsItemData = (SimilarInterestsItemData) similarInterestsConfigDataM20943h.listData.get(type);
                SimilarInterestsItemSwipeData similarInterestsItemSwipeData = (similarInterestsItemData == null || (map2 = similarInterestsItemData.multiLanguage) == null || (similarInterestsItemLanguagesData2 = (SimilarInterestsItemLanguagesData) map2.get(INSTANCE.m20942g())) == null) ? null : similarInterestsItemLanguagesData2.swipe;
                if (similarInterestsItemSwipeData != null) {
                    return similarInterestsItemSwipeData;
                }
                SimilarInterestsItemData similarInterestsItemData2 = (SimilarInterestsItemData) similarInterestsConfigDataM20943h.listData.get(type);
                if (similarInterestsItemData2 == null || (map = similarInterestsItemData2.multiLanguage) == null || (similarInterestsItemLanguagesData = (SimilarInterestsItemLanguagesData) map.get("en-US")) == null) {
                    return null;
                }
                return similarInterestsItemLanguagesData.swipe;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final SimilarInterestsConfigData m20947l() {
        try {
            String strM9623F = RemoteConfig.m9619x().m9623F("intl_520_config");
            strM9623F.getClass();
            return m20950o(strM9623F);
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final hpd0 m20948m() {
        return new hpd0("similar_is_upload_" + CoreModule.H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: n */
    public final void m20949n(@NotNull final Act act, final int source) {
        act.getClass();
        LikeMindedRequestParams likeMindedRequestParams = new LikeMindedRequestParams();
        likeMindedRequestParams.me = CoreModule.H().userId();
        likeMindedRequestParams.mcc = String.valueOf(qib0.f0);
        if (1 == source) {
            Long l2 = (Long) CoreModule.c.e0.P0.get();
            long jM20945j = m20945j();
            if (l2 == null || l2.longValue() != jM20945j) {
                return;
            }
        }
        CoreModule.c.B1.e3(act, likeMindedRequestParams, new Function1() { // from class: l.pff0
            public final Object invoke(Object obj) {
                return qff0.m20938c(source, act, (LikeMindedEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final SimilarInterestsConfigData m20950o(String data) {
        Object obj = SimilarInterestsConfigData.JSON_ADAPTER.parse(data);
        obj.getClass();
        return (SimilarInterestsConfigData) obj;
    }

    /* JADX INFO: renamed from: p */
    public final xaj0<Long, Integer, Integer> m20951p(String str) {
        String[] strArr = (String[]) StringsKt.split$default(str, new String[]{"_"}, false, 0, 6, (Object) null).toArray(new String[0]);
        xaj0<Long, Integer, Integer> xaj0VarA = xaj0.a(Long.valueOf(strArr[0]), Integer.valueOf(strArr[1]), Integer.valueOf(strArr[2]));
        xaj0VarA.getClass();
        return xaj0VarA;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m20952q() {
        Object obj = similarInterestsReminderNum.get();
        obj.getClass();
        xaj0<Long, Integer, Integer> xaj0VarM20951p = m20951p((String) obj);
        Object obj2 = xaj0VarM20951p.b;
        obj2.getClass();
        int iD = xck0.d(((Number) obj2).intValue(), Integer.MAX_VALUE);
        long jM18550o = mqi0.m18550o();
        Object obj3 = xaj0VarM20951p.a;
        obj3.getClass();
        if (qqi0.h(jM18550o, ((Number) obj3).longValue(), iD)) {
            return true;
        }
        Object obj4 = xaj0VarM20951p.a;
        obj4.getClass();
        return mqi0.m18535D(((Number) obj4).longValue()) && ((Number) xaj0VarM20951p.c).intValue() < 1;
    }

    /* JADX INFO: renamed from: r */
    public final void m20953r(uqd0 savedString) {
        String str;
        Object obj = savedString.get();
        obj.getClass();
        xaj0<Long, Integer, Integer> xaj0VarM20951p = m20951p((String) obj);
        Object obj2 = xaj0VarM20951p.a;
        obj2.getClass();
        if (mqi0.m18535D(((Number) obj2).longValue())) {
            Object obj3 = xaj0VarM20951p.a;
            Object obj4 = xaj0VarM20951p.b;
            Integer numValueOf = Integer.valueOf(((Number) xaj0VarM20951p.c).intValue() + 1);
            xaj0VarM20951p.c = numValueOf;
            str = obj3 + "_" + obj4 + "_" + numValueOf;
        } else {
            long jM18550o = mqi0.m18550o();
            Integer numValueOf2 = Integer.valueOf(((Number) xaj0VarM20951p.b).intValue() + 1);
            xaj0VarM20951p.b = numValueOf2;
            str = jM18550o + "_" + numValueOf2 + "_1";
        }
        savedString.put(str);
    }

    /* JADX INFO: renamed from: s */
    public final void m20954s() {
        zvf0.u("e_petactivities_click", "p_activities_pets_page", new j760[]{vwb.Y("activities_type", "loves")});
    }

    /* JADX INFO: renamed from: t */
    public final void m20955t(@NotNull String option) {
        option.getClass();
        try {
            zvf0.A("e_petactivities_success", "p_activities_pets_page", new j760[]{vwb.Y("activities_type", "loves"), vwb.Y("activities_options", Integer.valueOf(Integer.parseInt(option)))});
        } catch (Exception unused) {
        }
    }
}
