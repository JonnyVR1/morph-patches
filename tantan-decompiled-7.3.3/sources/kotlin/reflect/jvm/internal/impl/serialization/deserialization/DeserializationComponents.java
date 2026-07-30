package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class DeserializationComponents {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final StorageManager f66652a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ModuleDescriptor f66653b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final DeserializationConfiguration f66654c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final ClassDataFinder f66655d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> f66656e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final PackageFragmentProvider f66657f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final LocalClassifierTypeSettings f66658g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final ErrorReporter f66659h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final LookupTracker f66660i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final FlexibleTypeDeserializer f66661j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final Iterable<ClassDescriptorFactory> f66662k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final NotFoundClasses f66663l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final ContractDeserializer f66664m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final AdditionalClassPartsProvider f66665n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final PlatformDependentDeclarationFilter f66666o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final ExtensionRegistryLite f66667p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final NewKotlinTypeChecker f66668q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final SamConversionResolver f66669r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final List<TypeAttributeTranslator> f66670s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public final EnumEntriesDeserializationSupport f66671t;

    /* JADX INFO: renamed from: u */
    @NotNull
    public final ClassDeserializer f66672u;

    /* JADX WARN: Multi-variable type inference failed */
    public DeserializationComponents(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull DeserializationConfiguration deserializationConfiguration, @NotNull ClassDataFinder classDataFinder, @NotNull AnnotationAndConstantLoader<? extends AnnotationDescriptor, ? extends ConstantValue<?>> annotationAndConstantLoader, @NotNull PackageFragmentProvider packageFragmentProvider, @NotNull LocalClassifierTypeSettings localClassifierTypeSettings, @NotNull ErrorReporter errorReporter, @NotNull LookupTracker lookupTracker, @NotNull FlexibleTypeDeserializer flexibleTypeDeserializer, @NotNull Iterable<? extends ClassDescriptorFactory> iterable, @NotNull NotFoundClasses notFoundClasses, @NotNull ContractDeserializer contractDeserializer, @NotNull AdditionalClassPartsProvider additionalClassPartsProvider, @NotNull PlatformDependentDeclarationFilter platformDependentDeclarationFilter, @NotNull ExtensionRegistryLite extensionRegistryLite, @NotNull NewKotlinTypeChecker newKotlinTypeChecker, @NotNull SamConversionResolver samConversionResolver, @NotNull List<? extends TypeAttributeTranslator> list, @NotNull EnumEntriesDeserializationSupport enumEntriesDeserializationSupport) {
        storageManager.getClass();
        moduleDescriptor.getClass();
        deserializationConfiguration.getClass();
        classDataFinder.getClass();
        annotationAndConstantLoader.getClass();
        packageFragmentProvider.getClass();
        localClassifierTypeSettings.getClass();
        errorReporter.getClass();
        lookupTracker.getClass();
        flexibleTypeDeserializer.getClass();
        iterable.getClass();
        notFoundClasses.getClass();
        contractDeserializer.getClass();
        additionalClassPartsProvider.getClass();
        platformDependentDeclarationFilter.getClass();
        extensionRegistryLite.getClass();
        newKotlinTypeChecker.getClass();
        samConversionResolver.getClass();
        list.getClass();
        enumEntriesDeserializationSupport.getClass();
        this.f66652a = storageManager;
        this.f66653b = moduleDescriptor;
        this.f66654c = deserializationConfiguration;
        this.f66655d = classDataFinder;
        this.f66656e = annotationAndConstantLoader;
        this.f66657f = packageFragmentProvider;
        this.f66658g = localClassifierTypeSettings;
        this.f66659h = errorReporter;
        this.f66660i = lookupTracker;
        this.f66661j = flexibleTypeDeserializer;
        this.f66662k = iterable;
        this.f66663l = notFoundClasses;
        this.f66664m = contractDeserializer;
        this.f66665n = additionalClassPartsProvider;
        this.f66666o = platformDependentDeclarationFilter;
        this.f66667p = extensionRegistryLite;
        this.f66668q = newKotlinTypeChecker;
        this.f66669r = samConversionResolver;
        this.f66670s = list;
        this.f66671t = enumEntriesDeserializationSupport;
        this.f66672u = new ClassDeserializer(this);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final DeserializationContext m93040a(@NotNull PackageFragmentDescriptor packageFragmentDescriptor, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @NotNull BinaryVersion binaryVersion, @Nullable DeserializedContainerSource deserializedContainerSource) {
        packageFragmentDescriptor.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        versionRequirementTable.getClass();
        binaryVersion.getClass();
        return new DeserializationContext(this, nameResolver, packageFragmentDescriptor, typeTable, versionRequirementTable, binaryVersion, deserializedContainerSource, null, CollectionsKt.emptyList());
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final ClassDescriptor m93041b(@NotNull ClassId classId) {
        classId.getClass();
        return ClassDeserializer.m93032f(this.f66672u, classId, null, 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final AdditionalClassPartsProvider m93042c() {
        return this.f66665n;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> m93043d() {
        return this.f66656e;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final ClassDataFinder m93044e() {
        return this.f66655d;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final ClassDeserializer m93045f() {
        return this.f66672u;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final DeserializationConfiguration m93046g() {
        return this.f66654c;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final ContractDeserializer m93047h() {
        return this.f66664m;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final EnumEntriesDeserializationSupport m93048i() {
        return this.f66671t;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final ErrorReporter m93049j() {
        return this.f66659h;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final ExtensionRegistryLite m93050k() {
        return this.f66667p;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final Iterable<ClassDescriptorFactory> m93051l() {
        return this.f66662k;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final FlexibleTypeDeserializer m93052m() {
        return this.f66661j;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final NewKotlinTypeChecker m93053n() {
        return this.f66668q;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final LocalClassifierTypeSettings m93054o() {
        return this.f66658g;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final LookupTracker m93055p() {
        return this.f66660i;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final ModuleDescriptor m93056q() {
        return this.f66653b;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final NotFoundClasses m93057r() {
        return this.f66663l;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final PackageFragmentProvider m93058s() {
        return this.f66657f;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final PlatformDependentDeclarationFilter m93059t() {
        return this.f66666o;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final StorageManager m93060u() {
        return this.f66652a;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final List<TypeAttributeTranslator> m93061v() {
        return this.f66670s;
    }

    public /* synthetic */ DeserializationComponents(StorageManager storageManager, ModuleDescriptor moduleDescriptor, DeserializationConfiguration deserializationConfiguration, ClassDataFinder classDataFinder, AnnotationAndConstantLoader annotationAndConstantLoader, PackageFragmentProvider packageFragmentProvider, LocalClassifierTypeSettings localClassifierTypeSettings, ErrorReporter errorReporter, LookupTracker lookupTracker, FlexibleTypeDeserializer flexibleTypeDeserializer, Iterable iterable, NotFoundClasses notFoundClasses, ContractDeserializer contractDeserializer, AdditionalClassPartsProvider additionalClassPartsProvider, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, ExtensionRegistryLite extensionRegistryLite, NewKotlinTypeChecker newKotlinTypeChecker, SamConversionResolver samConversionResolver, List list, EnumEntriesDeserializationSupport enumEntriesDeserializationSupport, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, moduleDescriptor, deserializationConfiguration, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, localClassifierTypeSettings, errorReporter, lookupTracker, flexibleTypeDeserializer, iterable, notFoundClasses, contractDeserializer, (i & 8192) != 0 ? AdditionalClassPartsProvider.None.INSTANCE : additionalClassPartsProvider, (i & 16384) != 0 ? PlatformDependentDeclarationFilter.All.INSTANCE : platformDependentDeclarationFilter, extensionRegistryLite, (65536 & i) != 0 ? NewKotlinTypeChecker.Companion.m93831a() : newKotlinTypeChecker, samConversionResolver, (262144 & i) != 0 ? CollectionsKt.listOf(DefaultTypeAttributeTranslator.INSTANCE) : list, (i & 524288) != 0 ? EnumEntriesDeserializationSupport.Default.INSTANCE : enumEntriesDeserializationSupport);
    }
}
