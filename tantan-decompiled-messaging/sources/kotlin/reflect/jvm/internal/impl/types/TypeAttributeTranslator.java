package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.qq3;

/* JADX INFO: loaded from: classes2.dex */
public interface TypeAttributeTranslator {

    public static final class DefaultImpls {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ TypeAttributes m92698a(TypeAttributeTranslator typeAttributeTranslator, Annotations annotations, TypeConstructor typeConstructor, DeclarationDescriptor declarationDescriptor, int i, Object obj) {
            if (obj != null) {
                qq3.m175877a("Super calls with default arguments not supported in this target, function: toAttributes");
                return null;
            }
            if ((i & 2) != 0) {
                typeConstructor = null;
            }
            if ((i & 4) != 0) {
                declarationDescriptor = null;
            }
            return typeAttributeTranslator.mo92571a(annotations, typeConstructor, declarationDescriptor);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    TypeAttributes mo92571a(@NotNull Annotations annotations, @Nullable TypeConstructor typeConstructor, @Nullable DeclarationDescriptor declarationDescriptor);
}
