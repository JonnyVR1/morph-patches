package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\r\u0010\u0014¨\u0006\u0016"}, m88121d2 = {"Ll/f1k0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ll/jjs;", "a", "Ll/jjs;", "b", "()Ll/jjs;", "itemModel", "Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;", "Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;", "()Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;", "brief", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final /* data */ class f1k0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final jjs itemModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final BLiveGivenGiftBrief brief;

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BLiveGivenGiftBrief getBrief() {
        return this.brief;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final jjs getItemModel() {
        return this.itemModel;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof f1k0)) {
            return false;
        }
        f1k0 f1k0Var = (f1k0) other;
        return Intrinsics.m88377d(this.itemModel, f1k0Var.itemModel) && Intrinsics.m88377d(this.brief, f1k0Var.brief);
    }

    public int hashCode() {
        return (this.itemModel.hashCode() * 31) + this.brief.hashCode();
    }

    @NotNull
    public String toString() {
        return "UpdateGiftModelInfo(itemModel=" + this.itemModel + ", brief=" + this.brief + ")";
    }
}
