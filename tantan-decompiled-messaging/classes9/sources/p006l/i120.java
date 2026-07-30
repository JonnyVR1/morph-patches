package p006l;

import com.p1.mobile.putong.data.Visitor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001a"}, d2 = {"Ll/i120;", "", "", "type", "Lcom/p1/mobile/putong/data/Visitor;", "myVisitors", "<init>", "(ILcom/p1/mobile/putong/data/Visitor;)V", "", "e", "()Z", "d", "c", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lcom/p1/mobile/putong/data/Visitor;", "()Lcom/p1/mobile/putong/data/Visitor;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i120 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Visitor myVisitors;

    public i120(int i, @Nullable Visitor visitor) {
        this.type = i;
        this.myVisitors = visitor;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Visitor getMyVisitors() {
        return this.myVisitors;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m16457c() {
        return this.type == 3;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m16458d() {
        return this.type == 2;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m16459e() {
        return this.type == 1;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof i120)) {
            return false;
        }
        i120 i120Var = (i120) other;
        return this.type == i120Var.type && Intrinsics.d(this.myVisitors, i120Var.myVisitors);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.type) * 31;
        Visitor visitor = this.myVisitors;
        return iHashCode + (visitor == null ? 0 : visitor.hashCode());
    }

    @NotNull
    public String toString() {
        return "MyVisitorItem(type=" + this.type + ", myVisitors=" + this.myVisitors + ")";
    }
}
