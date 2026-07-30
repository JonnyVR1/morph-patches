package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.dac0;
import l.e30;
import l.mkd0;
import l.qib0;
import v.VCheckBox;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ShareMessageToFriendListItemView extends VLinear implements View.OnClickListener {

    /* JADX INFO: renamed from: c */
    public VDraweeView f4072c;

    /* JADX INFO: renamed from: d */
    public VText f4073d;

    /* JADX INFO: renamed from: e */
    public VCheckBox f4074e;

    /* JADX INFO: renamed from: f */
    public Conversation f4075f;

    /* JADX INFO: renamed from: g */
    public InterfaceC0302a f4076g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ShareMessageToFriendListItemView$a */
    public interface InterfaceC0302a {
        /* JADX INFO: renamed from: b */
        void mo5944b();

        /* JADX INFO: renamed from: s */
        boolean mo5945s(String str);

        /* JADX INFO: renamed from: w */
        void mo5946w(Conversation conversation, boolean z);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ShareMessageToFriendListItemView$b */
    public static class C0303b {
        /* JADX INFO: renamed from: b */
        public static void m5948b(ShareMessageToFriendListItemView shareMessageToFriendListItemView, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            shareMessageToFriendListItemView.f4072c = viewGroup.getChildAt(0);
            shareMessageToFriendListItemView.f4073d = viewGroup.getChildAt(1);
            shareMessageToFriendListItemView.f4074e = viewGroup.getChildAt(2);
        }
    }

    public ShareMessageToFriendListItemView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m5940X(User user) {
        this.f4073d.setText(user.name);
        qib0.G.Q0(this.f4072c, user.picture(0).profileSmall());
    }

    /* JADX INFO: renamed from: V */
    public final void m5941V(View view) {
        C0303b.m5948b(this, view);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m5942W(CompoundButton compoundButton, boolean z) {
        if (NullChecker.a(this.f4076g) && NullChecker.a(this.f4075f)) {
            if (!z || this.f4076g.mo5945s(((DbObject) this.f4075f).id)) {
                this.f4076g.mo5946w(this.f4075f, z);
            } else {
                compoundButton.setChecked(false);
                this.f4076g.mo5944b();
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m5943Y(Act act, dac0<Conversation> dac0Var, Conversation conversation, boolean z) {
        this.f4075f = conversation;
        dac0Var.c(act, CoreModule.c.e0.Ka(conversation.otherUser)).subscribe(mkd0.G(new e30() { // from class: l.fue0
            public final void call(Object obj) {
                this.f13171a.m5940X((User) obj);
            }
        }));
        this.f4074e.setChecked(z);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        VCheckBox vCheckBox = this.f4074e;
        vCheckBox.setChecked(!vCheckBox.isChecked());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5941V(this);
        this.f4074e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.eue0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f12690a.m5942W(compoundButton, z);
            }
        });
        setOnClickListener(this);
    }

    public void setOnSelectChangeListener(InterfaceC0302a interfaceC0302a) {
        this.f4076g = interfaceC0302a;
    }

    public ShareMessageToFriendListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShareMessageToFriendListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
