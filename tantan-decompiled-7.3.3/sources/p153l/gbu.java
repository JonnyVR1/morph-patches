package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveSquareSummary;
import com.p051p1.mobile.putong.live.external.square.LiveSquareSummaryInfo;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import com.tantan.live.home.eventbus.LiveHomeEventBus.LiveHomeSummaryEvent;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, m88121d2 = {"Ll/gbu;", "Ll/txs;", "Ll/ner;", "lifecycleProvider", "Ll/nus;", "homeInfo", "<init>", "(Ll/ner;Ll/nus;)V", "", p7f.GPS_DIRECTION_TRUE, "()V", "U2", "f", "Ll/ner;", "getLifecycleProvider", "()Ll/ner;", "g", "Ll/nus;", "Ll/a1h0;", "h", "Ll/a1h0;", "getUtil", "()Ll/a1h0;", "util", "", RXScreenCaptureService.KEY_INDEX, "Z", "showNearByFirst", "j", "isColdStart", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class gbu extends txs {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final ner lifecycleProvider;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final nus homeInfo;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final a1h0 util;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean showNearByFirst;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean isColdStart;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbu(@NotNull ner nerVar, @NotNull nus nusVar) {
        super(nerVar, nusVar);
        nerVar.getClass();
        nusVar.getClass();
        this.lifecycleProvider = nerVar;
        this.homeInfo = nusVar;
        this.util = new a1h0();
        this.showNearByFirst = true;
        this.isColdStart = true;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX INFO: renamed from: Q2 */
    public static Boolean m129806Q2(gbu gbuVar, LiveSquareSummaryInfo liveSquareSummaryInfo) {
        boolean z;
        if (liveSquareSummaryInfo == null || liveSquareSummaryInfo.getFirstLiveSquareSummary() == null) {
            z = false;
        } else {
            int role = gbuVar.util.getRole();
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
    public static void m129807R2(gbu gbuVar, uwl uwlVar) {
        if (uwlVar instanceof l6t) {
            gbuVar.m153097C2((l6t) uwlVar);
        }
    }

    /* JADX INFO: renamed from: S2 */
    public static Boolean m129808S2(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T2 */
    public static void m129809T2(gbu gbuVar, LiveSquareSummaryInfo liveSquareSummaryInfo) {
        BLiveSquareSummary firstLiveSquareSummary = liveSquareSummaryInfo.getFirstLiveSquareSummary();
        if (firstLiveSquareSummary != null) {
            gbuVar.m129810U2();
            gbuVar.util.m95508c(firstLiveSquareSummary.role);
            int i = firstLiveSquareSummary.role;
            if (i == 24 && gbuVar.showNearByFirst) {
                gbuVar.showNearByFirst = false;
            }
            if (i == 10) {
                gbuVar.m153103z2(new x1h0(gbuVar.lifecycleProvider, gbuVar.homeInfo));
                gbuVar.m153103z2(new m1h0(gbuVar.lifecycleProvider, gbuVar.homeInfo, gbuVar.util));
            } else if (i == 20 || i == 24) {
                gbuVar.m153103z2(new x0h0(gbuVar.lifecycleProvider, gbuVar.homeInfo, gbuVar.util));
                gbuVar.m153103z2(new m1h0(gbuVar.lifecycleProvider, gbuVar.homeInfo, gbuVar.util));
            } else {
                Unit unit = Unit.INSTANCE;
            }
            gbuVar.isColdStart = false;
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        if (ppi0.m173207l().m173228x()) {
            return;
        }
        LiveHomeEventBus liveHomeEventBusM160238F2 = m160238F2();
        liveHomeEventBusM160238F2.getClass();
        C22421c<T> c22421cDuringCreated = duringCreated(liveHomeEventBusM160238F2.new LiveHomeSummaryEvent().summary().m199270g());
        final Function1 function1 = new Function1() { // from class: l.cbu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return gbu.m129806Q2(this.f80855a, (LiveSquareSummaryInfo) obj);
            }
        };
        c22421cDuringCreated.filter(new qcj() { // from class: l.dbu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return gbu.m129808S2(function1, obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.ebu
            @Override // p153l.y20
            public final void call(Object obj) {
                gbu.m129809T2(this.f92987a, (LiveSquareSummaryInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U2 */
    public final void m129810U2() {
        HashMap<String, uwl> map = this.f130285b;
        if (map == null || map.isEmpty()) {
            return;
        }
        HashMap map2 = new HashMap(this.f130285b);
        jyb.m147537z(map2.values(), new y20() { // from class: l.fbu
            @Override // p153l.y20
            public final void call(Object obj) {
                gbu.m129807R2(this.f98156a, (uwl) obj);
            }
        });
        map2.clear();
    }
}
