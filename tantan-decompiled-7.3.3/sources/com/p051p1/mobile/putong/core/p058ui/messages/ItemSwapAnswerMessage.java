package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAdditionalData;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.breaking.SwapAnswerBottomSheetAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import java.io.IOException;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText_NoTopPadding;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.ibc0;
import p153l.mgq;
import p153l.ovb0;
import p153l.pf60;

/* JADX INFO: loaded from: classes3.dex */
public class ItemSwapAnswerMessage extends VLinear implements InterfaceC8682a {

    /* JADX INFO: renamed from: c */
    public ItemSwapAnswerMessage f32329c;

    /* JADX INFO: renamed from: d */
    public VImage f32330d;

    /* JADX INFO: renamed from: e */
    public VText_NoTopPadding f32331e;

    /* JADX INFO: renamed from: f */
    public VText_NoTopPadding f32332f;

    /* JADX INFO: renamed from: g */
    public VImage f32333g;

    /* JADX INFO: renamed from: h */
    public VText_NoTopPadding f32334h;

    /* JADX INFO: renamed from: i */
    public VImage f32335i;

    /* JADX INFO: renamed from: j */
    public VText_NoTopPadding f32336j;

    /* JADX INFO: renamed from: k */
    public VImage f32337k;

    /* JADX INFO: renamed from: l */
    public VText_Bold f32338l;

    public ItemSwapAnswerMessage(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m49866R(Message message, View view) {
        SwapAnswerBottomSheetAct.m45632D2((Act) getContext(), message.cid, message.f56859id, message.additionalData.iceBreakingQA.title);
        i4g0.m138523u("e_answer_question", OMSDialogPositon.p_chat_view, pf60.m172085a("answer_write", message.additionalData.iceBreakingQA.title));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(final Message message) {
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
            VText_NoTopPadding vText_NoTopPadding = this.f32332f;
            if (zEquals) {
                bnl0.m105524M(vText_NoTopPadding, true);
            } else {
                bnl0.m105524M(vText_NoTopPadding, false);
            }
            this.f32334h.setText(message.additionalData.iceBreakingQA.title);
            this.f32336j.setText(message.additionalData.iceBreakingQA.answer);
        } else {
            this.f32334h.setText(message.additionalData.iceBreakingQA.title);
            boolean zEquals2 = "default".equals(message.additionalData.iceBreakingQA.state);
            VImage vImage = this.f32337k;
            if (zEquals2) {
                bnl0.m105524M(vImage, true);
                bnl0.m105524M(this.f32336j, false);
                bnl0.m105524M(this.f32338l, true);
                i4g0.m138492A("e_answer_question", OMSDialogPositon.p_chat_view, pf60.m172085a("answer_write", message.additionalData.iceBreakingQA.title));
            } else {
                bnl0.m105524M(vImage, false);
                bnl0.m105524M(this.f32336j, true);
                bnl0.m105524M(this.f32338l, false);
                this.f32336j.setText(message.additionalData.iceBreakingQA.answer);
            }
        }
        bnl0.m105509E0(this.f32338l, new View.OnClickListener() { // from class: l.lgq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131999a.m49866R(message, view);
            }
        });
        i4g0.m138492A("e_exchange_answer_message", OMSDialogPositon.p_chat_view, pf60.m172085a("is_initiator", Integer.valueOf(TextUtils.equals(message.additionalData.iceBreakingQA.originUserID, CoreModule.m30929H().userId()) ? 1 : 0)));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public final void m49867Q(View view) {
        mgq.m158376a(this, view);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49867Q(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            bnl0.m105526N(this.f32330d, ibc0.f113750A7);
            this.f32331e.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f32332f.setTextColor(getResources().getColor(g9c0.f102819i));
            bnl0.m105526N(this.f32333g, ibc0.f114200z7);
            this.f32334h.setTextColor(getResources().getColor(g9c0.f102819i));
            bnl0.m105526N(this.f32335i, ibc0.f114191y7);
            this.f32336j.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f32338l.setTextColor(getResources().getColor(g9c0.f102820j));
        }
    }

    public ItemSwapAnswerMessage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ItemSwapAnswerMessage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
