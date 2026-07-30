package p149l;

import com.p046p1.mobile.putong.core.data.Ref;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, m87232d2 = {"Ll/jwk;", j6f.GPS_DIRECTION_TRUE, "Ljava/lang/ref/WeakReference;", Ref.TYPE, "Ljava/lang/ref/ReferenceQueue;", "queue", "<init>", "(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V", "", "a", "I", "hash", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class jwk<T> extends WeakReference<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    public final int hash;

    public jwk(T t, @Nullable ReferenceQueue<T> referenceQueue) {
        super(t, referenceQueue);
        this.hash = t != null ? t.hashCode() : 0;
    }
}
