package kotlin.reflect.jvm.internal;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import p153l.avc0;
import p153l.bvc0;
import p153l.cvc0;
import p153l.mpq;
import p153l.nbr;
import p153l.xuc0;
import p153l.yuc0;
import p153l.zuc0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00062\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\t¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u00060\u0017j\u0002`\u0018*\u00060\u0017j\u0002`\u00182\u0006\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001f\u001a\u00020\u001e*\u00060\u0017j\u0002`\u00182\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010!\u001a\u00020\u001e*\u00060\u0017j\u0002`\u00182\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0002¢\u0006\u0004\b!\u0010 J\u001f\u0010#\u001a\u00020\u001e*\u00060\u0017j\u0002`\u00182\u0006\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010%\u001a\u00020\u00062\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0002¢\u0006\u0004\b%\u0010&J%\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\u0014\u001a\u00020'2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030(H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\u001e*\u00060\u0017j\u0002`\u00182\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b-\u0010.JA\u00105\u001a\u00020\u001e*\u00060\u0017j\u0002`\u00182\n\u0010)\u001a\u0006\u0012\u0002\b\u00030(2\u0006\u0010/\u001a\u00020*2\f\u00102\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J-\u00108\u001a\u00020\u001e*\u00060\u0017j\u0002`\u00182\f\u00107\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b8\u00109J\u001f\u0010<\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u0002¢\u0006\u0004\b<\u0010=¨\u0006>"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;", "", "<init>", "()V", "Lkotlin/reflect/KProperty;", "property", "", "w", "(Lkotlin/reflect/KProperty;)Ljava/lang/String;", "Lkotlin/reflect/KFunction;", "function", "q", "(Lkotlin/reflect/KFunction;)Ljava/lang/String;", "lambda", Constants.KEY_T, "Lkotlin/reflect/KParameter;", "parameter", ResourceDirection.f39656v, "(Lkotlin/reflect/KParameter;)Ljava/lang/String;", "Lkotlin/reflect/KType;", "type", BaseSei.f14625Y, "(Lkotlin/reflect/KType;)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "receiver", "j", "(Ljava/lang/StringBuilder;Lkotlin/reflect/KParameter;)Ljava/lang/StringBuilder;", "Lkotlin/reflect/KCallable;", "callable", "", "k", "(Ljava/lang/StringBuilder;Lkotlin/reflect/KCallable;)V", "g", AuthenticationTokenClaims.JSON_KEY_NAME, RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "m", "(Lkotlin/reflect/KCallable;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/AbstractKType;", "Lkotlin/reflect/KClass;", "klass", "Lkotlin/reflect/jvm/internal/impl/name/FqNameUnsafe;", BLiveStormDanmakuGiftResourceType.f45292l, "(Lkotlin/reflect/jvm/internal/AbstractKType;Lkotlin/reflect/KClass;)Lkotlin/reflect/jvm/internal/impl/name/FqNameUnsafe;", BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/lang/StringBuilder;Lkotlin/reflect/KType;)V", "classFqName", "", "Lkotlin/reflect/KTypeProjection;", "allArguments", "", "isMarkedNullable", BaseSei.f14624X, "(Ljava/lang/StringBuilder;Lkotlin/reflect/KClass;Lkotlin/reflect/jvm/internal/impl/name/FqNameUnsafe;Ljava/util/List;Z)V", "typeArguments", "A", "(Ljava/lang/StringBuilder;Ljava/util/List;Z)V", "lowerRendered", "upperRendered", "n", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ReflectionObjectRenderer {

    @NotNull
    public static final ReflectionObjectRenderer INSTANCE = new ReflectionObjectRenderer();

    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64396a;

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
            f64396a = iArr;
        }
    }

    private ReflectionObjectRenderer() {
    }

    /* JADX INFO: renamed from: h */
    public static final CharSequence m88897h(KParameter kParameter) {
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
    public static final String m88898o(String str) {
        String str2 = StandardNames.f64475C.m91937a() + '.';
        if (!C15493d.m94374J(str, str2, false, 2, null)) {
            str2 = null;
        }
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: p */
    public static final String m88899p(String str) {
        String str2 = StandardNames.f64473A.m91937a() + '.';
        if (!C15493d.m94374J(str, str2, false, 2, null)) {
            str2 = null;
        }
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: r */
    public static final CharSequence m88900r(KParameter kParameter) {
        kParameter.getClass();
        return INSTANCE.m88917y(kParameter.getType());
    }

    /* JADX INFO: renamed from: u */
    public static final CharSequence m88901u(KParameter kParameter) {
        kParameter.getClass();
        return INSTANCE.m88917y(kParameter.getType());
    }

    /* JADX INFO: renamed from: z */
    public static final CharSequence m88902z(Name name) {
        name.getClass();
        return RenderingUtilsKt.m92592c(name);
    }

    /* JADX INFO: renamed from: A */
    public final void m88903A(StringBuilder sb, List<KTypeProjection> list, boolean z) {
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
    public final void m88904g(StringBuilder sb, KCallable<?> kCallable) {
        List<KParameter> listM88520c = KCallables.m88520c(kCallable);
        if (listM88520c.isEmpty()) {
            return;
        }
        CollectionsKt.joinTo$default(listM88520c, sb, null, "context(", ") ", 0, null, xuc0.INSTANCE, 50, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m88905i(StringBuilder sb, String str) {
        Name nameM91970i = Name.m91970i(str);
        nameM91970i.getClass();
        sb.append(RenderingUtilsKt.m92592c(nameM91970i));
    }

    /* JADX INFO: renamed from: j */
    public final StringBuilder m88906j(StringBuilder sb, KParameter kParameter) {
        sb.append(m88917y(kParameter.getType()));
        sb.append(".");
        return sb;
    }

    /* JADX INFO: renamed from: k */
    public final void m88907k(StringBuilder sb, KCallable<?> kCallable) {
        kCallable.getClass();
        List<KParameter> listM88628V = ((KCallableImpl) kCallable).m88628V();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM88628V) {
            KParameter kParameter = (KParameter) obj;
            if (kParameter.getKind() == KParameter.Kind.INSTANCE || kParameter.getKind() == KParameter.Kind.EXTENSION_RECEIVER) {
                arrayList.add(obj);
            }
        }
        KParameter kParameter2 = (KParameter) CollectionsKt.getOrNull(arrayList, 0);
        if (kParameter2 != null) {
            INSTANCE.m88906j(sb, kParameter2);
        }
        KParameter kParameter3 = (KParameter) CollectionsKt.getOrNull(arrayList, 1);
        if (kParameter3 != null) {
            ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
            sb.append("(");
            reflectionObjectRenderer.m88906j(sb, kParameter3).append(")");
        }
    }

    /* JADX INFO: renamed from: l */
    public final FqNameUnsafe m88908l(AbstractKType type, KClass<?> klass) {
        if (type.mo88542h()) {
            return StandardNames.FqNames.f64558b;
        }
        String strMo88359r = klass.mo88359r();
        if (strMo88359r == null) {
            return null;
        }
        FqNameUnsafe fqNameUnsafe = new FqNameUnsafe(strMo88359r);
        if (!type.mo88541g()) {
            return fqNameUnsafe;
        }
        FqName fqNameM89249p = JavaToKotlinClassMap.INSTANCE.m89249p(fqNameUnsafe);
        if (fqNameM89249p != null) {
            return fqNameM89249p.m91945i();
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final String m88909m(KCallable<?> callable) {
        if (callable instanceof KProperty) {
            return m88915w((KProperty) callable);
        }
        if (callable instanceof KFunction) {
            return m88911q((KFunction) callable);
        }
        mpq.m159379a("Illegal callable: ", callable);
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final String m88910n(String lowerRendered, String upperRendered) {
        if (Intrinsics.m88377d(lowerRendered, C15493d.m94370F(upperRendered, "?", "", false, 4, null))) {
            return C15493d.m94370F(upperRendered, "?", "!", false, 4, null);
        }
        if (C15493d.m94380w(upperRendered, "?", false, 2, null)) {
            if (Intrinsics.m88377d(lowerRendered + '?', upperRendered)) {
                return lowerRendered + '!';
            }
        }
        if (Intrinsics.m88377d("(" + lowerRendered + ")?", upperRendered)) {
            return "(" + lowerRendered + ")!";
        }
        String strM92594e = RenderingUtilsKt.m92594e(lowerRendered, upperRendered, new bvc0(lowerRendered), new cvc0(lowerRendered), null, 16, null);
        if (strM92594e != null) {
            return strM92594e;
        }
        return "(" + lowerRendered + ".." + upperRendered + ')';
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final String m88911q(@NotNull KFunction<?> function) {
        function.getClass();
        StringBuilder sb = new StringBuilder();
        ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
        reflectionObjectRenderer.m88904g(sb, function);
        sb.append("fun ");
        reflectionObjectRenderer.m88907k(sb, function);
        reflectionObjectRenderer.m88905i(sb, function.getName());
        CollectionsKt.joinTo$default(KCallables.m88522e(function), sb, ", ", "(", ")", 0, null, yuc0.INSTANCE, 48, null);
        sb.append(": ");
        sb.append(reflectionObjectRenderer.m88917y(function.getReturnType()));
        return sb.toString();
    }

    /* JADX INFO: renamed from: s */
    public final void m88912s(StringBuilder sb, KType kType) {
        if (kType.mo88451k()) {
            sb.append("(");
        }
        CollectionsKt.joinTo$default(CollectionsKt.dropLast(kType.mo88450j(), 1), sb, null, "(", ") -> ", 0, null, null, 114, null);
        sb.append(CollectionsKt.last((List) kType.mo88450j()));
        if (kType.mo88451k()) {
            sb.append(")?");
        }
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final String m88913t(@NotNull KFunction<?> lambda) {
        lambda.getClass();
        StringBuilder sb = new StringBuilder();
        KParameter kParameterM88521d = KCallables.m88521d(lambda);
        if (kParameterM88521d != null) {
            sb.append(INSTANCE.m88917y(kParameterM88521d.getType()));
            sb.append(".");
        }
        CollectionsKt.joinTo$default(KCallables.m88522e(lambda), sb, ", ", "(", ")", 0, null, zuc0.INSTANCE, 48, null);
        sb.append(" -> ");
        sb.append(INSTANCE.m88917y(lambda.getReturnType()));
        return sb.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final String m88914v(@NotNull KParameter parameter) {
        parameter.getClass();
        StringBuilder sb = new StringBuilder();
        int i = WhenMappings.f64396a[parameter.getKind().ordinal()];
        if (i == 1) {
            sb.append("instance parameter");
        } else if (i == 2) {
            sb.append("context parameter " + parameter.getName());
        } else if (i == 3) {
            sb.append("extension receiver parameter");
        } else {
            if (i != 4) {
                nbr.m162172a();
                return null;
            }
            sb.append("parameter #" + parameter.getIndex() + ' ' + parameter.getName());
        }
        sb.append(" of ");
        sb.append(INSTANCE.m88909m(((KParameterImpl) parameter).m88804m()));
        return sb.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final String m88915w(@NotNull KProperty<?> property) {
        property.getClass();
        StringBuilder sb = new StringBuilder();
        ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
        reflectionObjectRenderer.m88904g(sb, property);
        sb.append(property instanceof KMutableProperty ? "var " : "val ");
        reflectionObjectRenderer.m88907k(sb, property);
        reflectionObjectRenderer.m88905i(sb, property.getName());
        sb.append(": ");
        sb.append(reflectionObjectRenderer.m88917y(property.getReturnType()));
        return sb.toString();
    }

    /* JADX INFO: renamed from: x */
    public final void m88916x(StringBuilder sb, KClass<?> kClass, FqNameUnsafe fqNameUnsafe, List<KTypeProjection> list, boolean z) {
        ReflectionObjectRenderer reflectionObjectRenderer;
        StringBuilder sb2;
        if (kClass.getTypeParameters().size() >= list.size() || JvmClassMappingKt.m88341b(kClass).getDeclaringClass() == null) {
            reflectionObjectRenderer = this;
            sb2 = sb;
            sb2.append(RenderingUtilsKt.m92591b(fqNameUnsafe));
        } else {
            Class<?> declaringClass = JvmClassMappingKt.m88341b(kClass).getDeclaringClass();
            declaringClass.getClass();
            reflectionObjectRenderer = this;
            sb2 = sb;
            reflectionObjectRenderer.m88916x(sb2, JvmClassMappingKt.m88344e(declaringClass), fqNameUnsafe.m91954g(), CollectionsKt.drop(list, kClass.getTypeParameters().size()), false);
            sb2.append(".");
            sb2.append(RenderingUtilsKt.m92592c(fqNameUnsafe.m91956j()));
        }
        reflectionObjectRenderer.m88903A(sb2, CollectionsKt.take(list, kClass.getTypeParameters().size()), z);
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final String m88917y(@NotNull KType type) {
        type.getClass();
        AbstractKType abstractKType = (AbstractKType) type;
        AbstractKType abstractKTypeMo88543l = abstractKType.mo88543l();
        AbstractKType abstractKTypeMo88544m = abstractKType.mo88544m();
        if (abstractKTypeMo88543l != null && abstractKTypeMo88544m != null) {
            return m88910n(m88917y(abstractKTypeMo88543l), m88917y(abstractKTypeMo88544m));
        }
        StringBuilder sb = new StringBuilder();
        KType kTypeMo88539d = abstractKType.mo88539d();
        if (kTypeMo88539d != null) {
            sb.append(kTypeMo88539d);
            sb.append(" /* = ");
        }
        KClassifier kClassifierMo88449i = type.mo88449i();
        if (kClassifierMo88449i instanceof KTypeParameter) {
            INSTANCE.m88905i(sb, ((KTypeParameter) kClassifierMo88449i).getName());
            if (type.mo88451k()) {
                sb.append("?");
            } else if (((AbstractKType) type).mo88540e()) {
                sb.append(" & Any");
            }
        } else if (kClassifierMo88449i instanceof KClass) {
            ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
            KClass<?> kClass = (KClass) kClassifierMo88449i;
            FqNameUnsafe fqNameUnsafeM88908l = reflectionObjectRenderer.m88908l((AbstractKType) type, kClass);
            if (fqNameUnsafeM88908l == null) {
                fqNameUnsafeM88908l = new FqNameUnsafe(KClassesJvm.m88529a(kClass));
            }
            FqNameUnsafe fqNameUnsafe = fqNameUnsafeM88908l;
            if (!FunctionTypesKt.m89052r(fqNameUnsafe) || type.mo88450j().contains(KTypeProjection.INSTANCE.m88506c())) {
                reflectionObjectRenderer.m88916x(sb, kClass, fqNameUnsafe, type.mo88450j(), type.mo88451k());
            } else {
                reflectionObjectRenderer.m88912s(sb, type);
            }
        } else if (kClassifierMo88449i instanceof KTypeAliasImpl) {
            CollectionsKt.joinTo$default(((KTypeAliasImpl) kClassifierMo88449i).getFqName().m91941e(), sb, ".", null, null, 0, null, avc0.INSTANCE, 60, null);
            INSTANCE.m88903A(sb, type.mo88450j(), type.mo88451k());
        } else {
            sb.append("???");
        }
        if (((AbstractKType) type).mo88539d() != null) {
            sb.append(" */");
        }
        return sb.toString();
    }
}
