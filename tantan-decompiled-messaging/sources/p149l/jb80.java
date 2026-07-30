package p149l;

import androidx.annotation.IntRange;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\rR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m87232d2 = {"Ll/jb80;", "", j6f.GPS_DIRECTION_TRUE, "Ll/hb80;", "", "maxPoolSize", "<init>", "(I)V", "acquire", "()Ljava/lang/Object;", "instance", "", "release", "(Ljava/lang/Object;)Z", "a", "", "[Ljava/lang/Object;", "pool", "b", "I", "poolSize", "core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public class jb80<T> implements hb80<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Object[] pool;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int poolSize;

    public jb80(@IntRange(from = 1) int i) {
        if (i > 0) {
            this.pool = new Object[i];
        } else {
            ig3.m135964a("The max pool size must be > 0");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m140743a(T instance) {
        int i = this.poolSize;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.pool[i2] == instance) {
                return true;
            }
        }
        return false;
    }

    @Override // p149l.hb80
    @Nullable
    public T acquire() {
        int i = this.poolSize;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T t = (T) this.pool[i2];
        t.getClass();
        this.pool[i2] = null;
        this.poolSize--;
        return t;
    }

    @Override // p149l.hb80
    public boolean release(@NotNull T instance) {
        instance.getClass();
        if (m140743a(instance)) {
            qkq0.m175383a("Already in the pool!");
            return false;
        }
        int i = this.poolSize;
        Object[] objArr = this.pool;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = instance;
        this.poolSize = i + 1;
        return true;
    }
}
