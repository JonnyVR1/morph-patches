package p149l;

import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class o7c extends AbstractC20367u7<j760<Links, List<Moment>>> {

    /* JADX INFO: renamed from: e */
    public List<RawFeed> f142479e;

    /* JADX INFO: renamed from: f */
    public an00 f142480f = new C18863a();

    @Override // p149l.AbstractC20367u7
    /* JADX INFO: renamed from: c */
    public void mo95544c() {
        super.mo95544c();
        this.f142479e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.AbstractC20367u7
    /* JADX INFO: renamed from: f */
    public boolean mo95545f() {
        T t = this.f174901b;
        return (t == 0 || ((j760) t).f116565b == 0 || ((List) ((j760) t).f116565b).size() <= 0) ? false : true;
    }

    @Override // p149l.AbstractC20367u7
    /* JADX INFO: renamed from: h */
    public C22306c<j760<Links, List<Moment>>> mo95546h() {
        return FeedModule.f38855d.m209270Ec(this.f142480f);
    }

    /* JADX INFO: renamed from: l */
    public List<RawFeed> m162975l() {
        return this.f142479e;
    }

    /* JADX INFO: renamed from: l.o7c$a */
    public class C18863a extends an00 {
        public C18863a() {
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: c */
        public void mo65704c(Envelope envelope) {
            o7c.this.f142479e = ((FeedData) envelope.getModuleData(FeedData.class)).feeds;
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: a */
        public void mo65703a(Envelope envelope) {
        }
    }
}
