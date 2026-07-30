package kotlin.reflect.jvm.internal.impl.p124km.jvm.internal;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmExtensionType;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmFunctionExtension;
import kotlin.reflect.jvm.internal.impl.p124km.jvm.JvmMethodSignature;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmFunctionExtension implements KmFunctionExtension {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c */
    @JvmField
    @NotNull
    public static final KmExtensionType f65296c = new KmExtensionType(Reflection.m88396b(JvmFunctionExtension.class));

    /* JADX INFO: renamed from: a */
    @Nullable
    public JvmMethodSignature f65297a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f65298b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m90194a(@Nullable String str) {
        this.f65298b = str;
    }

    /* JADX INFO: renamed from: b */
    public final void m90195b(@Nullable JvmMethodSignature jvmMethodSignature) {
        this.f65297a = jvmMethodSignature;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmExtension
    @NotNull
    public KmExtensionType getType() {
        return f65296c;
    }
}
