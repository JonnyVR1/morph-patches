package kotlin.reflect.jvm.internal.impl.p124km.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.p124km.KmAnnotation;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmExtensionType;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmTypeExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmTypeExtension implements KmTypeExtension {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c */
    @JvmField
    @NotNull
    public static final KmExtensionType f65309c = new KmExtensionType(Reflection.m88396b(JvmTypeExtension.class));

    /* JADX INFO: renamed from: a */
    public boolean f65310a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<KmAnnotation> f65311b = new ArrayList();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<KmAnnotation> m90202a() {
        return this.f65311b;
    }

    /* JADX INFO: renamed from: b */
    public final void m90203b(boolean z) {
        this.f65310a = z;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.m88377d(JvmTypeExtension.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        JvmTypeExtension jvmTypeExtension = (JvmTypeExtension) obj;
        return this.f65310a == jvmTypeExtension.f65310a && Intrinsics.m88377d(this.f65311b, jvmTypeExtension.f65311b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmExtension
    @NotNull
    public KmExtensionType getType() {
        return f65309c;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f65310a) * 31) + this.f65311b.hashCode();
    }
}
