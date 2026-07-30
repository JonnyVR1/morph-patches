package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.GroupInvitation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAdditionalData;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.knb0;
import p149l.lsi0;
import p149l.o6j0;
import p149l.qib0;
import p149l.tbk;
import p149l.ura;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemGroupInviteMessage extends VRelative implements InterfaceC8519a {

    /* JADX INFO: renamed from: d */
    public ItemGroupInviteMessage f30973d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f30974e;

    /* JADX INFO: renamed from: f */
    public VText f30975f;

    /* JADX INFO: renamed from: g */
    public VText f30976g;

    /* JADX INFO: renamed from: h */
    public VLinear f30977h;

    /* JADX INFO: renamed from: i */
    public VText f30978i;

    /* JADX INFO: renamed from: j */
    public boolean f30979j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemGroupInviteMessage$a */
    public static class C8488a {
        /* JADX INFO: renamed from: b */
        public static void m48186b(ItemGroupInviteMessage itemGroupInviteMessage, View view) {
            itemGroupInviteMessage.f30973d = (ItemGroupInviteMessage) view;
            ViewGroup viewGroup = (ViewGroup) view;
            itemGroupInviteMessage.f30974e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
            itemGroupInviteMessage.f30975f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
            itemGroupInviteMessage.f30976g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
            itemGroupInviteMessage.f30977h = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            itemGroupInviteMessage.f30978i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        }
    }

    public ItemGroupInviteMessage(Context context) {
        super(context);
        this.f30979j = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m48179P(Message message, View view) {
        m48184O(message);
    }

    private Act act() {
        return (Act) getContext();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(final Message message) {
        GroupInvitation groupInvitation;
        MessageAdditionalData messageAdditionalData = message.additionalData;
        if (messageAdditionalData == null || (groupInvitation = messageAdditionalData.groupInvitation) == null) {
            return;
        }
        String str = groupInvitation.button.title;
        if (TextUtils.isEmpty(str) || TextUtils.equals(message.owner, CoreModule.m29931H().userId())) {
            xdl0.m208344M(this.f30977h, false);
        } else {
            xdl0.m208344M(this.f30977h, true);
            this.f30978i.setText(str);
            xdl0.m208329E0(this.f30973d, new View.OnClickListener() { // from class: l.j4q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f116228a.m48179P(message, view);
                }
            });
            String str2 = message.additionalData.groupInvitation.target.f20520id;
            if (!this.f30979j) {
                o6j0.m162864h("e_group_chat_invite_card", ((Act) getContext()).pageId(), o6j0.C18854a.m162878h("groupchat_id", str2));
                this.f30979j = true;
            }
        }
        this.f30975f.setText(message.additionalData.groupInvitation.title);
        this.f30976g.setText(message.additionalData.groupInvitation.subTitle);
        if (vwb.m200296J(message.media)) {
            this.f30974e.setImageResource(c3c0.f78701b);
            return;
        }
        Picture pictureCover = message.media.get(0).cover();
        if (NullChecker.m81303a(pictureCover)) {
            qib0.f154691G.m102341Q0(this.f30974e, pictureCover.profileSmall());
        } else {
            this.f30974e.setImageResource(c3c0.f78701b);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: M */
    public final void m48183M(View view) {
        C8488a.m48186b(this, view);
    }

    /* JADX INFO: renamed from: O */
    public final void m48184O(Message message) {
        GroupInvitation groupInvitation;
        MessageAdditionalData messageAdditionalData = message.additionalData;
        if (messageAdditionalData == null || (groupInvitation = messageAdditionalData.groupInvitation) == null || !TextUtils.equals(groupInvitation.target.type, "chatGroups")) {
            return;
        }
        String str = message.additionalData.groupInvitation.target.f20520id;
        o6j0.m162859c("e_group_chat_invite_card", ((Act) getContext()).pageId(), o6j0.C18854a.m162878h("groupchat_id", str));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (CoreModule.m29932K().me_().isBanned()) {
            lsi0.m151593w(R$string.f20765H0);
        } else {
            tbk.m187873t(act(), str, "", "invitation");
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48183M(this);
        this.f30975f.getPaint().setFakeBoldText(true);
        this.f30978i.getPaint().setFakeBoldText(true);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f30975f.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f30976g.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f30978i.setTextColor(getResources().getColor(a1c0.f67156j));
        }
    }

    public ItemGroupInviteMessage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30979j = false;
    }

    public ItemGroupInviteMessage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30979j = false;
    }
}
