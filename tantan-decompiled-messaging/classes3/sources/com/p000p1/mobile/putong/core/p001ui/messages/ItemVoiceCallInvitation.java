package com.p000p1.mobile.putong.core.p001ui.messages;

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
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.ConversationAdditional;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.VoiceCallAdditional;
import com.p1.mobile.putong.core.data.VoiceCallInvitationStatus;
import com.p1.mobile.putong.core.message.R;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import l.a1c0;
import l.c3c0;
import l.mqm0;
import l.o6j0;
import l.t100;
import l.tqm0;
import l.ura;
import l.wlm0;
import l.xdl0;
import l.y4c0;
import p003l.eqh0;
import p003l.x4q;
import p028v.VButton;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemVoiceCallInvitation extends FrameLayout implements x4q {

    /* JADX INFO: renamed from: a */
    public TextView f1431a;

    /* JADX INFO: renamed from: b */
    public TextView f1432b;

    /* JADX INFO: renamed from: c */
    public TextView f1433c;

    /* JADX INFO: renamed from: d */
    public View f1434d;

    /* JADX INFO: renamed from: e */
    public ImageView f1435e;

    /* JADX INFO: renamed from: f */
    public TextView f1436f;

    /* JADX INFO: renamed from: g */
    public VButton f1437g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f1438h;

    /* JADX INFO: renamed from: i */
    public View f1439i;

    /* JADX INFO: renamed from: j */
    public Message f1440j;

    public ItemVoiceCallInvitation(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1855e(int i) {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1856f(Message message) {
        if (TextUtils.isEmpty(message.msgData)) {
            return false;
        }
        try {
            VoiceCallInvitationStatus voiceCallInvitationStatus = (VoiceCallInvitationStatus) VoiceCallInvitationStatus.JSON_ADAPTER.parse(message.msgData);
            return voiceCallInvitationStatus != null && TextUtils.equals(voiceCallInvitationStatus.status, "accepted");
        } catch (IOException e) {
            CrashHelper.c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m1857g(Message message, View view) {
        o6j0.c("e_voice_call_received_message", "p_chat_view", new o6j0.a[]{o6j0.a.h("voice_call_reminder_character", "applicant")});
        m1864n(message.cid);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m1858h(Message message, View view) {
        o6j0.c("e_voice_call_received_message", "p_chat_view", new o6j0.a[]{o6j0.a.h("voice_call_reminder_character", "receiver")});
        m1864n(message.cid);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m1859i(Message message, View view) {
        o6j0.c("e_voice_call_application_receiver_pop_ups_reject", "p_chat_view", new o6j0.a[]{o6j0.a.h("moments_user_id", message.cid), o6j0.a.h("voice_call_receiver_user_id", CoreModule.H().userId())});
        m1863m(true, message.cid, message);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m1860j(Message message, View view) {
        o6j0.c("e_voice_call_application_receiver_approve", "p_chat_view", new o6j0.a[]{o6j0.a.h("moments_user_id", message.cid), o6j0.a.h("voice_call_receiver_user_id", CoreModule.H().userId())});
        m1863m(false, message.cid, message);
    }

    /* JADX INFO: renamed from: k */
    public void m1861k(Message message) {
        long j;
        long j2;
        VoiceCallAdditional voiceCallAdditional;
        long j3;
        this.f1440j = message;
        Conversation conversationXe = CoreModule.c.f0.Xe(message.cid);
        if (conversationXe != null) {
            ConversationAdditional conversationAdditional = conversationXe.additional;
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
                        CrashHelper.c(e);
                        j3 = 0;
                    }
                }
                if (!TextUtils.isEmpty(voiceCallAdditional.acceptedTime)) {
                    try {
                        j4 = Long.parseLong(voiceCallAdditional.acceptedTime);
                    } catch (NumberFormatException e2) {
                        CrashHelper.c(e2);
                    }
                }
                j2 = j4;
                j = j3;
            }
            m1862l(j, j2, message.isMe(), message);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m1862l(long j, long j2, boolean z, final Message message) {
        xdl0.M(this.f1432b, false);
        xdl0.M(this.f1433c, false);
        this.f1436f.setTypeface(eqh0.m3924c(3), 1);
        this.f1437g.setTypeface(eqh0.m3924c(3), 1);
        this.f1432b.setTypeface(eqh0.m3924c(3), 1);
        this.f1433c.setTypeface(eqh0.m3924c(3), 1);
        xdl0.E0(this.f1432b, (View.OnClickListener) null);
        xdl0.E0(this.f1433c, (View.OnClickListener) null);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1438h.getLayoutParams();
        layoutParams.rightMargin = t100.m;
        this.f1438h.setLayoutParams(layoutParams);
        if (z) {
            xdl0.M(this.f1439i, false);
            if (m1856f(message) || m1855e(0)) {
                this.f1435e.setImageResource(ura.e().d().I4() ? c3c0.S6 : c3c0.R6);
                this.f1436f.setText(R.string.O1);
                this.f1431a.setText(R.string.N1);
                layoutParams.rightMargin = t100.j;
                this.f1438h.setLayoutParams(layoutParams);
                xdl0.M(this.f1437g, true);
                xdl0.L(this.f1437g, new View.OnClickListener() { // from class: l.uhq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f7987a.m1857g(message, view);
                    }
                });
                return;
            }
            if ((j > 0 && message.createdTime <= j) || m1855e(1)) {
                xdl0.M(this.f1437g, false);
                this.f1436f.setText(R.string.Q1);
                this.f1435e.setImageResource(ura.e().d().I4() ? c3c0.m5 : c3c0.l5);
                this.f1431a.setText(R.string.X1);
                return;
            }
            if (j2 > 0 || m1855e(2)) {
                this.f1435e.setImageResource(ura.e().d().I4() ? c3c0.S6 : c3c0.R6);
                this.f1436f.setText(R.string.O1);
                xdl0.M(this.f1437g, false);
                this.f1431a.setText(R.string.X1);
                return;
            }
            xdl0.M(this.f1437g, false);
            this.f1435e.setImageResource(ura.e().d().I4() ? c3c0.S6 : c3c0.R6);
            this.f1436f.setText(R.string.P1);
            this.f1431a.setText(R.string.X1);
            return;
        }
        this.f1436f.setText(R.string.W1);
        xdl0.M(this.f1439i, true);
        xdl0.M(this.f1437g, false);
        if (m1856f(message) || m1855e(0)) {
            this.f1435e.setImageResource(ura.e().d().I4() ? c3c0.S6 : c3c0.R6);
            this.f1431a.setText(R.string.T1);
            this.f1432b.setText(R.string.R1);
            this.f1432b.setTextColor(getResources().getColor(ura.e().d().I4() ? a1c0.j : a1c0.o));
            xdl0.M(this.f1432b, true);
            xdl0.L(this.f1432b, new View.OnClickListener() { // from class: l.vhq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8338a.m1858h(message, view);
                }
            });
            return;
        }
        if ((j > 0 && message.createdTime <= j) || m1855e(1)) {
            this.f1435e.setImageResource(ura.e().d().I4() ? c3c0.m5 : c3c0.l5);
            xdl0.M(this.f1433c, true);
            this.f1431a.setText(R.string.U1);
            this.f1433c.setText(R.string.Y1);
            this.f1433c.setTextColor(getResources().getColor(ura.e().d().I4() ? a1c0.i : a1c0.c));
            return;
        }
        if (j2 > 0 || m1855e(2)) {
            this.f1435e.setImageResource(ura.e().d().I4() ? c3c0.S6 : c3c0.R6);
            this.f1431a.setText(R.string.U1);
            this.f1432b.setTextColor(getResources().getColor(ura.e().d().I4() ? a1c0.i : a1c0.l));
            this.f1432b.setText(R.string.M1);
            xdl0.M(this.f1432b, true);
            return;
        }
        this.f1435e.setImageResource(ura.e().d().I4() ? c3c0.S6 : c3c0.R6);
        this.f1431a.setText(R.string.U1);
        this.f1432b.setText(R.string.V1);
        this.f1433c.setText(R.string.S1);
        xdl0.M(this.f1432b, true);
        xdl0.M(this.f1433c, true);
        xdl0.L(this.f1432b, new View.OnClickListener() { // from class: l.whq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8549a.m1859i(message, view);
            }
        });
        xdl0.L(this.f1433c, new View.OnClickListener() { // from class: l.xhq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8786a.m1860j(message, view);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m1863m(boolean z, String str, Message message) {
        wlm0.f(z, str, message);
    }

    @Override // p003l.x4q
    public Message message() {
        return this.f1440j;
    }

    /* JADX INFO: renamed from: n */
    public final void m1864n(String str) {
        mqm0.h().o("voice_entry_request_item");
        tqm0.p().h(getContext(), str, "");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1431a = (TextView) findViewById(y4c0.B1);
        this.f1432b = (TextView) findViewById(y4c0.Z0);
        this.f1433c = (TextView) findViewById(y4c0.J3);
        this.f1434d = findViewById(y4c0.y5);
        this.f1439i = findViewById(y4c0.J2);
        this.f1435e = (ImageView) findViewById(y4c0.k1);
        this.f1436f = (TextView) findViewById(y4c0.P4);
        this.f1437g = (VButton) findViewById(y4c0.e2);
        this.f1438h = (LinearLayout) findViewById(y4c0.Y);
        if (ura.e().d().I4()) {
            this.f1436f.setTextColor(getResources().getColor(a1c0.g));
            this.f1431a.setTextColor(getResources().getColor(a1c0.i));
            this.f1437g.setTextColor(getResources().getColor(a1c0.j));
            this.f1432b.setTextColor(getResources().getColor(a1c0.i));
            this.f1433c.setTextColor(getResources().getColor(a1c0.j));
        }
    }

    public ItemVoiceCallInvitation(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemVoiceCallInvitation(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
