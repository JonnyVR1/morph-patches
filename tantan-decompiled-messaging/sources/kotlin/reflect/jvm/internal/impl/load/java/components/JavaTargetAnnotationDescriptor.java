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
import p149l.nkq;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JavaTargetAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ KProperty<Object>[] f64785h = {Reflection.m87514i(new PropertyReference1Impl(JavaTargetAnnotationDescriptor.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* JADX INFO: renamed from: g */
    @NotNull
    public final NotNullLazyValue f64786g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaTargetAnnotationDescriptor(@NotNull JavaAnnotation javaAnnotation, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        super(lazyJavaResolverContext, javaAnnotation, StandardNames.FqNames.f63847G);
        javaAnnotation.getClass();
        lazyJavaResolverContext.getClass();
        this.f64786g = lazyJavaResolverContext.m89621e().mo92446e(new nkq(this));
    }

    /* JADX INFO: renamed from: i */
    public static final Map m89543i(JavaTargetAnnotationDescriptor javaTargetAnnotationDescriptor) {
        ConstantValue<?> constantValueM89530d;
        JavaAnnotationArgument javaAnnotationArgumentM89517c = javaTargetAnnotationDescriptor.m89517c();
        if (javaAnnotationArgumentM89517c instanceof JavaArrayAnnotationArgument) {
            constantValueM89530d = JavaAnnotationTargetMapper.INSTANCE.m89530d(((JavaArrayAnnotationArgument) javaTargetAnnotationDescriptor.m89517c()).mo89010a());
        } else {
            constantValueM89530d = javaAnnotationArgumentM89517c instanceof JavaEnumValueAnnotationArgument ? JavaAnnotationTargetMapper.INSTANCE.m89530d(CollectionsKt.listOf(javaTargetAnnotationDescriptor.m89517c())) : null;
        }
        Map mapMapOf = constantValueM89530d != null ? MapsKt.mapOf(TuplesKt.m87240a(JavaAnnotationMapper.INSTANCE.m89524d(), constantValueM89530d)) : null;
        return mapMapOf == null ? MapsKt.emptyMap() : mapMapOf;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    public Map<Name, ConstantValue<Object>> mo88630a() {
        return (Map) StorageKt.m92484a(this.f64786g, this, f64785h[0]);
    }
}
