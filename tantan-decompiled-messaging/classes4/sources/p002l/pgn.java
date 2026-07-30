package p002l;

import com.p000p1.mobile.putong.live.livingroom.intl.common.bottom.gamepanel.IntlGameBoardItemView;
import com.p1.mobile.putong.live.base.data.BLiveGamePanelButtons;
import kotlin.Metadata;
import l.d1q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ll/pgn;", "Ll/d1q;", "Lcom/p1/mobile/putong/live/livingroom/intl/common/bottom/gamepanel/IntlGameBoardItemView;", "Lcom/p1/mobile/putong/live/base/data/BLiveGamePanelButtons;", "itemData", "<init>", "(Lcom/p1/mobile/putong/live/base/data/BLiveGamePanelButtons;)V", "", "o", "()I", "itemView", "", "H", "(Lcom/p1/mobile/putong/live/livingroom/intl/common/bottom/gamepanel/IntlGameBoardItemView;)V", "a", "Lcom/p1/mobile/putong/live/base/data/BLiveGamePanelButtons;", "getItemData", "()Lcom/p1/mobile/putong/live/base/data/BLiveGamePanelButtons;", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class pgn extends d1q<IntlGameBoardItemView> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final BLiveGamePanelButtons itemData;

    public pgn(@NotNull BLiveGamePanelButtons bLiveGamePanelButtons) {
        bLiveGamePanelButtons.getClass();
        this.itemData = bLiveGamePanelButtons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m20280u(@Nullable IntlGameBoardItemView itemView) {
        super.u(itemView);
        if (itemView != 0) {
            itemView.m8854i0(this.itemData);
        }
    }

    /* JADX INFO: renamed from: o */
    public int m20279o() {
        return t6c0.f20030u2;
    }
}
