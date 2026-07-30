package com.p046p1.mobile.putong.feed.newui.photoalbum.attitude.participant;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.AttitudeConfigs;
import com.p046p1.mobile.putong.feed.data.AttitudeSourceCatCount;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p149l.e30;
import p149l.j760;
import p149l.mkd0;
import p149l.vwb;
import p149l.xaj0;
import p149l.xia;
import p149l.y31;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.attitude.participant.a */
/* JADX INFO: loaded from: classes12.dex */
public class C11283a implements AttitudeParticipantPagerItem.InterfaceC11282b {

    /* JADX INFO: renamed from: a */
    public Act f41432a;

    /* JADX INFO: renamed from: b */
    public AttitudeConfigs f41433b;

    /* JADX INFO: renamed from: c */
    public Moment f41434c;

    /* JADX INFO: renamed from: d */
    public y31 f41435d;

    /* JADX INFO: renamed from: e */
    public boolean f41436e;

    /* JADX INFO: renamed from: f */
    public boolean f41437f;

    /* JADX INFO: renamed from: g */
    public boolean f41438g;

    /* JADX INFO: renamed from: i */
    public Links f41440i;

    /* JADX INFO: renamed from: j */
    public AttitudeParticipantPagerItem f41441j;

    /* JADX INFO: renamed from: l */
    public a f41443l;

    /* JADX INFO: renamed from: h */
    public boolean f41439h = false;

    /* JADX INFO: renamed from: k */
    public List<User> f41442k = new ArrayList();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.attitude.participant.a$a */
    public interface a {
        /* JADX INFO: renamed from: c */
        void mo63999c(AttitudeSourceCatCount attitudeSourceCatCount);
    }

    public C11283a(final Act act, AttitudeConfigs attitudeConfigs, Moment moment, y31 y31Var) {
        this.f41432a = act;
        this.f41433b = attitudeConfigs;
        this.f41434c = moment;
        this.f41435d = y31Var;
        y31Var.duringCreated(FeedModule.f38855d.f193012Q0).subscribe(mkd0.m154955G(new e30() { // from class: l.r31
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157476a.m63991j(act, (j760) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.attitude.participant.AttitudeParticipantPagerItem.InterfaceC11282b
    /* JADX INFO: renamed from: b */
    public boolean mo63982b() {
        return this.f41439h && !this.f41438g && NullChecker.m81303a(this.f41440i) && !TextUtils.isEmpty(this.f41440i.next);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.attitude.participant.AttitudeParticipantPagerItem.InterfaceC11282b
    /* JADX INFO: renamed from: c */
    public void mo63983c() {
        m63996o();
    }

    /* JADX INFO: renamed from: h */
    public void m63989h(AttitudeParticipantPagerItem attitudeParticipantPagerItem) {
        this.f41441j = attitudeParticipantPagerItem;
        attitudeParticipantPagerItem.setLoadMoreHandler(this);
        if (this.f41438g && vwb.m200296J(this.f41442k)) {
            this.f41441j.m63975e();
        } else if (vwb.m200296J(this.f41442k)) {
            m63997p();
        } else {
            this.f41441j.m63974d(this.f41432a, this.f41442k);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m63990i(Links links, List<User> list) {
        this.f41440i = links;
        if (links == null || TextUtils.isEmpty(links.next) || vwb.m200296J(list)) {
            this.f41438g = true;
        }
        if (!vwb.m200296J(list)) {
            this.f41442k.addAll(list);
            if (NullChecker.m81303a(this.f41441j)) {
                this.f41441j.m63974d(this.f41432a, this.f41442k);
            }
        }
        if (vwb.m200296J(this.f41442k) && NullChecker.m81303a(this.f41441j)) {
            this.f41441j.m63975e();
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m63991j(Act act, j760 j760Var) {
        if (NullChecker.m81303a(this.f41441j)) {
            this.f41441j.m63974d(act, this.f41442k);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m63992k(j760 j760Var) {
        this.f41436e = false;
        m63990i((Links) j760Var.f116564a, (List) j760Var.f116565b);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m63993l(Throwable th) {
        this.f41436e = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m63994m(xaj0 xaj0Var) {
        this.f41436e = false;
        m63990i((Links) xaj0Var.f191751a, (List) xaj0Var.f191752b);
        if (NullChecker.m81303a(this.f41443l)) {
            this.f41443l.mo63999c((AttitudeSourceCatCount) xaj0Var.f191753c);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m63995n(Throwable th) {
        this.f41436e = false;
        this.f41437f = true;
    }

    /* JADX INFO: renamed from: o */
    public void m63996o() {
        if (this.f41436e) {
            return;
        }
        this.f41436e = true;
        y31 y31Var = this.f41435d;
        xia xiaVar = FeedModule.f38855d;
        Moment moment = this.f41434c;
        y31Var.duringCreated(xiaVar.m209537r7(moment.owner, moment.f56011id, this.f41433b.f39215id, this.f41440i.next)).subscribe(mkd0.m154956H(new e30() { // from class: l.u31
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f173568a.m63992k((j760) obj);
            }
        }, new e30() { // from class: l.v31
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f179618a.m63993l((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p */
    public void m63997p() {
        this.f41436e = true;
        y31 y31Var = this.f41435d;
        xia xiaVar = FeedModule.f38855d;
        Moment moment = this.f41434c;
        y31Var.duringCreated(xiaVar.m209544s7(moment.owner, moment.f56011id, this.f41433b.f39215id)).subscribe(mkd0.m154956H(new e30() { // from class: l.s31
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162034a.m63994m((xaj0) obj);
            }
        }, new e30() { // from class: l.t31
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167583a.m63995n((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public void m63998q(a aVar) {
        this.f41443l = aVar;
    }
}
