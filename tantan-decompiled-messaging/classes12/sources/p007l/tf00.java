package p007l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterImageView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.f30;
import l.vwb;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class tf00 extends wf00<Moment> {
    /* JADX INFO: renamed from: i */
    private void m14511i(Moment moment) {
        if (moment == null || TextUtils.isEmpty(moment.simpleActivity.name)) {
            return;
        }
        p6j0.m12915e("e_activity_moment", "p_user_moment_interactions_details_view", vwb.Y("activity_id", moment.simpleActivity.f696id), vwb.Y("activity_name", moment.simpleActivity.name), vwb.Y("moment_show_type", "text_and_url"), vwb.Y("moments_user_id", moment.owner));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.view.View, com.p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterImageView, com.p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView] */
    @Override // p007l.wf00
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo8538c(VLinear vLinear, Context context, Moment moment) {
        super.mo8538c(vLinear, context, moment);
        if (NullChecker.b(vLinear)) {
            Object objInflate = LayoutInflater.from(context).inflate(o6c0.f11233i5, (ViewGroup) null);
            if (objInflate instanceof FeedCenterImageView) {
                final ?? r4 = (FeedCenterImageView) objInflate;
                r4.setInterceptClickAction(new f30() { // from class: l.sf00
                    public final void call(Object obj, Object obj2) {
                        this.f12899a.m14513k(r4, (Moment) obj, (Integer) obj2);
                    }
                });
                r4.f3372z = false;
                vLinear.addView(r4);
                r4.setFrom(this.f14524a);
                r4.f3358l = true;
                r4.f3356j = this.f14525b;
                r4.m5701l0(0, moment, new HashMap(), 12);
                m15809d(r4);
                m14511i(moment);
                r4.m5740W();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m14513k(FeedCenterImageView feedCenterImageView, Moment moment, Integer num) {
        feedCenterImageView.m5748g0(moment, num.intValue(), this.f14526c, this.f14527d);
    }
}
