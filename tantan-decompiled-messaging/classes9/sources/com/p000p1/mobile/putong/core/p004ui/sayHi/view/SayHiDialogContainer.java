package com.p000p1.mobile.putong.core.p004ui.sayHi.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.sayHi.view.SayHiDialogContainer;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.greet.d;
import com.p1.mobile.putong.data.User;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import l.a1c0;
import l.c3c0;
import l.d30;
import l.e30;
import l.isd0;
import l.mkd0;
import l.s5h0;
import l.svq;
import l.t100;
import l.w9j;
import l.zre0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;
import v.VEditText;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ\u000f\u0010 \u001a\u00020\fH\u0002¢\u0006\u0004\b \u0010\u001dJ\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180!H\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010\u001dJ\u0017\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020\nH\u0002¢\u0006\u0004\b)\u0010\u000eJ\u000f\u0010*\u001a\u00020\fH\u0014¢\u0006\u0004\b*\u0010\u001dJ\u001d\u0010/\u001a\u00020\f2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J3\u00106\u001a\u00020\f2\u0006\u0010,\u001a\u00020+2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020-2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u001804¢\u0006\u0004\b6\u00107R\"\u0010>\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010D\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010\u000eR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010X\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010G\u001a\u0004\bV\u0010I\"\u0004\bW\u0010KR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010d\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010O\u001a\u0004\bb\u0010Q\"\u0004\bc\u0010SR\"\u0010l\u001a\u00020e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010p\u001a\u00020e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bm\u0010g\u001a\u0004\bn\u0010i\"\u0004\bo\u0010kR\"\u0010x\u001a\u00020q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\"\u0010|\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010[\u001a\u0004\bz\u0010]\"\u0004\b{\u0010_R#\u0010\u0080\u0001\u001a\u00020e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b}\u0010g\u001a\u0004\b~\u0010i\"\u0004\b\u007f\u0010kR&\u0010\u0084\u0001\u001a\u00020q8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010s\u001a\u0005\b\u0082\u0001\u0010u\"\u0005\b\u0083\u0001\u0010wR&\u0010\u0088\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010[\u001a\u0005\b\u0086\u0001\u0010]\"\u0005\b\u0087\u0001\u0010_R%\u0010\u008b\u0001\u001a\u00020e8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\r\u0010g\u001a\u0005\b\u0089\u0001\u0010i\"\u0005\b\u008a\u0001\u0010kR&\u0010\u008f\u0001\u001a\u00020q8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008c\u0001\u0010s\u001a\u0005\b\u008d\u0001\u0010u\"\u0005\b\u008e\u0001\u0010wR%\u0010\u0092\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b%\u0010[\u001a\u0005\b\u0090\u0001\u0010]\"\u0005\b\u0091\u0001\u0010_R%\u0010\u0095\u0001\u001a\u00020e8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b)\u0010g\u001a\u0005\b\u0093\u0001\u0010i\"\u0005\b\u0094\u0001\u0010kR(\u0010\u009b\u0001\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b'\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R)\u0010¢\u0001\u001a\u00030\u009c\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u001f\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R%\u0010¥\u0001\u001a\u00020e8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u001a\u0010g\u001a\u0005\b£\u0001\u0010i\"\u0005\b¤\u0001\u0010kR\u0016\u0010§\u0001\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0007\n\u0005\b/\u0010¦\u0001R!\u0010«\u0001\u001a\r ©\u0001*\u0005\u0018\u00010¨\u00010¨\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b6\u0010ª\u0001R\u0017\u0010,\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0013\u0010¬\u0001R\u0017\u00102\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u001c\u0010\u00ad\u0001R\u0018\u0010®\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b \u0010¦\u0001R\u0018\u0010¯\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0011\u0010¦\u0001R\u0018\u0010°\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0016\u0010¦\u0001R\u0019\u0010³\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u001b\u0010µ\u0001\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010¦\u0001R\u001a\u0010·\u0001\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¶\u0001\u0010sR\u001a\u0010¹\u0001\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¸\u0001\u0010[R\u001a\u0010»\u0001\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bº\u0001\u0010gR\u0019\u0010¾\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0019\u0010¿\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010½\u0001¨\u0006À\u0001"}, d2 = {"Lcom/p1/mobile/putong/core/ui/sayHi/view/SayHiDialogContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "view", "", "o", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/data/User;", "user", "A", "(Lcom/p1/mobile/putong/data/User;)V", "x", "Lcom/tantan/library/svga/compose/SVGADynamicEntity;", "entity", "B", "(Lcom/tantan/library/svga/compose/SVGADynamicEntity;)V", "", "curValue", "u", "(Ljava/lang/String;)V", "y", "()V", "itemValue", "t", "z", "", "getItemValues", "()Ljava/util/List;", "name", "q", "(Ljava/lang/String;)Ljava/lang/String;", "s", "targetView", "r", "onFinishInflate", "Lcom/p1/mobile/android/app/Act;", "act", "Ll/d30;", "complete", "v", "(Lcom/p1/mobile/android/app/Act;Ll/d30;)V", "Lcom/p1/mobile/putong/core/ui/greet/d$a;", "greetBuilder", "close", "Ll/e30;", "send", "w", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/ui/greet/d$a;Ll/d30;Ll/e30;)V", "a", "Lcom/p1/mobile/putong/core/ui/sayHi/view/SayHiDialogContainer;", "get_root_view", "()Lcom/p1/mobile/putong/core/ui/sayHi/view/SayHiDialogContainer;", "set_root_view", "(Lcom/p1/mobile/putong/core/ui/sayHi/view/SayHiDialogContainer;)V", "_root_view", "b", "Landroid/view/View;", "get_shadow", "()Landroid/view/View;", "set_shadow", "_shadow", "Landroid/widget/RelativeLayout;", "c", "Landroid/widget/RelativeLayout;", "get_say_hi_anim_rl", "()Landroid/widget/RelativeLayout;", "set_say_hi_anim_rl", "(Landroid/widget/RelativeLayout;)V", "_say_hi_anim_rl", "Lcom/tantan/library/svga/SVGAnimationView;", "d", "Lcom/tantan/library/svga/SVGAnimationView;", "get_say_hi_anim", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_say_hi_anim", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_say_hi_anim", "e", "get_dialog_rl", "set_dialog_rl", "_dialog_rl", "Lv/VImage;", "f", "Lv/VImage;", "get_right_close", "()Lv/VImage;", "set_right_close", "(Lv/VImage;)V", "_right_close", "g", "get_head_anim", "set_head_anim", "_head_anim", "Lv/VText;", "h", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "i", "get_sub_title", "set_sub_title", "_sub_title", "Lv/VLinear;", "j", "Lv/VLinear;", "get_item_value_one", "()Lv/VLinear;", "set_item_value_one", "(Lv/VLinear;)V", "_item_value_one", "k", "get_item_value_one_ic", "set_item_value_one_ic", "_item_value_one_ic", "l", "get_item_value_one_txt", "set_item_value_one_txt", "_item_value_one_txt", "m", "get_item_value_two", "set_item_value_two", "_item_value_two", "n", "get_item_value_two_ic", "set_item_value_two_ic", "_item_value_two_ic", "get_item_value_two_txt", "set_item_value_two_txt", "_item_value_two_txt", "p", "get_item_value_three", "set_item_value_three", "_item_value_three", "get_item_value_three_ic", "set_item_value_three_ic", "_item_value_three_ic", "get_item_value_three_txt", "set_item_value_three_txt", "_item_value_three_txt", "Landroid/widget/FrameLayout;", "get_input_content", "()Landroid/widget/FrameLayout;", "set_input_content", "(Landroid/widget/FrameLayout;)V", "_input_content", "Lv/VEditText;", "Lv/VEditText;", "get_input_content_input_edit", "()Lv/VEditText;", "set_input_content_input_edit", "(Lv/VEditText;)V", "_input_content_input_edit", "get_input_content_send", "set_input_content_send", "_input_content_send", "Ljava/lang/String;", "EMOTICON_REGEXP", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "Ljava/util/regex/Pattern;", "EMOTICON_PATTERN", "Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/ui/greet/d$a;", "curItemValueOne", "curItemValueTwo", "curItemValueThree", "C", "Lcom/p1/mobile/putong/data/User;", "otherUser", "D", "curSelectedItemValue", "E", "curSelectedValueContainer", "F", "curSelectedValueIc", "G", "curSelectedValueTxt", "H", "I", "mMaxHeight", "mLastHeight", "message_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class SayHiDialogContainer extends FrameLayout {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public String curItemValueTwo;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public String curItemValueThree;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public User otherUser;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public String curSelectedItemValue;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public VLinear curSelectedValueContainer;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public VImage curSelectedValueIc;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    public VText curSelectedValueTxt;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public int mMaxHeight;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public int mLastHeight;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public SayHiDialogContainer _root_view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public View _shadow;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public RelativeLayout _say_hi_anim_rl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public SVGAnimationView _say_hi_anim;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public RelativeLayout _dialog_rl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VImage _right_close;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public SVGAnimationView _head_anim;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _sub_title;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VLinear _item_value_one;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VImage _item_value_one_ic;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VText _item_value_one_txt;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VLinear _item_value_two;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VImage _item_value_two_ic;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VText _item_value_two_txt;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VLinear _item_value_three;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VImage _item_value_three_ic;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public VText _item_value_three_txt;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public FrameLayout _input_content;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public VEditText _input_content_input_edit;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public VText _input_content_send;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final String EMOTICON_REGEXP;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public final Pattern EMOTICON_PATTERN;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public Act act;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public d.a greetBuilder;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public String curItemValueOne;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.sayHi.view.SayHiDialogContainer$a */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"com/p1/mobile/putong/core/ui/sayHi/view/SayHiDialogContainer$a", "Lcom/tantan/library/svga/AnimListener;", "", "onFinished", "()V", "onStart", "message_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0276a extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f5536a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SayHiDialogContainer f5537b;

        public C0276a(d30 d30Var, SayHiDialogContainer sayHiDialogContainer) {
            this.f5536a = d30Var;
            this.f5537b = sayHiDialogContainer;
        }

        public void onFinished() {
            this.f5536a.call();
        }

        public void onStart() {
            this.f5537b.get_say_hi_anim_rl().setVisibility(0);
            this.f5537b.get_dialog_rl().setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.sayHi.view.SayHiDialogContainer$b */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"com/p1/mobile/putong/core/ui/sayHi/view/SayHiDialogContainer$b", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "message_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0277b implements TextWatcher {
        public C0277b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            SayHiDialogContainer.this.m8303u(s != null ? s.toString() : null);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SayHiDialogContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.EMOTICON_REGEXP = "\\[(.*?)\\]";
        this.EMOTICON_PATTERN = Pattern.compile("\\[(.*?)\\]");
    }

    /* JADX INFO: renamed from: a */
    public static void m8281a(Ref.IntRef intRef, SayHiDialogContainer sayHiDialogContainer, SVGADynamicEntity sVGADynamicEntity, Boolean bool) {
        int i = intRef.element + 1;
        intRef.element = i;
        if (i == 2) {
            sayHiDialogContainer.m8297B(sVGADynamicEntity);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m8282b(SayHiDialogContainer sayHiDialogContainer, User user) {
        user.getClass();
        sayHiDialogContainer.m8296A(user);
    }

    /* JADX INFO: renamed from: c */
    public static void m8283c(SayHiDialogContainer sayHiDialogContainer) {
        SayHiDialogContainer sayHiDialogContainer2 = sayHiDialogContainer.get_root_view();
        if (sayHiDialogContainer2 != null) {
            sayHiDialogContainer.m8300r(sayHiDialogContainer2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m8284d(e30 e30Var, SayHiDialogContainer sayHiDialogContainer, View view) {
        Editable text = sayHiDialogContainer.get_input_content_input_edit().getText();
        e30Var.call(text != null ? text.toString() : null);
    }

    /* JADX INFO: renamed from: e */
    public static void m8285e(d30 d30Var, View view) {
        d30Var.call();
    }

    /* JADX INFO: renamed from: f */
    public static void m8286f(View view) {
        view.setTranslationY(-svq.c(25));
    }

    /* JADX INFO: renamed from: g */
    public static void m8287g(SayHiDialogContainer sayHiDialogContainer, View view) {
        String str = sayHiDialogContainer.curItemValueTwo;
        if (str == null) {
            Intrinsics.r("curItemValueTwo");
            str = null;
        }
        sayHiDialogContainer.m8302t(str);
    }

    private final List<String> getItemValues() {
        return CollectionsKt.take(CollectionsKt.shuffled(CollectionsKt.mutableListOf(new String[]{"[在吗]嘿，快看看我！", "Yo! 好喜欢你的头像！", "哈喽，上周末去哪玩儿了呀？", "看距离咱俩好近呀！", "嗨，最近吃啥好吃的了吗？", "Hi，最近有什么好看的电影？"})), 3);
    }

    /* JADX INFO: renamed from: h */
    public static Boolean m8288h(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i */
    public static void m8289i(Ref.IntRef intRef, SayHiDialogContainer sayHiDialogContainer, SVGADynamicEntity sVGADynamicEntity, Boolean bool) {
        int i = intRef.element + 1;
        intRef.element = i;
        if (i == 2) {
            sayHiDialogContainer.m8297B(sVGADynamicEntity);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m8290j(d30 d30Var, Throwable th) {
        d30Var.call();
    }

    /* JADX INFO: renamed from: k */
    public static void m8291k(SayHiDialogContainer sayHiDialogContainer) {
        ViewGroup.LayoutParams layoutParams = sayHiDialogContainer.get_say_hi_anim_rl().getLayoutParams();
        layoutParams.height = sayHiDialogContainer.get_dialog_rl().getHeight();
        sayHiDialogContainer.get_say_hi_anim_rl().setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = sayHiDialogContainer.get_say_hi_anim().getLayoutParams();
        layoutParams2.height = sayHiDialogContainer.get_dialog_rl().getHeight();
        int height = (int) (sayHiDialogContainer.get_dialog_rl().getHeight() * 0.6356f);
        layoutParams2.width = height;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = (sayHiDialogContainer.get_dialog_rl().getWidth() - height) / 2;
        }
        sayHiDialogContainer.get_say_hi_anim().setLayoutParams(layoutParams2);
    }

    /* JADX INFO: renamed from: l */
    public static void m8292l(SayHiDialogContainer sayHiDialogContainer, View view) {
        String str = sayHiDialogContainer.curItemValueThree;
        if (str == null) {
            Intrinsics.r("curItemValueThree");
            str = null;
        }
        sayHiDialogContainer.m8302t(str);
    }

    /* JADX INFO: renamed from: m */
    public static void m8293m(SayHiDialogContainer sayHiDialogContainer, View view) {
        String str = sayHiDialogContainer.curItemValueOne;
        if (str == null) {
            Intrinsics.r("curItemValueOne");
            str = null;
        }
        sayHiDialogContainer.m8302t(str);
    }

    /* JADX INFO: renamed from: n */
    public static Boolean m8294n(User user) {
        return Boolean.valueOf(NullChecker.a(user));
    }

    /* JADX INFO: renamed from: A */
    public final void m8296A(User user) {
        this.otherUser = user;
        get_title().setText("对" + m8299q(user.name) + "的抢先告白");
        get_sub_title().setText("无需配对，直接向对方表达你的心意！");
        get_input_content_input_edit().setHint("对" + (user.isFemale() ? "她" : "他") + "说点什么...");
        m8306x(user);
        m8307y();
        get_input_content_input_edit().addTextChangedListener(new C0277b());
    }

    /* JADX INFO: renamed from: B */
    public final void m8297B(SVGADynamicEntity entity) {
        Context context = this.act;
        if (context == null) {
            Intrinsics.r("act");
            context = null;
        }
        SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/996a4557-347b-4d2e-9e87-7b4d475c2d8014.pdf").repeatCount(1).dynamic(entity).autoPlay(true).into(get_head_anim());
    }

    @NotNull
    public final RelativeLayout get_dialog_rl() {
        RelativeLayout relativeLayout = this._dialog_rl;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.r("_dialog_rl");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_head_anim() {
        SVGAnimationView sVGAnimationView = this._head_anim;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.r("_head_anim");
        return null;
    }

    @NotNull
    public final FrameLayout get_input_content() {
        FrameLayout frameLayout = this._input_content;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_input_content");
        return null;
    }

    @NotNull
    public final VEditText get_input_content_input_edit() {
        VEditText vEditText = this._input_content_input_edit;
        if (vEditText != null) {
            return vEditText;
        }
        Intrinsics.r("_input_content_input_edit");
        return null;
    }

    @NotNull
    public final VText get_input_content_send() {
        VText vText = this._input_content_send;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_input_content_send");
        return null;
    }

    @NotNull
    public final VLinear get_item_value_one() {
        VLinear vLinear = this._item_value_one;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_item_value_one");
        return null;
    }

    @NotNull
    public final VImage get_item_value_one_ic() {
        VImage vImage = this._item_value_one_ic;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_item_value_one_ic");
        return null;
    }

    @NotNull
    public final VText get_item_value_one_txt() {
        VText vText = this._item_value_one_txt;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_item_value_one_txt");
        return null;
    }

    @NotNull
    public final VLinear get_item_value_three() {
        VLinear vLinear = this._item_value_three;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_item_value_three");
        return null;
    }

    @NotNull
    public final VImage get_item_value_three_ic() {
        VImage vImage = this._item_value_three_ic;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_item_value_three_ic");
        return null;
    }

    @NotNull
    public final VText get_item_value_three_txt() {
        VText vText = this._item_value_three_txt;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_item_value_three_txt");
        return null;
    }

    @NotNull
    public final VLinear get_item_value_two() {
        VLinear vLinear = this._item_value_two;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_item_value_two");
        return null;
    }

    @NotNull
    public final VImage get_item_value_two_ic() {
        VImage vImage = this._item_value_two_ic;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_item_value_two_ic");
        return null;
    }

    @NotNull
    public final VText get_item_value_two_txt() {
        VText vText = this._item_value_two_txt;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_item_value_two_txt");
        return null;
    }

    @NotNull
    public final VImage get_right_close() {
        VImage vImage = this._right_close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_right_close");
        return null;
    }

    @NotNull
    public final SayHiDialogContainer get_root_view() {
        SayHiDialogContainer sayHiDialogContainer = this._root_view;
        if (sayHiDialogContainer != null) {
            return sayHiDialogContainer;
        }
        Intrinsics.r("_root_view");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_say_hi_anim() {
        SVGAnimationView sVGAnimationView = this._say_hi_anim;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.r("_say_hi_anim");
        return null;
    }

    @NotNull
    public final RelativeLayout get_say_hi_anim_rl() {
        RelativeLayout relativeLayout = this._say_hi_anim_rl;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.r("_say_hi_anim_rl");
        return null;
    }

    @NotNull
    public final View get_shadow() {
        View view = this._shadow;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_shadow");
        return null;
    }

    @NotNull
    public final VText get_sub_title() {
        VText vText = this._sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_sub_title");
        return null;
    }

    @NotNull
    public final VText get_title() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_title");
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final void m8298o(View view) {
        isd0.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8298o(this);
        get_input_content_send().setVisibility(8);
        get_title().getPaint().setFakeBoldText(true);
        get_item_value_one_txt().getPaint().setFakeBoldText(true);
        get_item_value_two_txt().getPaint().setFakeBoldText(true);
        get_item_value_three_txt().getPaint().setFakeBoldText(true);
        get_input_content_input_edit().getPaint().setFakeBoldText(true);
        get_input_content_send().getPaint().setFakeBoldText(true);
        get_say_hi_anim().setLayerType(1, new Paint());
        get_head_anim().setLayerType(1, new Paint());
        get_dialog_rl().post(new Runnable() { // from class: l.urd0
            @Override // java.lang.Runnable
            public final void run() {
                SayHiDialogContainer.m8291k(this.f23722a);
            }
        });
        m8301s();
    }

    /* JADX INFO: renamed from: q */
    public final String m8299q(String name) {
        if (name == null) {
            return " ";
        }
        if (name.length() <= 7) {
            return " " + name + " ";
        }
        return " " + name.substring(0, 7) + "... ";
    }

    /* JADX INFO: renamed from: r */
    public final void m8300r(final View targetView) {
        Rect rect = new Rect();
        targetView.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height();
        int iMax = Math.max(this.mMaxHeight, iHeight);
        this.mMaxHeight = iMax;
        if (this.mLastHeight == iHeight) {
            return;
        }
        this.mLastHeight = iHeight;
        if (iHeight < iMax - 200) {
            targetView.post(new Runnable() { // from class: l.asd0
                @Override // java.lang.Runnable
                public final void run() {
                    SayHiDialogContainer.m8286f(targetView);
                }
            });
        } else {
            targetView.setTranslationY(0.0f);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m8301s() {
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.zrd0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                SayHiDialogContainer.m8283c(this.f28948a);
            }
        });
    }

    public final void set_dialog_rl(@NotNull RelativeLayout relativeLayout) {
        relativeLayout.getClass();
        this._dialog_rl = relativeLayout;
    }

    public final void set_head_anim(@NotNull SVGAnimationView sVGAnimationView) {
        sVGAnimationView.getClass();
        this._head_anim = sVGAnimationView;
    }

    public final void set_input_content(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._input_content = frameLayout;
    }

    public final void set_input_content_input_edit(@NotNull VEditText vEditText) {
        vEditText.getClass();
        this._input_content_input_edit = vEditText;
    }

    public final void set_input_content_send(@NotNull VText vText) {
        vText.getClass();
        this._input_content_send = vText;
    }

    public final void set_item_value_one(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._item_value_one = vLinear;
    }

    public final void set_item_value_one_ic(@NotNull VImage vImage) {
        vImage.getClass();
        this._item_value_one_ic = vImage;
    }

    public final void set_item_value_one_txt(@NotNull VText vText) {
        vText.getClass();
        this._item_value_one_txt = vText;
    }

    public final void set_item_value_three(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._item_value_three = vLinear;
    }

    public final void set_item_value_three_ic(@NotNull VImage vImage) {
        vImage.getClass();
        this._item_value_three_ic = vImage;
    }

    public final void set_item_value_three_txt(@NotNull VText vText) {
        vText.getClass();
        this._item_value_three_txt = vText;
    }

    public final void set_item_value_two(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._item_value_two = vLinear;
    }

    public final void set_item_value_two_ic(@NotNull VImage vImage) {
        vImage.getClass();
        this._item_value_two_ic = vImage;
    }

    public final void set_item_value_two_txt(@NotNull VText vText) {
        vText.getClass();
        this._item_value_two_txt = vText;
    }

    public final void set_right_close(@NotNull VImage vImage) {
        vImage.getClass();
        this._right_close = vImage;
    }

    public final void set_root_view(@NotNull SayHiDialogContainer sayHiDialogContainer) {
        sayHiDialogContainer.getClass();
        this._root_view = sayHiDialogContainer;
    }

    public final void set_say_hi_anim(@NotNull SVGAnimationView sVGAnimationView) {
        sVGAnimationView.getClass();
        this._say_hi_anim = sVGAnimationView;
    }

    public final void set_say_hi_anim_rl(@NotNull RelativeLayout relativeLayout) {
        relativeLayout.getClass();
        this._say_hi_anim_rl = relativeLayout;
    }

    public final void set_shadow(@NotNull View view) {
        view.getClass();
        this._shadow = view;
    }

    public final void set_sub_title(@NotNull VText vText) {
        vText.getClass();
        this._sub_title = vText;
    }

    public final void set_title(@NotNull VText vText) {
        vText.getClass();
        this._title = vText;
    }

    /* JADX INFO: renamed from: t */
    public final void m8302t(String itemValue) {
        if (TextUtils.equals(itemValue, this.curSelectedItemValue)) {
            return;
        }
        this.curSelectedItemValue = itemValue;
        get_input_content_input_edit().getText().clear();
        Matcher matcher = this.EMOTICON_PATTERN.matcher(itemValue);
        matcher.getClass();
        int iEnd = 0;
        while (matcher.find()) {
            if (matcher.start() > iEnd) {
                get_input_content_input_edit().getText().append((CharSequence) itemValue.substring(iEnd, matcher.start()));
                get_input_content_input_edit().getText().append((CharSequence) itemValue.substring(matcher.start(), matcher.end()));
                matcher.start();
            } else {
                get_input_content_input_edit().getText().append((CharSequence) itemValue.substring(matcher.start(), matcher.end()));
            }
            iEnd = matcher.end();
        }
        if (iEnd < itemValue.length()) {
            get_input_content_input_edit().getText().append((CharSequence) itemValue.substring(iEnd));
        }
        get_input_content_input_edit().setSelection(get_input_content_input_edit().getText().length());
    }

    /* JADX INFO: renamed from: u */
    public final void m8303u(String curValue) {
        this.curSelectedItemValue = curValue;
        String str = this.curItemValueOne;
        if (str == null) {
            Intrinsics.r("curItemValueOne");
            str = null;
        }
        if (Intrinsics.d(curValue, str)) {
            VLinear vLinear = this.curSelectedValueContainer;
            if (vLinear != null) {
                vLinear.setBackgroundResource(c3c0.c6);
            }
            VImage vImage = this.curSelectedValueIc;
            if (vImage != null) {
                vImage.setImageResource(c3c0.d6);
            }
            VText vText = this.curSelectedValueTxt;
            if (vText != null) {
                vText.setTextColor(Color.parseColor("#CCD05CD3"));
            }
            this.curSelectedValueContainer = get_item_value_one();
            this.curSelectedValueIc = get_item_value_one_ic();
            this.curSelectedValueTxt = get_item_value_one_txt();
            get_item_value_one().setBackgroundResource(c3c0.a6);
            get_item_value_one_ic().setImageResource(c3c0.b6);
            get_item_value_one_txt().setTextColor(Color.parseColor("#FFFFFF"));
        } else {
            String str2 = this.curItemValueTwo;
            if (str2 == null) {
                Intrinsics.r("curItemValueTwo");
                str2 = null;
            }
            if (Intrinsics.d(curValue, str2)) {
                VLinear vLinear2 = this.curSelectedValueContainer;
                if (vLinear2 != null) {
                    vLinear2.setBackgroundResource(c3c0.c6);
                }
                VImage vImage2 = this.curSelectedValueIc;
                if (vImage2 != null) {
                    vImage2.setImageResource(c3c0.d6);
                }
                VText vText2 = this.curSelectedValueTxt;
                if (vText2 != null) {
                    vText2.setTextColor(Color.parseColor("#CCD05CD3"));
                }
                this.curSelectedValueContainer = get_item_value_two();
                this.curSelectedValueIc = get_item_value_two_ic();
                this.curSelectedValueTxt = get_item_value_two_txt();
                get_item_value_two().setBackgroundResource(c3c0.a6);
                get_item_value_two_ic().setImageResource(c3c0.b6);
                get_item_value_two_txt().setTextColor(Color.parseColor("#FFFFFF"));
            } else {
                String str3 = this.curItemValueThree;
                if (str3 == null) {
                    Intrinsics.r("curItemValueThree");
                    str3 = null;
                }
                boolean zD = Intrinsics.d(curValue, str3);
                VLinear vLinear3 = this.curSelectedValueContainer;
                if (zD) {
                    if (vLinear3 != null) {
                        vLinear3.setBackgroundResource(c3c0.c6);
                    }
                    VImage vImage3 = this.curSelectedValueIc;
                    if (vImage3 != null) {
                        vImage3.setImageResource(c3c0.d6);
                    }
                    VText vText3 = this.curSelectedValueTxt;
                    if (vText3 != null) {
                        vText3.setTextColor(Color.parseColor("#CCD05CD3"));
                    }
                    this.curSelectedValueContainer = get_item_value_three();
                    this.curSelectedValueIc = get_item_value_three_ic();
                    this.curSelectedValueTxt = get_item_value_three_txt();
                    get_item_value_three().setBackgroundResource(c3c0.a6);
                    get_item_value_three_ic().setImageResource(c3c0.b6);
                    get_item_value_three_txt().setTextColor(Color.parseColor("#FFFFFF"));
                } else {
                    if (vLinear3 != null) {
                        vLinear3.setBackgroundResource(c3c0.c6);
                    }
                    VImage vImage4 = this.curSelectedValueIc;
                    if (vImage4 != null) {
                        vImage4.setImageResource(c3c0.d6);
                    }
                    VText vText4 = this.curSelectedValueTxt;
                    if (vText4 != null) {
                        vText4.setTextColor(Color.parseColor("#CCD05CD3"));
                    }
                    this.curSelectedValueContainer = null;
                    this.curSelectedValueIc = null;
                    this.curSelectedValueTxt = null;
                }
            }
        }
        get_input_content_send().setVisibility(TextUtils.isEmpty(curValue) ? 8 : 0);
    }

    /* JADX INFO: renamed from: v */
    public final void m8304v(@NotNull Act act, @NotNull d30 complete) {
        act.getClass();
        complete.getClass();
        if (this.otherUser == null) {
            complete.call();
            return;
        }
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        s5h0 s5h0Var = s5h0.INSTANCE;
        User user = this.otherUser;
        User user2 = null;
        if (user == null) {
            Intrinsics.r("otherUser");
            user = null;
        }
        String str = user.fp().profileSmall().formatted();
        str.getClass();
        s5h0.g(s5h0Var, act, sVGADynamicEntity, str, "head01", 80, 106, (e30) null, 64, (Object) null);
        String str2 = CoreModule.f1534c.f3628e0.m21490p9().fp().profileMiddle().formatted();
        str2.getClass();
        s5h0.g(s5h0Var, act, sVGADynamicEntity, str2, "head02", 80, 106, (e30) null, 64, (Object) null);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(t100.f(18));
        textPaint.setColor(Color.parseColor("#B14BB3"));
        textPaint.setAntiAlias(true);
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        textPaint.setFakeBoldText(true);
        TextPaint textPaint2 = new TextPaint();
        textPaint2.setTextSize(t100.f(13));
        textPaint2.setColor(Color.parseColor("#66B14BB3"));
        textPaint2.setAntiAlias(true);
        textPaint2.setTextAlign(align);
        User user3 = this.otherUser;
        if (user3 == null) {
            Intrinsics.r("otherUser");
            user3 = null;
        }
        sVGADynamicEntity.setDynamicText("你对" + m8299q(user3.name) + "抢先告白", textPaint, "text01");
        User user4 = this.otherUser;
        if (user4 == null) {
            Intrinsics.r("otherUser");
        } else {
            user2 = user4;
        }
        sVGADynamicEntity.setDynamicText("我们会马上通知" + (user2.isFemale() ? "她" : "他") + "，期待你们的相遇", textPaint2, "text02");
        SVGALoader.with(act).from("https://auto.tancdn.com/v1/raw/002d7a0b-0a91-4601-9e4d-0a2fb1328c5d14.pdf").repeatCount(1).dynamic(sVGADynamicEntity).animListener(new C0276a(complete, this)).autoPlay(true).into(get_say_hi_anim());
    }

    /* JADX INFO: renamed from: w */
    public final void m8305w(@NotNull Act act, @NotNull d.a greetBuilder, @NotNull final d30 close, @NotNull final e30<String> send) {
        act.getClass();
        greetBuilder.getClass();
        close.getClass();
        send.getClass();
        this.act = act;
        this.greetBuilder = greetBuilder;
        get_right_close().setOnClickListener(new View.OnClickListener() { // from class: l.bsd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SayHiDialogContainer.m8285e(close, view);
            }
        });
        get_input_content_send().setOnClickListener(new View.OnClickListener() { // from class: l.csd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SayHiDialogContainer.m8284d(send, this, view);
            }
        });
        get_input_content().setBackgroundDrawable(new zre0(t100.d(10.0f), t100.d(10.0f), 0.0f, 0.0f, act.getResources().getColor(a1c0.u), -1));
        c cVarDuringCreated = act.duringCreated(CoreModule.f1534c.f3628e0.m21373Ka(greetBuilder.g()));
        final Function1 function1 = new Function1() { // from class: l.dsd0
            public final Object invoke(Object obj) {
                return SayHiDialogContainer.m8294n((User) obj);
            }
        };
        cVarDuringCreated.filter(new w9j() { // from class: l.esd0
            public final Object call(Object obj) {
                return SayHiDialogContainer.m8288h(function1, obj);
            }
        }).take(1).subscribe(mkd0.H(new e30() { // from class: l.fsd0
            public final void call(Object obj) {
                SayHiDialogContainer.m8282b(this.f12886a, (User) obj);
            }
        }, new e30() { // from class: l.gsd0
            public final void call(Object obj) {
                SayHiDialogContainer.m8290j(close, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x */
    public final void m8306x(User user) {
        Act act;
        final Ref.IntRef intRef = new Ref.IntRef();
        final SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        s5h0 s5h0Var = s5h0.INSTANCE;
        Act act2 = this.act;
        if (act2 == null) {
            Intrinsics.r("act");
            act2 = null;
        }
        String str = user.fp().profileMiddle().formatted();
        str.getClass();
        s5h0Var.f(act2, sVGADynamicEntity, str, "head01", 80, 106, new e30() { // from class: l.xrd0
            public final void call(Object obj) {
                SayHiDialogContainer.m8289i(intRef, this, sVGADynamicEntity, (Boolean) obj);
            }
        });
        Act act3 = this.act;
        if (act3 == null) {
            Intrinsics.r("act");
            act = null;
        } else {
            act = act3;
        }
        String str2 = CoreModule.f1534c.f3628e0.m21490p9().fp().profileMiddle().formatted();
        str2.getClass();
        s5h0Var.f(act, sVGADynamicEntity, str2, "head02", 80, 106, new e30() { // from class: l.yrd0
            public final void call(Object obj) {
                SayHiDialogContainer.m8281a(intRef, this, sVGADynamicEntity, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public final void m8307y() {
        List<String> itemValues = getItemValues();
        this.curItemValueOne = itemValues.get(0);
        this.curItemValueTwo = itemValues.get(1);
        this.curItemValueThree = itemValues.get(2);
        String str = null;
        this.curSelectedItemValue = null;
        VText vText = get_item_value_one_txt();
        String str2 = this.curItemValueOne;
        if (str2 == null) {
            Intrinsics.r("curItemValueOne");
            str2 = null;
        }
        vText.setText(str2);
        get_item_value_one().setOnClickListener(new View.OnClickListener() { // from class: l.hsd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SayHiDialogContainer.m8293m(this.f14036a, view);
            }
        });
        VText vText2 = get_item_value_two_txt();
        String str3 = this.curItemValueTwo;
        if (str3 == null) {
            Intrinsics.r("curItemValueTwo");
            str3 = null;
        }
        vText2.setText(str3);
        get_item_value_two().setOnClickListener(new View.OnClickListener() { // from class: l.vrd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SayHiDialogContainer.m8287g(this.f24434a, view);
            }
        });
        VText vText3 = get_item_value_three_txt();
        String str4 = this.curItemValueThree;
        if (str4 == null) {
            Intrinsics.r("curItemValueThree");
        } else {
            str = str4;
        }
        vText3.setText(str);
        get_item_value_three().setOnClickListener(new View.OnClickListener() { // from class: l.wrd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SayHiDialogContainer.m8292l(this.f25334a, view);
            }
        });
        m8308z();
    }

    /* JADX INFO: renamed from: z */
    public final void m8308z() {
        get_item_value_one().setBackgroundResource(c3c0.c6);
        get_item_value_one_ic().setImageResource(c3c0.d6);
        get_item_value_one_txt().setTextColor(Color.parseColor("#CCD05CD3"));
        get_item_value_two().setBackgroundResource(c3c0.c6);
        get_item_value_two_ic().setImageResource(c3c0.d6);
        get_item_value_two_txt().setTextColor(Color.parseColor("#CCD05CD3"));
        get_item_value_three().setBackgroundResource(c3c0.c6);
        get_item_value_three_ic().setImageResource(c3c0.d6);
        get_item_value_three_txt().setTextColor(Color.parseColor("#CCD05CD3"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SayHiDialogContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SayHiDialogContainer(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ SayHiDialogContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
