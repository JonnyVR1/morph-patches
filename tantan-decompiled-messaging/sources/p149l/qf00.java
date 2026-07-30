package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterForwardVideoView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p147v.VLinear;

/* JADX INFO: loaded from: classes12.dex */
public class qf00 extends wf00<Moment> {

    /* JADX INFO: renamed from: f */
    public FeedCenterForwardVideoView f154074f;

    @Override // p149l.wf00
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo96278c(VLinear vLinear, Context context, Moment moment) {
        super.mo96278c(vLinear, context, moment);
        if (NullChecker.m81304b(vLinear)) {
            View viewInflate = LayoutInflater.from(context).inflate(o6c0.f142147Z0, (ViewGroup) vLinear, false);
            if (viewInflate instanceof FeedCenterForwardVideoView) {
                FeedCenterForwardVideoView feedCenterForwardVideoView = (FeedCenterForwardVideoView) viewInflate;
                this.f154074f = feedCenterForwardVideoView;
                feedCenterForwardVideoView.m64605l0(0, moment, new HashMap<>(), 12);
                FeedCenterForwardVideoView feedCenterForwardVideoView2 = this.f154074f;
                feedCenterForwardVideoView2.f41896k = this.f185999a;
                feedCenterForwardVideoView2.f41897l = true;
                feedCenterForwardVideoView2.f41898m = this.f186001c;
                feedCenterForwardVideoView2.f41899n = this.f186002d;
                vLinear.addView(feedCenterForwardVideoView2);
                m202941d(this.f154074f);
                if (xyi.m211769a(moment)) {
                    return;
                }
                eb1.m115447b(null, 1);
            }
        }
    }
}
