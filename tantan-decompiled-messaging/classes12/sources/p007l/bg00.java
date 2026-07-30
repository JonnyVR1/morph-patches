package p007l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVideoView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.vwb;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class bg00 extends wf00<Moment> {

    /* JADX INFO: renamed from: f */
    public FeedCenterVideoView f6286f;

    /* JADX INFO: renamed from: h */
    private void m8819h(Moment moment) {
        if (moment == null || TextUtils.isEmpty(moment.simpleActivity.name)) {
            return;
        }
        p6j0.m12915e("e_activity_moment", "p_user_moment_interactions_details_view", vwb.Y("activity_id", moment.simpleActivity.f696id), vwb.Y("activity_name", moment.simpleActivity.name), vwb.Y("moment_show_type", "text_and_url"), vwb.Y("moments_user_id", moment.owner));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.view.View, com.p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVideoView, com.p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView] */
    @Override // p007l.wf00
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo8538c(VLinear vLinear, Context context, Moment moment) {
        super.mo8538c(vLinear, context, moment);
        if (NullChecker.b(vLinear)) {
            Object objInflate = LayoutInflater.from(context).inflate(o6c0.f11240j5, (ViewGroup) vLinear, false);
            if (objInflate instanceof FeedCenterVideoView) {
                FeedCenterVideoView feedCenterVideoView = (FeedCenterVideoView) objInflate;
                this.f6286f = feedCenterVideoView;
                feedCenterVideoView.f3372z = false;
                feedCenterVideoView.m5720l0(0, moment, new HashMap<>(), 12);
                ?? r5 = this.f6286f;
                r5.f3357k = this.f14524a;
                r5.f3358l = true;
                r5.f3359m = this.f14526c;
                r5.f3360n = this.f14527d;
                vLinear.addView(r5);
                m15809d(this.f6286f);
                eb1.m9689b(null, 1);
                m8819h(moment);
            }
        }
    }
}
