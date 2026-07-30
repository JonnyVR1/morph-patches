package p149l;

import androidx.annotation.MainThread;
import com.clevertap.android.sdk.Constants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B%\b\u0016\u0012\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u00060\bj\u0002`\t0\u0007\"\u00060\bj\u0002`\t¢\u0006\u0004\b\u0002\u0010\u000bB-\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u00060\bj\u0002`\t0\u0007\"\u00060\bj\u0002`\t¢\u0006\u0004\b\u0002\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u0003J!\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0011\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\r2\n\u0010\u0011\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\f\b\u0000\u0010\u0016*\u00060\bj\u0002`\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0002¢\u0006\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u00060\bj\u0002`\t0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010\n\u001a\f\u0012\b\u0012\u00060\bj\u0002`\t0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010&¨\u0006("}, m87232d2 = {"Ll/kcl0;", "", "<init>", "()V", "Ll/ppb;", "viewModelScope", "(Ll/ppb;)V", "", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeables", "([Ljava/lang/AutoCloseable;)V", "(Ll/ppb;[Ljava/lang/AutoCloseable;)V", "", "f", "", Constants.KEY_KEY, "closeable", "e", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", Constants.INAPP_DATA_TAG, "(Ljava/lang/AutoCloseable;)V", j6f.GPS_DIRECTION_TRUE, "h", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "g", "Ll/hgh0;", "a", "Ll/hgh0;", JoinPoint.SYNCHRONIZATION_LOCK, "", "b", "Ljava/util/Map;", "keyToCloseables", "", "c", "Ljava/util/Set;", "", "Z", "isCleared", "lifecycle-viewmodel_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class kcl0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final hgh0 lock;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<String, AutoCloseable> keyToCloseables;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Set<AutoCloseable> closeables;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public volatile boolean isCleared;

    public kcl0(@NotNull ppb ppbVar, @NotNull AutoCloseable... autoCloseableArr) {
        ppbVar.getClass();
        autoCloseableArr.getClass();
        this.lock = new hgh0();
        this.keyToCloseables = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.closeables = linkedHashSet;
        m145448e("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", ca5.m105924a(ppbVar));
        CollectionsKt.addAll(linkedHashSet, autoCloseableArr);
    }

    /* JADX INFO: renamed from: d */
    public final void m145447d(@NotNull AutoCloseable closeable) {
        closeable.getClass();
        if (this.isCleared) {
            m145450g(closeable);
            return;
        }
        synchronized (this.lock) {
            this.closeables.add(closeable);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m145448e(@NotNull String key, @NotNull AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        key.getClass();
        closeable.getClass();
        if (this.isCleared) {
            m145450g(closeable);
            return;
        }
        synchronized (this.lock) {
            autoCloseable = (AutoCloseable) this.keyToCloseables.put(key, closeable);
        }
        m145450g(autoCloseable);
    }

    @MainThread
    /* JADX INFO: renamed from: f */
    public final void m145449f() {
        if (this.isCleared) {
            return;
        }
        this.isCleared = true;
        synchronized (this.lock) {
            try {
                Iterator it = this.keyToCloseables.values().iterator();
                while (it.hasNext()) {
                    m145450g((AutoCloseable) it.next());
                }
                Iterator it2 = this.closeables.iterator();
                while (it2.hasNext()) {
                    m145450g((AutoCloseable) it2.next());
                }
                this.closeables.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m145450g(AutoCloseable closeable) {
        if (closeable != null) {
            try {
                k5e.m144528a(closeable);
            } catch (Exception e) {
                aag0.m95543a(e);
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final <T extends AutoCloseable> T m145451h(@NotNull String key) {
        T t;
        key.getClass();
        synchronized (this.lock) {
            t = (T) this.keyToCloseables.get(key);
        }
        return t;
    }

    public kcl0(@NotNull ppb ppbVar) {
        ppbVar.getClass();
        this.lock = new hgh0();
        this.keyToCloseables = new LinkedHashMap();
        this.closeables = new LinkedHashSet();
        m145448e("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", ca5.m105924a(ppbVar));
    }

    public kcl0(@NotNull AutoCloseable... autoCloseableArr) {
        autoCloseableArr.getClass();
        this.lock = new hgh0();
        this.keyToCloseables = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.closeables = linkedHashSet;
        CollectionsKt.addAll(linkedHashSet, autoCloseableArr);
    }

    public kcl0() {
        this.lock = new hgh0();
        this.keyToCloseables = new LinkedHashMap();
        this.closeables = new LinkedHashSet();
    }
}
