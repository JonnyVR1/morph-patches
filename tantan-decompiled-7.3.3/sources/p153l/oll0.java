package p153l;

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
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B%\b\u0016\u0012\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u00060\bj\u0002`\t0\u0007\"\u00060\bj\u0002`\t¢\u0006\u0004\b\u0002\u0010\u000bB-\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u00060\bj\u0002`\t0\u0007\"\u00060\bj\u0002`\t¢\u0006\u0004\b\u0002\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u0003J!\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0011\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\r2\n\u0010\u0011\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\f\b\u0000\u0010\u0016*\u00060\bj\u0002`\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0002¢\u0006\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u00060\bj\u0002`\t0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010\n\u001a\f\u0012\b\u0012\u00060\bj\u0002`\t0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010&¨\u0006("}, m88121d2 = {"Ll/oll0;", "", "<init>", "()V", "Ll/drb;", "viewModelScope", "(Ll/drb;)V", "", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeables", "([Ljava/lang/AutoCloseable;)V", "(Ll/drb;[Ljava/lang/AutoCloseable;)V", "", "f", "", Constants.KEY_KEY, "closeable", "e", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", Constants.INAPP_DATA_TAG, "(Ljava/lang/AutoCloseable;)V", p7f.GPS_DIRECTION_TRUE, "h", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "g", "Ll/ooh0;", "a", "Ll/ooh0;", JoinPoint.SYNCHRONIZATION_LOCK, "", "b", "Ljava/util/Map;", "keyToCloseables", "", "c", "Ljava/util/Set;", "", "Z", "isCleared", "lifecycle-viewmodel_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class oll0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ooh0 lock;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<String, AutoCloseable> keyToCloseables;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Set<AutoCloseable> closeables;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public volatile boolean isCleared;

    public oll0(@NotNull drb drbVar, @NotNull AutoCloseable... autoCloseableArr) {
        drbVar.getClass();
        autoCloseableArr.getClass();
        this.lock = new ooh0();
        this.keyToCloseables = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.closeables = linkedHashSet;
        m168137e("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", cb5.m108601a(drbVar));
        CollectionsKt.addAll(linkedHashSet, autoCloseableArr);
    }

    /* JADX INFO: renamed from: d */
    public final void m168136d(@NotNull AutoCloseable closeable) {
        closeable.getClass();
        if (this.isCleared) {
            m168139g(closeable);
            return;
        }
        synchronized (this.lock) {
            this.closeables.add(closeable);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m168137e(@NotNull String key, @NotNull AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        key.getClass();
        closeable.getClass();
        if (this.isCleared) {
            m168139g(closeable);
            return;
        }
        synchronized (this.lock) {
            autoCloseable = (AutoCloseable) this.keyToCloseables.put(key, closeable);
        }
        m168139g(autoCloseable);
    }

    @MainThread
    /* JADX INFO: renamed from: f */
    public final void m168138f() {
        if (this.isCleared) {
            return;
        }
        this.isCleared = true;
        synchronized (this.lock) {
            try {
                Iterator it = this.keyToCloseables.values().iterator();
                while (it.hasNext()) {
                    m168139g((AutoCloseable) it.next());
                }
                Iterator it2 = this.closeables.iterator();
                while (it2.hasNext()) {
                    m168139g((AutoCloseable) it2.next());
                }
                this.closeables.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m168139g(AutoCloseable closeable) {
        if (closeable != null) {
            try {
                y6e.m214482a(closeable);
            } catch (Exception e) {
                iig0.m140070a(e);
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final <T extends AutoCloseable> T m168140h(@NotNull String key) {
        T t;
        key.getClass();
        synchronized (this.lock) {
            t = (T) this.keyToCloseables.get(key);
        }
        return t;
    }

    public oll0(@NotNull drb drbVar) {
        drbVar.getClass();
        this.lock = new ooh0();
        this.keyToCloseables = new LinkedHashMap();
        this.closeables = new LinkedHashSet();
        m168137e("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", cb5.m108601a(drbVar));
    }

    public oll0(@NotNull AutoCloseable... autoCloseableArr) {
        autoCloseableArr.getClass();
        this.lock = new ooh0();
        this.keyToCloseables = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.closeables = linkedHashSet;
        CollectionsKt.addAll(linkedHashSet, autoCloseableArr);
    }

    public oll0() {
        this.lock = new ooh0();
        this.keyToCloseables = new LinkedHashMap();
        this.closeables = new LinkedHashSet();
    }
}
