package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVoteView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p151v.VLinear;

/* JADX INFO: loaded from: classes13.dex */
public class jo00 extends fo00<Moment> {
    @Override // p153l.fo00
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo99052c(VLinear vLinear, Context context, Moment moment) {
        super.mo99052c(vLinear, context, moment);
        if (NullChecker.m82487b(vLinear)) {
            View viewInflate = LayoutInflater.from(context).inflate(tec0.f173623a1, (ViewGroup) null);
            if (viewInflate instanceof FeedCenterVoteView) {
                FeedCenterVoteView feedCenterVoteView = (FeedCenterVoteView) viewInflate;
                feedCenterVoteView.m65876X0(0, moment, new HashMap<>(), 12);
                feedCenterVoteView.f42744k = "detail";
                feedCenterVoteView.f42745l = true;
                vLinear.addView(feedCenterVoteView);
                m126435d(feedCenterVoteView);
            }
        }
    }
}
