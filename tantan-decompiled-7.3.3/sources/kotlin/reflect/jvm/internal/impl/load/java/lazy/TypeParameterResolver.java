package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface TypeParameterResolver {

    public static final class EMPTY implements TypeParameterResolver {

        @NotNull
        public static final EMPTY INSTANCE = new EMPTY();

        private EMPTY() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
        @Nullable
        /* JADX INFO: renamed from: a */
        public TypeParameterDescriptor mo90517a(@NotNull JavaTypeParameter javaTypeParameter) {
            javaTypeParameter.getClass();
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    TypeParameterDescriptor mo90517a(@NotNull JavaTypeParameter javaTypeParameter);
}
