package com.p051p1.mobile.putong.core.newui.messages.addressbook;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationAdditional;
import com.p051p1.mobile.putong.core.data.ConversationType;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.VirtualVoiceGroupConversationCell;
import com.p051p1.mobile.putong.p070ui.MultipleChatIconView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.e56;
import p153l.gra;
import p153l.i46;
import p153l.i4g0;
import p153l.jyb;
import p153l.psd0;
import p153l.th0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationAddressBookGroupView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VFrame f26049a;

    /* JADX INFO: renamed from: b */
    public MultipleChatIconView f26050b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f26051c;

    /* JADX INFO: renamed from: d */
    public VText f26052d;

    /* JADX INFO: renamed from: e */
    public VText f26053e;

    /* JADX INFO: renamed from: f */
    public VText f26054f;

    public ConversationAddressBookGroupView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m42871d(View view) {
        e56.m119506a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m42872e(ConversationAddressBookGroupFrag.C8292a c8292a, ChatGroup chatGroup, String[] strArr, Conversation conversation, View view) {
        if (gra.m131614P2()) {
            i46.m138395c().m138396a();
            i46.m138395c().f112834a.onNext(null);
        }
        i4g0.m138523u("e_contacts_one_of_groups", c8292a.m158457J(), jyb.m147494Y("group_name", chatGroup.name), jyb.m147494Y("groupchat_id", chatGroup.f56859id), jyb.m147494Y("user_group_title", strArr[0]));
        getContext().startActivity(MessagesAct.m50115N2(getContext(), conversation.f56859id, false, false, 29, "", false));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m42873f(final ConversationAddressBookGroupFrag.C8292a c8292a, final Conversation conversation, final ChatGroup chatGroup) {
        this.f26052d.setText(chatGroup.name);
        this.f26052d.setEllipsize(TextUtils.TruncateAt.END);
        this.f26052d.setSingleLine();
        this.f26052d.getPaint().setFakeBoldText(true);
        this.f26054f.setText(chatGroup.description);
        if (jyb.m147479J(chatGroup.avatars)) {
            uqb0.f180374G.m127138Y0(this.f26051c, dbc0.f87210m8);
        } else {
            uqb0.f180374G.m127140Z0(this.f26051c, chatGroup.avatars.get(0).cover().profileSmall().formatted());
        }
        String strUserId = CoreModule.m30929H().userId();
        final String[] strArr = new String[1];
        if (TextUtils.equals(chatGroup.ownerUserId, strUserId)) {
            this.f26053e.setText("群主");
            strArr[0] = "1";
            bnl0.m105524M(this.f26053e, true);
        } else if (jyb.m147479J(chatGroup.adminUserIds) || !chatGroup.adminUserIds.contains(strUserId)) {
            strArr[0] = "0";
            bnl0.m105524M(this.f26053e, false);
        } else {
            this.f26053e.setText("管理员");
            strArr[0] = "2";
            bnl0.m105524M(this.f26053e, true);
        }
        i4g0.m138492A("e_contacts_one_of_groups", c8292a.m158457J(), jyb.m147494Y("group_name", chatGroup.name), jyb.m147494Y("groupchat_id", chatGroup.f56859id), jyb.m147494Y("user_group_title", strArr[0]));
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.d56
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85121a.m42872e(c8292a, chatGroup, strArr, conversation, view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m42874g(ConversationAddressBookGroupFrag.C8292a c8292a, Conversation conversation, VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, View view) {
        i4g0.m138523u("e_contacts_one_of_groups", c8292a.m158457J(), jyb.m147494Y("group_name", conversation.localExtraInfo), jyb.m147494Y("groupchat_id", ""), jyb.m147494Y("user_group_title", ""));
        if (virtualVoiceGroupConversationCell.cellInfo.isDissolved) {
            new th0.C20312a(getContext()).m191151j(virtualVoiceGroupConversationCell.cellInfo.dissolveReason).m191159r("确认").m191142a().m191141g();
        } else {
            CoreModule.m30934Q().mo68412M6().mo127345p(getContext(), virtualVoiceGroupConversationCell.roomInfo.liveId, "default", "", null);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m42875h(ConversationAddressBookGroupFrag.C8292a c8292a, Conversation conversation) {
        if (TextUtils.equals(conversation.convType, ConversationType.virtualvoice)) {
            m42877j(c8292a, conversation);
        } else {
            m42876i(c8292a, conversation);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m42876i(final ConversationAddressBookGroupFrag.C8292a c8292a, final Conversation conversation) {
        bnl0.m105524M(this.f26050b, false);
        bnl0.m105524M(this.f26051c, true);
        c8292a.mo68557c((Act) getContext(), CoreModule.f18264c.f20387g0.m32911o6(conversation.otherUser)).subscribe(psd0.m173596G(new y20() { // from class: l.c56
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79797a.m42873f(c8292a, conversation, (ChatGroup) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public final void m42877j(final ConversationAddressBookGroupFrag.C8292a c8292a, final Conversation conversation) {
        ConversationAdditional conversationAdditional;
        final VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell;
        if (conversation == null || (conversationAdditional = conversation.additional) == null || (virtualVoiceGroupConversationCell = conversationAdditional.liveVirtualVoice) == null) {
            return;
        }
        this.f26052d.setText(conversation.localExtraInfo);
        this.f26052d.getPaint().setFakeBoldText(true);
        this.f26054f.setText((!NullChecker.m82486a(virtualVoiceGroupConversationCell.chatInfo) || TextUtils.isEmpty(virtualVoiceGroupConversationCell.chatInfo.commonMsg)) ? "" : virtualVoiceGroupConversationCell.chatInfo.commonMsg);
        this.f26050b.setRadius(55.0f);
        this.f26050b.m80580p0(virtualVoiceGroupConversationCell.roomInfo.avatars, false);
        bnl0.m105524M(this.f26050b, true);
        bnl0.m105524M(this.f26051c, false);
        bnl0.m105524M(this.f26053e, false);
        i4g0.m138492A("e_contacts_one_of_groups", c8292a.m158457J(), jyb.m147494Y("group_name", conversation.localExtraInfo), jyb.m147494Y("groupchat_id", ""), jyb.m147494Y("user_group_title", ""));
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.b56
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75024a.m42874g(c8292a, conversation, virtualVoiceGroupConversationCell, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42871d(this);
    }

    public ConversationAddressBookGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationAddressBookGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
