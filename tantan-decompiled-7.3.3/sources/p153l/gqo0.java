package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\nJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\nR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m88121d2 = {"Ll/gqo0;", "Ll/k6o0;", "Ll/jqm0;", "Ll/q2o0;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", Constants.KEY_T, "()V", "k4", "m4", "", "l4", "()Z", "n", "", "j", "Ljava/lang/String;", "getInviteId", "()Ljava/lang/String;", "setInviteId", "(Ljava/lang/String;)V", "inviteId", "", "k", "J", "delay_time", "Ljava/lang/Runnable;", BLiveStormDanmakuGiftResourceType.f45292l, "Ljava/lang/Runnable;", "dismissRunable", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class gqo0 extends k6o0<jqm0, q2o0> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public String inviteId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final long delay_time;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Runnable dismissRunable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqo0(@NotNull dum<jqm0> dumVar) {
        super(dumVar);
        dumVar.getClass();
        this.inviteId = "";
        this.delay_time = Constants.ONE_MIN_IN_MILLIS;
        this.dismissRunable = new Runnable() { // from class: l.wpo0
            @Override // java.lang.Runnable
            public final void run() {
                gqo0.m131405e4(this.f190327a);
            }
        };
        mo52715C(new q2o0());
    }

    /* JADX INFO: renamed from: a4 */
    public static void m131401a4(Throwable th) {
        r35.m179578c(th);
    }

    /* JADX INFO: renamed from: b4 */
    public static void m131402b4(gqo0 gqo0Var, VoiceLiveManager.VoiceManagerInvite voiceManagerInvite) {
        String inviteId = voiceManagerInvite.getInviteId();
        inviteId.getClass();
        gqo0Var.inviteId = inviteId;
        ((q2o0) gqo0Var.viewModel).m175092e();
        gqo0Var.m138879z3(gqo0Var.delay_time, gqo0Var.dismissRunable);
    }

    /* JADX INFO: renamed from: c4 */
    public static void m131403c4(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: d4 */
    public static void m131404d4(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: e4 */
    public static void m131405e4(gqo0 gqo0Var) {
        ((q2o0) gqo0Var.viewModel).m175091d();
    }

    /* JADX INFO: renamed from: f4 */
    public static void m131406f4(Throwable th) {
        r35.m179578c(th);
    }

    /* JADX INFO: renamed from: g4 */
    public static void m131407g4(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: h4 */
    public static void m131408h4(Throwable th) {
        r35.m179578c(th);
    }

    /* JADX INFO: renamed from: i4 */
    public static void m131409i4(Throwable th) {
        r35.m179578c(th);
    }

    /* JADX INFO: renamed from: j4 */
    public static void m131410j4(uxj0 uxj0Var) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m131411k4() {
        if (!m131412l4()) {
            duringCreated(VoiceRoomApiProvider.operationManagerInvite(((jqm0) m213810E2()).m202191k(), this.inviteId, "approve")).subscribe(dhw.m115826e(new y20() { // from class: l.aqo0
                @Override // p153l.y20
                public final void call(Object obj) {
                    gqo0.m131407g4((uxj0) obj);
                }
            }, new y20() { // from class: l.bqo0
                @Override // p153l.y20
                public final void call(Object obj) {
                    gqo0.m131409i4((Throwable) obj);
                }
            }));
            return;
        }
        VirtualVoiceRoomApiProvider virtualVoiceRoomApiProvider = VirtualVoiceRoomApiProvider.INSTANCE;
        String strM202194o = ((jqm0) m213810E2()).m202194o();
        strM202194o.getClass();
        duringCreated(virtualVoiceRoomApiProvider.approveManagerInvite(strM202194o, this.inviteId)).subscribe(dhw.m115826e(new y20() { // from class: l.ypo0
            @Override // p153l.y20
            public final void call(Object obj) {
                gqo0.m131403c4((uxj0) obj);
            }
        }, new y20() { // from class: l.zpo0
            @Override // p153l.y20
            public final void call(Object obj) {
                gqo0.m131401a4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l4 */
    public final boolean m131412l4() {
        return y6s.m214494b(((jqm0) m213810E2()).mo183435j().liveMode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m4 */
    public final void m131413m4() {
        if (!m131412l4()) {
            duringCreated(VoiceRoomApiProvider.operationManagerInvite(((jqm0) m213810E2()).m202191k(), this.inviteId, "reject")).subscribe(dhw.m115826e(new y20() { // from class: l.eqo0
                @Override // p153l.y20
                public final void call(Object obj) {
                    gqo0.m131410j4((uxj0) obj);
                }
            }, new y20() { // from class: l.fqo0
                @Override // p153l.y20
                public final void call(Object obj) {
                    gqo0.m131406f4((Throwable) obj);
                }
            }));
            return;
        }
        VirtualVoiceRoomApiProvider virtualVoiceRoomApiProvider = VirtualVoiceRoomApiProvider.INSTANCE;
        String strM202194o = ((jqm0) m213810E2()).m202194o();
        strM202194o.getClass();
        duringCreated(virtualVoiceRoomApiProvider.rejectManagerInvite(strM202194o, this.inviteId)).subscribe(dhw.m115826e(new y20() { // from class: l.cqo0
            @Override // p153l.y20
            public final void call(Object obj) {
                gqo0.m131404d4((uxj0) obj);
            }
        }, new y20() { // from class: l.dqo0
            @Override // p153l.y20
            public final void call(Object obj) {
                gqo0.m131408h4((Throwable) obj);
            }
        }));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m138855E3(this.dismissRunable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.k6o0, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((jqm0) m213810E2()).m168545q1().f71697b0).subscribe(dhw.m115829h(new y20() { // from class: l.xpo0
            @Override // p153l.y20
            public final void call(Object obj) {
                gqo0.m131402b4(this.f195723a, (VoiceLiveManager.VoiceManagerInvite) obj);
            }
        }));
    }
}
