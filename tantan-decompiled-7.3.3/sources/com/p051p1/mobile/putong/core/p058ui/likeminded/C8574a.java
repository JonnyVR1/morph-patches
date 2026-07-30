package com.p051p1.mobile.putong.core.p058ui.likeminded;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.LikeMindedConfigData;
import com.p051p1.mobile.putong.core.data.LikeMindedData;
import com.p051p1.mobile.putong.core.data.LikeMindedEnvelope;
import com.p051p1.mobile.putong.core.data.LikeMindedItemData;
import com.p051p1.mobile.putong.core.data.LikeMindedItemLanguagesData;
import com.p051p1.mobile.putong.core.data.LikeMindedItemStatusData;
import com.p051p1.mobile.putong.core.data.LikeMindedRequestParams;
import com.p051p1.mobile.putong.core.p058ui.likeminded.C8574a;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bkj0;
import p153l.cgr;
import p153l.dmk0;
import p153l.jfr;
import p153l.l4g0;
import p153l.ofr;
import p153l.pzi0;
import p153l.tzi0;
import p153l.uqb0;
import p153l.w1e;
import p153l.wyd0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.likeminded.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u0003J\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J)\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0)2\u0006\u0010(\u001a\u00020\u001fH\u0002¢\u0006\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0017\u00104\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u00106\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b2\u00101\u001a\u0004\b5\u00103¨\u00067"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/likeminded/a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "remain", "", Active.TYPE, "Lkotlin/Function0;", "inActive", "j", "(Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "", "isActive", "f", "(Lcom/p1/mobile/android/app/Act;Z)V", "Ll/l4g0;", "pageHelper", "h", "(Ll/l4g0;)V", "g", "e", "(Lcom/p1/mobile/android/app/Act;)V", "k", "Ljava/util/Date;", "date", "", "m", "(Ljava/util/Date;)Ljava/lang/String;", BLiveStormDanmakuGiftResourceType.f45292l, "()Z", "Ll/wyd0;", "savedString", "n", "(Ll/wyd0;)V", "str", "Ll/bkj0;", "", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)Ll/bkj0;", "a", "Ll/wyd0;", "likeMindedReminderNum", "b", "Ll/l4g0;", "c", "()Ll/l4g0;", "pageHelper_finding", Constants.INAPP_DATA_TAG, "pageHelper_setting", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class C8574a {

    @NotNull
    public static final C8574a INSTANCE = new C8574a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final wyd0 likeMindedReminderNum = new wyd0("like_minded_reminder_num_" + CoreModule.m30929H().userId(), "0_0_0");

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final l4g0 pageHelper_finding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final l4g0 pageHelper_setting;

    static {
        l4g0 l4g0VarM204399c = w1e.m204399c("p_same_making_after_page", cgr.class.getName());
        l4g0VarM204399c.getClass();
        pageHelper_finding = l4g0VarM204399c;
        l4g0 l4g0VarM204399c2 = w1e.m204399c("p_same_making_page", cgr.class.getName());
        l4g0VarM204399c2.getClass();
        pageHelper_setting = l4g0VarM204399c2;
    }

    /* JADX INFO: renamed from: a */
    public static Unit m48063a(Function1 function1, Function0 function0, LikeMindedEnvelope likeMindedEnvelope) {
        likeMindedEnvelope.getClass();
        LikeMindedData likeMindedData = likeMindedEnvelope.data;
        if (likeMindedData.active) {
            function1.invoke(Long.valueOf(likeMindedData.remain));
        } else {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m48064b(boolean z, Act act, LikeMindedEnvelope likeMindedEnvelope) {
        Map<String, LikeMindedItemLanguagesData> map;
        LikeMindedItemLanguagesData likeMindedItemLanguagesData;
        Map<String, LikeMindedItemLanguagesData> map2;
        LikeMindedItemLanguagesData likeMindedItemLanguagesData2;
        likeMindedEnvelope.getClass();
        LikeMindedData likeMindedData = likeMindedEnvelope.data;
        if (z) {
            if (likeMindedData.active) {
                jfr jfrVar = jfr.INSTANCE;
                LikeMindedConfigData likeMindedConfigDataM144705c = jfrVar.m144712j() ? jfrVar.m144705c() : jfrVar.m144708f();
                if (likeMindedConfigDataM144705c != null) {
                    if (likeMindedConfigDataM144705c.mcc.containsKey(String.valueOf(uqb0.f180400f0)) && likeMindedConfigDataM144705c.mcc.get(String.valueOf(uqb0.f180400f0)) != null) {
                        LikeMindedItemData likeMindedItemData = likeMindedConfigDataM144705c.same.get(likeMindedEnvelope.data.type);
                        LikeMindedItemStatusData likeMindedItemStatusData = null;
                        LikeMindedItemStatusData likeMindedItemStatusData2 = (likeMindedItemData == null || (map2 = likeMindedItemData.multiLanguage) == null || (likeMindedItemLanguagesData2 = map2.get(jfrVar.m144707e())) == null) ? null : likeMindedItemLanguagesData2.status;
                        if (likeMindedItemStatusData2 == null) {
                            LikeMindedItemData likeMindedItemData2 = likeMindedConfigDataM144705c.same.get(likeMindedEnvelope.data.type);
                            if (likeMindedItemData2 != null && (map = likeMindedItemData2.multiLanguage) != null && (likeMindedItemLanguagesData = map.get("en-US")) != null) {
                                likeMindedItemStatusData = likeMindedItemLanguagesData.status;
                            }
                            likeMindedItemStatusData2 = likeMindedItemStatusData;
                        }
                        if (likeMindedItemStatusData2 != null) {
                            new ofr(act).m167505o(likeMindedItemStatusData2, likeMindedEnvelope);
                        }
                    }
                }
            } else {
                INSTANCE.m48067e(act);
            }
        } else if (!likeMindedData.active) {
            C8574a c8574a = INSTANCE;
            if (c8574a.m48074l()) {
                c8574a.m48067e(act);
                c8574a.m48076n(likeMindedReminderNum);
            }
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final l4g0 m48065c() {
        return pageHelper_finding;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final l4g0 m48066d() {
        return pageHelper_setting;
    }

    /* JADX INFO: renamed from: e */
    public final void m48067e(@NotNull Act act) {
        act.getClass();
        act.startActivityWithCustomTransition(LikeMindedAct.INSTANCE.m48059a(act), new MatchAct.C8617b());
    }

    /* JADX INFO: renamed from: f */
    public final void m48068f(@NotNull final Act act, final boolean isActive) {
        act.getClass();
        LikeMindedRequestParams likeMindedRequestParams = new LikeMindedRequestParams();
        likeMindedRequestParams.f21173me = CoreModule.m30929H().userId();
        likeMindedRequestParams.mcc = String.valueOf(uqb0.f180400f0);
        jfr jfrVar = jfr.INSTANCE;
        if (jfrVar.m144712j() || jfrVar.m144710h() != -1) {
            if (!isActive) {
                Long l2 = CoreModule.f18264c.f20381e0.f89095P0.get();
                long jM144710h = jfrVar.m144710h();
                if (l2 == null || l2.longValue() != jM144710h) {
                    return;
                }
            }
            CoreModule.f18264c.f20442y1.m219412g3(act, likeMindedRequestParams, new Function1() { // from class: l.sfr
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C8574a.m48064b(isActive, act, (LikeMindedEnvelope) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m48069g(@Nullable l4g0 pageHelper) {
        if (pageHelper != null) {
            pageHelper.m152776k();
            pageHelper.m152775j();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m48070h(@Nullable l4g0 pageHelper) {
        if (pageHelper != null) {
            pageHelper.m152774i();
            pageHelper.m152777l();
        }
    }

    /* JADX INFO: renamed from: i */
    public final bkj0<Long, Integer, Integer> m48071i(String str) {
        String[] strArr = (String[]) StringsKt.split$default(str, new String[]{"_"}, false, 0, 6, null).toArray(new String[0]);
        bkj0<Long, Integer, Integer> bkj0VarM104818a = bkj0.m104818a(Long.valueOf(strArr[0]), Integer.valueOf(strArr[1]), Integer.valueOf(strArr[2]));
        bkj0VarM104818a.getClass();
        return bkj0VarM104818a;
    }

    /* JADX INFO: renamed from: j */
    public final void m48072j(@NotNull Act act, @NotNull final Function1<? super Long, Unit> active, @NotNull final Function0<Unit> inActive) {
        act.getClass();
        active.getClass();
        inActive.getClass();
        LikeMindedRequestParams likeMindedRequestParams = new LikeMindedRequestParams();
        likeMindedRequestParams.f21173me = CoreModule.m30929H().userId();
        likeMindedRequestParams.mcc = String.valueOf(uqb0.f180400f0);
        CoreModule.f18264c.f20442y1.m219412g3(act, likeMindedRequestParams, new Function1() { // from class: l.tfr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8574a.m48063a(active, inActive, (LikeMindedEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m48073k() {
        likeMindedReminderNum.put("0_0_0");
    }

    /* JADX INFO: renamed from: l */
    public final boolean m48074l() {
        String str = likeMindedReminderNum.get();
        str.getClass();
        bkj0<Long, Integer, Integer> bkj0VarM48071i = m48071i(str);
        Integer num = bkj0VarM48071i.f77082b;
        num.getClass();
        int iM116965d = dmk0.m116965d(num.intValue(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
        long jM174454o = pzi0.m174454o();
        Long l2 = bkj0VarM48071i.f77081a;
        l2.getClass();
        if (tzi0.m193670h(jM174454o, l2.longValue(), iM116965d)) {
            return true;
        }
        Long l3 = bkj0VarM48071i.f77081a;
        l3.getClass();
        return pzi0.m174439D(l3.longValue()) && bkj0VarM48071i.f77083c.intValue() < 1;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final String m48075m(@NotNull Date date) {
        date.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd:HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String str = simpleDateFormat.format(date);
        try {
            str.getClass();
            List listSplit$default = StringsKt.split$default(str, new String[]{":"}, false, 0, 6, null);
            int i = Integer.parseInt((String) listSplit$default.get(0));
            int i2 = Integer.parseInt((String) listSplit$default.get(1));
            String str2 = (String) listSplit$default.get(2);
            String str3 = (String) listSplit$default.get(3);
            if (i <= 1) {
                return listSplit$default.get(1) + ":" + str2 + ":" + str3;
            }
            int i3 = ((i - 1) * 24) + i2;
            if (i3 < 10) {
                return "0" + i3 + ":" + str2 + ":" + str3;
            }
            return i3 + ":" + str2 + ":" + str3;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [B, java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [C, java.lang.Integer, java.lang.Object] */
    /* JADX INFO: renamed from: n */
    public final void m48076n(wyd0 savedString) {
        String str;
        String str2 = savedString.get();
        str2.getClass();
        bkj0<Long, Integer, Integer> bkj0VarM48071i = m48071i(str2);
        Long l2 = bkj0VarM48071i.f77081a;
        l2.getClass();
        if (pzi0.m174439D(l2.longValue())) {
            Long l3 = bkj0VarM48071i.f77081a;
            Integer num = bkj0VarM48071i.f77082b;
            ?? ValueOf = Integer.valueOf(bkj0VarM48071i.f77083c.intValue() + 1);
            bkj0VarM48071i.f77083c = ValueOf;
            str = l3 + "_" + num + "_" + ((Object) ValueOf);
        } else {
            long jM174454o = pzi0.m174454o();
            ?? ValueOf2 = Integer.valueOf(bkj0VarM48071i.f77082b.intValue() + 1);
            bkj0VarM48071i.f77082b = ValueOf2;
            str = jM174454o + "_" + ((Object) ValueOf2) + "_1";
        }
        savedString.put(str);
    }
}
