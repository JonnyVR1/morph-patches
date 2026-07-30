package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.MomentActivity;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class ovg extends j8h {
    public ovg(Act act) {
        super(act);
        m166189B(act);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ j760 m166185v(Envelope envelope) {
        FeedModule.f38855d.m209550sd(envelope);
        ijb0.m136554R(envelope.counters);
        return new j760(envelope.pagination.links, ((FeedData) envelope.getModuleData(FeedData.class)).activities);
    }

    /* JADX INFO: renamed from: A */
    public C22306c<j760<Links, List<MomentActivity>>> m166188A() {
        return m166191z(ymg.m215357z("limit=20" + m140217m()), "photo/album/comments/poll");
    }

    /* JADX INFO: renamed from: B */
    public void m166189B(Act act) {
        act.duringCreated(FeedModule.f38855d.f193014R0).subscribe(mkd0.m154955G(new e30() { // from class: l.kvg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124772a.m166190y((String) obj);
            }
        }));
    }

    @Override // p149l.j8h
    /* JADX INFO: renamed from: k */
    public C22306c<j760<Links, List<MomentActivity>>> mo140215k() {
        return m166188A();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m166190y(String str) {
        m119702b().mo61986z0(this.f116716b, this.f116717c);
    }

    /* JADX INFO: renamed from: z */
    public C22306c<j760<Links, List<MomentActivity>>> m166191z(final String str, String str2) {
        return FeedModule.f38855d.scheduled(str2, 0, new v9j() { // from class: l.lvg
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20((v9j<stc0>) new v9j() { // from class: l.mvg
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return qib0.f154693H.auth().m185898q(str).m185887f().m185883b();
                    }
                }, xh5.MESSAGE_IN_MOMENTS).compose(xh5.m208775w()).map(new w9j() { // from class: l.nvg
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ovg.m166185v((Envelope) obj);
                    }
                });
            }
        });
    }
}
