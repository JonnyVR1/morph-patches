package com.p000p1.mobile.putong.feed.p005ui.moments;

import android.os.SystemClock;
import android.util.Pair;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.IntlOperationArticles;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Moments;
import com.p000p1.mobile.putong.data.PartialIdList;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.jxk;
import l.mkd0;
import l.q860;
import l.roj0;
import l.vwb;
import l.x9j;
import l.yij0;
import p007l.hg00;
import p007l.ijb0;
import p007l.o6c0;
import rx.c;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C2253a implements MomentsFeedRecyclerList.InterfaceC2250b {

    /* JADX INFO: renamed from: a */
    public MomentsFeedRecyclerList f5433a;

    /* JADX INFO: renamed from: b */
    public List<b> f5434b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public ViewGroup f5435c;

    /* JADX INFO: renamed from: d */
    public jxk f5436d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.a$a */
    public class a extends RecyclerView.t {
        public a() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (recyclerView.getLayoutManager().findFirstVisibleItemPosition() == 0) {
                ViewGroup viewGroup = C2253a.this.f5435c;
                ((MomentsFeedHeadView) viewGroup).f5345a.setTranslationY((-viewGroup.getTop()) / 2);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.a$b */
    public interface b {
    }

    public C2253a(MomentsFeedRecyclerList momentsFeedRecyclerList) {
        this.f5433a = momentsFeedRecyclerList;
    }

    @Override // com.p000p1.mobile.putong.feed.p005ui.moments.MomentsFeedRecyclerList.InterfaceC2250b
    /* JADX INFO: renamed from: a */
    public c<roj0> mo8100a() {
        return FeedModule.f315c.m1665m4(true);
    }

    @Override // com.p000p1.mobile.putong.feed.p005ui.moments.MomentsFeedRecyclerList.InterfaceC2250b
    /* JADX INFO: renamed from: b */
    public boolean mo8101b() {
        return this.f5433a.f5356d.f5367c.c();
    }

    @Override // com.p000p1.mobile.putong.feed.p005ui.moments.MomentsFeedRecyclerList.InterfaceC2250b
    /* JADX INFO: renamed from: c */
    public void mo8102c() {
        if (NullChecker.a(this.f5435c)) {
            ((MomentsFeedHeadView) this.f5435c).m8047A(0);
        }
    }

    @Override // com.p000p1.mobile.putong.feed.p005ui.moments.MomentsFeedRecyclerList.InterfaceC2250b
    /* JADX INFO: renamed from: d */
    public c<Envelope> mo8103d(Moment moment) {
        return FeedModule.f315c.m1623R3(moment.owner, ((DbObject) moment).id, !moment.haveLiked);
    }

    @Override // com.p000p1.mobile.putong.feed.p005ui.moments.MomentsFeedRecyclerList.InterfaceC2250b
    /* JADX INFO: renamed from: e */
    public void mo8104e(String str, final e30<User> e30Var) {
        MomentsFeedRecyclerList momentsFeedRecyclerList = this.f5433a;
        momentsFeedRecyclerList.f5356d.c(momentsFeedRecyclerList.m8078M(), ijb0.m10912W(str)).subscribe(mkd0.G(new e30() { // from class: l.tm00
            public final void call(Object obj) {
                e30Var.call((User) obj);
            }
        }));
    }

    @Override // com.p000p1.mobile.putong.feed.p005ui.moments.MomentsFeedRecyclerList.InterfaceC2250b
    /* JADX INFO: renamed from: f */
    public void mo8105f(Moment moment) {
        FeedModule.f315c.m1654h3(((DbObject) moment)._id);
    }

    @Override // com.p000p1.mobile.putong.feed.p005ui.moments.MomentsFeedRecyclerList.InterfaceC2250b
    /* JADX INFO: renamed from: g */
    public void mo8106g() {
        FeedModule.f315c.m1645c4(Moments.TYPE);
    }

    @Override // com.p000p1.mobile.putong.feed.p005ui.moments.MomentsFeedRecyclerList.InterfaceC2250b
    /* JADX INFO: renamed from: h */
    public void mo8107h(boolean z) {
        if (z) {
            m8239t();
        } else {
            MomentsFeedRecyclerList momentsFeedRecyclerList = this.f5433a;
            momentsFeedRecyclerList.setAdapter(momentsFeedRecyclerList.f5356d);
        }
        this.f5433a.m8078M().duringCreated(mkd0.r(FeedModule.m1140H().i9(), FeedModule.f315c.m1637Y3(), new x9j() { // from class: l.nm00
            public final Object call(Object obj, Object obj2) {
                return Pair.create((roj0) obj, (q860) obj2);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.om00
            public final void call(Object obj) {
                this.f11500a.m8237r((Pair) obj);
            }
        }));
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f5433a.m8078M().duringCreated(FeedModule.f315c.m1665m4(true)).subscribe(mkd0.H(new e30() { // from class: l.pm00
            public final void call(Object obj) {
                TrackMediaUploadUtil.b0(Moments.TYPE, SystemClock.elapsedRealtime() - jElapsedRealtime);
            }
        }, new e30() { // from class: l.qm00
            public final void call(Object obj) {
                yij0.D((Throwable) obj);
            }
        }));
    }

    @Override // com.p000p1.mobile.putong.feed.p005ui.moments.MomentsFeedRecyclerList.InterfaceC2250b
    /* JADX INFO: renamed from: i */
    public void mo8108i(ArrayList<Media> arrayList) {
        this.f5433a.m8078M().startActivityForResult(CaptionAct.m7774X1(this.f5433a.m8078M(), arrayList), 50);
    }

    @Override // com.p000p1.mobile.putong.feed.p005ui.moments.MomentsFeedRecyclerList.InterfaceC2250b
    /* JADX INFO: renamed from: j */
    public void mo8109j(final Moment moment) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        FeedModule.f315c.m1659j4(moment).subscribe(mkd0.H(new e30() { // from class: l.rm00
            public final void call(Object obj) {
                r7i.m13852j0(Moments.TYPE, moment, SystemClock.elapsedRealtime() - jElapsedRealtime);
            }
        }, new e30() { // from class: l.sm00
            public final void call(Object obj) {
                yij0.D((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public void m8236q(b bVar) {
        this.f5434b.add(bVar);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m8237r(Pair pair) {
        m8238s((q860) pair.second);
    }

    /* JADX INFO: renamed from: s */
    public final void m8238s(q860<Moment> q860Var) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList(q860Var.a);
        } catch (Throwable th) {
            ArrayList arrayList2 = new ArrayList();
            CrashHelper.c(th);
            arrayList = arrayList2;
        }
        q860 q860Var2 = new q860(arrayList, q860Var.b);
        IntlOperationArticles intlOperationArticlesVq = FeedModule.m1140H().vq();
        boolean zA = NullChecker.a(intlOperationArticlesVq);
        ArrayList arrayList3 = new ArrayList();
        int size = q860Var2.a.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Moment moment = (Moment) q860Var2.a.get(i2);
            if (zA && i == 3) {
                arrayList3.add(hg00.m10622a(intlOperationArticlesVq));
                zA = false;
            }
            if (NullChecker.b(moment)) {
                List<MomentMessage> listM1646d3 = FeedModule.f315c.m1646d3(moment);
                PartialIdList partialIdList = moment.messages;
                arrayList3.add(new hg00(moment, listM1646d3.size(), partialIdList == null ? 0 : partialIdList.count, i2));
                i++;
                int size2 = listM1646d3.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    arrayList3.add(new hg00(moment, listM1646d3.get(i3), User.isTeamAccount(moment.owner), i3, size2));
                }
            }
        }
        if (zA) {
            arrayList3.add(hg00.m10622a(intlOperationArticlesVq));
        }
        List listPg = FeedModule.m1140H().Pg();
        if (!vwb.J(listPg)) {
            arrayList3.add(0, hg00.m10623b(listPg));
        }
        this.f5433a.f5356d.m8098K(new q860<>(arrayList3, q860Var2.b));
        MomentsFeedRecyclerList momentsFeedRecyclerList = this.f5433a;
        if (momentsFeedRecyclerList.f5363k) {
            momentsFeedRecyclerList.scrollToPosition(0);
            this.f5433a.f5363k = false;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m8239t() {
        MomentsFeedHeadView momentsFeedHeadView = (MomentsFeedHeadView) this.f5433a.m8078M().inflater().inflate(o6c0.f11323v4, (ViewGroup) this.f5433a, false);
        this.f5435c = momentsFeedHeadView;
        momentsFeedHeadView.m8051p(this.f5433a.f5364l);
        this.f5433a.setOnScrollListener(new a());
        jxk jxkVar = new jxk(this.f5433a.f5356d);
        this.f5436d = jxkVar;
        jxkVar.H(this.f5435c);
        this.f5433a.setAdapter(this.f5436d);
    }
}
