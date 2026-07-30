package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveDiscountSendGiftItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Ll/g3e;", "", "", "Lcom/p1/mobile/putong/live/base/data/BLiveDiscountSendGiftItem;", "discounts", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final /* data */ class g3e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<BLiveDiscountSendGiftItem> discounts;

    /* JADX WARN: Multi-variable type inference failed */
    public g3e(@NotNull List<? extends BLiveDiscountSendGiftItem> list) {
        list.getClass();
        this.discounts = list;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<BLiveDiscountSendGiftItem> m128725a() {
        return this.discounts;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof g3e) && Intrinsics.m88377d(this.discounts, ((g3e) other).discounts);
    }

    public int hashCode() {
        return this.discounts.hashCode();
    }

    @NotNull
    public String toString() {
        return "DiscountInfo(discounts=" + this.discounts + ")";
    }
}
