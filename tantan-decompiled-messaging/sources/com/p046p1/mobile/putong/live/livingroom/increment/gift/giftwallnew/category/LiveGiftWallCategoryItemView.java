package com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.category;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallCategory;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallUser;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.category.LiveGiftWallCategoryItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveGiftFiveStarView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p149l.hxs;
import p149l.kvc0;
import p149l.rls;
import p149l.vls;
import p149l.w8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u0015R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010/\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010\u001f\u001a\u0004\b-\u0010!\"\u0004\b.\u0010\u0015R\"\u00103\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010\u0018\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u0010\u001cR\"\u00107\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010\u0018\u001a\u0004\b5\u0010\u001a\"\u0004\b6\u0010\u001cR\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006H"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/gift/giftwallnew/category/LiveGiftWallCategoryItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGiftDetail;", Item.TYPE, "Ll/vls;", "presenter", "k0", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGiftDetail;Ll/vls;)V", "onDetachedFromWindow", "Landroid/view/View;", OMSTemplateModeType.view, "j0", "(Landroid/view/View;)V", "Lv/VDraweeView;", Constants.INAPP_DATA_TAG, "Lv/VDraweeView;", "get_bg", "()Lv/VDraweeView;", "set_bg", "(Lv/VDraweeView;)V", "_bg", "e", "Landroid/view/View;", "get_unlock_mask", "()Landroid/view/View;", "set_unlock_mask", "_unlock_mask", "Lcom/tantan/library/svga/SVGAnimationView;", "f", "Lcom/tantan/library/svga/SVGAnimationView;", "get_item_svga_bg", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_item_svga_bg", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_item_svga_bg", "g", "get_user_icon_bg", "set_user_icon_bg", "_user_icon_bg", "h", "get_user_icon", "set_user_icon", "_user_icon", RXScreenCaptureService.KEY_INDEX, "get_item_icon", "set_item_icon", "_item_icon", "Landroid/widget/TextView;", "j", "Landroid/widget/TextView;", "get_item_title", "()Landroid/widget/TextView;", "set_item_title", "(Landroid/widget/TextView;)V", "_item_title", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/giftwallnew/view/LiveGiftFiveStarView;", "k", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/giftwallnew/view/LiveGiftFiveStarView;", "get_gift_five_star", "()Lcom/p1/mobile/putong/live/livingroom/increment/gift/giftwallnew/view/LiveGiftFiveStarView;", "set_gift_five_star", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/giftwallnew/view/LiveGiftFiveStarView;)V", "_gift_five_star", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class LiveGiftWallCategoryItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _bg;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public View _unlock_mask;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public SVGAnimationView _item_svga_bg;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public View _user_icon_bg;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VDraweeView _user_icon;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VDraweeView _item_icon;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public TextView _item_title;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public LiveGiftFiveStarView _gift_five_star;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public LiveGiftWallCategoryItemView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m73644i0(BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail, vls vlsVar, View view) {
        BLiveNewGiftWallGift bLiveNewGiftWallGift;
        if (bLiveNewGiftWallGiftDetail == null || (bLiveNewGiftWallGift = bLiveNewGiftWallGiftDetail.gift) == null) {
            return;
        }
        vlsVar.m198853V3(bLiveNewGiftWallGift);
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m73645l0(vls vlsVar, BLiveNewGiftWallUser bLiveNewGiftWallUser, View view) {
        vlsVar.m198854W3(bLiveNewGiftWallUser);
    }

    @NotNull
    public final VDraweeView get_bg() {
        VDraweeView vDraweeView = this._bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_bg");
        return null;
    }

    @NotNull
    public final LiveGiftFiveStarView get_gift_five_star() {
        LiveGiftFiveStarView liveGiftFiveStarView = this._gift_five_star;
        if (liveGiftFiveStarView != null) {
            return liveGiftFiveStarView;
        }
        Intrinsics.m87502r("_gift_five_star");
        return null;
    }

    @NotNull
    public final VDraweeView get_item_icon() {
        VDraweeView vDraweeView = this._item_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_item_icon");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_item_svga_bg() {
        SVGAnimationView sVGAnimationView = this._item_svga_bg;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m87502r("_item_svga_bg");
        return null;
    }

    @NotNull
    public final TextView get_item_title() {
        TextView textView = this._item_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_item_title");
        return null;
    }

    @NotNull
    public final View get_unlock_mask() {
        View view = this._unlock_mask;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_unlock_mask");
        return null;
    }

    @NotNull
    public final VDraweeView get_user_icon() {
        VDraweeView vDraweeView = this._user_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_user_icon");
        return null;
    }

    @NotNull
    public final View get_user_icon_bg() {
        View view = this._user_icon_bg;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_user_icon_bg");
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m73646j0(View view) {
        rls.m179879a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m73647k0(@Nullable final BLiveNewGiftWallGiftDetail item, @NotNull final vls presenter) {
        BLiveNewGiftWallGift bLiveNewGiftWallGift;
        final BLiveNewGiftWallUser bLiveNewGiftWallUser;
        BLiveNewGiftWallCategory bLiveNewGiftWallCategory;
        presenter.getClass();
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.pls
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveGiftWallCategoryItemView.m73644i0(item, presenter, view);
            }
        });
        get_item_svga_bg().stopAnimation(true);
        xdl0.m208344M(get_item_svga_bg(), false);
        if (item != null && (bLiveNewGiftWallCategory = item.category) != null) {
            hxs.m133406s("context_livingAct", get_bg(), bLiveNewGiftWallCategory.cardBgUrl);
            xdl0.m208344M(get_item_svga_bg(), !TextUtils.isEmpty(bLiveNewGiftWallCategory.cardBgSvgaUrl));
            if (!TextUtils.isEmpty(bLiveNewGiftWallCategory.cardBgSvgaUrl)) {
                Context context = getContext();
                context.getClass();
                SVGALoader.SVGARequestBuilder sVGARequestBuilderWith = SVGALoader.with(context);
                String str = bLiveNewGiftWallCategory.cardBgSvgaUrl;
                str.getClass();
                sVGARequestBuilderWith.from(str).into(get_item_svga_bg());
            }
        }
        if (item != null) {
            xdl0.m208344M(get_user_icon_bg(), NullChecker.m81303a(item.user) && !TextUtils.isEmpty(item.category.avatarBorderColor));
        }
        xdl0.m208344M(get_user_icon(), NullChecker.m81303a(item != null ? item.user : null));
        if (item != null && (bLiveNewGiftWallUser = item.user) != null) {
            hxs.m133406s("context_livingAct", get_user_icon(), bLiveNewGiftWallUser.avatar);
            get_user_icon_bg().setBackground(kvc0.m147354c(item.category.avatarBorderColor, 30));
            xdl0.m208329E0(get_user_icon(), new View.OnClickListener() { // from class: l.qls
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LiveGiftWallCategoryItemView.m73645l0(presenter, bLiveNewGiftWallUser, view);
                }
            });
        }
        if (item == null || (bLiveNewGiftWallGift = item.gift) == null) {
            return;
        }
        hxs.m133406s("context_livingAct", get_item_icon(), bLiveNewGiftWallGift.icon);
        get_item_title().setText(w8u.m202216s(bLiveNewGiftWallGift.name, 5));
        get_gift_five_star().m73668j0(bLiveNewGiftWallGift.grade);
        xdl0.m208344M(get_item_svga_bg(), bLiveNewGiftWallGift.grade > 0 && !TextUtils.isEmpty(item.category.cardBgSvgaUrl));
        kvc0.m147360i(get_item_icon(), bLiveNewGiftWallGift.grade <= 0);
        xdl0.m208344M(get_unlock_mask(), bLiveNewGiftWallGift.grade <= 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SVGAnimationView.stopAnimation$default(get_item_svga_bg(), false, 1, null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73646j0(this);
    }

    public final void set_bg(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._bg = vDraweeView;
    }

    public final void set_gift_five_star(@NotNull LiveGiftFiveStarView liveGiftFiveStarView) {
        liveGiftFiveStarView.getClass();
        this._gift_five_star = liveGiftFiveStarView;
    }

    public final void set_item_icon(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._item_icon = vDraweeView;
    }

    public final void set_item_svga_bg(@NotNull SVGAnimationView sVGAnimationView) {
        sVGAnimationView.getClass();
        this._item_svga_bg = sVGAnimationView;
    }

    public final void set_item_title(@NotNull TextView textView) {
        textView.getClass();
        this._item_title = textView;
    }

    public final void set_unlock_mask(@NotNull View view) {
        view.getClass();
        this._unlock_mask = view;
    }

    public final void set_user_icon(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._user_icon = vDraweeView;
    }

    public final void set_user_icon_bg(@NotNull View view) {
        view.getClass();
        this._user_icon_bg = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveGiftWallCategoryItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ LiveGiftWallCategoryItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
