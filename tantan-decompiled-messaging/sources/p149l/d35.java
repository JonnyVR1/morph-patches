package p149l;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.C15407c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/d35;", "Ll/xmq;", "Lkotlinx/coroutines/c;", "child", "<init>", "(Lkotlinx/coroutines/c;)V", "", "cause", "", "a", "(Ljava/lang/Throwable;)V", "e", "Lkotlinx/coroutines/c;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@PublishedApi
public final class d35 extends xmq {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final C15407c<?> child;

    public d35(@NotNull C15407c<?> c15407c) {
        this.child = c15407c;
    }

    @Override // kotlinx.coroutines.InterfaceC15485n
    /* JADX INFO: renamed from: a */
    public void mo93710a(@Nullable Throwable cause) {
        C15407c<?> c15407c = this.child;
        c15407c.m93751N(c15407c.mo93709t(m137157u()));
    }
}
