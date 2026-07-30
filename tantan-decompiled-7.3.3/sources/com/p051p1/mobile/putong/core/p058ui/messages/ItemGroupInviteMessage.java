package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.GroupInvitation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAdditionalData;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.ibc0;
import p153l.jek;
import p153l.jyb;
import p153l.o1j0;
import p153l.ovb0;
import p153l.sfj0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemGroupInviteMessage extends VRelative implements InterfaceC8682a {

    /* JADX INFO: renamed from: d */
    public ItemGroupInviteMessage f31821d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f31822e;

    /* JADX INFO: renamed from: f */
    public VText f31823f;

    /* JADX INFO: renamed from: g */
    public VText f31824g;

    /* JADX INFO: renamed from: h */
    public VLinear f31825h;

    /* JADX INFO: renamed from: i */
    public VText f31826i;

    /* JADX INFO: renamed from: j */
    public boolean f31827j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemGroupInviteMessage$a */
    public static class C8651a {
        /* JADX INFO: renamed from: b */
        public static void m49369b(ItemGroupInviteMessage itemGroupInviteMessage, View view) {
            itemGroupInviteMessage.f31821d = (ItemGroupInviteMessage) view;
            ViewGroup viewGroup = (ViewGroup) view;
            itemGroupInviteMessage.f31822e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
            itemGroupInviteMessage.f31823f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
            itemGroupInviteMessage.f31824g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
            itemGroupInviteMessage.f31825h = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            itemGroupInviteMessage.f31826i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        }
    }

    public ItemGroupInviteMessage(Context context) {
        super(context);
        this.f31827j = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m49362P(Message message, View view) {
        m49367O(message);
    }

    private Act act() {
        return (Act) getContext();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(final Message message) {
        GroupInvitation groupInvitation;
        MessageAdditionalData messageAdditionalData = message.additionalData;
        if (messageAdditionalData == null || (groupInvitation = messageAdditionalData.groupInvitation) == null) {
            return;
        }
        String str = groupInvitation.button.title;
        if (TextUtils.isEmpty(str) || TextUtils.equals(message.owner, CoreModule.m30929H().userId())) {
            bnl0.m105524M(this.f31825h, false);
        } else {
            bnl0.m105524M(this.f31825h, true);
            this.f31826i.setText(str);
            bnl0.m105509E0(this.f31821d, new View.OnClickListener() { // from class: l.j6q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f118590a.m49362P(message, view);
                }
            });
            String str2 = message.additionalData.groupInvitation.target.f21262id;
            if (!this.f31827j) {
                sfj0.m185601h("e_group_chat_invite_card", ((Act) getContext()).pageId(), sfj0.C20032a.m185615h("groupchat_id", str2));
                this.f31827j = true;
            }
        }
        this.f31823f.setText(message.additionalData.groupInvitation.title);
        this.f31824g.setText(message.additionalData.groupInvitation.subTitle);
        if (jyb.m147479J(message.media)) {
            this.f31822e.setImageResource(ibc0.f113976b);
            return;
        }
        Picture pictureCover = message.media.get(0).cover();
        if (NullChecker.m82486a(pictureCover)) {
            uqb0.f180374G.m127125Q0(this.f31822e, pictureCover.profileSmall());
        } else {
            this.f31822e.setImageResource(ibc0.f113976b);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: M */
    public final void m49366M(View view) {
        C8651a.m49369b(this, view);
    }

    /* JADX INFO: renamed from: O */
    public final void m49367O(Message message) {
        GroupInvitation groupInvitation;
        MessageAdditionalData messageAdditionalData = message.additionalData;
        if (messageAdditionalData == null || (groupInvitation = messageAdditionalData.groupInvitation) == null || !TextUtils.equals(groupInvitation.target.type, "chatGroups")) {
            return;
        }
        String str = message.additionalData.groupInvitation.target.f21262id;
        sfj0.m185596c("e_group_chat_invite_card", ((Act) getContext()).pageId(), sfj0.C20032a.m185615h("groupchat_id", str));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (CoreModule.m30930K().me_().isBanned()) {
            o1j0.m165649w(R$string.f21507H0);
        } else {
            jek.m144588t(act(), str, "", "invitation");
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49366M(this);
        this.f31823f.getPaint().setFakeBoldText(true);
        this.f31826i.getPaint().setFakeBoldText(true);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f31823f.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f31824g.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f31826i.setTextColor(getResources().getColor(g9c0.f102820j));
        }
    }

    public ItemGroupInviteMessage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31827j = false;
    }

    public ItemGroupInviteMessage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31827j = false;
    }
}
