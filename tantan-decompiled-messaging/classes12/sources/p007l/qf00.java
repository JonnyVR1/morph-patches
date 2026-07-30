package p007l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterForwardVideoView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class qf00 extends wf00<Moment> {

    /* JADX INFO: renamed from: f */
    public FeedCenterForwardVideoView f12220f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.view.View, com.p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterForwardVideoView, com.p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView] */
    @Override // p007l.wf00
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo8538c(VLinear vLinear, Context context, Moment moment) {
        super.mo8538c(vLinear, context, moment);
        if (NullChecker.b(vLinear)) {
            Object objInflate = LayoutInflater.from(context).inflate(o6c0.f11166Z0, (ViewGroup) vLinear, false);
            if (objInflate instanceof FeedCenterForwardVideoView) {
                FeedCenterForwardVideoView feedCenterForwardVideoView = (FeedCenterForwardVideoView) objInflate;
                this.f12220f = feedCenterForwardVideoView;
                feedCenterForwardVideoView.m5699l0(0, moment, new HashMap<>(), 12);
                ?? r5 = this.f12220f;
                r5.f3357k = this.f14524a;
                r5.f3358l = true;
                r5.f3359m = this.f14526c;
                r5.f3360n = this.f14527d;
                vLinear.addView(r5);
                m15809d(this.f12220f);
                if (xyi.m16874a(moment)) {
                    return;
                }
                eb1.m9689b(null, 1);
            }
        }
    }
}
