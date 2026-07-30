package com.p046p1.mobile.putong.core.p053ui.messages.aichat;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4740g;
import com.p046p1.mobile.putong.core.data.AIMessageFeedback;
import com.p046p1.mobile.putong.core.data.AiChatMessageExtraInfo;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p147v.VLinear;
import p149l.C15769b0;
import p149l.e30;
import p149l.mkd0;
import p149l.o6j0;
import p149l.osi0;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class AIChatMessageAnalysisItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f31702a;

    /* JADX INFO: renamed from: b */
    public ImageView f31703b;

    /* JADX INFO: renamed from: c */
    public TextView f31704c;

    /* JADX INFO: renamed from: d */
    public TextTypeView f31705d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f31706e;

    /* JADX INFO: renamed from: f */
    public VLinear f31707f;

    /* JADX INFO: renamed from: g */
    public VLinear f31708g;

    /* JADX INFO: renamed from: h */
    public VLinear f31709h;

    /* JADX INFO: renamed from: i */
    public AiChatMessageExtraInfo f31710i;

    /* JADX INFO: renamed from: j */
    public MessagesAct f31711j;

    /* JADX INFO: renamed from: k */
    public Message f31712k;

    public AIChatMessageAnalysisItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m49018g(View view) {
        C15769b0.m99732a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final void m49019h(boolean z) {
        MessagesAct messagesAct = this.f31711j;
        if (messagesAct == null) {
            return;
        }
        messagesAct.duringCreated(CoreModule.f17545c.f19698x2.m220105l3(this.f31712k.f56011id, z)).flatMap(new w9j() { // from class: l.x
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f188776a.m49021j((Envelope) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.y
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195237a.m49022k((Message) obj);
            }
        }, new e30() { // from class: l.z
            @Override // p149l.e30
            public final void call(Object obj) {
                osi0.m165777a(R$string.f20719B2);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public void m49020i() {
        xdl0.m208329E0(this.f31709h, new View.OnClickListener() { // from class: l.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179044a.m49023l(view);
            }
        });
        xdl0.m208329E0(this.f31708g, new View.OnClickListener() { // from class: l.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183696a.m49024m(view);
            }
        });
        SVGALoader.with(getContext()).from("https://fe-static.tancdn.com/v1/raw/0c2db6c3-0413-4e94-a64e-33a31fa835a214.svga").repeatCount(-1).autoPlay(false).into(this.f31706e);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C22306c m49021j(Envelope envelope) {
        C4740g c4740g = CoreModule.f17545c.f19642f0;
        Message message = this.f31712k;
        return c4740g.m32722Ln(message.cid, message.f56011id, true);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m49022k(Message message) {
        osi0.m165783g("意见已收到，谢谢！");
        xdl0.m208344M(this.f31707f, false);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m49023l(View view) {
        AiChatMessageExtraInfo aiChatMessageExtraInfo = this.f31710i;
        o6j0.m162859c("e_ai_chat_analysis_effect", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("response_uuid", aiChatMessageExtraInfo == null ? "" : aiChatMessageExtraInfo.response_uuid), o6j0.C18854a.m162878h("action_type_ai", AIMessageFeedback.good), o6j0.C18854a.m162878h("ai_msg_id", this.f31712k.f56011id));
        m49019h(true);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m49024m(View view) {
        AiChatMessageExtraInfo aiChatMessageExtraInfo = this.f31710i;
        o6j0.m162859c("e_ai_chat_analysis_effect", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("response_uuid", aiChatMessageExtraInfo == null ? "" : aiChatMessageExtraInfo.response_uuid), o6j0.C18854a.m162878h("action_type_ai", AIMessageFeedback.bad), o6j0.C18854a.m162878h("ai_msg_id", this.f31712k.f56011id));
        m49019h(false);
    }

    /* JADX INFO: renamed from: n */
    public void m49025n(MessagesAct messagesAct, Message message) {
        this.f31711j = messagesAct;
        this.f31712k = message;
        AiChatMessageExtraInfo aiChatMessageExtraInfo = message.getAiChatMessageExtraInfo();
        this.f31710i = aiChatMessageExtraInfo;
        if (!NullChecker.m81303a(aiChatMessageExtraInfo)) {
            m49027p();
            return;
        }
        boolean zEquals = TextUtils.equals(this.f31710i.scene, "compatibility");
        TextView textView = this.f31704c;
        if (zEquals) {
            textView.setText("帮你看看与对方的匹配度");
        } else {
            textView.setText("帮你看看对方在想什么？");
        }
        if (TEnum.equals(this.f31710i.status, "pending")) {
            m49028q();
        } else if (!TEnum.equals(this.f31710i.status, "success") || TextUtils.isEmpty(this.f31710i.content)) {
            m49027p();
        } else {
            m49026o();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m49026o() {
        o6j0.m162864h("e_ai_chat_analysis_result", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("response_uuid", this.f31710i.response_uuid), o6j0.C18854a.m162878h("is_success_ai", "true"), o6j0.C18854a.m162878h("ai_msg_id", this.f31712k.f56011id));
        this.f31706e.stopAnimation(true);
        xdl0.m208344M(this.f31706e, false);
        boolean zEquals = TextUtils.equals(this.f31712k.f56011id, CoreModule.f17545c.f19698x2.m220108o3());
        TextTypeView textTypeView = this.f31705d;
        if (zEquals) {
            textTypeView.setListener(new TextTypeView.InterfaceC8523b() { // from class: l.a0
                @Override // com.p046p1.mobile.putong.core.p053ui.messages.aichat.TextTypeView.InterfaceC8523b
                /* JADX INFO: renamed from: a */
                public final void mo49048a() {
                    CoreModule.f17545c.f19698x2.m220114u3("");
                }
            });
            this.f31705d.setTextAnim(this.f31710i.content);
        } else {
            textTypeView.setText(this.f31710i.content);
        }
        boolean zEquals2 = TEnum.equals(this.f31710i.feedback, "unknown_");
        VLinear vLinear = this.f31707f;
        if (!zEquals2) {
            xdl0.m208344M(vLinear, false);
        } else {
            xdl0.m208344M(vLinear, true);
            o6j0.m162864h("e_ai_chat_analysis_effect", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("response_uuid", this.f31710i.response_uuid), o6j0.C18854a.m162878h("ai_msg_id", this.f31712k.f56011id));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49018g(this);
        m49020i();
    }

    /* JADX INFO: renamed from: p */
    public final void m49027p() {
        String str;
        String str2;
        if (NullChecker.m81303a(this.f31710i)) {
            AiChatMessageExtraInfo aiChatMessageExtraInfo = this.f31710i;
            str = aiChatMessageExtraInfo.content;
            str2 = aiChatMessageExtraInfo.response_uuid;
        } else {
            str = "";
            str2 = "";
        }
        o6j0.m162864h("e_ai_chat_analysis_result", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("response_uuid", str2), o6j0.C18854a.m162878h("is_success_ai", "false"), o6j0.C18854a.m162878h("ai_msg_id", this.f31712k.f56011id));
        xdl0.m208344M(this.f31707f, false);
        this.f31706e.stopAnimation(true);
        xdl0.m208344M(this.f31706e, false);
        if (TextUtils.isEmpty(str)) {
            str = "加载失败，请稍后重试";
        }
        this.f31705d.setText(str);
    }

    /* JADX INFO: renamed from: q */
    public final void m49028q() {
        xdl0.m208344M(this.f31707f, false);
        xdl0.m208344M(this.f31706e, true);
        this.f31706e.startAnimation();
        this.f31705d.setText("");
    }

    public AIChatMessageAnalysisItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AIChatMessageAnalysisItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
