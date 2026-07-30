package kotlin.reflect.jvm.internal.impl.p120km.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.p120km.KmProperty;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmClassExtension;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmExtensionType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmClassExtension implements KmClassExtension {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final KmExtensionType f64615e = new KmExtensionType(Reflection.m87507b(JvmClassExtension.class));

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<KmProperty> f64616a = new ArrayList(0);

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f64617b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f64618c;

    /* JADX INFO: renamed from: d */
    public int f64619d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final KmExtensionType m89295a() {
            return JvmClassExtension.f64615e;
        }

        private Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<KmProperty> m89291b() {
        return this.f64616a;
    }

    /* JADX INFO: renamed from: c */
    public final void m89292c(@Nullable String str) {
        this.f64618c = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m89293d(int i) {
        this.f64619d = i;
    }

    /* JADX INFO: renamed from: e */
    public final void m89294e(@Nullable String str) {
        this.f64617b = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmExtension
    @NotNull
    public KmExtensionType getType() {
        return f64615e;
    }
}
