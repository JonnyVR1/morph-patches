package p153l;

import com.clevertap.android.sdk.inapp.C1236a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m88121d2 = {"Ll/gqh0;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/inapp/a;", "systemActionHandler", "", "Ll/c0c;", "a", "(Lcom/clevertap/android/sdk/inapp/a;)Ljava/util/Set;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class gqh0 {

    @NotNull
    public static final gqh0 INSTANCE = new gqh0();

    private gqh0() {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Set<c0c> m131376a(@NotNull C1236a systemActionHandler) {
        systemActionHandler.getClass();
        return SetsKt.setOfNotNull((Object[]) new c0c[]{ny50.INSTANCE.m165312c(systemActionHandler), zd80.INSTANCE.m219281e(systemActionHandler), aob0.INSTANCE.m99058c(systemActionHandler)});
    }
}
