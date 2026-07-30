package com.p046p1.mobile.putong.live.livingroom.increment.gift.skin.list;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftSkin;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.skin.list.LiveGiftSkinItemView;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.fjs;
import p149l.hxs;
import p149l.i3c0;
import p149l.kvc0;
import p149l.sjs;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00102\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u0010)\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u00069"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/gift/skin/list/LiveGiftSkinItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftSkin;", Item.TYPE, "Ll/sjs;", "presenter", "", "isDark", "j0", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftSkin;Ll/sjs;Z)V", "Landroid/view/View;", OMSTemplateModeType.view, "i0", "(Landroid/view/View;)V", "Lv/VImage;", Constants.INAPP_DATA_TAG, "Lv/VImage;", "get_bg", "()Lv/VImage;", "set_bg", "(Lv/VImage;)V", "_bg", "Lv/VDraweeView;", "e", "Lv/VDraweeView;", "get_icon", "()Lv/VDraweeView;", "set_icon", "(Lv/VDraweeView;)V", "_icon", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "get_title", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "g", "get_sub_title", "set_sub_title", "_sub_title", "h", "Ll/sjs;", "getPresenter", "()Ll/sjs;", "setPresenter", "(Ll/sjs;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public class LiveGiftSkinItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VImage _bg;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VDraweeView _icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public TextView _sub_title;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public sjs presenter;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public LiveGiftSkinItemView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: k0 */
    public static final void m74012k0(sjs sjsVar, BLiveNewGiftSkin bLiveNewGiftSkin, View view) {
        if (NullChecker.m81303a(sjsVar)) {
            sjsVar.m184556V3(bLiveNewGiftSkin);
        }
    }

    @Nullable
    public final sjs getPresenter() {
        return this.presenter;
    }

    @NotNull
    public final VImage get_bg() {
        VImage vImage = this._bg;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_bg");
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
    public final TextView get_sub_title() {
        TextView textView = this._sub_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_sub_title");
        return null;
    }

    @NotNull
    public final TextView get_title() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m74013i0(View view) {
        fjs.m121629a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m74014j0(@Nullable final BLiveNewGiftSkin item, @NotNull final sjs presenter, boolean isDark) {
        presenter.getClass();
        this.presenter = presenter;
        if (item != null) {
            get_title().setText(item.name);
            get_sub_title().setText(item.expiredText);
            hxs.m133406s("context_livingAct", get_icon(), item.icon);
            kvc0.m147360i(get_icon(), TextUtils.equals(item.status, "locked"));
            if (TextUtils.equals(item.status, "locked")) {
                get_bg().setImageDrawable(kvc0.m147353b(i3c0.f111144r2));
            } else {
                get_bg().setImageDrawable(kvc0.m147353b(i3c0.f111216x2));
            }
            xdl0.m208344M(get_sub_title(), (TextUtils.isEmpty(item.expiredText) || isDark) ? false : true);
            xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.ejs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LiveGiftSkinItemView.m74012k0(presenter, item, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74013i0(this);
    }

    public final void setPresenter(@Nullable sjs sjsVar) {
        this.presenter = sjsVar;
    }

    public final void set_bg(@NotNull VImage vImage) {
        vImage.getClass();
        this._bg = vImage;
    }

    public final void set_icon(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._icon = vDraweeView;
    }

    public final void set_sub_title(@NotNull TextView textView) {
        textView.getClass();
        this._sub_title = textView;
    }

    public final void set_title(@NotNull TextView textView) {
        textView.getClass();
        this._title = textView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveGiftSkinItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ LiveGiftSkinItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
