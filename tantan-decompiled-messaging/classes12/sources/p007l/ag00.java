package p007l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVoteView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ag00 extends wf00<Moment> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.view.View, com.p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView, com.p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVoteView] */
    @Override // p007l.wf00
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo8538c(VLinear vLinear, Context context, Moment moment) {
        super.mo8538c(vLinear, context, moment);
        if (NullChecker.b(vLinear)) {
            Object objInflate = LayoutInflater.from(context).inflate(o6c0.f11173a1, (ViewGroup) null);
            if (objInflate instanceof FeedCenterVoteView) {
                ?? r5 = (FeedCenterVoteView) objInflate;
                r5.m5787X0(0, moment, new HashMap(), 12);
                r5.f3357k = "detail";
                r5.f3358l = true;
                vLinear.addView(r5);
                m15809d(r5);
            }
        }
    }
}
