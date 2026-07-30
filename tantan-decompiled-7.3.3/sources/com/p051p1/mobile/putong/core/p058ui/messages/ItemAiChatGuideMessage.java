package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.AIChatAnalysis;
import com.p051p1.mobile.putong.core.data.AiChatMessageExtraInfo;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.could.component.common.p084ai.eventreport.entry.NetWorkParam;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p153l.bnl0;
import p153l.bsj0;
import p153l.fo0;
import p153l.i2q;
import p153l.ibc0;
import p153l.joa;
import p153l.kcg0;
import p153l.psd0;
import p153l.pzi0;
import p153l.qcj;
import p153l.r1j0;
import p153l.sfj0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemAiChatGuideMessage extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ItemAiChatGuideMessage f31601a;

    /* JADX INFO: renamed from: b */
    public ImageView f31602b;

    /* JADX INFO: renamed from: c */
    public ImageView f31603c;

    /* JADX INFO: renamed from: d */
    public TextView f31604d;

    /* JADX INFO: renamed from: e */
    public TextView f31605e;

    /* JADX INFO: renamed from: f */
    public TextView f31606f;

    /* JADX INFO: renamed from: g */
    public MessagesAct f31607g;

    /* JADX INFO: renamed from: h */
    public String f31608h;

    /* JADX INFO: renamed from: i */
    public String f31609i;

    /* JADX INFO: renamed from: j */
    public kcg0 f31610j;

    /* JADX INFO: renamed from: k */
    public final int f31611k;

    public ItemAiChatGuideMessage(Context context) {
        super(context);
        this.f31608h = "guide_type_analyze";
        this.f31609i = "";
        this.f31611k = NetWorkParam.DEFAULT_CONNECT_TIME_OUT;
    }

    /* JADX INFO: renamed from: i */
    public final void m49149i(View view) {
        i2q.m138233a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final void m49150j() {
        this.f31607g.duringCreated(CoreModule.f18264c.f20440x2.m112771m3(this.f31607g.mo50158l().mo111034r3())).subscribe(psd0.m173597H(new y20() { // from class: l.c2q
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79509a.m49151k((AIChatAnalysis) obj);
            }
        }, new y20() { // from class: l.d2q
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84810a.m49152l((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m49151k(AIChatAnalysis aIChatAnalysis) {
        this.f31609i = aIChatAnalysis.messageId;
        CoreModule.f18264c.f20384f0.m33737Mn(this.f31607g.mo50158l().f82474c, this.f31609i, false, aIChatAnalysis.scene);
        this.f31607g.m50164y2().m178930Z1();
        m49162v(aIChatAnalysis.scene);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m49152l(Throwable th) {
        this.f31609i = "";
        if (!(th instanceof TantanException.Client.CoreService)) {
            r1j0.m179414a(R$string.f21461B2);
            return;
        }
        int i = ((TantanException.Client.CoreService) th).subCode;
        if (i == 40001) {
            r1j0.m179420g("今日次数已用完，明天再来试试吧！");
            return;
        }
        if (i == 40002) {
            r1j0.m179420g("正在努力生成中，请稍候片刻哦！");
        } else if (i == 40003) {
            r1j0.m179420g("聊天至少得来回一轮，才能帮你分析哦！");
        } else {
            r1j0.m179419f(R$string.f21461B2);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m49153m(MessagesAct messagesAct, View view) {
        m49160t("start");
        CoreModule.f18264c.f20384f0.m33705Kf(messagesAct.mo50158l().m110989i3());
        if (TextUtils.equals(this.f31608h, "guide_type_analyze")) {
            if (joa.m146395k3() <= 0) {
                r1j0.m179420g("当前无可用次数");
                return;
            } else {
                m49150j();
                return;
            }
        }
        if (joa.m146397l3() <= 0) {
            r1j0.m179420g("当前无可用次数");
        } else {
            messagesAct.m50156e2();
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m49154n(MessagesAct messagesAct, View view) {
        m49160t("close");
        CoreModule.f18264c.f20384f0.m33705Kf(messagesAct.mo50158l().m110989i3());
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Boolean m49155o(Long l2) {
        return Boolean.valueOf(TextUtils.isEmpty(this.f31609i));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49149i(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C22421c m49156p(String str, Long l2) {
        return CoreModule.f18264c.f20384f0.m33737Mn(this.f31607g.mo50158l().f82474c, this.f31609i, true, str);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m49157q(long j, Message message) {
        AiChatMessageExtraInfo aiChatMessageExtraInfo = message.getAiChatMessageExtraInfo();
        if (!NullChecker.m82486a(aiChatMessageExtraInfo) || !TEnum.equals(aiChatMessageExtraInfo.status, "pending")) {
            CoreModule.f18264c.f20297C0.m146425v4();
            this.f31609i = null;
        }
        this.f31607g.m50164y2().m178930Z1();
        if (pzi0.m174454o() - j > 15000) {
            bsj0.m106263U(this.f31610j);
            this.f31609i = null;
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m49158r(Throwable th) {
        bsj0.m106263U(this.f31610j);
        this.f31609i = null;
    }

    /* JADX INFO: renamed from: s */
    public void m49159s(final MessagesAct messagesAct, Message message) {
        this.f31607g = messagesAct;
        if (NullChecker.m82486a(message)) {
            if (NullChecker.m82486a(message.additionalData) && NullChecker.m82486a(message.additionalData.aiChatGuideType) && TextUtils.equals(message.additionalData.aiChatGuideType, "guide_type_analyze")) {
                this.f31608h = "guide_type_analyze";
                this.f31602b.setImageResource(ibc0.f113913T1);
                this.f31604d.setText("情感分析");
                this.f31605e.setText("帮你看看对方在想什么？");
                this.f31606f.setText("立即分析");
            } else {
                this.f31608h = "guide_type_answer";
                this.f31602b.setImageResource(ibc0.f113921U1);
                this.f31604d.setText("智能话术");
                this.f31605e.setText("如何回复能让对方满意？");
                this.f31606f.setText("立即生成");
            }
            m49161u();
            bnl0.m105509E0(this.f31606f, new View.OnClickListener() { // from class: l.a2q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f68016a.m49153m(messagesAct, view);
                }
            });
            bnl0.m105509E0(this.f31603c, new View.OnClickListener() { // from class: l.b2q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f74646a.m49154n(messagesAct, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: t */
    public void m49160t(String str) {
        sfj0.m185596c("e_ai_guide", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("guide_type_ai", TextUtils.equals(this.f31608h, "guide_type_answer") ? "smart_scripts" : "chat_analysis"), sfj0.C20032a.m185615h("click_type_ai", str));
    }

    /* JADX INFO: renamed from: u */
    public final void m49161u() {
        sfj0.m185601h("e_ai_guide", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("guide_type_ai", TextUtils.equals(this.f31608h, "guide_type_answer") ? "smart_scripts" : "chat_analysis"));
    }

    /* JADX INFO: renamed from: v */
    public final void m49162v(final String str) {
        bsj0.m106263U(this.f31610j);
        final long jM174454o = pzi0.m174454o();
        this.f31610j = this.f31607g.duringCreated(C22421c.interval(2L, 2L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).takeUntil(new qcj() { // from class: l.e2q
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f91822a.m49155o((Long) obj);
            }
        }).flatMap(new qcj() { // from class: l.f2q
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f96897a.m49156p(str, (Long) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.g2q
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101866a.m49157q(jM174454o, (Message) obj);
            }
        }, new y20() { // from class: l.h2q
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107578a.m49158r((Throwable) obj);
            }
        }));
    }

    public ItemAiChatGuideMessage(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31608h = "guide_type_analyze";
        this.f31609i = "";
        this.f31611k = NetWorkParam.DEFAULT_CONNECT_TIME_OUT;
    }

    public ItemAiChatGuideMessage(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31608h = "guide_type_analyze";
        this.f31609i = "";
        this.f31611k = NetWorkParam.DEFAULT_CONNECT_TIME_OUT;
    }
}
