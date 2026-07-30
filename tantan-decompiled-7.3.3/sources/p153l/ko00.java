package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVideoView;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.p106mm.opensdk.constants.ConstantsAPI;
import java.util.HashMap;
import p151v.VLinear;

/* JADX INFO: loaded from: classes13.dex */
public class ko00 extends fo00<Moment> {

    /* JADX INFO: renamed from: f */
    public FeedCenterVideoView f127663f;

    /* JADX INFO: renamed from: h */
    private void m150566h(Moment moment) {
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
            View viewInflate = LayoutInflater.from(context).inflate(tec0.f173690j5, (ViewGroup) vLinear, false);
            if (viewInflate instanceof FeedCenterVideoView) {
                FeedCenterVideoView feedCenterVideoView = (FeedCenterVideoView) viewInflate;
                this.f127663f = feedCenterVideoView;
                feedCenterVideoView.f42759z = false;
                feedCenterVideoView.m65809l0(0, moment, new HashMap<>(), 12);
                FeedCenterVideoView feedCenterVideoView2 = this.f127663f;
                feedCenterVideoView2.f42744k = this.f99997a;
                feedCenterVideoView2.f42745l = true;
                feedCenterVideoView2.f42746m = this.f99999c;
                feedCenterVideoView2.f42747n = this.f100000d;
                vLinear.addView(feedCenterVideoView2);
                m126435d(this.f127663f);
                lb1.m153552b(null, 1);
                m150566h(moment);
            }
        }
    }
}
