package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.data.OfficialAdvertData;
import com.p051p1.mobile.putong.core.data.OfficialAdvertEnvelope;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m88121d2 = {"Ll/s59;", "Ll/dy6;", "<init>", "()V", "Lrx/c;", "Ll/uxj0;", "h3", "()Lrx/c;", "", "id", "", "l3", "(Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/data/OfficialAdvertData;", "R", "Lcom/p1/mobile/putong/core/data/OfficialAdvertData;", "g3", "()Lcom/p1/mobile/putong/core/data/OfficialAdvertData;", "setAdvertData", "(Lcom/p1/mobile/putong/core/data/OfficialAdvertData;)V", "advertData", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class s59 extends dy6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @Nullable
    public OfficialAdvertData advertData;

    /* JADX INFO: renamed from: c3 */
    public static C22421c m184610c3(final s59 s59Var) {
        C22421c c22421cObserveOn = qi20.m176659f(new pcj() { // from class: l.n59
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return s59.m184614i3();
            }
        }, OfficialAdvertEnvelope.JSON_ADAPTER).observeOn(fo0.m126432a());
        final Function1 function1 = new Function1() { // from class: l.o59
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s59.m184615j3(this.f145042a, (OfficialAdvertEnvelope) obj);
            }
        };
        return c22421cObserveOn.map(new qcj() { // from class: l.p59
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return s59.m184616k3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: f3 */
    public static C22421c m184613f3(final String str) {
        return qi20.m176658e(new pcj() { // from class: l.r59
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return s59.m184617m3(str);
            }
        });
    }

    /* JADX INFO: renamed from: i3 */
    public static final x1d0 m184614i3() {
        return C4879a.f20236P.auth().m209043q(C4879a.m32304g1(CoreModule.m30929H().userId())).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: j3 */
    public static final uxj0 m184615j3(s59 s59Var, OfficialAdvertEnvelope officialAdvertEnvelope) {
        officialAdvertEnvelope.getClass();
        if (NullChecker.m82486a(officialAdvertEnvelope) && !TextUtils.isEmpty(officialAdvertEnvelope.data.advertId)) {
            s59Var.advertData = officialAdvertEnvelope.data;
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: k3 */
    public static final uxj0 m184616k3(Function1 function1, Object obj) {
        return (uxj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m3 */
    public static final x1d0 m184617m3(String str) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32246R1(CoreModule.m30929H().userId(), str)).m209032f().m209028b();
    }

    @Nullable
    /* JADX INFO: renamed from: g3, reason: from getter */
    public final OfficialAdvertData getAdvertData() {
        return this.advertData;
    }

    @NotNull
    /* JADX INFO: renamed from: h3 */
    public final C22421c<uxj0> m184619h3() {
        C22421c<uxj0> c22421cScheduled = CoreModule.f18264c.scheduled("official_advert", 0, new pcj() { // from class: l.m59
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return s59.m184610c3(this.f134881a);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    /* JADX INFO: renamed from: l3 */
    public final void m184620l3(@NotNull final String id) {
        id.getClass();
        scheduled("advert_ok_" + id, -1, new pcj() { // from class: l.q59
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return s59.m184613f3(id);
            }
        });
    }
}
