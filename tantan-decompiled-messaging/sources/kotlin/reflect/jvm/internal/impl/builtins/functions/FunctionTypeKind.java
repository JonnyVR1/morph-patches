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
    public final FqName f63955a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f63956b;

    /* JADX INFO: renamed from: c */
    public final boolean f63957c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final ClassId f63958d;

    /* JADX INFO: renamed from: e */
    public final boolean f63959e;

    public static final class Function extends FunctionTypeKind {

        @NotNull
        public static final Function INSTANCE = new Function();

        private Function() {
            super(StandardNames.f63799A, "Function", false, null, true);
        }
    }

    public static final class KFunction extends FunctionTypeKind {

        @NotNull
        public static final KFunction INSTANCE = new KFunction();

        private KFunction() {
            super(StandardNames.f63832x, "KFunction", true, null, false);
        }
    }

    public static final class KSuspendFunction extends FunctionTypeKind {

        @NotNull
        public static final KSuspendFunction INSTANCE = new KSuspendFunction();

        private KSuspendFunction() {
            super(StandardNames.f63832x, "KSuspendFunction", true, null, false);
        }
    }

    public static final class SuspendFunction extends FunctionTypeKind {

        @NotNull
        public static final SuspendFunction INSTANCE = new SuspendFunction();

        private SuspendFunction() {
            super(StandardNames.f63826r, "SuspendFunction", false, null, true);
        }
    }

    public FunctionTypeKind(@NotNull FqName fqName, @NotNull String str, boolean z, @Nullable ClassId classId, boolean z2) {
        fqName.getClass();
        str.getClass();
        this.f63955a = fqName;
        this.f63956b = str;
        this.f63957c = z;
        this.f63958d = classId;
        this.f63959e = z2;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m88327a() {
        return this.f63956b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final FqName m88328b() {
        return this.f63955a;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Name m88329c(int i) {
        Name nameM91079i = Name.m91079i(this.f63956b + i);
        nameM91079i.getClass();
        return nameM91079i;
    }

    @NotNull
    public String toString() {
        return this.f63955a + '.' + this.f63956b + 'N';
    }
}
