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
    public static final Primitive f65730a = new Primitive(JvmPrimitiveType.BOOLEAN);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Primitive f65731b = new Primitive(JvmPrimitiveType.CHAR);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Primitive f65732c = new Primitive(JvmPrimitiveType.BYTE);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Primitive f65733d = new Primitive(JvmPrimitiveType.SHORT);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Primitive f65734e = new Primitive(JvmPrimitiveType.INT);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Primitive f65735f = new Primitive(JvmPrimitiveType.FLOAT);

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Primitive f65736g = new Primitive(JvmPrimitiveType.LONG);

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Primitive f65737h = new Primitive(JvmPrimitiveType.DOUBLE);

    public static final class Array extends JvmType {

        /* JADX INFO: renamed from: i */
        @NotNull
        public final JvmType f65738i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Array(@NotNull JvmType jvmType) {
            super(null);
            jvmType.getClass();
            this.f65738i = jvmType;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final JvmType m91231i() {
            return this.f65738i;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Primitive m91232a() {
            return JvmType.f65730a;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Primitive m91233b() {
            return JvmType.f65732c;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final Primitive m91234c() {
            return JvmType.f65731b;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final Primitive m91235d() {
            return JvmType.f65737h;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final Primitive m91236e() {
            return JvmType.f65735f;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final Primitive m91237f() {
            return JvmType.f65734e;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final Primitive m91238g() {
            return JvmType.f65736g;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final Primitive m91239h() {
            return JvmType.f65733d;
        }

        private Companion() {
        }
    }

    public static final class Object extends JvmType {

        /* JADX INFO: renamed from: i */
        @NotNull
        public final String f65739i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Object(@NotNull String str) {
            super(null);
            str.getClass();
            this.f65739i = str;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final String m91240i() {
            return this.f65739i;
        }
    }

    public static final class Primitive extends JvmType {

        /* JADX INFO: renamed from: i */
        @Nullable
        public final JvmPrimitiveType f65740i;

        public Primitive(@Nullable JvmPrimitiveType jvmPrimitiveType) {
            super(null);
            this.f65740i = jvmPrimitiveType;
        }

        @Nullable
        /* JADX INFO: renamed from: i */
        public final JvmPrimitiveType m91241i() {
            return this.f65740i;
        }
    }

    public /* synthetic */ JvmType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public String toString() {
        return JvmTypeFactoryImpl.INSTANCE.mo91246e(this);
    }

    private JvmType() {
    }
}
