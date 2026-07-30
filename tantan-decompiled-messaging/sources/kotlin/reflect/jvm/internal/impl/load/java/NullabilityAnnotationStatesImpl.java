package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.tu40;

/* JADX INFO: loaded from: classes2.dex */
public final class NullabilityAnnotationStatesImpl<T> implements NullabilityAnnotationStates<T> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Map<FqName, T> f64743a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final LockBasedStorageManager f64744b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final MemoizedFunctionToNullable<FqName, T> f64745c;

    /* JADX WARN: Multi-variable type inference failed */
    public NullabilityAnnotationStatesImpl(@NotNull Map<FqName, ? extends T> map) {
        map.getClass();
        this.f64743a = map;
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Java nullability annotation states");
        this.f64744b = lockBasedStorageManager;
        MemoizedFunctionToNullable<FqName, T> memoizedFunctionToNullableMo92444c = lockBasedStorageManager.mo92444c(new tu40(this));
        memoizedFunctionToNullableMo92444c.getClass();
        this.f64745c = memoizedFunctionToNullableMo92444c;
    }

    /* JADX INFO: renamed from: c */
    public static final Object m89456c(NullabilityAnnotationStatesImpl nullabilityAnnotationStatesImpl, FqName fqName) {
        fqName.getClass();
        return FqNamesUtilKt.m91070a(fqName, nullabilityAnnotationStatesImpl.f64743a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStates
    @Nullable
    /* JADX INFO: renamed from: a */
    public T mo89453a(@NotNull FqName fqName) {
        fqName.getClass();
        return this.f64745c.invoke(fqName);
    }
}
