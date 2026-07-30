package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterAudioView;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.p106mm.opensdk.constants.ConstantsAPI;
import java.util.HashMap;
import p151v.VLinear;

/* JADX INFO: loaded from: classes13.dex */
public class yn00 extends fo00<Moment> {
    /* JADX INFO: renamed from: h */
    public final void m216761h(Moment moment) {
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
            View viewInflate = LayoutInflater.from(context).inflate(tec0.f173533L1, (ViewGroup) null);
            if (viewInflate instanceof FeedCenterAudioView) {
                FeedCenterAudioView feedCenterAudioView = (FeedCenterAudioView) viewInflate;
                feedCenterAudioView.m65786r0("p_user_moment_interactions_details_view", moment, new HashMap<>());
                feedCenterAudioView.m65787s0(fo00.f99996e, qa00.m175859d(4.0f), qa00.m175859d(16.0f), 0);
                feedCenterAudioView.f42744k = this.f99997a;
                feedCenterAudioView.f42745l = true;
                vLinear.addView(feedCenterAudioView);
                m126435d(feedCenterAudioView);
                m216761h(moment);
            }
        }
    }
}
