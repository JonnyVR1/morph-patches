package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import p149l.vu50;
import p149l.wu50;
import p149l.xu50;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class OperatorChecks extends AbstractModifierChecks {

    @NotNull
    public static final OperatorChecks INSTANCE = new OperatorChecks();

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final List<Checks> f66368a;

    static {
        Name name = OperatorNameConventions.f66410j;
        MemberKindCheck.MemberOrExtension memberOrExtension = MemberKindCheck.MemberOrExtension.INSTANCE;
        Checks checks = new Checks(name, new Check[]{memberOrExtension, new ValueParameterCountCheck.AtLeast(1)}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks2 = new Checks(OperatorNameConventions.f66411k, new Check[]{memberOrExtension, new ValueParameterCountCheck.AtLeast(2)}, vu50.INSTANCE);
        Name name2 = OperatorNameConventions.f66395a;
        C15357b c15357b = C15357b.INSTANCE;
        ValueParameterCountCheck.AtLeast atLeast = new ValueParameterCountCheck.AtLeast(2);
        C15356a c15356a = C15356a.INSTANCE;
        Checks checks3 = new Checks(name2, new Check[]{memberOrExtension, c15357b, atLeast, c15356a}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks4 = new Checks(OperatorNameConventions.f66397b, new Check[]{memberOrExtension, c15357b, new ValueParameterCountCheck.AtLeast(3), c15356a}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks5 = new Checks(OperatorNameConventions.f66399c, new Check[]{memberOrExtension, c15357b, new ValueParameterCountCheck.Equals(2), c15356a}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks6 = new Checks(OperatorNameConventions.f66408h, new Check[]{memberOrExtension}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Name name3 = OperatorNameConventions.f66407g;
        ValueParameterCountCheck.SingleValueParameter singleValueParameter = ValueParameterCountCheck.SingleValueParameter.INSTANCE;
        ReturnsCheck.ReturnsBoolean returnsBoolean = ReturnsCheck.ReturnsBoolean.INSTANCE;
        Checks checks7 = new Checks(name3, new Check[]{memberOrExtension, singleValueParameter, c15357b, returnsBoolean}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Name name4 = OperatorNameConventions.f66409i;
        ValueParameterCountCheck.NoValueParameters noValueParameters = ValueParameterCountCheck.NoValueParameters.INSTANCE;
        f66368a = CollectionsKt.listOf((Object[]) new Checks[]{checks, checks2, checks3, checks4, checks5, checks6, checks7, new Checks(name4, new Check[]{memberOrExtension, noValueParameters}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.f66412l, new Check[]{memberOrExtension, noValueParameters}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.f66413m, new Check[]{memberOrExtension, noValueParameters, returnsBoolean}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.f66375G, new Check[]{memberOrExtension, singleValueParameter, c15357b}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.f66376H, new Check[]{memberOrExtension, singleValueParameter, c15357b}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.f66401d, new Check[]{MemberKindCheck.Member.INSTANCE}, wu50.INSTANCE), new Checks(OperatorNameConventions.f66405f, new Check[]{memberOrExtension, ReturnsCheck.ReturnsInt.INSTANCE, singleValueParameter, c15357b}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.f66391W, new Check[]{memberOrExtension, singleValueParameter, c15357b}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.f66390V, new Check[]{memberOrExtension, noValueParameters}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(CollectionsKt.listOf((Object[]) new Name[]{OperatorNameConventions.f66423w, OperatorNameConventions.f66424x}), new Check[]{memberOrExtension}, xu50.INSTANCE), new Checks(OperatorNameConventions.f66398b0, new Check[]{memberOrExtension, ReturnsCheck.ReturnsUnit.INSTANCE, singleValueParameter, c15357b}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.f66415o, new Check[]{memberOrExtension, noValueParameters}, (Function1) null, 4, (DefaultConstructorMarker) null)});
    }

    private OperatorChecks() {
    }

    /* JADX INFO: renamed from: f */
    public static final String m93152f(FunctionDescriptor functionDescriptor) {
        functionDescriptor.getClass();
        List<ValueParameterDescriptor> listMo88448g = functionDescriptor.mo88448g();
        listMo88448g.getClass();
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.lastOrNull((List) listMo88448g);
        boolean z = false;
        if (valueParameterDescriptor != null && !DescriptorUtilsKt.m91973f(valueParameterDescriptor) && valueParameterDescriptor.mo88618w0() == null) {
            z = true;
        }
        if (z) {
            return null;
        }
        return "last parameter should not have a default value or be a vararg";
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX INFO: renamed from: g */
    public static final String m93153g(FunctionDescriptor functionDescriptor) {
        boolean z;
        functionDescriptor.getClass();
        DeclarationDescriptor declarationDescriptorMo88299b = functionDescriptor.mo88299b();
        declarationDescriptorMo88299b.getClass();
        if (m93154h(declarationDescriptorMo88299b)) {
            z = true;
        } else {
            Collection<? extends FunctionDescriptor> collectionMo88447e = functionDescriptor.mo88447e();
            collectionMo88447e.getClass();
            Collection<? extends FunctionDescriptor> collection = collectionMo88447e;
            if (!collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (it.hasNext()) {
                        DeclarationDescriptor declarationDescriptorMo88299b2 = ((FunctionDescriptor) it.next()).mo88299b();
                        declarationDescriptorMo88299b2.getClass();
                        if (m93154h(declarationDescriptorMo88299b2)) {
                        }
                    } else if (DescriptorUtilKt.m88480c(functionDescriptor)) {
                        z = false;
                    }
                    z = true;
                }
            } else if (DescriptorUtilKt.m88480c(functionDescriptor)) {
                z = false;
            } else {
                z = true;
            }
        }
        if (z) {
            return null;
        }
        StringBuilder sb = new StringBuilder("must override ''equals()'' in Any");
        DeclarationDescriptor declarationDescriptorMo88299b3 = functionDescriptor.mo88299b();
        declarationDescriptorMo88299b3.getClass();
        if (InlineClassesUtilsKt.m91792g(declarationDescriptorMo88299b3)) {
            DescriptorRenderer descriptorRenderer = DescriptorRenderer.f65744i;
            DeclarationDescriptor declarationDescriptorMo88299b4 = functionDescriptor.mo88299b();
            declarationDescriptorMo88299b4.getClass();
            SimpleType simpleTypeMo88458o = ((ClassDescriptor) declarationDescriptorMo88299b4).mo88458o();
            simpleTypeMo88458o.getClass();
            sb.append(" or define ''equals(other: " + descriptorRenderer.mo91452U(TypeUtilsKt.m93078D(simpleTypeMo88458o)) + "): Boolean''");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m93154h(DeclarationDescriptor declarationDescriptor) {
        return (declarationDescriptor instanceof ClassDescriptor) && KotlinBuiltIns.m88177b0((ClassDescriptor) declarationDescriptor);
    }

    /* JADX INFO: renamed from: i */
    public static final String m93155i(FunctionDescriptor functionDescriptor) {
        boolean zM93103w;
        functionDescriptor.getClass();
        ReceiverParameterDescriptor receiverParameterDescriptorMo88444Y = functionDescriptor.mo88444Y();
        if (receiverParameterDescriptorMo88444Y == null) {
            receiverParameterDescriptorMo88444Y = functionDescriptor.mo88446b0();
        }
        OperatorChecks operatorChecks = INSTANCE;
        boolean z = false;
        if (receiverParameterDescriptorMo88444Y != null) {
            KotlinType returnType = functionDescriptor.getReturnType();
            if (returnType != null) {
                KotlinType type = receiverParameterDescriptorMo88444Y.getType();
                type.getClass();
                zM93103w = TypeUtilsKt.m93103w(returnType, type);
            } else {
                zM93103w = false;
            }
            if (zM93103w || operatorChecks.m93156j(functionDescriptor, receiverParameterDescriptorMo88444Y)) {
                z = true;
            }
        }
        if (z) {
            return null;
        }
        return "receiver must be a supertype of the return type";
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractModifierChecks
    @NotNull
    /* JADX INFO: renamed from: b */
    public List<Checks> mo93127b() {
        return f66368a;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m93156j(FunctionDescriptor functionDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor) {
        ClassId classIdM91981n;
        KotlinType returnType;
        ReceiverValue value = receiverParameterDescriptor.getValue();
        value.getClass();
        if (!(value instanceof ImplicitClassReceiver)) {
            return false;
        }
        ClassDescriptor classDescriptorMo92097j = ((ImplicitClassReceiver) value).mo92097j();
        if (!classDescriptorMo92097j.mo88307n0() || (classIdM91981n = DescriptorUtilsKt.m91981n(classDescriptorMo92097j)) == null) {
            return false;
        }
        ClassifierDescriptor classifierDescriptorM88508c = FindClassInModuleKt.m88508c(DescriptorUtilsKt.m91986s(classDescriptorMo92097j), classIdM91981n);
        TypeAliasDescriptor typeAliasDescriptor = classifierDescriptorM88508c instanceof TypeAliasDescriptor ? (TypeAliasDescriptor) classifierDescriptorM88508c : null;
        if (typeAliasDescriptor == null || (returnType = functionDescriptor.getReturnType()) == null) {
            return false;
        }
        return TypeUtilsKt.m93103w(returnType, typeAliasDescriptor.mo88596V());
    }
}
