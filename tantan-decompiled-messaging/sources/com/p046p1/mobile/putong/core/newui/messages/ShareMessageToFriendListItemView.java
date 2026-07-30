package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VCheckBox;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.dac0;
import p149l.e30;
import p149l.mkd0;
import p149l.qib0;

/* JADX INFO: loaded from: classes11.dex */
public class ShareMessageToFriendListItemView extends VLinear implements View.OnClickListener {

    /* JADX INFO: renamed from: c */
    public VDraweeView f25294c;

    /* JADX INFO: renamed from: d */
    public VText f25295d;

    /* JADX INFO: renamed from: e */
    public VCheckBox f25296e;

    /* JADX INFO: renamed from: f */
    public Conversation f25297f;

    /* JADX INFO: renamed from: g */
    public InterfaceC8138a f25298g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ShareMessageToFriendListItemView$a */
    public interface InterfaceC8138a {
        /* JADX INFO: renamed from: b */
        void mo41818b();

        /* JADX INFO: renamed from: s */
        boolean mo41819s(String str);

        /* JADX INFO: renamed from: w */
        void mo41820w(Conversation conversation, boolean z);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ShareMessageToFriendListItemView$b */
    public static class C8139b {
        /* JADX INFO: renamed from: b */
        public static void m41822b(ShareMessageToFriendListItemView shareMessageToFriendListItemView, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            shareMessageToFriendListItemView.f25294c = (VDraweeView) viewGroup.getChildAt(0);
            shareMessageToFriendListItemView.f25295d = (VText) viewGroup.getChildAt(1);
            shareMessageToFriendListItemView.f25296e = (VCheckBox) viewGroup.getChildAt(2);
        }
    }

    public ShareMessageToFriendListItemView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m41814X(User user) {
        this.f25295d.setText(user.name);
        qib0.f154691G.m102341Q0(this.f25294c, user.picture(0).profileSmall());
    }

    /* JADX INFO: renamed from: V */
    public final void m41815V(View view) {
        C8139b.m41822b(this, view);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m41816W(CompoundButton compoundButton, boolean z) {
        if (NullChecker.m81303a(this.f25298g) && NullChecker.m81303a(this.f25297f)) {
            if (!z || this.f25298g.mo41819s(this.f25297f.f56011id)) {
                this.f25298g.mo41820w(this.f25297f, z);
            } else {
                compoundButton.setChecked(false);
                this.f25298g.mo41818b();
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m41817Y(Act act, dac0<Conversation> dac0Var, Conversation conversation, boolean z) {
        this.f25297f = conversation;
        dac0Var.mo67374c(act, CoreModule.f17545c.f19639e0.m169410Ka(conversation.otherUser)).subscribe(mkd0.m154955G(new e30() { // from class: l.fue0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99338a.m41814X((User) obj);
            }
        }));
        this.f25296e.setChecked(z);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        VCheckBox vCheckBox = this.f25296e;
        vCheckBox.setChecked(!vCheckBox.isChecked());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41815V(this);
        this.f25296e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.eue0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f93235a.m41816W(compoundButton, z);
            }
        });
        setOnClickListener(this);
    }

    public void setOnSelectChangeListener(InterfaceC8138a interfaceC8138a) {
        this.f25298g = interfaceC8138a;
    }

    public ShareMessageToFriendListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShareMessageToFriendListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
