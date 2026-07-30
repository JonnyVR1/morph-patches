package p153l;

import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.data.IntlMarketConfigData;
import com.p051p1.mobile.putong.core.data.IntlMarketConfigEnvelope;
import com.p051p1.mobile.putong.core.data.IntlMarketQuestionData;
import com.p051p1.mobile.putong.core.data.IntlMarketQuestionOptionUIData;
import com.p051p1.mobile.putong.core.data.IntlMarketQuestionUIData;
import com.p051p1.mobile.putong.core.data.IntlMarketRequestParams;
import com.p051p1.mobile.putong.core.data.IntlMarketResponseEnvelope;
import com.p051p1.mobile.putong.core.data.IntlMarketSummaryData;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
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
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JR\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u0011\u0010\u0012J8\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u0014\u0010\u0015J8\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00172\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010#\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u001dR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020%0$8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020%0$8\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)R\u0016\u00100\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, m88121d2 = {"Ll/b89;", "Ll/dy6;", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/IntlMarketRequestParams;", "data", "Lkotlin/Function0;", "", "onFail", "Lkotlin/Function1;", "Lcom/p1/mobile/putong/core/data/IntlMarketResponseEnvelope;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, LovePlanetStage.result, "callback", "r3", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/IntlMarketRequestParams;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lcom/p1/mobile/putong/core/data/IntlMarketConfigEnvelope;", "t3", "(Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function1;)V", "m3", "Lrx/c;", "n3", "()Lrx/c;", "p3", "(Lcom/p1/mobile/putong/core/data/IntlMarketRequestParams;)Lrx/c;", "u3", "(Lcom/p1/mobile/putong/core/data/IntlMarketConfigEnvelope;)V", "R", "Lcom/p1/mobile/putong/core/data/IntlMarketConfigEnvelope;", "k3", "()Lcom/p1/mobile/putong/core/data/IntlMarketConfigEnvelope;", "setMarketConfig", "marketConfig", "Lrx/subjects/a;", "", p7f.LATITUDE_SOUTH, "Lrx/subjects/a;", "l3", "()Lrx/subjects/a;", "marketConfigIsInitBs", p7f.GPS_DIRECTION_TRUE, "j3", "marketActivityEndBs", "U", "Z", "isPreLoader", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class b89 extends dy6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @Nullable
    public IntlMarketConfigEnvelope marketConfig;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public final C22507a<Boolean> marketConfigIsInitBs;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public final C22507a<Boolean> marketActivityEndBs;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public boolean isPreLoader;

    public b89() {
        C22507a<Boolean> c22507aM222758b = C22507a.m222758b();
        c22507aM222758b.getClass();
        this.marketConfigIsInitBs = c22507aM222758b;
        C22507a<Boolean> c22507aM222758b2 = C22507a.m222758b();
        c22507aM222758b2.getClass();
        this.marketActivityEndBs = c22507aM222758b2;
    }

    /* JADX INFO: renamed from: b3 */
    public static void m102918b3(Function0 function0, Throwable th) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: c3 */
    public static Unit m102919c3(Function1 function1, IntlMarketConfigEnvelope intlMarketConfigEnvelope) {
        intlMarketConfigEnvelope.getClass();
        function1.invoke(intlMarketConfigEnvelope);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d3 */
    public static void m102920d3(Throwable th) {
    }

    /* JADX INFO: renamed from: e3 */
    public static void m102921e3(b89 b89Var, Function1 function1, IntlMarketConfigEnvelope intlMarketConfigEnvelope) {
        intlMarketConfigEnvelope.getClass();
        b89Var.m102937u3(intlMarketConfigEnvelope);
        b89Var.marketConfig = intlMarketConfigEnvelope;
        function1.invoke(intlMarketConfigEnvelope);
        C22507a<Boolean> c22507a = b89Var.marketConfigIsInitBs;
        Boolean bool = Boolean.TRUE;
        c22507a.m137019l(bool);
        if (NullChecker.m82486a(intlMarketConfigEnvelope.data)) {
            IntlMarketConfigData intlMarketConfigData = intlMarketConfigEnvelope.data;
            if (NullChecker.m82486a(intlMarketConfigData != null ? intlMarketConfigData.meta : null)) {
                return;
            }
        }
        b89Var.marketActivityEndBs.m137019l(bool);
    }

    /* JADX INFO: renamed from: g3 */
    public static void m102923g3(Function1 function1, IntlMarketResponseEnvelope intlMarketResponseEnvelope) {
        intlMarketResponseEnvelope.getClass();
        function1.invoke(intlMarketResponseEnvelope);
    }

    /* JADX INFO: renamed from: h3 */
    public static C22421c m102924h3() {
        return qi20.m176656c(new pcj() { // from class: l.a89
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return b89.m102926o3();
            }
        }, IntlMarketConfigEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: i3 */
    public static C22421c m102925i3(final IntlMarketRequestParams intlMarketRequestParams) {
        return qi20.m176656c(new pcj() { // from class: l.z79
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return b89.m102927q3(intlMarketRequestParams);
            }
        }, IntlMarketResponseEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: o3 */
    public static final x1d0 m102926o3() {
        return C4879a.f20236P.auth().m209043q(C4879a.m32212I0() + "?mcc=" + uqb0.f180400f0).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: q3 */
    public static final x1d0 m102927q3(IntlMarketRequestParams intlMarketRequestParams) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32212I0()).m209038l(z1d0.create(Network.JSON, intlMarketRequestParams.toJson())).m209028b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s3 */
    public static /* synthetic */ void m102928s3(b89 b89Var, Act act, IntlMarketRequestParams intlMarketRequestParams, Function0 function0, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        b89Var.m102935r3(act, intlMarketRequestParams, function0, function1);
    }

    @NotNull
    /* JADX INFO: renamed from: j3 */
    public final C22507a<Boolean> m102929j3() {
        return this.marketActivityEndBs;
    }

    @Nullable
    /* JADX INFO: renamed from: k3, reason: from getter */
    public final IntlMarketConfigEnvelope getMarketConfig() {
        return this.marketConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: l3 */
    public final C22507a<Boolean> m102931l3() {
        return this.marketConfigIsInitBs;
    }

    /* JADX INFO: renamed from: m3 */
    public final void m102932m3(@NotNull Act act, @NotNull final Function1<? super IntlMarketConfigEnvelope, Unit> callback) {
        act.getClass();
        callback.getClass();
        if (!NullChecker.m82486a(CoreModule.f18264c.f20445z1.getCampingConfig())) {
            CoreModule.f18264c.f20292A1.m102936t3(act, new Function1() { // from class: l.y79
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b89.m102919c3(callback, (IntlMarketConfigEnvelope) obj);
                }
            });
            return;
        }
        IntlMarketConfigEnvelope intlMarketConfigEnvelope = CoreModule.f18264c.f20292A1.marketConfig;
        if (intlMarketConfigEnvelope != null) {
            callback.invoke(intlMarketConfigEnvelope);
        }
    }

    /* JADX INFO: renamed from: n3 */
    public final C22421c<IntlMarketConfigEnvelope> m102933n3() {
        C22421c<IntlMarketConfigEnvelope> c22421cScheduled = CoreModule.f18264c.scheduled("market-config-query", 0, new pcj() { // from class: l.x79
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return b89.m102924h3();
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    /* JADX INFO: renamed from: p3 */
    public final C22421c<IntlMarketResponseEnvelope> m102934p3(final IntlMarketRequestParams data) {
        C22421c<IntlMarketResponseEnvelope> c22421cScheduled = CoreModule.f18264c.scheduled("market-setting-query", -1, new pcj() { // from class: l.w79
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return b89.m102925i3(data);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    /* JADX INFO: renamed from: r3 */
    public final void m102935r3(@NotNull Act act, @NotNull IntlMarketRequestParams data, @Nullable final Function0<Unit> onFail, @NotNull final Function1<? super IntlMarketResponseEnvelope, Unit> callback) {
        act.getClass();
        data.getClass();
        callback.getClass();
        if (!Network.isConnected(act)) {
            o1j0.m165634h(R$string.f56623l);
            return;
        }
        C22421c c22421cDuringCreated = act.duringCreated(m102934p3(data).timeout(10L, TimeUnit.SECONDS));
        if (c22421cDuringCreated != null) {
            c22421cDuringCreated.subscribe(psd0.m173600K(new y20() { // from class: l.u79
                @Override // p153l.y20
                public final void call(Object obj) {
                    b89.m102923g3(callback, (IntlMarketResponseEnvelope) obj);
                }
            }, new y20() { // from class: l.v79
                @Override // p153l.y20
                public final void call(Object obj) {
                    b89.m102918b3(onFail, (Throwable) obj);
                }
            }, false));
        }
    }

    /* JADX INFO: renamed from: t3 */
    public final void m102936t3(@NotNull Act act, @NotNull final Function1<? super IntlMarketConfigEnvelope, Unit> callback) {
        C22421c c22421cDuringCreated;
        act.getClass();
        callback.getClass();
        if (Intrinsics.m88377d(this.marketActivityEndBs.m222761e(), Boolean.TRUE) || (c22421cDuringCreated = act.duringCreated(m102933n3())) == null) {
            return;
        }
        c22421cDuringCreated.subscribe(psd0.m173597H(new y20() { // from class: l.s79
            @Override // p153l.y20
            public final void call(Object obj) {
                b89.m102921e3(this.f166651a, callback, (IntlMarketConfigEnvelope) obj);
            }
        }, new y20() { // from class: l.t79
            @Override // p153l.y20
            public final void call(Object obj) {
                b89.m102920d3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u3 */
    public final void m102937u3(IntlMarketConfigEnvelope result) {
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
            uqb0.f180374G.m127160x0(intlMarketSummaryData2.bg_url);
            uqb0.f180374G.m127160x0(intlMarketSummaryData2.confirm_btn_bg_url);
        }
        if (result != null && (intlMarketConfigData3 = result.data) != null && (intlMarketSummaryData = intlMarketConfigData3.quiz_summary) != null) {
            uqb0.f180374G.m127160x0(intlMarketSummaryData.bg_url);
            uqb0.f180374G.m127160x0(intlMarketSummaryData.logo_url);
            uqb0.f180374G.m127160x0(intlMarketSummaryData.confirm_btn_bg_url);
        }
        if (result != null && (intlMarketConfigData2 = result.data) != null && (intlMarketQuestionData2 = intlMarketConfigData2.quiz_question) != null && (intlMarketQuestionUIData = intlMarketQuestionData2.question_ui) != null) {
            uqb0.f180374G.m127160x0(intlMarketQuestionUIData.bg_url);
        }
        if (result == null || (intlMarketConfigData = result.data) == null || (intlMarketQuestionData = intlMarketConfigData.quiz_question) == null || (intlMarketQuestionOptionUIData = intlMarketQuestionData.option_ui) == null) {
            return;
        }
        uqb0.f180374G.m127160x0(intlMarketQuestionOptionUIData.bg_url);
        uqb0.f180374G.m127160x0(intlMarketQuestionOptionUIData.focus_bg_url);
    }
}
