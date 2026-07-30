package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.data.Data;
import com.p000p1.mobile.putong.data.Position;
import com.p006ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.LikeMindedItemData;
import com.p1.mobile.putong.core.data.LikeMindedItemLanguagesData;
import com.p1.mobile.putong.core.data.LikeMindedItemStatusData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import l.cdr;
import l.dac0;
import l.o7r;
import l.qib0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001f\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010<\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u00103\u001a\u0004\b:\u00105\"\u0004\b;\u00107R\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010\u001e\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\"\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006D"}, d2 = {"Ll/bdr;", "Ll/dac0;", "Lcom/p1/mobile/putong/core/data/LikeMindedItemStatusData;", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "E", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "itemViewType", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", "item", Position.TYPE, "", "F", "(Landroid/view/View;Lcom/p1/mobile/putong/core/data/LikeMindedItemStatusData;II)V", "", "", "itemData", "", "Lcom/p1/mobile/putong/core/data/LikeMindedItemData;", "same", "language", "K", "(Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)V", "G", "(I)Lcom/p1/mobile/putong/core/data/LikeMindedItemStatusData;", "C", "()I", "c", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lv/VDraweeView;", "d", "Lv/VDraweeView;", "J", "()Lv/VDraweeView;", "set_setting_img", "(Lv/VDraweeView;)V", "_setting_img", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "I", "()Landroid/widget/TextView;", "set_setting_content_title", "(Landroid/widget/TextView;)V", "_setting_content_title", "f", "H", "set_setting_content_desc", "_setting_content_desc", "g", "Ljava/util/List;", Data.TYPE, "h", "Ljava/lang/String;", RXScreenCaptureService.KEY_INDEX, "Ljava/util/Map;", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class bdr extends dac0<LikeMindedItemStatusData> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _setting_img;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _setting_content_title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public TextView _setting_content_desc;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public List<String> data;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public String language;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public Map<String, ? extends LikeMindedItemData> same;

    public bdr(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.data = new ArrayList();
        this.language = "";
        this.same = MapsKt.emptyMap();
    }

    /* JADX INFO: renamed from: C */
    public int m8801C() {
        return this.data.size();
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public View m8802D(@Nullable ViewGroup parent, int itemViewType) {
        LayoutInflater layoutInflaterA = o7r.a(this.act);
        layoutInflaterA.getClass();
        return m8803E(layoutInflaterA, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final View m8803E(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = cdr.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m8800A(@NotNull View convertView, @Nullable LikeMindedItemStatusData item, int itemViewType, int position) {
        convertView.getClass();
        if (item != null) {
            qib0.G.L0(m8808J(), item.icon);
            m8807I().setText(item.title);
            m8806H().setText(item.subTitle);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public LikeMindedItemStatusData getItem(int position) {
        Map map;
        LikeMindedItemLanguagesData likeMindedItemLanguagesData;
        Map map2;
        LikeMindedItemLanguagesData likeMindedItemLanguagesData2;
        String str = this.data.get(position);
        LikeMindedItemData likeMindedItemData = this.same.get(str);
        LikeMindedItemStatusData likeMindedItemStatusData = (likeMindedItemData == null || (map2 = likeMindedItemData.multiLanguage) == null || (likeMindedItemLanguagesData2 = (LikeMindedItemLanguagesData) map2.get(this.language)) == null) ? null : likeMindedItemLanguagesData2.status;
        if (likeMindedItemStatusData != null) {
            return likeMindedItemStatusData;
        }
        LikeMindedItemData likeMindedItemData2 = this.same.get(str);
        if (likeMindedItemData2 == null || (map = likeMindedItemData2.multiLanguage) == null || (likeMindedItemLanguagesData = (LikeMindedItemLanguagesData) map.get("en-US")) == null) {
            return null;
        }
        return likeMindedItemLanguagesData.status;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final TextView m8806H() {
        TextView textView = this._setting_content_desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_setting_content_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final TextView m8807I() {
        TextView textView = this._setting_content_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_setting_content_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final VDraweeView m8808J() {
        VDraweeView vDraweeView = this._setting_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_setting_img");
        return null;
    }

    /* JADX INFO: renamed from: K */
    public final void m8809K(@NotNull List<String> itemData, @NotNull Map<String, ? extends LikeMindedItemData> same, @NotNull String language) {
        itemData.getClass();
        same.getClass();
        language.getClass();
        this.data = itemData;
        this.same = same;
        this.language = language;
    }
}
