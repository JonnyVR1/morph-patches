package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.RunnableC4733c0;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationAdditional;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.ConversationStatus;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.j760;
import p149l.m4q;
import p149l.mqi0;
import p149l.qsz;
import p149l.ura;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemHeartbeatNotifyNewUi extends FrameLayout implements RunnableC4733c0.c {

    /* JADX INFO: renamed from: a */
    public FrameLayout f31012a;

    /* JADX INFO: renamed from: b */
    public VImage f31013b;

    /* JADX INFO: renamed from: c */
    public VText f31014c;

    /* JADX INFO: renamed from: d */
    public VText f31015d;

    /* JADX INFO: renamed from: e */
    public View f31016e;

    /* JADX INFO: renamed from: f */
    public VText f31017f;

    /* JADX INFO: renamed from: g */
    public String f31018g;

    /* JADX INFO: renamed from: h */
    public String f31019h;

    /* JADX INFO: renamed from: i */
    public int f31020i;

    public ItemHeartbeatNotifyNewUi(@NonNull Context context) {
        super(context);
        this.f31018g = "";
        this.f31019h = "";
    }

    private void setLeave(boolean z) {
        xdl0.m208344M(this.f31012a, z);
        xdl0.m208344M(this.f31017f, !z);
    }

    /* JADX INFO: renamed from: a */
    public final void m48199a(View view) {
        m4q.m153090a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final String m48200b(long j) {
        if (j - mqi0.m155944o() > 0) {
            setLeave(false);
            return this.f31018g;
        }
        setLeave(true);
        return "匹配已解除，对方已经离开了对话";
    }

    /* JADX INFO: renamed from: c */
    public void m48201c(Message message, Conversation conversation, qsz qszVar) {
        int iMo158390i1 = 1;
        if (!CoreModule.m29935P().m94658i().mo158450u() || conversation == null || conversation.additional.heartbeatMatch == null || !conversation.isHeartbeatConv()) {
            setLeave(true);
            return;
        }
        if (conversation.additional.heartbeatMatch.isPassive) {
            this.f31019h = CoreModule.m29931H().userId();
        } else {
            this.f31019h = conversation.f56011id;
        }
        CoreModule.f17545c.f19685t1.m31515t(this);
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(conversation.f56011id);
        boolean zIsFemale = !conversation.additional.heartbeatMatch.isPassive;
        if (NullChecker.m81303a(userM169430Pa)) {
            zIsFemale = userM169430Pa.isFemale();
        }
        boolean zEquals = TEnum.equals(message.messageType(), MessageType.heartbeat_notify);
        ConversationAdditional conversationAdditional = conversation.additional;
        if (zEquals) {
            if (conversationAdditional.heartbeatMatch.isPassive) {
                this.f31018g = "快去打个招呼吧～";
            } else if (conversation.isLimitMatch()) {
                this.f31018g = "发送消息即可解锁限时";
            } else {
                this.f31018g = CoreModule.f17544b.getString(R$string.f20911Z2);
            }
            this.f31020i = 0;
        } else if (conversationAdditional.heartbeatMatch.isPassive) {
            this.f31020i = 2;
            if (conversation.isLimitMatch()) {
                this.f31018g = "发送消息即可解锁限时";
            } else {
                this.f31018g = zIsFemale ? "主动回应即可解除限时，快和她聊聊吧！" : "主动回应即可解除限时，快和他聊聊吧！";
            }
        } else {
            this.f31018g = "打招呼成功";
            this.f31020i = 1;
        }
        xdl0.m208344M(this.f31016e, false);
        long j = (long) conversation.additional.heartbeatMatch.expireTime;
        if (TEnum.equals(conversation.status, ConversationStatus.get("default")) && j > mqi0.m155944o() && conversation.isHeartbeatConv()) {
            this.f31017f.setText(m48200b((long) conversation.additional.heartbeatMatch.expireTime));
            m48203e(conversation.f56011id, (long) conversation.additional.heartbeatMatch.expireTime);
            setLeave(false);
        } else {
            this.f31020i = 3;
            setLeave(true);
        }
        if (NullChecker.m81303a(conversation) && NullChecker.m81303a(conversation.additional) && NullChecker.m81303a(conversation.additional.heartbeatMatch)) {
            iMo158390i1 = CoreModule.m29935P().m94658i().mo158390i1(conversation.additional.heartbeatMatch.source);
        }
        m48202d(qszVar, iMo158390i1);
    }

    /* JADX INFO: renamed from: d */
    public final void m48202d(qsz qszVar, int i) {
        if (qszVar.m176377a("HEARTBEAT_NOTIFY_MV_" + this.f31020i)) {
            return;
        }
        qszVar.m176378b("HEARTBEAT_NOTIFY_MV_" + this.f31020i);
        zvf0.m220368A("e_chat_love_signal", OMSDialogPositon.p_chat_view, j760.m140076a("receiver_user_id", this.f31019h), j760.m140076a("love_sign_chat_guide", Integer.valueOf(this.f31020i)), j760.m140076a("signal_resource", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: e */
    public final void m48203e(String str, long j) {
        RunnableC4733c0.a aVar = new RunnableC4733c0.a();
        aVar.m31523g("message_heartbeat_countdown_" + str);
        aVar.m31517a(true).m31522f(j).m31519c(mqi0.m155944o()).m31524h(CoreModule.m29935P().m94658i().mo158450u() ? 1L : 60L).m31520d(this);
        CoreModule.f17545c.f19685t1.m31513r(aVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoreModule.f17545c.f19685t1.m31515t(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48199a(this);
        this.f31014c.getPaint().setFakeBoldText(true);
        if (ura.m195053e().m195057d().mo33699I4()) {
            xdl0.m208346N(this.f31013b, c3c0.f78477B0);
            this.f31014c.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31015d.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f31017f.setTextColor(getResources().getColor(a1c0.f67155i));
        }
    }

    @Override // com.p046p1.mobile.putong.core.api.RunnableC4733c0.c
    /* JADX INFO: renamed from: u */
    public void mo31527u(String str, long j, long j2, long j3, long j4) {
        this.f31017f.setText(m48200b(j3));
    }

    public ItemHeartbeatNotifyNewUi(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31018g = "";
        this.f31019h = "";
    }

    public ItemHeartbeatNotifyNewUi(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31018g = "";
        this.f31019h = "";
    }
}
