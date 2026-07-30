package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceUserLeaderBoard;
import com.p046p1.mobile.putong.live.livingroom.virtual.call.userleaderboard.page.VoiceUserLeaderBoardPage;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\rJ\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, m87232d2 = {"Ll/pbp0;", "Ll/nnn0;", "D", "Ll/zi2;", "Ll/lbp0;", "Ll/bsm;", "curInfo", "<init>", "(Ll/bsm;)V", "S3", "()Ll/lbp0;", "", Constants.KEY_T, "()V", "", "userId", "U3", "(Ljava/lang/String;)V", "N3", "T3", "M3", Oauth2AccessToken.KEY_UID, "V3", "k", "Ll/bsm;", "getCurInfo", "()Ll/bsm;", "Ll/uyo0;", BLiveStormDanmakuGiftResourceType.f44444l, "Ll/uyo0;", "getContentPresenter", "()Ll/uyo0;", "setContentPresenter", "(Ll/uyo0;)V", "contentPresenter", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserLeaderBoard;", "m", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserLeaderBoard;", "getVoiceUserLeaderBoard", "()Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserLeaderBoard;", "setVoiceUserLeaderBoard", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserLeaderBoard;)V", "voiceUserLeaderBoard", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class pbp0<D extends nnn0> extends zi2<D, lbp0> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final bsm<D> curInfo;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public uyo0 contentPresenter;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public BLiveVoiceUserLeaderBoard voiceUserLeaderBoard;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbp0(@NotNull bsm<D> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        this.curInfo = bsmVar;
    }

    /* JADX INFO: renamed from: O3 */
    public static void m168241O3(pbp0 pbp0Var, String str) {
        str.getClass();
        pbp0Var.m168248V3(str);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m168242P3(pbp0 pbp0Var, BLiveVoiceUserLeaderBoard bLiveVoiceUserLeaderBoard) {
        pbp0Var.voiceUserLeaderBoard = bLiveVoiceUserLeaderBoard;
        pbp0Var.mo168244N3();
    }

    /* JADX INFO: renamed from: R3 */
    public static BLiveVoiceUserLeaderBoard m168243R3(Throwable th) {
        return BLiveVoiceUserLeaderBoard.new_();
    }

    @Override // p149l.zi2
    /* JADX INFO: renamed from: M3 */
    public void mo138009M3() {
        super.mo138009M3();
        uyo0 uyo0Var = this.contentPresenter;
        if (uyo0Var != null) {
            m144506C2(uyo0Var);
            this.contentPresenter = null;
        }
    }

    @Override // p149l.zi2
    /* JADX INFO: renamed from: N3 */
    public void mo168244N3() {
        if (this.contentPresenter == null) {
            VoiceUserLeaderBoardPage voiceUserLeaderBoardPage = ((lbp0) this.viewModel).f142984i;
            voiceUserLeaderBoardPage.getClass();
            BLiveVoiceUserLeaderBoard bLiveVoiceUserLeaderBoard = this.voiceUserLeaderBoard;
            bLiveVoiceUserLeaderBoard.getClass();
            this.contentPresenter = new uyo0(voiceUserLeaderBoardPage, "room", this, bLiveVoiceUserLeaderBoard);
        }
        m144512z2(this.contentPresenter);
        super.mo168244N3();
    }

    @Override // p149l.zi2
    @NotNull
    /* JADX INFO: renamed from: S3, reason: merged with bridge method [inline-methods] */
    public lbp0 mo75679K3() {
        return new lbp0();
    }

    /* JADX INFO: renamed from: T3 */
    public final void m168246T3() {
        q2f.C19397d<jp50, C22306c<jp50>> c19397dOpen = m206028F2().OpenH5Event.open();
        jp50.C17834a c17834aM142599p = jp50.m142568c(4100).m142598B(ddv.m111073f("voiceRoom")).m142603t(80).m142602s(24).m142599p(CommonH5Builder.BgType.TRAN_GRAY_BG);
        int iM208412y0 = xdl0.m208412y0();
        V v2 = this.viewModel;
        v2.getClass();
        c19397dOpen.mo172463j(c17834aM142599p.m142597A(iM208412y0, ((lbp0) v2).m149265x()).m142600q());
    }

    /* JADX INFO: renamed from: U3 */
    public final void m168247U3(@NotNull String userId) {
        userId.getClass();
        D dM206027E2 = m206027E2();
        duringCreated(bar.m100926f(dM206027E2 != null ? dM206027E2.m149814k() : null, userId)).onErrorReturn(new w9j() { // from class: l.nbp0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return pbp0.m168243R3((Throwable) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.obp0
            @Override // p149l.e30
            public final void call(Object obj) {
                pbp0.m168242P3(this.f142970a, (BLiveVoiceUserLeaderBoard) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V3 */
    public final void m168248V3(String uid) {
        m218910L3();
        m168247U3(uid);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated((C22306c) m206028F2().VoiceVirtualLiveEvent.openUserLeaderBoard().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.mbp0
            @Override // p149l.e30
            public final void call(Object obj) {
                pbp0.m168241O3(this.f133048a, (String) obj);
            }
        }));
    }
}
