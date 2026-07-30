package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefinerKt;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.C19652r8;
import p149l.C19870s8;
import p149l.C20125t8;
import p149l.C20376u8;
import p149l.C20595v8;
import p149l.C20830w8;
import p149l.C21040x8;
import p149l.C21332y8;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public abstract class AbstractTypeConstructor extends ClassifierBasedTypeConstructor {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final NotNullLazyValue<C15339b> f66195b;

    /* JADX INFO: renamed from: c */
    public final boolean f66196c;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$a */
    public final class C15338a implements TypeConstructor {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final KotlinTypeRefiner f66197a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final Lazy f66198b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractTypeConstructor f66199c;

        public C15338a(@NotNull AbstractTypeConstructor abstractTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner) {
            kotlinTypeRefiner.getClass();
            this.f66199c = abstractTypeConstructor;
            this.f66197a = kotlinTypeRefiner;
            this.f66198b = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.PUBLICATION, new C21332y8(this, abstractTypeConstructor));
        }

        /* JADX INFO: renamed from: k */
        public static final List m92552k(C15338a c15338a, AbstractTypeConstructor abstractTypeConstructor) {
            return KotlinTypeRefinerKt.m92916b(c15338a.f66197a, abstractTypeConstructor.mo88678c());
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* JADX INFO: renamed from: a */
        public TypeConstructor mo88677a(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            kotlinTypeRefiner.getClass();
            return this.f66199c.mo88677a(kotlinTypeRefiner);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* JADX INFO: renamed from: e */
        public ClassifierDescriptor mo88316e() {
            return this.f66199c.mo88316e();
        }

        public boolean equals(@Nullable Object obj) {
            return this.f66199c.equals(obj);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* JADX INFO: renamed from: f */
        public KotlinBuiltIns mo88679f() {
            KotlinBuiltIns kotlinBuiltInsMo88679f = this.f66199c.mo88679f();
            kotlinBuiltInsMo88679f.getClass();
            return kotlinBuiltInsMo88679f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* JADX INFO: renamed from: g */
        public boolean mo88317g() {
            return this.f66199c.mo88317g();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            List<TypeParameterDescriptor> parameters = this.f66199c.getParameters();
            parameters.getClass();
            return parameters;
        }

        public int hashCode() {
            return this.f66199c.hashCode();
        }

        /* JADX INFO: renamed from: i */
        public final List<KotlinType> m92553i() {
            return (List) this.f66198b.getValue();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public List<KotlinType> mo88678c() {
            return m92553i();
        }

        @NotNull
        public String toString() {
            return this.f66199c.toString();
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$b */
    public static final class C15339b {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final Collection<KotlinType> f66200a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public List<? extends KotlinType> f66201b;

        /* JADX WARN: Multi-variable type inference failed */
        public C15339b(@NotNull Collection<? extends KotlinType> collection) {
            collection.getClass();
            this.f66200a = collection;
            this.f66201b = CollectionsKt.listOf(ErrorUtils.INSTANCE.m93013l());
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Collection<KotlinType> m92555a() {
            return this.f66200a;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final List<KotlinType> m92556b() {
            return this.f66201b;
        }

        /* JADX INFO: renamed from: c */
        public final void m92557c(@NotNull List<? extends KotlinType> list) {
            list.getClass();
            this.f66201b = list;
        }
    }

    public AbstractTypeConstructor(@NotNull StorageManager storageManager) {
        storageManager.getClass();
        this.f66195b = storageManager.mo92443b(new C19652r8(this), C19870s8.INSTANCE, new C20125t8(this));
    }

    /* JADX INFO: renamed from: B */
    public static final C15339b m92533B(AbstractTypeConstructor abstractTypeConstructor) {
        return new C15339b(abstractTypeConstructor.mo88318s());
    }

    /* JADX INFO: renamed from: C */
    public static final C15339b m92534C(boolean z) {
        return new C15339b(CollectionsKt.listOf(ErrorUtils.INSTANCE.m93013l()));
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m92535D(AbstractTypeConstructor abstractTypeConstructor, C15339b c15339b) {
        c15339b.getClass();
        List listMo88595a = abstractTypeConstructor.mo88319w().mo88595a(abstractTypeConstructor, c15339b.m92555a(), new C20376u8(abstractTypeConstructor), new C20595v8(abstractTypeConstructor));
        if (listMo88595a.isEmpty()) {
            KotlinType kotlinTypeMo88691t = abstractTypeConstructor.mo88691t();
            List listListOf = kotlinTypeMo88691t != null ? CollectionsKt.listOf(kotlinTypeMo88691t) : null;
            if (listListOf == null) {
                listListOf = CollectionsKt.emptyList();
            }
            listMo88595a = listListOf;
        }
        if (abstractTypeConstructor.m92548v()) {
            abstractTypeConstructor.mo88319w().mo88595a(abstractTypeConstructor, listMo88595a, new C20830w8(abstractTypeConstructor), new C21040x8(abstractTypeConstructor));
        }
        List<KotlinType> list = listMo88595a instanceof List ? (List) listMo88595a : null;
        if (list == null) {
            list = CollectionsKt.toList(listMo88595a);
        }
        c15339b.m92557c(abstractTypeConstructor.mo88692y(list));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static final Iterable m92536E(AbstractTypeConstructor abstractTypeConstructor, TypeConstructor typeConstructor) {
        typeConstructor.getClass();
        return abstractTypeConstructor.m92547r(typeConstructor, false);
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m92537F(AbstractTypeConstructor abstractTypeConstructor, KotlinType kotlinType) {
        kotlinType.getClass();
        abstractTypeConstructor.mo88689A(kotlinType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static final Iterable m92538G(AbstractTypeConstructor abstractTypeConstructor, TypeConstructor typeConstructor) {
        typeConstructor.getClass();
        return abstractTypeConstructor.m92547r(typeConstructor, true);
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m92539H(AbstractTypeConstructor abstractTypeConstructor, KotlinType kotlinType) {
        kotlinType.getClass();
        abstractTypeConstructor.m92550z(kotlinType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public void mo88689A(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: a */
    public TypeConstructor mo88677a(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return new C15338a(this, kotlinTypeRefiner);
    }

    /* JADX INFO: renamed from: r */
    public final Collection<KotlinType> m92547r(TypeConstructor typeConstructor, boolean z) {
        List listPlus;
        AbstractTypeConstructor abstractTypeConstructor = typeConstructor instanceof AbstractTypeConstructor ? (AbstractTypeConstructor) typeConstructor : null;
        if (abstractTypeConstructor != null && (listPlus = CollectionsKt.plus((Collection) abstractTypeConstructor.f66195b.invoke().m92555a(), (Iterable) abstractTypeConstructor.mo92493u(z))) != null) {
            return listPlus;
        }
        Collection<KotlinType> collectionMo88678c = typeConstructor.mo88678c();
        collectionMo88678c.getClass();
        return collectionMo88678c;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public abstract Collection<KotlinType> mo88318s();

    @Nullable
    /* JADX INFO: renamed from: t */
    public KotlinType mo88691t() {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public Collection<KotlinType> mo92493u(boolean z) {
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: v */
    public boolean m92548v() {
        return this.f66196c;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public abstract SupertypeLoopChecker mo88319w();

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public List<KotlinType> mo88678c() {
        return this.f66195b.invoke().m92556b();
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public List<KotlinType> mo88692y(@NotNull List<KotlinType> list) {
        list.getClass();
        return list;
    }

    /* JADX INFO: renamed from: z */
    public void m92550z(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
    }
}
