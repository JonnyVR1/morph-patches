package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class bf00 {

    /* JADX INFO: renamed from: a */
    private final AtomicReference<mr10> f76428a = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    private final l01<mr10, List<Class<?>>> f76429b = new l01<>();

    @Nullable
    /* JADX INFO: renamed from: a */
    public List<Class<?>> m103793a(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3) {
        List<Class<?>> list;
        mr10 andSet = this.f76428a.getAndSet(null);
        if (andSet == null) {
            andSet = new mr10(cls, cls2, cls3);
        } else {
            andSet.m159618a(cls, cls2, cls3);
        }
        synchronized (this.f76429b) {
            list = this.f76429b.get(andSet);
        }
        this.f76428a.set(andSet);
        return list;
    }

    /* JADX INFO: renamed from: b */
    public void m103794b(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3, @NonNull List<Class<?>> list) {
        synchronized (this.f76429b) {
            this.f76429b.put(new mr10(cls, cls2, cls3), list);
        }
    }
}
