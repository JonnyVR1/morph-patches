package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveSquareSummary;
import com.p046p1.mobile.putong.live.external.square.LiveSquareSummaryInfo;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import com.tantan.live.home.eventbus.LiveHomeEventBus.LiveHomeSummaryEvent;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, m87232d2 = {"Ll/f9u;", "Ll/svs;", "Ll/mcr;", "lifecycleProvider", "Ll/mss;", "homeInfo", "<init>", "(Ll/mcr;Ll/mss;)V", "", j6f.GPS_DIRECTION_TRUE, "()V", "U2", "f", "Ll/mcr;", "getLifecycleProvider", "()Ll/mcr;", "g", "Ll/mss;", "Ll/ssg0;", "h", "Ll/ssg0;", "getUtil", "()Ll/ssg0;", "util", "", RXScreenCaptureService.KEY_INDEX, "Z", "showNearByFirst", "j", "isColdStart", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class f9u extends svs {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final mcr lifecycleProvider;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final mss homeInfo;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final ssg0 util;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean showNearByFirst;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean isColdStart;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9u(@NotNull mcr mcrVar, @NotNull mss mssVar) {
        super(mcrVar, mssVar);
        mcrVar.getClass();
        mssVar.getClass();
        this.lifecycleProvider = mcrVar;
        this.homeInfo = mssVar;
        this.util = new ssg0();
        this.showNearByFirst = true;
        this.isColdStart = true;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX INFO: renamed from: Q2 */
    public static Boolean m120121Q2(f9u f9uVar, LiveSquareSummaryInfo liveSquareSummaryInfo) {
        boolean z;
        if (liveSquareSummaryInfo == null || liveSquareSummaryInfo.getFirstLiveSquareSummary() == null) {
            z = false;
        } else {
            int role = f9uVar.util.getRole();
            BLiveSquareSummary firstLiveSquareSummary = liveSquareSummaryInfo.getFirstLiveSquareSummary();
            firstLiveSquareSummary.getClass();
            if (role != firstLiveSquareSummary.role) {
                z = true;
            } else {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: R2 */
    public static void m120122R2(f9u f9uVar, gul gulVar) {
        if (gulVar instanceof k4t) {
            f9uVar.m144506C2((k4t) gulVar);
        }
    }

    /* JADX INFO: renamed from: S2 */
    public static Boolean m120123S2(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T2 */
    public static void m120124T2(f9u f9uVar, LiveSquareSummaryInfo liveSquareSummaryInfo) {
        BLiveSquareSummary firstLiveSquareSummary = liveSquareSummaryInfo.getFirstLiveSquareSummary();
        if (firstLiveSquareSummary != null) {
            f9uVar.m120125U2();
            f9uVar.util.m185747c(firstLiveSquareSummary.role);
            int i = firstLiveSquareSummary.role;
            if (i == 24 && f9uVar.showNearByFirst) {
                f9uVar.showNearByFirst = false;
            }
            if (i == 10) {
                f9uVar.m144512z2(new ptg0(f9uVar.lifecycleProvider, f9uVar.homeInfo));
                f9uVar.m144512z2(new etg0(f9uVar.lifecycleProvider, f9uVar.homeInfo, f9uVar.util));
            } else if (i == 20 || i == 24) {
                f9uVar.m144512z2(new psg0(f9uVar.lifecycleProvider, f9uVar.homeInfo, f9uVar.util));
                f9uVar.m144512z2(new etg0(f9uVar.lifecycleProvider, f9uVar.homeInfo, f9uVar.util));
            } else {
                Unit unit = Unit.INSTANCE;
            }
            f9uVar.isColdStart = false;
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        if (pgi0.m168730l().m168751x()) {
            return;
        }
        LiveHomeEventBus liveHomeEventBusM151642F2 = m151642F2();
        liveHomeEventBusM151642F2.getClass();
        C22306c<T> c22306cDuringCreated = duringCreated(liveHomeEventBusM151642F2.new LiveHomeSummaryEvent().summary().m172460g());
        final Function1 function1 = new Function1() { // from class: l.b9u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f9u.m120121Q2(this.f74626a, (LiveSquareSummaryInfo) obj);
            }
        };
        c22306cDuringCreated.filter(new w9j() { // from class: l.c9u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return f9u.m120123S2(function1, obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.d9u
            @Override // p149l.e30
            public final void call(Object obj) {
                f9u.m120124T2(this.f85156a, (LiveSquareSummaryInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U2 */
    public final void m120125U2() {
        HashMap<String, gul> map = this.f121122b;
        if (map == null || map.isEmpty()) {
            return;
        }
        HashMap map2 = new HashMap(this.f121122b);
        vwb.m200354z(map2.values(), new e30() { // from class: l.e9u
            @Override // p149l.e30
            public final void call(Object obj) {
                f9u.m120122R2(this.f90135a, (gul) obj);
            }
        });
        map2.clear();
    }
}
