package p149l;

import android.view.View;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveSuperGodReward;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m87232d2 = {"Ll/awg0;", "", "Lcom/p1/mobile/putong/live/base/data/BLiveSuperGodReward;", Item.TYPE, "Landroid/view/View;", OMSTemplateModeType.view, "<init>", "(Lcom/p1/mobile/putong/live/base/data/BLiveSuperGodReward;Landroid/view/View;)V", "a", "Lcom/p1/mobile/putong/live/base/data/BLiveSuperGodReward;", "()Lcom/p1/mobile/putong/live/base/data/BLiveSuperGodReward;", "setItem", "(Lcom/p1/mobile/putong/live/base/data/BLiveSuperGodReward;)V", "b", "Landroid/view/View;", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class awg0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public BLiveSuperGodReward item;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public View view;

    public awg0(@NotNull BLiveSuperGodReward bLiveSuperGodReward, @Nullable View view) {
        bLiveSuperGodReward.getClass();
        this.item = bLiveSuperGodReward;
        this.view = view;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BLiveSuperGodReward getItem() {
        return this.item;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final View getView() {
        return this.view;
    }
}
