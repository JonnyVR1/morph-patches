package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageAdditionalData;
import com.p1.mobile.putong.core.data.VoiceCallStatus;
import com.p1.mobile.putong.core.message.R;
import java.util.List;
import l.knb0;
import l.mqm0;
import l.o6j0;
import l.ssm0;
import l.tqm0;
import l.xdl0;
import l.y4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemVoiceCall extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public TextView f1429a;

    /* JADX INFO: renamed from: b */
    public ImageView f1430b;

    public ItemVoiceCall(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m1849b(Message message, View view) {
        if (CoreModule.P().i().v()) {
            Object objE = xdl0.E(this);
            if (objE instanceof MessagesAct) {
                if (CoreModule.P().i().T5(((MessagesAct) objE).mo2066l().m4295r3())) {
                    return;
                }
            }
        }
        o6j0.c("e_voice_call_pop", "p_chat_view", new o6j0.a[0]);
        mqm0.h().o("voice_entry_message_item");
        tqm0.p().h(getContext(), message.cid, "");
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(final Message message) {
        setOnClickListener(new View.OnClickListener() { // from class: l.thq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7493a.m1849b(message, view);
            }
        });
        MessageAdditionalData messageAdditionalData = message.additionalData;
        if (messageAdditionalData == null) {
            return;
        }
        VoiceCallStatus.get("unknown_");
        String string = VoiceCallStatus.get(messageAdditionalData.status).toString();
        string.getClass();
        switch (string) {
            case "finished":
                this.f1429a.setText(String.format(CoreModule.b.getResources().getString(R.string.O6), ssm0.b(m1850c(messageAdditionalData.duration))));
                break;
            case "rejected":
                boolean zIsCaller = message.isCaller();
                TextView textView = this.f1429a;
                if (!zIsCaller) {
                    textView.setText(R.string.S6);
                    break;
                } else {
                    textView.setText(R.string.R6);
                    break;
                }
                break;
            case "canceled":
            case "busy":
                boolean zIsCaller2 = message.isCaller();
                TextView textView2 = this.f1429a;
                if (!zIsCaller2) {
                    textView2.setText(R.string.P6);
                    break;
                } else {
                    textView2.setText(R.string.N6);
                    break;
                }
                break;
            case "notAnswered":
                boolean zIsCaller3 = message.isCaller();
                TextView textView3 = this.f1429a;
                if (!zIsCaller3) {
                    textView3.setText(R.string.P6);
                    break;
                } else {
                    textView3.setText(R.string.Q6);
                    break;
                }
                break;
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final long m1850c(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1429a = (TextView) findViewById(y4c0.O4);
        this.f1430b = (ImageView) findViewById(y4c0.o1);
    }

    public ItemVoiceCall(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemVoiceCall(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
