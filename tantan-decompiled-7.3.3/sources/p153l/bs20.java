package p153l;

import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Ll/bs20;", "", "<init>", "()V", "", "a", "()Z", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class bs20 {

    @NotNull
    public static final bs20 INSTANCE = new bs20();

    /* JADX INFO: renamed from: a */
    public final boolean m106196a() {
        return !RemoteConfig.m80481x().m80513s("ttt_new_ui_disabled");
    }
}
