package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveright.liveRight;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore;
import com.p051p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCallHatInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGrabHatGame;
import com.p051p1.mobile.putong.live.base.data.BLiveVoicePkCallInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoicePkInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoicePkPoint;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.voice.call.view.NormalVoiceDeputyItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import p137rx.C22421c;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ixm0<D extends rwn0> extends i6t<D, sam> {

    /* JADX INFO: renamed from: i */
    public kcg0 f117439i;

    /* JADX INFO: renamed from: j */
    public HashMap<String, wao0> f117440j;

    /* JADX INFO: renamed from: k */
    public BLiveVoicePkInfo f117441k;

    public ixm0(dum dumVar, sam samVar) {
        super(dumVar);
        this.f117440j = null;
        mo52715C(samVar);
        m153103z2(new jhn0(dumVar, samVar));
    }

    /* JADX INFO: renamed from: G4 */
    private void m142538G4() {
        psd0.m173633z(this.f117439i);
        this.f117439i = m138858H3(m213810E2().m168525i2(TimeUnit.SECONDS)).subscribe(dhw.m115825d(new y20() { // from class: l.swm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170983a.m142570h4(((Long) obj).longValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H4 */
    public void m142539H4(BLiveUserMask bLiveUserMask) {
        l6o0 l6o0VarM153068c = l6o0.m153068c(m213810E2().m183411P2().m136874m(bLiveUserMask.userId));
        BLiveUserMask bLiveUserMask2 = l6o0VarM153068c.f130275b;
        if (bLiveUserMask2 == null || !bLiveUserMask2.equals(bLiveUserMask)) {
            l6o0VarM153068c.f130275b = bLiveUserMask;
            BLiveVoiceCall bLiveVoiceCallM136873l = m213810E2().m183411P2().m136873l(bLiveUserMask.userId);
            if (bLiveVoiceCallM136873l == null) {
                return;
            }
            ((sam) this.viewModel).mo182850t2(m213810E2().m183411P2(), bLiveVoiceCallM136873l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I4 */
    public void m142540I4(final BLiveCallVolume bLiveCallVolume) {
        if (bLiveCallVolume == null) {
            return;
        }
        jyb.m147537z(m213810E2().m183411P2().m136877p(), new y20() { // from class: l.pwm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154417a.m142562x4(bLiveCallVolume, (BLiveVoiceCall) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public /* synthetic */ void m142562x4(BLiveCallVolume bLiveCallVolume, BLiveVoiceCall bLiveVoiceCall) {
        Float f = bLiveCallVolume.volumes.get(bLiveVoiceCall.user);
        if (f == null || f.floatValue() < 0.02f || f.floatValue() == bLiveVoiceCall.volume) {
            bLiveVoiceCall.isSpeak = false;
            bLiveVoiceCall.volume = 0.0f;
        } else {
            bLiveVoiceCall.isSpeak = true;
            bLiveVoiceCall.volume = f.floatValue();
        }
        ((sam) this.viewModel).mo182838N1(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: A4 */
    public abstract void mo95834A4(Integer num);

    /* JADX INFO: renamed from: B4 */
    public final void m142563B4() {
        ((sam) this.viewModel).setData(m213810E2().m183411P2());
    }

    /* JADX INFO: renamed from: C4 */
    public final void m142564C4(String str, List<VoiceMicEmoji.EmojiPlayResult> list, String str2, String str3) {
        BLiveVoiceCall bLiveVoiceCallM136873l = m213810E2().m183411P2().m136873l(str);
        if (bLiveVoiceCallM136873l != null) {
            ((sam) this.viewModel).mo182840W1(bLiveVoiceCallM136873l, list, str2, str3);
        }
    }

    /* JADX INFO: renamed from: D4 */
    public void m142565D4(String str, String str2) {
        BLiveVoiceCall bLiveVoiceCallM136873l = m213810E2().m183411P2().m136873l(str);
        v1n0.m199028f(str, str2, bLiveVoiceCallM136873l);
        if (bLiveVoiceCallM136873l == null || TextUtils.isEmpty(str2)) {
            return;
        }
        ((sam) this.viewModel).mo182842b1(bLiveVoiceCallM136873l.position, str2);
    }

    /* JADX INFO: renamed from: E4 */
    public void m142566E4(int i) {
        if (i != 0) {
            ((sam) this.viewModel).mo182839Q3(i, true);
        }
    }

    /* JADX INFO: renamed from: F4 */
    public final void m142567F4(String str, List<VoiceMicEmoji.EmojiPlayResult> list, String str2) {
        BLiveVoiceCall bLiveVoiceCallM136873l = m213810E2().m183411P2().m136873l(str);
        if (bLiveVoiceCallM136873l != null) {
            ((sam) this.viewModel).mo182844c1(bLiveVoiceCallM136873l, list, str2);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        ydn0.m215260m(this);
        duringCreated((C22421c) m213811F2().CallEvent.memberVolume().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.nwm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143985a.m142540I4((BLiveCallVolume) obj);
            }
        }));
        this.f117441k = (BLiveVoicePkInfo) m138856F3(new pgo0());
    }

    /* JADX INFO: renamed from: f4 */
    public final void m142568f4(final hrk0.C17564a c17564a) {
        BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame = (BLiveVoiceGrabHatGame) m138856F3(new x8k(9000));
        if (fln0.m126164c(bLiveVoiceGrabHatGame)) {
            final List<BLiveVoiceCallHatInfo> list = bLiveVoiceGrabHatGame.callHatInfo;
            if (c17564a.m136888a()) {
                c17564a.f111359a.setGrabHatGameInfo((BLiveVoiceCallHatInfo) jyb.m147529r(list, new qcj() { // from class: l.twm0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(c17564a.f111359a.user, ((BLiveVoiceCallHatInfo) obj).userId));
                    }
                })).setPointType("lovePoint");
            } else {
                jyb.m147537z(m213810E2().m183411P2().m136877p(), new y20() { // from class: l.uwm0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) obj;
                        bLiveVoiceCall.setGrabHatGameInfo((BLiveVoiceCallHatInfo) jyb.m147529r(list, new qcj() { // from class: l.ywm0
                            @Override // p153l.qcj
                            public final Object call(Object obj2) {
                                return Boolean.valueOf(TextUtils.equals(bLiveVoiceCall.user, ((BLiveVoiceCallHatInfo) obj2).userId));
                            }
                        })).setPointType("lovePoint");
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final boolean m142569g4(final BLiveVoicePkInfo bLiveVoicePkInfo) {
        final boolean zM142581t4 = m142581t4(bLiveVoicePkInfo);
        jyb.m147537z(m213810E2().m183411P2().m136877p(), new y20() { // from class: l.qwm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159951a.m142582u4(zM142581t4, bLiveVoicePkInfo, (BLiveVoiceCall) obj);
            }
        });
        return zM142581t4;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m142570h4(long j) {
        Iterator<String> it = this.f117440j.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            wao0 wao0Var = this.f117440j.get(next);
            if (System.currentTimeMillis() - wao0Var.m205661a() >= wao0Var.m205663c() * 1000) {
                if (wao0Var.m205662b() == wao0.f188144f) {
                    wao0Var.m205669i(System.currentTimeMillis());
                    wao0Var.m205670j(wao0.f188145g);
                    if (!wao0Var.m205668h() || wao0Var.m205666f() <= 0) {
                        it.remove();
                        m142580s4(next);
                    } else {
                        m142567F4(next, wao0Var.m205664d(), wao0Var.m205665e());
                    }
                } else if (wao0Var.m205662b() == wao0.f188145g) {
                    it.remove();
                    m142580s4(next);
                }
                m213811F2().VoiceMicEmojiEvent.changeMicEmojiState().mo199273j(wao0Var);
            }
        }
        if (this.f117440j.isEmpty()) {
            psd0.m173633z(this.f117439i);
        }
    }

    /* JADX INFO: renamed from: i4 */
    public void m142571i4(Integer num) {
        BLiveVoiceCall bLiveVoiceCallM136872k = m213810E2().m183411P2().m136872k(num.intValue());
        if (bLiveVoiceCallM136872k == null) {
            mo95834A4(num);
            return;
        }
        nsv<h64> nsvVarM136876o = m213810E2().m183411P2().m136876o(num);
        if (NullChecker.m82486a(nsvVarM136876o)) {
            mo95840z4(bLiveVoiceCallM136872k, nsvVarM136876o);
        }
    }

    /* JADX INFO: renamed from: j4 */
    public String m142572j4(String str, BLiveVoicePkInfo bLiveVoicePkInfo, int i) {
        if (bLiveVoicePkInfo != null && bLiveVoicePkInfo.enable) {
            if ((this.viewModel instanceof m3p0) && i == 0) {
                if (TextUtils.equals(str, bLiveVoicePkInfo.leftUserId)) {
                    return bLiveVoicePkInfo.leftBigUrl;
                }
                if (TextUtils.equals(str, bLiveVoicePkInfo.rightUserId)) {
                    return bLiveVoicePkInfo.rightBigUrl;
                }
            } else {
                if (TextUtils.equals(str, bLiveVoicePkInfo.leftUserId)) {
                    return bLiveVoicePkInfo.leftUrl;
                }
                if (TextUtils.equals(str, bLiveVoicePkInfo.rightUserId)) {
                    return bLiveVoicePkInfo.rightUrl;
                }
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: k4 */
    public HashMap<String, wao0> m142573k4() {
        return this.f117440j;
    }

    /* JADX INFO: renamed from: l4 */
    public wao0 m142574l4(String str) {
        wao0 wao0Var;
        HashMap<String, wao0> map = this.f117440j;
        if (map == null || !map.containsKey(str) || (wao0Var = this.f117440j.get(str)) == null) {
            return null;
        }
        return wao0Var;
    }

    /* JADX INFO: renamed from: m4 */
    public void mo95839m4(hrk0.C17564a c17564a) {
        if (!m142569g4(this.f117441k)) {
            m142568f4(c17564a);
        }
        int i = c17564a.f111360b;
        if (i == 1) {
            ((sam) this.viewModel).setData(m213810E2().m183411P2());
            return;
        }
        if (i == 3 && c17564a.m136888a()) {
            m142566E4(c17564a.f111359a.position);
            return;
        }
        int i2 = c17564a.f111360b;
        if (i2 == 2) {
            ((sam) this.viewModel).mo182850t2(m213810E2().m183411P2(), c17564a.f111359a);
            return;
        }
        if (i2 == 4) {
            ((sam) this.viewModel).mo182850t2(m213810E2().m183411P2(), c17564a.f111359a);
        } else if (i2 == 5) {
            m142566E4(c17564a.f111359a.intendPosition);
            ((sam) this.viewModel).mo182850t2(m213810E2().m183411P2(), c17564a.f111359a);
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        psd0.m173633z(this.f117439i);
    }

    /* JADX INFO: renamed from: n4 */
    public final Pair<int[], Integer> m142575n4(nfn0 nfn0Var) {
        int[] iArr = new int[2];
        V v2 = this.viewModel;
        if (!(v2 instanceof rs2)) {
            return new Pair<>(new int[2], 0);
        }
        NormalVoiceDeputyItemView normalVoiceDeputyItemView = (NormalVoiceDeputyItemView) ((rs2) v2).mo134610d().get(nfn0Var.f141747c);
        if (normalVoiceDeputyItemView == null) {
            return new Pair<>(new int[2], 0);
        }
        CommonMaskAvatarView avatarView = normalVoiceDeputyItemView.getAvatarView();
        if (avatarView == null) {
            return new Pair<>(new int[2], 0);
        }
        avatarView.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + (avatarView.getWidth() / 2);
        iArr[1] = iArr[1] + (avatarView.getWidth() / 2);
        return new Pair<>(iArr, Integer.valueOf(qa00.m175859d(50.0f)));
    }

    /* JADX INFO: renamed from: o4 */
    public final void m142576o4(final BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        final String str = (bLiveVoiceGrabHatGame == null || fln0.m126162a(bLiveVoiceGrabHatGame)) ? "defaultPoint" : "lovePoint";
        jyb.m147537z(m213810E2().m183411P2().m136877p(), new y20() { // from class: l.owm0
            @Override // p153l.y20
            public final void call(Object obj) {
                BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) obj;
                bLiveVoiceCall.setGrabHatGameInfo((BLiveVoiceCallHatInfo) jyb.m147529r(bLiveVoiceGrabHatGame.callHatInfo, new qcj() { // from class: l.xwm0
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals(bLiveVoiceCall.user, ((BLiveVoiceCallHatInfo) obj2).userId));
                    }
                })).setPointType(str);
            }
        });
        ((sam) this.viewModel).setData(m213810E2().m183411P2());
    }

    /* JADX INFO: renamed from: p4 */
    public final void m142577p4(BLiveVoicePkInfo bLiveVoicePkInfo) {
        if (m142581t4(this.f117441k) && !m142581t4(bLiveVoicePkInfo)) {
            m213811F2().VoiceCallEvent.updateDeputyEvent().m199277p();
        }
        this.f117441k = bLiveVoicePkInfo;
        m142569g4(bLiveVoicePkInfo);
        ((sam) this.viewModel).setData(m213810E2().m183411P2());
    }

    /* JADX INFO: renamed from: q4 */
    public final void m142578q4(liveRight.UserLiveRightResources userLiveRightResources) {
        jyb.m147537z(userLiveRightResources.getUserLiveRightsList(), new y20() { // from class: l.vwm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186154a.m142583v4((liveRight.UserLiveRight) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r4 */
    public final void m142579r4(VoiceNineMicUserScore.VoiceLiveBossUserScore voiceLiveBossUserScore) {
        if (m142581t4(this.f117441k)) {
            return;
        }
        List<VoiceNineMicUserScore.VoiceLiveBossUserScore.BossUserScore> bossUserScoreList = voiceLiveBossUserScore.getBossUserScoreList();
        if (jyb.m147479J(bossUserScoreList)) {
            return;
        }
        jyb.m147537z(bossUserScoreList, new y20() { // from class: l.rwm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165184a.m142584w4((VoiceNineMicUserScore.VoiceLiveBossUserScore.BossUserScore) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s4 */
    public final void m142580s4(String str) {
        BLiveVoiceCall bLiveVoiceCallM136873l = m213810E2().m183411P2().m136873l(str);
        if (bLiveVoiceCallM136873l != null) {
            ((sam) this.viewModel).mo182848j2(bLiveVoiceCallM136873l);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        ((sam) this.viewModel).mo182849t();
        duringCreated(m213810E2().m183413Q2()).subscribe(dhw.m115825d(new y20() { // from class: l.lwm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133828a.mo95839m4((hrk0.C17564a) obj);
            }
        }));
        duringCreated(m213810E2().m183396E3()).subscribe(dhw.m115825d(new y20() { // from class: l.axm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73871a.m142539H4((BLiveUserMask) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().m98308n0()).subscribe(dhw.m115829h(new y20() { // from class: l.bxm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78891a.m142578q4((liveRight.UserLiveRightResources) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().VoiceGrabHatEvent.gameInfo().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.cxm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84260a.m142576o4((BLiveVoiceGrabHatGame) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().m98279d1()).filter(new dxm0()).subscribe(dhw.m115829h(new y20() { // from class: l.exm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96315a.m142579r4((VoiceNineMicUserScore.VoiceLiveBossUserScore) obj);
            }
        }));
        m138860d3(nfn0.class, new qcj() { // from class: l.fxm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f101274a.m142575n4((nfn0) obj);
            }
        });
        duringCreated(m213810E2().m168494Y().m113047d()).filter(new qcj() { // from class: l.gxm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((LiveMessage) obj).category == LiveMessage.VOICE_CHAT_MIC_EMOJI_CATEGORY);
            }
        }).onBackpressureBuffer(20000L).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.hxm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112026a.m142585y4((LiveMessage) obj);
            }
        }));
        m138863h3(m213811F2().VoicePkEvent.onVoicePkChange(), new y20() { // from class: l.mwm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139114a.m142577p4((BLiveVoicePkInfo) obj);
            }
        });
        m138862g3(m213811F2().VoiceRoomBgEvent.onRoomBgChanged(), new x20() { // from class: l.wwm0
            @Override // p153l.x20
            public final void call() {
                this.f191308a.m142563B4();
            }
        });
    }

    /* JADX INFO: renamed from: t4 */
    public final boolean m142581t4(BLiveVoicePkInfo bLiveVoicePkInfo) {
        return bLiveVoicePkInfo != null && bLiveVoicePkInfo.enable && bLiveVoicePkInfo.endMill > 0;
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m142582u4(boolean z, BLiveVoicePkInfo bLiveVoicePkInfo, final BLiveVoiceCall bLiveVoiceCall) {
        BLiveVoicePkCallInfo bLiveVoicePkCallInfoNew_ = BLiveVoicePkCallInfo.new_();
        if (z) {
            bLiveVoiceCall.pointType = "pkPoint";
            bLiveVoicePkCallInfoNew_.userId = bLiveVoiceCall.user;
            BLiveVoicePkPoint bLiveVoicePkPoint = (BLiveVoicePkPoint) jyb.m147529r(bLiveVoicePkInfo.onCallPoints, new qcj() { // from class: l.zwm0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BLiveVoicePkPoint) obj).userId, bLiveVoiceCall.user));
                }
            });
            if (bLiveVoicePkPoint != null) {
                bLiveVoicePkCallInfoNew_.point = bLiveVoicePkPoint.point;
                bLiveVoicePkCallInfoNew_.isNewTopOne = bLiveVoicePkPoint.isNewTopOne;
                bLiveVoicePkCallInfoNew_.isShowAnim = bLiveVoicePkPoint.isScoreChange;
            } else {
                bLiveVoicePkCallInfoNew_.point = 0L;
                bLiveVoicePkCallInfoNew_.isNewTopOne = false;
            }
        } else {
            bLiveVoiceCall.pointType = "defaultPoint";
        }
        bLiveVoiceCall.pkCallInfo = bLiveVoicePkCallInfoNew_;
        bLiveVoicePkCallInfoNew_.mvpBg = m142572j4(bLiveVoiceCall.user, bLiveVoicePkInfo, bLiveVoiceCall.position);
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m142583v4(liveRight.UserLiveRight userLiveRight) {
        m142565D4(userLiveRight.getUserId(), userLiveRight.getAttribute().getAvatarConfig().getConnectorImage());
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m142584w4(VoiceNineMicUserScore.VoiceLiveBossUserScore.BossUserScore bossUserScore) {
        BLiveVoiceCall bLiveVoiceCallM136873l = m213810E2().m183411P2().m136873l(bossUserScore.getUserId());
        if (bLiveVoiceCallM136873l != null) {
            BLiveVoiceCall bLiveVoiceCallMo225055clone = bLiveVoiceCallM136873l.mo225055clone();
            bLiveVoiceCallMo225055clone.popularity = bossUserScore.getPopularity();
            bLiveVoiceCallMo225055clone.contribution = bossUserScore.getContribution();
            ((sam) this.viewModel).mo182850t2(m213810E2().m183411P2(), bLiveVoiceCallMo225055clone);
        }
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m142585y4(LiveMessage liveMessage) {
        LiveUserInfo liveUserInfo = liveMessage.liveUserInfo;
        if (liveUserInfo == null || TextUtils.isEmpty(liveUserInfo.userId)) {
            return;
        }
        if (this.f117440j == null) {
            this.f117440j = new HashMap<>(10);
        }
        if (this.f117440j.size() == 0) {
            m142538G4();
        }
        LiveUserInfo liveUserInfo2 = liveMessage.liveUserInfo;
        String str = liveUserInfo2.userId;
        List<VoiceMicEmoji.EmojiPlayResult> list = liveUserInfo2.emojiResult;
        String str2 = liveUserInfo2.emojiType;
        String str3 = liveUserInfo2.mid;
        wao0 wao0VarM142574l4 = m142574l4(str);
        if (wao0VarM142574l4 != null) {
            m213811F2().VoiceMicEmojiEvent.changeMicEmojiState().mo199273j(wao0VarM142574l4);
        }
        this.f117440j.put(str, new wao0(list, str2, wao0.f188144f, str3));
        m142564C4(str, list, str2, str3);
    }

    /* JADX INFO: renamed from: z4 */
    public abstract void mo95840z4(BLiveVoiceCall bLiveVoiceCall, nsv<h64> nsvVar);
}
