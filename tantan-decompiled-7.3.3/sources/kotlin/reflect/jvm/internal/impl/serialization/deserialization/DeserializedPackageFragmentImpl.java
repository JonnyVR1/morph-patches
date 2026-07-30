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
import p153l.cyd;
import p153l.dyd;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public abstract class DeserializedPackageFragmentImpl extends DeserializedPackageFragment {

    /* JADX INFO: renamed from: h */
    @NotNull
    public final BinaryVersion f66684h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final DeserializedContainerSource f66685i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final NameResolverImpl f66686j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final ProtoBasedClassDataFinder f66687k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public ProtoBuf.PackageFragment f66688l;

    /* JADX INFO: renamed from: m */
    public MemberScope f66689m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl(@NotNull FqName fqName, @NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull ProtoBuf.PackageFragment packageFragment, @NotNull BinaryVersion binaryVersion, @Nullable DeserializedContainerSource deserializedContainerSource) {
        super(fqName, storageManager, moduleDescriptor);
        fqName.getClass();
        storageManager.getClass();
        moduleDescriptor.getClass();
        packageFragment.getClass();
        binaryVersion.getClass();
        this.f66684h = binaryVersion;
        this.f66685i = deserializedContainerSource;
        ProtoBuf.StringTable strings = packageFragment.getStrings();
        strings.getClass();
        ProtoBuf.QualifiedNameTable qualifiedNames = packageFragment.getQualifiedNames();
        qualifiedNames.getClass();
        NameResolverImpl nameResolverImpl = new NameResolverImpl(strings, qualifiedNames);
        this.f66686j = nameResolverImpl;
        this.f66687k = new ProtoBasedClassDataFinder(packageFragment, nameResolverImpl, binaryVersion, new cyd(this));
        this.f66688l = packageFragment;
    }

    /* JADX INFO: renamed from: H0 */
    public static final SourceElement m93085H0(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl, ClassId classId) {
        classId.getClass();
        DeserializedContainerSource deserializedContainerSource = deserializedPackageFragmentImpl.f66685i;
        if (deserializedContainerSource != null) {
            return deserializedContainerSource;
        }
        SourceElement sourceElement = SourceElement.f64737a;
        sourceElement.getClass();
        return sourceElement;
    }

    /* JADX INFO: renamed from: J0 */
    public static final Collection m93086J0(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl) {
        Collection<ClassId> collectionM93125b = deserializedPackageFragmentImpl.mo93080B0().m93125b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionM93125b) {
            ClassId classId = (ClassId) obj;
            if (!classId.m91933j() && !ClassDeserializer.Companion.m93035a().contains(classId)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ClassId) it.next()).m91931h());
        }
        return arrayList2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
    /* JADX INFO: renamed from: E0 */
    public void mo93082E0(@NotNull DeserializationComponents deserializationComponents) {
        deserializationComponents.getClass();
        ProtoBuf.PackageFragment packageFragment = this.f66688l;
        if (packageFragment == null) {
            wtq0.m207906a("Repeated call to DeserializedPackageFragmentImpl::initialize");
            return;
        }
        this.f66688l = null;
        ProtoBuf.Package r4 = packageFragment.getPackage();
        r4.getClass();
        this.f66689m = new DeserializedPackageMemberScope(this, r4, this.f66686j, this.f66684h, this.f66685i, deserializationComponents, "scope of " + this, new dyd(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
    @NotNull
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public ProtoBasedClassDataFinder mo93080B0() {
        return this.f66687k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    @NotNull
    /* JADX INFO: renamed from: n */
    public MemberScope mo89316n() {
        MemberScope memberScope = this.f66689m;
        if (memberScope != null) {
            return memberScope;
        }
        Intrinsics.m88391r("_memberScope");
        return null;
    }
}
