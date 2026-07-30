package p149l;

import com.vivo.push.PushClientConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, m87232d2 = {"", PushClientConstants.TAG_CLASS_NAME, "Ll/usm;", "a", "(Ljava/lang/String;)Ll/usm;", "Ljava/lang/String;", "TAG", "work-runtime_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class wsm {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f187949a;

    static {
        String strM190978i = txv.m190978i("InputMerger");
        strM190978i.getClass();
        f187949a = strM190978i;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final usm m205520a(@NotNull String str) {
        str.getClass();
        try {
            Object objNewInstance = Class.forName(str).getDeclaredConstructor(null).newInstance(null);
            objNewInstance.getClass();
            return (usm) objNewInstance;
        } catch (Exception e) {
            txv.m190976e().mo190982d(f187949a, "Trouble instantiating " + str, e);
            return null;
        }
    }
}
