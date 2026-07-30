package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveJsAudienceInfoData;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R+\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m88121d2 = {"Ll/ug10;", "Ll/oo2;", "D", "Ll/qct;", "Ll/dum;", BaseSei.INFO, "Ll/td10;", "coreModule", "<init>", "(Ll/dum;Ll/td10;)V", "", Constants.KEY_T, "()V", RXScreenCaptureService.KEY_INDEX, "Ll/td10;", "getCoreModule", "()Ll/td10;", "Ljava/util/HashSet;", "Ll/ccg0;", "Lkotlin/collections/HashSet;", "j", "Lkotlin/Lazy;", "N3", "()Ljava/util/HashSet;", "callsInfo", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ug10<D extends oo2> extends qct<D> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final td10<D> coreModule;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Lazy callsInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug10(@NotNull dum<D> dumVar, @NotNull td10<D> td10Var) {
        super(dumVar);
        dumVar.getClass();
        td10Var.getClass();
        this.coreModule = td10Var;
        this.callsInfo = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.qg10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ug10.m195882M3();
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    public static void m195879J3(ug10 ug10Var, BLiveJsAudienceInfoData bLiveJsAudienceInfoData) {
        Iterator<T> it = ug10Var.m195883N3().iterator();
        while (it.hasNext()) {
            ((ccg0) it.next()).f80968a.call(bLiveJsAudienceInfoData);
        }
    }

    /* JADX INFO: renamed from: K3 */
    public static BLiveJsAudienceInfoData m195880K3(ug10 ug10Var, le10 le10Var) {
        return bf10.m103842s(ug10Var);
    }

    /* JADX INFO: renamed from: L3 */
    public static BLiveJsAudienceInfoData m195881L3(Function1 function1, Object obj) {
        return (BLiveJsAudienceInfoData) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M3 */
    public static HashSet m195882M3() {
        return new HashSet();
    }

    /* JADX INFO: renamed from: N3 */
    public final HashSet<ccg0> m195883N3() {
        return (HashSet) this.callsInfo.getValue();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        C22421c<le10> c22421cM190585c4 = this.coreModule.m190585c4();
        final Function1 function1 = new Function1() { // from class: l.rg10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ug10.m195880K3(this.f162895a, (le10) obj);
            }
        };
        duringCreated(c22421cM190585c4.map(new qcj() { // from class: l.sg10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ug10.m195881L3(function1, obj);
            }
        })).subscribe(dhw.m115829h(new y20() { // from class: l.tg10
            @Override // p153l.y20
            public final void call(Object obj) {
                ug10.m195879J3(this.f174034a, (BLiveJsAudienceInfoData) obj);
            }
        }));
    }
}
