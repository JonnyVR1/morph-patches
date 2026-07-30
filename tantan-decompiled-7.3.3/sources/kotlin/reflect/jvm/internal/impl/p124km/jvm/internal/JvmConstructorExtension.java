package kotlin.reflect.jvm.internal.impl.p124km.jvm.internal;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmConstructorExtension;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmExtensionType;
import kotlin.reflect.jvm.internal.impl.p124km.jvm.JvmMethodSignature;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmConstructorExtension implements KmConstructorExtension {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final KmExtensionType f65294b = new KmExtensionType(Reflection.m88396b(JvmConstructorExtension.class));

    /* JADX INFO: renamed from: a */
    @Nullable
    public JvmMethodSignature f65295a;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m90187a(@Nullable JvmMethodSignature jvmMethodSignature) {
        this.f65295a = jvmMethodSignature;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmExtension
    @NotNull
    public KmExtensionType getType() {
        return f65294b;
    }
}
