package p007l;

import android.view.View;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView;
import l.e30;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class w7h implements k2i {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m15711b(View view) {
        if (view instanceof SimpleDraweeView) {
            ((SimpleDraweeView) view).getHierarchy().H(RoundingParams.c(t100.d(32.0f)));
        }
    }

    @Override // p007l.k2i
    /* JADX INFO: renamed from: a */
    public void mo11387a(FeedStateCardView feedStateCardView, BubbleInfo bubbleInfo) {
        feedStateCardView.f4193b.setVisibility(0);
        feedStateCardView.f4193b.m6901f(bubbleInfo.media.get(0), false);
        feedStateCardView.f4193b.setSuccessAttachCallback(new e30() { // from class: l.v7h
            public final void call(Object obj) {
                w7h.m15711b((View) obj);
            }
        });
    }
}
