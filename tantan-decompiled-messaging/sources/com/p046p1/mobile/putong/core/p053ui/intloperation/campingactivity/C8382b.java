package com.p046p1.mobile.putong.core.p053ui.intloperation.campingactivity;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.IntlCampingConfigEnvelope;
import com.p046p1.mobile.putong.core.data.IntlCampingEnvelope;
import com.p046p1.mobile.putong.core.data.IntlCampingRequestParams;
import com.p046p1.mobile.putong.core.data.Option;
import com.p046p1.mobile.putong.core.p053ui.intloperation.campingactivity.C8382b;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p149l.hpd0;
import p149l.qib0;
import p149l.vwb;
import p149l.w9j;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.intloperation.campingactivity.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0003J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001f\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/intloperation/campingactivity/b;", "", "<init>", "()V", "", "f", "()Ljava/lang/String;", "Ll/hpd0;", "h", "()Ll/hpd0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "source", "", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/android/app/Act;I)V", "from", "e", "(I)V", BLiveStormDanmakuGiftResourceType.f44444l, Option.TYPE, "m", "(Ljava/lang/String;)V", Constants.KEY_CONFIG, "k", "(Ljava/lang/String;)I", "a", "Lkotlin/Lazy;", "g", "()I", "swipeCount", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class C8382b {

    @NotNull
    public static final C8382b INSTANCE = new C8382b();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy swipeCount = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.l3n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(C8382b.m46278a());
        }
    });

    /* JADX INFO: renamed from: a */
    public static int m46278a() {
        return INSTANCE.m46288k("intl_camping_config");
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m46279b(int i) {
        return Boolean.valueOf(qib0.f154717f0 == i);
    }

    /* JADX INFO: renamed from: d */
    public static Unit m46281d(final Act act, final int i, IntlCampingEnvelope intlCampingEnvelope) {
        intlCampingEnvelope.getClass();
        if (TextUtils.isEmpty(intlCampingEnvelope.data.type)) {
            CoreModule.f17545c.f19703z1.m110036o3(act, new Function1() { // from class: l.o3n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C8382b.m46282j(act, i, (IntlCampingConfigEnvelope) obj);
                }
            });
        } else {
            act.startActivityWithCustomTransition(IntlCampingAct.INSTANCE.m46249a(act, intlCampingEnvelope), new MatchAct.C8454b());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m46282j(Act act, int i, IntlCampingConfigEnvelope intlCampingConfigEnvelope) {
        intlCampingConfigEnvelope.getClass();
        new C8381a(act).m46277s(intlCampingConfigEnvelope.data, i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public final void m46283e(int from) {
        zvf0.m220368A("e_petsactivities_show", "p_activities_pets_page", vwb.m200311Y("show_source", String.valueOf(from)), vwb.m200311Y("activities_type", "camping"));
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m46284f() {
        return "core_intl_camping_entrance_anim.svga";
    }

    /* JADX INFO: renamed from: g */
    public final int m46285g() {
        return ((Number) swipeCount.getValue()).intValue();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final hpd0 m46286h() {
        return new hpd0("camping_is_upload_" + CoreModule.m29931H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: i */
    public final void m46287i(@NotNull final Act act, final int source) {
        act.getClass();
        IntlCampingRequestParams intlCampingRequestParams = new IntlCampingRequestParams();
        intlCampingRequestParams.mcc = String.valueOf(qib0.f154717f0);
        CoreModule.f17545c.f19703z1.m110037p3(act, intlCampingRequestParams, new Function1() { // from class: l.m3n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8382b.m46281d(act, source, (IntlCampingEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final int m46288k(String config) {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F(config);
            strM79302F.getClass();
            JSONObject jSONObject = new JSONObject(strM79302F);
            return (jSONObject.getBoolean("enable") && vwb.m200337m(JSON.parseArray(jSONObject.getString("mcc"), Integer.TYPE), new w9j() { // from class: l.n3n
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return C8382b.m46279b(((Integer) obj).intValue());
                }
            })) ? 1 : -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m46289l() {
        zvf0.m220399u("e_petactivities_click", "p_activities_pets_page", vwb.m200311Y("activities_type", "camping"));
    }

    /* JADX INFO: renamed from: m */
    public final void m46290m(@NotNull String option) {
        option.getClass();
        try {
            zvf0.m220368A("e_petactivities_success", "p_activities_pets_page", vwb.m200311Y("activities_type", "camping"), vwb.m200311Y("activities_options", Integer.valueOf(Integer.parseInt(option))));
        } catch (Exception unused) {
        }
    }
}
