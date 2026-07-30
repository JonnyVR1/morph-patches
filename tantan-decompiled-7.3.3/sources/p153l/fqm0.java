package p153l;

import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.view.tab.VoiceAuctionTabItemView;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\t¨\u0006\u001a"}, m88121d2 = {"Ll/fqm0;", "Ll/d3q;", "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/view/tab/VoiceAuctionTabItemView;", "Ll/dpm0;", OMSTemplateModeType.page, "<init>", "(Ll/dpm0;)V", "", "o", "()I", "itemView", "", "I", "(Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/view/tab/VoiceAuctionTabItemView;)V", "", "", "payloads", "J", "(Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/view/tab/VoiceAuctionTabItemView;Ljava/util/List;)V", "a", "Ll/dpm0;", "H", "()Ll/dpm0;", "b", "getPAY_LOAD_STATUS", "PAY_LOAD_STATUS", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class fqm0 extends d3q<VoiceAuctionTabItemView> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final dpm0 page;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int PAY_LOAD_STATUS;

    public fqm0(@NotNull dpm0 dpm0Var) {
        dpm0Var.getClass();
        this.page = dpm0Var;
        this.PAY_LOAD_STATUS = 1;
    }

    @NotNull
    /* JADX INFO: renamed from: H, reason: from getter */
    public final dpm0 getPage() {
        return this.page;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo71749u(@NotNull VoiceAuctionTabItemView itemView) {
        itemView.getClass();
        super.mo71749u(itemView);
        itemView.m79120d(this.page);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo71942v(@NotNull VoiceAuctionTabItemView itemView, @NotNull List<? extends Object> payloads) {
        itemView.getClass();
        payloads.getClass();
        super.mo71942v(itemView, payloads);
        if (jyb.m147479J(payloads)) {
            mo71749u(itemView);
            return;
        }
        Object obj = payloads.get(0);
        obj.getClass();
        if (((Integer) obj).intValue() == this.PAY_LOAD_STATUS) {
            itemView.m79120d(this.page);
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198819K7;
    }
}
