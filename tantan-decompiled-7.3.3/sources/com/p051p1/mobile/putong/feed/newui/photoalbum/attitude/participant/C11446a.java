package com.p051p1.mobile.putong.feed.newui.photoalbum.attitude.participant;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.AttitudeConfigs;
import com.p051p1.mobile.putong.feed.data.AttitudeSourceCatCount;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p153l.bkj0;
import p153l.f41;
import p153l.jka;
import p153l.jyb;
import p153l.pf60;
import p153l.psd0;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.attitude.participant.a */
/* JADX INFO: loaded from: classes13.dex */
public class C11446a implements AttitudeParticipantPagerItem.InterfaceC11445b {

    /* JADX INFO: renamed from: a */
    public Act f42280a;

    /* JADX INFO: renamed from: b */
    public AttitudeConfigs f42281b;

    /* JADX INFO: renamed from: c */
    public Moment f42282c;

    /* JADX INFO: renamed from: d */
    public f41 f42283d;

    /* JADX INFO: renamed from: e */
    public boolean f42284e;

    /* JADX INFO: renamed from: f */
    public boolean f42285f;

    /* JADX INFO: renamed from: g */
    public boolean f42286g;

    /* JADX INFO: renamed from: i */
    public Links f42288i;

    /* JADX INFO: renamed from: j */
    public AttitudeParticipantPagerItem f42289j;

    /* JADX INFO: renamed from: l */
    public a f42291l;

    /* JADX INFO: renamed from: h */
    public boolean f42287h = false;

    /* JADX INFO: renamed from: k */
    public List<User> f42290k = new ArrayList();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.attitude.participant.a$a */
    public interface a {
        /* JADX INFO: renamed from: c */
        void mo65182c(AttitudeSourceCatCount attitudeSourceCatCount);
    }

    public C11446a(final Act act, AttitudeConfigs attitudeConfigs, Moment moment, f41 f41Var) {
        this.f42280a = act;
        this.f42281b = attitudeConfigs;
        this.f42282c = moment;
        this.f42283d = f41Var;
        f41Var.duringCreated(FeedModule.f39703d.f121322Q0).subscribe(psd0.m173596G(new y20() { // from class: l.y31
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197298a.m65174j(act, (pf60) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.attitude.participant.AttitudeParticipantPagerItem.InterfaceC11445b
    /* JADX INFO: renamed from: b */
    public boolean mo65165b() {
        return this.f42287h && !this.f42286g && NullChecker.m82486a(this.f42288i) && !TextUtils.isEmpty(this.f42288i.next);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.attitude.participant.AttitudeParticipantPagerItem.InterfaceC11445b
    /* JADX INFO: renamed from: c */
    public void mo65166c() {
        m65179o();
    }

    /* JADX INFO: renamed from: h */
    public void m65172h(AttitudeParticipantPagerItem attitudeParticipantPagerItem) {
        this.f42289j = attitudeParticipantPagerItem;
        attitudeParticipantPagerItem.setLoadMoreHandler(this);
        if (this.f42286g && jyb.m147479J(this.f42290k)) {
            this.f42289j.m65158e();
        } else if (jyb.m147479J(this.f42290k)) {
            m65180p();
        } else {
            this.f42289j.m65157d(this.f42280a, this.f42290k);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m65173i(Links links, List<User> list) {
        this.f42288i = links;
        if (links == null || TextUtils.isEmpty(links.next) || jyb.m147479J(list)) {
            this.f42286g = true;
        }
        if (!jyb.m147479J(list)) {
            this.f42290k.addAll(list);
            if (NullChecker.m82486a(this.f42289j)) {
                this.f42289j.m65157d(this.f42280a, this.f42290k);
            }
        }
        if (jyb.m147479J(this.f42290k) && NullChecker.m82486a(this.f42289j)) {
            this.f42289j.m65158e();
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m65174j(Act act, pf60 pf60Var) {
        if (NullChecker.m82486a(this.f42289j)) {
            this.f42289j.m65157d(act, this.f42290k);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m65175k(pf60 pf60Var) {
        this.f42284e = false;
        m65173i((Links) pf60Var.f152156a, (List) pf60Var.f152157b);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m65176l(Throwable th) {
        this.f42284e = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m65177m(bkj0 bkj0Var) {
        this.f42284e = false;
        m65173i((Links) bkj0Var.f77081a, (List) bkj0Var.f77082b);
        if (NullChecker.m82486a(this.f42291l)) {
            this.f42291l.mo65182c((AttitudeSourceCatCount) bkj0Var.f77083c);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m65178n(Throwable th) {
        this.f42284e = false;
        this.f42285f = true;
    }

    /* JADX INFO: renamed from: o */
    public void m65179o() {
        if (this.f42284e) {
            return;
        }
        this.f42284e = true;
        f41 f41Var = this.f42283d;
        jka jkaVar = FeedModule.f39703d;
        Moment moment = this.f42282c;
        f41Var.duringCreated(jkaVar.m145778r7(moment.owner, moment.f56859id, this.f42281b.f40063id, this.f42288i.next)).subscribe(psd0.m173597H(new y20() { // from class: l.b41
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74853a.m65175k((pf60) obj);
            }
        }, new y20() { // from class: l.c41
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79659a.m65176l((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p */
    public void m65180p() {
        this.f42284e = true;
        f41 f41Var = this.f42283d;
        jka jkaVar = FeedModule.f39703d;
        Moment moment = this.f42282c;
        f41Var.duringCreated(jkaVar.m145785s7(moment.owner, moment.f56859id, this.f42281b.f40063id)).subscribe(psd0.m173597H(new y20() { // from class: l.z31
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202775a.m65177m((bkj0) obj);
            }
        }, new y20() { // from class: l.a41
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68345a.m65178n((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public void m65181q(a aVar) {
        this.f42291l = aVar;
    }
}
