package kotlin.reflect.jvm.internal.impl.p124km.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.p124km.KmAnnotation;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmExtensionType;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmTypeParameterExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmTypeParameterExtension implements KmTypeParameterExtension {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final KmExtensionType f65312b = new KmExtensionType(Reflection.m88396b(JvmTypeParameterExtension.class));

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<KmAnnotation> f65313a = new ArrayList();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<KmAnnotation> m90204a() {
        return this.f65313a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmExtension
    @NotNull
    public KmExtensionType getType() {
        return f65312b;
    }
}
