package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.FeedListTextWithCommentItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p147v.VLinear;

/* JADX INFO: loaded from: classes12.dex */
public class xf00 extends wf00<Moment> {
    @Override // p149l.wf00
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo96278c(VLinear vLinear, Context context, Moment moment) {
        super.mo96278c(vLinear, context, moment);
        if (NullChecker.m81304b(vLinear)) {
            View viewInflate = LayoutInflater.from(context).inflate(o6c0.f142175d1, (ViewGroup) null);
            if (viewInflate instanceof FeedListTextWithCommentItem) {
                FeedListTextWithCommentItem feedListTextWithCommentItem = (FeedListTextWithCommentItem) viewInflate;
                feedListTextWithCommentItem.f40859e.setPadding(wf00.f185998e, 0, t100.m186890d(14.0f), 0);
                feedListTextWithCommentItem.m63112k(moment, "", 0, new HashMap<>(), "p_user_moment_interactions_details_view");
                vLinear.addView(feedListTextWithCommentItem);
                xdl0.m208374f0(vLinear, t100.m186890d(16.0f));
            }
        }
    }
}
