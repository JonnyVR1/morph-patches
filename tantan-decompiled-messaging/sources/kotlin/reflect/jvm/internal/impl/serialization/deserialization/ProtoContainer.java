package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ProtoContainer {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final NameResolver f66028a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final TypeTable f66029b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final SourceElement f66030c;

    public static final class Class extends ProtoContainer {

        /* JADX INFO: renamed from: d */
        @NotNull
        public final ProtoBuf.Class f66031d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public final Class f66032e;

        /* JADX INFO: renamed from: f */
        @NotNull
        public final ClassId f66033f;

        /* JADX INFO: renamed from: g */
        @NotNull
        public final ProtoBuf.Class.Kind f66034g;

        /* JADX INFO: renamed from: h */
        public final boolean f66035h;

        /* JADX INFO: renamed from: i */
        public final boolean f66036i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Class(@NotNull ProtoBuf.Class r2, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @Nullable SourceElement sourceElement, @Nullable Class r6) {
            super(nameResolver, typeTable, sourceElement, null);
            r2.getClass();
            nameResolver.getClass();
            typeTable.getClass();
            this.f66031d = r2;
            this.f66032e = r6;
            this.f66033f = NameResolverUtilKt.m92232a(nameResolver, r2.getFqName());
            ProtoBuf.Class.Kind kindMo90875d = Flags.f65364f.mo90875d(r2.getFlags());
            this.f66034g = kindMo90875d == null ? ProtoBuf.Class.Kind.CLASS : kindMo90875d;
            Boolean boolMo90875d = Flags.f65365g.mo90875d(r2.getFlags());
            boolMo90875d.getClass();
            this.f66035h = boolMo90875d.booleanValue();
            Boolean boolMo90875d2 = Flags.f65366h.mo90875d(r2.getFlags());
            boolMo90875d2.getClass();
            this.f66036i = boolMo90875d2.booleanValue();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        @NotNull
        /* JADX INFO: renamed from: a */
        public FqName mo92235a() {
            return this.f66033f.m91034a();
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final ClassId m92239e() {
            return this.f66033f;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final ProtoBuf.Class m92240f() {
            return this.f66031d;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final ProtoBuf.Class.Kind m92241g() {
            return this.f66034g;
        }

        @Nullable
        /* JADX INFO: renamed from: h */
        public final Class m92242h() {
            return this.f66032e;
        }

        /* JADX INFO: renamed from: i */
        public final boolean m92243i() {
            return this.f66035h;
        }
    }

    public static final class Package extends ProtoContainer {

        /* JADX INFO: renamed from: d */
        @NotNull
        public final FqName f66037d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Package(@NotNull FqName fqName, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @Nullable SourceElement sourceElement) {
            super(nameResolver, typeTable, sourceElement, null);
            fqName.getClass();
            nameResolver.getClass();
            typeTable.getClass();
            this.f66037d = fqName;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        @NotNull
        /* JADX INFO: renamed from: a */
        public FqName mo92235a() {
            return this.f66037d;
        }
    }

    public ProtoContainer(NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement) {
        this.f66028a = nameResolver;
        this.f66029b = typeTable;
        this.f66030c = sourceElement;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract FqName mo92235a();

    @NotNull
    /* JADX INFO: renamed from: b */
    public final NameResolver m92236b() {
        return this.f66028a;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final SourceElement m92237c() {
        return this.f66030c;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final TypeTable m92238d() {
        return this.f66029b;
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + ": " + mo92235a();
    }

    public /* synthetic */ ProtoContainer(NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement, DefaultConstructorMarker defaultConstructorMarker) {
        this(nameResolver, typeTable, sourceElement);
    }
}
