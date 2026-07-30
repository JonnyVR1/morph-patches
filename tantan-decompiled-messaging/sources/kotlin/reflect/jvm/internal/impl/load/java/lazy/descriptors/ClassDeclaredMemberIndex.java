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
import kotlin.ranges.C15167a;
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
import p149l.f75;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public class ClassDeclaredMemberIndex implements DeclaredMemberIndex {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final JavaClass f64847a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Function1<JavaMember, Boolean> f64848b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Function1<JavaMethod, Boolean> f64849c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Map<Name, List<JavaMethod>> f64850d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Map<Name, JavaField> f64851e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Map<Name, JavaRecordComponent> f64852f;

    /* JADX WARN: Multi-variable type inference failed */
    public ClassDeclaredMemberIndex(@NotNull JavaClass javaClass, @NotNull Function1<? super JavaMember, Boolean> function1) {
        javaClass.getClass();
        function1.getClass();
        this.f64847a = javaClass;
        this.f64848b = function1;
        f75 f75Var = new f75(this);
        this.f64849c = f75Var;
        Sequence sequenceM93281A = SequencesKt___SequencesKt.m93281A(CollectionsKt.asSequence(javaClass.getMethods()), f75Var);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sequenceM93281A) {
            Name name = ((JavaMethod) obj).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f64850d = linkedHashMap;
        Sequence sequenceM93281A2 = SequencesKt___SequencesKt.m93281A(CollectionsKt.asSequence(this.f64847a.getFields()), this.f64848b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : sequenceM93281A2) {
            linkedHashMap2.put(((JavaField) obj2).getName(), obj2);
        }
        this.f64851e = linkedHashMap2;
        Collection<JavaRecordComponent> collectionMo89037y = this.f64847a.mo89037y();
        Function1<JavaMember, Boolean> function2 = this.f64848b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : collectionMo89037y) {
            if (function2.invoke((JavaMember) obj3).booleanValue()) {
                arrayList2.add(obj3);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C15167a.m87596b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
        for (Object obj4 : arrayList2) {
            linkedHashMap3.put(((JavaRecordComponent) obj4).getName(), obj4);
        }
        this.f64852f = linkedHashMap3;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m89631h(ClassDeclaredMemberIndex classDeclaredMemberIndex, JavaMethod javaMethod) {
        javaMethod.getClass();
        return classDeclaredMemberIndex.f64848b.invoke(javaMethod).booleanValue() && !JavaLoadingKt.m89903c(javaMethod);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    /* JADX INFO: renamed from: a */
    public Set<Name> mo89632a() {
        Sequence sequenceM93281A = SequencesKt___SequencesKt.m93281A(CollectionsKt.asSequence(this.f64847a.getMethods()), this.f64849c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = sequenceM93281A.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((JavaMethod) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    /* JADX INFO: renamed from: b */
    public Set<Name> mo89633b() {
        return this.f64852f.keySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @Nullable
    /* JADX INFO: renamed from: c */
    public JavaField mo89634c(@NotNull Name name) {
        name.getClass();
        return this.f64851e.get(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    /* JADX INFO: renamed from: d */
    public Set<Name> mo89635d() {
        Sequence sequenceM93281A = SequencesKt___SequencesKt.m93281A(CollectionsKt.asSequence(this.f64847a.getFields()), this.f64848b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = sequenceM93281A.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((JavaField) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    /* JADX INFO: renamed from: e */
    public Collection<JavaMethod> mo89636e(@NotNull Name name) {
        name.getClass();
        List<JavaMethod> list = this.f64850d.get(name);
        return list != null ? list : CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @Nullable
    /* JADX INFO: renamed from: f */
    public JavaRecordComponent mo89637f(@NotNull Name name) {
        name.getClass();
        return this.f64852f.get(name);
    }
}
