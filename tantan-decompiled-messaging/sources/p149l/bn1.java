package p149l;

import com.p046p1.mobile.longlink.msg.live_fanbase.LongLinkLiveFanbaseMessage;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveInfoMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.AvatarView;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.tantanapp.common.utils.CrashHelper;
import p133rx.C22306c;
import p149l.pn40;

/* JADX INFO: loaded from: classes4.dex */
public class bn1<D extends pn40> extends h4t<D, AvatarView> {

    /* JADX INFO: renamed from: i */
    public String f76361i;

    /* JADX INFO: renamed from: j */
    public boolean f76362j;

    public bn1(bsm bsmVar, AvatarView avatarView) {
        super(bsmVar);
        this.f76361i = "";
        this.f76362j = false;
        mo51532C(avatarView);
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ void m102720P3(Throwable th) {
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ BLiveEnvelope m102722S3(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m102725V3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m102726c4(KeyboardEventData keyboardEventData) {
        ((AvatarView) this.viewModel).m72094C(!keyboardEventData.m71825b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m102727e4(soj0 soj0Var) {
        ((AvatarView) this.viewModel).m72105x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public /* synthetic */ void m102728j4(soj0 soj0Var) {
        m102740k4();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        this.f76362j = false;
        duringCreated((C22306c) m206028F2().KeyboardEvent.show().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.nm1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139606a.m102726c4((KeyboardEventData) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public final boolean m102729W3(boolean z) {
        return z && w220.m201016c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public void m102730X3(int i) {
        F f;
        j760 j760Var = (j760) m129297F3(new rti(1200).m180787f(m206027E2().mo149817n().f44324id));
        if (j760Var == null || (f = j760Var.f116564a) == 0 || j760Var.f116565b == 0 || !((Boolean) f).booleanValue()) {
            return;
        }
        if (i == 2) {
            mo102743n4("jump");
        }
        ((AvatarView) this.viewModel).m72097G(i, ((Boolean) j760Var.f116565b).booleanValue());
    }

    /* JADX INFO: renamed from: Y3 */
    public void m102731Y3() {
        m206028F2().BootBubbleEvent.dismissBubble().mo172463j("localFollowLiveButtonBubble");
    }

    /* JADX INFO: renamed from: Z3 */
    public void m102732Z3(LongLinkLiveFanbaseMessage.RedPacketEvent redPacketEvent) {
        if (m206027E2().f108743D) {
            ((AvatarView) this.viewModel).m72093B(true);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public boolean mo102733a4() {
        return false;
    }

    /* JADX INFO: renamed from: b4 */
    public boolean mo102734b4() {
        return false;
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m102735d4(LiveInfoMessage liveInfoMessage) {
        BLiveAbsData bLiveAbsDataMo149813j = m206027E2().mo149813j();
        double d = liveInfoMessage.rewardPoint;
        bLiveAbsDataMo149813j.rewardPoint = d;
        ((AvatarView) this.viewModel).m72098H(d);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m102736f4(BLive bLive) {
        ((AvatarView) this.viewModel).m72098H(bLive.rewardPoint);
        m102742m4();
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ C22306c m102737g4(User user) {
        String str = user.f56011id;
        this.f76361i = str;
        String strM149814k = m206027E2().m149814k();
        String str2 = user.f56011id;
        return LivingNormalApiProvider.m71583t7(str, strM149814k, str2, str2, "live", "live_anchor", m206027E2().m149818o(), m206027E2().m132146l0().f56011id);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ BLiveUserMask m102738h4(BLiveEnvelope bLiveEnvelope) {
        return e1t.m114442d(bLiveEnvelope, this.f76361i);
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m102739i4(BLiveUserMask bLiveUserMask) {
        if (m206027E2().m132146l0() != null) {
            ((AvatarView) this.viewModel).m72099I(m206027E2().m132146l0(), bLiveUserMask);
            return;
        }
        CrashHelper.m81296c(new IllegalAccessException("current frag state:" + m206029H2().lifecycle_().f15557c + ",isDetachModule:" + this.f76362j));
    }

    /* JADX INFO: renamed from: k4 */
    public void m102740k4() {
        if (m206027E2().m132146l0() != null) {
            m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(1200).userId(m206027E2().m132146l0().f56011id).setFromIdentity(bqq.m103386a(this, m206027E2().m132146l0().f56011id, m206027E2().m132146l0().f56011id, 1200)).setTo(bqq.m103389d(this, m206027E2().m132146l0().f56011id, m206027E2().m132146l0().f56011id, 1200)).setScene("live").setSource("anchor").trackFrom("liveRoom").build());
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final void m102742m4() {
        boolean zM206032L2 = m206032L2();
        boolean zMo102733a4 = mo102733a4();
        boolean zMo102734b4 = mo102734b4();
        if (zM206032L2) {
            V v2 = this.viewModel;
            if (zMo102734b4) {
                ((AvatarView) v2).m72106y(3);
                return;
            } else {
                ((AvatarView) v2).m72106y(1);
                return;
            }
        }
        if (!zMo102733a4) {
            ((AvatarView) this.viewModel).m72106y(2);
            return;
        }
        boolean zM102729W3 = m102729W3(zMo102734b4);
        V v3 = this.viewModel;
        if (zM102729W3) {
            ((AvatarView) v3).m72106y(3);
        } else {
            ((AvatarView) v3).m72106y(1);
        }
        m102731Y3();
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f76362j = true;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        ((AvatarView) this.viewModel).m72094C(!m206031K2().m182469l(LiveDialogEnum.CHAT_INPUT));
        duringCreated(m206027E2().m132160q1().m189038C()).subscribe(ffw.m121193d(new e30() { // from class: l.sm1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f165314a.m102735d4((LiveInfoMessage) obj);
            }
        }));
        duringCreated(m206027E2().m170393A2().m175586d()).subscribe(ffw.m121194e(new e30() { // from class: l.wm1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187043a.m102736f4((BLive) obj);
            }
        }, new e30() { // from class: l.xm1
            @Override // p149l.e30
            public final void call(Object obj) {
                bn1.m102725V3((Throwable) obj);
            }
        }));
        duringCreated(m206027E2().m132133h0().filter(new w9j() { // from class: l.ym1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj) != null);
            }
        }).flatMap(new w9j() { // from class: l.zm1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f203687a.m102737g4((User) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.an1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return bn1.m102722S3((Throwable) obj);
            }
        }).map(new w9j() { // from class: l.om1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f144575a.m102738h4((BLiveEnvelope) obj);
            }
        })).subscribe(ffw.m121193d(new e30() { // from class: l.pm1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150186a.m102739i4((BLiveUserMask) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().AvatarEvent.onEndBtnClicked().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.qm1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155270a.mo102741l4(((Integer) obj).intValue());
            }
        }));
        duringCreated((C22306c) m206028F2().AvatarEvent.onAvatarClicked().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.rm1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160055a.m102728j4((soj0) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().m189076V()).subscribe(ffw.m121194e(new e30() { // from class: l.tm1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171124a.m102732Z3((LongLinkLiveFanbaseMessage.RedPacketEvent) obj);
            }
        }, new e30() { // from class: l.um1
            @Override // p149l.e30
            public final void call(Object obj) {
                bn1.m102720P3((Throwable) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().AvatarEvent.showFollowNewUserAnim().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.vm1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182059a.m102727e4((soj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public void mo102741l4(int i) {
    }

    /* JADX INFO: renamed from: n4 */
    public void mo102743n4(String str) {
    }
}
