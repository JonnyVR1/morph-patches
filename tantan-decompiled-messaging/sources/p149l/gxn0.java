package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceManager;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.nnn0;
import p149l.s7m;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\f\b\u0001\u0010\u0004*\u0006\u0012\u0002\b\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\fR*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m87232d2 = {"Ll/gxn0;", "Ll/nnn0;", "D", "Ll/s7m;", j6f.GPS_MEASUREMENT_INTERRUPTED, "Ll/h4t;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "W3", "Z3", "V3", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManager;", RXScreenCaptureService.KEY_INDEX, "Ljava/util/List;", "U3", "()Ljava/util/List;", "setCurrentManagers", "(Ljava/util/List;)V", "currentManagers", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public class gxn0<D extends nnn0, V extends s7m<?>> extends h4t<D, V> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public List<BLiveVoiceManager> currentManagers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxn0(@NotNull bsm<D> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J3 */
    public static void m128619J3(gxn0 gxn0Var, iqv iqvVar) {
        if (!iqvVar.m137796c() || ((nnn0) gxn0Var.m206027E2()).m160271i3()) {
            return;
        }
        gxn0Var.currentManagers = null;
    }

    /* JADX INFO: renamed from: K3 */
    public static void m128620K3(gxn0 gxn0Var, C4319c c4319c) {
        gxn0Var.m128632W3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L3 */
    public static void m128621L3(gxn0 gxn0Var, List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = new ArrayList();
        }
        gxn0Var.currentManagers = list;
        ((nnn0) gxn0Var.m206027E2()).f108769z.m181788n().m132487l(vwb.m200303Q(list, new w9j() { // from class: l.fxn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return gxn0.m128629X3((BLiveVoiceManager) obj);
            }
        }));
        gxn0Var.mo108555V3();
    }

    /* JADX INFO: renamed from: N3 */
    public static void m128623N3(gxn0 gxn0Var, VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate) {
        gxn0Var.m128632W3();
        gxn0Var.mo108556Z3();
    }

    /* JADX INFO: renamed from: O3 */
    public static Boolean m128624O3(C4319c c4319c) {
        c4319c.getClass();
        return Boolean.valueOf(c4319c == C4319c.f15548i);
    }

    /* JADX INFO: renamed from: R3 */
    public static List m128626R3(gxn0 gxn0Var, twn0 twn0Var) {
        return gxn0Var.currentManagers;
    }

    /* JADX INFO: renamed from: S3 */
    public static Boolean m128627S3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public static void m128628T3(gxn0 gxn0Var, List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = new ArrayList();
        }
        gxn0Var.currentManagers = list;
        ((nnn0) gxn0Var.m206027E2()).f108769z.m181788n().m132487l(vwb.m200303Q(list, new w9j() { // from class: l.exn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return gxn0.m128630Y3((BLiveVoiceManager) obj);
            }
        }));
        gxn0Var.mo108555V3();
    }

    /* JADX INFO: renamed from: X3 */
    public static final String m128629X3(BLiveVoiceManager bLiveVoiceManager) {
        return bLiveVoiceManager.userId;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final String m128630Y3(BLiveVoiceManager bLiveVoiceManager) {
        return bLiveVoiceManager.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: U3 */
    public final List<BLiveVoiceManager> m128631U3() {
        return this.currentManagers;
    }

    /* JADX INFO: renamed from: W3 */
    public void m128632W3() {
        if (!m206027E2().m160271i3()) {
            duringCreated(VoiceRoomApiProvider.getCurrentLiveManagers(m206027E2().m149814k())).subscribe(ffw.m121197h(new e30() { // from class: l.dxn0
                @Override // p149l.e30
                public final void call(Object obj) {
                    gxn0.m128628T3(this.f88313a, (List) obj);
                }
            }));
            return;
        }
        String strM149818o = m206027E2().m149818o();
        strM149818o.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.refreshCurrentManager(strM149818o)).subscribe(ffw.m121197h(new e30() { // from class: l.cxn0
            @Override // p149l.e30
            public final void call(Object obj) {
                gxn0.m128621L3(this.f82881a, (List) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m132160q1().f170434c0).subscribe(ffw.m121197h(new e30() { // from class: l.wwn0
            @Override // p149l.e30
            public final void call(Object obj) {
                gxn0.m128623N3(this.f188394a, (VoiceLiveManager.VoiceManagerUpdate) obj);
            }
        }));
        duringCreated(m206027E2().m149815l()).subscribe(ffw.m121193d(new e30() { // from class: l.xwn0
            @Override // p149l.e30
            public final void call(Object obj) {
                gxn0.m128619J3(this.f194747a, (iqv) obj);
            }
        }));
        m129301d3(twn0.class, new w9j() { // from class: l.ywn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return gxn0.m128626R3(this.f200516a, (twn0) obj);
            }
        });
        C22306c<T> c22306cDuringCreated = duringCreated(lifecycle());
        final Function1 function1 = new Function1() { // from class: l.zwn0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return gxn0.m128624O3((C4319c) obj);
            }
        };
        c22306cDuringCreated.filter(new w9j() { // from class: l.axn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return gxn0.m128627S3(function1, obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.bxn0
            @Override // p149l.e30
            public final void call(Object obj) {
                gxn0.m128620K3(this.f77816a, (C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V3 */
    public void mo108555V3() {
    }

    /* JADX INFO: renamed from: Z3 */
    public void mo108556Z3() {
    }
}
