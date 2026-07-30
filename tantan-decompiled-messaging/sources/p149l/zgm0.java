package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionRelation;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationchoose.RelationPageItemView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u0011¨\u0006&"}, m87232d2 = {"Ll/zgm0;", "Ll/d1q;", "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationchoose/RelationPageItemView;", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelation;", "relation", "Ll/e30;", "agreeAction", "Ll/atk;", "presenter", "<init>", "(Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelation;Ll/e30;Ll/atk;)V", "", "o", "()I", "itemView", "", "J", "(Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationchoose/RelationPageItemView;)V", "L", "()V", "K", "a", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelation;", "I", "()Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelation;", "b", "Ll/e30;", "getAgreeAction", "()Ll/e30;", "c", "Ll/atk;", "H", "()Ll/atk;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationchoose/RelationPageItemView;", "getItemView", "()Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationchoose/RelationPageItemView;", "setItemView", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class zgm0 extends d1q<RelationPageItemView> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final BLiveAuctionRelation relation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final e30<zgm0> agreeAction;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final atk<?> presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public RelationPageItemView itemView;

    public zgm0(@NotNull BLiveAuctionRelation bLiveAuctionRelation, @Nullable e30<zgm0> e30Var, @NotNull atk<?> atkVar) {
        bLiveAuctionRelation.getClass();
        atkVar.getClass();
        this.relation = bLiveAuctionRelation;
        this.agreeAction = e30Var;
        this.presenter = atkVar;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final atk<?> m218661H() {
        return this.presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: I, reason: from getter */
    public final BLiveAuctionRelation getRelation() {
        return this.relation;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo70566u(@NotNull RelationPageItemView itemView) {
        itemView.getClass();
        super.mo70566u(itemView);
        this.itemView = itemView;
        itemView.m77852c(this);
    }

    /* JADX INFO: renamed from: K */
    public final void m218664K() {
        RelationPageItemView relationPageItemView = this.itemView;
        if (relationPageItemView != null) {
            relationPageItemView.m77853d();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m218665L() {
        RelationPageItemView relationPageItemView = this.itemView;
        if (relationPageItemView != null) {
            relationPageItemView.m77854e();
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168565w7;
    }
}
