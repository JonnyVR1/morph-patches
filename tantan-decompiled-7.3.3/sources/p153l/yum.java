package p153l;

import com.vivo.push.PushClientConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, m88121d2 = {"", PushClientConstants.TAG_CLASS_NAME, "Ll/wum;", "a", "(Ljava/lang/String;)Ll/wum;", "Ljava/lang/String;", "TAG", "work-runtime_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class yum {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f201647a;

    static {
        String strM178831i = qzv.m178831i("InputMerger");
        strM178831i.getClass();
        f201647a = strM178831i;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final wum m217442a(@NotNull String str) {
        str.getClass();
        try {
            Object objNewInstance = Class.forName(str).getDeclaredConstructor(null).newInstance(null);
            objNewInstance.getClass();
            return (wum) objNewInstance;
        } catch (Exception e) {
            qzv.m178829e().mo178835d(f201647a, "Trouble instantiating " + str, e);
            return null;
        }
    }
}
