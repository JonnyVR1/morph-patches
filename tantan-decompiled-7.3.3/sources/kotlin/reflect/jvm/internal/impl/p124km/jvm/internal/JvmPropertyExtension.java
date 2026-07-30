package kotlin.reflect.jvm.internal.impl.p124km.jvm.internal;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmExtensionType;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmPropertyExtension;
import kotlin.reflect.jvm.internal.impl.p124km.jvm.JvmFieldSignature;
import kotlin.reflect.jvm.internal.impl.p124km.jvm.JvmMethodSignature;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmPropertyExtension implements KmPropertyExtension {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: g */
    @JvmField
    @NotNull
    public static final KmExtensionType f65302g = new KmExtensionType(Reflection.m88396b(JvmPropertyExtension.class));

    /* JADX INFO: renamed from: a */
    public int f65303a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public JvmFieldSignature f65304b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public JvmMethodSignature f65305c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public JvmMethodSignature f65306d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public JvmMethodSignature f65307e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public JvmMethodSignature f65308f;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m90196a(@Nullable JvmFieldSignature jvmFieldSignature) {
        this.f65304b = jvmFieldSignature;
    }

    /* JADX INFO: renamed from: b */
    public final void m90197b(@Nullable JvmMethodSignature jvmMethodSignature) {
        this.f65305c = jvmMethodSignature;
    }

    /* JADX INFO: renamed from: c */
    public final void m90198c(int i) {
        this.f65303a = i;
    }

    /* JADX INFO: renamed from: d */
    public final void m90199d(@Nullable JvmMethodSignature jvmMethodSignature) {
        this.f65306d = jvmMethodSignature;
    }

    /* JADX INFO: renamed from: e */
    public final void m90200e(@Nullable JvmMethodSignature jvmMethodSignature) {
        this.f65307e = jvmMethodSignature;
    }

    /* JADX INFO: renamed from: f */
    public final void m90201f(@Nullable JvmMethodSignature jvmMethodSignature) {
        this.f65308f = jvmMethodSignature;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmExtension
    @NotNull
    public KmExtensionType getType() {
        return f65302g;
    }
}
