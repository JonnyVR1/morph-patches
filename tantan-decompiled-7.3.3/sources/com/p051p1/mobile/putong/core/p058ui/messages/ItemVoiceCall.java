package com.p051p1.mobile.putong.core.p058ui.messages;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAdditionalData;
import com.p051p1.mobile.putong.core.data.VoiceCallStatus;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import java.util.List;
import p153l.bnl0;
import p153l.edc0;
import p153l.ovb0;
import p153l.qzm0;
import p153l.sfj0;
import p153l.w1n0;
import p153l.xzm0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemVoiceCall extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public TextView f32386a;

    /* JADX INFO: renamed from: b */
    public ImageView f32387b;

    public ItemVoiceCall(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m49948b(Message message, View view) {
        if (CoreModule.m30933P().m143412i().mo180546v()) {
            Activity activityM105508E = bnl0.m105508E(this);
            if (activityM105508E instanceof MessagesAct) {
                if (CoreModule.m30933P().m143412i().mo180402T5(((MessagesAct) activityM105508E).mo50158l().mo111034r3())) {
                    return;
                }
            }
        }
        sfj0.m185596c("e_voice_call_pop", OMSDialogPositon.p_chat_view, new sfj0.C20032a[0]);
        qzm0.m178812h().m178823o("voice_entry_message_item");
        xzm0.m213760p().m213765h(getContext(), message.cid, "");
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(final Message message) {
        setOnClickListener(new View.OnClickListener() { // from class: l.tjq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174604a.m49948b(message, view);
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
                this.f32386a.setText(String.format(CoreModule.f18263b.getResources().getString(R$string.f21569O6), w1n0.m204455b(m49949c(messageAdditionalData.duration))));
                break;
            case "rejected":
                boolean zIsCaller = message.isCaller();
                TextView textView = this.f32386a;
                if (!zIsCaller) {
                    textView.setText(R$string.f21601S6);
                    break;
                } else {
                    textView.setText(R$string.f21593R6);
                    break;
                }
                break;
            case "canceled":
            case "busy":
                boolean zIsCaller2 = message.isCaller();
                TextView textView2 = this.f32386a;
                if (!zIsCaller2) {
                    textView2.setText(R$string.f21577P6);
                    break;
                } else {
                    textView2.setText(R$string.f21561N6);
                    break;
                }
                break;
            case "notAnswered":
                boolean zIsCaller3 = message.isCaller();
                TextView textView3 = this.f32386a;
                if (!zIsCaller3) {
                    textView3.setText(R$string.f21577P6);
                    break;
                } else {
                    textView3.setText(R$string.f21585Q6);
                    break;
                }
                break;
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final long m49949c(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32386a = (TextView) findViewById(edc0.f93255O4);
        this.f32387b = (ImageView) findViewById(edc0.f93422o1);
    }

    public ItemVoiceCall(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemVoiceCall(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
