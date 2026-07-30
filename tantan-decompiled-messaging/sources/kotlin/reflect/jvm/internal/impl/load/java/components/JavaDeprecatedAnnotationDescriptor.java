package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.bkq;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaDeprecatedAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ KProperty<Object>[] f64780h = {Reflection.m87514i(new PropertyReference1Impl(JavaDeprecatedAnnotationDescriptor.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* JADX INFO: renamed from: g */
    @NotNull
    public final NotNullLazyValue f64781g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaDeprecatedAnnotationDescriptor(@Nullable JavaAnnotation javaAnnotation, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        super(lazyJavaResolverContext, javaAnnotation, StandardNames.FqNames.f63928x);
        lazyJavaResolverContext.getClass();
        this.f64781g = lazyJavaResolverContext.m89621e().mo92446e(bkq.INSTANCE);
    }

    /* JADX INFO: renamed from: i */
    public static final Map m89532i() {
        return MapsKt.mapOf(TuplesKt.m87240a(JavaAnnotationMapper.INSTANCE.m89522b(), new StringValue("Deprecated in Java")));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    public Map<Name, ConstantValue<?>> mo88630a() {
        return (Map) StorageKt.m92484a(this.f64781g, this, f64780h[0]);
    }
}
