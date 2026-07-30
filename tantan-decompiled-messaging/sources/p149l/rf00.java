package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.FeedListImageLinkItem;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.p101mm.opensdk.constants.ConstantsAPI;
import p147v.VLinear;

/* JADX INFO: loaded from: classes12.dex */
public class rf00 extends wf00<Moment> {
    /* JADX INFO: renamed from: h */
    private void m179071h(Moment moment) {
        if (moment == null || TextUtils.isEmpty(moment.simpleActivity.name)) {
            return;
        }
        p6j0.m167671e("e_activity_moment", "p_user_moment_interactions_details_view", vwb.m200311Y(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, moment.simpleActivity.f39235id), vwb.m200311Y("activity_name", moment.simpleActivity.name), vwb.m200311Y("moment_show_type", "card"), vwb.m200311Y("moments_user_id", moment.owner));
    }

    @Override // p149l.wf00
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo96278c(VLinear vLinear, Context context, Moment moment) {
        super.mo96278c(vLinear, context, moment);
        if (NullChecker.m81304b(vLinear)) {
            View viewInflate = LayoutInflater.from(context).inflate(o6c0.f142168c1, (ViewGroup) null);
            if (viewInflate instanceof FeedListImageLinkItem) {
                FeedListImageLinkItem feedListImageLinkItem = (FeedListImageLinkItem) viewInflate;
                feedListImageLinkItem.setNeedInnerClick(false);
                feedListImageLinkItem.m63100m(0, moment, "", 0, 64, "p_user_moment_interactions_details_view");
                vLinear.addView(feedListImageLinkItem);
                m179071h(moment);
            }
        }
    }
}
