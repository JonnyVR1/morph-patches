package p002l;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.scrap.widget.ScrapTargetShowView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.base.data.BLiveScrapBrief;
import com.p1.mobile.putong.live.base.data.BLiveScrapLiveRight;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
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
import l.mep0;
import l.t100;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VButton;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u000eJ\u000f\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u000eJ\u000f\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u000eJ\u000f\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u000eJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010\u0019J\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b \u0010\u0019J\u000f\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\u000eJ\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\"\u0010\u0019J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b#\u0010\u0019J\u0017\u0010$\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b$\u0010\u0019J\u0017\u0010%\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b%\u0010\u0019J\u000f\u0010&\u001a\u00020\nH\u0002¢\u0006\u0004\b&\u0010\u000eJ\u001f\u0010(\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0012H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0012H\u0002¢\u0006\u0004\b*\u0010)J\u0019\u0010+\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b+\u0010\u0019J\u000f\u0010,\u001a\u00020\nH\u0002¢\u0006\u0004\b,\u0010\u000eJ\u0017\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0016H\u0002¢\u0006\u0004\b.\u0010\u0019J\u000f\u0010/\u001a\u00020\u0012H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b1\u00102J!\u00107\u001a\u0004\u0018\u00010\b2\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\nH\u0016¢\u0006\u0004\b9\u0010\u000eJ\u000f\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b=\u0010\fJ\r\u0010>\u001a\u00020\n¢\u0006\u0004\b>\u0010\u000eJ\u0017\u0010?\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b?\u0010\u0019J\r\u0010@\u001a\u00020\n¢\u0006\u0004\b@\u0010\u000eJ\u0015\u0010C\u001a\u00020\n2\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0016¢\u0006\u0004\bE\u0010\u0019R\"\u0010K\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010\fR\"\u0010O\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010G\u001a\u0004\bM\u0010I\"\u0004\bN\u0010\fR\"\u0010V\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010^\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010b\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010Y\u001a\u0004\b`\u0010[\"\u0004\ba\u0010]R\"\u0010f\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010G\u001a\u0004\bd\u0010I\"\u0004\be\u0010\fR\"\u0010j\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010G\u001a\u0004\bh\u0010I\"\u0004\bi\u0010\fR\"\u0010r\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010v\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010m\u001a\u0004\bt\u0010o\"\u0004\bu\u0010qR\"\u0010z\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bw\u0010m\u001a\u0004\bx\u0010o\"\u0004\by\u0010qR\"\u0010~\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b{\u0010m\u001a\u0004\b|\u0010o\"\u0004\b}\u0010qR%\u0010\u0082\u0001\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u007f\u0010G\u001a\u0005\b\u0080\u0001\u0010I\"\u0005\b\u0081\u0001\u0010\fR&\u0010\u0086\u0001\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010m\u001a\u0005\b\u0084\u0001\u0010o\"\u0005\b\u0085\u0001\u0010qR&\u0010\u008a\u0001\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010m\u001a\u0005\b\u0088\u0001\u0010o\"\u0005\b\u0089\u0001\u0010qR&\u0010\u008e\u0001\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010m\u001a\u0005\b\u008c\u0001\u0010o\"\u0005\b\u008d\u0001\u0010qR*\u0010\u0096\u0001\u001a\u00030\u008f\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R*\u0010\u009e\u0001\u001a\u00030\u0097\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R*\u0010¦\u0001\u001a\u00030\u009f\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R*\u0010ª\u0001\u001a\u00030\u009f\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b§\u0001\u0010¡\u0001\u001a\u0006\b¨\u0001\u0010£\u0001\"\u0006\b©\u0001\u0010¥\u0001R*\u0010²\u0001\u001a\u00030«\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R&\u0010¶\u0001\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b³\u0001\u0010m\u001a\u0005\b´\u0001\u0010o\"\u0005\bµ\u0001\u0010qR&\u0010º\u0001\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b·\u0001\u0010G\u001a\u0005\b¸\u0001\u0010I\"\u0005\b¹\u0001\u0010\fR&\u0010¾\u0001\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b»\u0001\u0010m\u001a\u0005\b¼\u0001\u0010o\"\u0005\b½\u0001\u0010qR!\u0010Ä\u0001\u001a\u00030¿\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001¨\u0006Å\u0001"}, d2 = {"Ll/a4e0;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/j4e0;", "Lcom/p1/mobile/android/app/Act;", "act", "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/j4e0;)V", "Landroid/view/View;", "view", "", "R", "(Landroid/view/View;)V", "V", "()V", "z0", "D0", "T0", "", "isVisible", "Y0", "(Z)V", "Lcom/p1/mobile/putong/live/base/data/BLiveScrapBrief;", "selectedScrapBrief", "u0", "(Lcom/p1/mobile/putong/live/base/data/BLiveScrapBrief;)V", "N0", "v0", "U", "M0", "Q0", "x0", "w0", "y0", "J0", "L0", "I0", "H0", "T", "isClickable", "P0", "(Lcom/p1/mobile/putong/live/base/data/BLiveScrapBrief;Z)V", "O0", "K0", "V0", "scrapBrief", "Z0", "t0", "()Z", "S", "(Ll/j4e0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "m", "U0", "R0", "S0", "Ll/o4e0;", "scrapListItemModel", "X0", "(Ll/o4e0;)V", "W0", "k", "Landroid/view/View;", "Y", "()Landroid/view/View;", "set_blank_space", "_blank_space", "l", "X", "set_bg_view", "_bg_view", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "o0", "()Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "set_star_bg_view", "(Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;)V", "_star_bg_view", "Landroidx/appcompat/widget/AppCompatImageView;", "n", "Landroidx/appcompat/widget/AppCompatImageView;", "f0", "()Landroidx/appcompat/widget/AppCompatImageView;", "set_scrap_gift_title_view", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "_scrap_gift_title_view", "o", "l0", "set_scrap_right_title_view", "_scrap_right_title_view", "p", "g0", "set_scrap_help_view", "_scrap_help_view", "q", "j0", "set_scrap_number_desc_bg", "_scrap_number_desc_bg", "Lv/VText;", "r", "Lv/VText;", "Z", "()Lv/VText;", "set_hold_scrap_number_text", "(Lv/VText;)V", "_hold_scrap_number_text", "s", "i0", "set_scrap_number", "_scrap_number", "t", "d0", "set_scrap_craft_text1", "_scrap_craft_text1", "u", "k0", "set_scrap_result_number", "_scrap_result_number", "v", "n0", "set_scrap_target_name_layout_bg", "_scrap_target_name_layout_bg", "w", "q0", "set_target_level", "_target_level", "x", "r0", "set_target_name", "_target_name", "y", "s0", "set_target_right_desc", "_target_right_desc", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/scrap/widget/ScrapTargetShowView;", "z", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/scrap/widget/ScrapTargetShowView;", "m0", "()Lcom/p1/mobile/putong/live/livingroom/increment/gift/scrap/widget/ScrapTargetShowView;", "set_scrap_target_layout", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/scrap/widget/ScrapTargetShowView;)V", "_scrap_target_layout", "Lv/VRecyclerView;", "A", "Lv/VRecyclerView;", "h0", "()Lv/VRecyclerView;", "set_scrap_list_recycler", "(Lv/VRecyclerView;)V", "_scrap_list_recycler", "Lv/VButton;", "B", "Lv/VButton;", "p0", "()Lv/VButton;", "set_target_craft_button", "(Lv/VButton;)V", "_target_craft_button", "C", "e0", "set_scrap_event_button", "_scrap_event_button", "Landroidx/constraintlayout/widget/Guideline;", "D", "Landroidx/constraintlayout/widget/Guideline;", "get_guide_desc", "()Landroidx/constraintlayout/widget/Guideline;", "set_guide_desc", "(Landroidx/constraintlayout/widget/Guideline;)V", "_guide_desc", "E", "c0", "set_scrap_acquire_desc", "_scrap_acquire_desc", "F", "b0", "set_no_data_view", "_no_data_view", "G", "a0", "set_no_data_text", "_no_data_text", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "H", "Lkotlin/Lazy;", "W", "()Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "scrapAdapter", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class a4e0 extends LiveMenuDialogHolder<j4e0> {

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
    public a4e0(@NotNull Act act, @NotNull j4e0 j4e0Var) {
        super(t6c0.f19955o5, act, j4e0Var);
        act.getClass();
        j4e0Var.getClass();
        this.scrapAdapter = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.o3e0
            public final Object invoke() {
                return a4e0.m9334Q();
            }
        });
    }

    /* JADX INFO: renamed from: A0 */
    public static final Unit m9319A0() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B0 */
    public static final Unit m9320B0(a4e0 a4e0Var, BLiveScrapBrief bLiveScrapBrief) {
        a4e0Var.m9369f0().setBackgroundResource(i3c0.f12659U2);
        a4e0Var.m9375l0().setBackgroundResource(i3c0.f12692X2);
        a4e0Var.m9342N0(bLiveScrapBrief);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E0 */
    public static final Unit m9321E0() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static void m9322F(a4e0 a4e0Var, BLiveScrapBrief bLiveScrapBrief, View view) {
        ((j4e0) a4e0Var.f3799b).m15635n4(bLiveScrapBrief);
    }

    /* JADX INFO: renamed from: G0 */
    public static final Unit m9324G0(a4e0 a4e0Var, BLiveScrapBrief bLiveScrapBrief) {
        a4e0Var.m9369f0().setBackgroundResource(i3c0.f12648T2);
        a4e0Var.m9375l0().setBackgroundResource(i3c0.f12703Y2);
        a4e0Var.m9342N0(bLiveScrapBrief);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public static void m9325H(a4e0 a4e0Var, View view) {
        a4e0Var.m9353U0();
    }

    /* JADX INFO: renamed from: I */
    public static void m9326I(a4e0 a4e0Var, View view) {
        ((j4e0) a4e0Var.f3799b).m15631j4();
    }

    /* JADX INFO: renamed from: J */
    public static void m9327J(final a4e0 a4e0Var, View view) {
        ((j4e0) a4e0Var.f3799b).m15632k4(new Function0() { // from class: l.v3e0
            public final Object invoke() {
                return a4e0.m9319A0();
            }
        }, new Function1() { // from class: l.w3e0
            public final Object invoke(Object obj) {
                return a4e0.m9320B0(this.f21433a, (BLiveScrapBrief) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public static void m9328K(a4e0 a4e0Var, BLiveScrapBrief bLiveScrapBrief, View view) {
        j4e0 j4e0Var = (j4e0) a4e0Var.f3799b;
        String str = bLiveScrapBrief.description.scheme;
        str.getClass();
        j4e0Var.m15634m4(str);
    }

    /* JADX INFO: renamed from: M */
    public static void m9330M(final a4e0 a4e0Var, View view) {
        ((j4e0) a4e0Var.f3799b).m15633l4(new Function0() { // from class: l.x3e0
            public final Object invoke() {
                return a4e0.m9321E0();
            }
        }, new Function1() { // from class: l.y3e0
            public final Object invoke(Object obj) {
                return a4e0.m9324G0(this.f22644a, (BLiveScrapBrief) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public static void m9333P(a4e0 a4e0Var, View view) {
        ((j4e0) a4e0Var.f3799b).m15636o4(a4e0Var.m9358X().getHeight() + t100.d(8.0f));
    }

    /* JADX INFO: renamed from: Q */
    public static LiveBaseAdapter m9334Q() {
        return new LiveBaseAdapter();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context mo5210C0() {
        Act act = ((j4e0) this.f3799b).act();
        act.getClass();
        return act;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m9335D0() {
        if (!((j4e0) this.f3799b).m15642t4()) {
            xdl0.V(m9369f0(), 0);
            m9375l0().setVisibility(8);
        } else {
            m9375l0().setVisibility(0);
            xdl0.E0(m9375l0(), new View.OnClickListener() { // from class: l.s3e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a4e0.m9330M(this.f18776a, view);
                }
            });
            xdl0.V(m9369f0(), t100.d(48.0f));
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m9336H0(BLiveScrapBrief selectedScrapBrief) {
        if (TextUtils.isEmpty(selectedScrapBrief.description.text)) {
            m9366c0().setText(R$string.f3257ed);
            m9343O0(selectedScrapBrief, false);
        } else if (TextUtils.isEmpty(selectedScrapBrief.description.scheme)) {
            m9366c0().setText(selectedScrapBrief.description.text);
            m9343O0(selectedScrapBrief, false);
        } else {
            VText vTextM9366c0 = m9366c0();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            vTextM9366c0.setText(String.format("%s>>", Arrays.copyOf(new Object[]{selectedScrapBrief.description.text}, 1)));
            m9343O0(selectedScrapBrief, true);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final void m9337I0(BLiveScrapBrief selectedScrapBrief) {
        m9379p0().setText(R$string.f3147Zc);
        long j = selectedScrapBrief.remainCount;
        if (j < selectedScrapBrief.targetItem.cost || j <= 0 || selectedScrapBrief.itemStock.count <= 0) {
            m9379p0().setBackground(mo5210C0().getDrawable(i3c0.f12909p6));
            m9344P0(selectedScrapBrief, false);
        } else {
            m9379p0().setBackground(mo5210C0().getDrawable(i3c0.f12897o6));
            m9344P0(selectedScrapBrief, true);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m9338J0(BLiveScrapBrief selectedScrapBrief) {
        m9340L0(selectedScrapBrief);
        m9337I0(selectedScrapBrief);
        m9336H0(selectedScrapBrief);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m9339K0(BLiveScrapBrief selectedScrapBrief) {
        if (selectedScrapBrief != null) {
            m9376m0().m7570c(selectedScrapBrief.targetItem.icon, m9383t0());
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m9340L0(BLiveScrapBrief selectedScrapBrief) {
        m9380q0().setText(selectedScrapBrief.rankType.name);
        m9381r0().setText(mmj.m18043D(selectedScrapBrief.targetItem.itemName));
        if (m3e0.m17690h(selectedScrapBrief)) {
            BLiveScrapLiveRight bLiveScrapLiveRight = selectedScrapBrief.giftRight;
            if (bLiveScrapLiveRight == null) {
                m9382s0().setText(R$string.f3213cd);
                return;
            }
            String str = bLiveScrapLiveRight.expiredTime;
            str.getClass();
            if (str.length() <= 0) {
                m9382s0().setText(R$string.f3213cd);
                return;
            }
            Context contextMo5210C0 = mo5210C0();
            String str2 = bLiveScrapLiveRight.expiredTime;
            str2.getClass();
            m9382s0().setText(m3e0.m17686d(contextMo5210C0, str2, false, 4, null));
            return;
        }
        if (!m3e0.m17691i(selectedScrapBrief)) {
            m9382s0().setText(selectedScrapBrief.itemStock.title);
            return;
        }
        BLiveScrapLiveRight bLiveScrapLiveRight2 = selectedScrapBrief.liveRight;
        if (bLiveScrapLiveRight2 == null) {
            m9382s0().setText(selectedScrapBrief.itemStock.title);
            return;
        }
        String str3 = bLiveScrapLiveRight2.expiredTime;
        str3.getClass();
        if (str3.length() <= 0) {
            m9382s0().setText(selectedScrapBrief.itemStock.title);
            return;
        }
        Context contextMo5210C1 = mo5210C0();
        String str4 = bLiveScrapLiveRight2.expiredTime;
        str4.getClass();
        m9382s0().setText(m3e0.m17685c(contextMo5210C1, str4, true));
    }

    /* JADX INFO: renamed from: M0 */
    public final void m9341M0() {
        if (m9383t0()) {
            m9377n0().setBackgroundResource(i3c0.f12681W2);
            m9373j0().setBackgroundResource(i3c0.f12933r6);
            m9369f0().setBackgroundResource(i3c0.f12648T2);
            m9375l0().setBackgroundResource(i3c0.f12703Y2);
            return;
        }
        m9377n0().setBackgroundResource(i3c0.f12670V2);
        m9373j0().setBackgroundResource(i3c0.f12921q6);
        m9369f0().setBackgroundResource(i3c0.f12659U2);
        m9375l0().setBackgroundResource(i3c0.f12692X2);
    }

    /* JADX INFO: renamed from: N0 */
    public final void m9342N0(BLiveScrapBrief selectedScrapBrief) {
        if (selectedScrapBrief == null) {
            m9351T0();
            return;
        }
        m9352U();
        m9350T();
        m9387x0(selectedScrapBrief);
        m9388y0();
        m9338J0(selectedScrapBrief);
        m9341M0();
        m9363Z0(selectedScrapBrief);
        m9385v0();
    }

    /* JADX INFO: renamed from: O0 */
    public final void m9343O0(final BLiveScrapBrief selectedScrapBrief, boolean isClickable) {
        m9366c0().setClickable(isClickable);
        if (isClickable) {
            xdl0.E0(m9366c0(), new View.OnClickListener() { // from class: l.z3e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a4e0.m9328K(this.f23207a, selectedScrapBrief, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m9344P0(final BLiveScrapBrief selectedScrapBrief, boolean isClickable) {
        m9379p0().setClickable(isClickable);
        if (isClickable) {
            xdl0.E0(m9379p0(), new View.OnClickListener() { // from class: l.q3e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a4e0.m9322F(this.f17793a, selectedScrapBrief, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m9345Q0() {
        VText vTextM9372i0 = m9372i0();
        Typeface typeface = Typeface.SANS_SERIF;
        vTextM9372i0.setTypeface(typeface, 3);
        m9374k0().setTypeface(typeface, 3);
        m9380q0().setTypeface(typeface, 3);
    }

    /* JADX INFO: renamed from: R */
    public final void m9346R(View view) {
        b4e0.m10164a(this, view);
    }

    /* JADX INFO: renamed from: R0 */
    public final void m9347R0(@Nullable BLiveScrapBrief selectedScrapBrief) {
        m5211E();
        m9358X().setBackgroundResource(i3c0.f12945s6);
        m9355V0();
        m9389z0();
        m9335D0();
        m9384u0(selectedScrapBrief);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void mo5212i1(@NotNull j4e0 presenter) {
        presenter.getClass();
    }

    /* JADX INFO: renamed from: S0 */
    public final void m9349S0() {
        m5211E();
        xdl0.M(m9375l0(), false);
        m9351T0();
    }

    /* JADX INFO: renamed from: T */
    public final void m9350T() {
        if (m9383t0()) {
            VText vTextM9366c0 = m9366c0();
            Act act = act();
            act.getClass();
            vTextM9366c0.setTextColor(act.getResources().getColor(h1c0.f11760W));
            VText vTextM9380q0 = m9380q0();
            Act act2 = act();
            act2.getClass();
            vTextM9380q0.setTextColor(act2.getResources().getColor(h1c0.f11793i0));
            VText vTextM9381r0 = m9381r0();
            Act act3 = act();
            act3.getClass();
            vTextM9381r0.setTextColor(act3.getResources().getColor(h1c0.f11769a0));
            VText vTextM9367d0 = m9367d0();
            Act act4 = act();
            act4.getClass();
            vTextM9367d0.setTextColor(act4.getResources().getColor(h1c0.f11772b0));
            VText vTextM9374k0 = m9374k0();
            Act act5 = act();
            act5.getClass();
            vTextM9374k0.setTextColor(act5.getResources().getColor(h1c0.f11772b0));
            VText vTextM9362Z = m9362Z();
            Act act6 = act();
            act6.getClass();
            vTextM9362Z.setTextColor(act6.getResources().getColor(h1c0.f11772b0));
            VText vTextM9372i0 = m9372i0();
            Act act7 = act();
            act7.getClass();
            vTextM9372i0.setTextColor(act7.getResources().getColor(h1c0.f11772b0));
            VText vTextM9382s0 = m9382s0();
            Act act8 = act();
            act8.getClass();
            vTextM9382s0.setTextColor(act8.getResources().getColor(h1c0.f11760W));
            return;
        }
        VText vTextM9366c1 = m9366c0();
        Act act9 = act();
        act9.getClass();
        vTextM9366c1.setTextColor(act9.getResources().getColor(h1c0.f11752S));
        VText vTextM9380q1 = m9380q0();
        Act act10 = act();
        act10.getClass();
        vTextM9380q1.setTextColor(act10.getResources().getColor(h1c0.f11807n));
        VText vTextM9381r1 = m9381r0();
        Act act11 = act();
        act11.getClass();
        vTextM9381r1.setTextColor(act11.getResources().getColor(h1c0.f11784f0));
        VText vTextM9367d1 = m9367d0();
        Act act12 = act();
        act12.getClass();
        vTextM9367d1.setTextColor(act12.getResources().getColor(h1c0.f11775c0));
        VText vTextM9374k1 = m9374k0();
        Act act13 = act();
        act13.getClass();
        vTextM9374k1.setTextColor(act13.getResources().getColor(h1c0.f11775c0));
        VText vTextM9362Z2 = m9362Z();
        Act act14 = act();
        act14.getClass();
        vTextM9362Z2.setTextColor(act14.getResources().getColor(h1c0.f11775c0));
        VText vTextM9372i1 = m9372i0();
        Act act15 = act();
        act15.getClass();
        vTextM9372i1.setTextColor(act15.getResources().getColor(h1c0.f11775c0));
        VText vTextM9382s1 = m9382s0();
        Act act16 = act();
        act16.getClass();
        vTextM9382s1.setTextColor(act16.getResources().getColor(h1c0.f11752S));
    }

    /* JADX INFO: renamed from: T0 */
    public final void m9351T0() {
        if (xdl0.O0(m9365b0())) {
            return;
        }
        m9358X().setBackgroundResource(i3c0.f12957t6);
        xdl0.M(m9365b0(), true);
        xdl0.M(m9364a0(), true);
        m9361Y0(false);
    }

    /* JADX INFO: renamed from: U */
    public final void m9352U() {
        if (xdl0.O0(m9365b0())) {
            m9358X().setBackgroundResource(i3c0.f12957t6);
            xdl0.M(m9365b0(), false);
            xdl0.M(m9364a0(), false);
            m9361Y0(true);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final void m9353U0() {
        m9354V();
        ((j4e0) this.f3799b).m15622a4();
        mo5216p();
    }

    /* JADX INFO: renamed from: V */
    public final void m9354V() {
        m9378o0().o();
        m9376m0().m7568a();
    }

    /* JADX INFO: renamed from: V0 */
    public final void m9355V0() {
        m9378o0().j("https://auto.tancdn.com/v1/raw/3b0ba85a-98a1-4d9d-adda-ab419ad5e8f110.so", -1);
    }

    /* JADX INFO: renamed from: W */
    public final LiveBaseAdapter m9356W() {
        return (LiveBaseAdapter) this.scrapAdapter.getValue();
    }

    /* JADX INFO: renamed from: W0 */
    public final void m9357W0(@NotNull BLiveScrapBrief scrapBrief) {
        scrapBrief.getClass();
        m9387x0(scrapBrief);
        m9338J0(scrapBrief);
        m9363Z0(scrapBrief);
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final View m9358X() {
        View view = this._bg_view;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_bg_view");
        return null;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m9359X0(@NotNull o4e0 scrapListItemModel) {
        scrapListItemModel.getClass();
        m9356W().O(scrapListItemModel);
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final View m9360Y() {
        View view = this._blank_space;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_blank_space");
        return null;
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m9361Y0(boolean isVisible) {
        xdl0.M(m9373j0(), isVisible);
        xdl0.M(m9370g0(), isVisible);
        xdl0.M(m9362Z(), isVisible);
        xdl0.M(m9372i0(), isVisible);
        xdl0.M(m9367d0(), isVisible);
        xdl0.M(m9374k0(), isVisible);
        xdl0.M(m9377n0(), isVisible);
        xdl0.M(m9380q0(), isVisible);
        xdl0.M(m9381r0(), isVisible);
        xdl0.M(m9382s0(), isVisible);
        xdl0.M(m9376m0(), isVisible);
        xdl0.M(m9371h0(), isVisible);
        xdl0.M(m9379p0(), isVisible);
        xdl0.M(m9366c0(), isVisible);
        xdl0.M(m9368e0(), isVisible);
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VText m9362Z() {
        VText vText = this._hold_scrap_number_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_hold_scrap_number_text");
        return null;
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m9363Z0(BLiveScrapBrief scrapBrief) {
        if (m9383t0()) {
            m9376m0().m7571d(scrapBrief.targetItem.icon, true);
        } else {
            m9376m0().m7571d(scrapBrief.targetItem.icon, false);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final VText m9364a0() {
        VText vText = this._no_data_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_no_data_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final View m9365b0() {
        View view = this._no_data_view;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_no_data_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VText m9366c0() {
        VText vText = this._scrap_acquire_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_scrap_acquire_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final VText m9367d0() {
        VText vText = this._scrap_craft_text1;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_scrap_craft_text1");
        return null;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public void destroy() {
        m9353U0();
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final VButton m9368e0() {
        VButton vButton = this._scrap_event_button;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_scrap_event_button");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final AppCompatImageView m9369f0() {
        AppCompatImageView appCompatImageView = this._scrap_gift_title_view;
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        Intrinsics.r("_scrap_gift_title_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final View m9370g0() {
        View view = this._scrap_help_view;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_scrap_help_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final VRecyclerView m9371h0() {
        VRecyclerView vRecyclerView = this._scrap_list_recycler;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.r("_scrap_list_recycler");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final VText m9372i0() {
        VText vText = this._scrap_number;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_scrap_number");
        return null;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    @Nullable
    public View inflateView(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent) {
        inflater.getClass();
        parent.getClass();
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final View m9373j0() {
        View view = this._scrap_number_desc_bg;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_scrap_number_desc_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k0 */
    public final VText m9374k0() {
        VText vText = this._scrap_result_number;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_scrap_result_number");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public final AppCompatImageView m9375l0() {
        AppCompatImageView appCompatImageView = this._scrap_right_title_view;
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        Intrinsics.r("_scrap_right_title_view");
        return null;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(@NotNull View view) {
        view.getClass();
        super.mo5214m(view);
        m9346R(view);
        m5222z(LiveDialogEnum.SCRAP_GIFT);
        m5207A(80);
        m9360Y().setOnClickListener(new View.OnClickListener() { // from class: l.r3e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a4e0.m9325H(this.f18352a, view2);
            }
        });
        mep0.c1(m9358X(), 0, 0, 0, -t100.d(24.0f), t100.d(24.0f));
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final ScrapTargetShowView m9376m0() {
        ScrapTargetShowView scrapTargetShowView = this._scrap_target_layout;
        if (scrapTargetShowView != null) {
            return scrapTargetShowView;
        }
        Intrinsics.r("_scrap_target_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n0 */
    public final View m9377n0() {
        View view = this._scrap_target_name_layout_bg;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_scrap_target_name_layout_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public final AnimEffectPlayer m9378o0() {
        AnimEffectPlayer animEffectPlayer = this._star_bg_view;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.r("_star_bg_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p0 */
    public final VButton m9379p0() {
        VButton vButton = this._target_craft_button;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_target_craft_button");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q0 */
    public final VText m9380q0() {
        VText vText = this._target_level;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_target_level");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: r0 */
    public final VText m9381r0() {
        VText vText = this._target_name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_target_name");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s0 */
    public final VText m9382s0() {
        VText vText = this._target_right_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_target_right_desc");
        return null;
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m9383t0() {
        return ((j4e0) this.f3799b).m15643u4();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m9384u0(BLiveScrapBrief selectedScrapBrief) {
        m9345Q0();
        xdl0.E0(m9370g0(), new View.OnClickListener() { // from class: l.u3e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a4e0.m9333P(this.f20478a, view);
            }
        });
        m9339K0(selectedScrapBrief);
        m9342N0(selectedScrapBrief);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m9385v0() {
        if (((j4e0) this.f3799b).m15624c4().length() == 0) {
            xdl0.M(m9368e0(), false);
            return;
        }
        xdl0.M(m9368e0(), true);
        m9368e0().setText(((j4e0) this.f3799b).m15624c4());
        xdl0.E0(m9368e0(), new View.OnClickListener() { // from class: l.p3e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a4e0.m9326I(this.f16995a, view);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public final void m9386w0(BLiveScrapBrief selectedScrapBrief) {
        long j = selectedScrapBrief.targetItem.cost;
        if (j <= 0) {
            j = 1;
        }
        int i = (int) (selectedScrapBrief.remainCount / j);
        if (m3e0.m17689g(selectedScrapBrief)) {
            m9367d0().setText(R$string.f3169ad);
            m9374k0().setText(String.valueOf(i));
            return;
        }
        m9367d0().setText(R$string.f3323hd);
        if (i > 0) {
            m9374k0().setText(R$string.f3345id);
        } else {
            m9374k0().setText(R$string.f3235dd);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m9387x0(BLiveScrapBrief selectedScrapBrief) {
        m9362Z().setText(R$string.f3279fd);
        VText vTextM9372i0 = m9372i0();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        vTextM9372i0.setText(String.format("%s/%s", Arrays.copyOf(new Object[]{Long.valueOf(selectedScrapBrief.remainCount), Long.valueOf(selectedScrapBrief.targetItem.cost)}, 2)));
        m9386w0(selectedScrapBrief);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m9388y0() {
        VRecyclerView vRecyclerViewM9371h0 = m9371h0();
        if (vRecyclerViewM9371h0.getItemDecorationCount() > 0) {
            vRecyclerViewM9371h0.removeItemDecorationAt(0);
        }
        if (vRecyclerViewM9371h0.getAdapter() == null) {
            vRecyclerViewM9371h0.setAdapter(m9356W());
        }
        if (m9383t0()) {
            VRecyclerView vRecyclerViewM9371h1 = m9371h0();
            vRecyclerViewM9371h1.setLayoutManager(new GridLayoutManager(mo5210C0(), 1));
            vRecyclerViewM9371h1.addItemDecoration(new atf0(1));
        } else {
            VRecyclerView vRecyclerViewM9371h2 = m9371h0();
            vRecyclerViewM9371h2.setLayoutManager(new GridLayoutManager(mo5210C0(), 2));
            vRecyclerViewM9371h2.addItemDecoration(new atf0(2));
        }
        m9356W().Z(((j4e0) this.f3799b).m15625d4());
        int iM15628g4 = ((j4e0) this.f3799b).m15628g4();
        if (iM15628g4 > 0) {
            m9371h0().smoothScrollToPosition(iM15628g4);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m9389z0() {
        if (((j4e0) this.f3799b).m15640s4()) {
            m9369f0().setVisibility(0);
            xdl0.E0(m9369f0(), new View.OnClickListener() { // from class: l.t3e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a4e0.m9327J(this.f19410a, view);
                }
            });
        }
    }
}
