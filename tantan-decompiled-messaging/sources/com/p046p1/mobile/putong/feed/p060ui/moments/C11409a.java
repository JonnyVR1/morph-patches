package com.p046p1.mobile.putong.feed.p060ui.moments;

import android.os.SystemClock;
import android.util.Pair;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.IntlOperationArticles;
import com.p046p1.mobile.putong.data.IntlOperationBanner;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Moments;
import com.p046p1.mobile.putong.data.PartialIdList;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p149l.e30;
import p149l.hg00;
import p149l.ijb0;
import p149l.jxk;
import p149l.mkd0;
import p149l.o6c0;
import p149l.q860;
import p149l.roj0;
import p149l.vwb;
import p149l.x9j;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.a */
/* JADX INFO: loaded from: classes12.dex */
public class C11409a implements MomentsFeedRecyclerList.InterfaceC11406b {

    /* JADX INFO: renamed from: a */
    public MomentsFeedRecyclerList f43972a;

    /* JADX INFO: renamed from: b */
    public List<b> f43973b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public ViewGroup f43974c;

    /* JADX INFO: renamed from: d */
    public jxk f43975d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.a$a */
    public class a extends RecyclerView.AbstractC0582t {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition() == 0) {
                ViewGroup viewGroup = C11409a.this.f43974c;
                ((MomentsFeedHeadView) viewGroup).f43884a.setTranslationY((-viewGroup.getTop()) / 2);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.a$b */
    public interface b {
    }

    public C11409a(MomentsFeedRecyclerList momentsFeedRecyclerList) {
        this.f43972a = momentsFeedRecyclerList;
    }

    @Override // com.p046p1.mobile.putong.feed.p060ui.moments.MomentsFeedRecyclerList.InterfaceC11406b
    /* JADX INFO: renamed from: a */
    public C22306c<roj0> mo66902a() {
        return FeedModule.f38854c.m60739m4(true);
    }

    @Override // com.p046p1.mobile.putong.feed.p060ui.moments.MomentsFeedRecyclerList.InterfaceC11406b
    /* JADX INFO: renamed from: b */
    public boolean mo66903b() {
        return this.f43972a.f43895d.f43906c.m173343c();
    }

    @Override // com.p046p1.mobile.putong.feed.p060ui.moments.MomentsFeedRecyclerList.InterfaceC11406b
    /* JADX INFO: renamed from: c */
    public void mo66904c() {
        if (NullChecker.m81303a(this.f43974c)) {
            ((MomentsFeedHeadView) this.f43974c).m66853A(0);
        }
    }

    @Override // com.p046p1.mobile.putong.feed.p060ui.moments.MomentsFeedRecyclerList.InterfaceC11406b
    /* JADX INFO: renamed from: d */
    public C22306c<Envelope> mo66905d(Moment moment) {
        return FeedModule.f38854c.m60697R3(moment.owner, moment.f56011id, !moment.haveLiked);
    }

    @Override // com.p046p1.mobile.putong.feed.p060ui.moments.MomentsFeedRecyclerList.InterfaceC11406b
    /* JADX INFO: renamed from: e */
    public void mo66906e(String str, final e30<User> e30Var) {
        MomentsFeedRecyclerList momentsFeedRecyclerList = this.f43972a;
        momentsFeedRecyclerList.f43895d.mo67374c(momentsFeedRecyclerList.m66884M(), ijb0.m136559W(str)).subscribe(mkd0.m154955G(new e30() { // from class: l.tm00
            @Override // p149l.e30
            public final void call(Object obj) {
                e30Var.call((User) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.feed.p060ui.moments.MomentsFeedRecyclerList.InterfaceC11406b
    /* JADX INFO: renamed from: f */
    public void mo66907f(Moment moment) {
        FeedModule.f38854c.m60728h3(moment._id);
    }

    @Override // com.p046p1.mobile.putong.feed.p060ui.moments.MomentsFeedRecyclerList.InterfaceC11406b
    /* JADX INFO: renamed from: g */
    public void mo66908g() {
        FeedModule.f38854c.m60719c4(Moments.TYPE);
    }

    @Override // com.p046p1.mobile.putong.feed.p060ui.moments.MomentsFeedRecyclerList.InterfaceC11406b
    /* JADX INFO: renamed from: h */
    public void mo66909h(boolean z) {
        if (z) {
            m67036t();
        } else {
            MomentsFeedRecyclerList momentsFeedRecyclerList = this.f43972a;
            momentsFeedRecyclerList.setAdapter(momentsFeedRecyclerList.f43895d);
        }
        this.f43972a.m66884M().duringCreated(mkd0.m154984r(FeedModule.m60222H().mo30774i9(), FeedModule.f38854c.m60711Y3(), new x9j() { // from class: l.nm00
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return Pair.create((roj0) obj, (q860) obj2);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.om00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144574a.m67034r((Pair) obj);
            }
        }));
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f43972a.m66884M().duringCreated(FeedModule.f38854c.m60739m4(true)).subscribe(mkd0.m154956H(new e30() { // from class: l.pm00
            @Override // p149l.e30
            public final void call(Object obj) {
                TrackMediaUploadUtil.m80298b0(Moments.TYPE, SystemClock.elapsedRealtime() - jElapsedRealtime);
            }
        }, new e30() { // from class: l.qm00
            @Override // p149l.e30
            public final void call(Object obj) {
                yij0.m214926D((Throwable) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.feed.p060ui.moments.MomentsFeedRecyclerList.InterfaceC11406b
    /* JADX INFO: renamed from: i */
    public void mo66910i(ArrayList<Media> arrayList) {
        this.f43972a.m66884M().startActivityForResult(CaptionAct.m66583X1(this.f43972a.m66884M(), arrayList), 50);
    }

    @Override // com.p046p1.mobile.putong.feed.p060ui.moments.MomentsFeedRecyclerList.InterfaceC11406b
    /* JADX INFO: renamed from: j */
    public void mo66911j(final Moment moment) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        FeedModule.f38854c.m60733j4(moment).subscribe(mkd0.m154956H(new e30() { // from class: l.rm00
            @Override // p149l.e30
            public final void call(Object obj) {
                r7i.m178139j0(Moments.TYPE, moment, SystemClock.elapsedRealtime() - jElapsedRealtime);
            }
        }, new e30() { // from class: l.sm00
            @Override // p149l.e30
            public final void call(Object obj) {
                yij0.m214926D((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public void m67033q(b bVar) {
        this.f43973b.add(bVar);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m67034r(Pair pair) {
        m67035s((q860) pair.second);
    }

    /* JADX INFO: renamed from: s */
    public final void m67035s(q860<Moment> q860Var) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList(q860Var.f153135a);
        } catch (Throwable th) {
            ArrayList arrayList2 = new ArrayList();
            CrashHelper.m81296c(th);
            arrayList = arrayList2;
        }
        q860 q860Var2 = new q860(arrayList, q860Var.f153136b);
        IntlOperationArticles intlOperationArticlesMo30831vq = FeedModule.m60222H().mo30831vq();
        boolean zM81303a = NullChecker.m81303a(intlOperationArticlesMo30831vq);
        ArrayList arrayList3 = new ArrayList();
        int size = q860Var2.f153135a.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Moment moment = (Moment) q860Var2.f153135a.get(i2);
            if (zM81303a && i == 3) {
                arrayList3.add(hg00.m130804a(intlOperationArticlesMo30831vq));
                zM81303a = false;
            }
            if (NullChecker.m81304b(moment)) {
                List<MomentMessage> listM60720d3 = FeedModule.f38854c.m60720d3(moment);
                PartialIdList partialIdList = moment.messages;
                arrayList3.add(new hg00(moment, listM60720d3.size(), partialIdList == null ? 0 : partialIdList.count, i2));
                i++;
                int size2 = listM60720d3.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    arrayList3.add(new hg00(moment, listM60720d3.get(i3), User.isTeamAccount(moment.owner), i3, size2));
                }
            }
        }
        if (zM81303a) {
            arrayList3.add(hg00.m130804a(intlOperationArticlesMo30831vq));
        }
        List<IntlOperationBanner> listMo30716Pg = FeedModule.m60222H().mo30716Pg();
        if (!vwb.m200296J(listMo30716Pg)) {
            arrayList3.add(0, hg00.m130805b(listMo30716Pg));
        }
        this.f43972a.f43895d.m66901K(new q860<>(arrayList3, q860Var2.f153136b));
        MomentsFeedRecyclerList momentsFeedRecyclerList = this.f43972a;
        if (momentsFeedRecyclerList.f43902k) {
            momentsFeedRecyclerList.scrollToPosition(0);
            this.f43972a.f43902k = false;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m67036t() {
        MomentsFeedHeadView momentsFeedHeadView = (MomentsFeedHeadView) this.f43972a.m66884M().inflater().inflate(o6c0.f142304v4, (ViewGroup) this.f43972a, false);
        this.f43974c = momentsFeedHeadView;
        momentsFeedHeadView.m66857p(this.f43972a.f43903l);
        this.f43972a.setOnScrollListener(new a());
        jxk jxkVar = new jxk(this.f43972a.f43895d);
        this.f43975d = jxkVar;
        jxkVar.m143815H(this.f43974c);
        this.f43972a.setAdapter(this.f43975d);
    }
}
