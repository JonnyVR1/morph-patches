package p153l;

import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class u8c extends AbstractC19310p7<pf60<Links, List<Moment>>> {

    /* JADX INFO: renamed from: e */
    public List<RawFeed> f178020e;

    /* JADX INFO: renamed from: f */
    public jv00 f178021f = new C20523a();

    @Override // p153l.AbstractC19310p7
    /* JADX INFO: renamed from: c */
    public void mo167402c() {
        super.mo167402c();
        this.f178020e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.AbstractC19310p7
    /* JADX INFO: renamed from: f */
    public boolean mo167403f() {
        T t = this.f150891b;
        return (t == 0 || ((pf60) t).f152157b == 0 || ((List) ((pf60) t).f152157b).size() <= 0) ? false : true;
    }

    @Override // p153l.AbstractC19310p7
    /* JADX INFO: renamed from: h */
    public C22421c<pf60<Links, List<Moment>>> mo167404h() {
        return FeedModule.f39703d.m145511Ec(this.f178021f);
    }

    /* JADX INFO: renamed from: l */
    public List<RawFeed> m195014l() {
        return this.f178020e;
    }

    /* JADX INFO: renamed from: l.u8c$a */
    public class C20523a extends jv00 {
        public C20523a() {
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: c */
        public void mo66887c(Envelope envelope) {
            u8c.this.f178020e = ((FeedData) envelope.getModuleData(FeedData.class)).feeds;
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: a */
        public void mo66886a(Envelope envelope) {
        }
    }
}
