package kotlin.reflect.jvm.internal.impl.p120km.jvm.internal;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmExtensionType;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmPropertyExtension;
import kotlin.reflect.jvm.internal.impl.p120km.jvm.JvmFieldSignature;
import kotlin.reflect.jvm.internal.impl.p120km.jvm.JvmMethodSignature;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmPropertyExtension implements KmPropertyExtension {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: g */
    @JvmField
    @NotNull
    public static final KmExtensionType f64628g = new KmExtensionType(Reflection.m87507b(JvmPropertyExtension.class));

    /* JADX INFO: renamed from: a */
    public int f64629a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public JvmFieldSignature f64630b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public JvmMethodSignature f64631c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public JvmMethodSignature f64632d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public JvmMethodSignature f64633e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public JvmMethodSignature f64634f;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m89305a(@Nullable JvmFieldSignature jvmFieldSignature) {
        this.f64630b = jvmFieldSignature;
    }

    /* JADX INFO: renamed from: b */
    public final void m89306b(@Nullable JvmMethodSignature jvmMethodSignature) {
        this.f64631c = jvmMethodSignature;
    }

    /* JADX INFO: renamed from: c */
    public final void m89307c(int i) {
        this.f64629a = i;
    }

    /* JADX INFO: renamed from: d */
    public final void m89308d(@Nullable JvmMethodSignature jvmMethodSignature) {
        this.f64632d = jvmMethodSignature;
    }

    /* JADX INFO: renamed from: e */
    public final void m89309e(@Nullable JvmMethodSignature jvmMethodSignature) {
        this.f64633e = jvmMethodSignature;
    }

    /* JADX INFO: renamed from: f */
    public final void m89310f(@Nullable JvmMethodSignature jvmMethodSignature) {
        this.f64634f = jvmMethodSignature;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmExtension
    @NotNull
    public KmExtensionType getType() {
        return f64628g;
    }
}
