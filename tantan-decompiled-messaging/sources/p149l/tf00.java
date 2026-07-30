package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterImageView;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.p101mm.opensdk.constants.ConstantsAPI;
import java.util.HashMap;
import p147v.VLinear;

/* JADX INFO: loaded from: classes12.dex */
public class tf00 extends wf00<Moment> {
    /* JADX INFO: renamed from: i */
    private void m188645i(Moment moment) {
        if (moment == null || TextUtils.isEmpty(moment.simpleActivity.name)) {
            return;
        }
        p6j0.m167671e("e_activity_moment", "p_user_moment_interactions_details_view", vwb.m200311Y(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, moment.simpleActivity.f39235id), vwb.m200311Y("activity_name", moment.simpleActivity.name), vwb.m200311Y("moment_show_type", "text_and_url"), vwb.m200311Y("moments_user_id", moment.owner));
    }

    @Override // p149l.wf00
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo96278c(VLinear vLinear, Context context, Moment moment) {
        super.mo96278c(vLinear, context, moment);
        if (NullChecker.m81304b(vLinear)) {
            View viewInflate = LayoutInflater.from(context).inflate(o6c0.f142214i5, (ViewGroup) null);
            if (viewInflate instanceof FeedCenterImageView) {
                final FeedCenterImageView feedCenterImageView = (FeedCenterImageView) viewInflate;
                feedCenterImageView.setInterceptClickAction(new f30() { // from class: l.sf00
                    @Override // p149l.f30
                    public final void call(Object obj, Object obj2) {
                        this.f164189a.m188647k(feedCenterImageView, (Moment) obj, (Integer) obj2);
                    }
                });
                feedCenterImageView.f41911z = false;
                vLinear.addView(feedCenterImageView);
                feedCenterImageView.setFrom(this.f185999a);
                feedCenterImageView.f41897l = true;
                feedCenterImageView.f41895j = this.f186000b;
                feedCenterImageView.m64607l0(0, moment, new HashMap<>(), 12);
                m202941d(feedCenterImageView);
                m188645i(moment);
                feedCenterImageView.m64646W();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m188647k(FeedCenterImageView feedCenterImageView, Moment moment, Integer num) {
        feedCenterImageView.m64654g0(moment, num.intValue(), this.f186001c, this.f186002d);
    }
}
