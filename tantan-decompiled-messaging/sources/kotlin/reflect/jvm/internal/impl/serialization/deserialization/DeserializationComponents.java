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
    public final StorageManager f65978a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ModuleDescriptor f65979b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final DeserializationConfiguration f65980c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final ClassDataFinder f65981d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> f65982e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final PackageFragmentProvider f65983f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final LocalClassifierTypeSettings f65984g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final ErrorReporter f65985h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final LookupTracker f65986i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final FlexibleTypeDeserializer f65987j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final Iterable<ClassDescriptorFactory> f65988k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final NotFoundClasses f65989l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final ContractDeserializer f65990m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final AdditionalClassPartsProvider f65991n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final PlatformDependentDeclarationFilter f65992o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final ExtensionRegistryLite f65993p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final NewKotlinTypeChecker f65994q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final SamConversionResolver f65995r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final List<TypeAttributeTranslator> f65996s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public final EnumEntriesDeserializationSupport f65997t;

    /* JADX INFO: renamed from: u */
    @NotNull
    public final ClassDeserializer f65998u;

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
        this.f65978a = storageManager;
        this.f65979b = moduleDescriptor;
        this.f65980c = deserializationConfiguration;
        this.f65981d = classDataFinder;
        this.f65982e = annotationAndConstantLoader;
        this.f65983f = packageFragmentProvider;
        this.f65984g = localClassifierTypeSettings;
        this.f65985h = errorReporter;
        this.f65986i = lookupTracker;
        this.f65987j = flexibleTypeDeserializer;
        this.f65988k = iterable;
        this.f65989l = notFoundClasses;
        this.f65990m = contractDeserializer;
        this.f65991n = additionalClassPartsProvider;
        this.f65992o = platformDependentDeclarationFilter;
        this.f65993p = extensionRegistryLite;
        this.f65994q = newKotlinTypeChecker;
        this.f65995r = samConversionResolver;
        this.f65996s = list;
        this.f65997t = enumEntriesDeserializationSupport;
        this.f65998u = new ClassDeserializer(this);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final DeserializationContext m92149a(@NotNull PackageFragmentDescriptor packageFragmentDescriptor, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @NotNull BinaryVersion binaryVersion, @Nullable DeserializedContainerSource deserializedContainerSource) {
        packageFragmentDescriptor.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        versionRequirementTable.getClass();
        binaryVersion.getClass();
        return new DeserializationContext(this, nameResolver, packageFragmentDescriptor, typeTable, versionRequirementTable, binaryVersion, deserializedContainerSource, null, CollectionsKt.emptyList());
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final ClassDescriptor m92150b(@NotNull ClassId classId) {
        classId.getClass();
        return ClassDeserializer.m92141f(this.f65998u, classId, null, 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final AdditionalClassPartsProvider m92151c() {
        return this.f65991n;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> m92152d() {
        return this.f65982e;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final ClassDataFinder m92153e() {
        return this.f65981d;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final ClassDeserializer m92154f() {
        return this.f65998u;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final DeserializationConfiguration m92155g() {
        return this.f65980c;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final ContractDeserializer m92156h() {
        return this.f65990m;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final EnumEntriesDeserializationSupport m92157i() {
        return this.f65997t;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final ErrorReporter m92158j() {
        return this.f65985h;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final ExtensionRegistryLite m92159k() {
        return this.f65993p;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final Iterable<ClassDescriptorFactory> m92160l() {
        return this.f65988k;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final FlexibleTypeDeserializer m92161m() {
        return this.f65987j;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final NewKotlinTypeChecker m92162n() {
        return this.f65994q;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final LocalClassifierTypeSettings m92163o() {
        return this.f65984g;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final LookupTracker m92164p() {
        return this.f65986i;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final ModuleDescriptor m92165q() {
        return this.f65979b;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final NotFoundClasses m92166r() {
        return this.f65989l;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final PackageFragmentProvider m92167s() {
        return this.f65983f;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final PlatformDependentDeclarationFilter m92168t() {
        return this.f65992o;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final StorageManager m92169u() {
        return this.f65978a;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final List<TypeAttributeTranslator> m92170v() {
        return this.f65996s;
    }

    public /* synthetic */ DeserializationComponents(StorageManager storageManager, ModuleDescriptor moduleDescriptor, DeserializationConfiguration deserializationConfiguration, ClassDataFinder classDataFinder, AnnotationAndConstantLoader annotationAndConstantLoader, PackageFragmentProvider packageFragmentProvider, LocalClassifierTypeSettings localClassifierTypeSettings, ErrorReporter errorReporter, LookupTracker lookupTracker, FlexibleTypeDeserializer flexibleTypeDeserializer, Iterable iterable, NotFoundClasses notFoundClasses, ContractDeserializer contractDeserializer, AdditionalClassPartsProvider additionalClassPartsProvider, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, ExtensionRegistryLite extensionRegistryLite, NewKotlinTypeChecker newKotlinTypeChecker, SamConversionResolver samConversionResolver, List list, EnumEntriesDeserializationSupport enumEntriesDeserializationSupport, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, moduleDescriptor, deserializationConfiguration, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, localClassifierTypeSettings, errorReporter, lookupTracker, flexibleTypeDeserializer, iterable, notFoundClasses, contractDeserializer, (i & 8192) != 0 ? AdditionalClassPartsProvider.None.INSTANCE : additionalClassPartsProvider, (i & 16384) != 0 ? PlatformDependentDeclarationFilter.All.INSTANCE : platformDependentDeclarationFilter, extensionRegistryLite, (65536 & i) != 0 ? NewKotlinTypeChecker.Companion.m92940a() : newKotlinTypeChecker, samConversionResolver, (262144 & i) != 0 ? CollectionsKt.listOf(DefaultTypeAttributeTranslator.INSTANCE) : list, (i & 524288) != 0 ? EnumEntriesDeserializationSupport.Default.INSTANCE : enumEntriesDeserializationSupport);
    }
}
