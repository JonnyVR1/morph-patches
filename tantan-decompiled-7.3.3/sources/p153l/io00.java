package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.FeedListTextWithLinkItem;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.p106mm.opensdk.constants.ConstantsAPI;
import java.util.HashMap;
import p151v.VLinear;

/* JADX INFO: loaded from: classes13.dex */
public class io00 extends fo00<Moment> {
    /* JADX INFO: renamed from: h */
    private void m141242h(Moment moment) {
        if (moment == null || TextUtils.isEmpty(moment.simpleActivity.name)) {
            return;
        }
        tfj0.m190942e("e_activity_moment", "p_user_moment_interactions_details_view", jyb.m147494Y(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, moment.simpleActivity.f40083id), jyb.m147494Y("activity_name", moment.simpleActivity.name), jyb.m147494Y("moment_show_type", "text_and_url"), jyb.m147494Y("moments_user_id", moment.owner));
    }

    @Override // p153l.fo00
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo99052c(VLinear vLinear, Context context, Moment moment) {
        super.mo99052c(vLinear, context, moment);
        if (NullChecker.m82487b(vLinear)) {
            View viewInflate = LayoutInflater.from(context).inflate(tec0.f173651e1, (ViewGroup) null);
            if (viewInflate instanceof FeedListTextWithLinkItem) {
                FeedListTextWithLinkItem feedListTextWithLinkItem = (FeedListTextWithLinkItem) viewInflate;
                feedListTextWithLinkItem.f41718e.setPadding(fo00.f99996e, 0, qa00.m175859d(32.0f), 0);
                feedListTextWithLinkItem.setNeedInnerClick(false);
                feedListTextWithLinkItem.m64306j(0, moment, "", 0, new HashMap<>(), "p_user_moment_interactions_details_view");
                vLinear.addView(feedListTextWithLinkItem);
                m141242h(moment);
            }
        }
    }
}
