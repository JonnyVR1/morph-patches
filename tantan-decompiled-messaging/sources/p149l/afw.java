package p149l;

import android.util.LruCache;
import com.clevertap.android.sdk.Constants;
import com.cosmos.photon.push.service.PushService;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Ll/afw;", "", "<init>", "()V", j6f.GPS_DIRECTION_TRUE, "", "maxSize", "Landroid/util/LruCache;", "", "a", "(I)Landroid/util/LruCache;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class afw {

    @NotNull
    public static final afw INSTANCE = new afw();

    private afw() {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final <T> LruCache<String, T> m96274a(int maxSize) {
        return new C15600a(maxSize);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.afw$a */
    @Metadata(m87231d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\f\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"l/afw$a", "Landroid/util/LruCache;", Constants.KEY_KEY, "value", "", "sizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", PushService.COMMAND_CREATE, "(Ljava/lang/Object;)Ljava/lang/Object;", "", "evicted", Constants.KEY_OLD_VALUE, Constants.KEY_NEW_VALUE, "", "entryRemoved", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "core-ktx_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C15600a<T> extends LruCache<String, T> {
        public C15600a(int i) {
            super(i);
        }

        @Override // android.util.LruCache
        @Nullable
        public T create(@NotNull String key) {
            return null;
        }

        @Override // android.util.LruCache
        public int sizeOf(@NotNull String key, @NotNull T value) {
            return fx3.m123618a(value);
        }

        @Override // android.util.LruCache
        public void entryRemoved(boolean evicted, @NotNull String key, @NotNull T oldValue, @Nullable T newValue) {
        }
    }
}
