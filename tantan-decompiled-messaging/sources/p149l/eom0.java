package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveright.liveRight;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore;
import com.p046p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCallHatInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGrabHatGame;
import com.p046p1.mobile.putong.live.base.data.BLiveVoicePkCallInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoicePkInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoicePkPoint;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.voice.call.view.NormalVoiceDeputyItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import p133rx.C22306c;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eom0<D extends nnn0> extends h4t<D, c8m> {

    /* JADX INFO: renamed from: i */
    public c4g0 f92471i;

    /* JADX INFO: renamed from: j */
    public HashMap<String, s1o0> f92472j;

    /* JADX INFO: renamed from: k */
    public BLiveVoicePkInfo f92473k;

    public eom0(bsm bsmVar, c8m c8mVar) {
        super(bsmVar);
        this.f92472j = null;
        mo51532C(c8mVar);
        m144512z2(new f8n0(bsmVar, c8mVar));
    }

    /* JADX INFO: renamed from: G4 */
    private void m117368G4() {
        mkd0.m154992z(this.f92471i);
        this.f92471i = m129299H3(m206027E2().m132139i2(TimeUnit.SECONDS)).subscribe(ffw.m121193d(new e30() { // from class: l.onm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144805a.m117401h4(((Long) obj).longValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H4 */
    public void m117369H4(BLiveUserMask bLiveUserMask) {
        hxn0 hxn0VarM133350c = hxn0.m133350c(m206027E2().m160249P2().m102064m(bLiveUserMask.userId));
        BLiveUserMask bLiveUserMask2 = hxn0VarM133350c.f109896b;
        if (bLiveUserMask2 == null || !bLiveUserMask2.equals(bLiveUserMask)) {
            hxn0VarM133350c.f109896b = bLiveUserMask;
            BLiveVoiceCall bLiveVoiceCallM102063l = m206027E2().m160249P2().m102063l(bLiveUserMask.userId);
            if (bLiveVoiceCallM102063l == null) {
                return;
            }
            ((c8m) this.viewModel).mo103626t2(m206027E2().m160249P2(), bLiveVoiceCallM102063l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I4 */
    public void m117370I4(final BLiveCallVolume bLiveCallVolume) {
        if (bLiveCallVolume == null) {
            return;
        }
        vwb.m200354z(m206027E2().m160249P2().m102067p(), new e30() { // from class: l.lnm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128999a.m117392x4(bLiveCallVolume, (BLiveVoiceCall) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public /* synthetic */ void m117392x4(BLiveCallVolume bLiveCallVolume, BLiveVoiceCall bLiveVoiceCall) {
        Float f = bLiveCallVolume.volumes.get(bLiveVoiceCall.user);
        if (f == null || f.floatValue() < 0.02f || f.floatValue() == bLiveVoiceCall.volume) {
            bLiveVoiceCall.isSpeak = false;
            bLiveVoiceCall.volume = 0.0f;
        } else {
            bLiveVoiceCall.isSpeak = true;
            bLiveVoiceCall.volume = f.floatValue();
        }
        ((c8m) this.viewModel).mo103612N1(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: A4 */
    public abstract void mo117393A4(Integer num);

    /* JADX INFO: renamed from: B4 */
    public final void m117394B4() {
        ((c8m) this.viewModel).setData(m206027E2().m160249P2());
    }

    /* JADX INFO: renamed from: C4 */
    public final void m117395C4(String str, List<VoiceMicEmoji.EmojiPlayResult> list, String str2, String str3) {
        BLiveVoiceCall bLiveVoiceCallM102063l = m206027E2().m160249P2().m102063l(str);
        if (bLiveVoiceCallM102063l != null) {
            ((c8m) this.viewModel).mo103614W1(bLiveVoiceCallM102063l, list, str2, str3);
        }
    }

    /* JADX INFO: renamed from: D4 */
    public void m117396D4(String str, String str2) {
        BLiveVoiceCall bLiveVoiceCallM102063l = m206027E2().m160249P2().m102063l(str);
        rsm0.m180698f(str, str2, bLiveVoiceCallM102063l);
        if (bLiveVoiceCallM102063l == null || TextUtils.isEmpty(str2)) {
            return;
        }
        ((c8m) this.viewModel).mo103616b1(bLiveVoiceCallM102063l.position, str2);
    }

    /* JADX INFO: renamed from: E4 */
    public void m117397E4(int i) {
        if (i != 0) {
            ((c8m) this.viewModel).mo103613Q3(i, true);
        }
    }

    /* JADX INFO: renamed from: F4 */
    public final void m117398F4(String str, List<VoiceMicEmoji.EmojiPlayResult> list, String str2) {
        BLiveVoiceCall bLiveVoiceCallM102063l = m206027E2().m160249P2().m102063l(str);
        if (bLiveVoiceCallM102063l != null) {
            ((c8m) this.viewModel).mo103618c1(bLiveVoiceCallM102063l, list, str2);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        u4n0.m191754m(this);
        duringCreated((C22306c) m206028F2().CallEvent.memberVolume().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.jnm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118871a.m117370I4((BLiveCallVolume) obj);
            }
        }));
        this.f92473k = (BLiveVoicePkInfo) m129297F3(new l7o0());
    }

    /* JADX INFO: renamed from: f4 */
    public final void m117399f4(final bik0.C15867a c15867a) {
        BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame = (BLiveVoiceGrabHatGame) m129297F3(new f6k(9000));
        if (bcn0.m101094c(bLiveVoiceGrabHatGame)) {
            final List<BLiveVoiceCallHatInfo> list = bLiveVoiceGrabHatGame.callHatInfo;
            if (c15867a.m102078a()) {
                c15867a.f75772a.setGrabHatGameInfo((BLiveVoiceCallHatInfo) vwb.m200346r(list, new w9j() { // from class: l.pnm0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(c15867a.f75772a.user, ((BLiveVoiceCallHatInfo) obj).userId));
                    }
                })).setPointType("lovePoint");
            } else {
                vwb.m200354z(m206027E2().m160249P2().m102067p(), new e30() { // from class: l.qnm0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) obj;
                        bLiveVoiceCall.setGrabHatGameInfo((BLiveVoiceCallHatInfo) vwb.m200346r(list, new w9j() { // from class: l.unm0
                            @Override // p149l.w9j
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
    public final boolean m117400g4(final BLiveVoicePkInfo bLiveVoicePkInfo) {
        final boolean zM117413t4 = m117413t4(bLiveVoicePkInfo);
        vwb.m200354z(m206027E2().m160249P2().m102067p(), new e30() { // from class: l.mnm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134765a.m117414u4(zM117413t4, bLiveVoicePkInfo, (BLiveVoiceCall) obj);
            }
        });
        return zM117413t4;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m117401h4(long j) {
        Iterator<String> it = this.f92472j.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            s1o0 s1o0Var = this.f92472j.get(next);
            if (System.currentTimeMillis() - s1o0Var.m182011a() >= s1o0Var.m182013c() * 1000) {
                if (s1o0Var.m182012b() == s1o0.f161919f) {
                    s1o0Var.m182019i(System.currentTimeMillis());
                    s1o0Var.m182020j(s1o0.f161920g);
                    if (!s1o0Var.m182018h() || s1o0Var.m182016f() <= 0) {
                        it.remove();
                        m117412s4(next);
                    } else {
                        m117398F4(next, s1o0Var.m182014d(), s1o0Var.m182015e());
                    }
                } else if (s1o0Var.m182012b() == s1o0.f161920g) {
                    it.remove();
                    m117412s4(next);
                }
                m206028F2().VoiceMicEmojiEvent.changeMicEmojiState().mo172463j(s1o0Var);
            }
        }
        if (this.f92472j.isEmpty()) {
            mkd0.m154992z(this.f92471i);
        }
    }

    /* JADX INFO: renamed from: i4 */
    public void m117402i4(Integer num) {
        BLiveVoiceCall bLiveVoiceCallM102062k = m206027E2().m160249P2().m102062k(num.intValue());
        if (bLiveVoiceCallM102062k == null) {
            mo117393A4(num);
            return;
        }
        mqv<i54> mqvVarM102066o = m206027E2().m160249P2().m102066o(num);
        if (NullChecker.m81303a(mqvVarM102066o)) {
            mo117418z4(bLiveVoiceCallM102062k, mqvVarM102066o);
        }
    }

    /* JADX INFO: renamed from: j4 */
    public String m117403j4(String str, BLiveVoicePkInfo bLiveVoicePkInfo, int i) {
        if (bLiveVoicePkInfo != null && bLiveVoicePkInfo.enable) {
            if ((this.viewModel instanceof iuo0) && i == 0) {
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
    public HashMap<String, s1o0> m117404k4() {
        return this.f92472j;
    }

    /* JADX INFO: renamed from: l4 */
    public s1o0 m117405l4(String str) {
        s1o0 s1o0Var;
        HashMap<String, s1o0> map = this.f92472j;
        if (map == null || !map.containsKey(str) || (s1o0Var = this.f92472j.get(str)) == null) {
            return null;
        }
        return s1o0Var;
    }

    /* JADX INFO: renamed from: m4 */
    public void mo117406m4(bik0.C15867a c15867a) {
        if (!m117400g4(this.f92473k)) {
            m117399f4(c15867a);
        }
        int i = c15867a.f75773b;
        if (i == 1) {
            ((c8m) this.viewModel).setData(m206027E2().m160249P2());
            return;
        }
        if (i == 3 && c15867a.m102078a()) {
            m117397E4(c15867a.f75772a.position);
            return;
        }
        int i2 = c15867a.f75773b;
        if (i2 == 2) {
            ((c8m) this.viewModel).mo103626t2(m206027E2().m160249P2(), c15867a.f75772a);
            return;
        }
        if (i2 == 4) {
            ((c8m) this.viewModel).mo103626t2(m206027E2().m160249P2(), c15867a.f75772a);
        } else if (i2 == 5) {
            m117397E4(c15867a.f75772a.intendPosition);
            ((c8m) this.viewModel).mo103626t2(m206027E2().m160249P2(), c15867a.f75772a);
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        mkd0.m154992z(this.f92471i);
    }

    /* JADX INFO: renamed from: n4 */
    public final Pair<int[], Integer> m117407n4(j6n0 j6n0Var) {
        int[] iArr = new int[2];
        V v2 = this.viewModel;
        if (!(v2 instanceof bs2)) {
            return new Pair<>(new int[2], 0);
        }
        NormalVoiceDeputyItemView normalVoiceDeputyItemView = (NormalVoiceDeputyItemView) ((bs2) v2).mo103619d().get(j6n0Var.f116488c);
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
        return new Pair<>(iArr, Integer.valueOf(t100.m186890d(50.0f)));
    }

    /* JADX INFO: renamed from: o4 */
    public final void m117408o4(final BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        final String str = (bLiveVoiceGrabHatGame == null || bcn0.m101092a(bLiveVoiceGrabHatGame)) ? "defaultPoint" : "lovePoint";
        vwb.m200354z(m206027E2().m160249P2().m102067p(), new e30() { // from class: l.knm0
            @Override // p149l.e30
            public final void call(Object obj) {
                BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) obj;
                bLiveVoiceCall.setGrabHatGameInfo((BLiveVoiceCallHatInfo) vwb.m200346r(bLiveVoiceGrabHatGame.callHatInfo, new w9j() { // from class: l.tnm0
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals(bLiveVoiceCall.user, ((BLiveVoiceCallHatInfo) obj2).userId));
                    }
                })).setPointType(str);
            }
        });
        ((c8m) this.viewModel).setData(m206027E2().m160249P2());
    }

    /* JADX INFO: renamed from: p4 */
    public final void m117409p4(BLiveVoicePkInfo bLiveVoicePkInfo) {
        if (m117413t4(this.f92473k) && !m117413t4(bLiveVoicePkInfo)) {
            m206028F2().VoiceCallEvent.updateDeputyEvent().m172467p();
        }
        this.f92473k = bLiveVoicePkInfo;
        m117400g4(bLiveVoicePkInfo);
        ((c8m) this.viewModel).setData(m206027E2().m160249P2());
    }

    /* JADX INFO: renamed from: q4 */
    public final void m117410q4(liveRight.UserLiveRightResources userLiveRightResources) {
        vwb.m200354z(userLiveRightResources.getUserLiveRightsList(), new e30() { // from class: l.rnm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160281a.m117415v4((liveRight.UserLiveRight) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r4 */
    public final void m117411r4(VoiceNineMicUserScore.VoiceLiveBossUserScore voiceLiveBossUserScore) {
        if (m117413t4(this.f92473k)) {
            return;
        }
        List<VoiceNineMicUserScore.VoiceLiveBossUserScore.BossUserScore> bossUserScoreList = voiceLiveBossUserScore.getBossUserScoreList();
        if (vwb.m200296J(bossUserScoreList)) {
            return;
        }
        vwb.m200354z(bossUserScoreList, new e30() { // from class: l.nnm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139736a.m117416w4((VoiceNineMicUserScore.VoiceLiveBossUserScore.BossUserScore) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s4 */
    public final void m117412s4(String str) {
        BLiveVoiceCall bLiveVoiceCallM102063l = m206027E2().m160249P2().m102063l(str);
        if (bLiveVoiceCallM102063l != null) {
            ((c8m) this.viewModel).mo103623j2(bLiveVoiceCallM102063l);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        ((c8m) this.viewModel).mo103625t();
        duringCreated(m206027E2().m160251Q2()).subscribe(ffw.m121193d(new e30() { // from class: l.hnm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108641a.mo117406m4((bik0.C15867a) obj);
            }
        }));
        duringCreated(m206027E2().m160234E3()).subscribe(ffw.m121193d(new e30() { // from class: l.wnm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187317a.m117369H4((BLiveUserMask) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().m189126n0()).subscribe(ffw.m121197h(new e30() { // from class: l.xnm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193717a.m117410q4((liveRight.UserLiveRightResources) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().VoiceGrabHatEvent.gameInfo().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.ynm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199188a.m117408o4((BLiveVoiceGrabHatGame) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().m189097d1()).filter(new znm0()).subscribe(ffw.m121197h(new e30() { // from class: l.aom0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70878a.m117411r4((VoiceNineMicUserScore.VoiceLiveBossUserScore) obj);
            }
        }));
        m129301d3(j6n0.class, new w9j() { // from class: l.bom0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f76533a.m117407n4((j6n0) obj);
            }
        });
        duringCreated(m206027E2().m132108Y().m171442d()).filter(new w9j() { // from class: l.com0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((LiveMessage) obj).category == LiveMessage.VOICE_CHAT_MIC_EMOJI_CATEGORY);
            }
        }).onBackpressureBuffer(20000L).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.dom0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87183a.m117417y4((LiveMessage) obj);
            }
        }));
        m129304h3(m206028F2().VoicePkEvent.onVoicePkChange(), new e30() { // from class: l.inm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114025a.m117409p4((BLiveVoicePkInfo) obj);
            }
        });
        m129303g3(m206028F2().VoiceRoomBgEvent.onRoomBgChanged(), new d30() { // from class: l.snm0
            @Override // p149l.d30
            public final void call() {
                this.f165474a.m117394B4();
            }
        });
    }

    /* JADX INFO: renamed from: t4 */
    public final boolean m117413t4(BLiveVoicePkInfo bLiveVoicePkInfo) {
        return bLiveVoicePkInfo != null && bLiveVoicePkInfo.enable && bLiveVoicePkInfo.endMill > 0;
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m117414u4(boolean z, BLiveVoicePkInfo bLiveVoicePkInfo, final BLiveVoiceCall bLiveVoiceCall) {
        BLiveVoicePkCallInfo bLiveVoicePkCallInfoNew_ = BLiveVoicePkCallInfo.new_();
        if (z) {
            bLiveVoiceCall.pointType = "pkPoint";
            bLiveVoicePkCallInfoNew_.userId = bLiveVoiceCall.user;
            BLiveVoicePkPoint bLiveVoicePkPoint = (BLiveVoicePkPoint) vwb.m200346r(bLiveVoicePkInfo.onCallPoints, new w9j() { // from class: l.vnm0
                @Override // p149l.w9j
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
        bLiveVoicePkCallInfoNew_.mvpBg = m117403j4(bLiveVoiceCall.user, bLiveVoicePkInfo, bLiveVoiceCall.position);
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m117415v4(liveRight.UserLiveRight userLiveRight) {
        m117396D4(userLiveRight.getUserId(), userLiveRight.getAttribute().getAvatarConfig().getConnectorImage());
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m117416w4(VoiceNineMicUserScore.VoiceLiveBossUserScore.BossUserScore bossUserScore) {
        BLiveVoiceCall bLiveVoiceCallM102063l = m206027E2().m160249P2().m102063l(bossUserScore.getUserId());
        if (bLiveVoiceCallM102063l != null) {
            BLiveVoiceCall bLiveVoiceCallMo223809clone = bLiveVoiceCallM102063l.mo223809clone();
            bLiveVoiceCallMo223809clone.popularity = bossUserScore.getPopularity();
            bLiveVoiceCallMo223809clone.contribution = bossUserScore.getContribution();
            ((c8m) this.viewModel).mo103626t2(m206027E2().m160249P2(), bLiveVoiceCallMo223809clone);
        }
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m117417y4(LiveMessage liveMessage) {
        LiveUserInfo liveUserInfo = liveMessage.liveUserInfo;
        if (liveUserInfo == null || TextUtils.isEmpty(liveUserInfo.userId)) {
            return;
        }
        if (this.f92472j == null) {
            this.f92472j = new HashMap<>(10);
        }
        if (this.f92472j.size() == 0) {
            m117368G4();
        }
        LiveUserInfo liveUserInfo2 = liveMessage.liveUserInfo;
        String str = liveUserInfo2.userId;
        List<VoiceMicEmoji.EmojiPlayResult> list = liveUserInfo2.emojiResult;
        String str2 = liveUserInfo2.emojiType;
        String str3 = liveUserInfo2.mid;
        s1o0 s1o0VarM117405l4 = m117405l4(str);
        if (s1o0VarM117405l4 != null) {
            m206028F2().VoiceMicEmojiEvent.changeMicEmojiState().mo172463j(s1o0VarM117405l4);
        }
        this.f92472j.put(str, new s1o0(list, str2, s1o0.f161919f, str3));
        m117395C4(str, list, str2, str3);
    }

    /* JADX INFO: renamed from: z4 */
    public abstract void mo117418z4(BLiveVoiceCall bLiveVoiceCall, mqv<i54> mqvVar);
}
