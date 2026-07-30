package p007l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessageType;
import com.p000p1.mobile.putong.feed.newui.photoalbum.FeedListImageLinkItem;
import com.tantanapp.common.utils.NullChecker;
import l.vwb;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class rf00 extends wf00<Moment> {
    /* JADX INFO: renamed from: h */
    private void m13902h(Moment moment) {
        if (moment == null || TextUtils.isEmpty(moment.simpleActivity.name)) {
            return;
        }
        p6j0.m12915e("e_activity_moment", "p_user_moment_interactions_details_view", vwb.Y("activity_id", moment.simpleActivity.f696id), vwb.Y("activity_name", moment.simpleActivity.name), vwb.Y("moment_show_type", MomentMessageType.card), vwb.Y("moments_user_id", moment.owner));
    }

    @Override // p007l.wf00
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo8538c(VLinear vLinear, Context context, Moment moment) {
        super.mo8538c(vLinear, context, moment);
        if (NullChecker.b(vLinear)) {
            View viewInflate = LayoutInflater.from(context).inflate(o6c0.f11187c1, (ViewGroup) null);
            if (viewInflate instanceof FeedListImageLinkItem) {
                FeedListImageLinkItem feedListImageLinkItem = (FeedListImageLinkItem) viewInflate;
                feedListImageLinkItem.setNeedInnerClick(false);
                feedListImageLinkItem.m4116m(0, moment, "", 0, 64, "p_user_moment_interactions_details_view");
                vLinear.addView(feedListImageLinkItem);
                m13902h(moment);
            }
        }
    }
}
