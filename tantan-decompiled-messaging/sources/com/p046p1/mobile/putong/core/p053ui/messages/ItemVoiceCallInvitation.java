package com.p046p1.mobile.putong.core.p053ui.messages;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationAdditional;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.VoiceCallAdditional;
import com.p046p1.mobile.putong.core.data.VoiceCallInvitationStatus;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import p147v.VButton;
import p149l.a1c0;
import p149l.c3c0;
import p149l.eqh0;
import p149l.mqm0;
import p149l.o6j0;
import p149l.t100;
import p149l.tqm0;
import p149l.ura;
import p149l.wlm0;
import p149l.x4q;
import p149l.xdl0;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemVoiceCallInvitation extends FrameLayout implements x4q {

    /* JADX INFO: renamed from: a */
    public TextView f31540a;

    /* JADX INFO: renamed from: b */
    public TextView f31541b;

    /* JADX INFO: renamed from: c */
    public TextView f31542c;

    /* JADX INFO: renamed from: d */
    public View f31543d;

    /* JADX INFO: renamed from: e */
    public ImageView f31544e;

    /* JADX INFO: renamed from: f */
    public TextView f31545f;

    /* JADX INFO: renamed from: g */
    public VButton f31546g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f31547h;

    /* JADX INFO: renamed from: i */
    public View f31548i;

    /* JADX INFO: renamed from: j */
    public Message f31549j;

    public ItemVoiceCallInvitation(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m48771e(int i) {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m48772f(Message message) {
        if (TextUtils.isEmpty(message.msgData)) {
            return false;
        }
        try {
            VoiceCallInvitationStatus voiceCallInvitationStatus = VoiceCallInvitationStatus.JSON_ADAPTER.parse(message.msgData);
            return voiceCallInvitationStatus != null && TextUtils.equals(voiceCallInvitationStatus.status, "accepted");
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m48773g(Message message, View view) {
        o6j0.m162859c("e_voice_call_received_message", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("voice_call_reminder_character", "applicant"));
        m48780n(message.cid);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m48774h(Message message, View view) {
        o6j0.m162859c("e_voice_call_received_message", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("voice_call_reminder_character", "receiver"));
        m48780n(message.cid);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m48775i(Message message, View view) {
        o6j0.m162859c("e_voice_call_application_receiver_pop_ups_reject", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("moments_user_id", message.cid), o6j0.C18854a.m162878h("voice_call_receiver_user_id", CoreModule.m29931H().userId()));
        m48779m(true, message.cid, message);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m48776j(Message message, View view) {
        o6j0.m162859c("e_voice_call_application_receiver_approve", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("moments_user_id", message.cid), o6j0.C18854a.m162878h("voice_call_receiver_user_id", CoreModule.m29931H().userId()));
        m48779m(false, message.cid, message);
    }

    /* JADX INFO: renamed from: k */
    public void m48777k(Message message) {
        long j;
        long j2;
        VoiceCallAdditional voiceCallAdditional;
        long j3;
        this.f31549j = message;
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(message.cid);
        if (conversationM32856Xe != null) {
            ConversationAdditional conversationAdditional = conversationM32856Xe.additional;
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
                        CrashHelper.m81296c(e);
                        j3 = 0;
                    }
                }
                if (!TextUtils.isEmpty(voiceCallAdditional.acceptedTime)) {
                    try {
                        j4 = Long.parseLong(voiceCallAdditional.acceptedTime);
                    } catch (NumberFormatException e2) {
                        CrashHelper.m81296c(e2);
                    }
                }
                j2 = j4;
                j = j3;
            }
            m48778l(j, j2, message.isMe(), message);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m48778l(long j, long j2, boolean z, final Message message) {
        xdl0.m208344M(this.f31541b, false);
        xdl0.m208344M(this.f31542c, false);
        this.f31545f.setTypeface(eqh0.m117752c(3), 1);
        this.f31546g.setTypeface(eqh0.m117752c(3), 1);
        this.f31541b.setTypeface(eqh0.m117752c(3), 1);
        this.f31542c.setTypeface(eqh0.m117752c(3), 1);
        xdl0.m208329E0(this.f31541b, null);
        xdl0.m208329E0(this.f31542c, null);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f31547h.getLayoutParams();
        layoutParams.rightMargin = t100.f167264m;
        this.f31547h.setLayoutParams(layoutParams);
        if (z) {
            xdl0.m208344M(this.f31548i, false);
            if (m48772f(message) || m48771e(0)) {
                this.f31544e.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78635S6 : c3c0.f78627R6);
                this.f31545f.setText(R$string.f20822O1);
                this.f31540a.setText(R$string.f20814N1);
                layoutParams.rightMargin = t100.f167261j;
                this.f31547h.setLayoutParams(layoutParams);
                xdl0.m208344M(this.f31546g, true);
                xdl0.m208342L(this.f31546g, new View.OnClickListener() { // from class: l.uhq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f176585a.m48773g(message, view);
                    }
                });
                return;
            }
            if ((j > 0 && message.createdTime <= j) || m48771e(1)) {
                xdl0.m208344M(this.f31546g, false);
                this.f31545f.setText(R$string.f20838Q1);
                this.f31544e.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78806m5 : c3c0.f78797l5);
                this.f31540a.setText(R$string.f20894X1);
                return;
            }
            if (j2 > 0 || m48771e(2)) {
                this.f31544e.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78635S6 : c3c0.f78627R6);
                this.f31545f.setText(R$string.f20822O1);
                xdl0.m208344M(this.f31546g, false);
                this.f31540a.setText(R$string.f20894X1);
                return;
            }
            xdl0.m208344M(this.f31546g, false);
            this.f31544e.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78635S6 : c3c0.f78627R6);
            this.f31545f.setText(R$string.f20830P1);
            this.f31540a.setText(R$string.f20894X1);
            return;
        }
        this.f31545f.setText(R$string.f20886W1);
        xdl0.m208344M(this.f31548i, true);
        xdl0.m208344M(this.f31546g, false);
        if (m48772f(message) || m48771e(0)) {
            this.f31544e.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78635S6 : c3c0.f78627R6);
            this.f31540a.setText(R$string.f20862T1);
            this.f31541b.setText(R$string.f20846R1);
            this.f31541b.setTextColor(getResources().getColor(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67156j : a1c0.f67161o));
            xdl0.m208344M(this.f31541b, true);
            xdl0.m208342L(this.f31541b, new View.OnClickListener() { // from class: l.vhq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f181523a.m48774h(message, view);
                }
            });
            return;
        }
        if ((j > 0 && message.createdTime <= j) || m48771e(1)) {
            this.f31544e.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78806m5 : c3c0.f78797l5);
            xdl0.m208344M(this.f31542c, true);
            this.f31540a.setText(R$string.f20870U1);
            this.f31542c.setText(R$string.f20902Y1);
            this.f31542c.setTextColor(getResources().getColor(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67155i : a1c0.f67149c));
            return;
        }
        if (j2 > 0 || m48771e(2)) {
            this.f31544e.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78635S6 : c3c0.f78627R6);
            this.f31540a.setText(R$string.f20870U1);
            this.f31541b.setTextColor(getResources().getColor(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67155i : a1c0.f67158l));
            this.f31541b.setText(R$string.f20806M1);
            xdl0.m208344M(this.f31541b, true);
            return;
        }
        this.f31544e.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78635S6 : c3c0.f78627R6);
        this.f31540a.setText(R$string.f20870U1);
        this.f31541b.setText(R$string.f20878V1);
        this.f31542c.setText(R$string.f20854S1);
        xdl0.m208344M(this.f31541b, true);
        xdl0.m208344M(this.f31542c, true);
        xdl0.m208342L(this.f31541b, new View.OnClickListener() { // from class: l.whq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186461a.m48775i(message, view);
            }
        });
        xdl0.m208342L(this.f31542c, new View.OnClickListener() { // from class: l.xhq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192903a.m48776j(message, view);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m48779m(boolean z, String str, Message message) {
        wlm0.m203839f(z, str, message);
    }

    @Override // p149l.x4q
    public Message message() {
        return this.f31549j;
    }

    /* JADX INFO: renamed from: n */
    public final void m48780n(String str) {
        mqm0.m155965h().m155976o("voice_entry_request_item");
        tqm0.m190131p().m190136h(getContext(), str, "");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31540a = (TextView) findViewById(y4c0.f195937B1);
        this.f31541b = (TextView) findViewById(y4c0.f196082Z0);
        this.f31542c = (TextView) findViewById(y4c0.f195989J3);
        this.f31543d = findViewById(y4c0.f196261y5);
        this.f31548i = findViewById(y4c0.f195988J2);
        this.f31544e = (ImageView) findViewById(y4c0.f196159k1);
        this.f31545f = (TextView) findViewById(y4c0.f196026P4);
        this.f31546g = (VButton) findViewById(y4c0.f196118e2);
        this.f31547h = (LinearLayout) findViewById(y4c0.f196075Y);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31545f.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31540a.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f31546g.setTextColor(getResources().getColor(a1c0.f67156j));
            this.f31541b.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f31542c.setTextColor(getResources().getColor(a1c0.f67156j));
        }
    }

    public ItemVoiceCallInvitation(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemVoiceCallInvitation(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
