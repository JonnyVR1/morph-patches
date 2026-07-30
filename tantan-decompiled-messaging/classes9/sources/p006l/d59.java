package p006l;

import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.IntlCampingConfigData;
import com.p1.mobile.putong.core.data.IntlCampingConfigEnvelope;
import com.p1.mobile.putong.core.data.IntlCampingEnvelope;
import com.p1.mobile.putong.core.data.IntlCampingQuestionsData;
import com.p1.mobile.putong.core.data.IntlCampingRequestParams;
import com.p1.mobile.putong.core.data.IntlCampingSummaryData;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import l.e30;
import l.mkd0;
import l.stc0;
import l.utc0;
import l.v9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ@\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\u0014\u0010\u000eJ\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00152\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010!\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u001b¨\u0006\""}, d2 = {"Ll/d59;", "Ll/ax6;", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "Lkotlin/Function1;", "Lcom/p1/mobile/putong/core/data/IntlCampingConfigEnvelope;", "Lkotlin/ParameterName;", "name", "result", "", "callback", "q3", "(Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function1;)V", "Lcom/p1/mobile/putong/core/data/IntlCampingRequestParams;", "data", "Lcom/p1/mobile/putong/core/data/IntlCampingEnvelope;", "p3", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/IntlCampingRequestParams;Lkotlin/jvm/functions/Function1;)V", "o3", "Lrx/c;", "k3", "()Lrx/c;", "m3", "(Lcom/p1/mobile/putong/core/data/IntlCampingRequestParams;)Lrx/c;", "r3", "(Lcom/p1/mobile/putong/core/data/IntlCampingConfigEnvelope;)V", "R", "Lcom/p1/mobile/putong/core/data/IntlCampingConfigEnvelope;", "j3", "()Lcom/p1/mobile/putong/core/data/IntlCampingConfigEnvelope;", "setCampingConfig", "campingConfig", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class d59 extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @Nullable
    public IntlCampingConfigEnvelope campingConfig;

    /* JADX INFO: renamed from: a3 */
    public static c m13776a3(final IntlCampingRequestParams intlCampingRequestParams) {
        return ia20.m16569c(new v9j() { // from class: l.c59
            public final Object call() {
                return d59.m13786n3(intlCampingRequestParams);
            }
        }, IntlCampingEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: c3 */
    public static void m13778c3(Throwable th) {
    }

    /* JADX INFO: renamed from: e3 */
    public static void m13780e3(Function1 function1, IntlCampingEnvelope intlCampingEnvelope) {
        intlCampingEnvelope.getClass();
        function1.invoke(intlCampingEnvelope);
    }

    /* JADX INFO: renamed from: f3 */
    public static Unit m13781f3(Function1 function1, IntlCampingConfigEnvelope intlCampingConfigEnvelope) {
        intlCampingConfigEnvelope.getClass();
        function1.invoke(intlCampingConfigEnvelope);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g3 */
    public static c m13782g3() {
        return ia20.m16569c(new v9j() { // from class: l.b59
            public final Object call() {
                return d59.m13785l3();
            }
        }, IntlCampingConfigEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: h3 */
    public static void m13783h3(d59 d59Var, Function1 function1, IntlCampingConfigEnvelope intlCampingConfigEnvelope) {
        intlCampingConfigEnvelope.getClass();
        d59Var.m13793r3(intlCampingConfigEnvelope);
        function1.invoke(intlCampingConfigEnvelope);
        d59Var.campingConfig = intlCampingConfigEnvelope;
    }

    /* JADX INFO: renamed from: i3 */
    public static void m13784i3(Throwable th) {
    }

    /* JADX INFO: renamed from: l3 */
    public static final stc0 m13785l3() {
        return C0154a.f3483P.auth().q(C0154a.m3249l()).f().b();
    }

    /* JADX INFO: renamed from: n3 */
    public static final stc0 m13786n3(IntlCampingRequestParams intlCampingRequestParams) {
        return C0154a.f3483P.auth().q(C0154a.m3249l()).l(utc0.create(Network.JSON, intlCampingRequestParams.toJson())).b();
    }

    /* JADX INFO: renamed from: q3 */
    private final void m13787q3(Act act, final Function1<? super IntlCampingConfigEnvelope, Unit> callback) {
        c cVarDuringCreated = act.duringCreated(m13789k3());
        if (cVarDuringCreated != null) {
            cVarDuringCreated.subscribe(mkd0.H(new e30() { // from class: l.x49
                public final void call(Object obj) {
                    d59.m13783h3(this.f27343a, callback, (IntlCampingConfigEnvelope) obj);
                }
            }, new e30() { // from class: l.y49
                public final void call(Object obj) {
                    d59.m13778c3((Throwable) obj);
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
    public final c<IntlCampingConfigEnvelope> m13789k3() {
        c<IntlCampingConfigEnvelope> cVarScheduled = CoreModule.f1534c.scheduled("camping-config-query", 0, new v9j() { // from class: l.a59
            public final Object call() {
                return d59.m13782g3();
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    /* JADX INFO: renamed from: m3 */
    public final c<IntlCampingEnvelope> m13790m3(final IntlCampingRequestParams data) {
        c<IntlCampingEnvelope> cVarScheduled = CoreModule.f1534c.scheduled("camping-setting-query", -1, new v9j() { // from class: l.z49
            public final Object call() {
                return d59.m13776a3(data);
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    /* JADX INFO: renamed from: o3 */
    public final void m13791o3(@NotNull Act act, @NotNull final Function1<? super IntlCampingConfigEnvelope, Unit> callback) {
        act.getClass();
        callback.getClass();
        if (!NullChecker.a(CoreModule.f1534c.f3692z1.campingConfig)) {
            CoreModule.f1534c.f3692z1.m13787q3(act, new Function1() { // from class: l.u49
                public final Object invoke(Object obj) {
                    return d59.m13781f3(callback, (IntlCampingConfigEnvelope) obj);
                }
            });
            return;
        }
        IntlCampingConfigEnvelope intlCampingConfigEnvelope = CoreModule.f1534c.f3692z1.campingConfig;
        if (intlCampingConfigEnvelope != null) {
            callback.invoke(intlCampingConfigEnvelope);
        }
    }

    /* JADX INFO: renamed from: p3 */
    public final void m13792p3(@NotNull Act act, @NotNull IntlCampingRequestParams data, @NotNull final Function1<? super IntlCampingEnvelope, Unit> callback) {
        act.getClass();
        data.getClass();
        callback.getClass();
        c cVarDuringCreated = act.duringCreated(m13790m3(data));
        if (cVarDuringCreated != null) {
            cVarDuringCreated.subscribe(mkd0.H(new e30() { // from class: l.v49
                public final void call(Object obj) {
                    d59.m13780e3(callback, (IntlCampingEnvelope) obj);
                }
            }, new e30() { // from class: l.w49
                public final void call(Object obj) {
                    d59.m13784i3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r3 */
    public final void m13793r3(IntlCampingConfigEnvelope result) {
        IntlCampingConfigData intlCampingConfigData;
        List list;
        IntlCampingQuestionsData intlCampingQuestionsData;
        IntlCampingConfigData intlCampingConfigData2;
        IntlCampingSummaryData intlCampingSummaryData;
        if (result != null && (intlCampingConfigData2 = result.data) != null && (intlCampingSummaryData = intlCampingConfigData2.summary) != null) {
            qib0.f19782G.m12790x0(intlCampingSummaryData.bg_url);
            qib0.f19782G.m12790x0(intlCampingSummaryData.heading_url);
            qib0.f19782G.m12790x0(intlCampingSummaryData.logo_url);
            qib0.f19782G.m12790x0(intlCampingSummaryData.question_bg_url);
        }
        if (result == null || (intlCampingConfigData = result.data) == null || (list = intlCampingConfigData.questions) == null || list.size() <= 0 || (intlCampingQuestionsData = (IntlCampingQuestionsData) list.get(0)) == null) {
            return;
        }
        qib0.f19782G.m12790x0(intlCampingQuestionsData.bg_url);
        qib0.f19782G.m12790x0(intlCampingQuestionsData.opt_bg_url);
        qib0.f19782G.m12790x0(intlCampingQuestionsData.opt_focus_logo_url);
        qib0.f19782G.m12790x0(intlCampingQuestionsData.opt_focus_bg_url);
    }
}
