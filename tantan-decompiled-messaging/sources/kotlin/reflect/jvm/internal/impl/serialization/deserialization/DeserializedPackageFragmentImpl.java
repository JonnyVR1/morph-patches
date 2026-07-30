package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolverImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.owd;
import p149l.pwd;
import p149l.qkq0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public abstract class DeserializedPackageFragmentImpl extends DeserializedPackageFragment {

    /* JADX INFO: renamed from: h */
    @NotNull
    public final BinaryVersion f66010h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final DeserializedContainerSource f66011i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final NameResolverImpl f66012j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final ProtoBasedClassDataFinder f66013k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public ProtoBuf.PackageFragment f66014l;

    /* JADX INFO: renamed from: m */
    public MemberScope f66015m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl(@NotNull FqName fqName, @NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull ProtoBuf.PackageFragment packageFragment, @NotNull BinaryVersion binaryVersion, @Nullable DeserializedContainerSource deserializedContainerSource) {
        super(fqName, storageManager, moduleDescriptor);
        fqName.getClass();
        storageManager.getClass();
        moduleDescriptor.getClass();
        packageFragment.getClass();
        binaryVersion.getClass();
        this.f66010h = binaryVersion;
        this.f66011i = deserializedContainerSource;
        ProtoBuf.StringTable strings = packageFragment.getStrings();
        strings.getClass();
        ProtoBuf.QualifiedNameTable qualifiedNames = packageFragment.getQualifiedNames();
        qualifiedNames.getClass();
        NameResolverImpl nameResolverImpl = new NameResolverImpl(strings, qualifiedNames);
        this.f66012j = nameResolverImpl;
        this.f66013k = new ProtoBasedClassDataFinder(packageFragment, nameResolverImpl, binaryVersion, new owd(this));
        this.f66014l = packageFragment;
    }

    /* JADX INFO: renamed from: H0 */
    public static final SourceElement m92194H0(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl, ClassId classId) {
        classId.getClass();
        DeserializedContainerSource deserializedContainerSource = deserializedPackageFragmentImpl.f66011i;
        if (deserializedContainerSource != null) {
            return deserializedContainerSource;
        }
        SourceElement sourceElement = SourceElement.f64063a;
        sourceElement.getClass();
        return sourceElement;
    }

    /* JADX INFO: renamed from: J0 */
    public static final Collection m92195J0(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl) {
        Collection<ClassId> collectionM92234b = deserializedPackageFragmentImpl.mo92189B0().m92234b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionM92234b) {
            ClassId classId = (ClassId) obj;
            if (!classId.m91042j() && !ClassDeserializer.Companion.m92144a().contains(classId)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ClassId) it.next()).m91040h());
        }
        return arrayList2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
    /* JADX INFO: renamed from: E0 */
    public void mo92191E0(@NotNull DeserializationComponents deserializationComponents) {
        deserializationComponents.getClass();
        ProtoBuf.PackageFragment packageFragment = this.f66014l;
        if (packageFragment == null) {
            qkq0.m175383a("Repeated call to DeserializedPackageFragmentImpl::initialize");
            return;
        }
        this.f66014l = null;
        ProtoBuf.Package r4 = packageFragment.getPackage();
        r4.getClass();
        this.f66015m = new DeserializedPackageMemberScope(this, r4, this.f66012j, this.f66010h, this.f66011i, deserializationComponents, "scope of " + this, new pwd(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
    @NotNull
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public ProtoBasedClassDataFinder mo92189B0() {
        return this.f66013k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    @NotNull
    /* JADX INFO: renamed from: n */
    public MemberScope mo88425n() {
        MemberScope memberScope = this.f66015m;
        if (memberScope != null) {
            return memberScope;
        }
        Intrinsics.m87502r("_memberScope");
        return null;
    }
}
