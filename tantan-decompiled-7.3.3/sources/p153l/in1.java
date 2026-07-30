package p153l;

import com.p051p1.mobile.longlink.msg.live_fanbase.LongLinkLiveFanbaseMessage;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveInfoMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.AvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.tantanapp.common.utils.CrashHelper;
import p137rx.C22421c;
import p153l.dw40;

/* JADX INFO: loaded from: classes4.dex */
public class in1<D extends dw40> extends i6t<D, AvatarView> {

    /* JADX INFO: renamed from: i */
    public String f115856i;

    /* JADX INFO: renamed from: j */
    public boolean f115857j;

    public in1(dum dumVar, AvatarView avatarView) {
        super(dumVar);
        this.f115856i = "";
        this.f115857j = false;
        mo52715C(avatarView);
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ void m141008P3(Throwable th) {
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ BLiveEnvelope m141010S3(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m141013V3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m141014c4(KeyboardEventData keyboardEventData) {
        ((AvatarView) this.viewModel).m73277C(!keyboardEventData.m73008b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m141015e4(vxj0 vxj0Var) {
        ((AvatarView) this.viewModel).m73288x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public /* synthetic */ void m141016j4(vxj0 vxj0Var) {
        m141028k4();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        this.f115857j = false;
        duringCreated((C22421c) m213811F2().KeyboardEvent.show().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.um1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179593a.m141014c4((KeyboardEventData) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public final boolean m141017W3(boolean z) {
        return z && eb20.m120150c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public void m141018X3(int i) {
        F f;
        pf60 pf60Var = (pf60) m138856F3(new nwi(1200).m164991f(m213810E2().mo183440n().f45172id));
        if (pf60Var == null || (f = pf60Var.f152156a) == 0 || pf60Var.f152157b == 0 || !((Boolean) f).booleanValue()) {
            return;
        }
        if (i == 2) {
            mo141031n4("jump");
        }
        ((AvatarView) this.viewModel).m73280G(i, ((Boolean) pf60Var.f152157b).booleanValue());
    }

    /* JADX INFO: renamed from: Y3 */
    public void m141019Y3() {
        m213811F2().BootBubbleEvent.dismissBubble().mo199273j("localFollowLiveButtonBubble");
    }

    /* JADX INFO: renamed from: Z3 */
    public void m141020Z3(LongLinkLiveFanbaseMessage.RedPacketEvent redPacketEvent) {
        if (m213810E2().f148256D) {
            ((AvatarView) this.viewModel).m73276B(true);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public boolean mo141021a4() {
        return false;
    }

    /* JADX INFO: renamed from: b4 */
    public boolean mo141022b4() {
        return false;
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m141023d4(LiveInfoMessage liveInfoMessage) {
        BLiveAbsData bLiveAbsDataMo183435j = m213810E2().mo183435j();
        double d = liveInfoMessage.rewardPoint;
        bLiveAbsDataMo183435j.rewardPoint = d;
        ((AvatarView) this.viewModel).m73281H(d);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m141024f4(BLive bLive) {
        ((AvatarView) this.viewModel).m73281H(bLive.rewardPoint);
        m141030m4();
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ C22421c m141025g4(User user) {
        String str = user.f56859id;
        this.f115856i = str;
        String strM202191k = m213810E2().m202191k();
        String str2 = user.f56859id;
        return LivingNormalApiProvider.m72766t7(str, strM202191k, str2, str2, "live", "live_anchor", m213810E2().m202194o(), m213810E2().m168532l0().f56859id);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ BLiveUserMask m141026h4(BLiveEnvelope bLiveEnvelope) {
        return f3t.m123803d(bLiveEnvelope, this.f115856i);
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m141027i4(BLiveUserMask bLiveUserMask) {
        if (m213810E2().m168532l0() != null) {
            ((AvatarView) this.viewModel).m73282I(m213810E2().m168532l0(), bLiveUserMask);
            return;
        }
        CrashHelper.m82479c(new IllegalAccessException("current frag state:" + m213812H2().lifecycle_().f16276c + ",isDetachModule:" + this.f115857j));
    }

    /* JADX INFO: renamed from: k4 */
    public void m141028k4() {
        if (m213810E2().m168532l0() != null) {
            m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(1200).userId(m213810E2().m168532l0().f56859id).setFromIdentity(csq.m112227a(this, m213810E2().m168532l0().f56859id, m213810E2().m168532l0().f56859id, 1200)).setTo(csq.m112230d(this, m213810E2().m168532l0().f56859id, m213810E2().m168532l0().f56859id, 1200)).setScene("live").setSource("anchor").trackFrom("liveRoom").build());
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final void m141030m4() {
        boolean zM213815L2 = m213815L2();
        boolean zMo141021a4 = mo141021a4();
        boolean zMo141022b4 = mo141022b4();
        if (zM213815L2) {
            V v2 = this.viewModel;
            if (zMo141022b4) {
                ((AvatarView) v2).m73289y(3);
                return;
            } else {
                ((AvatarView) v2).m73289y(1);
                return;
            }
        }
        if (!zMo141021a4) {
            ((AvatarView) this.viewModel).m73289y(2);
            return;
        }
        boolean zM141017W3 = m141017W3(zMo141022b4);
        V v3 = this.viewModel;
        if (zM141017W3) {
            ((AvatarView) v3).m73289y(3);
        } else {
            ((AvatarView) v3).m73289y(1);
        }
        m141019Y3();
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f115857j = true;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        ((AvatarView) this.viewModel).m73277C(!m213814K2().m189705l(LiveDialogEnum.CHAT_INPUT));
        duringCreated(m213810E2().m168545q1().m98220C()).subscribe(dhw.m115825d(new y20() { // from class: l.zm1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205027a.m141023d4((LiveInfoMessage) obj);
            }
        }));
        duringCreated(m213810E2().m118363A2().m122888d()).subscribe(dhw.m115826e(new y20() { // from class: l.dn1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f89749a.m141024f4((BLive) obj);
            }
        }, new y20() { // from class: l.en1
            @Override // p153l.y20
            public final void call(Object obj) {
                in1.m141013V3((Throwable) obj);
            }
        }));
        duringCreated(m213810E2().m168519h0().filter(new qcj() { // from class: l.fn1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj) != null);
            }
        }).flatMap(new qcj() { // from class: l.gn1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f105053a.m141025g4((User) obj);
            }
        }).onErrorReturn(new qcj() { // from class: l.hn1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return in1.m141010S3((Throwable) obj);
            }
        }).map(new qcj() { // from class: l.vm1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f184658a.m141026h4((BLiveEnvelope) obj);
            }
        })).subscribe(dhw.m115825d(new y20() { // from class: l.wm1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189758a.m141027i4((BLiveUserMask) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().AvatarEvent.onEndBtnClicked().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.xm1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195040a.mo141029l4(((Integer) obj).intValue());
            }
        }));
        duringCreated((C22421c) m213811F2().AvatarEvent.onAvatarClicked().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.ym1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200623a.m141016j4((vxj0) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().m98258V()).subscribe(dhw.m115826e(new y20() { // from class: l.an1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72302a.m141020Z3((LongLinkLiveFanbaseMessage.RedPacketEvent) obj);
            }
        }, new y20() { // from class: l.bn1
            @Override // p153l.y20
            public final void call(Object obj) {
                in1.m141008P3((Throwable) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().AvatarEvent.showFollowNewUserAnim().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.cn1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f82678a.m141015e4((vxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public void mo141029l4(int i) {
    }

    /* JADX INFO: renamed from: n4 */
    public void mo141031n4(String str) {
    }
}
