package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VCheckBox;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.jic0;
import p153l.psd0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class ShareMessageToFriendListItemView extends VLinear implements View.OnClickListener {

    /* JADX INFO: renamed from: c */
    public VDraweeView f26036c;

    /* JADX INFO: renamed from: d */
    public VText f26037d;

    /* JADX INFO: renamed from: e */
    public VCheckBox f26038e;

    /* JADX INFO: renamed from: f */
    public Conversation f26039f;

    /* JADX INFO: renamed from: g */
    public InterfaceC8289a f26040g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ShareMessageToFriendListItemView$a */
    public interface InterfaceC8289a {
        /* JADX INFO: renamed from: b */
        void mo42829b();

        /* JADX INFO: renamed from: s */
        boolean mo42830s(String str);

        /* JADX INFO: renamed from: w */
        void mo42831w(Conversation conversation, boolean z);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ShareMessageToFriendListItemView$b */
    public static class C8290b {
        /* JADX INFO: renamed from: b */
        public static void m42833b(ShareMessageToFriendListItemView shareMessageToFriendListItemView, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            shareMessageToFriendListItemView.f26036c = (VDraweeView) viewGroup.getChildAt(0);
            shareMessageToFriendListItemView.f26037d = (VText) viewGroup.getChildAt(1);
            shareMessageToFriendListItemView.f26038e = (VCheckBox) viewGroup.getChildAt(2);
        }
    }

    public ShareMessageToFriendListItemView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m42825X(User user) {
        this.f26037d.setText(user.name);
        uqb0.f180374G.m127125Q0(this.f26036c, user.picture(0).profileSmall());
    }

    /* JADX INFO: renamed from: V */
    public final void m42826V(View view) {
        C8290b.m42833b(this, view);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m42827W(CompoundButton compoundButton, boolean z) {
        if (NullChecker.m82486a(this.f26040g) && NullChecker.m82486a(this.f26039f)) {
            if (!z || this.f26040g.mo42830s(this.f26039f.f56859id)) {
                this.f26040g.mo42831w(this.f26039f, z);
            } else {
                compoundButton.setChecked(false);
                this.f26040g.mo42829b();
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m42828Y(Act act, jic0<Conversation> jic0Var, Conversation conversation, boolean z) {
        this.f26039f = conversation;
        jic0Var.mo68557c(act, CoreModule.f18264c.f20381e0.m116483Ka(conversation.otherUser)).subscribe(psd0.m173596G(new y20() { // from class: l.m2f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134571a.m42825X((User) obj);
            }
        }));
        this.f26038e.setChecked(z);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        VCheckBox vCheckBox = this.f26038e;
        vCheckBox.setChecked(!vCheckBox.isChecked());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42826V(this);
        this.f26038e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.l2f0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f129768a.m42827W(compoundButton, z);
            }
        });
        setOnClickListener(this);
    }

    public void setOnSelectChangeListener(InterfaceC8289a interfaceC8289a) {
        this.f26040g = interfaceC8289a;
    }

    public ShareMessageToFriendListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShareMessageToFriendListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
