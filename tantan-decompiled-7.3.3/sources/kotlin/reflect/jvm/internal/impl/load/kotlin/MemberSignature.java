package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.nbr;

/* JADX INFO: loaded from: classes2.dex */
public final class MemberSignature {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f65750a;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final MemberSignature m91261a(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            return new MemberSignature(str + '#' + str2, null);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final MemberSignature m91262b(@NotNull JvmMemberSignature jvmMemberSignature) {
            jvmMemberSignature.getClass();
            if (jvmMemberSignature instanceof JvmMemberSignature.Method) {
                JvmMemberSignature.Method method = (JvmMemberSignature.Method) jvmMemberSignature;
                return m91264d(method.m91907e(), method.m91906d());
            }
            if (jvmMemberSignature instanceof JvmMemberSignature.Field) {
                JvmMemberSignature.Field field = (JvmMemberSignature.Field) jvmMemberSignature;
                return m91261a(field.m91903e(), field.m91902d());
            }
            nbr.m162172a();
            return null;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: c */
        public final MemberSignature m91263c(@NotNull NameResolver nameResolver, @NotNull JvmProtoBuf.JvmMethodSignature jvmMethodSignature) {
            nameResolver.getClass();
            jvmMethodSignature.getClass();
            return m91264d(nameResolver.getString(jvmMethodSignature.getName()), nameResolver.getString(jvmMethodSignature.getDesc()));
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: d */
        public final MemberSignature m91264d(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            return new MemberSignature(str + str2, null);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: e */
        public final MemberSignature m91265e(@NotNull MemberSignature memberSignature, int i) {
            memberSignature.getClass();
            return new MemberSignature(memberSignature.m91260a() + '@' + i, null);
        }

        private Companion() {
        }
    }

    public MemberSignature(String str) {
        this.f65750a = str;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m91260a() {
        return this.f65750a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MemberSignature) && Intrinsics.m88377d(this.f65750a, ((MemberSignature) obj).f65750a);
    }

    public int hashCode() {
        return this.f65750a.hashCode();
    }

    @NotNull
    public String toString() {
        return "MemberSignature(signature=" + this.f65750a + ')';
    }

    public /* synthetic */ MemberSignature(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
