package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class mss {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LiveHomeEventBus f135530a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final LiveBaseFrag f135531b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final xuy f135532c = new xuy();

    public mss(@NotNull LiveHomeEventBus liveHomeEventBus, @NotNull LiveBaseFrag liveBaseFrag) {
        this.f135530a = liveHomeEventBus;
        this.f135531b = liveBaseFrag;
    }

    /* JADX INFO: renamed from: a */
    public Act m156171a() {
        return this.f135531b.act();
    }
}
