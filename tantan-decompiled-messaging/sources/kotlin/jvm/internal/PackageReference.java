package kotlin.jvm.internal;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m87232d2 = {"Lkotlin/jvm/internal/PackageReference;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "Ljava/lang/Class;", "jClass", "", "moduleName", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Class;", Constants.INAPP_DATA_TAG, "()Ljava/lang/Class;", "b", "Ljava/lang/String;", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class PackageReference implements ClassBasedDeclarationContainer {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Class<?> jClass;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String moduleName;

    public PackageReference(@NotNull Class<?> cls, @NotNull String str) {
        cls.getClass();
        str.getClass();
        this.jClass = cls;
        this.moduleName = str;
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    @NotNull
    /* JADX INFO: renamed from: d */
    public Class<?> mo87465d() {
        return this.jClass;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof PackageReference) && Intrinsics.m87488d(mo87465d(), ((PackageReference) other).mo87465d());
    }

    public int hashCode() {
        return mo87465d().hashCode();
    }

    @NotNull
    public String toString() {
        return mo87465d().toString() + " (Kotlin reflection is not available)";
    }
}
