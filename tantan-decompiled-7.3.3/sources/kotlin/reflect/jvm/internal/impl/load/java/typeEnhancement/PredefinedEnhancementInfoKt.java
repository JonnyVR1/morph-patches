package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import p153l.ap80;
import p153l.bo80;
import p153l.bp80;
import p153l.co80;
import p153l.cp80;
import p153l.do80;
import p153l.dp80;
import p153l.eo80;
import p153l.ep80;
import p153l.fo80;
import p153l.fp80;
import p153l.go80;
import p153l.gp80;
import p153l.ho80;
import p153l.hp80;
import p153l.io80;
import p153l.ip80;
import p153l.jo80;
import p153l.jp80;
import p153l.ko80;
import p153l.kp80;
import p153l.lo80;
import p153l.lp80;
import p153l.mo80;
import p153l.mp80;
import p153l.no80;
import p153l.np80;
import p153l.oo80;
import p153l.op80;
import p153l.po80;
import p153l.pp80;
import p153l.qo80;
import p153l.qp80;
import p153l.ro80;
import p153l.rp80;
import p153l.so80;
import p153l.sp80;
import p153l.to80;
import p153l.uo80;
import p153l.vo80;
import p153l.wo80;
import p153l.xo80;
import p153l.yo80;
import p153l.zo80;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class PredefinedEnhancementInfoKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final JavaTypeQualifiers f65645a = new JavaTypeQualifiers(NullabilityQualifier.NULLABLE, null, false, false, 8, null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final JavaTypeQualifiers f65646b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final JavaTypeQualifiers f65647c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Map<String, PredefinedFunctionEnhancementInfo> f65648d;

    static {
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        f65646b = new JavaTypeQualifiers(nullabilityQualifier, null, false, false, 8, null);
        f65647c = new JavaTypeQualifiers(nullabilityQualifier, null, true, false, 8, null);
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        String strM91283h = signatureBuildingComponents.m91283h("Object");
        String strM91282g = signatureBuildingComponents.m91282g("Predicate");
        String strM91282g2 = signatureBuildingComponents.m91282g("Function");
        String strM91282g3 = signatureBuildingComponents.m91282g("Consumer");
        String strM91282g4 = signatureBuildingComponents.m91282g("BiFunction");
        String strM91282g5 = signatureBuildingComponents.m91282g("BiConsumer");
        String strM91282g6 = signatureBuildingComponents.m91282g("UnaryOperator");
        String strM91284i = signatureBuildingComponents.m91284i("stream/Stream");
        String strM91284i2 = signatureBuildingComponents.m91284i("Optional");
        SignatureEnhancementBuilder signatureEnhancementBuilder = new SignatureEnhancementBuilder();
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90986b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m91284i("Iterator")), "forEachRemaining", null, new bo80(strM91282g3), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90986b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m91283h("Iterable")), "spliterator", null, new mo80(signatureBuildingComponents), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m91284i("Collection"));
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90986b(classEnhancementBuilder, "removeIf", null, new xo80(strM91282g), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90986b(classEnhancementBuilder, "stream", null, new ip80(strM91284i), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90986b(classEnhancementBuilder, "parallelStream", null, new np80(strM91284i), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder2 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m91284i("List"));
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90986b(classEnhancementBuilder2, "replaceAll", null, new op80(strM91282g6), 2, null);
        classEnhancementBuilder2.m90987a("addFirst", "2.1", new pp80(strM91283h));
        classEnhancementBuilder2.m90987a("addLast", "2.1", new qp80(strM91283h));
        classEnhancementBuilder2.m90987a("removeFirst", "2.1", new rp80(strM91283h));
        classEnhancementBuilder2.m90987a("removeLast", "2.1", new sp80(strM91283h));
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder3 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m91284i("LinkedList"));
        classEnhancementBuilder3.m90987a("addFirst", "2.1", new co80(strM91283h));
        classEnhancementBuilder3.m90987a("addLast", "2.1", new do80(strM91283h));
        classEnhancementBuilder3.m90987a("removeFirst", "2.1", new eo80(strM91283h));
        classEnhancementBuilder3.m90987a("removeLast", "2.1", new fo80(strM91283h));
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder4 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m91284i("LinkedHashSet"));
        classEnhancementBuilder4.m90987a("addFirst", "2.2", new go80(strM91283h));
        classEnhancementBuilder4.m90987a("addLast", "2.2", new ho80(strM91283h));
        classEnhancementBuilder4.m90987a("removeFirst", "2.2", new io80(strM91283h));
        classEnhancementBuilder4.m90987a("removeLast", "2.2", new jo80(strM91283h));
        classEnhancementBuilder4.m90987a("getFirst", "2.2", new ko80(strM91283h));
        classEnhancementBuilder4.m90987a("getLast", "2.2", new lo80(strM91283h));
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder5 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m91284i("Map"));
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90986b(classEnhancementBuilder5, "forEach", null, new no80(strM91282g5), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90986b(classEnhancementBuilder5, "putIfAbsent", null, new oo80(strM91283h), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90986b(classEnhancementBuilder5, "replace", null, new po80(strM91283h), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90986b(classEnhancementBuilder5, "replace", null, new qo80(strM91283h), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90986b(classEnhancementBuilder5, "replaceAll", null, new ro80(strM91282g4), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90986b(classEnhancementBuilder5, "compute", null, new so80(strM91283h, strM91282g4), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90986b(classEnhancementBuilder5, "computeIfAbsent", null, new to80(strM91283h, strM91282g2), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90986b(classEnhancementBuilder5, "computeIfPresent", null, new uo80(strM91283h, strM91282g4), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90986b(classEnhancementBuilder5, "merge", null, new vo80(strM91283h, strM91282g4), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder6 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m91284i("LinkedHashMap"));
        classEnhancementBuilder6.m90987a("putFirst", "2.2", new wo80(strM91283h));
        classEnhancementBuilder6.m90987a("putLast", "2.2", new yo80(strM91283h));
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder7 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strM91284i2);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90986b(classEnhancementBuilder7, "empty", null, new zo80(strM91284i2), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90986b(classEnhancementBuilder7, "of", null, new ap80(strM91283h, strM91284i2), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90986b(classEnhancementBuilder7, "ofNullable", null, new bp80(strM91283h, strM91284i2), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90986b(classEnhancementBuilder7, "get", null, new cp80(strM91283h), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90986b(classEnhancementBuilder7, "ifPresent", null, new dp80(strM91282g3), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90986b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m91283h("ref/Reference")), "get", null, new ep80(strM91283h), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90986b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strM91282g), "test", null, new fp80(strM91283h), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90986b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m91282g("BiPredicate")), "test", null, new gp80(strM91283h), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90986b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strM91282g3), "accept", null, new hp80(strM91283h), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90986b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strM91282g5), "accept", null, new jp80(strM91283h), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90986b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strM91282g2), "apply", null, new kp80(strM91283h), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90986b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strM91282g4), "apply", null, new lp80(strM91283h), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90986b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m91282g("Supplier")), "get", null, new mp80(strM91283h), 2, null);
        f65648d = signatureEnhancementBuilder.m90985b();
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m90870A(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90991c(str, f65646b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m90872B(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f65646b;
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m90874C(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f65646b;
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90991c(str, f65645a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m90876D(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f65646b;
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90991c(str, f65645a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m90878E(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f65646b;
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90992d(JvmPrimitiveType.BOOLEAN);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m90880F(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f65646b;
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static final Unit m90882G(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f65646b;
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers);
        JavaTypeQualifiers javaTypeQualifiers2 = f65645a;
        functionEnhancementBuilder.m90990b(str2, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers2, javaTypeQualifiers2);
        functionEnhancementBuilder.m90991c(str, javaTypeQualifiers2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m90884H(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f65646b;
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90990b(str2, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers);
        functionEnhancementBuilder.m90991c(str, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m90886I(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f65646b;
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers);
        JavaTypeQualifiers javaTypeQualifiers2 = f65647c;
        JavaTypeQualifiers javaTypeQualifiers3 = f65645a;
        functionEnhancementBuilder.m90990b(str2, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers2, javaTypeQualifiers3);
        functionEnhancementBuilder.m90991c(str, javaTypeQualifiers3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public static final Unit m90888J(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f65646b;
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers);
        JavaTypeQualifiers javaTypeQualifiers2 = f65647c;
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers2);
        JavaTypeQualifiers javaTypeQualifiers3 = f65645a;
        functionEnhancementBuilder.m90990b(str2, javaTypeQualifiers, javaTypeQualifiers2, javaTypeQualifiers2, javaTypeQualifiers3);
        functionEnhancementBuilder.m90991c(str, javaTypeQualifiers3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m90890K(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f65646b;
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90991c(str, f65645a);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: K0 */
    public static final Map<String, PredefinedFunctionEnhancementInfo> m90891K0() {
        return f65648d;
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m90892L(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f65646b;
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90991c(str, f65645a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M */
    public static final Unit m90893M(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90991c(str, f65646b, f65647c);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N */
    public static final Unit m90894N(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f65647c;
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90991c(str2, f65646b, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O */
    public static final Unit m90895O(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90990b(str, f65645a);
        functionEnhancementBuilder.m90991c(str2, f65646b, f65647c);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m90896P(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90991c(str, f65647c);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m90897Q(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90990b(str, f65646b, f65647c);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R */
    public static final Unit m90898R(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90991c(str, f65645a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m90907a(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f65646b;
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m90909b(SignatureBuildingComponents signatureBuildingComponents, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        String strM91284i = signatureBuildingComponents.m91284i("Spliterator");
        JavaTypeQualifiers javaTypeQualifiers = f65646b;
        functionEnhancementBuilder.m90991c(strM91284i, javaTypeQualifiers, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m90911c(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90990b(str, f65646b);
        functionEnhancementBuilder.m90992d(JvmPrimitiveType.BOOLEAN);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m90913d(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f65646b;
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90992d(JvmPrimitiveType.BOOLEAN);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m90915e(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90990b(str, f65646b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m90917f(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f65646b;
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m90919g(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f65646b;
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90991c(str, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m90921h(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f65646b;
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90991c(str, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m90923i(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90991c(str, f65646b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m90925j(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f65646b;
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers, javaTypeQualifiers);
        functionEnhancementBuilder.m90992d(JvmPrimitiveType.BOOLEAN);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m90927k(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f65646b;
        functionEnhancementBuilder.m90991c(str, javaTypeQualifiers, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m90929l(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f65646b;
        functionEnhancementBuilder.m90991c(str, javaTypeQualifiers, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m90931m(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f65646b;
        functionEnhancementBuilder.m90990b(str, javaTypeQualifiers, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m90933n(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90990b(str, f65646b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m90935o(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90990b(str, f65646b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m90937p(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90991c(str, f65646b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m90939q(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90991c(str, f65646b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m90941r(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90990b(str, f65646b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m90943s(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90990b(str, f65646b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m90945t(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90991c(str, f65646b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m90947u(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90991c(str, f65646b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m90949v(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90990b(str, f65646b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m90951w(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90990b(str, f65646b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m90953x(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90991c(str, f65646b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m90955y(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90991c(str, f65646b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m90957z(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90991c(str, f65646b);
        return Unit.INSTANCE;
    }
}
