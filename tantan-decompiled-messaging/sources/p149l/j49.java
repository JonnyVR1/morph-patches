package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.data.OfficialAdvertData;
import com.p046p1.mobile.putong.core.data.OfficialAdvertEnvelope;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m87232d2 = {"Ll/j49;", "Ll/ax6;", "<init>", "()V", "Lrx/c;", "Ll/roj0;", "h3", "()Lrx/c;", "", "id", "", "l3", "(Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/data/OfficialAdvertData;", "R", "Lcom/p1/mobile/putong/core/data/OfficialAdvertData;", "g3", "()Lcom/p1/mobile/putong/core/data/OfficialAdvertData;", "setAdvertData", "(Lcom/p1/mobile/putong/core/data/OfficialAdvertData;)V", "advertData", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class j49 extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @Nullable
    public OfficialAdvertData advertData;

    /* JADX INFO: renamed from: c3 */
    public static C22306c m139620c3(final j49 j49Var) {
        C22306c c22306cObserveOn = ia20.m135122f(new v9j() { // from class: l.e49
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return j49.m139624i3();
            }
        }, OfficialAdvertEnvelope.JSON_ADAPTER).observeOn(jo0.m142408a());
        final Function1 function1 = new Function1() { // from class: l.f49
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j49.m139625j3(this.f94745a, (OfficialAdvertEnvelope) obj);
            }
        };
        return c22306cObserveOn.map(new w9j() { // from class: l.g49
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return j49.m139626k3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: f3 */
    public static C22306c m139623f3(final String str) {
        return ia20.m135121e(new v9j() { // from class: l.i49
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return j49.m139627m3(str);
            }
        });
    }

    /* JADX INFO: renamed from: i3 */
    public static final stc0 m139624i3() {
        return C4728a.f19494P.auth().m185898q(C4728a.m31301g1(CoreModule.m29931H().userId())).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: j3 */
    public static final roj0 m139625j3(j49 j49Var, OfficialAdvertEnvelope officialAdvertEnvelope) {
        officialAdvertEnvelope.getClass();
        if (NullChecker.m81303a(officialAdvertEnvelope) && !TextUtils.isEmpty(officialAdvertEnvelope.data.advertId)) {
            j49Var.advertData = officialAdvertEnvelope.data;
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: k3 */
    public static final roj0 m139626k3(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m3 */
    public static final stc0 m139627m3(String str) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31243R1(CoreModule.m29931H().userId(), str)).m185887f().m185883b();
    }

    @Nullable
    /* JADX INFO: renamed from: g3, reason: from getter */
    public final OfficialAdvertData getAdvertData() {
        return this.advertData;
    }

    @NotNull
    /* JADX INFO: renamed from: h3 */
    public final C22306c<roj0> m139629h3() {
        C22306c<roj0> c22306cScheduled = CoreModule.f17545c.scheduled("official_advert", 0, new v9j() { // from class: l.d49
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return j49.m139620c3(this.f84285a);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }

    /* JADX INFO: renamed from: l3 */
    public final void m139630l3(@NotNull final String id) {
        id.getClass();
        scheduled("advert_ok_" + id, -1, new v9j() { // from class: l.h49
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return j49.m139623f3(id);
            }
        });
    }
}
