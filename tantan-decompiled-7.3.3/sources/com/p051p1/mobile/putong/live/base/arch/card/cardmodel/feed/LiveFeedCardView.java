package com.p051p1.mobile.putong.live.base.arch.card.cardmodel.feed;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.feed.LiveFeedCardView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.c4s;
import p153l.ft5;
import p153l.izs;
import p153l.jdc0;
import p153l.jyb;
import p153l.mes;
import p153l.ner;
import p153l.qa00;
import p153l.qcj;
import p153l.qnp0;
import p153l.vl4;
import p153l.vzk;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R%\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR%\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u001d0\u001d0\u00168\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR%\u0010!\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010 0 0\u00168\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR%\u0010#\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010 0 0\u00168\u0006¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\u001cR%\u0010&\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010%0%0\u00168\u0006¢\u0006\f\n\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010\u001cR%\u0010)\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010(0(0\u00168\u0006¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010\u001cR%\u0010+\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010(0(0\u00168\u0006¢\u0006\f\n\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010\u001cR%\u0010-\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u001d0\u001d0\u00168\u0006¢\u0006\f\n\u0004\b-\u0010\u001a\u001a\u0004\b.\u0010\u001cR%\u0010/\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010(0(0\u00168\u0006¢\u0006\f\n\u0004\b/\u0010\u001a\u001a\u0004\b0\u0010\u001cR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00066"}, m88121d2 = {"Lcom/p1/mobile/putong/live/base/arch/card/cardmodel/feed/LiveFeedCardView;", "Landroid/widget/FrameLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Ll/mes;", "cardData", "Ll/ner;", "lp", "Ll/ft5;", "compositeSubscription", "k", "(Ll/mes;Ll/ner;Ll/ft5;)V", "Lkotlin/Lazy;", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "attributeContainer", "Lkotlin/Lazy;", "getAttributeContainer", "()Lkotlin/Lazy;", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "attributeSvg", "getAttributeSvg", "Landroid/widget/TextView;", "attributeTextView", "getAttributeTextView", "titleView", "getTitleView", "Lcom/p1/mobile/putong/live/base/arch/card/cardmodel/feed/LiveAvatarNumberView;", "avatarNumberView", "getAvatarNumberView", "Lv/VDraweeView;", "labelView", "getLabelView", "staticBgView", "getStaticBgView", "dynamicBgView", "getDynamicBgView", "attributeImage", "getAttributeImage", "Ll/mes;", "getCardData", "()Ll/mes;", "setCardData", "(Ll/mes;)V", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class LiveFeedCardView extends FrameLayout {

    @NotNull
    private final Lazy<LinearLayout> attributeContainer;

    @NotNull
    private final Lazy<VDraweeView> attributeImage;

    @NotNull
    private final Lazy<AnimEffectPlayer> attributeSvg;

    @NotNull
    private final Lazy<TextView> attributeTextView;

    @NotNull
    private final Lazy<LiveAvatarNumberView> avatarNumberView;

    @Nullable
    private mes cardData;

    @NotNull
    private final Lazy<AnimEffectPlayer> dynamicBgView;

    @NotNull
    private final Lazy<VDraweeView> labelView;

    @NotNull
    private final Lazy<VDraweeView> staticBgView;

    @NotNull
    private final Lazy<TextView> titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveFeedCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.attributeContainer = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.nes
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveFeedCardView.m68629b(this.f141678a);
            }
        });
        this.attributeSvg = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.oes
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveFeedCardView.m68636i(this.f147012a);
            }
        });
        this.attributeTextView = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.pes
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveFeedCardView.m68630c(this.f152119a);
            }
        });
        this.titleView = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.qes
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveFeedCardView.m68632e(this.f157209a);
            }
        });
        this.avatarNumberView = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.res
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveFeedCardView.m68633f(this.f162687a);
            }
        });
        this.labelView = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.ses
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveFeedCardView.m68628a(this.f167642a);
            }
        });
        this.staticBgView = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.tes
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveFeedCardView.m68637j(this.f173893a);
            }
        });
        this.dynamicBgView = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.ues
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveFeedCardView.m68634g(this.f178689a);
            }
        });
        this.attributeImage = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.ves
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveFeedCardView.m68635h(this.f183842a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static VDraweeView m68628a(LiveFeedCardView liveFeedCardView) {
        return (VDraweeView) liveFeedCardView.findViewById(jdc0.f120172Y);
    }

    /* JADX INFO: renamed from: b */
    public static LinearLayout m68629b(LiveFeedCardView liveFeedCardView) {
        return (LinearLayout) liveFeedCardView.findViewById(jdc0.f120191f);
    }

    /* JADX INFO: renamed from: c */
    public static TextView m68630c(LiveFeedCardView liveFeedCardView) {
        return (TextView) liveFeedCardView.findViewById(jdc0.f120200i);
    }

    /* JADX INFO: renamed from: d */
    public static String m68631d(vzk vzkVar) {
        return vzkVar.m204114a();
    }

    /* JADX INFO: renamed from: e */
    public static TextView m68632e(LiveFeedCardView liveFeedCardView) {
        return (TextView) liveFeedCardView.findViewById(jdc0.f120175Z0);
    }

    /* JADX INFO: renamed from: f */
    public static LiveAvatarNumberView m68633f(LiveFeedCardView liveFeedCardView) {
        return (LiveAvatarNumberView) liveFeedCardView.findViewById(jdc0.f120218o);
    }

    /* JADX INFO: renamed from: g */
    public static AnimEffectPlayer m68634g(LiveFeedCardView liveFeedCardView) {
        return (AnimEffectPlayer) liveFeedCardView.findViewById(jdc0.f120140I);
    }

    /* JADX INFO: renamed from: h */
    public static VDraweeView m68635h(LiveFeedCardView liveFeedCardView) {
        return (VDraweeView) liveFeedCardView.findViewById(jdc0.f120197h);
    }

    /* JADX INFO: renamed from: i */
    public static AnimEffectPlayer m68636i(LiveFeedCardView liveFeedCardView) {
        return (AnimEffectPlayer) liveFeedCardView.findViewById(jdc0.f120194g);
    }

    /* JADX INFO: renamed from: j */
    public static VDraweeView m68637j(LiveFeedCardView liveFeedCardView) {
        return (VDraweeView) liveFeedCardView.findViewById(jdc0.f120143J0);
    }

    @NotNull
    public final Lazy<LinearLayout> getAttributeContainer() {
        return this.attributeContainer;
    }

    @NotNull
    public final Lazy<VDraweeView> getAttributeImage() {
        return this.attributeImage;
    }

    @NotNull
    public final Lazy<AnimEffectPlayer> getAttributeSvg() {
        return this.attributeSvg;
    }

    @NotNull
    public final Lazy<TextView> getAttributeTextView() {
        return this.attributeTextView;
    }

    @NotNull
    public final Lazy<LiveAvatarNumberView> getAvatarNumberView() {
        return this.avatarNumberView;
    }

    @Nullable
    public final mes getCardData() {
        return this.cardData;
    }

    @NotNull
    public final Lazy<AnimEffectPlayer> getDynamicBgView() {
        return this.dynamicBgView;
    }

    @NotNull
    public final Lazy<VDraweeView> getLabelView() {
        return this.labelView;
    }

    @NotNull
    public final Lazy<VDraweeView> getStaticBgView() {
        return this.staticBgView;
    }

    @NotNull
    public final Lazy<TextView> getTitleView() {
        return this.titleView;
    }

    /* JADX INFO: renamed from: k */
    public final void m68638k(@NotNull mes cardData, @NotNull ner lp, @NotNull ft5 compositeSubscription) {
        cardData.getClass();
        lp.getClass();
        compositeSubscription.getClass();
        this.cardData = cardData;
        boolean zIsEmpty = TextUtils.isEmpty(cardData.m158088l());
        Lazy<AnimEffectPlayer> lazy = this.attributeSvg;
        if (zIsEmpty) {
            bnl0.m105524M(lazy.getValue(), true);
            bnl0.m105524M(this.attributeImage.getValue(), false);
            this.attributeSvg.getValue().m69683j("https://auto.tancdn.com/v1/raw/cb4f9807-ed83-493c-b6e4-6d02537e26d910.pdf", -1);
        } else {
            lazy.getValue().m69687n();
            bnl0.m105524M(this.attributeSvg.getValue(), false);
            bnl0.m105524M(this.attributeImage.getValue(), true);
            izs.m142868s("context_square", this.attributeImage.getValue(), cardData.m158088l());
        }
        bnl0.m105524M(this.staticBgView.getValue(), false);
        bnl0.m105524M(this.dynamicBgView.getValue(), false);
        vl4.m201592d(this.attributeTextView.getValue(), cardData.m158087k());
        vl4.m201594f(cardData.m158085i(), cardData.m158086j(), compositeSubscription, this.titleView.getValue(), lp);
        if (jyb.m147479J(cardData.m158081e())) {
            bnl0.m105524M(this.labelView.getValue(), false);
        } else {
            ArrayList<c4s> arrayListM158081e = cardData.m158081e();
            arrayListM158081e.getClass();
            for (c4s c4sVar : arrayListM158081e) {
                if (TextUtils.equals(c4sVar.type, "D")) {
                    bnl0.m105524M(this.labelView.getValue(), true);
                    VDraweeView value = this.labelView.getValue();
                    ViewGroup.LayoutParams layoutParams = this.labelView.getValue().getLayoutParams();
                    layoutParams.width = qa00.m175859d(c4sVar.iconW);
                    layoutParams.height = qa00.m175859d(c4sVar.iconH);
                    value.setLayoutParams(layoutParams);
                    izs.m142868s("context_square", this.labelView.getValue(), c4sVar.icon);
                }
            }
        }
        this.avatarNumberView.getValue().setImageData(jyb.m147486Q(cardData.m158080d(), new qcj() { // from class: l.wes
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveFeedCardView.m68631d((vzk) obj);
            }
        }));
        this.avatarNumberView.getValue().setNumberView(cardData.m158079c());
        if (TextUtils.isEmpty(cardData.m158077a())) {
            return;
        }
        if (cardData.m158078b() == 2) {
            bnl0.m105524M(this.dynamicBgView.getValue(), true);
            this.dynamicBgView.getValue().m69683j(cardData.m158077a(), -1);
        } else if (cardData.m158078b() == 1) {
            bnl0.m105524M(this.staticBgView.getValue(), true);
            izs.m142870u("context_square", this.staticBgView.getValue(), cardData.m158077a(), qa00.f156309V, qa00.f156303P);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        getLayoutParams().height = (int) ((((bnl0.m105592y0() - qa00.f156330q) / 2) * 136.0f) / 176.0f);
        qnp0.m177261d1(this, qa00.f156322i);
    }

    public final void setCardData(@Nullable mes mesVar) {
        this.cardData = mesVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveFeedCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveFeedCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ LiveFeedCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
