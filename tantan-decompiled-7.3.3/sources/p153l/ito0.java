package p153l;

import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.feed.VoiceShipLinkItemView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Ll/ito0;", "Ll/d3q;", "Lcom/p1/mobile/putong/live/base/arch/card/cardmodel/feed/VoiceShipLinkItemView;", "Ll/vpn0$a;", "itemData", "", "isWhiteTheme", "<init>", "(Ll/vpn0$a;Z)V", "", "o", "()I", "itemView", "", "H", "(Lcom/p1/mobile/putong/live/base/arch/card/cardmodel/feed/VoiceShipLinkItemView;)V", "Ll/vpn0$a;", "Z", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ito0 extends d3q<VoiceShipLinkItemView> {
    private final boolean isWhiteTheme;

    @NotNull
    private final vpn0.C20899a itemData;

    public ito0(@NotNull vpn0.C20899a c20899a, boolean z) {
        c20899a.getClass();
        this.itemData = c20899a;
        this.isWhiteTheme = z;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(@NotNull VoiceShipLinkItemView itemView) {
        itemView.getClass();
        super.mo71749u(itemView);
        itemView.m68650a(this.itemData, this.isWhiteTheme);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return vec0.f183725G;
    }
}
