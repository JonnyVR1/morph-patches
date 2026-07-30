package p007l;

import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.MomentActivity;
import com.p1.mobile.android.app.Act;
import java.util.List;
import l.e30;
import l.j760;
import l.la20;
import l.mkd0;
import l.qib0;
import l.v9j;
import l.w9j;
import l.xh5;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ovg extends j8h {
    public ovg(Act act) {
        super(act);
        m12863B(act);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ j760 m12859v(Envelope envelope) {
        FeedModule.f316d.m16731sd(envelope);
        ijb0.m10907R(envelope.counters);
        return new j760(envelope.pagination.links, ((FeedData) envelope.getModuleData(FeedData.class)).activities);
    }

    /* JADX INFO: renamed from: A */
    public c<j760<Links, List<MomentActivity>>> m12862A() {
        return m12865z(ymg.m17185z("limit=20" + m11084m()), "photo/album/comments/poll");
    }

    /* JADX INFO: renamed from: B */
    public void m12863B(Act act) {
        act.duringCreated(FeedModule.f316d.f14949R0).subscribe(mkd0.G(new e30() { // from class: l.kvg
            public final void call(Object obj) {
                this.f9806a.m12864y((String) obj);
            }
        }));
    }

    @Override // p007l.j8h
    /* JADX INFO: renamed from: k */
    public c<j760<Links, List<MomentActivity>>> mo11082k() {
        return m12862A();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m12864y(String str) {
        m10070b().mo2960z0(this.f9255b, this.f9256c);
    }

    /* JADX INFO: renamed from: z */
    public c<j760<Links, List<MomentActivity>>> m12865z(final String str, String str2) {
        return FeedModule.f316d.scheduled(str2, 0, new v9j() { // from class: l.lvg
            public final Object call() {
                return new la20(new v9j() { // from class: l.mvg
                    public final Object call() {
                        return qib0.H.auth().q(str).f().b();
                    }
                }, xh5.MESSAGE_IN_MOMENTS).compose(xh5.w()).map(new w9j() { // from class: l.nvg
                    public final Object call(Object obj) {
                        return ovg.m12859v((Envelope) obj);
                    }
                });
            }
        });
    }
}
