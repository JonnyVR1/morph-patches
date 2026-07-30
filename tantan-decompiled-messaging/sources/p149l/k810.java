package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveJsAudienceInfoData;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R+\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m87232d2 = {"Ll/k810;", "Ll/ho2;", "D", "Ll/pat;", "Ll/bsm;", BaseSei.INFO, "Ll/j510;", "coreModule", "<init>", "(Ll/bsm;Ll/j510;)V", "", Constants.KEY_T, "()V", RXScreenCaptureService.KEY_INDEX, "Ll/j510;", "getCoreModule", "()Ll/j510;", "Ljava/util/HashSet;", "Ll/v3g0;", "Lkotlin/collections/HashSet;", "j", "Lkotlin/Lazy;", "N3", "()Ljava/util/HashSet;", "callsInfo", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class k810<D extends ho2> extends pat<D> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final j510<D> coreModule;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Lazy callsInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k810(@NotNull bsm<D> bsmVar, @NotNull j510<D> j510Var) {
        super(bsmVar);
        bsmVar.getClass();
        j510Var.getClass();
        this.coreModule = j510Var;
        this.callsInfo = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.g810
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k810.m144832M3();
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    public static void m144829J3(k810 k810Var, BLiveJsAudienceInfoData bLiveJsAudienceInfoData) {
        Iterator<T> it = k810Var.m144833N3().iterator();
        while (it.hasNext()) {
            ((v3g0) it.next()).f179798a.call(bLiveJsAudienceInfoData);
        }
    }

    /* JADX INFO: renamed from: K3 */
    public static BLiveJsAudienceInfoData m144830K3(k810 k810Var, b610 b610Var) {
        return r610.m178013s(k810Var);
    }

    /* JADX INFO: renamed from: L3 */
    public static BLiveJsAudienceInfoData m144831L3(Function1 function1, Object obj) {
        return (BLiveJsAudienceInfoData) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M3 */
    public static HashSet m144832M3() {
        return new HashSet();
    }

    /* JADX INFO: renamed from: N3 */
    public final HashSet<v3g0> m144833N3() {
        return (HashSet) this.callsInfo.getValue();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        C22306c<b610> c22306cM139801c4 = this.coreModule.m139801c4();
        final Function1 function1 = new Function1() { // from class: l.h810
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k810.m144830K3(this.f106375a, (b610) obj);
            }
        };
        duringCreated(c22306cM139801c4.map(new w9j() { // from class: l.i810
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return k810.m144831L3(function1, obj);
            }
        })).subscribe(ffw.m121197h(new e30() { // from class: l.j810
            @Override // p149l.e30
            public final void call(Object obj) {
                k810.m144829J3(this.f116674a, (BLiveJsAudienceInfoData) obj);
            }
        }));
    }
}
