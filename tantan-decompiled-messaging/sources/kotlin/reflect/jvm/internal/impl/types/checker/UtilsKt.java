package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.p5g0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class UtilsKt {
    /* JADX INFO: renamed from: a */
    public static final KotlinType m92983a(KotlinType kotlinType) {
        return CapturedTypeApproximationKt.m93112b(kotlinType).m93110d();
    }

    /* JADX INFO: renamed from: b */
    public static final String m92984b(TypeConstructor typeConstructor) {
        StringBuilder sb = new StringBuilder();
        m92985c("type: " + typeConstructor, sb);
        m92985c("hashCode: " + typeConstructor.hashCode(), sb);
        m92985c("javaClass: " + typeConstructor.getClass().getCanonicalName(), sb);
        for (DeclarationDescriptor declarationDescriptorMo88316e = typeConstructor.mo88316e(); declarationDescriptorMo88316e != null; declarationDescriptorMo88316e = declarationDescriptorMo88316e.mo88299b()) {
            m92985c("fqName: " + DescriptorRenderer.f65742g.mo91447O(declarationDescriptorMo88316e), sb);
            m92985c("javaClass: " + declarationDescriptorMo88316e.getClass().getCanonicalName(), sb);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static final StringBuilder m92985c(String str, StringBuilder sb) {
        str.getClass();
        sb.append(str);
        sb.append('\n');
        return sb;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final KotlinType m92986d(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2, @NotNull TypeCheckingProcedureCallbacks typeCheckingProcedureCallbacks) {
        kotlinType.getClass();
        kotlinType2.getClass();
        typeCheckingProcedureCallbacks.getClass();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new p5g0(kotlinType, null));
        TypeConstructor typeConstructorMo91890G0 = kotlinType2.mo91890G0();
        while (!arrayDeque.isEmpty()) {
            p5g0 p5g0Var = (p5g0) arrayDeque.poll();
            KotlinType kotlinTypeM167483b = p5g0Var.m167483b();
            TypeConstructor typeConstructorMo91890G1 = kotlinTypeM167483b.mo91890G0();
            if (typeCheckingProcedureCallbacks.mo92973a(typeConstructorMo91890G1, typeConstructorMo91890G0)) {
                boolean zMo89966H0 = kotlinTypeM167483b.mo89966H0();
                for (p5g0 p5g0VarM167482a = p5g0Var.m167482a(); p5g0VarM167482a != null; p5g0VarM167482a = p5g0VarM167482a.m167482a()) {
                    KotlinType kotlinTypeM167483b2 = p5g0VarM167482a.m167483b();
                    List<TypeProjection> listMo91888E0 = kotlinTypeM167483b2.mo91888E0();
                    if (!(listMo91888E0 instanceof Collection) || !listMo91888E0.isEmpty()) {
                        Iterator<T> it = listMo91888E0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                kotlinTypeM167483b = TypeConstructorSubstitution.Companion.m92738a(kotlinTypeM167483b2).m92757c().m92781o(kotlinTypeM167483b, Variance.INVARIANT);
                                kotlinTypeM167483b.getClass();
                                break;
                            }
                            Variance varianceMo92667c = ((TypeProjection) it.next()).mo92667c();
                            Variance variance = Variance.INVARIANT;
                            if (varianceMo92667c != variance) {
                                KotlinType kotlinTypeM92781o = CapturedTypeConstructorKt.m91906h(TypeConstructorSubstitution.Companion.m92738a(kotlinTypeM167483b2), false, 1, null).m92757c().m92781o(kotlinTypeM167483b, variance);
                                kotlinTypeM92781o.getClass();
                                kotlinTypeM167483b = m92983a(kotlinTypeM92781o);
                                break;
                            }
                        }
                    } else {
                        kotlinTypeM167483b = TypeConstructorSubstitution.Companion.m92738a(kotlinTypeM167483b2).m92757c().m92781o(kotlinTypeM167483b, Variance.INVARIANT);
                        kotlinTypeM167483b.getClass();
                        break;
                    }
                    zMo89966H0 = zMo89966H0 || kotlinTypeM167483b2.mo89966H0();
                }
                TypeConstructor typeConstructorMo91890G2 = kotlinTypeM167483b.mo91890G0();
                if (typeCheckingProcedureCallbacks.mo92973a(typeConstructorMo91890G2, typeConstructorMo91890G0)) {
                    return TypeUtils.m92805p(kotlinTypeM167483b, zMo89966H0);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + m92984b(typeConstructorMo91890G2) + ", \n\nsupertype: " + m92984b(typeConstructorMo91890G0) + " \n" + typeCheckingProcedureCallbacks.mo92973a(typeConstructorMo91890G2, typeConstructorMo91890G0));
            }
            for (KotlinType kotlinType3 : typeConstructorMo91890G1.mo88678c()) {
                kotlinType3.getClass();
                arrayDeque.add(new p5g0(kotlinType3, p5g0Var));
            }
        }
        return null;
    }
}
