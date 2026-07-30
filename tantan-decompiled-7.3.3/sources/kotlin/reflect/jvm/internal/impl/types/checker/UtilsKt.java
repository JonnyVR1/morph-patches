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
import p153l.xdg0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class UtilsKt {
    /* JADX INFO: renamed from: a */
    public static final KotlinType m93874a(KotlinType kotlinType) {
        return CapturedTypeApproximationKt.m94003b(kotlinType).m94001d();
    }

    /* JADX INFO: renamed from: b */
    public static final String m93875b(TypeConstructor typeConstructor) {
        StringBuilder sb = new StringBuilder();
        m93876c("type: " + typeConstructor, sb);
        m93876c("hashCode: " + typeConstructor.hashCode(), sb);
        m93876c("javaClass: " + typeConstructor.getClass().getCanonicalName(), sb);
        for (DeclarationDescriptor declarationDescriptorMo89207e = typeConstructor.mo89207e(); declarationDescriptorMo89207e != null; declarationDescriptorMo89207e = declarationDescriptorMo89207e.mo89190b()) {
            m93876c("fqName: " + DescriptorRenderer.f66416g.mo92338O(declarationDescriptorMo89207e), sb);
            m93876c("javaClass: " + declarationDescriptorMo89207e.getClass().getCanonicalName(), sb);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static final StringBuilder m93876c(String str, StringBuilder sb) {
        str.getClass();
        sb.append(str);
        sb.append('\n');
        return sb;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final KotlinType m93877d(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2, @NotNull TypeCheckingProcedureCallbacks typeCheckingProcedureCallbacks) {
        kotlinType.getClass();
        kotlinType2.getClass();
        typeCheckingProcedureCallbacks.getClass();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new xdg0(kotlinType, null));
        TypeConstructor typeConstructorMo92781G0 = kotlinType2.mo92781G0();
        while (!arrayDeque.isEmpty()) {
            xdg0 xdg0Var = (xdg0) arrayDeque.poll();
            KotlinType kotlinTypeM210461b = xdg0Var.m210461b();
            TypeConstructor typeConstructorMo92781G1 = kotlinTypeM210461b.mo92781G0();
            if (typeCheckingProcedureCallbacks.mo93864a(typeConstructorMo92781G1, typeConstructorMo92781G0)) {
                boolean zMo90857H0 = kotlinTypeM210461b.mo90857H0();
                for (xdg0 xdg0VarM210460a = xdg0Var.m210460a(); xdg0VarM210460a != null; xdg0VarM210460a = xdg0VarM210460a.m210460a()) {
                    KotlinType kotlinTypeM210461b2 = xdg0VarM210460a.m210461b();
                    List<TypeProjection> listMo92779E0 = kotlinTypeM210461b2.mo92779E0();
                    if (!(listMo92779E0 instanceof Collection) || !listMo92779E0.isEmpty()) {
                        Iterator<T> it = listMo92779E0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                kotlinTypeM210461b = TypeConstructorSubstitution.Companion.m93629a(kotlinTypeM210461b2).m93648c().m93672o(kotlinTypeM210461b, Variance.INVARIANT);
                                kotlinTypeM210461b.getClass();
                                break;
                            }
                            Variance varianceMo93558c = ((TypeProjection) it.next()).mo93558c();
                            Variance variance = Variance.INVARIANT;
                            if (varianceMo93558c != variance) {
                                KotlinType kotlinTypeM93672o = CapturedTypeConstructorKt.m92797h(TypeConstructorSubstitution.Companion.m93629a(kotlinTypeM210461b2), false, 1, null).m93648c().m93672o(kotlinTypeM210461b, variance);
                                kotlinTypeM93672o.getClass();
                                kotlinTypeM210461b = m93874a(kotlinTypeM93672o);
                                break;
                            }
                        }
                    } else {
                        kotlinTypeM210461b = TypeConstructorSubstitution.Companion.m93629a(kotlinTypeM210461b2).m93648c().m93672o(kotlinTypeM210461b, Variance.INVARIANT);
                        kotlinTypeM210461b.getClass();
                        break;
                    }
                    zMo90857H0 = zMo90857H0 || kotlinTypeM210461b2.mo90857H0();
                }
                TypeConstructor typeConstructorMo92781G2 = kotlinTypeM210461b.mo92781G0();
                if (typeCheckingProcedureCallbacks.mo93864a(typeConstructorMo92781G2, typeConstructorMo92781G0)) {
                    return TypeUtils.m93696p(kotlinTypeM210461b, zMo90857H0);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + m93875b(typeConstructorMo92781G2) + ", \n\nsupertype: " + m93875b(typeConstructorMo92781G0) + " \n" + typeCheckingProcedureCallbacks.mo93864a(typeConstructorMo92781G2, typeConstructorMo92781G0));
            }
            for (KotlinType kotlinType3 : typeConstructorMo92781G1.mo89569c()) {
                kotlinType3.getClass();
                arrayDeque.add(new xdg0(kotlinType3, xdg0Var));
            }
        }
        return null;
    }
}
