package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class FunctionTypeKindExtractor {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final FunctionTypeKindExtractor f63960c = new FunctionTypeKindExtractor(CollectionsKt.listOf((Object[]) new FunctionTypeKind[]{FunctionTypeKind.Function.INSTANCE, FunctionTypeKind.SuspendFunction.INSTANCE, FunctionTypeKind.KFunction.INSTANCE, FunctionTypeKind.KSuspendFunction.INSTANCE}));

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<FunctionTypeKind> f63961a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Map<FqName, List<FunctionTypeKind>> f63962b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final FunctionTypeKindExtractor m88334a() {
            return FunctionTypeKindExtractor.f63960c;
        }

        private Companion() {
        }
    }

    public static final class KindWithArity {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final FunctionTypeKind f63963a;

        /* JADX INFO: renamed from: b */
        public final int f63964b;

        public KindWithArity(@NotNull FunctionTypeKind functionTypeKind, int i) {
            functionTypeKind.getClass();
            this.f63963a = functionTypeKind;
            this.f63964b = i;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final FunctionTypeKind m88335a() {
            return this.f63963a;
        }

        /* JADX INFO: renamed from: b */
        public final int m88336b() {
            return this.f63964b;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final FunctionTypeKind m88337c() {
            return this.f63963a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KindWithArity)) {
                return false;
            }
            KindWithArity kindWithArity = (KindWithArity) obj;
            return Intrinsics.m87488d(this.f63963a, kindWithArity.f63963a) && this.f63964b == kindWithArity.f63964b;
        }

        public int hashCode() {
            return (this.f63963a.hashCode() * 31) + Integer.hashCode(this.f63964b);
        }

        @NotNull
        public String toString() {
            return "KindWithArity(kind=" + this.f63963a + ", arity=" + this.f63964b + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FunctionTypeKindExtractor(@NotNull List<? extends FunctionTypeKind> list) {
        list.getClass();
        this.f63961a = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            FqName fqNameM88328b = ((FunctionTypeKind) obj).m88328b();
            Object arrayList = linkedHashMap.get(fqNameM88328b);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(fqNameM88328b, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f63962b = linkedHashMap;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final FunctionTypeKind m88331b(@NotNull FqName fqName, @NotNull String str) {
        fqName.getClass();
        str.getClass();
        KindWithArity kindWithArityM88332c = m88332c(fqName, str);
        if (kindWithArityM88332c != null) {
            return kindWithArityM88332c.m88337c();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final KindWithArity m88332c(@NotNull FqName fqName, @NotNull String str) {
        Integer numM88333d;
        fqName.getClass();
        str.getClass();
        List<FunctionTypeKind> list = this.f63962b.get(fqName);
        if (list == null) {
            return null;
        }
        for (FunctionTypeKind functionTypeKind : list) {
            if (C15386d.m93483J(str, functionTypeKind.m88327a(), false, 2, null) && (numM88333d = m88333d(str.substring(functionTypeKind.m88327a().length()))) != null) {
                return new KindWithArity(functionTypeKind, numM88333d.intValue());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final Integer m88333d(String str) {
        if (str.length() == 0) {
            return null;
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int iCharAt = str.charAt(i2) - '0';
            if (iCharAt < 0 || iCharAt >= 10) {
                return null;
            }
            i = (i * 10) + iCharAt;
        }
        return Integer.valueOf(i);
    }
}
