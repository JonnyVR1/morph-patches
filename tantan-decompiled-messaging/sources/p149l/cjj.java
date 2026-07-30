package p149l;

import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.TypesJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m87232d2 = {"Ll/cjj;", "Ljava/lang/reflect/GenericArrayType;", "", "Ljava/lang/reflect/Type;", "elementType", "<init>", "(Ljava/lang/reflect/Type;)V", "getGenericComponentType", "()Ljava/lang/reflect/Type;", "", "getTypeName", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "a", "Ljava/lang/reflect/Type;", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@ExperimentalStdlibApi
public final class cjj implements GenericArrayType, Type {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Type elementType;

    public cjj(@NotNull Type type) {
        type.getClass();
        this.elementType = type;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof GenericArrayType) && Intrinsics.m87488d(getGenericComponentType(), ((GenericArrayType) other).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    @NotNull
    public Type getGenericComponentType() {
        return this.elementType;
    }

    @Override // java.lang.reflect.Type
    @NotNull
    public String getTypeName() {
        return TypesJVMKt.m87624h(this.elementType) + WeJson.EMPTY_ARR;
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    @NotNull
    public String toString() {
        return getTypeName();
    }
}
