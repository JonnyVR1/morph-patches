package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ReflectJavaArrayAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaArrayAnnotationArgument {

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Object[] f65023c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectJavaArrayAnnotationArgument(@Nullable Name name, @NotNull Object[] objArr) {
        super(name, null);
        objArr.getClass();
        this.f65023c = objArr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<ReflectJavaAnnotationArgument> mo89901a() {
        Object[] objArr = this.f65023c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            ReflectJavaAnnotationArgument.Factory factory = ReflectJavaAnnotationArgument.f65020b;
            obj.getClass();
            arrayList.add(factory.m89897a(obj, null));
        }
        return arrayList;
    }
}
