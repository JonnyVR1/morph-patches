package p007l;

import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import java.util.List;
import l.j760;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class o7c extends AbstractC2504u7<j760<Links, List<Moment>>> {

    /* JADX INFO: renamed from: e */
    public List<RawFeed> f11360e;

    /* JADX INFO: renamed from: f */
    public an00 f11361f = new C2445a();

    @Override // p007l.AbstractC2504u7
    /* JADX INFO: renamed from: c */
    public void mo8473c() {
        super.mo8473c();
        this.f11360e = null;
    }

    @Override // p007l.AbstractC2504u7
    /* JADX INFO: renamed from: f */
    public boolean mo8474f() {
        T t = this.f13570b;
        return (t == 0 || ((j760) t).b == null || ((List) ((j760) t).b).size() <= 0) ? false : true;
    }

    @Override // p007l.AbstractC2504u7
    /* JADX INFO: renamed from: h */
    public c<j760<Links, List<Moment>>> mo8475h() {
        return FeedModule.f316d.m16451Ec(this.f11361f);
    }

    /* JADX INFO: renamed from: l */
    public List<RawFeed> m12448l() {
        return this.f11360e;
    }

    /* JADX INFO: renamed from: l.o7c$a */
    public class C2445a extends an00 {
        public C2445a() {
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: c */
        public void mo6843c(Envelope envelope) {
            o7c.this.f11360e = ((FeedData) envelope.getModuleData(FeedData.class)).feeds;
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: a */
        public void mo6842a(Envelope envelope) {
        }
    }
}
