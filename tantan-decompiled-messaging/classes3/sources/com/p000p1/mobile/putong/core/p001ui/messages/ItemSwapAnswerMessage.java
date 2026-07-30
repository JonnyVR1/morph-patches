package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageAdditionalData;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.core.ui.breaking.SwapAnswerBottomSheetAct;
import com.tantanapp.common.data.DbObject;
import java.io.IOException;
import java.util.List;
import l.a1c0;
import l.c3c0;
import l.j760;
import l.knb0;
import l.meq;
import l.ura;
import l.xdl0;
import l.zvf0;
import org.eclipse.jetty.servlet.ServletHandler;
import p028v.VImage;
import p028v.VLinear;
import p028v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemSwapAnswerMessage extends VLinear implements InterfaceC0102a {

    /* JADX INFO: renamed from: c */
    public ItemSwapAnswerMessage f1372c;

    /* JADX INFO: renamed from: d */
    public VImage f1373d;

    /* JADX INFO: renamed from: e */
    public VText_NoTopPadding f1374e;

    /* JADX INFO: renamed from: f */
    public VText_NoTopPadding f1375f;

    /* JADX INFO: renamed from: g */
    public VImage f1376g;

    /* JADX INFO: renamed from: h */
    public VText_NoTopPadding f1377h;

    /* JADX INFO: renamed from: i */
    public VImage f1378i;

    /* JADX INFO: renamed from: j */
    public VText_NoTopPadding f1379j;

    /* JADX INFO: renamed from: k */
    public VImage f1380k;

    /* JADX INFO: renamed from: l */
    public VText_Bold f1381l;

    public ItemSwapAnswerMessage(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m1767R(Message message, View view) {
        SwapAnswerBottomSheetAct.C2(getContext(), message.cid, ((DbObject) message).id, message.additionalData.iceBreakingQA.title);
        zvf0.u("e_answer_question", "p_chat_view", new j760[]{j760.a("answer_write", message.additionalData.iceBreakingQA.title)});
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(final Message message) {
        if (message == null) {
            return;
        }
        if (message.additionalData == null) {
            message.additionalData = MessageAdditionalData.new_();
        }
        if (message.additionalData.iceBreakingQA == null && !TextUtils.isEmpty(message.msgData)) {
            try {
                MessageAdditionalData messageAdditionalData = (MessageAdditionalData) MessageAdditionalData.JSON_ADAPTER.parse(message.msgData);
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
            boolean zEquals = ServletHandler.__DEFAULT_SERVLET.equals(message.additionalData.iceBreakingQA.state);
            AppCompatTextView appCompatTextView = this.f1375f;
            if (zEquals) {
                xdl0.M(appCompatTextView, true);
            } else {
                xdl0.M(appCompatTextView, false);
            }
            this.f1377h.setText(message.additionalData.iceBreakingQA.title);
            this.f1379j.setText(message.additionalData.iceBreakingQA.answer);
        } else {
            this.f1377h.setText(message.additionalData.iceBreakingQA.title);
            boolean zEquals2 = ServletHandler.__DEFAULT_SERVLET.equals(message.additionalData.iceBreakingQA.state);
            AppCompatImageView appCompatImageView = this.f1380k;
            if (zEquals2) {
                xdl0.M(appCompatImageView, true);
                xdl0.M(this.f1379j, false);
                xdl0.M(this.f1381l, true);
                zvf0.A("e_answer_question", "p_chat_view", new j760[]{j760.a("answer_write", message.additionalData.iceBreakingQA.title)});
            } else {
                xdl0.M(appCompatImageView, false);
                xdl0.M(this.f1379j, true);
                xdl0.M(this.f1381l, false);
                this.f1379j.setText(message.additionalData.iceBreakingQA.answer);
            }
        }
        xdl0.E0(this.f1381l, new View.OnClickListener() { // from class: l.leq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5291a.m1767R(message, view);
            }
        });
        zvf0.A("e_exchange_answer_message", "p_chat_view", new j760[]{j760.a("is_initiator", Integer.valueOf(TextUtils.equals(message.additionalData.iceBreakingQA.originUserID, CoreModule.H().userId()) ? 1 : 0))});
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public final void m1768Q(View view) {
        meq.a(this, view);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1768Q(this);
        if (ura.e().d().I4()) {
            xdl0.N(this.f1373d, c3c0.A7);
            this.f1374e.setTextColor(getResources().getColor(a1c0.i));
            this.f1375f.setTextColor(getResources().getColor(a1c0.i));
            xdl0.N(this.f1376g, c3c0.z7);
            this.f1377h.setTextColor(getResources().getColor(a1c0.i));
            xdl0.N(this.f1378i, c3c0.y7);
            this.f1379j.setTextColor(getResources().getColor(a1c0.g));
            this.f1381l.setTextColor(getResources().getColor(a1c0.j));
        }
    }

    public ItemSwapAnswerMessage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ItemSwapAnswerMessage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
