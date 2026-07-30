package com.p000p1.mobile.putong.feed.newui.photoalbum.attitude.participant;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.AttitudeConfigs;
import com.p000p1.mobile.putong.feed.data.AttitudeSourceCatCount;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.j760;
import l.mkd0;
import l.vwb;
import l.xaj0;
import p007l.xia;
import p007l.y31;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.attitude.participant.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C2127a implements AttitudeParticipantPagerItem.InterfaceC2126b {

    /* JADX INFO: renamed from: a */
    public Act f2893a;

    /* JADX INFO: renamed from: b */
    public AttitudeConfigs f2894b;

    /* JADX INFO: renamed from: c */
    public Moment f2895c;

    /* JADX INFO: renamed from: d */
    public y31 f2896d;

    /* JADX INFO: renamed from: e */
    public boolean f2897e;

    /* JADX INFO: renamed from: f */
    public boolean f2898f;

    /* JADX INFO: renamed from: g */
    public boolean f2899g;

    /* JADX INFO: renamed from: i */
    public Links f2901i;

    /* JADX INFO: renamed from: j */
    public AttitudeParticipantPagerItem f2902j;

    /* JADX INFO: renamed from: l */
    public a f2904l;

    /* JADX INFO: renamed from: h */
    public boolean f2900h = false;

    /* JADX INFO: renamed from: k */
    public List<User> f2903k = new ArrayList();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.attitude.participant.a$a */
    public interface a {
        /* JADX INFO: renamed from: c */
        void mo5042c(AttitudeSourceCatCount attitudeSourceCatCount);
    }

    public C2127a(final Act act, AttitudeConfigs attitudeConfigs, Moment moment, y31 y31Var) {
        this.f2893a = act;
        this.f2894b = attitudeConfigs;
        this.f2895c = moment;
        this.f2896d = y31Var;
        y31Var.duringCreated(FeedModule.f316d.f14947Q0).subscribe(mkd0.G(new e30() { // from class: l.r31
            public final void call(Object obj) {
                this.f12465a.m5034j(act, (j760) obj);
            }
        }));
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.attitude.participant.AttitudeParticipantPagerItem.InterfaceC2126b
    /* JADX INFO: renamed from: b */
    public boolean mo5025b() {
        return this.f2900h && !this.f2899g && NullChecker.a(this.f2901i) && !TextUtils.isEmpty(this.f2901i.next);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.attitude.participant.AttitudeParticipantPagerItem.InterfaceC2126b
    /* JADX INFO: renamed from: c */
    public void mo5026c() {
        m5039o();
    }

    /* JADX INFO: renamed from: h */
    public void m5032h(AttitudeParticipantPagerItem attitudeParticipantPagerItem) {
        this.f2902j = attitudeParticipantPagerItem;
        attitudeParticipantPagerItem.setLoadMoreHandler(this);
        if (this.f2899g && vwb.J(this.f2903k)) {
            this.f2902j.m5014e();
        } else if (vwb.J(this.f2903k)) {
            m5040p();
        } else {
            this.f2902j.m5013d(this.f2893a, this.f2903k);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m5033i(Links links, List<User> list) {
        this.f2901i = links;
        if (links == null || TextUtils.isEmpty(links.next) || vwb.J(list)) {
            this.f2899g = true;
        }
        if (!vwb.J(list)) {
            this.f2903k.addAll(list);
            if (NullChecker.a(this.f2902j)) {
                this.f2902j.m5013d(this.f2893a, this.f2903k);
            }
        }
        if (vwb.J(this.f2903k) && NullChecker.a(this.f2902j)) {
            this.f2902j.m5014e();
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m5034j(Act act, j760 j760Var) {
        if (NullChecker.a(this.f2902j)) {
            this.f2902j.m5013d(act, this.f2903k);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m5035k(j760 j760Var) {
        this.f2897e = false;
        m5033i((Links) j760Var.a, (List) j760Var.b);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m5036l(Throwable th) {
        this.f2897e = false;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m5037m(xaj0 xaj0Var) {
        this.f2897e = false;
        m5033i((Links) xaj0Var.a, (List) xaj0Var.b);
        if (NullChecker.a(this.f2904l)) {
            this.f2904l.mo5042c((AttitudeSourceCatCount) xaj0Var.c);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m5038n(Throwable th) {
        this.f2897e = false;
        this.f2898f = true;
    }

    /* JADX INFO: renamed from: o */
    public void m5039o() {
        if (this.f2897e) {
            return;
        }
        this.f2897e = true;
        y31 y31Var = this.f2896d;
        xia xiaVar = FeedModule.f316d;
        Moment moment = this.f2895c;
        y31Var.duringCreated(xiaVar.m16718r7(moment.owner, ((DbObject) moment).id, this.f2894b.f676id, this.f2901i.next)).subscribe(mkd0.H(new e30() { // from class: l.u31
            public final void call(Object obj) {
                this.f13516a.m5035k((j760) obj);
            }
        }, new e30() { // from class: l.v31
            public final void call(Object obj) {
                this.f14030a.m5036l((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p */
    public void m5040p() {
        this.f2897e = true;
        y31 y31Var = this.f2896d;
        xia xiaVar = FeedModule.f316d;
        Moment moment = this.f2895c;
        y31Var.duringCreated(xiaVar.m16725s7(moment.owner, ((DbObject) moment).id, this.f2894b.f676id)).subscribe(mkd0.H(new e30() { // from class: l.s31
            public final void call(Object obj) {
                this.f12781a.m5037m((xaj0) obj);
            }
        }, new e30() { // from class: l.t31
            public final void call(Object obj) {
                this.f13171a.m5038n((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public void m5041q(a aVar) {
        this.f2904l = aVar;
    }
}
