package com.p000p1.mobile.putong.core.p001ui.home.virtualcard;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.p000p1.mobile.putong.core.data.Privilege;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.data.VirtualCardType;
import com.p000p1.mobile.putong.core.p001ui.home.virtualcard.HomeNewBizCardView;
import com.p1.mobile.putong.core.CoreModule;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l.d30;
import l.e30;
import l.eyl;
import l.qib0;
import l.xdl0;
import l.xma;
import l.z2c0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003l.u8l;
import v.VButton;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u0011R\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010*\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00106\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u0010-\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R\"\u0010=\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010D\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0016\u0010G\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lcom/p1/mobile/putong/core/ui/home/virtualcard/HomeNewBizCardView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getEid", "()Ljava/lang/String;", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "Ll/eyl;", "frag", "Lkotlin/Function0;", "onClick", "f", "(Lcom/p1/mobile/putong/core/data/VirtualCardType;Ll/eyl;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", "view", "e", "(Landroid/view/View;)V", "h", "Lv/VImage;", "a", "Lv/VImage;", "get_card_bg", "()Lv/VImage;", "set_card_bg", "(Lv/VImage;)V", "_card_bg", "b", "get_icon", "set_icon", "_icon", "Lv/VText;", "c", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "d", "get_subtitle", "set_subtitle", "_subtitle", "Lv/VDraweeView;", "Lv/VDraweeView;", "get_img", "()Lv/VDraweeView;", "set_img", "(Lv/VDraweeView;)V", "_img", "Lv/VButton;", "Lv/VButton;", "get_ok", "()Lv/VButton;", "set_ok", "(Lv/VButton;)V", "_ok", "g", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "virtualCardType", "card_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class HomeNewBizCardView extends CardView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VImage _card_bg;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VImage _icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _subtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VDraweeView _img;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VButton _ok;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public VirtualCardType virtualCardType;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.home.virtualcard.HomeNewBizCardView$a */
    @Metadata(k = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    public static final /* synthetic */ class C3148a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2123a;

        static {
            int[] iArr = new int[VirtualCardType.values().length];
            try {
                iArr[VirtualCardType.SayHiADCard.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VirtualCardType.OneMatchGuideCard.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VirtualCardType.GreetGuideCard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2123a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeNewBizCardView(@NotNull Context context) {
        super(context);
        context.getClass();
        this.virtualCardType = VirtualCardType.Unknown;
    }

    /* JADX INFO: renamed from: b */
    public static void m3473b(VirtualCardType virtualCardType, HomeNewBizCardView homeNewBizCardView, eyl eylVar, Function0 function0, View view) {
        if (C3148a.f2123a[virtualCardType.ordinal()] == 1) {
            zvf0.r(homeNewBizCardView.getEid(), "p_suggest_users_home_view");
            if (CoreModule.P().g().xn()) {
                if (!xma.H3()) {
                    CoreModule.P().g().Ds(eylVar.q1(), "p_suggest_users_home_view,e_card_sayhi,click", Privilege.confession_first, (e30) null, (d30) null);
                }
            } else if (!xma.L3()) {
                CoreModule.P().a().pr(eylVar.q1(), "p_suggest_users_home_view,e_card_sayhi,click", Privilege.say_hi_pkg);
            }
        }
        function0.invoke();
    }

    private final String getEid() {
        int i = C3148a.f2123a[this.virtualCardType.ordinal()];
        if (i == 1) {
            return "e_card_sayhi";
        }
        if (i != 2) {
            return i != 3 ? "" : "e_newbieguide_sayhi";
        }
        return "e_newbieguide_odiamond_sayhi";
    }

    /* JADX INFO: renamed from: e */
    public final void m3474e(View view) {
        u8l.m9692a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final void m3475f(@NotNull final VirtualCardType cardType, @NotNull final eyl frag, @NotNull final Function0<Unit> onClick) {
        cardType.getClass();
        frag.getClass();
        onClick.getClass();
        this.virtualCardType = cardType;
        if (C3148a.f2123a[cardType.ordinal()] == 1) {
            m3476h();
        }
        xdl0.E0(get_ok(), new View.OnClickListener() { // from class: l.t8l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeNewBizCardView.m3473b(cardType, this, frag, onClick, view);
            }
        });
    }

    @NotNull
    public final VImage get_card_bg() {
        VImage vImage = this._card_bg;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_card_bg");
        return null;
    }

    @NotNull
    public final VImage get_icon() {
        VImage vImage = this._icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_icon");
        return null;
    }

    @NotNull
    public final VDraweeView get_img() {
        VDraweeView vDraweeView = this._img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_img");
        return null;
    }

    @NotNull
    public final VButton get_ok() {
        VButton vButton = this._ok;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_ok");
        return null;
    }

    @NotNull
    public final VText get_subtitle() {
        VText vText = this._subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_subtitle");
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

    /* JADX INFO: renamed from: h */
    public final void m3476h() {
        get_card_bg().setImageResource(z2c0.B);
        get_icon().setImageResource(z2c0.A);
        get_ok().setBackgroundResource(z2c0.C);
        qib0.G.L0(get_img(), "https://auto.tancdn.com/v1/images/eyJpZCI6IjdIWUtQVzZVRTREUk5VRzVQUjMzQlBUSzJCTUZPRzE0IiwidyI6MTA3NywiaCI6OTA2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MjA1MDM4MTQ5NDc5MzA4MjEzMX0.png");
        get_title().setText("抢先告白");
        get_title().setTextColor(Color.parseColor("#8D2D8F"));
        get_subtitle().setTextColor(Color.parseColor("#668D2D8F"));
        get_subtitle().setText("无需配对，直接向对方表达你的心意！");
        get_ok().setText("获取抢先告白");
        get_ok().setTextSize(16.0f);
        get_ok().setTextColor(Color.parseColor("#ffffff"));
        zvf0.x(getEid(), "p_suggest_users_home_view");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3474e(this);
    }

    public final void set_card_bg(@NotNull VImage vImage) {
        vImage.getClass();
        this._card_bg = vImage;
    }

    public final void set_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._icon = vImage;
    }

    public final void set_img(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._img = vDraweeView;
    }

    public final void set_ok(@NotNull VButton vButton) {
        vButton.getClass();
        this._ok = vButton;
    }

    public final void set_subtitle(@NotNull VText vText) {
        vText.getClass();
        this._subtitle = vText;
    }

    public final void set_title(@NotNull VText vText) {
        vText.getClass();
        this._title = vText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeNewBizCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.virtualCardType = VirtualCardType.Unknown;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeNewBizCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.virtualCardType = VirtualCardType.Unknown;
    }
}
