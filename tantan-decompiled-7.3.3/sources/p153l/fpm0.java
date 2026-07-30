package p153l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionQueueInfo;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.queue.view.LiveVoiceAuctionQueueItem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0013\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, m88121d2 = {"Ll/fpm0;", "Ll/d3q;", "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/queue/view/LiveVoiceAuctionQueueItem;", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionQueueInfo;", "queueInfo", "Ll/z20;", "agreeAction", "Ll/y20;", "avatarAction", "<init>", "(Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveAuctionQueueInfo;Ll/z20;Ll/y20;)V", "", "o", "()I", "itemView", "", "K", "(Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/queue/view/LiveVoiceAuctionQueueItem;)V", "a", "Ljava/lang/String;", "I", "()Ljava/lang/String;", "b", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionQueueInfo;", "J", "()Lcom/p1/mobile/putong/live/base/data/BLiveAuctionQueueInfo;", "c", "Ll/z20;", "H", "()Ll/z20;", Constants.INAPP_DATA_TAG, "Ll/y20;", "getAvatarAction", "()Ll/y20;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class fpm0 extends d3q<LiveVoiceAuctionQueueItem> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final BLiveAuctionQueueInfo queueInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final z20<String, BLiveAuctionQueueInfo> agreeAction;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final y20<String> avatarAction;

    public fpm0(@NotNull String str, @NotNull BLiveAuctionQueueInfo bLiveAuctionQueueInfo, @Nullable z20<String, BLiveAuctionQueueInfo> z20Var, @Nullable y20<String> y20Var) {
        str.getClass();
        bLiveAuctionQueueInfo.getClass();
        this.name = str;
        this.queueInfo = bLiveAuctionQueueInfo;
        this.agreeAction = z20Var;
        this.avatarAction = y20Var;
    }

    @Nullable
    /* JADX INFO: renamed from: H */
    public final z20<String, BLiveAuctionQueueInfo> m126697H() {
        return this.agreeAction;
    }

    @NotNull
    /* JADX INFO: renamed from: I, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: J, reason: from getter */
    public final BLiveAuctionQueueInfo getQueueInfo() {
        return this.queueInfo;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo71749u(@NotNull LiveVoiceAuctionQueueItem itemView) {
        itemView.getClass();
        super.mo71749u(itemView);
        itemView.m79032h(this);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198771G7;
    }
}
