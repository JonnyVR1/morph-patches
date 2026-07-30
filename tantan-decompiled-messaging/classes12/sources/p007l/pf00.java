package p007l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterAudioView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.t100;
import l.vwb;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class pf00 extends wf00<Moment> {
    /* JADX INFO: renamed from: h */
    public final void m13037h(Moment moment) {
        if (moment == null || TextUtils.isEmpty(moment.simpleActivity.name)) {
            return;
        }
        p6j0.m12915e("e_activity_moment", "p_user_moment_interactions_details_view", vwb.Y("activity_id", moment.simpleActivity.f696id), vwb.Y("activity_name", moment.simpleActivity.name), vwb.Y("moment_show_type", "text_and_url"), vwb.Y("moments_user_id", moment.owner));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.view.View, com.p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterAudioView, com.p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView] */
    @Override // p007l.wf00
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo8538c(VLinear vLinear, Context context, Moment moment) {
        super.mo8538c(vLinear, context, moment);
        if (NullChecker.b(vLinear)) {
            Object objInflate = LayoutInflater.from(context).inflate(o6c0.f11083L1, (ViewGroup) null);
            if (objInflate instanceof FeedCenterAudioView) {
                ?? r6 = (FeedCenterAudioView) objInflate;
                r6.m5697r0("p_user_moment_interactions_details_view", moment, new HashMap());
                r6.m5698s0(wf00.f14523e, t100.d(4.0f), t100.d(16.0f), 0);
                r6.f3357k = this.f14524a;
                r6.f3358l = true;
                vLinear.addView(r6);
                m15809d(r6);
                m13037h(moment);
            }
        }
    }
}
