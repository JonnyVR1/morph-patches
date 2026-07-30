package p002l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundLinearLayout;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundRelativeLayout;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundView;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.i0e;
import l.kp60;
import l.l5j0;
import l.o7r;
import l.t100;
import l.w9j;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VButton;
import v.VDraweeView;
import v.VFrame;
import v.VFrame_Anim;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bB\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010'\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010>\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010B\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010*\u001a\u0004\b@\u0010,\"\u0004\bA\u0010.R\"\u0010F\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010*\u001a\u0004\bD\u0010,\"\u0004\bE\u0010.R\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010Z\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010*\u001a\u0004\bX\u0010,\"\u0004\bY\u0010.R\"\u0010^\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010I\u001a\u0004\b\\\u0010K\"\u0004\b]\u0010MR\"\u0010a\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010Q\u001a\u0004\b_\u0010S\"\u0004\b`\u0010UR\"\u0010d\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010I\u001a\u0004\bb\u0010K\"\u0004\bc\u0010MR\"\u0010g\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010I\u001a\u0004\be\u0010K\"\u0004\bf\u0010MR\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010r\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010*\u001a\u0004\bp\u0010,\"\u0004\bq\u0010.R\"\u0010u\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010I\u001a\u0004\bs\u0010K\"\u0004\bt\u0010MR\"\u0010x\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010*\u001a\u0004\bv\u0010,\"\u0004\bw\u0010.R\"\u0010{\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010I\u001a\u0004\by\u0010K\"\u0004\bz\u0010MR\"\u0010~\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010*\u001a\u0004\b|\u0010,\"\u0004\b}\u0010.R$\u0010\u0081\u0001\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\bR\u0010I\u001a\u0004\b\u007f\u0010K\"\u0005\b\u0080\u0001\u0010MR(\u0010\u0087\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0005\b+\u0010\u0083\u0001\u001a\u0005\bi\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R)\u0010\u008e\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bX\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R)\u0010\u0091\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\be\u0010\u0089\u0001\u001a\u0006\b\u008f\u0001\u0010\u008b\u0001\"\u0006\b\u0090\u0001\u0010\u008d\u0001R%\u0010\u0094\u0001\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\bs\u00109\u001a\u0005\b\u0092\u0001\u0010;\"\u0005\b\u0093\u0001\u0010=R)\u0010\u0097\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\by\u0010\u0083\u0001\u001a\u0006\b\u0095\u0001\u0010\u0084\u0001\"\u0006\b\u0096\u0001\u0010\u0086\u0001R%\u0010\u009a\u0001\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u007f\u0010I\u001a\u0005\b\u0098\u0001\u0010K\"\u0005\b\u0099\u0001\u0010MR%\u0010\u009d\u0001\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\bp\u0010I\u001a\u0005\b\u009b\u0001\u0010K\"\u0005\b\u009c\u0001\u0010MR%\u0010 \u0001\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\bv\u0010I\u001a\u0005\b\u009e\u0001\u0010K\"\u0005\b\u009f\u0001\u0010MR%\u0010£\u0001\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b|\u0010I\u001a\u0005\b¡\u0001\u0010K\"\u0005\b¢\u0001\u0010MR%\u0010¦\u0001\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\\\u0010I\u001a\u0005\b¤\u0001\u0010K\"\u0005\b¥\u0001\u0010MR%\u0010©\u0001\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u0017\u0010I\u001a\u0005\b§\u0001\u0010K\"\u0005\b¨\u0001\u0010MR&\u0010¬\u0001\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010I\u001a\u0005\bª\u0001\u0010K\"\u0005\b«\u0001\u0010MR&\u0010¯\u0001\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008f\u0001\u0010I\u001a\u0005\b\u00ad\u0001\u0010K\"\u0005\b®\u0001\u0010MR&\u0010³\u0001\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b°\u0001\u0010I\u001a\u0005\b±\u0001\u0010K\"\u0005\b²\u0001\u0010MR&\u0010·\u0001\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b´\u0001\u0010I\u001a\u0005\bµ\u0001\u0010K\"\u0005\b¶\u0001\u0010MR&\u0010»\u0001\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¸\u0001\u0010j\u001a\u0005\b¹\u0001\u0010l\"\u0005\bº\u0001\u0010nR&\u0010¾\u0001\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¼\u0001\u0010*\u001a\u0005\b¼\u0001\u0010,\"\u0005\b½\u0001\u0010.R&\u0010Á\u0001\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¿\u0001\u0010I\u001a\u0005\b°\u0001\u0010K\"\u0005\bÀ\u0001\u0010MR&\u0010Ä\u0001\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÂ\u0001\u0010*\u001a\u0005\b¿\u0001\u0010,\"\u0005\bÃ\u0001\u0010.R&\u0010Æ\u0001\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¤\u0001\u0010I\u001a\u0005\b´\u0001\u0010K\"\u0005\bÅ\u0001\u0010MR&\u0010È\u0001\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b§\u0001\u0010*\u001a\u0005\bÂ\u0001\u0010,\"\u0005\bÇ\u0001\u0010.R&\u0010Ê\u0001\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bª\u0001\u0010I\u001a\u0005\b¸\u0001\u0010K\"\u0005\bÉ\u0001\u0010MR\u001a\u0010Í\u0001\u001a\u00030Ë\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u00ad\u0001\u0010Ì\u0001¨\u0006Î\u0001"}, d2 = {"Ll/jp60;", "Ll/wzl;", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "c0", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "o", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "h", "view", "d0", "(Landroid/view/View;)V", "Lv/VFrame_Anim;", "c", "Lv/VFrame_Anim;", "I", "()Lv/VFrame_Anim;", "set_root_layout", "(Lv/VFrame_Anim;)V", "_root_layout", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundRelativeLayout;", "d", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundRelativeLayout;", "p", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundRelativeLayout;", "set_activity_layout", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundRelativeLayout;)V", "_activity_layout", "e", "q", "set_activity_layout_root_layout", "_activity_layout_root_layout", "Lv/VDraweeView;", "f", "Lv/VDraweeView;", "y", "()Lv/VDraweeView;", "set_activity_layout_root_layout_img_bg_decoration", "(Lv/VDraweeView;)V", "_activity_layout_root_layout_img_bg_decoration", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundView;", "g", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundView;", "get_activity_layout_root_layout_top", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundView;", "set_activity_layout_root_layout_top", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundView;)V", "_activity_layout_root_layout_top", "Lv/VFrame;", "Lv/VFrame;", "get_activity_layout_root_layout_image_container", "()Lv/VFrame;", "set_activity_layout_root_layout_image_container", "(Lv/VFrame;)V", "_activity_layout_root_layout_image_container", "i", "v", "set_activity_layout_root_layout_image_container_img_bg", "_activity_layout_root_layout_image_container_img_bg", "j", "u", "set_activity_layout_root_layout_image_container_img", "_activity_layout_root_layout_image_container_img", "Landroid/widget/TextView;", "k", "Landroid/widget/TextView;", "w", "()Landroid/widget/TextView;", "set_activity_layout_root_layout_image_container_rule", "(Landroid/widget/TextView;)V", "_activity_layout_root_layout_image_container_rule", "Lv/VImage;", "l", "Lv/VImage;", "x", "()Lv/VImage;", "set_activity_layout_root_layout_image_container_star_img", "(Lv/VImage;)V", "_activity_layout_root_layout_image_container_star_img", "m", "z", "set_activity_layout_root_layout_peg_tag", "_activity_layout_root_layout_peg_tag", "n", "H", "set_activity_layout_root_layout_title", "_activity_layout_root_layout_title", "t", "set_activity_layout_root_layout_desc_img", "_activity_layout_root_layout_desc_img", "s", "set_activity_layout_root_layout_desc", "_activity_layout_root_layout_desc", "A", "set_activity_layout_root_layout_reward", "_activity_layout_root_layout_reward", "Lv/VLinear;", "r", "Lv/VLinear;", "get_activity_layout_root_layout_reward_desc", "()Lv/VLinear;", "set_activity_layout_root_layout_reward_desc", "(Lv/VLinear;)V", "_activity_layout_root_layout_reward_desc", "E", "set_activity_layout_root_layout_reward_desc_reward_img1", "_activity_layout_root_layout_reward_desc_reward_img1", "B", "set_activity_layout_root_layout_reward_desc_reward_desc_1", "_activity_layout_root_layout_reward_desc_reward_desc_1", "F", "set_activity_layout_root_layout_reward_desc_reward_img2", "_activity_layout_root_layout_reward_desc_reward_img2", "C", "set_activity_layout_root_layout_reward_desc_reward_desc_2", "_activity_layout_root_layout_reward_desc_reward_desc_2", "G", "set_activity_layout_root_layout_reward_desc_reward_img3", "_activity_layout_root_layout_reward_desc_reward_img3", "D", "set_activity_layout_root_layout_reward_desc_reward_desc_3", "_activity_layout_root_layout_reward_desc_reward_desc_3", "Lv/VButton;", "Lv/VButton;", "()Lv/VButton;", "set_activity_layout_root_layout_bt", "(Lv/VButton;)V", "_activity_layout_root_layout_bt", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundLinearLayout;", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundLinearLayout;", "J", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundLinearLayout;", "set_rule_layout", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundLinearLayout;)V", "_rule_layout", "K", "set_rule_layout_root_layout", "_rule_layout_root_layout", "get_rule_layout_root_layout_top", "set_rule_layout_root_layout_top", "_rule_layout_root_layout_top", "a0", "set_rule_layout_root_layout_top_back", "_rule_layout_root_layout_top_back", "b0", "set_rule_layout_root_layout_top_rule_title", "_rule_layout_root_layout_top_rule_title", "Z", "set_rule_layout_root_layout_rule_time_title", "_rule_layout_root_layout_rule_time_title", "Y", "set_rule_layout_root_layout_rule_time_desc", "_rule_layout_root_layout_rule_time_desc", "W", "set_rule_layout_root_layout_rule_play_title", "_rule_layout_root_layout_rule_play_title", "R", "set_rule_layout_root_layout_rule_play_desc_1", "_rule_layout_root_layout_rule_play_desc_1", "S", "set_rule_layout_root_layout_rule_play_desc_2", "_rule_layout_root_layout_rule_play_desc_2", "T", "set_rule_layout_root_layout_rule_play_desc_3", "_rule_layout_root_layout_rule_play_desc_3", "U", "set_rule_layout_root_layout_rule_play_desc_4", "_rule_layout_root_layout_rule_play_desc_4", "L", "V", "set_rule_layout_root_layout_rule_play_desc_5", "_rule_layout_root_layout_rule_play_desc_5", "M", "X", "set_rule_layout_root_layout_rule_reward_title", "_rule_layout_root_layout_rule_reward_title", "N", "get_rule_layout_root_layout_reward_desc", "set_rule_layout_root_layout_reward_desc", "_rule_layout_root_layout_reward_desc", "O", "set_rule_layout_root_layout_reward_desc_reward_img1", "_rule_layout_root_layout_reward_desc_reward_img1", "P", "set_rule_layout_root_layout_reward_desc_reward_desc_1", "_rule_layout_root_layout_reward_desc_reward_desc_1", "Q", "set_rule_layout_root_layout_reward_desc_reward_img2", "_rule_layout_root_layout_reward_desc_reward_img2", "set_rule_layout_root_layout_reward_desc_reward_desc_2", "_rule_layout_root_layout_reward_desc_reward_desc_2", "set_rule_layout_root_layout_reward_desc_reward_img3", "_rule_layout_root_layout_reward_desc_reward_img3", "set_rule_layout_root_layout_reward_desc_reward_desc_3", "_rule_layout_root_layout_reward_desc_reward_desc_3", "Ll/l5j0;", "Ll/l5j0;", "dialog", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class jp60 extends wzl {

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
    public l5j0 dialog;

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
    public jp60(@NotNull Act act) {
        super(act);
        act.getClass();
    }

    /* JADX INFO: renamed from: c0 */
    private final void m16106c0() {
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(userP9)) {
            xdl0.E0(m16146r(), new View.OnClickListener() { // from class: l.ep60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jp60.m16108j(this.f9901a, view);
                }
            });
            xdl0.E0(m16151w(), new View.OnClickListener() { // from class: l.fp60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jp60.m16109k(this.f10582a, view);
                }
            });
            xdl0.E0(m16139a0(), new View.OnClickListener() { // from class: l.gp60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jp60.m16110l(this.f11572a, view);
                }
            });
            cp60 cp60Var = cp60.INSTANCE;
            cp60Var.m11214C(m16145q());
            cp60Var.m11214C(m16123K());
            cp60Var.m11215D(m16153y());
            cp60Var.m11234X(m16113A(), getAct());
            cp60Var.m11229S(m16137Y());
            cp60Var.m11227Q(m16130R());
            cp60Var.m11228R(m16132T());
            cp60Var.m11218G(m16137Y(), m16114B(), m16115C(), m16116D(), m16124L(), m16125M(), m16126N(), m16130R(), m16131S(), m16132T(), m16133U(), m16134V());
            cp60Var.m11240c0(m16140b0(), m16138Z(), m16135W(), m16136X());
            cp60Var.m11235Y(m16151w());
            cp60Var.m11230T(m16139a0());
            cp60Var.m11238b0(m16120H());
            cp60Var.m11217F(m16148t());
            cp60Var.m11226P(m16152x());
            cp60Var.m11216E(m16147s(), m16146r(), getAct());
            cp60Var.m11231U(m16114B(), m16124L());
            cp60Var.m11233W(m16115C(), m16125M());
            cp60Var.m11232V(m16116D(), m16126N());
            cp60Var.m11219H(m16150v(), cp60Var.m11241d(), t100.d(330.0f), t100.d(382.0f));
            cp60Var.m11220I(m16149u(), userP9.isFemale());
            cp60.m11209K(cp60Var, m16154z(), userP9.isFemale(), false, 4, null);
            cp60Var.m11223M(m16117E());
            cp60Var.m11225O(m16118F());
            cp60Var.m11224N(m16119G());
        }
    }

    /* JADX INFO: renamed from: i */
    public static ViewPropertyAnimator m16107i(View view) {
        view.getClass();
        return view.animate().alpha(0.0f).setDuration(200L);
    }

    /* JADX INFO: renamed from: j */
    public static void m16108j(jp60 jp60Var, View view) {
        cp60.INSTANCE.m11250h0();
        if (jp60Var.m25563g()) {
            l5j0 l5j0Var = jp60Var.dialog;
            if (l5j0Var == null) {
                Intrinsics.r("dialog");
                l5j0Var = null;
            }
            l5j0Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m16109k(jp60 jp60Var, View view) {
        jp60Var.m16141d0(jp60Var.m16122J());
        cp60 cp60Var = cp60.INSTANCE;
        cp60Var.m11223M(jp60Var.m16127O());
        cp60Var.m11225O(jp60Var.m16128P());
        cp60Var.m11224N(jp60Var.m16129Q());
    }

    /* JADX INFO: renamed from: l */
    public static void m16110l(jp60 jp60Var, View view) {
        jp60Var.m16141d0(jp60Var.m16144p());
    }

    /* JADX INFO: renamed from: m */
    public static void m16111m(jp60 jp60Var, DialogInterface dialogInterface) {
        i0e.e(jp60Var.m25562f());
    }

    /* JADX INFO: renamed from: n */
    public static ViewPropertyAnimator m16112n(View view) {
        view.getClass();
        return view.animate().alpha(1.0f).setDuration(200L);
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final TextView m16113A() {
        TextView textView = this._activity_layout_root_layout_reward;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_activity_layout_root_layout_reward");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final TextView m16114B() {
        TextView textView = this._activity_layout_root_layout_reward_desc_reward_desc_1;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_activity_layout_root_layout_reward_desc_reward_desc_1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final TextView m16115C() {
        TextView textView = this._activity_layout_root_layout_reward_desc_reward_desc_2;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_activity_layout_root_layout_reward_desc_reward_desc_2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final TextView m16116D() {
        TextView textView = this._activity_layout_root_layout_reward_desc_reward_desc_3;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_activity_layout_root_layout_reward_desc_reward_desc_3");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final VDraweeView m16117E() {
        VDraweeView vDraweeView = this._activity_layout_root_layout_reward_desc_reward_img1;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_activity_layout_root_layout_reward_desc_reward_img1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final VDraweeView m16118F() {
        VDraweeView vDraweeView = this._activity_layout_root_layout_reward_desc_reward_img2;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_activity_layout_root_layout_reward_desc_reward_img2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final VDraweeView m16119G() {
        VDraweeView vDraweeView = this._activity_layout_root_layout_reward_desc_reward_img3;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_activity_layout_root_layout_reward_desc_reward_img3");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final TextView m16120H() {
        TextView textView = this._activity_layout_root_layout_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_activity_layout_root_layout_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final VFrame_Anim m16121I() {
        VFrame_Anim vFrame_Anim = this._root_layout;
        if (vFrame_Anim != null) {
            return vFrame_Anim;
        }
        Intrinsics.r("_root_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final RoundLinearLayout m16122J() {
        RoundLinearLayout roundLinearLayout = this._rule_layout;
        if (roundLinearLayout != null) {
            return roundLinearLayout;
        }
        Intrinsics.r("_rule_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final RoundLinearLayout m16123K() {
        RoundLinearLayout roundLinearLayout = this._rule_layout_root_layout;
        if (roundLinearLayout != null) {
            return roundLinearLayout;
        }
        Intrinsics.r("_rule_layout_root_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final TextView m16124L() {
        TextView textView = this._rule_layout_root_layout_reward_desc_reward_desc_1;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_rule_layout_root_layout_reward_desc_reward_desc_1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final TextView m16125M() {
        TextView textView = this._rule_layout_root_layout_reward_desc_reward_desc_2;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_rule_layout_root_layout_reward_desc_reward_desc_2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final TextView m16126N() {
        TextView textView = this._rule_layout_root_layout_reward_desc_reward_desc_3;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_rule_layout_root_layout_reward_desc_reward_desc_3");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VDraweeView m16127O() {
        VDraweeView vDraweeView = this._rule_layout_root_layout_reward_desc_reward_img1;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_rule_layout_root_layout_reward_desc_reward_img1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final VDraweeView m16128P() {
        VDraweeView vDraweeView = this._rule_layout_root_layout_reward_desc_reward_img2;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_rule_layout_root_layout_reward_desc_reward_img2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VDraweeView m16129Q() {
        VDraweeView vDraweeView = this._rule_layout_root_layout_reward_desc_reward_img3;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_rule_layout_root_layout_reward_desc_reward_img3");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final TextView m16130R() {
        TextView textView = this._rule_layout_root_layout_rule_play_desc_1;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_rule_layout_root_layout_rule_play_desc_1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final TextView m16131S() {
        TextView textView = this._rule_layout_root_layout_rule_play_desc_2;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_rule_layout_root_layout_rule_play_desc_2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final TextView m16132T() {
        TextView textView = this._rule_layout_root_layout_rule_play_desc_3;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_rule_layout_root_layout_rule_play_desc_3");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final TextView m16133U() {
        TextView textView = this._rule_layout_root_layout_rule_play_desc_4;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_rule_layout_root_layout_rule_play_desc_4");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final TextView m16134V() {
        TextView textView = this._rule_layout_root_layout_rule_play_desc_5;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_rule_layout_root_layout_rule_play_desc_5");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final TextView m16135W() {
        TextView textView = this._rule_layout_root_layout_rule_play_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_rule_layout_root_layout_rule_play_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final TextView m16136X() {
        TextView textView = this._rule_layout_root_layout_rule_reward_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_rule_layout_root_layout_rule_reward_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final TextView m16137Y() {
        TextView textView = this._rule_layout_root_layout_rule_time_desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_rule_layout_root_layout_rule_time_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final TextView m16138Z() {
        TextView textView = this._rule_layout_root_layout_rule_time_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_rule_layout_root_layout_rule_time_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final VButton m16139a0() {
        VButton vButton = this._rule_layout_root_layout_top_back;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_rule_layout_root_layout_top_back");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final TextView m16140b0() {
        TextView textView = this._rule_layout_root_layout_top_rule_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_rule_layout_root_layout_top_rule_title");
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m16141d0(@NotNull View view) {
        view.getClass();
        m16121I().C(view, new w9j() { // from class: l.hp60
            public final Object call(Object obj) {
                return jp60.m16112n((View) obj);
            }
        }, new w9j() { // from class: l.ip60
            public final Object call(Object obj) {
                return jp60.m16107i((View) obj);
            }
        });
    }

    @Override // p002l.wzl
    /* JADX INFO: renamed from: h */
    public void mo16142h() {
        LayoutInflater layoutInflaterA = o7r.a(getAct());
        layoutInflaterA.getClass();
        Dialog dialog = null;
        this.dialog = m25561e(getAct(), m16143o(layoutInflaterA, null));
        m16106c0();
        Dialog dialog2 = this.dialog;
        if (dialog2 == null) {
            Intrinsics.r("dialog");
            dialog2 = null;
        }
        dialog2.show();
        Dialog dialog3 = this.dialog;
        if (dialog3 == null) {
            Intrinsics.r("dialog");
        } else {
            dialog = dialog3;
        }
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.dp60
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                jp60.m16111m(this.f9379a, dialogInterface);
            }
        });
        i0e.f(m25562f());
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final View m16143o(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = kp60.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final RoundRelativeLayout m16144p() {
        RoundRelativeLayout roundRelativeLayout = this._activity_layout;
        if (roundRelativeLayout != null) {
            return roundRelativeLayout;
        }
        Intrinsics.r("_activity_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final RoundRelativeLayout m16145q() {
        RoundRelativeLayout roundRelativeLayout = this._activity_layout_root_layout;
        if (roundRelativeLayout != null) {
            return roundRelativeLayout;
        }
        Intrinsics.r("_activity_layout_root_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final VButton m16146r() {
        VButton vButton = this._activity_layout_root_layout_bt;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_activity_layout_root_layout_bt");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final TextView m16147s() {
        TextView textView = this._activity_layout_root_layout_desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_activity_layout_root_layout_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final VImage m16148t() {
        VImage vImage = this._activity_layout_root_layout_desc_img;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_activity_layout_root_layout_desc_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VDraweeView m16149u() {
        VDraweeView vDraweeView = this._activity_layout_root_layout_image_container_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_activity_layout_root_layout_image_container_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VDraweeView m16150v() {
        VDraweeView vDraweeView = this._activity_layout_root_layout_image_container_img_bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_activity_layout_root_layout_image_container_img_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final TextView m16151w() {
        TextView textView = this._activity_layout_root_layout_image_container_rule;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_activity_layout_root_layout_image_container_rule");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VImage m16152x() {
        VImage vImage = this._activity_layout_root_layout_image_container_star_img;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_activity_layout_root_layout_image_container_star_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final VDraweeView m16153y() {
        VDraweeView vDraweeView = this._activity_layout_root_layout_img_bg_decoration;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_activity_layout_root_layout_img_bg_decoration");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final VDraweeView m16154z() {
        VDraweeView vDraweeView = this._activity_layout_root_layout_peg_tag;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_activity_layout_root_layout_peg_tag");
        return null;
    }
}
