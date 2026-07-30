package com.p051p1.mobile.putong.live.livingroom.voice.manager;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.meituan.robust.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceManagerInvite;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceManagerInviteStatus;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.manager.VoiceLiveManagerInviteItemView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.czq;
import p153l.fc2;
import p153l.i2o0;
import p153l.n9c0;
import p153l.qa00;
import p153l.ql3;
import p153l.y20;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010)\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u001bR\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00105\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u0010,\u001a\u0004\b3\u0010.\"\u0004\b4\u00100¨\u00066"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/manager/VoiceLiveManagerInviteItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;", "itemInfo", "", "isHistory", "Ll/y20;", "action", "k0", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;ZLl/y20;)V", Constants.INT, "j0", "(I)I", "Landroid/view/View;", OMSTemplateModeType.view, "i0", "(Landroid/view/View;)V", "Lv/VDraweeView;", com.clevertap.android.sdk.Constants.INAPP_DATA_TAG, "Lv/VDraweeView;", "get_header", "()Lv/VDraweeView;", "set_header", "(Lv/VDraweeView;)V", "_header", "e", "Landroid/view/View;", "get_status", "()Landroid/view/View;", "set_status", "_status", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "get_inviteBtn", "()Landroid/widget/TextView;", "set_inviteBtn", "(Landroid/widget/TextView;)V", "_inviteBtn", "g", "get_user_name", "set_user_name", "_user_name", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class VoiceLiveManagerInviteItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _header;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public View _status;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public TextView _inviteBtn;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public TextView _user_name;

    public /* synthetic */ VoiceLiveManagerInviteItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: h0 */
    public static Unit m79775h0(y20 y20Var, BLiveVoiceManagerInvite bLiveVoiceManagerInvite, View view) {
        view.getClass();
        y20Var.call(bLiveVoiceManagerInvite);
        return Unit.INSTANCE;
    }

    @NotNull
    public final VDraweeView get_header() {
        VDraweeView vDraweeView = this._header;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_header");
        return null;
    }

    @NotNull
    public final TextView get_inviteBtn() {
        TextView textView = this._inviteBtn;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_inviteBtn");
        return null;
    }

    @NotNull
    public final View get_status() {
        View view = this._status;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_status");
        return null;
    }

    @NotNull
    public final TextView get_user_name() {
        TextView textView = this._user_name;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_user_name");
        return null;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m79776i0(View view) {
        i2o0.m138231a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final int m79777j0(int i) {
        return getContext().getResources().getColor(i);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m79778k0(@NotNull final BLiveVoiceManagerInvite itemInfo, boolean isHistory, @NotNull final y20<BLiveVoiceManagerInvite> action) {
        String string;
        Drawable drawableM124971a;
        itemInfo.getClass();
        action.getClass();
        if (isHistory) {
            bnl0.m105524M(get_status(), itemInfo.isOnline);
            get_inviteBtn().setSelected(TEnum.equals(itemInfo.status, BLiveVoiceManagerInviteStatus.inviting));
            if (TEnum.equals(itemInfo.status, BLiveVoiceManagerInviteStatus.inviting)) {
                string = getContext().getString(R$string.f47533Fi);
                string.getClass();
                drawableM124971a = fc2.m124971a(m79777j0(n9c0.f140779L), qa00.m175859d(12.0f), false);
            } else {
                string = getContext().getString(R$string.f47511Ei);
                string.getClass();
                drawableM124971a = fc2.m124971a(m79777j0(n9c0.f140855p0), qa00.m175859d(12.0f), false);
            }
        } else {
            get_inviteBtn().setSelected(itemInfo.isManager || TEnum.equals(itemInfo.status, BLiveVoiceManagerInviteStatus.inviting));
            if (itemInfo.isManager) {
                string = getContext().getString(R$string.f47704Nf);
                string.getClass();
                get_inviteBtn().setTextColor(m79777j0(n9c0.f140783N));
                drawableM124971a = fc2.m124971a(m79777j0(n9c0.f140777K), qa00.m175859d(12.0f), false);
            } else if (TEnum.equals(itemInfo.status, BLiveVoiceManagerInviteStatus.inviting)) {
                string = getContext().getString(R$string.f47790Rh);
                string.getClass();
                get_inviteBtn().setTextColor(m79777j0(n9c0.f140877w1));
                drawableM124971a = fc2.m124971a(m79777j0(n9c0.f140779L), qa00.m175859d(12.0f), false);
            } else {
                string = getContext().getString(R$string.f47631K6);
                string.getClass();
                get_inviteBtn().setTextColor(m79777j0(n9c0.f140877w1));
                drawableM124971a = fc2.m124971a(m79777j0(n9c0.f140855p0), qa00.m175859d(12.0f), false);
            }
        }
        get_inviteBtn().setBackground(drawableM124971a);
        get_inviteBtn().setText(string);
        get_user_name().setText(itemInfo.mask.name);
        ql3.m176984b(get_header(), itemInfo.mask, false);
        czq.m113347c(get_inviteBtn(), new Function1() { // from class: l.h2o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VoiceLiveManagerInviteItemView.m79775h0(action, itemInfo, (View) obj);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79776i0(this);
    }

    public final void set_header(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._header = vDraweeView;
    }

    public final void set_inviteBtn(@NotNull TextView textView) {
        textView.getClass();
        this._inviteBtn = textView;
    }

    public final void set_status(@NotNull View view) {
        view.getClass();
        this._status = view;
    }

    public final void set_user_name(@NotNull TextView textView) {
        textView.getClass();
        this._user_name = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceLiveManagerInviteItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceLiveManagerInviteItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceLiveManagerInviteItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
