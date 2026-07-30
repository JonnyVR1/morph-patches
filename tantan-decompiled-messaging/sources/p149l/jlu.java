package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.external.internal.vchat.LiveVChatAct;
import com.p046p1.mobile.putong.live.external.internal.vchat.LiveVChatEventBus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class jlu {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LiveVChatEventBus f118584a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final LiveVChatAct f118585b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final xuy f118586c = new xuy();

    /* JADX INFO: renamed from: d */
    public mcr f118587d;

    /* JADX INFO: renamed from: e */
    public wlu f118588e;

    /* JADX INFO: renamed from: f */
    public boolean f118589f;

    public jlu(@NotNull LiveVChatEventBus liveVChatEventBus, @NotNull LiveVChatAct liveVChatAct, boolean z, wlu wluVar) {
        this.f118584a = liveVChatEventBus;
        this.f118585b = liveVChatAct;
        this.f118587d = liveVChatAct;
        this.f118589f = z;
        this.f118588e = wluVar == null ? new wlu(z) : wluVar;
    }

    /* JADX INFO: renamed from: a */
    public Act m142119a() {
        return this.f118585b;
    }
}
