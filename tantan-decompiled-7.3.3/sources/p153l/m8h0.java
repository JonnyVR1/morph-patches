package p153l;

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
import com.p051p1.mobile.putong.core.data.Dimensions;
import com.p051p1.mobile.putong.core.data.IdealTypes;
import com.p051p1.mobile.putong.core.data.PrivateCustomSetting;
import com.p051p1.mobile.putong.core.newui.supreme.SupremeCustomAct;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b>\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 Ù\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u0014J\u0015\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u000b¢\u0006\u0004\b&\u0010\"J\u0015\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010/¢\u0006\u0004\b0\u0010*J\u0015\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010/¢\u0006\u0004\b2\u0010*R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010J\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u00109\u001a\u0004\bH\u0010;\"\u0004\bI\u0010=R\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010^\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010U\u001a\u0004\b\\\u0010W\"\u0004\b]\u0010YR\"\u0010b\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010U\u001a\u0004\b`\u0010W\"\u0004\ba\u0010YR\"\u0010f\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010U\u001a\u0004\bd\u0010W\"\u0004\be\u0010YR\"\u0010i\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010U\u001a\u0004\bg\u0010W\"\u0004\bh\u0010YR\"\u0010l\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010M\u001a\u0004\bj\u0010O\"\u0004\bk\u0010QR\"\u0010o\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010M\u001a\u0004\bm\u0010O\"\u0004\bn\u0010QR\"\u0010r\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u0010M\u001a\u0004\bp\u0010O\"\u0004\bq\u0010QR\"\u0010u\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00109\u001a\u0004\bs\u0010;\"\u0004\bt\u0010=R\"\u0010y\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010U\u001a\u0004\bw\u0010W\"\u0004\bx\u0010YR\"\u0010|\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u0010U\u001a\u0004\bz\u0010W\"\u0004\b{\u0010YR'\u0010\u0084\u0001\u001a\u00020}8\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R%\u0010\u0087\u0001\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b&\u0010A\u001a\u0005\b\u0085\u0001\u0010C\"\u0005\b\u0086\u0001\u0010ER%\u0010\u008a\u0001\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b)\u0010U\u001a\u0005\b\u0088\u0001\u0010W\"\u0005\b\u0089\u0001\u0010YR%\u0010\u008d\u0001\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b,\u0010U\u001a\u0005\b\u008b\u0001\u0010W\"\u0005\b\u008c\u0001\u0010YR&\u0010\u0091\u0001\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010U\u001a\u0005\b\u008f\u0001\u0010W\"\u0005\b\u0090\u0001\u0010YR*\u0010\u0099\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R&\u0010\u009d\u0001\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009a\u0001\u0010U\u001a\u0005\b\u009b\u0001\u0010W\"\u0005\b\u009c\u0001\u0010YR)\u0010 \u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bB\u0010\u0094\u0001\u001a\u0006\b\u009e\u0001\u0010\u0096\u0001\"\u0006\b\u009f\u0001\u0010\u0098\u0001R&\u0010£\u0001\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0095\u0001\u0010U\u001a\u0005\b¡\u0001\u0010W\"\u0005\b¢\u0001\u0010YR*\u0010¥\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u0094\u0001\u001a\u0006\b\u008e\u0001\u0010\u0096\u0001\"\u0006\b¤\u0001\u0010\u0098\u0001R&\u0010©\u0001\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¦\u0001\u0010U\u001a\u0005\b§\u0001\u0010W\"\u0005\b¨\u0001\u0010YR*\u0010«\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0094\u0001\u001a\u0006\b¦\u0001\u0010\u0096\u0001\"\u0006\bª\u0001\u0010\u0098\u0001R&\u0010®\u0001\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009b\u0001\u00109\u001a\u0005\b¬\u0001\u0010;\"\u0005\b\u00ad\u0001\u0010=R&\u0010²\u0001\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¯\u0001\u0010M\u001a\u0005\b°\u0001\u0010O\"\u0005\b±\u0001\u0010QR&\u0010µ\u0001\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¡\u0001\u0010U\u001a\u0005\b³\u0001\u0010W\"\u0005\b´\u0001\u0010YR&\u0010¸\u0001\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b§\u0001\u0010U\u001a\u0005\b¶\u0001\u0010W\"\u0005\b·\u0001\u0010YR&\u0010»\u0001\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010U\u001a\u0005\b¹\u0001\u0010W\"\u0005\bº\u0001\u0010YR&\u0010¾\u0001\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010U\u001a\u0005\b¼\u0001\u0010W\"\u0005\b½\u0001\u0010YR&\u0010Á\u0001\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010U\u001a\u0005\b¿\u0001\u0010W\"\u0005\bÀ\u0001\u0010YR&\u0010Ä\u0001\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¬\u0001\u0010M\u001a\u0005\bÂ\u0001\u0010O\"\u0005\bÃ\u0001\u0010QR&\u0010Ç\u0001\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¶\u0001\u0010M\u001a\u0005\bÅ\u0001\u0010O\"\u0005\bÆ\u0001\u0010QR&\u0010Ê\u0001\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b°\u0001\u0010M\u001a\u0005\bÈ\u0001\u0010O\"\u0005\bÉ\u0001\u0010QR&\u0010Ì\u0001\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÈ\u0001\u0010U\u001a\u0005\b\u0093\u0001\u0010W\"\u0005\bË\u0001\u0010YR&\u0010Î\u0001\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÂ\u0001\u0010M\u001a\u0005\b\u009a\u0001\u0010O\"\u0005\bÍ\u0001\u0010QR\u0019\u0010Ð\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÅ\u0001\u0010Ï\u0001R\u001c\u0010Ó\u0001\u001a\u0005\u0018\u00010Ñ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010Ò\u0001R\u001b\u0010Õ\u0001\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010Ô\u0001R&\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0006\b¹\u0001\u0010Ö\u0001\u001a\u0005\b~\u0010×\u0001\"\u0005\bØ\u0001\u0010\u0017¨\u0006Ú\u0001"}, m88121d2 = {"Ll/m8h0;", "Ll/iam;", "Ll/yi2;", "Lcom/p1/mobile/putong/core/newui/supreme/SupremeCustomAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/newui/supreme/SupremeCustomAct;)V", "Landroid/widget/LinearLayout;", "linearLayout", "Lcom/p1/mobile/putong/core/data/Dimensions;", Dimensions.TYPE, "", "e0", "(Landroid/widget/LinearLayout;Lcom/p1/mobile/putong/core/data/Dimensions;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "j", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", BLiveStormDanmakuGiftResourceType.f45292l, "(Ll/yi2;)V", "Ll/w4;", "uiAdapter", "k", "(Ll/w4;)V", "inflateView", "", "step", "i0", "(I)V", "destroy", "()V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", "", "", BLiveStormDanmakuGiftResourceType.f45294s, "()Ljava/util/List;", "Lcom/p1/mobile/putong/core/data/PrivateCustomSetting;", Constants.KEY_T, "h0", "(Lcom/p1/mobile/putong/core/data/PrivateCustomSetting;)V", "", "n", "Lcom/p1/mobile/putong/core/data/IdealTypes;", "p", "a", "Lcom/p1/mobile/putong/core/newui/supreme/SupremeCustomAct;", "m", "()Lcom/p1/mobile/putong/core/newui/supreme/SupremeCustomAct;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "b", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_container", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_container", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_container", "Landroid/widget/RelativeLayout;", "c", "Landroid/widget/RelativeLayout;", BaseSei.f14624X, "()Landroid/widget/RelativeLayout;", "set_container_content_layout", "(Landroid/widget/RelativeLayout;)V", "_container_content_layout", Constants.INAPP_DATA_TAG, p7f.GPS_DIRECTION_TRUE, "set_container_step_hello", "_container_step_hello", "Lv/VImage;", "e", "Lv/VImage;", p7f.GPS_MEASUREMENT_INTERRUPTED, "()Lv/VImage;", "set_container_step_hello_crown", "(Lv/VImage;)V", "_container_step_hello_crown", "Lv/VText;", "f", "Lv/VText;", "Z", "()Lv/VText;", "set_container_step_hello_title", "(Lv/VText;)V", "_container_step_hello_title", "g", "U", "set_container_step_hello_content", "_container_step_hello_content", "h", "Y", "set_container_step_hello_mid_title", "_container_step_hello_mid_title", RXScreenCaptureService.KEY_INDEX, "W", "set_container_step_hello_mid_content1", "_container_step_hello_mid_content1", "X", "set_container_step_hello_mid_content2", "_container_step_hello_mid_content2", "get_container_step_hello_decorate_left", "set_container_step_hello_decorate_left", "_container_step_hello_decorate_left", "get_container_step_hello_decorate_right", "set_container_step_hello_decorate_right", "_container_step_hello_decorate_right", "get_container_step_hello_line", "set_container_step_hello_line", "_container_step_hello_line", "a0", "set_container_step_nine_pic", "_container_step_nine_pic", "o", "d0", "set_container_step_nine_pic_step2_mid_title", "_container_step_nine_pic_step2_mid_title", "c0", "set_container_step_nine_pic_step2_mid_content", "_container_step_nine_pic_step2_mid_content", "Landroidx/recyclerview/widget/RecyclerView;", "q", "Landroidx/recyclerview/widget/RecyclerView;", "b0", "()Landroidx/recyclerview/widget/RecyclerView;", "set_container_step_nine_pic_recycle_view", "(Landroidx/recyclerview/widget/RecyclerView;)V", "_container_step_nine_pic_recycle_view", "I", "set_container_step_custom_personality", "_container_step_custom_personality", "H", "set_container_step3_mid_title", "_container_step3_mid_title", "G", "set_container_step3_mid_content", "_container_step3_mid_content", "u", "B", "set_container_setp3_title1", "_container_setp3_title1", "Lv/VLinear;", ResourceDirection.f39656v, "Lv/VLinear;", BaseSei.f14625Y, "()Lv/VLinear;", "set_container_enthusiasm_layout", "(Lv/VLinear;)V", "_container_enthusiasm_layout", "w", c4s.C_ZONE, "set_container_setp3_title2", "_container_setp3_title2", BaseSei.f14626Z, "set_container_friendship_layout", "_container_friendship_layout", "E", "set_container_setp3_title3", "_container_setp3_title3", "set_container_appearance_layout", "_container_appearance_layout", "A", "F", "set_container_setp3_title4", "_container_setp3_title4", "set_container_profile_layout", "_container_profile_layout", "J", "set_container_step_finish", "_container_step_finish", "D", "L", "set_container_step_finish_step4_crown", "_container_step_finish_step4_crown", p7f.LATITUDE_SOUTH, "set_container_step_finish_step4_title", "_container_step_finish_step4_title", "K", "set_container_step_finish_step4_content", "_container_step_finish_step4_content", "R", "set_container_step_finish_step4_mid_title", "_container_step_finish_step4_mid_title", "P", "set_container_step_finish_step4_mid_content1", "_container_step_finish_step4_mid_content1", "Q", "set_container_step_finish_step4_mid_content2", "_container_step_finish_step4_mid_content2", "N", "set_container_step_finish_step4_decorate_left", "_container_step_finish_step4_decorate_left", BloodType.f39576O, "set_container_step_finish_step4_decorate_right", "_container_step_finish_step4_decorate_right", "M", "set_container_step_finish_step4_decorate_bottom_star_line", "_container_step_finish_step4_decorate_bottom_star_line", "set_container_btn", "_container_btn", "set_container_close", "_container_close", "Ll/w4;", "customUiAdapter", "Ll/v7h0;", "Ll/v7h0;", "customModelAdapter", "Lcom/p1/mobile/putong/core/data/PrivateCustomSetting;", "privateCustomSetting", "Ll/yi2;", "()Ll/yi2;", "g0", "Companion", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class m8h0 implements iam<yi2> {

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
    public AbstractC21009w4 customUiAdapter;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @Nullable
    public v7h0 customModelAdapter;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @Nullable
    public PrivateCustomSetting privateCustomSetting;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public yi2 presenter;

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

    /* JADX INFO: renamed from: l.m8h0$b */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m88121d2 = {"l/m8h0$b", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18565b extends GridLayoutManager.AbstractC0554c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int position) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.m8h0$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/m8h0$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18566c extends AnimatorListenerAdapter {
        public C18566c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            super.onAnimationEnd(animation);
            bnl0.m105524M(m8h0.this.m157404T(), false);
        }
    }

    public m8h0(@NotNull SupremeCustomAct supremeCustomAct) {
        supremeCustomAct.getClass();
        this.act = supremeCustomAct;
    }

    /* JADX INFO: renamed from: a */
    public static void m157378a(LinearLayout linearLayout, Dimensions dimensions, m8h0 m8h0Var, View view) {
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            childAt.getClass();
            VText vText = (VText) childAt;
            AbstractC21009w4 abstractC21009w4 = null;
            if (Intrinsics.m88377d(vText, view)) {
                if (dimensions != null) {
                    dimensions.value = i;
                }
                vText.getPaint().setFakeBoldText(true);
                AbstractC21009w4 abstractC21009w5 = m8h0Var.customUiAdapter;
                if (abstractC21009w5 == null) {
                    Intrinsics.m88391r("customUiAdapter");
                    abstractC21009w5 = null;
                }
                vText.setTextColor(abstractC21009w5.mo129024c(true));
                AbstractC21009w4 abstractC21009w6 = m8h0Var.customUiAdapter;
                if (abstractC21009w6 == null) {
                    Intrinsics.m88391r("customUiAdapter");
                } else {
                    abstractC21009w4 = abstractC21009w6;
                }
                vText.setBackground(abstractC21009w4.mo129023b());
                vText.invalidate();
            } else {
                AbstractC21009w4 abstractC21009w7 = m8h0Var.customUiAdapter;
                if (abstractC21009w7 == null) {
                    Intrinsics.m88391r("customUiAdapter");
                    abstractC21009w7 = null;
                }
                vText.setTextColor(abstractC21009w7.mo129024c(false));
                vText.setBackground(null);
                vText.getPaint().setFakeBoldText(false);
                vText.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m157379b(m8h0 m8h0Var, View view) {
        m8h0Var.m157425q().mo101016e0(Boolean.TRUE);
        i4g0.m138520r("e_custom_set_complete", "p_custom_set_pop");
    }

    /* JADX INFO: renamed from: c */
    public static void m157380c(m8h0 m8h0Var, View view) {
        m8h0Var.m157418i0(2);
        i4g0.m138520r("e_custom_set_start", "p_custom_set_pop");
    }

    /* JADX INFO: renamed from: d */
    public static void m157381d(m8h0 m8h0Var, View view) {
        m8h0Var.m157418i0(3);
    }

    /* JADX INFO: renamed from: f */
    public static void m157383f(m8h0 m8h0Var, View view) {
        yi2.m216001f0(m8h0Var.m157425q(), null, 1, null);
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m157384f0(m8h0 m8h0Var, Boolean bool) {
        VText vTextM157429v = m8h0Var.m157429v();
        bool.getClass();
        vTextM157429v.setClickable(bool.booleanValue());
        AbstractC21009w4 abstractC21009w4 = null;
        if (bool.booleanValue()) {
            VText vTextM157429v2 = m8h0Var.m157429v();
            AbstractC21009w4 abstractC21009w5 = m8h0Var.customUiAdapter;
            if (abstractC21009w5 == null) {
                Intrinsics.m88391r("customUiAdapter");
            } else {
                abstractC21009w4 = abstractC21009w5;
            }
            vTextM157429v2.setTextColor(abstractC21009w4.mo129022a(true));
            return;
        }
        VText vTextM157429v3 = m8h0Var.m157429v();
        AbstractC21009w4 abstractC21009w6 = m8h0Var.customUiAdapter;
        if (abstractC21009w6 == null) {
            Intrinsics.m88391r("customUiAdapter");
        } else {
            abstractC21009w4 = abstractC21009w6;
        }
        vTextM157429v3.setTextColor(abstractC21009w4.mo129022a(false));
    }

    /* JADX INFO: renamed from: i */
    public static void m157385i(m8h0 m8h0Var, View view) {
        m8h0Var.m157418i0(4);
        m8h0Var.m157425q().mo101017k0();
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final VLinear m157386A() {
        VLinear vLinear = this._container_profile_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_container_profile_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final VText m157387B() {
        VText vText = this._container_setp3_title1;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_container_setp3_title1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final VText m157388C() {
        VText vText = this._container_setp3_title2;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_container_setp3_title2");
        return null;
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final VText m157389E() {
        VText vText = this._container_setp3_title3;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_container_setp3_title3");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final VText m157390F() {
        VText vText = this._container_setp3_title4;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_container_setp3_title4");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final VText m157391G() {
        VText vText = this._container_step3_mid_content;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_container_step3_mid_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final VText m157392H() {
        VText vText = this._container_step3_mid_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_container_step3_mid_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final RelativeLayout m157393I() {
        RelativeLayout relativeLayout = this._container_step_custom_personality;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m88391r("_container_step_custom_personality");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final ConstraintLayout m157394J() {
        ConstraintLayout constraintLayout = this._container_step_finish;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_container_step_finish");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final VText m157395K() {
        VText vText = this._container_step_finish_step4_content;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_container_step_finish_step4_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final VImage m157396L() {
        VImage vImage = this._container_step_finish_step4_crown;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_container_step_finish_step4_crown");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final VImage m157397M() {
        VImage vImage = this._container_step_finish_step4_decorate_bottom_star_line;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_container_step_finish_step4_decorate_bottom_star_line");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final VImage m157398N() {
        VImage vImage = this._container_step_finish_step4_decorate_left;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_container_step_finish_step4_decorate_left");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VImage m157399O() {
        VImage vImage = this._container_step_finish_step4_decorate_right;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_container_step_finish_step4_decorate_right");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final VText m157400P() {
        VText vText = this._container_step_finish_step4_mid_content1;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_container_step_finish_step4_mid_content1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VText m157401Q() {
        VText vText = this._container_step_finish_step4_mid_content2;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_container_step_finish_step4_mid_content2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final VText m157402R() {
        VText vText = this._container_step_finish_step4_mid_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_container_step_finish_step4_mid_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VText m157403S() {
        VText vText = this._container_step_finish_step4_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_container_step_finish_step4_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final ConstraintLayout m157404T() {
        ConstraintLayout constraintLayout = this._container_step_hello;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_container_step_hello");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final VText m157405U() {
        VText vText = this._container_step_hello_content;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_container_step_hello_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VImage m157406V() {
        VImage vImage = this._container_step_hello_crown;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_container_step_hello_crown");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VText m157407W() {
        VText vText = this._container_step_hello_mid_content1;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_container_step_hello_mid_content1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final VText m157408X() {
        VText vText = this._container_step_hello_mid_content2;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_container_step_hello_mid_content2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final VText m157409Y() {
        VText vText = this._container_step_hello_mid_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_container_step_hello_mid_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VText m157410Z() {
        VText vText = this._container_step_hello_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_container_step_hello_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final ConstraintLayout m157411a0() {
        ConstraintLayout constraintLayout = this._container_step_nine_pic;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_container_step_nine_pic");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final RecyclerView m157412b0() {
        RecyclerView recyclerView = this._container_step_nine_pic_recycle_view;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m88391r("_container_step_nine_pic_recycle_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VText m157413c0() {
        VText vText = this._container_step_nine_pic_step2_mid_content;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_container_step_nine_pic_step2_mid_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final VText m157414d0() {
        VText vText = this._container_step_nine_pic_step2_mid_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_container_step_nine_pic_step2_mid_title");
        return null;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m157415e0(final LinearLayout linearLayout, final Dimensions dimensions) {
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
                AbstractC21009w4 abstractC21009w4 = this.customUiAdapter;
                if (abstractC21009w4 == null) {
                    Intrinsics.m88391r("customUiAdapter");
                    abstractC21009w4 = null;
                }
                vText.setTextColor(abstractC21009w4.mo129024c(true));
                vText.getPaint().setFakeBoldText(true);
                AbstractC21009w4 abstractC21009w5 = this.customUiAdapter;
                if (abstractC21009w5 == null) {
                    Intrinsics.m88391r("customUiAdapter");
                    abstractC21009w5 = null;
                }
                vText.setBackground(abstractC21009w5.mo129023b());
                vText.invalidate();
            } else {
                vText.getPaint().setFakeBoldText(false);
                AbstractC21009w4 abstractC21009w6 = this.customUiAdapter;
                if (abstractC21009w6 == null) {
                    Intrinsics.m88391r("customUiAdapter");
                    abstractC21009w6 = null;
                }
                vText.setTextColor(abstractC21009w6.mo129024c(false));
                vText.invalidate();
            }
            vText.setOnClickListener(new View.OnClickListener() { // from class: l.l8h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    m8h0.m157378a(linearLayout, dimensions, this, view);
                }
            });
            linearLayout.addView(vText, layoutParams);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m157416g0(@NotNull yi2 yi2Var) {
        yi2Var.getClass();
        this.presenter = yi2Var;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m157417h0(@NotNull PrivateCustomSetting t) {
        AbstractC21009w4 abstractC21009w4;
        List<Dimensions> list;
        List<Dimensions> list2;
        Dimensions dimensions;
        List<Dimensions> list3;
        List<Dimensions> list4;
        t.getClass();
        this.privateCustomSetting = t;
        bnl0.m105509E0(m157429v(), new View.OnClickListener() { // from class: l.k8h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m8h0.m157380c(this.f124384a, view);
            }
        });
        v7h0 v7h0Var = this.customModelAdapter;
        if (v7h0Var != null) {
            List<IdealTypes> list5 = t.idealTypes;
            list5.getClass();
            v7h0Var.m200210L(list5);
        }
        v7h0 v7h0Var2 = this.customModelAdapter;
        if (v7h0Var2 != null) {
            v7h0Var2.notifyDataSetChanged();
        }
        List listListOf = CollectionsKt.listOf((Object[]) new VText[]{m157387B(), m157388C(), m157389E(), m157390F()});
        List listListOf2 = CollectionsKt.listOf((Object[]) new VLinear[]{m157432y(), m157433z(), m157428u(), m157386A()});
        PrivateCustomSetting privateCustomSetting = this.privateCustomSetting;
        int size = 4;
        if (((privateCustomSetting == null || (list4 = privateCustomSetting.dimensions) == null) ? 0 : list4.size()) <= 4) {
            PrivateCustomSetting privateCustomSetting2 = this.privateCustomSetting;
            size = (privateCustomSetting2 == null || (list3 = privateCustomSetting2.dimensions) == null) ? 0 : list3.size();
        }
        int size2 = listListOf2.size();
        int i = 0;
        while (true) {
            abstractC21009w4 = null;
            dimensions = null;
            Dimensions dimensions2 = null;
            if (i >= size2) {
                break;
            }
            VText vText = (VText) listListOf.get(i);
            VLinear vLinear = (VLinear) listListOf2.get(i);
            if (i >= size) {
                bnl0.m105524M(vText, false);
                bnl0.m105524M(vLinear, false);
            } else {
                bnl0.m105524M(vText, true);
                bnl0.m105524M(vLinear, true);
                PrivateCustomSetting privateCustomSetting3 = this.privateCustomSetting;
                vText.setText((privateCustomSetting3 == null || (list2 = privateCustomSetting3.dimensions) == null || (dimensions = list2.get(i)) == null) ? null : dimensions.key);
                PrivateCustomSetting privateCustomSetting4 = this.privateCustomSetting;
                if (privateCustomSetting4 != null && (list = privateCustomSetting4.dimensions) != null) {
                    dimensions2 = list.get(i);
                }
                m157415e0(vLinear, dimensions2);
            }
            i++;
        }
        AbstractC21009w4 abstractC21009w5 = this.customUiAdapter;
        if (abstractC21009w5 == null) {
            Intrinsics.m88391r("customUiAdapter");
        } else {
            abstractC21009w4 = abstractC21009w5;
        }
        abstractC21009w4.mo129027g();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m157418i0(int step) {
        if (step == 1) {
            bnl0.m105524M(m157404T(), true);
            bnl0.m105524M(m157411a0(), false);
            bnl0.m105524M(m157393I(), false);
            bnl0.m105524M(m157394J(), false);
            m157429v().setText("开始私人定制");
            return;
        }
        AbstractC21009w4 abstractC21009w4 = null;
        if (step != 2) {
            if (step == 3) {
                bnl0.m105524M(m157404T(), false);
                bnl0.m105524M(m157411a0(), false);
                bnl0.m105524M(m157393I(), true);
                bnl0.m105524M(m157394J(), false);
                bnl0.m105509E0(m157429v(), new View.OnClickListener() { // from class: l.g8h0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        m8h0.m157385i(this.f102688a, view);
                    }
                });
                m157429v().setText("完成定制");
                return;
            }
            if (step != 4) {
                bnl0.m105524M(m157404T(), true);
                bnl0.m105524M(m157411a0(), false);
                bnl0.m105524M(m157393I(), false);
                bnl0.m105524M(m157394J(), false);
                return;
            }
            i4g0.m138526x("e_custom_set_complete", "p_custom_set_pop");
            bnl0.m105524M(m157404T(), false);
            bnl0.m105524M(m157411a0(), false);
            bnl0.m105524M(m157393I(), false);
            bnl0.m105524M(m157394J(), true);
            bnl0.m105509E0(m157429v(), new View.OnClickListener() { // from class: l.h8h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    m8h0.m157379b(this.f108243a, view);
                }
            });
            VText vTextM157429v = m157429v();
            AbstractC21009w4 abstractC21009w5 = this.customUiAdapter;
            if (abstractC21009w5 == null) {
                Intrinsics.m88391r("customUiAdapter");
            } else {
                abstractC21009w4 = abstractC21009w5;
            }
            vTextM157429v.setText(abstractC21009w4.mo129025d());
            bnl0.m105524M(m157430w(), false);
            return;
        }
        bnl0.m105524M(m157404T(), false);
        bnl0.m105524M(m157411a0(), true);
        bnl0.m105524M(m157393I(), false);
        bnl0.m105524M(m157394J(), false);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(m157412b0(), "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.getClass();
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(m157412b0(), "translationY", txq.m193530c(50) * 1.0f, 0.0f);
        objectAnimatorOfFloat2.getClass();
        animatorSet.addListener(new C18566c());
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(400L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.start();
        bnl0.m105509E0(m157429v(), new View.OnClickListener() { // from class: l.f8h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m8h0.m157381d(this.f97738a, view);
            }
        });
        m157429v().setText("下一步");
        PrivateCustomSetting privateCustomSetting = this.privateCustomSetting;
        if (privateCustomSetting == null || !privateCustomSetting.hasIdealTypesSelected()) {
            m157429v().setClickable(false);
            VText vTextM157429v2 = m157429v();
            AbstractC21009w4 abstractC21009w6 = this.customUiAdapter;
            if (abstractC21009w6 == null) {
                Intrinsics.m88391r("customUiAdapter");
            } else {
                abstractC21009w4 = abstractC21009w6;
            }
            vTextM157429v2.setTextColor(abstractC21009w4.mo129022a(false));
            return;
        }
        m157429v().setClickable(true);
        VText vTextM157429v3 = m157429v();
        AbstractC21009w4 abstractC21009w7 = this.customUiAdapter;
        if (abstractC21009w7 == null) {
            Intrinsics.m88391r("customUiAdapter");
        } else {
            abstractC21009w4 = abstractC21009w7;
        }
        vTextM157429v3.setTextColor(abstractC21009w4.mo129022a(true));
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m157419j(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final View m157419j(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM161925b = n8h0.m161925b(this, inflater, parent);
        viewM161925b.getClass();
        return viewM161925b;
    }

    /* JADX INFO: renamed from: k */
    public final void m157420k(@NotNull AbstractC21009w4 uiAdapter) {
        uiAdapter.getClass();
        this.customUiAdapter = uiAdapter;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull yi2 presenter) {
        presenter.getClass();
        m157416g0(presenter);
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final SupremeCustomAct getAct() {
        return this.act;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final List<Dimensions> m157423n() {
        PrivateCustomSetting privateCustomSetting = this.privateCustomSetting;
        if (privateCustomSetting != null) {
            return privateCustomSetting.dimensions;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final List<IdealTypes> m157424p() {
        PrivateCustomSetting privateCustomSetting = this.privateCustomSetting;
        if (privateCustomSetting != null) {
            return privateCustomSetting.idealTypes;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final yi2 m157425q() {
        yi2 yi2Var = this.presenter;
        if (yi2Var != null) {
            return yi2Var;
        }
        Intrinsics.m88391r("presenter");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m157426r() {
        AbstractC21009w4 abstractC21009w4 = this.customUiAdapter;
        AbstractC21009w4 abstractC21009w5 = null;
        if (abstractC21009w4 == null) {
            Intrinsics.m88391r("customUiAdapter");
            abstractC21009w4 = null;
        }
        abstractC21009w4.mo129026f();
        m157429v().getPaint().setFakeBoldText(true);
        m157410Z().getPaint().setFakeBoldText(true);
        m157409Y().getPaint().setFakeBoldText(true);
        m157414d0().getPaint().setFakeBoldText(true);
        m157392H().getPaint().setFakeBoldText(true);
        m157403S().getPaint().setFakeBoldText(true);
        bnl0.m105509E0(m157430w(), new View.OnClickListener() { // from class: l.i8h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m8h0.m157383f(this.f113346a, view);
            }
        });
        RecyclerView recyclerViewM157412b0 = m157412b0();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.act, 3);
        gridLayoutManager.m3327v(new C18565b());
        recyclerViewM157412b0.setLayoutManager(gridLayoutManager);
        recyclerViewM157412b0.addItemDecoration(new juf0(3, txq.m193530c(6), txq.m193530c(6)));
        v7h0 v7h0Var = new v7h0(this.act);
        this.customModelAdapter = v7h0Var;
        AbstractC21009w4 abstractC21009w6 = this.customUiAdapter;
        if (abstractC21009w6 == null) {
            Intrinsics.m88391r("customUiAdapter");
            abstractC21009w6 = null;
        }
        v7h0Var.m200207I(abstractC21009w6);
        v7h0 v7h0Var2 = this.customModelAdapter;
        v7h0Var2.getClass();
        v7h0Var2.m200206H(new y20() { // from class: l.j8h0
            @Override // p153l.y20
            public final void call(Object obj) {
                m8h0.m157384f0(this.f118783a, (Boolean) obj);
            }
        });
        recyclerViewM157412b0.setAdapter(this.customModelAdapter);
        AbstractC21009w4 abstractC21009w7 = this.customUiAdapter;
        if (abstractC21009w7 == null) {
            Intrinsics.m88391r("customUiAdapter");
        } else {
            abstractC21009w5 = abstractC21009w7;
        }
        abstractC21009w5.mo129028h();
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final List<String> m157427s() {
        v7h0 v7h0Var = this.customModelAdapter;
        if (v7h0Var != null) {
            return v7h0Var.m200209K();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VLinear m157428u() {
        VLinear vLinear = this._container_appearance_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_container_appearance_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VText m157429v() {
        VText vText = this._container_btn;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_container_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final VImage m157430w() {
        VImage vImage = this._container_close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_container_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final RelativeLayout m157431x() {
        RelativeLayout relativeLayout = this._container_content_layout;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m88391r("_container_content_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final VLinear m157432y() {
        VLinear vLinear = this._container_enthusiasm_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_container_enthusiasm_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final VLinear m157433z() {
        VLinear vLinear = this._container_friendship_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_container_friendship_layout");
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
