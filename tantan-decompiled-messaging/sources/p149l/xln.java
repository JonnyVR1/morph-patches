package p149l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.intl.greet.IntlGreetAct;
import com.p046p1.mobile.putong.core.p053ui.intl.greet.IntlGreetingParam;
import com.p046p1.mobile.putong.core.p053ui.intl.greet.head.IntlUserGreetHeadView;
import com.p046p1.mobile.putong.core.p053ui.intl.greet.message.IntlItemBreakIceMessage;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.OMSSwipeMoment;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VIcon;
import p147v.VImage;
import p147v.VLinear;
import p147v.VList;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\tJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u000b\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\tJ\r\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\tJ\r\u0010 \u001a\u00020\u0007¢\u0006\u0004\b \u0010\tJ\r\u0010!\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\tJ\u0015\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u001a¢\u0006\u0004\b#\u0010\u001dJ\u0015\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b+\u0010\u0019J\r\u0010,\u001a\u00020\u0007¢\u0006\u0004\b,\u0010\tJ\u0015\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u001b\u00104\u001a\u00020\u00072\f\u00103\u001a\b\u0012\u0004\u0012\u00020201¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b6\u0010'J\u000f\u00107\u001a\u00020\u0007H\u0016¢\u0006\u0004\b7\u0010\tJ\u000f\u00109\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0003H\u0016¢\u0006\u0004\b;\u0010<R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010<\"\u0004\b@\u0010\u0006R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010M\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010\u0013\"\u0004\bL\u0010\rR\"\u0010Q\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010C\u001a\u0004\bO\u0010E\"\u0004\bP\u0010GR\"\u0010U\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010C\u001a\u0004\bS\u0010E\"\u0004\bT\u0010GR\"\u0010]\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010a\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010C\u001a\u0004\b_\u0010E\"\u0004\b`\u0010GR\"\u0010i\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010m\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010C\u001a\u0004\bk\u0010E\"\u0004\bl\u0010GR\"\u0010q\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010X\u001a\u0004\bo\u0010Z\"\u0004\bp\u0010\\R\"\u0010y\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010\u0081\u0001\u001a\u00020z8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R*\u0010\u0089\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R*\u0010\u0091\u0001\u001a\u00030\u008a\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R&\u0010\u0095\u0001\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010C\u001a\u0005\b\u0093\u0001\u0010E\"\u0005\b\u0094\u0001\u0010GR*\u0010\u009d\u0001\u001a\u00030\u0096\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R*\u0010¡\u0001\u001a\u00030\u008a\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u008c\u0001\u001a\u0006\b\u009f\u0001\u0010\u008e\u0001\"\u0006\b \u0001\u0010\u0090\u0001R)\u0010¤\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b \u0010\u0084\u0001\u001a\u0006\b¢\u0001\u0010\u0086\u0001\"\u0006\b£\u0001\u0010\u0088\u0001R*\u0010¬\u0001\u001a\u00030¥\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R\u001a\u0010°\u0001\u001a\u00030\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R)\u0010(\u001a\u0004\u0018\u00010\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0017\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0005\bµ\u0001\u0010*R+\u0010¼\u0001\u001a\u0005\u0018\u00010¶\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u000b\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001R,\u0010Ä\u0001\u001a\u0005\u0018\u00010½\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R,\u0010Ì\u0001\u001a\u0005\u0018\u00010Å\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R+\u0010Ó\u0001\u001a\u0005\u0018\u00010Í\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b;\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R&\u0010Ô\u0001\u001a\u00020-8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0004\b\u0014\u0010\u0010\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0005\bÖ\u0001\u00100R&\u0010Ø\u0001\u001a\u00020-8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0004\b#\u0010\u0010\u001a\u0006\b¯\u0001\u0010Õ\u0001\"\u0005\b×\u0001\u00100R\u0018\u0010Ù\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b)\u0010Ï\u0001R\u0018\u0010Ú\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b!\u0010Ï\u0001R\u0019\u0010Ü\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010Ï\u0001R)\u0010ã\u0001\u001a\u00030Ý\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0012\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010à\u0001\"\u0006\bá\u0001\u0010â\u0001R\u0017\u0010æ\u0001\u001a\u00030ä\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b,\u0010å\u0001R\u0017\u0010ç\u0001\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010\u0010R\u001c\u0010ê\u0001\u001a\u0005\u0018\u00010è\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010é\u0001¨\u0006ë\u0001"}, m87232d2 = {"Ll/xln;", "Ll/emn;", "Ll/gln;", "Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetAct;)V", "", "i0", "()V", "Landroid/view/View;", ResourceDirection.f38808v, "c0", "(Landroid/view/View;)V", "", "message", "Z", "(Ljava/lang/String;)V", "E", "()Landroid/view/View;", BaseSei.f13932Z, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "height", "d0", "(I)V", "X", "b0", "r", b2s.C_ZONE, "scrollY", "A", "Lcom/p1/mobile/putong/data/User;", "user", "h0", "(Lcom/p1/mobile/putong/data/User;)V", "presenter", "B", "(Ll/gln;)V", "inflateView", "F", "", "hasFocus", "e0", "(Z)V", "", "Lcom/p1/mobile/putong/core/data/Message;", "messages", "f0", "(Ljava/util/List;)V", "Y", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", BaseSei.f13931Y, "()Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetAct;", "a", "Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetAct;", "G", "setAct", "Lv/VFrame;", "b", "Lv/VFrame;", "R", "()Lv/VFrame;", "set_greet_root_layout", "(Lv/VFrame;)V", "_greet_root_layout", "c", "Landroid/view/View;", BloodType.f38728O, "set_greet_close_layout", "_greet_close_layout", Constants.INAPP_DATA_TAG, "L", "set_content", "_content", "e", "P", "set_greet_content", "_greet_content", "Landroid/widget/RelativeLayout;", "f", "Landroid/widget/RelativeLayout;", "get_greet_list_parent", "()Landroid/widget/RelativeLayout;", "set_greet_list_parent", "(Landroid/widget/RelativeLayout;)V", "_greet_list_parent", "g", j6f.GPS_MEASUREMENT_INTERRUPTED, "set_list_parent", "_list_parent", "Lv/VList;", "h", "Lv/VList;", "Q", "()Lv/VList;", "set_greet_list", "(Lv/VList;)V", "_greet_list", RXScreenCaptureService.KEY_INDEX, "get_tips_container", "set_tips_container", "_tips_container", "j", "N", "set_greet_bottom_layout", "_greet_bottom_layout", "Lv/VLinear;", "k", "Lv/VLinear;", "get_greet_bottom_input_layout", "()Lv/VLinear;", "set_greet_bottom_input_layout", "(Lv/VLinear;)V", "_greet_bottom_input_layout", "Lv/VEditText;", BLiveStormDanmakuGiftResourceType.f44444l, "Lv/VEditText;", "M", "()Lv/VEditText;", "set_edit_greet", "(Lv/VEditText;)V", "_edit_greet", "Lv/VText;", "m", "Lv/VText;", "W", "()Lv/VText;", "set_send", "(Lv/VText;)V", "_send", "Lv/VImage;", "n", "Lv/VImage;", "get_tips_hello", "()Lv/VImage;", "set_tips_hello", "(Lv/VImage;)V", "_tips_hello", "o", "get_greet_top_layout", "set_greet_top_layout", "_greet_top_layout", "Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;", "p", "Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;", j6f.GPS_DIRECTION_TRUE, "()Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;", "set_greet_user_image", "(Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;)V", "_greet_user_image", "q", j6f.LATITUDE_SOUTH, "set_greet_user_icon", "_greet_user_icon", "U", "set_greet_user_name", "_greet_user_name", "Lv/VIcon;", BLiveStormDanmakuGiftResourceType.f44446s, "Lv/VIcon;", "K", "()Lv/VIcon;", "set_close", "(Lv/VIcon;)V", "_close", "", Constants.KEY_T, "J", "lastClick", "u", "Ll/gln;", "getPresenter", "()Ll/gln;", "setPresenter", "Ll/dtl;", "Ll/dtl;", "H", "()Ll/dtl;", "setHeadView", "(Ll/dtl;)V", "headView", "Ll/gmn;", "w", "Ll/gmn;", "getHeadPresenter", "()Ll/gmn;", "setHeadPresenter", "(Ll/gmn;)V", "headPresenter", "Ll/omn;", BaseSei.f13930X, "Ll/omn;", "getAdapter", "()Ll/omn;", "setAdapter", "(Ll/omn;)V", "adapter", "Lcom/p1/mobile/putong/core/ui/intl/greet/message/IntlItemBreakIceMessage;", "Lcom/p1/mobile/putong/core/ui/intl/greet/message/IntlItemBreakIceMessage;", "I", "()Lcom/p1/mobile/putong/core/ui/intl/greet/message/IntlItemBreakIceMessage;", "setItemBreakIceMessage", "(Lcom/p1/mobile/putong/core/ui/intl/greet/message/IntlItemBreakIceMessage;)V", "itemBreakIceMessage", "isFirstRender", "()Z", "setFirstRender", "setKeyboardShowing", "keyboardShowing", "keyboardUpValue", "keyboardUpValueForIceView", "D", "keyboardHeight", "Landroid/view/animation/Interpolator;", "Landroid/view/animation/Interpolator;", "getInterpolator", "()Landroid/view/animation/Interpolator;", "setInterpolator", "(Landroid/view/animation/Interpolator;)V", "interpolator", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "checkTopActionBarState", "observeKeyboard", "Landroid/widget/PopupWindow;", "Landroid/widget/PopupWindow;", "adaptKeyBoardWindow", "message_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class xln extends emn<gln> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public boolean keyboardShowing;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public int keyboardUpValue;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public int keyboardUpValueForIceView;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public int keyboardHeight;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public Interpolator interpolator;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public final Runnable checkTopActionBarState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public boolean observeKeyboard;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    public PopupWindow adaptKeyBoardWindow;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public IntlGreetAct act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VFrame _greet_root_layout;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public View _greet_close_layout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VFrame _content;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VFrame _greet_content;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public RelativeLayout _greet_list_parent;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VFrame _list_parent;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VList _greet_list;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VFrame _tips_container;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public RelativeLayout _greet_bottom_layout;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VLinear _greet_bottom_input_layout;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VEditText _edit_greet;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VText _send;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VImage _tips_hello;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VFrame _greet_top_layout;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public HeaderFrameWrapper _greet_user_image;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VImage _greet_user_icon;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public VText _greet_user_name;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public VIcon _close;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public long lastClick;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public gln presenter;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public dtl headView;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public gmn headPresenter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public omn adapter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public IntlItemBreakIceMessage itemBreakIceMessage;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public boolean isFirstRender;

    /* JADX INFO: renamed from: l.xln$a */
    @Metadata(m87231d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"l/xln$a", "Landroid/text/TextWatcher;", "", BLiveStormDanmakuGiftResourceType.f44446s, "", "start", "count", OMSSwipeMoment.after, "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", OMSSwipeMoment.before, "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "message_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C21173a implements TextWatcher {
        public C21173a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            s.getClass();
            VText vTextM209944W = xln.this.m209944W();
            String string = s.toString();
            int length = string.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.m87489e(string.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            vTextM209944W.setEnabled(!TextUtils.isEmpty(string.subSequence(i, length + 1).toString()));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            s.getClass();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            s.getClass();
        }
    }

    /* JADX INFO: renamed from: l.xln$b */
    @Metadata(m87231d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"l/xln$b", "Landroid/widget/AbsListView$OnScrollListener;", "Landroid/widget/AbsListView;", OMSTemplateModeType.view, "", "scrollState", "", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", "firstVisibleItem", "visibleItemCount", "totalItemCount", "onScroll", "(Landroid/widget/AbsListView;III)V", "message_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C21174b implements AbsListView.OnScrollListener {
        public C21174b() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
            view.getClass();
            if (!NullChecker.m81303a(xln.this.getHeadView()) || firstVisibleItem != 0) {
                xln.this.m209924A(t100.f167244S);
                return;
            }
            xln xlnVar = xln.this;
            dtl headView = xlnVar.getHeadView();
            headView.getClass();
            xlnVar.m209924A((int) ((-headView.getTop()) - xln.this.m209938Q().getTranslationY()));
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView view, int scrollState) {
            view.getClass();
            if (scrollState == 1 && xln.this.getKeyboardShowing()) {
                xln.this.getAct().hideInput();
            }
            xln.this.checkTopActionBarState.run();
        }
    }

    /* JADX INFO: renamed from: l.xln$c */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m87232d2 = {"l/xln$c", "Ll/bt0$j;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "onAnimationCancel", "message_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C21175c extends bt0.C15966j {
        public C21175c() {
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            animation.getClass();
            super.onAnimationCancel(animation);
            xln.this.observeKeyboard = false;
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            super.onAnimationEnd(animation);
            xln.this.observeKeyboard = false;
        }
    }

    public xln(@NotNull IntlGreetAct intlGreetAct) {
        intlGreetAct.getClass();
        this.act = intlGreetAct;
        this.isFirstRender = true;
        this.interpolator = new jig();
        this.checkTopActionBarState = new Runnable() { // from class: l.hln
            @Override // java.lang.Runnable
            public final void run() {
                xln.m209919s(this.f108360a);
            }
        };
    }

    /* JADX INFO: renamed from: E */
    private final View m209899E() {
        LayoutInflater layoutInflaterInflater;
        IntlGreetAct act = getAct();
        View viewInflate = null;
        if (act != null && (layoutInflaterInflater = act.inflater()) != null) {
            viewInflate = layoutInflaterInflater.inflate(l6c0.f126414X0, (ViewGroup) null, false);
        }
        viewInflate.getClass();
        IntlUserGreetHeadView intlUserGreetHeadView = (IntlUserGreetHeadView) viewInflate;
        this.headView = intlUserGreetHeadView;
        if (NullChecker.m81303a(this.act) && NullChecker.m81303a(this.presenter)) {
            IntlGreetAct intlGreetAct = this.act;
            gln glnVar = this.presenter;
            glnVar.getClass();
            this.headPresenter = new gmn(intlGreetAct, glnVar, intlUserGreetHeadView);
        }
        return intlUserGreetHeadView;
    }

    /* JADX INFO: renamed from: Z */
    private final void m209900Z(String message) {
        if (NullChecker.m81303a(m209938Q())) {
            final Message messageNew_ = Message.new_();
            messageNew_.messageType = MessageType.get("text");
            if (message == null) {
                message = "";
            }
            messageNew_.value = message;
            Runnable runnable = new Runnable() { // from class: l.kln
                @Override // java.lang.Runnable
                public final void run() {
                    xln.m209904c(this.f123675a, messageNew_);
                }
            };
            if (m209938Q().getLastVisiblePosition() == m209938Q().getCount() - 1) {
                runnable.run();
            } else {
                m209938Q().smoothScrollToPositionFromTop(m209938Q().getCount() - 1, ShareConstants.ERROR_LOAD_GET_INTENT_FAIL);
                m209938Q().postDelayed(runnable, 200L);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m209901a(xln xlnVar) {
        if (xlnVar.keyboardShowing) {
            int height = (xlnVar.m209938Q().getHeight() - xlnVar.m209943V().getHeight()) + xlnVar.keyboardHeight;
            int i = height - xlnVar.keyboardUpValue;
            if (height <= 0 || i <= 0) {
                return;
            }
            xlnVar.keyboardUpValue = height;
            bt0.m103748u(true, xlnVar.interpolator, 0L, bt0.m103744q(xlnVar.m209938Q(), "translationY", -height)).start();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m209902a0(xln xlnVar, Message message) {
        gln glnVar = xlnVar.presenter;
        if (glnVar != null) {
            message.getClass();
            glnVar.m126869g1(message);
        }
        xlnVar.m209938Q().setSelection(xlnVar.m209938Q().getCount());
    }

    /* JADX INFO: renamed from: b */
    public static void m209903b(xln xlnVar, View view) {
        o6j0.m162859c("e_intl_ilike_im_lose", xlnVar.act.pageId(), new o6j0.C18854a[0]);
        xlnVar.m209926C();
        xlnVar.act.m47815F2();
    }

    /* JADX INFO: renamed from: c */
    public static void m209904c(final xln xlnVar, final Message message) {
        if (xlnVar.m209938Q().getLastVisiblePosition() == xlnVar.m209938Q().getCount() - 1) {
            gln glnVar = xlnVar.presenter;
            if (glnVar != null) {
                message.getClass();
                glnVar.m126869g1(message);
            }
        } else {
            IntlGreetAct act = xlnVar.getAct();
            if (act != null) {
                act.post(new Runnable() { // from class: l.nln
                    @Override // java.lang.Runnable
                    public final void run() {
                        xln.m209902a0(this.f139570a, message);
                    }
                });
            }
        }
        xlnVar.m209938Q().setSelection(xlnVar.m209938Q().getCount());
    }

    /* JADX INFO: renamed from: d */
    public static void m209906d(xln xlnVar, boolean z, int i, Boolean bool, Integer num) {
        if (!z) {
            i = 0;
        }
        xlnVar.m209948d0(i);
    }

    /* JADX INFO: renamed from: e */
    public static void m209907e(xln xlnVar, Message message) {
        gln glnVar = xlnVar.presenter;
        if (glnVar != null) {
            message.getClass();
            glnVar.m126869g1(message);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m209908f(xln xlnVar, User user, View view) {
        gln glnVar = xlnVar.presenter;
        if (glnVar != null) {
            glnVar.m126868e1("from_greet_act", user.f56011id);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static final void m209909g0(xln xlnVar) {
        xlnVar.checkTopActionBarState.run();
    }

    /* JADX INFO: renamed from: i */
    public static void m209910i(xln xlnVar, ValueAnimator valueAnimator) {
        xlnVar.checkTopActionBarState.run();
    }

    /* JADX INFO: renamed from: i0 */
    private final void m209911i0() {
        Window window;
        IntlGreetAct act = getAct();
        if (act == null || (window = act.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(21);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m209912j(MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static void m209914l(xln xlnVar, View view) {
        xlnVar.m209905c0(view);
    }

    /* JADX INFO: renamed from: m */
    public static void m209915m(xln xlnVar, User user, View view) {
        gln glnVar = xlnVar.presenter;
        if (glnVar != null) {
            glnVar.m126868e1("from_greet_act", user.f56011id);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m209916n(View view) {
    }

    /* JADX INFO: renamed from: p */
    public static void m209917p(xln xlnVar, View view) {
        if (SystemClock.uptimeMillis() - xlnVar.lastClick > 1000) {
            xlnVar.lastClick = SystemClock.uptimeMillis();
            String string = xlnVar.m209934M().getText().toString();
            int length = string.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.m87489e(string.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            xlnVar.m209900Z(string.subSequence(i, length + 1).toString());
            xlnVar.m209934M().setText("");
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m209918q(xln xlnVar, User user, View view) {
        gln glnVar = xlnVar.presenter;
        if (glnVar != null) {
            glnVar.m126868e1("from_greet_act", user.f56011id);
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m209919s(xln xlnVar) {
        if (xlnVar.m209938Q().getFirstVisiblePosition() != 0) {
            xlnVar.m209924A(t100.f167244S);
            return;
        }
        dtl dtlVar = xlnVar.headView;
        if (dtlVar != null) {
            xlnVar.m209924A((int) ((-dtlVar.getTop()) - xlnVar.m209938Q().getTranslationY()));
        }
    }

    /* JADX INFO: renamed from: z */
    private final void m209923z() {
        PopupWindow popupWindow = new PopupWindow();
        this.adaptKeyBoardWindow = popupWindow;
        popupWindow.setContentView(this.act.inflater().inflate(l6c0.f126359O5, (ViewGroup) null, false));
        PopupWindow popupWindow2 = this.adaptKeyBoardWindow;
        if (popupWindow2 != null) {
            popupWindow2.setInputMethodMode(1);
        }
        PopupWindow popupWindow3 = this.adaptKeyBoardWindow;
        if (popupWindow3 != null) {
            popupWindow3.setWidth(0);
        }
        PopupWindow popupWindow4 = this.adaptKeyBoardWindow;
        if (popupWindow4 != null) {
            popupWindow4.setHeight(0);
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m209924A(int scrollY) {
        VFrame vFrameM209937P = m209937P();
        int i = t100.f167271t;
        vFrameM209937P.setClipChildren(scrollY > i);
        m209937P().setClipToPadding(scrollY > i);
        dtl dtlVar = this.headView;
        if (dtlVar != null) {
            dtlVar.mo46154b(m209941T(), m209940S(), m209942U(), scrollY);
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable gln presenter) {
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: C */
    public final void m209926C() {
        this.act.hideInput(m209934M());
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    /* JADX INFO: renamed from: F */
    public final void m209927F() {
        PopupWindow popupWindow;
        if (NullChecker.m81303a(this.adaptKeyBoardWindow) && (popupWindow = this.adaptKeyBoardWindow) != null && popupWindow.isShowing()) {
            PopupWindow popupWindow2 = this.adaptKeyBoardWindow;
            if (popupWindow2 != null) {
                popupWindow2.dismiss();
            }
            this.adaptKeyBoardWindow = null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: G, reason: from getter */
    public final IntlGreetAct getAct() {
        return this.act;
    }

    @Nullable
    /* JADX INFO: renamed from: H, reason: from getter */
    public final dtl getHeadView() {
        return this.headView;
    }

    @Nullable
    /* JADX INFO: renamed from: I, reason: from getter */
    public final IntlItemBreakIceMessage getItemBreakIceMessage() {
        return this.itemBreakIceMessage;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final boolean getKeyboardShowing() {
        return this.keyboardShowing;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final VIcon m209932K() {
        VIcon vIcon = this._close;
        if (vIcon != null) {
            return vIcon;
        }
        Intrinsics.m87502r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final VFrame m209933L() {
        VFrame vFrame = this._content;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final VEditText m209934M() {
        VEditText vEditText = this._edit_greet;
        if (vEditText != null) {
            return vEditText;
        }
        Intrinsics.m87502r("_edit_greet");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final RelativeLayout m209935N() {
        RelativeLayout relativeLayout = this._greet_bottom_layout;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m87502r("_greet_bottom_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final View m209936O() {
        View view = this._greet_close_layout;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_greet_close_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final VFrame m209937P() {
        VFrame vFrame = this._greet_content;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_greet_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VList m209938Q() {
        VList vList = this._greet_list;
        if (vList != null) {
            return vList;
        }
        Intrinsics.m87502r("_greet_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final VFrame m209939R() {
        VFrame vFrame = this._greet_root_layout;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_greet_root_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VImage m209940S() {
        VImage vImage = this._greet_user_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_greet_user_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final HeaderFrameWrapper m209941T() {
        HeaderFrameWrapper headerFrameWrapper = this._greet_user_image;
        if (headerFrameWrapper != null) {
            return headerFrameWrapper;
        }
        Intrinsics.m87502r("_greet_user_image");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final VText m209942U() {
        VText vText = this._greet_user_name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_greet_user_name");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VFrame m209943V() {
        VFrame vFrame = this._list_parent;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_list_parent");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VText m209944W() {
        VText vText = this._send;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_send");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0049  */
    /* JADX INFO: renamed from: X */
    public final void m209945X() {
        Animator animatorM103748u;
        this.keyboardShowing = false;
        if (NullChecker.m81303a(this.itemBreakIceMessage)) {
            IntlItemBreakIceMessage intlItemBreakIceMessage = this.itemBreakIceMessage;
            intlItemBreakIceMessage.getClass();
            if (intlItemBreakIceMessage.getVisibility() == 0) {
                animatorM103748u = bt0.m103748u(true, this.interpolator, 390L, bt0.m103744q(m209935N(), "translationY", 0.0f), bt0.m103744q(m209938Q(), "translationY", 0.0f), bt0.m103744q(this.itemBreakIceMessage, "translationY", 0.0f));
            } else {
                animatorM103748u = bt0.m103748u(true, this.interpolator, 390L, bt0.m103744q(m209935N(), "translationY", 0.0f), bt0.m103744q(m209938Q(), "translationY", 0.0f));
            }
        } else {
            animatorM103748u = bt0.m103748u(true, this.interpolator, 390L, bt0.m103744q(m209935N(), "translationY", 0.0f), bt0.m103744q(m209938Q(), "translationY", 0.0f));
        }
        bt0.m103733f(animatorM103748u, this.checkTopActionBarState).start();
        m209947b0();
    }

    /* JADX INFO: renamed from: Y */
    public final void m209946Y(@NotNull User user) {
        user.getClass();
        if (NullChecker.m81303a(this.itemBreakIceMessage)) {
            xdl0.m208344M(this.itemBreakIceMessage, true);
            return;
        }
        IntlItemBreakIceMessage intlItemBreakIceMessage = (IntlItemBreakIceMessage) getAct().inflater().inflate(l6c0.f126340M0, (ViewGroup) m209933L(), false);
        this.itemBreakIceMessage = intlItemBreakIceMessage;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) (intlItemBreakIceMessage != null ? intlItemBreakIceMessage.getLayoutParams() : null);
        if (layoutParams != null) {
            layoutParams.gravity = 17;
        }
        m209933L().addView(this.itemBreakIceMessage, layoutParams);
        IntlItemBreakIceMessage intlItemBreakIceMessage2 = this.itemBreakIceMessage;
        if (intlItemBreakIceMessage2 != null) {
            intlItemBreakIceMessage2.m46180h(user, this.act);
        }
        IntlItemBreakIceMessage intlItemBreakIceMessage3 = this.itemBreakIceMessage;
        if (intlItemBreakIceMessage3 != null) {
            intlItemBreakIceMessage3.f29797e = new IntlItemBreakIceMessage.InterfaceC8378a() { // from class: l.mln
                @Override // com.p046p1.mobile.putong.core.p053ui.intl.greet.message.IntlItemBreakIceMessage.InterfaceC8378a
                /* JADX INFO: renamed from: a */
                public final void mo46181a(Message message) {
                    xln.m209907e(this.f134457a, message);
                }
            };
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m209947b0() {
        if (this.observeKeyboard) {
            return;
        }
        ValueAnimator duration = ValueAnimator.ofInt(1).setDuration(390L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.pln
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                xln.m209910i(this.f150153a, valueAnimator);
            }
        });
        duration.addListener(new C21175c());
        duration.start();
        this.observeKeyboard = true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX INFO: renamed from: d0 */
    public final void m209948d0(int height) {
        int bottom;
        if (height == 0 && this.keyboardShowing) {
            m209945X();
            return;
        }
        if (height > 0) {
            this.keyboardHeight = height;
            this.keyboardShowing = true;
            this.keyboardUpValue = (m209938Q().getHeight() - m209943V().getHeight()) + height;
            if (NullChecker.m81303a(this.itemBreakIceMessage)) {
                IntlItemBreakIceMessage intlItemBreakIceMessage = this.itemBreakIceMessage;
                intlItemBreakIceMessage.getClass();
                if (intlItemBreakIceMessage.getVisibility() == 0) {
                    IntlItemBreakIceMessage intlItemBreakIceMessage2 = this.itemBreakIceMessage;
                    intlItemBreakIceMessage2.getClass();
                    bottom = intlItemBreakIceMessage2.getBottom() - (m209935N().getHeight() + height);
                } else {
                    bottom = 0;
                }
            } else {
                bottom = 0;
            }
            this.keyboardUpValueForIceView = bottom;
            if (this.keyboardUpValue < 0) {
                this.keyboardUpValue = 0;
            }
            if (bottom < 0) {
                this.keyboardUpValueForIceView = 0;
            }
            int i = this.keyboardUpValueForIceView;
            Interpolator interpolator = this.interpolator;
            bt0.m103733f(i > 0 ? bt0.m103748u(true, interpolator, 390L, bt0.m103744q(m209938Q(), "translationY", -this.keyboardUpValue), bt0.m103744q(m209935N(), "translationY", -height), bt0.m103744q(this.itemBreakIceMessage, "translationY", -this.keyboardUpValueForIceView)) : bt0.m103748u(true, interpolator, 390L, bt0.m103744q(m209938Q(), "translationY", -this.keyboardUpValue), bt0.m103744q(m209935N(), "translationY", -height)), this.checkTopActionBarState).start();
            m209947b0();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m209949e0(boolean hasFocus) {
        gln glnVar;
        PopupWindow popupWindow;
        if (!hasFocus || (glnVar = this.presenter) == null || !glnVar.m126866c1() || (popupWindow = this.adaptKeyBoardWindow) == null || popupWindow.isShowing()) {
            return;
        }
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.showAtLocation(this.act.getWindow().getDecorView(), 0, 0, 0);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m209950f0(@NotNull List<? extends Message> messages) {
        messages.getClass();
        omn omnVar = this.adapter;
        if (omnVar != null) {
            omnVar.m165145z(messages);
            if (this.isFirstRender) {
                m209938Q().setSelection(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                m209938Q().smoothScrollToPositionFromTop(m209938Q().getCount() - 1, ShareConstants.ERROR_LOAD_GET_INTENT_FAIL);
                this.isFirstRender = false;
                m209938Q().post(new Runnable() { // from class: l.lln
                    @Override // java.lang.Runnable
                    public final void run() {
                        xln.m209909g0(this.f128736a);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m209951h0(@NotNull final User user) {
        user.getClass();
        m209934M().setHint(this.act.string(R$string.f20813N0));
        xdl0.m208344M(m209941T(), true);
        xdl0.m208344M(m209942U(), true);
        xdl0.m208344M(m209940S(), true);
        m209941T().m79710v0(user, rw6.m181386b(user).profileSmall());
        m209942U().setText(user.name);
        dtl dtlVar = this.headView;
        if (dtlVar != null) {
            dtlVar.mo46155c(user, false);
        }
        xdl0.m208329E0(m209941T(), new View.OnClickListener() { // from class: l.qln
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xln.m209908f(this.f155246a, user, view);
            }
        });
        xdl0.m208329E0(m209942U(), new View.OnClickListener() { // from class: l.rln
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xln.m209915m(this.f159979a, user, view);
            }
        });
        dtl dtlVar2 = this.headView;
        if (dtlVar2 != null) {
            dtlVar2.setOnAvatarClickListener(new View.OnClickListener() { // from class: l.sln
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xln.m209918q(this.f165250a, user, view);
                }
            });
        }
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM209953v = m209953v(inflater, parent);
        m209938Q().addHeaderView(m209899E());
        m209938Q().setHeaderDividersEnabled(false);
        this.adapter = new omn(this.act, m209938Q());
        m209938Q().setAdapter((ListAdapter) this.adapter);
        omn omnVar = this.adapter;
        if (omnVar != null) {
            omnVar.notifyDataSetChanged();
        }
        View upKeyboardDetectorLayout = this.act.setUpKeyboardDetectorLayout(viewM209953v, new View(this.act), new h30() { // from class: l.oln
            @Override // p149l.h30
            /* JADX INFO: renamed from: b */
            public final void mo105798b(Object obj, Object obj2, Object obj3, Object obj4) {
                xln.m209906d(this.f144520a, ((Boolean) obj).booleanValue(), ((Integer) obj2).intValue(), (Boolean) obj3, (Integer) obj4);
            }
        });
        gln glnVar = this.presenter;
        if (glnVar != null && glnVar.m126866c1()) {
            m209923z();
        }
        upKeyboardDetectorLayout.getClass();
        return upKeyboardDetectorLayout;
    }

    /* JADX INFO: renamed from: r */
    public final void m209952r() {
        m209911i0();
        this.act.setSwipeBackEnable(false);
        if (NullChecker.m81303a(m209940S())) {
            m209940S().setImageResource(c3c0.f78661W0);
        }
        this.keyboardShowing = false;
        m209938Q().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.tln
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                xln.m209901a(this.f171036a);
            }
        });
        xdl0.m208329E0(m209932K(), new View.OnClickListener() { // from class: l.uln
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xln.m209903b(this.f177082a, view);
            }
        });
        m209934M().addTextChangedListener(new C21173a());
        m209934M().setText("");
        xdl0.m208329E0(m209934M(), new View.OnClickListener() { // from class: l.vln
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xln.m209914l(this.f181970a, view);
            }
        });
        xdl0.m208329E0(m209944W(), new View.OnClickListener() { // from class: l.wln
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xln.m209917p(this.f186963a, view);
            }
        });
        xdl0.m208329E0(m209936O(), new View.OnClickListener() { // from class: l.iln
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xln.m209916n(view);
            }
        });
        m209938Q().setOnScrollListener(new C21174b());
        m209939R().setOnDispatchTouchEventListener(new ud50() { // from class: l.jln
            @Override // p149l.ud50
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return xln.m209912j(motionEvent);
            }
        });
        IntlGreetingParam param = this.act.getParam();
        if (param == null || TextUtils.isEmpty(param.getPreSendMsg()) || param.getHotLevel() > 0) {
            return;
        }
        m209900Z(param.getPreSendMsg());
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final View m209953v(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM215268b = yln.m215268b(this, inflater, parent);
        viewM215268b.getClass();
        return viewM215268b;
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public IntlGreetAct getAct() {
        return this.act;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: c0 */
    private final void m209905c0(View v2) {
    }
}
