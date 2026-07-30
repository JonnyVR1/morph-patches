package p153l;

import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m88121d2 = {"Ll/mcg0;", "Ll/szo;", "", "title", SocialConstants.PARAM_APP_DESC, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "", "getItemType", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "b", "getDesc", "c", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final /* data */ class mcg0 implements szo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String desc;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType type;

    public mcg0(@NotNull String str, @NotNull String str2, @NotNull PurchaseType purchaseType) {
        str.getClass();
        str2.getClass();
        purchaseType.getClass();
        this.title = str;
        this.desc = str2;
        this.type = purchaseType;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof mcg0)) {
            return false;
        }
        mcg0 mcg0Var = (mcg0) other;
        return Intrinsics.m88377d(this.title, mcg0Var.title) && Intrinsics.m88377d(this.desc, mcg0Var.desc) && this.type == mcg0Var.type;
    }

    @Override // p153l.szo
    public int getItemType() {
        return 6;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.desc.hashCode()) * 31) + this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return "SubscriptionData(title=" + this.title + ", desc=" + this.desc + ", type=" + this.type + ")";
    }
}
