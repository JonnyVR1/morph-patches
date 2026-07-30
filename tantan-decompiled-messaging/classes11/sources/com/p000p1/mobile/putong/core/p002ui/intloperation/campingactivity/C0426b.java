package com.p000p1.mobile.putong.core.p002ui.intloperation.campingactivity;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.p000p1.mobile.putong.core.p002ui.intloperation.campingactivity.C0426b;
import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.IntlCampingConfigEnvelope;
import com.p1.mobile.putong.core.data.IntlCampingEnvelope;
import com.p1.mobile.putong.core.data.IntlCampingRequestParams;
import com.p1.mobile.putong.core.ui.match.MatchAct;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import l.hpd0;
import l.j760;
import l.qib0;
import l.vwb;
import l.w9j;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.intloperation.campingactivity.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0003J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001f\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/p1/mobile/putong/core/ui/intloperation/campingactivity/b;", "", "<init>", "()V", "", "f", "()Ljava/lang/String;", "Ll/hpd0;", "h", "()Ll/hpd0;", "Lcom/p1/mobile/android/app/Act;", "act", "", "source", "", "i", "(Lcom/p1/mobile/android/app/Act;I)V", "from", "e", "(I)V", "l", "option", "m", "(Ljava/lang/String;)V", "config", "k", "(Ljava/lang/String;)I", "a", "Lkotlin/Lazy;", "g", "()I", "swipeCount", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C0426b {

    @NotNull
    public static final C0426b INSTANCE = new C0426b();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy swipeCount = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.l3n
        public final Object invoke() {
            return Integer.valueOf(C0426b.m8366a());
        }
    });

    /* JADX INFO: renamed from: a */
    public static int m8366a() {
        return INSTANCE.m8376k("intl_camping_config");
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m8367b(int i) {
        return Boolean.valueOf(qib0.f0 == i);
    }

    /* JADX INFO: renamed from: d */
    public static Unit m8369d(final Act act, final int i, IntlCampingEnvelope intlCampingEnvelope) {
        intlCampingEnvelope.getClass();
        if (TextUtils.isEmpty(intlCampingEnvelope.data.type)) {
            CoreModule.c.z1.o3(act, new Function1() { // from class: l.o3n
                public final Object invoke(Object obj) {
                    return C0426b.m8370j(act, i, (IntlCampingConfigEnvelope) obj);
                }
            });
        } else {
            act.startActivityWithCustomTransition(IntlCampingAct.INSTANCE.m8337a(act, intlCampingEnvelope), new MatchAct.b());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m8370j(Act act, int i, IntlCampingConfigEnvelope intlCampingConfigEnvelope) {
        intlCampingConfigEnvelope.getClass();
        new C0425a(act).m8365s(intlCampingConfigEnvelope.data, i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public final void m8371e(int from) {
        zvf0.A("e_petsactivities_show", "p_activities_pets_page", new j760[]{vwb.Y("show_source", String.valueOf(from)), vwb.Y("activities_type", "camping")});
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m8372f() {
        return "core_intl_camping_entrance_anim.svga";
    }

    /* JADX INFO: renamed from: g */
    public final int m8373g() {
        return ((Number) swipeCount.getValue()).intValue();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final hpd0 m8374h() {
        return new hpd0("camping_is_upload_" + CoreModule.H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: i */
    public final void m8375i(@NotNull final Act act, final int source) {
        act.getClass();
        IntlCampingRequestParams intlCampingRequestParams = new IntlCampingRequestParams();
        intlCampingRequestParams.mcc = String.valueOf(qib0.f0);
        CoreModule.c.z1.p3(act, intlCampingRequestParams, new Function1() { // from class: l.m3n
            public final Object invoke(Object obj) {
                return C0426b.m8369d(act, source, (IntlCampingEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final int m8376k(String config) {
        try {
            String strM9623F = RemoteConfig.m9619x().m9623F(config);
            strM9623F.getClass();
            JSONObject jSONObject = new JSONObject(strM9623F);
            return (jSONObject.getBoolean("enable") && vwb.m(JSON.parseArray(jSONObject.getString("mcc"), Integer.TYPE), new w9j() { // from class: l.n3n
                public final Object call(Object obj) {
                    return C0426b.m8367b(((Integer) obj).intValue());
                }
            })) ? 1 : -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m8377l() {
        zvf0.u("e_petactivities_click", "p_activities_pets_page", new j760[]{vwb.Y("activities_type", "camping")});
    }

    /* JADX INFO: renamed from: m */
    public final void m8378m(@NotNull String option) {
        option.getClass();
        try {
            zvf0.A("e_petactivities_success", "p_activities_pets_page", new j760[]{vwb.Y("activities_type", "camping"), vwb.Y("activities_options", Integer.valueOf(Integer.parseInt(option)))});
        } catch (Exception unused) {
        }
    }
}
