package p149l;

import android.view.View;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView;

/* JADX INFO: loaded from: classes12.dex */
public class z9i implements k2i {
    @Override // p149l.k2i
    /* JADX INFO: renamed from: a */
    public void mo144304a(final FeedStateCardView feedStateCardView, BubbleInfo bubbleInfo) {
        exq.m118693b(feedStateCardView.f42732b, 32.0f);
        feedStateCardView.f42732b.m65755f(bubbleInfo.media.get(0), false);
        feedStateCardView.f42735e.setOnClickListener(new View.OnClickListener() { // from class: l.y9i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                feedStateCardView.m65538t0();
            }
        });
        feedStateCardView.f42735e.setVisibility(0);
        feedStateCardView.f42732b.setVisibility(0);
        feedStateCardView.f42736f.setGravity(17);
    }
}
