package p003l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.putong.data.Media;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll/tq5;", "", "<init>", "()V", "Lcom/p1/mobile/putong/data/Media;", "media", "", "a", "(Lcom/p1/mobile/putong/data/Media;)Ljava/lang/String;", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class tq5 {

    @NotNull
    public static final tq5 INSTANCE = new tq5();

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final String m9615a(@Nullable Media media) {
        if (media == null) {
            return null;
        }
        return (media.cover() == null || TextUtils.isEmpty(((Media) media.cover()).url)) ? media.url : ((Media) media.cover()).url;
    }
}
