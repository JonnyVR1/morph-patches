package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import com.p046p1.mobile.putong.core.data.GameIdentity;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiPkDetail;
import com.p046p1.mobile.putong.live.base.data.BLivePkInfo;
import com.p046p1.mobile.putong.live.base.data.BLivePkStage;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiPk.multiPkPlaying.MultiPkTimerView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class il10 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public c4g0 f113761i;

    /* JADX INFO: renamed from: j */
    public c4g0 f113762j;

    /* JADX INFO: renamed from: k */
    public c4g0 f113763k;

    /* JADX INFO: renamed from: l */
    public pl10 f113764l;

    /* JADX INFO: renamed from: m */
    public LongLinkLiveMultiPk.MultiPk f113765m;

    public il10(bsm bsmVar, MultiPkTimerView multiPkTimerView) {
        super(bsmVar);
        m144512z2(new ml10(bsmVar));
        this.f113764l = (pl10) m144512z2(new pl10(bsmVar, multiPkTimerView));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v12, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v16, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v20, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206027E2().m132160q1().f170455h1).subscribe(ffw.m121197h(new e30() { // from class: l.rk10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159770a.m136952s4((LongLinkLiveMultiPk.MultiPkStageChange) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().f170451g1).subscribe(ffw.m121197h(new e30() { // from class: l.zk10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203499a.m136953t4((LongLinkLiveMultiPk.MultiPkPoints) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().f170435c1).subscribe(ffw.m121197h(new e30() { // from class: l.al10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70361a.m136951r4((LongLinkLiveMultiPk.MultiPkInviteNotify) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().f170443e1).subscribe(ffw.m121197h(new e30() { // from class: l.bl10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76157a.m136948o4((LongLinkLiveMultiPk.MultiPkInviteAccepted) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().f170439d1).subscribe(ffw.m121197h(new e30() { // from class: l.cl10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81363a.m136950q4((LongLinkLiveMultiPk.MultiPkInviteRejected) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().f170447f1).subscribe(ffw.m121197h(new e30() { // from class: l.dl10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86774a.m136949p4((LongLinkLiveMultiPk.MultiPkAnimation) obj);
            }
        }));
        m129301d3(hk10.class, new w9j() { // from class: l.el10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f92055a.m136938e4((hk10) obj);
            }
        });
        m129301d3(ik10.class, new w9j() { // from class: l.fl10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f98118a.m136939f4((ik10) obj);
            }
        });
        m129301d3(jk10.class, new w9j() { // from class: l.gl10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f103277a.m136940g4((jk10) obj);
            }
        });
        m129301d3(qk10.class, new w9j() { // from class: l.hl10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f108305a.m136941h4((qk10) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b4 */
    public final void m136935b4(String str) {
        duringCreated(LivingNormalApiProvider.m71573s6(str)).subscribe(ffw.m121197h(new e30() { // from class: l.vk10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181760a.m136942i4((BLiveMultiPkDetail) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c4 */
    public final List<LongLinkLiveMultiPk.MultiPkPlayer> m136936c4() {
        return !vwb.m200296J(this.f113765m.getPlayersList()) ? vwb.m200339n(this.f113765m.getPlayersList(), new w9j() { // from class: l.tk10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((LongLinkLiveMultiPk.MultiPkPlayer) obj).getRole().equals(GameIdentity.player));
            }
        }) : new ArrayList();
    }

    /* JADX INFO: renamed from: d4 */
    public boolean m136937d4(LongLinkLiveMultiPk.MultiPk multiPk, final String str) {
        if (vwb.m200296J(multiPk.getPlayersList())) {
            return false;
        }
        return vwb.m200337m(multiPk.getPlayersList(), new w9j() { // from class: l.wk10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                LongLinkLiveMultiPk.MultiPkPlayer multiPkPlayer = (LongLinkLiveMultiPk.MultiPkPlayer) obj;
                return Boolean.valueOf(multiPkPlayer.getUserId().equals(str) && multiPkPlayer.getRole().equals(GameIdentity.player));
            }
        });
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ String m136938e4(hk10 hk10Var) {
        LongLinkLiveMultiPk.MultiPk multiPk = this.f113765m;
        return multiPk != null ? multiPk.getId() : "";
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ Boolean m136939f4(ik10 ik10Var) {
        LongLinkLiveMultiPk.MultiPk multiPk = this.f113765m;
        return Boolean.valueOf(multiPk != null && m136937d4(multiPk, ik10Var.f113625c));
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ Boolean m136940g4(jk10 jk10Var) {
        return Boolean.valueOf(rl10.m179776c(this.f113765m));
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ List m136941h4(qk10 qk10Var) {
        return m136936c4();
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m136942i4(BLiveMultiPkDetail bLiveMultiPkDetail) {
        if (bLiveMultiPkDetail == null) {
            return;
        }
        this.f113765m = rl10.m179778e(bLiveMultiPkDetail);
        if (bLiveMultiPkDetail.stage.equals("playing")) {
            m206028F2().MultiPkEventGroup.multiPkOnStart().mo172463j(this.f113765m);
            m136956w4(this.f113765m);
        } else if (bLiveMultiPkDetail.stage.equals(BLivePkStage.punishing)) {
            m206028F2().MultiPkEventGroup.multiPkOnPunishing().mo172463j(this.f113765m);
            m136956w4(this.f113765m);
        } else {
            this.f113765m = null;
            m206028F2().MultiPkEventGroup.multiPkOnEnd().m172467p();
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m136943j4(String str, Long l2) {
        if (l2.longValue() == 3) {
            m136935b4(str);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m136944k4(String str, Long l2) {
        if (l2.longValue() == 3) {
            m136935b4(str);
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m136945l4(LongLinkLiveMultiPk.MultiPk multiPk, Long l2) {
        m136957x4(multiPk);
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m136946m4(r8d0 r8d0Var) {
        BLivePkInfo bLivePkInfo;
        BLive bLive = (BLive) r8d0Var.f187610c;
        if (bLive == null || (bLivePkInfo = bLive.pkInfo) == null || TextUtils.isEmpty(bLivePkInfo.ongoingMultiId)) {
            return;
        }
        m136935b4(bLive.pkInfo.ongoingMultiId);
    }

    /* JADX INFO: renamed from: n4 */
    public final void m136947n4(LongLinkLiveMultiPk.MultiPk multiPk) {
        if (rl10.m179775b(multiPk)) {
            m136955v4(multiPk.getId());
        } else if (rl10.m179777d(multiPk)) {
            m136954u4(multiPk.getId());
        }
    }

    /* JADX INFO: renamed from: o4 */
    public final void m136948o4(LongLinkLiveMultiPk.MultiPkInviteAccepted multiPkInviteAccepted) {
        osi0.m165783g("主播均接受了你的邀请，PK重新开始。");
    }

    /* JADX INFO: renamed from: p4 */
    public final void m136949p4(LongLinkLiveMultiPk.MultiPkAnimation multiPkAnimation) {
        m206028F2().MultiPkEventGroup.multiPkOnPlayEffect().mo172463j(multiPkAnimation);
    }

    /* JADX INFO: renamed from: q4 */
    public final void m136950q4(LongLinkLiveMultiPk.MultiPkInviteRejected multiPkInviteRejected) {
        if (multiPkInviteRejected.getRejectUser() != null) {
            osi0.m165783g(multiPkInviteRejected.getRejectUser().getUserName() + "拒绝 发起多人PK失败");
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final void m136951r4(LongLinkLiveMultiPk.MultiPkInviteNotify multiPkInviteNotify) {
        m206028F2().MultiPkEventGroup.multiPkOnRestartRequest().mo172463j(multiPkInviteNotify);
    }

    /* JADX INFO: renamed from: s4 */
    public final void m136952s4(LongLinkLiveMultiPk.MultiPkStageChange multiPkStageChange) {
        if (multiPkStageChange.hasMultiPk()) {
            LongLinkLiveMultiPk.MultiPk multiPk = multiPkStageChange.getMultiPk();
            this.f113765m = multiPk;
            if (!TextUtils.isEmpty(multiPk.getToast())) {
                osi0.m165783g(this.f113765m.getToast());
            }
            if (!this.f113765m.getAnimationUrl().isEmpty()) {
                m206028F2().MultiPkEventGroup.multiPkOnPlayEffect().mo172463j(LongLinkLiveMultiPk.MultiPkAnimation.newBuilder().setAnimationUrl(this.f113765m.getAnimationUrl()).build());
            }
            String stage = this.f113765m.getStage();
            stage.getClass();
            if (stage.equals(BLivePkStage.punishing)) {
                mkd0.m154992z(this.f113761i);
                m206028F2().MultiPkEventGroup.multiPkOnPunishing().mo172463j(this.f113765m);
                m136956w4(this.f113765m);
            } else if (stage.equals("playing")) {
                m206028F2().MultiPkEventGroup.multiPkOnStart().mo172463j(this.f113765m);
                m136956w4(this.f113765m);
            } else {
                mkd0.m154992z(this.f113762j);
                this.f113765m = null;
                m206028F2().MultiPkEventGroup.multiPkOnEnd().m172467p();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(LivingNormalApiProvider.m71473h5(m206027E2().m149814k())).subscribe(ffw.m121197h(new e30() { // from class: l.sk10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164930a.m136946m4((r8d0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final void m136953t4(LongLinkLiveMultiPk.MultiPkPoints multiPkPoints) {
        m206028F2().MultiPkEventGroup.multiPkOnUpdatePoints().mo172463j(multiPkPoints);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: u4 */
    public final void m136954u4(final String str) {
        this.f113762j = m104250o2(m129299H3(m206027E2().m132139i2(TimeUnit.SECONDS)), false).take(3).subscribe(ffw.m121197h(new e30() { // from class: l.yk10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198703a.m136943j4(str, (Long) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: v4 */
    public final void m136955v4(final String str) {
        this.f113761i = m104250o2(m129299H3(m206027E2().m132139i2(TimeUnit.SECONDS)), false).take(3).subscribe(ffw.m121197h(new e30() { // from class: l.xk10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193256a.m136944k4(str, (Long) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: w4 */
    public final void m136956w4(final LongLinkLiveMultiPk.MultiPk multiPk) {
        mkd0.m154992z(this.f113763k);
        this.f113763k = m129299H3(m206027E2().m132139i2(TimeUnit.SECONDS)).subscribe(ffw.m121193d(new e30() { // from class: l.uk10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176899a.m136945l4(multiPk, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x4 */
    public final void m136957x4(LongLinkLiveMultiPk.MultiPk multiPk) {
        if (multiPk == null) {
            return;
        }
        int duration = (int) (((long) multiPk.getDuration()) - ((mqi0.m155944o() - (Long.parseLong(multiPk.getStartTs() + "") * 1000)) / 1000));
        if (duration < 0) {
            mkd0.m154992z(this.f113763k);
            this.f113764l.f150052i.f51445j.setText("00:00");
            m136947n4(multiPk);
        } else {
            this.f113764l.m170078P3(duration, rl10.m179777d(multiPk));
        }
        if (!rl10.m179775b(multiPk) || duration > 10) {
            return;
        }
        this.f113764l.f150052i.m75884k0(duration);
    }
}
