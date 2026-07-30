package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.ResourceDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC15485n;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m87232d2 = {"Ll/inq;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/n;", "Ll/l4e;", "Ll/nrm;", "<init>", "()V", "", "dispose", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/JobSupport;", Constants.INAPP_DATA_TAG, "Lkotlinx/coroutines/JobSupport;", "u", "()Lkotlinx/coroutines/JobSupport;", ResourceDirection.f38808v, "(Lkotlinx/coroutines/JobSupport;)V", "job", "", "k", "()Z", "isActive", "Ll/kl40;", "getList", "()Ll/kl40;", "list", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public abstract class inq extends LockFreeLinkedListNode implements InterfaceC15485n, l4e, nrm {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public JobSupport job;

    @Override // p149l.l4e
    public void dispose() {
        m137157u().m93662R0(this);
    }

    @Override // p149l.nrm
    @Nullable
    public kl40 getList() {
        return null;
    }

    @Override // p149l.nrm
    /* JADX INFO: renamed from: k */
    public boolean mo93721k() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @NotNull
    public String toString() {
        return o8c.m163111a(this) + '@' + o8c.m163112b(this) + "[job@" + o8c.m163112b(m137157u()) + ']';
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final JobSupport m137157u() {
        JobSupport jobSupport = this.job;
        if (jobSupport != null) {
            return jobSupport;
        }
        Intrinsics.m87502r("job");
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final void m137158v(@NotNull JobSupport jobSupport) {
        this.job = jobSupport;
    }
}
