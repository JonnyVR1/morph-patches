package kotlin.reflect.jvm.internal.impl.p124km.internal.extensions;

import java.util.List;
import java.util.ServiceLoader;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.p124km.KmClass;
import kotlin.reflect.jvm.internal.impl.p124km.KmConstructor;
import kotlin.reflect.jvm.internal.impl.p124km.KmEnumEntry;
import kotlin.reflect.jvm.internal.impl.p124km.KmFunction;
import kotlin.reflect.jvm.internal.impl.p124km.KmProperty;
import kotlin.reflect.jvm.internal.impl.p124km.KmType;
import kotlin.reflect.jvm.internal.impl.p124km.KmTypeAlias;
import kotlin.reflect.jvm.internal.impl.p124km.KmTypeParameter;
import kotlin.reflect.jvm.internal.impl.p124km.KmValueParameter;
import kotlin.reflect.jvm.internal.impl.p124km.internal.ReadContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.wtq0;
import p153l.y900;

/* JADX INFO: loaded from: classes2.dex */
public interface MetadataExtensions {

    @NotNull
    public static final Companion Companion = Companion.f65283a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f65283a = new Companion();

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final Lazy<List<MetadataExtensions>> f65284b = LazyKt__LazyJVMKt.m88118b(y900.INSTANCE);

        private Companion() {
        }

        /* JADX INFO: renamed from: a */
        public static final List m90172a() {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(MetadataExtensions.class, MetadataExtensions.class.getClassLoader());
            serviceLoaderLoad.getClass();
            List list = CollectionsKt.toList(serviceLoaderLoad);
            if (!list.isEmpty()) {
                return list;
            }
            wtq0.m207906a("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final List<MetadataExtensions> m90174c() {
            return f65284b.getValue();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    KmTypeAliasExtension mo90154a();

    @Nullable
    /* JADX INFO: renamed from: b */
    KmEnumEntryExtension mo90155b();

    /* JADX INFO: renamed from: c */
    void mo90156c(@NotNull KmTypeParameter kmTypeParameter, @NotNull ProtoBuf.TypeParameter typeParameter, @NotNull ReadContext readContext);

    @NotNull
    /* JADX INFO: renamed from: d */
    KmClassExtension mo90157d();

    @NotNull
    /* JADX INFO: renamed from: e */
    KmConstructorExtension mo90158e();

    /* JADX INFO: renamed from: f */
    void mo90159f(@NotNull KmProperty kmProperty, @NotNull ProtoBuf.Property property, @NotNull ReadContext readContext);

    @NotNull
    /* JADX INFO: renamed from: g */
    KmTypeExtension mo90160g();

    @NotNull
    /* JADX INFO: renamed from: h */
    KmTypeParameterExtension mo90161h();

    @Nullable
    /* JADX INFO: renamed from: i */
    KmValueParameterExtension mo90162i();

    /* JADX INFO: renamed from: j */
    void mo90163j(@NotNull KmTypeAlias kmTypeAlias, @NotNull ProtoBuf.TypeAlias typeAlias, @NotNull ReadContext readContext);

    /* JADX INFO: renamed from: k */
    void mo90164k(@NotNull KmEnumEntry kmEnumEntry, @NotNull ProtoBuf.EnumEntry enumEntry, @NotNull ReadContext readContext);

    /* JADX INFO: renamed from: l */
    void mo90165l(@NotNull KmConstructor kmConstructor, @NotNull ProtoBuf.Constructor constructor, @NotNull ReadContext readContext);

    @NotNull
    /* JADX INFO: renamed from: m */
    KmPropertyExtension mo90166m();

    /* JADX INFO: renamed from: n */
    void mo90167n(@NotNull KmType kmType, @NotNull ProtoBuf.Type type, @NotNull ReadContext readContext);

    /* JADX INFO: renamed from: o */
    void mo90168o(@NotNull KmClass kmClass, @NotNull ProtoBuf.Class r2, @NotNull ReadContext readContext);

    /* JADX INFO: renamed from: p */
    void mo90169p(@NotNull KmValueParameter kmValueParameter, @NotNull ProtoBuf.ValueParameter valueParameter, @NotNull ReadContext readContext);

    @NotNull
    /* JADX INFO: renamed from: q */
    KmFunctionExtension mo90170q();

    /* JADX INFO: renamed from: r */
    void mo90171r(@NotNull KmFunction kmFunction, @NotNull ProtoBuf.Function function, @NotNull ReadContext readContext);
}
