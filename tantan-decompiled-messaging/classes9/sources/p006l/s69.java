package p006l;

import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.IntlMarketConfigData;
import com.p1.mobile.putong.core.data.IntlMarketConfigEnvelope;
import com.p1.mobile.putong.core.data.IntlMarketQuestionData;
import com.p1.mobile.putong.core.data.IntlMarketQuestionOptionUIData;
import com.p1.mobile.putong.core.data.IntlMarketQuestionUIData;
import com.p1.mobile.putong.core.data.IntlMarketRequestParams;
import com.p1.mobile.putong.core.data.IntlMarketResponseEnvelope;
import com.p1.mobile.putong.core.data.IntlMarketSummaryData;
import com.tantan.core.base.R;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.e30;
import l.lsi0;
import l.mkd0;
import l.stc0;
import l.utc0;
import l.v9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JR\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u0011\u0010\u0012J8\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u0014\u0010\u0015J8\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00172\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010#\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u001dR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020%0$8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020%0$8\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)R\u0016\u00100\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Ll/s69;", "Ll/ax6;", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/IntlMarketRequestParams;", "data", "Lkotlin/Function0;", "", "onFail", "Lkotlin/Function1;", "Lcom/p1/mobile/putong/core/data/IntlMarketResponseEnvelope;", "Lkotlin/ParameterName;", "name", "result", "callback", "r3", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/IntlMarketRequestParams;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lcom/p1/mobile/putong/core/data/IntlMarketConfigEnvelope;", "t3", "(Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function1;)V", "m3", "Lrx/c;", "n3", "()Lrx/c;", "p3", "(Lcom/p1/mobile/putong/core/data/IntlMarketRequestParams;)Lrx/c;", "u3", "(Lcom/p1/mobile/putong/core/data/IntlMarketConfigEnvelope;)V", "R", "Lcom/p1/mobile/putong/core/data/IntlMarketConfigEnvelope;", "k3", "()Lcom/p1/mobile/putong/core/data/IntlMarketConfigEnvelope;", "setMarketConfig", "marketConfig", "Lrx/subjects/a;", "", "S", "Lrx/subjects/a;", "l3", "()Lrx/subjects/a;", "marketConfigIsInitBs", "T", "j3", "marketActivityEndBs", "U", "Z", "isPreLoader", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class s69 extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @Nullable
    public IntlMarketConfigEnvelope marketConfig;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public final a<Boolean> marketConfigIsInitBs;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public final a<Boolean> marketActivityEndBs;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public boolean isPreLoader;

    public s69() {
        a<Boolean> aVarB = a.b();
        aVarB.getClass();
        this.marketConfigIsInitBs = aVarB;
        a<Boolean> aVarB2 = a.b();
        aVarB2.getClass();
        this.marketActivityEndBs = aVarB2;
    }

    /* JADX INFO: renamed from: b3 */
    public static void m23495b3(Function0 function0, Throwable th) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: c3 */
    public static Unit m23496c3(Function1 function1, IntlMarketConfigEnvelope intlMarketConfigEnvelope) {
        intlMarketConfigEnvelope.getClass();
        function1.invoke(intlMarketConfigEnvelope);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d3 */
    public static void m23497d3(Throwable th) {
    }

    /* JADX INFO: renamed from: e3 */
    public static void m23498e3(s69 s69Var, Function1 function1, IntlMarketConfigEnvelope intlMarketConfigEnvelope) {
        intlMarketConfigEnvelope.getClass();
        s69Var.m23514u3(intlMarketConfigEnvelope);
        s69Var.marketConfig = intlMarketConfigEnvelope;
        function1.invoke(intlMarketConfigEnvelope);
        a<Boolean> aVar = s69Var.marketConfigIsInitBs;
        Boolean bool = Boolean.TRUE;
        aVar.onNext(bool);
        if (NullChecker.a(intlMarketConfigEnvelope.data)) {
            IntlMarketConfigData intlMarketConfigData = intlMarketConfigEnvelope.data;
            if (NullChecker.a(intlMarketConfigData != null ? intlMarketConfigData.meta : null)) {
                return;
            }
        }
        s69Var.marketActivityEndBs.onNext(bool);
    }

    /* JADX INFO: renamed from: g3 */
    public static void m23500g3(Function1 function1, IntlMarketResponseEnvelope intlMarketResponseEnvelope) {
        intlMarketResponseEnvelope.getClass();
        function1.invoke(intlMarketResponseEnvelope);
    }

    /* JADX INFO: renamed from: h3 */
    public static c m23501h3() {
        return ia20.m16569c(new v9j() { // from class: l.r69
            public final Object call() {
                return s69.m23503o3();
            }
        }, IntlMarketConfigEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: i3 */
    public static c m23502i3(final IntlMarketRequestParams intlMarketRequestParams) {
        return ia20.m16569c(new v9j() { // from class: l.q69
            public final Object call() {
                return s69.m23504q3(intlMarketRequestParams);
            }
        }, IntlMarketResponseEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: o3 */
    public static final stc0 m23503o3() {
        return C0154a.f3483P.auth().q(C0154a.m3139I0() + "?mcc=" + qib0.f19808f0).f().b();
    }

    /* JADX INFO: renamed from: q3 */
    public static final stc0 m23504q3(IntlMarketRequestParams intlMarketRequestParams) {
        return C0154a.f3483P.auth().q(C0154a.m3139I0()).l(utc0.create(Network.JSON, intlMarketRequestParams.toJson())).b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s3 */
    public static /* synthetic */ void m23505s3(s69 s69Var, Act act, IntlMarketRequestParams intlMarketRequestParams, Function0 function0, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        s69Var.m23512r3(act, intlMarketRequestParams, function0, function1);
    }

    @NotNull
    /* JADX INFO: renamed from: j3 */
    public final a<Boolean> m23506j3() {
        return this.marketActivityEndBs;
    }

    @Nullable
    /* JADX INFO: renamed from: k3, reason: from getter */
    public final IntlMarketConfigEnvelope getMarketConfig() {
        return this.marketConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: l3 */
    public final a<Boolean> m23508l3() {
        return this.marketConfigIsInitBs;
    }

    /* JADX INFO: renamed from: m3 */
    public final void m23509m3(@NotNull Act act, @NotNull final Function1<? super IntlMarketConfigEnvelope, Unit> callback) {
        act.getClass();
        callback.getClass();
        if (!NullChecker.a(CoreModule.f1534c.f3692z1.getCampingConfig())) {
            CoreModule.f1534c.f3539A1.m23513t3(act, new Function1() { // from class: l.p69
                public final Object invoke(Object obj) {
                    return s69.m23496c3(callback, (IntlMarketConfigEnvelope) obj);
                }
            });
            return;
        }
        IntlMarketConfigEnvelope intlMarketConfigEnvelope = CoreModule.f1534c.f3539A1.marketConfig;
        if (intlMarketConfigEnvelope != null) {
            callback.invoke(intlMarketConfigEnvelope);
        }
    }

    /* JADX INFO: renamed from: n3 */
    public final c<IntlMarketConfigEnvelope> m23510n3() {
        c<IntlMarketConfigEnvelope> cVarScheduled = CoreModule.f1534c.scheduled("market-config-query", 0, new v9j() { // from class: l.o69
            public final Object call() {
                return s69.m23501h3();
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    /* JADX INFO: renamed from: p3 */
    public final c<IntlMarketResponseEnvelope> m23511p3(final IntlMarketRequestParams data) {
        c<IntlMarketResponseEnvelope> cVarScheduled = CoreModule.f1534c.scheduled("market-setting-query", -1, new v9j() { // from class: l.n69
            public final Object call() {
                return s69.m23502i3(data);
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    /* JADX INFO: renamed from: r3 */
    public final void m23512r3(@NotNull Act act, @NotNull IntlMarketRequestParams data, @Nullable final Function0<Unit> onFail, @NotNull final Function1<? super IntlMarketResponseEnvelope, Unit> callback) {
        act.getClass();
        data.getClass();
        callback.getClass();
        if (!Network.isConnected(act)) {
            lsi0.h(R.string.l);
            return;
        }
        c cVarDuringCreated = act.duringCreated(m23511p3(data).timeout(10L, TimeUnit.SECONDS));
        if (cVarDuringCreated != null) {
            cVarDuringCreated.subscribe(mkd0.K(new e30() { // from class: l.l69
                public final void call(Object obj) {
                    s69.m23500g3(callback, (IntlMarketResponseEnvelope) obj);
                }
            }, new e30() { // from class: l.m69
                public final void call(Object obj) {
                    s69.m23495b3(onFail, (Throwable) obj);
                }
            }, false));
        }
    }

    /* JADX INFO: renamed from: t3 */
    public final void m23513t3(@NotNull Act act, @NotNull final Function1<? super IntlMarketConfigEnvelope, Unit> callback) {
        c cVarDuringCreated;
        act.getClass();
        callback.getClass();
        if (Intrinsics.d(this.marketActivityEndBs.e(), Boolean.TRUE) || (cVarDuringCreated = act.duringCreated(m23510n3())) == null) {
            return;
        }
        cVarDuringCreated.subscribe(mkd0.H(new e30() { // from class: l.j69
            public final void call(Object obj) {
                s69.m23498e3(this.f15006a, callback, (IntlMarketConfigEnvelope) obj);
            }
        }, new e30() { // from class: l.k69
            public final void call(Object obj) {
                s69.m23497d3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u3 */
    public final void m23514u3(IntlMarketConfigEnvelope result) {
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
            qib0.f19782G.m12790x0(intlMarketSummaryData2.bg_url);
            qib0.f19782G.m12790x0(intlMarketSummaryData2.confirm_btn_bg_url);
        }
        if (result != null && (intlMarketConfigData3 = result.data) != null && (intlMarketSummaryData = intlMarketConfigData3.quiz_summary) != null) {
            qib0.f19782G.m12790x0(intlMarketSummaryData.bg_url);
            qib0.f19782G.m12790x0(intlMarketSummaryData.logo_url);
            qib0.f19782G.m12790x0(intlMarketSummaryData.confirm_btn_bg_url);
        }
        if (result != null && (intlMarketConfigData2 = result.data) != null && (intlMarketQuestionData2 = intlMarketConfigData2.quiz_question) != null && (intlMarketQuestionUIData = intlMarketQuestionData2.question_ui) != null) {
            qib0.f19782G.m12790x0(intlMarketQuestionUIData.bg_url);
        }
        if (result == null || (intlMarketConfigData = result.data) == null || (intlMarketQuestionData = intlMarketConfigData.quiz_question) == null || (intlMarketQuestionOptionUIData = intlMarketQuestionData.option_ui) == null) {
            return;
        }
        qib0.f19782G.m12790x0(intlMarketQuestionOptionUIData.bg_url);
        qib0.f19782G.m12790x0(intlMarketQuestionOptionUIData.focus_bg_url);
    }
}
