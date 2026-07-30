package com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.set;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallUser;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.set.LiveGiftWallSetSubTabItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveGiftFiveStarView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p149l.hxs;
import p149l.kvc0;
import p149l.lns;
import p149l.mns;
import p149l.pns;
import p149l.w8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\"\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00108\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u0010\u0016R$\u0010@\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006A"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/gift/giftwallnew/set/LiveGiftWallSetSubTabItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGiftDetail;", Item.TYPE, "", FirebaseAnalytics.Param.INDEX, "Ll/lns;", "presenter", "k0", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGiftDetail;ILl/lns;)V", "Landroid/view/View;", OMSTemplateModeType.view, "j0", "(Landroid/view/View;)V", "Lv/VDraweeView;", Constants.INAPP_DATA_TAG, "Lv/VDraweeView;", "get_item_icon", "()Lv/VDraweeView;", "set_item_icon", "(Lv/VDraweeView;)V", "_item_icon", "e", "get_user_icon", "set_user_icon", "_user_icon", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "get_item_title", "()Landroid/widget/TextView;", "set_item_title", "(Landroid/widget/TextView;)V", "_item_title", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/giftwallnew/view/LiveGiftFiveStarView;", "g", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/giftwallnew/view/LiveGiftFiveStarView;", "get_five_star", "()Lcom/p1/mobile/putong/live/livingroom/increment/gift/giftwallnew/view/LiveGiftFiveStarView;", "set_five_star", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/giftwallnew/view/LiveGiftFiveStarView;)V", "_five_star", "h", "Landroid/view/View;", "get_line", "()Landroid/view/View;", "set_line", "_line", "Ll/mns;", RXScreenCaptureService.KEY_INDEX, "Ll/mns;", "getAllAdapter", "()Ll/mns;", "setAllAdapter", "(Ll/mns;)V", "allAdapter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class LiveGiftWallSetSubTabItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _item_icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VDraweeView _user_icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public TextView _item_title;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public LiveGiftFiveStarView _five_star;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public View _line;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public mns allAdapter;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public LiveGiftWallSetSubTabItemView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: h0 */
    public static void m73650h0(lns lnsVar, BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail, View view) {
        BLiveNewGiftWallGift bLiveNewGiftWallGift = bLiveNewGiftWallGiftDetail.gift;
        bLiveNewGiftWallGift.getClass();
        lnsVar.m150717V3(bLiveNewGiftWallGift);
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m73652l0(lns lnsVar, BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail, View view) {
        BLiveNewGiftWallUser bLiveNewGiftWallUser = bLiveNewGiftWallGiftDetail.user;
        bLiveNewGiftWallUser.getClass();
        lnsVar.m150718W3(bLiveNewGiftWallUser);
    }

    @Nullable
    public final mns getAllAdapter() {
        return this.allAdapter;
    }

    @NotNull
    public final LiveGiftFiveStarView get_five_star() {
        LiveGiftFiveStarView liveGiftFiveStarView = this._five_star;
        if (liveGiftFiveStarView != null) {
            return liveGiftFiveStarView;
        }
        Intrinsics.m87502r("_five_star");
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
    public final TextView get_item_title() {
        TextView textView = this._item_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_item_title");
        return null;
    }

    @NotNull
    public final View get_line() {
        View view = this._line;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_line");
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

    /* JADX INFO: renamed from: j0 */
    public final void m73653j0(View view) {
        pns.m170443a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m73654k0(@NotNull final BLiveNewGiftWallGiftDetail item, int index, @NotNull final lns presenter) {
        item.getClass();
        presenter.getClass();
        xdl0.m208344M(get_line(), index != 0);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.nns
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveGiftWallSetSubTabItemView.m73650h0(presenter, item, view);
            }
        });
        get_item_title().setText(w8u.m202216s(item.gift.name, 5));
        get_five_star().m73668j0(item.gift.grade);
        hxs.m133406s("context_livingAct", get_item_icon(), item.gift.icon);
        kvc0.m147360i(get_item_icon(), item.gift.grade <= 0);
        BLiveNewGiftWallUser bLiveNewGiftWallUser = item.user;
        if (bLiveNewGiftWallUser != null) {
            hxs.m133406s("context_livingAct", get_user_icon(), bLiveNewGiftWallUser.avatar);
            xdl0.m208329E0(get_user_icon(), new View.OnClickListener() { // from class: l.ons
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LiveGiftWallSetSubTabItemView.m73652l0(presenter, item, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73653j0(this);
    }

    public final void setAllAdapter(@Nullable mns mnsVar) {
        this.allAdapter = mnsVar;
    }

    public final void set_five_star(@NotNull LiveGiftFiveStarView liveGiftFiveStarView) {
        liveGiftFiveStarView.getClass();
        this._five_star = liveGiftFiveStarView;
    }

    public final void set_item_icon(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._item_icon = vDraweeView;
    }

    public final void set_item_title(@NotNull TextView textView) {
        textView.getClass();
        this._item_title = textView;
    }

    public final void set_line(@NotNull View view) {
        view.getClass();
        this._line = view;
    }

    public final void set_user_icon(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._user_icon = vDraweeView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveGiftWallSetSubTabItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ LiveGiftWallSetSubTabItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
