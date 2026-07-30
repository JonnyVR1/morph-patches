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
    public final NameResolver f66702a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final TypeTable f66703b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final SourceElement f66704c;

    public static final class Class extends ProtoContainer {

        /* JADX INFO: renamed from: d */
        @NotNull
        public final ProtoBuf.Class f66705d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public final Class f66706e;

        /* JADX INFO: renamed from: f */
        @NotNull
        public final ClassId f66707f;

        /* JADX INFO: renamed from: g */
        @NotNull
        public final ProtoBuf.Class.Kind f66708g;

        /* JADX INFO: renamed from: h */
        public final boolean f66709h;

        /* JADX INFO: renamed from: i */
        public final boolean f66710i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Class(@NotNull ProtoBuf.Class r2, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @Nullable SourceElement sourceElement, @Nullable Class r6) {
            super(nameResolver, typeTable, sourceElement, null);
            r2.getClass();
            nameResolver.getClass();
            typeTable.getClass();
            this.f66705d = r2;
            this.f66706e = r6;
            this.f66707f = NameResolverUtilKt.m93123a(nameResolver, r2.getFqName());
            ProtoBuf.Class.Kind kindMo91766d = Flags.f66038f.mo91766d(r2.getFlags());
            this.f66708g = kindMo91766d == null ? ProtoBuf.Class.Kind.CLASS : kindMo91766d;
            Boolean boolMo91766d = Flags.f66039g.mo91766d(r2.getFlags());
            boolMo91766d.getClass();
            this.f66709h = boolMo91766d.booleanValue();
            Boolean boolMo91766d2 = Flags.f66040h.mo91766d(r2.getFlags());
            boolMo91766d2.getClass();
            this.f66710i = boolMo91766d2.booleanValue();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        @NotNull
        /* JADX INFO: renamed from: a */
        public FqName mo93126a() {
            return this.f66707f.m91925a();
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final ClassId m93130e() {
            return this.f66707f;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final ProtoBuf.Class m93131f() {
            return this.f66705d;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final ProtoBuf.Class.Kind m93132g() {
            return this.f66708g;
        }

        @Nullable
        /* JADX INFO: renamed from: h */
        public final Class m93133h() {
            return this.f66706e;
        }

        /* JADX INFO: renamed from: i */
        public final boolean m93134i() {
            return this.f66709h;
        }
    }

    public static final class Package extends ProtoContainer {

        /* JADX INFO: renamed from: d */
        @NotNull
        public final FqName f66711d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Package(@NotNull FqName fqName, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @Nullable SourceElement sourceElement) {
            super(nameResolver, typeTable, sourceElement, null);
            fqName.getClass();
            nameResolver.getClass();
            typeTable.getClass();
            this.f66711d = fqName;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        @NotNull
        /* JADX INFO: renamed from: a */
        public FqName mo93126a() {
            return this.f66711d;
        }
    }

    public ProtoContainer(NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement) {
        this.f66702a = nameResolver;
        this.f66703b = typeTable;
        this.f66704c = sourceElement;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract FqName mo93126a();

    @NotNull
    /* JADX INFO: renamed from: b */
    public final NameResolver m93127b() {
        return this.f66702a;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final SourceElement m93128c() {
        return this.f66704c;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final TypeTable m93129d() {
        return this.f66703b;
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + ": " + mo93126a();
    }

    public /* synthetic */ ProtoContainer(NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement, DefaultConstructorMarker defaultConstructorMarker) {
        this(nameResolver, typeTable, sourceElement);
    }
}
