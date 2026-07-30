package p149l;

import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.feed.VoiceShipLinkCardView;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0014"}, m87232d2 = {"Ll/cko0;", "Ll/tvr;", "Lcom/p1/mobile/putong/live/base/arch/card/cardmodel/feed/VoiceShipLinkCardView;", "Ll/ij4;", "cardContext", "Ll/vvp;", "shipLinkCard", "<init>", "(Ll/ij4;Ll/vvp;)V", "", "q", "()I", "o", "itemView", "", "P", "(Lcom/p1/mobile/putong/live/base/arch/card/cardmodel/feed/VoiceShipLinkCardView;)V", "Ll/vvp;", "Companion", "a", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class cko0 extends tvr<VoiceShipLinkCardView> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final vvp shipLinkCard;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cko0(@NotNull ij4 ij4Var, @NotNull vvp vvpVar) {
        super(ij4Var);
        ij4Var.getClass();
        vvpVar.getClass();
        this.shipLinkCard = vvpVar;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: O */
    public static final cko0 m107421O(@NotNull ij4 ij4Var, @NotNull vvp vvpVar) {
        return INSTANCE.m107423a(ij4Var, vvpVar);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo70566u(@Nullable VoiceShipLinkCardView itemView) {
        super.mo70566u(itemView);
        if (itemView != null) {
            rgn0 rgn0VarM200195a = this.shipLinkCard.m200195a();
            rgn0VarM200195a.getClass();
            itemView.m67466e(rgn0VarM200195a, this.cardContext.m136505b(), this.shipLinkCard.m200196b());
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return q6c0.f152890o;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: q */
    public int mo95844q() {
        return 6;
    }

    /* JADX INFO: renamed from: l.cko0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Ll/cko0$a;", "", "<init>", "()V", "Ll/ij4;", "cardContext", "Ll/vvp;", "cardData", "Ll/cko0;", "a", "(Ll/ij4;Ll/vvp;)Ll/cko0;", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final cko0 m107423a(@NotNull ij4 cardContext, @NotNull vvp cardData) {
            cardContext.getClass();
            cardData.getClass();
            return new cko0(cardContext, cardData);
        }

        private Companion() {
        }
    }
}
