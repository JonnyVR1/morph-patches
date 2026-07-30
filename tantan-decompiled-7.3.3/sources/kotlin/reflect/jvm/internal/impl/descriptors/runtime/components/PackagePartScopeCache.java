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
    public final DeserializedDescriptorResolver f64990a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ReflectKotlinClassFinder f64991b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ConcurrentHashMap<ClassId, MemberScope> f64992c;

    public PackagePartScopeCache(@NotNull DeserializedDescriptorResolver deserializedDescriptorResolver, @NotNull ReflectKotlinClassFinder reflectKotlinClassFinder) {
        deserializedDescriptorResolver.getClass();
        reflectKotlinClassFinder.getClass();
        this.f64990a = deserializedDescriptorResolver;
        this.f64991b = reflectKotlinClassFinder;
        this.f64992c = new ConcurrentHashMap<>();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final MemberScope m89830a(@NotNull ReflectKotlinClass reflectKotlinClass) {
        Collection collectionListOf;
        reflectKotlinClass.getClass();
        ConcurrentHashMap<ClassId, MemberScope> concurrentHashMap = this.f64992c;
        ClassId classIdMo89840e = reflectKotlinClass.mo89840e();
        MemberScope memberScope = concurrentHashMap.get(classIdMo89840e);
        if (memberScope == null) {
            FqName fqNameM91929f = reflectKotlinClass.mo89840e().m91929f();
            if (reflectKotlinClass.mo89837b().m91307c() == KotlinClassHeader.Kind.MULTIFILE_CLASS) {
                List<String> listM91310f = reflectKotlinClass.mo89837b().m91310f();
                collectionListOf = new ArrayList();
                for (String str : listM91310f) {
                    ClassId.Companion companion = ClassId.Companion;
                    FqName fqNameM92910e = JvmClassName.m92908d(str).m92910e();
                    fqNameM92910e.getClass();
                    KotlinJvmBinaryClass kotlinJvmBinaryClassM91258b = KotlinClassFinderKt.m91258b(this.f64991b, companion.m91936c(fqNameM92910e), this.f64990a.m91198f().m93046g().mo93067f());
                    if (kotlinJvmBinaryClassM91258b != null) {
                        collectionListOf.add(kotlinJvmBinaryClassM91258b);
                    }
                }
            } else {
                collectionListOf = CollectionsKt.listOf(reflectKotlinClass);
            }
            EmptyPackageFragmentDescriptor emptyPackageFragmentDescriptor = new EmptyPackageFragmentDescriptor(this.f64990a.m91198f().m93056q(), fqNameM91929f);
            ArrayList arrayList = new ArrayList();
            Iterator it = collectionListOf.iterator();
            while (it.hasNext()) {
                MemberScope memberScopeM91196c = this.f64990a.m91196c(emptyPackageFragmentDescriptor, (KotlinJvmBinaryClass) it.next());
                if (memberScopeM91196c != null) {
                    arrayList.add(memberScopeM91196c);
                }
            }
            List list = CollectionsKt.toList(arrayList);
            MemberScope memberScopeM92917a = ChainedMemberScope.Companion.m92917a("package " + fqNameM91929f + " (" + reflectKotlinClass + ')', list);
            MemberScope memberScopePutIfAbsent = concurrentHashMap.putIfAbsent(classIdMo89840e, memberScopeM92917a);
            memberScope = memberScopePutIfAbsent == null ? memberScopeM92917a : memberScopePutIfAbsent;
        }
        memberScope.getClass();
        return memberScope;
    }
}
