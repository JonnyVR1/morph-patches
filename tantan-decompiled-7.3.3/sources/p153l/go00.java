package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.FeedListTextWithCommentItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p151v.VLinear;

/* JADX INFO: loaded from: classes13.dex */
public class go00 extends fo00<Moment> {
    @Override // p153l.fo00
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo99052c(VLinear vLinear, Context context, Moment moment) {
        super.mo99052c(vLinear, context, moment);
        if (NullChecker.m82487b(vLinear)) {
            View viewInflate = LayoutInflater.from(context).inflate(tec0.f173644d1, (ViewGroup) null);
            if (viewInflate instanceof FeedListTextWithCommentItem) {
                FeedListTextWithCommentItem feedListTextWithCommentItem = (FeedListTextWithCommentItem) viewInflate;
                feedListTextWithCommentItem.f41707e.setPadding(fo00.f99996e, 0, qa00.m175859d(14.0f), 0);
                feedListTextWithCommentItem.m64295k(moment, "", 0, new HashMap<>(), "p_user_moment_interactions_details_view");
                vLinear.addView(feedListTextWithCommentItem);
                bnl0.m105554f0(vLinear, qa00.m175859d(16.0f));
            }
        }
    }
}
