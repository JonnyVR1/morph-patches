package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CollapsibleConversationConfig;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.newui.messages.ConversationFoldView;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import java.util.Locale;
import p147v.VLinear;
import p149l.c4g0;
import p149l.e30;
import p149l.eqh0;
import p149l.j760;
import p149l.mkd0;
import p149l.p36;
import p149l.u66;
import p149l.upa;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationFoldView extends VLinear {

    /* JADX INFO: renamed from: c */
    public FrameLayout f24717c;

    /* JADX INFO: renamed from: d */
    public TextView f24718d;

    /* JADX INFO: renamed from: e */
    public ImageView f24719e;

    /* JADX INFO: renamed from: f */
    public ConversationWeakenView f24720f;

    /* JADX INFO: renamed from: g */
    public c4g0 f24721g;

    public ConversationFoldView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m40715P(View view) {
        CoreModule.f17545c.f19642f0.m32784Qp();
        ConversationsList.m41421z2();
        zvf0.m220399u("e_old_messages_fold", OMSDialogPositon.p_messages_view, j760.m140076a("fold_type", Integer.valueOf(CoreModule.f17545c.f19642f0.m32905bg() ? 1 : 0)));
    }

    /* JADX INFO: renamed from: R */
    public final void m40717R(View view) {
        u66.m191955a(this, view);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m40718S(p36 p36Var, Conversation conversation) {
        ConversationWeakenView conversationWeakenView = this.f24720f;
        if (conversation == null) {
            xdl0.m208344M(conversationWeakenView, false);
        } else {
            xdl0.m208344M(conversationWeakenView, true);
            this.f24720f.m41323e0(p36Var);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m40719T(Act act, final p36 p36Var) {
        xdl0.m208329E0(this.f24717c, new View.OnClickListener() { // from class: l.s66
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationFoldView.m40715P(view);
            }
        });
        zvf0.m220368A("e_old_messages_fold", OMSDialogPositon.p_messages_view, j760.m140076a("fold_type", Integer.valueOf(CoreModule.f17545c.f19642f0.m32905bg() ? 1 : 0)));
        boolean zM32905bg = CoreModule.f17545c.f19642f0.m32905bg();
        this.f24719e.setImageResource(zM32905bg ? x2c0.f190372mp : x2c0.f190404np);
        boolean z = upa.m194777l().enabled;
        TextView textView = this.f24718d;
        if (z) {
            textView.setText("更多早期消息");
        } else {
            textView.setText(String.format(Locale.CHINESE, "%d日前的消息", Integer.valueOf(upa.m194772k().ignorable_unread_msg_days)));
        }
        this.f24718d.setTypeface(eqh0.m117752c(3), 1);
        CollapsibleConversationConfig collapsibleConversationConfigM194772k = upa.m194772k();
        xdl0.m208344M(this.f24720f, false);
        if (upa.m194777l().enabled || zM32905bg || collapsibleConversationConfigM194772k.ignorable_unread_msg_days != collapsibleConversationConfigM194772k.ignore_msg_days) {
            return;
        }
        mkd0.m154992z(this.f24721g);
        this.f24721g = p36Var.mo67374c(act, CoreModule.f17545c.f19642f0.m32820Ue("fake_conversation_weaken_conversation")).subscribe(mkd0.m154955G(new e30() { // from class: l.t66
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167926a.m40718S(p36Var, (Conversation) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40717R(this);
    }

    public ConversationFoldView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationFoldView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
