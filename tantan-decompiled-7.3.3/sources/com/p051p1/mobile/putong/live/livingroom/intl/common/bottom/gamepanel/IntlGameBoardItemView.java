package com.p051p1.mobile.putong.live.livingroom.intl.common.bottom.gamepanel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveGamePanelButtons;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VText;
import p153l.izs;
import p153l.qin;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0018\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0012R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010,\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010\u0014\u001a\u0004\b*\u0010\u0016\"\u0004\b+\u0010\u0012¨\u0006-"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/intl/common/bottom/gamepanel/IntlGameBoardItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveGamePanelButtons;", "data", "i0", "(Lcom/p1/mobile/putong/live/base/data/BLiveGamePanelButtons;)V", "Landroid/view/View;", OMSTemplateModeType.view, "h0", "(Landroid/view/View;)V", Constants.INAPP_DATA_TAG, "Landroid/view/View;", "get_iconBg", "()Landroid/view/View;", "set_iconBg", "_iconBg", "Lv/VDraweeView;", "e", "Lv/VDraweeView;", "get_gameIcon", "()Lv/VDraweeView;", "set_gameIcon", "(Lv/VDraweeView;)V", "_gameIcon", "Lv/VText;", "f", "Lv/VText;", "get_gameName", "()Lv/VText;", "set_gameName", "(Lv/VText;)V", "_gameName", "g", "get_redDot", "set_redDot", "_redDot", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class IntlGameBoardItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public View _iconBg;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VDraweeView _gameIcon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _gameName;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public View _redDot;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public IntlGameBoardItemView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    @NotNull
    public final VDraweeView get_gameIcon() {
        VDraweeView vDraweeView = this._gameIcon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_gameIcon");
        return null;
    }

    @NotNull
    public final VText get_gameName() {
        VText vText = this._gameName;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_gameName");
        return null;
    }

    @NotNull
    public final View get_iconBg() {
        View view = this._iconBg;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_iconBg");
        return null;
    }

    @NotNull
    public final View get_redDot() {
        View view = this._redDot;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_redDot");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m76417h0(View view) {
        qin.m176753a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m76418i0(@NotNull BLiveGamePanelButtons data) {
        data.getClass();
        get_redDot().setVisibility(data.enableRedDot ? 0 : 8);
        get_gameName().setText(data.name);
        izs.m142868s("context_single_room", get_gameIcon(), data.icon);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76417h0(this);
    }

    public final void set_gameIcon(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._gameIcon = vDraweeView;
    }

    public final void set_gameName(@NotNull VText vText) {
        vText.getClass();
        this._gameName = vText;
    }

    public final void set_iconBg(@NotNull View view) {
        view.getClass();
        this._iconBg = view;
    }

    public final void set_redDot(@NotNull View view) {
        view.getClass();
        this._redDot = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlGameBoardItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ IntlGameBoardItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
