package p153l;

import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftUserInfoOfficialView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Ll/wnc0;", "Ll/i6t;", "Ll/oo2;", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/view/GiftUserInfoOfficialView;", "Ll/dum;", BaseSei.INFO, "giftUsersView", "<init>", "(Ll/dum;Lcom/p1/mobile/putong/live/livingroom/increment/gift/view/GiftUserInfoOfficialView;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveOfficialShowCurrentAnchorInfo;", "currentAnchorInfo", "", "J3", "(Lcom/p1/mobile/putong/live/base/data/BLiveOfficialShowCurrentAnchorInfo;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class wnc0 extends i6t<oo2, GiftUserInfoOfficialView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnc0(@Nullable dum<?> dumVar, @NotNull GiftUserInfoOfficialView giftUserInfoOfficialView) {
        super(dumVar);
        giftUserInfoOfficialView.getClass();
        mo52715C(giftUserInfoOfficialView);
    }

    /* JADX INFO: renamed from: J3 */
    public final void m207187J3(@NotNull BLiveOfficialShowCurrentAnchorInfo currentAnchorInfo) {
        currentAnchorInfo.getClass();
        GiftUserInfoOfficialView giftUserInfoOfficialView = (GiftUserInfoOfficialView) this.viewModel;
        String str = currentAnchorInfo.anchorId;
        str.getClass();
        String str2 = currentAnchorInfo.anchorName;
        str2.getClass();
        String str3 = currentAnchorInfo.anchorAvatar;
        str3.getClass();
        giftUserInfoOfficialView.m75715m0(str, str2, str3);
    }
}
