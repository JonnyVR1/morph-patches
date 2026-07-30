package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAdditionalData;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.breaking.SwapAnswerBottomSheetAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import java.io.IOException;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText_NoTopPadding;
import p149l.a1c0;
import p149l.c3c0;
import p149l.j760;
import p149l.knb0;
import p149l.meq;
import p149l.ura;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemSwapAnswerMessage extends VLinear implements InterfaceC8519a {

    /* JADX INFO: renamed from: c */
    public ItemSwapAnswerMessage f31481c;

    /* JADX INFO: renamed from: d */
    public VImage f31482d;

    /* JADX INFO: renamed from: e */
    public VText_NoTopPadding f31483e;

    /* JADX INFO: renamed from: f */
    public VText_NoTopPadding f31484f;

    /* JADX INFO: renamed from: g */
    public VImage f31485g;

    /* JADX INFO: renamed from: h */
    public VText_NoTopPadding f31486h;

    /* JADX INFO: renamed from: i */
    public VImage f31487i;

    /* JADX INFO: renamed from: j */
    public VText_NoTopPadding f31488j;

    /* JADX INFO: renamed from: k */
    public VImage f31489k;

    /* JADX INFO: renamed from: l */
    public VText_Bold f31490l;

    public ItemSwapAnswerMessage(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m48683R(Message message, View view) {
        SwapAnswerBottomSheetAct.m44448C2((Act) getContext(), message.cid, message.f56011id, message.additionalData.iceBreakingQA.title);
        zvf0.m220399u("e_answer_question", OMSDialogPositon.p_chat_view, j760.m140076a("answer_write", message.additionalData.iceBreakingQA.title));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(final Message message) {
        if (message == null) {
            return;
        }
        if (message.additionalData == null) {
            message.additionalData = MessageAdditionalData.new_();
        }
        if (message.additionalData.iceBreakingQA == null && !TextUtils.isEmpty(message.msgData)) {
            try {
                MessageAdditionalData messageAdditionalData = MessageAdditionalData.JSON_ADAPTER.parse(message.msgData);
                if (messageAdditionalData != null) {
                    message.additionalData.iceBreakingQA = messageAdditionalData.iceBreakingQA;
                }
            } catch (IOException unused) {
            }
        }
        if (message.additionalData.iceBreakingQA == null) {
            return;
        }
        if (message.isMe()) {
            boolean zEquals = "default".equals(message.additionalData.iceBreakingQA.state);
            VText_NoTopPadding vText_NoTopPadding = this.f31484f;
            if (zEquals) {
                xdl0.m208344M(vText_NoTopPadding, true);
            } else {
                xdl0.m208344M(vText_NoTopPadding, false);
            }
            this.f31486h.setText(message.additionalData.iceBreakingQA.title);
            this.f31488j.setText(message.additionalData.iceBreakingQA.answer);
        } else {
            this.f31486h.setText(message.additionalData.iceBreakingQA.title);
            boolean zEquals2 = "default".equals(message.additionalData.iceBreakingQA.state);
            VImage vImage = this.f31489k;
            if (zEquals2) {
                xdl0.m208344M(vImage, true);
                xdl0.m208344M(this.f31488j, false);
                xdl0.m208344M(this.f31490l, true);
                zvf0.m220368A("e_answer_question", OMSDialogPositon.p_chat_view, j760.m140076a("answer_write", message.additionalData.iceBreakingQA.title));
            } else {
                xdl0.m208344M(vImage, false);
                xdl0.m208344M(this.f31488j, true);
                xdl0.m208344M(this.f31490l, false);
                this.f31488j.setText(message.additionalData.iceBreakingQA.answer);
            }
        }
        xdl0.m208329E0(this.f31490l, new View.OnClickListener() { // from class: l.leq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127734a.m48683R(message, view);
            }
        });
        zvf0.m220368A("e_exchange_answer_message", OMSDialogPositon.p_chat_view, j760.m140076a("is_initiator", Integer.valueOf(TextUtils.equals(message.additionalData.iceBreakingQA.originUserID, CoreModule.m29931H().userId()) ? 1 : 0)));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public final void m48684Q(View view) {
        meq.m154305a(this, view);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48684Q(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            xdl0.m208346N(this.f31482d, c3c0.f78475A7);
            this.f31483e.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f31484f.setTextColor(getResources().getColor(a1c0.f67155i));
            xdl0.m208346N(this.f31485g, c3c0.f78925z7);
            this.f31486h.setTextColor(getResources().getColor(a1c0.f67155i));
            xdl0.m208346N(this.f31487i, c3c0.f78916y7);
            this.f31488j.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31490l.setTextColor(getResources().getColor(a1c0.f67156j));
        }
    }

    public ItemSwapAnswerMessage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ItemSwapAnswerMessage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
