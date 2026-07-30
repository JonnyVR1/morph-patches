package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013J'\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000bj\u0002`\fH&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\u00020\u00062\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000bj\u0002`\fH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m88121d2 = {"Ll/lyk;", "", "E", "", Constants.KEY_KEY, "value", "", "b", "(Ljava/lang/String;Ljava/lang/Object;)V", "e", "(Ljava/lang/String;)Ljava/lang/Object;", "", "Lcom/facebook/fresco/middleware/Extras;", "getExtras", "()Ljava/util/Map;", "extras", Constants.INAPP_DATA_TAG, "(Ljava/util/Map;)V", "Companion", "a", "middleware_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface lyk {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f134109a;

    /* JADX INFO: renamed from: l.lyk$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m88121d2 = {"Ll/lyk$a;", "", "<init>", "()V", "middleware_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f134109a = new Companion();
    }

    /* JADX INFO: renamed from: b */
    <E> void mo97949b(@NotNull String key, @Nullable E value);

    /* JADX INFO: renamed from: d */
    void mo97950d(@NotNull Map<String, ? extends Object> extras);

    @Nullable
    /* JADX INFO: renamed from: e */
    <E> E mo117668e(@NotNull String key);

    @NotNull
    Map<String, Object> getExtras();
}
