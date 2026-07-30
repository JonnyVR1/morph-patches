package com.p046p1.mobile.putong.core.newui.messages.addressbook;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationAdditional;
import com.p046p1.mobile.putong.core.data.ConversationType;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.VirtualVoiceGroupConversationCell;
import com.p046p1.mobile.putong.p065ui.MultipleChatIconView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;
import p149l.d36;
import p149l.e30;
import p149l.mkd0;
import p149l.qib0;
import p149l.upa;
import p149l.vwb;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xh0;
import p149l.z36;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationAddressBookGroupView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VFrame f25307a;

    /* JADX INFO: renamed from: b */
    public MultipleChatIconView f25308b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f25309c;

    /* JADX INFO: renamed from: d */
    public VText f25310d;

    /* JADX INFO: renamed from: e */
    public VText f25311e;

    /* JADX INFO: renamed from: f */
    public VText f25312f;

    public ConversationAddressBookGroupView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m41860d(View view) {
        z36.m217019a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m41861e(ConversationAddressBookGroupFrag.C8141a c8141a, ChatGroup chatGroup, String[] strArr, Conversation conversation, View view) {
        if (upa.m194683P2()) {
            d36.m109868c().m109869a();
            d36.m109868c().f83463a.onNext(null);
        }
        zvf0.m220399u("e_contacts_one_of_groups", c8141a.m121485J(), vwb.m200311Y("group_name", chatGroup.name), vwb.m200311Y("groupchat_id", chatGroup.f56011id), vwb.m200311Y("user_group_title", strArr[0]));
        getContext().startActivity(MessagesAct.m48932M2(getContext(), conversation.f56011id, false, false, 29, "", false));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m41862f(final ConversationAddressBookGroupFrag.C8141a c8141a, final Conversation conversation, final ChatGroup chatGroup) {
        this.f25310d.setText(chatGroup.name);
        this.f25310d.setEllipsize(TextUtils.TruncateAt.END);
        this.f25310d.setSingleLine();
        this.f25310d.getPaint().setFakeBoldText(true);
        this.f25312f.setText(chatGroup.description);
        if (vwb.m200296J(chatGroup.avatars)) {
            qib0.f154691G.m102354Y0(this.f25309c, x2c0.f190323l8);
        } else {
            qib0.f154691G.m102356Z0(this.f25309c, chatGroup.avatars.get(0).cover().profileSmall().formatted());
        }
        String strUserId = CoreModule.m29931H().userId();
        final String[] strArr = new String[1];
        if (TextUtils.equals(chatGroup.ownerUserId, strUserId)) {
            this.f25311e.setText("群主");
            strArr[0] = "1";
            xdl0.m208344M(this.f25311e, true);
        } else if (vwb.m200296J(chatGroup.adminUserIds) || !chatGroup.adminUserIds.contains(strUserId)) {
            strArr[0] = "0";
            xdl0.m208344M(this.f25311e, false);
        } else {
            this.f25311e.setText("管理员");
            strArr[0] = "2";
            xdl0.m208344M(this.f25311e, true);
        }
        zvf0.m220368A("e_contacts_one_of_groups", c8141a.m121485J(), vwb.m200311Y("group_name", chatGroup.name), vwb.m200311Y("groupchat_id", chatGroup.f56011id), vwb.m200311Y("user_group_title", strArr[0]));
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.y36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195757a.m41861e(c8141a, chatGroup, strArr, conversation, view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m41863g(ConversationAddressBookGroupFrag.C8141a c8141a, Conversation conversation, VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, View view) {
        zvf0.m220399u("e_contacts_one_of_groups", c8141a.m121485J(), vwb.m200311Y("group_name", conversation.localExtraInfo), vwb.m200311Y("groupchat_id", ""), vwb.m200311Y("user_group_title", ""));
        if (virtualVoiceGroupConversationCell.cellInfo.isDissolved) {
            new xh0.C21150a(getContext()).m208731j(virtualVoiceGroupConversationCell.cellInfo.dissolveReason).m208739r("确认").m208722a().m208721g();
        } else {
            CoreModule.m29936Q().mo67229M6().mo102431p(getContext(), virtualVoiceGroupConversationCell.roomInfo.liveId, "default", "", null);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m41864h(ConversationAddressBookGroupFrag.C8141a c8141a, Conversation conversation) {
        if (TextUtils.equals(conversation.convType, ConversationType.virtualvoice)) {
            m41866j(c8141a, conversation);
        } else {
            m41865i(c8141a, conversation);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m41865i(final ConversationAddressBookGroupFrag.C8141a c8141a, final Conversation conversation) {
        xdl0.m208344M(this.f25308b, false);
        xdl0.m208344M(this.f25309c, true);
        c8141a.mo67374c((Act) getContext(), CoreModule.f17545c.f19645g0.m31908o6(conversation.otherUser)).subscribe(mkd0.m154955G(new e30() { // from class: l.x36
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f190864a.m41862f(c8141a, conversation, (ChatGroup) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public final void m41866j(final ConversationAddressBookGroupFrag.C8141a c8141a, final Conversation conversation) {
        ConversationAdditional conversationAdditional;
        final VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell;
        if (conversation == null || (conversationAdditional = conversation.additional) == null || (virtualVoiceGroupConversationCell = conversationAdditional.liveVirtualVoice) == null) {
            return;
        }
        this.f25310d.setText(conversation.localExtraInfo);
        this.f25310d.getPaint().setFakeBoldText(true);
        this.f25312f.setText((!NullChecker.m81303a(virtualVoiceGroupConversationCell.chatInfo) || TextUtils.isEmpty(virtualVoiceGroupConversationCell.chatInfo.commonMsg)) ? "" : virtualVoiceGroupConversationCell.chatInfo.commonMsg);
        this.f25308b.setRadius(55.0f);
        this.f25308b.m79397p0(virtualVoiceGroupConversationCell.roomInfo.avatars, false);
        xdl0.m208344M(this.f25308b, true);
        xdl0.m208344M(this.f25309c, false);
        xdl0.m208344M(this.f25311e, false);
        zvf0.m220368A("e_contacts_one_of_groups", c8141a.m121485J(), vwb.m200311Y("group_name", conversation.localExtraInfo), vwb.m200311Y("groupchat_id", ""), vwb.m200311Y("user_group_title", ""));
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.w36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184307a.m41863g(c8141a, conversation, virtualVoiceGroupConversationCell, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41860d(this);
    }

    public ConversationAddressBookGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationAddressBookGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
