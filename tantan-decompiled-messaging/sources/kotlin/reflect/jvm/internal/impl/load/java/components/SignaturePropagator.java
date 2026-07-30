package kotlin.reflect.jvm.internal.impl.load.java.components;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.Owner;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface SignaturePropagator {

    /* JADX INFO: renamed from: a */
    public static final SignaturePropagator f64787a = new C15216a();

    public static class PropagatedSignature {

        /* JADX INFO: renamed from: a */
        public final KotlinType f64788a;

        /* JADX INFO: renamed from: b */
        public final KotlinType f64789b;

        /* JADX INFO: renamed from: c */
        public final List<ValueParameterDescriptor> f64790c;

        /* JADX INFO: renamed from: d */
        public final List<TypeParameterDescriptor> f64791d;

        /* JADX INFO: renamed from: e */
        public final List<String> f64792e;

        /* JADX INFO: renamed from: f */
        public final boolean f64793f;

        public PropagatedSignature(@NotNull KotlinType kotlinType, @Nullable KotlinType kotlinType2, @NotNull List<ValueParameterDescriptor> list, @NotNull List<TypeParameterDescriptor> list2, @NotNull List<String> list3, boolean z) {
            if (kotlinType == null) {
                m89546a(0);
            }
            if (list == null) {
                m89546a(1);
            }
            if (list2 == null) {
                m89546a(2);
            }
            if (list3 == null) {
                m89546a(3);
            }
            this.f64788a = kotlinType;
            this.f64789b = kotlinType2;
            this.f64790c = list;
            this.f64791d = list2;
            this.f64792e = list3;
            this.f64793f = z;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m89546a(int i) {
            String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
            switch (i) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i == 4) {
                objArr[1] = "getReturnType";
            } else if (i == 5) {
                objArr[1] = "getValueParameters";
            } else if (i == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i != 4 && i != 5 && i != 6 && i != 7) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i != 4 && i != 5 && i != 6 && i != 7) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public List<String> m89547b() {
            List<String> list = this.f64792e;
            if (list == null) {
                m89546a(7);
            }
            return list;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public KotlinType m89548c() {
            return this.f64789b;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public KotlinType m89549d() {
            KotlinType kotlinType = this.f64788a;
            if (kotlinType == null) {
                m89546a(4);
            }
            return kotlinType;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public List<TypeParameterDescriptor> m89550e() {
            List<TypeParameterDescriptor> list = this.f64791d;
            if (list == null) {
                m89546a(6);
            }
            return list;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public List<ValueParameterDescriptor> m89551f() {
            List<ValueParameterDescriptor> list = this.f64790c;
            if (list == null) {
                m89546a(5);
            }
            return list;
        }

        /* JADX INFO: renamed from: g */
        public boolean m89552g() {
            return this.f64793f;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator$a */
    public static class C15216a implements SignaturePropagator {
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m89553c(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                    objArr[0] = Owner.TYPE;
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = FirebaseAnalytics.Param.METHOD;
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i == 5 || i == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator
        @NotNull
        /* JADX INFO: renamed from: a */
        public PropagatedSignature mo89544a(@NotNull JavaMethod javaMethod, @NotNull ClassDescriptor classDescriptor, @NotNull KotlinType kotlinType, @Nullable KotlinType kotlinType2, @NotNull List<ValueParameterDescriptor> list, @NotNull List<TypeParameterDescriptor> list2) {
            if (javaMethod == null) {
                m89553c(0);
            }
            if (classDescriptor == null) {
                m89553c(1);
            }
            if (kotlinType == null) {
                m89553c(2);
            }
            if (list == null) {
                m89553c(3);
            }
            if (list2 == null) {
                m89553c(4);
            }
            return new PropagatedSignature(kotlinType, kotlinType2, list, list2, Collections.EMPTY_LIST, false);
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator
        /* JADX INFO: renamed from: b */
        public void mo89545b(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull List<String> list) {
            if (callableMemberDescriptor == null) {
                m89553c(5);
            }
            if (list == null) {
                m89553c(6);
            }
            throw new UnsupportedOperationException("Should not be called");
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    PropagatedSignature mo89544a(@NotNull JavaMethod javaMethod, @NotNull ClassDescriptor classDescriptor, @NotNull KotlinType kotlinType, @Nullable KotlinType kotlinType2, @NotNull List<ValueParameterDescriptor> list, @NotNull List<TypeParameterDescriptor> list2);

    /* JADX INFO: renamed from: b */
    void mo89545b(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull List<String> list);
}
