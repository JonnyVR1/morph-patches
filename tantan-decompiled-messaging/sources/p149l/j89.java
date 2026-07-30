package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.data.IntlNightClubEnvelope;
import com.p046p1.mobile.putong.data.Envelope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/j89;", "Ll/ax6;", "<init>", "()V", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/IntlNightClubEnvelope;", "k3", "()Lrx/c;", "", "id", "Lcom/p1/mobile/putong/data/Envelope;", "g3", "(Ljava/lang/String;)Lrx/c;", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class j89 extends ax6 {
    /* JADX INFO: renamed from: a3 */
    public static C22306c m140191a3(final String str) {
        C22306c c22306cM135122f = ia20.m135122f(new v9j() { // from class: l.g89
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return j89.m140197h3(str);
            }
        }, Envelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.h89
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j89.m140198i3((Envelope) obj);
            }
        };
        return c22306cM135122f.map(new w9j() { // from class: l.i89
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return j89.m140199j3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: b3 */
    public static C22306c m140192b3() {
        return ia20.m135122f(new v9j() { // from class: l.e89
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return j89.m140200l3();
            }
        }, IntlNightClubEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: h3 */
    public static final stc0 m140197h3(String str) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/mkt/me/suggest?activity=clubs&id=" + str + "&mcc=" + qib0.f154717f0)).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: i3 */
    public static final Envelope m140198i3(Envelope envelope) {
        CoreModule.f17545c.m31492w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: j3 */
    public static final Envelope m140199j3(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l3 */
    public static final stc0 m140200l3() {
        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/mkt/me/config?mcc=" + qib0.f154717f0)).m185887f().m185883b();
    }

    @NotNull
    /* JADX INFO: renamed from: g3 */
    public final C22306c<Envelope> m140201g3(@NotNull final String id) {
        id.getClass();
        C22306c<Envelope> c22306cScheduled = CoreModule.f17545c.scheduled("get-night-club-suggest", 0, new v9j() { // from class: l.f89
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return j89.m140191a3(id);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }

    @NotNull
    /* JADX INFO: renamed from: k3 */
    public final C22306c<IntlNightClubEnvelope> m140202k3() {
        C22306c<IntlNightClubEnvelope> c22306cScheduled = CoreModule.f17545c.scheduled("query-night-club-config", 0, new v9j() { // from class: l.d89
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return j89.m140192b3();
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }
}
