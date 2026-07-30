package com.p051p1.mobile.putong.feed.p065ui.moments;

import android.os.SystemClock;
import android.util.Pair;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.IntlOperationArticles;
import com.p051p1.mobile.putong.data.IntlOperationBanner;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Moments;
import com.p051p1.mobile.putong.data.PartialIdList;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p153l.jyb;
import p153l.mrb0;
import p153l.psd0;
import p153l.qo00;
import p153l.rcj;
import p153l.tec0;
import p153l.uxj0;
import p153l.vg60;
import p153l.y20;
import p153l.zzk;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.a */
/* JADX INFO: loaded from: classes13.dex */
public class C11572a implements MomentsFeedRecyclerList.InterfaceC11569b {

    /* JADX INFO: renamed from: a */
    public MomentsFeedRecyclerList f44820a;

    /* JADX INFO: renamed from: b */
    public List<b> f44821b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public ViewGroup f44822c;

    /* JADX INFO: renamed from: d */
    public zzk f44823d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.a$a */
    public class a extends RecyclerView.AbstractC0584t {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition() == 0) {
                ViewGroup viewGroup = C11572a.this.f44822c;
                ((MomentsFeedHeadView) viewGroup).f44732a.setTranslationY((-viewGroup.getTop()) / 2);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.a$b */
    public interface b {
    }

    public C11572a(MomentsFeedRecyclerList momentsFeedRecyclerList) {
        this.f44820a = momentsFeedRecyclerList;
    }

    @Override // com.p051p1.mobile.putong.feed.p065ui.moments.MomentsFeedRecyclerList.InterfaceC11569b
    /* JADX INFO: renamed from: a */
    public C22421c<uxj0> mo68085a() {
        return FeedModule.f39702c.m61923m4(true);
    }

    @Override // com.p051p1.mobile.putong.feed.p065ui.moments.MomentsFeedRecyclerList.InterfaceC11569b
    /* JADX INFO: renamed from: b */
    public boolean mo68086b() {
        return this.f44820a.f44743d.f44754c.m201221c();
    }

    @Override // com.p051p1.mobile.putong.feed.p065ui.moments.MomentsFeedRecyclerList.InterfaceC11569b
    /* JADX INFO: renamed from: c */
    public void mo68087c() {
        if (NullChecker.m82486a(this.f44822c)) {
            ((MomentsFeedHeadView) this.f44822c).m68036A(0);
        }
    }

    @Override // com.p051p1.mobile.putong.feed.p065ui.moments.MomentsFeedRecyclerList.InterfaceC11569b
    /* JADX INFO: renamed from: d */
    public C22421c<Envelope> mo68088d(Moment moment) {
        return FeedModule.f39702c.m61881R3(moment.owner, moment.f56859id, !moment.haveLiked);
    }

    @Override // com.p051p1.mobile.putong.feed.p065ui.moments.MomentsFeedRecyclerList.InterfaceC11569b
    /* JADX INFO: renamed from: e */
    public void mo68089e(String str, final y20<User> y20Var) {
        MomentsFeedRecyclerList momentsFeedRecyclerList = this.f44820a;
        momentsFeedRecyclerList.f44743d.mo68557c(momentsFeedRecyclerList.m68067M(), mrb0.m159645W(str)).subscribe(psd0.m173596G(new y20() { // from class: l.cv00
            @Override // p153l.y20
            public final void call(Object obj) {
                y20Var.call((User) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.feed.p065ui.moments.MomentsFeedRecyclerList.InterfaceC11569b
    /* JADX INFO: renamed from: f */
    public void mo68090f(Moment moment) {
        FeedModule.f39702c.m61912h3(moment._id);
    }

    @Override // com.p051p1.mobile.putong.feed.p065ui.moments.MomentsFeedRecyclerList.InterfaceC11569b
    /* JADX INFO: renamed from: g */
    public void mo68091g() {
        FeedModule.f39702c.m61903c4(Moments.TYPE);
    }

    @Override // com.p051p1.mobile.putong.feed.p065ui.moments.MomentsFeedRecyclerList.InterfaceC11569b
    /* JADX INFO: renamed from: h */
    public void mo68092h(boolean z) {
        if (z) {
            m68219t();
        } else {
            MomentsFeedRecyclerList momentsFeedRecyclerList = this.f44820a;
            momentsFeedRecyclerList.setAdapter(momentsFeedRecyclerList.f44743d);
        }
        this.f44820a.m68067M().duringCreated(psd0.m173625r(FeedModule.m61406H().mo31777i9(), FeedModule.f39702c.m61895Y3(), new rcj() { // from class: l.wu00
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return Pair.create((uxj0) obj, (vg60) obj2);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.xu00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196257a.m68217r((Pair) obj);
            }
        }));
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f44820a.m68067M().duringCreated(FeedModule.f39702c.m61923m4(true)).subscribe(psd0.m173597H(new y20() { // from class: l.yu00
            @Override // p153l.y20
            public final void call(Object obj) {
                TrackMediaUploadUtil.m81481b0(Moments.TYPE, SystemClock.elapsedRealtime() - jElapsedRealtime);
            }
        }, new y20() { // from class: l.zu00
            @Override // p153l.y20
            public final void call(Object obj) {
                bsj0.m106246D((Throwable) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.feed.p065ui.moments.MomentsFeedRecyclerList.InterfaceC11569b
    /* JADX INFO: renamed from: i */
    public void mo68093i(ArrayList<Media> arrayList) {
        this.f44820a.m68067M().startActivityForResult(CaptionAct.m67766Y1(this.f44820a.m68067M(), arrayList), 50);
    }

    @Override // com.p051p1.mobile.putong.feed.p065ui.moments.MomentsFeedRecyclerList.InterfaceC11569b
    /* JADX INFO: renamed from: j */
    public void mo68094j(final Moment moment) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        FeedModule.f39702c.m61917j4(moment).subscribe(psd0.m173597H(new y20() { // from class: l.av00
            @Override // p153l.y20
            public final void call(Object obj) {
                g9i.m129585j0(Moments.TYPE, moment, SystemClock.elapsedRealtime() - jElapsedRealtime);
            }
        }, new y20() { // from class: l.bv00
            @Override // p153l.y20
            public final void call(Object obj) {
                bsj0.m106246D((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public void m68216q(b bVar) {
        this.f44821b.add(bVar);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m68217r(Pair pair) {
        m68218s((vg60) pair.second);
    }

    /* JADX INFO: renamed from: s */
    public final void m68218s(vg60<Moment> vg60Var) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList(vg60Var.f184001a);
        } catch (Throwable th) {
            ArrayList arrayList2 = new ArrayList();
            CrashHelper.m82479c(th);
            arrayList = arrayList2;
        }
        vg60 vg60Var2 = new vg60(arrayList, vg60Var.f184002b);
        IntlOperationArticles intlOperationArticlesMo31834vq = FeedModule.m61406H().mo31834vq();
        boolean zM82486a = NullChecker.m82486a(intlOperationArticlesMo31834vq);
        ArrayList arrayList3 = new ArrayList();
        int size = vg60Var2.f184001a.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Moment moment = (Moment) vg60Var2.f184001a.get(i2);
            if (zM82486a && i == 3) {
                arrayList3.add(qo00.m177269a(intlOperationArticlesMo31834vq));
                zM82486a = false;
            }
            if (NullChecker.m82487b(moment)) {
                List<MomentMessage> listM61904d3 = FeedModule.f39702c.m61904d3(moment);
                PartialIdList partialIdList = moment.messages;
                arrayList3.add(new qo00(moment, listM61904d3.size(), partialIdList == null ? 0 : partialIdList.count, i2));
                i++;
                int size2 = listM61904d3.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    arrayList3.add(new qo00(moment, listM61904d3.get(i3), User.isTeamAccount(moment.owner), i3, size2));
                }
            }
        }
        if (zM82486a) {
            arrayList3.add(qo00.m177269a(intlOperationArticlesMo31834vq));
        }
        List<IntlOperationBanner> listMo31719Pg = FeedModule.m61406H().mo31719Pg();
        if (!jyb.m147479J(listMo31719Pg)) {
            arrayList3.add(0, qo00.m177270b(listMo31719Pg));
        }
        this.f44820a.f44743d.m68084K(new vg60<>(arrayList3, vg60Var2.f184002b));
        MomentsFeedRecyclerList momentsFeedRecyclerList = this.f44820a;
        if (momentsFeedRecyclerList.f44750k) {
            momentsFeedRecyclerList.scrollToPosition(0);
            this.f44820a.f44750k = false;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m68219t() {
        MomentsFeedHeadView momentsFeedHeadView = (MomentsFeedHeadView) this.f44820a.m68067M().inflater().inflate(tec0.f173773v4, (ViewGroup) this.f44820a, false);
        this.f44822c = momentsFeedHeadView;
        momentsFeedHeadView.m68040p(this.f44820a.f44751l);
        this.f44820a.setOnScrollListener(new a());
        zzk zzkVar = new zzk(this.f44820a.f44743d);
        this.f44823d = zzkVar;
        zzkVar.m222265H(this.f44822c);
        this.f44820a.setAdapter(this.f44823d);
    }
}
