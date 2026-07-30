package com.p046p1.mobile.putong.live.base.arch.card.cardmodel.feed;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.feed.LiveFeedCardView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
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
import p147v.VDraweeView;
import p149l.b2s;
import p149l.bs5;
import p149l.d5c0;
import p149l.fxk;
import p149l.hxs;
import p149l.lcs;
import p149l.mcr;
import p149l.mep0;
import p149l.t100;
import p149l.vwb;
import p149l.w9j;
import p149l.wk4;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R%\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR%\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u001d0\u001d0\u00168\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR%\u0010!\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010 0 0\u00168\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR%\u0010#\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010 0 0\u00168\u0006¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\u001cR%\u0010&\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010%0%0\u00168\u0006¢\u0006\f\n\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010\u001cR%\u0010)\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010(0(0\u00168\u0006¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010\u001cR%\u0010+\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010(0(0\u00168\u0006¢\u0006\f\n\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010\u001cR%\u0010-\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u001d0\u001d0\u00168\u0006¢\u0006\f\n\u0004\b-\u0010\u001a\u001a\u0004\b.\u0010\u001cR%\u0010/\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010(0(0\u00168\u0006¢\u0006\f\n\u0004\b/\u0010\u001a\u001a\u0004\b0\u0010\u001cR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00066"}, m87232d2 = {"Lcom/p1/mobile/putong/live/base/arch/card/cardmodel/feed/LiveFeedCardView;", "Landroid/widget/FrameLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Ll/lcs;", "cardData", "Ll/mcr;", "lp", "Ll/bs5;", "compositeSubscription", "k", "(Ll/lcs;Ll/mcr;Ll/bs5;)V", "Lkotlin/Lazy;", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "attributeContainer", "Lkotlin/Lazy;", "getAttributeContainer", "()Lkotlin/Lazy;", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "attributeSvg", "getAttributeSvg", "Landroid/widget/TextView;", "attributeTextView", "getAttributeTextView", "titleView", "getTitleView", "Lcom/p1/mobile/putong/live/base/arch/card/cardmodel/feed/LiveAvatarNumberView;", "avatarNumberView", "getAvatarNumberView", "Lv/VDraweeView;", "labelView", "getLabelView", "staticBgView", "getStaticBgView", "dynamicBgView", "getDynamicBgView", "attributeImage", "getAttributeImage", "Ll/lcs;", "getCardData", "()Ll/lcs;", "setCardData", "(Ll/lcs;)V", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    private lcs cardData;

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
        this.attributeContainer = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.mcs
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveFeedCardView.m67446b(this.f133183a);
            }
        });
        this.attributeSvg = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.ncs
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveFeedCardView.m67453i(this.f138227a);
            }
        });
        this.attributeTextView = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.ocs
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveFeedCardView.m67447c(this.f143096a);
            }
        });
        this.titleView = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.pcs
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveFeedCardView.m67449e(this.f148229a);
            }
        });
        this.avatarNumberView = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.qcs
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveFeedCardView.m67450f(this.f153817a);
            }
        });
        this.labelView = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.rcs
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveFeedCardView.m67445a(this.f158816a);
            }
        });
        this.staticBgView = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.scs
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveFeedCardView.m67454j(this.f163766a);
            }
        });
        this.dynamicBgView = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.tcs
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveFeedCardView.m67451g(this.f169473a);
            }
        });
        this.attributeImage = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.ucs
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveFeedCardView.m67452h(this.f175861a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static VDraweeView m67445a(LiveFeedCardView liveFeedCardView) {
        return (VDraweeView) liveFeedCardView.findViewById(d5c0.f84454Y);
    }

    /* JADX INFO: renamed from: b */
    public static LinearLayout m67446b(LiveFeedCardView liveFeedCardView) {
        return (LinearLayout) liveFeedCardView.findViewById(d5c0.f84473f);
    }

    /* JADX INFO: renamed from: c */
    public static TextView m67447c(LiveFeedCardView liveFeedCardView) {
        return (TextView) liveFeedCardView.findViewById(d5c0.f84482i);
    }

    /* JADX INFO: renamed from: d */
    public static String m67448d(fxk fxkVar) {
        return fxkVar.m123634a();
    }

    /* JADX INFO: renamed from: e */
    public static TextView m67449e(LiveFeedCardView liveFeedCardView) {
        return (TextView) liveFeedCardView.findViewById(d5c0.f84457Z0);
    }

    /* JADX INFO: renamed from: f */
    public static LiveAvatarNumberView m67450f(LiveFeedCardView liveFeedCardView) {
        return (LiveAvatarNumberView) liveFeedCardView.findViewById(d5c0.f84500o);
    }

    /* JADX INFO: renamed from: g */
    public static AnimEffectPlayer m67451g(LiveFeedCardView liveFeedCardView) {
        return (AnimEffectPlayer) liveFeedCardView.findViewById(d5c0.f84422I);
    }

    /* JADX INFO: renamed from: h */
    public static VDraweeView m67452h(LiveFeedCardView liveFeedCardView) {
        return (VDraweeView) liveFeedCardView.findViewById(d5c0.f84479h);
    }

    /* JADX INFO: renamed from: i */
    public static AnimEffectPlayer m67453i(LiveFeedCardView liveFeedCardView) {
        return (AnimEffectPlayer) liveFeedCardView.findViewById(d5c0.f84476g);
    }

    /* JADX INFO: renamed from: j */
    public static VDraweeView m67454j(LiveFeedCardView liveFeedCardView) {
        return (VDraweeView) liveFeedCardView.findViewById(d5c0.f84425J0);
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
    public final lcs getCardData() {
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
    public final void m67455k(@NotNull lcs cardData, @NotNull mcr lp, @NotNull bs5 compositeSubscription) {
        cardData.getClass();
        lp.getClass();
        compositeSubscription.getClass();
        this.cardData = cardData;
        boolean zIsEmpty = TextUtils.isEmpty(cardData.m149362l());
        Lazy<AnimEffectPlayer> lazy = this.attributeSvg;
        if (zIsEmpty) {
            xdl0.m208344M(lazy.getValue(), true);
            xdl0.m208344M(this.attributeImage.getValue(), false);
            this.attributeSvg.getValue().m68500j("https://auto.tancdn.com/v1/raw/cb4f9807-ed83-493c-b6e4-6d02537e26d910.pdf", -1);
        } else {
            lazy.getValue().m68504n();
            xdl0.m208344M(this.attributeSvg.getValue(), false);
            xdl0.m208344M(this.attributeImage.getValue(), true);
            hxs.m133406s("context_square", this.attributeImage.getValue(), cardData.m149362l());
        }
        xdl0.m208344M(this.staticBgView.getValue(), false);
        xdl0.m208344M(this.dynamicBgView.getValue(), false);
        wk4.m203651d(this.attributeTextView.getValue(), cardData.m149361k());
        wk4.m203653f(cardData.m149359i(), cardData.m149360j(), compositeSubscription, this.titleView.getValue(), lp);
        if (vwb.m200296J(cardData.m149355e())) {
            xdl0.m208344M(this.labelView.getValue(), false);
        } else {
            ArrayList<b2s> arrayListM149355e = cardData.m149355e();
            arrayListM149355e.getClass();
            for (b2s b2sVar : arrayListM149355e) {
                if (TextUtils.equals(b2sVar.type, "D")) {
                    xdl0.m208344M(this.labelView.getValue(), true);
                    VDraweeView value = this.labelView.getValue();
                    ViewGroup.LayoutParams layoutParams = this.labelView.getValue().getLayoutParams();
                    layoutParams.width = t100.m186890d(b2sVar.iconW);
                    layoutParams.height = t100.m186890d(b2sVar.iconH);
                    value.setLayoutParams(layoutParams);
                    hxs.m133406s("context_square", this.labelView.getValue(), b2sVar.icon);
                }
            }
        }
        this.avatarNumberView.getValue().setImageData(vwb.m200303Q(cardData.m149354d(), new w9j() { // from class: l.vcs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveFeedCardView.m67448d((fxk) obj);
            }
        }));
        this.avatarNumberView.getValue().setNumberView(cardData.m149353c());
        if (TextUtils.isEmpty(cardData.m149351a())) {
            return;
        }
        if (cardData.m149352b() == 2) {
            xdl0.m208344M(this.dynamicBgView.getValue(), true);
            this.dynamicBgView.getValue().m68500j(cardData.m149351a(), -1);
        } else if (cardData.m149352b() == 1) {
            xdl0.m208344M(this.staticBgView.getValue(), true);
            hxs.m133408u("context_square", this.staticBgView.getValue(), cardData.m149351a(), t100.f167247V, t100.f167241P);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        getLayoutParams().height = (int) ((((xdl0.m208412y0() - t100.f167268q) / 2) * 136.0f) / 176.0f);
        mep0.m154302d1(this, t100.f167260i);
    }

    public final void setCardData(@Nullable lcs lcsVar) {
        this.cardData = lcsVar;
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
