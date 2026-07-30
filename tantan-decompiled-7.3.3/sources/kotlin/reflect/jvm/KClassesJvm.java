package kotlin.reflect.jvm;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.KClassImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0019\u0010\u0004\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m88121d2 = {"Lkotlin/reflect/KClass;", "", "a", "(Lkotlin/reflect/KClass;)Ljava/lang/String;", "jvmName", "kotlin-reflection"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
@JvmName
public final class KClassesJvm {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m88529a(@NotNull KClass<?> kClass) {
        kClass.getClass();
        return ((KClassImpl) kClass).mo88354d().getName();
    }
}
