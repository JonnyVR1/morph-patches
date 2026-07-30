package p153l;

import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionLeaderboardItem;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.leaderboard.LiveVoiceAuctionLeaderboardListItem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m88121d2 = {"Ll/kom0;", "Ll/d3q;", "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/leaderboard/LiveVoiceAuctionLeaderboardListItem;", "", "type", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionLeaderboardItem;", Item.TYPE, "<init>", "(Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveAuctionLeaderboardItem;)V", "", "o", "()I", "itemView", "", "J", "(Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/leaderboard/LiveVoiceAuctionLeaderboardListItem;)V", "a", "Ljava/lang/String;", "I", "()Ljava/lang/String;", "b", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionLeaderboardItem;", "H", "()Lcom/p1/mobile/putong/live/base/data/BLiveAuctionLeaderboardItem;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class kom0 extends d3q<LiveVoiceAuctionLeaderboardListItem> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final BLiveAuctionLeaderboardItem item;

    public kom0(@NotNull String str, @NotNull BLiveAuctionLeaderboardItem bLiveAuctionLeaderboardItem) {
        str.getClass();
        bLiveAuctionLeaderboardItem.getClass();
        this.type = str;
        this.item = bLiveAuctionLeaderboardItem;
    }

    @NotNull
    /* JADX INFO: renamed from: H, reason: from getter */
    public final BLiveAuctionLeaderboardItem getItem() {
        return this.item;
    }

    @NotNull
    /* JADX INFO: renamed from: I, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo71749u(@NotNull LiveVoiceAuctionLeaderboardListItem itemView) {
        itemView.getClass();
        super.mo71749u(itemView);
        itemView.m79016d(this);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198711B7;
    }
}
