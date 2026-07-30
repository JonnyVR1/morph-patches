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
import p153l.b360;
import p153l.c360;
import p153l.d360;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class OperatorChecks extends AbstractModifierChecks {

    @NotNull
    public static final OperatorChecks INSTANCE = new OperatorChecks();

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final List<Checks> f67042a;

    static {
        Name name = OperatorNameConventions.f67084j;
        MemberKindCheck.MemberOrExtension memberOrExtension = MemberKindCheck.MemberOrExtension.INSTANCE;
        Checks checks = new Checks(name, new Check[]{memberOrExtension, new ValueParameterCountCheck.AtLeast(1)}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks2 = new Checks(OperatorNameConventions.f67085k, new Check[]{memberOrExtension, new ValueParameterCountCheck.AtLeast(2)}, b360.INSTANCE);
        Name name2 = OperatorNameConventions.f67069a;
        C15464b c15464b = C15464b.INSTANCE;
        ValueParameterCountCheck.AtLeast atLeast = new ValueParameterCountCheck.AtLeast(2);
        C15463a c15463a = C15463a.INSTANCE;
        Checks checks3 = new Checks(name2, new Check[]{memberOrExtension, c15464b, atLeast, c15463a}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks4 = new Checks(OperatorNameConventions.f67071b, new Check[]{memberOrExtension, c15464b, new ValueParameterCountCheck.AtLeast(3), c15463a}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks5 = new Checks(OperatorNameConventions.f67073c, new Check[]{memberOrExtension, c15464b, new ValueParameterCountCheck.Equals(2), c15463a}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks6 = new Checks(OperatorNameConventions.f67082h, new Check[]{memberOrExtension}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Name name3 = OperatorNameConventions.f67081g;
        ValueParameterCountCheck.SingleValueParameter singleValueParameter = ValueParameterCountCheck.SingleValueParameter.INSTANCE;
        ReturnsCheck.ReturnsBoolean returnsBoolean = ReturnsCheck.ReturnsBoolean.INSTANCE;
        Checks checks7 = new Checks(name3, new Check[]{memberOrExtension, singleValueParameter, c15464b, returnsBoolean}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Name name4 = OperatorNameConventions.f67083i;
        ValueParameterCountCheck.NoValueParameters noValueParameters = ValueParameterCountCheck.NoValueParameters.INSTANCE;
        f67042a = CollectionsKt.listOf((Object[]) new Checks[]{checks, checks2, checks3, checks4, checks5, checks6, checks7, new Checks(name4, new Check[]{memberOrExtension, noValueParameters}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.f67086l, new Check[]{memberOrExtension, noValueParameters}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.f67087m, new Check[]{memberOrExtension, noValueParameters, returnsBoolean}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.f67049G, new Check[]{memberOrExtension, singleValueParameter, c15464b}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.f67050H, new Check[]{memberOrExtension, singleValueParameter, c15464b}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.f67075d, new Check[]{MemberKindCheck.Member.INSTANCE}, c360.INSTANCE), new Checks(OperatorNameConventions.f67079f, new Check[]{memberOrExtension, ReturnsCheck.ReturnsInt.INSTANCE, singleValueParameter, c15464b}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.f67065W, new Check[]{memberOrExtension, singleValueParameter, c15464b}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.f67064V, new Check[]{memberOrExtension, noValueParameters}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(CollectionsKt.listOf((Object[]) new Name[]{OperatorNameConventions.f67097w, OperatorNameConventions.f67098x}), new Check[]{memberOrExtension}, d360.INSTANCE), new Checks(OperatorNameConventions.f67072b0, new Check[]{memberOrExtension, ReturnsCheck.ReturnsUnit.INSTANCE, singleValueParameter, c15464b}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.f67089o, new Check[]{memberOrExtension, noValueParameters}, (Function1) null, 4, (DefaultConstructorMarker) null)});
    }

    private OperatorChecks() {
    }

    /* JADX INFO: renamed from: f */
    public static final String m94043f(FunctionDescriptor functionDescriptor) {
        functionDescriptor.getClass();
        List<ValueParameterDescriptor> listMo89339g = functionDescriptor.mo89339g();
        listMo89339g.getClass();
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.lastOrNull((List) listMo89339g);
        boolean z = false;
        if (valueParameterDescriptor != null && !DescriptorUtilsKt.m92864f(valueParameterDescriptor) && valueParameterDescriptor.mo89509w0() == null) {
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
    public static final String m94044g(FunctionDescriptor functionDescriptor) {
        boolean z;
        functionDescriptor.getClass();
        DeclarationDescriptor declarationDescriptorMo89190b = functionDescriptor.mo89190b();
        declarationDescriptorMo89190b.getClass();
        if (m94045h(declarationDescriptorMo89190b)) {
            z = true;
        } else {
            Collection<? extends FunctionDescriptor> collectionMo89338e = functionDescriptor.mo89338e();
            collectionMo89338e.getClass();
            Collection<? extends FunctionDescriptor> collection = collectionMo89338e;
            if (!collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (it.hasNext()) {
                        DeclarationDescriptor declarationDescriptorMo89190b2 = ((FunctionDescriptor) it.next()).mo89190b();
                        declarationDescriptorMo89190b2.getClass();
                        if (m94045h(declarationDescriptorMo89190b2)) {
                        }
                    } else if (DescriptorUtilKt.m89371c(functionDescriptor)) {
                        z = false;
                    }
                    z = true;
                }
            } else if (DescriptorUtilKt.m89371c(functionDescriptor)) {
                z = false;
            } else {
                z = true;
            }
        }
        if (z) {
            return null;
        }
        StringBuilder sb = new StringBuilder("must override ''equals()'' in Any");
        DeclarationDescriptor declarationDescriptorMo89190b3 = functionDescriptor.mo89190b();
        declarationDescriptorMo89190b3.getClass();
        if (InlineClassesUtilsKt.m92683g(declarationDescriptorMo89190b3)) {
            DescriptorRenderer descriptorRenderer = DescriptorRenderer.f66418i;
            DeclarationDescriptor declarationDescriptorMo89190b4 = functionDescriptor.mo89190b();
            declarationDescriptorMo89190b4.getClass();
            SimpleType simpleTypeMo89349o = ((ClassDescriptor) declarationDescriptorMo89190b4).mo89349o();
            simpleTypeMo89349o.getClass();
            sb.append(" or define ''equals(other: " + descriptorRenderer.mo92343U(TypeUtilsKt.m93969D(simpleTypeMo89349o)) + "): Boolean''");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m94045h(DeclarationDescriptor declarationDescriptor) {
        return (declarationDescriptor instanceof ClassDescriptor) && KotlinBuiltIns.m89068b0((ClassDescriptor) declarationDescriptor);
    }

    /* JADX INFO: renamed from: i */
    public static final String m94046i(FunctionDescriptor functionDescriptor) {
        boolean zM93994w;
        functionDescriptor.getClass();
        ReceiverParameterDescriptor receiverParameterDescriptorMo89335Y = functionDescriptor.mo89335Y();
        if (receiverParameterDescriptorMo89335Y == null) {
            receiverParameterDescriptorMo89335Y = functionDescriptor.mo89337b0();
        }
        OperatorChecks operatorChecks = INSTANCE;
        boolean z = false;
        if (receiverParameterDescriptorMo89335Y != null) {
            KotlinType returnType = functionDescriptor.getReturnType();
            if (returnType != null) {
                KotlinType type = receiverParameterDescriptorMo89335Y.getType();
                type.getClass();
                zM93994w = TypeUtilsKt.m93994w(returnType, type);
            } else {
                zM93994w = false;
            }
            if (zM93994w || operatorChecks.m94047j(functionDescriptor, receiverParameterDescriptorMo89335Y)) {
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
    public List<Checks> mo94018b() {
        return f67042a;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m94047j(FunctionDescriptor functionDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor) {
        ClassId classIdM92872n;
        KotlinType returnType;
        ReceiverValue value = receiverParameterDescriptor.getValue();
        value.getClass();
        if (!(value instanceof ImplicitClassReceiver)) {
            return false;
        }
        ClassDescriptor classDescriptorMo92988j = ((ImplicitClassReceiver) value).mo92988j();
        if (!classDescriptorMo92988j.mo89198n0() || (classIdM92872n = DescriptorUtilsKt.m92872n(classDescriptorMo92988j)) == null) {
            return false;
        }
        ClassifierDescriptor classifierDescriptorM89399c = FindClassInModuleKt.m89399c(DescriptorUtilsKt.m92877s(classDescriptorMo92988j), classIdM92872n);
        TypeAliasDescriptor typeAliasDescriptor = classifierDescriptorM89399c instanceof TypeAliasDescriptor ? (TypeAliasDescriptor) classifierDescriptorM89399c : null;
        if (typeAliasDescriptor == null || (returnType = functionDescriptor.getReturnType()) == null) {
            return false;
        }
        return TypeUtilsKt.m93994w(returnType, typeAliasDescriptor.mo89487V());
    }
}
