package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.AIChatAnalysis;
import com.p046p1.mobile.putong.core.data.AiChatMessageExtraInfo;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.could.component.common.p079ai.eventreport.entry.NetWorkParam;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p149l.c3c0;
import p149l.c4g0;
import p149l.e30;
import p149l.i0q;
import p149l.jo0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.o6j0;
import p149l.osi0;
import p149l.w9j;
import p149l.xdl0;
import p149l.xma;
import p149l.yij0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemAiChatGuideMessage extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ItemAiChatGuideMessage f30753a;

    /* JADX INFO: renamed from: b */
    public ImageView f30754b;

    /* JADX INFO: renamed from: c */
    public ImageView f30755c;

    /* JADX INFO: renamed from: d */
    public TextView f30756d;

    /* JADX INFO: renamed from: e */
    public TextView f30757e;

    /* JADX INFO: renamed from: f */
    public TextView f30758f;

    /* JADX INFO: renamed from: g */
    public MessagesAct f30759g;

    /* JADX INFO: renamed from: h */
    public String f30760h;

    /* JADX INFO: renamed from: i */
    public String f30761i;

    /* JADX INFO: renamed from: j */
    public c4g0 f30762j;

    /* JADX INFO: renamed from: k */
    public final int f30763k;

    public ItemAiChatGuideMessage(Context context) {
        super(context);
        this.f30760h = "guide_type_analyze";
        this.f30761i = "";
        this.f30763k = NetWorkParam.DEFAULT_CONNECT_TIME_OUT;
    }

    /* JADX INFO: renamed from: i */
    public final void m47966i(View view) {
        i0q.m133902a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final void m47967j() {
        this.f30759g.duringCreated(CoreModule.f17545c.f19698x2.m220106m3(this.f30759g.mo48974l().mo120828r3())).subscribe(mkd0.m154956H(new e30() { // from class: l.c0q
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f78165a.m47968k((AIChatAnalysis) obj);
            }
        }, new e30() { // from class: l.d0q
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f83203a.m47969l((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m47968k(AIChatAnalysis aIChatAnalysis) {
        this.f30761i = aIChatAnalysis.messageId;
        CoreModule.f17545c.f19642f0.m32734Mn(this.f30759g.mo48974l().f96911c, this.f30761i, false, aIChatAnalysis.scene);
        this.f30759g.m48980w2().m190287Z1();
        m47979v(aIChatAnalysis.scene);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m47969l(Throwable th) {
        this.f30761i = "";
        if (!(th instanceof TantanException.Client.CoreService)) {
            osi0.m165777a(R$string.f20719B2);
            return;
        }
        int i = ((TantanException.Client.CoreService) th).subCode;
        if (i == 40001) {
            osi0.m165783g("今日次数已用完，明天再来试试吧！");
            return;
        }
        if (i == 40002) {
            osi0.m165783g("正在努力生成中，请稍候片刻哦！");
        } else if (i == 40003) {
            osi0.m165783g("聊天至少得来回一轮，才能帮你分析哦！");
        } else {
            osi0.m165782f(R$string.f20719B2);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m47970m(MessagesAct messagesAct, View view) {
        m47977t("start");
        CoreModule.f17545c.f19642f0.m32702Kf(messagesAct.mo48974l().m120783i3());
        if (TextUtils.equals(this.f30760h, "guide_type_analyze")) {
            if (xma.m210082k3() <= 0) {
                osi0.m165783g("当前无可用次数");
                return;
            } else {
                m47967j();
                return;
            }
        }
        if (xma.m210084l3() <= 0) {
            osi0.m165783g("当前无可用次数");
        } else {
            messagesAct.m48972d2();
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m47971n(MessagesAct messagesAct, View view) {
        m47977t("close");
        CoreModule.f17545c.f19642f0.m32702Kf(messagesAct.mo48974l().m120783i3());
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Boolean m47972o(Long l2) {
        return Boolean.valueOf(TextUtils.isEmpty(this.f30761i));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47966i(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C22306c m47973p(String str, Long l2) {
        return CoreModule.f17545c.f19642f0.m32734Mn(this.f30759g.mo48974l().f96911c, this.f30761i, true, str);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m47974q(long j, Message message) {
        AiChatMessageExtraInfo aiChatMessageExtraInfo = message.getAiChatMessageExtraInfo();
        if (!NullChecker.m81303a(aiChatMessageExtraInfo) || !TEnum.equals(aiChatMessageExtraInfo.status, "pending")) {
            CoreModule.f17545c.f19555C0.m210112u4();
            this.f30761i = null;
        }
        this.f30759g.m48980w2().m190287Z1();
        if (mqi0.m155944o() - j > 15000) {
            yij0.m214943U(this.f30762j);
            this.f30761i = null;
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m47975r(Throwable th) {
        yij0.m214943U(this.f30762j);
        this.f30761i = null;
    }

    /* JADX INFO: renamed from: s */
    public void m47976s(final MessagesAct messagesAct, Message message) {
        this.f30759g = messagesAct;
        if (NullChecker.m81303a(message)) {
            if (NullChecker.m81303a(message.additionalData) && NullChecker.m81303a(message.additionalData.aiChatGuideType) && TextUtils.equals(message.additionalData.aiChatGuideType, "guide_type_analyze")) {
                this.f30760h = "guide_type_analyze";
                this.f30754b.setImageResource(c3c0.f78638T1);
                this.f30756d.setText("情感分析");
                this.f30757e.setText("帮你看看对方在想什么？");
                this.f30758f.setText("立即分析");
            } else {
                this.f30760h = "guide_type_answer";
                this.f30754b.setImageResource(c3c0.f78646U1);
                this.f30756d.setText("智能话术");
                this.f30757e.setText("如何回复能让对方满意？");
                this.f30758f.setText("立即生成");
            }
            m47978u();
            xdl0.m208329E0(this.f30758f, new View.OnClickListener() { // from class: l.a0q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f67059a.m47970m(messagesAct, view);
                }
            });
            xdl0.m208329E0(this.f30755c, new View.OnClickListener() { // from class: l.b0q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f72454a.m47971n(messagesAct, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: t */
    public void m47977t(String str) {
        o6j0.m162859c("e_ai_guide", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("guide_type_ai", TextUtils.equals(this.f30760h, "guide_type_answer") ? "smart_scripts" : "chat_analysis"), o6j0.C18854a.m162878h("click_type_ai", str));
    }

    /* JADX INFO: renamed from: u */
    public final void m47978u() {
        o6j0.m162864h("e_ai_guide", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("guide_type_ai", TextUtils.equals(this.f30760h, "guide_type_answer") ? "smart_scripts" : "chat_analysis"));
    }

    /* JADX INFO: renamed from: v */
    public final void m47979v(final String str) {
        yij0.m214943U(this.f30762j);
        final long jM155944o = mqi0.m155944o();
        this.f30762j = this.f30759g.duringCreated(C22306c.interval(2L, 2L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).takeUntil(new w9j() { // from class: l.e0q
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f88665a.m47972o((Long) obj);
            }
        }).flatMap(new w9j() { // from class: l.f0q
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f93997a.m47973p(str, (Long) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.g0q
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100073a.m47974q(jM155944o, (Message) obj);
            }
        }, new e30() { // from class: l.h0q
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105235a.m47975r((Throwable) obj);
            }
        }));
    }

    public ItemAiChatGuideMessage(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30760h = "guide_type_analyze";
        this.f30761i = "";
        this.f30763k = NetWorkParam.DEFAULT_CONNECT_TIME_OUT;
    }

    public ItemAiChatGuideMessage(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30760h = "guide_type_analyze";
        this.f30761i = "";
        this.f30763k = NetWorkParam.DEFAULT_CONNECT_TIME_OUT;
    }
}
