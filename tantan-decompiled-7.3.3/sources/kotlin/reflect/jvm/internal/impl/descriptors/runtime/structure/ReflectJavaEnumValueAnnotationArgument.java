package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectJavaEnumValueAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaEnumValueAnnotationArgument {

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Enum<?> f65033c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectJavaEnumValueAnnotationArgument(@Nullable Name name, @NotNull Enum<?> r3) {
        super(name, null);
        r3.getClass();
        this.f65033c = r3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument
    @Nullable
    /* JADX INFO: renamed from: c */
    public ClassId mo89939c() {
        Class<?> enclosingClass = this.f65033c.getClass();
        if (!enclosingClass.isEnum()) {
            enclosingClass = enclosingClass.getEnclosingClass();
        }
        enclosingClass.getClass();
        return ReflectClassUtilKt.m89882e(enclosingClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument
    @Nullable
    /* JADX INFO: renamed from: d */
    public Name mo89940d() {
        return Name.m91970i(this.f65033c.name());
    }
}
