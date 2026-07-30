package p149l;

import android.view.View;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView;

/* JADX INFO: loaded from: classes12.dex */
public class w7h implements k2i {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m202015b(View view) {
        if (view instanceof SimpleDraweeView) {
            ((SimpleDraweeView) view).getHierarchy().m112053H(RoundingParams.m8249c(t100.m186890d(32.0f)));
        }
    }

    @Override // p149l.k2i
    /* JADX INFO: renamed from: a */
    public void mo144304a(FeedStateCardView feedStateCardView, BubbleInfo bubbleInfo) {
        feedStateCardView.f42732b.setVisibility(0);
        feedStateCardView.f42732b.m65755f(bubbleInfo.media.get(0), false);
        feedStateCardView.f42732b.setSuccessAttachCallback(new e30() { // from class: l.v7h
            @Override // p149l.e30
            public final void call(Object obj) {
                w7h.m202015b((View) obj);
            }
        });
    }
}
