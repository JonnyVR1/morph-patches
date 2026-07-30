package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\nJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\nR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m87232d2 = {"Ll/cho0;", "Ll/gxn0;", "Ll/fhm0;", "Ll/mtn0;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "k4", "m4", "", "l4", "()Z", "n", "", "j", "Ljava/lang/String;", "getInviteId", "()Ljava/lang/String;", "setInviteId", "(Ljava/lang/String;)V", "inviteId", "", "k", "J", "delay_time", "Ljava/lang/Runnable;", BLiveStormDanmakuGiftResourceType.f44444l, "Ljava/lang/Runnable;", "dismissRunable", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
        this.delay_time = Constants.ONE_MIN_IN_MILLIS;
        this.dismissRunable = new Runnable() { // from class: l.sgo0
            @Override // java.lang.Runnable
            public final void run() {
                cho0.m106973e4(this.f164456a);
            }
        };
        mo51532C(new mtn0());
    }

    /* JADX INFO: renamed from: a4 */
    public static void m106969a4(Throwable th) {
        s25.m182058c(th);
    }

    /* JADX INFO: renamed from: b4 */
    public static void m106970b4(cho0 cho0Var, VoiceLiveManager.VoiceManagerInvite voiceManagerInvite) {
        String inviteId = voiceManagerInvite.getInviteId();
        inviteId.getClass();
        cho0Var.inviteId = inviteId;
        ((mtn0) cho0Var.viewModel).m156337e();
        cho0Var.m129320z3(cho0Var.delay_time, cho0Var.dismissRunable);
    }

    /* JADX INFO: renamed from: c4 */
    public static void m106971c4(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: d4 */
    public static void m106972d4(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: e4 */
    public static void m106973e4(cho0 cho0Var) {
        ((mtn0) cho0Var.viewModel).m156336d();
    }

    /* JADX INFO: renamed from: f4 */
    public static void m106974f4(Throwable th) {
        s25.m182058c(th);
    }

    /* JADX INFO: renamed from: g4 */
    public static void m106975g4(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: h4 */
    public static void m106976h4(Throwable th) {
        s25.m182058c(th);
    }

    /* JADX INFO: renamed from: i4 */
    public static void m106977i4(Throwable th) {
        s25.m182058c(th);
    }

    /* JADX INFO: renamed from: j4 */
    public static void m106978j4(roj0 roj0Var) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m106979k4() {
        if (!m106980l4()) {
            duringCreated(VoiceRoomApiProvider.operationManagerInvite(((fhm0) m206027E2()).m149814k(), this.inviteId, "approve")).subscribe(ffw.m121194e(new e30() { // from class: l.wgo0
                @Override // p149l.e30
                public final void call(Object obj) {
                    cho0.m106975g4((roj0) obj);
                }
            }, new e30() { // from class: l.xgo0
                @Override // p149l.e30
                public final void call(Object obj) {
                    cho0.m106977i4((Throwable) obj);
                }
            }));
            return;
        }
        VirtualVoiceRoomApiProvider virtualVoiceRoomApiProvider = VirtualVoiceRoomApiProvider.INSTANCE;
        String strM149818o = ((fhm0) m206027E2()).m149818o();
        strM149818o.getClass();
        duringCreated(virtualVoiceRoomApiProvider.approveManagerInvite(strM149818o, this.inviteId)).subscribe(ffw.m121194e(new e30() { // from class: l.ugo0
            @Override // p149l.e30
            public final void call(Object obj) {
                cho0.m106971c4((roj0) obj);
            }
        }, new e30() { // from class: l.vgo0
            @Override // p149l.e30
            public final void call(Object obj) {
                cho0.m106969a4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l4 */
    public final boolean m106980l4() {
        return x4s.m207012b(((fhm0) m206027E2()).mo149813j().liveMode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m4 */
    public final void m106981m4() {
        if (!m106980l4()) {
            duringCreated(VoiceRoomApiProvider.operationManagerInvite(((fhm0) m206027E2()).m149814k(), this.inviteId, "reject")).subscribe(ffw.m121194e(new e30() { // from class: l.aho0
                @Override // p149l.e30
                public final void call(Object obj) {
                    cho0.m106978j4((roj0) obj);
                }
            }, new e30() { // from class: l.bho0
                @Override // p149l.e30
                public final void call(Object obj) {
                    cho0.m106974f4((Throwable) obj);
                }
            }));
            return;
        }
        VirtualVoiceRoomApiProvider virtualVoiceRoomApiProvider = VirtualVoiceRoomApiProvider.INSTANCE;
        String strM149818o = ((fhm0) m206027E2()).m149818o();
        strM149818o.getClass();
        duringCreated(virtualVoiceRoomApiProvider.rejectManagerInvite(strM149818o, this.inviteId)).subscribe(ffw.m121194e(new e30() { // from class: l.ygo0
            @Override // p149l.e30
            public final void call(Object obj) {
                cho0.m106972d4((roj0) obj);
            }
        }, new e30() { // from class: l.zgo0
            @Override // p149l.e30
            public final void call(Object obj) {
                cho0.m106976h4((Throwable) obj);
            }
        }));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m129296E3(this.dismissRunable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.gxn0, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((fhm0) m206027E2()).m132160q1().f170430b0).subscribe(ffw.m121197h(new e30() { // from class: l.tgo0
            @Override // p149l.e30
            public final void call(Object obj) {
                cho0.m106970b4(this.f170109a, (VoiceLiveManager.VoiceManagerInvite) obj);
            }
        }));
    }
}
