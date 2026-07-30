package com.p051p1.mobile.putong.core.p058ui.messages.aichat;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4891g;
import com.p051p1.mobile.putong.core.data.AIMessageFeedback;
import com.p051p1.mobile.putong.core.data.AiChatMessageExtraInfo;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p151v.VLinear;
import p153l.C15879b0;
import p153l.bnl0;
import p153l.psd0;
import p153l.qcj;
import p153l.r1j0;
import p153l.sfj0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class AIChatMessageAnalysisItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f32550a;

    /* JADX INFO: renamed from: b */
    public ImageView f32551b;

    /* JADX INFO: renamed from: c */
    public TextView f32552c;

    /* JADX INFO: renamed from: d */
    public TextTypeView f32553d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f32554e;

    /* JADX INFO: renamed from: f */
    public VLinear f32555f;

    /* JADX INFO: renamed from: g */
    public VLinear f32556g;

    /* JADX INFO: renamed from: h */
    public VLinear f32557h;

    /* JADX INFO: renamed from: i */
    public AiChatMessageExtraInfo f32558i;

    /* JADX INFO: renamed from: j */
    public MessagesAct f32559j;

    /* JADX INFO: renamed from: k */
    public Message f32560k;

    public AIChatMessageAnalysisItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m50201g(View view) {
        C15879b0.m101237a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final void m50202h(boolean z) {
        MessagesAct messagesAct = this.f32559j;
        if (messagesAct == null) {
            return;
        }
        messagesAct.duringCreated(CoreModule.f18264c.f20440x2.m112770l3(this.f32560k.f56859id, z)).flatMap(new qcj() { // from class: l.x
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f191852a.m50204j((Envelope) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.y
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196935a.m50205k((Message) obj);
            }
        }, new y20() { // from class: l.z
            @Override // p153l.y20
            public final void call(Object obj) {
                r1j0.m179414a(R$string.f21461B2);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public void m50203i() {
        bnl0.m105509E0(this.f32557h, new View.OnClickListener() { // from class: l.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181827a.m50206l(view);
            }
        });
        bnl0.m105509E0(this.f32556g, new View.OnClickListener() { // from class: l.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186522a.m50207m(view);
            }
        });
        SVGALoader.with(getContext()).from("https://fe-static.tancdn.com/v1/raw/0c2db6c3-0413-4e94-a64e-33a31fa835a214.svga").repeatCount(-1).autoPlay(false).into(this.f32554e);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C22421c m50204j(Envelope envelope) {
        C4891g c4891g = CoreModule.f18264c.f20384f0;
        Message message = this.f32560k;
        return c4891g.m33725Ln(message.cid, message.f56859id, true);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m50205k(Message message) {
        r1j0.m179420g("意见已收到，谢谢！");
        bnl0.m105524M(this.f32555f, false);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m50206l(View view) {
        AiChatMessageExtraInfo aiChatMessageExtraInfo = this.f32558i;
        sfj0.m185596c("e_ai_chat_analysis_effect", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("response_uuid", aiChatMessageExtraInfo == null ? "" : aiChatMessageExtraInfo.response_uuid), sfj0.C20032a.m185615h("action_type_ai", AIMessageFeedback.good), sfj0.C20032a.m185615h("ai_msg_id", this.f32560k.f56859id));
        m50202h(true);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m50207m(View view) {
        AiChatMessageExtraInfo aiChatMessageExtraInfo = this.f32558i;
        sfj0.m185596c("e_ai_chat_analysis_effect", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("response_uuid", aiChatMessageExtraInfo == null ? "" : aiChatMessageExtraInfo.response_uuid), sfj0.C20032a.m185615h("action_type_ai", AIMessageFeedback.bad), sfj0.C20032a.m185615h("ai_msg_id", this.f32560k.f56859id));
        m50202h(false);
    }

    /* JADX INFO: renamed from: n */
    public void m50208n(MessagesAct messagesAct, Message message) {
        this.f32559j = messagesAct;
        this.f32560k = message;
        AiChatMessageExtraInfo aiChatMessageExtraInfo = message.getAiChatMessageExtraInfo();
        this.f32558i = aiChatMessageExtraInfo;
        if (!NullChecker.m82486a(aiChatMessageExtraInfo)) {
            m50210p();
            return;
        }
        boolean zEquals = TextUtils.equals(this.f32558i.scene, "compatibility");
        TextView textView = this.f32552c;
        if (zEquals) {
            textView.setText("帮你看看与对方的匹配度");
        } else {
            textView.setText("帮你看看对方在想什么？");
        }
        if (TEnum.equals(this.f32558i.status, "pending")) {
            m50211q();
        } else if (!TEnum.equals(this.f32558i.status, "success") || TextUtils.isEmpty(this.f32558i.content)) {
            m50210p();
        } else {
            m50209o();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m50209o() {
        sfj0.m185601h("e_ai_chat_analysis_result", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("response_uuid", this.f32558i.response_uuid), sfj0.C20032a.m185615h("is_success_ai", "true"), sfj0.C20032a.m185615h("ai_msg_id", this.f32560k.f56859id));
        this.f32554e.stopAnimation(true);
        bnl0.m105524M(this.f32554e, false);
        boolean zEquals = TextUtils.equals(this.f32560k.f56859id, CoreModule.f18264c.f20440x2.m112773o3());
        TextTypeView textTypeView = this.f32553d;
        if (zEquals) {
            textTypeView.setListener(new TextTypeView.InterfaceC8686b() { // from class: l.a0
                @Override // com.p051p1.mobile.putong.core.p058ui.messages.aichat.TextTypeView.InterfaceC8686b
                /* JADX INFO: renamed from: a */
                public final void mo50231a() {
                    CoreModule.f18264c.f20440x2.m112779u3("");
                }
            });
            this.f32553d.setTextAnim(this.f32558i.content);
        } else {
            textTypeView.setText(this.f32558i.content);
        }
        boolean zEquals2 = TEnum.equals(this.f32558i.feedback, "unknown_");
        VLinear vLinear = this.f32555f;
        if (!zEquals2) {
            bnl0.m105524M(vLinear, false);
        } else {
            bnl0.m105524M(vLinear, true);
            sfj0.m185601h("e_ai_chat_analysis_effect", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("response_uuid", this.f32558i.response_uuid), sfj0.C20032a.m185615h("ai_msg_id", this.f32560k.f56859id));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50201g(this);
        m50203i();
    }

    /* JADX INFO: renamed from: p */
    public final void m50210p() {
        String str;
        String str2;
        if (NullChecker.m82486a(this.f32558i)) {
            AiChatMessageExtraInfo aiChatMessageExtraInfo = this.f32558i;
            str = aiChatMessageExtraInfo.content;
            str2 = aiChatMessageExtraInfo.response_uuid;
        } else {
            str = "";
            str2 = "";
        }
        sfj0.m185601h("e_ai_chat_analysis_result", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("response_uuid", str2), sfj0.C20032a.m185615h("is_success_ai", "false"), sfj0.C20032a.m185615h("ai_msg_id", this.f32560k.f56859id));
        bnl0.m105524M(this.f32555f, false);
        this.f32554e.stopAnimation(true);
        bnl0.m105524M(this.f32554e, false);
        if (TextUtils.isEmpty(str)) {
            str = "加载失败，请稍后重试";
        }
        this.f32553d.setText(str);
    }

    /* JADX INFO: renamed from: q */
    public final void m50211q() {
        bnl0.m105524M(this.f32555f, false);
        bnl0.m105524M(this.f32554e, true);
        this.f32554e.startAnimation();
        this.f32553d.setText("");
    }

    public AIChatMessageAnalysisItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AIChatMessageAnalysisItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
