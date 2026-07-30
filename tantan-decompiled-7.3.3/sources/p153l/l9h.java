package p153l;

import android.view.View;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView;

/* JADX INFO: loaded from: classes13.dex */
public class l9h implements z3i {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m153426b(View view) {
        if (view instanceof SimpleDraweeView) {
            ((SimpleDraweeView) view).getHierarchy().m207045H(RoundingParams.m8303c(qa00.m175859d(32.0f)));
        }
    }

    @Override // p153l.z3i
    /* JADX INFO: renamed from: a */
    public void mo153427a(FeedStateCardView feedStateCardView, BubbleInfo bubbleInfo) {
        feedStateCardView.f43580b.setVisibility(0);
        feedStateCardView.f43580b.m66938f(bubbleInfo.media.get(0), false);
        feedStateCardView.f43580b.setSuccessAttachCallback(new y20() { // from class: l.k9h
            @Override // p153l.y20
            public final void call(Object obj) {
                l9h.m153426b((View) obj);
            }
        });
    }
}
