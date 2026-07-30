package p153l;

import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.data.IntlCampingConfigData;
import com.p051p1.mobile.putong.core.data.IntlCampingConfigEnvelope;
import com.p051p1.mobile.putong.core.data.IntlCampingEnvelope;
import com.p051p1.mobile.putong.core.data.IntlCampingQuestionsData;
import com.p051p1.mobile.putong.core.data.IntlCampingRequestParams;
import com.p051p1.mobile.putong.core.data.IntlCampingSummaryData;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ@\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\u0014\u0010\u000eJ\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00152\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010!\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u001b¨\u0006\""}, m88121d2 = {"Ll/m69;", "Ll/dy6;", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lkotlin/Function1;", "Lcom/p1/mobile/putong/core/data/IntlCampingConfigEnvelope;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, LovePlanetStage.result, "", "callback", "q3", "(Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function1;)V", "Lcom/p1/mobile/putong/core/data/IntlCampingRequestParams;", "data", "Lcom/p1/mobile/putong/core/data/IntlCampingEnvelope;", "p3", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/IntlCampingRequestParams;Lkotlin/jvm/functions/Function1;)V", "o3", "Lrx/c;", "k3", "()Lrx/c;", "m3", "(Lcom/p1/mobile/putong/core/data/IntlCampingRequestParams;)Lrx/c;", "r3", "(Lcom/p1/mobile/putong/core/data/IntlCampingConfigEnvelope;)V", "R", "Lcom/p1/mobile/putong/core/data/IntlCampingConfigEnvelope;", "j3", "()Lcom/p1/mobile/putong/core/data/IntlCampingConfigEnvelope;", "setCampingConfig", "campingConfig", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class m69 extends dy6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @Nullable
    public IntlCampingConfigEnvelope campingConfig;

    /* JADX INFO: renamed from: a3 */
    public static C22421c m157191a3(final IntlCampingRequestParams intlCampingRequestParams) {
        return qi20.m176656c(new pcj() { // from class: l.l69
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return m69.m157201n3(intlCampingRequestParams);
            }
        }, IntlCampingEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: c3 */
    public static void m157193c3(Throwable th) {
    }

    /* JADX INFO: renamed from: e3 */
    public static void m157195e3(Function1 function1, IntlCampingEnvelope intlCampingEnvelope) {
        intlCampingEnvelope.getClass();
        function1.invoke(intlCampingEnvelope);
    }

    /* JADX INFO: renamed from: f3 */
    public static Unit m157196f3(Function1 function1, IntlCampingConfigEnvelope intlCampingConfigEnvelope) {
        intlCampingConfigEnvelope.getClass();
        function1.invoke(intlCampingConfigEnvelope);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g3 */
    public static C22421c m157197g3() {
        return qi20.m176656c(new pcj() { // from class: l.k69
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return m69.m157200l3();
            }
        }, IntlCampingConfigEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: h3 */
    public static void m157198h3(m69 m69Var, Function1 function1, IntlCampingConfigEnvelope intlCampingConfigEnvelope) {
        intlCampingConfigEnvelope.getClass();
        m69Var.m157208r3(intlCampingConfigEnvelope);
        function1.invoke(intlCampingConfigEnvelope);
        m69Var.campingConfig = intlCampingConfigEnvelope;
    }

    /* JADX INFO: renamed from: i3 */
    public static void m157199i3(Throwable th) {
    }

    /* JADX INFO: renamed from: l3 */
    public static final x1d0 m157200l3() {
        return C4879a.f20236P.auth().m209043q(C4879a.m32322l()).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: n3 */
    public static final x1d0 m157201n3(IntlCampingRequestParams intlCampingRequestParams) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32322l()).m209038l(z1d0.create(Network.JSON, intlCampingRequestParams.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: q3 */
    private final void m157202q3(Act act, final Function1<? super IntlCampingConfigEnvelope, Unit> callback) {
        C22421c c22421cDuringCreated = act.duringCreated(m157204k3());
        if (c22421cDuringCreated != null) {
            c22421cDuringCreated.subscribe(psd0.m173597H(new y20() { // from class: l.g69
                @Override // p153l.y20
                public final void call(Object obj) {
                    m69.m157198h3(this.f102401a, callback, (IntlCampingConfigEnvelope) obj);
                }
            }, new y20() { // from class: l.h69
                @Override // p153l.y20
                public final void call(Object obj) {
                    m69.m157193c3((Throwable) obj);
                }
            }));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: j3, reason: from getter */
    public final IntlCampingConfigEnvelope getCampingConfig() {
        return this.campingConfig;
    }

    /* JADX INFO: renamed from: k3 */
    public final C22421c<IntlCampingConfigEnvelope> m157204k3() {
        C22421c<IntlCampingConfigEnvelope> c22421cScheduled = CoreModule.f18264c.scheduled("camping-config-query", 0, new pcj() { // from class: l.j69
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return m69.m157197g3();
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    /* JADX INFO: renamed from: m3 */
    public final C22421c<IntlCampingEnvelope> m157205m3(final IntlCampingRequestParams data) {
        C22421c<IntlCampingEnvelope> c22421cScheduled = CoreModule.f18264c.scheduled("camping-setting-query", -1, new pcj() { // from class: l.i69
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return m69.m157191a3(data);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    /* JADX INFO: renamed from: o3 */
    public final void m157206o3(@NotNull Act act, @NotNull final Function1<? super IntlCampingConfigEnvelope, Unit> callback) {
        act.getClass();
        callback.getClass();
        if (!NullChecker.m82486a(CoreModule.f18264c.f20445z1.campingConfig)) {
            CoreModule.f18264c.f20445z1.m157202q3(act, new Function1() { // from class: l.d69
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m69.m157196f3(callback, (IntlCampingConfigEnvelope) obj);
                }
            });
            return;
        }
        IntlCampingConfigEnvelope intlCampingConfigEnvelope = CoreModule.f18264c.f20445z1.campingConfig;
        if (intlCampingConfigEnvelope != null) {
            callback.invoke(intlCampingConfigEnvelope);
        }
    }

    /* JADX INFO: renamed from: p3 */
    public final void m157207p3(@NotNull Act act, @NotNull IntlCampingRequestParams data, @NotNull final Function1<? super IntlCampingEnvelope, Unit> callback) {
        act.getClass();
        data.getClass();
        callback.getClass();
        C22421c c22421cDuringCreated = act.duringCreated(m157205m3(data));
        if (c22421cDuringCreated != null) {
            c22421cDuringCreated.subscribe(psd0.m173597H(new y20() { // from class: l.e69
                @Override // p153l.y20
                public final void call(Object obj) {
                    m69.m157195e3(callback, (IntlCampingEnvelope) obj);
                }
            }, new y20() { // from class: l.f69
                @Override // p153l.y20
                public final void call(Object obj) {
                    m69.m157199i3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r3 */
    public final void m157208r3(IntlCampingConfigEnvelope result) {
        IntlCampingConfigData intlCampingConfigData;
        List<IntlCampingQuestionsData> list;
        IntlCampingQuestionsData intlCampingQuestionsData;
        IntlCampingConfigData intlCampingConfigData2;
        IntlCampingSummaryData intlCampingSummaryData;
        if (result != null && (intlCampingConfigData2 = result.data) != null && (intlCampingSummaryData = intlCampingConfigData2.summary) != null) {
            uqb0.f180374G.m127160x0(intlCampingSummaryData.bg_url);
            uqb0.f180374G.m127160x0(intlCampingSummaryData.heading_url);
            uqb0.f180374G.m127160x0(intlCampingSummaryData.logo_url);
            uqb0.f180374G.m127160x0(intlCampingSummaryData.question_bg_url);
        }
        if (result == null || (intlCampingConfigData = result.data) == null || (list = intlCampingConfigData.questions) == null || list.size() <= 0 || (intlCampingQuestionsData = list.get(0)) == null) {
            return;
        }
        uqb0.f180374G.m127160x0(intlCampingQuestionsData.bg_url);
        uqb0.f180374G.m127160x0(intlCampingQuestionsData.opt_bg_url);
        uqb0.f180374G.m127160x0(intlCampingQuestionsData.opt_focus_logo_url);
        uqb0.f180374G.m127160x0(intlCampingQuestionsData.opt_focus_bg_url);
    }
}
