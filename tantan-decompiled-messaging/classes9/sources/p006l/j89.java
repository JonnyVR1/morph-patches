package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p1.mobile.putong.core.data.IntlNightClubEnvelope;
import com.p1.mobile.putong.data.Envelope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import l.stc0;
import l.v9j;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll/j89;", "Ll/ax6;", "<init>", "()V", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/IntlNightClubEnvelope;", "k3", "()Lrx/c;", "", "id", "Lcom/p1/mobile/putong/data/Envelope;", "g3", "(Ljava/lang/String;)Lrx/c;", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j89 extends ax6 {
    /* JADX INFO: renamed from: a3 */
    public static c m17332a3(final String str) {
        c cVarM16572f = ia20.m16572f(new v9j() { // from class: l.g89
            public final Object call() {
                return j89.m17338h3(str);
            }
        }, Envelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.h89
            public final Object invoke(Object obj) {
                return j89.m17339i3((Envelope) obj);
            }
        };
        return cVarM16572f.map(new w9j() { // from class: l.i89
            public final Object call(Object obj) {
                return j89.m17340j3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: b3 */
    public static c m17333b3() {
        return ia20.m16572f(new v9j() { // from class: l.e89
            public final Object call() {
                return j89.m17341l3();
            }
        }, IntlNightClubEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: h3 */
    public static final stc0 m17338h3(String str) {
        return C0154a.f3483P.auth().q(C0154a.m3130G("/mkt/me/suggest?activity=clubs&id=" + str + "&mcc=" + qib0.f19808f0)).f().b();
    }

    /* JADX INFO: renamed from: i3 */
    public static final Envelope m17339i3(Envelope envelope) {
        CoreModule.f1534c.m3422w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: j3 */
    public static final Envelope m17340j3(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l3 */
    public static final stc0 m17341l3() {
        return C0154a.f3483P.auth().q(C0154a.m3130G("/mkt/me/config?mcc=" + qib0.f19808f0)).f().b();
    }

    @NotNull
    /* JADX INFO: renamed from: g3 */
    public final c<Envelope> m17342g3(@NotNull final String id) {
        id.getClass();
        c<Envelope> cVarScheduled = CoreModule.f1534c.scheduled("get-night-club-suggest", 0, new v9j() { // from class: l.f89
            public final Object call() {
                return j89.m17332a3(id);
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    @NotNull
    /* JADX INFO: renamed from: k3 */
    public final c<IntlNightClubEnvelope> m17343k3() {
        c<IntlNightClubEnvelope> cVarScheduled = CoreModule.f1534c.scheduled("query-night-club-config", 0, new v9j() { // from class: l.d89
            public final Object call() {
                return j89.m17333b3();
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }
}
