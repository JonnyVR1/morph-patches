package p002l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.set.LiveGiftWallSetItemView;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallSetDetail;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import l.dac0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u0006R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Ll/vms;", "Ll/dac0;", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallSetDetail;", "Ll/lns;", "presenter", "<init>", "(Ll/lns;)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", "item", "position", "", "E", "(Landroid/view/View;Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallSetDetail;II)V", "F", "(I)Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallSetDetail;", "C", "()I", "", "data", "G", "(Ljava/util/List;)V", "c", "Ll/lns;", "getPresenter", "()Ll/lns;", "setPresenter", "", "d", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "items", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class vms extends dac0<BLiveNewGiftWallSetDetail> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public lns presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<BLiveNewGiftWallSetDetail> items;

    public vms(@NotNull lns lnsVar) {
        lnsVar.getClass();
        this.presenter = lnsVar;
        this.items = new ArrayList();
    }

    /* JADX INFO: renamed from: C */
    public int m24068C() {
        return this.items.size();
    }

    @Nullable
    /* JADX INFO: renamed from: D */
    public View m24069D(@NotNull ViewGroup parent, int itemViewType) {
        parent.getClass();
        return LayoutInflater.from(parent.getContext()).inflate(t6c0.f19577K1, parent, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m24067A(@NotNull View convertView, @NotNull BLiveNewGiftWallSetDetail item, int itemViewType, int position) {
        convertView.getClass();
        item.getClass();
        ((LiveGiftWallSetItemView) convertView).m7197i0(item, this.presenter);
    }

    @Nullable
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BLiveNewGiftWallSetDetail getItem(int position) {
        return this.items.get(position);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: G */
    public final void m24072G(@NotNull List<? extends BLiveNewGiftWallSetDetail> data) {
        data.getClass();
        this.items.clear();
        this.items.addAll(data);
        notifyDataSetChanged();
    }
}
