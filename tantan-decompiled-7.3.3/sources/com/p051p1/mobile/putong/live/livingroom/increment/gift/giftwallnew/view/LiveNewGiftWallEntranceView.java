package com.p051p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraData;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallDetailInfoItem;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallHierarchy;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallProgress;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveNewGiftWallEntranceView;
import com.p051p1.mobile.putong.live.livingroom.view.AutoRefreshTextView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.f9k;
import p153l.gt0;
import p153l.izs;
import p153l.j9t;
import p153l.kyb;
import p153l.n3d0;
import p153l.n9c0;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001e\u0010\u001cJ\u0015\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0014¢\u0006\u0004\b#\u0010\u001cR\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010B\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010I\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010M\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010=\u001a\u0004\bK\u0010?\"\u0004\bL\u0010AR\"\u0010Q\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010D\u001a\u0004\bO\u0010F\"\u0004\bP\u0010HR\"\u0010U\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010=\u001a\u0004\bS\u0010?\"\u0004\bT\u0010AR\"\u0010Y\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010D\u001a\u0004\bW\u0010F\"\u0004\bX\u0010HR\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006^"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/gift/giftwallnew/view/LiveNewGiftWallEntranceView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "i0", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;", "summaryItem", "m0", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;)V", "n0", FirebaseAnalytics.Param.INDEX, "Lv/VDraweeView;", "k0", "(I)Lv/VDraweeView;", "Landroid/widget/ImageView;", "l0", "(I)Landroid/widget/ImageView;", "p0", "()V", "j0", "onFinishInflate", "Lcom/p1/mobile/putong/live/base/data/BLiveExtraData;", "summary", "o0", "(Lcom/p1/mobile/putong/live/base/data/BLiveExtraData;)V", "onDetachedFromWindow", "Lcom/p1/mobile/putong/live/livingroom/view/AutoRefreshTextView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/live/livingroom/view/AutoRefreshTextView;", "get_title", "()Lcom/p1/mobile/putong/live/livingroom/view/AutoRefreshTextView;", "set_title", "(Lcom/p1/mobile/putong/live/livingroom/view/AutoRefreshTextView;)V", "_title", "Lv/VText;", "e", "Lv/VText;", "get_title_second", "()Lv/VText;", "set_title_second", "(Lv/VText;)V", "_title_second", "Lv/VImage;", "f", "Lv/VImage;", "get_arrow", "()Lv/VImage;", "set_arrow", "(Lv/VImage;)V", "_arrow", "g", "Lv/VDraweeView;", "get_icon3", "()Lv/VDraweeView;", "set_icon3", "(Lv/VDraweeView;)V", "_icon3", "h", "Landroid/widget/ImageView;", "get_five_star_icon3", "()Landroid/widget/ImageView;", "set_five_star_icon3", "(Landroid/widget/ImageView;)V", "_five_star_icon3", RXScreenCaptureService.KEY_INDEX, "get_icon2", "set_icon2", "_icon2", "j", "get_five_star_icon2", "set_five_star_icon2", "_five_star_icon2", "k", "get_icon1", "set_icon1", "_icon1", BLiveStormDanmakuGiftResourceType.f45292l, "get_five_star_icon1", "set_five_star_icon1", "_five_star_icon1", "Landroid/animation/AnimatorSet;", "m", "Landroid/animation/AnimatorSet;", "titleAnimation", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class LiveNewGiftWallEntranceView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public AutoRefreshTextView _title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _title_second;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VImage _arrow;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VDraweeView _icon3;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public ImageView _five_star_icon3;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VDraweeView _icon2;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public ImageView _five_star_icon2;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VDraweeView _icon1;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public ImageView _five_star_icon1;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public AnimatorSet titleAnimation;

    public /* synthetic */ LiveNewGiftWallEntranceView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m74859h0(LiveNewGiftWallEntranceView liveNewGiftWallEntranceView) {
        AnimatorSet animatorSet = liveNewGiftWallEntranceView.titleAnimation;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    @NotNull
    public final VImage get_arrow() {
        VImage vImage = this._arrow;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_arrow");
        return null;
    }

    @NotNull
    public final ImageView get_five_star_icon1() {
        ImageView imageView = this._five_star_icon1;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_five_star_icon1");
        return null;
    }

    @NotNull
    public final ImageView get_five_star_icon2() {
        ImageView imageView = this._five_star_icon2;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_five_star_icon2");
        return null;
    }

    @NotNull
    public final ImageView get_five_star_icon3() {
        ImageView imageView = this._five_star_icon3;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_five_star_icon3");
        return null;
    }

    @NotNull
    public final VDraweeView get_icon1() {
        VDraweeView vDraweeView = this._icon1;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_icon1");
        return null;
    }

    @NotNull
    public final VDraweeView get_icon2() {
        VDraweeView vDraweeView = this._icon2;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_icon2");
        return null;
    }

    @NotNull
    public final VDraweeView get_icon3() {
        VDraweeView vDraweeView = this._icon3;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_icon3");
        return null;
    }

    @NotNull
    public final AutoRefreshTextView get_title() {
        AutoRefreshTextView autoRefreshTextView = this._title;
        if (autoRefreshTextView != null) {
            return autoRefreshTextView;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    @NotNull
    public final VText get_title_second() {
        VText vText = this._title_second;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_title_second");
        return null;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m74860i0(View view) {
        j9t.m143951a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m74861j0() {
        AnimatorSet animatorSet = this.titleAnimation;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            animatorSet.cancel();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final VDraweeView m74862k0(int index) {
        if (index == 0) {
            return get_icon1();
        }
        if (index == 1) {
            return get_icon2();
        }
        if (index != 2) {
            return null;
        }
        return get_icon3();
    }

    /* JADX INFO: renamed from: l0 */
    public final ImageView m74863l0(int index) {
        if (index == 0) {
            return get_five_star_icon1();
        }
        if (index == 1) {
            return get_five_star_icon2();
        }
        if (index != 2) {
            return null;
        }
        return get_five_star_icon3();
    }

    /* JADX INFO: renamed from: m0 */
    public final void m74864m0(BLiveNewGiftWallDetailInfoItem summaryItem) {
        ArrayList arrayList = new ArrayList();
        if (!kyb.m151952a(summaryItem.tabs)) {
            List<String> list = summaryItem.tabs.get(0).giftIds;
            list.getClass();
            List<BLiveNewGiftWallGift> list2 = summaryItem.gifts;
            list2.getClass();
            for (BLiveNewGiftWallGift bLiveNewGiftWallGift : list2) {
                if (list.contains(bLiveNewGiftWallGift.f45259id)) {
                    arrayList.add(bLiveNewGiftWallGift);
                }
            }
        }
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            BLiveNewGiftWallGift bLiveNewGiftWallGift2 = (BLiveNewGiftWallGift) obj;
            VDraweeView vDraweeViewM74862k0 = m74862k0(i);
            if (vDraweeViewM74862k0 != null) {
                n3d0.m161285i(vDraweeViewM74862k0, bLiveNewGiftWallGift2.grade == 0);
                bnl0.m105524M(m74863l0(i), bLiveNewGiftWallGift2.grade == 5);
                izs.m142868s("context_livingAct", vDraweeViewM74862k0, bLiveNewGiftWallGift2.icon);
            }
            i = i2;
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: n0 */
    public final void m74865n0(BLiveNewGiftWallDetailInfoItem summaryItem) {
        BLiveNewGiftWallHierarchy bLiveNewGiftWallHierarchy = summaryItem.hierarchy;
        bLiveNewGiftWallHierarchy.getClass();
        if (bLiveNewGiftWallHierarchy.grade == 0) {
            get_title().setText(bLiveNewGiftWallHierarchy.name);
        } else if (bLiveNewGiftWallHierarchy.needSweepLight) {
            get_title().setRefresh(true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bLiveNewGiftWallHierarchy.name + "·LV." + bLiveNewGiftWallHierarchy.grade);
            f9k f9kVar = new f9k();
            f9kVar.m124671d(n9c0.f140770G0);
            ArrayList arrayList = new ArrayList();
            arrayList.add("#FF9901");
            arrayList.add("#ffe4bb");
            arrayList.add("#FF9901");
            f9kVar.m124669b(arrayList);
            f9kVar.m124670c(-500);
            f9kVar.m124673f(30);
            f9kVar.m124672e(1000);
            f9kVar.m124668a(true);
            spannableStringBuilder.setSpan(f9kVar, 0, spannableStringBuilder.length(), 33);
            get_title().setText(spannableStringBuilder);
        } else {
            get_title().setText(bLiveNewGiftWallHierarchy.name + "·LV." + bLiveNewGiftWallHierarchy.grade);
            get_title().setTextColor(n3d0.m161277a(n9c0.f140847m1));
            get_title().setRefresh(false);
        }
        BLiveNewGiftWallProgress bLiveNewGiftWallProgress = bLiveNewGiftWallHierarchy.progress;
        int i = bLiveNewGiftWallProgress.total;
        int i2 = bLiveNewGiftWallProgress.current;
        if (i - i2 > 0) {
            String str = "距离升级还差" + (i - i2) + "星";
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new ForegroundColorSpan(n3d0.m161283g("#66FFFFFF")), 0, 6, 18);
            spannableString.setSpan(new ForegroundColorSpan(n3d0.m161283g("#66FF8817")), 6, str.length() - 1, 17);
            spannableString.setSpan(new ForegroundColorSpan(n3d0.m161283g("#66FFFFFF")), str.length() - 1, str.length(), 33);
            get_title_second().setText(spannableString);
        }
        m74867p0();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m74866o0(@NotNull BLiveExtraData summary) {
        summary.getClass();
        BLiveNewGiftWallDetailInfoItem bLiveNewGiftWallDetailInfoItem = summary.giftWallV2;
        bLiveNewGiftWallDetailInfoItem.getClass();
        m74865n0(bLiveNewGiftWallDetailInfoItem);
        BLiveNewGiftWallDetailInfoItem bLiveNewGiftWallDetailInfoItem2 = summary.giftWallV2;
        bLiveNewGiftWallDetailInfoItem2.getClass();
        m74864m0(bLiveNewGiftWallDetailInfoItem2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m74861j0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74860i0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m74867p0() {
        m74861j0();
        get_title_second().setAlpha(0.0f);
        float fM175859d = qa00.m175859d(21.0f);
        get_title_second().setTranslationY(fM175859d);
        bnl0.m105524M(get_title_second(), true);
        if (this.titleAnimation == null) {
            float f = -fM175859d;
            Property property = ViewGroup.TRANSLATION_Y;
            Animator animatorM132166l = gt0.m132166l(get_title(), property, 3000L, 300L, null, 0.0f, f);
            Property property2 = ViewGroup.ALPHA;
            Animator animatorM132166l2 = gt0.m132166l(get_title(), property2, 3000L, 300L, new LinearInterpolator(), 1.0f, 0.0f);
            Animator animatorM132166l3 = gt0.m132166l(get_title_second(), property, 3000L, 300L, null, fM175859d, 0.0f);
            Animator animatorM132166l4 = gt0.m132166l(get_title_second(), property2, 3000L, 300L, new LinearInterpolator(), 0.0f, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(animatorM132166l, animatorM132166l2, animatorM132166l3, animatorM132166l4);
            Animator animatorM132164j = gt0.m132164j(3000);
            Animator animatorM132166l5 = gt0.m132166l(get_title(), property, 3000L, 300L, null, fM175859d, 0.0f);
            Animator animatorM132166l6 = gt0.m132166l(get_title(), property2, 3000L, 300L, new LinearInterpolator(), 0.0f, 1.0f);
            Animator animatorM132166l7 = gt0.m132166l(get_title_second(), property, 3000L, 300L, null, 0.0f, f);
            Animator animatorM132166l8 = gt0.m132166l(get_title_second(), property2, 3000L, 300L, new LinearInterpolator(), 1.0f, 0.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(animatorM132166l5, animatorM132166l7, animatorM132166l6, animatorM132166l8);
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.titleAnimation = animatorSet3;
            animatorSet3.playSequentially(animatorSet, animatorM132164j, animatorSet2);
        }
        gt0.m132160f(this.titleAnimation, new Runnable() { // from class: l.i9t
            @Override // java.lang.Runnable
            public final void run() {
                LiveNewGiftWallEntranceView.m74859h0(this.f113504a);
            }
        });
        AnimatorSet animatorSet4 = this.titleAnimation;
        if (animatorSet4 != null) {
            animatorSet4.start();
        }
    }

    public final void set_arrow(@NotNull VImage vImage) {
        vImage.getClass();
        this._arrow = vImage;
    }

    public final void set_five_star_icon1(@NotNull ImageView imageView) {
        imageView.getClass();
        this._five_star_icon1 = imageView;
    }

    public final void set_five_star_icon2(@NotNull ImageView imageView) {
        imageView.getClass();
        this._five_star_icon2 = imageView;
    }

    public final void set_five_star_icon3(@NotNull ImageView imageView) {
        imageView.getClass();
        this._five_star_icon3 = imageView;
    }

    public final void set_icon1(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._icon1 = vDraweeView;
    }

    public final void set_icon2(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._icon2 = vDraweeView;
    }

    public final void set_icon3(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._icon3 = vDraweeView;
    }

    public final void set_title(@NotNull AutoRefreshTextView autoRefreshTextView) {
        autoRefreshTextView.getClass();
        this._title = autoRefreshTextView;
    }

    public final void set_title_second(@NotNull VText vText) {
        vText.getClass();
        this._title_second = vText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveNewGiftWallEntranceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveNewGiftWallEntranceView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveNewGiftWallEntranceView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
