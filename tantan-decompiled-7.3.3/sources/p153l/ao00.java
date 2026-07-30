package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.FeedListImageLinkItem;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.p106mm.opensdk.constants.ConstantsAPI;
import p151v.VLinear;

/* JADX INFO: loaded from: classes13.dex */
public class ao00 extends fo00<Moment> {
    /* JADX INFO: renamed from: h */
    private void m99051h(Moment moment) {
        if (moment == null || TextUtils.isEmpty(moment.simpleActivity.name)) {
            return;
        }
        tfj0.m190942e("e_activity_moment", "p_user_moment_interactions_details_view", jyb.m147494Y(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, moment.simpleActivity.f40083id), jyb.m147494Y("activity_name", moment.simpleActivity.name), jyb.m147494Y("moment_show_type", "card"), jyb.m147494Y("moments_user_id", moment.owner));
    }

    @Override // p153l.fo00
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo99052c(VLinear vLinear, Context context, Moment moment) {
        super.mo99052c(vLinear, context, moment);
        if (NullChecker.m82487b(vLinear)) {
            View viewInflate = LayoutInflater.from(context).inflate(tec0.f173637c1, (ViewGroup) null);
            if (viewInflate instanceof FeedListImageLinkItem) {
                FeedListImageLinkItem feedListImageLinkItem = (FeedListImageLinkItem) viewInflate;
                feedListImageLinkItem.setNeedInnerClick(false);
                feedListImageLinkItem.m64283m(0, moment, "", 0, 64, "p_user_moment_interactions_details_view");
                vLinear.addView(feedListImageLinkItem);
                m99051h(moment);
            }
        }
    }
}
