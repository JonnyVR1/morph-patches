package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.GroupInvitation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageAdditionalData;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.a1c0;
import l.c3c0;
import l.knb0;
import l.lsi0;
import l.o6j0;
import l.qib0;
import l.ura;
import l.vwb;
import l.xdl0;
import p003l.tbk;
import p028v.VDraweeView;
import p028v.VLinear;
import p028v.VRelative;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemGroupInviteMessage extends VRelative implements InterfaceC0102a {

    /* JADX INFO: renamed from: d */
    public ItemGroupInviteMessage f864d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f865e;

    /* JADX INFO: renamed from: f */
    public VText f866f;

    /* JADX INFO: renamed from: g */
    public VText f867g;

    /* JADX INFO: renamed from: h */
    public VLinear f868h;

    /* JADX INFO: renamed from: i */
    public VText f869i;

    /* JADX INFO: renamed from: j */
    public boolean f870j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemGroupInviteMessage$a */
    public static class C0071a {
        /* JADX INFO: renamed from: b */
        public static void m1266b(ItemGroupInviteMessage itemGroupInviteMessage, View view) {
            itemGroupInviteMessage.f864d = (ItemGroupInviteMessage) view;
            ViewGroup viewGroup = (ViewGroup) view;
            itemGroupInviteMessage.f865e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
            itemGroupInviteMessage.f866f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
            itemGroupInviteMessage.f867g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
            itemGroupInviteMessage.f868h = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            itemGroupInviteMessage.f869i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        }
    }

    public ItemGroupInviteMessage(Context context) {
        super(context);
        this.f870j = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m1259P(Message message, View view) {
        m1264O(message);
    }

    private Act act() {
        return getContext();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(final Message message) {
        GroupInvitation groupInvitation;
        MessageAdditionalData messageAdditionalData = message.additionalData;
        if (messageAdditionalData == null || (groupInvitation = messageAdditionalData.groupInvitation) == null) {
            return;
        }
        CharSequence charSequence = groupInvitation.button.title;
        if (TextUtils.isEmpty(charSequence) || TextUtils.equals(message.owner, CoreModule.H().userId())) {
            xdl0.M(this.f868h, false);
        } else {
            xdl0.M(this.f868h, true);
            this.f869i.setText(charSequence);
            xdl0.E0(this.f864d, new View.OnClickListener() { // from class: l.j4q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f4572a.m1259P(message, view);
                }
            });
            String str = message.additionalData.groupInvitation.target.id;
            if (!this.f870j) {
                o6j0.h("e_group_chat_invite_card", getContext().pageId(), new o6j0.a[]{o6j0.a.h("groupchat_id", str)});
                this.f870j = true;
            }
        }
        this.f866f.setText(message.additionalData.groupInvitation.title);
        this.f867g.setText(message.additionalData.groupInvitation.subTitle);
        if (vwb.J(message.media)) {
            this.f865e.setImageResource(c3c0.b);
            return;
        }
        Picture pictureCover = ((Media) message.media.get(0)).cover();
        if (NullChecker.a(pictureCover)) {
            qib0.G.Q0(this.f865e, pictureCover.profileSmall());
        } else {
            this.f865e.setImageResource(c3c0.b);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: M */
    public final void m1263M(View view) {
        C0071a.m1266b(this, view);
    }

    /* JADX INFO: renamed from: O */
    public final void m1264O(Message message) {
        GroupInvitation groupInvitation;
        MessageAdditionalData messageAdditionalData = message.additionalData;
        if (messageAdditionalData == null || (groupInvitation = messageAdditionalData.groupInvitation) == null || !TextUtils.equals(groupInvitation.target.type, "chatGroups")) {
            return;
        }
        String str = message.additionalData.groupInvitation.target.id;
        o6j0.c("e_group_chat_invite_card", getContext().pageId(), new o6j0.a[]{o6j0.a.h("groupchat_id", str)});
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (CoreModule.K().me_().isBanned()) {
            lsi0.w(R.string.H0);
        } else {
            tbk.m7726t(act(), str, "", "invitation");
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1263M(this);
        this.f866f.getPaint().setFakeBoldText(true);
        this.f869i.getPaint().setFakeBoldText(true);
        if (ura.e().d().I4()) {
            this.f866f.setTextColor(getResources().getColor(a1c0.g));
            this.f867g.setTextColor(getResources().getColor(a1c0.i));
            this.f869i.setTextColor(getResources().getColor(a1c0.j));
        }
    }

    public ItemGroupInviteMessage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f870j = false;
    }

    public ItemGroupInviteMessage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f870j = false;
    }
}
