package p009l;

import com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import kotlin.Metadata;
import l.bsm;
import l.bwr;
import l.e30;
import l.ffw;
import l.fhm0;
import l.roj0;
import l.s25;
import l.x4s;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\nJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\nR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Ll/cho0;", "Ll/gxn0;", "Ll/fhm0;", "Ll/mtn0;", "Ll/bsm;", "info", "<init>", "(Ll/bsm;)V", "", "t", "()V", "k4", "m4", "", "l4", "()Z", "n", "", "j", "Ljava/lang/String;", "getInviteId", "()Ljava/lang/String;", "setInviteId", "(Ljava/lang/String;)V", "inviteId", "", "k", "J", "delay_time", "Ljava/lang/Runnable;", "l", "Ljava/lang/Runnable;", "dismissRunable", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class cho0 extends gxn0<fhm0, mtn0> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public String inviteId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final long delay_time;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Runnable dismissRunable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cho0(@NotNull bsm<fhm0> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        this.inviteId = "";
        this.delay_time = 60000L;
        this.dismissRunable = new Runnable() { // from class: l.sgo0
            @Override // java.lang.Runnable
            public final void run() {
                cho0.m12569e4(this.f20252a);
            }
        };
        C(new mtn0());
    }

    /* JADX INFO: renamed from: a4 */
    public static void m12565a4(Throwable th) {
        s25.c(th);
    }

    /* JADX INFO: renamed from: b4 */
    public static void m12566b4(cho0 cho0Var, VoiceLiveManager.VoiceManagerInvite voiceManagerInvite) {
        String inviteId = voiceManagerInvite.getInviteId();
        inviteId.getClass();
        cho0Var.inviteId = inviteId;
        ((mtn0) ((bwr) cho0Var).viewModel).m18632e();
        cho0Var.z3(cho0Var.delay_time, cho0Var.dismissRunable);
    }

    /* JADX INFO: renamed from: c4 */
    public static void m12567c4(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: d4 */
    public static void m12568d4(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: e4 */
    public static void m12569e4(cho0 cho0Var) {
        ((mtn0) ((bwr) cho0Var).viewModel).m18631d();
    }

    /* JADX INFO: renamed from: f4 */
    public static void m12570f4(Throwable th) {
        s25.c(th);
    }

    /* JADX INFO: renamed from: g4 */
    public static void m12571g4(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: h4 */
    public static void m12572h4(Throwable th) {
        s25.c(th);
    }

    /* JADX INFO: renamed from: i4 */
    public static void m12573i4(Throwable th) {
        s25.c(th);
    }

    /* JADX INFO: renamed from: j4 */
    public static void m12574j4(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12575k4() {
        if (!m12576l4()) {
            duringCreated(VoiceRoomApiProvider.operationManagerInvite(E2().k(), this.inviteId, "approve")).subscribe(ffw.e(new e30() { // from class: l.wgo0
                public final void call(Object obj) {
                    cho0.m12571g4((roj0) obj);
                }
            }, new e30() { // from class: l.xgo0
                public final void call(Object obj) {
                    cho0.m12573i4((Throwable) obj);
                }
            }));
            return;
        }
        VirtualVoiceRoomApiProvider virtualVoiceRoomApiProvider = VirtualVoiceRoomApiProvider.INSTANCE;
        String strO = E2().o();
        strO.getClass();
        duringCreated(virtualVoiceRoomApiProvider.approveManagerInvite(strO, this.inviteId)).subscribe(ffw.e(new e30() { // from class: l.ugo0
            public final void call(Object obj) {
                cho0.m12567c4((roj0) obj);
            }
        }, new e30() { // from class: l.vgo0
            public final void call(Object obj) {
                cho0.m12565a4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public final boolean m12576l4() {
        return x4s.b(((BLiveAbsData) E2().V2()).liveMode);
    }

    /* JADX INFO: renamed from: m4 */
    public final void m12577m4() {
        if (!m12576l4()) {
            duringCreated(VoiceRoomApiProvider.operationManagerInvite(E2().k(), this.inviteId, "reject")).subscribe(ffw.e(new e30() { // from class: l.aho0
                public final void call(Object obj) {
                    cho0.m12574j4((roj0) obj);
                }
            }, new e30() { // from class: l.bho0
                public final void call(Object obj) {
                    cho0.m12570f4((Throwable) obj);
                }
            }));
            return;
        }
        VirtualVoiceRoomApiProvider virtualVoiceRoomApiProvider = VirtualVoiceRoomApiProvider.INSTANCE;
        String strO = E2().o();
        strO.getClass();
        duringCreated(virtualVoiceRoomApiProvider.rejectManagerInvite(strO, this.inviteId)).subscribe(ffw.e(new e30() { // from class: l.ygo0
            public final void call(Object obj) {
                cho0.m12568d4((roj0) obj);
            }
        }, new e30() { // from class: l.zgo0
            public final void call(Object obj) {
                cho0.m12572h4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public void m12578n() {
        super.n();
        E3(this.dismissRunable);
    }

    @Override // p009l.gxn0
    /* JADX INFO: renamed from: t */
    public void mo12579t() {
        super.mo12579t();
        duringCreated(E2().q1().b0).subscribe(ffw.h(new e30() { // from class: l.tgo0
            public final void call(Object obj) {
                cho0.m12566b4(this.f20672a, (VoiceLiveManager.VoiceManagerInvite) obj);
            }
        }));
    }
}
