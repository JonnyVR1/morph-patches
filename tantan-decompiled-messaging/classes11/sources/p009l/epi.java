package p009l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.p002ui.intloperation.flash.C0428a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.IntlMarketStickerData;
import com.p1.mobile.putong.core.data.IntlMarketStickerOptionsData;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.dac0;
import l.fpi;
import l.qib0;
import l.t100;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0016\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00100\"\u0004\b6\u00102R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010C\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010:\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>R\u001e\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006J"}, d2 = {"Ll/epi;", "Ll/dac0;", "Lcom/p1/mobile/putong/core/data/IntlMarketStickerOptionsData;", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "E", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "itemViewType", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", "item", "position", "", "F", "(Landroid/view/View;Lcom/p1/mobile/putong/core/data/IntlMarketStickerOptionsData;II)V", "Lcom/p1/mobile/putong/core/data/IntlMarketStickerData;", "stickerData", "L", "(Lcom/p1/mobile/putong/core/data/IntlMarketStickerData;)V", "G", "(I)Lcom/p1/mobile/putong/core/data/IntlMarketStickerOptionsData;", "C", "()I", "c", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "d", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_setting_root", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_setting_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_setting_root", "Lv/VDraweeView;", "e", "Lv/VDraweeView;", "H", "()Lv/VDraweeView;", "set_setting_bg_img", "(Lv/VDraweeView;)V", "_setting_bg_img", "f", "K", "set_setting_img", "_setting_img", "Lv/VText;", "g", "Lv/VText;", "J", "()Lv/VText;", "set_setting_content_title", "(Lv/VText;)V", "_setting_content_title", "h", "I", "set_setting_content_desc", "_setting_content_desc", "", "i", "Ljava/util/List;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "j", "Lcom/p1/mobile/putong/core/data/IntlMarketStickerData;", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    /* JADX INFO: renamed from: C */
    public int m14072C() {
        return this.data.size();
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public View m14073D(@Nullable ViewGroup parent, int itemViewType) {
        LayoutInflater layoutInflaterM19649a = o7r.m19649a(this.act);
        layoutInflaterM19649a.getClass();
        return m14074E(layoutInflaterM19649a, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final View m14074E(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = fpi.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m14071A(@Nullable View convertView, @Nullable IntlMarketStickerOptionsData item, int itemViewType, int position) {
        if (item != null) {
            qib0.G.L0(m14080K(), item.img_url);
            C0428a c0428a = C0428a.INSTANCE;
            VText vTextM14079J = m14079J();
            String str = item.desc;
            IntlMarketStickerData intlMarketStickerData = this.stickerData;
            c0428a.m8399i(vTextM14079J, str, intlMarketStickerData != null ? intlMarketStickerData.font_color : null);
            VText vTextM14078I = m14078I();
            String str2 = item.sub_desc;
            IntlMarketStickerData intlMarketStickerData2 = this.stickerData;
            c0428a.m8399i(vTextM14078I, str2, intlMarketStickerData2 != null ? intlMarketStickerData2.sub_font_color : null);
        }
        IntlMarketStickerData intlMarketStickerData3 = this.stickerData;
        if (intlMarketStickerData3 != null) {
            if (!TextUtils.isEmpty(intlMarketStickerData3.bg_color)) {
                m14077H().setBackground(C0428a.INSTANCE.m8392b(Color.parseColor(intlMarketStickerData3.bg_color), t100.q, true));
            }
            if (TextUtils.isEmpty(intlMarketStickerData3.bg_url)) {
                return;
            }
            qib0.G.L0(m14077H(), intlMarketStickerData3.bg_url);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public IntlMarketStickerOptionsData getItem(int position) {
        return this.data.get(position);
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final VDraweeView m14077H() {
        VDraweeView vDraweeView = this._setting_bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_setting_bg_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final VText m14078I() {
        VText vText = this._setting_content_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_setting_content_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final VText m14079J() {
        VText vText = this._setting_content_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_setting_content_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final VDraweeView m14080K() {
        VDraweeView vDraweeView = this._setting_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_setting_img");
        return null;
    }

    /* JADX INFO: renamed from: L */
    public final void m14081L(@NotNull IntlMarketStickerData stickerData) {
        stickerData.getClass();
        this.stickerData = stickerData;
        List<? extends IntlMarketStickerOptionsData> list = stickerData.options;
        list.getClass();
        this.data = list;
    }
}
