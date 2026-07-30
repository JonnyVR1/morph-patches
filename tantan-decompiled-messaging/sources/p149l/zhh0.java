package p149l;

import com.clevertap.android.sdk.inapp.C1213a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"Ll/zhh0;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/inapp/a;", "systemActionHandler", "", "Ll/oyb;", "a", "(Lcom/clevertap/android/sdk/inapp/a;)Ljava/util/Set;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class zhh0 {

    @NotNull
    public static final zhh0 INSTANCE = new zhh0();

    private zhh0() {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Set<oyb> m218797a(@NotNull C1213a systemActionHandler) {
        systemActionHandler.getClass();
        return SetsKt.setOfNotNull((Object[]) new oyb[]{hq50.INSTANCE.m132431c(systemActionHandler), t580.INSTANCE.m187276e(systemActionHandler), wfb0.INSTANCE.m202981c(systemActionHandler)});
    }
}
