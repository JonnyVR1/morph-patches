package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.newui.messages.ConversationFoldView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CollapsibleConversationConfig;
import com.p1.mobile.putong.core.data.Conversation;
import java.util.Locale;
import l.c4g0;
import l.e30;
import l.eqh0;
import l.j760;
import l.mkd0;
import l.u66;
import l.upa;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import p009l.p36;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationFoldView extends VLinear {

    /* JADX INFO: renamed from: c */
    public FrameLayout f3495c;

    /* JADX INFO: renamed from: d */
    public TextView f3496d;

    /* JADX INFO: renamed from: e */
    public ImageView f3497e;

    /* JADX INFO: renamed from: f */
    public ConversationWeakenView f3498f;

    /* JADX INFO: renamed from: g */
    public c4g0 f3499g;

    public ConversationFoldView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m4810P(View view) {
        CoreModule.c.f0.Qp();
        ConversationsList.m5527z2();
        zvf0.u("e_old_messages_fold", "p_messages_view", new j760[]{j760.a("fold_type", Integer.valueOf(CoreModule.c.f0.bg() ? 1 : 0))});
    }

    /* JADX INFO: renamed from: R */
    public final void m4812R(View view) {
        u66.a(this, view);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m4813S(p36 p36Var, Conversation conversation) {
        VLinear vLinear = this.f3498f;
        if (conversation == null) {
            xdl0.M(vLinear, false);
        } else {
            xdl0.M(vLinear, true);
            this.f3498f.m5429e0(p36Var);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m4814T(Act act, final p36 p36Var) {
        xdl0.E0(this.f3495c, new View.OnClickListener() { // from class: l.s66
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationFoldView.m4810P(view);
            }
        });
        zvf0.A("e_old_messages_fold", "p_messages_view", new j760[]{j760.a("fold_type", Integer.valueOf(CoreModule.c.f0.bg() ? 1 : 0))});
        boolean zBg = CoreModule.c.f0.bg();
        this.f3497e.setImageResource(zBg ? x2c0.mp : x2c0.np);
        boolean z = upa.l().enabled;
        TextView textView = this.f3496d;
        if (z) {
            textView.setText("更多早期消息");
        } else {
            textView.setText(String.format(Locale.CHINESE, "%d日前的消息", Integer.valueOf(upa.k().ignorable_unread_msg_days)));
        }
        this.f3496d.setTypeface(eqh0.c(3), 1);
        CollapsibleConversationConfig collapsibleConversationConfigK = upa.k();
        xdl0.M(this.f3498f, false);
        if (upa.l().enabled || zBg || collapsibleConversationConfigK.ignorable_unread_msg_days != collapsibleConversationConfigK.ignore_msg_days) {
            return;
        }
        mkd0.z(this.f3499g);
        this.f3499g = p36Var.c(act, CoreModule.c.f0.Ue("fake_conversation_weaken_conversation")).subscribe(mkd0.G(new e30() { // from class: l.t66
            public final void call(Object obj) {
                this.f20567a.m4813S(p36Var, (Conversation) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m4812R(this);
    }

    public ConversationFoldView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationFoldView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
