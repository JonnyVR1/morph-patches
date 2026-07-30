package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.AIChatAnalysis;
import com.p1.mobile.putong.core.data.AiChatMessageExtraInfo;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import l.c3c0;
import l.i0q;
import l.mkd0;
import l.mqi0;
import l.o6j0;
import l.osi0;
import l.xdl0;
import l.xma;
import l.yij0;
import org.eclipse.jetty.http.HttpHeaderValues;
import p003l.c4g0;
import p003l.e30;
import p003l.jo0;
import p003l.m250;
import p003l.w9j;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemAiChatGuideMessage extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ItemAiChatGuideMessage f644a;

    /* JADX INFO: renamed from: b */
    public ImageView f645b;

    /* JADX INFO: renamed from: c */
    public ImageView f646c;

    /* JADX INFO: renamed from: d */
    public TextView f647d;

    /* JADX INFO: renamed from: e */
    public TextView f648e;

    /* JADX INFO: renamed from: f */
    public TextView f649f;

    /* JADX INFO: renamed from: g */
    public MessagesAct f650g;

    /* JADX INFO: renamed from: h */
    public String f651h;

    /* JADX INFO: renamed from: i */
    public String f652i;

    /* JADX INFO: renamed from: j */
    public c4g0 f653j;

    /* JADX INFO: renamed from: k */
    public final int f654k;

    public ItemAiChatGuideMessage(Context context) {
        super(context);
        this.f651h = "guide_type_analyze";
        this.f652i = "";
        this.f654k = 15000;
    }

    /* JADX INFO: renamed from: i */
    public final void m1041i(View view) {
        i0q.a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final void m1042j() {
        this.f650g.duringCreated(CoreModule.c.x2.m3(this.f650g.mo2066l().m4295r3())).subscribe((m250) mkd0.H(new e30() { // from class: l.c0q
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2559a.m1043k((AIChatAnalysis) obj);
            }
        }, new e30() { // from class: l.d0q
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2888a.m1044l((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m1043k(AIChatAnalysis aIChatAnalysis) {
        this.f652i = aIChatAnalysis.messageId;
        CoreModule.c.f0.Mn(this.f650g.mo2066l().f3543c, this.f652i, false, aIChatAnalysis.scene);
        this.f650g.m2072w2().m7912Z1();
        m1054v(aIChatAnalysis.scene);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m1044l(Throwable th) {
        this.f652i = "";
        if (!(th instanceof TantanException.Client.CoreService)) {
            osi0.a(R.string.B2);
            return;
        }
        int i = ((TantanException.Client.CoreService) th).subCode;
        if (i == 40001) {
            osi0.g("今日次数已用完，明天再来试试吧！");
            return;
        }
        if (i == 40002) {
            osi0.g("正在努力生成中，请稍候片刻哦！");
        } else if (i == 40003) {
            osi0.g("聊天至少得来回一轮，才能帮你分析哦！");
        } else {
            osi0.f(R.string.B2);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m1045m(MessagesAct messagesAct, View view) {
        m1052t("start");
        CoreModule.c.f0.Kf(messagesAct.mo2066l().m4250i3());
        if (TextUtils.equals(this.f651h, "guide_type_analyze")) {
            if (xma.k3() <= 0) {
                osi0.g("当前无可用次数");
                return;
            } else {
                m1042j();
                return;
            }
        }
        if (xma.l3() <= 0) {
            osi0.g("当前无可用次数");
        } else {
            messagesAct.m2064d2();
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m1046n(MessagesAct messagesAct, View view) {
        m1052t(HttpHeaderValues.CLOSE);
        CoreModule.c.f0.Kf(messagesAct.mo2066l().m4250i3());
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Boolean m1047o(Long l2) {
        return Boolean.valueOf(TextUtils.isEmpty(this.f652i));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1041i(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C1099c m1048p(String str, Long l2) {
        return CoreModule.c.f0.Mn(this.f650g.mo2066l().f3543c, this.f652i, true, str);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m1049q(long j, Message message) {
        AiChatMessageExtraInfo aiChatMessageExtraInfo = message.getAiChatMessageExtraInfo();
        if (!NullChecker.a(aiChatMessageExtraInfo) || !TEnum.equals(aiChatMessageExtraInfo.status, "pending")) {
            CoreModule.c.C0.u4();
            this.f652i = null;
        }
        this.f650g.m2072w2().m7912Z1();
        if (mqi0.o() - j > 15000) {
            yij0.U(this.f653j);
            this.f652i = null;
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m1050r(Throwable th) {
        yij0.U(this.f653j);
        this.f652i = null;
    }

    /* JADX INFO: renamed from: s */
    public void m1051s(final MessagesAct messagesAct, Message message) {
        this.f650g = messagesAct;
        if (NullChecker.a(message)) {
            if (NullChecker.a(message.additionalData) && NullChecker.a(message.additionalData.aiChatGuideType) && TextUtils.equals(message.additionalData.aiChatGuideType, "guide_type_analyze")) {
                this.f651h = "guide_type_analyze";
                this.f645b.setImageResource(c3c0.T1);
                this.f647d.setText("情感分析");
                this.f648e.setText("帮你看看对方在想什么？");
                this.f649f.setText("立即分析");
            } else {
                this.f651h = "guide_type_answer";
                this.f645b.setImageResource(c3c0.U1);
                this.f647d.setText("智能话术");
                this.f648e.setText("如何回复能让对方满意？");
                this.f649f.setText("立即生成");
            }
            m1053u();
            xdl0.E0(this.f649f, new View.OnClickListener() { // from class: l.a0q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f2070a.m1045m(messagesAct, view);
                }
            });
            xdl0.E0(this.f646c, new View.OnClickListener() { // from class: l.b0q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f2333a.m1046n(messagesAct, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: t */
    public void m1052t(String str) {
        o6j0.c("e_ai_guide", "p_chat_view", new o6j0.a[]{o6j0.a.h("guide_type_ai", TextUtils.equals(this.f651h, "guide_type_answer") ? "smart_scripts" : "chat_analysis"), o6j0.a.h("click_type_ai", str)});
    }

    /* JADX INFO: renamed from: u */
    public final void m1053u() {
        o6j0.h("e_ai_guide", "p_chat_view", new o6j0.a[]{o6j0.a.h("guide_type_ai", TextUtils.equals(this.f651h, "guide_type_answer") ? "smart_scripts" : "chat_analysis")});
    }

    /* JADX INFO: renamed from: v */
    public final void m1054v(final String str) {
        yij0.U(this.f653j);
        final long jO = mqi0.o();
        this.f653j = this.f650g.duringCreated(C1099c.interval(2L, 2L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m5414a()).takeUntil(new w9j() { // from class: l.e0q
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f3179a.m1047o((Long) obj);
            }
        }).flatMap(new w9j() { // from class: l.f0q
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f3432a.m1048p(str, (Long) obj);
            }
        }).subscribe((m250) mkd0.H(new e30() { // from class: l.g0q
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3785a.m1049q(jO, (Message) obj);
            }
        }, new e30() { // from class: l.h0q
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4095a.m1050r((Throwable) obj);
            }
        }));
    }

    public ItemAiChatGuideMessage(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f651h = "guide_type_analyze";
        this.f652i = "";
        this.f654k = 15000;
    }

    public ItemAiChatGuideMessage(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f651h = "guide_type_analyze";
        this.f652i = "";
        this.f654k = 15000;
    }
}
