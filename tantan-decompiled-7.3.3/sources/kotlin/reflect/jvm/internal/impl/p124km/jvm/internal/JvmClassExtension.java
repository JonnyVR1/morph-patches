package kotlin.reflect.jvm.internal.impl.p124km.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.p124km.KmProperty;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmClassExtension;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmExtensionType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmClassExtension implements KmClassExtension {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final KmExtensionType f65289e = new KmExtensionType(Reflection.m88396b(JvmClassExtension.class));

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<KmProperty> f65290a = new ArrayList(0);

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f65291b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f65292c;

    /* JADX INFO: renamed from: d */
    public int f65293d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final KmExtensionType m90186a() {
            return JvmClassExtension.f65289e;
        }

        private Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<KmProperty> m90182b() {
        return this.f65290a;
    }

    /* JADX INFO: renamed from: c */
    public final void m90183c(@Nullable String str) {
        this.f65292c = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m90184d(int i) {
        this.f65293d = i;
    }

    /* JADX INFO: renamed from: e */
    public final void m90185e(@Nullable String str) {
        this.f65291b = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmExtension
    @NotNull
    public KmExtensionType getType() {
        return f65289e;
    }
}
