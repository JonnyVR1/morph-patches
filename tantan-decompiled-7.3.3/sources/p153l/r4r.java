package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKtvGameInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKtvPlayInfo;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcBean;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcWrapperBean;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvNewStageView;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class r4r extends i6t<rwn0, KtvNewStageView> implements dn50 {

    /* JADX INFO: renamed from: i */
    public BLiveVoiceKtvPlayInfo f161226i;

    /* JADX INFO: renamed from: j */
    public String f161227j;

    /* JADX INFO: renamed from: k */
    public Map<String, LrcWrapperBean> f161228k;

    /* JADX INFO: renamed from: l */
    public kcg0 f161229l;

    /* JADX INFO: renamed from: m */
    public int f161230m;

    /* JADX INFO: renamed from: n */
    public long f161231n;

    /* JADX INFO: renamed from: o */
    public String f161232o;

    /* JADX INFO: renamed from: p */
    public kcg0 f161233p;

    /* JADX INFO: renamed from: l.r4r$a */
    public class C19762a implements b6r {
        public C19762a() {
        }

        @Override // p153l.b6r
        /* JADX INFO: renamed from: a */
        public void mo102792a(View view, BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo) {
            r4r.this.m213811F2().VoiceKtvEvent.showTuningDialog().mo199273j(bLiveVoiceKtvPlayInfo);
        }

        @Override // p153l.b6r
        /* JADX INFO: renamed from: b */
        public void mo102793b(View view) {
            r4r.this.m213811F2().KtvDialogEvent.showKtvDialog().mo199273j(0);
        }

        @Override // p153l.b6r
        /* JADX INFO: renamed from: c */
        public void mo102794c(View view, BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo) {
            r4r.this.m179803Z3(bLiveVoiceKtvPlayInfo);
        }
    }

    /* JADX INFO: renamed from: l.r4r$b */
    public class C19763b implements aiv.C15716a.a {
        public C19763b() {
        }
    }

    public r4r(dum<? extends rwn0> dumVar, KtvNewStageView ktvNewStageView) {
        super(dumVar);
        this.f161227j = "";
        this.f161228k = new HashMap();
        mo52715C(ktvNewStageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m179796e4(Long l2) {
        ((KtvNewStageView) this.viewModel).m78269L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public /* synthetic */ void m179797h4(Boolean bool) {
        ((KtvNewStageView) this.viewModel).m78265H();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j4 */
    private void m179798j4() {
        if (((rwn0) m213810E2()).m183419U2() != null) {
            ((rwn0) m213810E2()).m183419U2().m159869T(this);
        }
        this.f161228k.clear();
        kcg0 kcg0Var = this.f161229l;
        if (kcg0Var != null) {
            kcg0Var.unsubscribe();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p4 */
    public void m179799p4(BLiveCallVolume bLiveCallVolume) {
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo;
        if (bLiveCallVolume == null || (bLiveVoiceKtvPlayInfo = this.f161226i) == null) {
            return;
        }
        Float f = bLiveCallVolume.volumes.get(bLiveVoiceKtvPlayInfo.userId);
        BLiveVoiceCall bLiveVoiceCallM136873l = ((rwn0) m213810E2()).m183411P2().m136873l(this.f161226i.userId);
        if (bLiveVoiceCallM136873l == null || f == null || f.floatValue() < 0.02f) {
            ((KtvNewStageView) this.viewModel).m78267J();
        } else if (bLiveVoiceCallM136873l.mutedByAnchor || bLiveVoiceCallM136873l.mutedByUser || guk0.m132332k(bLiveVoiceCallM136873l)) {
            ((KtvNewStageView) this.viewModel).m78267J();
        } else {
            ((KtvNewStageView) this.viewModel).m78260B(bLiveVoiceCallM136873l);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m153103z2(new yrn0(this.f196918e));
        m153103z2(new e4r(this.f196918e));
        m153103z2(new x6r(this.f196918e));
        m153103z2(new k6r(this.f196918e, ((KtvNewStageView) this.viewModel).f53253C));
    }

    @Override // p153l.dn50
    /* JADX INFO: renamed from: U1 */
    public void mo117049U1(String str, String str2, long j, long j2) {
        ((KtvNewStageView) this.viewModel).setMusicTotal(j);
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo = this.f161226i;
        if (bLiveVoiceKtvPlayInfo == null || !TextUtils.equals(bLiveVoiceKtvPlayInfo.songCode, str2) || !TextUtils.equals(str, this.f161226i.userId) || j2 <= this.f161231n) {
            return;
        }
        ((KtvNewStageView) this.viewModel).setMusicProgress(j2);
        this.f161231n = j2;
    }

    /* JADX INFO: renamed from: W3 */
    public final void m179800W3(String str, LrcWrapperBean lrcWrapperBean) {
        if (this.f161227j.isEmpty() || !this.f161227j.equals(str)) {
            this.f161227j = str;
            if (this.f161226i != null && lrcWrapperBean != null && lrcWrapperBean.getLrcBeans().size() > 0 && !lrcWrapperBean.getLrcBeans().get(0).tones.get(0).word.equals(" ● ")) {
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
    public final void m179801X3(int i) {
        kcg0 kcg0Var = this.f161229l;
        if (kcg0Var != null) {
            kcg0Var.unsubscribe();
        }
        this.f161230m = i;
        this.f161229l = m113231o2(C22421c.interval(1L, TimeUnit.SECONDS), true).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.p4r
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150557a.m179806c4((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m179802Y3() {
        kcg0 kcg0Var = this.f161229l;
        if (kcg0Var != null) {
            kcg0Var.unsubscribe();
        }
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo = this.f161226i;
        if (bLiveVoiceKtvPlayInfo != null) {
            if (this.f161228k.containsKey(bLiveVoiceKtvPlayInfo.songCode)) {
                String str = this.f161226i.songCode;
                m179800W3(str, this.f161228k.get(str));
            }
            ((KtvNewStageView) this.viewModel).setPlayingView(this.f161226i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public final void m179803Z3(BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo) {
        m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(1400).userId(bLiveVoiceKtvPlayInfo.userId).setFromIdentity(csq.m112228b(this, ((rwn0) m213810E2()).m168532l0().f56859id, bLiveVoiceKtvPlayInfo.userId, 7009)).setTo(csq.m112231e(this, ((rwn0) m213810E2()).m168532l0().f56859id, bLiveVoiceKtvPlayInfo.userId, 7009)).setScene("live").setSource("liveLeaderboard").trackFrom("liveOnlineUser").build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    public coj m179804a4(String str) {
        BLiveVoiceCall bLiveVoiceCallM136873l = ((rwn0) m213810E2()).m183411P2().m136873l(str);
        if (NullChecker.m82486a(bLiveVoiceCallM136873l)) {
            return coj.m111661c(new h64(bLiveVoiceCallM136873l.f45333id, bLiveVoiceCallM136873l.userName, bLiveVoiceCallM136873l.userPicture), p54.m170592b(bLiveVoiceCallM136873l.f45333id, "gift-audience-none-voiceLiveMain", bLiveVoiceCallM136873l.position));
        }
        return null;
    }

    /* JADX INFO: renamed from: b4 */
    public final void m179805b4(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        if (bLiveVoiceKtvGameInfo == null || bLiveVoiceKtvGameInfo.playInfo == null) {
            ((KtvNewStageView) this.viewModel).m78263F();
            this.f161227j = "";
            this.f161231n = 0L;
            this.f161226i = null;
            return;
        }
        if (NullChecker.m82486a(this.f161226i) && NullChecker.m82486a(bLiveVoiceKtvGameInfo.playInfo) && TextUtils.equals(this.f161226i.songCode, bLiveVoiceKtvGameInfo.playInfo.songCode) && TextUtils.equals(this.f161226i.orderId, bLiveVoiceKtvGameInfo.playInfo.orderId) && TextUtils.equals(this.f161226i.userId, bLiveVoiceKtvGameInfo.playInfo.userId) && TEnum.equals(this.f161226i.status, bLiveVoiceKtvGameInfo.playInfo.status)) {
            return;
        }
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo = bLiveVoiceKtvGameInfo.playInfo;
        this.f161226i = bLiveVoiceKtvPlayInfo;
        this.f161232o = bLiveVoiceKtvGameInfo.f45351id;
        if (TEnum.equals(bLiveVoiceKtvPlayInfo.status, "prepare")) {
            this.f161227j = "";
            ((KtvNewStageView) this.viewModel).setPrepareView(this.f161226i);
            this.f161231n = 0L;
            m179801X3((int) this.f161226i.prepareRemainSeconds);
            return;
        }
        if (TEnum.equals(this.f161226i.status, "playing")) {
            m179802Y3();
            return;
        }
        if (!TEnum.equals(this.f161226i.status, "pause")) {
            ((KtvNewStageView) this.viewModel).m78263F();
            this.f161227j = "";
            this.f161231n = 0L;
        } else {
            if (this.f161228k.containsKey(this.f161226i.songCode)) {
                String str = this.f161226i.songCode;
                m179800W3(str, this.f161228k.get(str));
            }
            ((KtvNewStageView) this.viewModel).setPauseView(this.f161226i);
        }
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m179806c4(Long l2) {
        int i = this.f161230m;
        if (i == 0) {
            m179802Y3();
            return;
        }
        int i2 = i - 1;
        this.f161230m = i2;
        ((KtvNewStageView) this.viewModel).setCountDownView(i2);
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m179807d4(String str, LrcWrapperBean lrcWrapperBean) {
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo = this.f161226i;
        if (bLiveVoiceKtvPlayInfo != null && str.equals(bLiveVoiceKtvPlayInfo.songCode)) {
            m179800W3(str, lrcWrapperBean);
        }
        this.f161228k.put(str, lrcWrapperBean);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m179808f4(LongLinkVoiceKtv.VoiceKTVBubble voiceKTVBubble) {
        if (!TextUtils.equals(this.f161232o, voiceKTVBubble.getGameId()) || TextUtils.isEmpty(voiceKTVBubble.getContent())) {
            return;
        }
        ((KtvNewStageView) this.viewModel).m78266I(voiceKTVBubble.getContent());
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ Boolean m179809g4(hrk0.C17564a c17564a) {
        return Boolean.valueOf(i9o0.m139137h(this));
    }

    /* JADX INFO: renamed from: i4 */
    public void m179810i4() {
        m138876w3(efv.f93842U, qa00.m175859d(574.0f), 7009, 24);
    }

    /* JADX INFO: renamed from: k4 */
    public void m179811k4(int i, int i2, String str) {
        int i3;
        String str2;
        if (i <= 0 || i2 <= 0) {
            i3 = i2;
            str2 = str;
        } else {
            i3 = i2;
            str2 = str;
            hne0 hne0VarM136083t = new hne0.C17513a().m136085v(String.valueOf(i), new C19763b(), i3, "ktv_panel", "ktv_panel", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerLocation.get(BLiveTraceServerLocation.ktvQuickGift), BLiveTraceServerLocation.ktvQuickGift), str2, "source_voice_ktv_quick_gift").m136089z(m179804a4(str)).m136079A(false).m136083t();
            hne0VarM136083t.f110732a.f180041D = true;
            m213811F2().SendGiftEventGroup.sendGift().mo199273j(hne0VarM136083t);
        }
        ((KtvNewStageView) this.viewModel).m78262E();
        BLiveGiftItem bLiveGiftItemM135160l = ((hiv) zrv.m221194l(htd0.f111521c)).m135160l(i);
        if (NullChecker.m82486a(bLiveGiftItemM135160l)) {
            qzj.m178787d(bLiveGiftItemM135160l, mo78457R2(), str2, i3);
        }
    }

    /* JADX INFO: renamed from: l4 */
    public void m179812l4() {
        psd0.m173633z(this.f161233p);
        this.f161233p = duringCreated(C22421c.interval(0L, 5L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.g4r
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102191a.m179796e4((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m4 */
    public void m179813m4() {
        psd0.m173633z(this.f161233p);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m179798j4();
        psd0.m173633z(this.f161233p);
    }

    /* JADX INFO: renamed from: n4 */
    public void m179814n4() {
        m213811F2().VoiceVirtualLiveEvent.showFunctionsDialog().mo199273j(Integer.valueOf(n2m0.m161244c(VirtualVoiceMotionType.ktv)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    public final void m179815o4(LongLinkVoiceKtv.VoiceKTVOrderRating voiceKTVOrderRating) {
        if (TextUtils.equals(((rwn0) m213810E2()).m183419U2().m159884x(), voiceKTVOrderRating.getOrderId())) {
            ((KtvNewStageView) this.viewModel).m78268K(voiceKTVOrderRating.getLevel(), voiceKTVOrderRating.getGiftUv(), voiceKTVOrderRating.getNextLevelGiftUv(), voiceKTVOrderRating.getScore(), voiceKTVOrderRating.getLevelTip(), voiceKTVOrderRating.getSchema(), voiceKTVOrderRating.getShowBgSvgaUrl());
        }
    }

    @Override // p153l.dn50
    /* JADX INFO: renamed from: s */
    public void mo117051s(final String str, String str2, final String str3) {
        if (this.f161228k.get(str) == null) {
            m113231o2(C22421c.just(str2), false).map(new qcj() { // from class: l.q4r
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ogw.m167665a(str3, new File((String) obj));
                }
            }).compose(psd0.m173592C()).subscribe(dhw.m115829h(new y20() { // from class: l.h4r
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f107824a.m179807d4(str, (LrcWrapperBean) obj);
                }
            }));
            return;
        }
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo = this.f161226i;
        if (bLiveVoiceKtvPlayInfo == null || !str.equals(bLiveVoiceKtvPlayInfo.songCode)) {
            return;
        }
        m179800W3(str, this.f161228k.get(str));
    }

    @Override // p153l.dn50
    /* JADX INFO: renamed from: s0 */
    public void mo117052s0() {
        if (this.f161226i == null) {
            return;
        }
        m179802Y3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        tqn0.m192318b(this, this);
        m138863h3(m213811F2().VoiceKtvEvent.changeCurrentKtvPlayInfo(), new y20() { // from class: l.i4r
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112940a.m179805b4((BLiveVoiceKtvGameInfo) obj);
            }
        });
        ((KtvNewStageView) this.viewModel).setClickCallback(new C19762a());
        duringCreated(((rwn0) m213810E2()).m168545q1().m98217A0()).subscribe(dhw.m115829h(new y20() { // from class: l.j4r
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118319a.m179808f4((LongLinkVoiceKtv.VoiceKTVBubble) obj);
            }
        }));
        m113231o2(((rwn0) m213810E2()).m168545q1().m98223D0(), false).subscribe(dhw.m115829h(new y20() { // from class: l.k4r
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123916a.m179815o4((LongLinkVoiceKtv.VoiceKTVOrderRating) obj);
            }
        }));
        m113231o2(((rwn0) m213810E2()).m183413Q2(), false).filter(new qcj() { // from class: l.l4r
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((hrk0.C17564a) obj).f111360b == 1);
            }
        }).map(new qcj() { // from class: l.m4r
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f134825a.m179809g4((hrk0.C17564a) obj);
            }
        }).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.n4r
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140251a.m179797h4((Boolean) obj);
            }
        }));
        duringCreated(m213811F2().CallEvent.memberVolume().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.o4r
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145004a.m179799p4((BLiveCallVolume) obj);
            }
        }));
    }
}
