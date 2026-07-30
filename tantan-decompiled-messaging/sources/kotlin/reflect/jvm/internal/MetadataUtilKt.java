package kotlin.reflect.jvm.internal;

import com.facebook.AuthenticationTokenClaims;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.nx50;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u0000*\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t*\u00020\u00072\n\u0010\b\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"", "Lkotlin/reflect/jvm/internal/impl/km/ClassName;", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "b", "(Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "c", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/ClassLoader;", AuthenticationTokenClaims.JSON_KEY_NAME, "Lkotlin/reflect/KClass;", "a", "(Ljava/lang/ClassLoader;Ljava/lang/String;)Lkotlin/reflect/KClass;", "kotlin-reflection"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class MetadataUtilKt {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final KClass<?> m87988a(@NotNull ClassLoader classLoader, @NotNull String str) {
        classLoader.getClass();
        str.getClass();
        Class clsM88052o = UtilKt.m88052o(classLoader, m87989b(str), 0, 2, null);
        if (clsM88052o != null) {
            return JvmClassMappingKt.m87455e(clsM88052o);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final ClassId m87989b(@NotNull String str) {
        str.getClass();
        boolean zM93483J = C15386d.m93483J(str, ".", false, 2, null);
        if (zM93483J) {
            str = str.substring(1);
        }
        return new ClassId(new FqName(C15386d.m93478E(StringsKt.m93427W0(str, '/', ""), '/', '.', false, 4, null)), new FqName(StringsKt.m93415Q0(str, '/', null, 2, null)), zM93483J);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m87990c(@NotNull String str) {
        str.getClass();
        if (!C15386d.m93483J(str, ".", false, 2, null)) {
            return StringsKt.m93415Q0(StringsKt.m93415Q0(str, '/', null, 2, null), '.', null, 2, null);
        }
        nx50.m161932a("Local class is not supported: ", str);
        return null;
    }
}
