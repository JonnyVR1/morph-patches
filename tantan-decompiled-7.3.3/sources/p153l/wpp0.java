package p153l;

import com.p051p1.mobile.putong.core.data.Ref;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0019\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\fR$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u0011\u0010\u0005¨\u0006\u001f"}, m88121d2 = {"Ll/wpp0;", "", "Ljava/lang/ClassLoader;", "classLoader", "<init>", "(Ljava/lang/ClassLoader;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/ref/WeakReference;", "a", "Ljava/lang/ref/WeakReference;", "getRef", "()Ljava/lang/ref/WeakReference;", Ref.TYPE, "b", "I", "getIdentityHashCode", "identityHashCode", "c", "Ljava/lang/ClassLoader;", "getTemporaryStrongRef", "()Ljava/lang/ClassLoader;", "temporaryStrongRef", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class wpp0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WeakReference<ClassLoader> ref;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int identityHashCode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public ClassLoader temporaryStrongRef;

    public wpp0(@NotNull ClassLoader classLoader) {
        classLoader.getClass();
        this.ref = new WeakReference<>(classLoader);
        this.identityHashCode = System.identityHashCode(classLoader);
        this.temporaryStrongRef = classLoader;
    }

    /* JADX INFO: renamed from: a */
    public final void m207477a(@Nullable ClassLoader classLoader) {
        this.temporaryStrongRef = classLoader;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof wpp0) && this.ref.get() == ((wpp0) other).ref.get();
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public int getIdentityHashCode() {
        return this.identityHashCode;
    }

    @NotNull
    public String toString() {
        String string;
        ClassLoader classLoader = this.ref.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
