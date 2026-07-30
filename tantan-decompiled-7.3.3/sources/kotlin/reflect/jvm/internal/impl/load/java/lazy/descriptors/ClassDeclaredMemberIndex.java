package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLoadingKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.g85;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public class ClassDeclaredMemberIndex implements DeclaredMemberIndex {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final JavaClass f65521a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Function1<JavaMember, Boolean> f65522b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Function1<JavaMethod, Boolean> f65523c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Map<Name, List<JavaMethod>> f65524d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Map<Name, JavaField> f65525e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Map<Name, JavaRecordComponent> f65526f;

    /* JADX WARN: Multi-variable type inference failed */
    public ClassDeclaredMemberIndex(@NotNull JavaClass javaClass, @NotNull Function1<? super JavaMember, Boolean> function1) {
        javaClass.getClass();
        function1.getClass();
        this.f65521a = javaClass;
        this.f65522b = function1;
        g85 g85Var = new g85(this);
        this.f65523c = g85Var;
        Sequence sequenceM94172A = SequencesKt___SequencesKt.m94172A(CollectionsKt.asSequence(javaClass.getMethods()), g85Var);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sequenceM94172A) {
            Name name = ((JavaMethod) obj).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f65524d = linkedHashMap;
        Sequence sequenceM94172A2 = SequencesKt___SequencesKt.m94172A(CollectionsKt.asSequence(this.f65521a.getFields()), this.f65522b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : sequenceM94172A2) {
            linkedHashMap2.put(((JavaField) obj2).getName(), obj2);
        }
        this.f65525e = linkedHashMap2;
        Collection<JavaRecordComponent> collectionMo89928y = this.f65521a.mo89928y();
        Function1<JavaMember, Boolean> function2 = this.f65522b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : collectionMo89928y) {
            if (function2.invoke((JavaMember) obj3).booleanValue()) {
                arrayList2.add(obj3);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C15274a.m88486b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
        for (Object obj4 : arrayList2) {
            linkedHashMap3.put(((JavaRecordComponent) obj4).getName(), obj4);
        }
        this.f65526f = linkedHashMap3;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m90522h(ClassDeclaredMemberIndex classDeclaredMemberIndex, JavaMethod javaMethod) {
        javaMethod.getClass();
        return classDeclaredMemberIndex.f65522b.invoke(javaMethod).booleanValue() && !JavaLoadingKt.m90794c(javaMethod);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    /* JADX INFO: renamed from: a */
    public Set<Name> mo90523a() {
        Sequence sequenceM94172A = SequencesKt___SequencesKt.m94172A(CollectionsKt.asSequence(this.f65521a.getMethods()), this.f65523c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = sequenceM94172A.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((JavaMethod) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    /* JADX INFO: renamed from: b */
    public Set<Name> mo90524b() {
        return this.f65526f.keySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @Nullable
    /* JADX INFO: renamed from: c */
    public JavaField mo90525c(@NotNull Name name) {
        name.getClass();
        return this.f65525e.get(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    /* JADX INFO: renamed from: d */
    public Set<Name> mo90526d() {
        Sequence sequenceM94172A = SequencesKt___SequencesKt.m94172A(CollectionsKt.asSequence(this.f65521a.getFields()), this.f65522b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = sequenceM94172A.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((JavaField) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    /* JADX INFO: renamed from: e */
    public Collection<JavaMethod> mo90527e(@NotNull Name name) {
        name.getClass();
        List<JavaMethod> list = this.f65524d.get(name);
        return list != null ? list : CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @Nullable
    /* JADX INFO: renamed from: f */
    public JavaRecordComponent mo90528f(@NotNull Name name) {
        name.getClass();
        return this.f65526f.get(name);
    }
}
