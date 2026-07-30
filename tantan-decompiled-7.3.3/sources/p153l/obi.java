package p153l;

import android.view.View;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView;

/* JADX INFO: loaded from: classes13.dex */
public class obi implements z3i {
    @Override // p153l.z3i
    /* JADX INFO: renamed from: a */
    public void mo153427a(final FeedStateCardView feedStateCardView, BubbleInfo bubbleInfo) {
        ezq.m123397b(feedStateCardView.f43580b, 32.0f);
        feedStateCardView.f43580b.m66938f(bubbleInfo.media.get(0), false);
        feedStateCardView.f43583e.setOnClickListener(new View.OnClickListener() { // from class: l.nbi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                feedStateCardView.m66721t0();
            }
        });
        feedStateCardView.f43583e.setVisibility(0);
        feedStateCardView.f43580b.setVisibility(0);
        feedStateCardView.f43584f.setGravity(17);
    }
}
