package p007l;

import android.view.View;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class z9i implements k2i {
    @Override // p007l.k2i
    /* JADX INFO: renamed from: a */
    public void mo11387a(final FeedStateCardView feedStateCardView, BubbleInfo bubbleInfo) {
        exq.m9962b(feedStateCardView.f4193b, 32.0f);
        feedStateCardView.f4193b.m6901f(bubbleInfo.media.get(0), false);
        feedStateCardView.f4196e.setOnClickListener(new View.OnClickListener() { // from class: l.y9i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                feedStateCardView.m6665t0();
            }
        });
        feedStateCardView.f4196e.setVisibility(0);
        feedStateCardView.f4193b.setVisibility(0);
        feedStateCardView.f4197f.setGravity(17);
    }
}
