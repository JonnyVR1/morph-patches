package p149l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00028\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\bJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bR\u0013\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00108\u0002X\u0082\u0004¨\u0006\u0012"}, m87232d2 = {"Ll/e31;", j6f.GPS_DIRECTION_TRUE, "Ll/zo50;", "<init>", "()V", "affected", "", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "failure", "", "b", "(Ljava/lang/Object;Ljava/lang/Object;)V", "a", "decision", "c", "Lkotlinx/atomicfu/AtomicRef;", "_consensus", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public abstract class e31<T> extends zo50 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f88985a = AtomicReferenceFieldUpdater.newUpdater(e31.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = d31.f83443a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.zo50
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object mo114579a(@Nullable Object affected) {
        Object objM114580c = f88985a.get(this);
        if (objM114580c == d31.f83443a) {
            objM114580c = m114580c(mo93726e(affected));
        }
        mo94209b(affected, objM114580c);
        return objM114580c;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo94209b(T affected, @Nullable Object failure);

    /* JADX INFO: renamed from: c */
    public final Object m114580c(Object decision) {
        Object obj = f88985a.get(this);
        Object obj2 = d31.f83443a;
        if (obj != obj2) {
            return obj;
        }
        return C21643z7.m217426a(f88985a, this, obj2, decision) ? decision : f88985a.get(this);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public abstract Object mo93726e(T affected);
}
