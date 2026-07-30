package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserProfileMiddleCards;
import com.p051p1.mobile.putong.live.livingroom.virtual.userCard.middle.VoiceVirtualUserCardMiddleItemView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m88121d2 = {"Ll/sa00;", "Ll/d3q;", "Lcom/p1/mobile/putong/live/livingroom/virtual/userCard/middle/VoiceVirtualUserCardMiddleItemView;", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserProfileMiddleCards;", "middleCard", "Ll/mkp0;", "presenter", "", "userId", "<init>", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserProfileMiddleCards;Ll/mkp0;Ljava/lang/String;)V", "", "o", "()I", "itemView", "", "I", "(Lcom/p1/mobile/putong/live/livingroom/virtual/userCard/middle/VoiceVirtualUserCardMiddleItemView;)V", "a", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserProfileMiddleCards;", "H", "()Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserProfileMiddleCards;", "b", "Ll/mkp0;", "getPresenter", "()Ll/mkp0;", "c", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class sa00 extends d3q<VoiceVirtualUserCardMiddleItemView> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final BLiveVoiceUserProfileMiddleCards middleCard;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final mkp0<?> presenter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String userId;

    public sa00(@NotNull BLiveVoiceUserProfileMiddleCards bLiveVoiceUserProfileMiddleCards, @NotNull mkp0<?> mkp0Var, @NotNull String str) {
        bLiveVoiceUserProfileMiddleCards.getClass();
        mkp0Var.getClass();
        str.getClass();
        this.middleCard = bLiveVoiceUserProfileMiddleCards;
        this.presenter = mkp0Var;
        this.userId = str;
    }

    @NotNull
    /* JADX INFO: renamed from: H, reason: from getter */
    public final BLiveVoiceUserProfileMiddleCards getMiddleCard() {
        return this.middleCard;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo71749u(@NotNull VoiceVirtualUserCardMiddleItemView itemView) {
        itemView.getClass();
        super.mo71749u(itemView);
        itemView.m78753n0(this.middleCard, this.presenter, this.userId);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199180n7;
    }
}
