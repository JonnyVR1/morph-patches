package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CollapsibleConversationConfig;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.newui.messages.ConversationFoldView;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import java.util.Locale;
import p151v.VLinear;
import p153l.bnl0;
import p153l.dbc0;
import p153l.gra;
import p153l.i4g0;
import p153l.kcg0;
import p153l.lyh0;
import p153l.pf60;
import p153l.psd0;
import p153l.u46;
import p153l.y20;
import p153l.z76;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationFoldView extends VLinear {

    /* JADX INFO: renamed from: c */
    public FrameLayout f25459c;

    /* JADX INFO: renamed from: d */
    public TextView f25460d;

    /* JADX INFO: renamed from: e */
    public ImageView f25461e;

    /* JADX INFO: renamed from: f */
    public ConversationWeakenView f25462f;

    /* JADX INFO: renamed from: g */
    public kcg0 f25463g;

    public ConversationFoldView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m41726P(View view) {
        CoreModule.f18264c.f20384f0.m33787Qp();
        ConversationsList.m42432z2();
        i4g0.m138523u("e_old_messages_fold", OMSDialogPositon.p_messages_view, pf60.m172085a("fold_type", Integer.valueOf(CoreModule.f18264c.f20384f0.m33908bg() ? 1 : 0)));
    }

    /* JADX INFO: renamed from: R */
    public final void m41728R(View view) {
        z76.m218865a(this, view);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m41729S(u46 u46Var, Conversation conversation) {
        ConversationWeakenView conversationWeakenView = this.f25462f;
        if (conversation == null) {
            bnl0.m105524M(conversationWeakenView, false);
        } else {
            bnl0.m105524M(conversationWeakenView, true);
            this.f25462f.m42334e0(u46Var);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m41730T(Act act, final u46 u46Var) {
        bnl0.m105509E0(this.f25459c, new View.OnClickListener() { // from class: l.x76
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationFoldView.m41726P(view);
            }
        });
        i4g0.m138492A("e_old_messages_fold", OMSDialogPositon.p_messages_view, pf60.m172085a("fold_type", Integer.valueOf(CoreModule.f18264c.f20384f0.m33908bg() ? 1 : 0)));
        boolean zM33908bg = CoreModule.f18264c.f20384f0.m33908bg();
        this.f25461e.setImageResource(zM33908bg ? dbc0.f86835aq : dbc0.f86868bq);
        boolean z = gra.m131708l().enabled;
        TextView textView = this.f25460d;
        if (z) {
            textView.setText("更多早期消息");
        } else {
            textView.setText(String.format(Locale.CHINESE, "%d日前的消息", Integer.valueOf(gra.m131703k().ignorable_unread_msg_days)));
        }
        this.f25460d.setTypeface(lyh0.m156283c(3), 1);
        CollapsibleConversationConfig collapsibleConversationConfigM131703k = gra.m131703k();
        bnl0.m105524M(this.f25462f, false);
        if (gra.m131708l().enabled || zM33908bg || collapsibleConversationConfigM131703k.ignorable_unread_msg_days != collapsibleConversationConfigM131703k.ignore_msg_days) {
            return;
        }
        psd0.m173633z(this.f25463g);
        this.f25463g = u46Var.mo68557c(act, CoreModule.f18264c.f20384f0.m33823Ue("fake_conversation_weaken_conversation")).subscribe(psd0.m173596G(new y20() { // from class: l.y76
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197741a.m41729S(u46Var, (Conversation) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41728R(this);
    }

    public ConversationFoldView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationFoldView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
