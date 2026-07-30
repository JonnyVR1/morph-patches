package p149l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionQueueInfo;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.dialog.queue.view.LiveVoiceAuctionQueueItem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0013\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, m87232d2 = {"Ll/bgm0;", "Ll/d1q;", "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/queue/view/LiveVoiceAuctionQueueItem;", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionQueueInfo;", "queueInfo", "Ll/f30;", "agreeAction", "Ll/e30;", "avatarAction", "<init>", "(Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveAuctionQueueInfo;Ll/f30;Ll/e30;)V", "", "o", "()I", "itemView", "", "K", "(Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/queue/view/LiveVoiceAuctionQueueItem;)V", "a", "Ljava/lang/String;", "I", "()Ljava/lang/String;", "b", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionQueueInfo;", "J", "()Lcom/p1/mobile/putong/live/base/data/BLiveAuctionQueueInfo;", "c", "Ll/f30;", "H", "()Ll/f30;", Constants.INAPP_DATA_TAG, "Ll/e30;", "getAvatarAction", "()Ll/e30;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class bgm0 extends d1q<LiveVoiceAuctionQueueItem> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final BLiveAuctionQueueInfo queueInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final f30<String, BLiveAuctionQueueInfo> agreeAction;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final e30<String> avatarAction;

    public bgm0(@NotNull String str, @NotNull BLiveAuctionQueueInfo bLiveAuctionQueueInfo, @Nullable f30<String, BLiveAuctionQueueInfo> f30Var, @Nullable e30<String> e30Var) {
        str.getClass();
        bLiveAuctionQueueInfo.getClass();
        this.name = str;
        this.queueInfo = bLiveAuctionQueueInfo;
        this.agreeAction = f30Var;
        this.avatarAction = e30Var;
    }

    @Nullable
    /* JADX INFO: renamed from: H */
    public final f30<String, BLiveAuctionQueueInfo> m101668H() {
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

    @Override // p149l.d1q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo70566u(@NotNull LiveVoiceAuctionQueueItem itemView) {
        itemView.getClass();
        super.mo70566u(itemView);
        itemView.m77849h(this);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168039G7;
    }
}
