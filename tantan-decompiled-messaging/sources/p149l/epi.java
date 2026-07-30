package p149l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.IntlMarketStickerData;
import com.p046p1.mobile.putong.core.data.IntlMarketStickerOptionsData;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.core.p053ui.intloperation.flash.C8384a;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0016\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00100\"\u0004\b6\u00102R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010C\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010:\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>R\u001e\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006J"}, m87232d2 = {"Ll/epi;", "Ll/dac0;", "Lcom/p1/mobile/putong/core/data/IntlMarketStickerOptionsData;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "E", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "itemViewType", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", Item.TYPE, "position", "", "F", "(Landroid/view/View;Lcom/p1/mobile/putong/core/data/IntlMarketStickerOptionsData;II)V", "Lcom/p1/mobile/putong/core/data/IntlMarketStickerData;", "stickerData", "L", "(Lcom/p1/mobile/putong/core/data/IntlMarketStickerData;)V", "G", "(I)Lcom/p1/mobile/putong/core/data/IntlMarketStickerOptionsData;", b2s.C_ZONE, "()I", "c", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroidx/constraintlayout/widget/ConstraintLayout;", Constants.INAPP_DATA_TAG, "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_setting_root", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_setting_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_setting_root", "Lv/VDraweeView;", "e", "Lv/VDraweeView;", "H", "()Lv/VDraweeView;", "set_setting_bg_img", "(Lv/VDraweeView;)V", "_setting_bg_img", "f", "K", "set_setting_img", "_setting_img", "Lv/VText;", "g", "Lv/VText;", "J", "()Lv/VText;", "set_setting_content_title", "(Lv/VText;)V", "_setting_content_title", "h", "I", "set_setting_content_desc", "_setting_content_desc", "", RXScreenCaptureService.KEY_INDEX, "Ljava/util/List;", "data", "j", "Lcom/p1/mobile/putong/core/data/IntlMarketStickerData;", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class epi extends dac0<IntlMarketStickerOptionsData> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ConstraintLayout _setting_root;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VDraweeView _setting_bg_img;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VDraweeView _setting_img;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _setting_content_title;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _setting_content_desc;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public List<? extends IntlMarketStickerOptionsData> data;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public IntlMarketStickerData stickerData;

    public epi(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.data = new ArrayList();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int mo28824C() {
        return this.data.size();
    }

    @Override // p149l.dac0
    @NotNull
    /* JADX INFO: renamed from: D */
    public View mo28825D(@Nullable ViewGroup parent, int itemViewType) {
        LayoutInflater layoutInflaterM163037a = o7r.m163037a(this.act);
        layoutInflaterM163037a.getClass();
        return m117628E(layoutInflaterM163037a, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final View m117628E(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM122603b = fpi.m122603b(this, inflater, parent);
        viewM122603b.getClass();
        return viewM122603b;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(@Nullable View convertView, @Nullable IntlMarketStickerOptionsData item, int itemViewType, int position) {
        if (item != null) {
            qib0.f154691G.m102331L0(m117634K(), item.img_url);
            C8384a c8384a = C8384a.INSTANCE;
            VText vTextM117633J = m117633J();
            String str = item.desc;
            IntlMarketStickerData intlMarketStickerData = this.stickerData;
            c8384a.m46311i(vTextM117633J, str, intlMarketStickerData != null ? intlMarketStickerData.font_color : null);
            VText vTextM117632I = m117632I();
            String str2 = item.sub_desc;
            IntlMarketStickerData intlMarketStickerData2 = this.stickerData;
            c8384a.m46311i(vTextM117632I, str2, intlMarketStickerData2 != null ? intlMarketStickerData2.sub_font_color : null);
        }
        IntlMarketStickerData intlMarketStickerData3 = this.stickerData;
        if (intlMarketStickerData3 != null) {
            if (!TextUtils.isEmpty(intlMarketStickerData3.bg_color)) {
                m117631H().setBackground(C8384a.INSTANCE.m46304b(Color.parseColor(intlMarketStickerData3.bg_color), t100.f167268q, true));
            }
            if (TextUtils.isEmpty(intlMarketStickerData3.bg_url)) {
                return;
            }
            qib0.f154691G.m102331L0(m117631H(), intlMarketStickerData3.bg_url);
        }
    }

    @Override // p149l.dac0
    @Nullable
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public IntlMarketStickerOptionsData getItem(int position) {
        return this.data.get(position);
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final VDraweeView m117631H() {
        VDraweeView vDraweeView = this._setting_bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_setting_bg_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final VText m117632I() {
        VText vText = this._setting_content_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_setting_content_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final VText m117633J() {
        VText vText = this._setting_content_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_setting_content_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final VDraweeView m117634K() {
        VDraweeView vDraweeView = this._setting_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_setting_img");
        return null;
    }

    /* JADX INFO: renamed from: L */
    public final void m117635L(@NotNull IntlMarketStickerData stickerData) {
        stickerData.getClass();
        this.stickerData = stickerData;
        List<IntlMarketStickerOptionsData> list = stickerData.options;
        list.getClass();
        this.data = list;
    }
}
