package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationAdditional;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.VoiceCallAdditional;
import com.p051p1.mobile.putong.core.data.VoiceCallInvitationStatus;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import p151v.VButton;
import p153l.avm0;
import p153l.bnl0;
import p153l.edc0;
import p153l.g9c0;
import p153l.gta;
import p153l.ibc0;
import p153l.lyh0;
import p153l.qa00;
import p153l.qzm0;
import p153l.sfj0;
import p153l.x6q;
import p153l.xzm0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemVoiceCallInvitation extends FrameLayout implements x6q {

    /* JADX INFO: renamed from: a */
    public TextView f32388a;

    /* JADX INFO: renamed from: b */
    public TextView f32389b;

    /* JADX INFO: renamed from: c */
    public TextView f32390c;

    /* JADX INFO: renamed from: d */
    public View f32391d;

    /* JADX INFO: renamed from: e */
    public ImageView f32392e;

    /* JADX INFO: renamed from: f */
    public TextView f32393f;

    /* JADX INFO: renamed from: g */
    public VButton f32394g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f32395h;

    /* JADX INFO: renamed from: i */
    public View f32396i;

    /* JADX INFO: renamed from: j */
    public Message f32397j;

    public ItemVoiceCallInvitation(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m49954e(int i) {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m49955f(Message message) {
        if (TextUtils.isEmpty(message.msgData)) {
            return false;
        }
        try {
            VoiceCallInvitationStatus voiceCallInvitationStatus = VoiceCallInvitationStatus.JSON_ADAPTER.parse(message.msgData);
            return voiceCallInvitationStatus != null && TextUtils.equals(voiceCallInvitationStatus.status, "accepted");
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m49956g(Message message, View view) {
        sfj0.m185596c("e_voice_call_received_message", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("voice_call_reminder_character", "applicant"));
        m49963n(message.cid);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m49957h(Message message, View view) {
        sfj0.m185596c("e_voice_call_received_message", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("voice_call_reminder_character", "receiver"));
        m49963n(message.cid);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m49958i(Message message, View view) {
        sfj0.m185596c("e_voice_call_application_receiver_pop_ups_reject", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("moments_user_id", message.cid), sfj0.C20032a.m185615h("voice_call_receiver_user_id", CoreModule.m30929H().userId()));
        m49962m(true, message.cid, message);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m49959j(Message message, View view) {
        sfj0.m185596c("e_voice_call_application_receiver_approve", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("moments_user_id", message.cid), sfj0.C20032a.m185615h("voice_call_receiver_user_id", CoreModule.m30929H().userId()));
        m49962m(false, message.cid, message);
    }

    /* JADX INFO: renamed from: k */
    public void m49960k(Message message) {
        long j;
        long j2;
        VoiceCallAdditional voiceCallAdditional;
        long j3;
        this.f32397j = message;
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(message.cid);
        if (conversationM33859Xe != null) {
            ConversationAdditional conversationAdditional = conversationM33859Xe.additional;
            long j4 = 0;
            if (conversationAdditional == null || (voiceCallAdditional = conversationAdditional.voiceCall) == null) {
                j = 0;
                j2 = 0;
            } else {
                if (TextUtils.isEmpty(voiceCallAdditional.rejectedTime)) {
                    j3 = 0;
                } else {
                    try {
                        j3 = Long.parseLong(voiceCallAdditional.rejectedTime);
                    } catch (NumberFormatException e) {
                        CrashHelper.m82479c(e);
                        j3 = 0;
                    }
                }
                if (!TextUtils.isEmpty(voiceCallAdditional.acceptedTime)) {
                    try {
                        j4 = Long.parseLong(voiceCallAdditional.acceptedTime);
                    } catch (NumberFormatException e2) {
                        CrashHelper.m82479c(e2);
                    }
                }
                j2 = j4;
                j = j3;
            }
            m49961l(j, j2, message.isMe(), message);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m49961l(long j, long j2, boolean z, final Message message) {
        bnl0.m105524M(this.f32389b, false);
        bnl0.m105524M(this.f32390c, false);
        this.f32393f.setTypeface(lyh0.m156283c(3), 1);
        this.f32394g.setTypeface(lyh0.m156283c(3), 1);
        this.f32389b.setTypeface(lyh0.m156283c(3), 1);
        this.f32390c.setTypeface(lyh0.m156283c(3), 1);
        bnl0.m105509E0(this.f32389b, null);
        bnl0.m105509E0(this.f32390c, null);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f32395h.getLayoutParams();
        layoutParams.rightMargin = qa00.f156326m;
        this.f32395h.setLayoutParams(layoutParams);
        if (z) {
            bnl0.m105524M(this.f32396i, false);
            if (m49955f(message) || m49954e(0)) {
                this.f32392e.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113910S6 : ibc0.f113902R6);
                this.f32393f.setText(R$string.f21564O1);
                this.f32388a.setText(R$string.f21556N1);
                layoutParams.rightMargin = qa00.f156323j;
                this.f32395h.setLayoutParams(layoutParams);
                bnl0.m105524M(this.f32394g, true);
                bnl0.m105522L(this.f32394g, new View.OnClickListener() { // from class: l.ujq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f179322a.m49956g(message, view);
                    }
                });
                return;
            }
            if ((j > 0 && message.createdTime <= j) || m49954e(1)) {
                bnl0.m105524M(this.f32394g, false);
                this.f32393f.setText(R$string.f21580Q1);
                this.f32392e.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114081m5 : ibc0.f114072l5);
                this.f32388a.setText(R$string.f21636X1);
                return;
            }
            if (j2 > 0 || m49954e(2)) {
                this.f32392e.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113910S6 : ibc0.f113902R6);
                this.f32393f.setText(R$string.f21564O1);
                bnl0.m105524M(this.f32394g, false);
                this.f32388a.setText(R$string.f21636X1);
                return;
            }
            bnl0.m105524M(this.f32394g, false);
            this.f32392e.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113910S6 : ibc0.f113902R6);
            this.f32393f.setText(R$string.f21572P1);
            this.f32388a.setText(R$string.f21636X1);
            return;
        }
        this.f32393f.setText(R$string.f21628W1);
        bnl0.m105524M(this.f32396i, true);
        bnl0.m105524M(this.f32394g, false);
        if (m49955f(message) || m49954e(0)) {
            this.f32392e.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113910S6 : ibc0.f113902R6);
            this.f32388a.setText(R$string.f21604T1);
            this.f32389b.setText(R$string.f21588R1);
            this.f32389b.setTextColor(getResources().getColor(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102820j : g9c0.f102825o));
            bnl0.m105524M(this.f32389b, true);
            bnl0.m105522L(this.f32389b, new View.OnClickListener() { // from class: l.vjq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f184435a.m49957h(message, view);
                }
            });
            return;
        }
        if ((j > 0 && message.createdTime <= j) || m49954e(1)) {
            this.f32392e.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114081m5 : ibc0.f114072l5);
            bnl0.m105524M(this.f32390c, true);
            this.f32388a.setText(R$string.f21612U1);
            this.f32390c.setText(R$string.f21644Y1);
            this.f32390c.setTextColor(getResources().getColor(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102819i : g9c0.f102813c));
            return;
        }
        if (j2 > 0 || m49954e(2)) {
            this.f32392e.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113910S6 : ibc0.f113902R6);
            this.f32388a.setText(R$string.f21612U1);
            this.f32389b.setTextColor(getResources().getColor(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102819i : g9c0.f102822l));
            this.f32389b.setText(R$string.f21548M1);
            bnl0.m105524M(this.f32389b, true);
            return;
        }
        this.f32392e.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113910S6 : ibc0.f113902R6);
        this.f32388a.setText(R$string.f21612U1);
        this.f32389b.setText(R$string.f21620V1);
        this.f32390c.setText(R$string.f21596S1);
        bnl0.m105524M(this.f32389b, true);
        bnl0.m105524M(this.f32390c, true);
        bnl0.m105522L(this.f32389b, new View.OnClickListener() { // from class: l.wjq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f189486a.m49958i(message, view);
            }
        });
        bnl0.m105522L(this.f32390c, new View.OnClickListener() { // from class: l.xjq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194634a.m49959j(message, view);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m49962m(boolean z, String str, Message message) {
        avm0.m100473f(z, str, message);
    }

    @Override // p153l.x6q
    public Message message() {
        return this.f32397j;
    }

    /* JADX INFO: renamed from: n */
    public final void m49963n(String str) {
        qzm0.m178812h().m178823o("voice_entry_request_item");
        xzm0.m213760p().m213765h(getContext(), str, "");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32388a = (TextView) findViewById(edc0.f93172B1);
        this.f32389b = (TextView) findViewById(edc0.f93317Z0);
        this.f32390c = (TextView) findViewById(edc0.f93224J3);
        this.f32391d = findViewById(edc0.f93496y5);
        this.f32396i = findViewById(edc0.f93223J2);
        this.f32392e = (ImageView) findViewById(edc0.f93394k1);
        this.f32393f = (TextView) findViewById(edc0.f93261P4);
        this.f32394g = (VButton) findViewById(edc0.f93353e2);
        this.f32395h = (LinearLayout) findViewById(edc0.f93310Y);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f32393f.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f32388a.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f32394g.setTextColor(getResources().getColor(g9c0.f102820j));
            this.f32389b.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f32390c.setTextColor(getResources().getColor(g9c0.f102820j));
        }
    }

    public ItemVoiceCallInvitation(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemVoiceCallInvitation(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
