package p149l;

import com.p046p1.mobile.putong.live.external.square.search.LiveSearchAct;
import com.tantan.live.search.eventbus.LiveSearchEventBus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class hkt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LiveSearchEventBus f108266a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final LiveSearchAct f108267b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final xuy f108268c = new xuy();

    public hkt(@NotNull LiveSearchEventBus liveSearchEventBus, @NotNull LiveSearchAct liveSearchAct) {
        this.f108266a = liveSearchEventBus;
        this.f108267b = liveSearchAct;
    }
}
