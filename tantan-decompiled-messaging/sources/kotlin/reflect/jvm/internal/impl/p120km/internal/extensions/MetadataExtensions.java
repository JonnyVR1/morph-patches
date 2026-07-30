package kotlin.reflect.jvm.internal.impl.p120km.internal.extensions;

import java.util.List;
import java.util.ServiceLoader;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.p120km.KmClass;
import kotlin.reflect.jvm.internal.impl.p120km.KmConstructor;
import kotlin.reflect.jvm.internal.impl.p120km.KmEnumEntry;
import kotlin.reflect.jvm.internal.impl.p120km.KmFunction;
import kotlin.reflect.jvm.internal.impl.p120km.KmProperty;
import kotlin.reflect.jvm.internal.impl.p120km.KmType;
import kotlin.reflect.jvm.internal.impl.p120km.KmTypeAlias;
import kotlin.reflect.jvm.internal.impl.p120km.KmTypeParameter;
import kotlin.reflect.jvm.internal.impl.p120km.KmValueParameter;
import kotlin.reflect.jvm.internal.impl.p120km.internal.ReadContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b100;
import p149l.qkq0;

/* JADX INFO: loaded from: classes2.dex */
public interface MetadataExtensions {

    @NotNull
    public static final Companion Companion = Companion.f64609a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f64609a = new Companion();

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final Lazy<List<MetadataExtensions>> f64610b = LazyKt__LazyJVMKt.m87229b(b100.INSTANCE);

        private Companion() {
        }

        /* JADX INFO: renamed from: a */
        public static final List m89281a() {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(MetadataExtensions.class, MetadataExtensions.class.getClassLoader());
            serviceLoaderLoad.getClass();
            List list = CollectionsKt.toList(serviceLoaderLoad);
            if (!list.isEmpty()) {
                return list;
            }
            qkq0.m175383a("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final List<MetadataExtensions> m89283c() {
            return f64610b.getValue();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    KmTypeAliasExtension mo89263a();

    @Nullable
    /* JADX INFO: renamed from: b */
    KmEnumEntryExtension mo89264b();

    /* JADX INFO: renamed from: c */
    void mo89265c(@NotNull KmTypeParameter kmTypeParameter, @NotNull ProtoBuf.TypeParameter typeParameter, @NotNull ReadContext readContext);

    @NotNull
    /* JADX INFO: renamed from: d */
    KmClassExtension mo89266d();

    @NotNull
    /* JADX INFO: renamed from: e */
    KmConstructorExtension mo89267e();

    /* JADX INFO: renamed from: f */
    void mo89268f(@NotNull KmProperty kmProperty, @NotNull ProtoBuf.Property property, @NotNull ReadContext readContext);

    @NotNull
    /* JADX INFO: renamed from: g */
    KmTypeExtension mo89269g();

    @NotNull
    /* JADX INFO: renamed from: h */
    KmTypeParameterExtension mo89270h();

    @Nullable
    /* JADX INFO: renamed from: i */
    KmValueParameterExtension mo89271i();

    /* JADX INFO: renamed from: j */
    void mo89272j(@NotNull KmTypeAlias kmTypeAlias, @NotNull ProtoBuf.TypeAlias typeAlias, @NotNull ReadContext readContext);

    /* JADX INFO: renamed from: k */
    void mo89273k(@NotNull KmEnumEntry kmEnumEntry, @NotNull ProtoBuf.EnumEntry enumEntry, @NotNull ReadContext readContext);

    /* JADX INFO: renamed from: l */
    void mo89274l(@NotNull KmConstructor kmConstructor, @NotNull ProtoBuf.Constructor constructor, @NotNull ReadContext readContext);

    @NotNull
    /* JADX INFO: renamed from: m */
    KmPropertyExtension mo89275m();

    /* JADX INFO: renamed from: n */
    void mo89276n(@NotNull KmType kmType, @NotNull ProtoBuf.Type type, @NotNull ReadContext readContext);

    /* JADX INFO: renamed from: o */
    void mo89277o(@NotNull KmClass kmClass, @NotNull ProtoBuf.Class r2, @NotNull ReadContext readContext);

    /* JADX INFO: renamed from: p */
    void mo89278p(@NotNull KmValueParameter kmValueParameter, @NotNull ProtoBuf.ValueParameter valueParameter, @NotNull ReadContext readContext);

    @NotNull
    /* JADX INFO: renamed from: q */
    KmFunctionExtension mo89279q();

    /* JADX INFO: renamed from: r */
    void mo89280r(@NotNull KmFunction kmFunction, @NotNull ProtoBuf.Function function, @NotNull ReadContext readContext);
}
