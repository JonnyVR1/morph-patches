package p149l;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.Careers;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomProfile;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomHeatDesc;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.SvgAndImageView;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;
import p147v.VLinear;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0013\u0010\fJ\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010'\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\fR\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00103\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010#\u001a\u0004\b1\u0010%\"\u0004\b2\u0010\fR\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010J\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010V\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010>\u001a\u0004\bT\u0010@\"\u0004\bU\u0010BR\"\u0010Z\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010>\u001a\u0004\bX\u0010@\"\u0004\bY\u0010BR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010a¨\u0006c"}, m87232d2 = {"Ll/eul0;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/hul0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/hul0;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "G", "(Landroid/view/View;)V", "r", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoomProfile;", "data", "N", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoomProfile;)V", "m", Careers.f38732it, BloodType.f38728O, "w", "k", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroidx/constraintlayout/widget/ConstraintLayout;", BLiveStormDanmakuGiftResourceType.f44444l, "Landroidx/constraintlayout/widget/ConstraintLayout;", "M", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_root", "Landroid/view/View;", "get_bg", "()Landroid/view/View;", "set_bg", "_bg", "Lv/VDraweeView;", "n", "Lv/VDraweeView;", "I", "()Lv/VDraweeView;", "set_dialog_bg", "(Lv/VDraweeView;)V", "_dialog_bg", "o", "get_top_view", "set_top_view", "_top_view", "Landroid/widget/ImageView;", "p", "Landroid/widget/ImageView;", "H", "()Landroid/widget/ImageView;", "set_back", "(Landroid/widget/ImageView;)V", "_back", "Landroid/widget/TextView;", "q", "Landroid/widget/TextView;", "get_title", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "Landroid/widget/ScrollView;", "Landroid/widget/ScrollView;", "get_scroll_view", "()Landroid/widget/ScrollView;", "set_scroll_view", "(Landroid/widget/ScrollView;)V", "_scroll_view", "Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/SvgAndImageView;", BLiveStormDanmakuGiftResourceType.f44446s, "Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/SvgAndImageView;", "J", "()Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/SvgAndImageView;", "set_heat_icon", "(Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/SvgAndImageView;)V", "_heat_icon", Constants.KEY_T, "L", "set_heat_title", "_heat_title", "u", "get_heat_speed", "set_heat_speed", "_heat_speed", "Lv/VLinear;", ResourceDirection.f38808v, "Lv/VLinear;", "K", "()Lv/VLinear;", "set_heat_list", "(Lv/VLinear;)V", "_heat_list", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class eul0 extends LiveMenuDialogHolder<hul0> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public ConstraintLayout _root;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public View _bg;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VDraweeView _dialog_bg;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public View _top_view;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public ImageView _back;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public ScrollView _scroll_view;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public SvgAndImageView _heat_icon;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public TextView _heat_title;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public TextView _heat_speed;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public VLinear _heat_list;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eul0(@NotNull Act act, @NotNull hul0 hul0Var) {
        super(t6c0.f168158Q6, act, hul0Var, j2g0.m139456c(0.3f));
        act.getClass();
        hul0Var.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: F */
    public static void m118178F(eul0 eul0Var, View view) {
        eul0Var.mo71838p();
    }

    /* JADX INFO: renamed from: r */
    private final void m118179r() {
        xdl0.m208329E0(m118181H(), new View.OnClickListener() { // from class: l.dul0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eul0.m118178F(this.f87999a, view);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public final void m118180G(View view) {
        ful0.m123205a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final ImageView m118181H() {
        ImageView imageView = this._back;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_back");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final VDraweeView m118182I() {
        VDraweeView vDraweeView = this._dialog_bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_dialog_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final SvgAndImageView m118183J() {
        SvgAndImageView svgAndImageView = this._heat_icon;
        if (svgAndImageView != null) {
            return svgAndImageView;
        }
        Intrinsics.m87502r("_heat_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final VLinear m118184K() {
        VLinear vLinear = this._heat_list;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_heat_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final TextView m118185L() {
        TextView textView = this._heat_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_heat_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final ConstraintLayout m118186M() {
        ConstraintLayout constraintLayout = this._root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    /* JADX INFO: renamed from: N */
    public final void m118187N(BLiveVoiceRoomProfile data) {
        hxs.m133406s("context_livingAct", m118182I(), data.heatBgImg);
        VDraweeView vDraweeViewM118182I = m118182I();
        int i = t100.f167268q;
        mep0.m154301c1(vDraweeViewM118182I, 0, 0, 0, -i, i);
        m118183J().m77478e(data.heatIcon, data.heatSvga);
        m118185L().setText(data.heatTitle);
        m118184K().removeAllViews();
        List<BLiveVoiceVirtualRoomHeatDesc> list = data.heatDesc;
        list.getClass();
        for (BLiveVoiceVirtualRoomHeatDesc bLiveVoiceVirtualRoomHeatDesc : list) {
            krl0 krl0Var = new krl0();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(xdl0.f192403e, t100.m186890d(92.0f));
            layoutParams.bottomMargin = t100.f167259h;
            m118184K().addView(krl0Var.m147005b(m118186M().getContext(), bLiveVoiceVirtualRoomHeatDesc), layoutParams);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O */
    public final void m118188O(@NotNull BLiveVoiceRoomProfile it) {
        it.getClass();
        super.m71834E();
        m118187N(it);
        zvf0.m220368A("e_audio_room_heat_info", ((nnn0) ((hul0) this.f47757b).m206027E2()).mo97490p() ? "p_anchor_audio_room" : "p_user_audio_room", j760.m140076a("anchorId", ((nnn0) ((hul0) this.f47757b).m206027E2()).m132140j0()), j760.m140076a("liveId", ((nnn0) ((hul0) this.f47757b).m206027E2()).m149814k()), j760.m140076a("roomId", ((nnn0) ((hul0) this.f47757b).m206027E2()).m149818o()));
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(@NotNull View view) {
        view.getClass();
        super.mo71836m(view);
        m118180G(view);
        m118179r();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo71841w() {
        super.mo71841w();
        m118183J().m77474a();
        m118184K().removeAllViews();
    }
}
