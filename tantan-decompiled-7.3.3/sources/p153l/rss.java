package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.Moment;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class rss extends yel0 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ pf60 m183032g(Envelope envelope) {
        if (TextUtils.isEmpty(yel0.m215418c(envelope))) {
            m215420e(true);
        } else {
            m215420e(false);
        }
        return jyb.m147494Y(yel0.m215417a(envelope), ((FeedData) envelope.getModuleData(FeedData.class)).lives);
    }

    @Override // p153l.yel0
    /* JADX INFO: renamed from: d */
    public C22421c<pf60<List<Moment>, List<Live>>> mo157784d() {
        return C22421c.just(Envelope.new_()).map(new qcj() { // from class: l.qss
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f159348a.m183032g((Envelope) obj);
            }
        });
    }
}
