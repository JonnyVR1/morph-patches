package kotlin.reflect.jvm.internal.impl.p120km.jvm.internal;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmConstructorExtension;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmExtensionType;
import kotlin.reflect.jvm.internal.impl.p120km.jvm.JvmMethodSignature;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmConstructorExtension implements KmConstructorExtension {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final KmExtensionType f64620b = new KmExtensionType(Reflection.m87507b(JvmConstructorExtension.class));

    /* JADX INFO: renamed from: a */
    @Nullable
    public JvmMethodSignature f64621a;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m89296a(@Nullable JvmMethodSignature jvmMethodSignature) {
        this.f64621a = jvmMethodSignature;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmExtension
    @NotNull
    public KmExtensionType getType() {
        return f64620b;
    }
}
