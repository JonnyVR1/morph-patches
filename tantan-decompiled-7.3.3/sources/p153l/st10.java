package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import com.p051p1.mobile.putong.core.data.GameIdentity;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiPkDetail;
import com.p051p1.mobile.putong.live.base.data.BLivePkInfo;
import com.p051p1.mobile.putong.live.base.data.BLivePkStage;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiPk.multiPkPlaying.MultiPkTimerView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class st10 extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public kcg0 f170536i;

    /* JADX INFO: renamed from: j */
    public kcg0 f170537j;

    /* JADX INFO: renamed from: k */
    public kcg0 f170538k;

    /* JADX INFO: renamed from: l */
    public zt10 f170539l;

    /* JADX INFO: renamed from: m */
    public LongLinkLiveMultiPk.MultiPk f170540m;

    public st10(dum dumVar, MultiPkTimerView multiPkTimerView) {
        super(dumVar);
        m153103z2(new wt10(dumVar));
        this.f170539l = (zt10) m153103z2(new zt10(dumVar, multiPkTimerView));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v12, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v16, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v20, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213810E2().m168545q1().f71722h1).subscribe(dhw.m115829h(new y20() { // from class: l.bt10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78321a.m187838s4((LongLinkLiveMultiPk.MultiPkStageChange) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().f71718g1).subscribe(dhw.m115829h(new y20() { // from class: l.jt10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122549a.m187839t4((LongLinkLiveMultiPk.MultiPkPoints) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().f71702c1).subscribe(dhw.m115829h(new y20() { // from class: l.kt10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128643a.m187837r4((LongLinkLiveMultiPk.MultiPkInviteNotify) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().f71710e1).subscribe(dhw.m115829h(new y20() { // from class: l.lt10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133510a.m187834o4((LongLinkLiveMultiPk.MultiPkInviteAccepted) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().f71706d1).subscribe(dhw.m115829h(new y20() { // from class: l.mt10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138535a.m187836q4((LongLinkLiveMultiPk.MultiPkInviteRejected) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().f71714f1).subscribe(dhw.m115829h(new y20() { // from class: l.nt10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143574a.m187835p4((LongLinkLiveMultiPk.MultiPkAnimation) obj);
            }
        }));
        m138860d3(rs10.class, new qcj() { // from class: l.ot10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f148916a.m187824e4((rs10) obj);
            }
        });
        m138860d3(ss10.class, new qcj() { // from class: l.pt10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f153984a.m187825f4((ss10) obj);
            }
        });
        m138860d3(ts10.class, new qcj() { // from class: l.qt10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f159374a.m187826g4((ts10) obj);
            }
        });
        m138860d3(at10.class, new qcj() { // from class: l.rt10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f164763a.m187827h4((at10) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b4 */
    public final void m187821b4(String str) {
        duringCreated(LivingNormalApiProvider.m72756s6(str)).subscribe(dhw.m115829h(new y20() { // from class: l.ft10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100706a.m187828i4((BLiveMultiPkDetail) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c4 */
    public final List<LongLinkLiveMultiPk.MultiPkPlayer> m187822c4() {
        return !jyb.m147479J(this.f170540m.getPlayersList()) ? jyb.m147522n(this.f170540m.getPlayersList(), new qcj() { // from class: l.dt10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((LongLinkLiveMultiPk.MultiPkPlayer) obj).getRole().equals(GameIdentity.player));
            }
        }) : new ArrayList();
    }

    /* JADX INFO: renamed from: d4 */
    public boolean m187823d4(LongLinkLiveMultiPk.MultiPk multiPk, final String str) {
        if (jyb.m147479J(multiPk.getPlayersList())) {
            return false;
        }
        return jyb.m147520m(multiPk.getPlayersList(), new qcj() { // from class: l.gt10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                LongLinkLiveMultiPk.MultiPkPlayer multiPkPlayer = (LongLinkLiveMultiPk.MultiPkPlayer) obj;
                return Boolean.valueOf(multiPkPlayer.getUserId().equals(str) && multiPkPlayer.getRole().equals(GameIdentity.player));
            }
        });
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ String m187824e4(rs10 rs10Var) {
        LongLinkLiveMultiPk.MultiPk multiPk = this.f170540m;
        return multiPk != null ? multiPk.getId() : "";
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ Boolean m187825f4(ss10 ss10Var) {
        LongLinkLiveMultiPk.MultiPk multiPk = this.f170540m;
        return Boolean.valueOf(multiPk != null && m187823d4(multiPk, ss10Var.f170427c));
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ Boolean m187826g4(ts10 ts10Var) {
        return Boolean.valueOf(bu10.m106418c(this.f170540m));
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ List m187827h4(at10 at10Var) {
        return m187822c4();
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m187828i4(BLiveMultiPkDetail bLiveMultiPkDetail) {
        if (bLiveMultiPkDetail == null) {
            return;
        }
        this.f170540m = bu10.m106420e(bLiveMultiPkDetail);
        if (bLiveMultiPkDetail.stage.equals("playing")) {
            m213811F2().MultiPkEventGroup.multiPkOnStart().mo199273j(this.f170540m);
            m187842w4(this.f170540m);
        } else if (bLiveMultiPkDetail.stage.equals(BLivePkStage.punishing)) {
            m213811F2().MultiPkEventGroup.multiPkOnPunishing().mo199273j(this.f170540m);
            m187842w4(this.f170540m);
        } else {
            this.f170540m = null;
            m213811F2().MultiPkEventGroup.multiPkOnEnd().m199277p();
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m187829j4(String str, Long l2) {
        if (l2.longValue() == 3) {
            m187821b4(str);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m187830k4(String str, Long l2) {
        if (l2.longValue() == 3) {
            m187821b4(str);
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m187831l4(LongLinkLiveMultiPk.MultiPk multiPk, Long l2) {
        m187843x4(multiPk);
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m187832m4(ugd0 ugd0Var) {
        BLivePkInfo bLivePkInfo;
        BLive bLive = (BLive) ugd0Var.f138293c;
        if (bLive == null || (bLivePkInfo = bLive.pkInfo) == null || TextUtils.isEmpty(bLivePkInfo.ongoingMultiId)) {
            return;
        }
        m187821b4(bLive.pkInfo.ongoingMultiId);
    }

    /* JADX INFO: renamed from: n4 */
    public final void m187833n4(LongLinkLiveMultiPk.MultiPk multiPk) {
        if (bu10.m106417b(multiPk)) {
            m187841v4(multiPk.getId());
        } else if (bu10.m106419d(multiPk)) {
            m187840u4(multiPk.getId());
        }
    }

    /* JADX INFO: renamed from: o4 */
    public final void m187834o4(LongLinkLiveMultiPk.MultiPkInviteAccepted multiPkInviteAccepted) {
        r1j0.m179420g("主播均接受了你的邀请，PK重新开始。");
    }

    /* JADX INFO: renamed from: p4 */
    public final void m187835p4(LongLinkLiveMultiPk.MultiPkAnimation multiPkAnimation) {
        m213811F2().MultiPkEventGroup.multiPkOnPlayEffect().mo199273j(multiPkAnimation);
    }

    /* JADX INFO: renamed from: q4 */
    public final void m187836q4(LongLinkLiveMultiPk.MultiPkInviteRejected multiPkInviteRejected) {
        if (multiPkInviteRejected.getRejectUser() != null) {
            r1j0.m179420g(multiPkInviteRejected.getRejectUser().getUserName() + "拒绝 发起多人PK失败");
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final void m187837r4(LongLinkLiveMultiPk.MultiPkInviteNotify multiPkInviteNotify) {
        m213811F2().MultiPkEventGroup.multiPkOnRestartRequest().mo199273j(multiPkInviteNotify);
    }

    /* JADX INFO: renamed from: s4 */
    public final void m187838s4(LongLinkLiveMultiPk.MultiPkStageChange multiPkStageChange) {
        if (multiPkStageChange.hasMultiPk()) {
            LongLinkLiveMultiPk.MultiPk multiPk = multiPkStageChange.getMultiPk();
            this.f170540m = multiPk;
            if (!TextUtils.isEmpty(multiPk.getToast())) {
                r1j0.m179420g(this.f170540m.getToast());
            }
            if (!this.f170540m.getAnimationUrl().isEmpty()) {
                m213811F2().MultiPkEventGroup.multiPkOnPlayEffect().mo199273j(LongLinkLiveMultiPk.MultiPkAnimation.newBuilder().setAnimationUrl(this.f170540m.getAnimationUrl()).build());
            }
            String stage = this.f170540m.getStage();
            stage.getClass();
            if (stage.equals(BLivePkStage.punishing)) {
                psd0.m173633z(this.f170536i);
                m213811F2().MultiPkEventGroup.multiPkOnPunishing().mo199273j(this.f170540m);
                m187842w4(this.f170540m);
            } else if (stage.equals("playing")) {
                m213811F2().MultiPkEventGroup.multiPkOnStart().mo199273j(this.f170540m);
                m187842w4(this.f170540m);
            } else {
                psd0.m173633z(this.f170537j);
                this.f170540m = null;
                m213811F2().MultiPkEventGroup.multiPkOnEnd().m199277p();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(LivingNormalApiProvider.m72656h5(m213810E2().m202191k())).subscribe(dhw.m115829h(new y20() { // from class: l.ct10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83655a.m187832m4((ugd0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final void m187839t4(LongLinkLiveMultiPk.MultiPkPoints multiPkPoints) {
        m213811F2().MultiPkEventGroup.multiPkOnUpdatePoints().mo199273j(multiPkPoints);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX INFO: renamed from: u4 */
    public final void m187840u4(final String str) {
        this.f170537j = m113231o2(m138858H3(m213810E2().m168525i2(TimeUnit.SECONDS)), false).take(3).subscribe(dhw.m115829h(new y20() { // from class: l.it10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116783a.m187829j4(str, (Long) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX INFO: renamed from: v4 */
    public final void m187841v4(final String str) {
        this.f170536i = m113231o2(m138858H3(m213810E2().m168525i2(TimeUnit.SECONDS)), false).take(3).subscribe(dhw.m115829h(new y20() { // from class: l.ht10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111500a.m187830k4(str, (Long) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: w4 */
    public final void m187842w4(final LongLinkLiveMultiPk.MultiPk multiPk) {
        psd0.m173633z(this.f170538k);
        this.f170538k = m138858H3(m213810E2().m168525i2(TimeUnit.SECONDS)).subscribe(dhw.m115825d(new y20() { // from class: l.et10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95678a.m187831l4(multiPk, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x4 */
    public final void m187843x4(LongLinkLiveMultiPk.MultiPk multiPk) {
        if (multiPk == null) {
            return;
        }
        int duration = (int) (((long) multiPk.getDuration()) - ((pzi0.m174454o() - (Long.parseLong(multiPk.getStartTs() + "") * 1000)) / 1000));
        if (duration < 0) {
            psd0.m173633z(this.f170538k);
            this.f170539l.f205908i.f52293j.setText("00:00");
            m187833n4(multiPk);
        } else {
            this.f170539l.m221386P3(duration, bu10.m106419d(multiPk));
        }
        if (!bu10.m106417b(multiPk) || duration > 10) {
            return;
        }
        this.f170539l.f205908i.m77067k0(duration);
    }
}
