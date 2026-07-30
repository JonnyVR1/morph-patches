package p153l;

import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.feed.VoiceShipLinkCardView;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0014"}, m88121d2 = {"Ll/gto0;", "Ll/uxr;", "Lcom/p1/mobile/putong/live/base/arch/card/cardmodel/feed/VoiceShipLinkCardView;", "Ll/hk4;", "cardContext", "Ll/vxp;", "shipLinkCard", "<init>", "(Ll/hk4;Ll/vxp;)V", "", "q", "()I", "o", "itemView", "", "P", "(Lcom/p1/mobile/putong/live/base/arch/card/cardmodel/feed/VoiceShipLinkCardView;)V", "Ll/vxp;", "Companion", "a", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class gto0 extends uxr<VoiceShipLinkCardView> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final vxp shipLinkCard;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gto0(@NotNull hk4 hk4Var, @NotNull vxp vxpVar) {
        super(hk4Var);
        hk4Var.getClass();
        vxpVar.getClass();
        this.shipLinkCard = vxpVar;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: O */
    public static final gto0 m132251O(@NotNull hk4 hk4Var, @NotNull vxp vxpVar) {
        return INSTANCE.m132253a(hk4Var, vxpVar);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo71749u(@Nullable VoiceShipLinkCardView itemView) {
        super.mo71749u(itemView);
        if (itemView != null) {
            vpn0 vpn0VarM203865a = this.shipLinkCard.m203865a();
            vpn0VarM203865a.getClass();
            itemView.m68649e(vpn0VarM203865a, this.cardContext.m135616b(), this.shipLinkCard.m203866b());
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return vec0.f183747o;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return 6;
    }

    /* JADX INFO: renamed from: l.gto0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/gto0$a;", "", "<init>", "()V", "Ll/hk4;", "cardContext", "Ll/vxp;", "cardData", "Ll/gto0;", "a", "(Ll/hk4;Ll/vxp;)Ll/gto0;", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final gto0 m132253a(@NotNull hk4 cardContext, @NotNull vxp cardData) {
            cardContext.getClass();
            cardData.getClass();
            return new gto0(cardContext, cardData);
        }

        private Companion() {
        }
    }
}
