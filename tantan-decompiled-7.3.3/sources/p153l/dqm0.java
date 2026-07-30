package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionRelation;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationchoose.RelationPageItemView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u0011¨\u0006&"}, m88121d2 = {"Ll/dqm0;", "Ll/d3q;", "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationchoose/RelationPageItemView;", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelation;", "relation", "Ll/y20;", "agreeAction", "Ll/qvk;", "presenter", "<init>", "(Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelation;Ll/y20;Ll/qvk;)V", "", "o", "()I", "itemView", "", "J", "(Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationchoose/RelationPageItemView;)V", "L", "()V", "K", "a", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelation;", "I", "()Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelation;", "b", "Ll/y20;", "getAgreeAction", "()Ll/y20;", "c", "Ll/qvk;", "H", "()Ll/qvk;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationchoose/RelationPageItemView;", "getItemView", "()Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationchoose/RelationPageItemView;", "setItemView", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class dqm0 extends d3q<RelationPageItemView> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final BLiveAuctionRelation relation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final y20<dqm0> agreeAction;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final qvk<?> presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public RelationPageItemView itemView;

    public dqm0(@NotNull BLiveAuctionRelation bLiveAuctionRelation, @Nullable y20<dqm0> y20Var, @NotNull qvk<?> qvkVar) {
        bLiveAuctionRelation.getClass();
        qvkVar.getClass();
        this.relation = bLiveAuctionRelation;
        this.agreeAction = y20Var;
        this.presenter = qvkVar;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final qvk<?> m117551H() {
        return this.presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: I, reason: from getter */
    public final BLiveAuctionRelation getRelation() {
        return this.relation;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo71749u(@NotNull RelationPageItemView itemView) {
        itemView.getClass();
        super.mo71749u(itemView);
        this.itemView = itemView;
        itemView.m79035c(this);
    }

    /* JADX INFO: renamed from: K */
    public final void m117554K() {
        RelationPageItemView relationPageItemView = this.itemView;
        if (relationPageItemView != null) {
            relationPageItemView.m79036d();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m117555L() {
        RelationPageItemView relationPageItemView = this.itemView;
        if (relationPageItemView != null) {
            relationPageItemView.m79037e();
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199297w7;
    }
}
