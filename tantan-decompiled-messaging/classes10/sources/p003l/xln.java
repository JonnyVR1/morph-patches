package p003l;

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
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.core.data.GameStage;
import com.p000p1.mobile.putong.core.data.Message;
import com.p000p1.mobile.putong.core.data.MessageType;
import com.p000p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.message.R$string;
import com.p000p1.mobile.putong.core.p001ui.intl.greet.IntlGreetAct;
import com.p000p1.mobile.putong.core.p001ui.intl.greet.IntlGreetingParam;
import com.p000p1.mobile.putong.core.p001ui.intl.greet.head.IntlUserGreetHeadView;
import com.p000p1.mobile.putong.core.p001ui.intl.greet.message.IntlItemBreakIceMessage;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.a;
import l.bt0;
import l.h30;
import l.jig;
import l.t100;
import l.ud50;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VEditText;
import v.VFrame;
import v.VIcon;
import v.VImage;
import v.VLinear;
import v.VList;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\tJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u000b\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\tJ\r\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\tJ\r\u0010 \u001a\u00020\u0007¢\u0006\u0004\b \u0010\tJ\r\u0010!\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\tJ\u0015\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u001a¢\u0006\u0004\b#\u0010\u001dJ\u0015\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b+\u0010\u0019J\r\u0010,\u001a\u00020\u0007¢\u0006\u0004\b,\u0010\tJ\u0015\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u001b\u00104\u001a\u00020\u00072\f\u00103\u001a\b\u0012\u0004\u0012\u00020201¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b6\u0010'J\u000f\u00107\u001a\u00020\u0007H\u0016¢\u0006\u0004\b7\u0010\tJ\u000f\u00109\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0003H\u0016¢\u0006\u0004\b;\u0010<R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010<\"\u0004\b@\u0010\u0006R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010M\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010\u0013\"\u0004\bL\u0010\rR\"\u0010Q\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010C\u001a\u0004\bO\u0010E\"\u0004\bP\u0010GR\"\u0010U\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010C\u001a\u0004\bS\u0010E\"\u0004\bT\u0010GR\"\u0010]\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010a\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010C\u001a\u0004\b_\u0010E\"\u0004\b`\u0010GR\"\u0010i\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010m\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010C\u001a\u0004\bk\u0010E\"\u0004\bl\u0010GR\"\u0010q\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010X\u001a\u0004\bo\u0010Z\"\u0004\bp\u0010\\R\"\u0010y\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010\u0081\u0001\u001a\u00020z8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R*\u0010\u0089\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R*\u0010\u0091\u0001\u001a\u00030\u008a\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R&\u0010\u0095\u0001\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010C\u001a\u0005\b\u0093\u0001\u0010E\"\u0005\b\u0094\u0001\u0010GR*\u0010\u009d\u0001\u001a\u00030\u0096\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R*\u0010¡\u0001\u001a\u00030\u008a\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u008c\u0001\u001a\u0006\b\u009f\u0001\u0010\u008e\u0001\"\u0006\b \u0001\u0010\u0090\u0001R)\u0010¤\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b \u0010\u0084\u0001\u001a\u0006\b¢\u0001\u0010\u0086\u0001\"\u0006\b£\u0001\u0010\u0088\u0001R*\u0010¬\u0001\u001a\u00030¥\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R\u001a\u0010°\u0001\u001a\u00030\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R)\u0010(\u001a\u0004\u0018\u00010\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0017\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0005\bµ\u0001\u0010*R+\u0010¼\u0001\u001a\u0005\u0018\u00010¶\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u000b\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001R,\u0010Ä\u0001\u001a\u0005\u0018\u00010½\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R,\u0010Ì\u0001\u001a\u0005\u0018\u00010Å\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R+\u0010Ó\u0001\u001a\u0005\u0018\u00010Í\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b;\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R&\u0010Ô\u0001\u001a\u00020-8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0004\b\u0014\u0010\u0010\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0005\bÖ\u0001\u00100R&\u0010Ø\u0001\u001a\u00020-8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0004\b#\u0010\u0010\u001a\u0006\b¯\u0001\u0010Õ\u0001\"\u0005\b×\u0001\u00100R\u0018\u0010Ù\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b)\u0010Ï\u0001R\u0018\u0010Ú\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b!\u0010Ï\u0001R\u0019\u0010Ü\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010Ï\u0001R)\u0010ã\u0001\u001a\u00030Ý\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0012\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010à\u0001\"\u0006\bá\u0001\u0010â\u0001R\u0017\u0010æ\u0001\u001a\u00030ä\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b,\u0010å\u0001R\u0017\u0010ç\u0001\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010\u0010R\u001c\u0010ê\u0001\u001a\u0005\u0018\u00010è\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010é\u0001¨\u0006ë\u0001"}, d2 = {"Ll/xln;", "Ll/emn;", "Ll/gln;", "Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetAct;", "act", "<init>", "(Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetAct;)V", "", "i0", "()V", "Landroid/view/View;", "v", "c0", "(Landroid/view/View;)V", "", "message", "Z", "(Ljava/lang/String;)V", "E", "()Landroid/view/View;", "z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", ProfileLikeCategoryType.height, "d0", "(I)V", "X", "b0", "r", "C", "scrollY", "A", "Lcom/p1/mobile/putong/data/User;", "user", "h0", "(Lcom/p1/mobile/putong/data/User;)V", "presenter", "B", "(Ll/gln;)V", "inflateView", "F", "", "hasFocus", "e0", "(Z)V", "", "Lcom/p1/mobile/putong/core/data/Message;", "messages", "f0", "(Ljava/util/List;)V", "Y", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "y", "()Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetAct;", "a", "Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetAct;", "G", "setAct", "Lv/VFrame;", "b", "Lv/VFrame;", "R", "()Lv/VFrame;", "set_greet_root_layout", "(Lv/VFrame;)V", "_greet_root_layout", "c", "Landroid/view/View;", "O", "set_greet_close_layout", "_greet_close_layout", "d", "L", "set_content", "_content", "e", "P", "set_greet_content", "_greet_content", "Landroid/widget/RelativeLayout;", "f", "Landroid/widget/RelativeLayout;", "get_greet_list_parent", "()Landroid/widget/RelativeLayout;", "set_greet_list_parent", "(Landroid/widget/RelativeLayout;)V", "_greet_list_parent", "g", "V", "set_list_parent", "_list_parent", "Lv/VList;", "h", "Lv/VList;", "Q", "()Lv/VList;", "set_greet_list", "(Lv/VList;)V", "_greet_list", "i", "get_tips_container", "set_tips_container", "_tips_container", "j", "N", "set_greet_bottom_layout", "_greet_bottom_layout", "Lv/VLinear;", "k", "Lv/VLinear;", "get_greet_bottom_input_layout", "()Lv/VLinear;", "set_greet_bottom_input_layout", "(Lv/VLinear;)V", "_greet_bottom_input_layout", "Lv/VEditText;", "l", "Lv/VEditText;", "M", "()Lv/VEditText;", "set_edit_greet", "(Lv/VEditText;)V", "_edit_greet", "Lv/VText;", "m", "Lv/VText;", "W", "()Lv/VText;", "set_send", "(Lv/VText;)V", "_send", "Lv/VImage;", "n", "Lv/VImage;", "get_tips_hello", "()Lv/VImage;", "set_tips_hello", "(Lv/VImage;)V", "_tips_hello", "o", "get_greet_top_layout", "set_greet_top_layout", "_greet_top_layout", "Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;", "p", "Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;", "T", "()Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;", "set_greet_user_image", "(Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;)V", "_greet_user_image", "q", "S", "set_greet_user_icon", "_greet_user_icon", "U", "set_greet_user_name", "_greet_user_name", "Lv/VIcon;", "s", "Lv/VIcon;", "K", "()Lv/VIcon;", "set_close", "(Lv/VIcon;)V", "_close", "", "t", "J", "lastClick", "u", "Ll/gln;", "getPresenter", "()Ll/gln;", "setPresenter", "Ll/dtl;", "Ll/dtl;", "H", "()Ll/dtl;", "setHeadView", "(Ll/dtl;)V", "headView", "Ll/gmn;", "w", "Ll/gmn;", "getHeadPresenter", "()Ll/gmn;", "setHeadPresenter", "(Ll/gmn;)V", "headPresenter", "Ll/omn;", "x", "Ll/omn;", "getAdapter", "()Ll/omn;", "setAdapter", "(Ll/omn;)V", "adapter", "Lcom/p1/mobile/putong/core/ui/intl/greet/message/IntlItemBreakIceMessage;", "Lcom/p1/mobile/putong/core/ui/intl/greet/message/IntlItemBreakIceMessage;", "I", "()Lcom/p1/mobile/putong/core/ui/intl/greet/message/IntlItemBreakIceMessage;", "setItemBreakIceMessage", "(Lcom/p1/mobile/putong/core/ui/intl/greet/message/IntlItemBreakIceMessage;)V", "itemBreakIceMessage", "isFirstRender", "()Z", "setFirstRender", "setKeyboardShowing", "keyboardShowing", "keyboardUpValue", "keyboardUpValueForIceView", "D", "keyboardHeight", "Landroid/view/animation/Interpolator;", "Landroid/view/animation/Interpolator;", "getInterpolator", "()Landroid/view/animation/Interpolator;", "setInterpolator", "(Landroid/view/animation/Interpolator;)V", "interpolator", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "checkTopActionBarState", "observeKeyboard", "Landroid/widget/PopupWindow;", "Landroid/widget/PopupWindow;", "adaptKeyBoardWindow", "message_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"l/xln$a", "Landroid/text/TextWatcher;", "", "s", "", GameStage.start, "count", "after", "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "message_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    @SourceDebugExtension
    public static final class C3482a implements TextWatcher {
        public C3482a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            s.getClass();
            VText vTextM10923W = xln.this.m10923W();
            String string = s.toString();
            int length = string.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.e(string.charAt(!z ? i : length), 32) <= 0;
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
            vTextM10923W.setEnabled(!TextUtils.isEmpty(string.subSequence(i, length + 1).toString()));
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
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"l/xln$b", "Landroid/widget/AbsListView$OnScrollListener;", "Landroid/widget/AbsListView;", "view", "", "scrollState", "", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", "firstVisibleItem", "visibleItemCount", "totalItemCount", "onScroll", "(Landroid/widget/AbsListView;III)V", "message_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    public static final class C3483b implements AbsListView.OnScrollListener {
        public C3483b() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
            view.getClass();
            if (!NullChecker.a(xln.this.getHeadView()) || firstVisibleItem != 0) {
                xln.this.m10902A(t100.S);
                return;
            }
            xln xlnVar = xln.this;
            dtl headView = xlnVar.getHeadView();
            headView.getClass();
            xlnVar.m10902A((int) ((-headView.getTop()) - xln.this.m10917Q().getTranslationY()));
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
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"l/xln$c", "Ll/bt0$j;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "onAnimationCancel", "message_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    public static final class C3484c extends bt0.j {
        public C3484c() {
        }

        public void onAnimationCancel(Animator animation) {
            animation.getClass();
            super.onAnimationCancel(animation);
            xln.this.observeKeyboard = false;
        }

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
                xln.m10897s(this.f4924a);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, com.p1.mobile.putong.core.ui.intl.greet.head.IntlUserGreetHeadView, l.dtl] */
    /* JADX INFO: renamed from: E */
    private final View m10877E() {
        LayoutInflater layoutInflaterInflater;
        IntlGreetAct intlGreetActAct = act();
        Object objInflate = null;
        if (intlGreetActAct != null && (layoutInflaterInflater = intlGreetActAct.inflater()) != null) {
            objInflate = layoutInflaterInflater.inflate(l6c0.f5923X0, (ViewGroup) null, false);
        }
        objInflate.getClass();
        ?? r1 = (IntlUserGreetHeadView) objInflate;
        this.headView = r1;
        if (NullChecker.a(this.act) && NullChecker.a(this.presenter)) {
            IntlGreetAct intlGreetAct = this.act;
            gln glnVar = this.presenter;
            glnVar.getClass();
            this.headPresenter = new gmn(intlGreetAct, glnVar, r1);
        }
        return r1;
    }

    /* JADX INFO: renamed from: Z */
    private final void m10878Z(String message) {
        if (NullChecker.a(m10917Q())) {
            final Message messageNew_ = Message.new_();
            messageNew_.messageType = MessageType.get("text");
            if (message == null) {
                message = "";
            }
            messageNew_.value = message;
            Runnable runnable = new Runnable() { // from class: l.kln
                @Override // java.lang.Runnable
                public final void run() {
                    xln.m10882c(this.f5671a, messageNew_);
                }
            };
            if (m10917Q().getLastVisiblePosition() == m10917Q().getCount() - 1) {
                runnable.run();
            } else {
                m10917Q().smoothScrollToPositionFromTop(m10917Q().getCount() - 1, -10000);
                m10917Q().postDelayed(runnable, 200L);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m10879a(xln xlnVar) {
        if (xlnVar.keyboardShowing) {
            int height = (xlnVar.m10917Q().getHeight() - xlnVar.m10922V().getHeight()) + xlnVar.keyboardHeight;
            int i = height - xlnVar.keyboardUpValue;
            if (height <= 0 || i <= 0) {
                return;
            }
            xlnVar.keyboardUpValue = height;
            bt0.u(true, xlnVar.interpolator, 0L, new Animator[]{bt0.q(xlnVar.m10917Q(), "translationY", new float[]{-height})}).start();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m10880a0(xln xlnVar, Message message) {
        gln glnVar = xlnVar.presenter;
        if (glnVar != null) {
            message.getClass();
            glnVar.m6766g1(message);
        }
        xlnVar.m10917Q().setSelection(xlnVar.m10917Q().getCount());
    }

    /* JADX INFO: renamed from: b */
    public static void m10881b(xln xlnVar, View view) {
        o6j0.m8403c("e_intl_ilike_im_lose", xlnVar.act.pageId(), new o6j0.C3390a[0]);
        xlnVar.m10904C();
        xlnVar.act.finish();
    }

    /* JADX INFO: renamed from: c */
    public static void m10882c(final xln xlnVar, final Message message) {
        if (xlnVar.m10917Q().getLastVisiblePosition() == xlnVar.m10917Q().getCount() - 1) {
            gln glnVar = xlnVar.presenter;
            if (glnVar != null) {
                message.getClass();
                glnVar.m6766g1(message);
            }
        } else {
            IntlGreetAct intlGreetActAct = xlnVar.act();
            if (intlGreetActAct != null) {
                intlGreetActAct.post(new Runnable() { // from class: l.nln
                    @Override // java.lang.Runnable
                    public final void run() {
                        xln.m10880a0(this.f6517a, message);
                    }
                });
            }
        }
        xlnVar.m10917Q().setSelection(xlnVar.m10917Q().getCount());
    }

    /* JADX INFO: renamed from: d */
    public static void m10884d(xln xlnVar, boolean z, int i, Boolean bool, Integer num) {
        if (!z) {
            i = 0;
        }
        xlnVar.m10927d0(i);
    }

    /* JADX INFO: renamed from: e */
    public static void m10885e(xln xlnVar, Message message) {
        gln glnVar = xlnVar.presenter;
        if (glnVar != null) {
            message.getClass();
            glnVar.m6766g1(message);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m10886f(xln xlnVar, User user, View view) {
        gln glnVar = xlnVar.presenter;
        if (glnVar != null) {
            glnVar.m6765e1("from_greet_act", ((DbObject) user).id);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static final void m10887g0(xln xlnVar) {
        xlnVar.checkTopActionBarState.run();
    }

    /* JADX INFO: renamed from: i */
    public static void m10888i(xln xlnVar, ValueAnimator valueAnimator) {
        xlnVar.checkTopActionBarState.run();
    }

    /* JADX INFO: renamed from: i0 */
    private final void m10889i0() {
        Window window;
        PutongAct putongActAct = act();
        if (putongActAct == null || (window = putongActAct.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(21);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m10890j(MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static void m10892l(xln xlnVar, View view) {
        xlnVar.m10883c0(view);
    }

    /* JADX INFO: renamed from: m */
    public static void m10893m(xln xlnVar, User user, View view) {
        gln glnVar = xlnVar.presenter;
        if (glnVar != null) {
            glnVar.m6765e1("from_greet_act", ((DbObject) user).id);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m10894n(View view) {
    }

    /* JADX INFO: renamed from: p */
    public static void m10895p(xln xlnVar, View view) {
        if (SystemClock.uptimeMillis() - xlnVar.lastClick > 1000) {
            xlnVar.lastClick = SystemClock.uptimeMillis();
            String string = xlnVar.m10913M().getText().toString();
            int length = string.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.e(string.charAt(!z ? i : length), 32) <= 0;
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
            xlnVar.m10878Z(string.subSequence(i, length + 1).toString());
            xlnVar.m10913M().setText("");
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m10896q(xln xlnVar, User user, View view) {
        gln glnVar = xlnVar.presenter;
        if (glnVar != null) {
            glnVar.m6765e1("from_greet_act", ((DbObject) user).id);
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m10897s(xln xlnVar) {
        if (xlnVar.m10917Q().getFirstVisiblePosition() != 0) {
            xlnVar.m10902A(t100.S);
            return;
        }
        dtl dtlVar = xlnVar.headView;
        if (dtlVar != null) {
            xlnVar.m10902A((int) ((-dtlVar.getTop()) - xlnVar.m10917Q().getTranslationY()));
        }
    }

    /* JADX INFO: renamed from: z */
    private final void m10901z() {
        PopupWindow popupWindow = new PopupWindow();
        this.adaptKeyBoardWindow = popupWindow;
        popupWindow.setContentView(this.act.inflater().inflate(l6c0.f5868O5, (ViewGroup) null, false));
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
    public final void m10902A(int scrollY) {
        VFrame vFrameM10916P = m10916P();
        int i = t100.t;
        vFrameM10916P.setClipChildren(scrollY > i);
        m10916P().setClipToPadding(scrollY > i);
        dtl dtlVar = this.headView;
        if (dtlVar != null) {
            dtlVar.mo3519b(m10920T(), m10919S(), m10921U(), scrollY);
        }
    }

    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void m10931i1(@Nullable gln presenter) {
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: C */
    public final void m10904C() {
        this.act.hideInput(m10913M());
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context m10905C0() {
        return this.act;
    }

    /* JADX INFO: renamed from: F */
    public final void m10906F() {
        PopupWindow popupWindow;
        if (NullChecker.a(this.adaptKeyBoardWindow) && (popupWindow = this.adaptKeyBoardWindow) != null && popupWindow.isShowing()) {
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
    public final VIcon m10911K() {
        VIcon vIcon = this._close;
        if (vIcon != null) {
            return vIcon;
        }
        Intrinsics.r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final VFrame m10912L() {
        VFrame vFrame = this._content;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final VEditText m10913M() {
        VEditText vEditText = this._edit_greet;
        if (vEditText != null) {
            return vEditText;
        }
        Intrinsics.r("_edit_greet");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final RelativeLayout m10914N() {
        RelativeLayout relativeLayout = this._greet_bottom_layout;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.r("_greet_bottom_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final View m10915O() {
        View view = this._greet_close_layout;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_greet_close_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final VFrame m10916P() {
        VFrame vFrame = this._greet_content;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.r("_greet_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VList m10917Q() {
        VList vList = this._greet_list;
        if (vList != null) {
            return vList;
        }
        Intrinsics.r("_greet_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final VFrame m10918R() {
        VFrame vFrame = this._greet_root_layout;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.r("_greet_root_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VImage m10919S() {
        VImage vImage = this._greet_user_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_greet_user_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final HeaderFrameWrapper m10920T() {
        HeaderFrameWrapper headerFrameWrapper = this._greet_user_image;
        if (headerFrameWrapper != null) {
            return headerFrameWrapper;
        }
        Intrinsics.r("_greet_user_image");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final VText m10921U() {
        VText vText = this._greet_user_name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_greet_user_name");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VFrame m10922V() {
        VFrame vFrame = this._list_parent;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.r("_list_parent");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VText m10923W() {
        VText vText = this._send;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_send");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0049  */
    /* JADX INFO: renamed from: X */
    public final void m10924X() {
        Animator animatorU;
        this.keyboardShowing = false;
        if (NullChecker.a(this.itemBreakIceMessage)) {
            IntlItemBreakIceMessage intlItemBreakIceMessage = this.itemBreakIceMessage;
            intlItemBreakIceMessage.getClass();
            if (intlItemBreakIceMessage.getVisibility() == 0) {
                animatorU = bt0.u(true, this.interpolator, 390L, new Animator[]{bt0.q(m10914N(), "translationY", new float[]{0.0f}), bt0.q(m10917Q(), "translationY", new float[]{0.0f}), bt0.q(this.itemBreakIceMessage, "translationY", new float[]{0.0f})});
            } else {
                animatorU = bt0.u(true, this.interpolator, 390L, new Animator[]{bt0.q(m10914N(), "translationY", new float[]{0.0f}), bt0.q(m10917Q(), "translationY", new float[]{0.0f})});
            }
        } else {
            animatorU = bt0.u(true, this.interpolator, 390L, new Animator[]{bt0.q(m10914N(), "translationY", new float[]{0.0f}), bt0.q(m10917Q(), "translationY", new float[]{0.0f})});
        }
        bt0.f(animatorU, this.checkTopActionBarState).start();
        m10926b0();
    }

    /* JADX INFO: renamed from: Y */
    public final void m10925Y(@NotNull User user) {
        user.getClass();
        if (NullChecker.a(this.itemBreakIceMessage)) {
            xdl0.M(this.itemBreakIceMessage, true);
            return;
        }
        IntlItemBreakIceMessage intlItemBreakIceMessage = (IntlItemBreakIceMessage) act().inflater().inflate(l6c0.f5849M0, (ViewGroup) m10912L(), false);
        this.itemBreakIceMessage = intlItemBreakIceMessage;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) (intlItemBreakIceMessage != null ? intlItemBreakIceMessage.getLayoutParams() : null);
        if (layoutParams != null) {
            layoutParams.gravity = 17;
        }
        m10912L().addView(this.itemBreakIceMessage, layoutParams);
        IntlItemBreakIceMessage intlItemBreakIceMessage2 = this.itemBreakIceMessage;
        if (intlItemBreakIceMessage2 != null) {
            intlItemBreakIceMessage2.m3548h(user, this.act);
        }
        IntlItemBreakIceMessage intlItemBreakIceMessage3 = this.itemBreakIceMessage;
        if (intlItemBreakIceMessage3 != null) {
            intlItemBreakIceMessage3.f2191e = new IntlItemBreakIceMessage.InterfaceC3153a() { // from class: l.mln
                @Override // com.p000p1.mobile.putong.core.p001ui.intl.greet.message.IntlItemBreakIceMessage.InterfaceC3153a
                /* JADX INFO: renamed from: a */
                public final void mo3549a(Message message) {
                    xln.m10885e(this.f6357a, message);
                }
            };
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m10926b0() {
        if (this.observeKeyboard) {
            return;
        }
        ValueAnimator duration = ValueAnimator.ofInt(1).setDuration(390L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.pln
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                xln.m10888i(this.f6866a, valueAnimator);
            }
        });
        duration.addListener(new C3484c());
        duration.start();
        this.observeKeyboard = true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX INFO: renamed from: d0 */
    public final void m10927d0(int height) {
        int bottom;
        if (height == 0 && this.keyboardShowing) {
            m10924X();
            return;
        }
        if (height > 0) {
            this.keyboardHeight = height;
            this.keyboardShowing = true;
            this.keyboardUpValue = (m10917Q().getHeight() - m10922V().getHeight()) + height;
            if (NullChecker.a(this.itemBreakIceMessage)) {
                IntlItemBreakIceMessage intlItemBreakIceMessage = this.itemBreakIceMessage;
                intlItemBreakIceMessage.getClass();
                if (intlItemBreakIceMessage.getVisibility() == 0) {
                    IntlItemBreakIceMessage intlItemBreakIceMessage2 = this.itemBreakIceMessage;
                    intlItemBreakIceMessage2.getClass();
                    bottom = intlItemBreakIceMessage2.getBottom() - (m10914N().getHeight() + height);
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
            bt0.f(i > 0 ? bt0.u(true, interpolator, 390L, new Animator[]{bt0.q(m10917Q(), "translationY", new float[]{-this.keyboardUpValue}), bt0.q(m10914N(), "translationY", new float[]{-height}), bt0.q(this.itemBreakIceMessage, "translationY", new float[]{-this.keyboardUpValueForIceView})}) : bt0.u(true, interpolator, 390L, new Animator[]{bt0.q(m10917Q(), "translationY", new float[]{-this.keyboardUpValue}), bt0.q(m10914N(), "translationY", new float[]{-height})}), this.checkTopActionBarState).start();
            m10926b0();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m10928e0(boolean hasFocus) {
        gln glnVar;
        PopupWindow popupWindow;
        if (!hasFocus || (glnVar = this.presenter) == null || !glnVar.m6763c1() || (popupWindow = this.adaptKeyBoardWindow) == null || popupWindow.isShowing()) {
            return;
        }
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.showAtLocation(this.act.getWindow().getDecorView(), 0, 0, 0);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m10929f0(@NotNull List<? extends Message> messages) {
        messages.getClass();
        omn omnVar = this.adapter;
        if (omnVar != null) {
            omnVar.m8513z(messages);
            if (this.isFirstRender) {
                m10917Q().setSelection(Integer.MAX_VALUE);
                m10917Q().smoothScrollToPositionFromTop(m10917Q().getCount() - 1, -10000);
                this.isFirstRender = false;
                m10917Q().post(new Runnable() { // from class: l.lln
                    @Override // java.lang.Runnable
                    public final void run() {
                        xln.m10887g0(this.f6166a);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m10930h0(@NotNull final User user) {
        user.getClass();
        m10913M().setHint(this.act.string(R$string.f475N0));
        xdl0.M(m10920T(), true);
        xdl0.M(m10921U(), true);
        xdl0.M(m10919S(), true);
        m10920T().v0(user, rw6.m9196b(user).profileSmall());
        m10921U().setText(user.name);
        dtl dtlVar = this.headView;
        if (dtlVar != null) {
            dtlVar.mo3520c(user, false);
        }
        xdl0.E0(m10920T(), new View.OnClickListener() { // from class: l.qln
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xln.m10886f(this.f7042a, user, view);
            }
        });
        xdl0.E0(m10921U(), new View.OnClickListener() { // from class: l.rln
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xln.m10893m(this.f7188a, user, view);
            }
        });
        dtl dtlVar2 = this.headView;
        if (dtlVar2 != null) {
            dtlVar2.setOnAvatarClickListener(new View.OnClickListener() { // from class: l.sln
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xln.m10896q(this.f7381a, user, view);
                }
            });
        }
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM10933v = m10933v(inflater, parent);
        m10917Q().addHeaderView(m10877E());
        m10917Q().setHeaderDividersEnabled(false);
        this.adapter = new omn(this.act, m10917Q());
        m10917Q().setAdapter(this.adapter);
        a aVar = this.adapter;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
        View upKeyboardDetectorLayout = this.act.setUpKeyboardDetectorLayout(viewM10933v, new View(this.act), new h30() { // from class: l.oln
            /* JADX INFO: renamed from: b */
            public final void m8502b(Object obj, Object obj2, Object obj3, Object obj4) {
                xln.m10884d(this.f6681a, ((Boolean) obj).booleanValue(), ((Integer) obj2).intValue(), (Boolean) obj3, (Integer) obj4);
            }
        });
        gln glnVar = this.presenter;
        if (glnVar != null && glnVar.m6763c1()) {
            m10901z();
        }
        upKeyboardDetectorLayout.getClass();
        return upKeyboardDetectorLayout;
    }

    /* JADX INFO: renamed from: r */
    public final void m10932r() {
        m10889i0();
        this.act.setSwipeBackEnable(false);
        if (NullChecker.a(m10919S())) {
            m10919S().setImageResource(c3c0.f3698W0);
        }
        this.keyboardShowing = false;
        m10917Q().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.tln
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                xln.m10879a(this.f7584a);
            }
        });
        xdl0.E0(m10911K(), new View.OnClickListener() { // from class: l.uln
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xln.m10881b(this.f7771a, view);
            }
        });
        m10913M().addTextChangedListener(new C3482a());
        m10913M().setText("");
        xdl0.E0(m10913M(), new View.OnClickListener() { // from class: l.vln
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xln.m10892l(this.f7998a, view);
            }
        });
        xdl0.E0(m10923W(), new View.OnClickListener() { // from class: l.wln
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xln.m10895p(this.f8199a, view);
            }
        });
        xdl0.E0(m10915O(), new View.OnClickListener() { // from class: l.iln
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xln.m10894n(view);
            }
        });
        m10917Q().setOnScrollListener(new C3483b());
        m10918R().setOnDispatchTouchEventListener(new ud50() { // from class: l.jln
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return xln.m10890j(motionEvent);
            }
        });
        IntlGreetingParam param = this.act.getParam();
        if (param == null || TextUtils.isEmpty(param.getPreSendMsg()) || param.getHotLevel() > 0) {
            return;
        }
        m10878Z(param.getPreSendMsg());
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final View m10933v(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM11258b = yln.m11258b(this, inflater, parent);
        viewM11258b.getClass();
        return viewM11258b;
    }

    @NotNull
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public IntlGreetAct act() {
        return this.act;
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: c0 */
    private final void m10883c0(View v) {
    }
}
