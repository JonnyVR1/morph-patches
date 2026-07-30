package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterAudioView;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.p101mm.opensdk.constants.ConstantsAPI;
import java.util.HashMap;
import p147v.VLinear;

/* JADX INFO: loaded from: classes12.dex */
public class pf00 extends wf00<Moment> {
    /* JADX INFO: renamed from: h */
    public final void m168581h(Moment moment) {
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
            View viewInflate = LayoutInflater.from(context).inflate(o6c0.f142064L1, (ViewGroup) null);
            if (viewInflate instanceof FeedCenterAudioView) {
                FeedCenterAudioView feedCenterAudioView = (FeedCenterAudioView) viewInflate;
                feedCenterAudioView.m64603r0("p_user_moment_interactions_details_view", moment, new HashMap<>());
                feedCenterAudioView.m64604s0(wf00.f185998e, t100.m186890d(4.0f), t100.m186890d(16.0f), 0);
                feedCenterAudioView.f41896k = this.f185999a;
                feedCenterAudioView.f41897l = true;
                vLinear.addView(feedCenterAudioView);
                m202941d(feedCenterAudioView);
                m168581h(moment);
            }
        }
    }
}
