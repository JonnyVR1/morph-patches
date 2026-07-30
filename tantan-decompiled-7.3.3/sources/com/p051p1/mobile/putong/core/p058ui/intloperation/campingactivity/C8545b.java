package com.p051p1.mobile.putong.core.p058ui.intloperation.campingactivity;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.IntlCampingConfigEnvelope;
import com.p051p1.mobile.putong.core.data.IntlCampingEnvelope;
import com.p051p1.mobile.putong.core.data.IntlCampingRequestParams;
import com.p051p1.mobile.putong.core.data.Option;
import com.p051p1.mobile.putong.core.p058ui.intloperation.campingactivity.C8545b;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p153l.i4g0;
import p153l.jxd0;
import p153l.jyb;
import p153l.qcj;
import p153l.uqb0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.intloperation.campingactivity.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0003J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001f\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/intloperation/campingactivity/b;", "", "<init>", "()V", "", "f", "()Ljava/lang/String;", "Ll/jxd0;", "h", "()Ll/jxd0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "source", "", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/android/app/Act;I)V", "from", "e", "(I)V", BLiveStormDanmakuGiftResourceType.f45292l, Option.TYPE, "m", "(Ljava/lang/String;)V", Constants.KEY_CONFIG, "k", "(Ljava/lang/String;)I", "a", "Lkotlin/Lazy;", "g", "()I", "swipeCount", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class C8545b {

    @NotNull
    public static final C8545b INSTANCE = new C8545b();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy swipeCount = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.l5n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(C8545b.m47461a());
        }
    });

    /* JADX INFO: renamed from: a */
    public static int m47461a() {
        return INSTANCE.m47471k("intl_camping_config");
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m47462b(int i) {
        return Boolean.valueOf(uqb0.f180400f0 == i);
    }

    /* JADX INFO: renamed from: d */
    public static Unit m47464d(final Act act, final int i, IntlCampingEnvelope intlCampingEnvelope) {
        intlCampingEnvelope.getClass();
        if (TextUtils.isEmpty(intlCampingEnvelope.data.type)) {
            CoreModule.f18264c.f20445z1.m157206o3(act, new Function1() { // from class: l.o5n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C8545b.m47465j(act, i, (IntlCampingConfigEnvelope) obj);
                }
            });
        } else {
            act.startActivityWithCustomTransition(IntlCampingAct.INSTANCE.m47432a(act, intlCampingEnvelope), new MatchAct.C8617b());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m47465j(Act act, int i, IntlCampingConfigEnvelope intlCampingConfigEnvelope) {
        intlCampingConfigEnvelope.getClass();
        new C8544a(act).m47460s(intlCampingConfigEnvelope.data, i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public final void m47466e(int from) {
        i4g0.m138492A("e_petsactivities_show", "p_activities_pets_page", jyb.m147494Y("show_source", String.valueOf(from)), jyb.m147494Y("activities_type", "camping"));
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m47467f() {
        return "core_intl_camping_entrance_anim.svga";
    }

    /* JADX INFO: renamed from: g */
    public final int m47468g() {
        return ((Number) swipeCount.getValue()).intValue();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final jxd0 m47469h() {
        return new jxd0("camping_is_upload_" + CoreModule.m30929H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: i */
    public final void m47470i(@NotNull final Act act, final int source) {
        act.getClass();
        IntlCampingRequestParams intlCampingRequestParams = new IntlCampingRequestParams();
        intlCampingRequestParams.mcc = String.valueOf(uqb0.f180400f0);
        CoreModule.f18264c.f20445z1.m157207p3(act, intlCampingRequestParams, new Function1() { // from class: l.m5n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8545b.m47464d(act, source, (IntlCampingEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final int m47471k(String config) {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F(config);
            strM80485F.getClass();
            JSONObject jSONObject = new JSONObject(strM80485F);
            return (jSONObject.getBoolean("enable") && jyb.m147520m(JSON.parseArray(jSONObject.getString("mcc"), Integer.TYPE), new qcj() { // from class: l.n5n
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return C8545b.m47462b(((Integer) obj).intValue());
                }
            })) ? 1 : -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m47472l() {
        i4g0.m138523u("e_petactivities_click", "p_activities_pets_page", jyb.m147494Y("activities_type", "camping"));
    }

    /* JADX INFO: renamed from: m */
    public final void m47473m(@NotNull String option) {
        option.getClass();
        try {
            i4g0.m138492A("e_petactivities_success", "p_activities_pets_page", jyb.m147494Y("activities_type", "camping"), jyb.m147494Y("activities_options", Integer.valueOf(Integer.parseInt(option))));
        } catch (Exception unused) {
        }
    }
}
