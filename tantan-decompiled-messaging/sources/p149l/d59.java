package p149l;

import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.data.IntlCampingConfigData;
import com.p046p1.mobile.putong.core.data.IntlCampingConfigEnvelope;
import com.p046p1.mobile.putong.core.data.IntlCampingEnvelope;
import com.p046p1.mobile.putong.core.data.IntlCampingQuestionsData;
import com.p046p1.mobile.putong.core.data.IntlCampingRequestParams;
import com.p046p1.mobile.putong.core.data.IntlCampingSummaryData;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ@\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\u0014\u0010\u000eJ\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00152\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010!\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u001b¨\u0006\""}, m87232d2 = {"Ll/d59;", "Ll/ax6;", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lkotlin/Function1;", "Lcom/p1/mobile/putong/core/data/IntlCampingConfigEnvelope;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, LovePlanetStage.result, "", "callback", "q3", "(Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function1;)V", "Lcom/p1/mobile/putong/core/data/IntlCampingRequestParams;", "data", "Lcom/p1/mobile/putong/core/data/IntlCampingEnvelope;", "p3", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/IntlCampingRequestParams;Lkotlin/jvm/functions/Function1;)V", "o3", "Lrx/c;", "k3", "()Lrx/c;", "m3", "(Lcom/p1/mobile/putong/core/data/IntlCampingRequestParams;)Lrx/c;", "r3", "(Lcom/p1/mobile/putong/core/data/IntlCampingConfigEnvelope;)V", "R", "Lcom/p1/mobile/putong/core/data/IntlCampingConfigEnvelope;", "j3", "()Lcom/p1/mobile/putong/core/data/IntlCampingConfigEnvelope;", "setCampingConfig", "campingConfig", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class d59 extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @Nullable
    public IntlCampingConfigEnvelope campingConfig;

    /* JADX INFO: renamed from: a3 */
    public static C22306c m110021a3(final IntlCampingRequestParams intlCampingRequestParams) {
        return ia20.m135119c(new v9j() { // from class: l.c59
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return d59.m110031n3(intlCampingRequestParams);
            }
        }, IntlCampingEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: c3 */
    public static void m110023c3(Throwable th) {
    }

    /* JADX INFO: renamed from: e3 */
    public static void m110025e3(Function1 function1, IntlCampingEnvelope intlCampingEnvelope) {
        intlCampingEnvelope.getClass();
        function1.invoke(intlCampingEnvelope);
    }

    /* JADX INFO: renamed from: f3 */
    public static Unit m110026f3(Function1 function1, IntlCampingConfigEnvelope intlCampingConfigEnvelope) {
        intlCampingConfigEnvelope.getClass();
        function1.invoke(intlCampingConfigEnvelope);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g3 */
    public static C22306c m110027g3() {
        return ia20.m135119c(new v9j() { // from class: l.b59
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return d59.m110030l3();
            }
        }, IntlCampingConfigEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: h3 */
    public static void m110028h3(d59 d59Var, Function1 function1, IntlCampingConfigEnvelope intlCampingConfigEnvelope) {
        intlCampingConfigEnvelope.getClass();
        d59Var.m110038r3(intlCampingConfigEnvelope);
        function1.invoke(intlCampingConfigEnvelope);
        d59Var.campingConfig = intlCampingConfigEnvelope;
    }

    /* JADX INFO: renamed from: i3 */
    public static void m110029i3(Throwable th) {
    }

    /* JADX INFO: renamed from: l3 */
    public static final stc0 m110030l3() {
        return C4728a.f19494P.auth().m185898q(C4728a.m31319l()).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: n3 */
    public static final stc0 m110031n3(IntlCampingRequestParams intlCampingRequestParams) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31319l()).m185893l(utc0.create(Network.JSON, intlCampingRequestParams.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: q3 */
    private final void m110032q3(Act act, final Function1<? super IntlCampingConfigEnvelope, Unit> callback) {
        C22306c c22306cDuringCreated = act.duringCreated(m110034k3());
        if (c22306cDuringCreated != null) {
            c22306cDuringCreated.subscribe(mkd0.m154956H(new e30() { // from class: l.x49
                @Override // p149l.e30
                public final void call(Object obj) {
                    d59.m110028h3(this.f190952a, callback, (IntlCampingConfigEnvelope) obj);
                }
            }, new e30() { // from class: l.y49
                @Override // p149l.e30
                public final void call(Object obj) {
                    d59.m110023c3((Throwable) obj);
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
    public final C22306c<IntlCampingConfigEnvelope> m110034k3() {
        C22306c<IntlCampingConfigEnvelope> c22306cScheduled = CoreModule.f17545c.scheduled("camping-config-query", 0, new v9j() { // from class: l.a59
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return d59.m110027g3();
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }

    /* JADX INFO: renamed from: m3 */
    public final C22306c<IntlCampingEnvelope> m110035m3(final IntlCampingRequestParams data) {
        C22306c<IntlCampingEnvelope> c22306cScheduled = CoreModule.f17545c.scheduled("camping-setting-query", -1, new v9j() { // from class: l.z49
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return d59.m110021a3(data);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }

    /* JADX INFO: renamed from: o3 */
    public final void m110036o3(@NotNull Act act, @NotNull final Function1<? super IntlCampingConfigEnvelope, Unit> callback) {
        act.getClass();
        callback.getClass();
        if (!NullChecker.m81303a(CoreModule.f17545c.f19703z1.campingConfig)) {
            CoreModule.f17545c.f19703z1.m110032q3(act, new Function1() { // from class: l.u49
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d59.m110026f3(callback, (IntlCampingConfigEnvelope) obj);
                }
            });
            return;
        }
        IntlCampingConfigEnvelope intlCampingConfigEnvelope = CoreModule.f17545c.f19703z1.campingConfig;
        if (intlCampingConfigEnvelope != null) {
            callback.invoke(intlCampingConfigEnvelope);
        }
    }

    /* JADX INFO: renamed from: p3 */
    public final void m110037p3(@NotNull Act act, @NotNull IntlCampingRequestParams data, @NotNull final Function1<? super IntlCampingEnvelope, Unit> callback) {
        act.getClass();
        data.getClass();
        callback.getClass();
        C22306c c22306cDuringCreated = act.duringCreated(m110035m3(data));
        if (c22306cDuringCreated != null) {
            c22306cDuringCreated.subscribe(mkd0.m154956H(new e30() { // from class: l.v49
                @Override // p149l.e30
                public final void call(Object obj) {
                    d59.m110025e3(callback, (IntlCampingEnvelope) obj);
                }
            }, new e30() { // from class: l.w49
                @Override // p149l.e30
                public final void call(Object obj) {
                    d59.m110029i3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r3 */
    public final void m110038r3(IntlCampingConfigEnvelope result) {
        IntlCampingConfigData intlCampingConfigData;
        List<IntlCampingQuestionsData> list;
        IntlCampingQuestionsData intlCampingQuestionsData;
        IntlCampingConfigData intlCampingConfigData2;
        IntlCampingSummaryData intlCampingSummaryData;
        if (result != null && (intlCampingConfigData2 = result.data) != null && (intlCampingSummaryData = intlCampingConfigData2.summary) != null) {
            qib0.f154691G.m102377x0(intlCampingSummaryData.bg_url);
            qib0.f154691G.m102377x0(intlCampingSummaryData.heading_url);
            qib0.f154691G.m102377x0(intlCampingSummaryData.logo_url);
            qib0.f154691G.m102377x0(intlCampingSummaryData.question_bg_url);
        }
        if (result == null || (intlCampingConfigData = result.data) == null || (list = intlCampingConfigData.questions) == null || list.size() <= 0 || (intlCampingQuestionsData = list.get(0)) == null) {
            return;
        }
        qib0.f154691G.m102377x0(intlCampingQuestionsData.bg_url);
        qib0.f154691G.m102377x0(intlCampingQuestionsData.opt_bg_url);
        qib0.f154691G.m102377x0(intlCampingQuestionsData.opt_focus_logo_url);
        qib0.f154691G.m102377x0(intlCampingQuestionsData.opt_focus_bg_url);
    }
}
