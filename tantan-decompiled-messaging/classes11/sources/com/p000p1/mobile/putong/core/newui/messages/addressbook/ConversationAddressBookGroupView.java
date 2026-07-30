package com.p000p1.mobile.putong.core.newui.messages.addressbook;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.p004ui.MultipleChatIconView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.ConversationAdditional;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.VirtualVoiceGroupConversationCell;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.j760;
import l.mkd0;
import l.qib0;
import l.upa;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.xh0;
import l.z36;
import l.zvf0;
import p009l.d36;
import v.VDraweeView;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationAddressBookGroupView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VFrame f4085a;

    /* JADX INFO: renamed from: b */
    public MultipleChatIconView f4086b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f4087c;

    /* JADX INFO: renamed from: d */
    public VText f4088d;

    /* JADX INFO: renamed from: e */
    public VText f4089e;

    /* JADX INFO: renamed from: f */
    public VText f4090f;

    public ConversationAddressBookGroupView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m5991d(View view) {
        z36.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m5992e(ConversationAddressBookGroupFrag.C0305a c0305a, ChatGroup chatGroup, String[] strArr, Conversation conversation, View view) {
        if (upa.P2()) {
            d36.m12990c().m12991a();
            d36.m12990c().f10907a.onNext((Object) null);
        }
        zvf0.u("e_contacts_one_of_groups", c0305a.m14440J(), new j760[]{vwb.Y("group_name", chatGroup.name), vwb.Y("groupchat_id", ((DbObject) chatGroup).id), vwb.Y("user_group_title", strArr[0])});
        getContext().startActivity(MessagesAct.M2(getContext(), ((DbObject) conversation).id, false, false, 29, "", false));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m5993f(final ConversationAddressBookGroupFrag.C0305a c0305a, final Conversation conversation, final ChatGroup chatGroup) {
        this.f4088d.setText(chatGroup.name);
        this.f4088d.setEllipsize(TextUtils.TruncateAt.END);
        this.f4088d.setSingleLine();
        this.f4088d.getPaint().setFakeBoldText(true);
        this.f4090f.setText(chatGroup.description);
        if (vwb.J(chatGroup.avatars)) {
            qib0.G.Y0(this.f4087c, x2c0.l8);
        } else {
            qib0.G.Z0(this.f4087c, ((Picture) chatGroup.avatars.get(0)).cover().profileSmall().formatted());
        }
        String strUserId = CoreModule.H().userId();
        final String[] strArr = new String[1];
        if (TextUtils.equals(chatGroup.ownerUserId, strUserId)) {
            this.f4089e.setText("群主");
            strArr[0] = "1";
            xdl0.M(this.f4089e, true);
        } else if (vwb.J(chatGroup.adminUserIds) || !chatGroup.adminUserIds.contains(strUserId)) {
            strArr[0] = "0";
            xdl0.M(this.f4089e, false);
        } else {
            this.f4089e.setText("管理员");
            strArr[0] = "2";
            xdl0.M(this.f4089e, true);
        }
        zvf0.A("e_contacts_one_of_groups", c0305a.m14440J(), new j760[]{vwb.Y("group_name", chatGroup.name), vwb.Y("groupchat_id", ((DbObject) chatGroup).id), vwb.Y("user_group_title", strArr[0])});
        xdl0.E0(this, new View.OnClickListener() { // from class: l.y36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22866a.m5992e(c0305a, chatGroup, strArr, conversation, view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m5994g(ConversationAddressBookGroupFrag.C0305a c0305a, Conversation conversation, VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, View view) {
        zvf0.u("e_contacts_one_of_groups", c0305a.m14440J(), new j760[]{vwb.Y("group_name", conversation.localExtraInfo), vwb.Y("groupchat_id", ""), vwb.Y("user_group_title", "")});
        if (virtualVoiceGroupConversationCell.cellInfo.isDissolved) {
            new xh0.a(getContext()).j(virtualVoiceGroupConversationCell.cellInfo.dissolveReason).r("确认").a().g();
        } else {
            CoreModule.Q().m9019M6().m12097p(getContext(), virtualVoiceGroupConversationCell.roomInfo.liveId, "default", "", null);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m5995h(ConversationAddressBookGroupFrag.C0305a c0305a, Conversation conversation) {
        if (TextUtils.equals(conversation.convType, "virtualvoice")) {
            m5997j(c0305a, conversation);
        } else {
            m5996i(c0305a, conversation);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m5996i(final ConversationAddressBookGroupFrag.C0305a c0305a, final Conversation conversation) {
        xdl0.M(this.f4086b, false);
        xdl0.M(this.f4087c, true);
        c0305a.c(getContext(), CoreModule.c.g0.o6(conversation.otherUser)).subscribe(mkd0.G(new e30() { // from class: l.x36
            public final void call(Object obj) {
                this.f22420a.m5993f(c0305a, conversation, (ChatGroup) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public final void m5997j(final ConversationAddressBookGroupFrag.C0305a c0305a, final Conversation conversation) {
        ConversationAdditional conversationAdditional;
        final VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell;
        if (conversation == null || (conversationAdditional = conversation.additional) == null || (virtualVoiceGroupConversationCell = conversationAdditional.liveVirtualVoice) == null) {
            return;
        }
        this.f4088d.setText(conversation.localExtraInfo);
        this.f4088d.getPaint().setFakeBoldText(true);
        this.f4090f.setText((!NullChecker.a(virtualVoiceGroupConversationCell.chatInfo) || TextUtils.isEmpty(virtualVoiceGroupConversationCell.chatInfo.commonMsg)) ? "" : virtualVoiceGroupConversationCell.chatInfo.commonMsg);
        this.f4086b.setRadius(55.0f);
        this.f4086b.m9718p0(virtualVoiceGroupConversationCell.roomInfo.avatars, false);
        xdl0.M(this.f4086b, true);
        xdl0.M(this.f4087c, false);
        xdl0.M(this.f4089e, false);
        zvf0.A("e_contacts_one_of_groups", c0305a.m14440J(), new j760[]{vwb.Y("group_name", conversation.localExtraInfo), vwb.Y("groupchat_id", ""), vwb.Y("user_group_title", "")});
        xdl0.E0(this, new View.OnClickListener() { // from class: l.w36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21863a.m5994g(c0305a, conversation, virtualVoiceGroupConversationCell, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5991d(this);
    }

    public ConversationAddressBookGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationAddressBookGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
