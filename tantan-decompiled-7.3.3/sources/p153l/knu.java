package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.external.internal.vchat.LiveVChatAct;
import com.p051p1.mobile.putong.live.external.internal.vchat.LiveVChatEventBus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class knu {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LiveVChatEventBus f127638a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final LiveVChatAct f127639b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final u3z f127640c = new u3z();

    /* JADX INFO: renamed from: d */
    public ner f127641d;

    /* JADX INFO: renamed from: e */
    public xnu f127642e;

    /* JADX INFO: renamed from: f */
    public boolean f127643f;

    public knu(@NotNull LiveVChatEventBus liveVChatEventBus, @NotNull LiveVChatAct liveVChatAct, boolean z, xnu xnuVar) {
        this.f127638a = liveVChatEventBus;
        this.f127639b = liveVChatAct;
        this.f127641d = liveVChatAct;
        this.f127643f = z;
        this.f127642e = xnuVar == null ? new xnu(z) : xnuVar;
    }

    /* JADX INFO: renamed from: a */
    public Act m150552a() {
        return this.f127639b;
    }
}
