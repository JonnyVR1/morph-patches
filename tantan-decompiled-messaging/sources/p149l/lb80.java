package p149l;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m87232d2 = {"Ll/lb80;", "", j6f.GPS_DIRECTION_TRUE, "Ll/jb80;", "", "maxPoolSize", "<init>", "(I)V", "acquire", "()Ljava/lang/Object;", "instance", "", "release", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/Object;", JoinPoint.SYNCHRONIZATION_LOCK, "core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public class lb80<T> extends jb80<T> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Object lock;

    public lb80(int i) {
        super(i);
        this.lock = new Object();
    }

    @Override // p149l.jb80, p149l.hb80
    @Nullable
    public T acquire() {
        T t;
        synchronized (this.lock) {
            t = (T) super.acquire();
        }
        return t;
    }

    @Override // p149l.jb80, p149l.hb80
    public boolean release(@NotNull T instance) {
        boolean zRelease;
        instance.getClass();
        synchronized (this.lock) {
            zRelease = super.release(instance);
        }
        return zRelease;
    }
}
