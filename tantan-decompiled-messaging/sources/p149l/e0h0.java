package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.data.Dimensions;
import com.p046p1.mobile.putong.core.data.IdealTypes;
import com.p046p1.mobile.putong.core.data.PrivateCustomSetting;
import com.p046p1.mobile.putong.core.newui.supreme.SupremeCustomAct;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b>\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 Ù\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u0014J\u0015\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u000b¢\u0006\u0004\b&\u0010\"J\u0015\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010/¢\u0006\u0004\b0\u0010*J\u0015\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010/¢\u0006\u0004\b2\u0010*R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010J\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u00109\u001a\u0004\bH\u0010;\"\u0004\bI\u0010=R\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010^\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010U\u001a\u0004\b\\\u0010W\"\u0004\b]\u0010YR\"\u0010b\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010U\u001a\u0004\b`\u0010W\"\u0004\ba\u0010YR\"\u0010f\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010U\u001a\u0004\bd\u0010W\"\u0004\be\u0010YR\"\u0010i\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010U\u001a\u0004\bg\u0010W\"\u0004\bh\u0010YR\"\u0010l\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010M\u001a\u0004\bj\u0010O\"\u0004\bk\u0010QR\"\u0010o\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010M\u001a\u0004\bm\u0010O\"\u0004\bn\u0010QR\"\u0010r\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u0010M\u001a\u0004\bp\u0010O\"\u0004\bq\u0010QR\"\u0010u\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00109\u001a\u0004\bs\u0010;\"\u0004\bt\u0010=R\"\u0010y\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010U\u001a\u0004\bw\u0010W\"\u0004\bx\u0010YR\"\u0010|\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u0010U\u001a\u0004\bz\u0010W\"\u0004\b{\u0010YR'\u0010\u0084\u0001\u001a\u00020}8\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R%\u0010\u0087\u0001\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b&\u0010A\u001a\u0005\b\u0085\u0001\u0010C\"\u0005\b\u0086\u0001\u0010ER%\u0010\u008a\u0001\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b)\u0010U\u001a\u0005\b\u0088\u0001\u0010W\"\u0005\b\u0089\u0001\u0010YR%\u0010\u008d\u0001\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b,\u0010U\u001a\u0005\b\u008b\u0001\u0010W\"\u0005\b\u008c\u0001\u0010YR&\u0010\u0091\u0001\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010U\u001a\u0005\b\u008f\u0001\u0010W\"\u0005\b\u0090\u0001\u0010YR*\u0010\u0099\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R&\u0010\u009d\u0001\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009a\u0001\u0010U\u001a\u0005\b\u009b\u0001\u0010W\"\u0005\b\u009c\u0001\u0010YR)\u0010 \u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bB\u0010\u0094\u0001\u001a\u0006\b\u009e\u0001\u0010\u0096\u0001\"\u0006\b\u009f\u0001\u0010\u0098\u0001R&\u0010£\u0001\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0095\u0001\u0010U\u001a\u0005\b¡\u0001\u0010W\"\u0005\b¢\u0001\u0010YR*\u0010¥\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u0094\u0001\u001a\u0006\b\u008e\u0001\u0010\u0096\u0001\"\u0006\b¤\u0001\u0010\u0098\u0001R&\u0010©\u0001\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¦\u0001\u0010U\u001a\u0005\b§\u0001\u0010W\"\u0005\b¨\u0001\u0010YR*\u0010«\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0094\u0001\u001a\u0006\b¦\u0001\u0010\u0096\u0001\"\u0006\bª\u0001\u0010\u0098\u0001R&\u0010®\u0001\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009b\u0001\u00109\u001a\u0005\b¬\u0001\u0010;\"\u0005\b\u00ad\u0001\u0010=R&\u0010²\u0001\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¯\u0001\u0010M\u001a\u0005\b°\u0001\u0010O\"\u0005\b±\u0001\u0010QR&\u0010µ\u0001\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¡\u0001\u0010U\u001a\u0005\b³\u0001\u0010W\"\u0005\b´\u0001\u0010YR&\u0010¸\u0001\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b§\u0001\u0010U\u001a\u0005\b¶\u0001\u0010W\"\u0005\b·\u0001\u0010YR&\u0010»\u0001\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010U\u001a\u0005\b¹\u0001\u0010W\"\u0005\bº\u0001\u0010YR&\u0010¾\u0001\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010U\u001a\u0005\b¼\u0001\u0010W\"\u0005\b½\u0001\u0010YR&\u0010Á\u0001\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010U\u001a\u0005\b¿\u0001\u0010W\"\u0005\bÀ\u0001\u0010YR&\u0010Ä\u0001\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¬\u0001\u0010M\u001a\u0005\bÂ\u0001\u0010O\"\u0005\bÃ\u0001\u0010QR&\u0010Ç\u0001\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¶\u0001\u0010M\u001a\u0005\bÅ\u0001\u0010O\"\u0005\bÆ\u0001\u0010QR&\u0010Ê\u0001\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b°\u0001\u0010M\u001a\u0005\bÈ\u0001\u0010O\"\u0005\bÉ\u0001\u0010QR&\u0010Ì\u0001\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÈ\u0001\u0010U\u001a\u0005\b\u0093\u0001\u0010W\"\u0005\bË\u0001\u0010YR&\u0010Î\u0001\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÂ\u0001\u0010M\u001a\u0005\b\u009a\u0001\u0010O\"\u0005\bÍ\u0001\u0010QR\u0019\u0010Ð\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÅ\u0001\u0010Ï\u0001R\u001c\u0010Ó\u0001\u001a\u0005\u0018\u00010Ñ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010Ò\u0001R\u001b\u0010Õ\u0001\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010Ô\u0001R&\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0006\b¹\u0001\u0010Ö\u0001\u001a\u0005\b~\u0010×\u0001\"\u0005\bØ\u0001\u0010\u0017¨\u0006Ú\u0001"}, m87232d2 = {"Ll/e0h0;", "Ll/s7m;", "Ll/ri2;", "Lcom/p1/mobile/putong/core/newui/supreme/SupremeCustomAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/newui/supreme/SupremeCustomAct;)V", "Landroid/widget/LinearLayout;", "linearLayout", "Lcom/p1/mobile/putong/core/data/Dimensions;", Dimensions.TYPE, "", "e0", "(Landroid/widget/LinearLayout;Lcom/p1/mobile/putong/core/data/Dimensions;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "j", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", BLiveStormDanmakuGiftResourceType.f44444l, "(Ll/ri2;)V", "Ll/y4;", "uiAdapter", "k", "(Ll/y4;)V", "inflateView", "", "step", "i0", "(I)V", "destroy", "()V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", "", "", BLiveStormDanmakuGiftResourceType.f44446s, "()Ljava/util/List;", "Lcom/p1/mobile/putong/core/data/PrivateCustomSetting;", Constants.KEY_T, "h0", "(Lcom/p1/mobile/putong/core/data/PrivateCustomSetting;)V", "", "n", "Lcom/p1/mobile/putong/core/data/IdealTypes;", "p", "a", "Lcom/p1/mobile/putong/core/newui/supreme/SupremeCustomAct;", "m", "()Lcom/p1/mobile/putong/core/newui/supreme/SupremeCustomAct;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "b", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_container", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_container", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_container", "Landroid/widget/RelativeLayout;", "c", "Landroid/widget/RelativeLayout;", BaseSei.f13930X, "()Landroid/widget/RelativeLayout;", "set_container_content_layout", "(Landroid/widget/RelativeLayout;)V", "_container_content_layout", Constants.INAPP_DATA_TAG, j6f.GPS_DIRECTION_TRUE, "set_container_step_hello", "_container_step_hello", "Lv/VImage;", "e", "Lv/VImage;", j6f.GPS_MEASUREMENT_INTERRUPTED, "()Lv/VImage;", "set_container_step_hello_crown", "(Lv/VImage;)V", "_container_step_hello_crown", "Lv/VText;", "f", "Lv/VText;", "Z", "()Lv/VText;", "set_container_step_hello_title", "(Lv/VText;)V", "_container_step_hello_title", "g", "U", "set_container_step_hello_content", "_container_step_hello_content", "h", "Y", "set_container_step_hello_mid_title", "_container_step_hello_mid_title", RXScreenCaptureService.KEY_INDEX, "W", "set_container_step_hello_mid_content1", "_container_step_hello_mid_content1", "X", "set_container_step_hello_mid_content2", "_container_step_hello_mid_content2", "get_container_step_hello_decorate_left", "set_container_step_hello_decorate_left", "_container_step_hello_decorate_left", "get_container_step_hello_decorate_right", "set_container_step_hello_decorate_right", "_container_step_hello_decorate_right", "get_container_step_hello_line", "set_container_step_hello_line", "_container_step_hello_line", "a0", "set_container_step_nine_pic", "_container_step_nine_pic", "o", "d0", "set_container_step_nine_pic_step2_mid_title", "_container_step_nine_pic_step2_mid_title", "c0", "set_container_step_nine_pic_step2_mid_content", "_container_step_nine_pic_step2_mid_content", "Landroidx/recyclerview/widget/RecyclerView;", "q", "Landroidx/recyclerview/widget/RecyclerView;", "b0", "()Landroidx/recyclerview/widget/RecyclerView;", "set_container_step_nine_pic_recycle_view", "(Landroidx/recyclerview/widget/RecyclerView;)V", "_container_step_nine_pic_recycle_view", "I", "set_container_step_custom_personality", "_container_step_custom_personality", "H", "set_container_step3_mid_title", "_container_step3_mid_title", "G", "set_container_step3_mid_content", "_container_step3_mid_content", "u", "B", "set_container_setp3_title1", "_container_setp3_title1", "Lv/VLinear;", ResourceDirection.f38808v, "Lv/VLinear;", BaseSei.f13931Y, "()Lv/VLinear;", "set_container_enthusiasm_layout", "(Lv/VLinear;)V", "_container_enthusiasm_layout", "w", b2s.C_ZONE, "set_container_setp3_title2", "_container_setp3_title2", BaseSei.f13932Z, "set_container_friendship_layout", "_container_friendship_layout", "E", "set_container_setp3_title3", "_container_setp3_title3", "set_container_appearance_layout", "_container_appearance_layout", "A", "F", "set_container_setp3_title4", "_container_setp3_title4", "set_container_profile_layout", "_container_profile_layout", "J", "set_container_step_finish", "_container_step_finish", "D", "L", "set_container_step_finish_step4_crown", "_container_step_finish_step4_crown", j6f.LATITUDE_SOUTH, "set_container_step_finish_step4_title", "_container_step_finish_step4_title", "K", "set_container_step_finish_step4_content", "_container_step_finish_step4_content", "R", "set_container_step_finish_step4_mid_title", "_container_step_finish_step4_mid_title", "P", "set_container_step_finish_step4_mid_content1", "_container_step_finish_step4_mid_content1", "Q", "set_container_step_finish_step4_mid_content2", "_container_step_finish_step4_mid_content2", "N", "set_container_step_finish_step4_decorate_left", "_container_step_finish_step4_decorate_left", BloodType.f38728O, "set_container_step_finish_step4_decorate_right", "_container_step_finish_step4_decorate_right", "M", "set_container_step_finish_step4_decorate_bottom_star_line", "_container_step_finish_step4_decorate_bottom_star_line", "set_container_btn", "_container_btn", "set_container_close", "_container_close", "Ll/y4;", "customUiAdapter", "Ll/nzg0;", "Ll/nzg0;", "customModelAdapter", "Lcom/p1/mobile/putong/core/data/PrivateCustomSetting;", "privateCustomSetting", "Ll/ri2;", "()Ll/ri2;", "g0", "Companion", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class e0h0 implements s7m<ri2> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public VText _container_setp3_title4;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public VLinear _container_profile_layout;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ConstraintLayout _container_step_finish;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public VImage _container_step_finish_step4_crown;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public VText _container_step_finish_step4_title;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public VText _container_step_finish_step4_content;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public VText _container_step_finish_step4_mid_title;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public VText _container_step_finish_step4_mid_content1;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public VText _container_step_finish_step4_mid_content2;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public VImage _container_step_finish_step4_decorate_left;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public VImage _container_step_finish_step4_decorate_right;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public VImage _container_step_finish_step4_decorate_bottom_star_line;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public VText _container_btn;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public VImage _container_close;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public AbstractC21304y4 customUiAdapter;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @Nullable
    public nzg0 customModelAdapter;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @Nullable
    public PrivateCustomSetting privateCustomSetting;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public ri2 presenter;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SupremeCustomAct act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public ConstraintLayout _container;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public RelativeLayout _container_content_layout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ConstraintLayout _container_step_hello;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VImage _container_step_hello_crown;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _container_step_hello_title;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _container_step_hello_content;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _container_step_hello_mid_title;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _container_step_hello_mid_content1;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _container_step_hello_mid_content2;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VImage _container_step_hello_decorate_left;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VImage _container_step_hello_decorate_right;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VImage _container_step_hello_line;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public ConstraintLayout _container_step_nine_pic;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VText _container_step_nine_pic_step2_mid_title;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VText _container_step_nine_pic_step2_mid_content;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public RecyclerView _container_step_nine_pic_recycle_view;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public RelativeLayout _container_step_custom_personality;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public VText _container_step3_mid_title;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public VText _container_step3_mid_content;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public VText _container_setp3_title1;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public VLinear _container_enthusiasm_layout;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public VText _container_setp3_title2;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public VLinear _container_friendship_layout;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public VText _container_setp3_title3;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public VLinear _container_appearance_layout;

    /* JADX INFO: renamed from: l.e0h0$b */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {"l/e0h0$b", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C16515b extends GridLayoutManager.AbstractC0553c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int position) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.e0h0$c */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/e0h0$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C16516c extends AnimatorListenerAdapter {
        public C16516c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            super.onAnimationEnd(animation);
            xdl0.m208344M(e0h0.this.m114208T(), false);
        }
    }

    public e0h0(@NotNull SupremeCustomAct supremeCustomAct) {
        supremeCustomAct.getClass();
        this.act = supremeCustomAct;
    }

    /* JADX INFO: renamed from: a */
    public static void m114182a(LinearLayout linearLayout, Dimensions dimensions, e0h0 e0h0Var, View view) {
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            childAt.getClass();
            VText vText = (VText) childAt;
            AbstractC21304y4 abstractC21304y4 = null;
            if (Intrinsics.m87488d(vText, view)) {
                if (dimensions != null) {
                    dimensions.value = i;
                }
                vText.getPaint().setFakeBoldText(true);
                AbstractC21304y4 abstractC21304y5 = e0h0Var.customUiAdapter;
                if (abstractC21304y5 == null) {
                    Intrinsics.m87502r("customUiAdapter");
                    abstractC21304y5 = null;
                }
                vText.setTextColor(abstractC21304y5.mo152586c(true));
                AbstractC21304y4 abstractC21304y6 = e0h0Var.customUiAdapter;
                if (abstractC21304y6 == null) {
                    Intrinsics.m87502r("customUiAdapter");
                } else {
                    abstractC21304y4 = abstractC21304y6;
                }
                vText.setBackground(abstractC21304y4.mo152585b());
                vText.invalidate();
            } else {
                AbstractC21304y4 abstractC21304y7 = e0h0Var.customUiAdapter;
                if (abstractC21304y7 == null) {
                    Intrinsics.m87502r("customUiAdapter");
                    abstractC21304y7 = null;
                }
                vText.setTextColor(abstractC21304y7.mo152586c(false));
                vText.setBackground(null);
                vText.getPaint().setFakeBoldText(false);
                vText.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m114183b(e0h0 e0h0Var, View view) {
        e0h0Var.m114229q().mo179471e0(Boolean.TRUE);
        zvf0.m220396r("e_custom_set_complete", "p_custom_set_pop");
    }

    /* JADX INFO: renamed from: c */
    public static void m114184c(e0h0 e0h0Var, View view) {
        e0h0Var.m114222i0(2);
        zvf0.m220396r("e_custom_set_start", "p_custom_set_pop");
    }

    /* JADX INFO: renamed from: d */
    public static void m114185d(e0h0 e0h0Var, View view) {
        e0h0Var.m114222i0(3);
    }

    /* JADX INFO: renamed from: f */
    public static void m114187f(e0h0 e0h0Var, View view) {
        ri2.m179470f0(e0h0Var.m114229q(), null, 1, null);
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m114188f0(e0h0 e0h0Var, Boolean bool) {
        VText vTextM114233v = e0h0Var.m114233v();
        bool.getClass();
        vTextM114233v.setClickable(bool.booleanValue());
        AbstractC21304y4 abstractC21304y4 = null;
        if (bool.booleanValue()) {
            VText vTextM114233v2 = e0h0Var.m114233v();
            AbstractC21304y4 abstractC21304y5 = e0h0Var.customUiAdapter;
            if (abstractC21304y5 == null) {
                Intrinsics.m87502r("customUiAdapter");
            } else {
                abstractC21304y4 = abstractC21304y5;
            }
            vTextM114233v2.setTextColor(abstractC21304y4.mo152584a(true));
            return;
        }
        VText vTextM114233v3 = e0h0Var.m114233v();
        AbstractC21304y4 abstractC21304y6 = e0h0Var.customUiAdapter;
        if (abstractC21304y6 == null) {
            Intrinsics.m87502r("customUiAdapter");
        } else {
            abstractC21304y4 = abstractC21304y6;
        }
        vTextM114233v3.setTextColor(abstractC21304y4.mo152584a(false));
    }

    /* JADX INFO: renamed from: i */
    public static void m114189i(e0h0 e0h0Var, View view) {
        e0h0Var.m114222i0(4);
        e0h0Var.m114229q().mo179476k0();
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final VLinear m114190A() {
        VLinear vLinear = this._container_profile_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_container_profile_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final VText m114191B() {
        VText vText = this._container_setp3_title1;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_container_setp3_title1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final VText m114192C() {
        VText vText = this._container_setp3_title2;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_container_setp3_title2");
        return null;
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final VText m114193E() {
        VText vText = this._container_setp3_title3;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_container_setp3_title3");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final VText m114194F() {
        VText vText = this._container_setp3_title4;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_container_setp3_title4");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final VText m114195G() {
        VText vText = this._container_step3_mid_content;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_container_step3_mid_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final VText m114196H() {
        VText vText = this._container_step3_mid_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_container_step3_mid_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final RelativeLayout m114197I() {
        RelativeLayout relativeLayout = this._container_step_custom_personality;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m87502r("_container_step_custom_personality");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final ConstraintLayout m114198J() {
        ConstraintLayout constraintLayout = this._container_step_finish;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_container_step_finish");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final VText m114199K() {
        VText vText = this._container_step_finish_step4_content;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_container_step_finish_step4_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final VImage m114200L() {
        VImage vImage = this._container_step_finish_step4_crown;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_container_step_finish_step4_crown");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final VImage m114201M() {
        VImage vImage = this._container_step_finish_step4_decorate_bottom_star_line;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_container_step_finish_step4_decorate_bottom_star_line");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final VImage m114202N() {
        VImage vImage = this._container_step_finish_step4_decorate_left;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_container_step_finish_step4_decorate_left");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VImage m114203O() {
        VImage vImage = this._container_step_finish_step4_decorate_right;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_container_step_finish_step4_decorate_right");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final VText m114204P() {
        VText vText = this._container_step_finish_step4_mid_content1;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_container_step_finish_step4_mid_content1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VText m114205Q() {
        VText vText = this._container_step_finish_step4_mid_content2;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_container_step_finish_step4_mid_content2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final VText m114206R() {
        VText vText = this._container_step_finish_step4_mid_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_container_step_finish_step4_mid_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VText m114207S() {
        VText vText = this._container_step_finish_step4_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_container_step_finish_step4_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final ConstraintLayout m114208T() {
        ConstraintLayout constraintLayout = this._container_step_hello;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_container_step_hello");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final VText m114209U() {
        VText vText = this._container_step_hello_content;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_container_step_hello_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VImage m114210V() {
        VImage vImage = this._container_step_hello_crown;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_container_step_hello_crown");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VText m114211W() {
        VText vText = this._container_step_hello_mid_content1;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_container_step_hello_mid_content1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final VText m114212X() {
        VText vText = this._container_step_hello_mid_content2;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_container_step_hello_mid_content2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final VText m114213Y() {
        VText vText = this._container_step_hello_mid_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_container_step_hello_mid_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VText m114214Z() {
        VText vText = this._container_step_hello_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_container_step_hello_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final ConstraintLayout m114215a0() {
        ConstraintLayout constraintLayout = this._container_step_nine_pic;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_container_step_nine_pic");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final RecyclerView m114216b0() {
        RecyclerView recyclerView = this._container_step_nine_pic_recycle_view;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m87502r("_container_step_nine_pic_recycle_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VText m114217c0() {
        VText vText = this._container_step_nine_pic_step2_mid_content;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_container_step_nine_pic_step2_mid_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final VText m114218d0() {
        VText vText = this._container_step_nine_pic_step2_mid_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_container_step_nine_pic_step2_mid_title");
        return null;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m114219e0(final LinearLayout linearLayout, final Dimensions dimensions) {
        Integer numValueOf = (dimensions != null ? dimensions.value : 0) > 3 ? 3 : dimensions != null ? Integer.valueOf(dimensions.value) : null;
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"低", "一般", "高", "很高"});
        linearLayout.removeAllViews();
        for (int i = 0; i < 4; i++) {
            VText vText = new VText(this.act);
            vText.setGravity(17);
            vText.setTextSize(12.0f);
            vText.setText((CharSequence) listListOf.get(i));
            ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
            if (numValueOf != null && i == numValueOf.intValue()) {
                AbstractC21304y4 abstractC21304y4 = this.customUiAdapter;
                if (abstractC21304y4 == null) {
                    Intrinsics.m87502r("customUiAdapter");
                    abstractC21304y4 = null;
                }
                vText.setTextColor(abstractC21304y4.mo152586c(true));
                vText.getPaint().setFakeBoldText(true);
                AbstractC21304y4 abstractC21304y5 = this.customUiAdapter;
                if (abstractC21304y5 == null) {
                    Intrinsics.m87502r("customUiAdapter");
                    abstractC21304y5 = null;
                }
                vText.setBackground(abstractC21304y5.mo152585b());
                vText.invalidate();
            } else {
                vText.getPaint().setFakeBoldText(false);
                AbstractC21304y4 abstractC21304y6 = this.customUiAdapter;
                if (abstractC21304y6 == null) {
                    Intrinsics.m87502r("customUiAdapter");
                    abstractC21304y6 = null;
                }
                vText.setTextColor(abstractC21304y6.mo152586c(false));
                vText.invalidate();
            }
            vText.setOnClickListener(new View.OnClickListener() { // from class: l.d0h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e0h0.m114182a(linearLayout, dimensions, this, view);
                }
            });
            linearLayout.addView(vText, layoutParams);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m114220g0(@NotNull ri2 ri2Var) {
        ri2Var.getClass();
        this.presenter = ri2Var;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m114221h0(@NotNull PrivateCustomSetting t) {
        AbstractC21304y4 abstractC21304y4;
        List<Dimensions> list;
        List<Dimensions> list2;
        Dimensions dimensions;
        List<Dimensions> list3;
        List<Dimensions> list4;
        t.getClass();
        this.privateCustomSetting = t;
        xdl0.m208329E0(m114233v(), new View.OnClickListener() { // from class: l.c0h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e0h0.m114184c(this.f78152a, view);
            }
        });
        nzg0 nzg0Var = this.customModelAdapter;
        if (nzg0Var != null) {
            List<IdealTypes> list5 = t.idealTypes;
            list5.getClass();
            nzg0Var.m162047L(list5);
        }
        nzg0 nzg0Var2 = this.customModelAdapter;
        if (nzg0Var2 != null) {
            nzg0Var2.notifyDataSetChanged();
        }
        List listListOf = CollectionsKt.listOf((Object[]) new VText[]{m114191B(), m114192C(), m114193E(), m114194F()});
        List listListOf2 = CollectionsKt.listOf((Object[]) new VLinear[]{m114236y(), m114237z(), m114232u(), m114190A()});
        PrivateCustomSetting privateCustomSetting = this.privateCustomSetting;
        int size = 4;
        if (((privateCustomSetting == null || (list4 = privateCustomSetting.dimensions) == null) ? 0 : list4.size()) <= 4) {
            PrivateCustomSetting privateCustomSetting2 = this.privateCustomSetting;
            size = (privateCustomSetting2 == null || (list3 = privateCustomSetting2.dimensions) == null) ? 0 : list3.size();
        }
        int size2 = listListOf2.size();
        int i = 0;
        while (true) {
            abstractC21304y4 = null;
            dimensions = null;
            Dimensions dimensions2 = null;
            if (i >= size2) {
                break;
            }
            VText vText = (VText) listListOf.get(i);
            VLinear vLinear = (VLinear) listListOf2.get(i);
            if (i >= size) {
                xdl0.m208344M(vText, false);
                xdl0.m208344M(vLinear, false);
            } else {
                xdl0.m208344M(vText, true);
                xdl0.m208344M(vLinear, true);
                PrivateCustomSetting privateCustomSetting3 = this.privateCustomSetting;
                vText.setText((privateCustomSetting3 == null || (list2 = privateCustomSetting3.dimensions) == null || (dimensions = list2.get(i)) == null) ? null : dimensions.key);
                PrivateCustomSetting privateCustomSetting4 = this.privateCustomSetting;
                if (privateCustomSetting4 != null && (list = privateCustomSetting4.dimensions) != null) {
                    dimensions2 = list.get(i);
                }
                m114219e0(vLinear, dimensions2);
            }
            i++;
        }
        AbstractC21304y4 abstractC21304y5 = this.customUiAdapter;
        if (abstractC21304y5 == null) {
            Intrinsics.m87502r("customUiAdapter");
        } else {
            abstractC21304y4 = abstractC21304y5;
        }
        abstractC21304y4.mo152589g();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m114222i0(int step) {
        if (step == 1) {
            xdl0.m208344M(m114208T(), true);
            xdl0.m208344M(m114215a0(), false);
            xdl0.m208344M(m114197I(), false);
            xdl0.m208344M(m114198J(), false);
            m114233v().setText("开始私人定制");
            return;
        }
        AbstractC21304y4 abstractC21304y4 = null;
        if (step != 2) {
            if (step == 3) {
                xdl0.m208344M(m114208T(), false);
                xdl0.m208344M(m114215a0(), false);
                xdl0.m208344M(m114197I(), true);
                xdl0.m208344M(m114198J(), false);
                xdl0.m208329E0(m114233v(), new View.OnClickListener() { // from class: l.yzg0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        e0h0.m114189i(this.f200886a, view);
                    }
                });
                m114233v().setText("完成定制");
                return;
            }
            if (step != 4) {
                xdl0.m208344M(m114208T(), true);
                xdl0.m208344M(m114215a0(), false);
                xdl0.m208344M(m114197I(), false);
                xdl0.m208344M(m114198J(), false);
                return;
            }
            zvf0.m220402x("e_custom_set_complete", "p_custom_set_pop");
            xdl0.m208344M(m114208T(), false);
            xdl0.m208344M(m114215a0(), false);
            xdl0.m208344M(m114197I(), false);
            xdl0.m208344M(m114198J(), true);
            xdl0.m208329E0(m114233v(), new View.OnClickListener() { // from class: l.zzg0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e0h0.m114183b(this.f205799a, view);
                }
            });
            VText vTextM114233v = m114233v();
            AbstractC21304y4 abstractC21304y5 = this.customUiAdapter;
            if (abstractC21304y5 == null) {
                Intrinsics.m87502r("customUiAdapter");
            } else {
                abstractC21304y4 = abstractC21304y5;
            }
            vTextM114233v.setText(abstractC21304y4.mo152587d());
            xdl0.m208344M(m114234w(), false);
            return;
        }
        xdl0.m208344M(m114208T(), false);
        xdl0.m208344M(m114215a0(), true);
        xdl0.m208344M(m114197I(), false);
        xdl0.m208344M(m114198J(), false);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(m114216b0(), "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.getClass();
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(m114216b0(), "translationY", svq.m186103c(50) * 1.0f, 0.0f);
        objectAnimatorOfFloat2.getClass();
        animatorSet.addListener(new C16516c());
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(400L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.start();
        xdl0.m208329E0(m114233v(), new View.OnClickListener() { // from class: l.xzg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e0h0.m114185d(this.f195200a, view);
            }
        });
        m114233v().setText("下一步");
        PrivateCustomSetting privateCustomSetting = this.privateCustomSetting;
        if (privateCustomSetting == null || !privateCustomSetting.hasIdealTypesSelected()) {
            m114233v().setClickable(false);
            VText vTextM114233v2 = m114233v();
            AbstractC21304y4 abstractC21304y6 = this.customUiAdapter;
            if (abstractC21304y6 == null) {
                Intrinsics.m87502r("customUiAdapter");
            } else {
                abstractC21304y4 = abstractC21304y6;
            }
            vTextM114233v2.setTextColor(abstractC21304y4.mo152584a(false));
            return;
        }
        m114233v().setClickable(true);
        VText vTextM114233v3 = m114233v();
        AbstractC21304y4 abstractC21304y7 = this.customUiAdapter;
        if (abstractC21304y7 == null) {
            Intrinsics.m87502r("customUiAdapter");
        } else {
            abstractC21304y4 = abstractC21304y7;
        }
        vTextM114233v3.setTextColor(abstractC21304y4.mo152584a(true));
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m114223j(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final View m114223j(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM119041b = f0h0.m119041b(this, inflater, parent);
        viewM119041b.getClass();
        return viewM119041b;
    }

    /* JADX INFO: renamed from: k */
    public final void m114224k(@NotNull AbstractC21304y4 uiAdapter) {
        uiAdapter.getClass();
        this.customUiAdapter = uiAdapter;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull ri2 presenter) {
        presenter.getClass();
        m114220g0(presenter);
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final SupremeCustomAct getAct() {
        return this.act;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final List<Dimensions> m114227n() {
        PrivateCustomSetting privateCustomSetting = this.privateCustomSetting;
        if (privateCustomSetting != null) {
            return privateCustomSetting.dimensions;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final List<IdealTypes> m114228p() {
        PrivateCustomSetting privateCustomSetting = this.privateCustomSetting;
        if (privateCustomSetting != null) {
            return privateCustomSetting.idealTypes;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final ri2 m114229q() {
        ri2 ri2Var = this.presenter;
        if (ri2Var != null) {
            return ri2Var;
        }
        Intrinsics.m87502r("presenter");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m114230r() {
        AbstractC21304y4 abstractC21304y4 = this.customUiAdapter;
        AbstractC21304y4 abstractC21304y5 = null;
        if (abstractC21304y4 == null) {
            Intrinsics.m87502r("customUiAdapter");
            abstractC21304y4 = null;
        }
        abstractC21304y4.mo152588f();
        m114233v().getPaint().setFakeBoldText(true);
        m114214Z().getPaint().setFakeBoldText(true);
        m114213Y().getPaint().setFakeBoldText(true);
        m114218d0().getPaint().setFakeBoldText(true);
        m114196H().getPaint().setFakeBoldText(true);
        m114207S().getPaint().setFakeBoldText(true);
        xdl0.m208329E0(m114234w(), new View.OnClickListener() { // from class: l.a0h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e0h0.m114187f(this.f67041a, view);
            }
        });
        RecyclerView recyclerViewM114216b0 = m114216b0();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.act, 3);
        gridLayoutManager.m3326v(new C16515b());
        recyclerViewM114216b0.setLayoutManager(gridLayoutManager);
        recyclerViewM114216b0.addItemDecoration(new amf0(3, svq.m186103c(6), svq.m186103c(6)));
        nzg0 nzg0Var = new nzg0(this.act);
        this.customModelAdapter = nzg0Var;
        AbstractC21304y4 abstractC21304y6 = this.customUiAdapter;
        if (abstractC21304y6 == null) {
            Intrinsics.m87502r("customUiAdapter");
            abstractC21304y6 = null;
        }
        nzg0Var.m162044I(abstractC21304y6);
        nzg0 nzg0Var2 = this.customModelAdapter;
        nzg0Var2.getClass();
        nzg0Var2.m162043H(new e30() { // from class: l.b0h0
            @Override // p149l.e30
            public final void call(Object obj) {
                e0h0.m114188f0(this.f72441a, (Boolean) obj);
            }
        });
        recyclerViewM114216b0.setAdapter(this.customModelAdapter);
        AbstractC21304y4 abstractC21304y7 = this.customUiAdapter;
        if (abstractC21304y7 == null) {
            Intrinsics.m87502r("customUiAdapter");
        } else {
            abstractC21304y5 = abstractC21304y7;
        }
        abstractC21304y5.mo152590h();
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final List<String> m114231s() {
        nzg0 nzg0Var = this.customModelAdapter;
        if (nzg0Var != null) {
            return nzg0Var.m162046K();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VLinear m114232u() {
        VLinear vLinear = this._container_appearance_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_container_appearance_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VText m114233v() {
        VText vText = this._container_btn;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_container_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final VImage m114234w() {
        VImage vImage = this._container_close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_container_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final RelativeLayout m114235x() {
        RelativeLayout relativeLayout = this._container_content_layout;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m87502r("_container_content_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final VLinear m114236y() {
        VLinear vLinear = this._container_enthusiasm_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_container_enthusiasm_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final VLinear m114237z() {
        VLinear vLinear = this._container_friendship_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_container_friendship_layout");
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
