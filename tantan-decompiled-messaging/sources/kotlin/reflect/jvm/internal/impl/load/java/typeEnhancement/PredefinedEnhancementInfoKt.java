package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import p149l.ag80;
import p149l.ah80;
import p149l.bg80;
import p149l.bh80;
import p149l.cg80;
import p149l.ch80;
import p149l.dg80;
import p149l.dh80;
import p149l.eg80;
import p149l.eh80;
import p149l.fg80;
import p149l.fh80;
import p149l.gg80;
import p149l.gh80;
import p149l.hg80;
import p149l.hh80;
import p149l.ig80;
import p149l.ih80;
import p149l.jg80;
import p149l.jh80;
import p149l.kg80;
import p149l.kh80;
import p149l.lg80;
import p149l.lh80;
import p149l.mg80;
import p149l.mh80;
import p149l.ng80;
import p149l.nh80;
import p149l.og80;
import p149l.pg80;
import p149l.qg80;
import p149l.rg80;
import p149l.sg80;
import p149l.tg80;
import p149l.ug80;
import p149l.vg80;
import p149l.wf80;
import p149l.wg80;
import p149l.xf80;
import p149l.xg80;
import p149l.yf80;
import p149l.yg80;
import p149l.zf80;
import p149l.zg80;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class PredefinedEnhancementInfoKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final JavaTypeQualifiers f64971a = new JavaTypeQualifiers(NullabilityQualifier.NULLABLE, null, false, false, 8, null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final JavaTypeQualifiers f64972b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final JavaTypeQualifiers f64973c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Map<String, PredefinedFunctionEnhancementInfo> f64974d;

    static {
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        f64972b = new JavaTypeQualifiers(nullabilityQualifier, null, false, false, 8, null);
        f64973c = new JavaTypeQualifiers(nullabilityQualifier, null, true, false, 8, null);
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        String strM90392h = signatureBuildingComponents.m90392h("Object");
        String strM90391g = signatureBuildingComponents.m90391g("Predicate");
        String strM90391g2 = signatureBuildingComponents.m90391g("Function");
        String strM90391g3 = signatureBuildingComponents.m90391g("Consumer");
        String strM90391g4 = signatureBuildingComponents.m90391g("BiFunction");
        String strM90391g5 = signatureBuildingComponents.m90391g("BiConsumer");
        String strM90391g6 = signatureBuildingComponents.m90391g("UnaryOperator");
        String strM90393i = signatureBuildingComponents.m90393i("stream/Stream");
        String strM90393i2 = signatureBuildingComponents.m90393i("Optional");
        SignatureEnhancementBuilder signatureEnhancementBuilder = new SignatureEnhancementBuilder();
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90095b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m90393i("Iterator")), "forEachRemaining", null, new wf80(strM90391g3), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90095b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m90392h("Iterable")), "spliterator", null, new hg80(signatureBuildingComponents), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m90393i("Collection"));
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90095b(classEnhancementBuilder, "removeIf", null, new sg80(strM90391g), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90095b(classEnhancementBuilder, "stream", null, new dh80(strM90393i), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90095b(classEnhancementBuilder, "parallelStream", null, new ih80(strM90393i), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder2 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m90393i("List"));
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90095b(classEnhancementBuilder2, "replaceAll", null, new jh80(strM90391g6), 2, null);
        classEnhancementBuilder2.m90096a("addFirst", "2.1", new kh80(strM90392h));
        classEnhancementBuilder2.m90096a("addLast", "2.1", new lh80(strM90392h));
        classEnhancementBuilder2.m90096a("removeFirst", "2.1", new mh80(strM90392h));
        classEnhancementBuilder2.m90096a("removeLast", "2.1", new nh80(strM90392h));
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder3 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m90393i("LinkedList"));
        classEnhancementBuilder3.m90096a("addFirst", "2.1", new xf80(strM90392h));
        classEnhancementBuilder3.m90096a("addLast", "2.1", new yf80(strM90392h));
        classEnhancementBuilder3.m90096a("removeFirst", "2.1", new zf80(strM90392h));
        classEnhancementBuilder3.m90096a("removeLast", "2.1", new ag80(strM90392h));
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder4 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m90393i("LinkedHashSet"));
        classEnhancementBuilder4.m90096a("addFirst", "2.2", new bg80(strM90392h));
        classEnhancementBuilder4.m90096a("addLast", "2.2", new cg80(strM90392h));
        classEnhancementBuilder4.m90096a("removeFirst", "2.2", new dg80(strM90392h));
        classEnhancementBuilder4.m90096a("removeLast", "2.2", new eg80(strM90392h));
        classEnhancementBuilder4.m90096a("getFirst", "2.2", new fg80(strM90392h));
        classEnhancementBuilder4.m90096a("getLast", "2.2", new gg80(strM90392h));
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder5 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m90393i("Map"));
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90095b(classEnhancementBuilder5, "forEach", null, new ig80(strM90391g5), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90095b(classEnhancementBuilder5, "putIfAbsent", null, new jg80(strM90392h), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90095b(classEnhancementBuilder5, "replace", null, new kg80(strM90392h), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90095b(classEnhancementBuilder5, "replace", null, new lg80(strM90392h), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90095b(classEnhancementBuilder5, "replaceAll", null, new mg80(strM90391g4), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90095b(classEnhancementBuilder5, "compute", null, new ng80(strM90392h, strM90391g4), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90095b(classEnhancementBuilder5, "computeIfAbsent", null, new og80(strM90392h, strM90391g2), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90095b(classEnhancementBuilder5, "computeIfPresent", null, new pg80(strM90392h, strM90391g4), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90095b(classEnhancementBuilder5, "merge", null, new qg80(strM90392h, strM90391g4), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder6 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m90393i("LinkedHashMap"));
        classEnhancementBuilder6.m90096a("putFirst", "2.2", new rg80(strM90392h));
        classEnhancementBuilder6.m90096a("putLast", "2.2", new tg80(strM90392h));
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder7 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strM90393i2);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90095b(classEnhancementBuilder7, "empty", null, new ug80(strM90393i2), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90095b(classEnhancementBuilder7, "of", null, new vg80(strM90392h, strM90393i2), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90095b(classEnhancementBuilder7, "ofNullable", null, new wg80(strM90392h, strM90393i2), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90095b(classEnhancementBuilder7, "get", null, new xg80(strM90392h), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90095b(classEnhancementBuilder7, "ifPresent", null, new yg80(strM90391g3), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90095b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m90392h("ref/Reference")), "get", null, new zg80(strM90392h), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90095b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strM90391g), "test", null, new ah80(strM90392h), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90095b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m90391g("BiPredicate")), "test", null, new bh80(strM90392h), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90095b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strM90391g3), "accept", null, new ch80(strM90392h), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90095b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strM90391g5), "accept", null, new eh80(strM90392h), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90095b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strM90391g2), "apply", null, new fh80(strM90392h), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90095b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strM90391g4), "apply", null, new gh80(strM90392h), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.m90095b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m90391g("Supplier")), "get", null, new hh80(strM90392h), 2, null);
        f64974d = signatureEnhancementBuilder.m90094b();
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m89979A(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90100c(str, f64972b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m89981B(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f64972b;
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m89983C(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f64972b;
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90100c(str, f64971a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m89985D(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f64972b;
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90100c(str, f64971a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m89987E(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f64972b;
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90101d(JvmPrimitiveType.BOOLEAN);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m89989F(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f64972b;
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static final Unit m89991G(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f64972b;
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers);
        JavaTypeQualifiers javaTypeQualifiers2 = f64971a;
        functionEnhancementBuilder.m90099b(str2, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers2, javaTypeQualifiers2);
        functionEnhancementBuilder.m90100c(str, javaTypeQualifiers2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m89993H(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f64972b;
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90099b(str2, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers);
        functionEnhancementBuilder.m90100c(str, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m89995I(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f64972b;
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers);
        JavaTypeQualifiers javaTypeQualifiers2 = f64973c;
        JavaTypeQualifiers javaTypeQualifiers3 = f64971a;
        functionEnhancementBuilder.m90099b(str2, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers2, javaTypeQualifiers3);
        functionEnhancementBuilder.m90100c(str, javaTypeQualifiers3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public static final Unit m89997J(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f64972b;
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers);
        JavaTypeQualifiers javaTypeQualifiers2 = f64973c;
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers2);
        JavaTypeQualifiers javaTypeQualifiers3 = f64971a;
        functionEnhancementBuilder.m90099b(str2, javaTypeQualifiers, javaTypeQualifiers2, javaTypeQualifiers2, javaTypeQualifiers3);
        functionEnhancementBuilder.m90100c(str, javaTypeQualifiers3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m89999K(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f64972b;
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90100c(str, f64971a);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: K0 */
    public static final Map<String, PredefinedFunctionEnhancementInfo> m90000K0() {
        return f64974d;
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m90001L(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f64972b;
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90100c(str, f64971a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M */
    public static final Unit m90002M(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90100c(str, f64972b, f64973c);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N */
    public static final Unit m90003N(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f64973c;
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90100c(str2, f64972b, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O */
    public static final Unit m90004O(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90099b(str, f64971a);
        functionEnhancementBuilder.m90100c(str2, f64972b, f64973c);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m90005P(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90100c(str, f64973c);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m90006Q(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90099b(str, f64972b, f64973c);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R */
    public static final Unit m90007R(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90100c(str, f64971a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m90016a(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f64972b;
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m90018b(SignatureBuildingComponents signatureBuildingComponents, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        String strM90393i = signatureBuildingComponents.m90393i("Spliterator");
        JavaTypeQualifiers javaTypeQualifiers = f64972b;
        functionEnhancementBuilder.m90100c(strM90393i, javaTypeQualifiers, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m90020c(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90099b(str, f64972b);
        functionEnhancementBuilder.m90101d(JvmPrimitiveType.BOOLEAN);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m90022d(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f64972b;
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90101d(JvmPrimitiveType.BOOLEAN);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m90024e(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90099b(str, f64972b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m90026f(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f64972b;
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m90028g(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f64972b;
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90100c(str, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m90030h(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f64972b;
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers);
        functionEnhancementBuilder.m90100c(str, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m90032i(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90100c(str, f64972b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m90034j(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f64972b;
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers, javaTypeQualifiers);
        functionEnhancementBuilder.m90101d(JvmPrimitiveType.BOOLEAN);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m90036k(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f64972b;
        functionEnhancementBuilder.m90100c(str, javaTypeQualifiers, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m90038l(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f64972b;
        functionEnhancementBuilder.m90100c(str, javaTypeQualifiers, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m90040m(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        JavaTypeQualifiers javaTypeQualifiers = f64972b;
        functionEnhancementBuilder.m90099b(str, javaTypeQualifiers, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m90042n(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90099b(str, f64972b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m90044o(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90099b(str, f64972b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m90046p(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90100c(str, f64972b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m90048q(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90100c(str, f64972b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m90050r(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90099b(str, f64972b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m90052s(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90099b(str, f64972b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m90054t(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90100c(str, f64972b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m90056u(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90100c(str, f64972b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m90058v(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90099b(str, f64972b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m90060w(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90099b(str, f64972b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m90062x(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90100c(str, f64972b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m90064y(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90100c(str, f64972b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m90066z(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.getClass();
        functionEnhancementBuilder.m90100c(str, f64972b);
        return Unit.INSTANCE;
    }
}
