package p003l;

import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ll/rj20;", "", "<init>", "()V", "", "a", "()Z", "member_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class rj20 {

    @NotNull
    public static final rj20 INSTANCE = new rj20();

    /* JADX INFO: renamed from: a */
    public final boolean m9145a() {
        return !RemoteConfig.x().s("ttt_new_ui_disabled");
    }
}
