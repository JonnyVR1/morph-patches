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
import p153l.imq;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JavaRetentionAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ KProperty<Object>[] f65457h = {Reflection.m88403i(new PropertyReference1Impl(JavaRetentionAnnotationDescriptor.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* JADX INFO: renamed from: g */
    @NotNull
    public final NotNullLazyValue f65458g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaRetentionAnnotationDescriptor(@NotNull JavaAnnotation javaAnnotation, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        super(lazyJavaResolverContext, javaAnnotation, StandardNames.FqNames.f64529K);
        javaAnnotation.getClass();
        lazyJavaResolverContext.getClass();
        this.f65458g = lazyJavaResolverContext.m90512e().mo93337e(new imq(this));
    }

    /* JADX INFO: renamed from: i */
    public static final Map m90432i(JavaRetentionAnnotationDescriptor javaRetentionAnnotationDescriptor) {
        ConstantValue<?> constantValueM90419b = JavaAnnotationTargetMapper.INSTANCE.m90419b(javaRetentionAnnotationDescriptor.m90408c());
        Map mapMapOf = constantValueM90419b != null ? MapsKt.mapOf(TuplesKt.m88129a(JavaAnnotationMapper.INSTANCE.m90414c(), constantValueM90419b)) : null;
        return mapMapOf == null ? MapsKt.emptyMap() : mapMapOf;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    public Map<Name, ConstantValue<?>> mo89521a() {
        return (Map) StorageKt.m93375a(this.f65458g, this, f65457h[0]);
    }
}
