package com.p000p1.mobile.putong.core.p001ui.messages.aichat;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.g;
import com.p1.mobile.putong.core.data.AiChatMessageExtraInfo;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.b0;
import l.mkd0;
import l.o6j0;
import l.osi0;
import l.xdl0;
import p003l.e30;
import p003l.m250;
import p003l.w9j;
import p014rx.C1099c;
import p028v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class AIChatMessageAnalysisItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f1593a;

    /* JADX INFO: renamed from: b */
    public ImageView f1594b;

    /* JADX INFO: renamed from: c */
    public TextView f1595c;

    /* JADX INFO: renamed from: d */
    public TextTypeView f1596d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f1597e;

    /* JADX INFO: renamed from: f */
    public VLinear f1598f;

    /* JADX INFO: renamed from: g */
    public VLinear f1599g;

    /* JADX INFO: renamed from: h */
    public VLinear f1600h;

    /* JADX INFO: renamed from: i */
    public AiChatMessageExtraInfo f1601i;

    /* JADX INFO: renamed from: j */
    public MessagesAct f1602j;

    /* JADX INFO: renamed from: k */
    public Message f1603k;

    public AIChatMessageAnalysisItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m2116g(View view) {
        b0.a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final void m2117h(boolean z) {
        MessagesAct messagesAct = this.f1602j;
        if (messagesAct == null) {
            return;
        }
        messagesAct.duringCreated(CoreModule.c.x2.l3(((DbObject) this.f1603k).id, z)).flatMap(new w9j() { // from class: l.x
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f8729a.m2119j((Envelope) obj);
            }
        }).subscribe((m250) mkd0.H(new e30() { // from class: l.y
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8887a.m2120k((Message) obj);
            }
        }, new e30() { // from class: l.z
            @Override // p003l.e30
            public final void call(Object obj) {
                osi0.a(R.string.B2);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public void m2118i() {
        xdl0.E0(this.f1600h, new View.OnClickListener() { // from class: l.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8141a.m2121l(view);
            }
        });
        xdl0.E0(this.f1599g, new View.OnClickListener() { // from class: l.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8477a.m2122m(view);
            }
        });
        SVGALoader.with(getContext()).from("https://fe-static.tancdn.com/v1/raw/0c2db6c3-0413-4e94-a64e-33a31fa835a214.svga").repeatCount(-1).autoPlay(false).into(this.f1597e);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1099c m2119j(Envelope envelope) {
        g gVar = CoreModule.c.f0;
        Message message = this.f1603k;
        return gVar.Ln(message.cid, ((DbObject) message).id, true);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m2120k(Message message) {
        osi0.g("意见已收到，谢谢！");
        xdl0.M(this.f1598f, false);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m2121l(View view) {
        AiChatMessageExtraInfo aiChatMessageExtraInfo = this.f1601i;
        o6j0.c("e_ai_chat_analysis_effect", "p_chat_view", new o6j0.a[]{o6j0.a.h("response_uuid", aiChatMessageExtraInfo == null ? "" : aiChatMessageExtraInfo.response_uuid), o6j0.a.h("action_type_ai", "good"), o6j0.a.h("ai_msg_id", ((DbObject) this.f1603k).id)});
        m2117h(true);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m2122m(View view) {
        AiChatMessageExtraInfo aiChatMessageExtraInfo = this.f1601i;
        o6j0.c("e_ai_chat_analysis_effect", "p_chat_view", new o6j0.a[]{o6j0.a.h("response_uuid", aiChatMessageExtraInfo == null ? "" : aiChatMessageExtraInfo.response_uuid), o6j0.a.h("action_type_ai", "bad"), o6j0.a.h("ai_msg_id", ((DbObject) this.f1603k).id)});
        m2117h(false);
    }

    /* JADX INFO: renamed from: n */
    public void m2123n(MessagesAct messagesAct, Message message) {
        this.f1602j = messagesAct;
        this.f1603k = message;
        AiChatMessageExtraInfo aiChatMessageExtraInfo = message.getAiChatMessageExtraInfo();
        this.f1601i = aiChatMessageExtraInfo;
        if (!NullChecker.a(aiChatMessageExtraInfo)) {
            m2125p();
            return;
        }
        boolean zEquals = TextUtils.equals(this.f1601i.scene, "compatibility");
        TextView textView = this.f1595c;
        if (zEquals) {
            textView.setText("帮你看看与对方的匹配度");
        } else {
            textView.setText("帮你看看对方在想什么？");
        }
        if (TEnum.equals(this.f1601i.status, "pending")) {
            m2126q();
        } else if (!TEnum.equals(this.f1601i.status, "success") || TextUtils.isEmpty(this.f1601i.content)) {
            m2125p();
        } else {
            m2124o();
        }
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [android.widget.TextView, com.p1.mobile.putong.core.ui.messages.aichat.TextTypeView] */
    /* JADX INFO: renamed from: o */
    public final void m2124o() {
        o6j0.h("e_ai_chat_analysis_result", "p_chat_view", new o6j0.a[]{o6j0.a.h("response_uuid", this.f1601i.response_uuid), o6j0.a.h("is_success_ai", "true"), o6j0.a.h("ai_msg_id", ((DbObject) this.f1603k).id)});
        this.f1597e.stopAnimation(true);
        xdl0.M(this.f1597e, false);
        boolean zEquals = TextUtils.equals(((DbObject) this.f1603k).id, CoreModule.c.x2.o3());
        ?? r6 = this.f1596d;
        if (zEquals) {
            r6.setListener(new TextTypeView.InterfaceC0106b() { // from class: l.a0
                @Override // com.p000p1.mobile.putong.core.p001ui.messages.aichat.TextTypeView.InterfaceC0106b
                /* JADX INFO: renamed from: a */
                public final void mo2146a() {
                    CoreModule.c.x2.u3("");
                }
            });
            this.f1596d.setTextAnim(this.f1601i.content);
        } else {
            r6.setText(this.f1601i.content);
        }
        boolean zEquals2 = TEnum.equals(this.f1601i.feedback, "unknown_");
        VLinear vLinear = this.f1598f;
        if (!zEquals2) {
            xdl0.M(vLinear, false);
        } else {
            xdl0.M(vLinear, true);
            o6j0.h("e_ai_chat_analysis_effect", "p_chat_view", new o6j0.a[]{o6j0.a.h("response_uuid", this.f1601i.response_uuid), o6j0.a.h("ai_msg_id", ((DbObject) this.f1603k).id)});
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2116g(this);
        m2118i();
    }

    /* JADX INFO: renamed from: p */
    public final void m2125p() {
        CharSequence charSequence;
        String str;
        if (NullChecker.a(this.f1601i)) {
            AiChatMessageExtraInfo aiChatMessageExtraInfo = this.f1601i;
            charSequence = aiChatMessageExtraInfo.content;
            str = aiChatMessageExtraInfo.response_uuid;
        } else {
            charSequence = "";
            str = "";
        }
        o6j0.h("e_ai_chat_analysis_result", "p_chat_view", new o6j0.a[]{o6j0.a.h("response_uuid", str), o6j0.a.h("is_success_ai", "false"), o6j0.a.h("ai_msg_id", ((DbObject) this.f1603k).id)});
        xdl0.M(this.f1598f, false);
        this.f1597e.stopAnimation(true);
        xdl0.M(this.f1597e, false);
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = "加载失败，请稍后重试";
        }
        this.f1596d.setText(charSequence);
    }

    /* JADX INFO: renamed from: q */
    public final void m2126q() {
        xdl0.M(this.f1598f, false);
        xdl0.M(this.f1597e, true);
        this.f1597e.startAnimation();
        this.f1596d.setText("");
    }

    public AIChatMessageAnalysisItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AIChatMessageAnalysisItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
