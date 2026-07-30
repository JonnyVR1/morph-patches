package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.ResourceDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC15592n;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m88121d2 = {"Ll/hpq;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/n;", "Ll/z5e;", "Ll/ptm;", "<init>", "()V", "", "dispose", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/JobSupport;", Constants.INAPP_DATA_TAG, "Lkotlinx/coroutines/JobSupport;", "u", "()Lkotlinx/coroutines/JobSupport;", ResourceDirection.f39656v, "(Lkotlinx/coroutines/JobSupport;)V", "job", "", "k", "()Z", "isActive", "Ll/yt40;", "getList", "()Ll/yt40;", "list", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public abstract class hpq extends LockFreeLinkedListNode implements InterfaceC15592n, z5e, ptm {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public JobSupport job;

    @Override // p153l.z5e
    public void dispose() {
        m136579u().m94553R0(this);
    }

    @Override // p153l.ptm
    @Nullable
    public yt40 getList() {
        return null;
    }

    @Override // p153l.ptm
    /* JADX INFO: renamed from: k */
    public boolean mo94612k() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @NotNull
    public String toString() {
        return u9c.m195086a(this) + '@' + u9c.m195087b(this) + "[job@" + u9c.m195087b(m136579u()) + ']';
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final JobSupport m136579u() {
        JobSupport jobSupport = this.job;
        if (jobSupport != null) {
            return jobSupport;
        }
        Intrinsics.m88391r("job");
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final void m136580v(@NotNull JobSupport jobSupport) {
        this.job = jobSupport;
    }
}
