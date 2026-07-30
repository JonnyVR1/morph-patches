package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Media;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/xr5;", "", "<init>", "()V", "Lcom/p1/mobile/putong/data/Media;", "media", "", "a", "(Lcom/p1/mobile/putong/data/Media;)Ljava/lang/String;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class xr5 {

    @NotNull
    public static final xr5 INSTANCE = new xr5();

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final String m212781a(@Nullable Media media) {
        if (media == null) {
            return null;
        }
        return (media.cover() == null || TextUtils.isEmpty(media.cover().url)) ? media.url : media.cover().url;
    }
}
