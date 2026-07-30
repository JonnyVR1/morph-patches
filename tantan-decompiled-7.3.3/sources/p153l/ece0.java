package p153l;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.GridLayoutManager;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveScrapBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveScrapLiveRight;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.scrap.widget.ScrapTargetShowView;
import com.tencent.open.SocialConstants;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VButton;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u000eJ\u000f\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u000eJ\u000f\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u000eJ\u000f\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u000eJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010\u0019J\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b \u0010\u0019J\u000f\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\u000eJ\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\"\u0010\u0019J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b#\u0010\u0019J\u0017\u0010$\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b$\u0010\u0019J\u0017\u0010%\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b%\u0010\u0019J\u000f\u0010&\u001a\u00020\nH\u0002¢\u0006\u0004\b&\u0010\u000eJ\u001f\u0010(\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0012H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0012H\u0002¢\u0006\u0004\b*\u0010)J\u0019\u0010+\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b+\u0010\u0019J\u000f\u0010,\u001a\u00020\nH\u0002¢\u0006\u0004\b,\u0010\u000eJ\u0017\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0016H\u0002¢\u0006\u0004\b.\u0010\u0019J\u000f\u0010/\u001a\u00020\u0012H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b1\u00102J!\u00107\u001a\u0004\u0018\u00010\b2\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\nH\u0016¢\u0006\u0004\b9\u0010\u000eJ\u000f\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b=\u0010\fJ\r\u0010>\u001a\u00020\n¢\u0006\u0004\b>\u0010\u000eJ\u0017\u0010?\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b?\u0010\u0019J\r\u0010@\u001a\u00020\n¢\u0006\u0004\b@\u0010\u000eJ\u0015\u0010C\u001a\u00020\n2\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0016¢\u0006\u0004\bE\u0010\u0019R\"\u0010K\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010\fR\"\u0010O\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010G\u001a\u0004\bM\u0010I\"\u0004\bN\u0010\fR\"\u0010V\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010^\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010b\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010Y\u001a\u0004\b`\u0010[\"\u0004\ba\u0010]R\"\u0010f\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010G\u001a\u0004\bd\u0010I\"\u0004\be\u0010\fR\"\u0010j\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010G\u001a\u0004\bh\u0010I\"\u0004\bi\u0010\fR\"\u0010r\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010v\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010m\u001a\u0004\bt\u0010o\"\u0004\bu\u0010qR\"\u0010z\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bw\u0010m\u001a\u0004\bx\u0010o\"\u0004\by\u0010qR\"\u0010~\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b{\u0010m\u001a\u0004\b|\u0010o\"\u0004\b}\u0010qR%\u0010\u0082\u0001\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u007f\u0010G\u001a\u0005\b\u0080\u0001\u0010I\"\u0005\b\u0081\u0001\u0010\fR&\u0010\u0086\u0001\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010m\u001a\u0005\b\u0084\u0001\u0010o\"\u0005\b\u0085\u0001\u0010qR&\u0010\u008a\u0001\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010m\u001a\u0005\b\u0088\u0001\u0010o\"\u0005\b\u0089\u0001\u0010qR&\u0010\u008e\u0001\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010m\u001a\u0005\b\u008c\u0001\u0010o\"\u0005\b\u008d\u0001\u0010qR*\u0010\u0096\u0001\u001a\u00030\u008f\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R*\u0010\u009e\u0001\u001a\u00030\u0097\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R*\u0010¦\u0001\u001a\u00030\u009f\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R*\u0010ª\u0001\u001a\u00030\u009f\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b§\u0001\u0010¡\u0001\u001a\u0006\b¨\u0001\u0010£\u0001\"\u0006\b©\u0001\u0010¥\u0001R*\u0010²\u0001\u001a\u00030«\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R&\u0010¶\u0001\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b³\u0001\u0010m\u001a\u0005\b´\u0001\u0010o\"\u0005\bµ\u0001\u0010qR&\u0010º\u0001\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b·\u0001\u0010G\u001a\u0005\b¸\u0001\u0010I\"\u0005\b¹\u0001\u0010\fR&\u0010¾\u0001\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b»\u0001\u0010m\u001a\u0005\b¼\u0001\u0010o\"\u0005\b½\u0001\u0010qR!\u0010Ä\u0001\u001a\u00030¿\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001¨\u0006Å\u0001"}, m88121d2 = {"Ll/ece0;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/nce0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/nce0;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "R", "(Landroid/view/View;)V", p7f.GPS_MEASUREMENT_INTERRUPTED, "()V", "z0", "D0", "T0", "", "isVisible", "Y0", "(Z)V", "Lcom/p1/mobile/putong/live/base/data/BLiveScrapBrief;", "selectedScrapBrief", "u0", "(Lcom/p1/mobile/putong/live/base/data/BLiveScrapBrief;)V", "N0", "v0", "U", "M0", "Q0", "x0", "w0", "y0", "J0", "L0", "I0", "H0", p7f.GPS_DIRECTION_TRUE, "isClickable", "P0", "(Lcom/p1/mobile/putong/live/base/data/BLiveScrapBrief;Z)V", "O0", "K0", "V0", "scrapBrief", "Z0", "t0", "()Z", p7f.LATITUDE_SOUTH, "(Ll/nce0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "m", "U0", "R0", "S0", "Ll/sce0;", "scrapListItemModel", "X0", "(Ll/sce0;)V", "W0", "k", "Landroid/view/View;", "Y", "()Landroid/view/View;", "set_blank_space", "_blank_space", BLiveStormDanmakuGiftResourceType.f45292l, "X", "set_bg_view", "_bg_view", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "o0", "()Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "set_star_bg_view", "(Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;)V", "_star_bg_view", "Landroidx/appcompat/widget/AppCompatImageView;", "n", "Landroidx/appcompat/widget/AppCompatImageView;", "f0", "()Landroidx/appcompat/widget/AppCompatImageView;", "set_scrap_gift_title_view", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "_scrap_gift_title_view", "o", "l0", "set_scrap_right_title_view", "_scrap_right_title_view", "p", "g0", "set_scrap_help_view", "_scrap_help_view", "q", "j0", "set_scrap_number_desc_bg", "_scrap_number_desc_bg", "Lv/VText;", "r", "Lv/VText;", "Z", "()Lv/VText;", "set_hold_scrap_number_text", "(Lv/VText;)V", "_hold_scrap_number_text", BLiveStormDanmakuGiftResourceType.f45294s, "i0", "set_scrap_number", "_scrap_number", Constants.KEY_T, "d0", "set_scrap_craft_text1", "_scrap_craft_text1", "u", "k0", "set_scrap_result_number", "_scrap_result_number", ResourceDirection.f39656v, "n0", "set_scrap_target_name_layout_bg", "_scrap_target_name_layout_bg", "w", "q0", "set_target_level", "_target_level", BaseSei.f14624X, "r0", "set_target_name", "_target_name", BaseSei.f14625Y, "s0", "set_target_right_desc", "_target_right_desc", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/scrap/widget/ScrapTargetShowView;", BaseSei.f14626Z, "Lcom/p1/mobile/putong/live/livingroom/increment/gift/scrap/widget/ScrapTargetShowView;", "m0", "()Lcom/p1/mobile/putong/live/livingroom/increment/gift/scrap/widget/ScrapTargetShowView;", "set_scrap_target_layout", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/scrap/widget/ScrapTargetShowView;)V", "_scrap_target_layout", "Lv/VRecyclerView;", "A", "Lv/VRecyclerView;", "h0", "()Lv/VRecyclerView;", "set_scrap_list_recycler", "(Lv/VRecyclerView;)V", "_scrap_list_recycler", "Lv/VButton;", "B", "Lv/VButton;", "p0", "()Lv/VButton;", "set_target_craft_button", "(Lv/VButton;)V", "_target_craft_button", c4s.C_ZONE, "e0", "set_scrap_event_button", "_scrap_event_button", "Landroidx/constraintlayout/widget/Guideline;", "D", "Landroidx/constraintlayout/widget/Guideline;", "get_guide_desc", "()Landroidx/constraintlayout/widget/Guideline;", "set_guide_desc", "(Landroidx/constraintlayout/widget/Guideline;)V", "_guide_desc", "E", "c0", "set_scrap_acquire_desc", "_scrap_acquire_desc", "F", "b0", "set_no_data_view", "_no_data_view", "G", "a0", "set_no_data_text", "_no_data_text", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "H", "Lkotlin/Lazy;", "W", "()Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "scrapAdapter", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ece0 extends LiveMenuDialogHolder<nce0> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public VRecyclerView _scrap_list_recycler;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public VButton _target_craft_button;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public VButton _scrap_event_button;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public Guideline _guide_desc;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public VText _scrap_acquire_desc;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public View _no_data_view;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public VText _no_data_text;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public final Lazy scrapAdapter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public View _blank_space;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public View _bg_view;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public AnimEffectPlayer _star_bg_view;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public AppCompatImageView _scrap_gift_title_view;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public AppCompatImageView _scrap_right_title_view;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public View _scrap_help_view;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public View _scrap_number_desc_bg;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public VText _hold_scrap_number_text;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public VText _scrap_number;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public VText _scrap_craft_text1;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public VText _scrap_result_number;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public View _scrap_target_name_layout_bg;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public VText _target_level;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public VText _target_name;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public VText _target_right_desc;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public ScrapTargetShowView _scrap_target_layout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ece0(@NotNull Act act, @NotNull nce0 nce0Var) {
        super(yec0.f199191o5, act, nce0Var);
        act.getClass();
        nce0Var.getClass();
        this.scrapAdapter = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.sbe0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ece0.m120314Q();
            }
        });
    }

    /* JADX INFO: renamed from: A0 */
    public static final Unit m120299A0() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B0 */
    public static final Unit m120300B0(ece0 ece0Var, BLiveScrapBrief bLiveScrapBrief) {
        ece0Var.m120349f0().setBackgroundResource(obc0.f146202U2);
        ece0Var.m120355l0().setBackgroundResource(obc0.f146235X2);
        ece0Var.m120322N0(bLiveScrapBrief);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E0 */
    public static final Unit m120301E0() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static void m120302F(ece0 ece0Var, BLiveScrapBrief bLiveScrapBrief, View view) {
        ((nce0) ece0Var.f48605b).m162541n4(bLiveScrapBrief);
    }

    /* JADX INFO: renamed from: G0 */
    public static final Unit m120304G0(ece0 ece0Var, BLiveScrapBrief bLiveScrapBrief) {
        ece0Var.m120349f0().setBackgroundResource(obc0.f146191T2);
        ece0Var.m120355l0().setBackgroundResource(obc0.f146246Y2);
        ece0Var.m120322N0(bLiveScrapBrief);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public static void m120305H(ece0 ece0Var, View view) {
        ece0Var.m120333U0();
    }

    /* JADX INFO: renamed from: I */
    public static void m120306I(ece0 ece0Var, View view) {
        ((nce0) ece0Var.f48605b).m162537j4();
    }

    /* JADX INFO: renamed from: J */
    public static void m120307J(final ece0 ece0Var, View view) {
        ((nce0) ece0Var.f48605b).m162538k4(new Function0() { // from class: l.zbe0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ece0.m120299A0();
            }
        }, new Function1() { // from class: l.ace0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ece0.m120300B0(this.f69699a, (BLiveScrapBrief) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public static void m120308K(ece0 ece0Var, BLiveScrapBrief bLiveScrapBrief, View view) {
        nce0 nce0Var = (nce0) ece0Var.f48605b;
        String str = bLiveScrapBrief.description.scheme;
        str.getClass();
        nce0Var.m162540m4(str);
    }

    /* JADX INFO: renamed from: M */
    public static void m120310M(final ece0 ece0Var, View view) {
        ((nce0) ece0Var.f48605b).m162539l4(new Function0() { // from class: l.bce0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ece0.m120301E0();
            }
        }, new Function1() { // from class: l.cce0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ece0.m120304G0(this.f80956a, (BLiveScrapBrief) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public static void m120313P(ece0 ece0Var, View view) {
        ((nce0) ece0Var.f48605b).m162542o4(ece0Var.m120338X().getHeight() + qa00.m175859d(8.0f));
    }

    /* JADX INFO: renamed from: Q */
    public static LiveBaseAdapter m120314Q() {
        return new LiveBaseAdapter();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        Act act = ((nce0) this.f48605b).act();
        act.getClass();
        return act;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m120315D0() {
        if (!((nce0) this.f48605b).m162547t4()) {
            bnl0.m105538V(m120349f0(), 0);
            m120355l0().setVisibility(8);
        } else {
            m120355l0().setVisibility(0);
            bnl0.m105509E0(m120355l0(), new View.OnClickListener() { // from class: l.wbe0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ece0.m120310M(this.f188246a, view);
                }
            });
            bnl0.m105538V(m120349f0(), qa00.m175859d(48.0f));
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m120316H0(BLiveScrapBrief selectedScrapBrief) {
        if (TextUtils.isEmpty(selectedScrapBrief.description.text)) {
            m120346c0().setText(R$string.f48063ed);
            m120323O0(selectedScrapBrief, false);
        } else if (TextUtils.isEmpty(selectedScrapBrief.description.scheme)) {
            m120346c0().setText(selectedScrapBrief.description.text);
            m120323O0(selectedScrapBrief, false);
        } else {
            VText vTextM120346c0 = m120346c0();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            vTextM120346c0.setText(String.format("%s>>", Arrays.copyOf(new Object[]{selectedScrapBrief.description.text}, 1)));
            m120323O0(selectedScrapBrief, true);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final void m120317I0(BLiveScrapBrief selectedScrapBrief) {
        m120359p0().setText(R$string.f47953Zc);
        long j = selectedScrapBrief.remainCount;
        if (j < selectedScrapBrief.targetItem.cost || j <= 0 || selectedScrapBrief.itemStock.count <= 0) {
            m120359p0().setBackground(getContext().getDrawable(obc0.f146452p6));
            m120324P0(selectedScrapBrief, false);
        } else {
            m120359p0().setBackground(getContext().getDrawable(obc0.f146440o6));
            m120324P0(selectedScrapBrief, true);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m120318J0(BLiveScrapBrief selectedScrapBrief) {
        m120320L0(selectedScrapBrief);
        m120317I0(selectedScrapBrief);
        m120316H0(selectedScrapBrief);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m120319K0(BLiveScrapBrief selectedScrapBrief) {
        if (selectedScrapBrief != null) {
            m120356m0().m75192c(selectedScrapBrief.targetItem.icon, m120363t0());
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m120320L0(BLiveScrapBrief selectedScrapBrief) {
        m120360q0().setText(selectedScrapBrief.rankType.name);
        m120361r0().setText(cpj.m111768D(selectedScrapBrief.targetItem.itemName));
        if (qbe0.m176030h(selectedScrapBrief)) {
            BLiveScrapLiveRight bLiveScrapLiveRight = selectedScrapBrief.giftRight;
            if (bLiveScrapLiveRight == null) {
                m120362s0().setText(R$string.f48019cd);
                return;
            }
            String str = bLiveScrapLiveRight.expiredTime;
            str.getClass();
            if (str.length() <= 0) {
                m120362s0().setText(R$string.f48019cd);
                return;
            }
            Context context = getContext();
            String str2 = bLiveScrapLiveRight.expiredTime;
            str2.getClass();
            m120362s0().setText(qbe0.m176026d(context, str2, false, 4, null));
            return;
        }
        if (!qbe0.m176031i(selectedScrapBrief)) {
            m120362s0().setText(selectedScrapBrief.itemStock.title);
            return;
        }
        BLiveScrapLiveRight bLiveScrapLiveRight2 = selectedScrapBrief.liveRight;
        if (bLiveScrapLiveRight2 == null) {
            m120362s0().setText(selectedScrapBrief.itemStock.title);
            return;
        }
        String str3 = bLiveScrapLiveRight2.expiredTime;
        str3.getClass();
        if (str3.length() <= 0) {
            m120362s0().setText(selectedScrapBrief.itemStock.title);
            return;
        }
        Context context2 = getContext();
        String str4 = bLiveScrapLiveRight2.expiredTime;
        str4.getClass();
        m120362s0().setText(qbe0.m176025c(context2, str4, true));
    }

    /* JADX INFO: renamed from: M0 */
    public final void m120321M0() {
        if (m120363t0()) {
            m120357n0().setBackgroundResource(obc0.f146224W2);
            m120353j0().setBackgroundResource(obc0.f146476r6);
            m120349f0().setBackgroundResource(obc0.f146191T2);
            m120355l0().setBackgroundResource(obc0.f146246Y2);
            return;
        }
        m120357n0().setBackgroundResource(obc0.f146213V2);
        m120353j0().setBackgroundResource(obc0.f146464q6);
        m120349f0().setBackgroundResource(obc0.f146202U2);
        m120355l0().setBackgroundResource(obc0.f146235X2);
    }

    /* JADX INFO: renamed from: N0 */
    public final void m120322N0(BLiveScrapBrief selectedScrapBrief) {
        if (selectedScrapBrief == null) {
            m120331T0();
            return;
        }
        m120332U();
        m120330T();
        m120367x0(selectedScrapBrief);
        m120368y0();
        m120318J0(selectedScrapBrief);
        m120321M0();
        m120343Z0(selectedScrapBrief);
        m120365v0();
    }

    /* JADX INFO: renamed from: O0 */
    public final void m120323O0(final BLiveScrapBrief selectedScrapBrief, boolean isClickable) {
        m120346c0().setClickable(isClickable);
        if (isClickable) {
            bnl0.m105509E0(m120346c0(), new View.OnClickListener() { // from class: l.dce0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ece0.m120308K(this.f87780a, selectedScrapBrief, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m120324P0(final BLiveScrapBrief selectedScrapBrief, boolean isClickable) {
        m120359p0().setClickable(isClickable);
        if (isClickable) {
            bnl0.m105509E0(m120359p0(), new View.OnClickListener() { // from class: l.ube0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ece0.m120302F(this.f178303a, selectedScrapBrief, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m120325Q0() {
        VText vTextM120352i0 = m120352i0();
        Typeface typeface = Typeface.SANS_SERIF;
        vTextM120352i0.setTypeface(typeface, 3);
        m120354k0().setTypeface(typeface, 3);
        m120360q0().setTypeface(typeface, 3);
    }

    /* JADX INFO: renamed from: R */
    public final void m120326R(View view) {
        fce0.m125007a(this, view);
    }

    /* JADX INFO: renamed from: R0 */
    public final void m120327R0(@Nullable BLiveScrapBrief selectedScrapBrief) {
        m73017E();
        m120338X().setBackgroundResource(obc0.f146488s6);
        m120335V0();
        m120369z0();
        m120315D0();
        m120364u0(selectedScrapBrief);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull nce0 presenter) {
        presenter.getClass();
    }

    /* JADX INFO: renamed from: S0 */
    public final void m120329S0() {
        m73017E();
        bnl0.m105524M(m120355l0(), false);
        m120331T0();
    }

    /* JADX INFO: renamed from: T */
    public final void m120330T() {
        if (m120363t0()) {
            VText vTextM120346c0 = m120346c0();
            Act act = getAct();
            act.getClass();
            vTextM120346c0.setTextColor(act.getResources().getColor(n9c0.f140801W));
            VText vTextM120360q0 = m120360q0();
            Act act2 = getAct();
            act2.getClass();
            vTextM120360q0.setTextColor(act2.getResources().getColor(n9c0.f140834i0));
            VText vTextM120361r0 = m120361r0();
            Act act3 = getAct();
            act3.getClass();
            vTextM120361r0.setTextColor(act3.getResources().getColor(n9c0.f140810a0));
            VText vTextM120347d0 = m120347d0();
            Act act4 = getAct();
            act4.getClass();
            vTextM120347d0.setTextColor(act4.getResources().getColor(n9c0.f140813b0));
            VText vTextM120354k0 = m120354k0();
            Act act5 = getAct();
            act5.getClass();
            vTextM120354k0.setTextColor(act5.getResources().getColor(n9c0.f140813b0));
            VText vTextM120342Z = m120342Z();
            Act act6 = getAct();
            act6.getClass();
            vTextM120342Z.setTextColor(act6.getResources().getColor(n9c0.f140813b0));
            VText vTextM120352i0 = m120352i0();
            Act act7 = getAct();
            act7.getClass();
            vTextM120352i0.setTextColor(act7.getResources().getColor(n9c0.f140813b0));
            VText vTextM120362s0 = m120362s0();
            Act act8 = getAct();
            act8.getClass();
            vTextM120362s0.setTextColor(act8.getResources().getColor(n9c0.f140801W));
            return;
        }
        VText vTextM120346c1 = m120346c0();
        Act act9 = getAct();
        act9.getClass();
        vTextM120346c1.setTextColor(act9.getResources().getColor(n9c0.f140793S));
        VText vTextM120360q1 = m120360q0();
        Act act10 = getAct();
        act10.getClass();
        vTextM120360q1.setTextColor(act10.getResources().getColor(n9c0.f140848n));
        VText vTextM120361r1 = m120361r0();
        Act act11 = getAct();
        act11.getClass();
        vTextM120361r1.setTextColor(act11.getResources().getColor(n9c0.f140825f0));
        VText vTextM120347d1 = m120347d0();
        Act act12 = getAct();
        act12.getClass();
        vTextM120347d1.setTextColor(act12.getResources().getColor(n9c0.f140816c0));
        VText vTextM120354k1 = m120354k0();
        Act act13 = getAct();
        act13.getClass();
        vTextM120354k1.setTextColor(act13.getResources().getColor(n9c0.f140816c0));
        VText vTextM120342Z2 = m120342Z();
        Act act14 = getAct();
        act14.getClass();
        vTextM120342Z2.setTextColor(act14.getResources().getColor(n9c0.f140816c0));
        VText vTextM120352i1 = m120352i0();
        Act act15 = getAct();
        act15.getClass();
        vTextM120352i1.setTextColor(act15.getResources().getColor(n9c0.f140816c0));
        VText vTextM120362s1 = m120362s0();
        Act act16 = getAct();
        act16.getClass();
        vTextM120362s1.setTextColor(act16.getResources().getColor(n9c0.f140793S));
    }

    /* JADX INFO: renamed from: T0 */
    public final void m120331T0() {
        if (bnl0.m105529O0(m120345b0())) {
            return;
        }
        m120338X().setBackgroundResource(obc0.f146500t6);
        bnl0.m105524M(m120345b0(), true);
        bnl0.m105524M(m120344a0(), true);
        m120341Y0(false);
    }

    /* JADX INFO: renamed from: U */
    public final void m120332U() {
        if (bnl0.m105529O0(m120345b0())) {
            m120338X().setBackgroundResource(obc0.f146500t6);
            bnl0.m105524M(m120345b0(), false);
            bnl0.m105524M(m120344a0(), false);
            m120341Y0(true);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final void m120333U0() {
        m120334V();
        ((nce0) this.f48605b).m162528a4();
        mo73021p();
    }

    /* JADX INFO: renamed from: V */
    public final void m120334V() {
        m120358o0().m69688o();
        m120356m0().m75190a();
    }

    /* JADX INFO: renamed from: V0 */
    public final void m120335V0() {
        m120358o0().m69683j("https://auto.tancdn.com/v1/raw/3b0ba85a-98a1-4d9d-adda-ab419ad5e8f110.so", -1);
    }

    /* JADX INFO: renamed from: W */
    public final LiveBaseAdapter m120336W() {
        return (LiveBaseAdapter) this.scrapAdapter.getValue();
    }

    /* JADX INFO: renamed from: W0 */
    public final void m120337W0(@NotNull BLiveScrapBrief scrapBrief) {
        scrapBrief.getClass();
        m120367x0(scrapBrief);
        m120318J0(scrapBrief);
        m120343Z0(scrapBrief);
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final View m120338X() {
        View view = this._bg_view;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_bg_view");
        return null;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m120339X0(@NotNull sce0 scrapListItemModel) {
        scrapListItemModel.getClass();
        m120336W().m68543O(scrapListItemModel);
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final View m120340Y() {
        View view = this._blank_space;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_blank_space");
        return null;
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m120341Y0(boolean isVisible) {
        bnl0.m105524M(m120353j0(), isVisible);
        bnl0.m105524M(m120350g0(), isVisible);
        bnl0.m105524M(m120342Z(), isVisible);
        bnl0.m105524M(m120352i0(), isVisible);
        bnl0.m105524M(m120347d0(), isVisible);
        bnl0.m105524M(m120354k0(), isVisible);
        bnl0.m105524M(m120357n0(), isVisible);
        bnl0.m105524M(m120360q0(), isVisible);
        bnl0.m105524M(m120361r0(), isVisible);
        bnl0.m105524M(m120362s0(), isVisible);
        bnl0.m105524M(m120356m0(), isVisible);
        bnl0.m105524M(m120351h0(), isVisible);
        bnl0.m105524M(m120359p0(), isVisible);
        bnl0.m105524M(m120346c0(), isVisible);
        bnl0.m105524M(m120348e0(), isVisible);
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VText m120342Z() {
        VText vText = this._hold_scrap_number_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_hold_scrap_number_text");
        return null;
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m120343Z0(BLiveScrapBrief scrapBrief) {
        if (m120363t0()) {
            m120356m0().m75193d(scrapBrief.targetItem.icon, true);
        } else {
            m120356m0().m75193d(scrapBrief.targetItem.icon, false);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final VText m120344a0() {
        VText vText = this._no_data_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_no_data_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final View m120345b0() {
        View view = this._no_data_view;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_no_data_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VText m120346c0() {
        VText vText = this._scrap_acquire_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_scrap_acquire_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final VText m120347d0() {
        VText vText = this._scrap_craft_text1;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_scrap_craft_text1");
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public void destroy() {
        m120333U0();
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final VButton m120348e0() {
        VButton vButton = this._scrap_event_button;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_scrap_event_button");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final AppCompatImageView m120349f0() {
        AppCompatImageView appCompatImageView = this._scrap_gift_title_view;
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        Intrinsics.m88391r("_scrap_gift_title_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final View m120350g0() {
        View view = this._scrap_help_view;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_scrap_help_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final VRecyclerView m120351h0() {
        VRecyclerView vRecyclerView = this._scrap_list_recycler;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m88391r("_scrap_list_recycler");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final VText m120352i0() {
        VText vText = this._scrap_number;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_scrap_number");
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    public View inflateView(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent) {
        inflater.getClass();
        parent.getClass();
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final View m120353j0() {
        View view = this._scrap_number_desc_bg;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_scrap_number_desc_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k0 */
    public final VText m120354k0() {
        VText vText = this._scrap_result_number;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_scrap_result_number");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public final AppCompatImageView m120355l0() {
        AppCompatImageView appCompatImageView = this._scrap_right_title_view;
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        Intrinsics.m88391r("_scrap_right_title_view");
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(@NotNull View view) {
        view.getClass();
        super.mo73019m(view);
        m120326R(view);
        m73027z(LiveDialogEnum.SCRAP_GIFT);
        m73014A(80);
        m120340Y().setOnClickListener(new View.OnClickListener() { // from class: l.vbe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ece0.m120305H(this.f183241a, view2);
            }
        });
        qnp0.m177260c1(m120338X(), 0, 0, 0, -qa00.m175859d(24.0f), qa00.m175859d(24.0f));
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final ScrapTargetShowView m120356m0() {
        ScrapTargetShowView scrapTargetShowView = this._scrap_target_layout;
        if (scrapTargetShowView != null) {
            return scrapTargetShowView;
        }
        Intrinsics.m88391r("_scrap_target_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n0 */
    public final View m120357n0() {
        View view = this._scrap_target_name_layout_bg;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_scrap_target_name_layout_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public final AnimEffectPlayer m120358o0() {
        AnimEffectPlayer animEffectPlayer = this._star_bg_view;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.m88391r("_star_bg_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p0 */
    public final VButton m120359p0() {
        VButton vButton = this._target_craft_button;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_target_craft_button");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q0 */
    public final VText m120360q0() {
        VText vText = this._target_level;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_target_level");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: r0 */
    public final VText m120361r0() {
        VText vText = this._target_name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_target_name");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s0 */
    public final VText m120362s0() {
        VText vText = this._target_right_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_target_right_desc");
        return null;
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m120363t0() {
        return ((nce0) this.f48605b).m162548u4();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m120364u0(BLiveScrapBrief selectedScrapBrief) {
        m120325Q0();
        bnl0.m105509E0(m120350g0(), new View.OnClickListener() { // from class: l.ybe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ece0.m120313P(this.f198303a, view);
            }
        });
        m120319K0(selectedScrapBrief);
        m120322N0(selectedScrapBrief);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m120365v0() {
        if (((nce0) this.f48605b).m162530c4().length() == 0) {
            bnl0.m105524M(m120348e0(), false);
            return;
        }
        bnl0.m105524M(m120348e0(), true);
        m120348e0().setText(((nce0) this.f48605b).m162530c4());
        bnl0.m105509E0(m120348e0(), new View.OnClickListener() { // from class: l.tbe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ece0.m120306I(this.f172918a, view);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public final void m120366w0(BLiveScrapBrief selectedScrapBrief) {
        long j = selectedScrapBrief.targetItem.cost;
        if (j <= 0) {
            j = 1;
        }
        int i = (int) (selectedScrapBrief.remainCount / j);
        if (qbe0.m176029g(selectedScrapBrief)) {
            m120347d0().setText(R$string.f47975ad);
            m120354k0().setText(String.valueOf(i));
            return;
        }
        m120347d0().setText(R$string.f48129hd);
        if (i > 0) {
            m120354k0().setText(R$string.f48151id);
        } else {
            m120354k0().setText(R$string.f48041dd);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m120367x0(BLiveScrapBrief selectedScrapBrief) {
        m120342Z().setText(R$string.f48085fd);
        VText vTextM120352i0 = m120352i0();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        vTextM120352i0.setText(String.format("%s/%s", Arrays.copyOf(new Object[]{Long.valueOf(selectedScrapBrief.remainCount), Long.valueOf(selectedScrapBrief.targetItem.cost)}, 2)));
        m120366w0(selectedScrapBrief);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m120368y0() {
        VRecyclerView vRecyclerViewM120351h0 = m120351h0();
        if (vRecyclerViewM120351h0.getItemDecorationCount() > 0) {
            vRecyclerViewM120351h0.removeItemDecorationAt(0);
        }
        if (vRecyclerViewM120351h0.getAdapter() == null) {
            vRecyclerViewM120351h0.setAdapter(m120336W());
        }
        if (m120363t0()) {
            VRecyclerView vRecyclerViewM120351h1 = m120351h0();
            vRecyclerViewM120351h1.setLayoutManager(new GridLayoutManager(getContext(), 1));
            vRecyclerViewM120351h1.addItemDecoration(new j1g0(1));
        } else {
            VRecyclerView vRecyclerViewM120351h2 = m120351h0();
            vRecyclerViewM120351h2.setLayoutManager(new GridLayoutManager(getContext(), 2));
            vRecyclerViewM120351h2.addItemDecoration(new j1g0(2));
        }
        m120336W().m68554Z(((nce0) this.f48605b).m162531d4());
        int iM162534g4 = ((nce0) this.f48605b).m162534g4();
        if (iM162534g4 > 0) {
            m120351h0().smoothScrollToPosition(iM162534g4);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m120369z0() {
        if (((nce0) this.f48605b).m162546s4()) {
            m120349f0().setVisibility(0);
            bnl0.m105509E0(m120349f0(), new View.OnClickListener() { // from class: l.xbe0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ece0.m120307J(this.f193156a, view);
                }
            });
        }
    }
}
