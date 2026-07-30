package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVoiceUserProfileMiddleCards;
import com.p046p1.mobile.putong.live.livingroom.virtual.userCard.middle.VoiceVirtualUserCardMiddleItemView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m87232d2 = {"Ll/v100;", "Ll/d1q;", "Lcom/p1/mobile/putong/live/livingroom/virtual/userCard/middle/VoiceVirtualUserCardMiddleItemView;", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserProfileMiddleCards;", "middleCard", "Ll/ibp0;", "presenter", "", "userId", "<init>", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserProfileMiddleCards;Ll/ibp0;Ljava/lang/String;)V", "", "o", "()I", "itemView", "", "I", "(Lcom/p1/mobile/putong/live/livingroom/virtual/userCard/middle/VoiceVirtualUserCardMiddleItemView;)V", "a", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserProfileMiddleCards;", "H", "()Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserProfileMiddleCards;", "b", "Ll/ibp0;", "getPresenter", "()Ll/ibp0;", "c", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class v100 extends d1q<VoiceVirtualUserCardMiddleItemView> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final BLiveVoiceUserProfileMiddleCards middleCard;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ibp0<?> presenter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String userId;

    public v100(@NotNull BLiveVoiceUserProfileMiddleCards bLiveVoiceUserProfileMiddleCards, @NotNull ibp0<?> ibp0Var, @NotNull String str) {
        bLiveVoiceUserProfileMiddleCards.getClass();
        ibp0Var.getClass();
        str.getClass();
        this.middleCard = bLiveVoiceUserProfileMiddleCards;
        this.presenter = ibp0Var;
        this.userId = str;
    }

    @NotNull
    /* JADX INFO: renamed from: H, reason: from getter */
    public final BLiveVoiceUserProfileMiddleCards getMiddleCard() {
        return this.middleCard;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo70566u(@NotNull VoiceVirtualUserCardMiddleItemView itemView) {
        itemView.getClass();
        super.mo70566u(itemView);
        itemView.m77570n0(this.middleCard, this.presenter, this.userId);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168448n7;
    }
}
