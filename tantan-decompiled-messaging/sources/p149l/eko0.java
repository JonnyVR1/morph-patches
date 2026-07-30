package p149l;

import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.feed.VoiceShipLinkItemView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0012"}, m87232d2 = {"Ll/eko0;", "Ll/d1q;", "Lcom/p1/mobile/putong/live/base/arch/card/cardmodel/feed/VoiceShipLinkItemView;", "Ll/rgn0$a;", "itemData", "", "isWhiteTheme", "<init>", "(Ll/rgn0$a;Z)V", "", "o", "()I", "itemView", "", "H", "(Lcom/p1/mobile/putong/live/base/arch/card/cardmodel/feed/VoiceShipLinkItemView;)V", "Ll/rgn0$a;", "Z", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class eko0 extends d1q<VoiceShipLinkItemView> {
    private final boolean isWhiteTheme;

    @NotNull
    private final rgn0.C19695a itemData;

    public eko0(@NotNull rgn0.C19695a c19695a, boolean z) {
        c19695a.getClass();
        this.itemData = c19695a;
        this.isWhiteTheme = z;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(@NotNull VoiceShipLinkItemView itemView) {
        itemView.getClass();
        super.mo70566u(itemView);
        itemView.m67467a(this.itemData, this.isWhiteTheme);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return q6c0.f152868G;
    }
}
