package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKtvGameInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKtvPlayInfo;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcBean;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcWrapperBean;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvNewStageView;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class q2r extends h4t<nnn0, KtvNewStageView> implements we50 {

    /* JADX INFO: renamed from: i */
    public BLiveVoiceKtvPlayInfo f152292i;

    /* JADX INFO: renamed from: j */
    public String f152293j;

    /* JADX INFO: renamed from: k */
    public Map<String, LrcWrapperBean> f152294k;

    /* JADX INFO: renamed from: l */
    public c4g0 f152295l;

    /* JADX INFO: renamed from: m */
    public int f152296m;

    /* JADX INFO: renamed from: n */
    public long f152297n;

    /* JADX INFO: renamed from: o */
    public String f152298o;

    /* JADX INFO: renamed from: p */
    public c4g0 f152299p;

    /* JADX INFO: renamed from: l.q2r$a */
    public class C19399a implements a4r {
        public C19399a() {
        }

        @Override // p149l.a4r
        /* JADX INFO: renamed from: a */
        public void mo94925a(View view, BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo) {
            q2r.this.m206028F2().VoiceKtvEvent.showTuningDialog().mo172463j(bLiveVoiceKtvPlayInfo);
        }

        @Override // p149l.a4r
        /* JADX INFO: renamed from: b */
        public void mo94926b(View view) {
            q2r.this.m206028F2().KtvDialogEvent.showKtvDialog().mo172463j(0);
        }

        @Override // p149l.a4r
        /* JADX INFO: renamed from: c */
        public void mo94927c(View view, BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo) {
            q2r.this.m172495Z3(bLiveVoiceKtvPlayInfo);
        }
    }

    /* JADX INFO: renamed from: l.q2r$b */
    public class C19400b implements zfv.C21687a.a {
        public C19400b() {
        }
    }

    public q2r(bsm<? extends nnn0> bsmVar, KtvNewStageView ktvNewStageView) {
        super(bsmVar);
        this.f152293j = "";
        this.f152294k = new HashMap();
        mo51532C(ktvNewStageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m172487e4(Long l2) {
        ((KtvNewStageView) this.viewModel).m77086L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public /* synthetic */ void m172488h4(Boolean bool) {
        ((KtvNewStageView) this.viewModel).m77082H();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j4 */
    private void m172489j4() {
        if (((nnn0) m206027E2()).m160257U2() != null) {
            ((nnn0) m206027E2()).m160257U2().m136686T(this);
        }
        this.f152294k.clear();
        c4g0 c4g0Var = this.f152295l;
        if (c4g0Var != null) {
            c4g0Var.unsubscribe();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p4 */
    public void m172490p4(BLiveCallVolume bLiveCallVolume) {
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo;
        if (bLiveCallVolume == null || (bLiveVoiceKtvPlayInfo = this.f152292i) == null) {
            return;
        }
        Float f = bLiveCallVolume.volumes.get(bLiveVoiceKtvPlayInfo.userId);
        BLiveVoiceCall bLiveVoiceCallM102063l = ((nnn0) m206027E2()).m160249P2().m102063l(this.f152292i.userId);
        if (bLiveVoiceCallM102063l == null || f == null || f.floatValue() < 0.02f) {
            ((KtvNewStageView) this.viewModel).m77084J();
        } else if (bLiveVoiceCallM102063l.mutedByAnchor || bLiveVoiceCallM102063l.mutedByUser || alk0.m97312k(bLiveVoiceCallM102063l)) {
            ((KtvNewStageView) this.viewModel).m77084J();
        } else {
            ((KtvNewStageView) this.viewModel).m77077B(bLiveVoiceCallM102063l);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m144512z2(new uin0(this.f188512e));
        m144512z2(new d2r(this.f188512e));
        m144512z2(new w4r(this.f188512e));
        m144512z2(new j4r(this.f188512e, ((KtvNewStageView) this.viewModel).f52405C));
    }

    @Override // p149l.we50
    /* JADX INFO: renamed from: U1 */
    public void mo172491U1(String str, String str2, long j, long j2) {
        ((KtvNewStageView) this.viewModel).setMusicTotal(j);
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo = this.f152292i;
        if (bLiveVoiceKtvPlayInfo == null || !TextUtils.equals(bLiveVoiceKtvPlayInfo.songCode, str2) || !TextUtils.equals(str, this.f152292i.userId) || j2 <= this.f152297n) {
            return;
        }
        ((KtvNewStageView) this.viewModel).setMusicProgress(j2);
        this.f152297n = j2;
    }

    /* JADX INFO: renamed from: W3 */
    public final void m172492W3(String str, LrcWrapperBean lrcWrapperBean) {
        if (this.f152293j.isEmpty() || !this.f152293j.equals(str)) {
            this.f152293j = str;
            if (this.f152292i != null && lrcWrapperBean != null && lrcWrapperBean.getLrcBeans().size() > 0 && !lrcWrapperBean.getLrcBeans().get(0).tones.get(0).word.equals(" ● ")) {
                long startTime = lrcWrapperBean.getLrcBeans().get(0).getStartTime();
                ArrayList arrayList = new ArrayList();
                for (int i = 3; i >= 0; i--) {
                    LrcBean.Tone tone = new LrcBean.Tone();
                    tone.word = " ● ";
                    tone.begin = startTime - (((long) (i + 1)) * 1000);
                    tone.end = startTime - (((long) i) * 1000);
                    arrayList.add(tone);
                }
                lrcWrapperBean.getLrcBeans().add(0, new LrcBean(arrayList));
            }
            ((KtvNewStageView) this.viewModel).setLrcFile(lrcWrapperBean);
        }
    }

    /* JADX INFO: renamed from: X3 */
    public final void m172493X3(int i) {
        c4g0 c4g0Var = this.f152295l;
        if (c4g0Var != null) {
            c4g0Var.unsubscribe();
        }
        this.f152296m = i;
        this.f152295l = m104250o2(C22306c.interval(1L, TimeUnit.SECONDS), true).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.o2r
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141545a.m172498c4((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m172494Y3() {
        c4g0 c4g0Var = this.f152295l;
        if (c4g0Var != null) {
            c4g0Var.unsubscribe();
        }
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo = this.f152292i;
        if (bLiveVoiceKtvPlayInfo != null) {
            if (this.f152294k.containsKey(bLiveVoiceKtvPlayInfo.songCode)) {
                String str = this.f152292i.songCode;
                m172492W3(str, this.f152294k.get(str));
            }
            ((KtvNewStageView) this.viewModel).setPlayingView(this.f152292i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public final void m172495Z3(BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo) {
        m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(1400).userId(bLiveVoiceKtvPlayInfo.userId).setFromIdentity(bqq.m103387b(this, ((nnn0) m206027E2()).m132146l0().f56011id, bLiveVoiceKtvPlayInfo.userId, 7009)).setTo(bqq.m103390e(this, ((nnn0) m206027E2()).m132146l0().f56011id, bLiveVoiceKtvPlayInfo.userId, 7009)).setScene("live").setSource("liveLeaderboard").trackFrom("liveOnlineUser").build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    public mlj m172496a4(String str) {
        BLiveVoiceCall bLiveVoiceCallM102063l = ((nnn0) m206027E2()).m160249P2().m102063l(str);
        if (NullChecker.m81303a(bLiveVoiceCallM102063l)) {
            return mlj.m155154c(new i54(bLiveVoiceCallM102063l.f44485id, bLiveVoiceCallM102063l.userName, bLiveVoiceCallM102063l.userPicture), q44.m172922b(bLiveVoiceCallM102063l.f44485id, "gift-audience-none-voiceLiveMain", bLiveVoiceCallM102063l.position));
        }
        return null;
    }

    /* JADX INFO: renamed from: b4 */
    public final void m172497b4(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        if (bLiveVoiceKtvGameInfo == null || bLiveVoiceKtvGameInfo.playInfo == null) {
            ((KtvNewStageView) this.viewModel).m77080F();
            this.f152293j = "";
            this.f152297n = 0L;
            this.f152292i = null;
            return;
        }
        if (NullChecker.m81303a(this.f152292i) && NullChecker.m81303a(bLiveVoiceKtvGameInfo.playInfo) && TextUtils.equals(this.f152292i.songCode, bLiveVoiceKtvGameInfo.playInfo.songCode) && TextUtils.equals(this.f152292i.orderId, bLiveVoiceKtvGameInfo.playInfo.orderId) && TextUtils.equals(this.f152292i.userId, bLiveVoiceKtvGameInfo.playInfo.userId) && TEnum.equals(this.f152292i.status, bLiveVoiceKtvGameInfo.playInfo.status)) {
            return;
        }
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo = bLiveVoiceKtvGameInfo.playInfo;
        this.f152292i = bLiveVoiceKtvPlayInfo;
        this.f152298o = bLiveVoiceKtvGameInfo.f44503id;
        if (TEnum.equals(bLiveVoiceKtvPlayInfo.status, "prepare")) {
            this.f152293j = "";
            ((KtvNewStageView) this.viewModel).setPrepareView(this.f152292i);
            this.f152297n = 0L;
            m172493X3((int) this.f152292i.prepareRemainSeconds);
            return;
        }
        if (TEnum.equals(this.f152292i.status, "playing")) {
            m172494Y3();
            return;
        }
        if (!TEnum.equals(this.f152292i.status, "pause")) {
            ((KtvNewStageView) this.viewModel).m77080F();
            this.f152293j = "";
            this.f152297n = 0L;
        } else {
            if (this.f152294k.containsKey(this.f152292i.songCode)) {
                String str = this.f152292i.songCode;
                m172492W3(str, this.f152294k.get(str));
            }
            ((KtvNewStageView) this.viewModel).setPauseView(this.f152292i);
        }
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m172498c4(Long l2) {
        int i = this.f152296m;
        if (i == 0) {
            m172494Y3();
            return;
        }
        int i2 = i - 1;
        this.f152296m = i2;
        ((KtvNewStageView) this.viewModel).setCountDownView(i2);
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m172499d4(String str, LrcWrapperBean lrcWrapperBean) {
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo = this.f152292i;
        if (bLiveVoiceKtvPlayInfo != null && str.equals(bLiveVoiceKtvPlayInfo.songCode)) {
            m172492W3(str, lrcWrapperBean);
        }
        this.f152294k.put(str, lrcWrapperBean);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m172500f4(LongLinkVoiceKtv.VoiceKTVBubble voiceKTVBubble) {
        if (!TextUtils.equals(this.f152298o, voiceKTVBubble.getGameId()) || TextUtils.isEmpty(voiceKTVBubble.getContent())) {
            return;
        }
        ((KtvNewStageView) this.viewModel).m77083I(voiceKTVBubble.getContent());
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ Boolean m172501g4(bik0.C15867a c15867a) {
        return Boolean.valueOf(e0o0.m114322h(this));
    }

    /* JADX INFO: renamed from: i4 */
    public void m172502i4() {
        m129317w3(ddv.f85649U, t100.m186890d(574.0f), 7009, 24);
    }

    /* JADX INFO: renamed from: k4 */
    public void m172503k4(int i, int i2, String str) {
        int i3;
        String str2;
        if (i <= 0 || i2 <= 0) {
            i3 = i2;
            str2 = str;
        } else {
            i3 = i2;
            str2 = str;
            cfe0 cfe0VarM106529t = new cfe0.C16123a().m106531v(String.valueOf(i), new C19400b(), i3, "ktv_panel", "ktv_panel", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerLocation.get(BLiveTraceServerLocation.ktvQuickGift), BLiveTraceServerLocation.ktvQuickGift), str2, "source_voice_ktv_quick_gift").m106535z(m172496a4(str)).m106525A(false).m106529t();
            cfe0VarM106529t.f80589a.f148640D = true;
            m206028F2().SendGiftEventGroup.sendGift().mo172463j(cfe0VarM106529t);
        }
        ((KtvNewStageView) this.viewModel).m77079E();
        BLiveGiftItem bLiveGiftItemM126026l = ((ggv) ypv.m215673l(fld0.f98148c)).m126026l(i);
        if (NullChecker.m81303a(bLiveGiftItemM126026l)) {
            axj.m99430d(bLiveGiftItemM126026l, mo77274R2(), str2, i3);
        }
    }

    /* JADX INFO: renamed from: l4 */
    public void m172504l4() {
        mkd0.m154992z(this.f152299p);
        this.f152299p = duringCreated(C22306c.interval(0L, 5L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.f2r
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94230a.m172487e4((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m4 */
    public void m172505m4() {
        mkd0.m154992z(this.f152299p);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m172489j4();
        mkd0.m154992z(this.f152299p);
    }

    /* JADX INFO: renamed from: n4 */
    public void m172506n4() {
        m206028F2().VoiceVirtualLiveEvent.showFunctionsDialog().mo172463j(Integer.valueOf(jtl0.m143154c(VirtualVoiceMotionType.ktv)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    public final void m172507o4(LongLinkVoiceKtv.VoiceKTVOrderRating voiceKTVOrderRating) {
        if (TextUtils.equals(((nnn0) m206027E2()).m160257U2().m136702x(), voiceKTVOrderRating.getOrderId())) {
            ((KtvNewStageView) this.viewModel).m77085K(voiceKTVOrderRating.getLevel(), voiceKTVOrderRating.getGiftUv(), voiceKTVOrderRating.getNextLevelGiftUv(), voiceKTVOrderRating.getScore(), voiceKTVOrderRating.getLevelTip(), voiceKTVOrderRating.getSchema(), voiceKTVOrderRating.getShowBgSvgaUrl());
        }
    }

    @Override // p149l.we50
    /* JADX INFO: renamed from: s */
    public void mo172508s(final String str, String str2, final String str3) {
        if (this.f152294k.get(str) == null) {
            m104250o2(C22306c.just(str2), false).map(new w9j() { // from class: l.p2r
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return qew.m174256a(str3, new File((String) obj));
                }
            }).compose(mkd0.m154951C()).subscribe(ffw.m121197h(new e30() { // from class: l.g2r
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f100282a.m172499d4(str, (LrcWrapperBean) obj);
                }
            }));
            return;
        }
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo = this.f152292i;
        if (bLiveVoiceKtvPlayInfo == null || !str.equals(bLiveVoiceKtvPlayInfo.songCode)) {
            return;
        }
        m172492W3(str, this.f152294k.get(str));
    }

    @Override // p149l.we50
    /* JADX INFO: renamed from: s0 */
    public void mo136698s0() {
        if (this.f152292i == null) {
            return;
        }
        m172494Y3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        phn0.m169096b(this, this);
        m129304h3(m206028F2().VoiceKtvEvent.changeCurrentKtvPlayInfo(), new e30() { // from class: l.h2r
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105551a.m172497b4((BLiveVoiceKtvGameInfo) obj);
            }
        });
        ((KtvNewStageView) this.viewModel).setClickCallback(new C19399a());
        duringCreated(((nnn0) m206027E2()).m132160q1().m189035A0()).subscribe(ffw.m121197h(new e30() { // from class: l.i2r
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110578a.m172500f4((LongLinkVoiceKtv.VoiceKTVBubble) obj);
            }
        }));
        m104250o2(((nnn0) m206027E2()).m132160q1().m189041D0(), false).subscribe(ffw.m121197h(new e30() { // from class: l.j2r
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115949a.m172507o4((LongLinkVoiceKtv.VoiceKTVOrderRating) obj);
            }
        }));
        m104250o2(((nnn0) m206027E2()).m160251Q2(), false).filter(new w9j() { // from class: l.k2r
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((bik0.C15867a) obj).f75773b == 1);
            }
        }).map(new w9j() { // from class: l.l2r
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f125805a.m172501g4((bik0.C15867a) obj);
            }
        }).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.m2r
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130939a.m172488h4((Boolean) obj);
            }
        }));
        duringCreated(m206028F2().CallEvent.memberVolume().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.n2r
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136868a.m172490p4((BLiveCallVolume) obj);
            }
        }));
    }
}
