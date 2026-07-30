package p002l;

import com.p000p1.mobile.putong.live.livingroom.increment.blacklist.LiveBlackListItemView;
import com.p1.mobile.putong.live.base.data.BLiveBlackListItem;
import kotlin.Metadata;
import l.d1q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ll/xxr;", "Ll/d1q;", "Lcom/p1/mobile/putong/live/livingroom/increment/blacklist/LiveBlackListItemView;", "Lcom/p1/mobile/putong/live/base/data/BLiveBlackListItem;", "item", "Ll/bxr;", "listener", "<init>", "(Lcom/p1/mobile/putong/live/base/data/BLiveBlackListItem;Ll/bxr;)V", "", "o", "()I", "itemView", "", "J", "(Lcom/p1/mobile/putong/live/livingroom/increment/blacklist/LiveBlackListItemView;)V", "a", "Lcom/p1/mobile/putong/live/base/data/BLiveBlackListItem;", "H", "()Lcom/p1/mobile/putong/live/base/data/BLiveBlackListItem;", "b", "Ll/bxr;", "I", "()Ll/bxr;", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class xxr extends d1q<LiveBlackListItemView> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final BLiveBlackListItem item;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final bxr listener;

    public xxr(@NotNull BLiveBlackListItem bLiveBlackListItem, @NotNull bxr bxrVar) {
        bLiveBlackListItem.getClass();
        bxrVar.getClass();
        this.item = bLiveBlackListItem;
        this.listener = bxrVar;
    }

    @NotNull
    /* JADX INFO: renamed from: H, reason: from getter */
    public final BLiveBlackListItem getItem() {
        return this.item;
    }

    @NotNull
    /* JADX INFO: renamed from: I, reason: from getter */
    public final bxr getListener() {
        return this.listener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void m26180u(@NotNull LiveBlackListItemView itemView) {
        itemView.getClass();
        super.u(itemView);
        itemView.m6889j0(this);
    }

    /* JADX INFO: renamed from: o */
    public int m26179o() {
        return t6c0.f19860h1;
    }
}
