package p002l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallCategory;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallDetailInfoItem;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftDetail;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftList;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallHierarchy;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallProgress;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallTab;
import com.tantan.live.eventbus.LiveEventBus;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.ddv;
import l.e30;
import l.hxs;
import l.kvc0;
import l.mep0;
import l.mqv;
import l.osi0;
import l.t100;
import l.vwb;
import l.w8u;
import l.w9j;
import l.xdl0;
import l.yb2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u000eJ\u000f\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u000eJ\u000f\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u000eJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b&\u0010%J\u0017\u0010'\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b'\u0010\fJ\u001f\u0010*\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b,\u0010\u0016J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\nH\u0014¢\u0006\u0004\b0\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\"\u0010:\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010\fR\"\u0010=\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u00106\u001a\u0004\b;\u00108\"\u0004\b<\u0010\fR\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010I\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u00106\u001a\u0004\bG\u00108\"\u0004\bH\u0010\fR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010\\\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010@\u001a\u0004\bZ\u0010B\"\u0004\b[\u0010DR\"\u0010`\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010@\u001a\u0004\b^\u0010B\"\u0004\b_\u0010DR\"\u0010d\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010@\u001a\u0004\bb\u0010B\"\u0004\bc\u0010DR\"\u0010h\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010L\u001a\u0004\bf\u0010N\"\u0004\bg\u0010PR\"\u0010l\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u00106\u001a\u0004\bj\u00108\"\u0004\bk\u0010\fR\"\u0010o\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00106\u001a\u0004\bm\u00108\"\u0004\bn\u0010\fR\"\u0010s\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bp\u0010L\u001a\u0004\bq\u0010N\"\u0004\br\u0010PR\"\u0010{\u001a\u00020t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\"\u0010\u007f\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b|\u0010@\u001a\u0004\b}\u0010B\"\u0004\b~\u0010DR&\u0010\u0083\u0001\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010@\u001a\u0005\b\u0081\u0001\u0010B\"\u0005\b\u0082\u0001\u0010DR&\u0010\u0087\u0001\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010L\u001a\u0005\b\u0085\u0001\u0010N\"\u0005\b\u0086\u0001\u0010PR&\u0010\u008b\u0001\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010L\u001a\u0005\b\u0089\u0001\u0010N\"\u0005\b\u008a\u0001\u0010PR&\u0010\u008f\u0001\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008c\u0001\u0010L\u001a\u0005\b\u008d\u0001\u0010N\"\u0005\b\u008e\u0001\u0010PR&\u0010\u0093\u0001\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0090\u0001\u00106\u001a\u0005\b\u0091\u0001\u00108\"\u0005\b\u0092\u0001\u0010\fR&\u0010\u0097\u0001\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010L\u001a\u0005\b\u0095\u0001\u0010N\"\u0005\b\u0096\u0001\u0010PR&\u0010\u009b\u0001\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0098\u0001\u0010L\u001a\u0005\b\u0099\u0001\u0010N\"\u0005\b\u009a\u0001\u0010PR*\u0010£\u0001\u001a\u00030\u009c\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R&\u0010§\u0001\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¤\u0001\u00106\u001a\u0005\b¥\u0001\u00108\"\u0005\b¦\u0001\u0010\fR&\u0010«\u0001\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¨\u0001\u0010L\u001a\u0005\b©\u0001\u0010N\"\u0005\bª\u0001\u0010PR&\u0010¯\u0001\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¬\u0001\u0010L\u001a\u0005\b\u00ad\u0001\u0010N\"\u0005\b®\u0001\u0010PR*\u0010³\u0001\u001a\u00030\u009c\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b°\u0001\u0010\u009e\u0001\u001a\u0006\b±\u0001\u0010 \u0001\"\u0006\b²\u0001\u0010¢\u0001R&\u0010·\u0001\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b´\u0001\u0010L\u001a\u0005\bµ\u0001\u0010N\"\u0005\b¶\u0001\u0010PR*\u0010¿\u0001\u001a\u00030¸\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R&\u0010Ã\u0001\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÀ\u0001\u0010L\u001a\u0005\bÁ\u0001\u0010N\"\u0005\bÂ\u0001\u0010PR*\u0010Ç\u0001\u001a\u00030¸\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÄ\u0001\u0010º\u0001\u001a\u0006\bÅ\u0001\u0010¼\u0001\"\u0006\bÆ\u0001\u0010¾\u0001R*\u0010Ë\u0001\u001a\u00030¸\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÈ\u0001\u0010º\u0001\u001a\u0006\bÉ\u0001\u0010¼\u0001\"\u0006\bÊ\u0001\u0010¾\u0001R\u001b\u0010Î\u0001\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R\u001c\u0010Ò\u0001\u001a\u0005\u0018\u00010Ï\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u001c\u0010Ô\u0001\u001a\u0005\u0018\u00010Ï\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010Ñ\u0001R\u001c\u0010Ø\u0001\u001a\u0005\u0018\u00010Õ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001¨\u0006Ù\u0001"}, d2 = {"Ll/pps;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/wps;", "Lcom/p1/mobile/android/app/Act;", "act", "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/wps;)V", "Landroid/view/View;", "view", "", "g0", "(Landroid/view/View;)V", "r", "()V", "w1", "N0", "O0", "M0", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;", "data", "p1", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;)V", "m1", "s1", "S0", "R0", "Q0", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGift;", "gift", "P0", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGift;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "h0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "m", "Lcom/p1/mobile/putong/live/livingroom/common/usercard/bean/UserCardBean;", "userCardBean", "v1", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;Lcom/p1/mobile/putong/live/livingroom/common/usercard/bean/UserCardBean;)V", "T0", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "w", "k", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "l", "Landroid/view/View;", "E0", "()Landroid/view/View;", "set_shadow", "_shadow", "i0", "set_bg", "_bg", "Lv/VDraweeView;", "n", "Lv/VDraweeView;", "j0", "()Lv/VDraweeView;", "set_bg_img", "(Lv/VDraweeView;)V", "_bg_img", "o", "get_title_layout", "set_title_layout", "_title_layout", "Landroid/widget/TextView;", "p", "Landroid/widget/TextView;", "G0", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "Lv/VImage;", "q", "Lv/VImage;", "x0", "()Lv/VImage;", "set_help", "(Lv/VImage;)V", "_help", "l0", "set_card_bg", "_card_bg", "s", "k0", "set_big_icon_img", "_big_icon_img", "t", "H0", "set_user_icon", "_user_icon", "u", "L0", "set_user_name", "_user_name", "v", "m0", "set_card_progress_bg", "_card_progress_bg", "n0", "set_card_progress_layer", "_card_progress_layer", "x", "D0", "set_progress_text", "_progress_text", "Landroidx/constraintlayout/widget/ConstraintLayout;", "y", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_medal_bg", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_medal_bg", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_medal_bg", "z", "I0", "set_user_medal_bg", "_user_medal_bg", "A", "J0", "set_user_medal_icon", "_user_medal_icon", "B", "K0", "set_user_medal_level", "_user_medal_level", "C", "p0", "set_gift_count_title", "_gift_count_title", "D", "o0", "set_gift_count", "_gift_count", "E", "get_divider_line_one", "set_divider_line_one", "_divider_line_one", "F", "u0", "set_gift_skin_count", "_gift_skin_count", "G", "w0", "set_gift_skin_title", "_gift_skin_title", "Landroid/widget/ImageView;", "H", "Landroid/widget/ImageView;", "v0", "()Landroid/widget/ImageView;", "set_gift_skin_more", "(Landroid/widget/ImageView;)V", "_gift_skin_more", "I", "get_divider_line_two", "set_divider_line_two", "_divider_line_two", "J", "r0", "set_gift_set_count", "_gift_set_count", "K", "t0", "set_gift_set_title", "_gift_set_title", "L", "s0", "set_gift_set_more", "_gift_set_more", "M", "z0", "set_new_gift_title", "_new_gift_title", "Landroidx/recyclerview/widget/RecyclerView;", "N", "Landroidx/recyclerview/widget/RecyclerView;", "y0", "()Landroidx/recyclerview/widget/RecyclerView;", "set_new_gift_recycler", "(Landroidx/recyclerview/widget/RecyclerView;)V", "_new_gift_recycler", "O", "B0", "set_picks_gift_title", "_picks_gift_title", "P", "A0", "set_picks_gift_recycler", "_picks_gift_recycler", "Q", "q0", "set_gift_list_recycler", "_gift_list_recycler", "R", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;", "info", "Ll/sms;", "S", "Ll/sms;", "newGiftAdapter", "T", "picksGiftAdapter", "Ll/mms;", "U", "Ll/mms;", "giftListAdapter", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class pps extends LiveMenuDialogHolder<wps> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public VDraweeView _user_medal_icon;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public TextView _user_medal_level;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public TextView _gift_count_title;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public TextView _gift_count;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public View _divider_line_one;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public TextView _gift_skin_count;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public TextView _gift_skin_title;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ImageView _gift_skin_more;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public View _divider_line_two;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public TextView _gift_set_count;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public TextView _gift_set_title;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public ImageView _gift_set_more;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public TextView _new_gift_title;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public RecyclerView _new_gift_recycler;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public TextView _picks_gift_title;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public RecyclerView _picks_gift_recycler;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public RecyclerView _gift_list_recycler;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @Nullable
    public BLiveNewGiftWallDetailInfoItem info;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @Nullable
    public sms newGiftAdapter;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @Nullable
    public sms picksGiftAdapter;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @Nullable
    public mms giftListAdapter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public View _shadow;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public View _bg;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VDraweeView _bg_img;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public View _title_layout;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VImage _help;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public VDraweeView _card_bg;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public VDraweeView _big_icon_img;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public VDraweeView _user_icon;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public TextView _user_name;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public View _card_progress_bg;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public View _card_progress_layer;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public TextView _progress_text;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public ConstraintLayout _medal_bg;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public VDraweeView _user_medal_bg;

    /* JADX INFO: renamed from: l.pps$a */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"l/pps$a", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0756a extends RecyclerView.n {
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.z state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            RecyclerView.Adapter adapter = parent.getAdapter();
            adapter.getClass();
            if (adapter.getItemCount() - parent.getChildAdapterPosition(view) <= 1) {
                outRect.bottom = t100.d(50.0f);
            } else {
                outRect.bottom = t100.d(0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l.pps$b */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"l/pps$b", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0757b extends RecyclerView.n {
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.z state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            if (parent.getChildAdapterPosition(view) == 0) {
                outRect.left = t100.d(0.0f);
            } else {
                outRect.left = t100.d(4.0f);
            }
            outRect.right = t100.d(4.0f);
        }
    }

    /* JADX INFO: renamed from: l.pps$c */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"l/pps$c", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0758c extends RecyclerView.n {
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.z state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            if (parent.getChildAdapterPosition(view) == 0) {
                outRect.left = t100.d(0.0f);
            } else {
                outRect.left = t100.d(4.0f);
            }
            outRect.right = t100.d(4.0f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pps(@NotNull Act act, @NotNull wps wpsVar) {
        super(t6c0.f19484C4, act, wpsVar);
        act.getClass();
        wpsVar.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: H */
    public static void m20530H(pps ppsVar, View view) {
        ppsVar.mo5216p();
    }

    /* JADX INFO: renamed from: K */
    public static void m20533K(pps ppsVar, BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail) {
        BLiveNewGiftWallGift bLiveNewGiftWallGift = bLiveNewGiftWallGiftDetail.gift;
        bLiveNewGiftWallGift.getClass();
        ppsVar.m20539P0(bLiveNewGiftWallGift);
    }

    /* JADX INFO: renamed from: P0 */
    private final void m20539P0(BLiveNewGiftWallGift gift) {
        ((wps) this.f3799b).m25281Z3(gift);
    }

    /* JADX INFO: renamed from: Q */
    public static Boolean m20540Q(BLiveNewGiftWallTab bLiveNewGiftWallTab) {
        return Boolean.valueOf(Intrinsics.d(bLiveNewGiftWallTab.type, "new"));
    }

    /* JADX INFO: renamed from: U0 */
    public static final Boolean m20545U0(BLiveNewGiftWallProgress bLiveNewGiftWallProgress) {
        return Boolean.valueOf(Intrinsics.d(bLiveNewGiftWallProgress.type, "gift"));
    }

    /* JADX INFO: renamed from: V0 */
    public static final Boolean m20547V0(BLiveNewGiftWallProgress bLiveNewGiftWallProgress) {
        return Boolean.valueOf(Intrinsics.d(bLiveNewGiftWallProgress.type, "set"));
    }

    /* JADX INFO: renamed from: W0 */
    public static final void m20549W0(View view) {
        osi0.g("敬请期待");
    }

    /* JADX INFO: renamed from: X */
    public static void m20550X(pps ppsVar, View view) {
        ppsVar.m20593S0();
    }

    /* JADX INFO: renamed from: X0 */
    public static final void m20551X0(View view) {
        osi0.g("敬请期待");
    }

    /* JADX INFO: renamed from: Y0 */
    public static final void m20553Y0(View view) {
        osi0.g("敬请期待");
    }

    /* JADX INFO: renamed from: Z0 */
    public static final void m20555Z0(pps ppsVar, View view) {
        ppsVar.m20591Q0();
    }

    /* JADX INFO: renamed from: a1 */
    public static final void m20557a1(pps ppsVar, View view) {
        ppsVar.m20591Q0();
    }

    /* JADX INFO: renamed from: d0 */
    public static Boolean m20560d0(BLiveNewGiftWallTab bLiveNewGiftWallTab) {
        return Boolean.valueOf(Intrinsics.d(bLiveNewGiftWallTab.type, "picks"));
    }

    /* JADX INFO: renamed from: d1 */
    public static final void m20561d1(pps ppsVar, View view) {
        ppsVar.m20591Q0();
    }

    /* JADX INFO: renamed from: e1 */
    public static final Boolean m20563e1(BLiveNewGiftWallProgress bLiveNewGiftWallProgress) {
        return Boolean.valueOf(Intrinsics.d(bLiveNewGiftWallProgress.type, "skin"));
    }

    /* JADX INFO: renamed from: f0 */
    public static void m20564f0(pps ppsVar, BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail) {
        BLiveNewGiftWallGift bLiveNewGiftWallGift = bLiveNewGiftWallGiftDetail.gift;
        bLiveNewGiftWallGift.getClass();
        ppsVar.m20539P0(bLiveNewGiftWallGift);
    }

    /* JADX INFO: renamed from: f1 */
    public static final void m20565f1(View view) {
        osi0.g("敬请期待");
    }

    /* JADX INFO: renamed from: g1 */
    public static final void m20566g1(View view) {
        osi0.g("敬请期待");
    }

    /* JADX INFO: renamed from: h1 */
    public static final void m20567h1(View view) {
        osi0.g("敬请期待");
    }

    /* JADX INFO: renamed from: j1 */
    public static final void m20568j1(pps ppsVar, View view) {
        ppsVar.m20592R0();
    }

    /* JADX INFO: renamed from: k1 */
    public static final void m20569k1(pps ppsVar, View view) {
        ppsVar.m20592R0();
    }

    /* JADX INFO: renamed from: l1 */
    public static final void m20570l1(pps ppsVar, View view) {
        ppsVar.m20592R0();
    }

    /* JADX INFO: renamed from: n1 */
    public static final Boolean m20571n1(BLiveNewGiftWallTab bLiveNewGiftWallTab, BLiveNewGiftWallCategory bLiveNewGiftWallCategory) {
        return Boolean.valueOf(Intrinsics.d(bLiveNewGiftWallCategory.id, bLiveNewGiftWallTab.categoryId));
    }

    /* JADX INFO: renamed from: o1 */
    public static final Boolean m20572o1(String str, BLiveNewGiftWallGift bLiveNewGiftWallGift) {
        return Boolean.valueOf(Intrinsics.d(bLiveNewGiftWallGift.id, str));
    }

    /* JADX INFO: renamed from: q1 */
    public static final Boolean m20573q1(String str, BLiveNewGiftWallGift bLiveNewGiftWallGift) {
        return Boolean.valueOf(Intrinsics.d(bLiveNewGiftWallGift.id, str));
    }

    /* JADX INFO: renamed from: r */
    private final void m20574r() {
        m20582G0().getPaint().setFakeBoldText(true);
        m20616w1();
        View viewM20597i0 = m20597i0();
        int i = t100.q;
        mep0.c1(viewM20597i0, 0, 0, 0, -i, i);
        mep0.c1(m20598j0(), 0, 0, 0, -i, i);
        m20589N0();
        m20590O0();
        m20588M0();
    }

    /* JADX INFO: renamed from: r1 */
    public static final Boolean m20575r1(BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail, BLiveNewGiftWallCategory bLiveNewGiftWallCategory) {
        return Boolean.valueOf(Intrinsics.d(bLiveNewGiftWallCategory.id, bLiveNewGiftWallGiftDetail.gift.categoryId));
    }

    /* JADX INFO: renamed from: t1 */
    public static final Boolean m20576t1(String str, BLiveNewGiftWallGift bLiveNewGiftWallGift) {
        return Boolean.valueOf(Intrinsics.d(bLiveNewGiftWallGift.id, str));
    }

    /* JADX INFO: renamed from: u1 */
    public static final Boolean m20577u1(BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail, BLiveNewGiftWallCategory bLiveNewGiftWallCategory) {
        return Boolean.valueOf(Intrinsics.d(bLiveNewGiftWallCategory.id, bLiveNewGiftWallGiftDetail.gift.categoryId));
    }

    @NotNull
    /* JADX INFO: renamed from: A0 */
    public final RecyclerView m20578A0() {
        RecyclerView recyclerView = this._picks_gift_recycler;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.r("_picks_gift_recycler");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B0 */
    public final TextView m20579B0() {
        TextView textView = this._picks_gift_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_picks_gift_title");
        return null;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context mo5210C0() {
        Context context = m20581E0().getContext();
        context.getClass();
        return context;
    }

    @NotNull
    /* JADX INFO: renamed from: D0 */
    public final TextView m20580D0() {
        TextView textView = this._progress_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_progress_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: E0 */
    public final View m20581E0() {
        View view = this._shadow;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_shadow");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G0 */
    public final TextView m20582G0() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H0 */
    public final VDraweeView m20583H0() {
        VDraweeView vDraweeView = this._user_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_user_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I0 */
    public final VDraweeView m20584I0() {
        VDraweeView vDraweeView = this._user_medal_bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_user_medal_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J0 */
    public final VDraweeView m20585J0() {
        VDraweeView vDraweeView = this._user_medal_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_user_medal_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K0 */
    public final TextView m20586K0() {
        TextView textView = this._user_medal_level;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_user_medal_level");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L0 */
    public final TextView m20587L0() {
        TextView textView = this._user_name;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_user_name");
        return null;
    }

    /* JADX INFO: renamed from: M0 */
    public final void m20588M0() {
        if (this.giftListAdapter == null) {
            this.giftListAdapter = new mms((wps) this.f3799b);
            m20607q0().setAdapter(this.giftListAdapter);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mo5210C0());
            linearLayoutManager.setOrientation(1);
            m20607q0().setLayoutManager(linearLayoutManager);
            m20607q0().setHasFixedSize(true);
            m20607q0().setNestedScrollingEnabled(false);
            m20607q0().addItemDecoration(new C0756a());
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m20589N0() {
        if (this.newGiftAdapter == null) {
            this.newGiftAdapter = new sms(new e30() { // from class: l.oos
                public final void call(Object obj) {
                    pps.m20564f0(this.f16735a, (BLiveNewGiftWallGiftDetail) obj);
                }
            });
            m20618y0().setAdapter(this.newGiftAdapter);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mo5210C0());
            linearLayoutManager.setOrientation(0);
            m20618y0().setLayoutManager(linearLayoutManager);
            m20618y0().setHasFixedSize(true);
            m20618y0().addItemDecoration(new C0757b());
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final void m20590O0() {
        if (this.picksGiftAdapter == null) {
            this.picksGiftAdapter = new sms(new e30() { // from class: l.ips
                public final void call(Object obj) {
                    pps.m20533K(this.f13353a, (BLiveNewGiftWallGiftDetail) obj);
                }
            });
            m20578A0().setAdapter(this.picksGiftAdapter);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mo5210C0());
            linearLayoutManager.setOrientation(0);
            m20578A0().setLayoutManager(linearLayoutManager);
            m20578A0().setHasFixedSize(true);
            m20578A0().addItemDecoration(new C0758c());
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m20591Q0() {
        hp50 openGiftWallInfo = ((wps) this.f3799b).getOpenGiftWallInfo();
        if (openGiftWallInfo != null) {
            LiveEventBus liveEventBusM25548F2 = ((wps) this.f3799b).m25548F2();
            liveEventBusM25548F2.getClass();
            new LiveEventBus.GiftWallV2Event(liveEventBusM25548F2).showSetDialog().j(openGiftWallInfo);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final void m20592R0() {
        hp50 openGiftWallInfo = ((wps) this.f3799b).getOpenGiftWallInfo();
        if (openGiftWallInfo != null) {
            LiveEventBus liveEventBusM25548F2 = ((wps) this.f3799b).m25548F2();
            liveEventBusM25548F2.getClass();
            new LiveEventBus.GiftWallV2Event(liveEventBusM25548F2).showSkinSetDialog().j(openGiftWallInfo);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final void m20593S0() {
        if (this.info != null) {
            int height = m20597i0().getHeight() + t100.d(10.0f);
            wps wpsVar = (wps) this.f3799b;
            String str = ddv.C;
            str.getClass();
            wpsVar.m25282a4(str, height);
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: T0 */
    public final void m20594T0(@NotNull BLiveNewGiftWallDetailInfoItem data) {
        data.getClass();
        m20582G0().setText(data.title);
        xdl0.M(m20586K0(), data.hierarchy.grade > 0);
        xdl0.M(m20584I0(), data.hierarchy.grade > 0);
        xdl0.M(m20585J0(), !TextUtils.isEmpty(data.hierarchy.smallIcon));
        if (TextUtils.isEmpty(data.hierarchy.smallIcon)) {
            TextView textViewM20586K0 = m20586K0();
            BLiveNewGiftWallHierarchy bLiveNewGiftWallHierarchy = data.hierarchy;
            textViewM20586K0.setText(bLiveNewGiftWallHierarchy.name + "·LV." + bLiveNewGiftWallHierarchy.grade);
        } else {
            m20586K0().setText(String.valueOf(data.hierarchy.grade));
            hxs.s("context_livingAct", m20585J0(), data.hierarchy.smallIcon);
        }
        hxs.s("context_livingAct", m20584I0(), data.hierarchy.smallIconBgUrl);
        hxs.t("context_livingAct", m20598j0(), data.bgUrl, 480);
        hxs.s("context_livingAct", m20600l0(), data.hierarchy.cardBgUrl);
        hxs.s("context_livingAct", m20599k0(), data.hierarchy.largeIcon);
        BLiveNewGiftWallProgress bLiveNewGiftWallProgress = data.hierarchy.progress;
        bLiveNewGiftWallProgress.getClass();
        m20580D0().setText(bLiveNewGiftWallProgress.current + "/" + bLiveNewGiftWallProgress.total);
        int width = (int) ((((float) bLiveNewGiftWallProgress.current) / ((float) bLiveNewGiftWallProgress.total)) * ((float) m20601m0().getWidth()));
        xdl0.D0(width, new View[]{m20603n0()});
        xdl0.M(m20603n0(), width != 0);
        m20601m0().setBackground(yb2.j(kvc0.g(bLiveNewGiftWallProgress.bgStartColor), kvc0.g(bLiveNewGiftWallProgress.bgEndColor), 6));
        m20603n0().setBackground(yb2.j(kvc0.g(bLiveNewGiftWallProgress.startColor), kvc0.g(bLiveNewGiftWallProgress.endColor), 6));
        BLiveNewGiftWallProgress bLiveNewGiftWallProgress2 = (BLiveNewGiftWallProgress) vwb.r(data.progresses, new w9j() { // from class: l.ros
            public final Object call(Object obj) {
                return pps.m20545U0((BLiveNewGiftWallProgress) obj);
            }
        });
        if (bLiveNewGiftWallProgress2 != null) {
            m20605p0().setText(bLiveNewGiftWallProgress2.name);
            m20604o0().setText(bLiveNewGiftWallProgress2.current + "/" + bLiveNewGiftWallProgress2.total);
        }
        BLiveNewGiftWallProgress bLiveNewGiftWallProgress3 = (BLiveNewGiftWallProgress) vwb.r(data.progresses, new w9j() { // from class: l.xos
            public final Object call(Object obj) {
                return pps.m20547V0((BLiveNewGiftWallProgress) obj);
            }
        });
        if (bLiveNewGiftWallProgress3 != null) {
            m20611t0().setText(bLiveNewGiftWallProgress3.name);
            if (bLiveNewGiftWallProgress3.total == 0) {
                m20608r0().setText("敬请期待");
                xdl0.E0(m20611t0(), new View.OnClickListener() { // from class: l.yos
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        pps.m20549W0(view);
                    }
                });
                xdl0.E0(m20608r0(), new View.OnClickListener() { // from class: l.aps
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        pps.m20551X0(view);
                    }
                });
                xdl0.E0(m20609s0(), new View.OnClickListener() { // from class: l.bps
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        pps.m20553Y0(view);
                    }
                });
            } else {
                m20608r0().setText(bLiveNewGiftWallProgress3.current + "/" + bLiveNewGiftWallProgress3.total);
                xdl0.E0(m20611t0(), new View.OnClickListener() { // from class: l.cps
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        pps.m20555Z0(this.f8885a, view);
                    }
                });
                xdl0.E0(m20608r0(), new View.OnClickListener() { // from class: l.dps
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        pps.m20557a1(this.f9383a, view);
                    }
                });
                xdl0.E0(m20609s0(), new View.OnClickListener() { // from class: l.eps
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        pps.m20561d1(this.f9927a, view);
                    }
                });
            }
        }
        BLiveNewGiftWallProgress bLiveNewGiftWallProgress4 = (BLiveNewGiftWallProgress) vwb.r(data.progresses, new w9j() { // from class: l.fps
            public final Object call(Object obj) {
                return pps.m20563e1((BLiveNewGiftWallProgress) obj);
            }
        });
        if (bLiveNewGiftWallProgress4 != null) {
            m20615w0().setText(bLiveNewGiftWallProgress4.name);
            if (bLiveNewGiftWallProgress4.total == 0) {
                m20612u0().setText("敬请期待");
                xdl0.E0(m20612u0(), new View.OnClickListener() { // from class: l.gps
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        pps.m20565f1(view);
                    }
                });
                xdl0.E0(m20613v0(), new View.OnClickListener() { // from class: l.sos
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        pps.m20566g1(view);
                    }
                });
                xdl0.E0(m20615w0(), new View.OnClickListener() { // from class: l.tos
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        pps.m20567h1(view);
                    }
                });
                return;
            }
            m20612u0().setText(bLiveNewGiftWallProgress4.current + "/" + bLiveNewGiftWallProgress4.total);
            xdl0.E0(m20612u0(), new View.OnClickListener() { // from class: l.uos
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    pps.m20568j1(this.f20743a, view);
                }
            });
            xdl0.E0(m20613v0(), new View.OnClickListener() { // from class: l.vos
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    pps.m20569k1(this.f21255a, view);
                }
            });
            xdl0.E0(m20615w0(), new View.OnClickListener() { // from class: l.wos
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    pps.m20570l1(this.f21900a, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m20595g0(View view) {
        qps.m21504a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final View m20596h0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM21505b = qps.m21505b(this, inflater, parent);
        viewM21505b.getClass();
        return viewM21505b;
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final View m20597i0() {
        View view = this._bg;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_bg");
        return null;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent) {
        inflater.getClass();
        parent.getClass();
        return m20596h0(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final VDraweeView m20598j0() {
        VDraweeView vDraweeView = this._bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_bg_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k0 */
    public final VDraweeView m20599k0() {
        VDraweeView vDraweeView = this._big_icon_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_big_icon_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public final VDraweeView m20600l0() {
        VDraweeView vDraweeView = this._card_bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_card_bg");
        return null;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(@NotNull View view) {
        view.getClass();
        super.mo5214m(view);
        m20595g0(view);
        m20574r();
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final View m20601m0() {
        View view = this._card_progress_bg;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_card_progress_bg");
        return null;
    }

    /* JADX INFO: renamed from: m1 */
    public final void m20602m1(BLiveNewGiftWallDetailInfoItem data) {
        List<BLiveNewGiftWallGiftList> arrayList = new ArrayList<>();
        List<BLiveNewGiftWallTab> list = data.tabs;
        list.getClass();
        for (final BLiveNewGiftWallTab bLiveNewGiftWallTab : list) {
            if (!Intrinsics.d(bLiveNewGiftWallTab.type, "new") && !Intrinsics.d(bLiveNewGiftWallTab.type, "picks") && !vwb.J(bLiveNewGiftWallTab.giftIds)) {
                BLiveNewGiftWallGiftList bLiveNewGiftWallGiftListNew_ = BLiveNewGiftWallGiftList.new_();
                bLiveNewGiftWallGiftListNew_.tab = bLiveNewGiftWallTab;
                bLiveNewGiftWallGiftListNew_.category = (BLiveNewGiftWallCategory) vwb.r(data.categories, new w9j() { // from class: l.pos
                    public final Object call(Object obj) {
                        return pps.m20571n1(bLiveNewGiftWallTab, (BLiveNewGiftWallCategory) obj);
                    }
                });
                List arrayList2 = new ArrayList();
                List<String> list2 = bLiveNewGiftWallGiftListNew_.tab.giftIds;
                list2.getClass();
                for (final String str : list2) {
                    arrayList2 = vwb.c(arrayList2, (BLiveNewGiftWallGift) vwb.r(data.gifts, new w9j() { // from class: l.qos
                        public final Object call(Object obj) {
                            return pps.m20572o1(str, (BLiveNewGiftWallGift) obj);
                        }
                    }));
                    arrayList2.getClass();
                }
                if (!vwb.J(arrayList2)) {
                    bLiveNewGiftWallGiftListNew_.gifts = arrayList2;
                    bLiveNewGiftWallGiftListNew_.users = data.users;
                    arrayList = vwb.c(arrayList, bLiveNewGiftWallGiftListNew_);
                    arrayList.getClass();
                }
            }
        }
        xdl0.M(m20607q0(), !arrayList.isEmpty());
        m20607q0().scrollToPosition(0);
        mms mmsVar = this.giftListAdapter;
        if (mmsVar != null) {
            mmsVar.m18088H(arrayList);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: n0 */
    public final View m20603n0() {
        View view = this._card_progress_layer;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_card_progress_layer");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public final TextView m20604o0() {
        TextView textView = this._gift_count;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_gift_count");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p0 */
    public final TextView m20605p0() {
        TextView textView = this._gift_count_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_gift_count_title");
        return null;
    }

    /* JADX INFO: renamed from: p1 */
    public final void m20606p1(BLiveNewGiftWallDetailInfoItem data) {
        List<BLiveNewGiftWallGiftDetail> arrayList = new ArrayList<>();
        List<String> list = ((BLiveNewGiftWallTab) vwb.r(data.tabs, new w9j() { // from class: l.jps
            public final Object call(Object obj) {
                return pps.m20540Q((BLiveNewGiftWallTab) obj);
            }
        })).giftIds;
        list.getClass();
        List list2 = list;
        xdl0.M(m20618y0(), !list2.isEmpty());
        xdl0.M(m20619z0(), !list2.isEmpty());
        if (vwb.J(list2)) {
            return;
        }
        for (final String str : list) {
            final BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetailNew_ = BLiveNewGiftWallGiftDetail.new_();
            bLiveNewGiftWallGiftDetailNew_.gift = (BLiveNewGiftWallGift) vwb.r(data.gifts, new w9j() { // from class: l.kps
                public final Object call(Object obj) {
                    return pps.m20573q1(str, (BLiveNewGiftWallGift) obj);
                }
            });
            bLiveNewGiftWallGiftDetailNew_.category = (BLiveNewGiftWallCategory) vwb.r(data.categories, new w9j() { // from class: l.lps
                public final Object call(Object obj) {
                    return pps.m20575r1(bLiveNewGiftWallGiftDetailNew_, (BLiveNewGiftWallCategory) obj);
                }
            });
            arrayList = vwb.c(arrayList, bLiveNewGiftWallGiftDetailNew_);
            arrayList.getClass();
        }
        m20618y0().scrollToPosition(0);
        sms smsVar = this.newGiftAdapter;
        if (smsVar != null) {
            smsVar.m22581H(arrayList);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: q0 */
    public final RecyclerView m20607q0() {
        RecyclerView recyclerView = this._gift_list_recycler;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.r("_gift_list_recycler");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: r0 */
    public final TextView m20608r0() {
        TextView textView = this._gift_set_count;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_gift_set_count");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s0 */
    public final ImageView m20609s0() {
        ImageView imageView = this._gift_set_more;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_gift_set_more");
        return null;
    }

    /* JADX INFO: renamed from: s1 */
    public final void m20610s1(BLiveNewGiftWallDetailInfoItem data) {
        List<BLiveNewGiftWallGiftDetail> arrayList = new ArrayList<>();
        BLiveNewGiftWallTab bLiveNewGiftWallTab = (BLiveNewGiftWallTab) vwb.r(data.tabs, new w9j() { // from class: l.mps
            public final Object call(Object obj) {
                return pps.m20560d0((BLiveNewGiftWallTab) obj);
            }
        });
        if (bLiveNewGiftWallTab == null) {
            xdl0.M(m20578A0(), false);
            xdl0.M(m20579B0(), false);
            return;
        }
        List<String> list = bLiveNewGiftWallTab.giftIds;
        list.getClass();
        if (vwb.J(list)) {
            xdl0.M(m20578A0(), false);
            xdl0.M(m20579B0(), false);
            return;
        }
        xdl0.M(m20578A0(), true);
        xdl0.M(m20579B0(), true);
        for (final String str : list) {
            final BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetailNew_ = BLiveNewGiftWallGiftDetail.new_();
            BLiveNewGiftWallGift bLiveNewGiftWallGift = (BLiveNewGiftWallGift) vwb.r(data.gifts, new w9j() { // from class: l.nps
                public final Object call(Object obj) {
                    return pps.m20576t1(str, (BLiveNewGiftWallGift) obj);
                }
            });
            bLiveNewGiftWallGiftDetailNew_.gift = bLiveNewGiftWallGift;
            if (bLiveNewGiftWallGift != null) {
                BLiveNewGiftWallCategory bLiveNewGiftWallCategory = (BLiveNewGiftWallCategory) vwb.r(data.categories, new w9j() { // from class: l.ops
                    public final Object call(Object obj) {
                        return pps.m20577u1(bLiveNewGiftWallGiftDetailNew_, (BLiveNewGiftWallCategory) obj);
                    }
                });
                bLiveNewGiftWallGiftDetailNew_.category = bLiveNewGiftWallCategory;
                if (bLiveNewGiftWallCategory != null) {
                    arrayList = vwb.c(arrayList, bLiveNewGiftWallGiftDetailNew_);
                    arrayList.getClass();
                }
            }
        }
        m20578A0().scrollToPosition(0);
        sms smsVar = this.picksGiftAdapter;
        if (smsVar != null) {
            smsVar.m22581H(arrayList);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: t0 */
    public final TextView m20611t0() {
        TextView textView = this._gift_set_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_gift_set_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u0 */
    public final TextView m20612u0() {
        TextView textView = this._gift_skin_count;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_gift_skin_count");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v0 */
    public final ImageView m20613v0() {
        ImageView imageView = this._gift_skin_more;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_gift_skin_more");
        return null;
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: v1 */
    public final void m20614v1(@NotNull BLiveNewGiftWallDetailInfoItem data, @NotNull UserCardBean userCardBean) {
        data.getClass();
        userCardBean.getClass();
        this.info = data;
        mqv<User> mqvVar = userCardBean.profileData.f16959c;
        if (mqvVar != null) {
            m20587L0().setText(w8u.p(((User) mqvVar.a).name, 6));
            hxs.s("context_livingAct", m20583H0(), ((User) mqvVar.a).fp().profileSmall().formatted());
        }
        m20594T0(data);
        m20606p1(data);
        m20610s1(data);
        m20602m1(data);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo5219w() {
        super.mo5219w();
        sms smsVar = this.newGiftAdapter;
        if (smsVar != null) {
            smsVar.m22579F();
        }
        mms mmsVar = this.giftListAdapter;
        if (mmsVar != null) {
            mmsVar.m18086F();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: w0 */
    public final TextView m20615w0() {
        TextView textView = this._gift_skin_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_gift_skin_title");
        return null;
    }

    /* JADX INFO: renamed from: w1 */
    public final void m20616w1() {
        xdl0.E0(m20581E0(), new View.OnClickListener() { // from class: l.zos
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pps.m20530H(this.f23527a, view);
            }
        });
        xdl0.E0(m20617x0(), new View.OnClickListener() { // from class: l.hps
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pps.m20550X(this.f12213a, view);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: x0 */
    public final VImage m20617x0() {
        VImage vImage = this._help;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_help");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y0 */
    public final RecyclerView m20618y0() {
        RecyclerView recyclerView = this._new_gift_recycler;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.r("_new_gift_recycler");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z0 */
    public final TextView m20619z0() {
        TextView textView = this._new_gift_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_new_gift_title");
        return null;
    }
}
