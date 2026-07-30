package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class s600 {

    /* JADX INFO: renamed from: a */
    private final AtomicReference<cj10> f162608a = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    private final e01<cj10, List<Class<?>>> f162609b = new e01<>();

    @Nullable
    /* JADX INFO: renamed from: a */
    public List<Class<?>> m182404a(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3) {
        List<Class<?>> list;
        cj10 andSet = this.f162608a.getAndSet(null);
        if (andSet == null) {
            andSet = new cj10(cls, cls2, cls3);
        } else {
            andSet.m107105a(cls, cls2, cls3);
        }
        synchronized (this.f162609b) {
            list = this.f162609b.get(andSet);
        }
        this.f162608a.set(andSet);
        return list;
    }

    /* JADX INFO: renamed from: b */
    public void m182405b(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3, @NonNull List<Class<?>> list) {
        synchronized (this.f162609b) {
            this.f162609b.put(new cj10(cls, cls2, cls3), list);
        }
    }
}
