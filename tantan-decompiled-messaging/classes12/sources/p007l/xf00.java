package p007l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.FeedListTextWithCommentItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.t100;
import l.xdl0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class xf00 extends wf00<Moment> {
    @Override // p007l.wf00
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo8538c(VLinear vLinear, Context context, Moment moment) {
        super.mo8538c(vLinear, context, moment);
        if (NullChecker.b(vLinear)) {
            View viewInflate = LayoutInflater.from(context).inflate(o6c0.f11194d1, (ViewGroup) null);
            if (viewInflate instanceof FeedListTextWithCommentItem) {
                FeedListTextWithCommentItem feedListTextWithCommentItem = (FeedListTextWithCommentItem) viewInflate;
                feedListTextWithCommentItem.f2320e.setPadding(wf00.f14523e, 0, t100.d(14.0f), 0);
                feedListTextWithCommentItem.m4128k(moment, "", 0, new HashMap<>(), "p_user_moment_interactions_details_view");
                vLinear.addView(feedListTextWithCommentItem);
                xdl0.f0(vLinear, t100.d(16.0f));
            }
        }
    }
}
