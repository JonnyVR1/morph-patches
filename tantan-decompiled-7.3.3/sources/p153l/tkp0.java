package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserLeaderBoard;
import com.p051p1.mobile.putong.live.livingroom.virtual.call.userleaderboard.page.VoiceUserLeaderBoardPage;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\rJ\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, m88121d2 = {"Ll/tkp0;", "Ll/rwn0;", "D", "Ll/hj2;", "Ll/pkp0;", "Ll/dum;", "curInfo", "<init>", "(Ll/dum;)V", "S3", "()Ll/pkp0;", "", Constants.KEY_T, "()V", "", "userId", "U3", "(Ljava/lang/String;)V", "N3", "T3", "M3", Oauth2AccessToken.KEY_UID, "V3", "k", "Ll/dum;", "getCurInfo", "()Ll/dum;", "Ll/y7p0;", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/y7p0;", "getContentPresenter", "()Ll/y7p0;", "setContentPresenter", "(Ll/y7p0;)V", "contentPresenter", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserLeaderBoard;", "m", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserLeaderBoard;", "getVoiceUserLeaderBoard", "()Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserLeaderBoard;", "setVoiceUserLeaderBoard", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserLeaderBoard;)V", "voiceUserLeaderBoard", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class tkp0<D extends rwn0> extends hj2<D, pkp0> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final dum<D> curInfo;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public y7p0 contentPresenter;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public BLiveVoiceUserLeaderBoard voiceUserLeaderBoard;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkp0(@NotNull dum<D> dumVar) {
        super(dumVar);
        dumVar.getClass();
        this.curInfo = dumVar;
    }

    /* JADX INFO: renamed from: O3 */
    public static void m191582O3(tkp0 tkp0Var, String str) {
        str.getClass();
        tkp0Var.m191588V3(str);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m191583P3(tkp0 tkp0Var, BLiveVoiceUserLeaderBoard bLiveVoiceUserLeaderBoard) {
        tkp0Var.voiceUserLeaderBoard = bLiveVoiceUserLeaderBoard;
        tkp0Var.mo135321N3();
    }

    /* JADX INFO: renamed from: R3 */
    public static BLiveVoiceUserLeaderBoard m191584R3(Throwable th) {
        return BLiveVoiceUserLeaderBoard.new_();
    }

    @Override // p153l.hj2
    /* JADX INFO: renamed from: M3 */
    public void mo135320M3() {
        super.mo135320M3();
        y7p0 y7p0Var = this.contentPresenter;
        if (y7p0Var != null) {
            m153097C2(y7p0Var);
            this.contentPresenter = null;
        }
    }

    @Override // p153l.hj2
    /* JADX INFO: renamed from: N3 */
    public void mo135321N3() {
        if (this.contentPresenter == null) {
            VoiceUserLeaderBoardPage voiceUserLeaderBoardPage = ((pkp0) this.viewModel).f151838i;
            voiceUserLeaderBoardPage.getClass();
            BLiveVoiceUserLeaderBoard bLiveVoiceUserLeaderBoard = this.voiceUserLeaderBoard;
            bLiveVoiceUserLeaderBoard.getClass();
            this.contentPresenter = new y7p0(voiceUserLeaderBoardPage, "room", this, bLiveVoiceUserLeaderBoard);
        }
        m153103z2(this.contentPresenter);
        super.mo135321N3();
    }

    @Override // p153l.hj2
    @NotNull
    /* JADX INFO: renamed from: S3, reason: merged with bridge method [inline-methods] */
    public pkp0 mo76862K3() {
        return new pkp0();
    }

    /* JADX INFO: renamed from: T3 */
    public final void m191586T3() {
        v3f.C20736d<px50, C22421c<px50>> c20736dOpen = m213811F2().OpenH5Event.open();
        px50.C19461a c19461aM174142p = px50.m174112c(4100).m174141B(efv.m120728f("voiceRoom")).m174146t(80).m174145s(24).m174142p(CommonH5Builder.BgType.TRAN_GRAY_BG);
        int iM105592y0 = bnl0.m105592y0();
        V v2 = this.viewModel;
        v2.getClass();
        c20736dOpen.mo199273j(c19461aM174142p.m174140A(iM105592y0, ((pkp0) v2).m172751x()).m174143q());
    }

    /* JADX INFO: renamed from: U3 */
    public final void m191587U3(@NotNull String userId) {
        userId.getClass();
        D dM213810E2 = m213810E2();
        duringCreated(dcr.m115282f(dM213810E2 != null ? dM213810E2.m202191k() : null, userId)).onErrorReturn(new qcj() { // from class: l.rkp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return tkp0.m191584R3((Throwable) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.skp0
            @Override // p153l.y20
            public final void call(Object obj) {
                tkp0.m191583P3(this.f169311a, (BLiveVoiceUserLeaderBoard) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V3 */
    public final void m191588V3(String uid) {
        m135319L3();
        m191587U3(uid);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated((C22421c) m213811F2().VoiceVirtualLiveEvent.openUserLeaderBoard().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.qkp0
            @Override // p153l.y20
            public final void call(Object obj) {
                tkp0.m191582O3(this.f158164a, (String) obj);
            }
        }));
    }
}
