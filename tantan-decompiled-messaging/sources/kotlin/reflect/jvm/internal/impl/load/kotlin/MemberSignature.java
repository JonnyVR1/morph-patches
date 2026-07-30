package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.l9r;

/* JADX INFO: loaded from: classes2.dex */
public final class MemberSignature {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f65076a;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final MemberSignature m90370a(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            return new MemberSignature(str + '#' + str2, null);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final MemberSignature m90371b(@NotNull JvmMemberSignature jvmMemberSignature) {
            jvmMemberSignature.getClass();
            if (jvmMemberSignature instanceof JvmMemberSignature.Method) {
                JvmMemberSignature.Method method = (JvmMemberSignature.Method) jvmMemberSignature;
                return m90373d(method.m91016e(), method.m91015d());
            }
            if (jvmMemberSignature instanceof JvmMemberSignature.Field) {
                JvmMemberSignature.Field field = (JvmMemberSignature.Field) jvmMemberSignature;
                return m90370a(field.m91012e(), field.m91011d());
            }
            l9r.m149037a();
            return null;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: c */
        public final MemberSignature m90372c(@NotNull NameResolver nameResolver, @NotNull JvmProtoBuf.JvmMethodSignature jvmMethodSignature) {
            nameResolver.getClass();
            jvmMethodSignature.getClass();
            return m90373d(nameResolver.getString(jvmMethodSignature.getName()), nameResolver.getString(jvmMethodSignature.getDesc()));
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: d */
        public final MemberSignature m90373d(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            return new MemberSignature(str + str2, null);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: e */
        public final MemberSignature m90374e(@NotNull MemberSignature memberSignature, int i) {
            memberSignature.getClass();
            return new MemberSignature(memberSignature.m90369a() + '@' + i, null);
        }

        private Companion() {
        }
    }

    public MemberSignature(String str) {
        this.f65076a = str;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m90369a() {
        return this.f65076a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MemberSignature) && Intrinsics.m87488d(this.f65076a, ((MemberSignature) obj).f65076a);
    }

    public int hashCode() {
        return this.f65076a.hashCode();
    }

    @NotNull
    public String toString() {
        return "MemberSignature(signature=" + this.f65076a + ')';
    }

    public /* synthetic */ MemberSignature(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
