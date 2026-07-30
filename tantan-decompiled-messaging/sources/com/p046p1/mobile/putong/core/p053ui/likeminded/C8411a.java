package com.p046p1.mobile.putong.core.p053ui.likeminded;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.LikeMindedConfigData;
import com.p046p1.mobile.putong.core.data.LikeMindedData;
import com.p046p1.mobile.putong.core.data.LikeMindedEnvelope;
import com.p046p1.mobile.putong.core.data.LikeMindedItemData;
import com.p046p1.mobile.putong.core.data.LikeMindedItemLanguagesData;
import com.p046p1.mobile.putong.core.data.LikeMindedItemStatusData;
import com.p046p1.mobile.putong.core.data.LikeMindedRequestParams;
import com.p046p1.mobile.putong.core.p053ui.likeminded.C8411a;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p149l.ber;
import p149l.cwf0;
import p149l.i0e;
import p149l.idr;
import p149l.mqi0;
import p149l.ndr;
import p149l.qib0;
import p149l.qqi0;
import p149l.uqd0;
import p149l.xaj0;
import p149l.xck0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.likeminded.a */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u0003J\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J)\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0)2\u0006\u0010(\u001a\u00020\u001fH\u0002¢\u0006\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0017\u00104\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u00106\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b2\u00101\u001a\u0004\b5\u00103¨\u00067"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/likeminded/a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "remain", "", Active.TYPE, "Lkotlin/Function0;", "inActive", "j", "(Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "", "isActive", "f", "(Lcom/p1/mobile/android/app/Act;Z)V", "Ll/cwf0;", "pageHelper", "h", "(Ll/cwf0;)V", "g", "e", "(Lcom/p1/mobile/android/app/Act;)V", "k", "Ljava/util/Date;", "date", "", "m", "(Ljava/util/Date;)Ljava/lang/String;", BLiveStormDanmakuGiftResourceType.f44444l, "()Z", "Ll/uqd0;", "savedString", "n", "(Ll/uqd0;)V", "str", "Ll/xaj0;", "", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)Ll/xaj0;", "a", "Ll/uqd0;", "likeMindedReminderNum", "b", "Ll/cwf0;", "c", "()Ll/cwf0;", "pageHelper_finding", Constants.INAPP_DATA_TAG, "pageHelper_setting", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class C8411a {

    @NotNull
    public static final C8411a INSTANCE = new C8411a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final uqd0 likeMindedReminderNum = new uqd0("like_minded_reminder_num_" + CoreModule.m29931H().userId(), "0_0_0");

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final cwf0 pageHelper_finding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final cwf0 pageHelper_setting;

    static {
        cwf0 cwf0VarM133794c = i0e.m133794c("p_same_making_after_page", ber.class.getName());
        cwf0VarM133794c.getClass();
        pageHelper_finding = cwf0VarM133794c;
        cwf0 cwf0VarM133794c2 = i0e.m133794c("p_same_making_page", ber.class.getName());
        cwf0VarM133794c2.getClass();
        pageHelper_setting = cwf0VarM133794c2;
    }

    /* JADX INFO: renamed from: a */
    public static Unit m46880a(Function1 function1, Function0 function0, LikeMindedEnvelope likeMindedEnvelope) {
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
    public static Unit m46881b(boolean z, Act act, LikeMindedEnvelope likeMindedEnvelope) {
        Map<String, LikeMindedItemLanguagesData> map;
        LikeMindedItemLanguagesData likeMindedItemLanguagesData;
        Map<String, LikeMindedItemLanguagesData> map2;
        LikeMindedItemLanguagesData likeMindedItemLanguagesData2;
        likeMindedEnvelope.getClass();
        LikeMindedData likeMindedData = likeMindedEnvelope.data;
        if (z) {
            if (likeMindedData.active) {
                idr idrVar = idr.INSTANCE;
                LikeMindedConfigData likeMindedConfigDataM135618c = idrVar.m135625j() ? idrVar.m135618c() : idrVar.m135621f();
                if (likeMindedConfigDataM135618c != null) {
                    if (likeMindedConfigDataM135618c.mcc.containsKey(String.valueOf(qib0.f154717f0)) && likeMindedConfigDataM135618c.mcc.get(String.valueOf(qib0.f154717f0)) != null) {
                        LikeMindedItemData likeMindedItemData = likeMindedConfigDataM135618c.same.get(likeMindedEnvelope.data.type);
                        LikeMindedItemStatusData likeMindedItemStatusData = null;
                        LikeMindedItemStatusData likeMindedItemStatusData2 = (likeMindedItemData == null || (map2 = likeMindedItemData.multiLanguage) == null || (likeMindedItemLanguagesData2 = map2.get(idrVar.m135620e())) == null) ? null : likeMindedItemLanguagesData2.status;
                        if (likeMindedItemStatusData2 == null) {
                            LikeMindedItemData likeMindedItemData2 = likeMindedConfigDataM135618c.same.get(likeMindedEnvelope.data.type);
                            if (likeMindedItemData2 != null && (map = likeMindedItemData2.multiLanguage) != null && (likeMindedItemLanguagesData = map.get("en-US")) != null) {
                                likeMindedItemStatusData = likeMindedItemLanguagesData.status;
                            }
                            likeMindedItemStatusData2 = likeMindedItemStatusData;
                        }
                        if (likeMindedItemStatusData2 != null) {
                            new ndr(act).m159040o(likeMindedItemStatusData2, likeMindedEnvelope);
                        }
                    }
                }
            } else {
                INSTANCE.m46884e(act);
            }
        } else if (!likeMindedData.active) {
            C8411a c8411a = INSTANCE;
            if (c8411a.m46891l()) {
                c8411a.m46884e(act);
                c8411a.m46893n(likeMindedReminderNum);
            }
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final cwf0 m46882c() {
        return pageHelper_finding;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final cwf0 m46883d() {
        return pageHelper_setting;
    }

    /* JADX INFO: renamed from: e */
    public final void m46884e(@NotNull Act act) {
        act.getClass();
        act.startActivityWithCustomTransition(LikeMindedAct.INSTANCE.m46876a(act), new MatchAct.C8454b());
    }

    /* JADX INFO: renamed from: f */
    public final void m46885f(@NotNull final Act act, final boolean isActive) {
        act.getClass();
        LikeMindedRequestParams likeMindedRequestParams = new LikeMindedRequestParams();
        likeMindedRequestParams.f20431me = CoreModule.m29931H().userId();
        likeMindedRequestParams.mcc = String.valueOf(qib0.f154717f0);
        idr idrVar = idr.INSTANCE;
        if (idrVar.m135625j() || idrVar.m135623h() != -1) {
            if (!isActive) {
                Long l2 = CoreModule.f17545c.f19639e0.f149238P0.get();
                long jM135623h = idrVar.m135623h();
                if (l2 == null || l2.longValue() != jM135623h) {
                    return;
                }
            }
            CoreModule.f17545c.f19700y1.m174007g3(act, likeMindedRequestParams, new Function1() { // from class: l.rdr
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C8411a.m46881b(isActive, act, (LikeMindedEnvelope) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m46886g(@Nullable cwf0 pageHelper) {
        if (pageHelper != null) {
            pageHelper.m109035k();
            pageHelper.m109034j();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m46887h(@Nullable cwf0 pageHelper) {
        if (pageHelper != null) {
            pageHelper.m109033i();
            pageHelper.m109036l();
        }
    }

    /* JADX INFO: renamed from: i */
    public final xaj0<Long, Integer, Integer> m46888i(String str) {
        String[] strArr = (String[]) StringsKt.split$default(str, new String[]{"_"}, false, 0, 6, null).toArray(new String[0]);
        xaj0<Long, Integer, Integer> xaj0VarM207578a = xaj0.m207578a(Long.valueOf(strArr[0]), Integer.valueOf(strArr[1]), Integer.valueOf(strArr[2]));
        xaj0VarM207578a.getClass();
        return xaj0VarM207578a;
    }

    /* JADX INFO: renamed from: j */
    public final void m46889j(@NotNull Act act, @NotNull final Function1<? super Long, Unit> active, @NotNull final Function0<Unit> inActive) {
        act.getClass();
        active.getClass();
        inActive.getClass();
        LikeMindedRequestParams likeMindedRequestParams = new LikeMindedRequestParams();
        likeMindedRequestParams.f20431me = CoreModule.m29931H().userId();
        likeMindedRequestParams.mcc = String.valueOf(qib0.f154717f0);
        CoreModule.f17545c.f19700y1.m174007g3(act, likeMindedRequestParams, new Function1() { // from class: l.sdr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8411a.m46880a(active, inActive, (LikeMindedEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m46890k() {
        likeMindedReminderNum.put("0_0_0");
    }

    /* JADX INFO: renamed from: l */
    public final boolean m46891l() {
        String str = likeMindedReminderNum.get();
        str.getClass();
        xaj0<Long, Integer, Integer> xaj0VarM46888i = m46888i(str);
        Integer num = xaj0VarM46888i.f191752b;
        num.getClass();
        int iM208123d = xck0.m208123d(num.intValue(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
        long jM155944o = mqi0.m155944o();
        Long l2 = xaj0VarM46888i.f191751a;
        l2.getClass();
        if (qqi0.m175940h(jM155944o, l2.longValue(), iM208123d)) {
            return true;
        }
        Long l3 = xaj0VarM46888i.f191751a;
        l3.getClass();
        return mqi0.m155929D(l3.longValue()) && xaj0VarM46888i.f191753c.intValue() < 1;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final String m46892m(@NotNull Date date) {
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
    public final void m46893n(uqd0 savedString) {
        String str;
        String str2 = savedString.get();
        str2.getClass();
        xaj0<Long, Integer, Integer> xaj0VarM46888i = m46888i(str2);
        Long l2 = xaj0VarM46888i.f191751a;
        l2.getClass();
        if (mqi0.m155929D(l2.longValue())) {
            Long l3 = xaj0VarM46888i.f191751a;
            Integer num = xaj0VarM46888i.f191752b;
            ?? ValueOf = Integer.valueOf(xaj0VarM46888i.f191753c.intValue() + 1);
            xaj0VarM46888i.f191753c = ValueOf;
            str = l3 + "_" + num + "_" + ((Object) ValueOf);
        } else {
            long jM155944o = mqi0.m155944o();
            ?? ValueOf2 = Integer.valueOf(xaj0VarM46888i.f191752b.intValue() + 1);
            xaj0VarM46888i.f191752b = ValueOf2;
            str = jM155944o + "_" + ((Object) ValueOf2) + "_1";
        }
        savedString.put(str);
    }
}
