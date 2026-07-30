package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.FeedListActivityTextWithLinkItem;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.p106mm.opensdk.constants.ConstantsAPI;
import p151v.VLinear;

/* JADX INFO: loaded from: classes13.dex */
public class ho00 extends fo00<Moment> {
    /* JADX INFO: renamed from: h */
    private void m136378h(Moment moment) {
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
            View viewInflate = LayoutInflater.from(context).inflate(tec0.f173630b1, (ViewGroup) null);
            if (viewInflate instanceof FeedListActivityTextWithLinkItem) {
                FeedListActivityTextWithLinkItem feedListActivityTextWithLinkItem = (FeedListActivityTextWithLinkItem) viewInflate;
                LinearLayout linearLayout = feedListActivityTextWithLinkItem.f41675e;
                int i = fo00.f99996e;
                linearLayout.setPadding(i, 0, qa00.m175859d(32.0f), 0);
                feedListActivityTextWithLinkItem.m64270n((bnl0.m105592y0() - i) - qa00.m175859d(32.0f));
                feedListActivityTextWithLinkItem.setNeedInnerClick(false);
                feedListActivityTextWithLinkItem.m64268l(0, moment, "", 0, "p_user_moment_interactions_details_view");
                vLinear.addView(feedListActivityTextWithLinkItem);
                m136378h(moment);
            }
        }
    }
}
