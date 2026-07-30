package p153l;

import android.util.LruCache;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.Action;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u0014*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u000fB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0015"}, m88121d2 = {"Ll/ssm;", "", p7f.GPS_DIRECTION_TRUE, "", "maxSize", "Ll/fy3;", "memoryCache", "<init>", "(ILl/fy3;)V", "", Constants.KEY_KEY, "value", "", "a", "(Ljava/lang/String;Ljava/lang/Object;)Z", "b", "(Ljava/lang/String;)Ljava/lang/Object;", "c", "I", "Ll/fy3;", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class ssm<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int maxSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final fy3<T> memoryCache;

    /* JADX INFO: renamed from: l.ssm$a */
    @Metadata(m88120d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tR#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m88121d2 = {"l/ssm$a", "Ll/fy3;", "", Constants.KEY_KEY, "value", "", "add", "(Ljava/lang/String;Ljava/lang/Object;)Z", "get", "(Ljava/lang/String;)Ljava/lang/Object;", Action.remove, "Landroid/util/LruCache;", "a", "Landroid/util/LruCache;", "getLru", "()Landroid/util/LruCache;", "lru", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C20141a implements fy3<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LruCache<String, T> lru;

        public C20141a(int i) {
            this.lru = ygw.INSTANCE.m215881a(i);
        }

        @Override // p153l.fy3
        public boolean add(String key, T value) {
            key.getClass();
            value.getClass();
            this.lru.put(key, value);
            return true;
        }

        @Override // p153l.fy3
        public T get(String key) {
            key.getClass();
            return this.lru.get(key);
        }

        @Override // p153l.fy3
        public T remove(String key) {
            key.getClass();
            return this.lru.remove(key);
        }
    }

    public /* synthetic */ ssm(int i, fy3 fy3Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? new C20141a(i) : fy3Var);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m187714a(@NotNull String key, @NotNull T value) {
        key.getClass();
        value.getClass();
        if (ey3.m123168a(value) > this.maxSize) {
            m187716c(key);
            return false;
        }
        this.memoryCache.add(key, value);
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final T m187715b(@NotNull String key) {
        key.getClass();
        return this.memoryCache.get(key);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final T m187716c(@NotNull String key) {
        key.getClass();
        return this.memoryCache.remove(key);
    }

    public ssm(int i, @NotNull fy3<T> fy3Var) {
        fy3Var.getClass();
        this.maxSize = i;
        this.memoryCache = fy3Var;
    }
}
