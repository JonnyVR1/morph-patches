package p153l;

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
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.intl.greet.IntlGreetAct;
import com.p051p1.mobile.putong.core.p058ui.intl.greet.IntlGreetingParam;
import com.p051p1.mobile.putong.core.p058ui.intl.greet.head.IntlUserGreetHeadView;
import com.p051p1.mobile.putong.core.p058ui.intl.greet.message.IntlItemBreakIceMessage;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSSwipeMoment;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VIcon;
import p151v.VImage;
import p151v.VLinear;
import p151v.VList;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\tJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u000b\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\tJ\r\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\tJ\r\u0010 \u001a\u00020\u0007¢\u0006\u0004\b \u0010\tJ\r\u0010!\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\tJ\u0015\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u001a¢\u0006\u0004\b#\u0010\u001dJ\u0015\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b+\u0010\u0019J\r\u0010,\u001a\u00020\u0007¢\u0006\u0004\b,\u0010\tJ\u0015\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u001b\u00104\u001a\u00020\u00072\f\u00103\u001a\b\u0012\u0004\u0012\u00020201¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b6\u0010'J\u000f\u00107\u001a\u00020\u0007H\u0016¢\u0006\u0004\b7\u0010\tJ\u000f\u00109\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0003H\u0016¢\u0006\u0004\b;\u0010<R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010<\"\u0004\b@\u0010\u0006R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010M\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010\u0013\"\u0004\bL\u0010\rR\"\u0010Q\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010C\u001a\u0004\bO\u0010E\"\u0004\bP\u0010GR\"\u0010U\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010C\u001a\u0004\bS\u0010E\"\u0004\bT\u0010GR\"\u0010]\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010a\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010C\u001a\u0004\b_\u0010E\"\u0004\b`\u0010GR\"\u0010i\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010m\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010C\u001a\u0004\bk\u0010E\"\u0004\bl\u0010GR\"\u0010q\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010X\u001a\u0004\bo\u0010Z\"\u0004\bp\u0010\\R\"\u0010y\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010\u0081\u0001\u001a\u00020z8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R*\u0010\u0089\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R*\u0010\u0091\u0001\u001a\u00030\u008a\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R&\u0010\u0095\u0001\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010C\u001a\u0005\b\u0093\u0001\u0010E\"\u0005\b\u0094\u0001\u0010GR*\u0010\u009d\u0001\u001a\u00030\u0096\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R*\u0010¡\u0001\u001a\u00030\u008a\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u008c\u0001\u001a\u0006\b\u009f\u0001\u0010\u008e\u0001\"\u0006\b \u0001\u0010\u0090\u0001R)\u0010¤\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b \u0010\u0084\u0001\u001a\u0006\b¢\u0001\u0010\u0086\u0001\"\u0006\b£\u0001\u0010\u0088\u0001R*\u0010¬\u0001\u001a\u00030¥\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R\u001a\u0010°\u0001\u001a\u00030\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R)\u0010(\u001a\u0004\u0018\u00010\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0017\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0005\bµ\u0001\u0010*R+\u0010¼\u0001\u001a\u0005\u0018\u00010¶\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u000b\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001R,\u0010Ä\u0001\u001a\u0005\u0018\u00010½\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R,\u0010Ì\u0001\u001a\u0005\u0018\u00010Å\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R+\u0010Ó\u0001\u001a\u0005\u0018\u00010Í\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b;\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R&\u0010Ô\u0001\u001a\u00020-8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0004\b\u0014\u0010\u0010\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0005\bÖ\u0001\u00100R&\u0010Ø\u0001\u001a\u00020-8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0004\b#\u0010\u0010\u001a\u0006\b¯\u0001\u0010Õ\u0001\"\u0005\b×\u0001\u00100R\u0018\u0010Ù\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b)\u0010Ï\u0001R\u0018\u0010Ú\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b!\u0010Ï\u0001R\u0019\u0010Ü\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010Ï\u0001R)\u0010ã\u0001\u001a\u00030Ý\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0012\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010à\u0001\"\u0006\bá\u0001\u0010â\u0001R\u0017\u0010æ\u0001\u001a\u00030ä\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b,\u0010å\u0001R\u0017\u0010ç\u0001\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010\u0010R\u001c\u0010ê\u0001\u001a\u0005\u0018\u00010è\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010é\u0001¨\u0006ë\u0001"}, m88121d2 = {"Ll/xnn;", "Ll/eon;", "Ll/gnn;", "Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetAct;)V", "", "i0", "()V", "Landroid/view/View;", ResourceDirection.f39656v, "c0", "(Landroid/view/View;)V", "", "message", "Z", "(Ljava/lang/String;)V", "E", "()Landroid/view/View;", BaseSei.f14626Z, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "height", "d0", "(I)V", "X", "b0", "r", c4s.C_ZONE, "scrollY", "A", "Lcom/p1/mobile/putong/data/User;", "user", "h0", "(Lcom/p1/mobile/putong/data/User;)V", "presenter", "B", "(Ll/gnn;)V", "inflateView", "F", "", "hasFocus", "e0", "(Z)V", "", "Lcom/p1/mobile/putong/core/data/Message;", "messages", "f0", "(Ljava/util/List;)V", "Y", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", BaseSei.f14625Y, "()Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetAct;", "a", "Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetAct;", "G", "setAct", "Lv/VFrame;", "b", "Lv/VFrame;", "R", "()Lv/VFrame;", "set_greet_root_layout", "(Lv/VFrame;)V", "_greet_root_layout", "c", "Landroid/view/View;", BloodType.f39576O, "set_greet_close_layout", "_greet_close_layout", Constants.INAPP_DATA_TAG, "L", "set_content", "_content", "e", "P", "set_greet_content", "_greet_content", "Landroid/widget/RelativeLayout;", "f", "Landroid/widget/RelativeLayout;", "get_greet_list_parent", "()Landroid/widget/RelativeLayout;", "set_greet_list_parent", "(Landroid/widget/RelativeLayout;)V", "_greet_list_parent", "g", p7f.GPS_MEASUREMENT_INTERRUPTED, "set_list_parent", "_list_parent", "Lv/VList;", "h", "Lv/VList;", "Q", "()Lv/VList;", "set_greet_list", "(Lv/VList;)V", "_greet_list", RXScreenCaptureService.KEY_INDEX, "get_tips_container", "set_tips_container", "_tips_container", "j", "N", "set_greet_bottom_layout", "_greet_bottom_layout", "Lv/VLinear;", "k", "Lv/VLinear;", "get_greet_bottom_input_layout", "()Lv/VLinear;", "set_greet_bottom_input_layout", "(Lv/VLinear;)V", "_greet_bottom_input_layout", "Lv/VEditText;", BLiveStormDanmakuGiftResourceType.f45292l, "Lv/VEditText;", "M", "()Lv/VEditText;", "set_edit_greet", "(Lv/VEditText;)V", "_edit_greet", "Lv/VText;", "m", "Lv/VText;", "W", "()Lv/VText;", "set_send", "(Lv/VText;)V", "_send", "Lv/VImage;", "n", "Lv/VImage;", "get_tips_hello", "()Lv/VImage;", "set_tips_hello", "(Lv/VImage;)V", "_tips_hello", "o", "get_greet_top_layout", "set_greet_top_layout", "_greet_top_layout", "Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;", "p", "Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;", p7f.GPS_DIRECTION_TRUE, "()Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;", "set_greet_user_image", "(Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;)V", "_greet_user_image", "q", p7f.LATITUDE_SOUTH, "set_greet_user_icon", "_greet_user_icon", "U", "set_greet_user_name", "_greet_user_name", "Lv/VIcon;", BLiveStormDanmakuGiftResourceType.f45294s, "Lv/VIcon;", "K", "()Lv/VIcon;", "set_close", "(Lv/VIcon;)V", "_close", "", Constants.KEY_T, "J", "lastClick", "u", "Ll/gnn;", "getPresenter", "()Ll/gnn;", "setPresenter", "Ll/rvl;", "Ll/rvl;", "H", "()Ll/rvl;", "setHeadView", "(Ll/rvl;)V", "headView", "Ll/gon;", "w", "Ll/gon;", "getHeadPresenter", "()Ll/gon;", "setHeadPresenter", "(Ll/gon;)V", "headPresenter", "Ll/oon;", BaseSei.f14624X, "Ll/oon;", "getAdapter", "()Ll/oon;", "setAdapter", "(Ll/oon;)V", "adapter", "Lcom/p1/mobile/putong/core/ui/intl/greet/message/IntlItemBreakIceMessage;", "Lcom/p1/mobile/putong/core/ui/intl/greet/message/IntlItemBreakIceMessage;", "I", "()Lcom/p1/mobile/putong/core/ui/intl/greet/message/IntlItemBreakIceMessage;", "setItemBreakIceMessage", "(Lcom/p1/mobile/putong/core/ui/intl/greet/message/IntlItemBreakIceMessage;)V", "itemBreakIceMessage", "isFirstRender", "()Z", "setFirstRender", "setKeyboardShowing", "keyboardShowing", "keyboardUpValue", "keyboardUpValueForIceView", "D", "keyboardHeight", "Landroid/view/animation/Interpolator;", "Landroid/view/animation/Interpolator;", "getInterpolator", "()Landroid/view/animation/Interpolator;", "setInterpolator", "(Landroid/view/animation/Interpolator;)V", "interpolator", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "checkTopActionBarState", "observeKeyboard", "Landroid/widget/PopupWindow;", "Landroid/widget/PopupWindow;", "adaptKeyBoardWindow", "message_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class xnn extends eon<gnn> {

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
    public gnn presenter;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public rvl headView;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public gon headPresenter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public oon adapter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public IntlItemBreakIceMessage itemBreakIceMessage;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public boolean isFirstRender;

    /* JADX INFO: renamed from: l.xnn$a */
    @Metadata(m88120d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"l/xnn$a", "Landroid/text/TextWatcher;", "", BLiveStormDanmakuGiftResourceType.f45294s, "", "start", "count", OMSSwipeMoment.after, "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", OMSSwipeMoment.before, "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "message_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C21391a implements TextWatcher {
        public C21391a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            s.getClass();
            VText vTextM212271W = xnn.this.m212271W();
            String string = s.toString();
            int length = string.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.m88378e(string.charAt(!z ? i : length), 32) <= 0;
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
            vTextM212271W.setEnabled(!TextUtils.isEmpty(string.subSequence(i, length + 1).toString()));
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

    /* JADX INFO: renamed from: l.xnn$b */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"l/xnn$b", "Landroid/widget/AbsListView$OnScrollListener;", "Landroid/widget/AbsListView;", OMSTemplateModeType.view, "", "scrollState", "", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", "firstVisibleItem", "visibleItemCount", "totalItemCount", "onScroll", "(Landroid/widget/AbsListView;III)V", "message_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C21392b implements AbsListView.OnScrollListener {
        public C21392b() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
            view.getClass();
            if (!NullChecker.m82486a(xnn.this.getHeadView()) || firstVisibleItem != 0) {
                xnn.this.m212251A(qa00.f156306S);
                return;
            }
            xnn xnnVar = xnn.this;
            rvl headView = xnnVar.getHeadView();
            headView.getClass();
            xnnVar.m212251A((int) ((-headView.getTop()) - xnn.this.m212265Q().getTranslationY()));
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView view, int scrollState) {
            view.getClass();
            if (scrollState == 1 && xnn.this.getKeyboardShowing()) {
                xnn.this.getAct().hideInput();
            }
            xnn.this.checkTopActionBarState.run();
        }
    }

    /* JADX INFO: renamed from: l.xnn$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m88121d2 = {"l/xnn$c", "Ll/gt0$j;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "onAnimationCancel", "message_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C21393c extends gt0.C17308j {
        public C21393c() {
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            animation.getClass();
            super.onAnimationCancel(animation);
            xnn.this.observeKeyboard = false;
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            super.onAnimationEnd(animation);
            xnn.this.observeKeyboard = false;
        }
    }

    public xnn(@NotNull IntlGreetAct intlGreetAct) {
        intlGreetAct.getClass();
        this.act = intlGreetAct;
        this.isFirstRender = true;
        this.interpolator = new xjg();
        this.checkTopActionBarState = new Runnable() { // from class: l.hnn
            @Override // java.lang.Runnable
            public final void run() {
                xnn.m212246s(this.f110809a);
            }
        };
    }

    /* JADX INFO: renamed from: E */
    private final View m212226E() {
        LayoutInflater layoutInflaterInflater;
        IntlGreetAct act = getAct();
        View viewInflate = null;
        if (act != null && (layoutInflaterInflater = act.inflater()) != null) {
            viewInflate = layoutInflaterInflater.inflate(qec0.f156970X0, (ViewGroup) null, false);
        }
        viewInflate.getClass();
        IntlUserGreetHeadView intlUserGreetHeadView = (IntlUserGreetHeadView) viewInflate;
        this.headView = intlUserGreetHeadView;
        if (NullChecker.m82486a(this.act) && NullChecker.m82486a(this.presenter)) {
            IntlGreetAct intlGreetAct = this.act;
            gnn gnnVar = this.presenter;
            gnnVar.getClass();
            this.headPresenter = new gon(intlGreetAct, gnnVar, intlUserGreetHeadView);
        }
        return intlUserGreetHeadView;
    }

    /* JADX INFO: renamed from: Z */
    private final void m212227Z(String message) {
        if (NullChecker.m82486a(m212265Q())) {
            final Message messageNew_ = Message.new_();
            messageNew_.messageType = MessageType.get("text");
            if (message == null) {
                message = "";
            }
            messageNew_.value = message;
            Runnable runnable = new Runnable() { // from class: l.knn
                @Override // java.lang.Runnable
                public final void run() {
                    xnn.m212231c(this.f127610a, messageNew_);
                }
            };
            if (m212265Q().getLastVisiblePosition() == m212265Q().getCount() - 1) {
                runnable.run();
            } else {
                m212265Q().smoothScrollToPositionFromTop(m212265Q().getCount() - 1, ShareConstants.ERROR_LOAD_GET_INTENT_FAIL);
                m212265Q().postDelayed(runnable, 200L);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m212228a(xnn xnnVar) {
        if (xnnVar.keyboardShowing) {
            int height = (xnnVar.m212265Q().getHeight() - xnnVar.m212270V().getHeight()) + xnnVar.keyboardHeight;
            int i = height - xnnVar.keyboardUpValue;
            if (height <= 0 || i <= 0) {
                return;
            }
            xnnVar.keyboardUpValue = height;
            gt0.m132175u(true, xnnVar.interpolator, 0L, gt0.m132171q(xnnVar.m212265Q(), "translationY", -height)).start();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m212229a0(xnn xnnVar, Message message) {
        gnn gnnVar = xnnVar.presenter;
        if (gnnVar != null) {
            message.getClass();
            gnnVar.m130898g1(message);
        }
        xnnVar.m212265Q().setSelection(xnnVar.m212265Q().getCount());
    }

    /* JADX INFO: renamed from: b */
    public static void m212230b(xnn xnnVar, View view) {
        sfj0.m185596c("e_intl_ilike_im_lose", xnnVar.act.pageId(), new sfj0.C20032a[0]);
        xnnVar.m212253C();
        xnnVar.act.m48999H2();
    }

    /* JADX INFO: renamed from: c */
    public static void m212231c(final xnn xnnVar, final Message message) {
        if (xnnVar.m212265Q().getLastVisiblePosition() == xnnVar.m212265Q().getCount() - 1) {
            gnn gnnVar = xnnVar.presenter;
            if (gnnVar != null) {
                message.getClass();
                gnnVar.m130898g1(message);
            }
        } else {
            IntlGreetAct act = xnnVar.getAct();
            if (act != null) {
                act.post(new Runnable() { // from class: l.nnn
                    @Override // java.lang.Runnable
                    public final void run() {
                        xnn.m212229a0(this.f142809a, message);
                    }
                });
            }
        }
        xnnVar.m212265Q().setSelection(xnnVar.m212265Q().getCount());
    }

    /* JADX INFO: renamed from: d */
    public static void m212233d(xnn xnnVar, boolean z, int i, Boolean bool, Integer num) {
        if (!z) {
            i = 0;
        }
        xnnVar.m212275d0(i);
    }

    /* JADX INFO: renamed from: e */
    public static void m212234e(xnn xnnVar, Message message) {
        gnn gnnVar = xnnVar.presenter;
        if (gnnVar != null) {
            message.getClass();
            gnnVar.m130898g1(message);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m212235f(xnn xnnVar, User user, View view) {
        gnn gnnVar = xnnVar.presenter;
        if (gnnVar != null) {
            gnnVar.m130897e1("from_greet_act", user.f56859id);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static final void m212236g0(xnn xnnVar) {
        xnnVar.checkTopActionBarState.run();
    }

    /* JADX INFO: renamed from: i */
    public static void m212237i(xnn xnnVar, ValueAnimator valueAnimator) {
        xnnVar.checkTopActionBarState.run();
    }

    /* JADX INFO: renamed from: i0 */
    private final void m212238i0() {
        Window window;
        IntlGreetAct act = getAct();
        if (act == null || (window = act.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(21);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m212239j(MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static void m212241l(xnn xnnVar, View view) {
        xnnVar.m212232c0(view);
    }

    /* JADX INFO: renamed from: m */
    public static void m212242m(xnn xnnVar, User user, View view) {
        gnn gnnVar = xnnVar.presenter;
        if (gnnVar != null) {
            gnnVar.m130897e1("from_greet_act", user.f56859id);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m212243n(View view) {
    }

    /* JADX INFO: renamed from: p */
    public static void m212244p(xnn xnnVar, View view) {
        if (SystemClock.uptimeMillis() - xnnVar.lastClick > 1000) {
            xnnVar.lastClick = SystemClock.uptimeMillis();
            String string = xnnVar.m212261M().getText().toString();
            int length = string.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.m88378e(string.charAt(!z ? i : length), 32) <= 0;
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
            xnnVar.m212227Z(string.subSequence(i, length + 1).toString());
            xnnVar.m212261M().setText("");
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m212245q(xnn xnnVar, User user, View view) {
        gnn gnnVar = xnnVar.presenter;
        if (gnnVar != null) {
            gnnVar.m130897e1("from_greet_act", user.f56859id);
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m212246s(xnn xnnVar) {
        if (xnnVar.m212265Q().getFirstVisiblePosition() != 0) {
            xnnVar.m212251A(qa00.f156306S);
            return;
        }
        rvl rvlVar = xnnVar.headView;
        if (rvlVar != null) {
            xnnVar.m212251A((int) ((-rvlVar.getTop()) - xnnVar.m212265Q().getTranslationY()));
        }
    }

    /* JADX INFO: renamed from: z */
    private final void m212250z() {
        PopupWindow popupWindow = new PopupWindow();
        this.adaptKeyBoardWindow = popupWindow;
        popupWindow.setContentView(this.act.inflater().inflate(qec0.f156915O5, (ViewGroup) null, false));
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
    public final void m212251A(int scrollY) {
        VFrame vFrameM212264P = m212264P();
        int i = qa00.f156333t;
        vFrameM212264P.setClipChildren(scrollY > i);
        m212264P().setClipToPadding(scrollY > i);
        rvl rvlVar = this.headView;
        if (rvlVar != null) {
            rvlVar.mo47337b(m212268T(), m212267S(), m212269U(), scrollY);
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@Nullable gnn presenter) {
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: C */
    public final void m212253C() {
        this.act.hideInput(m212261M());
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    /* JADX INFO: renamed from: F */
    public final void m212254F() {
        PopupWindow popupWindow;
        if (NullChecker.m82486a(this.adaptKeyBoardWindow) && (popupWindow = this.adaptKeyBoardWindow) != null && popupWindow.isShowing()) {
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
    public final rvl getHeadView() {
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
    public final VIcon m212259K() {
        VIcon vIcon = this._close;
        if (vIcon != null) {
            return vIcon;
        }
        Intrinsics.m88391r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final VFrame m212260L() {
        VFrame vFrame = this._content;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final VEditText m212261M() {
        VEditText vEditText = this._edit_greet;
        if (vEditText != null) {
            return vEditText;
        }
        Intrinsics.m88391r("_edit_greet");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final RelativeLayout m212262N() {
        RelativeLayout relativeLayout = this._greet_bottom_layout;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m88391r("_greet_bottom_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final View m212263O() {
        View view = this._greet_close_layout;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_greet_close_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final VFrame m212264P() {
        VFrame vFrame = this._greet_content;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_greet_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VList m212265Q() {
        VList vList = this._greet_list;
        if (vList != null) {
            return vList;
        }
        Intrinsics.m88391r("_greet_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final VFrame m212266R() {
        VFrame vFrame = this._greet_root_layout;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_greet_root_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VImage m212267S() {
        VImage vImage = this._greet_user_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_greet_user_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final HeaderFrameWrapper m212268T() {
        HeaderFrameWrapper headerFrameWrapper = this._greet_user_image;
        if (headerFrameWrapper != null) {
            return headerFrameWrapper;
        }
        Intrinsics.m88391r("_greet_user_image");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final VText m212269U() {
        VText vText = this._greet_user_name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_greet_user_name");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VFrame m212270V() {
        VFrame vFrame = this._list_parent;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_list_parent");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VText m212271W() {
        VText vText = this._send;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_send");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0049  */
    /* JADX INFO: renamed from: X */
    public final void m212272X() {
        Animator animatorM132175u;
        this.keyboardShowing = false;
        if (NullChecker.m82486a(this.itemBreakIceMessage)) {
            IntlItemBreakIceMessage intlItemBreakIceMessage = this.itemBreakIceMessage;
            intlItemBreakIceMessage.getClass();
            if (intlItemBreakIceMessage.getVisibility() == 0) {
                animatorM132175u = gt0.m132175u(true, this.interpolator, 390L, gt0.m132171q(m212262N(), "translationY", 0.0f), gt0.m132171q(m212265Q(), "translationY", 0.0f), gt0.m132171q(this.itemBreakIceMessage, "translationY", 0.0f));
            } else {
                animatorM132175u = gt0.m132175u(true, this.interpolator, 390L, gt0.m132171q(m212262N(), "translationY", 0.0f), gt0.m132171q(m212265Q(), "translationY", 0.0f));
            }
        } else {
            animatorM132175u = gt0.m132175u(true, this.interpolator, 390L, gt0.m132171q(m212262N(), "translationY", 0.0f), gt0.m132171q(m212265Q(), "translationY", 0.0f));
        }
        gt0.m132160f(animatorM132175u, this.checkTopActionBarState).start();
        m212274b0();
    }

    /* JADX INFO: renamed from: Y */
    public final void m212273Y(@NotNull User user) {
        user.getClass();
        if (NullChecker.m82486a(this.itemBreakIceMessage)) {
            bnl0.m105524M(this.itemBreakIceMessage, true);
            return;
        }
        IntlItemBreakIceMessage intlItemBreakIceMessage = (IntlItemBreakIceMessage) getAct().inflater().inflate(qec0.f156896M0, (ViewGroup) m212260L(), false);
        this.itemBreakIceMessage = intlItemBreakIceMessage;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) (intlItemBreakIceMessage != null ? intlItemBreakIceMessage.getLayoutParams() : null);
        if (layoutParams != null) {
            layoutParams.gravity = 17;
        }
        m212260L().addView(this.itemBreakIceMessage, layoutParams);
        IntlItemBreakIceMessage intlItemBreakIceMessage2 = this.itemBreakIceMessage;
        if (intlItemBreakIceMessage2 != null) {
            intlItemBreakIceMessage2.m47363h(user, this.act);
        }
        IntlItemBreakIceMessage intlItemBreakIceMessage3 = this.itemBreakIceMessage;
        if (intlItemBreakIceMessage3 != null) {
            intlItemBreakIceMessage3.f30645e = new IntlItemBreakIceMessage.InterfaceC8541a() { // from class: l.mnn
                @Override // com.p051p1.mobile.putong.core.p058ui.intl.greet.message.IntlItemBreakIceMessage.InterfaceC8541a
                /* JADX INFO: renamed from: a */
                public final void mo47364a(Message message) {
                    xnn.m212234e(this.f137715a, message);
                }
            };
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m212274b0() {
        if (this.observeKeyboard) {
            return;
        }
        ValueAnimator duration = ValueAnimator.ofInt(1).setDuration(390L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.pnn
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                xnn.m212237i(this.f153316a, valueAnimator);
            }
        });
        duration.addListener(new C21393c());
        duration.start();
        this.observeKeyboard = true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX INFO: renamed from: d0 */
    public final void m212275d0(int height) {
        int bottom;
        if (height == 0 && this.keyboardShowing) {
            m212272X();
            return;
        }
        if (height > 0) {
            this.keyboardHeight = height;
            this.keyboardShowing = true;
            this.keyboardUpValue = (m212265Q().getHeight() - m212270V().getHeight()) + height;
            if (NullChecker.m82486a(this.itemBreakIceMessage)) {
                IntlItemBreakIceMessage intlItemBreakIceMessage = this.itemBreakIceMessage;
                intlItemBreakIceMessage.getClass();
                if (intlItemBreakIceMessage.getVisibility() == 0) {
                    IntlItemBreakIceMessage intlItemBreakIceMessage2 = this.itemBreakIceMessage;
                    intlItemBreakIceMessage2.getClass();
                    bottom = intlItemBreakIceMessage2.getBottom() - (m212262N().getHeight() + height);
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
            gt0.m132160f(i > 0 ? gt0.m132175u(true, interpolator, 390L, gt0.m132171q(m212265Q(), "translationY", -this.keyboardUpValue), gt0.m132171q(m212262N(), "translationY", -height), gt0.m132171q(this.itemBreakIceMessage, "translationY", -this.keyboardUpValueForIceView)) : gt0.m132175u(true, interpolator, 390L, gt0.m132171q(m212265Q(), "translationY", -this.keyboardUpValue), gt0.m132171q(m212262N(), "translationY", -height)), this.checkTopActionBarState).start();
            m212274b0();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m212276e0(boolean hasFocus) {
        gnn gnnVar;
        PopupWindow popupWindow;
        if (!hasFocus || (gnnVar = this.presenter) == null || !gnnVar.m130895c1() || (popupWindow = this.adaptKeyBoardWindow) == null || popupWindow.isShowing()) {
            return;
        }
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.showAtLocation(this.act.getWindow().getDecorView(), 0, 0, 0);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m212277f0(@NotNull List<? extends Message> messages) {
        messages.getClass();
        oon oonVar = this.adapter;
        if (oonVar != null) {
            oonVar.m168598z(messages);
            if (this.isFirstRender) {
                m212265Q().setSelection(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                m212265Q().smoothScrollToPositionFromTop(m212265Q().getCount() - 1, ShareConstants.ERROR_LOAD_GET_INTENT_FAIL);
                this.isFirstRender = false;
                m212265Q().post(new Runnable() { // from class: l.lnn
                    @Override // java.lang.Runnable
                    public final void run() {
                        xnn.m212236g0(this.f132830a);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m212278h0(@NotNull final User user) {
        user.getClass();
        m212261M().setHint(this.act.string(R$string.f21555N0));
        bnl0.m105524M(m212268T(), true);
        bnl0.m105524M(m212269U(), true);
        bnl0.m105524M(m212267S(), true);
        m212268T().m80893v0(user, ux6.m198404b(user).profileSmall());
        m212269U().setText(user.name);
        rvl rvlVar = this.headView;
        if (rvlVar != null) {
            rvlVar.mo47338c(user, false);
        }
        bnl0.m105509E0(m212268T(), new View.OnClickListener() { // from class: l.qnn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xnn.m212235f(this.f158506a, user, view);
            }
        });
        bnl0.m105509E0(m212269U(), new View.OnClickListener() { // from class: l.rnn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xnn.m212242m(this.f164086a, user, view);
            }
        });
        rvl rvlVar2 = this.headView;
        if (rvlVar2 != null) {
            rvlVar2.setOnAvatarClickListener(new View.OnClickListener() { // from class: l.snn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xnn.m212245q(this.f169743a, user, view);
                }
            });
        }
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM212280v = m212280v(inflater, parent);
        m212265Q().addHeaderView(m212226E());
        m212265Q().setHeaderDividersEnabled(false);
        this.adapter = new oon(this.act, m212265Q());
        m212265Q().setAdapter((ListAdapter) this.adapter);
        oon oonVar = this.adapter;
        if (oonVar != null) {
            oonVar.notifyDataSetChanged();
        }
        View upKeyboardDetectorLayout = this.act.setUpKeyboardDetectorLayout(viewM212280v, new View(this.act), new b30() { // from class: l.onn
            @Override // p153l.b30
            /* JADX INFO: renamed from: b */
            public final void mo102266b(Object obj, Object obj2, Object obj3, Object obj4) {
                xnn.m212233d(this.f148098a, ((Boolean) obj).booleanValue(), ((Integer) obj2).intValue(), (Boolean) obj3, (Integer) obj4);
            }
        });
        gnn gnnVar = this.presenter;
        if (gnnVar != null && gnnVar.m130895c1()) {
            m212250z();
        }
        upKeyboardDetectorLayout.getClass();
        return upKeyboardDetectorLayout;
    }

    /* JADX INFO: renamed from: r */
    public final void m212279r() {
        m212238i0();
        this.act.setSwipeBackEnable(false);
        if (NullChecker.m82486a(m212267S())) {
            m212267S().setImageResource(ibc0.f113936W0);
        }
        this.keyboardShowing = false;
        m212265Q().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.tnn
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                xnn.m212228a(this.f175298a);
            }
        });
        bnl0.m105509E0(m212259K(), new View.OnClickListener() { // from class: l.unn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xnn.m212230b(this.f179750a, view);
            }
        });
        m212261M().addTextChangedListener(new C21391a());
        m212261M().setText("");
        bnl0.m105509E0(m212261M(), new View.OnClickListener() { // from class: l.vnn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xnn.m212241l(this.f184902a, view);
            }
        });
        bnl0.m105509E0(m212271W(), new View.OnClickListener() { // from class: l.wnn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xnn.m212244p(this.f189968a, view);
            }
        });
        bnl0.m105509E0(m212263O(), new View.OnClickListener() { // from class: l.inn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xnn.m212243n(view);
            }
        });
        m212265Q().setOnScrollListener(new C21392b());
        m212266R().setOnDispatchTouchEventListener(new bm50() { // from class: l.jnn
            @Override // p153l.bm50
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return xnn.m212239j(motionEvent);
            }
        });
        IntlGreetingParam param = this.act.getParam();
        if (param == null || TextUtils.isEmpty(param.getPreSendMsg()) || param.getHotLevel() > 0) {
            return;
        }
        m212227Z(param.getPreSendMsg());
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final View m212280v(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM216881b = ynn.m216881b(this, inflater, parent);
        viewM216881b.getClass();
        return viewM216881b;
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public IntlGreetAct getAct() {
        return this.act;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: c0 */
    private final void m212232c0(View v2) {
    }
}
