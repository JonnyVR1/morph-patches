package p153l;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u0003R*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m88121d2 = {"Ll/nlw;", "", "<init>", "()V", "", "callback", "value", "", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ll/mlw;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "b", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "setCallbacks", "(Ljava/util/concurrent/CopyOnWriteArrayList;)V", "callbacks", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class nlw {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private volatile CopyOnWriteArrayList<mlw> callbacks;

    /* JADX INFO: renamed from: a */
    public final synchronized void m163781a() {
        CopyOnWriteArrayList<mlw> copyOnWriteArrayListM163782b = m163782b();
        if (copyOnWriteArrayListM163782b != null) {
            copyOnWriteArrayListM163782b.clear();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList<mlw> m163782b() {
        if (this.callbacks == null) {
            this.callbacks = new CopyOnWriteArrayList<>();
        }
        return this.callbacks;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m163783c(@Nullable String callback, @Nullable String value) {
        CopyOnWriteArrayList<mlw> copyOnWriteArrayListM163782b;
        if (callback != null) {
            if (value != null) {
                try {
                    CopyOnWriteArrayList<mlw> copyOnWriteArrayListM163782b2 = m163782b();
                    if (copyOnWriteArrayListM163782b2 != null) {
                        copyOnWriteArrayListM163782b2.add(new mlw(callback, value));
                    }
                    CopyOnWriteArrayList<mlw> copyOnWriteArrayListM163782b3 = m163782b();
                    if ((copyOnWriteArrayListM163782b3 != null ? copyOnWriteArrayListM163782b3.size() : 0) > 20 && (copyOnWriteArrayListM163782b = m163782b()) != null) {
                        copyOnWriteArrayListM163782b.remove(0);
                    }
                } catch (Throwable th) {
                    Log.e("MKWebRebuildData", "", th);
                }
            }
        }
    }
}
