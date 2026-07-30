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
public class aah extends AbstractC20367u7<j760<Links, List<Moment>>> {

    /* JADX INFO: renamed from: e */
    public List<RawFeed> f68557e;

    /* JADX INFO: renamed from: f */
    public an00 f68558f = new C15559a();

    @Override // p149l.AbstractC20367u7
    /* JADX INFO: renamed from: c */
    public void mo95544c() {
        super.mo95544c();
        this.f68557e = null;
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
        return FeedModule.f38855d.m209277Fc(this.f68558f);
    }

    /* JADX INFO: renamed from: l.aah$a */
    public class C15559a extends an00 {
        public C15559a() {
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: c */
        public void mo65704c(Envelope envelope) {
            aah.this.f68557e = ((FeedData) envelope.getModuleData(FeedData.class)).feeds;
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: a */
        public void mo65703a(Envelope envelope) {
        }
    }
}
