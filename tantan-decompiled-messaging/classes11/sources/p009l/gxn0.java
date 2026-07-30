package p009l;

import com.p1.mobile.android.app.c;
import com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p1.mobile.putong.live.base.data.BLiveVoiceManager;
import com.p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import l.bsm;
import l.e30;
import l.ffw;
import l.h4t;
import l.ho2;
import l.iqv;
import l.nnn0;
import l.s7m;
import l.vwb;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\f\b\u0001\u0010\u0004*\u0006\u0012\u0002\b\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\fR*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ll/gxn0;", "Ll/nnn0;", "D", "Ll/s7m;", "V", "Ll/h4t;", "Ll/bsm;", "info", "<init>", "(Ll/bsm;)V", "", "t", "()V", "W3", "Z3", "V3", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManager;", "i", "Ljava/util/List;", "U3", "()Ljava/util/List;", "setCurrentManagers", "(Ljava/util/List;)V", "currentManagers", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class gxn0<D extends nnn0, V extends s7m<?>> extends h4t<D, V> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public List<BLiveVoiceManager> currentManagers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxn0(@NotNull bsm<D> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
    }

    /* JADX INFO: renamed from: J3 */
    public static void m15345J3(gxn0 gxn0Var, iqv iqvVar) {
        if (!iqvVar.c() || gxn0Var.E2().i3()) {
            return;
        }
        gxn0Var.currentManagers = null;
    }

    /* JADX INFO: renamed from: K3 */
    public static void m15346K3(gxn0 gxn0Var, c cVar) {
        gxn0Var.m15358W3();
    }

    /* JADX INFO: renamed from: L3 */
    public static void m15347L3(gxn0 gxn0Var, List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = new ArrayList();
        }
        gxn0Var.currentManagers = list;
        ((ho2) gxn0Var.E2()).z.n().onNext(vwb.Q(list, new w9j() { // from class: l.fxn0
            public final Object call(Object obj) {
                return gxn0.m15355X3((BLiveVoiceManager) obj);
            }
        }));
        gxn0Var.mo12837V3();
    }

    /* JADX INFO: renamed from: N3 */
    public static void m15349N3(gxn0 gxn0Var, VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate) {
        gxn0Var.m15358W3();
        gxn0Var.mo12838Z3();
    }

    /* JADX INFO: renamed from: O3 */
    public static Boolean m15350O3(c cVar) {
        cVar.getClass();
        return Boolean.valueOf(cVar == c.i);
    }

    /* JADX INFO: renamed from: R3 */
    public static List m15352R3(gxn0 gxn0Var, twn0 twn0Var) {
        return gxn0Var.currentManagers;
    }

    /* JADX INFO: renamed from: S3 */
    public static Boolean m15353S3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m15354T3(gxn0 gxn0Var, List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = new ArrayList();
        }
        gxn0Var.currentManagers = list;
        ((ho2) gxn0Var.E2()).z.n().onNext(vwb.Q(list, new w9j() { // from class: l.exn0
            public final Object call(Object obj) {
                return gxn0.m15356Y3((BLiveVoiceManager) obj);
            }
        }));
        gxn0Var.mo12837V3();
    }

    /* JADX INFO: renamed from: X3 */
    public static final String m15355X3(BLiveVoiceManager bLiveVoiceManager) {
        return bLiveVoiceManager.userId;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final String m15356Y3(BLiveVoiceManager bLiveVoiceManager) {
        return bLiveVoiceManager.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: U3 */
    public final List<BLiveVoiceManager> m15357U3() {
        return this.currentManagers;
    }

    /* JADX INFO: renamed from: W3 */
    public void m15358W3() {
        if (!E2().i3()) {
            duringCreated(VoiceRoomApiProvider.getCurrentLiveManagers(E2().k())).subscribe(ffw.h(new e30() { // from class: l.dxn0
                public final void call(Object obj) {
                    gxn0.m15354T3(this.f12039a, (List) obj);
                }
            }));
            return;
        }
        String strO = E2().o();
        strO.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.refreshCurrentManager(strO)).subscribe(ffw.h(new e30() { // from class: l.cxn0
            public final void call(Object obj) {
                gxn0.m15347L3(this.f10805a, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public void mo12579t() {
        super/*l.k4t*/.t();
        duringCreated(E2().q1().c0).subscribe(ffw.h(new e30() { // from class: l.wwn0
            public final void call(Object obj) {
                gxn0.m15349N3(this.f22349a, (VoiceLiveManager.VoiceManagerUpdate) obj);
            }
        }));
        duringCreated(E2().l()).subscribe(ffw.d(new e30() { // from class: l.xwn0
            public final void call(Object obj) {
                gxn0.m15345J3(this.f22748a, (iqv) obj);
            }
        }));
        d3(twn0.class, new w9j() { // from class: l.ywn0
            public final Object call(Object obj) {
                return gxn0.m15352R3(this.f23259a, (twn0) obj);
            }
        });
        rx.c cVarDuringCreated = duringCreated(lifecycle());
        final Function1 function1 = new Function1() { // from class: l.zwn0
            public final Object invoke(Object obj) {
                return gxn0.m15350O3((c) obj);
            }
        };
        cVarDuringCreated.filter(new w9j() { // from class: l.axn0
            public final Object call(Object obj) {
                return gxn0.m15353S3(function1, obj);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.bxn0
            public final void call(Object obj) {
                gxn0.m15346K3(this.f10350a, (c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V3 */
    public void mo12837V3() {
    }

    /* JADX INFO: renamed from: Z3 */
    public void mo12838Z3() {
    }
}
