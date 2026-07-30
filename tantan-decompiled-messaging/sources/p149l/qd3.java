package p149l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomContent;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomCountdownOverActionEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomWindow;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubbleConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupButton;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u001d\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\u00020#2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b&\u0010\u000eJ\u0015\u0010'\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b'\u0010\u000eJ'\u0010*\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u00105\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u0010\nR\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010I\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010@\u001a\u0004\bG\u0010B\"\u0004\bH\u0010DR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010]\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010@\u001a\u0004\b[\u0010B\"\u0004\b\\\u0010DR\"\u0010a\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010L\u001a\u0004\b_\u0010N\"\u0004\b`\u0010PR\"\u0010e\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010T\u001a\u0004\bc\u0010V\"\u0004\bd\u0010XR\"\u0010i\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010@\u001a\u0004\bg\u0010B\"\u0004\bh\u0010DR\"\u0010m\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010L\u001a\u0004\bk\u0010N\"\u0004\bl\u0010PR\"\u0010q\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010T\u001a\u0004\bo\u0010V\"\u0004\bp\u0010XR\"\u0010u\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010@\u001a\u0004\bs\u0010B\"\u0004\bt\u0010DR\"\u0010y\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010@\u001a\u0004\bw\u0010B\"\u0004\bx\u0010DR\"\u0010}\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bz\u0010T\u001a\u0004\b{\u0010V\"\u0004\b|\u0010XR(\u0010\u0085\u0001\u001a\u00020~8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R \u0010\u008a\u0001\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R,\u0010\u008f\u0001\u001a\u0016\u0012\u0005\u0012\u00030\u008c\u00010\u008b\u0001j\n\u0012\u0005\u0012\u00030\u008c\u0001`\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\t\u0010\u008e\u0001R\u001b\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001f\u0010\u0090\u0001¨\u0006\u0092\u0001"}, m87232d2 = {"Ll/qd3;", "", "Ll/pfe0;", "presenter", "<init>", "(Ll/pfe0;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", BLiveStormDanmakuGiftResourceType.f44446s, "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftBubbleConfig;", Constants.KEY_CONFIG, j6f.GPS_MEASUREMENT_INTERRUPTED, "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftBubbleConfig;)V", "U", "c0", "", "Lcom/p1/mobile/putong/live/base/data/BLiveBottomContent;", "list", "Landroid/text/SpannableStringBuilder;", BaseSei.f13930X, "(Ljava/util/List;)Landroid/text/SpannableStringBuilder;", "P", "()V", "spannableStringBuilder", "", "text", "textColor", "", "startIndex", Constants.KEY_T, "(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Ljava/lang/String;I)V", "Ll/d30;", "onSendClick", "Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", "b0", "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftBubbleConfig;Ll/d30;)Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", "W", "a0", "", "needRenderBackground", "Q", "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftBubbleConfig;Ll/d30;Z)V", "a", "Ll/pfe0;", "getPresenter", "()Ll/pfe0;", "b", "Landroid/view/View;", "I", "()Landroid/view/View;", "set_shadow", "_shadow", "Landroid/widget/LinearLayout;", "c", "Landroid/widget/LinearLayout;", "H", "()Landroid/widget/LinearLayout;", "set_root", "(Landroid/widget/LinearLayout;)V", "_root", "Landroid/widget/TextView;", Constants.INAPP_DATA_TAG, "Landroid/widget/TextView;", b2s.C_ZONE, "()Landroid/widget/TextView;", "set_content", "(Landroid/widget/TextView;)V", "_content", "e", "D", "set_desc", "_desc", "Landroid/widget/FrameLayout;", "f", "Landroid/widget/FrameLayout;", "E", "()Landroid/widget/FrameLayout;", "set_one", "(Landroid/widget/FrameLayout;)V", "_one", "Lv/VDraweeView;", "g", "Lv/VDraweeView;", "F", "()Lv/VDraweeView;", "set_one_one_avatar", "(Lv/VDraweeView;)V", "_one_one_avatar", "h", "G", "set_one_one_text", "_one_one_text", RXScreenCaptureService.KEY_INDEX, "M", "set_two", "_two", "j", "N", "set_two_two_avatar", "_two_two_avatar", "k", BloodType.f38728O, "set_two_two_text", "_two_two_text", BLiveStormDanmakuGiftResourceType.f44444l, "J", "set_three", "_three", "m", "K", "set_three_three_avatar", "_three_three_avatar", "n", "L", "set_three_three_text", "_three_three_text", "o", "A", "set_button", "_button", "p", BaseSei.f13932Z, "set_avatar", "_avatar", "Lv/VImage;", "q", "Lv/VImage;", "B", "()Lv/VImage;", "set_close", "(Lv/VImage;)V", "_close", "r", "Lkotlin/Lazy;", BaseSei.f13931Y, "()Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", OMSTemplateType.dialog, "Ljava/util/ArrayList;", "Ll/c4g0;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "dismissSubscription1", "Ll/c4g0;", "dismissSubscription2", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class qd3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final pfe0 presenter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public View _shadow;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public LinearLayout _root;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _content;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _desc;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public FrameLayout _one;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VDraweeView _one_one_avatar;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public TextView _one_one_text;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public FrameLayout _two;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VDraweeView _two_two_avatar;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public TextView _two_two_text;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public FrameLayout _three;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VDraweeView _three_three_avatar;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public TextView _three_three_text;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public TextView _button;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VDraweeView _avatar;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VImage _close;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final Lazy dialog;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public ArrayList<c4g0> dismissSubscription1;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public c4g0 dismissSubscription2;

    public qd3(@NotNull pfe0 pfe0Var) {
        pfe0Var.getClass();
        this.presenter = pfe0Var;
        this.dialog = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.yc3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return qd3.m173956j(this.f197409a);
            }
        });
        this.dismissSubscription1 = new ArrayList<>();
    }

    /* JADX INFO: renamed from: R */
    public static final roj0 m173941R(ac20 ac20Var, Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            ac20Var.m95712e(bitmap.copy(config, false));
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: S */
    public static final roj0 m173942S(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T */
    public static final void m173943T(qd3 qd3Var, SpannableStringBuilder spannableStringBuilder, roj0 roj0Var) {
        qd3Var.m173968A().setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: X */
    public static final void m173944X(ArrayList arrayList, BLiveBottomContent bLiveBottomContent) {
        if (Intrinsics.m87488d(bLiveBottomContent.type.toString(), "countdown")) {
            arrayList.add(bLiveBottomContent);
        }
    }

    /* JADX INFO: renamed from: Y */
    public static final void m173945Y(BLiveBottomContent bLiveBottomContent) {
        bLiveBottomContent.countdownCurrentTime++;
    }

    /* JADX INFO: renamed from: Z */
    public static final void m173946Z(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, BLiveBottomContent bLiveBottomContent) {
        if (Intrinsics.m87488d(bLiveBottomContent.type.toString(), "text")) {
            bLiveBottomContent.textColor = bLiveGiftBubbleConfig.button.afterTextColor;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Boolean m173947a(BLiveBottomContent bLiveBottomContent) {
        return Boolean.valueOf(Intrinsics.m87488d(bLiveBottomContent.type.toString(), "countdown"));
    }

    /* JADX INFO: renamed from: d */
    public static void m173950d(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, qd3 qd3Var, View view) {
        if (bLiveGiftBubbleConfig.blackClose) {
            qd3Var.m173983P();
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m173951e(qd3 qd3Var, BLiveGiftBubbleConfig bLiveGiftBubbleConfig, View view) {
        qd3Var.presenter.m168635s4(false, bLiveGiftBubbleConfig.type, "close");
        qd3Var.m173983P();
    }

    /* JADX INFO: renamed from: h */
    public static void m173954h(final ArrayList arrayList, BLiveBottomWindow bLiveBottomWindow) {
        vwb.m200354z(bLiveBottomWindow.text, new e30() { // from class: l.bd3
            @Override // p149l.e30
            public final void call(Object obj) {
                qd3.m173944X(arrayList, (BLiveBottomContent) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static DialogC12611a m173956j(final qd3 qd3Var) {
        DialogC12611a dialogC12611a = new DialogC12611a(qd3Var.presenter, t6c0.f168570x, j2g0.m139458e(true));
        dialogC12611a.m71776h0(new e30() { // from class: l.hd3
            @Override // p149l.e30
            public final void call(Object obj) {
                qd3.m173965u(this.f107210a, (View) obj);
            }
        });
        dialogC12611a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.id3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                qd3.m173966v(this.f112516a, dialogInterface);
            }
        });
        return dialogC12611a;
    }

    /* JADX INFO: renamed from: m */
    public static void m173959m(qd3 qd3Var, BLiveGiftBubbleConfig bLiveGiftBubbleConfig, d30 d30Var, View view) {
        qd3Var.m173983P();
        qd3Var.presenter.m168635s4(false, bLiveGiftBubbleConfig.type, "");
        d30Var.call();
    }

    /* JADX INFO: renamed from: p */
    public static void m173962p(BLiveBottomContent bLiveBottomContent, ArrayList arrayList, qd3 qd3Var, final BLiveGiftBubbleConfig bLiveGiftBubbleConfig, Long l2) {
        long j = bLiveBottomContent.countdownCurrentTime;
        if (j < bLiveBottomContent.countdownEndTime) {
            bLiveBottomContent.countdownCurrentTime = j + 1;
            if (!vwb.m200296J(arrayList)) {
                vwb.m200354z(arrayList, new e30() { // from class: l.zc3
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        qd3.m173945Y((BLiveBottomContent) obj);
                    }
                });
                qd3Var.m173990c0(bLiveGiftBubbleConfig);
            }
            qd3Var.m173988a0(bLiveGiftBubbleConfig);
            return;
        }
        String str = bLiveGiftBubbleConfig.button.endAfterColor;
        mkd0.m154992z(qd3Var.dismissSubscription2);
        qd3Var.m173968A().setEnabled(Intrinsics.m87488d(bLiveBottomContent.countDownOverAction.toString(), BLiveBottomCountdownOverActionEnum.buttonLightUp));
        if (!TextUtils.isEmpty(bLiveGiftBubbleConfig.button.afterTextColor)) {
            vwb.m200354z(bLiveGiftBubbleConfig.button.richText, new e30() { // from class: l.ad3
                @Override // p149l.e30
                public final void call(Object obj) {
                    qd3.m173946Z(bLiveGiftBubbleConfig, (BLiveBottomContent) obj);
                }
            });
            qd3Var.m173984Q(bLiveGiftBubbleConfig, null, false);
        }
        if (TextUtils.isEmpty(bLiveGiftBubbleConfig.button.startAfterColor) || TextUtils.isEmpty(bLiveGiftBubbleConfig.button.endAfterColor)) {
            return;
        }
        float fM186890d = t100.m186890d(14.0f);
        float[] fArr = {fM186890d, fM186890d, fM186890d, fM186890d, fM186890d, fM186890d, fM186890d, fM186890d};
        BLiveGiftBubblePopupButton bLiveGiftBubblePopupButton = bLiveGiftBubbleConfig.button;
        qd3Var.m173968A().setBackground(xxj.m211501b(bLiveGiftBubblePopupButton.startAfterColor, bLiveGiftBubblePopupButton.endAfterColor, fArr));
    }

    /* JADX INFO: renamed from: q */
    public static void m173963q(final qd3 qd3Var, final SpannableStringBuilder spannableStringBuilder, final ac20 ac20Var) {
        ac20Var.getClass();
        if (ac20Var.m95711d()) {
            return;
        }
        String strM95710c = ac20Var.m95710c();
        strM95710c.getClass();
        int length = strM95710c.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.m87489e(strM95710c.charAt(!z ? i : length), 32) <= 0;
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
        if (TextUtils.isEmpty(strM95710c.subSequence(i, length + 1).toString())) {
            return;
        }
        String strM95710c2 = ac20Var.m95710c();
        strM95710c2.getClass();
        int length2 = strM95710c2.length() - 1;
        int i2 = 0;
        boolean z3 = false;
        while (i2 <= length2) {
            boolean z4 = Intrinsics.m87489e(strM95710c2.charAt(!z3 ? i2 : length2), 32) <= 0;
            if (z3) {
                if (!z4) {
                    break;
                } else {
                    length2--;
                }
            } else if (z4) {
                i2++;
            } else {
                z3 = true;
            }
        }
        C22306c<Bitmap> c22306cM133392e = hxs.m133392e("context_single_room", strM95710c2.subSequence(i2, length2 + 1).toString());
        final Function1 function1 = new Function1() { // from class: l.ed3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qd3.m173941R(ac20Var, (Bitmap) obj);
            }
        };
        qd3Var.dismissSubscription1.add(c22306cM133392e.map(new w9j() { // from class: l.fd3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qd3.m173942S(function1, obj);
            }
        }).compose(mkd0.m154951C()).subscribe(ffw.m121193d(new e30() { // from class: l.gd3
            @Override // p149l.e30
            public final void call(Object obj) {
                qd3.m173943T(this.f102076a, spannableStringBuilder, (roj0) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: r */
    public static void m173964r() {
    }

    /* JADX INFO: renamed from: u */
    public static final void m173965u(qd3 qd3Var, View view) {
        view.getClass();
        qd3Var.m173991s(view);
    }

    /* JADX INFO: renamed from: v */
    public static final void m173966v(qd3 qd3Var, DialogInterface dialogInterface) {
        vwb.m200354z(qd3Var.dismissSubscription1, new e30() { // from class: l.dd3
            @Override // p149l.e30
            public final void call(Object obj) {
                qd3.m173967w((c4g0) obj);
            }
        });
        mkd0.m154992z(qd3Var.dismissSubscription2);
        if (NullChecker.m81303a(qd3Var.presenter)) {
            qd3Var.presenter.m168637u4();
        }
    }

    /* JADX INFO: renamed from: w */
    public static final void m173967w(c4g0 c4g0Var) {
        mkd0.m154992z(c4g0Var);
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final TextView m173968A() {
        TextView textView = this._button;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_button");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final VImage m173969B() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final TextView m173970C() {
        TextView textView = this._content;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final TextView m173971D() {
        TextView textView = this._desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final FrameLayout m173972E() {
        FrameLayout frameLayout = this._one;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_one");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final VDraweeView m173973F() {
        VDraweeView vDraweeView = this._one_one_avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_one_one_avatar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final TextView m173974G() {
        TextView textView = this._one_one_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_one_one_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final LinearLayout m173975H() {
        LinearLayout linearLayout = this._root;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final View m173976I() {
        View view = this._shadow;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_shadow");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final FrameLayout m173977J() {
        FrameLayout frameLayout = this._three;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_three");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final VDraweeView m173978K() {
        VDraweeView vDraweeView = this._three_three_avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_three_three_avatar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final TextView m173979L() {
        TextView textView = this._three_three_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_three_three_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final FrameLayout m173980M() {
        FrameLayout frameLayout = this._two;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_two");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final VDraweeView m173981N() {
        VDraweeView vDraweeView = this._two_two_avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_two_two_avatar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final TextView m173982O() {
        TextView textView = this._two_two_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_two_two_text");
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final void m173983P() {
        if (m173994y() == null || !m173994y().isShowing()) {
            return;
        }
        m173994y().m71758P(new d30() { // from class: l.cd3
            @Override // p149l.d30
            public final void call() {
                qd3.m173964r();
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final void m173984Q(@NotNull final BLiveGiftBubbleConfig config, @Nullable final d30 onSendClick, boolean needRenderBackground) {
        config.getClass();
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        int length = 0;
        for (BLiveBottomContent bLiveBottomContent : config.button.richText) {
            String string = bLiveBottomContent.type.toString();
            int iHashCode = string.hashCode();
            if (iHashCode != -577741570) {
                if (iHashCode == 3556653 && string.equals("text") && !TextUtils.isEmpty(bLiveBottomContent.text)) {
                    String str = bLiveBottomContent.text;
                    str.getClass();
                    String str2 = bLiveBottomContent.textColor;
                    str2.getClass();
                    m173992t(spannableStringBuilder, str, str2, length);
                    length += bLiveBottomContent.text.length();
                }
            } else if (string.equals("picture") && !TextUtils.isEmpty(bLiveBottomContent.url)) {
                spannableStringBuilder.append("img");
                ac20 ac20Var = new ac20(this.presenter.act(), bLiveBottomContent.url, t100.m186890d(26.0f));
                arrayList.add(ac20Var);
                int i = length + 3;
                spannableStringBuilder.setSpan(ac20Var, length, i, 33);
                length = i;
            }
        }
        if (onSendClick != null) {
            m173968A().setOnClickListener(new View.OnClickListener() { // from class: l.md3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qd3.m173959m(this.f133212a, config, onSendClick, view);
                }
            });
        }
        m173968A().setText(spannableStringBuilder);
        if (!TextUtils.isEmpty(config.button.startColor) && !TextUtils.isEmpty(config.button.endColor) && needRenderBackground) {
            float fM186890d = t100.m186890d(14.0f);
            BLiveGiftBubblePopupButton bLiveGiftBubblePopupButton = config.button;
            m173968A().setBackground(xxj.m211501b(bLiveGiftBubblePopupButton.startColor, bLiveGiftBubblePopupButton.endColor, new float[]{fM186890d, fM186890d, fM186890d, fM186890d, fM186890d, fM186890d, fM186890d, fM186890d}));
        }
        vwb.m200354z(arrayList, new e30() { // from class: l.nd3
            @Override // p149l.e30
            public final void call(Object obj) {
                qd3.m173963q(this.f138261a, spannableStringBuilder, (ac20) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public final void m173985U(final BLiveGiftBubbleConfig config) {
        m173976I().setOnClickListener(new View.OnClickListener() { // from class: l.od3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qd3.m173950d(config, this, view);
            }
        });
        xdl0.m208344M(m173969B(), config.showClose);
        m173969B().setOnClickListener(new View.OnClickListener() { // from class: l.pd3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qd3.m173951e(this.f148256a, config, view);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public final void m173986V(BLiveGiftBubbleConfig config) {
        if (TextUtils.isEmpty(config.backgroundColor)) {
            m173975H().setBackgroundResource(i3c0.f111117p);
            m173995z().setBackgroundResource(i3c0.f111141r);
        } else {
            m173975H().setBackgroundColor(zb2.m217816d(config.backgroundColor));
            mep0.m154301c1(m173975H(), 0, 0, 0, -t100.m186890d(24.0f), t100.m186890d(24.0f));
            m173995z().setBackgroundColor(zb2.m217816d(config.backgroundColor));
            mep0.m154302d1(m173995z(), t100.m186890d(100.0f));
        }
        hxs.m133406s("context_single_room", m173995z(), config.iconUrl);
        m173970C().setText(config.title);
    }

    /* JADX INFO: renamed from: W */
    public final void m173987W(@NotNull final BLiveGiftBubbleConfig config) {
        config.getClass();
        final BLiveBottomContent bLiveBottomContent = (BLiveBottomContent) vwb.m200346r(config.descriptions, new w9j() { // from class: l.jd3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qd3.m173947a((BLiveBottomContent) obj);
            }
        });
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(config.window, new e30() { // from class: l.kd3
            @Override // p149l.e30
            public final void call(Object obj) {
                qd3.m173954h(arrayList, (BLiveBottomWindow) obj);
            }
        });
        if (bLiveBottomContent != null) {
            bLiveBottomContent.toString();
            m173968A().setEnabled(!Intrinsics.m87488d(bLiveBottomContent.countDownOverAction.toString(), BLiveBottomCountdownOverActionEnum.buttonLightUp));
            this.dismissSubscription2 = C22306c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.ld3
                @Override // p149l.e30
                public final void call(Object obj) {
                    qd3.m173962p(bLiveBottomContent, arrayList, this, config, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m173988a0(@NotNull BLiveGiftBubbleConfig config) {
        config.getClass();
        TextView textViewM173971D = m173971D();
        List<BLiveBottomContent> list = config.descriptions;
        list.getClass();
        textViewM173971D.setText(m173993x(list));
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final DialogC12611a m173989b0(@NotNull BLiveGiftBubbleConfig config, @NotNull d30 onSendClick) {
        config.getClass();
        onSendClick.getClass();
        try {
            m173994y().show();
            m173986V(config);
            m173985U(config);
            m173990c0(config);
            m173988a0(config);
            m173984Q(config, onSendClick, true);
            m173987W(config);
            this.presenter.m168636t4(false, config.type);
        } catch (Exception e) {
            e.toString();
        }
        return m173994y();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m173990c0(BLiveGiftBubbleConfig config) {
        mep0.m154302d1(m173972E(), xdl0.m208407w(16.0f));
        mep0.m154302d1(m173980M(), xdl0.m208407w(16.0f));
        mep0.m154302d1(m173977J(), xdl0.m208407w(16.0f));
        int size = config.window.size();
        if (size == 0) {
            xdl0.m208344M(m173972E(), false);
            xdl0.m208344M(m173980M(), false);
            xdl0.m208344M(m173977J(), false);
            return;
        }
        if (size == 1) {
            xdl0.m208344M(m173972E(), true);
            xdl0.m208344M(m173980M(), false);
            xdl0.m208344M(m173977J(), false);
            hxs.m133406s("context_single_room", m173973F(), config.window.get(0).picture);
            TextView textViewM173974G = m173974G();
            List<BLiveBottomContent> list = config.window.get(0).text;
            list.getClass();
            textViewM173974G.setText(m173993x(list));
            if (TextUtils.isEmpty(config.window.get(0).backgroundColor)) {
                return;
            }
            m173972E().setBackgroundColor(uep0.m193307B(config.window.get(0).backgroundColor));
            return;
        }
        if (size == 2) {
            xdl0.m208344M(m173972E(), true);
            xdl0.m208344M(m173980M(), true);
            xdl0.m208344M(m173977J(), false);
            if (!TextUtils.isEmpty(config.window.get(0).backgroundColor)) {
                m173972E().setBackgroundColor(uep0.m193307B(config.window.get(0).backgroundColor));
            }
            if (!TextUtils.isEmpty(config.window.get(1).backgroundColor)) {
                m173980M().setBackgroundColor(uep0.m193307B(config.window.get(1).backgroundColor));
            }
            hxs.m133406s("context_single_room", m173973F(), config.window.get(0).picture);
            TextView textViewM173974G2 = m173974G();
            List<BLiveBottomContent> list2 = config.window.get(0).text;
            list2.getClass();
            textViewM173974G2.setText(m173993x(list2));
            hxs.m133406s("context_single_room", m173981N(), config.window.get(1).picture);
            TextView textViewM173982O = m173982O();
            List<BLiveBottomContent> list3 = config.window.get(1).text;
            list3.getClass();
            textViewM173982O.setText(m173993x(list3));
            return;
        }
        if (size != 3) {
            return;
        }
        xdl0.m208344M(m173972E(), true);
        xdl0.m208344M(m173980M(), true);
        xdl0.m208344M(m173977J(), true);
        if (!TextUtils.isEmpty(config.window.get(0).backgroundColor)) {
            m173972E().setBackgroundColor(uep0.m193307B(config.window.get(0).backgroundColor));
        }
        if (!TextUtils.isEmpty(config.window.get(1).backgroundColor)) {
            m173980M().setBackgroundColor(uep0.m193307B(config.window.get(1).backgroundColor));
        }
        if (!TextUtils.isEmpty(config.window.get(2).backgroundColor)) {
            m173977J().setBackgroundColor(uep0.m193307B(config.window.get(2).backgroundColor));
        }
        hxs.m133406s("context_single_room", m173973F(), config.window.get(0).picture);
        TextView textViewM173974G3 = m173974G();
        List<BLiveBottomContent> list4 = config.window.get(0).text;
        list4.getClass();
        textViewM173974G3.setText(m173993x(list4));
        hxs.m133406s("context_single_room", m173981N(), config.window.get(1).picture);
        TextView textViewM173982O2 = m173982O();
        List<BLiveBottomContent> list5 = config.window.get(1).text;
        list5.getClass();
        textViewM173982O2.setText(m173993x(list5));
        hxs.m133406s("context_single_room", m173978K(), config.window.get(2).picture);
        TextView textViewM173979L = m173979L();
        List<BLiveBottomContent> list6 = config.window.get(2).text;
        list6.getClass();
        textViewM173979L.setText(m173993x(list6));
    }

    /* JADX INFO: renamed from: s */
    public final void m173991s(View view) {
        rd3.m178858a(this, view);
    }

    /* JADX INFO: renamed from: t */
    public final void m173992t(SpannableStringBuilder spannableStringBuilder, String text, String textColor, int startIndex) {
        spannableStringBuilder.append((CharSequence) text);
        int length = text.length() + startIndex;
        if (TextUtils.isEmpty(textColor)) {
            return;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(uep0.m193307B(textColor)), startIndex, length, 33);
    }

    /* JADX INFO: renamed from: x */
    public final SpannableStringBuilder m173993x(List<? extends BLiveBottomContent> list) {
        int length;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = 0;
        for (BLiveBottomContent bLiveBottomContent : list) {
            String string = bLiveBottomContent.type.toString();
            int iHashCode = string.hashCode();
            if (iHashCode != -577741570) {
                if (iHashCode != 3556653) {
                    if (iHashCode == 1352226353 && string.equals("countdown")) {
                        String str = (bLiveBottomContent.countdownEndTime - bLiveBottomContent.countdownCurrentTime) + BLiveStormDanmakuGiftResourceType.f44446s;
                        String str2 = bLiveBottomContent.textColor;
                        str2.getClass();
                        m173992t(spannableStringBuilder, str, str2, i);
                        length = str.length();
                        i += length;
                    }
                } else if (string.equals("text") && !TextUtils.isEmpty(bLiveBottomContent.text)) {
                    String str3 = bLiveBottomContent.text;
                    str3.getClass();
                    String str4 = bLiveBottomContent.textColor;
                    str4.getClass();
                    m173992t(spannableStringBuilder, str3, str4, i);
                    length = bLiveBottomContent.text.length();
                    i += length;
                }
            } else if (string.equals("picture") && !TextUtils.isEmpty(bLiveBottomContent.url)) {
                spannableStringBuilder.append("img");
                ac20 ac20Var = new ac20(this.presenter.act(), bLiveBottomContent.url, t100.m186890d(26.0f));
                int i2 = i + 3;
                spannableStringBuilder.setSpan(ac20Var, i, i2, 33);
                i = i2;
            }
        }
        return spannableStringBuilder;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final DialogC12611a m173994y() {
        return (DialogC12611a) this.dialog.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final VDraweeView m173995z() {
        VDraweeView vDraweeView = this._avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_avatar");
        return null;
    }
}
