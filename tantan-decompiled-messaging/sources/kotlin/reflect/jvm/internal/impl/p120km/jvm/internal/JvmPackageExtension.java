package kotlin.reflect.jvm.internal.impl.p120km.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.p120km.KmProperty;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmExtensionType;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmPackageExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmPackageExtension implements KmPackageExtension {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final KmExtensionType f64626b = new KmExtensionType(Reflection.m87507b(JvmPackageExtension.class));

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<KmProperty> f64627a = new ArrayList(0);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmExtension
    @NotNull
    public KmExtensionType getType() {
        return f64626b;
    }
}
