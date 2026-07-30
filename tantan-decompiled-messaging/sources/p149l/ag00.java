package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVoteView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p147v.VLinear;

/* JADX INFO: loaded from: classes12.dex */
public class ag00 extends wf00<Moment> {
    @Override // p149l.wf00
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo96278c(VLinear vLinear, Context context, Moment moment) {
        super.mo96278c(vLinear, context, moment);
        if (NullChecker.m81304b(vLinear)) {
            View viewInflate = LayoutInflater.from(context).inflate(o6c0.f142154a1, (ViewGroup) null);
            if (viewInflate instanceof FeedCenterVoteView) {
                FeedCenterVoteView feedCenterVoteView = (FeedCenterVoteView) viewInflate;
                feedCenterVoteView.m64693X0(0, moment, new HashMap<>(), 12);
                feedCenterVoteView.f41896k = "detail";
                feedCenterVoteView.f41897l = true;
                vLinear.addView(feedCenterVoteView);
                m202941d(feedCenterVoteView);
            }
        }
    }
}
