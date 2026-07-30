package com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetCpInviteRecordItemView;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSweetCpInviteRecord;
import com.p1.mobile.putong.live.livingroom.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.d30;
import l.e30;
import l.f30;
import l.hxs;
import l.oar;
import l.xdl0;
import l.yno0;
import org.jetbrains.annotations.NotNull;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010+\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\"\u0010/\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010;\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u0010\"\u001a\u0004\b9\u0010$\"\u0004\b:\u0010&R\"\u0010?\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010\"\u001a\u0004\b=\u0010$\"\u0004\b>\u0010&¨\u0006@"}, d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/intl/sweet/view/item/VoiceSweetCpInviteRecordItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceSweetCpInviteRecord;", "record", "Ll/f30;", "", "operationAction", "Ll/e30;", "openUserCard", "m0", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceSweetCpInviteRecord;Ll/f30;Ll/e30;)V", "Landroid/view/View;", "view", "l0", "(Landroid/view/View;)V", "Lv/VDraweeView;", "d", "Lv/VDraweeView;", "get_inviteAvatar", "()Lv/VDraweeView;", "set_inviteAvatar", "(Lv/VDraweeView;)V", "_inviteAvatar", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "get_inviteName", "()Landroid/widget/TextView;", "set_inviteName", "(Landroid/widget/TextView;)V", "_inviteName", "f", "get_inviteTime", "set_inviteTime", "_inviteTime", "g", "get_stateView", "set_stateView", "_stateView", "Landroid/widget/LinearLayout;", "h", "Landroid/widget/LinearLayout;", "get_operateLayout", "()Landroid/widget/LinearLayout;", "set_operateLayout", "(Landroid/widget/LinearLayout;)V", "_operateLayout", "i", "get_operateLayout_refuseBtn", "set_operateLayout_refuseBtn", "_operateLayout_refuseBtn", "j", "get_operateLayout_agreeBtn", "set_operateLayout_agreeBtn", "_operateLayout_agreeBtn", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VoiceSweetCpInviteRecordItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _inviteAvatar;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _inviteName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public TextView _inviteTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public TextView _stateView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public LinearLayout _operateLayout;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public TextView _operateLayout_refuseBtn;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public TextView _operateLayout_agreeBtn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceSweetCpInviteRecordItemView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    /* JADX INFO: renamed from: n0 */
    public static final void m8774n0() {
    }

    /* JADX INFO: renamed from: o0 */
    public static final void m8775o0(f30 f30Var, BLiveVoiceSweetCpInviteRecord bLiveVoiceSweetCpInviteRecord, View view) {
        f30Var.call("approve", bLiveVoiceSweetCpInviteRecord.inviteUserId);
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m8776p0(f30 f30Var, BLiveVoiceSweetCpInviteRecord bLiveVoiceSweetCpInviteRecord, View view) {
        f30Var.call("refuse", bLiveVoiceSweetCpInviteRecord.inviteUserId);
    }

    /* JADX INFO: renamed from: q0 */
    public static final void m8777q0(e30 e30Var, BLiveVoiceSweetCpInviteRecord bLiveVoiceSweetCpInviteRecord, View view) {
        e30Var.call(bLiveVoiceSweetCpInviteRecord.inviteUserId);
    }

    @NotNull
    public final VDraweeView get_inviteAvatar() {
        VDraweeView vDraweeView = this._inviteAvatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_inviteAvatar");
        return null;
    }

    @NotNull
    public final TextView get_inviteName() {
        TextView textView = this._inviteName;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_inviteName");
        return null;
    }

    @NotNull
    public final TextView get_inviteTime() {
        TextView textView = this._inviteTime;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_inviteTime");
        return null;
    }

    @NotNull
    public final LinearLayout get_operateLayout() {
        LinearLayout linearLayout = this._operateLayout;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_operateLayout");
        return null;
    }

    @NotNull
    public final TextView get_operateLayout_agreeBtn() {
        TextView textView = this._operateLayout_agreeBtn;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_operateLayout_agreeBtn");
        return null;
    }

    @NotNull
    public final TextView get_operateLayout_refuseBtn() {
        TextView textView = this._operateLayout_refuseBtn;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_operateLayout_refuseBtn");
        return null;
    }

    @NotNull
    public final TextView get_stateView() {
        TextView textView = this._stateView;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_stateView");
        return null;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m8778l0(View view) {
        yno0.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    public final void m8779m0(@NotNull final BLiveVoiceSweetCpInviteRecord record, @NotNull final f30<String, String> operationAction, @NotNull final e30<String> openUserCard) {
        record.getClass();
        operationAction.getClass();
        openUserCard.getClass();
        hxs.k("context_single_room", get_inviteAvatar(), record.inviteUserAvatar);
        get_inviteName().setFilters(new InputFilter[]{new oar(24, new d30() { // from class: l.uno0
            public final void call() {
                VoiceSweetCpInviteRecordItemView.m8774n0();
            }
        })});
        get_inviteName().setText(record.inviteUsername);
        get_inviteTime().setText(record.inviteTime);
        xdl0.M(get_operateLayout(), Intrinsics.d("default", record.status));
        xdl0.M(get_stateView(), !Intrinsics.d("default", record.status));
        xdl0.E0(get_operateLayout_agreeBtn(), new View.OnClickListener() { // from class: l.vno0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceSweetCpInviteRecordItemView.m8775o0(operationAction, record, view);
            }
        });
        xdl0.E0(get_operateLayout_refuseBtn(), new View.OnClickListener() { // from class: l.wno0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceSweetCpInviteRecordItemView.m8776p0(operationAction, record, view);
            }
        });
        xdl0.E0(get_inviteAvatar(), new View.OnClickListener() { // from class: l.xno0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceSweetCpInviteRecordItemView.m8777q0(openUserCard, record, view);
            }
        });
        if (Intrinsics.d("refuse", record.status)) {
            get_stateView().setText(getContext().getText(R.string.Q));
        } else if (Intrinsics.d("approve", record.status)) {
            get_stateView().setText(getContext().getText(R.string.l3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8778l0(this);
    }

    public final void set_inviteAvatar(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._inviteAvatar = vDraweeView;
    }

    public final void set_inviteName(@NotNull TextView textView) {
        textView.getClass();
        this._inviteName = textView;
    }

    public final void set_inviteTime(@NotNull TextView textView) {
        textView.getClass();
        this._inviteTime = textView;
    }

    public final void set_operateLayout(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this._operateLayout = linearLayout;
    }

    public final void set_operateLayout_agreeBtn(@NotNull TextView textView) {
        textView.getClass();
        this._operateLayout_agreeBtn = textView;
    }

    public final void set_operateLayout_refuseBtn(@NotNull TextView textView) {
        textView.getClass();
        this._operateLayout_refuseBtn = textView;
    }

    public final void set_stateView(@NotNull TextView textView) {
        textView.getClass();
        this._stateView = textView;
    }
}
