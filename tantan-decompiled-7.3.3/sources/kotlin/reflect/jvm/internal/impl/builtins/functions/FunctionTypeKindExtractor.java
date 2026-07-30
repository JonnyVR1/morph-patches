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
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class FunctionTypeKindExtractor {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final FunctionTypeKindExtractor f64634c = new FunctionTypeKindExtractor(CollectionsKt.listOf((Object[]) new FunctionTypeKind[]{FunctionTypeKind.Function.INSTANCE, FunctionTypeKind.SuspendFunction.INSTANCE, FunctionTypeKind.KFunction.INSTANCE, FunctionTypeKind.KSuspendFunction.INSTANCE}));

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<FunctionTypeKind> f64635a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Map<FqName, List<FunctionTypeKind>> f64636b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final FunctionTypeKindExtractor m89225a() {
            return FunctionTypeKindExtractor.f64634c;
        }

        private Companion() {
        }
    }

    public static final class KindWithArity {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final FunctionTypeKind f64637a;

        /* JADX INFO: renamed from: b */
        public final int f64638b;

        public KindWithArity(@NotNull FunctionTypeKind functionTypeKind, int i) {
            functionTypeKind.getClass();
            this.f64637a = functionTypeKind;
            this.f64638b = i;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final FunctionTypeKind m89226a() {
            return this.f64637a;
        }

        /* JADX INFO: renamed from: b */
        public final int m89227b() {
            return this.f64638b;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final FunctionTypeKind m89228c() {
            return this.f64637a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KindWithArity)) {
                return false;
            }
            KindWithArity kindWithArity = (KindWithArity) obj;
            return Intrinsics.m88377d(this.f64637a, kindWithArity.f64637a) && this.f64638b == kindWithArity.f64638b;
        }

        public int hashCode() {
            return (this.f64637a.hashCode() * 31) + Integer.hashCode(this.f64638b);
        }

        @NotNull
        public String toString() {
            return "KindWithArity(kind=" + this.f64637a + ", arity=" + this.f64638b + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FunctionTypeKindExtractor(@NotNull List<? extends FunctionTypeKind> list) {
        list.getClass();
        this.f64635a = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            FqName fqNameM89219b = ((FunctionTypeKind) obj).m89219b();
            Object arrayList = linkedHashMap.get(fqNameM89219b);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(fqNameM89219b, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f64636b = linkedHashMap;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final FunctionTypeKind m89222b(@NotNull FqName fqName, @NotNull String str) {
        fqName.getClass();
        str.getClass();
        KindWithArity kindWithArityM89223c = m89223c(fqName, str);
        if (kindWithArityM89223c != null) {
            return kindWithArityM89223c.m89228c();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final KindWithArity m89223c(@NotNull FqName fqName, @NotNull String str) {
        Integer numM89224d;
        fqName.getClass();
        str.getClass();
        List<FunctionTypeKind> list = this.f64636b.get(fqName);
        if (list == null) {
            return null;
        }
        for (FunctionTypeKind functionTypeKind : list) {
            if (C15493d.m94374J(str, functionTypeKind.m89218a(), false, 2, null) && (numM89224d = m89224d(str.substring(functionTypeKind.m89218a().length()))) != null) {
                return new KindWithArity(functionTypeKind, numM89224d.intValue());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final Integer m89224d(String str) {
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
