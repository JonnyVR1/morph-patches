package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p1.mobile.putong.core.data.OfficialAdvertData;
import com.p1.mobile.putong.core.data.OfficialAdvertEnvelope;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import l.jo0;
import l.roj0;
import l.stc0;
import l.v9j;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Ll/j49;", "Ll/ax6;", "<init>", "()V", "Lrx/c;", "Ll/roj0;", "h3", "()Lrx/c;", "", "id", "", "l3", "(Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/data/OfficialAdvertData;", "R", "Lcom/p1/mobile/putong/core/data/OfficialAdvertData;", "g3", "()Lcom/p1/mobile/putong/core/data/OfficialAdvertData;", "setAdvertData", "(Lcom/p1/mobile/putong/core/data/OfficialAdvertData;)V", "advertData", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j49 extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @Nullable
    public OfficialAdvertData advertData;

    /* JADX INFO: renamed from: c3 */
    public static c m17258c3(final j49 j49Var) {
        c cVarObserveOn = ia20.m16572f(new v9j() { // from class: l.e49
            public final Object call() {
                return j49.m17262i3();
            }
        }, OfficialAdvertEnvelope.JSON_ADAPTER).observeOn(jo0.a());
        final Function1 function1 = new Function1() { // from class: l.f49
            public final Object invoke(Object obj) {
                return j49.m17263j3(this.f11607a, (OfficialAdvertEnvelope) obj);
            }
        };
        return cVarObserveOn.map(new w9j() { // from class: l.g49
            public final Object call(Object obj) {
                return j49.m17264k3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: f3 */
    public static c m17261f3(final String str) {
        return ia20.m16571e(new v9j() { // from class: l.i49
            public final Object call() {
                return j49.m17265m3(str);
            }
        });
    }

    /* JADX INFO: renamed from: i3 */
    public static final stc0 m17262i3() {
        return C0154a.f3483P.auth().q(C0154a.m3231g1(CoreModule.m1850H().userId())).f().b();
    }

    /* JADX INFO: renamed from: j3 */
    public static final roj0 m17263j3(j49 j49Var, OfficialAdvertEnvelope officialAdvertEnvelope) {
        officialAdvertEnvelope.getClass();
        if (NullChecker.a(officialAdvertEnvelope) && !TextUtils.isEmpty(officialAdvertEnvelope.data.advertId)) {
            j49Var.advertData = officialAdvertEnvelope.data;
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: k3 */
    public static final roj0 m17264k3(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m3 */
    public static final stc0 m17265m3(String str) {
        return C0154a.f3483P.auth().q(C0154a.m3173R1(CoreModule.m1850H().userId(), str)).f().b();
    }

    @Nullable
    /* JADX INFO: renamed from: g3, reason: from getter */
    public final OfficialAdvertData getAdvertData() {
        return this.advertData;
    }

    @NotNull
    /* JADX INFO: renamed from: h3 */
    public final c<roj0> m17267h3() {
        c<roj0> cVarScheduled = CoreModule.f1534c.scheduled("official_advert", 0, new v9j() { // from class: l.d49
            public final Object call() {
                return j49.m17258c3(this.f10011a);
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    /* JADX INFO: renamed from: l3 */
    public final void m17268l3(@NotNull final String id) {
        id.getClass();
        scheduled("advert_ok_" + id, -1, new v9j() { // from class: l.h49
            public final Object call() {
                return j49.m17261f3(id);
            }
        });
    }
}
