package p002l;

import android.annotation.SuppressLint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveGiftFiveStarView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveGiftWallSkinSelectItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallCategory;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallDetailInfoItem;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallInteract;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallInteractTextItem;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallSkin;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallUser;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import l.hxs;
import l.kvc0;
import l.mep0;
import l.t100;
import l.vwb;
import l.w8u;
import l.w9j;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\bQ\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001d\u0010\fJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010\u001fJ\u0015\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\"\u00104\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010\fR\"\u00107\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u00100\u001a\u0004\b5\u00102\"\u0004\b6\u0010\fR\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010J\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010:\u001a\u0004\bH\u0010<\"\u0004\bI\u0010>R\"\u0010N\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010:\u001a\u0004\bL\u0010<\"\u0004\bM\u0010>R\"\u0010U\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010]\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010a\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010:\u001a\u0004\b_\u0010<\"\u0004\b`\u0010>R\"\u0010i\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010m\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010B\u001a\u0004\bk\u0010D\"\u0004\bl\u0010FR\"\u0010u\u001a\u00020n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010y\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010:\u001a\u0004\bw\u0010<\"\u0004\bx\u0010>R\"\u0010}\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bz\u0010B\u001a\u0004\b{\u0010D\"\u0004\b|\u0010FR$\u0010\u0081\u0001\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b~\u0010B\u001a\u0004\b\u007f\u0010D\"\u0005\b\u0080\u0001\u0010FR&\u0010\u0085\u0001\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0082\u0001\u00100\u001a\u0005\b\u0083\u0001\u00102\"\u0005\b\u0084\u0001\u0010\fR&\u0010\u0089\u0001\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010B\u001a\u0005\b\u0087\u0001\u0010D\"\u0005\b\u0088\u0001\u0010FR&\u0010\u008d\u0001\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010:\u001a\u0005\b\u008b\u0001\u0010<\"\u0005\b\u008c\u0001\u0010>R&\u0010\u0091\u0001\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010:\u001a\u0005\b\u008f\u0001\u0010<\"\u0005\b\u0090\u0001\u0010>R&\u0010\u0095\u0001\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010:\u001a\u0005\b\u0093\u0001\u0010<\"\u0005\b\u0094\u0001\u0010>R&\u0010\u0099\u0001\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0096\u0001\u0010:\u001a\u0005\b\u0097\u0001\u0010<\"\u0005\b\u0098\u0001\u0010>R&\u0010\u009d\u0001\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009a\u0001\u0010:\u001a\u0005\b\u009b\u0001\u0010<\"\u0005\b\u009c\u0001\u0010>R&\u0010¡\u0001\u001a\u00020n8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009e\u0001\u0010p\u001a\u0005\b\u009f\u0001\u0010r\"\u0005\b \u0001\u0010tR&\u0010¥\u0001\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¢\u0001\u0010B\u001a\u0005\b£\u0001\u0010D\"\u0005\b¤\u0001\u0010FR&\u0010©\u0001\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¦\u0001\u00100\u001a\u0005\b§\u0001\u00102\"\u0005\b¨\u0001\u0010\fR&\u0010\u00ad\u0001\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bª\u0001\u0010:\u001a\u0005\b«\u0001\u0010<\"\u0005\b¬\u0001\u0010>R&\u0010±\u0001\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b®\u0001\u0010:\u001a\u0005\b¯\u0001\u0010<\"\u0005\b°\u0001\u0010>R&\u0010µ\u0001\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b²\u0001\u0010:\u001a\u0005\b³\u0001\u0010<\"\u0005\b´\u0001\u0010>R&\u0010¹\u0001\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¶\u0001\u0010:\u001a\u0005\b·\u0001\u0010<\"\u0005\b¸\u0001\u0010>R%\u0010¼\u0001\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u000b\u0010:\u001a\u0005\bº\u0001\u0010<\"\u0005\b»\u0001\u0010>R%\u0010¿\u0001\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\bY\u0010B\u001a\u0005\b½\u0001\u0010D\"\u0005\b¾\u0001\u0010FR)\u0010Æ\u0001\u001a\u00030À\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b5\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0006\bÄ\u0001\u0010Å\u0001R*\u0010Ê\u0001\u001a\u00030À\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÇ\u0001\u0010Á\u0001\u001a\u0006\bÈ\u0001\u0010Ã\u0001\"\u0006\bÉ\u0001\u0010Å\u0001R)\u0010Í\u0001\u001a\u00030À\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bq\u0010Á\u0001\u001a\u0006\bË\u0001\u0010Ã\u0001\"\u0006\bÌ\u0001\u0010Å\u0001R&\u0010Ð\u0001\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009f\u0001\u0010B\u001a\u0005\bÎ\u0001\u0010D\"\u0005\bÏ\u0001\u0010FR%\u0010Ò\u0001\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\be\u0010B\u001a\u0005\bÇ\u0001\u0010D\"\u0005\bÑ\u0001\u0010FR+\u0010Ù\u0001\u001a\u0005\u0018\u00010Ó\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b_\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001\"\u0006\b×\u0001\u0010Ø\u0001R\u001f\u0010Ý\u0001\u001a\u00020\u00178\u0006X\u0086D¢\u0006\u0010\n\u0006\bÂ\u0001\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001R \u0010à\u0001\u001a\t\u0012\u0004\u0012\u0002080Þ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010ß\u0001R \u0010á\u0001\u001a\t\u0012\u0004\u0012\u0002080Þ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010ß\u0001¨\u0006â\u0001"}, d2 = {"Ll/fms;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/lms;", "Lcom/p1/mobile/android/app/Act;", "act", "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/lms;)V", "Landroid/view/View;", "view", "", "O", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGift;", "gift", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;", "giftWallV2", "u0", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGift;Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallCategory;", "category", "z0", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallCategory;Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGift;Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;)V", "", "giftId", "", "isFirst", "y0", "(Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGift;Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;Z)V", "m", "r", "()V", "B0", "(Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;Z)V", "", "index", "D0", "(ILcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGift;)V", "p", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallUser;", "user", "t0", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallUser;)V", "k", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "l", "Landroid/view/View;", "g0", "()Landroid/view/View;", "set_shadow", "_shadow", "Q", "set_bg", "_bg", "Lv/VDraweeView;", "n", "Lv/VDraweeView;", "c0", "()Lv/VDraweeView;", "set_image_bg", "(Lv/VDraweeView;)V", "_image_bg", "Landroid/widget/TextView;", "o", "Landroid/widget/TextView;", "i0", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "h0", "set_sub_title_image", "_sub_title_image", "q", "a0", "set_gift_tray", "_gift_tray", "Lcom/tantan/library/svga/SVGAnimationView;", "Lcom/tantan/library/svga/SVGAnimationView;", "b0", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_gift_tray_svga", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_gift_tray_svga", "Lv/VImage;", "s", "Lv/VImage;", "P", "()Lv/VImage;", "set_back_bt", "(Lv/VImage;)V", "_back_bt", "t", "V", "set_gift_img", "_gift_img", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/giftwallnew/view/LiveGiftFiveStarView;", "u", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/giftwallnew/view/LiveGiftFiveStarView;", "U", "()Lcom/p1/mobile/putong/live/livingroom/increment/gift/giftwallnew/view/LiveGiftFiveStarView;", "set_five_star", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/giftwallnew/view/LiveGiftFiveStarView;)V", "_five_star", "v", "Z", "set_gift_source", "_gift_source", "Landroidx/constraintlayout/widget/ConstraintLayout;", "w", "Landroidx/constraintlayout/widget/ConstraintLayout;", "S", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_card_bg", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_card_bg", "x", "d0", "set_named_user_icon", "_named_user_icon", "y", "e0", "set_named_user_name", "_named_user_name", "z", "get_named_hint", "set_named_hint", "_named_hint", "A", "get_line", "set_line", "_line", "B", "get_star_hint", "set_star_hint", "_star_hint", "C", "j0", "set_user_icon1", "_user_icon1", "D", "k0", "set_user_icon2", "_user_icon2", "E", "l0", "set_user_icon3", "_user_icon3", "F", "m0", "set_user_icon4", "_user_icon4", "G", "n0", "set_user_icon5", "_user_icon5", "H", "T", "set_card_bg_normal", "_card_bg_normal", "I", "get_normal_hint", "set_normal_hint", "_normal_hint", "J", "get_line_normal", "set_line_normal", "_line_normal", "K", "o0", "set_user_normal_icon1", "_user_normal_icon1", "L", "p0", "set_user_normal_icon2", "_user_normal_icon2", "M", "q0", "set_user_normal_icon3", "_user_normal_icon3", "N", "r0", "set_user_normal_icon4", "_user_normal_icon4", "s0", "set_user_normal_icon5", "_user_normal_icon5", "get_gifts_title", "set_gifts_title", "_gifts_title", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/giftwallnew/view/LiveGiftWallSkinSelectItemView;", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/giftwallnew/view/LiveGiftWallSkinSelectItemView;", "W", "()Lcom/p1/mobile/putong/live/livingroom/increment/gift/giftwallnew/view/LiveGiftWallSkinSelectItemView;", "set_gift_item1", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/giftwallnew/view/LiveGiftWallSkinSelectItemView;)V", "_gift_item1", "R", "X", "set_gift_item2", "_gift_item2", "Y", "set_gift_item3", "_gift_item3", "f0", "set_progress_text", "_progress_text", "set_bt", "_bt", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallSkin;", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallSkin;", "getCurrentGiftSkin", "()Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallSkin;", "setCurrentGiftSkin", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallSkin;)V", "currentGiftSkin", "Ljava/lang/String;", "getScene", "()Ljava/lang/String;", "scene", "", "Ljava/util/List;", "userList", "userNormalList", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class fms extends LiveMenuDialogHolder<lms> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public View _line;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public TextView _star_hint;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public VDraweeView _user_icon1;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public VDraweeView _user_icon2;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public VDraweeView _user_icon3;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public VDraweeView _user_icon4;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public VDraweeView _user_icon5;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ConstraintLayout _card_bg_normal;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public TextView _normal_hint;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public View _line_normal;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public VDraweeView _user_normal_icon1;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public VDraweeView _user_normal_icon2;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public VDraweeView _user_normal_icon3;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public VDraweeView _user_normal_icon4;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public VDraweeView _user_normal_icon5;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public TextView _gifts_title;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public LiveGiftWallSkinSelectItemView _gift_item1;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public LiveGiftWallSkinSelectItemView _gift_item2;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public LiveGiftWallSkinSelectItemView _gift_item3;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public TextView _progress_text;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public TextView _bt;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @Nullable
    public BLiveNewGiftWallSkin currentGiftSkin;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @NotNull
    public final String scene;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @NotNull
    public List<? extends VDraweeView> userList;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @NotNull
    public List<? extends VDraweeView> userNormalList;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public View _shadow;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public View _bg;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VDraweeView _image_bg;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VDraweeView _sub_title_image;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VDraweeView _gift_tray;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public SVGAnimationView _gift_tray_svga;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public VImage _back_bt;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public VDraweeView _gift_img;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public LiveGiftFiveStarView _five_star;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public TextView _gift_source;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public ConstraintLayout _card_bg;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public VDraweeView _named_user_icon;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public TextView _named_user_name;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public TextView _named_hint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fms(@NotNull Act act, @NotNull lms lmsVar) {
        super(t6c0.f19496D4, act, lmsVar);
        act.getClass();
        lmsVar.getClass();
        this.act = act;
        this.scene = "context_livingAct";
        ArrayList arrayListF0 = vwb.f0(new VDraweeView[0]);
        arrayListF0.getClass();
        this.userList = arrayListF0;
        ArrayList arrayListF1 = vwb.f0(new VDraweeView[0]);
        arrayListF1.getClass();
        this.userNormalList = arrayListF1;
    }

    /* JADX INFO: renamed from: A0 */
    public static final void m13318A0(fms fmsVar, BLiveNewGiftWallUser bLiveNewGiftWallUser, View view) {
        ((lms) fmsVar.f3799b).m17322W3(bLiveNewGiftWallUser);
    }

    /* JADX INFO: renamed from: E0 */
    public static final void m13319E0(fms fmsVar, BLiveCommonViewConfig bLiveCommonViewConfig, BLiveNewGiftWallGift bLiveNewGiftWallGift, View view) {
        String str;
        BLiveNewGiftWallSkin bLiveNewGiftWallSkin = fmsVar.currentGiftSkin;
        if (bLiveNewGiftWallSkin == null || (str = bLiveNewGiftWallSkin.id) == null) {
            return;
        }
        lms lmsVar = (lms) fmsVar.f3799b;
        String str2 = bLiveCommonViewConfig.type;
        str2.getClass();
        String str3 = bLiveNewGiftWallGift.id;
        str3.getClass();
        lmsVar.m17321V3(str2, str3, str);
    }

    /* JADX INFO: renamed from: F */
    public static Boolean m13320F(String str, BLiveNewGiftWallSkin bLiveNewGiftWallSkin) {
        return Boolean.valueOf(Intrinsics.d(bLiveNewGiftWallSkin.id, str));
    }

    /* JADX INFO: renamed from: G */
    public static Boolean m13321G(BLiveNewGiftWallGift bLiveNewGiftWallGift, BLiveNewGiftWallUser bLiveNewGiftWallUser) {
        return Boolean.valueOf(Intrinsics.d(bLiveNewGiftWallGift.namedUserId, bLiveNewGiftWallUser.id));
    }

    /* JADX INFO: renamed from: K */
    public static void m13325K(fms fmsVar, View view) {
        fmsVar.mo5216p();
    }

    /* JADX INFO: renamed from: M */
    public static void m13327M(fms fmsVar, View view) {
        fmsVar.mo5216p();
    }

    /* JADX INFO: renamed from: v0 */
    public static final Boolean m13329v0(String str, BLiveNewGiftWallUser bLiveNewGiftWallUser) {
        return Boolean.valueOf(Intrinsics.d(str, bLiveNewGiftWallUser.id));
    }

    /* JADX INFO: renamed from: w0 */
    public static final void m13330w0(fms fmsVar, Ref.ObjectRef objectRef, int i, View view) {
        ((lms) fmsVar.f3799b).m17322W3((BLiveNewGiftWallUser) ((List) objectRef.element).get(i));
    }

    /* JADX INFO: renamed from: x0 */
    public static final void m13331x0(fms fmsVar, Ref.ObjectRef objectRef, int i, View view) {
        ((lms) fmsVar.f3799b).m17322W3((BLiveNewGiftWallUser) ((List) objectRef.element).get(i));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: B0 */
    public final void m13332B0(@NotNull String giftId, @NotNull BLiveNewGiftWallDetailInfoItem giftWallV2, boolean isFirst) {
        giftId.getClass();
        giftWallV2.getClass();
        BLiveNewGiftWallGift bLiveNewGiftWallGift = (BLiveNewGiftWallGift) giftWallV2.gifts.get(0);
        BLiveNewGiftWallCategory bLiveNewGiftWallCategory = (BLiveNewGiftWallCategory) giftWallV2.categories.get(0);
        m13354i0().setText(bLiveNewGiftWallGift.name);
        hxs.s(this.scene, m13353h0(), bLiveNewGiftWallCategory.icon);
        hxs.t(this.scene, m13348c0(), bLiveNewGiftWallCategory.detailBgUrl, 480);
        hxs.s(this.scene, m13346a0(), bLiveNewGiftWallCategory.detailBaseUrl);
        xdl0.M(m13347b0(), !TextUtils.isEmpty(bLiveNewGiftWallCategory.detailBaseSvgaUrl));
        if (!TextUtils.isEmpty(bLiveNewGiftWallCategory.detailBaseSvgaUrl)) {
            Act act = ((lms) this.f3799b).act();
            act.getClass();
            SVGALoader.SVGARequestBuilder sVGARequestBuilderWith = SVGALoader.with(act);
            String str = bLiveNewGiftWallCategory.detailBaseSvgaUrl;
            str.getClass();
            sVGARequestBuilderWith.from(str).repeatCount(-1).into(m13347b0());
        }
        m13340U().m7217k0(bLiveNewGiftWallGift.grade);
        m13345Z().setText("礼物来源：" + bLiveNewGiftWallGift.source);
        xdl0.M0(m13345Z(), TextUtils.isEmpty(bLiveNewGiftWallGift.source) ^ true);
        m13369z0(bLiveNewGiftWallCategory, bLiveNewGiftWallGift, giftWallV2);
        m13367u0(bLiveNewGiftWallGift, giftWallV2);
        m13368y0(giftId, bLiveNewGiftWallGift, giftWallV2, isFirst);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m13333D0(int index, @NotNull final BLiveNewGiftWallGift gift) {
        BLiveNewGiftWallInteract bLiveNewGiftWallInteract;
        List<BLiveNewGiftWallInteractTextItem> list;
        BLiveNewGiftWallInteract bLiveNewGiftWallInteract2;
        final BLiveCommonViewConfig bLiveCommonViewConfig;
        gift.getClass();
        this.currentGiftSkin = (BLiveNewGiftWallSkin) gift.skins.get(index - 1);
        m13342W().setSelected(false);
        m13343X().setSelected(false);
        m13344Y().setSelected(false);
        if (index == 1) {
            m13342W().setSelected(true);
        } else if (index == 2) {
            m13343X().setSelected(true);
        } else if (index == 3) {
            m13344Y().setSelected(true);
        }
        String str = this.scene;
        VDraweeView vDraweeViewM13341V = m13341V();
        BLiveNewGiftWallSkin bLiveNewGiftWallSkin = this.currentGiftSkin;
        hxs.s(str, vDraweeViewM13341V, bLiveNewGiftWallSkin != null ? bLiveNewGiftWallSkin.icon : null);
        VDraweeView vDraweeViewM13341V2 = m13341V();
        BLiveNewGiftWallSkin bLiveNewGiftWallSkin2 = this.currentGiftSkin;
        kvc0.i(vDraweeViewM13341V2, TextUtils.equals(bLiveNewGiftWallSkin2 != null ? bLiveNewGiftWallSkin2.status : null, "locked"));
        BLiveNewGiftWallSkin bLiveNewGiftWallSkin3 = this.currentGiftSkin;
        if (bLiveNewGiftWallSkin3 != null && (bLiveNewGiftWallInteract2 = bLiveNewGiftWallSkin3.interact) != null && (bLiveCommonViewConfig = bLiveNewGiftWallInteract2.button) != null) {
            m13337R().setText(bLiveCommonViewConfig.text);
            if (TextUtils.isEmpty(bLiveCommonViewConfig.type) || Intrinsics.d(bLiveCommonViewConfig.type, "showGiftDialog") || Intrinsics.d(bLiveCommonViewConfig.type, "equipGiftSkin")) {
                m13337R().setEnabled(true);
                xdl0.E0(m13337R(), new View.OnClickListener() { // from class: l.ems
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        fms.m13319E0(this.f9874a, bLiveCommonViewConfig, gift, view);
                    }
                });
            } else if (Intrinsics.d(bLiveCommonViewConfig.type, "equippedGiftSkin") || Intrinsics.d(bLiveCommonViewConfig.type, "lockedGiftSkin")) {
                m13337R().setEnabled(false);
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        BLiveNewGiftWallSkin bLiveNewGiftWallSkin4 = this.currentGiftSkin;
        if (bLiveNewGiftWallSkin4 != null && (bLiveNewGiftWallInteract = bLiveNewGiftWallSkin4.interact) != null && (list = bLiveNewGiftWallInteract.texts) != null) {
            for (BLiveNewGiftWallInteractTextItem bLiveNewGiftWallInteractTextItem : list) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(bLiveNewGiftWallInteractTextItem.value);
                spannableStringBuilder2.setSpan(new ForegroundColorSpan(kvc0.g(bLiveNewGiftWallInteractTextItem.color)), 0, bLiveNewGiftWallInteractTextItem.value.length(), 17);
                spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
            }
        }
        m13351f0().setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: O */
    public final void m13334O(View view) {
        gms.m13953a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final VImage m13335P() {
        VImage vImage = this._back_bt;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_back_bt");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final View m13336Q() {
        View view = this._bg;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final TextView m13337R() {
        TextView textView = this._bt;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_bt");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final ConstraintLayout m13338S() {
        ConstraintLayout constraintLayout = this._card_bg;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.r("_card_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final ConstraintLayout m13339T() {
        ConstraintLayout constraintLayout = this._card_bg_normal;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.r("_card_bg_normal");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final LiveGiftFiveStarView m13340U() {
        LiveGiftFiveStarView liveGiftFiveStarView = this._five_star;
        if (liveGiftFiveStarView != null) {
            return liveGiftFiveStarView;
        }
        Intrinsics.r("_five_star");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VDraweeView m13341V() {
        VDraweeView vDraweeView = this._gift_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_gift_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final LiveGiftWallSkinSelectItemView m13342W() {
        LiveGiftWallSkinSelectItemView liveGiftWallSkinSelectItemView = this._gift_item1;
        if (liveGiftWallSkinSelectItemView != null) {
            return liveGiftWallSkinSelectItemView;
        }
        Intrinsics.r("_gift_item1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final LiveGiftWallSkinSelectItemView m13343X() {
        LiveGiftWallSkinSelectItemView liveGiftWallSkinSelectItemView = this._gift_item2;
        if (liveGiftWallSkinSelectItemView != null) {
            return liveGiftWallSkinSelectItemView;
        }
        Intrinsics.r("_gift_item2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final LiveGiftWallSkinSelectItemView m13344Y() {
        LiveGiftWallSkinSelectItemView liveGiftWallSkinSelectItemView = this._gift_item3;
        if (liveGiftWallSkinSelectItemView != null) {
            return liveGiftWallSkinSelectItemView;
        }
        Intrinsics.r("_gift_item3");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final TextView m13345Z() {
        TextView textView = this._gift_source;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_gift_source");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final VDraweeView m13346a0() {
        VDraweeView vDraweeView = this._gift_tray;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_gift_tray");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final SVGAnimationView m13347b0() {
        SVGAnimationView sVGAnimationView = this._gift_tray_svga;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.r("_gift_tray_svga");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VDraweeView m13348c0() {
        VDraweeView vDraweeView = this._image_bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_image_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final VDraweeView m13349d0() {
        VDraweeView vDraweeView = this._named_user_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_named_user_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final TextView m13350e0() {
        TextView textView = this._named_user_name;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_named_user_name");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final TextView m13351f0() {
        TextView textView = this._progress_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_progress_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final View m13352g0() {
        View view = this._shadow;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_shadow");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final VDraweeView m13353h0() {
        VDraweeView vDraweeView = this._sub_title_image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_sub_title_image");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final TextView m13354i0() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final VDraweeView m13355j0() {
        VDraweeView vDraweeView = this._user_icon1;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_user_icon1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k0 */
    public final VDraweeView m13356k0() {
        VDraweeView vDraweeView = this._user_icon2;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_user_icon2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public final VDraweeView m13357l0() {
        VDraweeView vDraweeView = this._user_icon3;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_user_icon3");
        return null;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(@NotNull View view) {
        view.getClass();
        super.mo5214m(view);
        m13334O(view);
        ArrayList arrayListF0 = vwb.f0(new VDraweeView[]{m13355j0(), m13356k0(), m13357l0(), m13358m0(), m13359n0()});
        arrayListF0.getClass();
        this.userList = arrayListF0;
        ArrayList arrayListF1 = vwb.f0(new VDraweeView[]{m13360o0(), m13361p0(), m13362q0(), m13364r0(), m13365s0()});
        arrayListF1.getClass();
        this.userNormalList = arrayListF1;
        m13363r();
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final VDraweeView m13358m0() {
        VDraweeView vDraweeView = this._user_icon4;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_user_icon4");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n0 */
    public final VDraweeView m13359n0() {
        VDraweeView vDraweeView = this._user_icon5;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_user_icon5");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public final VDraweeView m13360o0() {
        VDraweeView vDraweeView = this._user_normal_icon1;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_user_normal_icon1");
        return null;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: p */
    public void mo5216p() {
        super.mo5216p();
        SVGAnimationView.stopAnimation$default(m13347b0(), false, 1, (Object) null);
    }

    @NotNull
    /* JADX INFO: renamed from: p0 */
    public final VDraweeView m13361p0() {
        VDraweeView vDraweeView = this._user_normal_icon2;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_user_normal_icon2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q0 */
    public final VDraweeView m13362q0() {
        VDraweeView vDraweeView = this._user_normal_icon3;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_user_normal_icon3");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m13363r() {
        View viewM13336Q = m13336Q();
        int i = t100.q;
        mep0.c1(viewM13336Q, 0, 0, 0, -i, i);
        mep0.c1(m13348c0(), 0, 0, 0, -i, i);
        xdl0.E0(m13335P(), new View.OnClickListener() { // from class: l.wls
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fms.m13325K(this.f21823a, view);
            }
        });
        xdl0.E0(m13352g0(), new View.OnClickListener() { // from class: l.xls
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fms.m13327M(this.f22348a, view);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: r0 */
    public final VDraweeView m13364r0() {
        VDraweeView vDraweeView = this._user_normal_icon4;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_user_normal_icon4");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s0 */
    public final VDraweeView m13365s0() {
        VDraweeView vDraweeView = this._user_normal_icon5;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_user_normal_icon5");
        return null;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m13366t0(@NotNull BLiveNewGiftWallUser user) {
        user.getClass();
        ((lms) this.f3799b).m17322W3(user);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m13367u0(BLiveNewGiftWallGift gift, BLiveNewGiftWallDetailInfoItem giftWallV2) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new ArrayList();
        List<String> list = gift.contributorUserIds;
        list.getClass();
        for (final String str : list) {
            List listC = vwb.c((List) objectRef.element, (BLiveNewGiftWallUser) vwb.r(giftWallV2.users, new w9j() { // from class: l.bms
                public final Object call(Object obj) {
                    return fms.m13329v0(str, (BLiveNewGiftWallUser) obj);
                }
            }));
            listC.getClass();
            objectRef.element = listC;
        }
        int size = this.userList.size();
        final int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            this.userList.get(i2).setImageResource(i3c0.f13013y2);
            this.userNormalList.get(i2).setImageResource(i3c0.f13013y2);
        }
        for (Object obj : (Iterable) objectRef.element) {
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (i < 5) {
                VDraweeView vDraweeView = this.userList.get(i);
                VDraweeView vDraweeView2 = this.userNormalList.get(i);
                xdl0.E0(vDraweeView, new View.OnClickListener() { // from class: l.cms
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        fms.m13330w0(this.f8754a, objectRef, i, view);
                    }
                });
                xdl0.E0(vDraweeView2, new View.OnClickListener() { // from class: l.dms
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        fms.m13331x0(this.f9351a, objectRef, i, view);
                    }
                });
                hxs.s(this.scene, vDraweeView, ((BLiveNewGiftWallUser) ((List) objectRef.element).get(i)).avatar);
                hxs.s(this.scene, vDraweeView2, ((BLiveNewGiftWallUser) ((List) objectRef.element).get(i)).avatar);
            }
            i = i3;
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m13368y0(final String giftId, BLiveNewGiftWallGift gift, BLiveNewGiftWallDetailInfoItem giftWallV2, boolean isFirst) {
        m13342W().m7223m0(1, gift, giftWallV2, this);
        m13343X().m7223m0(2, gift, giftWallV2, this);
        m13344Y().m7223m0(3, gift, giftWallV2, this);
        if (isFirst) {
            int iG = vwb.G(gift.skins, new w9j() { // from class: l.yls
                public final Object call(Object obj) {
                    return fms.m13320F(giftId, (BLiveNewGiftWallSkin) obj);
                }
            });
            if (iG == -1) {
                m13333D0(1, gift);
                return;
            } else {
                if (iG < 3) {
                    m13333D0(iG + 1, gift);
                    return;
                }
                return;
            }
        }
        if (m13342W().isSelected()) {
            m13333D0(1, gift);
        } else if (m13343X().isSelected()) {
            m13333D0(2, gift);
        } else if (m13344Y().isSelected()) {
            m13333D0(3, gift);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m13369z0(BLiveNewGiftWallCategory category, final BLiveNewGiftWallGift gift, BLiveNewGiftWallDetailInfoItem giftWallV2) {
        if (!category.canName) {
            xdl0.M(m13339T(), true);
            xdl0.M(m13338S(), false);
            return;
        }
        xdl0.M(m13339T(), false);
        xdl0.M(m13338S(), true);
        if (TextUtils.isEmpty(gift.namedUserId)) {
            m13350e0().setText("虚位以待");
            m13350e0().setTextColor(kvc0.a(h1c0.f11806m1));
            m13349d0().setImageResource(i3c0.f12965u2);
            return;
        }
        final BLiveNewGiftWallUser bLiveNewGiftWallUser = (BLiveNewGiftWallUser) vwb.r(giftWallV2.users, new w9j() { // from class: l.zls
            public final Object call(Object obj) {
                return fms.m13321G(gift, (BLiveNewGiftWallUser) obj);
            }
        });
        if (bLiveNewGiftWallUser != null) {
            m13350e0().setText(w8u.p(bLiveNewGiftWallUser.name, 5));
            m13350e0().setTextColor(kvc0.a(h1c0.f11815p1));
            xdl0.E0(m13349d0(), new View.OnClickListener() { // from class: l.ams
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fms.m13318A0(this.f7755a, bLiveNewGiftWallUser, view);
                }
            });
            hxs.s(this.scene, m13349d0(), bLiveNewGiftWallUser.avatar);
        }
    }
}
