package com.p046p1.mobile.putong.core.p053ui.messages;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAdditionalData;
import com.p046p1.mobile.putong.core.data.VoiceCallStatus;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import java.util.List;
import p149l.knb0;
import p149l.mqm0;
import p149l.o6j0;
import p149l.ssm0;
import p149l.tqm0;
import p149l.xdl0;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemVoiceCall extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public TextView f31538a;

    /* JADX INFO: renamed from: b */
    public ImageView f31539b;

    public ItemVoiceCall(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m48765b(Message message, View view) {
        if (CoreModule.m29935P().m94658i().mo158454v()) {
            Activity activityM208328E = xdl0.m208328E(this);
            if (activityM208328E instanceof MessagesAct) {
                if (CoreModule.m29935P().m94658i().mo158310T5(((MessagesAct) activityM208328E).mo48974l().mo120828r3())) {
                    return;
                }
            }
        }
        o6j0.m162859c("e_voice_call_pop", OMSDialogPositon.p_chat_view, new o6j0.C18854a[0]);
        mqm0.m155965h().m155976o("voice_entry_message_item");
        tqm0.m190131p().m190136h(getContext(), message.cid, "");
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(final Message message) {
        setOnClickListener(new View.OnClickListener() { // from class: l.thq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170271a.m48765b(message, view);
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
                this.f31538a.setText(String.format(CoreModule.f17544b.getResources().getString(R$string.f20827O6), ssm0.m185758b(m48766c(messageAdditionalData.duration))));
                break;
            case "rejected":
                boolean zIsCaller = message.isCaller();
                TextView textView = this.f31538a;
                if (!zIsCaller) {
                    textView.setText(R$string.f20859S6);
                    break;
                } else {
                    textView.setText(R$string.f20851R6);
                    break;
                }
                break;
            case "canceled":
            case "busy":
                boolean zIsCaller2 = message.isCaller();
                TextView textView2 = this.f31538a;
                if (!zIsCaller2) {
                    textView2.setText(R$string.f20835P6);
                    break;
                } else {
                    textView2.setText(R$string.f20819N6);
                    break;
                }
                break;
            case "notAnswered":
                boolean zIsCaller3 = message.isCaller();
                TextView textView3 = this.f31538a;
                if (!zIsCaller3) {
                    textView3.setText(R$string.f20835P6);
                    break;
                } else {
                    textView3.setText(R$string.f20843Q6);
                    break;
                }
                break;
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final long m48766c(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31538a = (TextView) findViewById(y4c0.f196020O4);
        this.f31539b = (ImageView) findViewById(y4c0.f196187o1);
    }

    public ItemVoiceCall(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemVoiceCall(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
