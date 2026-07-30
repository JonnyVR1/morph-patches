package p006l;

import com.p1.mobile.putong.core.data.Privilege;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Ll/oto$b;", "", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "", "isIncluded", "<init>", "(Lcom/p1/mobile/putong/core/data/Privilege;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/p1/mobile/putong/core/data/Privilege;", "()Lcom/p1/mobile/putong/core/data/Privilege;", "b", "Z", "()Z", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class oto$b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Privilege privilege;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean isIncluded;

    public oto$b(@NotNull Privilege privilege, boolean z) {
        privilege.getClass();
        this.privilege = privilege;
        this.isIncluded = z;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Privilege getPrivilege() {
        return this.privilege;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsIncluded() {
        return this.isIncluded;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof oto$b)) {
            return false;
        }
        oto$b oto_b = (oto$b) other;
        return this.privilege == oto_b.privilege && this.isIncluded == oto_b.isIncluded;
    }

    public int hashCode() {
        return (this.privilege.hashCode() * 31) + Boolean.hashCode(this.isIncluded);
    }

    @NotNull
    public String toString() {
        return "PrivilegeInfo(privilege=" + this.privilege + ", isIncluded=" + this.isIncluded + ")";
    }
}
