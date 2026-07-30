package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterImageView;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.p106mm.opensdk.constants.ConstantsAPI;
import java.util.HashMap;
import p151v.VLinear;

/* JADX INFO: loaded from: classes13.dex */
public class co00 extends fo00<Moment> {
    /* JADX INFO: renamed from: i */
    private void m111564i(Moment moment) {
        if (moment == null || TextUtils.isEmpty(moment.simpleActivity.name)) {
            return;
        }
        tfj0.m190942e("e_activity_moment", "p_user_moment_interactions_details_view", jyb.m147494Y(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, moment.simpleActivity.f40083id), jyb.m147494Y("activity_name", moment.simpleActivity.name), jyb.m147494Y("moment_show_type", "text_and_url"), jyb.m147494Y("moments_user_id", moment.owner));
    }

    @Override // p153l.fo00
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo99052c(VLinear vLinear, Context context, Moment moment) {
        super.mo99052c(vLinear, context, moment);
        if (NullChecker.m82487b(vLinear)) {
            View viewInflate = LayoutInflater.from(context).inflate(tec0.f173683i5, (ViewGroup) null);
            if (viewInflate instanceof FeedCenterImageView) {
                final FeedCenterImageView feedCenterImageView = (FeedCenterImageView) viewInflate;
                feedCenterImageView.setInterceptClickAction(new z20() { // from class: l.bo00
                    @Override // p153l.z20
                    public final void call(Object obj, Object obj2) {
                        this.f77604a.m111566k(feedCenterImageView, (Moment) obj, (Integer) obj2);
                    }
                });
                feedCenterImageView.f42759z = false;
                vLinear.addView(feedCenterImageView);
                feedCenterImageView.setFrom(this.f99997a);
                feedCenterImageView.f42745l = true;
                feedCenterImageView.f42743j = this.f99998b;
                feedCenterImageView.m65790l0(0, moment, new HashMap<>(), 12);
                m126435d(feedCenterImageView);
                m111564i(moment);
                feedCenterImageView.m65829W();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m111566k(FeedCenterImageView feedCenterImageView, Moment moment, Integer num) {
        feedCenterImageView.m65837g0(moment, num.intValue(), this.f99999c, this.f100000d);
    }
}
