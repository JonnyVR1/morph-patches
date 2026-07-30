package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface JavaPropertyInitializerEvaluator {

    public static final class DoNothing implements JavaPropertyInitializerEvaluator {

        @NotNull
        public static final DoNothing INSTANCE = new DoNothing();

        private DoNothing() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator
        @Nullable
        /* JADX INFO: renamed from: a */
        public ConstantValue<?> mo90424a(@NotNull JavaField javaField, @NotNull PropertyDescriptor propertyDescriptor) {
            javaField.getClass();
            propertyDescriptor.getClass();
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    ConstantValue<?> mo90424a(@NotNull JavaField javaField, @NotNull PropertyDescriptor propertyDescriptor);
}
