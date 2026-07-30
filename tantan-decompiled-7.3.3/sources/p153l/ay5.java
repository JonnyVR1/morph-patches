package p153l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m88121d2 = {"Ll/ay5;", "", "<init>", "()V", "", "errorType", "", "errorMsg", "a", "(ILjava/lang/String;)Ljava/lang/String;", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ay5 {

    @NotNull
    public static final ay5 INSTANCE = new ay5();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m100864b(ay5 ay5Var, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        return ay5Var.m100865a(i, str);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m100865a(int errorType, @Nullable String errorMsg) {
        String str;
        switch (errorType) {
            case 10001:
                str = "0x1 MediaExtractor exception";
                break;
            case 10002:
                str = "0x2 MediaCodec exception";
                break;
            case 10003:
                str = "0x3 thread create fail";
                break;
            case 10004:
                str = "0x4 render create fail";
                break;
            case 10005:
                str = "0x5 parse config fail";
                break;
            case 10006:
                str = "0x6 vapx fail";
                break;
            default:
                str = "unknown";
                break;
        }
        if (errorMsg == null) {
            errorMsg = "";
        }
        return str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + errorMsg;
    }
}
