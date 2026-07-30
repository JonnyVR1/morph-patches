package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceManager;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.iam;
import p153l.rwn0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\f\b\u0001\u0010\u0004*\u0006\u0012\u0002\b\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\fR*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m88121d2 = {"Ll/k6o0;", "Ll/rwn0;", "D", "Ll/iam;", p7f.GPS_MEASUREMENT_INTERRUPTED, "Ll/i6t;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", Constants.KEY_T, "()V", "W3", "Z3", "V3", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManager;", RXScreenCaptureService.KEY_INDEX, "Ljava/util/List;", "U3", "()Ljava/util/List;", "setCurrentManagers", "(Ljava/util/List;)V", "currentManagers", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public class k6o0<D extends rwn0, V extends iam<?>> extends i6t<D, V> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public List<BLiveVoiceManager> currentManagers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6o0(@NotNull dum<D> dumVar) {
        super(dumVar);
        dumVar.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J3 */
    public static void m148518J3(k6o0 k6o0Var, jsv jsvVar) {
        if (!jsvVar.m146877c() || ((rwn0) k6o0Var.m213810E2()).m183434i3()) {
            return;
        }
        k6o0Var.currentManagers = null;
    }

    /* JADX INFO: renamed from: K3 */
    public static void m148519K3(k6o0 k6o0Var, C4470c c4470c) {
        k6o0Var.m148531W3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L3 */
    public static void m148520L3(k6o0 k6o0Var, List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = new ArrayList();
        }
        k6o0Var.currentManagers = list;
        ((rwn0) k6o0Var.m213810E2()).f148282z.m170283n().m137019l(jyb.m147486Q(list, new qcj() { // from class: l.j6o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return k6o0.m148528X3((BLiveVoiceManager) obj);
            }
        }));
        k6o0Var.mo128552V3();
    }

    /* JADX INFO: renamed from: N3 */
    public static void m148522N3(k6o0 k6o0Var, VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate) {
        k6o0Var.m148531W3();
        k6o0Var.mo128553Z3();
    }

    /* JADX INFO: renamed from: O3 */
    public static Boolean m148523O3(C4470c c4470c) {
        c4470c.getClass();
        return Boolean.valueOf(c4470c == C4470c.f16267i);
    }

    /* JADX INFO: renamed from: R3 */
    public static List m148525R3(k6o0 k6o0Var, x5o0 x5o0Var) {
        return k6o0Var.currentManagers;
    }

    /* JADX INFO: renamed from: S3 */
    public static Boolean m148526S3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public static void m148527T3(k6o0 k6o0Var, List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = new ArrayList();
        }
        k6o0Var.currentManagers = list;
        ((rwn0) k6o0Var.m213810E2()).f148282z.m170283n().m137019l(jyb.m147486Q(list, new qcj() { // from class: l.i6o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return k6o0.m148529Y3((BLiveVoiceManager) obj);
            }
        }));
        k6o0Var.mo128552V3();
    }

    /* JADX INFO: renamed from: X3 */
    public static final String m148528X3(BLiveVoiceManager bLiveVoiceManager) {
        return bLiveVoiceManager.userId;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final String m148529Y3(BLiveVoiceManager bLiveVoiceManager) {
        return bLiveVoiceManager.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: U3 */
    public final List<BLiveVoiceManager> m148530U3() {
        return this.currentManagers;
    }

    /* JADX INFO: renamed from: W3 */
    public void m148531W3() {
        if (!m213810E2().m183434i3()) {
            duringCreated(VoiceRoomApiProvider.getCurrentLiveManagers(m213810E2().m202191k())).subscribe(dhw.m115829h(new y20() { // from class: l.h6o0
                @Override // p153l.y20
                public final void call(Object obj) {
                    k6o0.m148527T3(this.f108042a, (List) obj);
                }
            }));
            return;
        }
        String strM202194o = m213810E2().m202194o();
        strM202194o.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.refreshCurrentManager(strM202194o)).subscribe(dhw.m115829h(new y20() { // from class: l.g6o0
            @Override // p153l.y20
            public final void call(Object obj) {
                k6o0.m148520L3(this.f102470a, (List) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m168545q1().f71701c0).subscribe(dhw.m115829h(new y20() { // from class: l.a6o0
            @Override // p153l.y20
            public final void call(Object obj) {
                k6o0.m148522N3(this.f68744a, (VoiceLiveManager.VoiceManagerUpdate) obj);
            }
        }));
        duringCreated(m213810E2().m202192l()).subscribe(dhw.m115825d(new y20() { // from class: l.b6o0
            @Override // p153l.y20
            public final void call(Object obj) {
                k6o0.m148518J3(this.f75200a, (jsv) obj);
            }
        }));
        m138860d3(x5o0.class, new qcj() { // from class: l.c6o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return k6o0.m148525R3(this.f79983a, (x5o0) obj);
            }
        });
        C22421c<T> c22421cDuringCreated = duringCreated(lifecycle());
        final Function1 function1 = new Function1() { // from class: l.d6o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k6o0.m148523O3((C4470c) obj);
            }
        };
        c22421cDuringCreated.filter(new qcj() { // from class: l.e6o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return k6o0.m148526S3(function1, obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.f6o0
            @Override // p153l.y20
            public final void call(Object obj) {
                k6o0.m148519K3(this.f97435a, (C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V3 */
    public void mo128552V3() {
    }

    /* JADX INFO: renamed from: Z3 */
    public void mo128553Z3() {
    }
}
