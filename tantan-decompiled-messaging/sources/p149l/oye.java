package p149l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m87232d2 = {"Ll/oye;", "Ll/nrm;", "", "isActive", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "a", "Z", "k", "()Z", "Ll/kl40;", "getList", "()Ll/kl40;", "list", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class oye implements nrm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean isActive;

    public oye(boolean z) {
        this.isActive = z;
    }

    @Override // p149l.nrm
    @Nullable
    public kl40 getList() {
        return null;
    }

    @Override // p149l.nrm
    /* JADX INFO: renamed from: k, reason: from getter */
    public boolean getIsActive() {
        return this.isActive;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(getIsActive() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
