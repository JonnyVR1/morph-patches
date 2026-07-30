package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import org.jetbrains.annotations.NotNull;
import p153l.mmq;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JavaTargetAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ KProperty<Object>[] f65459h = {Reflection.m88403i(new PropertyReference1Impl(JavaTargetAnnotationDescriptor.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* JADX INFO: renamed from: g */
    @NotNull
    public final NotNullLazyValue f65460g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaTargetAnnotationDescriptor(@NotNull JavaAnnotation javaAnnotation, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        super(lazyJavaResolverContext, javaAnnotation, StandardNames.FqNames.f64521G);
        javaAnnotation.getClass();
        lazyJavaResolverContext.getClass();
        this.f65460g = lazyJavaResolverContext.m90512e().mo93337e(new mmq(this));
    }

    /* JADX INFO: renamed from: i */
    public static final Map m90434i(JavaTargetAnnotationDescriptor javaTargetAnnotationDescriptor) {
        ConstantValue<?> constantValueM90421d;
        JavaAnnotationArgument javaAnnotationArgumentM90408c = javaTargetAnnotationDescriptor.m90408c();
        if (javaAnnotationArgumentM90408c instanceof JavaArrayAnnotationArgument) {
            constantValueM90421d = JavaAnnotationTargetMapper.INSTANCE.m90421d(((JavaArrayAnnotationArgument) javaTargetAnnotationDescriptor.m90408c()).mo89901a());
        } else {
            constantValueM90421d = javaAnnotationArgumentM90408c instanceof JavaEnumValueAnnotationArgument ? JavaAnnotationTargetMapper.INSTANCE.m90421d(CollectionsKt.listOf(javaTargetAnnotationDescriptor.m90408c())) : null;
        }
        Map mapMapOf = constantValueM90421d != null ? MapsKt.mapOf(TuplesKt.m88129a(JavaAnnotationMapper.INSTANCE.m90415d(), constantValueM90421d)) : null;
        return mapMapOf == null ? MapsKt.emptyMap() : mapMapOf;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    public Map<Name, ConstantValue<Object>> mo89521a() {
        return (Map) StorageKt.m93375a(this.f65460g, this, f65459h[0]);
    }
}
