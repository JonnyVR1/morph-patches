package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p153l.emc0;
import p153l.tlc0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class RawTypeImpl extends FlexibleType implements RawType {
    public RawTypeImpl(SimpleType simpleType, SimpleType simpleType2, boolean z) {
        super(simpleType, simpleType2);
        if (z) {
            return;
        }
        KotlinTypeChecker.f66972a.mo93795d(simpleType, simpleType2);
    }

    /* JADX INFO: renamed from: U0 */
    public static final CharSequence m90778U0(String str) {
        str.getClass();
        return "(raw) " + str;
    }

    /* JADX INFO: renamed from: V0 */
    public static final boolean m90779V0(String str, String str2) {
        return Intrinsics.m88377d(str, StringsKt.m94347w0(str2, "out ")) || Intrinsics.m88377d(str2, "*");
    }

    /* JADX INFO: renamed from: W0 */
    public static final List<String> m90780W0(DescriptorRenderer descriptorRenderer, KotlinType kotlinType) {
        List<TypeProjection> listMo92779E0 = kotlinType.mo92779E0();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo92779E0, 10));
        Iterator<T> it = listMo92779E0.iterator();
        while (it.hasNext()) {
            arrayList.add(descriptorRenderer.mo92344V((TypeProjection) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: X0 */
    public static final String m90781X0(String str, String str2) {
        if (!StringsKt.m94301O(str, '<', false, 2, null)) {
            return str;
        }
        return StringsKt.m94314U0(str, '<', null, 2, null) + '<' + str2 + '>' + StringsKt.m94306Q0(str, '>', null, 2, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    /* JADX INFO: renamed from: N0 */
    public SimpleType mo90786N0() {
        return m93488O0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    /* JADX INFO: renamed from: Q0 */
    public String mo90787Q0(@NotNull DescriptorRenderer descriptorRenderer, @NotNull DescriptorRendererOptions descriptorRendererOptions) {
        Pair pair;
        descriptorRenderer.getClass();
        descriptorRendererOptions.getClass();
        String strMo92343U = descriptorRenderer.mo92343U(m93488O0());
        String strMo92343U2 = descriptorRenderer.mo92343U(m93489P0());
        if (descriptorRendererOptions.mo92452d()) {
            return "raw (" + strMo92343U + ".." + strMo92343U2 + ')';
        }
        if (m93489P0().mo92779E0().isEmpty()) {
            return descriptorRenderer.mo92340R(strMo92343U, strMo92343U2, TypeUtilsKt.m93985n(this));
        }
        List<String> listM90780W0 = m90780W0(descriptorRenderer, m93488O0());
        List<String> listM90780W1 = m90780W0(descriptorRenderer, m93489P0());
        List<String> list = listM90780W0;
        String strJoinToString$default = CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, tlc0.INSTANCE, 30, null);
        List listZip = CollectionsKt.zip(list, listM90780W1);
        if (!(listZip instanceof Collection) || !listZip.isEmpty()) {
            Iterator it = listZip.iterator();
            do {
                if (!it.hasNext()) {
                    strMo92343U2 = m90781X0(strMo92343U2, strJoinToString$default);
                    break;
                }
                pair = (Pair) it.next();
            } while (m90779V0((String) pair.getFirst(), (String) pair.getSecond()));
        } else {
            strMo92343U2 = m90781X0(strMo92343U2, strJoinToString$default);
            break;
        }
        String strM90781X0 = m90781X0(strMo92343U, strJoinToString$default);
        return Intrinsics.m88377d(strM90781X0, strMo92343U2) ? strM90781X0 : descriptorRenderer.mo92340R(strM90781X0, strMo92343U2, TypeUtilsKt.m93985n(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public RawTypeImpl mo90858N0(boolean z) {
        return new RawTypeImpl(m93488O0().mo90858N0(z), m93489P0().mo90858N0(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public FlexibleType mo93377Q0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        KotlinType kotlinTypeMo93450a = kotlinTypeRefiner.mo93450a(m93488O0());
        kotlinTypeMo93450a.getClass();
        KotlinType kotlinTypeMo93450a2 = kotlinTypeRefiner.mo93450a(m93489P0());
        kotlinTypeMo93450a2.getClass();
        return new RawTypeImpl((SimpleType) kotlinTypeMo93450a, (SimpleType) kotlinTypeMo93450a2, true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public RawTypeImpl mo90785M0(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return new RawTypeImpl(m93488O0().mo90785M0(typeAttributes), m93489P0().mo90785M0(typeAttributes));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: n */
    public MemberScope mo90791n() {
        ClassifierDescriptor classifierDescriptorMo89207e = mo92781G0().mo89207e();
        TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = null;
        Object[] objArr = 0;
        ClassDescriptor classDescriptor = classifierDescriptorMo89207e instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo89207e : null;
        if (classDescriptor == null) {
            emc0.m121356a("Incorrect classifier: ", mo92781G0().mo89207e());
            return null;
        }
        MemberScope memberScopeMo89350s0 = classDescriptor.mo89350s0(new RawSubstitution(typeParameterUpperBoundEraser, 1, objArr == true ? 1 : 0));
        memberScopeMo89350s0.getClass();
        return memberScopeMo89350s0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RawTypeImpl(@NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        this(simpleType, simpleType2, false);
        simpleType.getClass();
        simpleType2.getClass();
    }
}
