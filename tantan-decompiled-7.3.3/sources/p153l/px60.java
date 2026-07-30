package p153l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundLinearLayout;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundRelativeLayout;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundView;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VFrame_Anim;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bB\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010'\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010>\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010B\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010*\u001a\u0004\b@\u0010,\"\u0004\bA\u0010.R\"\u0010F\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010*\u001a\u0004\bD\u0010,\"\u0004\bE\u0010.R\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010Z\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010*\u001a\u0004\bX\u0010,\"\u0004\bY\u0010.R\"\u0010^\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010I\u001a\u0004\b\\\u0010K\"\u0004\b]\u0010MR\"\u0010a\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010Q\u001a\u0004\b_\u0010S\"\u0004\b`\u0010UR\"\u0010d\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010I\u001a\u0004\bb\u0010K\"\u0004\bc\u0010MR\"\u0010g\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010I\u001a\u0004\be\u0010K\"\u0004\bf\u0010MR\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010r\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010*\u001a\u0004\bp\u0010,\"\u0004\bq\u0010.R\"\u0010u\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010I\u001a\u0004\bs\u0010K\"\u0004\bt\u0010MR\"\u0010x\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010*\u001a\u0004\bv\u0010,\"\u0004\bw\u0010.R\"\u0010{\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010I\u001a\u0004\by\u0010K\"\u0004\bz\u0010MR\"\u0010~\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010*\u001a\u0004\b|\u0010,\"\u0004\b}\u0010.R$\u0010\u0081\u0001\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\bR\u0010I\u001a\u0004\b\u007f\u0010K\"\u0005\b\u0080\u0001\u0010MR(\u0010\u0087\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0005\b+\u0010\u0083\u0001\u001a\u0005\bi\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R)\u0010\u008e\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bX\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R)\u0010\u0091\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\be\u0010\u0089\u0001\u001a\u0006\b\u008f\u0001\u0010\u008b\u0001\"\u0006\b\u0090\u0001\u0010\u008d\u0001R%\u0010\u0094\u0001\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\bs\u00109\u001a\u0005\b\u0092\u0001\u0010;\"\u0005\b\u0093\u0001\u0010=R)\u0010\u0097\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\by\u0010\u0083\u0001\u001a\u0006\b\u0095\u0001\u0010\u0084\u0001\"\u0006\b\u0096\u0001\u0010\u0086\u0001R%\u0010\u009a\u0001\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u007f\u0010I\u001a\u0005\b\u0098\u0001\u0010K\"\u0005\b\u0099\u0001\u0010MR%\u0010\u009d\u0001\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\bp\u0010I\u001a\u0005\b\u009b\u0001\u0010K\"\u0005\b\u009c\u0001\u0010MR%\u0010 \u0001\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\bv\u0010I\u001a\u0005\b\u009e\u0001\u0010K\"\u0005\b\u009f\u0001\u0010MR%\u0010£\u0001\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b|\u0010I\u001a\u0005\b¡\u0001\u0010K\"\u0005\b¢\u0001\u0010MR%\u0010¦\u0001\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\\\u0010I\u001a\u0005\b¤\u0001\u0010K\"\u0005\b¥\u0001\u0010MR%\u0010©\u0001\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u0017\u0010I\u001a\u0005\b§\u0001\u0010K\"\u0005\b¨\u0001\u0010MR&\u0010¬\u0001\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010I\u001a\u0005\bª\u0001\u0010K\"\u0005\b«\u0001\u0010MR&\u0010¯\u0001\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008f\u0001\u0010I\u001a\u0005\b\u00ad\u0001\u0010K\"\u0005\b®\u0001\u0010MR&\u0010³\u0001\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b°\u0001\u0010I\u001a\u0005\b±\u0001\u0010K\"\u0005\b²\u0001\u0010MR&\u0010·\u0001\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b´\u0001\u0010I\u001a\u0005\bµ\u0001\u0010K\"\u0005\b¶\u0001\u0010MR&\u0010»\u0001\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¸\u0001\u0010j\u001a\u0005\b¹\u0001\u0010l\"\u0005\bº\u0001\u0010nR&\u0010¾\u0001\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¼\u0001\u0010*\u001a\u0005\b¼\u0001\u0010,\"\u0005\b½\u0001\u0010.R&\u0010Á\u0001\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¿\u0001\u0010I\u001a\u0005\b°\u0001\u0010K\"\u0005\bÀ\u0001\u0010MR&\u0010Ä\u0001\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÂ\u0001\u0010*\u001a\u0005\b¿\u0001\u0010,\"\u0005\bÃ\u0001\u0010.R&\u0010Æ\u0001\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¤\u0001\u0010I\u001a\u0005\b´\u0001\u0010K\"\u0005\bÅ\u0001\u0010MR&\u0010È\u0001\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b§\u0001\u0010*\u001a\u0005\bÂ\u0001\u0010,\"\u0005\bÇ\u0001\u0010.R&\u0010Ê\u0001\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bª\u0001\u0010I\u001a\u0005\b¸\u0001\u0010K\"\u0005\bÉ\u0001\u0010MR\u001a\u0010Í\u0001\u001a\u00030Ë\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u00ad\u0001\u0010Ì\u0001¨\u0006Î\u0001"}, m88121d2 = {"Ll/px60;", "Ll/q2m;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "c0", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "o", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "h", OMSTemplateModeType.view, "d0", "(Landroid/view/View;)V", "Lv/VFrame_Anim;", "c", "Lv/VFrame_Anim;", "I", "()Lv/VFrame_Anim;", "set_root_layout", "(Lv/VFrame_Anim;)V", "_root_layout", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundRelativeLayout;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundRelativeLayout;", "p", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundRelativeLayout;", "set_activity_layout", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundRelativeLayout;)V", "_activity_layout", "e", "q", "set_activity_layout_root_layout", "_activity_layout_root_layout", "Lv/VDraweeView;", "f", "Lv/VDraweeView;", BaseSei.f14625Y, "()Lv/VDraweeView;", "set_activity_layout_root_layout_img_bg_decoration", "(Lv/VDraweeView;)V", "_activity_layout_root_layout_img_bg_decoration", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundView;", "g", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundView;", "get_activity_layout_root_layout_top", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundView;", "set_activity_layout_root_layout_top", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundView;)V", "_activity_layout_root_layout_top", "Lv/VFrame;", "Lv/VFrame;", "get_activity_layout_root_layout_image_container", "()Lv/VFrame;", "set_activity_layout_root_layout_image_container", "(Lv/VFrame;)V", "_activity_layout_root_layout_image_container", RXScreenCaptureService.KEY_INDEX, ResourceDirection.f39656v, "set_activity_layout_root_layout_image_container_img_bg", "_activity_layout_root_layout_image_container_img_bg", "j", "u", "set_activity_layout_root_layout_image_container_img", "_activity_layout_root_layout_image_container_img", "Landroid/widget/TextView;", "k", "Landroid/widget/TextView;", "w", "()Landroid/widget/TextView;", "set_activity_layout_root_layout_image_container_rule", "(Landroid/widget/TextView;)V", "_activity_layout_root_layout_image_container_rule", "Lv/VImage;", BLiveStormDanmakuGiftResourceType.f45292l, "Lv/VImage;", BaseSei.f14624X, "()Lv/VImage;", "set_activity_layout_root_layout_image_container_star_img", "(Lv/VImage;)V", "_activity_layout_root_layout_image_container_star_img", "m", BaseSei.f14626Z, "set_activity_layout_root_layout_peg_tag", "_activity_layout_root_layout_peg_tag", "n", "H", "set_activity_layout_root_layout_title", "_activity_layout_root_layout_title", Constants.KEY_T, "set_activity_layout_root_layout_desc_img", "_activity_layout_root_layout_desc_img", BLiveStormDanmakuGiftResourceType.f45294s, "set_activity_layout_root_layout_desc", "_activity_layout_root_layout_desc", "A", "set_activity_layout_root_layout_reward", "_activity_layout_root_layout_reward", "Lv/VLinear;", "r", "Lv/VLinear;", "get_activity_layout_root_layout_reward_desc", "()Lv/VLinear;", "set_activity_layout_root_layout_reward_desc", "(Lv/VLinear;)V", "_activity_layout_root_layout_reward_desc", "E", "set_activity_layout_root_layout_reward_desc_reward_img1", "_activity_layout_root_layout_reward_desc_reward_img1", "B", "set_activity_layout_root_layout_reward_desc_reward_desc_1", "_activity_layout_root_layout_reward_desc_reward_desc_1", "F", "set_activity_layout_root_layout_reward_desc_reward_img2", "_activity_layout_root_layout_reward_desc_reward_img2", c4s.C_ZONE, "set_activity_layout_root_layout_reward_desc_reward_desc_2", "_activity_layout_root_layout_reward_desc_reward_desc_2", "G", "set_activity_layout_root_layout_reward_desc_reward_img3", "_activity_layout_root_layout_reward_desc_reward_img3", "D", "set_activity_layout_root_layout_reward_desc_reward_desc_3", "_activity_layout_root_layout_reward_desc_reward_desc_3", "Lv/VButton;", "Lv/VButton;", "()Lv/VButton;", "set_activity_layout_root_layout_bt", "(Lv/VButton;)V", "_activity_layout_root_layout_bt", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundLinearLayout;", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundLinearLayout;", "J", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundLinearLayout;", "set_rule_layout", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundLinearLayout;)V", "_rule_layout", "K", "set_rule_layout_root_layout", "_rule_layout_root_layout", "get_rule_layout_root_layout_top", "set_rule_layout_root_layout_top", "_rule_layout_root_layout_top", "a0", "set_rule_layout_root_layout_top_back", "_rule_layout_root_layout_top_back", "b0", "set_rule_layout_root_layout_top_rule_title", "_rule_layout_root_layout_top_rule_title", "Z", "set_rule_layout_root_layout_rule_time_title", "_rule_layout_root_layout_rule_time_title", "Y", "set_rule_layout_root_layout_rule_time_desc", "_rule_layout_root_layout_rule_time_desc", "W", "set_rule_layout_root_layout_rule_play_title", "_rule_layout_root_layout_rule_play_title", "R", "set_rule_layout_root_layout_rule_play_desc_1", "_rule_layout_root_layout_rule_play_desc_1", p7f.LATITUDE_SOUTH, "set_rule_layout_root_layout_rule_play_desc_2", "_rule_layout_root_layout_rule_play_desc_2", p7f.GPS_DIRECTION_TRUE, "set_rule_layout_root_layout_rule_play_desc_3", "_rule_layout_root_layout_rule_play_desc_3", "U", "set_rule_layout_root_layout_rule_play_desc_4", "_rule_layout_root_layout_rule_play_desc_4", "L", p7f.GPS_MEASUREMENT_INTERRUPTED, "set_rule_layout_root_layout_rule_play_desc_5", "_rule_layout_root_layout_rule_play_desc_5", "M", "X", "set_rule_layout_root_layout_rule_reward_title", "_rule_layout_root_layout_rule_reward_title", "N", "get_rule_layout_root_layout_reward_desc", "set_rule_layout_root_layout_reward_desc", "_rule_layout_root_layout_reward_desc", BloodType.f39576O, "set_rule_layout_root_layout_reward_desc_reward_img1", "_rule_layout_root_layout_reward_desc_reward_img1", "P", "set_rule_layout_root_layout_reward_desc_reward_desc_1", "_rule_layout_root_layout_reward_desc_reward_desc_1", "Q", "set_rule_layout_root_layout_reward_desc_reward_img2", "_rule_layout_root_layout_reward_desc_reward_img2", "set_rule_layout_root_layout_reward_desc_reward_desc_2", "_rule_layout_root_layout_reward_desc_reward_desc_2", "set_rule_layout_root_layout_reward_desc_reward_img3", "_rule_layout_root_layout_reward_desc_reward_img3", "set_rule_layout_root_layout_reward_desc_reward_desc_3", "_rule_layout_root_layout_reward_desc_reward_desc_3", "Ll/pej0;", "Ll/pej0;", OMSTemplateType.dialog, "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class px60 extends q2m {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public RoundLinearLayout _rule_layout_root_layout;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public VFrame _rule_layout_root_layout_top;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public VButton _rule_layout_root_layout_top_back;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public TextView _rule_layout_root_layout_top_rule_title;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public TextView _rule_layout_root_layout_rule_time_title;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public TextView _rule_layout_root_layout_rule_time_desc;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public TextView _rule_layout_root_layout_rule_play_title;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public TextView _rule_layout_root_layout_rule_play_desc_1;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public TextView _rule_layout_root_layout_rule_play_desc_2;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public TextView _rule_layout_root_layout_rule_play_desc_3;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public TextView _rule_layout_root_layout_rule_play_desc_4;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public TextView _rule_layout_root_layout_rule_play_desc_5;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public TextView _rule_layout_root_layout_rule_reward_title;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public VLinear _rule_layout_root_layout_reward_desc;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public VDraweeView _rule_layout_root_layout_reward_desc_reward_img1;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public TextView _rule_layout_root_layout_reward_desc_reward_desc_1;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public VDraweeView _rule_layout_root_layout_reward_desc_reward_img2;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public TextView _rule_layout_root_layout_reward_desc_reward_desc_2;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public VDraweeView _rule_layout_root_layout_reward_desc_reward_img3;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public TextView _rule_layout_root_layout_reward_desc_reward_desc_3;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public pej0 dialog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VFrame_Anim _root_layout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public RoundRelativeLayout _activity_layout;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public RoundRelativeLayout _activity_layout_root_layout;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VDraweeView _activity_layout_root_layout_img_bg_decoration;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public RoundView _activity_layout_root_layout_top;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VFrame _activity_layout_root_layout_image_container;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VDraweeView _activity_layout_root_layout_image_container_img_bg;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VDraweeView _activity_layout_root_layout_image_container_img;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public TextView _activity_layout_root_layout_image_container_rule;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VImage _activity_layout_root_layout_image_container_star_img;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VDraweeView _activity_layout_root_layout_peg_tag;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public TextView _activity_layout_root_layout_title;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VImage _activity_layout_root_layout_desc_img;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public TextView _activity_layout_root_layout_desc;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public TextView _activity_layout_root_layout_reward;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public VLinear _activity_layout_root_layout_reward_desc;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public VDraweeView _activity_layout_root_layout_reward_desc_reward_img1;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public TextView _activity_layout_root_layout_reward_desc_reward_desc_1;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public VDraweeView _activity_layout_root_layout_reward_desc_reward_img2;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public TextView _activity_layout_root_layout_reward_desc_reward_desc_2;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public VDraweeView _activity_layout_root_layout_reward_desc_reward_img3;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public TextView _activity_layout_root_layout_reward_desc_reward_desc_3;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public VButton _activity_layout_root_layout_bt;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public RoundLinearLayout _rule_layout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px60(@NotNull Act act) {
        super(act);
        act.getClass();
    }

    /* JADX INFO: renamed from: c0 */
    private final void m174153c0() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            bnl0.m105509E0(m174192r(), new View.OnClickListener() { // from class: l.kx60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    px60.m174155j(this.f129170a, view);
                }
            });
            bnl0.m105509E0(m174197w(), new View.OnClickListener() { // from class: l.lx60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    px60.m174156k(this.f133908a, view);
                }
            });
            bnl0.m105509E0(m174186a0(), new View.OnClickListener() { // from class: l.mx60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    px60.m174157l(this.f139205a, view);
                }
            });
            ix60 ix60Var = ix60.INSTANCE;
            ix60Var.m142440C(m174191q());
            ix60Var.m142440C(m174170K());
            ix60Var.m142441D(m174199y());
            ix60Var.m142460X(m174160A(), getAct());
            ix60Var.m142455S(m174184Y());
            ix60Var.m142453Q(m174177R());
            ix60Var.m142454R(m174179T());
            ix60Var.m142444G(m174184Y(), m174161B(), m174162C(), m174163D(), m174171L(), m174172M(), m174173N(), m174177R(), m174178S(), m174179T(), m174180U(), m174181V());
            ix60Var.m142466c0(m174187b0(), m174185Z(), m174182W(), m174183X());
            ix60Var.m142461Y(m174197w());
            ix60Var.m142456T(m174186a0());
            ix60Var.m142464b0(m174167H());
            ix60Var.m142443F(m174194t());
            ix60Var.m142452P(m174198x());
            ix60Var.m142442E(m174193s(), m174192r(), getAct());
            ix60Var.m142457U(m174161B(), m174171L());
            ix60Var.m142459W(m174162C(), m174172M());
            ix60Var.m142458V(m174163D(), m174173N());
            ix60Var.m142445H(m174196v(), ix60Var.m142467d(), qa00.m175859d(330.0f), qa00.m175859d(382.0f));
            ix60Var.m142446I(m174195u(), userM116600p9.isFemale());
            ix60.m142435K(ix60Var, m174200z(), userM116600p9.isFemale(), false, 4, null);
            ix60Var.m142449M(m174164E());
            ix60Var.m142451O(m174165F());
            ix60Var.m142450N(m174166G());
        }
    }

    /* JADX INFO: renamed from: i */
    public static ViewPropertyAnimator m174154i(View view) {
        view.getClass();
        return view.animate().alpha(0.0f).setDuration(200L);
    }

    /* JADX INFO: renamed from: j */
    public static void m174155j(px60 px60Var, View view) {
        ix60.INSTANCE.m142476h0();
        if (px60Var.m175059g()) {
            pej0 pej0Var = px60Var.dialog;
            if (pej0Var == null) {
                Intrinsics.m88391r(OMSTemplateType.dialog);
                pej0Var = null;
            }
            pej0Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m174156k(px60 px60Var, View view) {
        px60Var.m174188d0(px60Var.m174169J());
        ix60 ix60Var = ix60.INSTANCE;
        ix60Var.m142449M(px60Var.m174174O());
        ix60Var.m142451O(px60Var.m174175P());
        ix60Var.m142450N(px60Var.m174176Q());
    }

    /* JADX INFO: renamed from: l */
    public static void m174157l(px60 px60Var, View view) {
        px60Var.m174188d0(px60Var.m174190p());
    }

    /* JADX INFO: renamed from: m */
    public static void m174158m(px60 px60Var, DialogInterface dialogInterface) {
        w1e.m204401e(px60Var.m175058f());
    }

    /* JADX INFO: renamed from: n */
    public static ViewPropertyAnimator m174159n(View view) {
        view.getClass();
        return view.animate().alpha(1.0f).setDuration(200L);
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final TextView m174160A() {
        TextView textView = this._activity_layout_root_layout_reward;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_activity_layout_root_layout_reward");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final TextView m174161B() {
        TextView textView = this._activity_layout_root_layout_reward_desc_reward_desc_1;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_activity_layout_root_layout_reward_desc_reward_desc_1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final TextView m174162C() {
        TextView textView = this._activity_layout_root_layout_reward_desc_reward_desc_2;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_activity_layout_root_layout_reward_desc_reward_desc_2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final TextView m174163D() {
        TextView textView = this._activity_layout_root_layout_reward_desc_reward_desc_3;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_activity_layout_root_layout_reward_desc_reward_desc_3");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final VDraweeView m174164E() {
        VDraweeView vDraweeView = this._activity_layout_root_layout_reward_desc_reward_img1;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_activity_layout_root_layout_reward_desc_reward_img1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final VDraweeView m174165F() {
        VDraweeView vDraweeView = this._activity_layout_root_layout_reward_desc_reward_img2;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_activity_layout_root_layout_reward_desc_reward_img2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final VDraweeView m174166G() {
        VDraweeView vDraweeView = this._activity_layout_root_layout_reward_desc_reward_img3;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_activity_layout_root_layout_reward_desc_reward_img3");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final TextView m174167H() {
        TextView textView = this._activity_layout_root_layout_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_activity_layout_root_layout_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final VFrame_Anim m174168I() {
        VFrame_Anim vFrame_Anim = this._root_layout;
        if (vFrame_Anim != null) {
            return vFrame_Anim;
        }
        Intrinsics.m88391r("_root_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final RoundLinearLayout m174169J() {
        RoundLinearLayout roundLinearLayout = this._rule_layout;
        if (roundLinearLayout != null) {
            return roundLinearLayout;
        }
        Intrinsics.m88391r("_rule_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final RoundLinearLayout m174170K() {
        RoundLinearLayout roundLinearLayout = this._rule_layout_root_layout;
        if (roundLinearLayout != null) {
            return roundLinearLayout;
        }
        Intrinsics.m88391r("_rule_layout_root_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final TextView m174171L() {
        TextView textView = this._rule_layout_root_layout_reward_desc_reward_desc_1;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_rule_layout_root_layout_reward_desc_reward_desc_1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final TextView m174172M() {
        TextView textView = this._rule_layout_root_layout_reward_desc_reward_desc_2;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_rule_layout_root_layout_reward_desc_reward_desc_2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final TextView m174173N() {
        TextView textView = this._rule_layout_root_layout_reward_desc_reward_desc_3;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_rule_layout_root_layout_reward_desc_reward_desc_3");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VDraweeView m174174O() {
        VDraweeView vDraweeView = this._rule_layout_root_layout_reward_desc_reward_img1;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_rule_layout_root_layout_reward_desc_reward_img1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final VDraweeView m174175P() {
        VDraweeView vDraweeView = this._rule_layout_root_layout_reward_desc_reward_img2;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_rule_layout_root_layout_reward_desc_reward_img2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VDraweeView m174176Q() {
        VDraweeView vDraweeView = this._rule_layout_root_layout_reward_desc_reward_img3;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_rule_layout_root_layout_reward_desc_reward_img3");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final TextView m174177R() {
        TextView textView = this._rule_layout_root_layout_rule_play_desc_1;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_rule_layout_root_layout_rule_play_desc_1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final TextView m174178S() {
        TextView textView = this._rule_layout_root_layout_rule_play_desc_2;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_rule_layout_root_layout_rule_play_desc_2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final TextView m174179T() {
        TextView textView = this._rule_layout_root_layout_rule_play_desc_3;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_rule_layout_root_layout_rule_play_desc_3");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final TextView m174180U() {
        TextView textView = this._rule_layout_root_layout_rule_play_desc_4;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_rule_layout_root_layout_rule_play_desc_4");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final TextView m174181V() {
        TextView textView = this._rule_layout_root_layout_rule_play_desc_5;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_rule_layout_root_layout_rule_play_desc_5");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final TextView m174182W() {
        TextView textView = this._rule_layout_root_layout_rule_play_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_rule_layout_root_layout_rule_play_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final TextView m174183X() {
        TextView textView = this._rule_layout_root_layout_rule_reward_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_rule_layout_root_layout_rule_reward_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final TextView m174184Y() {
        TextView textView = this._rule_layout_root_layout_rule_time_desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_rule_layout_root_layout_rule_time_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final TextView m174185Z() {
        TextView textView = this._rule_layout_root_layout_rule_time_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_rule_layout_root_layout_rule_time_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final VButton m174186a0() {
        VButton vButton = this._rule_layout_root_layout_top_back;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_rule_layout_root_layout_top_back");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final TextView m174187b0() {
        TextView textView = this._rule_layout_root_layout_top_rule_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_rule_layout_root_layout_top_rule_title");
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m174188d0(@NotNull View view) {
        view.getClass();
        m174168I().m224269C(view, new qcj() { // from class: l.nx60
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return px60.m174159n((View) obj);
            }
        }, new qcj() { // from class: l.ox60
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return px60.m174154i((View) obj);
            }
        });
    }

    @Override // p153l.q2m
    /* JADX INFO: renamed from: h */
    public void mo123016h() {
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(getAct());
        layoutInflaterM171370a.getClass();
        pej0 pej0Var = null;
        this.dialog = m175057e(getAct(), m174189o(layoutInflaterM171370a, null));
        m174153c0();
        pej0 pej0Var2 = this.dialog;
        if (pej0Var2 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            pej0Var2 = null;
        }
        pej0Var2.show();
        pej0 pej0Var3 = this.dialog;
        if (pej0Var3 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
        } else {
            pej0Var = pej0Var3;
        }
        pej0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.jx60
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                px60.m174158m(this.f123007a, dialogInterface);
            }
        });
        w1e.m204402f(m175058f());
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final View m174189o(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM178598b = qx60.m178598b(this, inflater, parent);
        viewM178598b.getClass();
        return viewM178598b;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final RoundRelativeLayout m174190p() {
        RoundRelativeLayout roundRelativeLayout = this._activity_layout;
        if (roundRelativeLayout != null) {
            return roundRelativeLayout;
        }
        Intrinsics.m88391r("_activity_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final RoundRelativeLayout m174191q() {
        RoundRelativeLayout roundRelativeLayout = this._activity_layout_root_layout;
        if (roundRelativeLayout != null) {
            return roundRelativeLayout;
        }
        Intrinsics.m88391r("_activity_layout_root_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final VButton m174192r() {
        VButton vButton = this._activity_layout_root_layout_bt;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_activity_layout_root_layout_bt");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final TextView m174193s() {
        TextView textView = this._activity_layout_root_layout_desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_activity_layout_root_layout_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final VImage m174194t() {
        VImage vImage = this._activity_layout_root_layout_desc_img;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_activity_layout_root_layout_desc_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VDraweeView m174195u() {
        VDraweeView vDraweeView = this._activity_layout_root_layout_image_container_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_activity_layout_root_layout_image_container_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VDraweeView m174196v() {
        VDraweeView vDraweeView = this._activity_layout_root_layout_image_container_img_bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_activity_layout_root_layout_image_container_img_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final TextView m174197w() {
        TextView textView = this._activity_layout_root_layout_image_container_rule;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_activity_layout_root_layout_image_container_rule");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VImage m174198x() {
        VImage vImage = this._activity_layout_root_layout_image_container_star_img;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_activity_layout_root_layout_image_container_star_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final VDraweeView m174199y() {
        VDraweeView vDraweeView = this._activity_layout_root_layout_img_bg_decoration;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_activity_layout_root_layout_img_bg_decoration");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final VDraweeView m174200z() {
        VDraweeView vDraweeView = this._activity_layout_root_layout_peg_tag;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_activity_layout_root_layout_peg_tag");
        return null;
    }
}
