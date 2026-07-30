package kotlin.reflect.jvm.internal.impl.p120km.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.p120km.KmAnnotation;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmExtensionType;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmTypeParameterExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmTypeParameterExtension implements KmTypeParameterExtension {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final KmExtensionType f64638b = new KmExtensionType(Reflection.m87507b(JvmTypeParameterExtension.class));

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<KmAnnotation> f64639a = new ArrayList();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<KmAnnotation> m89313a() {
        return this.f64639a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmExtension
    @NotNull
    public KmExtensionType getType() {
        return f64638b;
    }
}
