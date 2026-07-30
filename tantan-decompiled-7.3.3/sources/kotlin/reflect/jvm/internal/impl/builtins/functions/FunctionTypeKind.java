package kotlin.reflect.jvm.internal.impl.builtins.functions;

import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FunctionTypeKind {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final FqName f64629a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f64630b;

    /* JADX INFO: renamed from: c */
    public final boolean f64631c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final ClassId f64632d;

    /* JADX INFO: renamed from: e */
    public final boolean f64633e;

    public static final class Function extends FunctionTypeKind {

        @NotNull
        public static final Function INSTANCE = new Function();

        private Function() {
            super(StandardNames.f64473A, "Function", false, null, true);
        }
    }

    public static final class KFunction extends FunctionTypeKind {

        @NotNull
        public static final KFunction INSTANCE = new KFunction();

        private KFunction() {
            super(StandardNames.f64506x, "KFunction", true, null, false);
        }
    }

    public static final class KSuspendFunction extends FunctionTypeKind {

        @NotNull
        public static final KSuspendFunction INSTANCE = new KSuspendFunction();

        private KSuspendFunction() {
            super(StandardNames.f64506x, "KSuspendFunction", true, null, false);
        }
    }

    public static final class SuspendFunction extends FunctionTypeKind {

        @NotNull
        public static final SuspendFunction INSTANCE = new SuspendFunction();

        private SuspendFunction() {
            super(StandardNames.f64500r, "SuspendFunction", false, null, true);
        }
    }

    public FunctionTypeKind(@NotNull FqName fqName, @NotNull String str, boolean z, @Nullable ClassId classId, boolean z2) {
        fqName.getClass();
        str.getClass();
        this.f64629a = fqName;
        this.f64630b = str;
        this.f64631c = z;
        this.f64632d = classId;
        this.f64633e = z2;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m89218a() {
        return this.f64630b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final FqName m89219b() {
        return this.f64629a;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Name m89220c(int i) {
        Name nameM91970i = Name.m91970i(this.f64630b + i);
        nameM91970i.getClass();
        return nameM91970i;
    }

    @NotNull
    public String toString() {
        return this.f64629a + '.' + this.f64630b + 'N';
    }
}
