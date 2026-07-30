package p002l;

import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveInfoMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.AvatarView;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p1.mobile.longlink.msg.live_fanbase.LongLinkLiveFanbaseMessage;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import l.bwr;
import l.e30;
import l.ffw;
import l.j760;
import l.s7m;
import l.soj0;
import l.w9j;
import p002l.pn40;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bn1<D extends pn40> extends h4t<D, AvatarView> {

    /* JADX INFO: renamed from: i */
    public String f8268i;

    /* JADX INFO: renamed from: j */
    public boolean f8269j;

    public bn1(bsm bsmVar, AvatarView avatarView) {
        super(bsmVar);
        this.f8268i = "";
        this.f8269j = false;
        C(avatarView);
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ void m10488P3(Throwable th) {
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ BLiveEnvelope m10490S3(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m10493V3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m10494c4(KeyboardEventData keyboardEventData) {
        ((AvatarView) ((bwr) this).viewModel).m5565C(!keyboardEventData.m5201b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m10495e4(soj0 soj0Var) {
        ((AvatarView) ((bwr) this).viewModel).m5578x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public /* synthetic */ void m10496j4(soj0 soj0Var) {
        m10509k4();
    }

    /* JADX INFO: renamed from: T */
    public void m10497T() {
        super.T();
        this.f8269j = false;
        duringCreated((c) m25548F2().KeyboardEvent.show().g()).subscribe(ffw.d(new e30() { // from class: l.nm1
            public final void call(Object obj) {
                this.f16102a.m10494c4((KeyboardEventData) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public final boolean m10498W3(boolean z) {
        return z && w220.m24292c();
    }

    /* JADX INFO: renamed from: X3 */
    public void m10499X3(int i) {
        Object obj;
        j760 j760Var = (j760) m14184F3(new rti(1200).m22126f(m25547E2().m17238n().id));
        if (j760Var == null || (obj = j760Var.a) == null || j760Var.b == null || !((Boolean) obj).booleanValue()) {
            return;
        }
        if (i == 2) {
            mo10512n4("jump");
        }
        ((AvatarView) ((bwr) this).viewModel).m5569G(i, ((Boolean) j760Var.b).booleanValue());
    }

    /* JADX INFO: renamed from: Y3 */
    public void m10500Y3() {
        m25548F2().BootBubbleEvent.dismissBubble().j("localFollowLiveButtonBubble");
    }

    /* JADX INFO: renamed from: Z3 */
    public void m10501Z3(LongLinkLiveFanbaseMessage.RedPacketEvent redPacketEvent) {
        if (m25547E2().f12143D) {
            ((AvatarView) ((bwr) this).viewModel).m5564B(true);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public boolean mo10502a4() {
        return false;
    }

    /* JADX INFO: renamed from: b4 */
    public boolean mo10503b4() {
        return false;
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m10504d4(LiveInfoMessage liveInfoMessage) {
        BLiveAbsData bLiveAbsDataM17234j = m25547E2().m17234j();
        double d = liveInfoMessage.rewardPoint;
        bLiveAbsDataM17234j.rewardPoint = d;
        ((AvatarView) ((bwr) this).viewModel).m5570H(d);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m10505f4(BLive bLive) {
        ((AvatarView) ((bwr) this).viewModel).m5570H(((BLiveAbsData) bLive).rewardPoint);
        m10511m4();
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ c m10506g4(User user) {
        String str = ((DbObject) user).id;
        this.f8268i = str;
        String strM17235k = m25547E2().m17235k();
        String str2 = ((DbObject) user).id;
        return LivingNormalApiProvider.m4949t7(str, strM17235k, str2, str2, "live", "live_anchor", m25547E2().m17239o(), ((DbObject) m25547E2().m14582l0()).id);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ BLiveUserMask m10507h4(BLiveEnvelope bLiveEnvelope) {
        return e1t.m12110d(bLiveEnvelope, this.f8268i);
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m10508i4(BLiveUserMask bLiveUserMask) {
        if (m25547E2().m14582l0() != null) {
            ((AvatarView) ((bwr) this).viewModel).m5571I(m25547E2().m14582l0(), bLiveUserMask);
            return;
        }
        CrashHelper.c(new IllegalAccessException("current frag state:" + m25549H2().lifecycle_().c + ",isDetachModule:" + this.f8269j));
    }

    /* JADX INFO: renamed from: k4 */
    public void m10509k4() {
        if (m25547E2().m14582l0() != null) {
            m25548F2().OpenUserCardDialogEvent.show().j(UserCardData.builder(1200).userId(((DbObject) m25547E2().m14582l0()).id).setFromIdentity(bqq.m10554a(this, ((DbObject) m25547E2().m14582l0()).id, ((DbObject) m25547E2().m14582l0()).id, 1200)).setTo(bqq.m10557d(this, ((DbObject) m25547E2().m14582l0()).id, ((DbObject) m25547E2().m14582l0()).id, 1200)).setScene("live").setSource("anchor").trackFrom("liveRoom").build());
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final void m10511m4() {
        boolean zM25552L2 = m25552L2();
        boolean zMo10502a4 = mo10502a4();
        boolean zMo10503b4 = mo10503b4();
        if (zM25552L2) {
            s7m s7mVar = ((bwr) this).viewModel;
            if (zMo10503b4) {
                ((AvatarView) s7mVar).m5579y(3);
                return;
            } else {
                ((AvatarView) s7mVar).m5579y(1);
                return;
            }
        }
        if (!zMo10502a4) {
            ((AvatarView) ((bwr) this).viewModel).m5579y(2);
            return;
        }
        boolean zM10498W3 = m10498W3(zMo10503b4);
        s7m s7mVar2 = ((bwr) this).viewModel;
        if (zM10498W3) {
            ((AvatarView) s7mVar2).m5579y(3);
        } else {
            ((AvatarView) s7mVar2).m5579y(1);
        }
        m10500Y3();
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        this.f8269j = true;
    }

    /* JADX INFO: renamed from: t */
    public void mo10513t() {
        super.t();
        ((AvatarView) ((bwr) this).viewModel).m5565C(!m25551K2().m22224l(LiveDialogEnum.CHAT_INPUT));
        duringCreated(m25547E2().m14596q1().C()).subscribe(ffw.d(new e30() { // from class: l.sm1
            public final void call(Object obj) {
                this.f19120a.m10504d4((LiveInfoMessage) obj);
            }
        }));
        duringCreated(m25547E2().m20501A2().m21483d()).subscribe(ffw.e(new e30() { // from class: l.wm1
            public final void call(Object obj) {
                this.f21824a.m10505f4((BLive) obj);
            }
        }, new e30() { // from class: l.xm1
            public final void call(Object obj) {
                bn1.m10493V3((Throwable) obj);
            }
        }));
        duringCreated(m25547E2().m14569h0().filter(new w9j() { // from class: l.ym1
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj) != null);
            }
        }).flatMap(new w9j() { // from class: l.zm1
            public final Object call(Object obj) {
                return this.f23506a.m10506g4((User) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.an1
            public final Object call(Object obj) {
                return bn1.m10490S3((Throwable) obj);
            }
        }).map(new w9j() { // from class: l.om1
            public final Object call(Object obj) {
                return this.f16697a.m10507h4((BLiveEnvelope) obj);
            }
        })).subscribe(ffw.d(new e30() { // from class: l.pm1
            public final void call(Object obj) {
                this.f17535a.m10508i4((BLiveUserMask) obj);
            }
        }));
        duringCreated((c) m25548F2().AvatarEvent.onEndBtnClicked().g()).subscribe(ffw.d(new e30() { // from class: l.qm1
            public final void call(Object obj) {
                this.f18088a.mo10510l4(((Integer) obj).intValue());
            }
        }));
        duringCreated((c) m25548F2().AvatarEvent.onAvatarClicked().g()).subscribe(ffw.d(new e30() { // from class: l.rm1
            public final void call(Object obj) {
                this.f18604a.m10496j4((soj0) obj);
            }
        }));
        duringCreated(m25547E2().m14596q1().V()).subscribe(ffw.e(new e30() { // from class: l.tm1
            public final void call(Object obj) {
                this.f20302a.m10501Z3((LongLinkLiveFanbaseMessage.RedPacketEvent) obj);
            }
        }, new e30() { // from class: l.um1
            public final void call(Object obj) {
                bn1.m10488P3((Throwable) obj);
            }
        }));
        duringCreated((c) m25548F2().AvatarEvent.showFollowNewUserAnim().g()).subscribe(ffw.d(new e30() { // from class: l.vm1
            public final void call(Object obj) {
                this.f21219a.m10495e4((soj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public void mo10510l4(int i) {
    }

    /* JADX INFO: renamed from: n4 */
    public void mo10512n4(String str) {
    }
}
