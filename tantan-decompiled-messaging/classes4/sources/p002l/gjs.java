package p002l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.skin.list.LiveGiftSkinItemView;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftSkin;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.dac0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b\u0006\u0010&\"\u0004\b'\u0010(R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Ll/gjs;", "Ll/dac0;", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftSkin;", "Ll/sjs;", "presenter", "", "isDark", "<init>", "(Ll/sjs;Z)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", "item", "position", "", "E", "(Landroid/view/View;Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftSkin;II)V", "F", "(I)Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftSkin;", "C", "()I", "", "data", "G", "(Ljava/util/List;)V", "c", "Ll/sjs;", "getPresenter", "()Ll/sjs;", "setPresenter", "(Ll/sjs;)V", "d", "Z", "()Z", "setDark", "(Z)V", "", "e", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "items", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class gjs extends dac0<BLiveNewGiftSkin> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public sjs presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean isDark;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final List<BLiveNewGiftSkin> items;

    public gjs(@NotNull sjs sjsVar, boolean z) {
        sjsVar.getClass();
        this.presenter = sjsVar;
        this.isDark = z;
        this.items = new ArrayList();
    }

    /* JADX INFO: renamed from: C */
    public int m13872C() {
        return this.items.size();
    }

    @Nullable
    /* JADX INFO: renamed from: D */
    public View m13873D(@NotNull ViewGroup parent, int itemViewType) {
        parent.getClass();
        return LayoutInflater.from(parent.getContext()).inflate(t6c0.f19457A1, parent, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m13871A(@NotNull View convertView, @Nullable BLiveNewGiftSkin item, int itemViewType, int position) {
        convertView.getClass();
        ((LiveGiftSkinItemView) convertView).m7575j0(item, this.presenter, this.isDark);
    }

    @NotNull
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BLiveNewGiftSkin getItem(int position) {
        return this.items.get(position);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: G */
    public final void m13876G(@NotNull List<? extends BLiveNewGiftSkin> data) {
        data.getClass();
        this.items.clear();
        this.items.addAll(data);
        notifyDataSetChanged();
    }

    public /* synthetic */ gjs(sjs sjsVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sjsVar, (i & 2) != 0 ? false : z);
    }
}
