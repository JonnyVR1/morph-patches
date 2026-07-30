package kotlin.reflect.jvm.internal;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.full.KCallables;
import kotlin.reflect.jvm.KClassesJvm;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import p149l.l9r;
import p149l.nnq;
import p149l.smc0;
import p149l.tmc0;
import p149l.umc0;
import p149l.vmc0;
import p149l.wmc0;
import p149l.xmc0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00062\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\t¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u00060\u0017j\u0002`\u0018*\u00060\u0017j\u0002`\u00182\u0006\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001f\u001a\u00020\u001e*\u00060\u0017j\u0002`\u00182\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010!\u001a\u00020\u001e*\u00060\u0017j\u0002`\u00182\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0002¢\u0006\u0004\b!\u0010 J\u001f\u0010#\u001a\u00020\u001e*\u00060\u0017j\u0002`\u00182\u0006\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010%\u001a\u00020\u00062\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0002¢\u0006\u0004\b%\u0010&J%\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\u0014\u001a\u00020'2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030(H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\u001e*\u00060\u0017j\u0002`\u00182\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b-\u0010.JA\u00105\u001a\u00020\u001e*\u00060\u0017j\u0002`\u00182\n\u0010)\u001a\u0006\u0012\u0002\b\u00030(2\u0006\u0010/\u001a\u00020*2\f\u00102\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J-\u00108\u001a\u00020\u001e*\u00060\u0017j\u0002`\u00182\f\u00107\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b8\u00109J\u001f\u0010<\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u0002¢\u0006\u0004\b<\u0010=¨\u0006>"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;", "", "<init>", "()V", "Lkotlin/reflect/KProperty;", "property", "", "w", "(Lkotlin/reflect/KProperty;)Ljava/lang/String;", "Lkotlin/reflect/KFunction;", "function", "q", "(Lkotlin/reflect/KFunction;)Ljava/lang/String;", "lambda", Constants.KEY_T, "Lkotlin/reflect/KParameter;", "parameter", ResourceDirection.f38808v, "(Lkotlin/reflect/KParameter;)Ljava/lang/String;", "Lkotlin/reflect/KType;", "type", BaseSei.f13931Y, "(Lkotlin/reflect/KType;)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "receiver", "j", "(Ljava/lang/StringBuilder;Lkotlin/reflect/KParameter;)Ljava/lang/StringBuilder;", "Lkotlin/reflect/KCallable;", "callable", "", "k", "(Ljava/lang/StringBuilder;Lkotlin/reflect/KCallable;)V", "g", AuthenticationTokenClaims.JSON_KEY_NAME, RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "m", "(Lkotlin/reflect/KCallable;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/AbstractKType;", "Lkotlin/reflect/KClass;", "klass", "Lkotlin/reflect/jvm/internal/impl/name/FqNameUnsafe;", BLiveStormDanmakuGiftResourceType.f44444l, "(Lkotlin/reflect/jvm/internal/AbstractKType;Lkotlin/reflect/KClass;)Lkotlin/reflect/jvm/internal/impl/name/FqNameUnsafe;", BLiveStormDanmakuGiftResourceType.f44446s, "(Ljava/lang/StringBuilder;Lkotlin/reflect/KType;)V", "classFqName", "", "Lkotlin/reflect/KTypeProjection;", "allArguments", "", "isMarkedNullable", BaseSei.f13930X, "(Ljava/lang/StringBuilder;Lkotlin/reflect/KClass;Lkotlin/reflect/jvm/internal/impl/name/FqNameUnsafe;Ljava/util/List;Z)V", "typeArguments", "A", "(Ljava/lang/StringBuilder;Ljava/util/List;Z)V", "lowerRendered", "upperRendered", "n", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ReflectionObjectRenderer {

    @NotNull
    public static final ReflectionObjectRenderer INSTANCE = new ReflectionObjectRenderer();

    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f63722a;

        static {
            int[] iArr = new int[KParameter.Kind.values().length];
            try {
                iArr[KParameter.Kind.INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KParameter.Kind.CONTEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KParameter.Kind.EXTENSION_RECEIVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KParameter.Kind.VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f63722a = iArr;
        }
    }

    private ReflectionObjectRenderer() {
    }

    /* JADX INFO: renamed from: h */
    public static final CharSequence m88006h(KParameter kParameter) {
        kParameter.getClass();
        StringBuilder sb = new StringBuilder();
        String name = kParameter.getName();
        if (name == null) {
            name = "_";
        }
        sb.append(name);
        sb.append(": ");
        sb.append(kParameter.getType());
        return sb.toString();
    }

    /* JADX INFO: renamed from: o */
    public static final String m88007o(String str) {
        String str2 = StandardNames.f63801C.m91046a() + '.';
        if (!C15386d.m93483J(str, str2, false, 2, null)) {
            str2 = null;
        }
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: p */
    public static final String m88008p(String str) {
        String str2 = StandardNames.f63799A.m91046a() + '.';
        if (!C15386d.m93483J(str, str2, false, 2, null)) {
            str2 = null;
        }
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: r */
    public static final CharSequence m88009r(KParameter kParameter) {
        kParameter.getClass();
        return INSTANCE.m88026y(kParameter.getType());
    }

    /* JADX INFO: renamed from: u */
    public static final CharSequence m88010u(KParameter kParameter) {
        kParameter.getClass();
        return INSTANCE.m88026y(kParameter.getType());
    }

    /* JADX INFO: renamed from: z */
    public static final CharSequence m88011z(Name name) {
        name.getClass();
        return RenderingUtilsKt.m91701c(name);
    }

    /* JADX INFO: renamed from: A */
    public final void m88012A(StringBuilder sb, List<KTypeProjection> list, boolean z) {
        StringBuilder sb2;
        if (list.isEmpty()) {
            sb2 = sb;
        } else {
            sb2 = sb;
            CollectionsKt.joinTo$default(list, sb2, null, "<", ">", 0, null, null, 114, null);
        }
        if (z) {
            sb2.append("?");
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m88013g(StringBuilder sb, KCallable<?> kCallable) {
        List<KParameter> listM87629c = KCallables.m87629c(kCallable);
        if (listM87629c.isEmpty()) {
            return;
        }
        CollectionsKt.joinTo$default(listM87629c, sb, null, "context(", ") ", 0, null, smc0.INSTANCE, 50, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m88014i(StringBuilder sb, String str) {
        Name nameM91079i = Name.m91079i(str);
        nameM91079i.getClass();
        sb.append(RenderingUtilsKt.m91701c(nameM91079i));
    }

    /* JADX INFO: renamed from: j */
    public final StringBuilder m88015j(StringBuilder sb, KParameter kParameter) {
        sb.append(m88026y(kParameter.getType()));
        sb.append(".");
        return sb;
    }

    /* JADX INFO: renamed from: k */
    public final void m88016k(StringBuilder sb, KCallable<?> kCallable) {
        kCallable.getClass();
        List<KParameter> listM87737V = ((KCallableImpl) kCallable).m87737V();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM87737V) {
            KParameter kParameter = (KParameter) obj;
            if (kParameter.getKind() == KParameter.Kind.INSTANCE || kParameter.getKind() == KParameter.Kind.EXTENSION_RECEIVER) {
                arrayList.add(obj);
            }
        }
        KParameter kParameter2 = (KParameter) CollectionsKt.getOrNull(arrayList, 0);
        if (kParameter2 != null) {
            INSTANCE.m88015j(sb, kParameter2);
        }
        KParameter kParameter3 = (KParameter) CollectionsKt.getOrNull(arrayList, 1);
        if (kParameter3 != null) {
            ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
            sb.append("(");
            reflectionObjectRenderer.m88015j(sb, kParameter3).append(")");
        }
    }

    /* JADX INFO: renamed from: l */
    public final FqNameUnsafe m88017l(AbstractKType type, KClass<?> klass) {
        if (type.mo87651h()) {
            return StandardNames.FqNames.f63884b;
        }
        String strMo87470r = klass.mo87470r();
        if (strMo87470r == null) {
            return null;
        }
        FqNameUnsafe fqNameUnsafe = new FqNameUnsafe(strMo87470r);
        if (!type.mo87650g()) {
            return fqNameUnsafe;
        }
        FqName fqNameM88358p = JavaToKotlinClassMap.INSTANCE.m88358p(fqNameUnsafe);
        if (fqNameM88358p != null) {
            return fqNameM88358p.m91054i();
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final String m88018m(KCallable<?> callable) {
        if (callable instanceof KProperty) {
            return m88024w((KProperty) callable);
        }
        if (callable instanceof KFunction) {
            return m88020q((KFunction) callable);
        }
        nnq.m160357a("Illegal callable: ", callable);
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final String m88019n(String lowerRendered, String upperRendered) {
        if (Intrinsics.m87488d(lowerRendered, C15386d.m93479F(upperRendered, "?", "", false, 4, null))) {
            return C15386d.m93479F(upperRendered, "?", "!", false, 4, null);
        }
        if (C15386d.m93489w(upperRendered, "?", false, 2, null)) {
            if (Intrinsics.m87488d(lowerRendered + '?', upperRendered)) {
                return lowerRendered + '!';
            }
        }
        if (Intrinsics.m87488d("(" + lowerRendered + ")?", upperRendered)) {
            return "(" + lowerRendered + ")!";
        }
        String strM91703e = RenderingUtilsKt.m91703e(lowerRendered, upperRendered, new wmc0(lowerRendered), new xmc0(lowerRendered), null, 16, null);
        if (strM91703e != null) {
            return strM91703e;
        }
        return "(" + lowerRendered + ".." + upperRendered + ')';
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final String m88020q(@NotNull KFunction<?> function) {
        function.getClass();
        StringBuilder sb = new StringBuilder();
        ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
        reflectionObjectRenderer.m88013g(sb, function);
        sb.append("fun ");
        reflectionObjectRenderer.m88016k(sb, function);
        reflectionObjectRenderer.m88014i(sb, function.getName());
        CollectionsKt.joinTo$default(KCallables.m87631e(function), sb, ", ", "(", ")", 0, null, tmc0.INSTANCE, 48, null);
        sb.append(": ");
        sb.append(reflectionObjectRenderer.m88026y(function.getReturnType()));
        return sb.toString();
    }

    /* JADX INFO: renamed from: s */
    public final void m88021s(StringBuilder sb, KType kType) {
        if (kType.mo87561k()) {
            sb.append("(");
        }
        CollectionsKt.joinTo$default(CollectionsKt.dropLast(kType.mo87560j(), 1), sb, null, "(", ") -> ", 0, null, null, 114, null);
        sb.append(CollectionsKt.last((List) kType.mo87560j()));
        if (kType.mo87561k()) {
            sb.append(")?");
        }
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final String m88022t(@NotNull KFunction<?> lambda) {
        lambda.getClass();
        StringBuilder sb = new StringBuilder();
        KParameter kParameterM87630d = KCallables.m87630d(lambda);
        if (kParameterM87630d != null) {
            sb.append(INSTANCE.m88026y(kParameterM87630d.getType()));
            sb.append(".");
        }
        CollectionsKt.joinTo$default(KCallables.m87631e(lambda), sb, ", ", "(", ")", 0, null, umc0.INSTANCE, 48, null);
        sb.append(" -> ");
        sb.append(INSTANCE.m88026y(lambda.getReturnType()));
        return sb.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final String m88023v(@NotNull KParameter parameter) {
        parameter.getClass();
        StringBuilder sb = new StringBuilder();
        int i = WhenMappings.f63722a[parameter.getKind().ordinal()];
        if (i == 1) {
            sb.append("instance parameter");
        } else if (i == 2) {
            sb.append("context parameter " + parameter.getName());
        } else if (i == 3) {
            sb.append("extension receiver parameter");
        } else {
            if (i != 4) {
                l9r.m149037a();
                return null;
            }
            sb.append("parameter #" + parameter.getIndex() + ' ' + parameter.getName());
        }
        sb.append(" of ");
        sb.append(INSTANCE.m88018m(((KParameterImpl) parameter).m87913m()));
        return sb.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final String m88024w(@NotNull KProperty<?> property) {
        property.getClass();
        StringBuilder sb = new StringBuilder();
        ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
        reflectionObjectRenderer.m88013g(sb, property);
        sb.append(property instanceof KMutableProperty ? "var " : "val ");
        reflectionObjectRenderer.m88016k(sb, property);
        reflectionObjectRenderer.m88014i(sb, property.getName());
        sb.append(": ");
        sb.append(reflectionObjectRenderer.m88026y(property.getReturnType()));
        return sb.toString();
    }

    /* JADX INFO: renamed from: x */
    public final void m88025x(StringBuilder sb, KClass<?> kClass, FqNameUnsafe fqNameUnsafe, List<KTypeProjection> list, boolean z) {
        ReflectionObjectRenderer reflectionObjectRenderer;
        StringBuilder sb2;
        if (kClass.getTypeParameters().size() >= list.size() || JvmClassMappingKt.m87452b(kClass).getDeclaringClass() == null) {
            reflectionObjectRenderer = this;
            sb2 = sb;
            sb2.append(RenderingUtilsKt.m91700b(fqNameUnsafe));
        } else {
            Class<?> declaringClass = JvmClassMappingKt.m87452b(kClass).getDeclaringClass();
            declaringClass.getClass();
            reflectionObjectRenderer = this;
            sb2 = sb;
            reflectionObjectRenderer.m88025x(sb2, JvmClassMappingKt.m87455e(declaringClass), fqNameUnsafe.m91063g(), CollectionsKt.drop(list, kClass.getTypeParameters().size()), false);
            sb2.append(".");
            sb2.append(RenderingUtilsKt.m91701c(fqNameUnsafe.m91065j()));
        }
        reflectionObjectRenderer.m88012A(sb2, CollectionsKt.take(list, kClass.getTypeParameters().size()), z);
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final String m88026y(@NotNull KType type) {
        type.getClass();
        AbstractKType abstractKType = (AbstractKType) type;
        AbstractKType abstractKTypeMo87652l = abstractKType.mo87652l();
        AbstractKType abstractKTypeMo87653m = abstractKType.mo87653m();
        if (abstractKTypeMo87652l != null && abstractKTypeMo87653m != null) {
            return m88019n(m88026y(abstractKTypeMo87652l), m88026y(abstractKTypeMo87653m));
        }
        StringBuilder sb = new StringBuilder();
        KType kTypeMo87648d = abstractKType.mo87648d();
        if (kTypeMo87648d != null) {
            sb.append(kTypeMo87648d);
            sb.append(" /* = ");
        }
        KClassifier kClassifierMo87559i = type.mo87559i();
        if (kClassifierMo87559i instanceof KTypeParameter) {
            INSTANCE.m88014i(sb, ((KTypeParameter) kClassifierMo87559i).getName());
            if (type.mo87561k()) {
                sb.append("?");
            } else if (((AbstractKType) type).mo87649e()) {
                sb.append(" & Any");
            }
        } else if (kClassifierMo87559i instanceof KClass) {
            ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
            KClass<?> kClass = (KClass) kClassifierMo87559i;
            FqNameUnsafe fqNameUnsafeM88017l = reflectionObjectRenderer.m88017l((AbstractKType) type, kClass);
            if (fqNameUnsafeM88017l == null) {
                fqNameUnsafeM88017l = new FqNameUnsafe(KClassesJvm.m87638a(kClass));
            }
            FqNameUnsafe fqNameUnsafe = fqNameUnsafeM88017l;
            if (!FunctionTypesKt.m88161r(fqNameUnsafe) || type.mo87560j().contains(KTypeProjection.INSTANCE.m87615c())) {
                reflectionObjectRenderer.m88025x(sb, kClass, fqNameUnsafe, type.mo87560j(), type.mo87561k());
            } else {
                reflectionObjectRenderer.m88021s(sb, type);
            }
        } else if (kClassifierMo87559i instanceof KTypeAliasImpl) {
            CollectionsKt.joinTo$default(((KTypeAliasImpl) kClassifierMo87559i).getFqName().m91050e(), sb, ".", null, null, 0, null, vmc0.INSTANCE, 60, null);
            INSTANCE.m88012A(sb, type.mo87560j(), type.mo87561k());
        } else {
            sb.append("???");
        }
        if (((AbstractKType) type).mo87648d() != null) {
            sb.append(" */");
        }
        return sb.toString();
    }
}
