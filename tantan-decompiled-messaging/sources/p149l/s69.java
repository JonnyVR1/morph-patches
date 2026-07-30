package p149l;

import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.data.IntlMarketConfigData;
import com.p046p1.mobile.putong.core.data.IntlMarketConfigEnvelope;
import com.p046p1.mobile.putong.core.data.IntlMarketQuestionData;
import com.p046p1.mobile.putong.core.data.IntlMarketQuestionOptionUIData;
import com.p046p1.mobile.putong.core.data.IntlMarketQuestionUIData;
import com.p046p1.mobile.putong.core.data.IntlMarketRequestParams;
import com.p046p1.mobile.putong.core.data.IntlMarketResponseEnvelope;
import com.p046p1.mobile.putong.core.data.IntlMarketSummaryData;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.tantan.core.base.R$string;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JR\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u0011\u0010\u0012J8\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u0014\u0010\u0015J8\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00172\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010#\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u001dR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020%0$8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020%0$8\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)R\u0016\u00100\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, m87232d2 = {"Ll/s69;", "Ll/ax6;", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/IntlMarketRequestParams;", "data", "Lkotlin/Function0;", "", "onFail", "Lkotlin/Function1;", "Lcom/p1/mobile/putong/core/data/IntlMarketResponseEnvelope;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, LovePlanetStage.result, "callback", "r3", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/IntlMarketRequestParams;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lcom/p1/mobile/putong/core/data/IntlMarketConfigEnvelope;", "t3", "(Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function1;)V", "m3", "Lrx/c;", "n3", "()Lrx/c;", "p3", "(Lcom/p1/mobile/putong/core/data/IntlMarketRequestParams;)Lrx/c;", "u3", "(Lcom/p1/mobile/putong/core/data/IntlMarketConfigEnvelope;)V", "R", "Lcom/p1/mobile/putong/core/data/IntlMarketConfigEnvelope;", "k3", "()Lcom/p1/mobile/putong/core/data/IntlMarketConfigEnvelope;", "setMarketConfig", "marketConfig", "Lrx/subjects/a;", "", j6f.LATITUDE_SOUTH, "Lrx/subjects/a;", "l3", "()Lrx/subjects/a;", "marketConfigIsInitBs", j6f.GPS_DIRECTION_TRUE, "j3", "marketActivityEndBs", "U", "Z", "isPreLoader", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class s69 extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @Nullable
    public IntlMarketConfigEnvelope marketConfig;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public final C22392a<Boolean> marketConfigIsInitBs;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public final C22392a<Boolean> marketActivityEndBs;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public boolean isPreLoader;

    public s69() {
        C22392a<Boolean> c22392aM221512b = C22392a.m221512b();
        c22392aM221512b.getClass();
        this.marketConfigIsInitBs = c22392aM221512b;
        C22392a<Boolean> c22392aM221512b2 = C22392a.m221512b();
        c22392aM221512b2.getClass();
        this.marketActivityEndBs = c22392aM221512b2;
    }

    /* JADX INFO: renamed from: b3 */
    public static void m182422b3(Function0 function0, Throwable th) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: c3 */
    public static Unit m182423c3(Function1 function1, IntlMarketConfigEnvelope intlMarketConfigEnvelope) {
        intlMarketConfigEnvelope.getClass();
        function1.invoke(intlMarketConfigEnvelope);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d3 */
    public static void m182424d3(Throwable th) {
    }

    /* JADX INFO: renamed from: e3 */
    public static void m182425e3(s69 s69Var, Function1 function1, IntlMarketConfigEnvelope intlMarketConfigEnvelope) {
        intlMarketConfigEnvelope.getClass();
        s69Var.m182441u3(intlMarketConfigEnvelope);
        s69Var.marketConfig = intlMarketConfigEnvelope;
        function1.invoke(intlMarketConfigEnvelope);
        C22392a<Boolean> c22392a = s69Var.marketConfigIsInitBs;
        Boolean bool = Boolean.TRUE;
        c22392a.m132487l(bool);
        if (NullChecker.m81303a(intlMarketConfigEnvelope.data)) {
            IntlMarketConfigData intlMarketConfigData = intlMarketConfigEnvelope.data;
            if (NullChecker.m81303a(intlMarketConfigData != null ? intlMarketConfigData.meta : null)) {
                return;
            }
        }
        s69Var.marketActivityEndBs.m132487l(bool);
    }

    /* JADX INFO: renamed from: g3 */
    public static void m182427g3(Function1 function1, IntlMarketResponseEnvelope intlMarketResponseEnvelope) {
        intlMarketResponseEnvelope.getClass();
        function1.invoke(intlMarketResponseEnvelope);
    }

    /* JADX INFO: renamed from: h3 */
    public static C22306c m182428h3() {
        return ia20.m135119c(new v9j() { // from class: l.r69
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return s69.m182430o3();
            }
        }, IntlMarketConfigEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: i3 */
    public static C22306c m182429i3(final IntlMarketRequestParams intlMarketRequestParams) {
        return ia20.m135119c(new v9j() { // from class: l.q69
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return s69.m182431q3(intlMarketRequestParams);
            }
        }, IntlMarketResponseEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: o3 */
    public static final stc0 m182430o3() {
        return C4728a.f19494P.auth().m185898q(C4728a.m31209I0() + "?mcc=" + qib0.f154717f0).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: q3 */
    public static final stc0 m182431q3(IntlMarketRequestParams intlMarketRequestParams) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31209I0()).m185893l(utc0.create(Network.JSON, intlMarketRequestParams.toJson())).m185883b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s3 */
    public static /* synthetic */ void m182432s3(s69 s69Var, Act act, IntlMarketRequestParams intlMarketRequestParams, Function0 function0, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        s69Var.m182439r3(act, intlMarketRequestParams, function0, function1);
    }

    @NotNull
    /* JADX INFO: renamed from: j3 */
    public final C22392a<Boolean> m182433j3() {
        return this.marketActivityEndBs;
    }

    @Nullable
    /* JADX INFO: renamed from: k3, reason: from getter */
    public final IntlMarketConfigEnvelope getMarketConfig() {
        return this.marketConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: l3 */
    public final C22392a<Boolean> m182435l3() {
        return this.marketConfigIsInitBs;
    }

    /* JADX INFO: renamed from: m3 */
    public final void m182436m3(@NotNull Act act, @NotNull final Function1<? super IntlMarketConfigEnvelope, Unit> callback) {
        act.getClass();
        callback.getClass();
        if (!NullChecker.m81303a(CoreModule.f17545c.f19703z1.getCampingConfig())) {
            CoreModule.f17545c.f19550A1.m182440t3(act, new Function1() { // from class: l.p69
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s69.m182423c3(callback, (IntlMarketConfigEnvelope) obj);
                }
            });
            return;
        }
        IntlMarketConfigEnvelope intlMarketConfigEnvelope = CoreModule.f17545c.f19550A1.marketConfig;
        if (intlMarketConfigEnvelope != null) {
            callback.invoke(intlMarketConfigEnvelope);
        }
    }

    /* JADX INFO: renamed from: n3 */
    public final C22306c<IntlMarketConfigEnvelope> m182437n3() {
        C22306c<IntlMarketConfigEnvelope> c22306cScheduled = CoreModule.f17545c.scheduled("market-config-query", 0, new v9j() { // from class: l.o69
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return s69.m182428h3();
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }

    /* JADX INFO: renamed from: p3 */
    public final C22306c<IntlMarketResponseEnvelope> m182438p3(final IntlMarketRequestParams data) {
        C22306c<IntlMarketResponseEnvelope> c22306cScheduled = CoreModule.f17545c.scheduled("market-setting-query", -1, new v9j() { // from class: l.n69
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return s69.m182429i3(data);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }

    /* JADX INFO: renamed from: r3 */
    public final void m182439r3(@NotNull Act act, @NotNull IntlMarketRequestParams data, @Nullable final Function0<Unit> onFail, @NotNull final Function1<? super IntlMarketResponseEnvelope, Unit> callback) {
        act.getClass();
        data.getClass();
        callback.getClass();
        if (!Network.isConnected(act)) {
            lsi0.m151578h(R$string.f55775l);
            return;
        }
        C22306c c22306cDuringCreated = act.duringCreated(m182438p3(data).timeout(10L, TimeUnit.SECONDS));
        if (c22306cDuringCreated != null) {
            c22306cDuringCreated.subscribe(mkd0.m154959K(new e30() { // from class: l.l69
                @Override // p149l.e30
                public final void call(Object obj) {
                    s69.m182427g3(callback, (IntlMarketResponseEnvelope) obj);
                }
            }, new e30() { // from class: l.m69
                @Override // p149l.e30
                public final void call(Object obj) {
                    s69.m182422b3(onFail, (Throwable) obj);
                }
            }, false));
        }
    }

    /* JADX INFO: renamed from: t3 */
    public final void m182440t3(@NotNull Act act, @NotNull final Function1<? super IntlMarketConfigEnvelope, Unit> callback) {
        C22306c c22306cDuringCreated;
        act.getClass();
        callback.getClass();
        if (Intrinsics.m87488d(this.marketActivityEndBs.m221515e(), Boolean.TRUE) || (c22306cDuringCreated = act.duringCreated(m182437n3())) == null) {
            return;
        }
        c22306cDuringCreated.subscribe(mkd0.m154956H(new e30() { // from class: l.j69
            @Override // p149l.e30
            public final void call(Object obj) {
                s69.m182425e3(this.f116395a, callback, (IntlMarketConfigEnvelope) obj);
            }
        }, new e30() { // from class: l.k69
            @Override // p149l.e30
            public final void call(Object obj) {
                s69.m182424d3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u3 */
    public final void m182441u3(IntlMarketConfigEnvelope result) {
        IntlMarketConfigData intlMarketConfigData;
        IntlMarketQuestionData intlMarketQuestionData;
        IntlMarketQuestionOptionUIData intlMarketQuestionOptionUIData;
        IntlMarketConfigData intlMarketConfigData2;
        IntlMarketQuestionData intlMarketQuestionData2;
        IntlMarketQuestionUIData intlMarketQuestionUIData;
        IntlMarketConfigData intlMarketConfigData3;
        IntlMarketSummaryData intlMarketSummaryData;
        IntlMarketConfigData intlMarketConfigData4;
        IntlMarketSummaryData intlMarketSummaryData2;
        if (this.isPreLoader) {
            return;
        }
        this.isPreLoader = true;
        if (result != null && (intlMarketConfigData4 = result.data) != null && (intlMarketSummaryData2 = intlMarketConfigData4.regular_summary) != null) {
            qib0.f154691G.m102377x0(intlMarketSummaryData2.bg_url);
            qib0.f154691G.m102377x0(intlMarketSummaryData2.confirm_btn_bg_url);
        }
        if (result != null && (intlMarketConfigData3 = result.data) != null && (intlMarketSummaryData = intlMarketConfigData3.quiz_summary) != null) {
            qib0.f154691G.m102377x0(intlMarketSummaryData.bg_url);
            qib0.f154691G.m102377x0(intlMarketSummaryData.logo_url);
            qib0.f154691G.m102377x0(intlMarketSummaryData.confirm_btn_bg_url);
        }
        if (result != null && (intlMarketConfigData2 = result.data) != null && (intlMarketQuestionData2 = intlMarketConfigData2.quiz_question) != null && (intlMarketQuestionUIData = intlMarketQuestionData2.question_ui) != null) {
            qib0.f154691G.m102377x0(intlMarketQuestionUIData.bg_url);
        }
        if (result == null || (intlMarketConfigData = result.data) == null || (intlMarketQuestionData = intlMarketConfigData.quiz_question) == null || (intlMarketQuestionOptionUIData = intlMarketQuestionData.option_ui) == null) {
            return;
        }
        qib0.f154691G.m102377x0(intlMarketQuestionOptionUIData.bg_url);
        qib0.f154691G.m102377x0(intlMarketQuestionOptionUIData.focus_bg_url);
    }
}
