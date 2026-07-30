package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JvmType {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Primitive f65056a = new Primitive(JvmPrimitiveType.BOOLEAN);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Primitive f65057b = new Primitive(JvmPrimitiveType.CHAR);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Primitive f65058c = new Primitive(JvmPrimitiveType.BYTE);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Primitive f65059d = new Primitive(JvmPrimitiveType.SHORT);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Primitive f65060e = new Primitive(JvmPrimitiveType.INT);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Primitive f65061f = new Primitive(JvmPrimitiveType.FLOAT);

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Primitive f65062g = new Primitive(JvmPrimitiveType.LONG);

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Primitive f65063h = new Primitive(JvmPrimitiveType.DOUBLE);

    public static final class Array extends JvmType {

        /* JADX INFO: renamed from: i */
        @NotNull
        public final JvmType f65064i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Array(@NotNull JvmType jvmType) {
            super(null);
            jvmType.getClass();
            this.f65064i = jvmType;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final JvmType m90340i() {
            return this.f65064i;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Primitive m90341a() {
            return JvmType.f65056a;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Primitive m90342b() {
            return JvmType.f65058c;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final Primitive m90343c() {
            return JvmType.f65057b;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final Primitive m90344d() {
            return JvmType.f65063h;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final Primitive m90345e() {
            return JvmType.f65061f;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final Primitive m90346f() {
            return JvmType.f65060e;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final Primitive m90347g() {
            return JvmType.f65062g;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final Primitive m90348h() {
            return JvmType.f65059d;
        }

        private Companion() {
        }
    }

    public static final class Object extends JvmType {

        /* JADX INFO: renamed from: i */
        @NotNull
        public final String f65065i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Object(@NotNull String str) {
            super(null);
            str.getClass();
            this.f65065i = str;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final String m90349i() {
            return this.f65065i;
        }
    }

    public static final class Primitive extends JvmType {

        /* JADX INFO: renamed from: i */
        @Nullable
        public final JvmPrimitiveType f65066i;

        public Primitive(@Nullable JvmPrimitiveType jvmPrimitiveType) {
            super(null);
            this.f65066i = jvmPrimitiveType;
        }

        @Nullable
        /* JADX INFO: renamed from: i */
        public final JvmPrimitiveType m90350i() {
            return this.f65066i;
        }
    }

    public /* synthetic */ JvmType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public String toString() {
        return JvmTypeFactoryImpl.INSTANCE.mo90355e(this);
    }

    private JvmType() {
    }
}
