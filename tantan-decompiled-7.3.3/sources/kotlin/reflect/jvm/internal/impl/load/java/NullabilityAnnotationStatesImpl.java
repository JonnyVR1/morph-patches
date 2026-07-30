package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.i350;

/* JADX INFO: loaded from: classes2.dex */
public final class NullabilityAnnotationStatesImpl<T> implements NullabilityAnnotationStates<T> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Map<FqName, T> f65417a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final LockBasedStorageManager f65418b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final MemoizedFunctionToNullable<FqName, T> f65419c;

    /* JADX WARN: Multi-variable type inference failed */
    public NullabilityAnnotationStatesImpl(@NotNull Map<FqName, ? extends T> map) {
        map.getClass();
        this.f65417a = map;
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Java nullability annotation states");
        this.f65418b = lockBasedStorageManager;
        MemoizedFunctionToNullable<FqName, T> memoizedFunctionToNullableMo93335c = lockBasedStorageManager.mo93335c(new i350(this));
        memoizedFunctionToNullableMo93335c.getClass();
        this.f65419c = memoizedFunctionToNullableMo93335c;
    }

    /* JADX INFO: renamed from: c */
    public static final Object m90347c(NullabilityAnnotationStatesImpl nullabilityAnnotationStatesImpl, FqName fqName) {
        fqName.getClass();
        return FqNamesUtilKt.m91961a(fqName, nullabilityAnnotationStatesImpl.f65417a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStates
    @Nullable
    /* JADX INFO: renamed from: a */
    public T mo90344a(@NotNull FqName fqName) {
        fqName.getClass();
        return this.f65419c.invoke(fqName);
    }
}
