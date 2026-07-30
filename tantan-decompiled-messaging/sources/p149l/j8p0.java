package p149l;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraData;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomProfile;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomAttributes;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.SvgAndImageView;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VirtualRoomInfoCoverItem;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VirtualRoomInfoTitleGradeItem;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VirtualRoomInfoTitleItem;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VoiceVirtualRoomInfoCheckInItem;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VoiceVirtualRoomInfoSwitchItem;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VoiceVirtualRoomInfoTagsItem;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VoiceVirtualRoomInfoTitleItem;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VScroll;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001b\u0010\fJ\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0014¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\"\u0010\u0010J\u000f\u0010#\u001a\u00020\nH\u0014¢\u0006\u0004\b#\u0010!J\u0015\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020$¢\u0006\u0004\b)\u0010'J\u0015\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020$¢\u0006\u0004\b+\u0010'J\u0015\u0010-\u001a\u00020\n2\u0006\u0010,\u001a\u00020$¢\u0006\u0004\b-\u0010'J\u0015\u0010.\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b.\u0010\u0014J\u0015\u00100\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u0011¢\u0006\u0004\b0\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010A\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\fR\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010e\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u00107\u001a\u0004\bc\u00109\"\u0004\bd\u0010;R\"\u0010i\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u00107\u001a\u0004\bg\u00109\"\u0004\bh\u0010;R\"\u0010q\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010u\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010l\u001a\u0004\bs\u0010n\"\u0004\bt\u0010pR\"\u0010y\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u00107\u001a\u0004\bw\u00109\"\u0004\bx\u0010;R\"\u0010|\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u00107\u001a\u0004\bz\u00109\"\u0004\b{\u0010;R\"\u0010\u007f\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010=\u001a\u0004\b}\u0010?\"\u0004\b~\u0010\fR*\u0010\u0087\u0001\u001a\u00030\u0080\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R&\u0010\u008b\u0001\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010l\u001a\u0005\b\u0089\u0001\u0010n\"\u0005\b\u008a\u0001\u0010pR&\u0010\u008f\u0001\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008c\u0001\u0010l\u001a\u0005\b\u008d\u0001\u0010n\"\u0005\b\u008e\u0001\u0010pR*\u0010\u0097\u0001\u001a\u00030\u0090\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R&\u0010\u009b\u0001\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0098\u0001\u0010l\u001a\u0005\b\u0099\u0001\u0010n\"\u0005\b\u009a\u0001\u0010pR*\u0010£\u0001\u001a\u00030\u009c\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R*\u0010«\u0001\u001a\u00030¤\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R*\u0010³\u0001\u001a\u00030¬\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R*\u0010·\u0001\u001a\u00030\u009c\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b´\u0001\u0010\u009e\u0001\u001a\u0006\bµ\u0001\u0010 \u0001\"\u0006\b¶\u0001\u0010¢\u0001R*\u0010¿\u0001\u001a\u00030¸\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R*\u0010Ã\u0001\u001a\u00030¸\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÀ\u0001\u0010º\u0001\u001a\u0006\bÁ\u0001\u0010¼\u0001\"\u0006\bÂ\u0001\u0010¾\u0001R*\u0010Ç\u0001\u001a\u00030¸\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÄ\u0001\u0010º\u0001\u001a\u0006\bÅ\u0001\u0010¼\u0001\"\u0006\bÆ\u0001\u0010¾\u0001R*\u0010Ë\u0001\u001a\u00030¸\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÈ\u0001\u0010º\u0001\u001a\u0006\bÉ\u0001\u0010¼\u0001\"\u0006\bÊ\u0001\u0010¾\u0001R*\u0010Ï\u0001\u001a\u00030¸\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÌ\u0001\u0010º\u0001\u001a\u0006\bÍ\u0001\u0010¼\u0001\"\u0006\bÎ\u0001\u0010¾\u0001R*\u0010Ó\u0001\u001a\u00030\u009c\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÐ\u0001\u0010\u009e\u0001\u001a\u0006\bÑ\u0001\u0010 \u0001\"\u0006\bÒ\u0001\u0010¢\u0001R*\u0010×\u0001\u001a\u00030\u009c\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÔ\u0001\u0010\u009e\u0001\u001a\u0006\bÕ\u0001\u0010 \u0001\"\u0006\bÖ\u0001\u0010¢\u0001R*\u0010ß\u0001\u001a\u00030Ø\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÙ\u0001\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001\"\u0006\bÝ\u0001\u0010Þ\u0001R&\u0010ã\u0001\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bà\u0001\u0010l\u001a\u0005\bá\u0001\u0010n\"\u0005\bâ\u0001\u0010pR\u001b\u0010æ\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u001b\u0010é\u0001\u001a\u0005\u0018\u00010ç\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000b\u0010è\u0001¨\u0006ê\u0001"}, m87232d2 = {"Ll/j8p0;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/g9p0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/g9p0;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "R", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveExtraData;", "roomInfo", "E0", "(Lcom/p1/mobile/putong/live/base/data/BLiveExtraData;)V", "", "remindType", "A0", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", j6f.LATITUDE_SOUTH, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "m", "inflateView", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", BaseSei.f13930X, "()V", "p0", "w", "", "isOpen", "H0", "(Z)V", "isPersonal", "z0", "freeSettle", "y0", "checked", "K0", "I0", "groupCategory", "J0", "k", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroidx/constraintlayout/widget/ConstraintLayout;", BLiveStormDanmakuGiftResourceType.f44444l, "Landroidx/constraintlayout/widget/ConstraintLayout;", "j0", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_root", "Landroid/view/View;", "n0", "()Landroid/view/View;", "set_top_bg", "_top_bg", "Lv/VScroll;", "n", "Lv/VScroll;", "k0", "()Lv/VScroll;", "set_scroll_view", "(Lv/VScroll;)V", "_scroll_view", "Landroid/widget/LinearLayout;", "o", "Landroid/widget/LinearLayout;", "get_switch_container", "()Landroid/widget/LinearLayout;", "set_switch_container", "(Landroid/widget/LinearLayout;)V", "_switch_container", "Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VirtualRoomInfoCoverItem;", "p", "Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VirtualRoomInfoCoverItem;", j6f.GPS_MEASUREMENT_INTERRUPTED, "()Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VirtualRoomInfoCoverItem;", "set_cover_item", "(Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VirtualRoomInfoCoverItem;)V", "_cover_item", "Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VirtualRoomInfoTitleItem;", "q", "Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VirtualRoomInfoTitleItem;", "f0", "()Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VirtualRoomInfoTitleItem;", "set_name_item", "(Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VirtualRoomInfoTitleItem;)V", "_name_item", "r", "get_notice_item", "set_notice_item", "_notice_item", BLiveStormDanmakuGiftResourceType.f44446s, "get_notice_item_root", "set_notice_item_root", "_notice_item_root", "Landroid/widget/TextView;", Constants.KEY_T, "Landroid/widget/TextView;", "get_notice_item_announce_title", "()Landroid/widget/TextView;", "set_notice_item_announce_title", "(Landroid/widget/TextView;)V", "_notice_item_announce_title", "u", "g0", "set_notice_item_announce_content", "_notice_item_announce_content", ResourceDirection.f38808v, "get_hot_item", "set_hot_item", "_hot_item", "get_hot_item_root", "set_hot_item_root", "_hot_item_root", "a0", "set_hot_item_host_bg", "_hot_item_host_bg", "Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/SvgAndImageView;", BaseSei.f13931Y, "Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/SvgAndImageView;", "c0", "()Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/SvgAndImageView;", "set_hot_item_iv_hot", "(Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/SvgAndImageView;)V", "_hot_item_iv_hot", BaseSei.f13932Z, "get_hot_item_hot_title", "set_hot_item_hot_title", "_hot_item_hot_title", "A", "b0", "set_hot_item_hot_desc", "_hot_item_hot_desc", "Lv/VImage;", "B", "Lv/VImage;", "get_hot_item_go_arrow", "()Lv/VImage;", "set_hot_item_go_arrow", "(Lv/VImage;)V", "_hot_item_go_arrow", b2s.C_ZONE, "get_hot_item_debugText", "set_hot_item_debugText", "_hot_item_debugText", "Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoTitleItem;", "D", "Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoTitleItem;", "Y", "()Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoTitleItem;", "set_group_category", "(Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoTitleItem;)V", "_group_category", "Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoTagsItem;", "E", "Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoTagsItem;", "Z", "()Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoTagsItem;", "set_group_tags", "(Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoTagsItem;)V", "_group_tags", "Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoCheckInItem;", "F", "Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoCheckInItem;", "U", "()Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoCheckInItem;", "set_check_in_view", "(Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoCheckInItem;)V", "_check_in_view", "G", "e0", "set_message_remind", "_message_remind", "Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoSwitchItem;", "H", "Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoSwitchItem;", "o0", "()Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoSwitchItem;", "set_top_caht_switch", "(Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoSwitchItem;)V", "_top_caht_switch", "I", "m0", "set_settle_free_switch", "_settle_free_switch", "J", j6f.GPS_DIRECTION_TRUE, "set_call_switch", "_call_switch", "K", "h0", "set_personal_room_switch", "_personal_room_switch", "L", "X", "set_gift_effect_switch", "_gift_effect_switch", "M", "l0", "set_set_room_bg", "_set_room_bg", "N", "i0", "set_privilege", "_privilege", "Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VirtualRoomInfoTitleGradeItem;", BloodType.f38728O, "Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VirtualRoomInfoTitleGradeItem;", "d0", "()Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VirtualRoomInfoTitleGradeItem;", "set_info_item", "(Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VirtualRoomInfoTitleGradeItem;)V", "_info_item", "P", "W", "set_float_btn", "_float_btn", "Q", "Lcom/p1/mobile/putong/live/base/data/BLiveExtraData;", "currentRoomInfo", "Landroid/app/Dialog;", "Landroid/app/Dialog;", "messageRemindDialog", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class j8p0 extends LiveMenuDialogHolder<g9p0> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public TextView _hot_item_hot_desc;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public VImage _hot_item_go_arrow;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public TextView _hot_item_debugText;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public VoiceVirtualRoomInfoTitleItem _group_category;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public VoiceVirtualRoomInfoTagsItem _group_tags;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public VoiceVirtualRoomInfoCheckInItem _check_in_view;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public VoiceVirtualRoomInfoTitleItem _message_remind;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public VoiceVirtualRoomInfoSwitchItem _top_caht_switch;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public VoiceVirtualRoomInfoSwitchItem _settle_free_switch;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public VoiceVirtualRoomInfoSwitchItem _call_switch;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public VoiceVirtualRoomInfoSwitchItem _personal_room_switch;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public VoiceVirtualRoomInfoSwitchItem _gift_effect_switch;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public VoiceVirtualRoomInfoTitleItem _set_room_bg;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public VoiceVirtualRoomInfoTitleItem _privilege;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public VirtualRoomInfoTitleGradeItem _info_item;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public TextView _float_btn;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @Nullable
    public BLiveExtraData currentRoomInfo;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @Nullable
    public Dialog messageRemindDialog;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public ConstraintLayout _root;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public View _top_bg;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VScroll _scroll_view;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public LinearLayout _switch_container;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VirtualRoomInfoCoverItem _cover_item;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VirtualRoomInfoTitleItem _name_item;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public ConstraintLayout _notice_item;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public ConstraintLayout _notice_item_root;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public TextView _notice_item_announce_title;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public TextView _notice_item_announce_content;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public ConstraintLayout _hot_item;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public ConstraintLayout _hot_item_root;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public View _hot_item_host_bg;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public SvgAndImageView _hot_item_iv_hot;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public TextView _hot_item_hot_title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8p0(@NotNull Act act, @NotNull g9p0 g9p0Var) {
        super(t6c0.f168335eb, act, g9p0Var, j2g0.m139456c(0.3f));
        act.getClass();
        g9p0Var.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: B0 */
    public static final void m140276B0(j8p0 j8p0Var, View view) {
        Dialog dialog = j8p0Var.messageRemindDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public static final void m140277D0(j8p0 j8p0Var, View view, RadioGroup radioGroup, int i) {
        radioGroup.getClass();
        if (i == g5c0.f100908d5) {
            ((g9p0) j8p0Var.f47757b).m124830x4("all");
            xdl0.m208360X(view, t100.m186890d(22.0f));
            return;
        }
        if (i == g5c0.f100948h5) {
            ((g9p0) j8p0Var.f47757b).m124830x4("settledMember");
            xdl0.m208360X(view, t100.m186890d(78.0f));
        } else if (i == g5c0.f100928f5) {
            ((g9p0) j8p0Var.f47757b).m124830x4("friend");
            xdl0.m208360X(view, t100.m186890d(134.0f));
        } else if (i == g5c0.f100938g5) {
            ((g9p0) j8p0Var.f47757b).m124830x4("none");
            xdl0.m208360X(view, t100.m186890d(190.0f));
        }
    }

    /* JADX INFO: renamed from: G0 */
    public static final void m140280G0(j8p0 j8p0Var, BLiveExtraData bLiveExtraData, View view) {
        ((g9p0) j8p0Var.f47757b).m124828v4(bLiveExtraData);
    }

    /* JADX INFO: renamed from: M */
    public static void m140286M(j8p0 j8p0Var, VScroll vScroll, int i, int i2, int i3, int i4) {
        j8p0Var.m140317d0().m77493k0(vScroll.getScrollY());
    }

    /* JADX INFO: renamed from: q0 */
    public static final void m140291q0(j8p0 j8p0Var, BLiveExtraData bLiveExtraData, View view) {
        view.getClass();
        ((g9p0) j8p0Var.f47757b).m124827u4(bLiveExtraData);
    }

    /* JADX INFO: renamed from: r0 */
    public static final void m140292r0(BLiveExtraData bLiveExtraData, j8p0 j8p0Var, View view) {
        String str = bLiveExtraData.voiceRoomProfile.identity;
        str.getClass();
        if (q4p0.m172949a(str)) {
            ((g9p0) j8p0Var.f47757b).m124826t4(bLiveExtraData);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static final void m140293s0(j8p0 j8p0Var, View view) {
        ((g9p0) j8p0Var.f47757b).m124833z4();
    }

    /* JADX INFO: renamed from: t0 */
    public static final void m140294t0(j8p0 j8p0Var, View view) {
        ((g9p0) j8p0Var.f47757b).m124832y4();
    }

    /* JADX INFO: renamed from: u0 */
    public static final void m140295u0(j8p0 j8p0Var, BLiveExtraData bLiveExtraData, View view) {
        String str = bLiveExtraData.voiceRoomProfile.remindType;
        str.getClass();
        j8p0Var.m140299A0(str);
    }

    /* JADX INFO: renamed from: v0 */
    public static final void m140296v0(j8p0 j8p0Var, View view) {
        ((g9p0) j8p0Var.f47757b).m124825r4();
    }

    /* JADX INFO: renamed from: w0 */
    public static final void m140297w0(j8p0 j8p0Var, View view) {
        ((g9p0) j8p0Var.f47757b).m124823p4();
    }

    /* JADX INFO: renamed from: x0 */
    public static final void m140298x0(j8p0 j8p0Var, View view) {
        ((g9p0) j8p0Var.f47757b).m124822o4();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x007d  */
    /* JADX INFO: renamed from: A0 */
    public final void m140299A0(String remindType) {
        int i;
        if (this.messageRemindDialog == null) {
            this.messageRemindDialog = new byr(this.f47757b, t6c0.f168283ab, j2g0.m139456c(0.3f));
        }
        Dialog dialog = this.messageRemindDialog;
        if (dialog != null) {
            dialog.show();
            xdl0.m208329E0(dialog.findViewById(g5c0.f100638A), new View.OnClickListener() { // from class: l.i8p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j8p0.m140276B0(this.f112062a, view);
                }
            });
            final View viewFindViewById = dialog.findViewById(g5c0.f100662C5);
            ((RadioGroup) dialog.findViewById(g5c0.f100918e5)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: l.y7p0
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                    j8p0.m140277D0(this.f196721a, viewFindViewById, radioGroup, i2);
                }
            });
            RadioGroup radioGroup = (RadioGroup) dialog.findViewById(g5c0.f100918e5);
            switch (remindType) {
                case "friend":
                    i = g5c0.f100928f5;
                    break;
                case "all":
                    i = g5c0.f100908d5;
                    break;
                case "none":
                    i = g5c0.f100938g5;
                    break;
                case "settledMember":
                    i = g5c0.f100948h5;
                    break;
                default:
                    i = -1;
                    break;
            }
            radioGroup.check(i);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        Context context = m140323j0().getContext();
        context.getClass();
        return context;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    /* JADX INFO: renamed from: E0 */
    public final void m140300E0(final BLiveExtraData roomInfo) {
        boolean z;
        String str;
        vji0 vji0Var = new vji0(m140320g0());
        String str2 = roomInfo.voiceRoomProfile.identity;
        str2.getClass();
        if (q4p0.m172949a(str2)) {
            z = true;
        } else {
            String str3 = roomInfo.voiceRoomProfile.identity;
            str3.getClass();
            if (q4p0.m172950b(str3)) {
                z = true;
            } else {
                z = false;
            }
        }
        if (TextUtils.isEmpty(roomInfo.voiceRoomProfile.announcement)) {
            str = z ? "介绍本群规则和玩法，让更多人参与进来" : "欢迎加入房间，和大家一起聊天吧！";
        } else {
            str = roomInfo.voiceRoomProfile.announcement;
            str.getClass();
        }
        vji0Var.m198665m(str);
        vji0Var.m198666n("查看更多");
        if (z) {
            if (BLiveVoiceRoomProfile.isStatePending(roomInfo.voiceRoomProfile.announcementStatus)) {
                vji0Var.m198666n("审核中");
            } else {
                vji0Var.m198666n("编辑公告");
            }
        }
        vji0Var.m198667o(2);
        vji0Var.m198664l(true);
        CharSequence suffix = vji0Var.getSuffix();
        if (suffix != null) {
            vji0Var.m198668p(0, suffix.length(), h1c0.f105394p0, new View.OnClickListener() { // from class: l.z7p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j8p0.m140280G0(this.f202046a, roomInfo, view);
                }
            });
        }
        vji0Var.m198658e(false);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m140301H0(boolean isOpen) {
        m140307T().setSwitchOn(isOpen);
        BLiveExtraData bLiveExtraData = this.currentRoomInfo;
        if (bLiveExtraData != null) {
            bLiveExtraData.voiceRoomProfile.freeCall = isOpen;
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final void m140302I0(@NotNull String remindType) {
        remindType.getClass();
        BLiveExtraData bLiveExtraData = this.currentRoomInfo;
        if (bLiveExtraData != null) {
            bLiveExtraData.voiceRoomProfile.remindType = remindType;
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m140303J0(@NotNull String groupCategory) {
        groupCategory.getClass();
        BLiveExtraData bLiveExtraData = this.currentRoomInfo;
        if (bLiveExtraData != null) {
            bLiveExtraData.voiceRoomProfile.roomClass.name = groupCategory;
        }
        m140312Y().setContent(groupCategory);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m140304K0(boolean checked) {
        m140328o0().setSwitchOn(checked);
        BLiveExtraData bLiveExtraData = this.currentRoomInfo;
        if (bLiveExtraData != null) {
            bLiveExtraData.voiceRoomProfile.stick = checked;
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m140305R(View view) {
        h9p0.m130028a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final View m140306S(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM130029b = h9p0.m130029b(this, inflater, parent);
        viewM130029b.getClass();
        return viewM130029b;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final VoiceVirtualRoomInfoSwitchItem m140307T() {
        VoiceVirtualRoomInfoSwitchItem voiceVirtualRoomInfoSwitchItem = this._call_switch;
        if (voiceVirtualRoomInfoSwitchItem != null) {
            return voiceVirtualRoomInfoSwitchItem;
        }
        Intrinsics.m87502r("_call_switch");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final VoiceVirtualRoomInfoCheckInItem m140308U() {
        VoiceVirtualRoomInfoCheckInItem voiceVirtualRoomInfoCheckInItem = this._check_in_view;
        if (voiceVirtualRoomInfoCheckInItem != null) {
            return voiceVirtualRoomInfoCheckInItem;
        }
        Intrinsics.m87502r("_check_in_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VirtualRoomInfoCoverItem m140309V() {
        VirtualRoomInfoCoverItem virtualRoomInfoCoverItem = this._cover_item;
        if (virtualRoomInfoCoverItem != null) {
            return virtualRoomInfoCoverItem;
        }
        Intrinsics.m87502r("_cover_item");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final TextView m140310W() {
        TextView textView = this._float_btn;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_float_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final VoiceVirtualRoomInfoSwitchItem m140311X() {
        VoiceVirtualRoomInfoSwitchItem voiceVirtualRoomInfoSwitchItem = this._gift_effect_switch;
        if (voiceVirtualRoomInfoSwitchItem != null) {
            return voiceVirtualRoomInfoSwitchItem;
        }
        Intrinsics.m87502r("_gift_effect_switch");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final VoiceVirtualRoomInfoTitleItem m140312Y() {
        VoiceVirtualRoomInfoTitleItem voiceVirtualRoomInfoTitleItem = this._group_category;
        if (voiceVirtualRoomInfoTitleItem != null) {
            return voiceVirtualRoomInfoTitleItem;
        }
        Intrinsics.m87502r("_group_category");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VoiceVirtualRoomInfoTagsItem m140313Z() {
        VoiceVirtualRoomInfoTagsItem voiceVirtualRoomInfoTagsItem = this._group_tags;
        if (voiceVirtualRoomInfoTagsItem != null) {
            return voiceVirtualRoomInfoTagsItem;
        }
        Intrinsics.m87502r("_group_tags");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final View m140314a0() {
        View view = this._hot_item_host_bg;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_hot_item_host_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final TextView m140315b0() {
        TextView textView = this._hot_item_hot_desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_hot_item_hot_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final SvgAndImageView m140316c0() {
        SvgAndImageView svgAndImageView = this._hot_item_iv_hot;
        if (svgAndImageView != null) {
            return svgAndImageView;
        }
        Intrinsics.m87502r("_hot_item_iv_hot");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final VirtualRoomInfoTitleGradeItem m140317d0() {
        VirtualRoomInfoTitleGradeItem virtualRoomInfoTitleGradeItem = this._info_item;
        if (virtualRoomInfoTitleGradeItem != null) {
            return virtualRoomInfoTitleGradeItem;
        }
        Intrinsics.m87502r("_info_item");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final VoiceVirtualRoomInfoTitleItem m140318e0() {
        VoiceVirtualRoomInfoTitleItem voiceVirtualRoomInfoTitleItem = this._message_remind;
        if (voiceVirtualRoomInfoTitleItem != null) {
            return voiceVirtualRoomInfoTitleItem;
        }
        Intrinsics.m87502r("_message_remind");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final VirtualRoomInfoTitleItem m140319f0() {
        VirtualRoomInfoTitleItem virtualRoomInfoTitleItem = this._name_item;
        if (virtualRoomInfoTitleItem != null) {
            return virtualRoomInfoTitleItem;
        }
        Intrinsics.m87502r("_name_item");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final TextView m140320g0() {
        TextView textView = this._notice_item_announce_content;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_notice_item_announce_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final VoiceVirtualRoomInfoSwitchItem m140321h0() {
        VoiceVirtualRoomInfoSwitchItem voiceVirtualRoomInfoSwitchItem = this._personal_room_switch;
        if (voiceVirtualRoomInfoSwitchItem != null) {
            return voiceVirtualRoomInfoSwitchItem;
        }
        Intrinsics.m87502r("_personal_room_switch");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final VoiceVirtualRoomInfoTitleItem m140322i0() {
        VoiceVirtualRoomInfoTitleItem voiceVirtualRoomInfoTitleItem = this._privilege;
        if (voiceVirtualRoomInfoTitleItem != null) {
            return voiceVirtualRoomInfoTitleItem;
        }
        Intrinsics.m87502r("_privilege");
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent) {
        inflater.getClass();
        parent.getClass();
        return m140306S(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final ConstraintLayout m140323j0() {
        ConstraintLayout constraintLayout = this._root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k0 */
    public final VScroll m140324k0() {
        VScroll vScroll = this._scroll_view;
        if (vScroll != null) {
            return vScroll;
        }
        Intrinsics.m87502r("_scroll_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public final VoiceVirtualRoomInfoTitleItem m140325l0() {
        VoiceVirtualRoomInfoTitleItem voiceVirtualRoomInfoTitleItem = this._set_room_bg;
        if (voiceVirtualRoomInfoTitleItem != null) {
            return voiceVirtualRoomInfoTitleItem;
        }
        Intrinsics.m87502r("_set_room_bg");
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(@NotNull View view) {
        view.getClass();
        super.mo71836m(view);
        xdl0.m208325C0(view, xdl0.m208408w0());
        m140305R(view);
        m140324k0().m223193d(new VScroll.InterfaceC22566a() { // from class: l.x7p0
            @Override // p147v.VScroll.InterfaceC22566a
            /* JADX INFO: renamed from: a */
            public final void mo43191a(VScroll vScroll, int i, int i2, int i3, int i4) {
                j8p0.m140286M(this.f191371a, vScroll, i, i2, i3, i4);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final VoiceVirtualRoomInfoSwitchItem m140326m0() {
        VoiceVirtualRoomInfoSwitchItem voiceVirtualRoomInfoSwitchItem = this._settle_free_switch;
        if (voiceVirtualRoomInfoSwitchItem != null) {
            return voiceVirtualRoomInfoSwitchItem;
        }
        Intrinsics.m87502r("_settle_free_switch");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n0 */
    public final View m140327n0() {
        View view = this._top_bg;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_top_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public final VoiceVirtualRoomInfoSwitchItem m140328o0() {
        VoiceVirtualRoomInfoSwitchItem voiceVirtualRoomInfoSwitchItem = this._top_caht_switch;
        if (voiceVirtualRoomInfoSwitchItem != null) {
            return voiceVirtualRoomInfoSwitchItem;
        }
        Intrinsics.m87502r("_top_caht_switch");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0182  */
    /* JADX INFO: renamed from: p0 */
    public final void m140329p0(@NotNull final BLiveExtraData roomInfo) {
        roomInfo.getClass();
        this.currentRoomInfo = roomInfo;
        if (roomInfo != null) {
            xdl0.m208329E0(m140314a0(), new View.OnClickListener() { // from class: l.a8p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j8p0.m140291q0(this.f68063a, roomInfo, view);
                }
            });
            m140315b0().setText(roomInfo.voiceRoomProfile.heatTitle);
            SvgAndImageView svgAndImageViewM140316c0 = m140316c0();
            BLiveVoiceRoomProfile bLiveVoiceRoomProfile = roomInfo.voiceRoomProfile;
            svgAndImageViewM140316c0.m77478e(bLiveVoiceRoomProfile.heatIcon, bLiveVoiceRoomProfile.heatSvga);
            m140317d0().m77494l0(roomInfo, (s7p0) this.f47757b);
            m140319f0().m77500f(roomInfo, (s7p0) this.f47757b);
            m140309V().m77488c(roomInfo, (g9p0) this.f47757b);
            if (!TextUtils.isEmpty(roomInfo.voiceRoomProfile.levelBgStartColor) && !TextUtils.isEmpty(roomInfo.voiceRoomProfile.levelBgEndColor)) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                float f = t100.f167268q;
                gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
                gradientDrawable.setColors(new int[]{kvc0.m147358g(roomInfo.voiceRoomProfile.levelBgStartColor), kvc0.m147358g(roomInfo.voiceRoomProfile.levelBgEndColor)});
                m140327n0().setBackground(gradientDrawable);
                m140317d0().f52739f.setBackground(gradientDrawable);
            }
            m140300E0(roomInfo);
            VoiceVirtualRoomInfoCheckInItem voiceVirtualRoomInfoCheckInItemM140308U = m140308U();
            T t = this.f47757b;
            t.getClass();
            voiceVirtualRoomInfoCheckInItemM140308U.m77512l0(roomInfo, (s7p0) t);
            VoiceVirtualRoomInfoTitleItem voiceVirtualRoomInfoTitleItemM140312Y = m140312Y();
            String str = roomInfo.voiceRoomProfile.roomClass.name;
            str.getClass();
            voiceVirtualRoomInfoTitleItemM140312Y.m77531j0("房间分类", str, new View.OnClickListener() { // from class: l.b8p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j8p0.m140292r0(roomInfo, this, view);
                }
            });
            m140325l0().m77530i0("设置背景图片", new View.OnClickListener() { // from class: l.c8p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j8p0.m140293s0(this.f79779a, view);
                }
            });
            m140322i0().m77530i0("隐私权限设置", new View.OnClickListener() { // from class: l.d8p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j8p0.m140294t0(this.f84885a, view);
                }
            });
            m140318e0().m77530i0("设置消息提醒范围", new View.OnClickListener() { // from class: l.e8p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j8p0.m140295u0(this.f89854a, roomInfo, view);
                }
            });
            VoiceVirtualRoomInfoSwitchItem voiceVirtualRoomInfoSwitchItemM140328o0 = m140328o0();
            boolean z = roomInfo.voiceRoomProfile.stick;
            T t2 = this.f47757b;
            t2.getClass();
            voiceVirtualRoomInfoSwitchItemM140328o0.m77525t0(z, (s7p0) t2);
            VoiceVirtualRoomInfoSwitchItem voiceVirtualRoomInfoSwitchItemM140307T = m140307T();
            boolean z2 = roomInfo.voiceRoomProfile.freeCall;
            T t3 = this.f47757b;
            t3.getClass();
            voiceVirtualRoomInfoSwitchItemM140307T.m77521o0(z2, (s7p0) t3);
            VoiceVirtualRoomInfoSwitchItem voiceVirtualRoomInfoSwitchItemM140311X = m140311X();
            Boolean bool = ((hdv) ypv.m215673l(fld0.f98150e)).f107303i.get();
            bool.getClass();
            boolean zBooleanValue = bool.booleanValue();
            T t4 = this.f47757b;
            t4.getClass();
            voiceVirtualRoomInfoSwitchItemM140311X.m77523q0(zBooleanValue, (s7p0) t4);
            String str2 = roomInfo.voiceRoomProfile.identity;
            str2.getClass();
            if (q4p0.m172949a(str2)) {
                xdl0.m208344M(m140321h0(), true);
                xdl0.m208344M(m140326m0(), true);
                xdl0.m208344M(m140307T(), true);
                xdl0.m208344M(m140321h0(), roomInfo.voiceRoomProfile.canOpenPersonal);
                VoiceVirtualRoomInfoSwitchItem voiceVirtualRoomInfoSwitchItemM140321h0 = m140321h0();
                T t5 = this.f47757b;
                t5.getClass();
                voiceVirtualRoomInfoSwitchItemM140321h0.m77524r0(roomInfo, (s7p0) t5);
                VoiceVirtualRoomInfoSwitchItem voiceVirtualRoomInfoSwitchItemM140326m0 = m140326m0();
                T t6 = this.f47757b;
                t6.getClass();
                voiceVirtualRoomInfoSwitchItemM140326m0.m77522p0(roomInfo, (s7p0) t6);
                xdl0.m208344M(m140325l0(), true);
            } else {
                String str3 = roomInfo.voiceRoomProfile.identity;
                str3.getClass();
                if (q4p0.m172950b(str3)) {
                    xdl0.m208344M(m140321h0(), true);
                    xdl0.m208344M(m140326m0(), true);
                    xdl0.m208344M(m140307T(), true);
                    xdl0.m208344M(m140321h0(), roomInfo.voiceRoomProfile.canOpenPersonal);
                    VoiceVirtualRoomInfoSwitchItem voiceVirtualRoomInfoSwitchItemM140321h1 = m140321h0();
                    T t7 = this.f47757b;
                    t7.getClass();
                    voiceVirtualRoomInfoSwitchItemM140321h1.m77524r0(roomInfo, (s7p0) t7);
                    VoiceVirtualRoomInfoSwitchItem voiceVirtualRoomInfoSwitchItemM140326m1 = m140326m0();
                    T t8 = this.f47757b;
                    t8.getClass();
                    voiceVirtualRoomInfoSwitchItemM140326m1.m77522p0(roomInfo, (s7p0) t8);
                    xdl0.m208344M(m140325l0(), true);
                } else {
                    xdl0.m208344M(m140307T(), false);
                    xdl0.m208344M(m140321h0(), false);
                    xdl0.m208344M(m140326m0(), false);
                    xdl0.m208344M(m140325l0(), false);
                }
            }
            String str4 = roomInfo.voiceRoomProfile.identity;
            str4.getClass();
            if (q4p0.m172949a(str4)) {
                m140310W().setText("解散群组");
                xdl0.m208329E0(m140310W(), new View.OnClickListener() { // from class: l.f8p0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        j8p0.m140296v0(this.f96394a, view);
                    }
                });
            } else if (roomInfo.voiceRoomProfile.isSettled) {
                m140310W().setText("取消入驻");
                xdl0.m208329E0(m140310W(), new View.OnClickListener() { // from class: l.g8p0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        j8p0.m140297w0(this.f101512a, view);
                    }
                });
            } else {
                m140310W().setText("申请入驻");
                xdl0.m208329E0(m140310W(), new View.OnClickListener() { // from class: l.h8p0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        j8p0.m140298x0(this.f106457a, view);
                    }
                });
            }
            xdl0.m208344M(m140328o0(), roomInfo.voiceRoomProfile.isSettled);
            VoiceVirtualRoomInfoTitleItem voiceVirtualRoomInfoTitleItemM140312Y2 = m140312Y();
            String str5 = roomInfo.voiceRoomProfile.identity;
            str5.getClass();
            voiceVirtualRoomInfoTitleItemM140312Y2.setArrowVisible(q4p0.m172949a(str5));
            List<BLiveVoiceVirtualRoomAttributes> list = roomInfo.voiceRoomProfile.roomAttributes;
            xdl0.m208344M(m140313Z(), list != null && list.size() > 0);
            VoiceVirtualRoomInfoTagsItem voiceVirtualRoomInfoTagsItemM140313Z = m140313Z();
            list.getClass();
            voiceVirtualRoomInfoTagsItemM140313Z.m77528b(list);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo71841w() {
        super.mo71841w();
        m140308U().m77510b();
        m140317d0().m77490b();
        m140320g0().setText("");
        m140307T().m77526u0();
        m140328o0().m77526u0();
        m140311X().m77526u0();
        m140321h0().m77526u0();
        m140326m0().m77526u0();
        m140316c0().m77474a();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: x */
    public void mo71842x() {
        super.mo71842x();
        m140317d0().m77492j0();
    }

    /* JADX INFO: renamed from: y0 */
    public final void m140330y0(boolean freeSettle) {
        m140326m0().setSwitchOn(freeSettle);
        BLiveExtraData bLiveExtraData = this.currentRoomInfo;
        if (bLiveExtraData != null) {
            bLiveExtraData.voiceRoomProfile.freeSettle = freeSettle;
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m140331z0(boolean isPersonal) {
        m140321h0().setSwitchOn(isPersonal);
        BLiveExtraData bLiveExtraData = this.currentRoomInfo;
        if (bLiveExtraData != null) {
            bLiveExtraData.voiceRoomProfile.isPersonal = isPersonal;
        }
    }
}
