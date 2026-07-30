package com.p000p1.mobile.putong.live.livingroom.voice.intl.manager.invite;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.manager.invite.IntlVoiceLiveManagerInviteItemView;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveVoiceManagerInvite;
import com.p1.mobile.putong.live.livingroom.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.cxq;
import l.e30;
import l.h1c0;
import l.kvp;
import l.t100;
import l.wk3;
import l.yb2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010'\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\u0019R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00103\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.¨\u00064"}, d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/intl/manager/invite/IntlVoiceLiveManagerInviteItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;", "itemInfo", "Ll/e30;", "action", "k0", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;Ll/e30;)V", "int", "j0", "(I)I", "Landroid/view/View;", "view", "i0", "(Landroid/view/View;)V", "Lv/VDraweeView;", "d", "Lv/VDraweeView;", "get_header", "()Lv/VDraweeView;", "set_header", "(Lv/VDraweeView;)V", "_header", "e", "Landroid/view/View;", "get_status", "()Landroid/view/View;", "set_status", "_status", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "get_inviteBtn", "()Landroid/widget/TextView;", "set_inviteBtn", "(Landroid/widget/TextView;)V", "_inviteBtn", "g", "get_user_name", "set_user_name", "_user_name", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IntlVoiceLiveManagerInviteItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _header;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public View _status;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public TextView _inviteBtn;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public TextView _user_name;

    public /* synthetic */ IntlVoiceLiveManagerInviteItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: h0 */
    public static Unit m8451h0(e30 e30Var, BLiveVoiceManagerInvite bLiveVoiceManagerInvite, View view) {
        view.getClass();
        e30Var.call(bLiveVoiceManagerInvite);
        return Unit.INSTANCE;
    }

    @NotNull
    public final VDraweeView get_header() {
        VDraweeView vDraweeView = this._header;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_header");
        return null;
    }

    @NotNull
    public final TextView get_inviteBtn() {
        TextView textView = this._inviteBtn;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_inviteBtn");
        return null;
    }

    @NotNull
    public final View get_status() {
        View view = this._status;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_status");
        return null;
    }

    @NotNull
    public final TextView get_user_name() {
        TextView textView = this._user_name;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_user_name");
        return null;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m8452i0(View view) {
        kvp.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public final int m8453j0(int i) {
        return getContext().getResources().getColor(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public final void m8454k0(@NotNull final BLiveVoiceManagerInvite itemInfo, @NotNull final e30<BLiveVoiceManagerInvite> action) {
        String string;
        Drawable drawableA;
        itemInfo.getClass();
        action.getClass();
        get_inviteBtn().setSelected(itemInfo.isManager || TEnum.equals(itemInfo.status, "inviting"));
        if (itemInfo.isManager) {
            string = getContext().getString(R.string.Nf);
            string.getClass();
            get_inviteBtn().setTextColor(m8453j0(h1c0.j1));
            drawableA = yb2.a(m8453j0(h1c0.h1), t100.d(12.0f), false);
        } else if (TEnum.equals(itemInfo.status, "inviting")) {
            string = getContext().getString(R.string.Rh);
            string.getClass();
            get_inviteBtn().setTextColor(m8453j0(h1c0.j1));
            drawableA = null;
        } else {
            string = getContext().getString(R.string.K6);
            string.getClass();
            get_inviteBtn().setTextColor(m8453j0(h1c0.w1));
            drawableA = yb2.a(m8453j0(h1c0.p0), t100.d(12.0f), false);
        }
        get_inviteBtn().setBackground(drawableA);
        get_inviteBtn().setText(string);
        get_user_name().setText(itemInfo.mask.name);
        wk3.b(get_header(), itemInfo.mask, false);
        cxq.c(get_inviteBtn(), new Function1() { // from class: l.jvp
            public final Object invoke(Object obj) {
                return IntlVoiceLiveManagerInviteItemView.m8451h0(action, itemInfo, (View) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8452i0(this);
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
    public IntlVoiceLiveManagerInviteItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlVoiceLiveManagerInviteItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlVoiceLiveManagerInviteItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
