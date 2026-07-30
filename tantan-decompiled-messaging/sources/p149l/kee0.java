package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.SemaphoreKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0006¨\u0006\u001a"}, m87232d2 = {"Ll/kee0;", "Ll/mce0;", "", "id", "prev", "", "pointers", "<init>", "(JLl/kee0;I)V", FirebaseAnalytics.Param.INDEX, "", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", "", BLiveStormDanmakuGiftResourceType.f44446s, "(ILjava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", "", "toString", "()Ljava/lang/String;", "r", "()I", "numberOfSlots", "Lkotlinx/atomicfu/AtomicArray;", "", "acquirers", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class kee0 extends mce0<kee0> {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AtomicReferenceArray f122699e;

    public kee0(long j, @Nullable kee0 kee0Var, int i) {
        super(j, kee0Var, i);
        this.f122699e = new AtomicReferenceArray(SemaphoreKt.f66997f);
    }

    @Override // p149l.mce0
    /* JADX INFO: renamed from: r */
    public int mo145769r() {
        return SemaphoreKt.f66997f;
    }

    @Override // p149l.mce0
    /* JADX INFO: renamed from: s */
    public void mo145770s(int index, @Nullable Throwable cause, @NotNull CoroutineContext context) {
        getF122699e().set(index, SemaphoreKt.f66996e);
        m153993t();
    }

    @NotNull
    public String toString() {
        return "SemaphoreSegment[id=" + this.id + ", hashCode=" + hashCode() + ']';
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final /* synthetic */ AtomicReferenceArray getF122699e() {
        return this.f122699e;
    }
}
