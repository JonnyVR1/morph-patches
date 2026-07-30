package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.live.base.data.BLiveHeatVoiceRoomTask;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.guide.HeatTaskItemView;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, m88121d2 = {"Ll/o0l;", "Ll/jic0;", "Lcom/p1/mobile/putong/live/base/data/BLiveHeatVoiceRoomTask;", "Ll/i1l;", "presenter", "<init>", "(Ll/i1l;)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", Item.TYPE, "position", "", "E", "(Landroid/view/View;Lcom/p1/mobile/putong/live/base/data/BLiveHeatVoiceRoomTask;II)V", "F", "(I)Lcom/p1/mobile/putong/live/base/data/BLiveHeatVoiceRoomTask;", c4s.C_ZONE, "()I", "", "newData", "G", "(Ljava/util/List;)V", "c", "Ll/i1l;", "Lcom/p1/mobile/android/app/Act;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "e", "Ljava/util/List;", "data", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class o0l extends jic0<BLiveHeatVoiceRoomTask> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final i1l<?> presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final List<BLiveHeatVoiceRoomTask> data;

    public o0l(@NotNull i1l<?> i1lVar) {
        i1lVar.getClass();
        this.presenter = i1lVar;
        Act act = i1lVar.act();
        act.getClass();
        this.act = act;
        this.data = new ArrayList();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.data.size();
    }

    @Override // p153l.jic0
    @NotNull
    /* JADX INFO: renamed from: D */
    public View mo29824D(@NotNull ViewGroup parent, int itemViewType) {
        parent.getClass();
        View viewInflate = this.act.inflater().inflate(yec0.f199026b9, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(@NotNull View convertView, @NotNull BLiveHeatVoiceRoomTask item, int itemViewType, int position) {
        convertView.getClass();
        item.getClass();
        ((HeatTaskItemView) convertView).m78594j0(item, this.presenter);
    }

    @Override // p153l.jic0
    @NotNull
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BLiveHeatVoiceRoomTask getItem(int position) {
        return this.data.get(position);
    }

    /* JADX INFO: renamed from: G */
    public final void m165542G(@NotNull List<? extends BLiveHeatVoiceRoomTask> newData) {
        newData.getClass();
        this.data.clear();
        this.data.addAll(newData);
        notifyDataSetChanged();
    }
}
