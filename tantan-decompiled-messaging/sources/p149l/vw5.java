package p149l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"Ll/vw5;", "", "<init>", "()V", "", "errorType", "", "errorMsg", "a", "(ILjava/lang/String;)Ljava/lang/String;", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class vw5 {

    @NotNull
    public static final vw5 INSTANCE = new vw5();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m200283b(vw5 vw5Var, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        return vw5Var.m200284a(i, str);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m200284a(int errorType, @Nullable String errorMsg) {
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
