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
import p149l.mdc0;
import p149l.xdc0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class RawTypeImpl extends FlexibleType implements RawType {
    public RawTypeImpl(SimpleType simpleType, SimpleType simpleType2, boolean z) {
        super(simpleType, simpleType2);
        if (z) {
            return;
        }
        KotlinTypeChecker.f66298a.mo92904d(simpleType, simpleType2);
    }

    /* JADX INFO: renamed from: U0 */
    public static final CharSequence m89887U0(String str) {
        str.getClass();
        return "(raw) " + str;
    }

    /* JADX INFO: renamed from: V0 */
    public static final boolean m89888V0(String str, String str2) {
        return Intrinsics.m87488d(str, StringsKt.m93456w0(str2, "out ")) || Intrinsics.m87488d(str2, "*");
    }

    /* JADX INFO: renamed from: W0 */
    public static final List<String> m89889W0(DescriptorRenderer descriptorRenderer, KotlinType kotlinType) {
        List<TypeProjection> listMo91888E0 = kotlinType.mo91888E0();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo91888E0, 10));
        Iterator<T> it = listMo91888E0.iterator();
        while (it.hasNext()) {
            arrayList.add(descriptorRenderer.mo91453V((TypeProjection) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: X0 */
    public static final String m89890X0(String str, String str2) {
        if (!StringsKt.m93410O(str, '<', false, 2, null)) {
            return str;
        }
        return StringsKt.m93423U0(str, '<', null, 2, null) + '<' + str2 + '>' + StringsKt.m93415Q0(str, '>', null, 2, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    /* JADX INFO: renamed from: N0 */
    public SimpleType mo89895N0() {
        return m92597O0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    /* JADX INFO: renamed from: Q0 */
    public String mo89896Q0(@NotNull DescriptorRenderer descriptorRenderer, @NotNull DescriptorRendererOptions descriptorRendererOptions) {
        Pair pair;
        descriptorRenderer.getClass();
        descriptorRendererOptions.getClass();
        String strMo91452U = descriptorRenderer.mo91452U(m92597O0());
        String strMo91452U2 = descriptorRenderer.mo91452U(m92598P0());
        if (descriptorRendererOptions.mo91561d()) {
            return "raw (" + strMo91452U + ".." + strMo91452U2 + ')';
        }
        if (m92598P0().mo91888E0().isEmpty()) {
            return descriptorRenderer.mo91449R(strMo91452U, strMo91452U2, TypeUtilsKt.m93094n(this));
        }
        List<String> listM89889W0 = m89889W0(descriptorRenderer, m92597O0());
        List<String> listM89889W1 = m89889W0(descriptorRenderer, m92598P0());
        List<String> list = listM89889W0;
        String strJoinToString$default = CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, mdc0.INSTANCE, 30, null);
        List listZip = CollectionsKt.zip(list, listM89889W1);
        if (!(listZip instanceof Collection) || !listZip.isEmpty()) {
            Iterator it = listZip.iterator();
            do {
                if (!it.hasNext()) {
                    strMo91452U2 = m89890X0(strMo91452U2, strJoinToString$default);
                    break;
                }
                pair = (Pair) it.next();
            } while (m89888V0((String) pair.getFirst(), (String) pair.getSecond()));
        } else {
            strMo91452U2 = m89890X0(strMo91452U2, strJoinToString$default);
            break;
        }
        String strM89890X0 = m89890X0(strMo91452U, strJoinToString$default);
        return Intrinsics.m87488d(strM89890X0, strMo91452U2) ? strM89890X0 : descriptorRenderer.mo91449R(strM89890X0, strMo91452U2, TypeUtilsKt.m93094n(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public RawTypeImpl mo89967N0(boolean z) {
        return new RawTypeImpl(m92597O0().mo89967N0(z), m92598P0().mo89967N0(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public FlexibleType mo92486Q0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        KotlinType kotlinTypeMo92559a = kotlinTypeRefiner.mo92559a(m92597O0());
        kotlinTypeMo92559a.getClass();
        KotlinType kotlinTypeMo92559a2 = kotlinTypeRefiner.mo92559a(m92598P0());
        kotlinTypeMo92559a2.getClass();
        return new RawTypeImpl((SimpleType) kotlinTypeMo92559a, (SimpleType) kotlinTypeMo92559a2, true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public RawTypeImpl mo89894M0(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return new RawTypeImpl(m92597O0().mo89894M0(typeAttributes), m92598P0().mo89894M0(typeAttributes));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: n */
    public MemberScope mo89900n() {
        ClassifierDescriptor classifierDescriptorMo88316e = mo91890G0().mo88316e();
        TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = null;
        Object[] objArr = 0;
        ClassDescriptor classDescriptor = classifierDescriptorMo88316e instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo88316e : null;
        if (classDescriptor == null) {
            xdc0.m208279a("Incorrect classifier: ", mo91890G0().mo88316e());
            return null;
        }
        MemberScope memberScopeMo88459s0 = classDescriptor.mo88459s0(new RawSubstitution(typeParameterUpperBoundEraser, 1, objArr == true ? 1 : 0));
        memberScopeMo88459s0.getClass();
        return memberScopeMo88459s0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RawTypeImpl(@NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        this(simpleType, simpleType2, false);
        simpleType.getClass();
        simpleType2.getClass();
    }
}
