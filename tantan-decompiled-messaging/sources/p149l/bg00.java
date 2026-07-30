package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVideoView;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.p101mm.opensdk.constants.ConstantsAPI;
import java.util.HashMap;
import p147v.VLinear;

/* JADX INFO: loaded from: classes12.dex */
public class bg00 extends wf00<Moment> {

    /* JADX INFO: renamed from: f */
    public FeedCenterVideoView f75393f;

    /* JADX INFO: renamed from: h */
    private void m101620h(Moment moment) {
        if (moment == null || TextUtils.isEmpty(moment.simpleActivity.name)) {
            return;
        }
        p6j0.m167671e("e_activity_moment", "p_user_moment_interactions_details_view", vwb.m200311Y(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, moment.simpleActivity.f39235id), vwb.m200311Y("activity_name", moment.simpleActivity.name), vwb.m200311Y("moment_show_type", "text_and_url"), vwb.m200311Y("moments_user_id", moment.owner));
    }

    @Override // p149l.wf00
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo96278c(VLinear vLinear, Context context, Moment moment) {
        super.mo96278c(vLinear, context, moment);
        if (NullChecker.m81304b(vLinear)) {
            View viewInflate = LayoutInflater.from(context).inflate(o6c0.f142221j5, (ViewGroup) vLinear, false);
            if (viewInflate instanceof FeedCenterVideoView) {
                FeedCenterVideoView feedCenterVideoView = (FeedCenterVideoView) viewInflate;
                this.f75393f = feedCenterVideoView;
                feedCenterVideoView.f41911z = false;
                feedCenterVideoView.m64626l0(0, moment, new HashMap<>(), 12);
                FeedCenterVideoView feedCenterVideoView2 = this.f75393f;
                feedCenterVideoView2.f41896k = this.f185999a;
                feedCenterVideoView2.f41897l = true;
                feedCenterVideoView2.f41898m = this.f186001c;
                feedCenterVideoView2.f41899n = this.f186002d;
                vLinear.addView(feedCenterVideoView2);
                m202941d(this.f75393f);
                eb1.m115447b(null, 1);
                m101620h(moment);
            }
        }
    }
}
