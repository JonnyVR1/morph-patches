package com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetCpInviteRecord;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetCpInviteRecordItemView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.cxo0;
import p153l.izs;
import p153l.qcr;
import p153l.x20;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010+\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\"\u0010/\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010;\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u0010\"\u001a\u0004\b9\u0010$\"\u0004\b:\u0010&R\"\u0010?\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010\"\u001a\u0004\b=\u0010$\"\u0004\b>\u0010&¨\u0006@"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/intl/sweet/view/item/VoiceSweetCpInviteRecordItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceSweetCpInviteRecord;", "record", "Ll/z20;", "", "operationAction", "Ll/y20;", "openUserCard", "m0", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceSweetCpInviteRecord;Ll/z20;Ll/y20;)V", "Landroid/view/View;", OMSTemplateModeType.view, "l0", "(Landroid/view/View;)V", "Lv/VDraweeView;", Constants.INAPP_DATA_TAG, "Lv/VDraweeView;", "get_inviteAvatar", "()Lv/VDraweeView;", "set_inviteAvatar", "(Lv/VDraweeView;)V", "_inviteAvatar", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "get_inviteName", "()Landroid/widget/TextView;", "set_inviteName", "(Landroid/widget/TextView;)V", "_inviteName", "f", "get_inviteTime", "set_inviteTime", "_inviteTime", "g", "get_stateView", "set_stateView", "_stateView", "Landroid/widget/LinearLayout;", "h", "Landroid/widget/LinearLayout;", "get_operateLayout", "()Landroid/widget/LinearLayout;", "set_operateLayout", "(Landroid/widget/LinearLayout;)V", "_operateLayout", RXScreenCaptureService.KEY_INDEX, "get_operateLayout_refuseBtn", "set_operateLayout_refuseBtn", "_operateLayout_refuseBtn", "j", "get_operateLayout_agreeBtn", "set_operateLayout_agreeBtn", "_operateLayout_agreeBtn", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
    public static final void m79744n0() {
    }

    /* JADX INFO: renamed from: o0 */
    public static final void m79745o0(z20 z20Var, BLiveVoiceSweetCpInviteRecord bLiveVoiceSweetCpInviteRecord, View view) {
        z20Var.call("approve", bLiveVoiceSweetCpInviteRecord.inviteUserId);
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m79746p0(z20 z20Var, BLiveVoiceSweetCpInviteRecord bLiveVoiceSweetCpInviteRecord, View view) {
        z20Var.call("refuse", bLiveVoiceSweetCpInviteRecord.inviteUserId);
    }

    /* JADX INFO: renamed from: q0 */
    public static final void m79747q0(y20 y20Var, BLiveVoiceSweetCpInviteRecord bLiveVoiceSweetCpInviteRecord, View view) {
        y20Var.call(bLiveVoiceSweetCpInviteRecord.inviteUserId);
    }

    @NotNull
    public final VDraweeView get_inviteAvatar() {
        VDraweeView vDraweeView = this._inviteAvatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_inviteAvatar");
        return null;
    }

    @NotNull
    public final TextView get_inviteName() {
        TextView textView = this._inviteName;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_inviteName");
        return null;
    }

    @NotNull
    public final TextView get_inviteTime() {
        TextView textView = this._inviteTime;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_inviteTime");
        return null;
    }

    @NotNull
    public final LinearLayout get_operateLayout() {
        LinearLayout linearLayout = this._operateLayout;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_operateLayout");
        return null;
    }

    @NotNull
    public final TextView get_operateLayout_agreeBtn() {
        TextView textView = this._operateLayout_agreeBtn;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_operateLayout_agreeBtn");
        return null;
    }

    @NotNull
    public final TextView get_operateLayout_refuseBtn() {
        TextView textView = this._operateLayout_refuseBtn;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_operateLayout_refuseBtn");
        return null;
    }

    @NotNull
    public final TextView get_stateView() {
        TextView textView = this._stateView;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_stateView");
        return null;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m79748l0(View view) {
        cxo0.m113051a(this, view);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m79749m0(@NotNull final BLiveVoiceSweetCpInviteRecord record, @NotNull final z20<String, String> operationAction, @NotNull final y20<String> openUserCard) {
        record.getClass();
        operationAction.getClass();
        openUserCard.getClass();
        izs.m142860k("context_single_room", get_inviteAvatar(), record.inviteUserAvatar);
        get_inviteName().setFilters(new InputFilter[]{new qcr(24, new x20() { // from class: l.ywo0
            @Override // p153l.x20
            public final void call() {
                VoiceSweetCpInviteRecordItemView.m79744n0();
            }
        })});
        get_inviteName().setText(record.inviteUsername);
        get_inviteTime().setText(record.inviteTime);
        bnl0.m105524M(get_operateLayout(), Intrinsics.m88377d("default", record.status));
        bnl0.m105524M(get_stateView(), !Intrinsics.m88377d("default", record.status));
        bnl0.m105509E0(get_operateLayout_agreeBtn(), new View.OnClickListener() { // from class: l.zwo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceSweetCpInviteRecordItemView.m79745o0(operationAction, record, view);
            }
        });
        bnl0.m105509E0(get_operateLayout_refuseBtn(), new View.OnClickListener() { // from class: l.axo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceSweetCpInviteRecordItemView.m79746p0(operationAction, record, view);
            }
        });
        bnl0.m105509E0(get_inviteAvatar(), new View.OnClickListener() { // from class: l.bxo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceSweetCpInviteRecordItemView.m79747q0(openUserCard, record, view);
            }
        });
        if (Intrinsics.m88377d("refuse", record.status)) {
            get_stateView().setText(getContext().getText(R$string.f47751Q));
        } else if (Intrinsics.m88377d("approve", record.status)) {
            get_stateView().setText(getContext().getText(R$string.f48206l3));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79748l0(this);
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
