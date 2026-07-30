package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.RunnableC4884c0;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationAdditional;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.ConversationStatus;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.ibc0;
import p153l.m6q;
import p153l.n100;
import p153l.pf60;
import p153l.pzi0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemHeartbeatNotifyNewUi extends FrameLayout implements RunnableC4884c0.c {

    /* JADX INFO: renamed from: a */
    public FrameLayout f31860a;

    /* JADX INFO: renamed from: b */
    public VImage f31861b;

    /* JADX INFO: renamed from: c */
    public VText f31862c;

    /* JADX INFO: renamed from: d */
    public VText f31863d;

    /* JADX INFO: renamed from: e */
    public View f31864e;

    /* JADX INFO: renamed from: f */
    public VText f31865f;

    /* JADX INFO: renamed from: g */
    public String f31866g;

    /* JADX INFO: renamed from: h */
    public String f31867h;

    /* JADX INFO: renamed from: i */
    public int f31868i;

    public ItemHeartbeatNotifyNewUi(@NonNull Context context) {
        super(context);
        this.f31866g = "";
        this.f31867h = "";
    }

    private void setLeave(boolean z) {
        bnl0.m105524M(this.f31860a, z);
        bnl0.m105524M(this.f31865f, !z);
    }

    /* JADX INFO: renamed from: a */
    public final void m49382a(View view) {
        m6q.m157260a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final String m49383b(long j) {
        if (j - pzi0.m174454o() > 0) {
            setLeave(false);
            return this.f31866g;
        }
        setLeave(true);
        return "匹配已解除，对方已经离开了对话";
    }

    /* JADX INFO: renamed from: c */
    public void m49384c(Message message, Conversation conversation, n100 n100Var) {
        int iMo180482i1 = 1;
        if (!CoreModule.m30933P().m143412i().mo180542u() || conversation == null || conversation.additional.heartbeatMatch == null || !conversation.isHeartbeatConv()) {
            setLeave(true);
            return;
        }
        if (conversation.additional.heartbeatMatch.isPassive) {
            this.f31867h = CoreModule.m30929H().userId();
        } else {
            this.f31867h = conversation.f56859id;
        }
        CoreModule.f18264c.f20427t1.m32518t(this);
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(conversation.f56859id);
        boolean zIsFemale = !conversation.additional.heartbeatMatch.isPassive;
        if (NullChecker.m82486a(userM116503Pa)) {
            zIsFemale = userM116503Pa.isFemale();
        }
        boolean zEquals = TEnum.equals(message.messageType(), MessageType.heartbeat_notify);
        ConversationAdditional conversationAdditional = conversation.additional;
        if (zEquals) {
            if (conversationAdditional.heartbeatMatch.isPassive) {
                this.f31866g = "快去打个招呼吧～";
            } else if (conversation.isLimitMatch()) {
                this.f31866g = "发送消息即可解锁限时";
            } else {
                this.f31866g = CoreModule.f18263b.getString(R$string.f21653Z2);
            }
            this.f31868i = 0;
        } else if (conversationAdditional.heartbeatMatch.isPassive) {
            this.f31868i = 2;
            if (conversation.isLimitMatch()) {
                this.f31866g = "发送消息即可解锁限时";
            } else {
                this.f31866g = zIsFemale ? "主动回应即可解除限时，快和她聊聊吧！" : "主动回应即可解除限时，快和他聊聊吧！";
            }
        } else {
            this.f31866g = "打招呼成功";
            this.f31868i = 1;
        }
        bnl0.m105524M(this.f31864e, false);
        long j = (long) conversation.additional.heartbeatMatch.expireTime;
        if (TEnum.equals(conversation.status, ConversationStatus.get("default")) && j > pzi0.m174454o() && conversation.isHeartbeatConv()) {
            this.f31865f.setText(m49383b((long) conversation.additional.heartbeatMatch.expireTime));
            m49386e(conversation.f56859id, (long) conversation.additional.heartbeatMatch.expireTime);
            setLeave(false);
        } else {
            this.f31868i = 3;
            setLeave(true);
        }
        if (NullChecker.m82486a(conversation) && NullChecker.m82486a(conversation.additional) && NullChecker.m82486a(conversation.additional.heartbeatMatch)) {
            iMo180482i1 = CoreModule.m30933P().m143412i().mo180482i1(conversation.additional.heartbeatMatch.source);
        }
        m49385d(n100Var, iMo180482i1);
    }

    /* JADX INFO: renamed from: d */
    public final void m49385d(n100 n100Var, int i) {
        if (n100Var.m161054a("HEARTBEAT_NOTIFY_MV_" + this.f31868i)) {
            return;
        }
        n100Var.m161055b("HEARTBEAT_NOTIFY_MV_" + this.f31868i);
        i4g0.m138492A("e_chat_love_signal", OMSDialogPositon.p_chat_view, pf60.m172085a("receiver_user_id", this.f31867h), pf60.m172085a("love_sign_chat_guide", Integer.valueOf(this.f31868i)), pf60.m172085a("signal_resource", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: e */
    public final void m49386e(String str, long j) {
        RunnableC4884c0.a aVar = new RunnableC4884c0.a();
        aVar.m32526g("message_heartbeat_countdown_" + str);
        aVar.m32520a(true).m32525f(j).m32522c(pzi0.m174454o()).m32527h(CoreModule.m30933P().m143412i().mo180542u() ? 1L : 60L).m32523d(this);
        CoreModule.f18264c.f20427t1.m32516r(aVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoreModule.f18264c.f20427t1.m32518t(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49382a(this);
        this.f31862c.getPaint().setFakeBoldText(true);
        if (gta.m132210e().m132214d().mo34702I4()) {
            bnl0.m105526N(this.f31861b, ibc0.f113752B0);
            this.f31862c.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f31863d.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f31865f.setTextColor(getResources().getColor(g9c0.f102819i));
        }
    }

    @Override // com.p051p1.mobile.putong.core.api.RunnableC4884c0.c
    /* JADX INFO: renamed from: u */
    public void mo32530u(String str, long j, long j2, long j3, long j4) {
        this.f31865f.setText(m49383b(j3));
    }

    public ItemHeartbeatNotifyNewUi(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31866g = "";
        this.f31867h = "";
    }

    public ItemHeartbeatNotifyNewUi(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31866g = "";
        this.f31867h = "";
    }
}
