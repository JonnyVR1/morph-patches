package p153l;

import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionLeaderboardItem;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.leaderboard.LiveVoiceAuctionLeaderboardListTimelineItem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Ll/mom0;", "Ll/d3q;", "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/leaderboard/LiveVoiceAuctionLeaderboardListTimelineItem;", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionLeaderboardItem;", Item.TYPE, "<init>", "(Lcom/p1/mobile/putong/live/base/data/BLiveAuctionLeaderboardItem;)V", "", "o", "()I", "itemView", "", "I", "(Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/leaderboard/LiveVoiceAuctionLeaderboardListTimelineItem;)V", "a", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionLeaderboardItem;", "H", "()Lcom/p1/mobile/putong/live/base/data/BLiveAuctionLeaderboardItem;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class mom0 extends d3q<LiveVoiceAuctionLeaderboardListTimelineItem> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final BLiveAuctionLeaderboardItem item;

    public mom0(@NotNull BLiveAuctionLeaderboardItem bLiveAuctionLeaderboardItem) {
        bLiveAuctionLeaderboardItem.getClass();
        this.item = bLiveAuctionLeaderboardItem;
    }

    @NotNull
    /* JADX INFO: renamed from: H, reason: from getter */
    public final BLiveAuctionLeaderboardItem getItem() {
        return this.item;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo71749u(@NotNull LiveVoiceAuctionLeaderboardListTimelineItem itemView) {
        itemView.getClass();
        super.mo71749u(itemView);
        itemView.m79025b(this);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198747E7;
    }
}
