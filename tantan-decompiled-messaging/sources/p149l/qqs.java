package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.Moment;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class qqs extends u5l0 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ j760 m175961g(Envelope envelope) {
        if (TextUtils.isEmpty(u5l0.m191868c(envelope))) {
            m191870e(true);
        } else {
            m191870e(false);
        }
        return vwb.m200311Y(u5l0.m191867a(envelope), ((FeedData) envelope.getModuleData(FeedData.class)).lives);
    }

    @Override // p149l.u5l0
    /* JADX INFO: renamed from: d */
    public C22306c<j760<List<Moment>, List<Live>>> mo175962d() {
        return C22306c.just(Envelope.new_()).map(new w9j() { // from class: l.pqs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f150813a.m175961g((Envelope) obj);
            }
        });
    }
}
