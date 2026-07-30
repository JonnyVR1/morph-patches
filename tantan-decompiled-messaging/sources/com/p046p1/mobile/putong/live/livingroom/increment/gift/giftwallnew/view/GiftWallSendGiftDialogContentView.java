package com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.live.base.data.BLiveJumpInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveUserDressUp;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftWallGiftItemInteract;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.GiftWallSendGiftDialogContentView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.dd80;
import p149l.e30;
import p149l.ftd0;
import p149l.h0k;
import p149l.h4t;
import p149l.hxs;
import p149l.kvc0;
import p149l.t100;
import p149l.tyj;
import p149l.vwb;
import p149l.x1e0;
import p149l.xdl0;
import p149l.ycu;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J=\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u000e\u0010\u0019\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010#\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b#\u0010$R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00102\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u0010\u000eR\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010>\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010.\u001a\u0004\b<\u00100\"\u0004\b=\u0010\u000eR\"\u0010B\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u00105\u001a\u0004\b@\u00107\"\u0004\bA\u00109R\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010N\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010E\u001a\u0004\bL\u0010G\"\u0004\bM\u0010IR\"\u0010R\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010E\u001a\u0004\bP\u0010G\"\u0004\bQ\u0010IR\"\u0010V\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010E\u001a\u0004\bT\u0010G\"\u0004\bU\u0010IR\"\u0010Z\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010E\u001a\u0004\bX\u0010G\"\u0004\bY\u0010IR\"\u0010^\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010.\u001a\u0004\b\\\u00100\"\u0004\b]\u0010\u000e¨\u0006_"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/gift/giftwallnew/view/GiftWallSendGiftDialogContentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "l0", "(Landroid/view/View;)V", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceGiftItem;", "itemModel", "Ll/dd80;", OMSTemplateType.dialog, "", "isFromUserCard", "isFromMedal", "Ll/h4t;", "presenter", "n0", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceGiftItem;Ll/dd80;ZZLl/h4t;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveUserDressUp;", Item.TYPE, "", "pageId", "Ll/e30;", "Lcom/p1/mobile/putong/live/base/data/BLiveJumpInfo;", "clickCallback", "m0", "(Lcom/p1/mobile/putong/live/base/data/BLiveUserDressUp;Ll/dd80;Ljava/lang/String;Ll/e30;)V", "Lv/VImage;", Constants.INAPP_DATA_TAG, "Lv/VImage;", "get_close_icon", "()Lv/VImage;", "set_close_icon", "(Lv/VImage;)V", "_close_icon", "e", "Landroid/view/View;", "get_iconBg", "()Landroid/view/View;", "set_iconBg", "_iconBg", "Lv/VDraweeView;", "f", "Lv/VDraweeView;", "get_icon", "()Lv/VDraweeView;", "set_icon", "(Lv/VDraweeView;)V", "_icon", "g", "get_user_icon_shadow", "set_user_icon_shadow", "_user_icon_shadow", "h", "get_user_icon", "set_user_icon", "_user_icon", "Lv/VText;", RXScreenCaptureService.KEY_INDEX, "Lv/VText;", "get_name", "()Lv/VText;", "set_name", "(Lv/VText;)V", "_name", "j", "get_title", "set_title", "_title", "k", "get_subscribe", "set_subscribe", "_subscribe", BLiveStormDanmakuGiftResourceType.f44444l, "get_confirm", "set_confirm", "_confirm", "m", "get_cancel", "set_cancel", "_cancel", "n", "get_holder", "set_holder", "_holder", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class GiftWallSendGiftDialogContentView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VImage _close_icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public View _iconBg;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VDraweeView _icon;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public View _user_icon_shadow;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VDraweeView _user_icon;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _name;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VText _subscribe;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VText _confirm;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VText _cancel;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public View _holder;

    public /* synthetic */ GiftWallSendGiftDialogContentView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m73659h0(dd80 dd80Var, BLiveVoiceGiftItem bLiveVoiceGiftItem, boolean z, boolean z2, h4t h4tVar, View view) {
        Object obj;
        dd80Var.dismiss();
        if (TextUtils.isEmpty(bLiveVoiceGiftItem.interact.buttonSchema)) {
            return;
        }
        if (z) {
            obj = "gift_naming_pop_profile";
        } else if (z2) {
            obj = "light_gift_pop_rightwall";
        } else {
            h4tVar.m206028F2().GiftWallDialogEvent.closeLocalGiftWallDialog().m172467p();
            h4tVar.m206028F2().OpenUserCardDialogEvent.dismiss().m172467p();
            obj = Unit.INSTANCE;
        }
        BLiveVoiceGiftWallGiftItemInteract bLiveVoiceGiftWallGiftItemInteract = bLiveVoiceGiftItem.interact;
        bLiveVoiceGiftWallGiftItemInteract.buttonSchema = bLiveVoiceGiftWallGiftItemInteract.buttonSchema + "&fromTag=" + obj;
        h4tVar.m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(21001).m206701e(bLiveVoiceGiftItem.interact.buttonSchema).m206699c());
    }

    /* JADX INFO: renamed from: i0 */
    public static void m73660i0(dd80 dd80Var, View view) {
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: j0 */
    public static void m73661j0(dd80 dd80Var, View view) {
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: k0 */
    public static void m73662k0(dd80 dd80Var, e30 e30Var, BLiveUserDressUp bLiveUserDressUp, View view) {
        dd80Var.dismiss();
        e30Var.call(bLiveUserDressUp.jumpInfo);
    }

    @NotNull
    public final VText get_cancel() {
        VText vText = this._cancel;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_cancel");
        return null;
    }

    @NotNull
    public final VImage get_close_icon() {
        VImage vImage = this._close_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_close_icon");
        return null;
    }

    @NotNull
    public final VText get_confirm() {
        VText vText = this._confirm;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_confirm");
        return null;
    }

    @NotNull
    public final View get_holder() {
        View view = this._holder;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_holder");
        return null;
    }

    @NotNull
    public final VDraweeView get_icon() {
        VDraweeView vDraweeView = this._icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_icon");
        return null;
    }

    @NotNull
    public final View get_iconBg() {
        View view = this._iconBg;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_iconBg");
        return null;
    }

    @NotNull
    public final VText get_name() {
        VText vText = this._name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_name");
        return null;
    }

    @NotNull
    public final VText get_subscribe() {
        VText vText = this._subscribe;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_subscribe");
        return null;
    }

    @NotNull
    public final VText get_title() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_title");
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
    public final View get_user_icon_shadow() {
        View view = this._user_icon_shadow;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_user_icon_shadow");
        return null;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m73663l0(View view) {
        h0k.m128964a(this, view);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m73664m0(@NotNull final BLiveUserDressUp item, @NotNull final dd80 dialog, @NotNull String pageId, @NotNull final e30<BLiveJumpInfo> clickCallback) {
        item.getClass();
        dialog.getClass();
        pageId.getClass();
        clickCallback.getClass();
        xdl0.m208344M(get_close_icon(), true);
        xdl0.m208344M(get_cancel(), false);
        xdl0.m208344M(get_name(), false);
        xdl0.m208360X(get_confirm(), t100.m186890d(24.0f));
        xdl0.m208360X(get_icon(), 0);
        xdl0.m208325C0(get_holder(), t100.f167273v);
        xdl0.m208325C0(get_icon(), t100.m186890d(120.0f));
        xdl0.m208327D0(t100.m186890d(120.0f), get_icon());
        xdl0.m208325C0(get_icon(), t100.m186890d(120.0f));
        xdl0.m208360X(get_title(), t100.f167268q);
        get_title().setText(item.name);
        get_iconBg().setBackgroundDrawable(kvc0.m147354c("#ffffff", 10));
        get_icon().getHierarchy().m112076w(ftd0.f99181e);
        hxs.m133406s("context_livingAct", get_icon(), item.imageUrl);
        xdl0.m208329E0(get_close_icon(), new View.OnClickListener() { // from class: l.f0k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftWallSendGiftDialogContentView.m73660i0(dialog, view);
            }
        });
        get_subscribe().setText(item.jumpInfo.text);
        get_confirm().setText(item.jumpInfo.buttonText);
        xdl0.m208329E0(get_confirm(), new View.OnClickListener() { // from class: l.g0k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftWallSendGiftDialogContentView.m73662k0(dialog, clickCallback, item, view);
            }
        });
        zvf0.m220368A(ycu.f197485c, pageId, vwb.m200311Y("popup_type", item.jumpInfo.popupType));
    }

    /* JADX INFO: renamed from: n0 */
    public final void m73665n0(@NotNull final BLiveVoiceGiftItem itemModel, @NotNull final dd80 dialog, final boolean isFromUserCard, final boolean isFromMedal, @NotNull final h4t<?, ?> presenter) {
        String str;
        itemModel.getClass();
        dialog.getClass();
        presenter.getClass();
        xdl0.m208344M(get_close_icon(), true);
        xdl0.m208344M(get_cancel(), false);
        xdl0.m208344M(get_name(), false);
        xdl0.m208360X(get_confirm(), t100.m186890d(24.0f));
        xdl0.m208360X(get_icon(), 0);
        xdl0.m208325C0(get_holder(), t100.f167273v);
        xdl0.m208325C0(get_icon(), t100.m186890d(120.0f));
        xdl0.m208327D0(t100.m186890d(120.0f), get_icon());
        get_title().setText(itemModel.interact.title);
        get_subscribe().setText(itemModel.interact.subTitle);
        VText vText = get_confirm();
        if (TextUtils.isEmpty(itemModel.interact.buttonText)) {
            str = "我知道了";
        } else {
            str = itemModel.interact.buttonText;
            str.getClass();
        }
        vText.setText(str);
        get_iconBg().setBackgroundDrawable(kvc0.m147354c("#ffffff", 10));
        hxs.m133406s("context_livingAct", get_icon(), itemModel.icon);
        if (!TextUtils.isEmpty(itemModel.mvpAvatar)) {
            xdl0.m208344M(get_user_icon_shadow(), itemModel.unlocked);
            xdl0.m208344M(get_user_icon(), itemModel.unlocked);
            hxs.m133406s("context_livingAct", get_user_icon(), itemModel.mvpAvatar);
        }
        xdl0.m208329E0(get_close_icon(), new View.OnClickListener() { // from class: l.d0k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftWallSendGiftDialogContentView.m73661j0(dialog, view);
            }
        });
        xdl0.m208329E0(get_confirm(), new View.OnClickListener() { // from class: l.e0k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftWallSendGiftDialogContentView.m73659h0(dialog, itemModel, isFromUserCard, isFromMedal, presenter, view);
            }
        });
        boolean z = itemModel.unlocked;
        String str2 = itemModel.f44498id;
        if (z) {
            tyj.m191053f(Boolean.valueOf(isFromUserCard), str2);
        } else {
            tyj.m191050c(Boolean.valueOf(isFromMedal), str2);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73663l0(this);
        get_title().getPaint().setFakeBoldText(true);
    }

    public final void set_cancel(@NotNull VText vText) {
        vText.getClass();
        this._cancel = vText;
    }

    public final void set_close_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._close_icon = vImage;
    }

    public final void set_confirm(@NotNull VText vText) {
        vText.getClass();
        this._confirm = vText;
    }

    public final void set_holder(@NotNull View view) {
        view.getClass();
        this._holder = view;
    }

    public final void set_icon(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._icon = vDraweeView;
    }

    public final void set_iconBg(@NotNull View view) {
        view.getClass();
        this._iconBg = view;
    }

    public final void set_name(@NotNull VText vText) {
        vText.getClass();
        this._name = vText;
    }

    public final void set_subscribe(@NotNull VText vText) {
        vText.getClass();
        this._subscribe = vText;
    }

    public final void set_title(@NotNull VText vText) {
        vText.getClass();
        this._title = vText;
    }

    public final void set_user_icon(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._user_icon = vDraweeView;
    }

    public final void set_user_icon_shadow(@NotNull View view) {
        view.getClass();
        this._user_icon_shadow = view;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftWallSendGiftDialogContentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftWallSendGiftDialogContentView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftWallSendGiftDialogContentView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
