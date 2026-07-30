package p149l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftDetail;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.set.LiveGiftWallSetSubTabItemView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u00020\u00112\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00182\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u0006R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, m87232d2 = {"Ll/mns;", "Ll/dac0;", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGiftDetail;", "Ll/lns;", "presenter", "<init>", "(Ll/lns;)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", Item.TYPE, "position", "", "E", "(Landroid/view/View;Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGiftDetail;II)V", "F", "(I)Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGiftDetail;", b2s.C_ZONE, "()I", "", "data", "G", "(Ljava/util/List;Ll/lns;)V", "c", "Ll/lns;", "getPresenter", "()Ll/lns;", "setPresenter", "", Constants.INAPP_DATA_TAG, "Ljava/util/List;", "getItems", "()Ljava/util/List;", FirebaseAnalytics.Param.ITEMS, "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class mns extends dac0<BLiveNewGiftWallGiftDetail> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public lns presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<BLiveNewGiftWallGiftDetail> items;

    public mns(@NotNull lns lnsVar) {
        lnsVar.getClass();
        this.presenter = lnsVar;
        this.items = new ArrayList();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.items.size();
    }

    @Override // p149l.dac0
    @Nullable
    /* JADX INFO: renamed from: D */
    public View mo28825D(@NotNull ViewGroup parent, int itemViewType) {
        parent.getClass();
        return LayoutInflater.from(parent.getContext()).inflate(t6c0.f168105M1, parent, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(@NotNull View convertView, @NotNull BLiveNewGiftWallGiftDetail item, int itemViewType, int position) {
        convertView.getClass();
        item.getClass();
        ((LiveGiftWallSetSubTabItemView) convertView).m73654k0(item, position, this.presenter);
    }

    @Override // p149l.dac0
    @NotNull
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BLiveNewGiftWallGiftDetail getItem(int position) {
        return this.items.get(position);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: G */
    public final void m155564G(@Nullable List<? extends BLiveNewGiftWallGiftDetail> data, @NotNull lns presenter) {
        presenter.getClass();
        this.presenter = presenter;
        this.items.clear();
        List<BLiveNewGiftWallGiftDetail> list = this.items;
        data.getClass();
        list.addAll(data);
        notifyDataSetChanged();
    }
}
