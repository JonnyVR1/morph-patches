package kotlin.reflect.jvm.internal.impl.p120km.jvm.internal;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmExtensionType;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmFunctionExtension;
import kotlin.reflect.jvm.internal.impl.p120km.jvm.JvmMethodSignature;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmFunctionExtension implements KmFunctionExtension {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c */
    @JvmField
    @NotNull
    public static final KmExtensionType f64622c = new KmExtensionType(Reflection.m87507b(JvmFunctionExtension.class));

    /* JADX INFO: renamed from: a */
    @Nullable
    public JvmMethodSignature f64623a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f64624b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m89303a(@Nullable String str) {
        this.f64624b = str;
    }

    /* JADX INFO: renamed from: b */
    public final void m89304b(@Nullable JvmMethodSignature jvmMethodSignature) {
        this.f64623a = jvmMethodSignature;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmExtension
    @NotNull
    public KmExtensionType getType() {
        return f64622c;
    }
}
