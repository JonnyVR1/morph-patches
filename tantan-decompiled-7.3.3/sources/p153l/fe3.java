package p153l;

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
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomContent;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomCountdownOverActionEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomWindow;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubbleConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupButton;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u001d\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\u00020#2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b&\u0010\u000eJ\u0015\u0010'\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b'\u0010\u000eJ'\u0010*\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u00105\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u0010\nR\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010I\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010@\u001a\u0004\bG\u0010B\"\u0004\bH\u0010DR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010]\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010@\u001a\u0004\b[\u0010B\"\u0004\b\\\u0010DR\"\u0010a\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010L\u001a\u0004\b_\u0010N\"\u0004\b`\u0010PR\"\u0010e\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010T\u001a\u0004\bc\u0010V\"\u0004\bd\u0010XR\"\u0010i\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010@\u001a\u0004\bg\u0010B\"\u0004\bh\u0010DR\"\u0010m\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010L\u001a\u0004\bk\u0010N\"\u0004\bl\u0010PR\"\u0010q\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010T\u001a\u0004\bo\u0010V\"\u0004\bp\u0010XR\"\u0010u\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010@\u001a\u0004\bs\u0010B\"\u0004\bt\u0010DR\"\u0010y\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010@\u001a\u0004\bw\u0010B\"\u0004\bx\u0010DR\"\u0010}\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bz\u0010T\u001a\u0004\b{\u0010V\"\u0004\b|\u0010XR(\u0010\u0085\u0001\u001a\u00020~8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R \u0010\u008a\u0001\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R,\u0010\u008f\u0001\u001a\u0016\u0012\u0005\u0012\u00030\u008c\u00010\u008b\u0001j\n\u0012\u0005\u0012\u00030\u008c\u0001`\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\t\u0010\u008e\u0001R\u001b\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001f\u0010\u0090\u0001¨\u0006\u0092\u0001"}, m88121d2 = {"Ll/fe3;", "", "Ll/une0;", "presenter", "<init>", "(Ll/une0;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", BLiveStormDanmakuGiftResourceType.f45294s, "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftBubbleConfig;", Constants.KEY_CONFIG, p7f.GPS_MEASUREMENT_INTERRUPTED, "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftBubbleConfig;)V", "U", "c0", "", "Lcom/p1/mobile/putong/live/base/data/BLiveBottomContent;", "list", "Landroid/text/SpannableStringBuilder;", BaseSei.f14624X, "(Ljava/util/List;)Landroid/text/SpannableStringBuilder;", "P", "()V", "spannableStringBuilder", "", "text", "textColor", "", "startIndex", Constants.KEY_T, "(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Ljava/lang/String;I)V", "Ll/x20;", "onSendClick", "Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", "b0", "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftBubbleConfig;Ll/x20;)Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", "W", "a0", "", "needRenderBackground", "Q", "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftBubbleConfig;Ll/x20;Z)V", "a", "Ll/une0;", "getPresenter", "()Ll/une0;", "b", "Landroid/view/View;", "I", "()Landroid/view/View;", "set_shadow", "_shadow", "Landroid/widget/LinearLayout;", "c", "Landroid/widget/LinearLayout;", "H", "()Landroid/widget/LinearLayout;", "set_root", "(Landroid/widget/LinearLayout;)V", "_root", "Landroid/widget/TextView;", Constants.INAPP_DATA_TAG, "Landroid/widget/TextView;", c4s.C_ZONE, "()Landroid/widget/TextView;", "set_content", "(Landroid/widget/TextView;)V", "_content", "e", "D", "set_desc", "_desc", "Landroid/widget/FrameLayout;", "f", "Landroid/widget/FrameLayout;", "E", "()Landroid/widget/FrameLayout;", "set_one", "(Landroid/widget/FrameLayout;)V", "_one", "Lv/VDraweeView;", "g", "Lv/VDraweeView;", "F", "()Lv/VDraweeView;", "set_one_one_avatar", "(Lv/VDraweeView;)V", "_one_one_avatar", "h", "G", "set_one_one_text", "_one_one_text", RXScreenCaptureService.KEY_INDEX, "M", "set_two", "_two", "j", "N", "set_two_two_avatar", "_two_two_avatar", "k", BloodType.f39576O, "set_two_two_text", "_two_two_text", BLiveStormDanmakuGiftResourceType.f45292l, "J", "set_three", "_three", "m", "K", "set_three_three_avatar", "_three_three_avatar", "n", "L", "set_three_three_text", "_three_three_text", "o", "A", "set_button", "_button", "p", BaseSei.f14626Z, "set_avatar", "_avatar", "Lv/VImage;", "q", "Lv/VImage;", "B", "()Lv/VImage;", "set_close", "(Lv/VImage;)V", "_close", "r", "Lkotlin/Lazy;", BaseSei.f14625Y, "()Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", OMSTemplateType.dialog, "Ljava/util/ArrayList;", "Ll/kcg0;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "dismissSubscription1", "Ll/kcg0;", "dismissSubscription2", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class fe3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final une0 presenter;

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
    public ArrayList<kcg0> dismissSubscription1;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public kcg0 dismissSubscription2;

    public fe3(@NotNull une0 une0Var) {
        une0Var.getClass();
        this.presenter = une0Var;
        this.dialog = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.nd3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return fe3.m125173j(this.f141424a);
            }
        });
        this.dismissSubscription1 = new ArrayList<>();
    }

    /* JADX INFO: renamed from: R */
    public static final uxj0 m125158R(jk20 jk20Var, Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            jk20Var.m145151e(bitmap.copy(config, false));
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: S */
    public static final uxj0 m125159S(Function1 function1, Object obj) {
        return (uxj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T */
    public static final void m125160T(fe3 fe3Var, SpannableStringBuilder spannableStringBuilder, uxj0 uxj0Var) {
        fe3Var.m125185A().setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: X */
    public static final void m125161X(ArrayList arrayList, BLiveBottomContent bLiveBottomContent) {
        if (Intrinsics.m88377d(bLiveBottomContent.type.toString(), "countdown")) {
            arrayList.add(bLiveBottomContent);
        }
    }

    /* JADX INFO: renamed from: Y */
    public static final void m125162Y(BLiveBottomContent bLiveBottomContent) {
        bLiveBottomContent.countdownCurrentTime++;
    }

    /* JADX INFO: renamed from: Z */
    public static final void m125163Z(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, BLiveBottomContent bLiveBottomContent) {
        if (Intrinsics.m88377d(bLiveBottomContent.type.toString(), "text")) {
            bLiveBottomContent.textColor = bLiveGiftBubbleConfig.button.afterTextColor;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Boolean m125164a(BLiveBottomContent bLiveBottomContent) {
        return Boolean.valueOf(Intrinsics.m88377d(bLiveBottomContent.type.toString(), "countdown"));
    }

    /* JADX INFO: renamed from: d */
    public static void m125167d(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, fe3 fe3Var, View view) {
        if (bLiveGiftBubbleConfig.blackClose) {
            fe3Var.m125200P();
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m125168e(fe3 fe3Var, BLiveGiftBubbleConfig bLiveGiftBubbleConfig, View view) {
        fe3Var.presenter.m196861s4(false, bLiveGiftBubbleConfig.type, "close");
        fe3Var.m125200P();
    }

    /* JADX INFO: renamed from: h */
    public static void m125171h(final ArrayList arrayList, BLiveBottomWindow bLiveBottomWindow) {
        jyb.m147537z(bLiveBottomWindow.text, new y20() { // from class: l.qd3
            @Override // p153l.y20
            public final void call(Object obj) {
                fe3.m125161X(arrayList, (BLiveBottomContent) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static DialogC12774a m125173j(final fe3 fe3Var) {
        DialogC12774a dialogC12774a = new DialogC12774a(fe3Var.presenter, yec0.f199302x, qag0.m175924e(true));
        dialogC12774a.m72959h0(new y20() { // from class: l.wd3
            @Override // p153l.y20
            public final void call(Object obj) {
                fe3.m125182u(this.f188524a, (View) obj);
            }
        });
        dialogC12774a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.xd3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                fe3.m125183v(this.f193511a, dialogInterface);
            }
        });
        return dialogC12774a;
    }

    /* JADX INFO: renamed from: m */
    public static void m125176m(fe3 fe3Var, BLiveGiftBubbleConfig bLiveGiftBubbleConfig, x20 x20Var, View view) {
        fe3Var.m125200P();
        fe3Var.presenter.m196861s4(false, bLiveGiftBubbleConfig.type, "");
        x20Var.call();
    }

    /* JADX INFO: renamed from: p */
    public static void m125179p(BLiveBottomContent bLiveBottomContent, ArrayList arrayList, fe3 fe3Var, final BLiveGiftBubbleConfig bLiveGiftBubbleConfig, Long l2) {
        long j = bLiveBottomContent.countdownCurrentTime;
        if (j < bLiveBottomContent.countdownEndTime) {
            bLiveBottomContent.countdownCurrentTime = j + 1;
            if (!jyb.m147479J(arrayList)) {
                jyb.m147537z(arrayList, new y20() { // from class: l.od3
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        fe3.m125162Y((BLiveBottomContent) obj);
                    }
                });
                fe3Var.m125207c0(bLiveGiftBubbleConfig);
            }
            fe3Var.m125205a0(bLiveGiftBubbleConfig);
            return;
        }
        String str = bLiveGiftBubbleConfig.button.endAfterColor;
        psd0.m173633z(fe3Var.dismissSubscription2);
        fe3Var.m125185A().setEnabled(Intrinsics.m88377d(bLiveBottomContent.countDownOverAction.toString(), BLiveBottomCountdownOverActionEnum.buttonLightUp));
        if (!TextUtils.isEmpty(bLiveGiftBubbleConfig.button.afterTextColor)) {
            jyb.m147537z(bLiveGiftBubbleConfig.button.richText, new y20() { // from class: l.pd3
                @Override // p153l.y20
                public final void call(Object obj) {
                    fe3.m125163Z(bLiveGiftBubbleConfig, (BLiveBottomContent) obj);
                }
            });
            fe3Var.m125201Q(bLiveGiftBubbleConfig, null, false);
        }
        if (TextUtils.isEmpty(bLiveGiftBubbleConfig.button.startAfterColor) || TextUtils.isEmpty(bLiveGiftBubbleConfig.button.endAfterColor)) {
            return;
        }
        float fM175859d = qa00.m175859d(14.0f);
        float[] fArr = {fM175859d, fM175859d, fM175859d, fM175859d, fM175859d, fM175859d, fM175859d, fM175859d};
        BLiveGiftBubblePopupButton bLiveGiftBubblePopupButton = bLiveGiftBubbleConfig.button;
        fe3Var.m125185A().setBackground(n0k.m161005b(bLiveGiftBubblePopupButton.startAfterColor, bLiveGiftBubblePopupButton.endAfterColor, fArr));
    }

    /* JADX INFO: renamed from: q */
    public static void m125180q(final fe3 fe3Var, final SpannableStringBuilder spannableStringBuilder, final jk20 jk20Var) {
        jk20Var.getClass();
        if (jk20Var.m145150d()) {
            return;
        }
        String strM145149c = jk20Var.m145149c();
        strM145149c.getClass();
        int length = strM145149c.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.m88378e(strM145149c.charAt(!z ? i : length), 32) <= 0;
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
        if (TextUtils.isEmpty(strM145149c.subSequence(i, length + 1).toString())) {
            return;
        }
        String strM145149c2 = jk20Var.m145149c();
        strM145149c2.getClass();
        int length2 = strM145149c2.length() - 1;
        int i2 = 0;
        boolean z3 = false;
        while (i2 <= length2) {
            boolean z4 = Intrinsics.m88378e(strM145149c2.charAt(!z3 ? i2 : length2), 32) <= 0;
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
        C22421c<Bitmap> c22421cM142854e = izs.m142854e("context_single_room", strM145149c2.subSequence(i2, length2 + 1).toString());
        final Function1 function1 = new Function1() { // from class: l.td3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fe3.m125158R(jk20Var, (Bitmap) obj);
            }
        };
        fe3Var.dismissSubscription1.add(c22421cM142854e.map(new qcj() { // from class: l.ud3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return fe3.m125159S(function1, obj);
            }
        }).compose(psd0.m173592C()).subscribe(dhw.m115825d(new y20() { // from class: l.vd3
            @Override // p153l.y20
            public final void call(Object obj) {
                fe3.m125160T(this.f183534a, spannableStringBuilder, (uxj0) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: r */
    public static void m125181r() {
    }

    /* JADX INFO: renamed from: u */
    public static final void m125182u(fe3 fe3Var, View view) {
        view.getClass();
        fe3Var.m125208s(view);
    }

    /* JADX INFO: renamed from: v */
    public static final void m125183v(fe3 fe3Var, DialogInterface dialogInterface) {
        jyb.m147537z(fe3Var.dismissSubscription1, new y20() { // from class: l.sd3
            @Override // p153l.y20
            public final void call(Object obj) {
                fe3.m125184w((kcg0) obj);
            }
        });
        psd0.m173633z(fe3Var.dismissSubscription2);
        if (NullChecker.m82486a(fe3Var.presenter)) {
            fe3Var.presenter.m196863u4();
        }
    }

    /* JADX INFO: renamed from: w */
    public static final void m125184w(kcg0 kcg0Var) {
        psd0.m173633z(kcg0Var);
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final TextView m125185A() {
        TextView textView = this._button;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_button");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final VImage m125186B() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final TextView m125187C() {
        TextView textView = this._content;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final TextView m125188D() {
        TextView textView = this._desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final FrameLayout m125189E() {
        FrameLayout frameLayout = this._one;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_one");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final VDraweeView m125190F() {
        VDraweeView vDraweeView = this._one_one_avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_one_one_avatar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final TextView m125191G() {
        TextView textView = this._one_one_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_one_one_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final LinearLayout m125192H() {
        LinearLayout linearLayout = this._root;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final View m125193I() {
        View view = this._shadow;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_shadow");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final FrameLayout m125194J() {
        FrameLayout frameLayout = this._three;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_three");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final VDraweeView m125195K() {
        VDraweeView vDraweeView = this._three_three_avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_three_three_avatar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final TextView m125196L() {
        TextView textView = this._three_three_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_three_three_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final FrameLayout m125197M() {
        FrameLayout frameLayout = this._two;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_two");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final VDraweeView m125198N() {
        VDraweeView vDraweeView = this._two_two_avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_two_two_avatar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final TextView m125199O() {
        TextView textView = this._two_two_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_two_two_text");
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final void m125200P() {
        if (m125211y() == null || !m125211y().isShowing()) {
            return;
        }
        m125211y().m72941P(new x20() { // from class: l.rd3
            @Override // p153l.x20
            public final void call() {
                fe3.m125181r();
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final void m125201Q(@NotNull final BLiveGiftBubbleConfig config, @Nullable final x20 onSendClick, boolean needRenderBackground) {
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
                    m125209t(spannableStringBuilder, str, str2, length);
                    length += bLiveBottomContent.text.length();
                }
            } else if (string.equals("picture") && !TextUtils.isEmpty(bLiveBottomContent.url)) {
                spannableStringBuilder.append("img");
                jk20 jk20Var = new jk20(this.presenter.act(), bLiveBottomContent.url, qa00.m175859d(26.0f));
                arrayList.add(jk20Var);
                int i = length + 3;
                spannableStringBuilder.setSpan(jk20Var, length, i, 33);
                length = i;
            }
        }
        if (onSendClick != null) {
            m125185A().setOnClickListener(new View.OnClickListener() { // from class: l.be3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fe3.m125176m(this.f76335a, config, onSendClick, view);
                }
            });
        }
        m125185A().setText(spannableStringBuilder);
        if (!TextUtils.isEmpty(config.button.startColor) && !TextUtils.isEmpty(config.button.endColor) && needRenderBackground) {
            float fM175859d = qa00.m175859d(14.0f);
            BLiveGiftBubblePopupButton bLiveGiftBubblePopupButton = config.button;
            m125185A().setBackground(n0k.m161005b(bLiveGiftBubblePopupButton.startColor, bLiveGiftBubblePopupButton.endColor, new float[]{fM175859d, fM175859d, fM175859d, fM175859d, fM175859d, fM175859d, fM175859d, fM175859d}));
        }
        jyb.m147537z(arrayList, new y20() { // from class: l.ce3
            @Override // p153l.y20
            public final void call(Object obj) {
                fe3.m125180q(this.f81309a, spannableStringBuilder, (jk20) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public final void m125202U(final BLiveGiftBubbleConfig config) {
        m125193I().setOnClickListener(new View.OnClickListener() { // from class: l.de3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fe3.m125167d(config, this, view);
            }
        });
        bnl0.m105524M(m125186B(), config.showClose);
        m125186B().setOnClickListener(new View.OnClickListener() { // from class: l.ee3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fe3.m125168e(this.f93615a, config, view);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public final void m125203V(BLiveGiftBubbleConfig config) {
        if (TextUtils.isEmpty(config.backgroundColor)) {
            m125192H().setBackgroundResource(obc0.f146445p);
            m125212z().setBackgroundResource(obc0.f146469r);
        } else {
            m125192H().setBackgroundColor(gc2.m129825d(config.backgroundColor));
            qnp0.m177260c1(m125192H(), 0, 0, 0, -qa00.m175859d(24.0f), qa00.m175859d(24.0f));
            m125212z().setBackgroundColor(gc2.m129825d(config.backgroundColor));
            qnp0.m177261d1(m125212z(), qa00.m175859d(100.0f));
        }
        izs.m142868s("context_single_room", m125212z(), config.iconUrl);
        m125187C().setText(config.title);
    }

    /* JADX INFO: renamed from: W */
    public final void m125204W(@NotNull final BLiveGiftBubbleConfig config) {
        config.getClass();
        final BLiveBottomContent bLiveBottomContent = (BLiveBottomContent) jyb.m147529r(config.descriptions, new qcj() { // from class: l.yd3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return fe3.m125164a((BLiveBottomContent) obj);
            }
        });
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(config.window, new y20() { // from class: l.zd3
            @Override // p153l.y20
            public final void call(Object obj) {
                fe3.m125171h(arrayList, (BLiveBottomWindow) obj);
            }
        });
        if (bLiveBottomContent != null) {
            bLiveBottomContent.toString();
            m125185A().setEnabled(!Intrinsics.m88377d(bLiveBottomContent.countDownOverAction.toString(), BLiveBottomCountdownOverActionEnum.buttonLightUp));
            this.dismissSubscription2 = C22421c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.ae3
                @Override // p153l.y20
                public final void call(Object obj) {
                    fe3.m125179p(bLiveBottomContent, arrayList, this, config, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m125205a0(@NotNull BLiveGiftBubbleConfig config) {
        config.getClass();
        TextView textViewM125188D = m125188D();
        List<BLiveBottomContent> list = config.descriptions;
        list.getClass();
        textViewM125188D.setText(m125210x(list));
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final DialogC12774a m125206b0(@NotNull BLiveGiftBubbleConfig config, @NotNull x20 onSendClick) {
        config.getClass();
        onSendClick.getClass();
        try {
            m125211y().show();
            m125203V(config);
            m125202U(config);
            m125207c0(config);
            m125205a0(config);
            m125201Q(config, onSendClick, true);
            m125204W(config);
            this.presenter.m196862t4(false, config.type);
        } catch (Exception e) {
            e.toString();
        }
        return m125211y();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m125207c0(BLiveGiftBubbleConfig config) {
        qnp0.m177261d1(m125189E(), bnl0.m105587w(16.0f));
        qnp0.m177261d1(m125197M(), bnl0.m105587w(16.0f));
        qnp0.m177261d1(m125194J(), bnl0.m105587w(16.0f));
        int size = config.window.size();
        if (size == 0) {
            bnl0.m105524M(m125189E(), false);
            bnl0.m105524M(m125197M(), false);
            bnl0.m105524M(m125194J(), false);
            return;
        }
        if (size == 1) {
            bnl0.m105524M(m125189E(), true);
            bnl0.m105524M(m125197M(), false);
            bnl0.m105524M(m125194J(), false);
            izs.m142868s("context_single_room", m125190F(), config.window.get(0).picture);
            TextView textViewM125191G = m125191G();
            List<BLiveBottomContent> list = config.window.get(0).text;
            list.getClass();
            textViewM125191G.setText(m125210x(list));
            if (TextUtils.isEmpty(config.window.get(0).backgroundColor)) {
                return;
            }
            m125189E().setBackgroundColor(ynp0.m216917B(config.window.get(0).backgroundColor));
            return;
        }
        if (size == 2) {
            bnl0.m105524M(m125189E(), true);
            bnl0.m105524M(m125197M(), true);
            bnl0.m105524M(m125194J(), false);
            if (!TextUtils.isEmpty(config.window.get(0).backgroundColor)) {
                m125189E().setBackgroundColor(ynp0.m216917B(config.window.get(0).backgroundColor));
            }
            if (!TextUtils.isEmpty(config.window.get(1).backgroundColor)) {
                m125197M().setBackgroundColor(ynp0.m216917B(config.window.get(1).backgroundColor));
            }
            izs.m142868s("context_single_room", m125190F(), config.window.get(0).picture);
            TextView textViewM125191G2 = m125191G();
            List<BLiveBottomContent> list2 = config.window.get(0).text;
            list2.getClass();
            textViewM125191G2.setText(m125210x(list2));
            izs.m142868s("context_single_room", m125198N(), config.window.get(1).picture);
            TextView textViewM125199O = m125199O();
            List<BLiveBottomContent> list3 = config.window.get(1).text;
            list3.getClass();
            textViewM125199O.setText(m125210x(list3));
            return;
        }
        if (size != 3) {
            return;
        }
        bnl0.m105524M(m125189E(), true);
        bnl0.m105524M(m125197M(), true);
        bnl0.m105524M(m125194J(), true);
        if (!TextUtils.isEmpty(config.window.get(0).backgroundColor)) {
            m125189E().setBackgroundColor(ynp0.m216917B(config.window.get(0).backgroundColor));
        }
        if (!TextUtils.isEmpty(config.window.get(1).backgroundColor)) {
            m125197M().setBackgroundColor(ynp0.m216917B(config.window.get(1).backgroundColor));
        }
        if (!TextUtils.isEmpty(config.window.get(2).backgroundColor)) {
            m125194J().setBackgroundColor(ynp0.m216917B(config.window.get(2).backgroundColor));
        }
        izs.m142868s("context_single_room", m125190F(), config.window.get(0).picture);
        TextView textViewM125191G3 = m125191G();
        List<BLiveBottomContent> list4 = config.window.get(0).text;
        list4.getClass();
        textViewM125191G3.setText(m125210x(list4));
        izs.m142868s("context_single_room", m125198N(), config.window.get(1).picture);
        TextView textViewM125199O2 = m125199O();
        List<BLiveBottomContent> list5 = config.window.get(1).text;
        list5.getClass();
        textViewM125199O2.setText(m125210x(list5));
        izs.m142868s("context_single_room", m125195K(), config.window.get(2).picture);
        TextView textViewM125196L = m125196L();
        List<BLiveBottomContent> list6 = config.window.get(2).text;
        list6.getClass();
        textViewM125196L.setText(m125210x(list6));
    }

    /* JADX INFO: renamed from: s */
    public final void m125208s(View view) {
        ge3.m129965a(this, view);
    }

    /* JADX INFO: renamed from: t */
    public final void m125209t(SpannableStringBuilder spannableStringBuilder, String text, String textColor, int startIndex) {
        spannableStringBuilder.append((CharSequence) text);
        int length = text.length() + startIndex;
        if (TextUtils.isEmpty(textColor)) {
            return;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ynp0.m216917B(textColor)), startIndex, length, 33);
    }

    /* JADX INFO: renamed from: x */
    public final SpannableStringBuilder m125210x(List<? extends BLiveBottomContent> list) {
        int length;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = 0;
        for (BLiveBottomContent bLiveBottomContent : list) {
            String string = bLiveBottomContent.type.toString();
            int iHashCode = string.hashCode();
            if (iHashCode != -577741570) {
                if (iHashCode != 3556653) {
                    if (iHashCode == 1352226353 && string.equals("countdown")) {
                        String str = (bLiveBottomContent.countdownEndTime - bLiveBottomContent.countdownCurrentTime) + BLiveStormDanmakuGiftResourceType.f45294s;
                        String str2 = bLiveBottomContent.textColor;
                        str2.getClass();
                        m125209t(spannableStringBuilder, str, str2, i);
                        length = str.length();
                        i += length;
                    }
                } else if (string.equals("text") && !TextUtils.isEmpty(bLiveBottomContent.text)) {
                    String str3 = bLiveBottomContent.text;
                    str3.getClass();
                    String str4 = bLiveBottomContent.textColor;
                    str4.getClass();
                    m125209t(spannableStringBuilder, str3, str4, i);
                    length = bLiveBottomContent.text.length();
                    i += length;
                }
            } else if (string.equals("picture") && !TextUtils.isEmpty(bLiveBottomContent.url)) {
                spannableStringBuilder.append("img");
                jk20 jk20Var = new jk20(this.presenter.act(), bLiveBottomContent.url, qa00.m175859d(26.0f));
                int i2 = i + 3;
                spannableStringBuilder.setSpan(jk20Var, i, i2, 33);
                i = i2;
            }
        }
        return spannableStringBuilder;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final DialogC12774a m125211y() {
        return (DialogC12774a) this.dialog.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final VDraweeView m125212z() {
        VDraweeView vDraweeView = this._avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_avatar");
        return null;
    }
}
