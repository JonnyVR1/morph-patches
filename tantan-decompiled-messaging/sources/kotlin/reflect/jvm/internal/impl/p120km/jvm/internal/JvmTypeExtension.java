package kotlin.reflect.jvm.internal.impl.p120km.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.p120km.KmAnnotation;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmExtensionType;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmTypeExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmTypeExtension implements KmTypeExtension {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c */
    @JvmField
    @NotNull
    public static final KmExtensionType f64635c = new KmExtensionType(Reflection.m87507b(JvmTypeExtension.class));

    /* JADX INFO: renamed from: a */
    public boolean f64636a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<KmAnnotation> f64637b = new ArrayList();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<KmAnnotation> m89311a() {
        return this.f64637b;
    }

    /* JADX INFO: renamed from: b */
    public final void m89312b(boolean z) {
        this.f64636a = z;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.m87488d(JvmTypeExtension.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        JvmTypeExtension jvmTypeExtension = (JvmTypeExtension) obj;
        return this.f64636a == jvmTypeExtension.f64636a && Intrinsics.m87488d(this.f64637b, jvmTypeExtension.f64637b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmExtension
    @NotNull
    public KmExtensionType getType() {
        return f64635c;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f64636a) * 31) + this.f64637b.hashCode();
    }
}
