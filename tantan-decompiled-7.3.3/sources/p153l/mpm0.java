package p153l;

import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionRelationCard;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationlist.view.LiveVoiceAuctionRelationListItem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, m88121d2 = {"Ll/mpm0;", "Ll/d3q;", "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionRelationListItem;", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelationCard;", "relation", "", "position", "", "tabName", "<init>", "(Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelationCard;ILjava/lang/String;)V", "o", "()I", "itemView", "", "K", "(Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionRelationListItem;)V", "Landroid/view/View$OnLongClickListener;", "onLongClickListener", "L", "(Landroid/view/View$OnLongClickListener;)V", "a", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelationCard;", "I", "()Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelationCard;", "b", "H", "c", "Ljava/lang/String;", "J", "()Ljava/lang/String;", Constants.INAPP_DATA_TAG, "Landroid/view/View$OnLongClickListener;", "longClickListener", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class mpm0 extends d3q<LiveVoiceAuctionRelationListItem> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final BLiveAuctionRelationCard relation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int position;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String tabName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public View.OnLongClickListener longClickListener;

    public mpm0(@NotNull BLiveAuctionRelationCard bLiveAuctionRelationCard, int i, @NotNull String str) {
        bLiveAuctionRelationCard.getClass();
        str.getClass();
        this.relation = bLiveAuctionRelationCard;
        this.position = i;
        this.tabName = str;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    @NotNull
    /* JADX INFO: renamed from: I, reason: from getter */
    public final BLiveAuctionRelationCard getRelation() {
        return this.relation;
    }

    @NotNull
    /* JADX INFO: renamed from: J, reason: from getter */
    public final String getTabName() {
        return this.tabName;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo71749u(@NotNull LiveVoiceAuctionRelationListItem itemView) {
        itemView.getClass();
        super.mo71749u(itemView);
        itemView.m79050d(this);
        itemView.setOnLongClickListener(this.longClickListener);
    }

    /* JADX INFO: renamed from: L */
    public final void m159378L(@NotNull View.OnLongClickListener onLongClickListener) {
        onLongClickListener.getClass();
        this.longClickListener = onLongClickListener;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198807J7;
    }
}
