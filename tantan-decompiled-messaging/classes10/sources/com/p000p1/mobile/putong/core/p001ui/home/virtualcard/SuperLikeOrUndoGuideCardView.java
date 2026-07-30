package com.p000p1.mobile.putong.core.p001ui.home.virtualcard;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.data.VirtualCardType;
import com.p000p1.mobile.putong.core.p001ui.home.virtualcard.SuperLikeOrUndoGuideCardView;
import com.sunshine.engine.bone.StageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l.xdl0;
import l.z2c0;
import l.zz6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003l.xxg0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0015\u0010\u000eJ\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000eJ\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u000eJ\u000f\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u000eR\"\u0010\"\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u001aR\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010=\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u00105\u001a\u0004\b;\u00107\"\u0004\b<\u00109R\"\u0010@\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u00105\u001a\u0004\b>\u00107\"\u0004\b?\u00109R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lcom/p1/mobile/putong/core/ui/home/virtualcard/SuperLikeOrUndoGuideCardView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "Lkotlin/Function0;", "onClick", "f", "(Lcom/p1/mobile/putong/core/data/VirtualCardType;Lkotlin/jvm/functions/Function0;)V", "onDetachedFromWindow", "j", "Landroid/view/View;", "view", "e", "(Landroid/view/View;)V", "h", "i", "a", "Landroid/view/View;", "get_card_bg", "()Landroid/view/View;", "set_card_bg", "_card_bg", "Lcom/sunshine/engine/bone/StageView;", "b", "Lcom/sunshine/engine/bone/StageView;", "get_stage_view", "()Lcom/sunshine/engine/bone/StageView;", "set_stage_view", "(Lcom/sunshine/engine/bone/StageView;)V", "_stage_view", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "get_icon", "()Landroid/widget/ImageView;", "set_icon", "(Landroid/widget/ImageView;)V", "_icon", "Landroid/widget/TextView;", "d", "Landroid/widget/TextView;", "get_guide_title", "()Landroid/widget/TextView;", "set_guide_title", "(Landroid/widget/TextView;)V", "_guide_title", "get_guide_desc", "set_guide_desc", "_guide_desc", "get_button", "set_button", "_button", "g", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "getCardType", "()Lcom/p1/mobile/putong/core/data/VirtualCardType;", "setCardType", "(Lcom/p1/mobile/putong/core/data/VirtualCardType;)V", "card_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class SuperLikeOrUndoGuideCardView extends CardView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public View _card_bg;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public StageView _stage_view;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ImageView _icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _guide_title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _guide_desc;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public TextView _button;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VirtualCardType cardType;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.home.virtualcard.SuperLikeOrUndoGuideCardView$a */
    @Metadata(k = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    public static final /* synthetic */ class C3149a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2131a;

        static {
            int[] iArr = new int[VirtualCardType.values().length];
            try {
                iArr[VirtualCardType.SuperlikeGuideCard.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VirtualCardType.UndoGuideCard.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f2131a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperLikeOrUndoGuideCardView(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    /* JADX INFO: renamed from: b */
    public static void m3477b(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: e */
    public final void m3478e(View view) {
        xxg0.m10998a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final void m3479f(@NotNull VirtualCardType cardType, @NotNull final Function0<Unit> onClick) {
        cardType.getClass();
        onClick.getClass();
        setCardType(cardType);
        int i = C3149a.f2131a[cardType.ordinal()];
        if (i == 1) {
            m3480h();
        } else if (i == 2) {
            m3481i();
        }
        xdl0.E0(get_button(), new View.OnClickListener() { // from class: l.wxg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SuperLikeOrUndoGuideCardView.m3477b(onClick, view);
            }
        });
    }

    @NotNull
    public final VirtualCardType getCardType() {
        VirtualCardType virtualCardType = this.cardType;
        if (virtualCardType != null) {
            return virtualCardType;
        }
        Intrinsics.r("cardType");
        return null;
    }

    @NotNull
    public final TextView get_button() {
        TextView textView = this._button;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_button");
        return null;
    }

    @NotNull
    public final View get_card_bg() {
        View view = this._card_bg;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_card_bg");
        return null;
    }

    @NotNull
    public final TextView get_guide_desc() {
        TextView textView = this._guide_desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_guide_desc");
        return null;
    }

    @NotNull
    public final TextView get_guide_title() {
        TextView textView = this._guide_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_guide_title");
        return null;
    }

    @NotNull
    public final ImageView get_icon() {
        ImageView imageView = this._icon;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_icon");
        return null;
    }

    @NotNull
    public final StageView get_stage_view() {
        StageView stageView = this._stage_view;
        if (stageView != null) {
            return stageView;
        }
        Intrinsics.r("_stage_view");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m3480h() {
        get_card_bg().setBackgroundResource(z2c0.v);
        get_icon().setImageResource(z2c0.w);
        get_guide_title().setText("使用超级喜欢");
        String str = zz6.u0() ? "他" : "她";
        get_guide_desc().setText("让" + str + "优先看见你，给对方留下深刻印象");
        get_button().setTextColor(Color.parseColor("#54c7fc"));
    }

    /* JADX INFO: renamed from: i */
    public final void m3481i() {
        get_card_bg().setBackgroundResource(z2c0.x);
        get_icon().setImageResource(z2c0.y);
        get_guide_title().setText("使用反悔");
        get_guide_desc().setText("手滑了？反悔功能帮你找回错过的".concat(zz6.u0() ? "他" : "她"));
        get_button().setTextColor(Color.parseColor("#ffbb00"));
    }

    /* JADX INFO: renamed from: j */
    public final void m3482j() {
        int i = C3149a.f2131a[getCardType().ordinal()];
        if (i == 1) {
            get_stage_view().d(new String[]{"anim/bone/newbie_guide_super_like/config.xml", "anim/bone/newbie_guide_super_like/pic"});
        } else if (i == 2) {
            get_stage_view().d(new String[]{"anim/bone/newbie_guide_undo/config.xml", "anim/bone/newbie_guide_undo/pic"});
        }
        get_stage_view().f(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        get_stage_view().e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3478e(this);
    }

    public final void setCardType(@NotNull VirtualCardType virtualCardType) {
        virtualCardType.getClass();
        this.cardType = virtualCardType;
    }

    public final void set_button(@NotNull TextView textView) {
        textView.getClass();
        this._button = textView;
    }

    public final void set_card_bg(@NotNull View view) {
        view.getClass();
        this._card_bg = view;
    }

    public final void set_guide_desc(@NotNull TextView textView) {
        textView.getClass();
        this._guide_desc = textView;
    }

    public final void set_guide_title(@NotNull TextView textView) {
        textView.getClass();
        this._guide_title = textView;
    }

    public final void set_icon(@NotNull ImageView imageView) {
        imageView.getClass();
        this._icon = imageView;
    }

    public final void set_stage_view(@NotNull StageView stageView) {
        stageView.getClass();
        this._stage_view = stageView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperLikeOrUndoGuideCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperLikeOrUndoGuideCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
