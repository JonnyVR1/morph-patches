package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class PackagePartScopeCache {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final DeserializedDescriptorResolver f64316a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ReflectKotlinClassFinder f64317b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ConcurrentHashMap<ClassId, MemberScope> f64318c;

    public PackagePartScopeCache(@NotNull DeserializedDescriptorResolver deserializedDescriptorResolver, @NotNull ReflectKotlinClassFinder reflectKotlinClassFinder) {
        deserializedDescriptorResolver.getClass();
        reflectKotlinClassFinder.getClass();
        this.f64316a = deserializedDescriptorResolver;
        this.f64317b = reflectKotlinClassFinder;
        this.f64318c = new ConcurrentHashMap<>();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final MemberScope m88939a(@NotNull ReflectKotlinClass reflectKotlinClass) {
        Collection collectionListOf;
        reflectKotlinClass.getClass();
        ConcurrentHashMap<ClassId, MemberScope> concurrentHashMap = this.f64318c;
        ClassId classIdMo88949e = reflectKotlinClass.mo88949e();
        MemberScope memberScope = concurrentHashMap.get(classIdMo88949e);
        if (memberScope == null) {
            FqName fqNameM91038f = reflectKotlinClass.mo88949e().m91038f();
            if (reflectKotlinClass.mo88946b().m90416c() == KotlinClassHeader.Kind.MULTIFILE_CLASS) {
                List<String> listM90419f = reflectKotlinClass.mo88946b().m90419f();
                collectionListOf = new ArrayList();
                for (String str : listM90419f) {
                    ClassId.Companion companion = ClassId.Companion;
                    FqName fqNameM92019e = JvmClassName.m92017d(str).m92019e();
                    fqNameM92019e.getClass();
                    KotlinJvmBinaryClass kotlinJvmBinaryClassM90367b = KotlinClassFinderKt.m90367b(this.f64317b, companion.m91045c(fqNameM92019e), this.f64316a.m90307f().m92155g().mo92176f());
                    if (kotlinJvmBinaryClassM90367b != null) {
                        collectionListOf.add(kotlinJvmBinaryClassM90367b);
                    }
                }
            } else {
                collectionListOf = CollectionsKt.listOf(reflectKotlinClass);
            }
            EmptyPackageFragmentDescriptor emptyPackageFragmentDescriptor = new EmptyPackageFragmentDescriptor(this.f64316a.m90307f().m92165q(), fqNameM91038f);
            ArrayList arrayList = new ArrayList();
            Iterator it = collectionListOf.iterator();
            while (it.hasNext()) {
                MemberScope memberScopeM90305c = this.f64316a.m90305c(emptyPackageFragmentDescriptor, (KotlinJvmBinaryClass) it.next());
                if (memberScopeM90305c != null) {
                    arrayList.add(memberScopeM90305c);
                }
            }
            List list = CollectionsKt.toList(arrayList);
            MemberScope memberScopeM92026a = ChainedMemberScope.Companion.m92026a("package " + fqNameM91038f + " (" + reflectKotlinClass + ')', list);
            MemberScope memberScopePutIfAbsent = concurrentHashMap.putIfAbsent(classIdMo88949e, memberScopeM92026a);
            memberScope = memberScopePutIfAbsent == null ? memberScopeM92026a : memberScopePutIfAbsent;
        }
        memberScope.getClass();
        return memberScope;
    }
}
