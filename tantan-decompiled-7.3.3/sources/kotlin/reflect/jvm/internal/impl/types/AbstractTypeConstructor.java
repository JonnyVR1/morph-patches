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
import p153l.C18562m8;
import p153l.C18817n8;
import p153l.C19048o8;
import p153l.C19322p8;
import p153l.C19536q8;
import p153l.C19787r8;
import p153l.C20002s8;
import p153l.C20254t8;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public abstract class AbstractTypeConstructor extends ClassifierBasedTypeConstructor {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final NotNullLazyValue<C15446b> f66869b;

    /* JADX INFO: renamed from: c */
    public final boolean f66870c;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$a */
    public final class C15445a implements TypeConstructor {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final KotlinTypeRefiner f66871a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final Lazy f66872b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractTypeConstructor f66873c;

        public C15445a(@NotNull AbstractTypeConstructor abstractTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner) {
            kotlinTypeRefiner.getClass();
            this.f66873c = abstractTypeConstructor;
            this.f66871a = kotlinTypeRefiner;
            this.f66872b = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.PUBLICATION, new C20254t8(this, abstractTypeConstructor));
        }

        /* JADX INFO: renamed from: k */
        public static final List m93443k(C15445a c15445a, AbstractTypeConstructor abstractTypeConstructor) {
            return KotlinTypeRefinerKt.m93807b(c15445a.f66871a, abstractTypeConstructor.mo89569c());
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* JADX INFO: renamed from: a */
        public TypeConstructor mo89568a(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            kotlinTypeRefiner.getClass();
            return this.f66873c.mo89568a(kotlinTypeRefiner);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* JADX INFO: renamed from: e */
        public ClassifierDescriptor mo89207e() {
            return this.f66873c.mo89207e();
        }

        public boolean equals(@Nullable Object obj) {
            return this.f66873c.equals(obj);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* JADX INFO: renamed from: f */
        public KotlinBuiltIns mo89570f() {
            KotlinBuiltIns kotlinBuiltInsMo89570f = this.f66873c.mo89570f();
            kotlinBuiltInsMo89570f.getClass();
            return kotlinBuiltInsMo89570f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* JADX INFO: renamed from: g */
        public boolean mo89208g() {
            return this.f66873c.mo89208g();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            List<TypeParameterDescriptor> parameters = this.f66873c.getParameters();
            parameters.getClass();
            return parameters;
        }

        public int hashCode() {
            return this.f66873c.hashCode();
        }

        /* JADX INFO: renamed from: i */
        public final List<KotlinType> m93444i() {
            return (List) this.f66872b.getValue();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public List<KotlinType> mo89569c() {
            return m93444i();
        }

        @NotNull
        public String toString() {
            return this.f66873c.toString();
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$b */
    public static final class C15446b {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final Collection<KotlinType> f66874a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public List<? extends KotlinType> f66875b;

        /* JADX WARN: Multi-variable type inference failed */
        public C15446b(@NotNull Collection<? extends KotlinType> collection) {
            collection.getClass();
            this.f66874a = collection;
            this.f66875b = CollectionsKt.listOf(ErrorUtils.INSTANCE.m93904l());
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Collection<KotlinType> m93446a() {
            return this.f66874a;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final List<KotlinType> m93447b() {
            return this.f66875b;
        }

        /* JADX INFO: renamed from: c */
        public final void m93448c(@NotNull List<? extends KotlinType> list) {
            list.getClass();
            this.f66875b = list;
        }
    }

    public AbstractTypeConstructor(@NotNull StorageManager storageManager) {
        storageManager.getClass();
        this.f66869b = storageManager.mo93334b(new C18562m8(this), C18817n8.INSTANCE, new C19048o8(this));
    }

    /* JADX INFO: renamed from: B */
    public static final C15446b m93424B(AbstractTypeConstructor abstractTypeConstructor) {
        return new C15446b(abstractTypeConstructor.mo89209s());
    }

    /* JADX INFO: renamed from: C */
    public static final C15446b m93425C(boolean z) {
        return new C15446b(CollectionsKt.listOf(ErrorUtils.INSTANCE.m93904l()));
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m93426D(AbstractTypeConstructor abstractTypeConstructor, C15446b c15446b) {
        c15446b.getClass();
        List listMo89486a = abstractTypeConstructor.mo89210w().mo89486a(abstractTypeConstructor, c15446b.m93446a(), new C19322p8(abstractTypeConstructor), new C19536q8(abstractTypeConstructor));
        if (listMo89486a.isEmpty()) {
            KotlinType kotlinTypeMo89582t = abstractTypeConstructor.mo89582t();
            List listListOf = kotlinTypeMo89582t != null ? CollectionsKt.listOf(kotlinTypeMo89582t) : null;
            if (listListOf == null) {
                listListOf = CollectionsKt.emptyList();
            }
            listMo89486a = listListOf;
        }
        if (abstractTypeConstructor.m93439v()) {
            abstractTypeConstructor.mo89210w().mo89486a(abstractTypeConstructor, listMo89486a, new C19787r8(abstractTypeConstructor), new C20002s8(abstractTypeConstructor));
        }
        List<KotlinType> list = listMo89486a instanceof List ? (List) listMo89486a : null;
        if (list == null) {
            list = CollectionsKt.toList(listMo89486a);
        }
        c15446b.m93448c(abstractTypeConstructor.mo89583y(list));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static final Iterable m93427E(AbstractTypeConstructor abstractTypeConstructor, TypeConstructor typeConstructor) {
        typeConstructor.getClass();
        return abstractTypeConstructor.m93438r(typeConstructor, false);
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m93428F(AbstractTypeConstructor abstractTypeConstructor, KotlinType kotlinType) {
        kotlinType.getClass();
        abstractTypeConstructor.mo89580A(kotlinType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static final Iterable m93429G(AbstractTypeConstructor abstractTypeConstructor, TypeConstructor typeConstructor) {
        typeConstructor.getClass();
        return abstractTypeConstructor.m93438r(typeConstructor, true);
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m93430H(AbstractTypeConstructor abstractTypeConstructor, KotlinType kotlinType) {
        kotlinType.getClass();
        abstractTypeConstructor.m93441z(kotlinType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public void mo89580A(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: a */
    public TypeConstructor mo89568a(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return new C15445a(this, kotlinTypeRefiner);
    }

    /* JADX INFO: renamed from: r */
    public final Collection<KotlinType> m93438r(TypeConstructor typeConstructor, boolean z) {
        List listPlus;
        AbstractTypeConstructor abstractTypeConstructor = typeConstructor instanceof AbstractTypeConstructor ? (AbstractTypeConstructor) typeConstructor : null;
        if (abstractTypeConstructor != null && (listPlus = CollectionsKt.plus((Collection) abstractTypeConstructor.f66869b.invoke().m93446a(), (Iterable) abstractTypeConstructor.mo93384u(z))) != null) {
            return listPlus;
        }
        Collection<KotlinType> collectionMo89569c = typeConstructor.mo89569c();
        collectionMo89569c.getClass();
        return collectionMo89569c;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public abstract Collection<KotlinType> mo89209s();

    @Nullable
    /* JADX INFO: renamed from: t */
    public KotlinType mo89582t() {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public Collection<KotlinType> mo93384u(boolean z) {
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: v */
    public boolean m93439v() {
        return this.f66870c;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public abstract SupertypeLoopChecker mo89210w();

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public List<KotlinType> mo89569c() {
        return this.f66869b.invoke().m93447b();
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public List<KotlinType> mo89583y(@NotNull List<KotlinType> list) {
        list.getClass();
        return list;
    }

    /* JADX INFO: renamed from: z */
    public void m93441z(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
    }
}
