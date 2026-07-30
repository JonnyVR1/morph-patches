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
public class aah extends AbstractC2504u7<j760<Links, List<Moment>>> {

    /* JADX INFO: renamed from: e */
    public List<RawFeed> f5681e;

    /* JADX INFO: renamed from: f */
    public an00 f5682f = new C2320a();

    @Override // p007l.AbstractC2504u7
    /* JADX INFO: renamed from: c */
    public void mo8473c() {
        super.mo8473c();
        this.f5681e = null;
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
        return FeedModule.f316d.m16458Fc(this.f5682f);
    }

    /* JADX INFO: renamed from: l.aah$a */
    public class C2320a extends an00 {
        public C2320a() {
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: c */
        public void mo6843c(Envelope envelope) {
            aah.this.f5681e = ((FeedData) envelope.getModuleData(FeedData.class)).feeds;
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: a */
        public void mo6842a(Envelope envelope) {
        }
    }
}
