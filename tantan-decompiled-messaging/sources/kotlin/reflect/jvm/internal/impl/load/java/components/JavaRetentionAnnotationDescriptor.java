package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import org.jetbrains.annotations.NotNull;
import p149l.jkq;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JavaRetentionAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ KProperty<Object>[] f64783h = {Reflection.m87514i(new PropertyReference1Impl(JavaRetentionAnnotationDescriptor.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* JADX INFO: renamed from: g */
    @NotNull
    public final NotNullLazyValue f64784g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaRetentionAnnotationDescriptor(@NotNull JavaAnnotation javaAnnotation, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        super(lazyJavaResolverContext, javaAnnotation, StandardNames.FqNames.f63855K);
        javaAnnotation.getClass();
        lazyJavaResolverContext.getClass();
        this.f64784g = lazyJavaResolverContext.m89621e().mo92446e(new jkq(this));
    }

    /* JADX INFO: renamed from: i */
    public static final Map m89541i(JavaRetentionAnnotationDescriptor javaRetentionAnnotationDescriptor) {
        ConstantValue<?> constantValueM89528b = JavaAnnotationTargetMapper.INSTANCE.m89528b(javaRetentionAnnotationDescriptor.m89517c());
        Map mapMapOf = constantValueM89528b != null ? MapsKt.mapOf(TuplesKt.m87240a(JavaAnnotationMapper.INSTANCE.m89523c(), constantValueM89528b)) : null;
        return mapMapOf == null ? MapsKt.emptyMap() : mapMapOf;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    public Map<Name, ConstantValue<?>> mo88630a() {
        return (Map) StorageKt.m92484a(this.f64784g, this, f64783h[0]);
    }
}
