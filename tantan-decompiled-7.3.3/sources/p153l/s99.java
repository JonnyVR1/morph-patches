package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.data.IntlNightClubEnvelope;
import com.p051p1.mobile.putong.data.Envelope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/s99;", "Ll/dy6;", "<init>", "()V", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/IntlNightClubEnvelope;", "k3", "()Lrx/c;", "", "id", "Lcom/p1/mobile/putong/data/Envelope;", "g3", "(Ljava/lang/String;)Lrx/c;", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class s99 extends dy6 {
    /* JADX INFO: renamed from: a3 */
    public static C22421c m185159a3(final String str) {
        C22421c c22421cM176659f = qi20.m176659f(new pcj() { // from class: l.p99
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return s99.m185165h3(str);
            }
        }, Envelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.q99
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s99.m185166i3((Envelope) obj);
            }
        };
        return c22421cM176659f.map(new qcj() { // from class: l.r99
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return s99.m185167j3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: b3 */
    public static C22421c m185160b3() {
        return qi20.m176659f(new pcj() { // from class: l.n99
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return s99.m185168l3();
            }
        }, IntlNightClubEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: h3 */
    public static final x1d0 m185165h3(String str) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/mkt/me/suggest?activity=clubs&id=" + str + "&mcc=" + uqb0.f180400f0)).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: i3 */
    public static final Envelope m185166i3(Envelope envelope) {
        CoreModule.f18264c.m32495w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: j3 */
    public static final Envelope m185167j3(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l3 */
    public static final x1d0 m185168l3() {
        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/mkt/me/config?mcc=" + uqb0.f180400f0)).m209032f().m209028b();
    }

    @NotNull
    /* JADX INFO: renamed from: g3 */
    public final C22421c<Envelope> m185169g3(@NotNull final String id) {
        id.getClass();
        C22421c<Envelope> c22421cScheduled = CoreModule.f18264c.scheduled("get-night-club-suggest", 0, new pcj() { // from class: l.o99
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return s99.m185159a3(id);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    @NotNull
    /* JADX INFO: renamed from: k3 */
    public final C22421c<IntlNightClubEnvelope> m185170k3() {
        C22421c<IntlNightClubEnvelope> c22421cScheduled = CoreModule.f18264c.scheduled("query-night-club-config", 0, new pcj() { // from class: l.m99
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return s99.m185160b3();
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }
}
