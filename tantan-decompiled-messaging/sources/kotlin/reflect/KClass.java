package kotlin.reflect;

import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138&X§\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00138&X§\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010!\u001a\u00020\u00078&X§\u0004¢\u0006\f\u0012\u0004\b \u0010\u0018\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, m87232d2 = {"Lkotlin/reflect/KClass;", "", j6f.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KDeclarationContainer;", "Lkotlin/reflect/KAnnotatedElement;", "Lkotlin/reflect/KClassifier;", "value", "", "isInstance", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", BLiveStormDanmakuGiftResourceType.f44446s, "()Ljava/lang/String;", "simpleName", "r", "qualifiedName", "", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "()Ljava/util/List;", "getTypeParameters$annotations", "()V", "typeParameters", "Lkotlin/reflect/KType;", "c", "getSupertypes$annotations", "supertypes", "q", "()Z", "isValue$annotations", "isValue", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public interface KClass<T> extends KDeclarationContainer, KAnnotatedElement, KClassifier {

    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class DefaultImpls {
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    List<KType> mo87467c();

    @NotNull
    List<KTypeParameter> getTypeParameters();

    int hashCode();

    @SinceKotlin
    boolean isInstance(@Nullable Object value);

    /* JADX INFO: renamed from: q */
    boolean mo87469q();

    @Nullable
    /* JADX INFO: renamed from: r */
    String mo87470r();

    @Nullable
    /* JADX INFO: renamed from: s */
    String mo87471s();
}
