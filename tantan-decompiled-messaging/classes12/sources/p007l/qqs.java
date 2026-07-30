package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Live;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.Moment;
import java.util.List;
import l.j760;
import l.vwb;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class qqs extends u5l0 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ j760 m13695g(Envelope envelope) {
        if (TextUtils.isEmpty(u5l0.m14770c(envelope))) {
            m14772e(true);
        } else {
            m14772e(false);
        }
        return vwb.Y(u5l0.m14769a(envelope), ((FeedData) envelope.getModuleData(FeedData.class)).lives);
    }

    @Override // p007l.u5l0
    /* JADX INFO: renamed from: d */
    public c<j760<List<Moment>, List<Live>>> mo13696d() {
        return c.just(Envelope.new_()).map(new w9j() { // from class: l.pqs
            public final Object call(Object obj) {
                return this.f11947a.m13695g((Envelope) obj);
            }
        });
    }
}
