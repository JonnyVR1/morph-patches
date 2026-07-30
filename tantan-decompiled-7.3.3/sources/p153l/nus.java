package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class nus {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LiveHomeEventBus f143737a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final LiveBaseFrag f143738b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final u3z f143739c = new u3z();

    public nus(@NotNull LiveHomeEventBus liveHomeEventBus, @NotNull LiveBaseFrag liveBaseFrag) {
        this.f143737a = liveHomeEventBus;
        this.f143738b = liveBaseFrag;
    }

    /* JADX INFO: renamed from: a */
    public Act m164819a() {
        return this.f143738b.act();
    }
}
